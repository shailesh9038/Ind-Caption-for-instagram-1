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

public class Shopping extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Shopping() {
        // Required empty public constructor
    }

    public static Shopping newInstance(String param1, String param2) {
        Shopping fragment = new Shopping();
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

        englist.add("I wish I could have unlimited money for shopping.");
        englist.add("Money doesn't bring happiness, but shopping does :-)");
        englist.add("For those who know nothing of how to satisfy a woman: The G spot is located at the end of the word shopping.");
        englist.add("RT if you're going Black Friday shopping!!");
        englist.add("I have enough clothes and shoes I never need to go shopping again... - Said by no girl ever.");
        englist.add("*Shopping online: Ohhh niiicceeee and It's only $5!.....*Shipping: $100. WTF!?");
        englist.add("Dear fridge, I'll be back soon. Please go shopping. Sincerely, hungry");
        englist.add("Shopping at the Dollar Tree makes me feel rich and poor at the same time.");
        englist.add("My motto in life, Shopping is cheaper than a Psychiatrist!");
        englist.add("Twenty nine percent of women spend more time shopping for shoes than they do looking for a life long mate.");
        englist.add("Online dating is like shopping for a car online... show me the carfax!! I wanna see the history!");
        englist.add("If a girl is shopping she's trendy, if boy is shopping he's wasting money.");
        englist.add("That awkward moment when your parents tell you to stay in the line when you're shopping, and when you're almost near the cashier, they're not even back yet.");
        englist.add("Meeting men at bars is like window shopping. You're looking at fancy clothes on a bunch of dummies.");
        englist.add("You haven't felt pain unless you've gotten a shopping cart's wheel hit at the back of your heal.");
        englist.add("I know it's only September but there are less than 100 shopping days left til Christmas..");
        englist.add("Shopping at the dollar store: Making you feel rich and poor all at the same time.");
        englist.add("Shopping is so fun I could do it all year.");
        englist.add("I love doing last minute Christmas shopping!");
        englist.add("Admit it, we all feel cool when we walk around the mall with tons of shopping bags in our arms.");
        englist.add("Dear fridge, I'll be back in half an hour. Please go shopping. Sincerely, hungry.");
        englist.add("I wanna go shopping.");
        englist.add("It's a good thing the gas station is open today...... I still have time to do my Christmas shopping.");
        englist.add("Go shopping. There is nothing that makes a woman feel better about herself than buying a new wardrobe.");
        englist.add("Shopping improves your self-esteem and opens your mind to other choices and points of view.");
        englist.add("How do homeless people always seem to get the shopping cart that has all four good wheels?");
        englist.add("Going shopping with money and nothing to find; Going shopping without money");
        englist.add("Life really is all down-hill once you get to big too ride in the shopping cart anymore isn't it??");
        englist.add("I've been shopping for years and I still have nothing to wear.");
        englist.add("Dear Bra companies, If I'm shopping for a 34D do you really think I need Extreme Plunge Max Lift padding?! Sincerely, Just looking .");
        englist.add("Can you bleed for a whole week and survive?Can you squeeze 14 inch baby from a 9 centimeter hole?Can you carry 10 shopping bags?Boys are stronger than girls?PLZ!");
        englist.add("When women are depressed they either eat or go shopping. Men invade another country.");
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