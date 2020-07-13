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

public class Crush extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Crush() {
        // Required empty public constructor
    }

    public static Crush newInstance(String param1, String param2) {
        Crush fragment = new Crush();
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

        englist.add("You and her might have history, but you and I have CHEMISTRY.");
        englist.add("You are my first and last thought of everyday, and everyone in between.");
        englist.add("I wish I could just ask you, WHAT DO YOU THINK OF ME.");
        englist.add("If i got a penny for every time i thought and dreamed about you,I would be rich.");
        englist.add("Why did I smile even though I'm really upset? Oh yea, I saw you.");
        englist.add("I want to tell you how I feel but I don't want to wreck the friendship we already have.");
        englist.add("Because of you, half the time I don't even know that I'm smiling.");
        englist.add("Ever since I met you it hasn't been the same. All you've got me doing is drawing hearts around your name.");
        englist.add("Loving you is like breathing How can I stop?");
        englist.add("Maybe, just a little.. i could possibly be.. falling for you.");
        englist.add("whenever i get a text from you i break out into smiles.");
        englist.add("The spaces between your fingers are meant to be filled with mine.");
        englist.add("I just had to come talk with you. Sweetness is my weakness.");
        englist.add("FREE ADVICE: try not to fall for someone who isn't willing to catch you");
        englist.add("My heart Stops when you look at me.");
        englist.add("Somethings have to remain a secret but you and i don't");
        englist.add("Love is gambling, not with money but with your heart. You can always get money back, but you might not get your heart back.");
        englist.add("I build myself up when I'm alone, but when the moment comes and you look at me with those eyes I can't remember what I'm doing.");
        englist.add("Sometimes, You make it impossible to breathe. :)");
        englist.add("If my love for you is a crime, I want to be the most wanted criminal.");
        englist.add("I've found this new disease, its called LOVE. I know its contagious 'cause you gave it to me.");
        englist.add("Crushes are more beautiful than affairs because there is no responsibility, no worry, no commitment. Just look at your crush and smile like an idiot.");
        englist.add("If people suddenly leave me or give up on me without any reasons, its their loss, not mine..");
        englist.add("I will make your world beautiful.. No need to love me..just trust me.");
        englist.add("I look at you..to see you looking at me.. i just blush and look away awkwardly.");
        englist.add("I want to ask you out but I can't find the right word's. And my confidence level is low. :(");
        englist.add("You have no idea how fast my heart beats When I see U.");
        englist.add("I have a hopeless crush on someone i have no chance with.");
        englist.add("Love can sometimes be magic. But magic can sometimes..just be an illusion.");
        englist.add("Do your legs hurt from running through my dreams all night?");
        englist.add("I am 99.9% sure she dosen't like me, but its the 0.1% that keeps me going.");
        englist.add("If i got a $ for every time i thought and dreamed about you, I would be rich.");
        englist.add("You'll never get over with a crush, until you find a new one.");
        englist.add("The fate of love is that it always seems too little or too much.");
        englist.add("You know that feeling when your head says no but your heart says yes? It's wrong but it feels so right? I wish we could be together.");
        englist.add("All I want is for you to tell me your fighting for me till my heart stops beating.");
        englist.add("I'll be yours forever, just tell me when to start.");
        englist.add("I'm so glad you are in my life but i want to be more than friends");
        englist.add("Even after most said it was over between you and me, I still to this day, never shut up about you. You've got me wrapped around your finger.");
        englist.add("Can i check your pockets i think u stole my heart!");
        englist.add("Its amazing how crazy I feel when my phone vibrates and I'm begging it to be you.");
        englist.add("Words Can't say how much I want You to be MINE.");
        englist.add("Whenever I see you, I think, “You have no idea how much I care about you.");
        englist.add("My Experience Said... It's risky");
        englist.add("Only if you knew how much i like you.but u r a player. My heart says yes! But my brain says 'NO'.");
        englist.add("whenever i get a txt from you i break out into smiles (:");
        englist.add("You are all I ever think about.");
        englist.add("I wanna be your weakspot.");
        englist.add("It's not that I'm afraid of telling you how I feel about you, I'm afraid of how you will react.");
        englist.add("I wish that I could put my status to what I am really thinking.");
        englist.add("You can't be real. May I pinch you to see if I'm dreaming?");
        englist.add("Wisdom is knowing what to do next skill is knowing how to di it, and virtue is doing it.");
        englist.add("Stop being so cute, IT HURTS.");
        englist.add("I want to be the girl you give your sweatshirt to when it is cold, the one you'll tell your friends, That's my girl.");
        englist.add("Be like the flower that gives its fragrance to even the hand that crushes it..");
        englist.add("I might have to wait. I'll never give up. I guess it's half timing, And the other half's luck. Wherever you are. Whenever it's right.");
        englist.add("I wonder what goes through your head, when you hear my name.");

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