package ind.apptech.captionsforinstagram;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import com.apptech.captionsforinstagram.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.sdsmdg.tastytoast.TastyToast;

import java.util.ArrayList;
import java.util.List;

public class PagerAct extends AppCompatActivity {

    ViewPager pagervieweng;
    ImageView whats, pagerbtnPreveng, pagerbtnNexteng, pagerbtnCopyeng, pagerbtnShareeng, favorite;
    int defPositioneng = -1;
    List<String> defflisteng;
    private ClipboardManager myClipboardeng;
    private ClipData myClipeng;
    AdView googlead_eng;
    private int j = 0;

    public static List<String> hindilist;
    public static List listcatname;
    public static List<Integer> listid;
    public static List<Integer> listposition;
    public static List listislike;
    static DbHelper dbHelper;
    static String subvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Caption For Insta");
        toolbar.setNavigationIcon(R.drawable.ic_chevron_left_black_24dp);
        toolbar.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.ic_more_horiz_black_24dp));
        setSupportActionBar(toolbar);

        if (getIntent().hasExtra("isaddshow")) {

            if (NavigationActivity.googlefullad != null && NavigationActivity.googlefullad.isLoaded()) {
                NavigationActivity.googlefullad.show();
            }
        }

        dbHelper = new DbHelper(PagerAct.this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            subvalue = getIntent().getExtras().getString("subvalue");
            global.status_tital = subvalue;
        }

        StrictMode.VmPolicy.Builder newbuilder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(newbuilder.build());

        AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
        googlead_eng = new AdView(this);
        googlead_eng.setAdSize(AdSize.MEDIUM_RECTANGLE);
        googlead_eng = (AdView) findViewById(R.id.googlead_eng);
        googlead_eng.loadAd(adRequest);

        hindilist = new ArrayList<>();
        listid = new ArrayList<>();
        listcatname = new ArrayList<>();
        listislike = new ArrayList<>();
        listposition = new ArrayList<>();

        pagervieweng = (ViewPager) findViewById(R.id.pagerviewpagernew);
        pagerbtnNexteng = (ImageView) findViewById(R.id.pagerbtnNextnew);
        pagerbtnPreveng = (ImageView) findViewById(R.id.pagerbtnPrevnew);
        pagerbtnCopyeng = (ImageView) findViewById(R.id.pagerbtncopynew);
        pagerbtnShareeng = (ImageView) findViewById(R.id.pagerbtnsharenew);
        whats = findViewById(R.id.whats);
        favorite = (ImageView) findViewById(R.id.favorite);

        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listcatname != null && listcatname.size() > 0) {
                    int vv = 0;
                    if (listposition.contains(defPositioneng)) {
                        for (int i = 0; i < listposition.size(); i++) {

                            int cc = listposition.get(i);
                            if (cc == defPositioneng) {
                                vv = listid.get(i);
                                Log.e("deletedposition", "position = " + vv);
                            }
                        }

                        boolean deleterow = dbHelper.deleteLike(vv);
                        Log.e("deleterow", "===" + deleterow);

                        if (deleterow == true) {
                            TastyToast.makeText(getApplicationContext(), "Deleted !", TastyToast.LENGTH_SHORT, TastyToast.SUCCESS);
                            favorite.setImageResource(R.drawable.ic_favorite_black_24dp);
                            getLikedata();
                        } else {
                            Toast.makeText(getApplicationContext(), "value hahahahhah", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        boolean v = dbHelper.adddetails(subvalue, defflisteng.get(defPositioneng).toString(), defPositioneng, true);
                        if (v == true) {
                            Log.e("vava", "inserted");
                            favorite.setImageResource(R.drawable.ic_favorite_black_24dp);

                            getLikedata();

                        } else {
                            Log.e("notinserted", "notinserted");
                        }
                    }
                } else {

                    boolean v = dbHelper.adddetails(subvalue, defflisteng.get(defPositioneng).toString(), defPositioneng, true);
                    if (v == true) {
                        Log.e("vava", "inserted");
                        TastyToast.makeText(getApplicationContext(), "Liked!", TastyToast.LENGTH_SHORT, TastyToast.SUCCESS);
                        favorite.setImageResource(R.drawable.ic_favorite_black_24dp);
                        getLikedata();
                    } else {
                        Log.e("notinserted", "notinserted");
                    }
                }

            }

        });

        whats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StrictMode.VmPolicy.Builder newbuilder = new StrictMode.VmPolicy.Builder();
                StrictMode.setVmPolicy(newbuilder.build());
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.putExtra(Intent.EXTRA_TEXT, " Create By : " + getPackageName());
                sharingIntent.setPackage("com.whatsapp");
                sharingIntent.putExtra(Intent.EXTRA_TEXT, defflisteng.get(pagervieweng.getCurrentItem()).toString());
                sharingIntent.setType("text/plain");
                startActivity(Intent.createChooser(sharingIntent, "Choose sharing"));
            }
        });

        pagerbtnCopyeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myClipboardeng = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                String text = defflisteng.get(pagervieweng.getCurrentItem()).toString();
                myClipeng = ClipData.newPlainText("text", text);
                myClipboardeng.setPrimaryClip(myClipeng);
                TastyToast.makeText(getApplicationContext(), "Copied", TastyToast.LENGTH_LONG, TastyToast.SUCCESS);
                Log.e("copy walues ", text);
            }
        });

        pagerbtnShareeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StrictMode.VmPolicy.Builder newbuilder = new StrictMode.VmPolicy.Builder();
                StrictMode.setVmPolicy(newbuilder.build());
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.putExtra(Intent.EXTRA_TEXT, " Create By : " + getPackageName());
                sharingIntent.putExtra(Intent.EXTRA_TEXT, defflisteng.get(pagervieweng.getCurrentItem()).toString());
                sharingIntent.setType("text/plain");
                startActivity(Intent.createChooser(sharingIntent, "Choose sharing"));
            }
        });


        if (getIntent().hasExtra("id")) {
            defPositioneng = getIntent().getExtras().getInt("id");
            defflisteng = getIntent().getExtras().getStringArrayList("list");

        }

        pagervieweng.setAdapter(new CustmPager(this, defflisteng));
        pagerbtnNexteng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isNetworkConnected()) {

                    if (pagervieweng.getCurrentItem() != (defflisteng.size() - 1)) {
                        pagervieweng.setCurrentItem(pagervieweng.getCurrentItem() + 1);

                    }
                } else {
                    TastyToast.makeText(getApplicationContext(), "No Internet Connection!", TastyToast.LENGTH_SHORT, TastyToast.ERROR);
                }

            }
        });

        pagerbtnPreveng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isNetworkConnected()) {

                    if (pagervieweng.getCurrentItem() != 0) {
                        pagervieweng.setCurrentItem(pagervieweng.getCurrentItem() - 1);
                    }
                } else {
                    TastyToast.makeText(getApplicationContext(), "No Internet Connection!", TastyToast.LENGTH_SHORT, TastyToast.ERROR);
                }
            }
        });

        pagervieweng.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

        pagervieweng.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                defPositioneng = position;
                if (listcatname != null && listcatname.size() > 0) {
                    if (listposition.contains(position)) {
                        favorite.setImageResource(R.drawable.ic_favorite_black_24dp);
                    } else {
                        favorite.setImageResource(R.drawable.ic_favorite_black_24dp);
                    }
                }
                if (position == 0) {
                    pagerbtnPreveng.setVisibility(View.INVISIBLE);
                    pagerbtnNexteng.setVisibility(View.VISIBLE);
                } else if (position == defflisteng.size() - 1) {
                    pagerbtnNexteng.setVisibility(View.INVISIBLE);
                    pagerbtnPreveng.setVisibility(View.VISIBLE);
                } else {
                    pagerbtnPreveng.setVisibility(View.VISIBLE);
                    pagerbtnNexteng.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageSelected(int position) {

                if (position % 9 == 0) {
                    if (NavigationActivity.googlefullad != null && NavigationActivity.googlefullad.isLoaded()) {
                        NavigationActivity.googlefullad.show();
                    }
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        if (defPositioneng != -1) {
            pagervieweng.setCurrentItem(defPositioneng);
        }
    }

    @Override
    public void onPause() {
        if (googlead_eng != null) {
            googlead_eng.pause();
        }


        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (googlead_eng != null) {
            googlead_eng.resume();
        }


    }

    @Override
    public void onDestroy() {
        if (googlead_eng != null) {
            googlead_eng.destroy();
        }

        super.onDestroy();


    }

    public static void getLikedata() {
        Cursor c = dbHelper.isExist(subvalue);
        listid.clear();
        listcatname.clear();
        hindilist.clear();
        listposition.clear();
        listislike.clear();

        if (c != null && c.getCount() > 0) {
            c.moveToFirst();

            do {
                int id = c.getInt(0);
                String catname = c.getString(1);
                String sayari = c.getString(2);
                int position = c.getInt(3);
                int likie = c.getInt(4);
                listid.add(id);
                listcatname.add(catname);
                hindilist.add(sayari);
                listposition.add(position);
                listislike.add(likie);

            } while (c.moveToNext());
        }
    }

    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }
}