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

public class Birthday_fragment extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Birthday_fragment() {
        // Required empty public constructor
    }

    public static Birthday_fragment newInstance(String param1, String param2) {
        Birthday_fragment fragment = new Birthday_fragment();
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

        englist.add("Happy, Happy Birthday! I hope the day has been blessed with the presence of those you love most, and many magical moments!");
        englist.add("Count your nights by stars, not shadows. Count your days by smiles, not tears. On your birthday, count your age by friends, not years.");
        englist.add("May this day bring countless happiness and endless joy and live with peace and serenity. Happy Birthday.");
        englist.add("As friends go, you're not one of the best. You're THE best! May this year's birthday be the best ever for you.");
        englist.add("May this day be the beginning of another beautiful year for you. May there be pleasant surprises, loads of joy and infinite happiness. Wish you a very happy birthday.");
        englist.add("Age is whatever you think it is. You are as old as you think you are..");
        englist.add("Birthdays are the milestones of this adventurous journey which we call life.");
        englist.add("Wishing you all the fun and excitement that only birthdays can bring.");
        englist.add("Some like Sunday some like Monday, but I like your birthday. Happy birthday.");
        englist.add("Thinking of you on your birthday and wishing you everything that brings happiness today and tomorrow. Happy birthday");
        englist.add("Trying to look happy when no money falls out of your birthday card.");
        englist.add("I send to you warm wishes, that your happiness will be as wonderful as the happiness, you have always given me.Wish you happy Birthday.");
        englist.add("God bless this special best friend of mine with all happiness and accomplishment in life.I’m truly blessed to have yo as my best est buddy.");
        englist.add("Hopes your tiny, soul-sucking cubicle provides you a warm atmosphere in which to celebrate your birthday.");
        englist.add("May every Birthday remind you the number of people who love you and can't do without you. I'm one of them! Happy Birthday.");
        englist.add("Remember that when its not yours and be nice to your friends today. Happy Birthday!");
        englist.add("Wish you many more happy returns of the day. May God bless you with prosperity, good health and peaceful life.");
        englist.add("Actually, I didn't forget your birthday, but since you forgot mine I waited until a day after to send this.");
        englist.add("You mean everything to me … I Love You … HAPPY BIRTHDAY! Have a day as special as you are!");
        englist.add("Happy Birthday to you. may you have many more. you have been a great friend to me. i have a little wish, may we be friends, till the world ends.");
        englist.add("This brings a birthday message especially to say you are wished the finest things in life today and every day. Happy Birthday");
        englist.add("I have no birthday that means I was not born therefore I cannot die..");
        englist.add("All I got you for your birthday was this post. Hope you enjoy it! Try not to read it all at once. Happy Birthday");
        englist.add("Happy birthday to you is the most sung song in the world and it has been sung in space as well.");
        englist.add(":) May this day bring countless happiness and endless joy and live with peace and serenity. Happy Birthday");
        englist.add("I hope that 4 every candle on your cake u get a wonderful surprise.. Happy birthday.");
        englist.add("Tere birth day ko mai tuze kya du wish you happy return of the day");
        englist.add("It's the simplest things that make your life count, like a simple wish. Happy Birthday!");
        englist.add("Sending birthday blessings filled with love and peace and joy wishing sweetest things happen right before your eyes.");
        englist.add("For u i am always here to stay,each year to wish happiest birthday.");
        englist.add("Wishing you all the best that life has to offer on your birthday. May you always stay happy and blessed!");
        englist.add("May you live as long as you want and never want as long as you live.");
        englist.add("Our friendship is made of gold and it will never rust, will stay precious until the world turns to dust. Happy Birthday and may your every wish come true!");
        englist.add("The sun rose today with a very special charm, the clouds cleared today with a very special intent and the trees are all swaying in unison - just to wish you a very Happy Birthday.");
        englist.add("I send to you warm wishes,that your happiness will be as wonderful as the happiness, you have always given me. wish you happy birthday");
        englist.add("It's hard to find a birthday present that says I think your a douche but I still want a piece of your cake please.");
        englist.add("A birthday is just the first day of another 365 days journey around the sun.Enjoy the trip, Happy Birthday.");
        englist.add("I may not celebrating your special day with you but i want you to know that i am thinking of you and happy birthday.");
        englist.add("Hope your birthday blossoms into lots of dreams come true! May today be filled with laughter and love. Happy Birthday and many happy returns of the day.");
        englist.add("God bless this special best friend of mine with all happiness and accomplishment in life. I'm truly blessed to have yo as my best est buddy.");
        englist.add("Happy birthday to one of the coolest people I know, who only gets cooler with age.");
        englist.add("On your birthday lots of people are thinking of you. I just wanted to let you know that I am one of them..");
        englist.add("Birthday cake is the only food you can blow on and spit on and everybody rushes to get a piece.");
        englist.add("Happy birthday to someone close to me. Hope all the angels are singing to you in heaven.");
        englist.add("Your birthday is a special time to celebrate the gift of 'you' to the world.");
        englist.add("I’m not just a year older I’m also a year better and prettier. I know your jealous.");
        englist.add("Am so glad to have a friend like u happy birthday.");
        englist.add("I may not look my age but I sure as hell feel it.");
        englist.add("From the bottom of my heart, I wish you a very happy birthday. May it be filled with love, blessings, and joy.");
        englist.add("I have no birthday that means I was not born therefore I cannot die.");
        englist.add("Happy Birthday to the most amazing man ever.. I love you soo much..");
        englist.add("May God shower his choicest blessings on you. wishing you happiness, good health and a great year ahead.");
        englist.add("Thanks to everyone for the Birthday wishes! To anyone who missed it.”No cake for you!”");
        englist.add("On your big day you are wished all that you hope for, all that you dream of, all that makes you happy.");
        englist.add("Just want to THANK ALL OF YOU for making me feel special on my Birthday, Love You Guys!");
        englist.add("Just Dropped In To Wish You A Birthday Full Of Happiest!!");
        englist.add("No matter where life takes us, no matter how far we are from each other, the memories of our friendship will remain in my heart forever. Happy birthday.");
        englist.add("Set the world on fire with your dreams and use the flame to light a birthday candle. HAPPY BIRTHDAY !!");
        englist.add("May this birthday bring you good luck and fortune. May it bring you oodles of true love and friendship. Have an amazing birthday.");
        englist.add("Happy Birthday to the most amazing man ever..");
        englist.add("In soft gleaming of stars....may all ur dreams come true, may every star of every night bring love and joy to you happy birthday..");
        englist.add("There are two bright stars in the sky today, one is the Star of God and one is you! I hope you keep shining bright for the rest of your life. Happy Birthday!");
        englist.add("Birthdays are 4 fun Enjoy a sticky bun I'm glad u r my mate Hope your birthday's great.");
        englist.add("Birthdays are good for you. The more you have, the longer you live.");
        englist.add("Secret sharer Fashion consultant Comfort giver Co-diet buster Co-operative bank always beside me like best friend today is really special day Very Happy Birthday.");
        englist.add("May you be gifted with life's biggest joys and never-ending bliss. After all, you yourself are a gift to earth, so you deserve the best. Happy Birthday.");
        englist.add("Better early than late, especially when it comes to wishing my best mate. Happy birthday.");
        englist.add("God think the world is beautiful then he born u Happy Birthday!!!");
        englist.add("LIKE A FRESH DEWDROPS of a new day...may GOD'S loving u hands be upon u today to freshen your soul and body! Happy birthday.");
        englist.add("Life is very short, So enjoy every moment, Don't lose your confidence go always ahead Happy birthday.");
        englist.add("For all the advances in medicine, there is still no cure for the common birthday.");
        englist.add("I may not be celebrating your special day with you but I want you to know that I am thinking of you & wishing you a HAPPY BIRTHDAY.");
        englist.add("Nobody wished me a happy birthday today, which isn’t surprising really, since it isn’t my birthday…");
        englist.add("On your b'day, some words of wisdom... smile while u still have teeth. happy b'day.");
        englist.add("Life is very short, So enjoy every moment, Don't lose Ur confidence Go always ahead.Happy Birthday.");
        englist.add("I wish you a very Happy and warm Birthday. Your friendship has touched all of us. May you get all you desire.");
        englist.add("Actually, I didn’t forget your birthday, but since you forgot mine I waited until a day after to send this.");
        englist.add("Happy birthday to the most sweetest and sugary person I know, Have an awesome day ahead and stay blessed, Happy birthday!");
        englist.add("May this birthday of yours bring you good luck and fortune. But even more than that, may it bring you oodles of true love and friendship. Happy Birthday");
        englist.add("Thinking of you with love on your birthday and wishing you everything that brings you happiness today and always. Happy Birthday Sweetheart.");
        englist.add("I wish you happy birthday i wish you many more, i wish you peace and happiness....");
        englist.add("Believing hear, what you deserve to hear: Your birthday as my own to me is dear...But yours gives most, for mine did only lend Me to the world, yours gave to me a friend.");
        englist.add("The sun is shining more brightly today as a way to wish you happy birthday.");
        englist.add("Wishing you a birthday filled with sweet moments and wonderful memories to cherish always! Happy Birthday.");
        englist.add("Happy Birthday even though I tried to kill you all those times when we were kids.");
        englist.add("You celebrate your birth day am also coming and we enjoy together. happy birth day to you.");
        englist.add("You're older today than yesterday but younger than tomorrow, Happy Birthday!");
        englist.add("Birthdays are good for you. Statistics show that the more you have the longer you live.");
        englist.add("Its another day 4 u. god picked another petals on your flower, wishing your flowers may bloom for year,");
        englist.add("On your Birthday, all I want to tell you is that you should be regret-free and disease-free! Wishing you a Happy Birthday.");
        englist.add("May your birthday be the window which opens A million vistas that help you in the fulfillment of Ur dream and accomplishment of your goals... Happy Birthday");
        englist.add("To me,”being the bigger person” means wishing a happy birthday on facebook to people who did not wish me one.");
        englist.add("Some like sunday some like monday, but i like your birthday.happy birthday my sweetheart.");
        englist.add("Here's wishing a Happy Birthday to the most charming, funny, attractive and rocking personality in town. Have a great day.");
        englist.add("How do you expect me to remember your birthday, when you never look any older? happy birthday!");
        englist.add("When god made u he was having a good day! coz ur so special , so kindhearted , that its difficult 2 tell in words ... happy b irthday");
        englist.add("Birthdays used to be almost sacred... now its a simple status update and people only react according, not personally.");
        englist.add("Happy Birthday to one of the few people whose birthday I can remember without a Facebook reminder.");
        englist.add("I look forward to enjoying our friendship for many more of your birthdays.");
        englist.add("Did you know i was born on my birthday…");
        englist.add("Hope lovely surprises Are coming your way, To make your Birthday A wonderful day!");
        englist.add("Didn’t I already celebrate this birthday, like 2 birthdays ago?");
        englist.add("Wishing you a birthday filled with sweet moments and wonderful memories to cherish always! Happy Birthday");
        englist.add("May all happiness come 2 u in all your rest life.many many happy returns of the day.");
        englist.add("I pray that your birthday is rich in good faith and love as you celebrate another year of blessed life, dear friend.");
        englist.add("I get so excited when someone brings out the cake at a birthday party because that means I can leave soon.");
        englist.add("Sending birthday blessings filled with love and peace and joy wishing sweetest things happen right before your eyes");
        englist.add("Today, Not 1 person said HAPPY BIRTHDAY to me It wasn’t a shock today not my birthday");
        englist.add("May it be the best day of your life thus far, & may your happiness grow with each passing day through the many many birthdays that surely are ahead of you.");
        englist.add("Its another birthday for you.God picked another petals on your flower,wishing your flowers may bloom for year. MANY more happy return's of the day.");
        englist.add("Happy birthday, my friend. I can’t imagine celebrating with anyone else.");
        englist.add("All I got you for your birthday was this post. Hope you enjoy it! Try not to read it all at once. Happy Birthday.");
        englist.add("Birthdays are best celebrated with lots of chocolates, wine, friends and close ones. May you have a great Birthday. Don't forget to invite me!");
        englist.add("When I think of my favorite foods, I can never make up my mind. But when I think of my favorite people, I immediately know that means YOU! Happy Birthday.");
        englist.add("Without my driver’s license, you’ll just have to believe the age I tell you.");
        englist.add("Yes, today is my birthday, Therefore I will be treated like a Queen..");
        englist.add("Finding a great friend is like looking for a four leaf clover. But I did get lucky! Happy Birthday! May beauty and happiness surround you today and beyond.");
        englist.add("Birthdays are natures way of telling us to eat more cake.");
        englist.add("A birthday is just the first day of another 365-day journey around the sun. Enjoy the trip. HAPPY BIRTHDAY");
        englist.add("Happy Birthday. Wishing you more glorious and wonderful years on the surface of the earth – or wherever you might be.");
        englist.add("Wishing you tons of happiness and joy on your special day. Happy Birthday my mate!");
        englist.add("Life is boring when you are not around. Happy Birthday to you - let's make it grand!");
        englist.add("The best Birthday wish that you can get for the day is that may you live each moment of your life to the very fullest, without any regrets. Happy Birthday!");
        englist.add("May your birthday be filled with smiles, sunshine, love, and laughter.");
        englist.add("No wise man ever wished to be younger..");
        englist.add("All i got you for your birthday was this post. Hope you enjoy it! Try not to do this all once.Happy Birthday.");
        englist.add("Age is something that doesn’t matter, unless you are a cheese.");
        englist.add("Wishing an amazing day and many great things to come to a wonderful person. Happy birthday.");
        englist.add("May every glowing candle on your cake transform into a wish that will turn into reality.");
        englist.add("Define Birthday? “The one and only day in your life when you were crying and your mother was laughing.”");
        englist.add("On your birthday lots of people are thinking of you. I just wanted to let you know that I am one of them. Happy Birthday!");
        englist.add("May your birthday be filled with many happy hours and your life with many happy birthdays. HAPPY BIRTHDAY");
        englist.add("On your birthday, today, I wish you a year with loads of fun, excitement and beautiful memories. Happy birthday.");
        englist.add("Happy Birthday, my friend. I can't imagine celebrating with anyone else.");
        englist.add("Hope your birthday blossoms into lots of dreams come true!May today be filled with laughter and love happy birthday.");
        englist.add("Happy Birthday to the MOST WONDERFUL, AWESOME, BEAUTIFUL, COURAGEOUS and GREAT FRIEND you are... Have an awesome Birthday.");
        englist.add("Moments of joy you've given me…Are pearls of my life's garland, You've made things so beautiful…Happy Birthday.");
        englist.add("The world changed forever the day you were born. As your best friend, I'm glad that day happened. Happy Birthday, my friend! Live long and prosper!");
        englist.add("I am wondering why google hasn’t changed its logo as it was my birthday?");
        englist.add("Only people with lots of luck and good karma get best friends like you. Stick with me forever. Happy Birthday!");
        englist.add("Thinking of you with love on your birthday and wishing you everything that brings you happiness today and always.");
        englist.add("Happy Birthday! I hope its filled with love, laughs, and family..");
        englist.add("Whenever you cross one of these milestones, thank God for all his blessings and move forward with a new enthusiasm.");
        englist.add("The fact that a Facebook reminder told me it was your birthday doesn’t make it any less special.");
        englist.add("Happy Birthday to my sister!! I hope you have the best birthday of all time for the best girl of all time. Something like that!! :)");
        englist.add("Thinking of you and the good times we spent make me smile! Happy birthday to a friend who is always close to my heart.");
        englist.add("Am I the only one who feels like a complete idiot when other people sing Happy Birthday to you...");
        englist.add("You need to enjoy and have fun on your Birthday as much as people have enjoyed having you in their lives. Happy Birthday!");

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