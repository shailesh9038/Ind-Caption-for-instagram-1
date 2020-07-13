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

public class Jealous extends Fragment {

    RecyclerView rajputlist;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Jealous() {
        // Required empty public constructor
    }

    public static Jealous newInstance(String param1, String param2) {
        Jealous fragment = new Jealous();
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

        rajputlist = (RecyclerView) view.findViewById(R.id.English_list);
        Net_connection = view.findViewById(R.id.Net_connection);
        layoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        rajputlist.setLayoutManager(layoutManager);
        englist = new ArrayList<>();

        englist.add("Jealousy is when you count someone else's blessings instead of your own.");
        englist.add("Insecurity is an ugly thing, it makes you hate people you don't even know.");
        englist.add("When you missed what you aimed that doesn't mean nobody else cannot get it right, don't hate them, don't be jealous. Instead try to make friend with them and learn how to get it right.");
        englist.add("People would say bad things about you, because it is the only way their insignificant self can feel better than you.");
        englist.add("A guy is only insecure about losing his girl when he knows someone else can treat her better.");
        englist.add("Absolutely obsessed with my new computer.");
        englist.add("There are no pretty people in the eyes of jealousy.");
        englist.add("Remember: people only rain on your parade because they're jealous of your sun & tired of their shade.");
        englist.add("A jealous woman does better research than the FBI.");
        englist.add("Thanks to all of you who talk bad about me thanks for making me the center of attention.");
        englist.add("Jealousy is the cousin of greed. We seem to focus on what we want and lose sight of what we really need.");
        englist.add("Don't think that someone else is more blessed than you are, because we are blessed in different ways.");
        englist.add("Look at me and look at you. Now tell me, hunnie, who is jealous? Me or you?.");
        englist.add("You dream it, I did it, You're jealous admit it! Submitted by: Michelle");
        englist.add("I'm sorry I trip a lot .. I'm sorry I'm the jealous type... I'm just scared someone better is gonna take my place.");
        englist.add("Jealousy is a terrible disease.. Get well soon!");
        englist.add("Don't let jealousy fool you. It's just another name for insecurity.");
        englist.add("People like to bring up your past when your present and future look better than theirs.");
        englist.add("Jealousy is a waste of emotions!");
        englist.add("Had a fantastic weekend. Who knew I could snowboard?");
        englist.add("Finally taking drum lessons!");
        englist.add("Haters only hate the people they can't have or the people they can't be.");
        englist.add("Call me what you want, I'll just call you jealous.");
        englist.add("Chances are that when someone is hating on you, it's not about you at all. It's about them. It's their fear, their jealously, their boredom, and their insecurity.");
        englist.add("Jealousy is the fear of comparison. - Max Frisch");
        englist.add("I keep my head held high and smile, because there are people who will kill to see me fall.");
        englist.add("It's sad how some people are so jealous and intimidated by you that they only have negative things to say when they know absolutely nothing about you.");
        englist.add("On my third cup of coffee. What a night...");
        englist.add("Isn't it kind of silly to think that tearing someone else down builds you up? - Sean Covey");
        englist.add("When guys get jealous it can be kinda cute. When girls get jealous World War III is about to start.");
        englist.add("Jealousy is the best compliment you can receive!");
        englist.add("Never hate people who are jealous of you, but respect their jealousy because they're the ones who think you're better than them.");
        englist.add("Day off, going on an adventure with my girls/guys.");
        englist.add("Jealousy is just a lack of self confidence.");
        englist.add("They were right, the guacamole at Taco Heaven is to die for. Could've eaten it all night.");
        englist.add("Haters don't really hate you. They hate themselves because you're a reflection of what they wish to be. Poor, confused people.");
        englist.add("You mostly don't have haters of you, but mostly you have haters of your success.");
        englist.add("Love me or hate me I'm still gonna shine.");
        englist.add("Jealousy releases anger and anger is the greatest and the ultimate enemy that can forever determine your judgement and ultimately withhold your destiny.");
        englist.add("Whoever is trying to bring you down is already below you.");
        englist.add("Jealousy weakens life. Like the ice-cube in sun-light.");
        englist.add("Jealousy: - a sign of insecurity - a sign of weakness - a sign of obsession");
        if (isNetworkConnected()) {
            rajputlist.setVisibility(View.VISIBLE);
            Net_connection.setVisibility(View.GONE);

        } else {
            rajputlist.setVisibility(View.GONE);
            Net_connection.setVisibility(View.VISIBLE);
        }
        rjptadapter = new Shayri_Adapt(getActivity(), englist, "rjpthindi");
        rajputlist.setAdapter(rjptadapter);

        return view;
    }

    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }

}