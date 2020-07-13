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

public class Eng_Famous extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Eng_Famous() {
        // Required empty public constructor
    }

    public static Eng_Famous newInstance(String param1, String param2) {
        Eng_Famous fragment = new Eng_Famous();
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

        englist.add("Don’t let the world change your smile, let your smile change the world :)");
        englist.add("Never get upset, always get “UP” and “SET” yourself.");
        englist.add("3 things you can’t recover in life: the word after its said, the moment after its missed and the time after its gone.");
        englist.add("A man has 2 options in a relationship: Either stand up and be the man she needs OR sit down so that she can see the man behind you.");
        englist.add("Love and the gentle heart are but the same thing.");
        englist.add("We waste time looking for the perfect lover, instead of creating the perfect love.");
        englist.add("There’s three ways to do things. The right way, the wrong way and the way I want it done.");
        englist.add("Remember, people can’t read your mind, but they can definitely read your face.");
        englist.add("The past was never a mistake if you learned from it.");
        englist.add("The secrets of happiness is to count your blessings while others are adding up their troubles.");
        englist.add("Most people spend their time trying to find someone to sleep with, instead of finding someone worth waking up to.");
        englist.add("Remember the five simple rules to be happy, Free your heart from hatred. Free your mind from worries. Live simply. Give more. Expect less.");
        englist.add("The unhappiest people in the world are those who care the most about what other people think.");
        englist.add("There are two kinds of secrets. Those we keep from others. And those we hide from ourselves.");
        englist.add("Funny but true ..If you love truly, You will die daily.. But If you flirt truly, You will enjoy daily.");
        englist.add("If youre willing to chase me, I promise to run slow.");
        englist.add("Most of problems in life are b’coz of two reasons: We act without thinking or we keep thinking without acting.");
        englist.add("Respect is not a given right, nor can it be demanded. It is earned..");
        englist.add("Live without pretending, Love without depending, Listen without defending, Speak without offending.");
        englist.add("If a guy treats you like a princess then he surely wants to be your prince.");
        englist.add("The greatest gift you can give to a special someone is your TIME. Its like you’re giving the portion of your life that you can never bring back.");
        englist.add("A smile is a sign of joy, a hug is a sign of love, a laugh is a sign of happiness and a friend like me. Well that’s a sign of good taste.");
        englist.add("I want a cute relationship where we can laugh, play, cuddle all day long and just be damn happy together.");
        englist.add("What you get in life is what you have the courage to ask for.");
        englist.add("Experience is what you get when you don’t get what you want.");
        englist.add("All truths are easy to understand once they are discovered; the point is to discover them.");
        englist.add("May be it’s not always about trying to fix something broken. May be it’s about starting over and creating something better.");
        englist.add("Anyone can make you happy by doing something special but only someone special can make you happy without doing anything.");
        englist.add("Haters are not born, they are made.");
        englist.add("I never dream of having a perfect relationship, but I always dream of having a long time relationship for a lifetime.");
        englist.add("I don’t exist to impress the world. I exist to live my life in a way that will make me happy.");
        englist.add("The problem is not a problem. The problem is your attitude about the problem. Do you understand?");
        englist.add("Sometimes its not the song that makes you emotional. Its the people & things that come to your mind, when you hear it.");
        englist.add("Judge each day not by the harvest you reap but by the seeds you plant.");
        englist.add("Women are like police, they can have all the evidence in the world but they still want a confession.");
        englist.add("Communism is like prohibition – it’s a good idea, but it won’t work.");
        englist.add("But to see her was to love her, love but her, and love her forever.");
        englist.add("Love the heart that hurts you but never the heart that loves you.");
        englist.add("No and Yes are the Words which need a long thought. Most of the troubles in life are the result of saying Yes too soon or No too late.");
        englist.add("All you do is sit on Facebook all day” Lies. I sit on the chair.");
        englist.add("Talking about our problems is our greatest addiction, break habit, talk about your joys.");
        englist.add("There are 4 things you can never recover, The stone..after the throw. The word..after it’s said. The occasion..after it’s missed. The time..after it’s gone.");
        englist.add("Sometimes love won’t make sense in the beginning, but if it’s true, it’ll work out in the end, and that’s what makes it so beautiful.");
        englist.add("We cannot change yesterday, and we cannot predict tomorrow, but we can live today. So be alive. Never let one day pass by without a smile.");
        englist.add("The thought of being with you tomorrow gives me the strength to go on today.");
        englist.add("In about 20 years, the hardest thing our kids will have to do, is find a username that isn’t taken.");
        englist.add("A good plan is better than a perfect plan tomorrow.");
        englist.add("Don’t confuse my personality with my attitude. My personality is who I am, and my attitude depends on who you are.");
        englist.add("Just b’coz you miss someone, doesn’t mean you need them back in your life. Missing is just a part of moving on.");
        englist.add("I don’t care if it’s not a perfect relationship, I just want it to be real.");
        englist.add("I thought of you again today …………..");
        englist.add("Respect and trust are two easiest thing in life for someone to lose and the hardest things to get back.");
        englist.add("Always remember that you are unique, just like everyone else.");
        englist.add("RESPECT : You give it …. You get it.");
        englist.add("I just want to have a place in your heart like you have a place in mine.");
        englist.add("No matter how good or bad you think life is, wake up each day and be thankful for life. Someone somewhere else is fighting to survive.");
        englist.add("Have you ever looked back at the past and realized you were such an idiot?");
        englist.add("Why waste your time getting hurt by someone when theres someone else out there waiting to make you happy.");
        englist.add("True love is when you cant describe in words what you like about him.");
        englist.add("Dreams are like stars…you may never touch them, but if you follow them they will lead you to your destiny.");
        englist.add("Never give up on someone you can’t go a day without thinking about.");
        englist.add("Never try to dominate the one who says sorry to you for their mistake because they understand, you are more important than their ego.");
        englist.add("Respect is for those who deserve it, not for those who demand it.");
        englist.add("Make a relation with someone, who is not only proud to have you but will take every risk to be with you.");
        englist.add("The past is like using your rear view mirror in the car, its good to glance back and see how far you have come, but if you stare too long you will miss what’s right in front of you.");
        englist.add("It’s very easy to hurt someone & say sorry but it’s very difficult to get hurt and say it’s OK.");
        englist.add("God only gives three answers to prayer: 1. ‘Yes’ 2. ‘Not yet.’ 3. ‘I have something better in mind.");
        englist.add("When something bad happens you have three choices, you can either let it define you, let it destroy you or let it strengthen you.");
        englist.add("You never get a second chance to make a first impression.");
        englist.add("A man is not finished when he is defeated. He is finished when he quits.");
        englist.add("As long as there is someone in the sky to protect me, there is no one on the earth who could break me.");
        englist.add("Don’t just wait. Make it happen.");
        englist.add("Dont think of the things you did not get after praying. Think of the unlimited blessings God gave you without asking.");
        englist.add("When two people are meant for each other, no time is too long, no distance is too far, and no one can ever tear them apart.");
        englist.add("Never give up on what matters the most to you. Keep fighting for what you want.");
        englist.add("Sometimes, no matter how much faith we have, we lose people. But you never forget them and sometimes, it’s those memories that give us the strength to go on.");
        englist.add("You can’t be late until you show up.");
        englist.add("Might be our education system is making good engineers and good doctors but need for good human being is required the most.");
        englist.add("Sometimes people are beautiful. Not in looks, not in what they say, just in what they are.");
        englist.add("Waiting until your parents are in good mood before asking them for something you want.");
        englist.add("I may not be there yet but Im closer than I was yesterday");
        englist.add("Sometimes the strongest people are the ones who love beyond all faults, cry behind closed doors, and fight battles that nobody knows.");
        englist.add("Love distils desire upon the eyes, love brings bewitching grace into the heart.");
        englist.add("No matter how much it hurts right now, one day you will look back and realize it changed your life for the better.");
        englist.add("No matter what happens to us, everyday spent with you is the best day of my life.");
        englist.add("I don’t like to share my personal life. It wouldn’t be personal if I shared it.");
        englist.add("Fools use tomorrow. Wise use today.");
        englist.add("Sometimes I keep my feelings to myself because it’s hard for someone else to understand them.");
        englist.add("Sometimes you have to be your own hero b’coz sometimes the people you can’t live without can live without you.");
        englist.add("Love is a beautiful dream.");
        englist.add("Trust the one who can see SORROW behind your smile, LOVE behind your anger and REASON behind your silence.");
        englist.add("“Be strong” a phrase that’s easy to say but a hard thing to do when you are broken.");
        englist.add("Every generation laughs at the old fashions, but follows religiously the new.");
        englist.add("Through dreams we enter a world that is entirely our own.");
        englist.add("Life is like a coin. You can spend it however you wish….. But you only get to spend it once.");
        englist.add("There is no heaven like mutual love.");
        englist.add("People say that love is in every corner, gosh! maybe i’m moving in circles..");
        englist.add("Admit it, sometimes, even when your crush does something really weird… it still looks cute.");
        englist.add("There can be no happiness if the things we believe in are different from the things we do.");
        englist.add("The problem with the world is that, people think happiness comes from someone else.");
        englist.add("Decided to burn lots of calories today so I set a fat kid on fire!");
        englist.add("Your life is the fruit of your own doing. You have no one to blame but yourself.");
        englist.add("Sometimes best thing to say is nothing. Some people are not even worth your words.");
        englist.add("A tongue has no bones but it’s really strong enough to break a heart.");
        englist.add("I’m not gonna change for anyone. I don’t care what people think, because I am me, and proud of it.");
        englist.add("One is loved because one is loved. No reason is needed for loving.");
        englist.add("I love haters, they’re my biggest fans They make me famous");
        englist.add("A conscience is what hurts when all of your other parts feel so good.");
        englist.add("Relationships do not need promises, terms, and conditions. It just needs two wonderful people, one who can trust and one who can understand.");
        englist.add("Only by going too far can one possibly find out how far one can go.");
        englist.add("Beautiful things happen in your life when you distance yourself from all the negative things.");
        englist.add("Sometimes removing some people out of your life makes room for better people.");
        englist.add("Violence and arms can never resolve the problems of men.");
        englist.add("People who like to judge and throw accusations around are really just trying hard to cover up their own issues and insecurities.");
        englist.add("Love is but the discovery of ourselves in others, and the delight of recognition.");
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