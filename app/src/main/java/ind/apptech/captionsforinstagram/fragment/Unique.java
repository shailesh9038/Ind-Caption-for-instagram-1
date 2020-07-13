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

public class Unique extends Fragment {

    RecyclerView rajputlist;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    private RecyclerView.LayoutManager layoutManager;
    LinearLayout Net_connection;

    public Unique() {
        // Required empty public constructor
    }

    public static Unique newInstance(String param1, String param2) {
        Unique fragment = new Unique();
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

        englist.add("It is almost impossible to smile on the outside without feeling better on the inside.");
        englist.add("We always need that wake-up call that reminds us of who we really are and what we really want from our lives.");
        englist.add("It looks like you need a man in your life. How about me?");
        englist.add("When you say YES to others, make sure you are not saying NO to yourself.");
        englist.add("Sometimes people don't notice the things others do for them until they stop doing them.");
        englist.add("Life is short. Don’t waste it being angry or sad. Be happy and enjoy the time you spend with your loves ones.");
        englist.add("No matter how stronger person you are, there’s still someone who can make you weak.");
        englist.add("I think that the only reason people hold onto memories so tight is because memories are the only things that dont change; when everybody else does.");
        englist.add("I love you not because of who you are, but because of who I am when I am with you.");
        englist.add("I have a new theory in life...what other people think of me is truly none of my business!...");
        englist.add("Sometimes a stranger becomes close one’s and our close one’s becomes stranger.");
        englist.add("You can’t be happy unless you are unhappy sometimes.");
        englist.add("My strength did not come from lifting weights. My strength came from lifting myself up when I was knocked down.");
        englist.add("The only things in life you regret, are the risks that you didn’t take.");
        englist.add("People think being alone makes you lonely. I don’t think thats true. Being surrounded by the wrong people is the loneliest thing in the world.");
        englist.add("Worry about your character and not your reputation, because your character is who you are, and your reputation is only what people think of you.");
        englist.add("Excellence is not a skill. It is an attitude.");
        englist.add("People know you for what you've done, not for what you plan to do.");
        englist.add("Sometimes, The Wrong Choices Take Us To The Right Places.");
        englist.add("Love is what makes you smile when you're tired.");
        englist.add("Everyone you will ever meet knows something you don’t.");
        englist.add("Some time's your memories can be your best dreams or your worse Nightmares.");
        englist.add("I think I can die happy now, cause I’ve just seen a piece of Heaven.");
        englist.add("Hard work beats talent when talent fails to work hard.");
        englist.add("As soon as you trust yourself, you will know how to live.");
        englist.add("I wonder how many times we forgive just because we dont want to lose someone. Even if they dont deserve forgiveness.");
        englist.add("A relationship is like standing on wet cement. The longer you stand, the more difficult is to leave.");
        englist.add("Miracles start to happen when you give as much energy to your dreams as you do to your fears.");
        englist.add("I am incharge of how I feel and today I’m choosing happiness.");
        englist.add("When you absolutely believe in yourself and your ability to succeed, nothing will stop you.");
        englist.add("Relationships are more important than Ego.");
        englist.add("You may not love me like I love you,You may not care for me like I care for you But if you ever need me, I will always be around for you.");
        englist.add("Every single thing that has ever happened in your life is preparing you for a moment that is yet to come.");
        englist.add("Love is cute when it's new, but love is most beautiful when it lasts.");
        englist.add("Hey YOU, Yes the one reading this. I just wanted to wish you good health and happiness and thank you for being a part of my life.");
        englist.add("There is no elevator to success. You have to take the stairs.");
        englist.add("The language of friendship is not words but meanings.");
        englist.add("Move on. It’s just a chapter in the past. But don’t close the book, just turn the page.");
        englist.add("Don’t fall for his words, fall for his actions.");
        englist.add("Attempting to care. loading…..loading…..error, failed to care.");
        englist.add("Sometimes the person who made you stronger, is also your greatest weakness.");
        englist.add("A deep relation is not valued by the number of days of meeting. Its valued by the number of seconds of beating of heart with desire to meet.");
        englist.add("If you lower your expectations, you limit your disappointment.");
        englist.add("Love is master key that is capable of opening a gate of happiness.");
        englist.add("Wrong is wrong even if everyone is doing it. Right is right even if no one is doing it.");
        englist.add("Promises mean everything but after they are broken, sorry means nothing.");
        englist.add("You just have to learn to forget about the people, who forgot about you.");
        englist.add("Well Done Is Better Than Well Said...");
        englist.add("Never let your memories be greater than your dreams.");
        englist.add("Dear homework, you are unattractive, there for, I cannot do you.");
        englist.add("When someone tells you, 'You've changed,' it might simply be because you've stopped living your life their way.");
        englist.add("I need the star shine of your heavenly eyes, After the day's great sun.");
        englist.add("A most important lesson taught by nature. Only after destruction there is construction. Only on letting go will new opportunities crop up.");
        englist.add("Stop cheating on your future with your past. It’s over.");
        englist.add("Everyone is beautiful in their own way because God makes no mistakes.");
        englist.add("Many people have caught my eye but only you have caught my heart.");
        englist.add("Don’t ever regret the things you did wrong. Regret the good things you did to the wrong people.");
        englist.add("I wish I could explain to you how I feel, B’coz everynight before I go to bed, you are all I think about.");
        englist.add("Whenever you find whole world against you just turn around and lead the world.");
        englist.add("People with the greatest advice usually have the most problems.");
        englist.add("Treat your parents with loving care. You will only know their value when you see their empty chair.");
        englist.add("It’s time now to let go of the past and embrace all that awaits you!");
        englist.add("It’s funny how people say they miss you, but don’t even make an effort to see you.");
        englist.add("Without Her Permission I Will Touch Her Only To Wipe Her Tears..! That Is True Love..!");
        englist.add("We find out how strong we really are, not when things are going well, but when they are not.");
        englist.add("My attitude will always be based on how you treat me.");
        englist.add("Life is like Facebook. People will like your problems & comment on them but no one’s gonna solve them because everyone is busy in updating their.");
        englist.add("GOD has something better for me. I just have to wait.");
        englist.add("When you are happy, you enjoy the music but when you are sad, you understand the lyrics.");
        englist.add("Loneliness and the feeling of being unwanted is the most terrible poverty.");
        englist.add("If you are not millionaire, don’t have fancy car and don’t travel alot but you found real love and she loves you too, YOU ARE LUCKY.");
        englist.add("I wake up everyday with a smile b’coz I know I have something to be thankful for.");
        englist.add("In every religion there is Love, yet Love has no religion.");
        englist.add("Half of our mistakes in life arises from feeling where we ought to think, and thinking where we ought to feel.");
        englist.add("Make Environment Friendly, Remove Plastic Smiles...");
        englist.add("Knowing that you are loved by someone is the best feeling you could ever have.");
        englist.add("A friend is one of the nicest things you can have, and one of the best things you can be.");
        englist.add("You can fix your future, but you can’t change the past, so make the most love because it won’t always last.");
        englist.add("To steal ideas from one person is plagiarism. To steal from many is research.");
        englist.add("Sometimes letting go of the person isn’t enough, sometimes you have to let go of your memories with them too.");
        englist.add("Stay Faithful or Stay SINGLE!");
        englist.add("Follow your heart but take your brain with you.");
        englist.add("Sometimes, all i need is for you to be there. but even then, you still disappoint me.");
        englist.add("We all live under the same sky but we don’t all see the same light.");
        englist.add("There are some people who will not stay in our life but will always be in our heart.");
        englist.add("You know you're in love when you can't fall asleep because reality is finally better than your dreams.");
        englist.add("Never lie to someone who trusts you and never trust someone who lies to you.");
        englist.add("No matter how strong of a person you are, there's always someone who can make you weak.");
        englist.add("A friend knows the song in my heart and sings it to me when my memory fails..");
        englist.add("A good friend can tell you what is the matter with you in a minute. He may not seem such a good friend after telling.");
        englist.add("The only people I need in life are those that really care, Not the ones that use you and treat you unfair.");
        englist.add("Appreciate those who love you, help those who need you, forgive those who hurt you, forget those who leave you.");
        englist.add("I’m going to smile like nothing’s wrong, talk like everything’s perfect, act like it’s all a dream and pretend it’s not hurting me.");
        englist.add("It doesn’t matter what you look like on the outside. It’s what’s on the inside that counts.");
        englist.add("Love is a form of amnesia when a girl forgets there are 1.2 billion other boys in the world.");
        englist.add("Im done with tears. Im wiping my eyes. If he doesnt care then why the hell should I?");
        englist.add("Once in a while right in the middle of an ordinary life, love gives us a fairytale.");
        englist.add("Sometimes we do everything right but still lose.");
        englist.add("Never expect things to happen. It’s better to feel surprised than to feel disappointed.");
        englist.add("I don’t care what ppl say anymore I’ll do what i want too.");
        englist.add("A friend is someone who gives you total freedom to be yourself.");
        englist.add("The best makeup is your smile. There is no beauty like the one that comes from inside of you.");
        englist.add("Friendship isn't a big thing - it's a million little things.");
        englist.add("When the rich make war it is the poor that die.");
        englist.add("Take care of your thoughts when you are alone, and take care of your words when you are with peoples.");
        englist.add("We have all got that one friend who eats twice as much as you do but never seems to gain any weight.");
        englist.add("The more you like yourself the less you are like anyone else, which makes you unique.");
        englist.add("Sometimes, its not what you say that matters, its what you don’t.");
        englist.add("When love is not madness, it is not love.");
        englist.add("By now i believe i have ran out of words to say.");
        englist.add("Sometimes people come into your life not to love you but to make you feel that you are worth loving.");
        englist.add("Do not pray for an easy life, pray for the strength to endure a difficult one.");
        englist.add("Time has a wonderful way of showing us what really matters.");
        englist.add("Don't fall for his words, fall for his actions.");
        englist.add("I’m the type of boy who could fall in love with any girl because I love with my heart, not my eyes.");
        englist.add("Remember: A pretty face does not mean a pretty heart.");
        englist.add("Be careful who you open up to. Only a few people actually care, the rest just want to have something to gossip about.");
        englist.add("Friendship is always a sweet responsibility, never an opportunity.");
        englist.add("True love is rare, and its the only thing that gives life real meaning.");
        englist.add("Smile. It irritates those who wish to destroy you");
        englist.add("Confidence is beautiful. No matter your size, no matter your weight. Be confident in who you are and you’ll be beautiful.");
        englist.add("There is never a time or place for true love. It happens accidentally, in a heartbeat, in a single flashing, throbbing moment.");
        englist.add("Success is simple. Do what's right, the right way, at the right time.");
        englist.add("GOD has a bigger plan for me than I have for myself.");
        englist.add("You can’t live your life for other people; you have gotta to do what’s right for you, even if it hurts the people you love.");
        englist.add("Don’t rush things. Anything worth having is worth waiting for.");
        englist.add("They say you only fall in love once, but that can't be true... Every time I look at you, I fall in love all over again.");
        englist.add("Real love is knowing someone’s weaknesses and not taking advantage of them. Knowing their flaws & accepting who they are.");
        englist.add("Ice melts when Heated, Eyes melts when Cheated.");
        englist.add("GOD has perfect timing, never early, never late. It takes a little patience and it takes a lot of faith. but it’s worth the wait.");
        englist.add("Everyone is someone's dream and you were mine.");
        englist.add("Doing nothing is very hard to do, you never know when you're finished.");
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