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

public class Taunt extends Fragment {

    RecyclerView rajputlist;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Taunt() {
        // Required empty public constructor
    }

    public static Taunt newInstance(String param1, String param2) {
        Taunt fragment = new Taunt();
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

        englist.add("If nobody hates you, you are doing something boring.");
        englist.add("If world is going to end today, then what would be your last wish?");
        englist.add("You ignored the softness of my heart and get ready to believe on my mean behavior.");
        englist.add("Don’t let negative and toxic people rent space in your head. Raise the rent and kick them out!");
        englist.add("Security is an illusion. Life is either a daring adventure or it is nothing at all.");
        englist.add("You`re like an alcohol. I don`t keep you for the taste, I keep you for the feeling.");
        englist.add("Take the risk, it could lead to something beautiful.");
        englist.add("You can't be the top dog if you act like a pussy!");
        englist.add("Who would you chose? The one that you love or the one that loves you?");
        englist.add("If you think you’re free, there’s no escape possible.");
        englist.add("I dare you to find a more normal psycho than me.");
        englist.add("For all of you who gossip about me: THANKS for making me the center of your world.");
        englist.add("Hated by many, wanted by plenty, disliked by some, confronted by none.");
        englist.add("That awkward moment when someone’s staring at the keyboard while you are typing your password.");
        englist.add("Two most honest people in this world, drunk people and little kids…");
        englist.add("The Awkward Moment Where The Music Stops, But You`re Still Singing..");
        englist.add("Only that in you which is me can hear what I’m saying.");
        englist.add("I don’t have time to hate people who hate me, B’cuz I’m tooooooo busy loving people who love me..");
        englist.add("Laziness is the definition of being very active & doing nothing.");
        englist.add("A smart statement written outside a women’s shoe shop: 75% Discount if you select in 5 minutes. :)");
        englist.add("All serious daring starts from within.");
        englist.add("Don’t let people rent space in your head just let it go..");
        englist.add("Id explain it to you, but I don’t have any crayons with me.");
        englist.add("Sometimes the people that u don't want to get hurt doesn't care if they hurt you!");
        englist.add("I have a disease. Its called awesomeness. but don`t worry it`s not contagious..");
        englist.add("It’s terrible to lose someone we love. But it’s even worse to lose ourselves while loving them.");
        englist.add("Fact of life, After Monday & Tuesday, even the calendar says W T F..");
        englist.add("INSULT & WIFE Are Somewhat Similar....They Always Look Good...IF IT IS NOT YOURS.");
        englist.add("You can never make the same mistake twice, because the second time you make it, its not a mistake, its a choice");
        englist.add("You will never know the power of yourself until someone hurts you badly.");
        englist.add("I have lost my mind and I am making no effort to look for it.");
        englist.add("It might seem like the hardest thing to do, but you have to forget the person who forgot about you.");
        englist.add("That moment when you don’t know the answer in class but act as you know it.");
        englist.add("There’s more to the truth than just the facts.");
        englist.add("There are so many people out there who will tell you that you can’t. What you have for to do is turn around and say watch me.");
        englist.add("You have a problem with me. I’m pretty sure a status on Facebook won’t fix it..");
        englist.add("Against the bold, daring is unsafe.");
        englist.add("Girl’s logic: When you like a guy, do nothing about it and expect him to magically know and make the first move.");
        englist.add("Life is either a daring adventure or nothing. Security is mostly a superstition. It does not exist in nature.");
        englist.add("Whatever you do, good or bad, people will always have something negative to say.");
        englist.add("When you have money in your hand, only you forget who are you but when you do not have any money in your hand, the whole world forget who you are. Its life.");
        englist.add("A warrior is free to be a hero and pull off daring do and the soldier is irresponsible if he does it.");
        englist.add("Daring is not safe against daring men.");
        englist.add("No two on earth in all things can agree. All have some daring singularity.");
        englist.add("How will you know if it’s the right decision if you never make it.");
        englist.add("When somebody says “Expect the unexpected” slap them in the face and say ” You didn’t expect that did you.”");
        englist.add("Great fear is concealed under daring.");
        englist.add("Man can’t discover new oceans unless he has the courage to lose sight of the shore.");
        englist.add("Three keys to more abundant living: caring about others, daring for others, sharing with others.");
        englist.add("A sheltered life can be a daring life as well. For all serious daring starts from within.");
        englist.add("Don’’t waste time giving someone a second chance, when there is someone better waiting for their first.");
        englist.add("If you are planning to let me go today, make sure you’ll never come back tomorrow.");
        englist.add("What people say to your face is not a problem. The problem is what they say behind your back.");
        englist.add("Devote today to something so daring even you can’t believe you’re doing it.");
        englist.add("Faith is the daring of the soul to go farther than it can see.");
        englist.add("Everything happens for a reason but sometimes the reason is that you are stupid and you make bad decisions.");
        englist.add("Are oranges called oranges b’coz they are orange in color or is the color orange called orange bcoz oranges are orange in color?");
        englist.add("Go for someone who is not only proud to have you but will also take every risk just to be with you.");

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