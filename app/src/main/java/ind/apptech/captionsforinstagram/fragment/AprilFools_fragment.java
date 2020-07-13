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

public class AprilFools_fragment extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public AprilFools_fragment() {
        // Required empty public constructor
    }

    public static AprilFools_fragment newInstance(String param1, String param2) {
        AprilFools_fragment fragment = new AprilFools_fragment();
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

        englist.add("April Fools Day has been cancelled this year.");
        englist.add("Wants to remind you that everything is funny as long as it’s not happening to you. Please don’t make others fool on April Fool Day.");
        englist.add("Hey you know which is the best day to propose a girl ….???…. Its APRIL 1ST …. If she accepts its your luck and otherwise just Say APRIL FOOL.");
        englist.add("Fact 1 You cannot touch your lower lip with your tongue Fact 2 After reading this 99 100 idiots would try it.");
        englist.add("You are one of the CUTEST persons in this world Just a second don't misunderstand me CUTE means Creating Useless Troubles.");
        englist.add("Hey you know which is the best day to propose a girl ?? Its April First.. If she accepts its your luck and otherwise just Say APRIL FOOL.");
        englist.add("OMG everyone what is that flying over the sky outside!");
        englist.add("I got fired from my job for punching my boss in the face.");
        englist.add("Today if anyone praises you for your beauty, personality, style or attitude, Just kick him. How dare he fool you before April 1st.");
        englist.add("April Fool is the day upon which we are reminded of what we are on the other three hundred and sixty four days.");
        englist.add("Aliens have contacted the Earth, Watch the news and see it.");
        englist.add("I'm gonna be a daddy!");
        englist.add("You can not touch your lower lip with your tounge……..");
        englist.add("Definition of FOOL: Knowing the truth, seeing the truth, but still believing the lies.");
        englist.add("A day will come when the world will celebrate your name, your fame, your personality and your views. But April Fool comes once in a year and that your day. :)");
        englist.add("If you have anything important to tell me, tell me tomorrow cause I won't believe you today. Happy April Fools Day!");
        englist.add("Today is the day to Propose a girl. If she accepts thats your LUCk otherwise just tell her its April Fool. :)");
        englist.add("I'll be getting married on April 11. All of you are invited.");
        englist.add("Today is the day to Propose a girl. If she accepts that's your LUCk otherwise just tell her its April Fool. :)");
        englist.add("Hi Dear FOOL, Wish you a Happy April Fool Day. Today is your day. :D");
        englist.add("Just a friendly reminder Relationships are precious, do not hurt them by fooling and lying on first April / April Fool.");
        englist.add("You could just change your birthday to april first, watch everyone write happy birthday on your wall, and at the end of the day make your status.");
        englist.add("A fool thinks himself to be wise, but a wise man knows him to be a fool.");

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