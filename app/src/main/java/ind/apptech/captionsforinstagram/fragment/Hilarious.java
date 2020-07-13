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

public class Hilarious extends Fragment {

    RecyclerView rajputlist;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Hilarious() {
        // Required empty public constructor
    }

    public static Hilarious newInstance(String param1, String param2) {
        Hilarious fragment = new Hilarious();
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

        englist.add("We always ignore the ones who adore us and adore the ones who ignore us.");
        englist.add("If you dont build your dreams, someone will hire you to build theirs.");
        englist.add("The only people I need in my life are the ones who need me in theirs even when I have nothing else to offer them but myself.");
        englist.add("Disappointments are just God’s way of saying “I’ve got something better.” Be patient, live life, have faith.");
        englist.add("Whenever you don’t understand what’s happening in your life, just close your eyes, take a deep breath and say… GOD I know it is your plan, just help me through it.");
        englist.add("Today I will do what others won’t, so tomorrow I can do what others can’t.");
        englist.add("You can close your eyes to the things you don’t want to see, but you can’t close your heart to the things you don’t want to feel.");
        englist.add("Love is when you look into someones eyes and see everything you need.");
        englist.add("Relationship is like standing on wet cement. The longer you stand the more difficult is to leave & even if you leave, you leave your footprints behind.");
        englist.add("Adjustment with right people is always better than argument with wrong ones.");
        englist.add("If you want to be successful you must respect one rule, never let failure take control of you.");
        englist.add("You don’t get to choose when or who you meet, but you do get to choose who you hold on to.");
        englist.add("You can learn so much from your mistakes. So don’t regret them learn from them.");
        englist.add("Yes, I know how to shut up. I just don’t know when.");
        englist.add("Go for someone whose not only proud and glad to have you, but will also take every risk and effort just to be with you.");
        englist.add("Relationship with GOD is the best relationship you can have. Trust him and everything will turn out fine.");
        englist.add("When they ask me what I liked best, I`ll tell them it was you.");
        englist.add("Remember that your greatest talent is so much more powerful than your biggest fear.");
        englist.add("The past is your lesson. The present is your gift. The future is your motivation.");
        englist.add("I wouldn’t say you’re stupid. You are, but I wouldn’t say it.");
        englist.add("Smile, it’s the second best thing you can do with your lips.");
        englist.add("The one who falls and gets up is much stronger than the one who never fell.");
        englist.add("If you want to fly with eagles than stop swimming with ducks.");
        englist.add("Don’t loose hope. You don’t know what tomorrow brings.");
        englist.add("No one notices your tears, no one notices your sadness, no one notices your pain but they all notice your mistakes.");
        englist.add("One of the biggest flaws of people are pretending to be blind to their own mistakes but do not pretend deaf towards the mistakes of others.");
        englist.add("Relationship is not holding hands while you understand eachother. Its about having lots of misunderstandings & still not leaving each other’s hand.");
        englist.add("Stop letting people who do so little for you control so much of your mind, feelings and emotions.");
        englist.add("Trust me, when I woke up today I had no plans to be awesome. It just happens.");
        englist.add("Be the one who everyone wants, not the one who everyone’s had.");
        englist.add("I have learned that sometimes sorry is not enough. Sometimes you actually have to change.");
        englist.add("When I tell you “I love you” I don’t say it as a habit. I say it to remind you that you are the best thing that’s ever happened to me.");
        englist.add("When I like someone, I compare their last name with my first name.");
        englist.add("It hurts when someone you really trust lets you down.");
        englist.add("I’m not looking for someone who has everything but someone who has time to spend with me more than anything.");
        englist.add("Everybody has gone through something that has changed them in a way that they could never go back to the person they once were.");
        englist.add("Life can be happier & stress free if we have all that we desire. But time will give us all that we deserve.");
        englist.add("Race can not be won by accelerating on top gear but It can be won only by changing the right gear on right time.");
        englist.add("Never regret a single moment of the journey. If it wasn’t your destination, it was preparation.");
        englist.add("I thinks my neighbor just caught me stealing his Wifi internet.");
        englist.add("Never compare your journey with someone else’s. Your journey is your journey not a competition.");
        englist.add("When someone rings the doorbell, why do dogs always assume it’s for them?");
        englist.add("Live in such a way, that if someone spoke badly of you, no one would believe it.");
        englist.add("Heart is the greatest cheater in this world because it makes thousands of different excuses to stay in touch with the person you love.");
        englist.add("Sometimes we need someone to simply be there. Not to fix anything or do anything in particular, but just to let us feel we are supported and cared about.");
        englist.add("If you keep your eyes, mind, and heart open…love, kindness, intelligence and wisdom will enter.");
        englist.add("When I close my eyes, I see you. When I open my eyes, I miss you.");
        englist.add("Sometimes it’s not the song that makes you emotional, It’s the people & things that come to your mind when you hear it .");
        englist.add("The best nicknames are the ones people don’t know they have.");
        englist.add("People wait until they have enough time to do what they dream. It is 99% sure it will still be a dream at the end of the life.");
        englist.add("When someone says they have a question to ask, you think of all the bad things you have done recently.");
        englist.add("Sometimes the most important life lessons are the ones we end up learning the hard way.");
        englist.add("Smiling does make it a little bit better.");
        englist.add("I know GOD has bigger & better plans for me than I have for myself.");
        englist.add("The best thing about being me, I’m a limited edition…there are no other copies!");
        englist.add("The longest you hide your feelings for someone, the more you fall for them.");
        englist.add("Many people have told me that I have changed but the truth is I think I’ve just found myself.");
        englist.add("WHY Worry? If you have done the very best you can, worrying won’t make it any better.");
        englist.add("You`ve got two choices; you can either sit and cry, or spread your wings and fly.");
        englist.add("Be happy. Not because everything is good, but because you can see the good side of everything.");
        englist.add("Making me happy doesn’t require a lot of effort. Actually your presence is just enough.");
        englist.add("Failure is only a temporary change in direction to set you straight for your next success. Only those who dare to fail greatly can ever achieve greatly.");
        englist.add("Why is a newspaper ten times more interesting when somebody across the table is reading it?");
        englist.add("It doesn’t matter how nice you are, as soon as you leave the room there’s always going to be someone who talk about you.");
        englist.add("It’s not being in love that makes me happy. It’s being in love with you that makes me happy.");
        englist.add("everyone calls you by your name, but only one person can make it sound special.");
        englist.add("I don’t know why people are more interested in other people’s life than their own.");
        englist.add("Take my advice, I don’t use it anyway.");
        englist.add("10% of conflict is due to difference of opinion. 90% is due to the wrong tone of voice.");
        englist.add("Sometimes, life gives you a second chance because just maybe the first time you were not ready.");
        englist.add("I love my relationship with my bed. No commitment needed. We just sleep together every night.");
        englist.add("I wonder how many people I have looked at all my life and never seen.");
        englist.add("Nobody has a perfect life. Everybody has problems. Some people just know how to deal with it in a best way.");
        englist.add("People say: never expect anything in return from anyone but the truth is when we really LOVE someone, we naturally EXPECT a little care from them.");
        englist.add("It isn’t the size of the gift that matters, but the size of the heart that gives it.");
        englist.add("If you see a guy opening a car door for a girl, it’s one of two things, either a new girl, or a new car!");
        englist.add("The secret to success is to start from scratch and keep scratching.");
        englist.add("Best friends listen to what you don’t say..");
        englist.add("When GOD pushes you to the edge of difficulty trust him fully because two things can happen. Either he will catch you when you fall, or he will teach you how to fly.");
        englist.add("There are far better things ahead than any we leave behind.");
        englist.add("Dear God, thanks for everything. Because without you …… I am nothing.");
        englist.add("Don’t change your originality for the sake of others b’coz no one else can play your role better than you.");
        englist.add("Bad attitude is like a flat tyre. You can’t reach anywhere until you change it.");
        englist.add("Save me, I’m drowning in a sea of love!");
        englist.add("Life is like a roll of toilet paper. The closer you get to the end the faster it goes.");
        englist.add("That awkward moment when you think someone is talking to you, but they are actually talking on the phone.");
        englist.add("Everything will change and it is going to be beautiful and better then ever before.");
        englist.add("Don’t feel bad if someone rejects you, People usually reject expensive things because they can’t afford them.");
        englist.add("Every rule has an exception, especially this one.");
        englist.add("Distance should not be a factor in a relationship but communication, trust and commitment should be.");
        englist.add("It is not length of life, but depth of life. Everybody dies, but not everybody lives.");
        englist.add("In 2013 I’m going to sit back, watch the movie 2012 and laugh..");
        englist.add("Being single is a good feeling, no drama and no heartaches. But sometimes it gets lonely and you miss that feeling of being taken.");
        englist.add("You can’t always control who walks into your life but you can control which window to throw them out.");
        englist.add("My phone is like my lover. It’s the first thing I see in the morning and the last thing I see at night.");
        englist.add("slept like a baby last night…. Waking up every 3 hours crying for food.");
        englist.add("Don’t waste your time with explainations. People only hear what they want to hear.");
        englist.add("I don’t care how many people are in the world BUT I only want you.");
        englist.add("If you love someone, show them. Because you could soon find yourself watching them walk out the door. Words mean nothing but actions mean everything");
        englist.add("A train station is where the train stops. A bus station is where the bus stops. On my desk, I have a work station..");
        englist.add("May be it’s true, may be we dont know what we have untill we have lost it. But may be it’s also true that we don’t know what we are missing until we find it.");
        englist.add("Never say good-bye because good-bye means going away, and going away means forgetting.");
        englist.add("Good Time + Crazy Friends = Amazing Memories");
        englist.add("Press the star below and watch it glow..");
        englist.add("Hurt me with the TRUTH but never comfort me with a LIE.");
        englist.add("Dance like no one’s going to put it on youtube.");
        englist.add("Strong people stand up for themselves. Strogner people stand up for others.");
        englist.add("There are two ways to get everyone to hate you. Either do something wrong or do something really right.");
        englist.add("There are moments in life when you miss someone so much that you just want to pick them from your dreams and hug them for real.");
        englist.add("War doesn’t determine who’s right, it determines who’s left.");
        englist.add("They ignore you now, but they will need you later.");
        englist.add("Everybody says, mistake is the first step of success but the real fact is correction of mistake is the first step of success.");
        englist.add("When we are no longer able to change a situation, we are challenged to change ourselves.");
        englist.add("Rumors are like fires. No one admits to starting them and before you know it, they`re out of control.");
        englist.add("Everyone has that one little secret, that no one, not even your best friend, know about you.");
        englist.add("If you are giving your all to one person and it’s not enough, you are giving it to the wrong person.");
        englist.add("Relations are like electric currents. Wrong connection will give you shocks throughout your life but the right ones light up your life.");
        englist.add("At the end of each day be grateful for another day of life and for the next one on its way.");
        englist.add("Now a days people know the price of everything and the value of nothing.");
        englist.add("When you think you have no chance of getting what you want, you probably won’t get it, but if you believe in yourself, probably, sooner or later, you will get it.");
        englist.add("People tellin me I changed, that’s exactly what I’m gettin so I’ll never be the same.");
        englist.add("The most elastic element of the world is TIME; It maximizes the minutes when we are missing someone special and minimises the hours when we are with someone special.");
        englist.add("In reality, no one cares, they’re just curious.");
        englist.add("Sometimes the strongest people in the morning are the people who cried all night.");
        englist.add("God give me strength to accept the things I can’t change, the courage to change the things I can, and the wisdom to know the difference.");
        englist.add("I don’t know how people can fake whole relationships.. I can’t even fake a hello to somebody I don’t like.");
        englist.add("Don’t worry about people that are in your past, there’s a reason why they didn’t make it to your future.");
        englist.add("Winners don’t do different things, they do things differently.");
        englist.add("The only people worthy to be in your life are the ones that help you through the hard times and laugh with you after the hard times pass.");
        englist.add("If you don’t hope, you will not find what is beyond your hopes.");
        englist.add("Chocolate makes everything better. Except obesity");
        englist.add("Only difference between good day and a bad day is your attitude.");
        englist.add("When you fall in love with someone’s personality, everything about that person tends to become beautiful.");
        englist.add("Once they stop talking to you, they start talking about you.");
        englist.add("If at first you don’t succeed, redefine success.");
        englist.add("A good understanding comes only after a long war between two hearts.");
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