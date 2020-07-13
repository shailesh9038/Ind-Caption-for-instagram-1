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

public class Marriage extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Marriage() {
        // Required empty public constructor
    }

    public static Marriage newInstance(String param1, String param2) {
        Marriage fragment = new Marriage();
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

        englist.add("Congratulations! God bless you today and for the rest of your married lives");
        englist.add("A wedding is just like a funeral except that you get to smell your own flowers.");
        englist.add("Our delight knows no bounds on the day of your wedding. Wish that you carry this serene bond from strength to strength with each passing day.");
        englist.add("Marriage is a three ring circus: an engagement ring, a wedding ring, & suffering.");
        englist.add("I believe that marriage should not be public. It's a about two persons, nobody else.");
        englist.add("Don’t smother each other. No one can grow in shade");
        englist.add("Marriages are made in heaven, but so are thunder and lightning");
        englist.add("We call marriage successful if wealthy man married a beautiful and rich girl.");
        englist.add("The best time to love with your whole heart is always now, in this moment, because no breath beyond the current is promised.");
        englist.add("It's easy to fall in love. The hard part is finding someone to catch you.");
        englist.add("Marriage is not just spiritual communion, it is also remembering to take out the trash.");
        englist.add("Love one another and you will be happy. It's as simple and as difficult as that.");
        englist.add("The wedding ring goes on the left ring finger, because that’s the only finger that has a vein that goes directly to heart.");
        englist.add("The day we say I DO will be the greatest day of my life.");
        englist.add("Wishing you all the love and happiness in the world and congratulations on your marriage.");
        englist.add("My marriage is on the rocks again yeah, my wife just broke up with her boyfriend.");
        englist.add("Marriage is a means of survival for two people.");
        englist.add("I chose my wife, as she did her wedding gown, for qualities that would wear well");
        englist.add("I asked my wife, “Where do you want to go for our anniversary?” She said, “Somewhere I have never been!” I told her, “How about the kitchen?”");
        englist.add("I wish you eyes full of joy and long and interesting life together! Be happy!");
        englist.add("Marriage is perfect for lovers and suitable for the saints.");
        englist.add("I congratulate you on your wedding and wish you half of the most beautiful things in the world. The other half I'll leave for me.");
        englist.add("I wish you to live in peace and in perfect union at least till your golden jubilee!");
        englist.add("Marriage, truth to say is evil, but necessary evil.");
        englist.add("Marriage based on common sense and mutuality is one of the greatest things of life.");
        englist.add("A good marriage would be between a blind wife and a deaf husband.");
        englist.add("Marriage is a short rest between romances.");
        englist.add("Wishing you the joy and happiness that you both deserve, make sure you kiss everynight before going to bed.");
        englist.add("A man in love is incomplete until he is married. Then he’s finished. ");
        englist.add("I wonder if I've met the person I’m going to marry.");
        englist.add("What’s the difference between a boyfriend and a husband? About 30 pounds.");
        englist.add("Watch your wedding video in reverse You'll love the part where you walk back down the easilyout the door into the car and bugger off with your mates");
        englist.add("Love is just a word until someone comes along and gives it meaning.");
        englist.add("A wedding is a start of togetherness.. of walks in the rain, basking in the sunshine, shared meals, caring for one another and sensing the love that a marriage carries.");
        englist.add("Marriage is like a hot bath. Once you get used to it, it's not so hot");
        englist.add("Remember the love you feel today. Look back on it daily and measure how much it has grown.");
        englist.add("I was incomplete without you. I thank God that we met and we are together now.");
        englist.add("What do you call a group of people where two people are thinking of Love & all other are thinking of food? . . . . . . . . WEDDING");
        englist.add("Those who choose marriage of convenience at least has reasonable excuse.");
        englist.add("May there be a generation of children, on the children of your children.");
        englist.add("Marriage is useful for soothing sensuality. It's useless for soothing love.");
        englist.add("It's not what I feel for you. It's what I not feel for anyone.. but you!");
        englist.add("In a few years priests will say, You may now change your relationship status to husband and wife.");
        englist.add("Marriage is the golden ring in a chain whose beginning is a glance and whose ending is Eternity.");
        englist.add("A great marriage is not when the 'perfect couple' comes together. It is when an imperfect couple learns to enjoy their differences.");
        englist.add("A happy marriage has in it all the pleasures of friendships, all the enjoyment of sense and reason and indeed all the sweets of life.");
        englist.add("True love is spending one day getting married.. and the rest of your life feeling glad you did.");
        englist.add("The difference between an ordinary marriage and an extraordinary marriage is in giving just a little 'extra' every day, as often as possible, for as long as we both shall live");
        englist.add("We are, each of us, angels with only one wing, and we can only fly embracing each other.");
        englist.add("In all of the wedding cake, hope is the sweetest of plums.");
        englist.add("A successful marriage requires falling in love many times, always with the same person.");
        englist.add("Talk six times with the same single lady and you may get the wedding dress ready");
        englist.add("On your special day dear friend, wishing you all the happiness, love and togetherness forever.");
        englist.add("The fact that we see so few successful marriages shows the value and importance of marriage.");
        englist.add("May the saddest day of your future be no worse than the happiest day of your past.");
        englist.add("Marriage is a short break between novels.");
        englist.add("Don’t marry for money, you can borrow it cheaper.");
        englist.add("Let good luck and understanding stay with you forever! Happy wedding day!");
        englist.add("If You feel hollow, let Me be the one, who fills You up with Love. Let Me free the butterflies within. Just open Your heart, and let Me in.");
        englist.add("Wishing you the best of life today and in the days to come..");
        englist.add("Getting married is similar to going to the restaurant with friends. You order what you want, and when you see what the other fellow has, you wish you had ordered that.");
        englist.add("May the love you express to each other today, always be the first thoughts during any trying times in the future.");
        englist.add("Only Marriage is the major cause of divorce.");
        englist.add("A happy man marries the girl he loves. A happier man loves the girl he marries");
        englist.add("My father always wanted to be the corpse at every funeral, the bride at every wedding, and the baby at every christening");
        englist.add("May you be as rich in life as you are in love.");
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