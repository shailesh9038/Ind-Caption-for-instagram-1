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

public class Angry_fragment extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Angry_fragment() {
        // Required empty public constructor
    }

    public static Angry_fragment newInstance(String param1, String param2) {
        Angry_fragment fragment = new Angry_fragment();
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

        englist.add("Anger is a condition in which the tongue works faster than the mind.");
        englist.add("Don’t make promises when you’re happy. Don’t reply when you’re angry. Don’t make decisions when you’re sad. Don’t text when your drunk.");
        englist.add("I don’t regret my past. I just regret the time I have wasted with the wrong people.");
        englist.add("Anger is temporary madness.");
        englist.add("Only Two People will tell you the truth about yourself : someone who is angry with you and someone who loves you.");
        englist.add("Silence is the best way to react while angry.");
        englist.add("Go ahead, judge me. Just remember to be perfect for the rest of your life!!");
        englist.add("That annoying moment when you show someone a picture on your phone, and they start scrolling through the rest.");
        englist.add("Anger repressed can poison a relationship as surely as the cruelest words.");
        englist.add("Don't try to please other people if in the end, you know it wont work.");
        englist.add("When you stopped believing in me, I did too.");
        englist.add("Don't put words into my mouth. I have got plenty to say. Don't tell me how to live my life, I do things my way.");
        englist.add("I just don’t care if anyone doesn’t like me I wasn’t put on earth to entertain everyone.");
        englist.add("Knows there’s a name for people like you.");
        englist.add("Don't get mad - Just get even.");
        englist.add("When we don’t know who to hate, we hate ourselves.");
        englist.add("A moment of patience in a moment of anger saves a thousand moments of regret.");
        englist.add("Depression is merely anger without enthusiasm.");
        englist.add("Some people will pretend to care just so they can get a better seat to watch your struggle. Every helping hand is not always there to help.");
        englist.add("Don’t be so happy, I don’t really forgive people, I just pretend like it’s ok and wait for my turn to destroy them.");
        englist.add("All angry persons are to be treated, by the prudent, as children.");
        englist.add("Everyone has the right to be angry but that doesn't give them the right to be cruel.");
        englist.add("Don't be so happy, I don't really forgive people, I just pretend like it's OK and wait for my turn to destroy them.");
        englist.add("I’m gonna come back as a bird in my next life. There are just some people who I feel deserve a little of their own medicine.");
        englist.add("My life, My choices, My problems, My mistakes, My lessons. Not your business, mind your own problems before you talk about mine.");
        englist.add("Anger is an acid that can do more harm to the vessel in which it is stored than to anything on which it is poured.");
        englist.add("You have a problem with me. I’m pretty sure a status on Facebook won’t fix it..");
        englist.add("You should have two Facebook accounts. One for each face.");
        englist.add("An angry man opens his mouth and shuts his eyes.");
        englist.add("Bullshit might get you to the top, but it won’t keep you there.");
        englist.add("Sometimes you just wanna give people a high five to the face.");
        englist.add("Actions speak louder than words, your words don’t mean anything to me when your actions are telling me different.");
        englist.add("While you’re hating your life just because you can’t get what you want, someone is praying to have a life like yours.");
        englist.add("A fool gives full vent to his anger, but a wise man keeps himself under control.");
        englist.add("You can't make someone love you. you can only stalk them and hope for the best. :P");
        englist.add("ANGER is an acid that does more harm to the vessel in which it is stored, that to anything on which it is poured.");
        englist.add("Anger blows out the lamp of the mind.");
        englist.add("Is singing ‘if you’re angry & you know it punch their face’");
        englist.add("You can't trust anybody these days.. you think you have a good friend till you turn around and realize they have the knife 6 inches deep in your back.");
        englist.add("I'm the person that the more you complain about me, the harder I'll try to annoy you.");
        englist.add("It’s funny how you can still love a person, but you stop needing them like you used to.");
        englist.add("The more I get to know guys, the more I like dogs.");
        englist.add("I don't have a short temper I just have a low tolerance for stupidity, immaturity and ignorance.");
        englist.add("A man is about as big as the things that make him angry.");
        englist.add("Don't make so many promises when you can't even keep one.");
        englist.add("Sometimes one middle finger isn't enough to let someone know how you feel. That's why you have two hands.");
        englist.add("When you are angry, your text speed increases by a ridiculous amount.");
        englist.add("Beware, I'm not in my greatest mood today.");
        englist.add("It takes a lot of energy to get angry. I don’t care to use my energy that way.");
        englist.add("Never do anything when you are in a temper, for you will do everything wrong.");
        englist.add("Anger is a great force. If you control it, it can be transmuted into a power which can move the whole world.");
        englist.add("There is no excuse for cheating in a relationship.");
        englist.add("Do you ever get the feeling that you would like to reach out and just choke someone?");
        englist.add("Never forget what someone says to you when they are angry, because that's when the truth comes out.");
        englist.add("Whatever is begun in anger ends in shame.");
        englist.add("My silence doesn't mean that I quit.. It simply means that I don't want to argue with people who just don't want to understand!");
        englist.add("You think that you have damaged me but really you just made me that much more stronger Thank You");
        englist.add("You have a problem with me. I'm pretty sure a status on Facebook won't fix it.");
        englist.add("I told you I needed you, you told me the same. I wasn’t lying, so why didn’t you tell the truth?");
        englist.add("Sometimes one middle finger isn’t enough to let someone know how you feel. That’s why you have two hands.");
        englist.add("Sometimes I'm not angry, I'm hurt and there's a big difference.");
        englist.add("If you think your opinion of me has any effect, Honey let me assure you that none of my self worth is wrapped up in what you think of me.");
        englist.add("Is singing, if you're angry and you know it punch their face...");
        englist.add("Some things can never be forgotten and nor forgiven.");
        englist.add("Stop being so negative, go see a psychiatrist or something facebook is for happy people.");
        englist.add("Second chances are only meant for those who learned from the first time.");
        englist.add("By God, there’s a lot to make you angry.");
        englist.add("Telling someone to calm down just makes them so much more angry.");
        englist.add("There are no words to describe the anger and frustration that I am feeling right now.");
        englist.add("The embarrassment after the anger is biggest humiliation a person can experience.");
        englist.add("Anger always comes from frustrated expectations.");
        englist.add("Angry? Take a deep breath before you speak, because your mouth acts quicker than your brain.");
        englist.add("Two things to remember, DON'T make decisions when you're angry and DON'T make promises when you're happy.");
        englist.add("I don’t need to manage my anger, people need to manage their stupidity.");
        englist.add("The strong man is not the good wrestler, the strong man is only the one who controls himself when he is angry.");
        englist.add("Never forget what someone says to you when they are angry, bcoz that’s when the truth comes out.");
        englist.add("Anger is short lived madness.");
        englist.add("My silence doesn’t mean that I quit… It simply means that I don’t want to argue with people who just don’t want to understand..");
        englist.add("Don’t make so many promises when you can’t even keep one.");
        englist.add("Anger as soon as fed is dead, 'Tis starving makes it fat'.");
        englist.add("Don’t put words into my mouth. I have got plenty to say. Don’t tell me how to live my life, I do things my way.");
        englist.add("My silence doesn't mean that I quit.. It simply means that I don't want to argue with people who just don't want to understand.");
        englist.add("It is impossible for you to be angry and laugh at the same time. Anger and laughter are mutually exclusive and you have the power to choose either.");
        englist.add("It's better to cry than to be angry because anger hurts others, while tears flow silently through the soul and cleanness the heart.");
        englist.add("Never go to bed angry, stay awake and plot your revenge!");
        englist.add("Do not teach your children never to be angry, teach them how to be angry.");
        englist.add("Anger is a feeling that makes your mouth work faster than your mind.");
        englist.add("Anger is only one letter short of Danger.");
        englist.add("When I truly care for someone, their mistakes never change my feelings because its mind that gets angry but heart sill cares.");
        englist.add("Anger at lies lasts forever. Anger at truth can't last.");
        englist.add("To be angry is to let others mistakes punish yourself. To forgive others is to be good to yourself.");
        englist.add("When you ask someone if you over reacted, then that's your heart telling your mind that it was a stupid decision.");
        englist.add("Two things a man should never be angry at...What he can help... and what he cannot help.");
        englist.add("If you are patient in one moment of anger, you will escape a hundred days of sorrow.");
        englist.add("I will not delete you or block you. I am keeping you there so you will be able to see how happy I'm without you.");
        englist.add("Ive tried and tried and now I give up. I refuse to be the perfect friend to people that cant treat me with the same respect.");
        englist.add("I just don't care if anyone doesn't like me I wasn't put on earth to entertain everyone.");
        englist.add("I will not delete you or block you. I am keeping you there so you will be able to see how happy I'm without you..");
        englist.add("Anger is not bad. Anger can be a very positive thing, the thing that moves us beyond the acceptance of evil.");
        englist.add("People change, things go wrong, shit happens, but life goes on.");
        englist.add("I text you because I want to have a conversation with you. Not to get one word answers.");
        englist.add("Anger dwells only in the bosom of fools.");
        englist.add("Just because I'm being quiet, that doesn't mean I'm mad.");
        englist.add("For every minute you are angry. You lose sixty seconds of happiness. Think about It...");
        englist.add("I learned long ago to never trust anybody because I'd eventually get betrayed. Now I ask myself why I allowed myself to trust you.");
        englist.add("sometimes hearing the music is just the best way to ignore the world");
        englist.add("Feelings are much like waves, we can't stop them from coming but we can choose which ones to surf.");
        englist.add("If you're going to talk about me behind my back, don't smile at me to my face!");
        englist.add("Anger is just one letter short of DANGER!!!");
        englist.add("Ya know what I hate. Being ignored! If you don’t want to talk to me anymore then just tell me and quit beating around the bush.");
        englist.add("If I delete your number, you're basically deleted from my life.");
        englist.add("Never get into fights with ugly people, they have nothing to lose.");
        englist.add("If you want to hear the whole truth about yourself, make your neighbor angry.");
        englist.add("sometimes hearing the music is just the best way to ignore the world.");
        englist.add("Cute relationship is when someone gets angry with you and says, 'I will never talk to you' and later comes back to you to just inform... 'I am still angry.'");
        englist.add("By God, there's a lot to make you angry.");
        englist.add("Don't chat with me just when you're bored. Bitch please! My name is not Adam Lambert. I'm not here for your entertainment.");
        englist.add("No matter how long you know someone, they eventually show their true colors.");
        englist.add("Anger is never without a Reason, but seldom with a good one.");
        englist.add("The worst tempered people I've ever met were people who knew they were wrong.");
        englist.add("Sometimes I'm just not in the mood to talk.");
        englist.add("May kill you in the morning?");
        englist.add("It's tough when the people you care about the most are the ones who make you feel the worst.");
        englist.add("Some friends are like pennies. Two-faced & worthless.");
        englist.add("Don't get mad, smile and creep them out instead.");
        englist.add("There is nothing more galling to angry people than the coolness of those on whom they wish to vent their spleen.");
        englist.add("Anger makes you smaller, while forgiveness forces you to grow beyond what you were.");
        englist.add("I wouldn’t have to manage my anger if people could learn to manage their stupidity.");
        englist.add("Some people never realize the emotional and mental damage they do to others.");
        englist.add("Two things to remember, DON’T make decisions when you’re angry and DON’T make promises when you’re happy..");
        englist.add("Did you ever just want to slap the stupid out of someone?");
        englist.add("For every minute you remain angry, you give up sixty seconds of peace of mind.");
        englist.add("Never forget what someone says to you when they are angry, because that's when the truth comes out");
        englist.add("Some people come into our lives & leave footprints on our hearts. Others come into our lives & make us wanna leave footprints on their face.");
        englist.add("If you're going to talk about be behind my back, don't smile at me to my face!");
        englist.add("Your mistake is letting me go, my mistake was letting you in.");
        englist.add("Some people come into our lives and leave footprints on our hearts. Others come into our lives and make us wanna leave footprints on their face.");
        englist.add("Nobody makes you angry, you decide to use anger as a response.");
        englist.add("Some friends are like pennies. Two-faced and worthless.");
        englist.add("You can’t trust anybody these days…you think you have a good friend till you turn around and realize they have the knife 6 inches deep in your back.");
        englist.add("I will not delete you or block you. I am keeping you there so you will be able to see how happy I’m without you.");
        englist.add("What goes around comes around. That’s what people say. So all the pain you caused me will come back to you someday.");
        englist.add("Beware, I’m not in my greatest mood today..");
        englist.add("I told you I needed you, you told me the same. I wasn't lying, so why didn't you tell the truth?");
        englist.add("Never make yourself feel like nothing to make someone else feel like everything.");
        englist.add("Never regret something that once made you smile.");
        englist.add("Some people need to open their small minds instead of their big mouths.");
        englist.add("Always write angry letters to your enemies. Never mail them.");
        englist.add("Tired of waking up everyday and putting on a stupid fake smile and lying to the world.");
        englist.add("You think that you have damaged me but really you just made me that much more stronger.. Thank You!!");
        englist.add("If I delete your number, you’re basically deleted from my life.");
        englist.add("Everything is getting expensive except some people, they are getting cheaper.");
        englist.add("Anger makes you smaller, while forgiveness forces you to grow beyond what you were...");
        englist.add("I may look calm, but in my head I've killed you about 5 times.");
        englist.add("The best remedy for a short temper is a long walk.");
        englist.add("A person who has lots of anger inside, definitely loves people more than anyone else can. because if red color indicates anger then it indicates love too...");
        englist.add("It sucks when you realize you rejected other people for that one person who wasted your time.");
        englist.add("Attitude and personality are two different things.");
        englist.add("Be angry with the right person... to the right degree...at the right time... for the right purpose and in the right way.");
        englist.add("Holding on to anger is like grasping a hot coal with the intent of throwing it at someone else and you are the one who gets burned.");
        englist.add("I would not have to manage my anger if people would manage their stupidity.");
        englist.add("Not the fastest horse can catch a word spoken in anger.");
        englist.add("One person can only take so much stress and anger build up until they reach their breaking point and snap. Today I reached my breaking point.");
        englist.add("Definition of EX: Thanks for the experience. Our time has expired. Now exit my life.");
        englist.add("No matter how angry i am at you, and say i am done with you, i really don’t want to lose you.");
        englist.add("Where there is anger, there is always pain underneath.");
        englist.add("I’m the person that the more you complain about me, the harder I’ll try to annoy you.");
        englist.add("Speak when you are angry and you will make the best speech you will ever regret.");
        englist.add("Anger makes dull men witty, but it keeps them poor.");
        englist.add("Anger is our natural defense against pain. So when I say, I hate you - it really means you hurt me.");
        englist.add("Anger is fear in disguise.");
        englist.add("It's better to cry than to be angry because anger hurts others, while tears flow silently through the soul and cleanness the heart...");
        englist.add("Don’t chat with me just when you’re bored. Bitch please! My name is not Adam Lambert. I’m not here for your entertainment.");
        englist.add("If you’re going to talk about me behind my back, don’t smile at me to my face.");

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