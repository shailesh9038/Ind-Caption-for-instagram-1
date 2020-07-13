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

public class NewYear extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public NewYear() {
        // Required empty public constructor
    }

    public static NewYear newInstance(String param1, String param2) {
        NewYear fragment = new NewYear();
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

        englist.add("New Year is the time when, all your hopes are new, so are your aspiration, new are your resolutions and new are your spirits.. so here's wishing everyone a very promising, fulfilling and a very happy New Year!!");
        englist.add("Hope the New Year showers you with.. All that is beautiful! Happy New Year !");
        englist.add("Have a Fun-Filled, Smashing, Rocking and happening New Years!");
        englist.add("No matter how stronger person you are, there's still someone who can make you weak.");
        englist.add("I wish this year has lesser disasters, lesser hate, lesser accidents and loads of love. Happy New Year .");
        englist.add("I will spend less than one hour a day on the Internet. This, of course, will be hard to estimate since I'm not a clock watcher.");
        englist.add("Sealed with BLESSINGS 2 Keep u HAPPY and SAFE all the life long. HAPPY NEW YEAR..");
        englist.add("Being sober and alone is so much fun on New Years Eve!");
        englist.add("May God be compassionate to you in the New Year!");
        englist.add("I am happy to celebrate New Years, another year to be with you.");
        englist.add("The Only Way To Spend New Year's Eve Is Either Quietly With Friends.");
        englist.add("Good resolutions are simply checks that men draw on a bank where they have no account.");
        englist.add("Many people look forward to the New Year for a new start on old habits.Happy New Year .");
        englist.add("Happy new Year to all. Have a magical, rocking nd happening new year ahead.");
        englist.add("I honestly hope each and every one of you have the best year ever in New Year.");
        englist.add("I have the opportunity Once more to right some wrongs, To pray for peace, to plant a tree, And sing more joyful songs!");
        englist.add("It is time to forget the past and celebrate a new beginning. Happy New Year .");
        englist.add("Cheers to a new year and another chance for us to get it right.");
        englist.add("Celebrate what you want to see more of.");
        englist.add("An optimist stays up until midnight to see the New Year in. A pessimist stays up to make sure the old year leaves.");
        englist.add("I have got the best business idea of 2018, I am going to start Facebook rehab centers throughout country.");
        englist.add("I resolve to work with neglected children - my own.");
        englist.add("Don't forget the past, learn from it. Happy New Year .");
        englist.add("On the onset of new year sending you the warmest of wishes.");
        englist.add("Fill your life with Happiness and Bright Cheer, Bring to u Joy and Prosperity for the whole Year.");
        englist.add("New Year, same goal.");
        englist.add("In life we never lose friends, we only learn who the true one's are.");
        englist.add("Every man regards his own life as the New Year’s Eve of time.");
        englist.add("For last year's words belong to last year's language And next year's words await another voice.");
        englist.add("No one can go back and start a new beginning, but anybody can start today and make a new ending.");
        englist.add("Wish you happy holiday's season with unforgettable Christmas and New Year.");
        englist.add("In the New Year, may your right hand always be stretched out in friendship, never in want.");
        englist.add("Here's to the end of another strange year we'll one day be strangely nostalgic for.");
        englist.add("If you are not happy being single you will never be happy in a relationship. Get your own life and love it first, then share it.");
        englist.add("Here is a wishing that the coming year is a glorious one that rewards all your future endeavors with success. Happy New Year.");
        englist.add("Every year we try to diet and exercise. Maybe this year our plans will actually work. Happy New Year friend.");
        englist.add("There will be something that is taken from the previous year. Use it if it is good and throw away if it is not.");
        englist.add("My new year resolution is.. stop making resolutions !");
        englist.add("One resolution I have made, and try always to keep, is this: To rise above the little things.");
        englist.add("FAITH, Evening brings LOVE, Night brings REST, Hope you will all of them everyday. HAPPY NEW YEAR.");
        englist.add("Don’t wait for a new year to change your perspective. Get up and be proactive today!");
        englist.add("New year brings just happiness not tear, every body loves only you dear.");
        englist.add("May New Year be Delightful n auspicious.. Happy New Year !");
        englist.add("Wish your Life always remains Bright throughout. Have a rocking New year.");
        englist.add("Sending you wishes for a happy year filled with health, prosperity, love and loads of fun!");
        englist.add("Cheers to the New Year. May it be a memorable one. Happy New Year .");
        englist.add("May we live each page with more meaning by touching people's lives each day.Happy New Year !");
        englist.add("Wish you and your family a happy, healthy, prosperous and successful new year ahead.");
        englist.add("Kids love New Year for magic, losers-to gain new hopes and the others just for fun and joy.");
        englist.add("Angelina Jolie, Brad Pitt, Kim Kardashian, Beyonce, George Clooney and ME! All the famous wish you a very Happy New Year !");
        englist.add("Last year: single this year: single next year: single next decade: single.");
        englist.add("Wishing you a fabulous 2013 with full of great achievements and experiences. A meaningful chapter waiting to be written HAPPY NEW YEAR!");
        englist.add("I will think of a password other than password.");
        englist.add("That's it for me I hear my bed call so sweet dreams my friends and good night to all.");
        englist.add("May the New Year be filled with happiness and prosperity to you!");
        englist.add("May the New Year bring happiness, success, love, and loads of luck into your life!");
        englist.add("Best wishes for the holidays and for health and happiness throughout the coming year.");
        englist.add("New Year's Day: Now is the accepted time to make your regular annual good resolutions. Next week you can begin paving hell with them as usual.");
        englist.add("Housework is what a woman does that nobody notices unless she hasn't done it.");
        englist.add("Ur success happiness lies in U.. Resolve to keep happy n your joy.. happy new year to all my friends.");
        englist.add("A New Year's resolution is something that goes in one year and out the other.");
        englist.add("New Year's most glorious light is sweet hope!");
        englist.add("New Year's Resolution: To tolerate fools more gladly, provided this does not encourage them to take up more of my time.");
        englist.add("May the year to follow be among the best you ever spent!Happy New Year !");
        englist.add("May this new year bring many opportunities your way, To explore every joy of life and turning all your dreams into reality and all your efforts into great achievements.");
        englist.add("Wish you happy holidays season with unforgetable Christmas and New Year.");
        englist.add("A wish for a successful new year!");
        englist.add("Don’t bring your 2012 issues into 2013. Have a new mind set to do new things for the new year.");
        englist.add("To beat the New Year traffic, leave when the countdown is at 6.");
        englist.add("Relationships these days are a joke. It's like April 1st all year long ..");
        englist.add("May the coming year bring more happiness to you than last year. May you have an amazing year. Happy New Year .");
        englist.add("New year is the time of the year when you tell stupid people how good they are ;-)");
        englist.add("Wish all my dearest friends a great beginning to... 'Twenty Eighteen (2018)' Feel 20 and Look 18! :D");
        englist.add("There's always that one person who U want to talk to all night long !!");
        englist.add("The New Year will be like the old one if you keep on doing the same old things.");
        englist.add("May the new year bring U courage to break your resolution early!");
        englist.add("Happiness is too many things these days for anyone to wish it on anyone lightly. So let's just wish each other a bileless New Year and leave it at that.");
        englist.add("I was going to make my new years resolution to procrastinate more, but decided to wait until next year.");
        englist.add("You will be a little bit older, a little bit rounder, but still none the wiser. Happy New Year !");
        englist.add("Every man should be born again on the first day of JANUARY. Start with a fresh page.");
        englist.add("We are in the last month of the year.. Just felt I should thank everyone who made me smile this year. You are one of them so here's a big THANK YOU.");
        englist.add("So work on your present to make yourself a wonderful future. Happy New Year .");
        englist.add("New Year's Eve is finally here, where we can be drunk in public and no one minds. That's why this is the best holiday.");
        englist.add("Smiles from the threshold of the year to come, Whispering 'it will be happier'..");
        englist.add("I blame Disney movies for making me grow up believing everything has a happy ending.");
        englist.add("Drop the last year into the silent limbo of the past. Let it go, for it was imperfect, and thank God that it can go.");
        englist.add("Wish you happy holidays season with unforgettable Christmas and New Year.");
        englist.add("Happy New Year Everyone!");
        englist.add("Every year I make a resolution to change myself.. this year makeing a resolution to be myself!");
        englist.add("I will try to figure out why I 'really' need nine e-mail addresses.");
        englist.add("Don't wait for a new year to change your perspective. Get up and be proactive today!");
        englist.add("I will do less laundry and use more deodorant.");
        englist.add("To a New Year and a new beginning..");
        englist.add("Have a rocking new year Happy New Year .");
        englist.add("A new year is unfolding like a blossom with petals curled tightly concealing the beauty within.");
        englist.add("Yesterday is a memory, today is a gift, tomorrow is a hope. Wishing u all the best!");
        englist.add("There will be always something old in the New Year!");
        englist.add("The best thing about this year was meeting you.");
        englist.add("Heartiest Wishes To All My Most Beautiful, Charming, Lovely and Gorgeous Facebook Friends On This New Year !!");
        englist.add("Wish you a very Happy New year. Shed your worries and remain happy always.");
        englist.add("May this new year all your dreams turn into reality and all your efforts into great achievements.");
        englist.add("May God fulfill all your wishes in the new year!");
        englist.add("Meeting you was the best part of my year.");
        englist.add("A life without love is like a year without summer.");
        englist.add("My New Year's resolution is to spend more time wishing my enemies were dead.");
        englist.add("On This New Year, Have A Healthy and Wealthy New Year");
        englist.add("On new years I wanna be downtown with a special date!");
        englist.add("I'm so excited for the new year. Unfortunately, I don't have any resolutions to make since I'm already perfect.");
        englist.add("New Years Eve isn't about dressing up. It's about dressing down.");
        englist.add("Just for today, I will not sit in my living room all day in my nightdress. Instead, I will move my computer into the bedroom.");
        englist.add("I wish you end up fighting less with your partner over TV remote this New Year!");
        englist.add("Heartfelt wishes for the New Year.");
        englist.add("Smiling for someone is sweet but making someone smile is the best feeling.");
        englist.add("Embrace the year with an open heart to attract more beautiful things. Happy New Year .");
        englist.add("New Year begins, let us pray that it will be a year with peace, happiness and abundance of new friends, God bless us throughout the New Year.");
        englist.add("I will stop sending e-mail, ICQ, Instant Messages and be on the phone at the same time with the same person.");
        englist.add("My girlfriend asked if I would swim across the ocean for her, and I said It’s freaking, I’ll rent a boat…..");
        englist.add("New Year's is the time to forget all your fears, drink a few beers, leave behind all your tears.");
        englist.add("Peace be unto you! May you see the grace of God this year");
        englist.add("May there be showers of blessings this new year!");
        englist.add("Leave the past behind. It's a brand new year, make it count.");
        englist.add("It Wouldn't Be New Year's If I Didn't Have Regrets.");
        englist.add("Last year I didn't even know his name. But this year? I write it more then my own");
        englist.add("Every story has an ending, but in life.. every ending is just a new beginning.");
        englist.add("Tag your beloved to wish him/her Happy New Year .");
        englist.add("Every man regards his own life as the New Year's Eve of time.");
        englist.add("Wish You A Vivid, Joyful And Wealthy Happy December With The Blessings Of God.");
        englist.add("Have a great year ahead ! HAPPY NEW YEAR !!");
        englist.add("Before my mobile network gets jammed let me wish you a very happy new year..");
        englist.add("Life is beautiful, enjoy it. HAPPY NEW YEAR");
        englist.add("I made no resolutions for the New Year. The habit of making plans, of criticizing, sanctioning and molding my life, is too much of a daily event for me.");
        englist.add("let each new year find you a better man.Happy New Year .");
        englist.add("Happiness keeps you sweet Trials make you strong Sorrows make you humble Success keeps you glowing and God keeps you going. May you have a greatest new year.");
        englist.add("New Year's is a harmless annual institution, of no particular use to anybody save as a scapegoat for promiscuous drunks, and friendly calls and humbug resolutions.");
        englist.add("It is never to late to start again but yes it is always very early when one gives up.Happy New Year .");
        englist.add("I will not bore my boss by with the same excuse for taking leaves. I will think of some more excuses.");
        englist.add("I Heartily wish a beautiful tomorrow for you and your family!Happy New Year !");
        englist.add("Wishing you and your loved ones peace, health, happiness and prosperity.");
        englist.add("We will open the book. Its pages are blank. We are going to put words on them ourselves. The book is called Opportunity and its first chapter is New Year’s Day.");
        englist.add("So many things have happened in this past year.");
        englist.add("Tomorrow, is the first blank page of a 365 page book. Write a good one.");
        englist.add("Don't bring your Past issues into New-year. Have a new mind set to do new things for the new year.");
        englist.add("May you create for you and your loved ones the most Happy New Year ever!");
        englist.add("I will give up chocolates totally. 100%. Completely. Honestly..");
        englist.add("Irrespective of whatever it is, Wish you a very happy new year.. LOL:)");
        englist.add("If you asked me for my New Year Resolution, it would be to find out who I am.");
        englist.add("Are you taking any foreign language classes this year? Math.");
        englist.add("Happy new year friends.. I wish you all get success and happiness in your life and spend each coming day wonderfully.");
        englist.add("May Year To Follow Be Among The Best U have Ever Spend. Happy New Year .");
        englist.add("Wishing you happiness and success in life for this New Year. May God bless you");
        englist.add("Sending you a warm 'Hello'and wishing you a.Happy New Year !");
        englist.add("Always bear in mind that your own resolution to succeed is more important than any other.");
        englist.add("To a healthy, happy and peaceful New Year!");
        englist.add("Season's Greetings and best wishes for the New Year.");
        englist.add("May each day of the coming year be vibrant and new bringing along many reasons for celebrations.");
        englist.add("A year from now you may wish you had started today.");
        englist.add("May you exceed the limits of prosperity and success in the New Year!");
        englist.add("First you take a drink, then the drink takes a drink, then the drink takes you.");
        englist.add("Now what do I do? I haven't made any plans for New Year's since the world was going to end.");
        englist.add("My resolution is to spend less time working which means you'll have to work more.");
        englist.add("A lot can happen in a year..");
        englist.add("Another fresh new year is here.. Another year to live! To banish worry, doubt, and fear, To love and laugh and give!");
        englist.add("Most people look forward to the New Year for a fresh start on old habits.");
        englist.add("Tom Cruise, Angelina Jolie, Aishwarya Rai, Arnold, Jennifer Lopez, Amitabh Bachhan & Me.. All the Stars wish You a Very Happy New Year.");
        englist.add("The most fun part about making New Year's resolutions is breaking New Year's resolutions. Can't wait to mess up with you.");
        englist.add("Let New Year Day be a New Life Day.");
        englist.add("Each age has deemed the new-born year the fittest time for festal cheer.");
        englist.add("May you Commit and Create the best New Year ever!");
        englist.add("I wanna kiss you on December 31st from 11:59 pm to 12:01 am, so I can have an amazing ending to 2013 and a beautiful beginning into 2018.");
        englist.add("New years- the only day where its socially acceptable to drink this early.");
        englist.add("Self improvement is a never-ending task. Happy new year.");
        englist.add("He who breaks a resolution is a weakling.. He who makes one is a fool.");
        englist.add("One glass water, one glass beer. O my dear, happy new year.");
        englist.add("Fun, Joy, Happiness, Peace, Love, Luck, Will Come Near, With My Special Wish Happy New Year !");
        englist.add("Happy New Year friend. I hope you saved some champagne because I'm going to need some drinks all year.");
        englist.add("A weasel comes to say Happy New Year to the chickens....");
        englist.add("A simple New Years resolution, forget your PAST for a better FUTURE.");
        englist.add("I'm a little bit older, a little bit wiser, a little bit rounder, but still none the wiser.");
        englist.add("Good resolutions are simply checks that men draw on a bank where they have no account. ~Oscar Wilde");
        englist.add("New Happiness and abundance of new friends, God bless you through out the New Year.");
        englist.add("Wishing You A Year Filled With Great Joy Peace And Prosperity Have A Wonderful Year Ahead Happy New Year !!!");
        englist.add("Don't let the shadows of yesterday spoil the sunshine of tomorrow. Live for today.");
        englist.add("One can go back in time to change what has happened. So work on your present to make yourself a wonderful future. Happy New Year .");
        englist.add("Many people look forward to the New Year for a new start on old habits.");
        englist.add("This bright new year is given me To live each day with zest.. To daily grow and try to be My highest and my best!");
        englist.add("God bless you always and may New Year 2018. Bring you a lot of Love and Happiness.");
        englist.add("Dear Luck, can we be friends in 2018 Please..");
        englist.add("This nation will remain the land of the free only so long as it is the home of the brave.");
        englist.add("Celebrate what you want to see more of. Happy New Year .");
        englist.add("New Year’s Day is every man’s birthday.");
        englist.add("May you be blessed with joy and happiness all the year round.");
        englist.add("May this New Year be the best for you and your family. Happy New Year .");
        englist.add("You are a dreamer, and you are an achiever. May you dream and achieve bigger feats, with every passing year. All the best for the New Year.");
        englist.add("Extremely Happy New Year 2018! May we all lose our belly fat and unsightly pimples, get gorgeous hair and hefty pay-raises and may the wrath of the Almighty fall upon anyone who looks prettier than us in group photographs.");
        englist.add("Let us not drink to the past, but to the future.");
        englist.add("I will no longer waste my time relieving the past, instead I will spend it worrying about the future.");
        englist.add("Expand Your Circles As You Welcome This New Year, Turn Your Friends Into Benefits.");
        englist.add("Last year we got older and slower but we had a good time. Let's make sure we do the same in this new year.");
        englist.add("We meet today To thank Thee for the era done, And Thee for the opening one.");
        englist.add("With all fragrance of a rose and lights of the sun, I wish you a happy new year.");
        englist.add("Wishing you love, happiness and prosperity in this New Year. Enjoy each day.");
        englist.add("New year full of smiles!");
        englist.add("The object of a new year is not that we should have a new year. It is that we should have a new soul.");
        englist.add("May this New Year bring actual change in you, not recurrence of old habits in a new package!");
        englist.add("There are 365 days in a year but only 360 degrees in a circle. What happened to the other 5?");
        englist.add("Beauty.Freshness.Dreams.Truth.Imagination.Feeling.Faith.Trust.This is beginning of a new year!!");
        englist.add("May all your troubles last as long as your New Year's resolutions.");
        englist.add("Maturity is when you realize that new year won't change your life.");
        englist.add("The problem with new years resolutions is that people aim to high, start small like.");
        englist.add("Politicians are a lot like diapers. They should be changed frequently, and for the same reasons.");
        englist.add("For my New Year's Resolution - I will Stop ignoring the auto-correct.");
        englist.add("Youth is when you're allowed to stay up late on New Year's Eve. Middle age is when you're forced to.");
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