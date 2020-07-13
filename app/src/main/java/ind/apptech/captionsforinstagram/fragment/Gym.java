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

public class Gym extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Gym() {
        // Required empty public constructor
    }

    public static Gym newInstance(String param1, String param2) {
        Gym fragment = new Gym();
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

        englist.add("The pain of today is the victory of tomorrow.");
        englist.add("Obsession is what lazy people call dedication.");
        englist.add("The only disability in life is a bad attitude.");
        englist.add("There are so many people out there who will tell you that you can't. What you've got to do is to turn around and say, watch me.");
        englist.add("Pain is temporary, pride is forever.");
        englist.add("You don't demand respect, you earn it.");
        englist.add("No pain, No gain!");
        englist.add("I'm doing it for ME.");
        englist.add("Good is not enough if better is possible.");
        englist.add("Everything is hard before it is easy.");
        englist.add("To achieve something you've never had before, you must do something you've never done before.");
        englist.add("On the other side of fear lies freedom.");
        englist.add("Squat till you puke.");
        englist.add("There are seven days in a week and someday isn't one of them.");
        englist.add("Men shouldn't hide weakness, they should kill it.");
        englist.add("Achieving gym Goals, feeling the difference, falling in love everyday with myself.");
        englist.add("If your out of breath, dizzy, feel like vomiting, can't remember your name, you are on the right road.");
        englist.add("You are what you eat, so don't be fast, easy, cheap or fake.");
        englist.add("Every positive thought propels you in the right direction.");
        englist.add("Don't wish for it, work for it.");
        englist.add("The worst thing I can be is the same as everybody else. I hate that.");
        englist.add("Suck it up and one day you won't have to suck it in.");
        englist.add("If plan A didn't work, the alphabet has 25 other letters. Stay cool.");
        englist.add("I can.. I will.. End of story!");
        englist.add("Excuses don't burn calories.");
        englist.add("Eat clean. Train Mean. Get Lean.");
        englist.add("You are born weak and die weak, what you are in between those two periods of time is up to you");
        englist.add("With great size comes great responsibility");
        englist.add("Be proud, but never satisfied.");
        englist.add("A pint of sweat will save a gallon of blood.");
        englist.add("You don't get abs for sucking it in. You get abs for sucking it up.");
        englist.add("Life's too short to be small");
        englist.add("Drop it like a squat.");
        englist.add("Expecting the world to treat you fairly because you're an honest person is like expecting the bull not to charge you because you're a vegetarian.");
        englist.add("Go the extra mile. It's never crowded.");
        englist.add("Life is like exercise. The harder it is, the stronger you become.");
        englist.add("The worst thing you can be is average.");
        englist.add("If you're not first, you're last.");
        englist.add("If not now, when?");
        englist.add("Once you control your mind, you can conquer your body.");
        englist.add("If you still look cute after the gym, you didn't workout hard enough.");
        englist.add("You must do what others don't, to achieve what others won't");
        englist.add("A winner never whines.");
        englist.add("Pain is weakness leaving the body.");
        englist.add("People will stare. Make it worth their while -Harry Winston");
        englist.add("A champion is someone who gets up when they can't.");
        englist.add("Gotta squat before I tie the knot.");
        englist.add("I wear black to the gym because it's like a funeral for my fat.");
        englist.add("Stop saying tomorrow.");
        englist.add("I thought they said rum.");
        englist.add("Wake up with determination, go to bed with satisfaction.");
        englist.add("I Is the only difference between fit and fat.");
        englist.add("Ain't nothing to it but to do it.");
        englist.add("When the going gets tough the tough gets going");
        englist.add("Cardio? Is that spanish?");
        englist.add("Doubt me, hate me, you're the inspiration I need.");
        englist.add("Stop rewarding yourself with food. You are not a dog.");
        englist.add("I got 99 problems but a BENCH ain't one.");
        englist.add("Embrace and love your body. Is the only one you'll ever have.");
        englist.add("You can only fail if you quit.");
        englist.add("I don't care how many reps you do, as long as you lift girl weights you'll get a girl body!");
        englist.add("Cheat on your girlfriends, not on your workouts.");
        englist.add("Muscles are torn in the gym, fed in the kitchen and built in bed.");
        englist.add("Would you rather be covered in sweat the gym or clothes at the beach?");
        englist.add("Turn a setback into a comeback.");
        englist.add("Build your body, build your character");
        englist.add("I had the goal to be the best from day one.");
        englist.add("Destroy what destroys you.");
        englist.add("Work hard now, selfie later.");
        englist.add("For every person who doubts you, tell you that you will fail, try twice as hard to prove them wrong.");
        englist.add("Just think about how you wanna look, just think about how you wanna look. Ok, up with it!");
        englist.add("That moment you hop on a machine after a dude and increase the weight. Love that! -Erin Weiss");
        englist.add("Strive for progress, not perfection.");
        englist.add("Fact: Thinking about going to the gym burns between 0 and 0 calories.");
        englist.add("Do something today that your future self will thank you for.");
        englist.add("You are born weak and die weak, what you are in between those two periods of time is up to you.");
        englist.add("If you're on the treadmill next to me, the answer is yes. We ARE racing.");
        englist.add("You are not hungry. You are bored. Drink some water and learn the difference.");
        englist.add("You don't drown by falling in the water; you drown by staying there.");
        englist.add("The best way to predict your future is to create it.");
        englist.add("I'm not here to talk.");
        englist.add("If it doesn't challenge you, it doesn't change you.");
        englist.add("I wish my Pinterest exercise board was a shopping cart. I'd take these legs, this @ss & this cake.");
        englist.add("You will get a lot more compliments for working out than sleeping in.");
        englist.add("Just do it. Then do it again.");
        englist.add("If the bar ain't bending you're just pretending.");
        englist.add("Junk food that you have been craving for an hour or the body you've been dreaming of for years. The choice is yours.");
        englist.add("Go hard or go home.");
        englist.add("If you always do what you have always done, you will always get what you have always got.");
        englist.add("I may not become perfect, but I sure as hell am going to come close.");
        englist.add("Light days? Whats that? .. Some kind of tampon?");
        englist.add("To change your body, you must first change your mind.");
        englist.add("The hardest thing about earning a title is the ability to live up to it.");
        englist.add("Be the girl at the gym that motivates everyone else to push a little harder.");
        englist.add("My feet hurt from kicking so much @ss.");
        englist.add("The only time Success comes before Work is in the dictionary");
        englist.add("Only you get out, what you put in");
        englist.add("If you don't live for something you'll die for nothing");
        englist.add("Learn to love the burn.");
        englist.add("Working out is a reward, not a punishment.");
        englist.add("The secret to getting ahead is getting started.");
        englist.add("Take care of your body. It's the only place you have to live. -Jim Rohn");
        englist.add("Your mind gives up before your legs do.");
        englist.add("Why would you choose failure when success is an option?");
        englist.add("You want results, then train like it");
        englist.add("Yeah, I had a girlfriend once, but she couldn't spot me, so what was the point?");
        englist.add("There is no force equal to that of a determined woman.");
        englist.add("Food is fuel.");
        englist.add("Stop at never.");
        englist.add("Winners Train, Losers Complain.");
        englist.add("Act like a lady, lift like a boss.");
        englist.add("The more you sweat in practice, the less you bleed in battle.");
        englist.add("you cant flex fat so shut up and lift");
        englist.add("Forget the glass slipper. This princess wears running shoes.");
        englist.add("The more you train, the more people there are who are weaker than you");
        englist.add("It's not who you are that holds you back, it's who you think you're not.");
        englist.add("There are some things that just aren't meant to be changed. Your body is not one of them.");
        englist.add("This beauty is a beast.");
        englist.add("A year from now, you're going to wish you had started today.");
        englist.add("The question isn't can you? It's will you?");
        englist.add("Be that girl that everyone looks at in the gym and says I want her body.");
        englist.add("The best day to start exercising is today. Tomorrow can turn into weeks, months or years.");
        englist.add("When it starts to hurt, thats when the set starts.");
        englist.add("Goals are just dreams with deadlines.");
        englist.add("f*ck skinny. Get fit.");
        englist.add("Run like you stole something.");
        englist.add("When you go in search of honey, you must expect to get stung by some bees.");
        englist.add("When my body 'shouts' STOP, my mind 'screams' NEVER .");
        englist.add("Challenges are what makes life interesting. Overcoming them is what makes life meaningful.");
        englist.add("Fitness is not about being better than someone. Fitness is about being better than the person you were yesterday.");
        englist.add("A run begins the moment you forget you're running.");
        englist.add("EAT BIG, LIFT BIG, GET BIG!");
        englist.add("The hardest step for a runner is the first one out the door.");
        englist.add("Being defeated is often a temporary condition. Giving up is what makes it permanent.");
        englist.add("If you're tired of starting over, stop giving up.");
        englist.add("You're closer than you were yesterday.");
        englist.add("Crawling is acceptable. Falling is acceptable. Puking is acceptable. Tears are acceptable. Pain is acceptable. Injury is acceptable. Quitting is unacceptable.");
        englist.add("Don't let one bad day kill your confidence and progress.");
        englist.add("Fall down seven times, get up eight.");
        englist.add("Never say the sky is the limit when there are footprints on the moon.");
        englist.add("Get ripped, get laid.");
        englist.add("Failure is only a temporary change in direction to set you straight for your next success.");
        englist.add("Do it for the after picture.");
        englist.add("This month's diet is next month's body");
        englist.add("Fitness is like marriage. You can't cheat on it and expect it to work.");
        englist.add("Your workout is my warmup.");
        englist.add("Make your dreams a reality.");
        englist.add("train hard, so they dig deeper than 6 feet into the ground.");
        englist.add("If you fail to prepare, you prepare to fail");
        englist.add("When someone tells you, you can't, turn around and say watch me.");
        englist.add("If your food can go bad, it's good for you -If it can't go bad, it's bad for you.");
        englist.add("No food tastes as good as your goal weight feels.");
        englist.add("If no one thinks you can, then you have to.");
        englist.add("Strength Within, Pride Throughout");
        englist.add("Some people want it to happen, some wish it would happen, others make it happen.");
        englist.add("I'm not on steroids, but thanks for asking..");
        englist.add("Second place is just a spot for the first looser.");
        englist.add("It is far better to be exhausted from success than to be rested from failure.");
        englist.add("It never gets easier, you just get stronger.");
        englist.add("Squat! Because somewhere there's a girl warming up with your max.");
        englist.add("A mile a day keeps the pounds away.");
        englist.add("Character is who you are when no one's watching.");
        englist.add("No one ever drowned in sweat.");
        englist.add("A one hour workout is only 4% of your day. NO EXCUSES.");
        englist.add("STAY WEAK. I needed those plates anyway.");
        englist.add("i do it because i can, i can because i want to, i want to because you said i couldn't");
        englist.add("Squat like Channing Tatum is watching. -Erin Weiss");
        englist.add("Excuses are for people who don't want it bad enough.");
        englist.add("Sweat is your fat crying.");
        englist.add("Change doesn't happen over night. Be patient.");
        englist.add("Workout early in the morning - before your brain has time to realize what you're doing.");
        englist.add("Remember the girl who gave up? No one else does either.");
        englist.add("When you're not training, someone else is.");
        englist.add("We all have the same amount of hours in our day. Deciding how to use your hours is up to you.");
        englist.add("Hard work beats talent when talent doesn't work hard.");
        englist.add("Everybody wanna be a bodybuilder, but don't nobody wanna lift no heavy @ss weights!!");
        englist.add("Of course its heavy, thats why they call it weight.");
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