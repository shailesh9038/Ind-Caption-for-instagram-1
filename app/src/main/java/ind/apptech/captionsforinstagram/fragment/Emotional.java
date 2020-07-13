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

public class Emotional extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Emotional() {
        // Required empty public constructor
    }

    public static Emotional newInstance(String param1, String param2) {
        Emotional fragment = new Emotional();
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

        englist.add("It's very easy to say Busy when someone needs you, but it's very painful to hear Busy when you need someone.");
        englist.add("Sometimes one hello, makes you never want to say goodbye.");
        englist.add("Remember: someone is happy with less than you have.");
        englist.add("Being single is smarter than being in the wrong relationship.");
        englist.add("You are not poor because you don’t have money. You are poor if you don’t have a dream.");
        englist.add("Why are you trying so hard to fit in when you were born to stand out?");
        englist.add("You can spend minutes, hours, days, weeks, even months analyzing a situation, trying to put the pieces together. Justifying what could’ve, should’ve, would’ve happened. Or you can just leave the pieces on the floor and move on.");
        englist.add("Even GOD doesn’t propose to judge a man till his last day, why should you and I.");
        englist.add("Tough times are like physical exercise, you may not like it while you are doing it but tomorrow you’ll be stronger b’coz of it.");
        englist.add("You can’t let one bad moment spoil a bunch of good ones. Don’t let the silly little dramas of each day get you down.");
        englist.add("Let me see you try to live without me. Now where’s your heartbeat? Flat line on the EKG.");
        englist.add("Some people are more interested in other people's lives than their own.");
        englist.add("My heart beats. Echoes into the cold streets. Where nightmares and darkness begin to meet.");
        englist.add("Knowledge is like underwear. It is useful to have it, but not necessary to show it off.");
        englist.add("Sometimes you expect so much from others, but maybe it`s because you`d be willing to do it for them.");
        englist.add("You can ignore me as long as you can but you can never change memories i brought in your life.");
        englist.add("Never let the pain from your past punish your present and paralyze your future.");
        englist.add("We should not focus on the doors that God closes. Change does not have to be a bad thing. Change means growth.");
        englist.add("Virtue is never left to stand alone. He who has it will have neighbors.");
        englist.add("why do we close our eyes when we pray, when we cry, when we kiss, when we dream. Because the most beautiful things in life are not seen but felt only by heart..");
        englist.add("Hard work is a two way street. You get back exactly what you put in.");
        englist.add("The best thing about being me, I’m a limited edition, there are no other copies..");
        englist.add("A single lie discovered is enough to create doubt over every truth expressed..");
        englist.add("I love buying new things but I hate spending money.");
        englist.add("Some people are more interested in other people’s lives than their own.");
        englist.add("Im done with tears. Im wiping my eyes. If he doesn't care then why the hell should I?");
        englist.add("Stop waiting for one Day. Today is the Day.");
        englist.add("Honesty is very expensive gift. Do not expect it from cheap people.");
        englist.add("Your beliefs don’t make you better person, your behavior does.");
        englist.add("Let's commit the perfect crime: I steal your heart and you steal mine.");
        englist.add("it’s funny how a person can hurt you so much when you were expecting it in the first place");
        englist.add("If you can't beat them, arrange to have them beaten.");
        englist.add("When something bad happens, something good happens in return because no matter what you do somebody is looking out for you and you never know who that could be.");
        englist.add("Success means having the courage, the determination, and the will to become the person you believe you were meant to be.");
        englist.add("The best revenge is just moving on. Don’t give someone the satisfaction of watching you suffer.");
        englist.add("Life is what happens to you while you're busy making other plans.");
        englist.add("Ability is what you're capable of doing, motivation determines what you do, and attitude determines how well you do it.");
        englist.add("I wonder if I've met the person I'm going to marry.");
        englist.add("We all are born to die don't feel more special than me.");
        englist.add("I'm fighting to get you out of my head but I'm holding onto every word that you ever said.");
        englist.add("Insult and wife are somewhat similar.. They always look good..If it is not yours.");
        englist.add("I'm not arguing, I'm simply tried to explaining why I'm Right.");
        englist.add("Sometimes one hello makes you never want to say goodbye.");
        englist.add("If you continuously compete with others, you become bitter but if you continuously compete with yourself, you become better.");
        englist.add("My silence is just another word for my pain.");
        englist.add("There are far, far better things ahead than any we leave behind.");
        englist.add("Behind this smile is everything you'll never understand.");
        englist.add("Silence speaks very loudly but it is amazing how many people don't take the time to listen.");
        englist.add("Winners don't do different things, they do things differently.");
        englist.add("Worrying is a waste of time. It does not change anything. It messes with your mind and steals your happiness.");
        englist.add("The problem is not the problem, the problem is your attitude about the problem.");
        englist.add("I have always been afraid of losing people I love, but sometimes I keep asking myself, Is there anyone who's afraid of losing me too?");
        englist.add("Acting is a total physical, emotional sensation.");
        englist.add("Usually the people who degrade others are self conscious about themselves. They want to feel empowerment over you & see you get in your feelings. Don't let them.");
        englist.add("Let me see you try to live without me. Now where's your hea");
        englist.add("It seems impossible to stop thinking about your ex-lover and the memories you have shared together.");
        englist.add("Sometimes it’s only after you leave a situation that you realize you shouldn’t have been in it to begin with.");
        englist.add("If you have the courage to begin, you have the courage to succeed.");
        englist.add("Though the feeling has not passed sad to say our love did not");
        englist.add("I want to say I deserve better and mean it. I want to say I give up and believe it. I want to say Im moving on and do it.");
        englist.add("It doesn't matter what you do. It matter who you do it with.");
        englist.add("NO matter how talented you are, not everybody is going to like you, but that’s life, just stay strong.");
        englist.add("As long as you know GOD is for you, it doesn’t matter who is against you.");
        englist.add("Our life are defined by opportunities. Even the ones we miss.");
        englist.add("Math Rule: If it seems easy, you're doing it wrong.");
        englist.add("Words can be very powerful. Why not use them to lift someone up today rather than knock them down.");
        englist.add("If the ingredients for happiness are not within a person, no material success or entertainment or platinum credit cards can make that person smile.");
        englist.add("A failure is a success only if you learn from the mistakes you did.");
        englist.add("When people can walk away from you let them walk. Your destiny is never tied to anybody that left.");
        englist.add("The difference between can and cannot are only three letters. Three letter that determine your life direction.");
        englist.add("Sometimes you need patience in order to find true happiness. It won’t come fast and it won’t come easy, but it will be worth it.");
        englist.add("The start is what stops most people.");
        englist.add("The way you smile at me makes me smile even more.");
        englist.add("If you born poor it’s not your mistake but if you die poor it’s your mistake.");
        englist.add("When you put that ring on my finger, you put a chain of death around my heart.");
        englist.add("There's always a person that you hate for no reason.");
        englist.add("I'm Jealous of My Parents.. I'll Never Have a Kid as Cool as Theirs!");
        englist.add("Life is so confusing, what we want we don’t get, what we get we are not satisfied with, what we expect never happens & what we hate generally repeats..");
        englist.add("Be strong now, b’coz things will get better. It might be stormy now, but it can’t rain forever.");
        englist.add("I’D rather die on my feet than live on my knees.");
        englist.add("The tragedy of life is not that it ends so soon, but that we wait so long to begin it.");
        englist.add("Failure is not falling down but refusing to get up.");
        englist.add("Sometimes i just want to kill myself just to see if anyone really cares.");
        englist.add("Only thing greater than the power of the mind is the courage of the heart.");
        englist.add("Because every breath I take proves that I can live without you.");
        englist.add("Life is short. There is no time to leave important words unsaid.");
        englist.add("Doing the best at this moment puts you in the best place for the next moment.");
        englist.add("I live and I learn but I wait my turn. I'm always on the run, got weight to burn.");
        englist.add("You are never too young to dream big.");
        englist.add("You will never leave where you are until you decide where you want to be.");
        englist.add("I just want to know that someone considers me theirs.");
        englist.add("Never build your emotional life on the weaknesses of others.");
        englist.add("You broke a promise and made me realize. It was all just a lie.");
        englist.add("Worry is a total waste of time. It doesn’t change anything. All it does is steal your joy and keeps you very busy doing nothing.");
        englist.add("Your emotions trouble you only in those things which you call yours.");
        englist.add("If you want to know your past – look into your present conditions. If you want to know your future – look into your present actions.");
        englist.add("To taste the sweetness of life, you must have the power to forget the past.");
        englist.add("Your life is your message to the world. Make sure its inspiring.");
        englist.add("Time decides who you meet in life, your heart decides who you want in your life, but you behaviors decide who will stay in your life.");
        englist.add("Logic will get you from A to Z, imagination will get you everywhere.");
        englist.add("You really believe you want to die… but in reality, you want to be saved.");
        englist.add("Ever read a book that changed your life? Me neither.");
        englist.add("Love your girl like you love your Coffee? Enjoy it before its hotness goes.");
        englist.add("What’s the point in screaming? No ones listening anyway.");
        englist.add("You must be the change you wish to see in the world.");
        englist.add("One thing about music, when it hits you feel no pain.");
        englist.add("People don't buy for logical reasons. They buy for emotional reasons.");
        englist.add("You never understand it until you experience it.");
        englist.add("I`m not addicted to texting, I`m addicted to the person i`m texting.");
        englist.add("Before you go pointing your fingers at someone else, you may want to make sure your own hands are clean..");
        englist.add("My silence doesn't mean that I quit, It simply means that I don't want to argue with people who just don't want to understand.");
        englist.add("Sorry about those texts I sent you last night, my phone was drunk.");
        englist.add("One day you will remember me,one day you will laugh at the memories,one day you will try to find me. But One Day I wont be waiting for what you have to give");
        englist.add("Life is what happens to you while you’re busy making other plans.");
        englist.add("Dreams are the answers to questions that we haven't yet figured out how to ask.");
        englist.add("People change and forget to tell each other.");
        englist.add("If you always do what you've always done, you'll always get what you always got, and you'll always feel what you always felt.");
        englist.add("You think I've changed. Truth is you never really knew the real me.");
        englist.add("Her heart finally told her to stop wasting her time.");
        englist.add("Don't make a permanent decision for your temporary emotion.");
        englist.add("Let me see you try to live without me. Now where's your head.");
        englist.add("You can replace me but you can’t replace the memories you had with me.");
        englist.add("Everyone has someone in their life that keeps them looking forward to another day.");
        englist.add("Do You Want To Go Out With Me? (A) Yes (B) A (C) B.");
        englist.add("Hardships often prepare ordinary people for an exraordinary destiny.");
        englist.add("Every time I see your name come up on my phone, I smile and my heart starts to beat just a little faster.");
        englist.add("Sometimes the questions are complicated and the answers are simple.");
        englist.add("Feelings that come back are feelings that never away.");
        englist.add("Spread more love than hate.");
        englist.add("I'm not addicted to texting, I'm addicted to the person i'm texting.");
        englist.add("When you learn to accept instead of expect, you'll have fewer disappointments.");
        englist.add("Most people fail in life not because they aim too high and miss but b’coz they aim too low and hit.");

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