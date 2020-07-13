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

public class HusbandandWife extends Fragment {

    RecyclerView rajputlist;
    Shayri_Adapt rjptadapter;
    private RecyclerView.LayoutManager layoutManager;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public HusbandandWife() {
        // Required empty public constructor
    }

    public static HusbandandWife newInstance(String param1, String param2) {
        HusbandandWife fragment = new HusbandandWife();
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

        englist.add("There are only two times that I want to be with you – Now and Forever.");
        englist.add("My life's biggest achievement is that I get to be with an awesome man like you every day. I love you.");
        englist.add("A dream you dream alone is only a dream. A dream you dream together is reality.");
        englist.add("A good marriage would be between a blind wife and a deaf husband.");
        englist.add("I love you not just because you are my husband but because I know that you always wish the best for me. Thanks.");
        englist.add("Even my child started to walk without any support, nut my wife still holds my hand while walking.");
        englist.add("Amidst the suffocation caused by life's problems, your love comes as a breath of fresh air. I love you.");
        englist.add("To the world, you may be one person, but for me you are the world.");
        englist.add("Every day we share together, we're creating our very own fairytale.");
        englist.add("A jealous spouse does better research than FBI!!");
        englist.add("My wife and I always compromise. I admit I'm wrong and she agrees with me.");
        englist.add("Love and honesty are the things that make a good wife and mother.");
        englist.add("I cannot stop loving you every day, you never stop spoiling me with surprises. I am very happy to be with you, every day I love you more and it seems like yesterday that we got married.");
        englist.add("A successful man is one who makes more money than his wife can spend. A successful woman is one who can find such a man.");
        englist.add("Hours, days, months, years and decades can go by, but I will never forget the moment when you held me in your arms, looked into my eyes and whispered I Love You in my ears – it still gives me the shivers. I love you.");
        englist.add("If my life was a ship, you would be the anchor that holds me in place and the sails which take me on a beautiful journey. I love you.");
        englist.add("If a kiss could tell you how much I love you, I am sure we would be kissing forever.");
        englist.add("When I think of you, an uncontrollable smile crosses my lips because I'm so lucky to have a kind, smart and handsome man.");
        englist.add("I need to start the morning with it and end the day with it. It's not coffee, but my husband's kiss. I love you.");
        englist.add("A good husband makes a good wife.");
        englist.add("A woman worries about the future until she gets a husband. A man never worries about the future until he gets a wife.");
        englist.add("A friend is a friend, Uthman interrupted, and a woman is a woman. You can't have them in one person. The whole world knows that.");
        englist.add("All, everything that I understand, I only understand because I love.");
        englist.add("The only reason my wife agreed to marry me is because Christian Bale wasn't around to propose to her.");
        englist.add("Do you know full form of wife Worries in life Forever");
        englist.add("You are my best friend.");
        englist.add("It doesn't matter who the boss of this house is, as long as we end the day with a romantic kiss. I love you.");
        englist.add("Within you, I lose myself. Without you, I find myself wanting to be lost again.");
        englist.add("You are my sailor, my ship and my captain and your love is like a strong, dark, mysterious sea that is forever there for me. I'm happiest when I am with you.");
        englist.add("Some of the most precious moments of my life have been the ones in which I've held your hand and cuddled in your arms. I love you.");
        englist.add("We always hold hands. If I let go, she shops.");
        englist.add("I seem to have loved you in numberless forms, numberless times, in life after life, in age after age forever.");
        englist.add("Do you know full form of wife Worries in life Forever");
        englist.add("I could tell you that you are a loving husband, wonderful father or a great husband. But you are much more than that – an example of a perfect man. I love you.");
        englist.add("If you were the new burger at McDonalds you would be the Mcgorgeous!");
        englist.add("If I know what love is, it is because of you.");
        englist.add("The first time you touched me, I knew I was born to be yours.");
        englist.add("I could easily say that I love you to death, but I really want to live forever to love you eternally.");
        englist.add("I know I am in love with you because my reality is finally better than my dreams.");
        englist.add("When a woman loves you from the deepest pit of her heart then no matter how much she fights with you... when the time comes she can fight the world for you...");
        englist.add("I love you so much that I would have married you even if you were a rock.");
        englist.add("And remember, as it was written, to love another person is to see the face of God.");
        englist.add("I will never be like her, but I hope you can notice me for me.");
        englist.add("Marriage is a workshop, where the husband works and the wife shops :)");
        englist.add("You are like a wonderful kaleidoscope – every time I look into your eyes, I see a beautiful, radiant, magical, perfect and colorful future. I love you.");
        englist.add("My wife and I always compromise. I admit I am wrong and she agrees with me :)");
        englist.add("Our love singes with passion and sensation. Our marriage hinges on care and affection. I love you.");
        englist.add("A wife is a friend first, a lover second, and third and probably most important, a maid.");
        englist.add("I told my wife that a husband is like a fine wine, he gets better with age. The next day, she locked me in the cellar.");
        englist.add("When I am with you, the only place I want to be is closer.");
        englist.add("Happy is the man who finds a true friend, and far happier is he who finds that true friend in his wife.");
        englist.add("When I look into your eyes, I know I've found the mirror of my own soul.");
        englist.add("Wife: I have changed my mind. Husband: Does the new one work? :)");
        englist.add("A successfull marriage is based on give and take where husband gives money and gifts & wife takes it and wife gives tensions and lectures and husband takes it :)");
        englist.add("The woman who said that all men are the same, obviously never met a man as handsome and loving as you are. I love you.");
        englist.add("I love you for being you and the way you make me feel when I'm with you!");
        englist.add("My husband may not be perfect but he is perfect for me.");
        englist.add("Wife: honey I want you to whisper dirty things in my ear! Husband: kitchen, room, dinning room, patio.");
        englist.add("A woman worries about the future until she gets a husband, while a man never worries about the future until he gets a wife.");
        englist.add("No man is truly married until he understands every word his wife is NOT saying.");
        englist.add("One day my wife's credit card got stolen.. what a relief it was to find that the thief spends less than my wife!");
        englist.add("If you were the new burger at Mc.Donald's you would be the Mc.gorgeous!");
        englist.add("There is only one perfect wife in the world and everyone's neighbour has it. :)");
        englist.add("A kiss is a lovely trick designed by nature to stop speech when words become superfluous.");
        englist.add("When two people love each other, they don't look at each other, they look in the same direction.");
        englist.add("When a man steals your wife, there is no better revenge than to let him keep her.");
        englist.add("My six word love story: I can't imagine life without you.");
        englist.add("My love for you is a journey, starting at forever and ending at never.");
        englist.add("When you see a man opening a car door for a woman it can only mean 1 of 2 things. Either the car is new or the wife is.");
        englist.add("Don't Let People stay in your life longer than they deserve!!!");
        englist.add("My advice to you is get married: if you find a good wife you'll be happy; if not, you'll become a philosopher.");
        englist.add("I love being my husband wife.");
        englist.add("I make our marriage organized, you make it outstanding. I make our married practical, you make it perfect. I keep it grounded, you give it wings. I love you.");
        englist.add("An archaeologist is the best husband a woman can have. The older she gets the more interested he is in her.");
        englist.add("The perfect husband as described by magazines doesn't exit. That's because he has already been taken – by me. I love you.");
        englist.add("Waiting for you to come back home to me is the hardest thing I've ever had to do.");
        englist.add("You may hold my hand for a while, but you hold my heart forever.");
        englist.add("How many times can you wash the floor before the floor says, hey, i'm too clean. leave me alone..");
        englist.add("If you get a good wife, you'll be happy. If you get a bad one, you'll become a philosopher.");
        englist.add("You have been my hottest crush, awesome date, s3xiest boyfriend and passionate lover. All this put together makes you the most perfect husband ever. I love you.");
        englist.add("I love you and that's the beginning and end of everything.");
        englist.add("You are every reason, every hope and every dream I've ever had.");
        englist.add("When a husband brings his wife flowers for no reason, there's a reason.");
        englist.add("From all of life's troubles, you have given me bail. My life has become, a lovely fairytale. I love you.");
        englist.add("We always hold hands. If I let go, she shops :)");
        englist.add("Every single day that I spend being your wife, I realize how lucky I am to live such an amazing life. I love you.");
        englist.add("If my life were a business, entering into an unconditional and irrevocable partnership with you has been the most profitable decision ever. I love you.");
        englist.add("Success in marriage does not come merely through finding the right mate, but through being the right mate.");
        englist.add("A happy marriage is the union of two good forgivers.");
        englist.add("I have loved you all my life, it has just taken me this long to find you.");
        englist.add("Everything in my life revolves around a single thought – how I can keep you happy, because I love you a lot.");
        englist.add("My life's biggest security is not just in loving you, but in knowing that you will always be there to love me back no matter what. I love you baby.");
        englist.add("A real woman doesn't need much attention. Respect is enough..");
        englist.add("Being in a long marriage is a little bit like that nice cup of coffee every morning - I might have it every day, but I still enjoy it.");
        englist.add("In a happy marriage it is the wife who provides the climate, the husband the landscape.");
        englist.add("I am more in love with you than ever.");
        englist.add("I can stop indulging in chocolate, but never in you. I love you.");
        englist.add("For it was not into my ear you whispered, but into my heart. It was not my lips you kissed, but my soul.");
        englist.add("All girls are DEVIL but my wife is QUEEN... Of all of them :)");
        englist.add("Let the wife make the husband glad to come home, and let him make her sorry to see him leave.");
        englist.add("I will love you until the stars go out and the tides no longer turn.");
        englist.add("The best part of our marriage is that the look in your flirty eyes still makes me feel like the most beautiful girl alive. I love you.");
        englist.add("Much more than just attraction, lust and passion, our marriage embodies honesty, care and affection. Love you.");
        englist.add("I'll never ask you to change for me, because you are perfect just the way you are.");
        englist.add("My wife is as handsome as when she was a girl, and I fell in love with her and what is more, I have never fallen out.");
        englist.add("My husband and I have figured out a really good system about the housework: neither one of us does it.");
        englist.add("No other man has ever made me as happy as you, being at your side is so amazing that I want to be together for eternity.");
        englist.add("It's a man's job to respect women, but its a woman's job to give him something to respect...");
        englist.add("Marrying you was the best decision I made in my entire life, thank you my beloved husband for the immense love you have for me. I love you.");
        englist.add("Dreams do come true, because when I met you my dreams came true.");
        englist.add("All the men in this world should learn a thing or two, about being a perfect husband from you. I love you sweetie.");
        englist.add("Every day of my life is perfect because it starts and ends with loving you. I love you.");
        englist.add("Housework is what a woman does that nobody notices unless she hasn't done it.");
        englist.add("There should have been a cautionary warning below your name in our marriage certificate that reads – Beware of Hot Husband. I love you.");
        englist.add("To be your friend was all I ever wanted; to be your lover was all I ever dreamed.");
        englist.add("Your love for me is flawless, your commitment impeccable. Your only concern is my happiness, you make me feel so special. I love you.");
        englist.add("Having Wife is a part of living But having Girlfriend along with Wife is a art of living.");
        englist.add("By all means marry. i fyou get a good wife, you'll become happy; if you get a bad one, you'll become a philosoper...");
        englist.add("One should choose a wife with the ears, rather than with the eyes.");
        englist.add("Compromising doesn't mean you are wrong and your wife is right. It means that the safety of your head is much more important than your ego. :) LOLz");
        englist.add("I love you and that will never change, you will always be in my heart now and forever.");
        englist.add("There is nothing nobler of more admirable than when two people who see eye to eye keep house as husband & wife, confounding their enemies and delighting their friends.");
        englist.add("My most brilliant achievement was my ability to be able to persuade my wife to marry me.");
        englist.add("Just when I think that it is impossible to love you any more, you prove me wrong.");
        englist.add("You are one of the best gifts I've ever gotten. I am so humbled God gave me you.");
        englist.add("I love living life with you and I live life for loving you. I love you.");
        englist.add("It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife.");
        englist.add("Wife: I have changed my mind. Husband: Does the new one work?");
        englist.add("Come live in my heart, and pay no rent.");
        englist.add("Marriage is a relationship in which one is always right and the other is the husband.");
        englist.add("I will never get tired of loving you and I hope you don't too.");
        englist.add("No man succeeds without a good woman behind him. Wife or mother, if it is both, he is twice blessed indeed.");
        englist.add("I'm having one of those days that make me realize how lost I'd be without you… Just wanted to let you know.");
        englist.add("What I love most about my home is who I share it with.");
        englist.add("Let husband and wife never speak to one another in loud tones unless the house is on fire...");
        englist.add("My husband and I are best of friends first and foremost. We fight like cats and dogs, but never stay mad for long. I was lucky to find him, he is in every way, my soulmate.");
        englist.add("I am so blissfully happy to have found the perfect man. Just the thought of you makes my heart race and my knees get weak. I'm crazy about you!");
        englist.add("The word wishlist doesn't exist in my dictionary anymore, for life has already fulfilled mine by giving me an awesome husband like you. I love you.");
        englist.add("All girls are DEVIL but my wife is QUEEN.... Of all of them :)");
        englist.add("A good wife always forgives her husband when she's wrong.");
        englist.add("They say that men are quite predictable, but I beg to differ. You always know how to surprise me and sweep me off my feet!");
        englist.add("Ever since the day you came into my life, I knew you will be there till the end of time.");
        englist.add("I have too many fantasies to be a housewife.... I guess I am a fantasy.");
        englist.add("Who cares if opposites attract or not? Even if we weren't opposites, I would've still loved you a lot.");
        englist.add("The best thing a girl can be is a good wife and mother. It is a girl's highest calling. I hope I am ready.");
        englist.add("In my house I'm the boss, my wife is just the decision maker :)");
        englist.add("A successful marriage requires Falling In love Many times, ALWAYS With The Same person.");
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