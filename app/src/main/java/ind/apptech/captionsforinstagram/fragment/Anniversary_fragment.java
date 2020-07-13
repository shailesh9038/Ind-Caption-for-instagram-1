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

public class Anniversary_fragment extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Anniversary_fragment() {
        // Required empty public constructor
    }

    public static Anniversary_fragment newInstance(String param1, String param2) {
        Anniversary_fragment fragment = new Anniversary_fragment();
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

        englist.add("Anniversary is the time to celebrate the beauty, the gift, and blessing of enduring of love.");
        englist.add("Happy Anniversary sweet heart. Words are not enough to say everything. I love you. Together we stand.");
        englist.add("1 year down and forever to go, Happy Anniversary.");
        englist.add("We've had a lot of years together.. but nowhere near enough. Happy Anniversary!");
        englist.add("A successful married always life requires falling in love many times, but always with the same person.");
        englist.add("For all this time I have been putting this puzzles of my life, then I realized, the last piece is you.");
        englist.add("May this day of your anniversary make your relation stronger and lovelier. Wish you a happy anniversary.");
        englist.add("Marriage is like a pack of cards. In the beginning it was hearts and a diamond, now all I’m wanting in my hand is a club and a spade.");
        englist.add("All my love for you FREE! wishing u a very Happy Anniversary!");
        englist.add("To the beautiful couple in all the land, May your anniversary be Happy and Grand.");
        englist.add("In a happy marriage it is the wife who provides the climate, the husband the landscape.");
        englist.add("18 years ago today I walked down the aisle and promised to love honor and cherish my lover and best friend, it is a decision I have NEVER regretted!");
        englist.add("From the first time we met I knew we were meant to be together God put us together and that way it “ill stay Happy Anniversary honey");
        englist.add("Most successful Happy married life is Defined as.. Yet to be seen!");
        englist.add("Love is there when both person are more concerned for the other than for one's self");
        englist.add("Two Keys to a lasting marriage “Respect and Communication”..");
        englist.add("Love begins in a moment, grows over time, and lasts for eternity.");
        englist.add("Love is the best refreshment in life.");
        englist.add("Love is the same for a poor man, and a king.");
        englist.add("Love is just a word until you find the right person to show it to.");
        englist.add("From the first time we met I knew we were meant to be together God put us together and that way it will stay Happy Anniversary honey");
        englist.add("It doesn't matter where you go in life, what you do, it's who you have beside you. I am truly blessed to be married to my soul mate for years today..");
        englist.add("There is no feeling more comforting and consoling than knowing you are right next to the one you love.");
        englist.add("Wishing you a wonderful life together as husband and wife.");
        englist.add("Marriage is like a dollar bill. You can’t spend half of it when you tear it in two. The value of one half depends upon the other. Happy Anniversary");
        englist.add("I think Love is the best refreshment in life.");
        englist.add("A happy wife is a happy life.");
        englist.add("Love is there when both person are more concerned for the other than for one's self.");
        englist.add("To the beautiful couple on this land, May your anniversary be Happy and Grand. Happy Anniversary");
        englist.add("Happy Anniversary to my dear love and very best friend.");
        englist.add("Love is there when both person are more concerned for the other than for one’s self");
        englist.add("Love begins in a moment, grows over time, and lasts for eternity..");
        englist.add("Happy anniversary from someone you're probably shocked knew it was your's.");
        englist.add("The first time I looked in your eyes I knew that I would do anything for you, The first time you touched my face, I felt what I never felt with anyone else.");
        englist.add("My love for you is like a circle, it has no end.");
        englist.add("Anniversary means another way of togetherness and love for the memory books.");
        englist.add("I only want to be with you twice.. now, and forever.");
        englist.add("Each moment of a happy lover's hour is worth an age of dull and common life.");
        englist.add("Married couples who love each other tell each other a thousand things without talking.");
        englist.add("May you both hold your hands together, till your last Breathe of life.. Long Live both.");
        englist.add("A perfect marriage is just two imperfect people who refuse to give up on each other.");
        englist.add("There`s always that one person who`d do anything for you. that`s the one you should marry.");
        englist.add("Anniversary is repetition of promises made with each other, love gets stronger.");
        englist.add("Each moment of a happy lover’s hour is worth an age of dull and common life.");
        englist.add("I am so lucky to have you as my husband and this is my best day in my life. Happy anniversary");
        englist.add("The world has grown suspicious of anything that looks like a happily married life..");
        englist.add("I only want to be with you twice…now, and forever.");
        englist.add("True love isn't love at first sight but love at every sight.Happy Anniversary.");
        englist.add("1 year down & forever to go, Happy Anniversary.");
        englist.add("May your love always go on increasing and remain blessed throughout life.");
        englist.add("A successful married life requires falling in love many times, but always with the same person.");
        englist.add("I want to wish an anniversary day to a couple who is beautiful in entire land. May your anniversary enhance your love and understanding.");
        englist.add("May this day of your anniversary make your relation stronger and lovelier.");
        englist.add("Long after our anniversary And this greeting has been thrown away Think of it.");
        englist.add("If you are really lucky, you will find one person who will walk through life with you no matter what.");
        englist.add("Happy Anniversary to the most amazing man I’ve ever known! Thank you for loving me, for me. I love you.");
        englist.add("I Cannot begin to imagine a life with out you in it. For the memories that we have created together could never compare to the touch that we share.");
        englist.add("A Wedding Anniversary is the celebration of Love, Trust, Partnership, Tolerance and Tenacity.");
        englist.add("On this special day, best wishes go to you, that this wonderful love u share, lasts your lifetime.");
        englist.add("It doesn’t matter where you go in life, what you do, it’s who you have beside you.");
        englist.add("A wedding anniversary is the celebration of love, trust, partnership, tolerance, and tenacity. Happy Anniversary");
        englist.add("From the first time we met, I knew we were meant to be together. God put us together and that way it will stay, Happy Anniversary honey. I love you forever.");
        englist.add("A good marriage would be between a blind wife and a deaf husband.");
        englist.add("Happy Anniversary to the one I’ll always want, even when I’m too old to remember what I’m supposed to want you for.");
        englist.add("We are work a progress with a lifetime contract.. Happy Anniversary.");
        englist.add("It's your Wedding Day So perfect and fine With all your friends round U To have a good time");
        englist.add("The world has grown suspicious of anything that looks like a happily married life.");
        englist.add("True love isn’t love at first sight but love at every sight.");
        englist.add("If at first you don't succeed, redefine success.");
        englist.add("Anniversary is a time to celebrate the joys of today, the memories of yesterday, and the hopes of tomorrow.");
        englist.add("As the end of today approaches, and the beginning of tomorrow nears, Bow your heads and pray, for all who shed those tears.");
        englist.add("Our anniversary is a time to look back at the good times and a time to look ahead to live our dreams together.");
        englist.add("Love begins in a moment, grows over time,and lasts for eternity.");
        englist.add("Love is there when both persons's are more concern for the other than for one's self.");
        englist.add("Blessings and your teachings in making my life meaningful.Thank you for being my life.");
        englist.add("Are we not like two volumes of single book?");
        englist.add("I was incomplete without you.. I thank God that we met and we are together now.");
        englist.add("Marriage is like a dollar bill. You can't spend half of it when you tear it in two. The value of one half depends upon the other. Happy Anniversary.");
        englist.add("It doesn’t matter where you go in life, what you do, it’s who you have beside you. I am truly blessed to be married to my soul mate for years today..");
        englist.add("Happy Anniversary to my loving hubby. Thank you for the last 11 yrs. and many more yrs. to come. Thank you for making me the happiest woman. I love you always.");
        englist.add("Two Keys to a lasting marriage.. Respect and Communication");
        englist.add("On this our anniversary, we may not have wealth, but we do have each other and that is worth more than anything in the world.");
        englist.add("Marriage is like a pack of cards. In the beginning it was hearts and a diamond, now all I'm wanting in my hand is a club and a spade.");
        englist.add("A wedding is just like a funeral except that you get to smell your own flowers.");
        englist.add("Love is just a word until someone comes along and gives it meaning.");
        englist.add("There's always that one person who'd do anything for you. that's the one you should marry.");
        englist.add("Happy anniversary honey, they said we couldn't last this long. Proved them wrong huh?");

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