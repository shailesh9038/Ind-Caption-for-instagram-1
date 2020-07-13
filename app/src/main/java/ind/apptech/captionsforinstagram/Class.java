package ind.apptech.captionsforinstagram;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.apptech.captionsforinstagram.R;

import java.util.ArrayList;

public class Class extends AppCompatActivity {

    ListView englishlists;
    Shayri_Adapt rjptadapter;
    ArrayList<String> rjpthindi = new ArrayList<>();
    ArrayList<String> rjpteng = new ArrayList<>();
    ArrayList<String> rjptguj = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hindi_shayri);

        englishlists = (ListView) findViewById(R.id.English_list);
        String value = getIntent().getExtras().getString("type");


        if (value.equals("hindi")) {
            rjpthindi = new ArrayList<>();

            rjpthindi.add("");

            rjptadapter = new Shayri_Adapt(Class.this, rjpthindi, "rjpthindi");
            englishlists.setAdapter((ListAdapter) rjptadapter);


        }

        if (value.equals("english")) {

            rjpteng = new ArrayList<>();

            rjpteng.add("");

            rjptadapter = new Shayri_Adapt(Class.this, rjpteng, "rjpteng");
            englishlists.setAdapter((ListAdapter) rjptadapter);
        }

        if (value.equals("gujarati")) {

            rjptguj = new ArrayList<>();

            rjptguj.add("");
              rjptadapter = new Shayri_Adapt(Class.this, rjptguj, "rjptguj");
            englishlists.setAdapter((ListAdapter) rjptadapter);
        }


    }


    public void valuespass(String rjptguj, int position) {


        if (rjptguj.equals("rjptguj")) {

            Intent intent = new Intent(Class.this, PagerAct.class);
            intent.putExtra("id", position);
            intent.putStringArrayListExtra("list", this.rjptguj);
            startActivity(intent);
            Log.e("positionvalues", String.valueOf(position % 7));


        }

        if (rjptguj.equals("rjpteng")) {

            Intent intent = new Intent(Class.this, PagerAct.class);
            intent.putExtra("id", position);
            intent.putStringArrayListExtra("list", this.rjpteng);
            startActivity(intent);


        }
        if (rjptguj.equals("rjpthindi")) {

            Intent intent = new Intent(Class.this, PagerAct.class);
            intent.putExtra("id", position);
            intent.putStringArrayListExtra("list", this.rjpthindi);
            startActivity(intent);

        }
    }
}