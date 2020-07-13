package ind.apptech.captionsforinstagram;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.apptech.captionsforinstagram.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shayri_Adapt extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Activity activityeng;
    List<String> shayrieng;
    String engg;
    private static final int TYPE_ONE = 0;
    private static final int TYPE_TWO = 1;

    FrameLayout frameLayout;
    private static final String ADMOB_AD_UNIT_ID = "ca-app-pub-3668926167827403/6725351641";
    private UnifiedNativeAd Google_nativeAd;

    public Shayri_Adapt(Activity activityeng, List shayrieng, String engg) {
        Collections.shuffle(shayrieng);
        this.activityeng = activityeng;
        this.shayrieng = shayrieng;
        this.engg = engg;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHolder holder = null;

        if (viewType == TYPE_ONE) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gujarati_button, parent, false);
            return new ViewHolder(view);
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_type2, parent, false);
            return new ViewHolderTwo(view);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case TYPE_ONE:
                initLayoutOne((ViewHolder) holder, position);
                break;
            case TYPE_TWO:
                initLayoutTwo((ViewHolderTwo) holder, position);
                break;
            default:
                break;
        }
    }

    private void initLayoutTwo(ViewHolderTwo holder, int position) {

        refreshAd();

    }

    private class ViewHolderTwo extends RecyclerView.ViewHolder {

        public ViewHolderTwo(View view) {
            super(view);

            frameLayout = view.findViewById(R.id.fl_adplaceholder);
        }
    }

    private void initLayoutOne(ViewHolder viewHolder, final int position) {
        viewHolder.rajputbtn.setText(shayrieng.get(position).toString());
        viewHolder.rajputbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (engg.equals("rjpthindi")) {
                    int i = SecuredPref.getIntPref(activityeng, "clickcount");
                    if (i % 10 == 0) {
                        Intent intent = new Intent(activityeng, PagerAct.class);
                        intent.putExtra("isaddshow", "isaddshow");
                        intent.putExtra("id", position);
                        intent.putStringArrayListExtra("list", (ArrayList<String>) shayrieng);
                        SecuredPref.setIntPref(activityeng, "clickcount", i + 1);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        activityeng.startActivity(intent);
                    } else {
                        Intent intent = new Intent(activityeng, PagerAct.class);
                        intent.putExtra("id", position);
                        intent.putStringArrayListExtra("list", (ArrayList<String>) shayrieng);
                        SecuredPref.setIntPref(activityeng, "clickcount", i + 1);
                        activityeng.startActivity(intent);

                    }
                }
            }
        });
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        if (position % 21 == 20) {
            return TYPE_TWO;
        } else {
            return TYPE_ONE;
        }
    }

    @Override
    public int getItemCount() {
        return shayrieng.size();
    }

    private class ViewHolder extends RecyclerView.ViewHolder {

        Button rajputbtn;

        public ViewHolder(View view) {
            super(view);
            rajputbtn = (Button) itemView.findViewById(R.id.rajput_b);
        }
    }

    private void populateUnifiedNativeAdView(UnifiedNativeAd nativeAd, UnifiedNativeAdView adView) {
        // Set the media view. Media content will be automatically populated in the media view once
        // adView.setNativeAd() is called.
        MediaView mediaView = adView.findViewById(R.id.ad_media);
        adView.setMediaView(mediaView);

        // Set other ad assets.
        adView.setHeadlineView(adView.findViewById(R.id.ad_headline));
        adView.setBodyView(adView.findViewById(R.id.ad_body));
        adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_action));
        adView.setIconView(adView.findViewById(R.id.ad_app_icon));
        adView.setPriceView(adView.findViewById(R.id.ad_price));
        adView.setStarRatingView(adView.findViewById(R.id.ad_stars));
        adView.setStoreView(adView.findViewById(R.id.ad_store));
        adView.setAdvertiserView(adView.findViewById(R.id.ad_advertiser));

        ((TextView) adView.getHeadlineView()).setText(nativeAd.getHeadline());

        if (nativeAd.getBody() == null) {
            adView.getBodyView().setVisibility(View.INVISIBLE);
        } else {
            adView.getBodyView().setVisibility(View.VISIBLE);
            ((TextView) adView.getBodyView()).setText(nativeAd.getBody());
        }

        if (nativeAd.getCallToAction() == null) {
            adView.getCallToActionView().setVisibility(View.INVISIBLE);
        } else {
            adView.getCallToActionView().setVisibility(View.VISIBLE);
            ((Button) adView.getCallToActionView()).setText(nativeAd.getCallToAction());
        }

        if (nativeAd.getIcon() == null) {
            adView.getIconView().setVisibility(View.GONE);
        } else {
            ((ImageView) adView.getIconView()).setImageDrawable(
                    nativeAd.getIcon().getDrawable());
            adView.getIconView().setVisibility(View.VISIBLE);
        }

        if (nativeAd.getPrice() == null) {
            adView.getPriceView().setVisibility(View.INVISIBLE);
        } else {
            adView.getPriceView().setVisibility(View.VISIBLE);
            ((TextView) adView.getPriceView()).setText(nativeAd.getPrice());
        }

        if (nativeAd.getStore() == null) {
            adView.getStoreView().setVisibility(View.INVISIBLE);
        } else {
            adView.getStoreView().setVisibility(View.VISIBLE);
            ((TextView) adView.getStoreView()).setText(nativeAd.getStore());
        }

        if (nativeAd.getStarRating() == null) {
            adView.getStarRatingView().setVisibility(View.INVISIBLE);
        } else {
            ((RatingBar) adView.getStarRatingView())
                    .setRating(nativeAd.getStarRating().floatValue());
            adView.getStarRatingView().setVisibility(View.VISIBLE);
        }

        if (nativeAd.getAdvertiser() == null) {
            adView.getAdvertiserView().setVisibility(View.INVISIBLE);
        } else {
            ((TextView) adView.getAdvertiserView()).setText(nativeAd.getAdvertiser());
            adView.getAdvertiserView().setVisibility(View.VISIBLE);
        }
        adView.setNativeAd(nativeAd);

        VideoController vc = nativeAd.getVideoController();

        if (vc.hasVideoContent()) {
            vc.setVideoLifecycleCallbacks(new VideoController.VideoLifecycleCallbacks() {
                @Override
                public void onVideoEnd() {
                    super.onVideoEnd();
                }
            });
        } else {
        }
    }

    private void refreshAd() {
        AdLoader.Builder builder = new AdLoader.Builder(activityeng, ADMOB_AD_UNIT_ID);
        builder.forUnifiedNativeAd(new UnifiedNativeAd.OnUnifiedNativeAdLoadedListener() {
            // OnUnifiedNativeAdLoadedListener implementation.
            @Override
            public void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
                // You must call destroy on old ads when you are done with them,
                // otherwise you will have a memory leak.
                if (Google_nativeAd != null) {
                    Google_nativeAd.destroy();
                }
                Google_nativeAd = unifiedNativeAd;
                UnifiedNativeAdView adView = (UnifiedNativeAdView) activityeng.getLayoutInflater()
                        .inflate(R.layout.ad_unified, null);
                populateUnifiedNativeAdView(unifiedNativeAd, adView);
                frameLayout.removeAllViews();
                frameLayout.addView(adView);
            }

        });

        VideoOptions videoOptions = new VideoOptions.Builder()
//                .setStartMuted(startVideoAdsMuted.isChecked())
                .build();

        NativeAdOptions adOptions = new NativeAdOptions.Builder()
                .setVideoOptions(videoOptions)
                .build();

        builder.withNativeAdOptions(adOptions);

        AdLoader adLoader = builder.withAdListener(new AdListener() {
            @Override
            public void onAdFailedToLoad(int errorCode) {
//                refresh.setEnabled(true);
            }
        }).build();

        adLoader.loadAd(new AdRequest.Builder().build());
    }
}