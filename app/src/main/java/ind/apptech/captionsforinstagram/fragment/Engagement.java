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

public class Engagement extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Engagement() {
        // Required empty public constructor
    }

    public static Engagement newInstance(String param1, String param2) {
        Engagement fragment = new Engagement();
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

        englist.add("Congratulations on your engagement! We know you can make each other very happy.");
        englist.add("Congratulations but do not hesitate! Get married!");
        englist.add("It has been a great pleasure to see your happy faces. Have a blessed and happy life. Wishing you a very happy engagement.");
        englist.add("Any married man should forget his mistakes because there is no use in remembering two people the same thing.");
        englist.add("Marriage is a means of survival for two people.");
        englist.add("May your engagement be memorable and incomparable as well as your life..");
        englist.add("Marriage is an institution in which a man loses his Bachelor’s Degree and the woman gets her Masters.");
        englist.add("May you have the love and care from God. Congratulations on your engagement.");
        englist.add("We have a very good reason to share the spirit this season Please join with us in celebration as we are united in marriage.");
        englist.add("A wedding is a start of togetherness.. of walks in the rain, basking in the sunshine, shared meals, caring for one another and sensing the love that a marriage carries.");
        englist.add("I was incomplete without you. I thank God that we met and we are together now.");
        englist.add("Marriage is a short break between novels.");
        englist.add("Today, on the day of your engagement, tomorrow, after many years, be very, very happy!");
        englist.add("A dream that is dreamed by two will always come true.");
        englist.add("May you be as rich in life as you are in love.");
        englist.add("Marriages are made in heaven, but so are thunder and lightning.");
        englist.add("The day of your engagement is not going to be the happiest day of your life. There are many more to come! Congrats..");
        englist.add("I Wish you to have a beautiful life together.");
        englist.add("Congratulations but do not hesitate! Get married!");
        englist.add("Bride: A woman with a fine prospect of happiness behind her.");
        englist.add("The fact that we see so few successful marriages shows the value and importance of marriage.");
        englist.add("TV has no place in love. Marriage is a fight for remote control.");
        englist.add("This is the first step of love before entering into the married life. May you have lifetime happiness and fun! Happy Engagement.");
        englist.add("Wishing you all the love and happiness in the world and congratulations on your marriage.");
        englist.add("Congratulations on your engagement! We hope you’ll be happy together.");
        englist.add("Marriage is useful for soothing sensuality. It’s useless for soothing love.");
        englist.add("Marriage is perfect for lovers and suitable for the saints.");
        englist.add("May God bless you both on the day of your engagement! Congratulations!");
        englist.add("May there be a generation of children, on the children of your children.");
        englist.add("From the day of your engagement till the end of the days may your life be full of true love.");
        englist.add("May the love you express to each other today, always be the first thoughts during any trying times in the future.");
        englist.add("It’s so great to find that one special person you want to annoy for the rest of your life.");
        englist.add("Love is holding hands in the street. Marriage is holding arguments in the street.");
        englist.add("My marriage is on the rocks again yeah, my wife just broke up with her boyfriend");
        englist.add("May the saddest day of your future be no worse than the happiest day of your past.");
        englist.add("Marriage based on common sense and mutuality is one of the greatest things of life.");

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