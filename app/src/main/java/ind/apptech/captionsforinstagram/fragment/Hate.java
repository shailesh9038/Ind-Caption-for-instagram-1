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

public class Hate extends Fragment {

    RecyclerView rajputlist;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Hate() {
        // Required empty public constructor
    }

    public static Hate newInstance(String param1, String param2) {
        Hate fragment = new Hate();
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

        englist.add("Why did you bother smiling in front of my face when you were busy gossiping behind my back? I hate you.");
        englist.add("I don't have your attitude I have my own.");
        englist.add("I don't hate you, I hate what you do, and who you have become as a person.");
        englist.add("May be it's true, may be we dont know what we have untill we have lost it. But may be it's also true that we don't know what we are missing until we find it.");
        englist.add("Hating is easy, love takes courage.");
        englist.add("I hate you, and you and you too. Now try and figure out who this status is about!");
        englist.add("I don't have time to hate people bcz.. I'm busy loving people who love me.");
        englist.add("If I had known it would hurt this much, I never would have told you I love you.");
        englist.add("I hate all the bullshit...and heart brakes!");
        englist.add("No, I don't hate you, I just hate the things you do and have done.");
        englist.add("Jealousy is ugly - that would explain your face.");
        englist.add("The problem is I truly hate you but I just can't stop loving you.");
        englist.add("I hate when the remote is way over there.");
        englist.add("Hate is a power full word i don't usually use it but because your special ill use it :) :P");
        englist.add("Sometimes its good to forget good memories.");
        englist.add("No matter how much I say I hate you, just know I still care.");
        englist.add("I hate you for the way you smile when you look at me.");
        englist.add("It's better to alone than to be with looser.");
        englist.add("Sometimes goodbye is just a painful way to say I love you.");
        englist.add("The opposite of love is not hate, it's indifference. If you hate someone, you still care.");
        englist.add("Waiting for someone else to make you happy,is the best way to be sad.");
        englist.add("I absolutely hate it when my seat belt gets stuck .");
        englist.add("Smile in front of people who hate you... Ur happiness kills them.");
        englist.add("I love my family, friends so much. But not as much as you love your-self!");
        englist.add("Silence is better than lies.");
        englist.add("I hate you with the same amount of passion that I once loved you with.");
        englist.add("The person i love hates me no it sucks so bad i am F..bad..ed up.");
        englist.add("I hate stupid people... period!");
        englist.add("My attitude depends on the people in front of me.");
        englist.add("Some people are living with a double personality like mean inside but nice outside.");
        englist.add("We are never ever getting back together.");
        englist.add("Hate a person seriously but never try to love for fun.");
        englist.add("Ever since I met you, no one else is worth thinking about!");
        englist.add("Life rocks but if you hate your life at least we know where going.");
        englist.add("If you want to learn to love better, you should start with a friend who you hate.");
        englist.add("I tell you I like you all the time. Or at least in my head, I do.");
        englist.add("I hate it when people randomly change.");
        englist.add("One of the few things that can't be recycled is wasted time.");
        englist.add("You hate me?! Wow, I didn't even know you existed.");
        englist.add("If I treated you how you treated me... trust me... you would hate me.");
        englist.add("Haters are only my motivators :)");
        englist.add("When Sum One Hates You for no reason... Give them a reason :P :D");
        englist.add("Did i forget to mention i hate being taken for a cunt?!");
        englist.add("Hate me and I swear I'll f... with you till you love me or die :D");
        englist.add("I have a rude thought every three seconds!");
        englist.add("Of Course I talk to myself, because sometimes I need Expert Advice.");
        englist.add("I hate to fight. I like to love. But I will fight for what I love.");
        englist.add("I hate you but I can't stop loving you.");
        englist.add("Tell me what you're thinking... Don't dedicate a song so I have to guess!!");
        englist.add("If you hate sarcasm, then stop asking stupid questions.");
        englist.add("Says you can either Love or Hate me, either way you'll be thinking of me :}");
        englist.add("Dear GOD, Thank you for being there when no body else was.");
        englist.add("One good thing about you, you're easy to ignore.");
        englist.add("I hate feeling unimportant to people who are important to me.");
        englist.add("People are jealous not because they hate you its because they hate themselves.");
        englist.add("I love you hurts more than I hate you when I know I can't have you.");
        englist.add("Love to be alone, hate to be lonely.");
        englist.add("There's always one person that everybody else loves but you HATE.");
        englist.add("It hates when people can run their mouths behind your back.");
        englist.add("Haters are my stepping stones... they try 2 bring me down, but i use them 2 go higher up...");
        englist.add("I love you all because hate is my enemy.");
        englist.add("I can be your enemy with as much passion and devotion as I can be your friend!");
        englist.add("I honestly hate knowing that I will never have you.");
        englist.add("Sometimes I love you, sometimes I hate you, but there isn't a day that goes by that I don't miss you.");
        englist.add("I hate the fact that I thought you were the one. I also hate the fact that I was completely wrong.");
        englist.add("Your best friends are going to hurt you every once in a while, you must forgive them for that.");
        englist.add("Love is really just Hate in Disguise.");
        englist.add("I hate you for making me love you.");
        englist.add("At first I got sad, then I got mad, then I got tired...and now I'm exhausted.");
        englist.add("I'm not rude, i'm honest. i just speak what's on my mind, even if most van't handle the truth.");
        englist.add("I don't hate you I'm just not necessarily excited about your existence.");
        englist.add("I was raised not to be rude, but I also try to get the best work out of people.");
        englist.add("Sometimes I love you,sometimes I hate you,but there isn't a day that goes by that I don't miss you.");
        englist.add("War doesn't determine who's right, it determines who's left.");
        englist.add("Life without mistakes is like, education without books.");
        englist.add("I HATE when people accuses me of doing something when in reality they are the ones that are doing it.");
        englist.add("If you can't understand my silence you will never understand my words.");
        englist.add("Love is when you look into someones eyes and see everything you need.");
        englist.add("I hate you.... hate you more than anything");
        englist.add("I like lovers but i hate love.");
        englist.add("Don't put out if you don't give out... Hate cock-teasers.");
        englist.add("I just want to punch a wall as hard as I can. I hope I miss and it hits your face.");
        englist.add("I hate everything about you and your drama oh and that new slut you have.");
        englist.add("I tell you I like you all the time. Or at least in my head, I do..");
        englist.add("I know you won't come back but my heart will take life long time to accept this.");
        englist.add("I don't have time to hate people, who hate me. because, I'm too busy in loving people who love me.");
        englist.add("Hey plain and simple...I F...ING HATE YOU.");
        englist.add("If you cant find whats good in me try to find whats wrong in U.");
        englist.add("People don't like to see u bless they want you to stay on their level.");
        englist.add("Don't hate me because I'm beautiful,hate me because your boyfriend thinks I am.");
        englist.add("Love is that first feeling you feel before all the bad stuff gets in the way.");
        englist.add("Its not that I hate you oh wait I do hate you.");
        englist.add("When I love you it's real and when you get on my bad side, I hate you.");
        englist.add("I Hate the 160 character texting limit!");
        englist.add("I hate math but I love counting money.");
        englist.add("For all those haters out there. Well.");
        englist.add("I wish I could hate you.");
        englist.add("You hate me! Wow, I didn't even know you existed..");
        englist.add("Famous teenager lines, 'I hate everything'.");
        englist.add("How can i believe if in the middle of believe was the word LIE?");
        englist.add("No matter how long you know someone, they eventually show their true colors.");
        englist.add("The secret to success is to start from scratch and keep scratching.");
        englist.add("Don't spend time with person those you don't like.");
        englist.add("I Don't Hate You, I Just .. I ..Yeah.. Never Mind I Hate You.");
        englist.add("Don t be afraid of sacrificing your life to God.");
        englist.add("I hate how I let the dumbest things bother me sometimes.");
        englist.add("I hate when people watch me using the computer.");
        englist.add("Sometimes we need someone to simply be there. Not to fix anything or do anything in particular, but just to let us feel we are supported and cared about.");
        englist.add("I hate you from the bottom of my heart.");
        englist.add("If someone hates you for no reason..... Well, give them one good one.");
        englist.add("Hating me won't make you pretty! IN FACT not even plastic surgery would help!");
        englist.add("Haters hate because they hate seeing you do better!");
        englist.add("I hate feeling unwanted.");
        englist.add("I hate myself for still thinking about you.");
        englist.add("I hate you... hate you more than anything.");
        englist.add("It is better to be hated for what you are, than to be loved for what you are not.");
        englist.add("I don't know what have i become.");
        englist.add("I hate you for the sacrifices you made for me.");
        englist.add("Nothing is IMPOSSIBLE, The word itself says I'M POSSIBLE.");
        englist.add("Smile in front of people who hate you.. Ur happiness kills them..");
        englist.add("Unsaid words can mean anything and everything.");
        englist.add("I love you more than words can define, feelings can express and thought can imagine.");

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