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

public class Beauty_fragment extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Beauty_fragment() {
        // Required empty public constructor
    }

    public static Beauty_fragment newInstance(String param1, String param2) {
        Beauty_fragment fragment = new Beauty_fragment();
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

        englist.add("Beauty is worse than wine, it intoxicates both the holder and beholder.");
        englist.add("Smartness is a perfect beauty.");
        englist.add("Beauty always promises, but never gives anything.");
        englist.add("Beauty is less important than quality.");
        englist.add("The world is beautiful, but has a disease called man.");
        englist.add("I can't wait for the day I stop pretending that I'm really ok when I'm not.");
        englist.add("Think of all the beauty still left around you and be happy.");
        englist.add("Sleep - the most beautiful experience in life - except drink.");
        englist.add("Beauty itself is but the sensible image of the Infinite.");
        englist.add("Joy in looking and comprehending is nature's most beautiful gift.");
        englist.add("Beauty always comes with dark thoughts.");
        englist.add("What kind of place is this? It's beautiful: Pigeons fly, women fall from the sky! I'm moving here!");
        englist.add("Tell A Girl She's Beautiful, She'll believe it for a moment. Tell A Girl She's Ugly, She'll believe it for a life time..");
        englist.add("It is amazing how complete is the delusion that beauty is goodness.");
        englist.add("When you have only two pennies left in the world, buy a loaf of bread with one, and a lily with the other.");
        englist.add("You can and should experience it all in your relationships - deep intimacy, burning desire, intense passion, and incredible romance - all gift-wrapped and smothered in love.");
        englist.add("Beauty is the sole ambition, the exclusive goal of Taste.");
        englist.add("Here's a large collection of famous love quotes and sayings. These love quotes are inspiring and beautiful.");
        englist.add("Failure should be our teacher, not our undertaker. Failure is delay, not defeat. It is a temporary detour, not a dead end. Failure is something we can avoid only by saying nothing, doing nothing, and being nothing.");
        englist.add("It is the relationships amongst people which make life beautiful!");
        englist.add("Love is when you wake up, he is already on your mind.");
        englist.add("Beauty is unbearable, drives us to despair, offering us for a minute the glimpse of an eternity that we should like to stretch out over the whole of time.");
        englist.add("A thing of beauty is a joy forever: its loveliness increases, it will never pass into nothingness.");
        englist.add("A woman whose smile is open and whose expression is glad has a kind of beauty no matter what she wears.");
        englist.add("Beauty saves. Beauty heals. Beauty motivates. Beauty unites. Beauty returns us to our origins, and here lies the ultimate act of saving, of healing, of overcoming dualism.");
        englist.add("Inside beauty matter more then outside beauty.");
        englist.add("I don't like standard beauty - there is no beauty without strangeness.");
        englist.add("The pursuit of truth and beauty is a sphere of activity in which we are permitted to remain children all our lives.");
        englist.add("What humbugs we are, who pretend to live for Beauty, and never see the Dawn!");
        englist.add("Being glamorous Is not a crime.");
        englist.add("Communication is the lifeline of any relationship. When u stop communicating, u start losing ur valuable relationship.s");
        englist.add("Never, never and never again shall it be that this beautiful land will again experience the oppression of one by another.");
        englist.add("Everybody needs beauty as well as bread, places to play in and pray in, where nature may heal and give strength to body and soul.");
        englist.add("Tell them dear, that if eyes were made for seeing, Then beauty is its own excuse for being.");
        englist.add("Everything Has Beauty.");
        englist.add("My wishes are silent but true, Everywhere they will follow you.. Luck is yours, Wishes are mine.. I wish your present & future always shine.. Good Evening");
        englist.add("In every man's heart there is a secret nerve that answers to the vibrations of beauty.");
        englist.add("The problem with beauty is that it's like being born rich and getting poorer.");
        englist.add("If you are reading this, you are beautiful. Smile & let the world show it :)");
        englist.add("Truth is beautiful, without doubt; but so are lies.");
        englist.add("Beauty is whatever gives joy.");
        englist.add("What lies behind us, and what lies before us are tiny matters compared to what lies within us.");
        englist.add("Beauty comes in all sizes, not just size 5.");
        englist.add("You can only perceive real beauty in a person as they get older.");
        englist.add("Of all that is good, sublimity is supreme. Succeeding is the coming together of all that is beautiful. Furtherance is the agreement of all that is just. Perseverance is the foundation of all actions.");
        englist.add("Real beauty is to be true to oneself. That's what makes me feel good.");
        englist.add("When you're beautiful, jealous haters come with the territory.");
        englist.add("Love is a many splendid thing. Love lifts us up where we belong. All you need is love!");
        englist.add("By plucking her petals, you do not gather the beauty of the flower.");
        englist.add("Close your eyes and see the beauty.");
        englist.add("There is a road from the eye to the heart that does not go through the intellect.");
        englist.add("I sincerely feel that beauty largely comes from within.");
        englist.add("The real sin against life is to abuse and destroy beauty, even one's own even more, one's own, for that has been put in our care and we are responsible for its well-being.");
        englist.add("Life is full of beauty. Notice it. Notice the bumble bee, the small child, and the smiling faces. Smell the rain, and feel the wind. Live your life to the fullest potential, and fight for your dreams.");
        englist.add("Beauty is good when it's on the outside, but what about the inside, it's deep with-in the soul.");
        englist.add("Every year of my life I grow more convinced that it is wisest and best to fix our attention on the beautiful and the good, and dwell as little as possible on the evil and the false.");
        englist.add("The most beautiful view is the one I share with you.");

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