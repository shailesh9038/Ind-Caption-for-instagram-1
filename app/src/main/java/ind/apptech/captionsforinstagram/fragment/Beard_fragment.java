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

public class Beard_fragment extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Beard_fragment() {
        // Required empty public constructor
    }

    public static Beard_fragment newInstance(String param1, String param2) {
        Beard_fragment fragment = new Beard_fragment();
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

        englist.add("Man withOut a Beard is like aa Cup of a Tea withOut sugar.");
        englist.add("Any man can start a beard.. A true man never finishes one.");
        englist.add("If your dad doesn't have a beard, you've got two Mums.");
        englist.add("When you feel your beard blowing in the wind.");
        englist.add("Love ur beard.. it will love u back.");
        englist.add("Respect the beard.");
        englist.add("Shave off your beard and wear a dress.");
        englist.add("To be happy is to have a beard.");
        englist.add("I'll never chase a man but if he has tattoos and a beard, a beach just might power-walk.");
        englist.add("Beards.. if she dnt love it, send her back");
        englist.add("You call it facial hair, I call it awesomeness escaping through my face.");
        englist.add("The beard isn't novel, it's natural. But your continued efforts to maintain.");
        englist.add("Some Guy's wear a suit to look important, I grew a beard.");
        englist.add("Do you want a moustache?");
        englist.add("Beards make Guy Hotter.");
        englist.add("I'm Sorry; I can't hear you over my awesome beard.");
        englist.add("Men don't cry, they water their beard!");
        englist.add("Keep calm and grow beard.");
        englist.add("Grow what your father gave you.");
        englist.add("< Beard lover.");
        englist.add("Beard madness.");
        englist.add("The beard has many benefits, such as beauty and dignity.");
        englist.add("Beards and wine get better with time.");
        englist.add("A man without beard is like lion without mane.");
        englist.add("The beard isn't novel, it's natural. But your continued efforts to maintain. a boyish look by shaving your face, is truly a peculiar habit.");
        englist.add("May your face Stay hairy all the days of your life.");
        englist.add("Bearded man does it better.");
        englist.add("I want to inspire people. I want someone to look at me and say because of you, I grew a beard.");
        englist.add("Shave off your beard and wear a dress you would be a great female impersonator. – Simon Cowell");
        englist.add("Beards can protect you from pollen or dust allergies.");
        englist.add("Every beard needs a beauty.");
        englist.add("There's a place for men without beards it's called the lady's room.");
        englist.add("Culture is the widening of the mind and of the spirit.");
        englist.add("The world is full of guys, be a man.");
        englist.add("The beard tells the world that you spend more time, in Morning Prayer than morning primping.");
        englist.add("Beard rule, if you touch my beard, I will touch your butt.");
        englist.add("Pitty the BEARDLESS!!");
        englist.add("I don't have many hobbies, but my beard collects bras.");
        englist.add("I believe in beards.");
        englist.add("With great Beard comes great responsibility!");
        englist.add("A man who can grow a beard is the kind of man you want to with because a man who has patience to grow a beard has the patience to deal with your shit.");
        englist.add("It's not a beard, I've trained to sit very still.");
        englist.add("If your boyfriend doesn't have a beard you have a girlfriend.");
        englist.add("My beard is not a trend.");
        englist.add("Beards are said to increase social status.");
        englist.add("I'm Sorry, I can't hear you over my awesome beard.");
        englist.add("The fear of beards called pogonophobia.");
        englist.add("I'm a classic man.");
        englist.add("The international boxing association prohibits amateur boxers from having beards.");
        englist.add("There's a name for people without beards.. Women!");
        englist.add("I don't work out much but my beard lifts skirts.");
        englist.add("Beard is really just a hug for your face.");
        englist.add("There are two kinds of people in the world.. those who appreciate a good beard and those who are wrong.");
        englist.add("Kissing a man with a beard is a lot like going to a picnic. You don't mind going through a little brush to get there.");
        englist.add("Sometimes I think about shaving, but then I think, 'NAH. I like my legs the way they are'.");
        englist.add("Love my beard.. #men thing");
        englist.add("The scruffier your beard the sharper you need to dress.");
        englist.add("Some fathers teach their sons to shave.. others teach them to be men.");
        englist.add("The beard signifies the courageous. The beard distinguishes... the grown men. The earnest. The active. The vigorous.");
        englist.add("What are you so defensive? I'm not saying your clean shave face makes.. you less of a man. You just look like less of a man.");
        englist.add("Beards are the new six packs.");
        englist.add("Beard lives matter (save them, don't shave them).");
        englist.add("Grow a beard. Then we'll talk.");
        englist.add("Our character tells the world you are a real man. Your beard is mostly the exclamation point.");
        englist.add("Growing a beard is a habit most natural, scriptural, manly and beneficial.");
        englist.add("A beard is a gift you give your face.");
        englist.add("Love your man love his beard.");
        englist.add("The beard signifies the courageous. The beard distinguishes.");
        englist.add("Sometimes I think about shaving.");
        englist.add("Beard guys cuddle better.");
        englist.add("The world is full of guys, be a man");
        englist.add("Beard making ugly men handsome since the beginning of time.");
        englist.add("l touch beards on the first date.");
        englist.add("Nothing makes her purr like a face full of fur.");
        englist.add("Don't like me without a beard.");
        englist.add("Kissing a man without a beard is like drinking champagne without bubbles.");
        englist.add("A full beard looks cool.");
        englist.add("Girls get weird for guys with beards.");
        englist.add("No beard no thanks.");
        englist.add("Alexander the great was against beards in his infantry.");
        englist.add("Beards grow faster when a man has not had s3x in a while.");
        englist.add("Kissing a man with a beard is a lot like going to a picnic... You don't mind going through a little brush to get there. –Minnie Pearl");
        englist.add("The only reason to shave your beard is the joy of growing it again.");
        englist.add("Beardsome.");
        englist.add("Don't judge my past, look at my present l am sure my future is really rocking.");
        englist.add("If u don't like my beard.. then leave me baby.");
        englist.add("Time is measured in days, weeks and beards.");
        englist.add("Time is measured in days,weeks and beards..");
        englist.add("The beard tells the world that you spend more time.. in Morning Prayer than morning primping.");
        englist.add("I grew my beard out a little bit just to show that, indeed, I am a man.");
        englist.add("A man with Out a Beard is like a Cup of a Tea with Out sugar.");
        englist.add("A man who can grow a beard is the kind of man you want to with because a man who has the patience to grow a beard has the patience to deal with your shit.");
        englist.add("I hate being s3xy but I'm a bearded man so I can't help it.");
        englist.add("Beards are a brotherhood, not a fashion statement.");
        englist.add("Please do not shave off your beard.");
        englist.add("May your coffee be strong and your Monday is short.. and your beard is splendid.");
        englist.add("Beard under construction.");
        englist.add("The beard isn't novel, it's natural. But your continued efforts to maintain.. a boyish look by shaving your face, is truly a peculiar habit.");
        englist.add("Tradition wears a snowy beard, romance is always young.");
        englist.add("What are you so defensive? I'm not saying your clean-shaven face makes you less of a man. You just look like less of a man.");
        englist.add("All the men in my family were bearded, and most of the women.");
        englist.add("I don't have many hobbies, but my beard collects bras. :P");
        englist.add("My beard is an honour student at the school of badassery.");
        englist.add("One can always trust a man with beard.");
        englist.add("I don't give moustache rides. I give beard bounces.");
        englist.add("I find myself drawn to people who are intelligent, funny, and perverted.");
        englist.add("Shave and get a job or beard be a boss.");
        englist.add("Be Beard.. Be Loved.");
        englist.add("Have you a beard and tattoos? That sound you just heard sir, was my panties evaporating.");
        englist.add("He who sacrifices his beard for a woman deserves neither.");
        englist.add("I met god..he has a beard.");
        englist.add("Our character tells the world you are a real man.. Your beard is mostly the exclamation point.");
        englist.add("During the Middle Ages, touching another man's beard could result in a duel.");
        englist.add("When a bearded man is around I can't keep Calm.");
        englist.add("Bearded men make better lovers. Hell, we make everything better.");
        englist.add("Hey there! I am using Beard.");
        englist.add("Keep calm and love men with muscles beard and tattoos.");
        englist.add("Beard sign of hotness.");
        englist.add("Sum Guy's wear a suit to look important, I grew a beard.");

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