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

public class Happiness extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Happiness() {
        // Required empty public constructor
    }

    public static Happiness newInstance(String param1, String param2) {
        Happiness fragment = new Happiness();
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

        englist.add("5 Ways to Happiness : 1. Don't Hate 2. Don't Worry 3. Live Simply 4. Expect Less 5. Give More");
        englist.add("Doing what you like is freedom. Liking what you do is happiness");
        englist.add("Always be the reas0n 0f s0me0nes happiness never just a part 0f it. Be a part 0f s0me0nes sadness but never the reas0n f0r it.");
        englist.add("Happiness is the meaning and purpose of life, the whole aim and end of human existence");
        englist.add("The enemy of the present happiness is the past happiness too well remembered.");
        englist.add("Don't let circumstances that you can't control, control your happiness.");
        englist.add("Rich is the person who's happiness requires no money.");
        englist.add("Don't put the key to your happiness in someone else's pocket.");
        englist.add("Never depend on people to help create your happiness because you might be depressed forever. If you rely on yourself then you know you always have someone to count on.");
        englist.add("Happiness is not having what you want, but wanting what you have...");
        englist.add("If you find serenity and happiness, they may be jealous, Be happy anyway.");
        englist.add("Know your worth. Know when you have had enough. And move on from the people who keep ruining your happiness.");
        englist.add("It is not happiness that makes us grateful, but the gratefulness that makes us happy");
        englist.add("there is a time in everybody's life when you have to stop being scared and say what you want & need cause holding back only leaves you with regret & unhappiness!");
        englist.add("Happiness is a choice. Yeah, things in life make it difficult, but at the end of the day you control your own happiness.");
        englist.add("Dreams are a way to tell ourselves that we are still capable of bringing happiness in our lives. Never stop dreaming.");
        englist.add("Find your happiness not just in the big moments of life but in every little one.");
        englist.add("One of the sanest, surest and most generous joys of life comes from being happy over the good fortunes of others.");
        englist.add("Until you realize you are the creator of your own misery you will never be truly happy.For it is how you react to any given situation that brings you happiness.");
        englist.add("Life is about trusting our feelings &; taking chances , losing &; finding happiness , appreciating the memories &; learning from the past .");
        englist.add("The amount of happiness that you have depends on the amount of freedom you have in your heart.");
        englist.add("Being happy doesn't mean you're perfect. It just means you've decided to look beyond the imperfections.");
        englist.add("Happiness is a journey, not a destination");
        englist.add("Never put your happiness in someone else's hands because that often leads to disappointment.");
        englist.add("Every temporary happiness is much better than permanent misery.");
        englist.add("The best way to torture people is with your happiness. There's nothing people hate more than seeing you be successful.");
        englist.add("Love is the master key that opens the gates of happiness.");
        englist.add("The secret to real happiness is progress.");
        englist.add("It is hard to fly when something is weighting you down.");
        englist.add("Follow your heart, because if you always trust your mind, you'll always act on logic, and logic doesn't always lead to happiness");
        englist.add("It is not how much we have, but how much we enjoy, that makes happiness.");
        englist.add("Give your life happiness and excitement, not tears and pain.");
        englist.add("The great pleasure in life is doing what people say you cannot do.");
        englist.add("Appreciate all of the amazing things others can bring to your life, but dont depend on them for creating your happiness.");
        englist.add("The only time you fail is when you fall down and stay down.");
        englist.add("When someone brings more problems to your life than happiness, it's time to show them the door where they can exit.");
        englist.add("Happiness has nothing to do with your life's circumstances, it's based on your ability to accept the things you are experiencing.");
        englist.add("The richer you get, the more expensive happiness becomes.");
        englist.add("Try to expect nothing, but be open for anything. Don't look for happiness, but don't settle for anything less");
        englist.add("Life is too short to spend time with people who suck the happiness out of you.");
        englist.add("The best feeling of happiness is when you're happy because you've made somebody else happy.");
        englist.add("Life is about learning from the past, trusting your intuition going forward, taking chances, finding moments of happiness, and realizing everything is simply a lesson that happens for a reason.");
        englist.add("Our happiness or our unhappiness depends  far more on the way we meet the events of life than on the nature of those events themselves.");
        englist.add("Some pursue happiness. Others create it.");
        englist.add("Don't fear the enemy that attacks you, but the fake friend that hugs you.");
        englist.add("Thinks friends are like flowers - and is pretty happy with the beautiful bunch in their life!");
        englist.add("To be happy does not only mean acquire happiness but also to feel it.");
        englist.add("Truth adds strength to our mind, courage to our heart, happiness to our soul and empowerment, motivation and inspiration to feel the best in our enriching life.");
        englist.add("You reach a point where you realize that in order to get HAPPINESS and PEACE OF MIND is to accept the pain, leave them behind, move on and forgive.");
        englist.add("If you ever lose my trust, you probably will never get it back.");
        englist.add("There are times when you need to release the bitterness and grab a firm hold of happiness.");
        englist.add("Your HAPPINESS is not determined by what's happening around you, but rather what's happening inside of you.");
        englist.add("A better life has been achieved when we are no longer trying to achieve a better life. It means that we are content, as we should be, with ourselves and what we have. To be anxious for more or to envy someone else's life or possessions is self-defeating. We are then in a constant state of frustration, always hoping and waiting for more happiness");
        englist.add("LOVE. HAPPINESS. FRIENDSHIP. Which part of my life are you?");
        englist.add("When you connect to the silence within you, that is when you can make sense of the disturbance going on around you.");
        englist.add("There's nothing like deep breaths after laughing that hard. Nothing in the world like a sore stomach for the right reasons");
        englist.add("If you want to be happy , be happiness is not something to find, it's something to create.. create your own happiness");
        englist.add("Life is about trusting your feelings, taking chances, losing, and finding happiness.");
        englist.add("Nobody can take away your pain so don't let anyone take your happiness.");
        englist.add("The saddest people I've ever met in life are the ones who don't care deeply about anything at all. Passion and satisfaction go hand in hand, and without them, any happiness is only temporary, because there's nothing to make it last.");
        englist.add("the key to happiness is to realize that you are in complete control of how happy you are");
        englist.add("Happiness often sneaks in a door you did not think was open");
        englist.add("Be thankful for what you have; you'll end up having more. If you concentrate on what you don't have, you will never, ever have enough");
        englist.add("The secret of being happy is accepting where you are in life and making the most out of everyday.");
        englist.add("The best revenge is happiness, because nothing drives people more crazy then seeing someone actually having a good life");
        englist.add("I don't care what gender you are, i will still call you dude");
        englist.add("Don't let your happiness depend on other people. Just like the changes in seasons, people may also have a change in heart.");
        englist.add("Don't let your happiness be controlled by something you can't control.");
        englist.add("The first step to happiness is deciding what you want, the second step is doing whatever it takes to get it and the last step is enjoying every minute of it.");
        englist.add("There are some shiny, happy people out there who seriously need to be bitch-slapped back into reality. just saying.");
        englist.add("Money will not buy happiness, but it will let you be unhappy in nice places.");
        englist.add("Choose happiness today by taking life moment by moment, complaining very little, and being thankful for the little things that mean a lot.");
        englist.add("Think big thoughts but relish small pleasures.");
        englist.add("Learn to value yourself, which means: fight for your happiness.");
        englist.add("If you cant be a PENCIL to write someone's happiness, then try to be an ERASER to remove someone's sadness");
        englist.add("The key to happiness is your inner freedom, peace, and willingness to enjoy every moment of your life.");
        englist.add("When you allow your happiness to be controlled by someone else, you are handing them your power.");
        englist.add("Every day may not be good, but there's something good in every day.");
        englist.add("Beauty might bring happiness, but happiness always brings beauty");
        englist.add("Don't let anyone steal your happiness, it was never theirs to take");
        englist.add("Pain was given so we'll learn how to sympathize. Struggles were given so we'll realize how to appreciate. Tears were given so we'll know how real happiness actually feels.");
        englist.add("Happiness is valuing what you have, and enjoying the people, places, objects and events in your life for what they are. It's not about changing and achieving all the time; sometimes it's about being and appreciating.");
        englist.add("If you want something you've never had, you have to do something you've never done.");
        englist.add("But the struggles make you stronger and the changes make you wise... And happiness has its own way of taking its sweet time");
        englist.add("True happiness is not expensive. if it requires high price it's a fake.");
        englist.add("Life is about trusting our feelings, taking chances, losing and finding happiness, appreciating the memories, and learning from the past.");
        englist.add("Happiness is not a possession to be prized, it is a quality of thought, a state of mind.");
        englist.add("Saying yes to happiness means learning to say no to things and people that stress you out.");
        englist.add("You have it easily in your power to increase the sum total of this world's happiness now. How? By giving a few words of sincere appreciation to someone who is lonely or discouraged. Perhaps you will forget tomorrow the kind words you say today, but the recipient may cherish them over a lifetime");
        englist.add("Happiness is not something that happens to you. It i something that you choose");
        englist.add("life is about learnin from the past trust in your feelings takin chances losing and finding happiness appreciating the memories and realizin that life goes on");
        englist.add("Sometimes it takes sadness to know happiness, noise to appreciate silence, and absence to value presence...");
        englist.add("When it comes to being happy, there's no right or wrong. It's just a battle between your happiness & THEIR JUDGMENT.");
        englist.add("No one is in control of your happiness but you; therefore, you have the power to change anything about yourself or your life that you want to change");
        englist.add("You like the person if you wish him happiness.");
        englist.add("If it causes you more pain than happiness, less laughter and more tears...there's no day like today to throw it away.");
        englist.add("everybody wants happiness nobody wants pain but you can't have a rainbow without a little rain");
        englist.add("Realizing that i truly was not happy was the first step in finding happiness.");
        englist.add("Happiness is made not found. Everyone can make it if they want. ;)");
        englist.add("The happiness and unhappiness of our lives depends not on what we feel but on what we do, just as good and bad consists not in feeling but in doing.");
        englist.add("Some people will try to spoil your happiness just because they have nothing better to do and because they are unhappy with their own life... Stand your ground!");
        englist.add("Don't worry. God is always on time.");
        englist.add("I'm killing time while I wait for life to shower me with meaning and happiness");
        englist.add("Time, you can't keep it, but you can spend it.");
        englist.add("The happiest people don't necessarily have the best of everything, they just make the best out of everything that comes their way");
        englist.add("We forget that happiness doesn't come as a result of getting something we don't have, but by recognizing and appreciating what we do have.");
        englist.add("Dreams are today's answers to tomorrow's questions.");
        englist.add("Take time for friends...they are the source of happiness.");
        englist.add("If you want to make your dreams come true, The first thing you have to do is wake up.");
        englist.add("Happiness is not determined by what's happening around you, but rather what's happening inside you.");
        englist.add("The happiest is the one who brings happiness to the greatest number of people.");
        englist.add("Happiness is not a reward it is a consequence. Suffering is not a punishment it is a result.");
        englist.add("True happiness comes from within yourself, not from someone else. Stop searching, start living.");
        englist.add("Dwell on the beauty of life. Watch the stars, and see yourself running with them.");
        englist.add("HAPPINESS is a journey,[not a destination]");
        englist.add("Happiness is not hard to find. It's beside you, it's in front of you, it's at your back, it's around you. It's just a matter of appreciation");
        englist.add("The true measure of success is how many times you can bounce back from failure.");
        englist.add("A person must be able to be alone and find happiness within themselves, before they can ever expect to be happy with someone else.");
        englist.add("Now and then it's good to pause in our pursuit of happiness and just be happy.");
        englist.add("Hard work will not only lead to success but also to happiness which is the greatest gift of life.");
        englist.add("Be happy not because everything is good, but because you can see the good in everything.");
        englist.add("Everyone wants happiness and nobody wants pain, but you can't make a rainbow without a little rain.");
        englist.add("If you find serenity and happiness, they may be jealous. Be happy anyway");
        englist.add("Happiness is found when you stop comparing yourself to other people");
        englist.add("Happiness isn't getting all you want. It's enjoying all you have.");
        englist.add("Life isn't about finding yourself. Life is about creating yourself");
        englist.add("If you want happiness for a day-- go fishing.");
        englist.add("There is only one way to happiness and that is to cease worrying about things which are beyond the power of our will");
        englist.add("Everyone wants happiness, no one wants pain, but you can't have a rainbow, without a little rain");
        englist.add("Stop worrying about someone that isn't worried about you. Never leave your key of happiness in someone else's pocket.");
        englist.add("Everyone wants happiness, nobody wants pain, but you can't have a rainbow without a little rain.");
        englist.add("Truth or happiness. Never both.");
        englist.add("You can't be happy unless you're unhappy sometimes.");
        englist.add("For every minute you are angry, you lose sixty seconds of happiness.");
        englist.add("Sometimes the things that you are most afraid of are the things that make you tha happiest.");
        englist.add("Happiness has nothing to do with your life's circumstances, its based on your ability to accept the things you are experiencing.");
        englist.add("There is only one way to happiness, and that is to stop worrying about things that are beyond our control.");
        englist.add("The greatest pleasure people can feel, is giving happiness to others.");
        englist.add("A friend is one of the nicest things you can have, and one of the best things you can be.");
        englist.add("Don't let the sadness of your past or the fear of your future ruin the happiness of your present.");
        englist.add("Stop comparing yourself with others, stop measuring your own happiness by what others have or do not have.");
        englist.add("No matter what, there will always be somebody who will try their hardest to take all that happiness that shines in and out of you; people will hate you even for being good. Keep on shining, because you're doing something right to have haters.");
        englist.add("our heart is a place to draw true happiness.");
        englist.add("Over thinking kills happiness. Insecurities kill self-esteem. Lies kill trust.");
        englist.add("Positive thinking evokes more energy, more initiative and more happiness.");
        englist.add("Plenty of people miss their share of happiness, not because they never found it, but because they didn't stop to enjoy it...");
        englist.add("Silence and smile are two powerful tools. Smile is the way to solve many problems, silence is the way to avoid problems.");
        englist.add("Happiness Came's From Realizing Your No Longer Unhappy.");
        englist.add("Just because someone left, doesn't mean your happiness is gone. Happiness doesn't depend on anybody but ourselves");
        englist.add("Happiness lies in the joy of achievement and the thrill of creative effort.");
        englist.add("Through every walk of pain, there's is always a step of happiness that awaits.");
        englist.add("Life is like riding bicycle. To keep your balance, you must keep moving.");
        englist.add("If you don't understand my silence, you will not understand my words.");
        englist.add("People wait all week for Friday, all year for summer, all life for happiness");
        englist.add("You can only find happiness once you are truly willing to accept the things that once made you unhappy.");
        englist.add("If you judge people, you have no time to love them.");
        englist.add("Being happy doesn't mean that everything is perfect. It means that you've decided to look beyond the imperfections.");
        englist.add("Happiness is not the absence of problems but the ability to deal with them.");
        englist.add("Never let someone else's happiness become more important than your own");
        englist.add("I hope you always find a reason to smile.");
        englist.add("I've got nothing to do today but smile.");
        englist.add("Life's short, forget your problems, be happy, and live your life because you never know if there will be another tomorrow.");
        englist.add("No matter the nature of your problems, don't mind the degree of your misfortune, don't lose hope, never submit yourself to frustration because life is the mixture of sorrows and happiness...");
        englist.add("Don't cry because it's over, smile because it happened.");
        englist.add("Don't waste a minute not being happy. If one window closes, run to the next window or break down the door.");
        englist.add("You won't have a happy life if you worry about what others say about you.");
        englist.add("Letting go of the past is your first step to happiness..");
        englist.add("No love is greater than mom's love, no care is greater than dad's care.");
        englist.add("Let your smile change the world, but don't let the world change your smile.");
        englist.add("You are responsible for your own happiness. If you expect others to make you happy, chances are you'll always end up disappointed.");
        englist.add("Negativity is a thief, it steals happiness");
        englist.add("I'm all smiles and it's all because of you :) you know who you are ;)");
        englist.add("Everyone can make you smile, but only certain people can make you happy...");
        englist.add("Count your age by friends, not years. Count your life by smiles, not tears.");
        englist.add("The happiness of our life depends upon the quality of our thoughts. But the quality of our thoughts depends on the people we have in our life.");
        englist.add("Life is short grudges are a waste of perfect happiness. Laugh when you can, apologize when you should, let go what you can't change.");
        englist.add("Realise that true happiness lies within you.");
        englist.add("Happiness depends not on material things but to our view on the things.");
        englist.add("No body can take away your pain, so don't let them take away your happiness.");
        englist.add("Don't let yesterday make you forget all the happiness you deserve today.");
        englist.add("Life is filled with challenges! don't let happiness be one of them");
        englist.add("Happiness is Not a feeling... It is a choice....");
        englist.add("Children are one of the greatest lessons in happiness, constantly challenging us to enjoy the moment, as the next one will not be the same.");
        englist.add("Learn to let go. That is the key to happiness.");
        englist.add("Keeping baggage from the past will leave no room for happiness in the future.");
        englist.add("Happiness is not about getting what you want all the time, it's about appreciating what you already have.");
        englist.add("Here's a piece of advice: Never put your happiness in someone else's hands.");
        englist.add("Worrying is a waste of time. It doesn't change anything. It messes with your mind and steals your happiness.");
        englist.add("It's important to note that there's no such thing as perfect happiness, just as there's no such thing as perfect despair. This is why trying to be perfect is an exercise in futility.");
        englist.add("The primary cause of unhappiness is never the situation itself, but your thoughts about it.");
        englist.add("Good friends are like starts. you don't always see them. but you know they are there !");
        englist.add("It seems that when we think and think, we can end up thinking ourselves out of happiness, but never into it.");
        englist.add("Born to express not to impress.");
        englist.add("Life is to short to spend time with people who suck the happiness out of you");
        englist.add("Life is filled with challenges! don't let happiness be one of them!");
        englist.add("The greater part of our happiness or misery depends upon our dispositions, and not upon our circumstances.");
        englist.add("The greatest revenge is happiness.");
        englist.add("can honestly say they's feeling the happiest they's felt in a really long time :D");
        englist.add("Our happiness in this world depends on the affections we are enabled to inspire.");
        englist.add("Wishing you blessings of health, happiness and success on Thanksgiving and always");
        englist.add("Be the reason of someone's happiness never just a part of it and Be a part of someone's sadness but never the reason for it.");
        englist.add("You have the power to create your own happiness!! If you don't like something about your life, CHANGE IT! Never settle for less than all you dream of!");
        englist.add("For every minute you are angry you lose sixty seconds of happiness.");
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