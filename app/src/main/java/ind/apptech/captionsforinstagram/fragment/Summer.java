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

public class Summer extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Summer() {
        // Required empty public constructor
    }

    public static Summer newInstance(String param1, String param2) {
        Summer fragment = new Summer();
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

        englist.add("Having fun in the sun, getting laid in the shade, summer's here..");
        englist.add("Summer vacation: where you drink triple, see double and act single.");
        englist.add("Happy Summer season with Great offers Motay motay machar.. Lots of makhian!");
        englist.add("Summer is like the ultimate one-night stand...hot as hell, totally thrilling, and gone before you know it.");
        englist.add("School is out for the summer! dont worry school, I WON'T miss you at all.");
        englist.add("I hope your summer is just like a little box filled with surprises.");
        englist.add("Summer should get a speeding ticket.");
        englist.add("A lot of parents pack up their troubles and send them off to summer camp.");
        englist.add("A girl in a bikini is like having a loaded pistol on your coffee table theres nothing wrong with them, but its hard to stop thinking about it.");
        englist.add("There should be a rule that you can't get your period over the summer.");
        englist.add("Ok summer I'm sorry for bad mouthing you bout being so hot, can you come back?? Its freakin cold!");
        englist.add("Summer meant watching cartoons all morning, roaming the neighborhood all day and going back home when the streetlights turned on.");
        englist.add("I wish summer would get pregnant so we'd have 9 months off.");
        englist.add("Dear Garmi.. Plz thori Narmi.. :)");
        englist.add("Summer is the season when a man thinks he can cook better on an outdoor grill than his wife can on an indoor stove");
        englist.add("Summer is the season when the air pollution is much warmer.");
        englist.add("That awkward moment when you write a super long, heartfelt note in someones yearbook and they write 'Have a Great Summer!!");
        englist.add("Dear sun, I seriously feel u need to chill a bit.. ! ;)");
        englist.add("I wonder what the blood alcohol level is of all these mosquitos that keep biting me?");
        englist.add("I dont make enough money to go on vacation, so I'm just going to get drunk this weekend until I dont know where I am.");
        englist.add("Smashing in the face of a pinata that resembles Summer Wheatly..");
        englist.add("I spent many a summer early morning with the radio very low, half sleeping and half listening.");
        englist.add("It's almost Summer! Time to find out what my friends with swimming pools have been up to since last summer..");
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