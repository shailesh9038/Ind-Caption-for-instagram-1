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

public class Party extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Party() {
        // Required empty public constructor
    }

    public static Party newInstance(String param1, String param2) {
        Party fragment = new Party();
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

        englist.add("IT'S PARTY TIME.");
        englist.add("I'm a little bit drink.");
        englist.add("No party is any fun unless seasoned with folly.");
        englist.add("The dying process begins the minute we are born, but it accelerates during dinner parties.");
        englist.add("Cocktail party: A gathering held to enable forty people to talk about themselves at the same time.The man who remains after the liquor is gone is the host.");
        englist.add("The Life and Soul, the man who will never go home while there is one man, woman or glass of anything not yet drunk.");
        englist.add("Reality is an illusion that occurs due to the lack of alco-hol");
        englist.add("Let it all out!");
        englist.add("Get Set PARTY!");
        englist.add("At every party there are two kinds of people - those who want to go home and those who dont.The trouble is, they are usually married to each other.");
        englist.add("LET'S HAVE A PARTY.");
        englist.add("Girls Just wanna have fun!");
        englist.add("Take me drunk I'm home.");
        englist.add("Doctor says mango vodka does not count as my daily serving of fruit. Damn.");
        englist.add("She had heard someone say something about an Independent Labour Party, and was furious that she had not been asked.");
        englist.add("The Bible's full of wine. God ain't got nothing against a little drink to celebrate hisSon's birthday with!");
        englist.add("Dont drink and drive, it will spill everywhere");
        englist.add("step of this glorious ladder, it was difficult to get down again without stumbling.");
        englist.add("My body is not a temple.. it's a distillery with legs.");
        englist.add("Party.. Like a Rockstar.");
        englist.add("thinks our friendship is bad for my liver.");
        englist.add("Dont dirnk and udpate Feacbook statass.");
        englist.add("Keep Clam and Party ON.");
        englist.add("Beer is proof God loves us, and wants us to be happy");
        englist.add("On with the dance! let joy be unconfined, No sleep till morn, when Youth and Pleasure meet To chase the glowing hours with flying feet.");
        englist.add("Work Hard, Party Harder.");
        englist.add("I try not to drink too much because when I'm drunk, I bite.");
        englist.add("Never be the first to arrive at a party or the last to go home, and never, ever be both.");
        englist.add("We're all mad here!");
        englist.add("We like to party.");
        englist.add("Like other parties of the kind, it was first silent, then talky, then argumentative, then disputatious, then unintelligible, then altogether, then inarticulate, and then drunk.When we had reached the last");
        englist.add("You know, weve got to do it someday... throw away all the guns and invite all the jokers from the North and the South in here to a cocktail party... last man standing on his feet at the end wins the wa");
        englist.add("Drink, and dance and laugh and lie, Love the reeling midnight through, For tomorrow we shall die! (But, alas, we never do.)");
        englist.add("Young n Wild");
        englist.add("An alcoholic is someone you don't like who drinks as much as you do");
        englist.add("A man's got to believe in something. I believe I'll have another drink.");
        englist.add("Party ON!");
        englist.add("Life is one big party.");
        englist.add("Its feel better than a love.");
        englist.add("I exercise strong self control. I never drink anything stronger than gin before breakfast.");
        englist.add("I am thankful for the mess to clean after a party because it means I have been surrounded by friends.");
        englist.add("Has often thought that what doesn't kill us makes us drink stronger liquor.");
        englist.add("No man does right by a woman at a party.");
        englist.add("Wishes it were socially acceptable to start drinking this early.");
        englist.add("Live For Today.. Plan For Tomorrow.. Party Tonight!");
        englist.add("Peace Love n Party.");
        englist.add("doesn't drink and drive in case he hits a bump and spills his drink.");
        englist.add("Thinks that time flies when you're having a drunken blackout.");
        englist.add("You're not drunk if you can lie on the floor without holding on");
        englist.add("Mornings = Laziness. Afternoon = Dying for a rest. Night = Can t sleep");
        englist.add("Actually, it only takes one drink to get me loaded. Trouble is, I can't remember if it'sthe thirteenth or fourteenth.");
        englist.add("I want to be forever young.");
        englist.add("Life is short wear your party Pants.");
        englist.add("I've stopped drinking, but only while I'm asleep.");
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