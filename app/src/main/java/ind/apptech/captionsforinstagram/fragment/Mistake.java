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

public class Mistake extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Mistake() {
        // Required empty public constructor
    }

    public static Mistake newInstance(String param1, String param2) {
        Mistake fragment = new Mistake();
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

        englist.add("Mistakes are meant for learning, not repeating.");
        englist.add("While one person hesitates because they feel inferior, the other is busy making mistakes and becoming superior.");
        englist.add("It's your life, your mistakes, nobody else, so never let other tell you wrong from right, or wrong from your heart");
        englist.add("Anyone who has never made a mistake has never tried anything new.");
        englist.add("If you're born poor, it's not your mistake. But, if you die poor, it's your mistake.");
        englist.add("It's impossible to fail if you learn from your mistakes. Don't give up!");
        englist.add("Mistakes are a part of being human. Appreciate your mistakes for what they are: precious life lessons that can only be learned the hard way. Unless it's a fatal mistake, which, at least, others can learn from.");
        englist.add("He who does many things makes many mistakes, but never makes the biggest mistake of all - doing nothing.");
        englist.add("True friends will correct you for your mistakes. Not judge you for them.");
        englist.add("It's amazing how much more you can learn by making mistakes than you can by making perfect decisions.");
        englist.add("If someone feels that they had never made a mistake in their life, then it means they had never tried a new thing in their life.");
        englist.add("There comes a time when you have to stop remembering your mistakes and move on. No regrets in life. Just lessons.");
        englist.add("Biggest mistake ever is thinking with your heart and feeling with your mind. Things aren't supposed to work this way.");
        englist.add("The biggest mistake people make in life is not trying to make a living at doing what they most enjoy.");
        englist.add("Everyone makes mistakes, but you admit your own before you point out someone else's.");
        englist.add("Everybody makes mistakes. You don't want to be judged by yours, then don't judge anyone else.. end of the day, the past is unchangeable, but people change & life goes on");
        englist.add("Every mistake is an opportunity to learn something new.");
        englist.add("If you make the same mistake twice , then it wasn't a mistake at all . it was a choice.");
        englist.add("Don't worry about hard times cause most beautiful things we have in life come from mistakes and changes.");
        englist.add("Take chances... a lot of them. Because honestly, no matter where you end up- and with who, it always ends up just the way it should be. Your mistakes make you who you are... you learn and grow with each choice you make. Everything is worth it. Say how you feel- always . Be you, and be okay with it. It doesn't matter what any other person thinks.");
        englist.add("Learn to admit your mistakes, before someone exaggerates the story.");
        englist.add("Learning from your own mistakes is the biggest mistake you can make. Carefully observe the stupidity of others and learn from their instead.");
        englist.add("There's nothing wrong with making a mistake, what's wrong is not making the effort to make it right.");
        englist.add("I think life is full of challenges and problems. We all make mistakes. It's not a bed of roses, and you have to work real hard at it.");
        englist.add("Starting out to make money is the greatest mistake in life. Do what you feel you have a flair for doing, and if you are good enough at it, the money will come.");
        englist.add("Life is very interesting if you make mistakes.");
        englist.add("Trust your own instinct. Your mistakes might as well be your own, instead of someone else's.");
        englist.add("I fall, I rise, I make mistakes, I live, I learn, I've been hurt but I'm stronger, I'm human, I'm not perfect, but I'm thankful.");
        englist.add("Anyone who thinks my story is anywhere near over is sadly mistaken.");
        englist.add("Never mistake good manners for good will.");
        englist.add("Stop looking back on your mistakes. What's done is done. Learn from them and move on.");
        englist.add("A life spent making mistakes is not only more honourable, but more useful than a life spent doing nothing");
        englist.add("It is always nice to be generous. Be careful though, some people mistake generosity for dependency.");
        englist.add("A collection of mistakes is called experience and experience is the key to success.");
        englist.add("Why is it that we could do a million things right, but be forever remembered by one single mistake?");
        englist.add("One of the biggest flaws of people are pretending to be blind to their own mistakes, but do not pretend deaf towards the mistakes of others.");
        englist.add("It takes a second to make a mistake but a lifetime to forget it was your fault");
        englist.add("You can't go back and change the past, so look to the future and don't make the same mistake twice.");
        englist.add("The worst mistake anyone can make is being too afraid to make one");
        englist.add("Do you know what is wrong with sorry? It gives people the wrong idea that any mistake can be solved by a single word.!!!");
        englist.add("My life, my choices, my mistakes, my problems, my regret, my emotions, my tears, my smiles, my happiness, my sadness, it's all mine. So why can't you just stay out of it?");
        englist.add("We sometimes let people get the best of us, destroy us, and change our opinions on what we believe is true. Only you know what is right for yourself. You have the power, you make the choices and you learn. Each experience we go through in life is a lesson to be learned. We all make mistakes. Why is that so hard for some to understand? No one should be judged by the mistakes they have made. It's past news");
        englist.add("Some people miss the message because they're too busy looking for the mistake.");
        englist.add("There are no mistakes in life, just lessons.");
        englist.add("There are no mistakes in life, only lessons.");
        englist.add("KNOW your mistakes, and KNOW what you learnt from them. NEVER to repeat them again.");
        englist.add("Make mistakes, take chances, be silly, be imperfect, trust yourself and follow your heart.");
        englist.add("More people would learn from their mistakes if they weren't so busy denying them.");
        englist.add("Mistakes are proof to life that you are trying.");
        englist.add("It's better to enjoy life committing mistakes and learn......rather than play safe in your entire life and learn nothing at all.......");
        englist.add("Mistakes teach you important lessons. Every time you encounter one, you're a step closer to your goal.");
        englist.add("Never make the same mistake twice, There are so many new ones, Try a different one each day");
        englist.add("Past mistakes should teach you to create a wonderful future; not cause you to be afraid of it.");
        englist.add("Everybody deserves second chances, but not for the same mistakes.");
        englist.add("I learned that life is not about the mistakes that you make, but about the number of times you tried to correct them.");
        englist.add("One mistake will never kill you. The same mistake over and over again will.");
        englist.add("I'm the author of my own life story. Unfortunately, I'm writing in pen and i can't erase my mistakes but my future will be better than my past.");
        englist.add("Some of the worst mistakes of my life have been haircuts.");
        englist.add("In life, I have made a lot of mistakes and felt a lot of pain. My pain made me stronger and my mistakes made me wiser.");
        englist.add("Learn from others just as you would learn from your own mistakes.");
        englist.add("Don't keep crying because of a mistake. Learn from it and move on. Stop blaming yourself over things you have no control over.");
        englist.add("The greatest mistake you can make in life is to be continually fearing you will make one.");
        englist.add("Living might mean taking chances but they're worth taking, Loving might be a mistake but it's worth making.");
        englist.add("Don't keep crying because of an mistake. Learn from it and move on. Don't waste your life blaming yourself because of something that already is gone.");
        englist.add("One of the greatest challenges in life is to find someone who knows all your flaws, differences, and mistakes, and yet still thinks you're absolutely Amazing");
        englist.add("A second chance doesn't mean anything if you haven't learned from your first mistake.");
        englist.add("Live the life you want to live. Be the person you want to remember. Make decisions, make mistakes. If you fall, at least you tried.");
        englist.add("I don't forgive people because I'm weak. I forgive them because I am strong enough to know people make mistakes.");
        englist.add("No matter how many mistakes you make or how slow you progress, you are still way ahead of everyone who isn't trying.");
        englist.add("Give thanks to God for whatever happens in life. Nothing is a mistake. An end leads to a new start.");
        englist.add("Its funny how you can do nice things for people all the time and they never notice. But once you make one mistake, its never forgotten.");
        englist.add("As you get older: It's not that the mistakes you make get bigger, It's that you learn the true value of your mistakes; which makes them seem bigger. And that's when you find yourself becoming wiser.");
        englist.add("Don't worry about the hard times, because most of the beautiful things we have in life come from changes and mistakes.");
        englist.add("The greatest mistake I ever made was to be afraid of my mistakes. They are my stepping stones to greatness!");
        englist.add("If you can forgive yourself as well as others and learn from your mistakes, problems and heartaches will be stepping stones on your path to grow wiser and stronger.");
        englist.add("Past mistakes should teach you to create a wonderful future, not cause you to be afraid of it.");
        englist.add("It's impossible to fail if you learn from your mistakes. Don't give up.");
        englist.add("Take chances, take a lot of them. Because honestly, no matter where you end up and with whom, it always ends up just the way it should be. Your mistakes make you who you are. You learn and grow with each choice you make. Everything is worth it. Say how you feel, always. Be you, and be okay with it.");
        englist.add("A just cause is not ruined by a few mistakes.");
        englist.add("Promise yourself to forget the mistakes of the past and press on to the greater achievements of the future.");
        englist.add("Mistakes are proof that you're trying.");
        englist.add("We Do Mistakes. We Do Grace.");
        englist.add("Yeah, you can learn a lot from me... not by what I've done but what I haven't done yet, not by my work but from my mistakes...");
        englist.add("A mistake is only a mistake if you don't learn anything from it, once you learned something from it, it becomes a lesson.");
        englist.add("You only have one life to do whatever you want with. In 100 years nobody will remember the stupid mistakes you made, so make a fool of yourself while you still have the chance, because if you spend all your life trying to be the coolest kid around you will never be happy with yourself.");
        englist.add("Mistakes are part of the dues one pays for a full life.");
        englist.add("The mistakes of the fool are known to the world, but not to himself. The mistakes of the wise man are known to himself, but not to the world.");
        englist.add("The future is scary...but u can't just run back to the past because its familiar. Yes, its tempting...but its a mistake.");
        englist.add("Don't worry about hard times, because most of the lessons we have in life come from changes and mistakes.");
        englist.add("Mistakes are part of life, everyone makes them, everyone regrets them. But, some learn from them and some end up making them again. It's up to you to decide if you'll use your mistakes to your advantage.");
        englist.add("I wish I could've lived my life without making any wrong turns, but that's impossible. A path like that doesn't exist. We fail. We trip. We get lost. We make mistakes. And little by little one step at a time we move forward. It's all we can do");
        englist.add("You will never be brave if you don't get hurt. you will never learn if you don't make mistakes.");
        englist.add("Never mistake my silence for weakness. Ever heard someone plan a murder out loud? Didn't think so!");
        englist.add("Being a better person doesn't mean being perfect. Learn from your mistakes. Move on. you are already one step ahead of your past.");
        englist.add("Your not a mistake, your an error in my judgement. You were simply just mistaken as mistake.");
        englist.add("Dare to try something new. And when you do hit a wall or make a mistake, don't blame anyone else.");
        englist.add("There are many lessons to learn from mistakes. You'd be surprised by how many things your past taught you.");
        englist.add("Our problem is that we make the mistake of comparing ourselves with other people. You are not inferior or superior to any human being ... You do not determine your success by comparing yourself to others; rather you determine your success by comparing your accomplishments to your capabilities. You are 'number one' when you do the best you can with what you have, every day.");
        englist.add("When you make the biggest mistake ever, something good comes from it.");
        englist.add("Without pain, there would be no suffering, without suffering we would never learn from over mistakes. To make it right, pain and suffering is the key to all windows, without it, there is no way of life.");
        englist.add("In a lifetime of mistakes, you two are the greatest things that have ever happened to me");
        englist.add("I think we all wish we could erase some dark times in our lives. But all of life's experiences, bad and good make you who you are. Erasing any of life's experiences would be a great mistake.");
        englist.add("A computer makes as many mistakes in one second as three men working for thirty years straight.");
        englist.add("Mistakes have the power to turn you into something better than you were before.");
        englist.add("We learn from every mistake we make. Let's not judge people who make mistakes because we make them too.");
        englist.add("My life. My choices. My problems. My mistakes. My lessons. Not your business. Mind your own problems before you talk about mine.");
        englist.add("There comes a time when you have to stop remembering your mistakes and just move on.");
        englist.add("Your mistakes do not define you.");
        englist.add("Sometimes, you have to make a big mistakes to figure out how to make things right, mistakes are painful but they're the only way to find out the reality.");
        englist.add("Some of the best things in life are mistakes.");
        englist.add("A failure is not always a mistake, it may simply be the best one can do under the circumstances. The real mistake is to stop trying.");
        englist.add("Your mistake should be your motivation, not your excuses.");
        englist.add("I realize that life is risks. It's acknowledging the past, but looking forward. It's taking a chance that we will make mistakes, but believing that we all deserve to be forgiven");
        englist.add("Achievement seems to be connected with action. Successful people keep moving. They make mistakes, but they don't quit.");
        englist.add("As life goes on, there's new challenges that we all have to face, there's more problems for us to solve, there's more mistakes for us to make and to learn from. That's what life is all about.");
        englist.add("They say trust is earned. But that's only after a mistake.");
        englist.add("Don't stress over past mistakes, because there's nothing you can do to change it. Focus on your present and create your future today.");
        englist.add("The best thing about making mistakes is that we can learn something from them.");
        englist.add("Don't ever make the mistake of thinking kindness is a weakness, sometimes it takes great strength to just smile and say kind words.");
        englist.add("You can never make the same mistake because the second time you make it, it's not a mistake, it's a choice.");
        englist.add("The reality is people mess up, don't let one mistake ruin a beautiful thing.");
        englist.add("We all make mistakes, don't act like you're better than someone else.");
        englist.add("Eventually you have to forgive yourself for the mistakes you've made.");
        englist.add("Life goes on, so don't waste your time worrying about your mistakes.");
        englist.add("Life is not like a pencil, if you make a mistake, it can't be erased. Life is more like a pen, you can use white out to cover it up, but you'll always be reminded of the spot where you made a mistake");
        englist.add("Forgive but don't forget, otherwise you might make the same mistake again.");
        englist.add("Don't waste your time worrying about your mistakes.");
        englist.add("Never make the same mistake twice...there are so many new ones to make!");
        englist.add("And life goes on. With or without you, it keeps going. So get over your mistakes because you just might miss something, or someone, important.");
        englist.add("Getting angry is punishing yourself with other people's mistakes.");
        englist.add("You're not a bad person because you made a mistake, you're a bad person, if you don't learn from that mistake");
        englist.add("Wisdom derives more from mistakes and failures than from success.");
        englist.add("Just live, have wonderful times and make mistakes, but never second guess where you've been, where you are, and most of all where you're going.");
        englist.add("You Weren't The Biggest Mistake In My Life, Only One Of Them.");
        englist.add("Sometimes The Walls We Build Protect Us From Recurring Mistakes, But They Can Also Close Us In.");
        englist.add("I live this life every day. I make my share of mistakes, and every lesson I learn, I learn the hard way. I do the best that I can and i hope you understand");
        englist.add("Never let mistakes define who you are, only you choose who you are and what you are to become.");
        englist.add("Everybody deserves second chances, but not for the same mistakes...");
        englist.add("If someone does you wrong, keep in mind that everybody makes mistakes...");
        englist.add("Don't dwell on mistake. Learn from it.");
        englist.add("Mistakes are a fact of life. It is the response to the error that counts.");
        englist.add("I'm Selfish, Impatient and a little Insecure. I make Mistakes, I am out of Control and at times Hard to Handle. But if you Can't handle me at my WORST, then you sure as hell DON'T deserve me at my BEST");
        englist.add("You can't correct a mistake if you never take ownership of it.");
        englist.add("Trust is like an eraser, it gets smaller after every mistake.");
        englist.add("Forget past mistakes. Forget failures. Forget everything except what you're going to do now and do it.");
        englist.add("It's not wrong to consider some mistakes, what makes it wrong is when you allow them to do it again..");
        englist.add("People make mistakes and bad choices but that's a part of growth. If you're not learning then you're not growing.");
        englist.add("You are in control of your thoughts and actions so you are responsible for what you do with your life. Never blame anyone for your mistakes. Learn from them.");
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