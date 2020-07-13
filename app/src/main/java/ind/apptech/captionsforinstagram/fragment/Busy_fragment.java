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

public class Busy_fragment extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Busy_fragment() {
        // Required empty public constructor
    }

    public static Busy_fragment newInstance(String param1, String param2) {
        Busy_fragment fragment = new Busy_fragment();
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

        englist.add("Busy is good because it shows you're alive.");
        englist.add("Hello, My name is Mr. Busy.");
        englist.add("I don't have time to hate people who hate me because I'm too busy loving people who love me.");
        englist.add("Just cause i am busy does not mean i don't love you.");
        englist.add("Never get so busy making a living that you forget to make a LIFE.");
        englist.add("Success comes to those who are too busy to be looking for it.");
        englist.add("Busy is the New Happy!");
        englist.add("I am too busy to write a Status.");
        englist.add("I try to keep it real. I don't have time to worry about what I'm projecting to the world. I'm just busy being myself.");
        englist.add("Within reasonable limits, a professional player should keep busy at music.");
        englist.add("Never get so busy making a living that you forget to make Life.");
        englist.add("Get busy living, or get busy dying.");
        englist.add("A charming woman is a busy woman.");
        englist.add("Success usually comes to those who are too busy to be looking for it.");
        englist.add("There is no one busy in this world, it's always about priorities.");
        englist.add("No matter how busy a person day might be. If they really care, they'll always find time for you.");
        englist.add("My household is, in a nice way, very busy.");
        englist.add("I feel like I'm too busy writing history to read it.");
        englist.add("A charming woman is a busy woman.");
        englist.add("A busy women is a charming women.");
        englist.add("Its been a busy season for me, I don't get much free time..");
        englist.add("I am too busy to be organized.");
        englist.add("I am too bust to read your Status.");
        englist.add("I am too busy to write a Status.");
        englist.add("Nobody is never too busy, If they care, the will make time.");
        englist.add("Busy is a drug that lot of people are addicted to!");
        englist.add("You can really only enjoy life when you're extremely busy.");
        englist.add("Being busy and being productive are 2 different things.");
        englist.add("God is never too busy to listen. Don't be too busy to talk to him.");
        englist.add("I'm always busy, but I'm lazy as well.");
        englist.add("Success comes to those who are too busy to be looking for it.");
        englist.add("I wanted to figure out why I was so busy, but I couldn't find the time to do it.");
        englist.add("Never get so busy making a living that you forget to make Life.");
        englist.add("While I am busy with little things, I am not required to do greater things.");
        englist.add("I keep busy. That was my nickname in college, 'Iron to the Fire.' I like to keep several things going at once.");
        englist.add("A person being 'too busy' is a myth. People make time for the things that are really important to them!");
        englist.add("Life seems but a quick succession of busy nothings.");
        englist.add("Life is like a very long TV show, without a remote control.");
        englist.add("Life seems but a quick succession of busy nothings.Busy Status for Whatsapp");
        englist.add("Fitness is a luxury when you are busy!");
        englist.add("Keep calm and busy, busy, busy..");
        englist.add("Life is like a very long TV show, without a remote control.");
        englist.add("Just coz i am busy does not mean i don't love you.");
        englist.add("Busy is a drug that lot of people are addicted to!");
        englist.add("Its been a busy season for me, I don't get much free time.");
        englist.add("There is no time to be angry, always be busy with love.");
        englist.add("Lazy people are always Busy.");
        englist.add("No matter how busy you are, you must take time to make the other person feel important.");
        englist.add("Focus on being productive instead of busy");
        englist.add("A busy women is a charming women.");
        englist.add("Fitness is a luxury when you are busy!");
        englist.add("Life is what happens when you are busy making other plans.");
        englist.add("Within reasonable limits, a professional player should keep busy at music.");
        englist.add("Its been a busy season for me, I don't get much free time..");
        englist.add("Life seems but a quick succession of busy nothings.");
        englist.add("I'm always busy, but I'm lazy as well.");
        englist.add("You can really only enjoy life when you're extremely busy.");
        englist.add("I'm too busy to tell people how busy I am.");
        englist.add("No matter how busy you are, you must take time to make the other person feel important.");
        englist.add("Life is what happens while you are busy making other plans.");
        englist.add("Nobody is too busy, its just a matter of priorities.");
        englist.add("Life is what happens to you while you're busy making other plans.");
        englist.add("Busy is the New Happy!!");
        englist.add("I have had a horribly busy day converting oxygen to carbon dioxide.");
        englist.add("Life is what happens when you are busy making other plans.");
        englist.add("When you are insane, you are busy being insane - all the time.");
        englist.add("While I am busy with little things, I am not required to do greater things.");
        englist.add("My household is, in a nice way, very busy.");
        englist.add("You never saw a very busy person who was unhappy.");
        englist.add("I wanted to figure out why I was so busy, but I couldn't find the time to do it.");
        englist.add("I am too busy to have a girlfriend.");
        englist.add("When i'm bored nobody texts me. When i'm busy i'm the most popular person on the planet.");
        englist.add("There is no time to be angry, always be busy with love.");
        englist.add("I am too busy to have a girlfriend.");
        englist.add("I am too busy to be organized.");
        englist.add("You never saw a very busy person who was unhappy.");
        englist.add("I keep busy. That was my nickname in college, 'Iron to the Fire.' I like to keep several things going at once.");
        englist.add("Being busy and being productive are 2 different things.");
        englist.add("Get busy living, or get busy dying.");
        englist.add("Nobody is too busy, its just a matter of priorities.");
        englist.add("I am too bust to read your Status.");
        englist.add("When you are insane, you are busy being insane – all the time.");

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