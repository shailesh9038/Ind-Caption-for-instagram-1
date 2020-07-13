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

public class Rain extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Rain() {
        // Required empty public constructor
    }

    public static Rain newInstance(String param1, String param2) {
        Rain fragment = new Rain();
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

        englist.add("Rain makes a heart GO Romantic.");
        englist.add("Sometimes YOU Win Sometimes You Lose Sometimes It Rains. :-)");
        englist.add("The nicest thing about the rain is that it always stops.");
        englist.add("Love is just something you can't explain, like the look of a rose, the smell of rain, or the feeling of forever.");
        englist.add("Let me kiss you hard in the pouring rain.");
        englist.add("Everyone wants HAPPINESS. No one wants PAIN. But you can't have a RAINBOW, without a little of RAIN.");
        englist.add("Rainy days are perfect for cuddling up with a warm blanket, my laptop, a good book, the remote and a nice cup of something warm!");
        englist.add("If you want to see a rainbow, you must go through the rain. If you want to see true love, you must go through the pain.");
        englist.add("Life isn't about waiting for the storm to pass Its about learning to dance in the rain.");
        englist.add("Falling in love is like the rain, it's unpredictable, but there are always signs before it completely falls.");
        englist.add("Dark night + Heavy rain + Coldness + Nice blanket = Perfect sleep");
        englist.add("Whenever it rains, I feel you.");
        englist.add("I find peace inn the rain.");
        englist.add("Act like rain, carefree. Love like ocean, never ending. Be bright like sun, warming up someone`s day.. Have an amazing & blessed day. (:");
        englist.add("Some feels the Rain, Others just get Wet.");
        englist.add("I like walking in the rain because nobody can see that I am crying.");
        englist.add("Lets cuddle on a rainy day Watch Old movies and make out.");
        englist.add("Every heartache will fade away, just like every storm runs out of rain.");
        englist.add("If I could do anything, it would be to kiss you in the middle of the street, on the rainiest day of the year.");
        englist.add("Everybody wants happiness nobody wants pain but you can't have a rainbow without a little rain.");
        englist.add("It's raining, It's pouring. Facebook is boring.");
        englist.add("My dream is to hear rocks hitting the window and see you standing in the rain..");
        englist.add("Sometimes, darkness can be too bright, but sometimes, rain gives you delight.");
        englist.add("To get a rainbow you have to go through the rain, but to get true love you have to go through the pain.");
        englist.add("I wish I could sit in the rain and let it wash all my worries away.");
        englist.add("LET IT RAIN OVER ME.");
        englist.add("I love it when it Rains.");
        englist.add("When I was younger I remember watching two drops of rain roll down window and pretending it was a race.");
        englist.add("RAIN!!!! :) I guess my rain dances must have worked. Some people call it stumbling around... I call it rain dancing.");
        englist.add("This rain makes me miss you even more.. awww. :-(");
        englist.add("Worrying is stupid. It's like walking around with an umbrella, waiting for it to rain.");
        englist.add("Say's f*ck me with a pitchfork while I'm running sideways in the rain!");
        englist.add("I LOVE RAIN!! The dark sky, thunder, and the smell! RAINY DAYS make me HAPPY!");
        englist.add("Be strong now because things will get better. It might be stormy now but it can't rain forever.");
        englist.add("My life is a storm, can you dance in the rain with me?");
        englist.add("Rainy days are lazy days. Makes you want to watch movies, eat yummy food and do absolutely nothing.");
        englist.add("Anyone who thinks that the Sunshine is pure happiness, has never danced in the RAIN.");
        englist.add("Let the rain wash away All the pain of Yesterday.");
        englist.add("I just want somebody, who kisses me in the rain, holds me tight when I'm sad, and wraps their arms around me when I'm cold.");
        englist.add("I love falling asleep in the sound of rain.");
        englist.add("Rainy days give people like me a special kind of motivation - the motivation to do absolutely nothing. :P");
        englist.add("If I could do anything, it would be to kiss you in the middle of the street, on the rainiest day of d year.");
        englist.add("This year, I want to be kissed in the rain by him.");
        englist.add("Hello rain, your not raining properly. Just thought I'd let you know, so if your gonna rain, can you rain harder with some thunder and lightning? or Go away!");
        englist.add("It's raining, it's pouring, I should be in bed snoring... I'm going to bed... won't bump my head... so I can get up in the morning!");
        englist.add("Dear Sun, I know your up there hiding behind the clouds. Hide and seek is over, let's have some sun!");
        englist.add("Heavy rain showers remind me of challenges in life. Never ask for a lighter rain. Instead pray for a better umbrella.");
        englist.add("life is a storm either you get a umbrella or learn to dance in the rain.");
        englist.add("That awkward moment when you just washed your car, then the rain starts pouring.");
        englist.add("It may be stormy now, but it can't rain forever.");
        englist.add("The rain reminds me of you. because it's falling hard and i am too.");

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