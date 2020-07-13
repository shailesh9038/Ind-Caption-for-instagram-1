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

public class Winter extends Fragment {

    RecyclerView rajputlist;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Winter() {
        // Required empty public constructor
    }

    public static Winter newInstance(String param1, String param2) {
        Winter fragment = new Winter();
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

        englist.add("The joy to be found in winter's season is easily found with you.");
        englist.add("Ok winter you've made your point: I'm a stupid.");
        englist.add("Time for gym because winter is out their.");
        englist.add("Melancholy were the sounds on a winter's night.");
        englist.add("Winter! Winter! its so cool..");
        englist.add(".....................................It's not an empty SMS, Due to fog you can't see the words.");
        englist.add("Never catch snowflakes with your tongue until ALL the birds have gone South for the Winter.");
        englist.add("If You Want To Protect Yourself from Cold. Then Just.. Go To Hell. It's really Hot there.");
        englist.add("Dear Sardiiiiiii, Itani be-dardi :-O :P :P");
        englist.add("I think the perfect gift to give anyone in the winter is a heated toilet seat.");
        englist.add("I miss you. It's as simple as that. I can't wait for winter break. We'll finally get entire days together.");
        englist.add("What good is the warmth of summer, without the cold of winter to give it sweetness.");
        englist.add("Eat chicken..drink wine! and say f*ck off to Winter!");
        englist.add("Winter arive pack your t-shirts :)");
        englist.add("Enjoying Snowfall !!");
        englist.add("I'm the kind of person who drinks hot chocolate in the summer, and eats ice cream in the winter.");
        englist.add("Wearing a sweater to bed in the winter ?");
        englist.add("Taking Sips Of Coffee Lying In Cozy Bed With Blanket Around... Enjoying Winter.");
        englist.add("Laughter is the sun that drives winter from the human face.");
        englist.add("Dear Weather, Please stop being so cold. We don't have hot girlfriends, we already have cold wives! With hot temper All husbands..");
        englist.add("The problem with winter sports is that - follow me closely here - they generally take place in winter.");
        englist.add("Cold weather is the perfect excuse for hugging.");
        englist.add("The warmest blankets of peace snow only from the heart. ~Layne Russell");
        englist.add("If there's ice cream trucks in the summer then why isn't there Starbucks trucks in the winter?");
        englist.add("*Winter* Couples: We are going to cuddle and snuggle like there is no tomorrow. Me: *stares at pillow* You love me right?");
        englist.add("Snowflakes are like kisses down from heaven.");
        englist.add("You can't get too much winter in the winter.");
        englist.add("One kind word can warm three winter months.");
        englist.add("Summer: 'Its SO hot! I can't wait for the cold weather.' Winter: 'WTF is this?!?! I miss summer.'");
        englist.add("A lot of people like snow. I find it to be an unnecessary freezing of water.");
        englist.add("Dear Winter, I think we should spend some time apart... I'm gonna try to work things out with my ex, Summer.");
        englist.add("Winter is the season in which we try to keep the house as warm as it was in the summer, when we complained about the heat.");
        englist.add("I read, much of the night, and go south in the winter.");
        englist.add("does anyone else feel that in the winter you are all of a sudden interested with the weather..");
        englist.add("That annoying moment when you cannot find the long side of your blanket.");
        englist.add("He who doesn't notice whether it is winter or summer is happy.");
        englist.add("A man says a lot of things in summer he doesn't mean in winter.");
        englist.add("I am so ready for Christmas movies and Christmas Songs and snow and all that other sappy amazing Winter stuff. ?");
        englist.add("Winter must be cold for those with no warm memories.");
        englist.add("This weather is almost colder than my heart.");
        englist.add("Winters are never cold if you have warm memories of someone special :)");
        englist.add("Mentally preparing yourself to step out of the shower during the winter.");
        englist.add("I think Sun went to his maternal uncle home!");
        englist.add("likes the smell of burning wood... winter is here!");
        englist.add("Winter dies into the spring, to be born again in the autumn.");
        englist.add("A cold wind was blowing from the north, and it made the trees rustle like living things.");
        englist.add("Winter always turns into spring.");
        englist.add("Winter, Winter go away, come again another day...I need some sun, I need some sand, I need an island and a one night stand!!");
        englist.add("I love fall and winter because it gives us more reasons to cuddle!");
        englist.add("Nothing burns like the cold.");
        englist.add("Another month. Another year. Another smile. Another tear. Another winter and another summer too. But there can never be another you. ?");
        englist.add("LIKE IF: Mentally preparing yourself to step out of the shower during the winter.");
        englist.add("In this season of WHITE and GRAY may my wishes add warmth to your days Happy Winter Season.");
        englist.add("Any one who can make hot chocolate!");
        englist.add("I thought to just chill out this winter but now I m actually chilling.");
        englist.add("Hi December I am so ready for Christmas movies and Christmas Songs and snow and all that other sappy amazing Winter stuff. ?");
        englist.add("I think i should made a girl friend!");
        englist.add("I love being pale in the winter!");
        englist.add("The heart can get really cold if all you've known is winter.");
        englist.add("So cool.. inside and outside.");
        englist.add("Love is hearing the weather forecast for a winter storm and wishing you could spend it in bed with your lover, it's loneliness.");
        englist.add("In the depth of winter I finally learned that within me there lay an invincible summer.");
        englist.add("I will not leave my blanket alone because i love him.");
        englist.add("Your heart is so freezing. You might catch a cold.");
        englist.add("Now that Fall is here, do you think all the girls with duck-faces will fly south for the winter?");
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