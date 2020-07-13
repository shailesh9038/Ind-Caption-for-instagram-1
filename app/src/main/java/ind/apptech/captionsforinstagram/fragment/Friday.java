package ind.apptech.captionsforinstagram.fragment;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import ind.apptech.captionsforinstagram.Shayri_Adapt;
import com.apptech.captionsforinstagram.R;

import java.util.ArrayList;

public class Friday extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Friday() {
        // Required empty public constructor
    }

    public static Friday newInstance(String param1, String param2) {
        Friday fragment = new Friday();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.hindi_shayri, container, false);

        englishlists = (RecyclerView) view.findViewById(R.id.English_list);
        Net_connection = view.findViewById(R.id.Net_connection);
        layoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        englishlists.setLayoutManager(layoutManager);
        englist = new ArrayList<>();

        englist.add("Today is Friday.God's gift to the working people.... Enjoy!");
        englist.add("The Lord lights up our way into eternal bliss. Good Friday");
        englist.add("Can I get a F to the R to the I to the D to the A to the Y??? OH MY! SOOOO glad it's FRIDAY!!");
        englist.add("He showed us the way He has long been gone  And yet in our hearts  His name shines on.  Wish u a Good Friday!");
        englist.add("Coffee makes my mornings, but Fridays make my week!");
        englist.add("May the glory of our Savior Strengthen you and May His Graces Shine Upon You On Good Friday and  Always...");
        englist.add("He who has begun a good work in you shall bring it to completion at the day of Jesus Christ. Good Friday :)");
        englist.add("Every strike brings me closer to the next home run.");
        englist.add("Tuesday down, Wednesday on deck, Thursday to load the bases and Friday to clean up!");
        englist.add("No pain, no palm, no thorns, no throne, no gall, no glory, no cross, no crown.");
        englist.add("Is it too early to be looking forward to Friday?");
        englist.add("TGIF! Thank God I'm Free? Oh wait. Thank God I'm fabulous? Hmmm ...Oh yeah! Thank God It's Friday... YEAH...");
        englist.add("Why is Monday so far away from Friday, but Friday is so darn close to Monday!");
        englist.add("Hello Thursday so nice to see you again can't wait to see your brother Friday and your sisters Saturday and Sunday.");
        englist.add("OK Thursday you've been here long enough it's time for you to go, move on & let Friday come to visit, NOW!!!");
        englist.add("Our Lord has written the promise of the resurrection, not in books alone but in every leaf in springtime.");
        englist.add("The working week is over, The slavery is done, Friday night is now upon us, and a weekend of fun fun fun...");
        englist.add("May the glory of our Savior Strengthen you and May His Graces Shine Upon You On Good Friday and Always !");
        englist.add("Friday is my second favorite F word! Bahahaha...!!!!");
        englist.add("Mercy, Peace & Love May the grace & Lord surround u & b with u on Good Friday.");
        englist.add("The best thing about Thursday is that tomorrow is Friday.....");
        englist.add("Praying that the Lord Holds you in His Love And blesses you with His grace. on this Holy Day.");
        englist.add("May the blesssings Of the Lord Shine upon u On this Holy Day and may he always Keep in his loving care.");
        englist.add("Woke up this morning thinking 'thank God it's Friday', only to realize it's only TUESDAY. Bummer or what?");
        englist.add("May the glory of our Savior Strengthen you and May His Graces Shine Upon You On Good Friday and Always");
        englist.add("Hello weekend. I've missed you. Can you please stay a little longer this time? Your last visit was way too short!");
        englist.add("Friends...family...fun...Fridays...All good things start with F!");
        englist.add("Sunday already, now where is the weekend remote so I can hit the rewind button.");
        englist.add("He showed us the way He has long been gone And yet in our hearts His name shines on…. Wish you a Holy Friday Happy Good Friday 2014");
        englist.add("Climb into bed tonight with that blissful feeling that there will be no alarm clock in the morning -It's the WEEKEND! - Woohoo!!");
        englist.add("He drained the cup of God's wrath bone dry, leaving not a drop for us to drink.");
        englist.add("Praying that the Lord holds you in his love and blesses you with His grace... on dis Holy Day");
        if (isNetworkConnected()) {
            englishlists.setVisibility(View.VISIBLE);
            Net_connection.setVisibility(View.GONE);

        } else {
            englishlists.setVisibility(View.GONE);
            Net_connection.setVisibility(View.VISIBLE);
        }
        rjptadapter = new Shayri_Adapt(getActivity(), englist, "rjpthindi");
        englishlists.setAdapter(rjptadapter);

        return view;
    }

    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }

}