package ind.apptech.captionsforinstagram;

import android.database.Cursor;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.apptech.captionsforinstagram.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.List;

public class Favrite extends AppCompatActivity implements BookmarkAdapter.RecyclerClick {

    ListView hindi_list;
    BookmarkAdapter bookmarkAdapter;
    List<String> hindilist;
    DbHelper dbHelper;
    List<Integer> listid;
    List<Integer> listposition;
    List listislike;
    List listcatname;
    TextView no_fav_status;
    AdView gbanner_fav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favrite);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Favourite");
        toolbar.setNavigationIcon(R.drawable.ic_chevron_left_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        if (NavigationActivity.googlefullad != null && NavigationActivity.googlefullad .isLoaded()) {
            NavigationActivity.googlefullad .show();
        }

        AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
        gbanner_fav= new AdView(this);
        gbanner_fav.setAdSize(AdSize.SMART_BANNER);
        gbanner_fav= (AdView) findViewById(R.id.gbanner_fav);
        gbanner_fav.loadAd(adRequest);

        no_fav_status = findViewById(R.id.no_fav_status);

        StrictMode.VmPolicy.Builder newbuilder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(newbuilder.build());

        dbHelper = new DbHelper(getApplicationContext());
        hindi_list = (ListView) findViewById(R.id.hindi_list);
        listid = new ArrayList<>();
        listcatname = new ArrayList<>();
        hindilist = new ArrayList<>();
        listposition = new ArrayList<>();
        listislike = new ArrayList<>();

        getBookmarkdata();

        if (hindilist != null && hindilist.isEmpty()) {
            no_fav_status.setVisibility(View.VISIBLE);
        }
    }

    private void getBookmarkdata() {


        Cursor c = dbHelper.getalldetails();

        listid.clear();
        listcatname.clear();
        hindilist.clear();
        listposition.clear();
        listislike.clear();


        if (c.getCount() > 0) {
            c.moveToFirst();

            do {

                int id = c.getInt(0);
                String sayari = c.getString(2);
                int position = c.getInt(3);
                listid.add(id);
                hindilist.add(sayari);
                listposition.add(position);


            } while (c.moveToNext());
        }


        bookmarkAdapter = new BookmarkAdapter(getApplication(), dbHelper, hindilist, listid, listposition, Favrite.this);
        hindi_list.setAdapter(bookmarkAdapter);

    }

    @Override
    public void onItemClick() {
        getBookmarkdata();

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPause() {
        if (gbanner_fav != null) {
            gbanner_fav.pause();
        }


        super.onPause();
    }

    /**
     * Called when returning to the activity
     */
    @Override
    public void onResume() {
        super.onResume();
        if (gbanner_fav != null) {
            gbanner_fav.resume();
        }


    }

    /**
     * Called before the activity is destroyed
     */
    @Override
    public void onDestroy() {
        if (gbanner_fav != null) {
            gbanner_fav.destroy();
        }
        super.onDestroy();
    }
}