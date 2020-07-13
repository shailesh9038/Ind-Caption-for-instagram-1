package ind.apptech.captionsforinstagram;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.apptech.captionsforinstagram.R;
import com.sdsmdg.tastytoast.TastyToast;

import java.util.List;

public class BookmarkAdapter extends BaseAdapter {
    Context activity;
    List<String> himdilist;
    DbHelper dbHelper;
    String joke_text;
    public static int defPosition = 0;
    public static List listcatname;
    List<Integer> listid, listposition;
    RecyclerClick recyclerClick;

    public BookmarkAdapter(Context activity, DbHelper dbHelper, List<String> hindilist, List<Integer> listid, List<Integer> listposition, Favrite bookmark) {
        this.activity = activity;
        this.himdilist = hindilist;
        this.listid = listid;
        this.listposition = listposition;
        this.dbHelper = dbHelper;
        this.recyclerClick = bookmark;

    }

    @Override
    public int getCount() {
        return himdilist.size();
    }

    @Override
    public Object getItem(int i) {
        return himdilist.get(i);

    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;

        LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.favorite_layout, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        joke_text = himdilist.get(position);
        holder.txt_cate.setText(joke_text);



        //////share///////
        final ViewHolder finalHolder = holder;
        holder.fav_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                finalHolder.fav_share.setImageResource(R.drawable.share_white);
                Intent sharingIntent = new Intent("android.intent.action.SEND");
                sharingIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                sharingIntent.setType("text/*");
                sharingIntent.putExtra("android.intent.extra.TEXT", " Create By : " + activity.getPackageName());
                sharingIntent.putExtra("android.intent.extra.TEXT", himdilist.get(position));
                Intent chooserIntent = Intent.createChooser(sharingIntent, "Open With");
                chooserIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                activity.startActivity(chooserIntent);

                //                activity.startActivity(Intent.createChooser(sharingIntent, "Share using"));
//                activity.startActivity(Intent.createChooser(sharingIntent, "Share using"));
            }
        });

        holder.whats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharingIntent = new Intent("android.intent.action.SEND");
                sharingIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                sharingIntent.setType("text/*");
                sharingIntent.setPackage("com.whatsapp");
                sharingIntent.putExtra("android.intent.extra.TEXT", " Create By : " + activity.getPackageName());
                sharingIntent.putExtra("android.intent.extra.TEXT", himdilist.get(position));
                Intent chooserIntent = Intent.createChooser(sharingIntent, "Open With");
                chooserIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                activity.startActivity(chooserIntent);
            }
        });

        holder.adapter_fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (!joke_text.equals("")) {

                    int vv = listid.get(position);
                    Log.e("positiondaat", " == +" + vv);

                    boolean deleterow = dbHelper.deleteLike(vv);
                    Log.e("deleterow", "===" + deleterow);

                    if (deleterow == true) {
                        recyclerClick.onItemClick();
                        TastyToast.makeText(activity, "Deleted!", TastyToast.LENGTH_SHORT, TastyToast.SUCCESS);

                    } else {
//                        Toast.makeText(activity, "value hahahahhah", Toast.LENGTH_SHORT).show();

                    }
                }


            }
        });


        return convertView;
    }


    public class ViewHolder {


        TextView txt_cate;
        LinearLayout linearLayout;
        ImageView fav_share, adapter_fav,whats;


        public ViewHolder(View convertView) {
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            txt_cate = (TextView) convertView.findViewById(R.id.hindi_layout);
//            linearLayout = (LinearLayout) convertView.findViewById(R.id.linear_category);
            whats=convertView.findViewById(R.id.whats);
            fav_share = (ImageView) convertView.findViewById(R.id.fav_share);
            adapter_fav = (ImageView) convertView.findViewById(R.id.adapter_fav);
        }
    }


    public interface RecyclerClick {
        void onItemClick();
    }
}