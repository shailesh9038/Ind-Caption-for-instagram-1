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

public class Pets extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Pets() {
        // Required empty public constructor
    }

    public static Pets newInstance(String param1, String param2) {
        Pets fragment = new Pets();
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

        englist.add("Time spent with cats is never wasted.");
        englist.add("Just watching my cats can make me happy.");
        englist.add("Dogs are my favorite people.");
        englist.add("I poured spot remover on my dog. Now he's gone.");
        englist.add("No matter how little money and how few possessions you own, having a dog makes you rich.");
        englist.add("No one appreciates the very special genius of your conversation as the dog does.");
        englist.add("There is no psychiatrist in the world like a puppy licking your face.");
        englist.add("The average dog is a nicer person than the average person.");
        englist.add("I worked in a pet store and people would ask how big I would get.");
        englist.add("A real Christian is a person who can give his pet parrot to the town gossip.");
        englist.add("Like all pure creatures, cats are practical.");
        englist.add("A dog is the only thing on earth that loves you more than you love yourself.");
        englist.add("Every dog has his day but the nights are reserved for the cats.");
        englist.add("I love cats because I enjoy my home, and little by little, they become its visible soul.");
        englist.add("The more people I meet the more I like my dog.");
        englist.add("Money will buy you a pretty good dog, but it won't buy the wag of his tail.");
        englist.add("It is much easier to show compassion to animals. They are never wicked.");
        englist.add("A dog has one aim in life.. to bestow his heart.");
        englist.add("A dog lives in the moment and always hopes for the best.");
        englist.add("An animal's eyes have the power to speak a great language.");
        englist.add("A dog is the only thing on earth that loves you more than you love yourself.");
        englist.add("Time spent with cats is never wasted.");
        englist.add("There is no psychiatrist in the world like a puppy licking your face.");
        englist.add("I love cats because I enjoy my home, and little by little, they become its visible soul.");
        englist.add("It is much easier to show compassion to animals. They are never wicked.");
        englist.add("No one in your family will ever be as forgiving of your mistakes as your dog.");
        englist.add("Cats are connoisseurs of comfort.");
        englist.add("There are two means of refuge from the miseries of life: music and cats.");
        englist.add("To his dog, every man is Napoleon, hence the constant popularity of dogs.");
        englist.add("Like all pure creatures, cats are practical.");
        englist.add("Just watching my cats can make me happy.");
        englist.add("The clever cat eats cheese and breathes down rat holes with baited breath.");
        englist.add("To his dog, every man is Napoleon, hence the constant popularity of dogs.");
        englist.add("There is no psychiatrist in the world like a puppy licking your face.");
        englist.add("What counts is not necessarily the size of the dog in the fight - it's the size of the fight in the dog.");
        englist.add("I love cats because I enjoy my home, and little by little, they become its visible soul.");
        englist.add("Cats are connoisseurs of comfort.");
        englist.add("There are two means of refuge from the miseries of life: music and cats.");
        englist.add("Animals are sentient, intelligent, perceptive, funny and entertaining. We owe them a duty of care as we do to children.");
        englist.add("The trouble with a kitten is that eventually it becomes a cat.");
        englist.add("I wish people would realize that animals are totally dependent on us, helpless, like children, a trust that is put upon us.");
        englist.add("I really love animals. My cat is my little soul mate. He's not just a cat, he's my friend.");
        englist.add("If you are a dog and your owner suggests that you wear a sweater suggest that he wear a tail.");
        englist.add("I wish people would realize that animals are totally dependent on us, helpless, like children, a trust that is put upon us.");
        englist.add("Perhaps it is because cats do not live by human patterns, do not fit themselves into prescribed behavior, that they are so united to creative people.");
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