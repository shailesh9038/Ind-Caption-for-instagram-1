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

public class Tired extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Tired() {
        // Required empty public constructor
    }

    public static Tired newInstance(String param1, String param2) {
        Tired fragment = new Tired();
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

        englist.add("I wish I had an answer to that, because I'm tired of answering that question");
        englist.add("I'm tired of looking for the perfect guy. From now on.. he can look for me.");
        englist.add("Don't stop when you are tired. Stop when you are done.");
        englist.add("I just want to sleep for a couple days. I'm so tired.");
        englist.add("I'm just bored of waiting for nothing.");
        englist.add("Don't stop when you are tired. Stop when you are done!!");
        englist.add("You never get tired unless you stop and take time for it.");
        englist.add("It's really hard to decide when you're too tired to hold on, or you're too in love to let go.");
        englist.add("I'm tired of getting lied to, tired of being used, tired of the society, tired of fake people, tired of pleasing everyone. Just tired.");
        englist.add("I'm sad, I'm tired, I'm lonely. But it's okay because I'm breathing.");
        englist.add("If you're tired of style, you're tired of life.");
        englist.add("Keep smiling.. And one day life will get tired of upsetting you.");
        englist.add("I'm tired of getting hurt, I'm tired of pretending like it's all okay");
        englist.add("Life is one long process of getting tired.");
        englist.add("If one could run without getting tired I don't think one would often want to do anything else");
        englist.add("Silence doesn't always mean yes, Sometimes it means that i'm tired of explaining to people who doesn't even care to understand.");
        englist.add("I'm tired of trying, I'm tired of lying, I know I've been smiling but inside I'm dying.");
        englist.add("I'm tired of looking back.");
        englist.add("A strong woman, is one who is able to smile this morning like she wasn't crying last night.");
        englist.add("It's always my fault, isn't it ??");
        englist.add("Telling people you're tired, when in reality, you're just sad.");
        englist.add("If you get tired of everything in life, learn to rest, not to quit.");
        englist.add("In order to change we must be sick and tired of being sick and tired.");
        englist.add("conclusion is the place where you got tired of thinking.");
        englist.add("I'm not tired of challenges. I'm tired of people challenging me for nothing.");
        englist.add("I love that point when you are so tired that everything is funny.");
        englist.add("I've been trying and tired, but I will never get tired of trying to achieve my dreams.");
        englist.add("Sick and tired of being sick and tired.");
        englist.add("So you're tired of living Feel like you might give in Well don't. It's not your time");
        englist.add("Men marry because they are tired, women because they are curious. Both are disappointed.");
        englist.add("I don't stop when i'm tired, i stop when i'm done.");
        englist.add("The best things in history are accomplished by people who get tired of being shoved around.");
        englist.add("Never say.. I'm tired of life. instead, be thankful that life has not gotten tired and has not given up on you.");
        englist.add("I'm tired of being strong.");
        englist.add("I'm tired of getting my hopes up for things that I know will never happen.");
        englist.add("No one ever gets tired of loving. They just get tired of waiting, apologizing, getting disappointed and being hurt.");
        englist.add("When we are tired, we are attacked by ideas we conquered long ago");
        englist.add("Even when you have every right to be tired of everything, Never be tired of living.");
        englist.add("When you're tired, it's a sign that you're almost at the end of your fight.");
        englist.add("I am tired of being tired and talking about how tired I am.");
        englist.add("Dear sleep, i know we had problems when i was younger... but i love you now.");
        englist.add("I'm just tired of all this bullshit.");
        englist.add("Laziness is nothing more than the habit of resting before you get tired. ~ Jules Renard");
        englist.add("Sick of crying, tired of trying, yes i'm smiling but inside i'm dying.");
        englist.add("Even the most caring people can get tired of being taken for granted.");
        englist.add("I still like you, but i'm just tired of trying to get your attention.");
        englist.add("I want to live, not just to survive.");
        englist.add("No amount of sleep in the world could cure the tiredness i feel.");
        englist.add("My problem is that i care way too much about people who don't give a shit about me.");
        englist.add("I don't want to be understood because if people understand me, they get tired of me.");
        englist.add("TV is simply a place where people go when they get tired of thinking.");
        englist.add("If you're tired of being at the bottom keep fighting until you get to the TOP.");

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