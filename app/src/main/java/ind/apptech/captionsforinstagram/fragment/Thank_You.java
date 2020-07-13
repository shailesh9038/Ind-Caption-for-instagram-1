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

public class Thank_You extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Thank_You() {
        // Required empty public constructor
    }

    public static Thank_You newInstance(String param1, String param2) {
        Thank_You fragment = new Thank_You();
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

        englist.add("I could never be a member of a single party. I want the best of all worlds, thank you.");
        englist.add("Just want to THANK ALL OF YOU for making me feel special on my Birthday, Love You Guys!");
        englist.add("Thank you god for this good life and forgive us if we do not love it enough.");
        englist.add("Just a thank you is a mighty powerful prayer. Says it all.");
        englist.add("Thank you for listening to me.");
        englist.add("Wishes to thank all my family and friends Who stopped by to show me love today. You have all made this an amazing day! Thank you all so very much. I love you <3");
        englist.add("I wish I could tell someone how thankful I am for them because they helped me smile through the tears when I was falling apart. Thank you.");
        englist.add("Thank you for helping us make this very special day of ours so memorable! We do appreciate it!");
        englist.add("I feel a very unusual sensation - if it is not indigestion, I think it must be gratitude.");
        englist.add("Thank you for your lovely wishes it brought smiles to my eyes.");
        englist.add("Well, there's not a day goes by when I don't get up and say thank you to somebody.");
        englist.add("To my friends thank you for being there for me.");
        englist.add("Thank you for life, and all the little ups and downs that make it worth living.");
        englist.add("Thank you for being my friend.");
        englist.add("The sun will not rise or set without my notice, and thanks.");
        englist.add("Thank you for all the special things you do .");
        englist.add("I'd like to say to all my fans out there, thanks for the support. And to all my doubters, thank you very much because you guys have also pushed me.");
        englist.add("To say thank you, is in recognition of humanity.God, i want to take a minute to simply say: thank you for all i have.");
        englist.add("If the only prayer you ever say in your entire life is thank you, it will be enough.");
        englist.add("Thank you to all for your prayers and good wishes. It gave me the strength to persevere and warmed my heart.");
        englist.add("thanks to my family and friends who made my day more special than it is with your wishes. I am thankful to god for the years he has given me to be wiser in life");
        englist.add("I would maintain that thanks are the highest form of thought, and that gratitude is happiness doubled by wonder.");
        englist.add("The first responsibility of a leader is to define reality. The last is to say thank you. In between, the leader is a servant.");
        englist.add("It isn't what you have in your pocket that makes you thankful, but what you have in your heart.");
        englist.add("No duty is more urgent than that of returning thanks.");
        englist.add("'Thank you' is the best prayer that anyone could say. I say that one a lot. Thank you expresses extreme gratitude, humility, understanding.");
        englist.add("Thank you god for waking me up today and giving me another precious day of life.");
        englist.add("Is very lucky to have the group of friends and family that I have.. Thank you all for making today so special..");
        englist.add("Thanks for your support and understanding.");
        englist.add("Thank you for making me feel popular. Seriously, without you, people who like just about anything I post on Facebook, I'd feel like a pretty big loser.");
        englist.add("Dear past, thanks for all the lessons. Dear future, i'm ready.");
        englist.add("For your patience and caring, i just want to say: Thank you.");
        englist.add("It is not happy people who are thankful. It is thankful people who are happy.");
        englist.add("Thank you for leaving us alone but giving us enough attention to boost our egos.");
        englist.add("Thank you for staying by my side even though it tried to push you away.");
        englist.add("I just want to thank you for what you taught me; to love, to be wise and serious and the most important, to reach my aims.");
        englist.add("A warm thank you.. For all that you do for me.");
        englist.add("If you don't thank god for every smile, then you have no right to complain about every tear.");
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