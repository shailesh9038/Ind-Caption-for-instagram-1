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

public class Inspirational extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Inspirational() {
        // Required empty public constructor
    }

    public static Inspirational newInstance(String param1, String param2) {
        Inspirational fragment = new Inspirational();
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

        englist.add("You can't force people to stay in your life. Staying is a choice, so be thankful for people who choose you.");
        englist.add("Everything that has a beginning, has an end. So the key is to try to enjoy the in between as much as possible!");
        englist.add("We all have problems; the way we solve them is what makes us different.");
        englist.add("Right or Wrong doesn't exist. When u have a CONFIDENCE");
        englist.add("If you believe in yourself, things are possible.");
        englist.add("The tragedy of life is not that it ends so soon, but that we wait so long to begin it.");
        englist.add("Whether you Think you can, or think you can't you're always right.");
        englist.add("The secret of success is to know something nobody else knows.");
        englist.add("Try to learn something about everything and everything about something.");
        englist.add("Better to live one year as a tiger, than a hundred as a sheep.");
        englist.add("Hope is the power that gives a person the confidence to step out and try.....");
        englist.add("Trying and Doing are two different things. When you try, you hope. When you do, you succeed.");
        englist.add("You need a plan to build a house. To build a life, it is even more important to have a plan or goal.");
        englist.add("Life is like a roller coaster it has its ups n downs.. Its our choice to scream or to enjoy the ride.");
        englist.add("It does not matter how many times you get knocked down, but how many times you get up.");
        englist.add("All birds find shelter during a rain, But Eagle avoids rain by flying above the Clouds, Problems are common, but attitude makes the difference.");
        englist.add("Tough times don't last, but tough people do.");
        englist.add("Nobody has a perfect life. Everybody has their own problems. Some people just know how to deal with them without revealing it.");
        englist.add("Life is about not knowing, having to change, taking the moment, and making the best of it without knowing what will happen next.");
        englist.add("Life doesn't hurt until you think about how much things have changed, who you've lost along the way, and how much of it was your fault.");
        englist.add("There is always a little more toothpaste in the tube. Think about it.");
        englist.add("Whether you Think you can, or think you can't your're always right.");
        englist.add("Life is too short for fake butter, fake cheese, or fake people.");
        englist.add("Life Is Never About The People Who Act Sincere In Front Of you.");
        englist.add("When I hear somebody sigh, Life is hard, I am always tempted to ask, Compared to what?");
        englist.add("God puts people in your life for a reason and removes them from your life for a better reason.");
        englist.add("There are only two ways to live your life. One is as though nothing is a miracle. The other is as though everything is a miracle.");
        englist.add("Life is too complicated, don't try to find answers Because, when you findanswers, life changes the questions!");
        englist.add("Whatever brings you down, will eventually make you stronger.");
        englist.add("Life is like making tea! Boil your ego, Evaporate your worries, Dilute your sorrows, Filter your mistakes & Get Taste of Happiness. :)");
        englist.add("Just don't give up trying to do what you really want to do. Where there's love and inspiration, I don't think you can go wrong.");
        englist.add("People change and things go wrong, but always remember, life goes on...");
        englist.add("For comfortable journey of life, just reduce the luggage of desires...:-)");
        englist.add("That awkward moment between birth and death is life.");
        englist.add("Every new day is another chance to change your life.");
        englist.add("Every tear is a sign of Onions!");
        englist.add("You'll never leave where you are until you decide where you'd rather be.");
        englist.add("I'm not interested in the PG-version of life.");
        englist.add("Cherish your yesterdays and dream your tomorrows, but most importantly, don't forget to live your today's.");
        englist.add("The tragedy of life is not that man loses, but that he almost wins.");
        englist.add("Never take life seriously. Nobody gets out alive anyways.");
        englist.add("For some moments in life there are no words.");
        englist.add("The worst mistakes in life are the ones you never learn from.");
        englist.add("Once in a while, right in the middle of an ordinary life, love gives us a fairy tale.");
        englist.add("Don't waste your life trying to get back what was taken away.");
        englist.add("If you can laugh when you are completely broken,then there can be nothing that can break you next time.");
        englist.add("There are so many people out there who will tell you that you can't ,,,What you've got to do is turn around and say watch me");
        englist.add("You don't need everything to enjoy life. You already have life to enjoy everything :) :)");
        englist.add("Don't think you are Nothing. Don't think you are Everything. But think you are Something. Who can achieve Anything !!");
        englist.add("Never forget yesterday, But always live for today... Cuz you never know what tomorrow can bring, Or what it can take away...");
        englist.add("Don't see others doing better than you, Beat your own records everyday because, Success is a fight between YOU & YOURSELF");
        englist.add("I don't want to get to the end of my life and find that I lived just the length of it. I want to have lived the width of it as well.");
        englist.add("Don't let the darkness of the past cover the brightness of the future.");
        englist.add("If your actions inspire others to dream more, learn more, do more and become more, you are a leader.");
        englist.add("Discouragement and failure are two of the surest stepping stones to success.");
        englist.add("Success is simple. Do what's right, the right way, at the right time.");
        englist.add("Life is like a coin, you can spend it anyway you want but you can only spend it once.");
        englist.add("Mistakes teach you important lessons, Everytime you encounter one, you've a step closer to your goal.");
        englist.add("Life isn't what you want it to be, it's what you make it become.");
        englist.add("Once you learn to be happy alone you won't tolerate anyone who can't make you just as happy.");
        englist.add("Experience is how life catches up with us and teaches us to love and forgive each other.");
        englist.add("If God brings you to it, He will bring you through it.");
        englist.add("Life is about laughing & living, in good & bad times. Getting through whatever comes our way & looking back & smiling.");
        englist.add("In life we all have an unspeakable secret, an irreversible regret, an unreachable dream and an unforgettable love");
        englist.add("Even if you're on the right track, you'll get run over if you just sit there.");
        englist.add("Half of life is ****ing up - the other half is dealing with it.");
        englist.add("The difference between ordinary and extraordinary is that little extra.");
        englist.add("Stop being afraid of what could go wrong and start being positive about what could go right.");
        englist.add("We live in a wonderful world that is full of beauty, charm, and adventure. There is no end to the adventures we can have if only we seek them with our eyes open.");
        englist.add("Age is a question of mind over matter. If you don't mind, it doesn't matter.");
        englist.add("Every Test In Life Makes Us Bitter Or Better. Every Prblm Comes To Make Us Or Break Us. Choice Is Ours, To Bcome Victim Or Victorious...");
        englist.add("Live like a candle which burns itself but gives light to others.");
        englist.add("There are so many people out there who will tell you that you can't... What you've got to do is turn around and say watch me");
        englist.add("Life is not about what I've done, what I should've done, what I could've done... it's about what I can do and what I will do.");
        englist.add("Sport and life is about losing. It's about understanding how to lose.");
        englist.add("At times I wish I could change the past... but sometimes the past changes you.");
        englist.add("Life is always up and down, so why are you worried when you are at the bottom; the next place is up.");
        englist.add("If there are no ups and down in your life It means you are dead.");
        englist.add("Without positive attitude, success is called Luck. But with positive attitude, success is called achievement.");
        englist.add("The worst part of life is waiting. The best part of life is having someone worth waiting for.");
        englist.add("When life is too crazy, and things are moving too fast, look to the constant stars... and remember, like them, our love can last.");
        englist.add("Heaven's not a place that you go when you die it's that moment in life when you actually feel alive.");
        englist.add("my life is like a football game- when i feel my life is going to get the goal some people kick me toward other goal and this way life goes on still finding the goal.");
        englist.add("You don't have to be great to start, but you have to start to be great.");
        englist.add("Life is a tragedy when seen in close-up, but a comedy in long shot.");
        englist.add("patience is not the ability to wait, but the ability to keep a good attitude while waiting.");
        englist.add("Every silence is a sin of zero balance!");
        englist.add("Life is a waste of time, time is a waste of life, so get wasted all of the time and have the time of your life.");
        englist.add("Do not give up, the beginning is always the hardest.");
        englist.add("Life doesn't give you what you want. It gives you what you work for.");
        englist.add("Life Is not A MP3 Player Where We Can enjoy Our favourite songs But Life Is Like A FM radio We Have to Learn to enjoy What Ever comes.");
        englist.add("Be thankful for hard times in your life. Try not to look at them as bad things, but as opportunities to grow and learn.");
        englist.add("You never fail until you stop trying.");
        englist.add("Life is like riding a bicycle. To keep your balance, you must keep moving.");
        englist.add("Life goes on......With or without you :-)");
        englist.add("Its the possibility of having a dream come true that makes life interesting.");
        englist.add("Forget past mistakes. Forget failures. Forget everything except what you're going to do now and do it.");
        englist.add("If you want your life to be meaningful go out and do something about it.");
        englist.add("The harder you fall, the higher you bounce.");
        englist.add("Life is like Adidas and Nike, Nothing is impossible so Just Do It");
        englist.add("Things may come to those who wait, but only the things left by those who hustle.");
        englist.add("Life is a matter of change is not a matter of choice.");
        englist.add("You are born without anything but You die with Your name. so that name must not be a word.. It must be a History..!");
        englist.add("Don't complain about your life when you are the one who is handling it.");
        englist.add("Success is the sum of small efforts, repeated day in and day out.");
        englist.add("All you need to change is will.");
        englist.add("SUCCESS belongs only to those who are willing to work harder than anyone else.");
        englist.add("Sorrow is a fruit; God does not allow it to grow on a branch that is too weak to bear it.");
        englist.add("The worst part of life is that you do not know what is coming up next :(");
        englist.add("Life has got to be lived - that's all there is to it.");
        englist.add("Everyone has a will to win but very few have the will to prepare to win.");
        englist.add("Ever wonder how your life would be right now if you had the power to go back and change even just one small thing?");
        englist.add("Life is Rough so be Tough.");
        englist.add("The times in life, that seems to be the worst, always turn out for the best!");
        englist.add("There are no mistakes in life, only lessons.");
        englist.add("Sometimes you don't realize your own strengths until someone tries to take advantage of your weaknesses !!!");
        englist.add("Life is full of surprises, but you have to open them hoping for the very best.");
        englist.add("You have to pay the price. You will find that everything in life has a price, and you will have to decide whether the price is worth the prize.");
        englist.add("Stone is broken with the last stroke of hammer. This doesn't mean that 1st stroke was useless. Success is the result of continuous efforts.");
        englist.add("Life isn't supposed to make you feel happy. It isn't meant to make you feel sad either. It's just there to make you feel.");
        englist.add("Pearls don't lie on the sea shore. If you want one, you must dive for it.");
        englist.add("The greatest risk in life is not taking one.");
        englist.add("It's A Golden Jar To Collect Sweet Moments of Ur Life !");
        englist.add("Just hit play and watch my life fall apart.");
        englist.add("Every smile is a sign of daily brushing!");
        englist.add("Some people pass through our lives in a shorter time frame than we had hoped to teach us things they never could have taught if they stayed.");
        englist.add("Life is like a chocolate box, Each chocolate is like a portion of life, Some are crunchy, some are nutty, Some are soft, but all are DELICIOUS.");
        englist.add("Life is 10% what happens to me and 90% of how I react to it.");
        englist.add("Problems are with every one, it is on us to become the victim or overcome the situation and become successful.");
        englist.add("Life is simple! Don't make it complex!");
        englist.add("Motivation is what gets you started. Habit is what keeps you going.");
        englist.add("Sometimes it's the smallest decisions that can change your life forever.");
        englist.add("One day your entire life will flash in front of your eyes. Make sure it is worth watching");
        englist.add("To be what we are, and to become what we are capable of becoming, is the only end of life.");
        englist.add("Heart is not a Dust Bin To Dump all The Worries of Ur Life!");
        englist.add("When life locks you in your room, simply go out the window.");
        englist.add("The sun is somewhere shining even when it rains.");
        englist.add("Enjoy Every Moment You Have.. Because In Life, There Are No Rewinds...");
        englist.add("It doesn't matter how many times you fall, what counts is how many times you stand up again.");
        englist.add("Opportunity dances with those who are already on the dance floor.");
        englist.add("Unplanned moments are always better than planned ones.");
        englist.add("Sometimes, no matter how much faith we have, we lose people. But you never forget them. And sometimes, it's those memories that give us the strength to go on.");
        englist.add("If you're not doing the things that you love, then your life is not worth living. What are you here for?");
        englist.add("Patience is not the ability to wait, but the ability to keep a good attitude while waiting");
        englist.add("Life isn't fair. It's just fairer than death, that's all.");
        englist.add("Just because your life isn't like what you want it to be, doesn't mean you can't enjoy it.");
        englist.add("If people knew how hard I had to work to gain my mastery, it wouldn't seem wonderful at all.");
        englist.add("If you can laugh when you are completely broken,then there can be nothing that can break you next time");
        englist.add("If you don't go after what you want, you will never have it. If you don't ask the answer is always NO. IF you don't step forward you are always in the same place.");
        englist.add("Life ends when you stop dreaming, hope ends when you stop believing and love ends when you stop caring. So dream hope and love ...Makes Life Beautiful");
        englist.add("If it happens, God lets it happen, and when we say, I don't understand, God replies, I don't care.");
        englist.add("The journey in between what you once were and who you are now becoming is where the dance of life really takes place.");
        englist.add("From this point on in my life nothing is ever going to be the same. Nothing can ever be the same. I don't want anything to ever be the same.");
        englist.add("You only live once, so do everything twice.");
        englist.add("Decision defines destiny..");
        englist.add("Defeat is not defeat unless accepted as a reality-in your own mind.");
        englist.add("Everything you want is out there waiting for you to ask. Everything you want also wants you. But you have to take action to get it.");
        englist.add("Its Always About The People Who Remain Sincere Behind your Back...!!!");
        englist.add("Rock bottom is good solid ground, and a dead end street is just a place to turn around.");
        englist.add("Life is like GRAMMAR : PAST-PERFECT, FUTURE-CONTINUOUS, & PRESENT-TENSED !!");
        englist.add("I have promised to live my life as a revolution and not just a process of evolution.");
        englist.add("We spend most of our lives conjugating three verbs: to want, to have, and to do.");
        englist.add("Life isn't about waiting for the storm to pass... It is all about dancing in the rain!");
        englist.add("People know you for what you've done, not for what you plan to do.");
        englist.add("Life is what you make of it. Always has been, always will be.");
        englist.add("Life comes without guarantees except... Laughing will brighten your day, smiling will enhance your eyes, and falling in love will change your life.");
        englist.add("Great things never come from comfort zones.");
        englist.add("Life is not measured by the breaths you take, but by its breathtaking moments.");
        englist.add("Be bold to own your mistakes in Life, accept your faults and improve your personality.");
        englist.add("Never, never, never, never give up.");
        englist.add("Life has no limitations, except the ones you make.");
        englist.add("Oh life!! You are so beautiful, a bit complicated but still beautiful!");
        englist.add("It takes both rain and sunshine to make a rainbow.");
        englist.add("Every story has an end, but in life every ending is just a new beginning.");
        englist.add("Past 'tense'. Present 'tense'. Future 'tense'. and they say life is easy.");
        englist.add("If you don't go after what you want, you will never have it.");
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