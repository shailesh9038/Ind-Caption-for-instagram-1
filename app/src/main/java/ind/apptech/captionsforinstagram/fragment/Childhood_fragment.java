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

public class Childhood_fragment extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Childhood_fragment() {
        // Required empty public constructor
    }

    public static Childhood_fragment newInstance(String param1, String param2) {
        Childhood_fragment fragment = new Childhood_fragment();
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

        englist.add("If you carry your childhood with you, you never become older. - Tom Stoppard");
        englist.add("I miss those childish days of long ago, when one day was as long as twenty are now. - C.J. Heck");
        englist.add("Memories of childhood were the dreams that stayed with you after you woke.");
        englist.add("I'd give all wealth that years have piled, The slow result of Life's decay, To be once more a little child For one bright summer day.");
        englist.add("There is a garden in every childhood, an enchanted place where colors are brighter, the air softer, and the morning more fragrant than ever again.");
        englist.add("And I leave the children the long, long days to be merry in in a thousand ways, and the Night, and the trail of the Milky Way to wonder at..");
        englist.add("Why must they grow up and lose it all? - Virginia Woolf");
        englist.add("There is no land like the land of your childhood. - Michael Powell");
        englist.add("Childhood is that wonderful time of life when all you need to do to lose weight is take a bath.");
        englist.add("We carry our childhood with us. - Gary D. Schmidt");
        englist.add("What we remember from childhood we remember forever - permanent ghosts, stamped, inked, imprinted, eternally seen.");
        englist.add("If you carry your childhood with you, you never become older.");
        englist.add("All any child needs is the protection of loving parents and an alternative source of information.");
        englist.add("To trade a childhood wonder for a plausible explanation - is there a worst trade one makes in life?");
        englist.add("The first 40 years of your childhood are always the hardest.");
        englist.add("We could never have loved the earth so well if we had had no childhood in it.");
        englist.add("Childhood is the most beautiful of all life's seasons.");
        englist.add("Childhood is the fiery furnace in which we are melted down to essentials and that essential shaped for good.");
        englist.add("Never stop screaming, playing and laughing, it's part of our childhood which will always be with us.");
        englist.add("There should be a special TV channel for all those old cancelled cartoons.");
        englist.add("Childhood is a short season. - Helen Hayes");
        englist.add("Childhood, after all, is the first precious coin that poverty steals from a child. - Anthony Horowitz");
        englist.add("There is always one moment in childhood when the door opens and lets the future in.");
        englist.add("Did you know that childhood is the only time in our lives when insanity is not only permitted to us, but expected?");
        englist.add("I had always thought that once you grew up you could do anything you wanted - stay up all night or eat ice cream straight out of the container.");
        englist.add("Whoever said that childhood is the happiest time of your life is a liar, or a fool. - Carlos Ruiz Zafón");
        englist.add("Childhood is like being drunk, everyone remembers what you did, except you.");
        englist.add("The older I grow the more earnestly I feel that the few joys of childhood are the best that life has to give.");
        englist.add("The childhood shows the man As morning shows the day.");
        englist.add("That sad moment when you realize your childhood is over.");
        englist.add("I miss being a little kid with no stress, worries or care in the world.");
        englist.add("It is never too late to have a happy childhood.");
        englist.add("Don't you wish you could take a single childhood memory and blow it up into a bubble and live inside it forever?");
        englist.add("Sweet childish days, that were as long As twenty days are now.");
        englist.add("When you finally go back to your old hometown, you find it wasn't the old home you missed but your childhood.");
        englist.add("In childhood, we press our nose to the pane, looking out. In memories of childhood, we press our nose to the pane, looking in.");
        englist.add("Childhood is measured out by sounds and smells and sights, before the dark hour of reason grows");
        englist.add("Sometimes you have to travel back in time, skirting the obstacles, in order to love someone.");
        englist.add("Your adulthood is a by-product of your teenage hood, which is a complicated version of childhood.");
        englist.add("All of us are products of our childhood. - Michael Jackson");
        englist.add("If you don't do anything stupid when you're young, you won't remember something funny when your old.");
        englist.add("In the happiest of our childhood memories, our parents were happy, too. - Robert Brault");
        englist.add("Childhood is a promise that is never kept.");
        englist.add("The wonders of a child can only be understood by the child.");
        englist.add("In the happiest of our childhood memories, our parents were happy, too.");
        englist.add("Memories of childhood were the dreams that stayed with you after you woke. - Julian Barnes");

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