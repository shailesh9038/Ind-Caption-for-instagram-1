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

public class Flirt extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Flirt() {
        // Required empty public constructor
    }

    public static Flirt newInstance(String param1, String param2) {
        Flirt fragment = new Flirt();
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

        englist.add("Come live in my heart, and pay no rent.");
        englist.add("I'm 50% single.");
        englist.add("The Greatest thing in life is finding someone who knows all of your mistakes and weaknesses and still finds you completely amazing and will never walk away.");
        englist.add("If you don’t smoke, I don’t know why.");
        englist.add("I’d be lying if I say you entered my mind many times. Coz you only entered once, since then you never came out.");
        englist.add("Falling in love with you is the second best thing in the world. Finding you is the first.");
        englist.add("If you were a tear, i would never cry in fear of losing you..");
        englist.add("Girl: Why are you followinq me? Boy: My parents told me to always follow my dreams.");
        englist.add("I need you like a heart needs a beat.");
        englist.add("It doesn’t require a special day to express how much I Love You. If every ordinary day is more than special when I am with you.");
        englist.add("God was showing off when He created you.");
        englist.add("You have no ideas how much you mean to me.");
        englist.add("I can't read lips unless they're touching mine.");
        englist.add("I LOVE the way you HURT me!");
        englist.add("Smile… it’s the second best thing to do with your lips.");
        englist.add("What time do you have to be back in heaven?");
        englist.add("I didn’t fall the floor called me stupid so i tackled it DUH..");
        englist.add("When I’m with you, the only place where I want to be is CLOSER ;)");
        englist.add("One smile can’t change the world but your smile changes mine.");
        englist.add("I dont need to dream, I got you!");
        englist.add("There's so much to say but your eyes keep interrupting me.");
        englist.add("If people are trying to pull you down. Be proud about it, because it only confirms that you are above them.");
        englist.add("Your eyes are the sweetest stars I've ever seen.");
        englist.add("You give me the kind of feeling people write novels about :)");
        englist.add("How scary would it be if everything that popped into your head was automatically posted to Facebook..");
        englist.add("I’m in my bed, you are in yours. One of us is obviously in the wrong place.");
        englist.add("Giving up is always an option but never my choice.");
        englist.add("The only person that goes through my mind is you.");
        englist.add("I looked at a flower and thought it was the most beautiful thing I've ever seen till I met you.");
        englist.add("Did the sun just come out or did you just smile at me?");
        englist.add("Like if you’re alive, comment if you’re dead.");
        englist.add("I will hold you in my heart, till I can hold you in my arms.");
        englist.add("Talking to you is the favorite part of my day.");
        englist.add("Meeting you was fate, becoming your friend was a choice, but falling in love with you was beyond my control.");
        englist.add("The few hours I spend with you are worth the thousand hours I spend without you.");
        englist.add("I don't have the heart to hurt you, that's the last thing I want to do, but I don't have the heart to love you, not the way you want me to.");
        englist.add("Did the sun come up or did you just smile at me?");
        englist.add("Hello, I’m a thief, and I’m here to steal your heart.");
        englist.add("I am not flirting. I am just being extra friendly to someone who is extra attractive.");
        englist.add("That awkward moment when your kindness is mistaken with flirting.");
        englist.add("I woke up on the wrong side of Facebook.");
        englist.add("You can love me or hate me I swear it won't make me or break me.");
        englist.add("When I was kidnapped, my parents snapped into action. They rented out my room.");
        englist.add("I am a fish out of water without YOU!");
        englist.add("I used to be a terrible flirt. I'm much better at it now.");
        englist.add("Loving you is like breathing. How can I stop it?");
        englist.add("I will always have this piece of my heart that smiles whenever I think about you.");
        englist.add("All the birds in the sky, all the fish in the sea, will never explain what you mean to me.");
        englist.add("Smile.. it's the second best thing to do with your lips.");
        englist.add("You are the like of my like.");
        englist.add("When I want to smile, I know exactly what to do, I just close my eyes and think of you.");
        englist.add("Lets flip a coin, heads your mine, tails I'm yours...");
        englist.add("The most beautiful clothes that can dress a woman are the arms of the man she loves.");
        englist.add("YOU have no idea how fast my heart beats when I …… SEE YOU.");
        englist.add("You know a girl is serious when they say your name in a text.");
        englist.add("Age does not protect us from love, But love to some extent protects us from age.");
        englist.add("There’s no awkwardness between us. I am fine with just staring into your eyes and getting lost in sleepless day dreams with you.");
        englist.add("Stolen kisses are always sweetest..");
        englist.add("A true romantic is one who romances one woman forever.");
        englist.add("There are only two types of honest people in this world, small children and drunk people.");
        englist.add("My heart is mine but whenever I argue with it about you, it takes your side.");
        englist.add("You can never fully forget the ones who gave you butterflies.");
        englist.add("If God ever created something more beautiful than you, he would have kept it for himself.");
        englist.add("Everything is perfect. But only when I am with you.");
        englist.add("When I count my blessings, I count you twice.");
        englist.add("The stars must be jealous. You shine way better than them.");
        englist.add("You make me smile for no reason, yet I have every reason to smile about having you in my life.");
        englist.add("God made mud.. God made dirt.. God made guys so girls can flirt.");
        englist.add("I was wondering if you had an extra heart mine seems to have been stolen.");
        englist.add("I'm in my bed, you are in yours. One of us is obviously in the wrong place.");
        englist.add("It makes me smile to wake up next to you.");
        englist.add("If you don't wanna have kids with me, then why don't we just practice?");
        englist.add("I have a big hug waiting for you anytime you need one.");
        englist.add("I’m falling in like you know.");
        englist.add("We met, we talked, we liked, we dated, we committed, i loved, u cheated, we're done, ur deleted.");
        englist.add("I love the way you walk, talk and laugh.");
        englist.add("I could conquer the world with just one hand as long as you were holding the other.");
        englist.add("Let make it short and simple, I love you.");
        englist.add("When I looked into your eyes I didnt see just you, I saw my today, my tomorrow, and my future for the rest of my life.");
        englist.add("Do you have any sunscreen? Because you are burning me up.");
        englist.add("8 billion people in this world and I only want you.");
        englist.add("Why do I love you? Because I finally learned what the word means, and you were the one who showed me.");
        englist.add("Excuse me, do you mind if I stare at you for a minute? I want to remember your face for my dreams.");
        englist.add("My stars said I would meet the woman of my dreams tonight.");
        englist.add("To be perfectly honest I don’t really give a damn what my status says. I’m just so glad your wasting your time reading it.");
        englist.add("Advice to women: Date like a man and you'll never get hurt.");
        englist.add("Flirting is like a game of Chess. One wrong move ….. and you are married :)");
        englist.add("Honestly I have no idea how to live without you.");
        englist.add("I think I can die happy now, coz I’ve just seen a piece of heaven.");
        englist.add("Your smile is literally the cutest thing I have ever seen in my life.");
        englist.add("It's not my fault that I fell for you, you tripped me.");
        englist.add("Evey time I look into your eyes I see my paradise.");
        englist.add("If someone throws a stone at you, throw a flower at them. But remember to throw the flower pot with it.");
        englist.add("I'm falling in like you know.");
        englist.add("Every night I go home crying because I’ll have to wait until tomorrow to see you again.");
        englist.add("I see you with my heart not with my eyes.");
        englist.add("I want to be the only hand you ever need to hold.");
        englist.add("Do I know you? Cause you look a lot like my next girlfriend.");
        englist.add("I know all kinds of candies and all kinds of chocolates are sweet. But, nothing can compare to the sweetness of my lips.");
        englist.add("I have high double standards.");
        englist.add("If I had a British accent I would never shut up.");
        englist.add("I am so much better at text flirting than real flirting.");
        englist.add("I don't need to dream, I got you!");
        englist.add("The truth is words can’t define the way I feel for you.");
        englist.add("Far in distance, but near at heart, you’ll always be the angel of my heart.");
        englist.add("Statistics say that 1 in 4 people are insane, so take a look at your 3 best friends and if they are all OK, its you..");
        englist.add("Every morning I wake up happy b'coz I know I will see you.");
        englist.add("I'd be lying if I say you entered my mind many times. Coz you only entered once, since then you never came out.");
        englist.add("You seems like an oxygen to me, without you its hard for me to breath :)");
        englist.add("Advice to women: Date like a man and you’ll never get hurt.");
        englist.add("It’s amazing how I look up into the stars, and you’re the first thing that comes into my mind.");
        englist.add("Heart changes, I know they do but this heart always belongs to You.");
        englist.add("If I know what love is, it is because of you.");
        englist.add("You are the first person who has been able to make my heart beat slower and faster at the same time.");
        englist.add("If nothing lasts for ever, will you be my nothing?");
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