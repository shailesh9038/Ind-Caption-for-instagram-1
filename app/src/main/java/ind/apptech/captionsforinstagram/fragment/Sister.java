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

public class Sister extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Sister() {
        // Required empty public constructor
    }

    public static Sister newInstance(String param1, String param2) {
        Sister fragment = new Sister();
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

        englist.add("A true sister is a friend who listens with her heart.");
        englist.add("When sisters stand shoulder to shoulder, who stands a chance against us? - Pam Brown");
        englist.add("I would like more sisters, that the taking out of one, might not leave such stillness..");
        englist.add("We have the sister sayings that will make you nod in agreement about how annoying sisters can be.");
        englist.add("Friends are fake, Best Friends are only for a while, But Sisters are Forever and Real.");
        englist.add("A Loyal Sister IS Worth A Thousand Friends.");
        englist.add("We have the sister sayings that will make you nod in agreement about how annoying sisters can be!!!");
        englist.add("In the cookies of life, sisters are the chocolate chips.");
        englist.add("Bless you, my darling, and remember you are always in the heart – oh tucked so close there is no chance of escape – of your sister. - Katherine Mansfield");
        englist.add("What's the good of news if you haven't a sister to share it? - Jenny DeVries");
        englist.add("You aren't just my Best Friend. You are my sister and I love you to freaking death. I don't know what I would do without you.");
        englist.add("Is solace anywhere more comforting than in the arms of a sister. - Alice Walker");
        englist.add("I love the fact that my best friend just so happens to be my only biological sibling, my sister.");
        englist.add("Sister and Best Friend - Two words that mean the same.");
        englist.add("A sister can be seen as someone who is both ourselves and very much not ourselves - a special kind of double.");
        englist.add("People come and go, friends change like the weather but I know my sister is here forever. I love you.");
        englist.add("It's hard to be responsible, adult and sensible all the time. How good it is to have a sister whose heart is as young as your own. - Pam Brown");
        englist.add("Having a sister is like having a best friend for life.");
        englist.add("Of two sisters one is always the watcher, one the dancer.");
        englist.add("To have a loving relationship with a sister is not simply to have a buddy or a confident — it is to have a soulmate for life. - Victoria Secunda");
        englist.add("More than Santa Claus, your sister knows when you've been bad and good. - Linda Sunshine");
        englist.add("A sister is a forever friend.");
        englist.add("Sister and Friend two words that mean the same.");
        englist.add("Our path may change as life goes along, but the bond between us remains ever strong. I miss you my sister.");
        englist.add("Brothers and sisters are as close as hands and feet. - Vietnamese Proverb");
        englist.add("Sisters function as safety nets in a chaotic world simply by being there for each other. - Carol Saline");
        englist.add("Sometimes being a brother is even better than being a superhero. Happy Raksha Bandhan everyone.. stay blessed..");
        englist.add("Having my sister around can make the difference between heaven and hell.");
        englist.add("My sister is the sweetest little thing alive! Words can hardly describe my love for her, she is my best friend.");
        englist.add("Because i have a sister i will always have a friend..");
        englist.add("Rakhi is a perfect time to tell you just how special you are and how much you mean to me! Wish you all the peace, prosperity and success on this Raksha Bandhan.");
        englist.add("Because angels are sometimes busy elsewhere, God created sisters like you.");
        englist.add("Sweet is the voice of a sister in the season of sorrow. - Benjamin Disraeli");
        englist.add("Sweet, crazy conversations full of half sentences, daydreams and misunderstandings more thrilling than understanding could ever be.");
        englist.add("Sorry, I can't hangout. My uncle's cousin's sister in law's best friend's insurance agent's roommate's pet goldfish died. Maybe next time..");
        englist.add("We may look old and wise to the outside world. But to each other, we are still in junior school. - Charlotte Gray");
        englist.add("I would like more sisters, that the taking out of one, might not leave such stillness.");
        englist.add("A sister is someone who is there and understands who you..");
        englist.add("Sisters are different flowers from the same garden.");
        englist.add("A sister is for telling secrets and making promises that will never be broken.");
        englist.add("Brothers and sisters are as close as hands and feet.");
        englist.add("I Love MY Sister because She Cares Meee");
        englist.add("You keep your past by having sisters. As you get older, they're the only ones who don't get bored if you talk about your memories. - Deborah Moggach");
        englist.add("A sister smiles when one tells one's stories - for she knows where the decoration has been added.");
        englist.add("A sister is a gift to the heart, a friend to the spirit, a golden thread to the meaning of life.");
        englist.add("Good thing about having an older sister is to help you with the subjects you're weak in. :)");
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