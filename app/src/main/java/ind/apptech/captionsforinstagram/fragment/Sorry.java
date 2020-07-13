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

public class Sorry extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Sorry() {
        // Required empty public constructor
    }

    public static Sorry newInstance(String param1, String param2) {
        Sorry fragment = new Sorry();
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

        englist.add("Sorry means nothing without the actions to back it up.");
        englist.add("A good apology has three parts: 1. I'm sorry. 2. It's my fault. 3. What can I do to make it right?");
        englist.add("I regret stuffing things up with the one that obviously cares for me more then you.. I'm sorry but its true.");
        englist.add("It takes a strong person to say sorry.. and an even stronger person to forgive.");
        englist.add("Never let the sun go down on your anger. You might not get the light of a new day to say I am sorry.");
        englist.add("You're not sorry for what you did.. you're just sorry you got caught.");
        englist.add("I'm a very laid back person.. i try to hide the pain I'm feeling but it gets hard.. sorry I'm not perfect.");
        englist.add("I am sorry for the pain I caused you, I feel so bad.");
        englist.add("Let the wife make the husband glad to come home, and let him make her sorry to see him leave.");
        englist.add("I'm sorry i get jealous sometimes & overreact. It's only because There's A Bigger Chance Of ME Losing YOU Than You losing me.");
        englist.add("Hope things go back to the way they used to be.");
        englist.add("I'm sorry if sometimes I get a little jealous..thinking that someone else could make you happier than I could.");
        englist.add("Sometimes sorry just isn't enough. Even if you mean it with all your heart.");
        englist.add("If you keep saying sorry but do the same thing over and over again then saying sorry just becomes another lie!");
        englist.add("I wish I could be what you want, but I can't and I'm sorry. - Jenn M.");
        englist.add("Saying sorry was the biggest strength!");
        englist.add("I'm Sorry.. doesn't automatically fix everything. Apologies can't fix a broken heart.");
        englist.add("Please believe me when I say.. I am Sorry.. because I am. I didn't mean to hurt you in anyway.");
        englist.add("Sees the character of a person in the strength of their apology.");
        englist.add("I'm sorry.. means nothing if you continue to do the same wrong over and over again.");
        englist.add("Never ruin an apology with an excuse. - Kimberly Johnson");
        englist.add("I know what i did to lose you.. and im SO sorry. I didn't mean it.. I was blinded..Blinded by my anger please forgive me.");
        englist.add("You're not sorry, for anything. But I am. I guess that's what makes us two VERY different people.");
        englist.add("Trust me.. and I'm sorry.. are the two phrases that mean absolutely nothing. they are both just lies.");
        englist.add("Sometimes saying SORRY is the most difficult thing on earth But its the Cheapest thing to save the most expensive gift called Relationship!");
        englist.add("The word 'Sorry'.. means nothing unless you prove it.");
        englist.add("Never apologize for what you feel. It's like saying sorry for being real.");
        englist.add("Sorry for butting in.. but I think being friends doesn't necessarily mean talking all the time.");
        englist.add("Thinks SORRY should be removed from the dictionary because its OVER used and has NO meaning.");
        englist.add("I am sorry for felling sorry.");
        englist.add("When i look at you i think that we should be together but when we are i screw it up and i am sorry");
        englist.add("I admit I made a mistake Over stepping some boundaries which made me look fake. I always said I would never do the things I did, and that is the reason it is so hard for you to.");
        englist.add("Not the fastest horse can catch a word spoken in the moment of angery.");
        englist.add("Love means never having to say you're sorry.");
        englist.add("I have learned that sometimes SORRY is not enough. You actually have to change yourself.");
        englist.add("Chocolate says.. I'm sorry, so much better than words.");
        englist.add("I'm sorry but nothing can change the fact that your the definition of a jerk");
        englist.add("Very sorry can't come. Lie follows by post.");
        englist.add("My life was Complete But Now It's not I lost it all, Because I Fought. She made me alive Now I am dead I'm laying here Crying in my bed Life is worthless Why should I.");
        englist.add("I'm not perfect, I make mistakes, I hurt the ones I love now and then, but when i say sorry, I mean it with all my heart.");
        englist.add("I am tired of apologizing for the things I didn't do and to the people who don't deserve it.");
        englist.add("Sometimes sorry just isn't enough. Even if you mean it with all your heart.Never ruin an apology with an excuse.");
        englist.add("I'm sorry I can't speak very coherently.");
        englist.add("I don't quite know how to make things better between us but i can start with I'M SORRY.. I really am.");
        englist.add("I am not perfect, I make mistakes, I hurt people. But when I say sorry, I mean it.");
        englist.add("Sometimes we say things we don't mean. sometimes we hurt each other. but no matter what i will always love you.");
        englist.add("Hates it when you can feel someone else's pain & suffering but can't make it better.");
        englist.add("Never lose yourself while trying to hold on to someone who doesn't care about losing you.");
        englist.add("You can only put on a fake smile for so long.. then the truth starts to be revealed");
        englist.add("I have learned that sometimes 'sorry' is not enough. Sometimes you actually have to change.");
        englist.add("It's very easy to hurt someone and then say 'sorry' but it's really difficult to get hurt and then say 'Im fine'");
        englist.add("Don't say sorry for something you are planning on repeating later.");
        englist.add("Saying sorry doesn't mean there isn't guilt and forgiving doesn't mean the pain is gone.");
        englist.add("I feel sorry for the person who write terms and contitions no body read that.");
        englist.add("Never say you're sorry.. It's a sign of weakness.");
        englist.add("I wish I could be what you want, but I can't and I'm sorry.");
        englist.add("I am sorry for being my self and im sorry for you and your greedy ways.");
        englist.add("It takes courage to grow up and become who you really are.");
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