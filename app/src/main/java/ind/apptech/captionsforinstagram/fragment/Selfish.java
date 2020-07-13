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

public class Selfish extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Selfish() {
        // Required empty public constructor
    }

    public static Selfish newInstance(String param1, String param2) {
        Selfish fragment = new Selfish();
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

        englist.add("Selfishness is not living as one wishes to live, it is asking others to live as one wishes to live.");
        englist.add("To be different isn't about changing yourself, it's about knowing yourself enough to never want to be someone.");
        englist.add("If you don't like me remember it's mind over matter; I don't mind and you don't matter.");
        englist.add("Selfishness, not love, is the actuating motive of the gallant.");
        englist.add("The only person in this world I trust is myself. And even he's questionable at times.");
        englist.add("Sympathizing and selfish people are alike, both given to tears.");
        englist.add("All charming people, I fancy, are spoiled. It is the secret of their attraction.");
        englist.add("Being Sorry IS The Highest Act OF Selfishness, Seeing WORTH only After Discarding It.");
        englist.add("If you don't like me remember it's mind over matter, I don't mind and you don't matter.");
        englist.add("I got a dream that's worth more then my reality. And pride that's worth more then a salary.");
        englist.add("It is to be regretted that the rich and powerful too often bend the acts of government to their own selfish purposes.");
        englist.add("As long as I feel like this we cant be friends... selfish but its the truth.");
        englist.add("Glory built on selfish principles, is shame and guilt..");
        englist.add("The one who loves the least, controls the relationship.");
        englist.add("The world is not fair, and often fools, cowards, liars and the selfish hide in high places.");
        englist.add("I'm only selfish when it comes to you.");
        englist.add("Live life one day at a time. Share it with people who matter most to you, for life is a little jar of memories. So fill it with people worth remembering..");
        englist.add("One of the greatest diseases is to be nobody to anybody.");
        englist.add("Shouldn't you have a license for being that ugly?");
        englist.add("I am simple, complex, generous, selfish, unattractive, beautiful, lazy, and driven.");
        englist.add("I don't care about what others think about me, I just care about what I think about myself");
        englist.add("Shame on me for always being selfish, the feeling is never returned.");
        englist.add("Hated by many, wanted by plenty, disliked by some, confronted by none.");
        englist.add("So glad to know that you're having fun, especially without me.");
        englist.add("I'd rather be hated for being real, than loved for being fake.");
        englist.add("I say let the world go to hell, but I should always have my tea.");
        englist.add("I done what i like, i don't care what you think?");
        englist.add("Selfishness must always be forgiven you know, because there is no hope of a cure.");
        englist.add("To talk without thinking first is just like to shoot without aiming..");
        englist.add("As long as I feel like this we cant be friends...selfish but its the truth.");
        englist.add("The selfish spirit of commerce knows no country, and feels no passion of principle but that of gain.");
        englist.add("When so many are lonely as seem to be lonely, it would be inexcusably selfish to be lonely alone.");
        englist.add("One loyal friend is worth ten thousand relatives.");
        englist.add("Lets learn to ignore selfish people just like the way we ignore 'Terms and Conditions' of any software.");
        englist.add("Real people are never fake, and fake people are never real.");
        englist.add("You need to stop being so selfish and start caring about everyone else.");
        englist.add("Don't sacrifice yourself too much, because if you sacrifice too much there's nothing else you can give and nobody will care for you.");
        englist.add("People don't care for you when you are alone, they just care for you when they are alone.");
        englist.add("Relationships do not need promises, terms, and conditions. It just needs two wonderful people, one who can trust and one who can understand.");
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