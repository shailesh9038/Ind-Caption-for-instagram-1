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

public class GoodLuck extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public GoodLuck() {
        // Required empty public constructor
    }

    public static GoodLuck newInstance(String param1, String param2) {
        GoodLuck fragment = new GoodLuck();
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

        englist.add("May you become proud not only for your family but also for your nation.");
        englist.add("Waiting for the day when all those lucky pennies and four leaf clovers start working their magic.");
        englist.add("Every time I think I see the light at the end of the tunnel, it ends up being a freight train coming right at me..");
        englist.add("Luck is when opportunity knocks and you answer.");
        englist.add("May your pockets be heavy and your heart be light. May good luck pursue you each morning & night.");
        englist.add("This girl is in need of a hug and some good luck to come his way..");
        englist.add("Always remember GOD helps those who help themselves.So first prepare your self then leave it on GOD.");
        englist.add("Be a big success! We all pray for you!");
        englist.add("Screw luck. I’m making it happen.");
        englist.add("Morning greetings doesn’t only mean saying good morning, it has a silent message saying: i remember you when i wake up! have a nice day!");
        englist.add("I do nat care if my glass is half empty or full empty. I am happy to have a glass.");
        englist.add("Sometimes we don’t appreciate what we have until it’s gone and every once in a while we are lucky enough to get a second chance to show it.");
        englist.add("Nothing is impossible, some things are just harder than others.");
        englist.add("Every sunset gives us, one day less to live. But every sunrise give us, one day more to hope. So, hope for the best. Good Day & Good Luck");
        englist.add("Luck is a dividend of sweat. The more you sweat, the luckier you get.");
        englist.add("They say you have to be good to be lucky, but I think you have to be lucky to be good.");
        englist.add("I don’t understand why people ‘touch wood’ for luck. I mean, it didn’t do Jesus any good.");
        englist.add("Good luck happens when preparedness meets opportunity.");
        englist.add("We wish you more and more original ideas! An a lot of luck, of course!");
        englist.add("There is no such thing as good luck or bad luck, just God’s blessings and lessons.");
        englist.add("May good luck be your friend in whatever you do and may trouble be always a stranger to you.");
        englist.add("Today I need lots of luck. Fingers and toes and legs and eyes crossed. I really need you to concentrate for me. I think it may be working..");
        englist.add("Dear luck, can we be friends this year please..");
        englist.add("Wherever you go and whatever you do. May sunny days and happy times follow you.");
        englist.add("Your day is only as good as you make it. Make it great.");
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