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

public class Diwali extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Diwali() {
        // Required empty public constructor
    }

    public static Diwali newInstance(String param1, String param2) {
        Diwali fragment = new Diwali();
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


        englist.add("As you celebrate this holy occasion, you are wished the brightest moments that Diwali can bring, lots of love and laughter to fill your days with cheer and a New year that is sure to bring you, the best of everything.");
        englist.add("Sending you smiles for every moment of your special day. Have a wonderful time and a very Happy Diwali.");
        englist.add("Diwali night is full of lights, may your life be filled with colors and lights of happiness. Happy Diwali!");
        englist.add("Life with you is like diwali, so lets promise to be together like this forever. Wish you a very Happy Diwali");
        englist.add("Let this diwali burn all your bad times and enter you in good times.");
        englist.add("Happy, Happy Diwali! I hope the day has been blessed with the presence of those you love most, and many magical moments!");
        englist.add("May you all attain the inexhaustible spiritual wealth of the Self.");
        englist.add("May this diwali bring you the utmost in peace and prosperity.");
        englist.add("The festival of light is full of delight Let me double the charm of your diwali night Happy Diwali!");
        englist.add("May peace transcend the earth. Happy Diwali");
        englist.add("I deleted…. Chat and Browsing history.. Bas ho gae meri Diwali ki safai.");
        englist.add("May the warmth and splendor, that are a part of this auspicious occasion, fill your life with happiness and bright cheer, and bring to you joy and prosperity, for the whole year.");
        englist.add("Let me make your Diwali more colorful with the lights of wishes of my heart. Happy Diwali..");
        englist.add("Diwali night is full of lights, may your life be filled with colors and lights of happiness. Happy Diwali..");
        englist.add("May this Diwali lights up dreams, hopes, undiscovered avenues and everything bright. Happy Diwali");
        englist.add("May you all attain full inner illumination, May the supreme light of lights enlighten your understanding.");
        englist.add("The truth is that existence wants your life to become a festival because when you are unhappy, you also throw unhappiness all around.");
        englist.add("Just wanted to wish a little sunshine back into the heart of someone who gives it away all year long. Happy Diwali!");
        englist.add("May you be blessed with happiness and well being to last through the year. Happy Diwali..");
        englist.add("On the precious moment of diwali I wish you happy diwali and I pray that you get all your endeavors fulfilled as well as you get lots of gifts and sweets this diwali.");
        englist.add("Wish you and your family a bombastic Diwali, Have loads of fun and loads of masti..");
        englist.add("May you all prosper gloriously on the material as well as spiritual planes..");
        englist.add("Hope this diwali brings contentment to your life along with the key to success");
        englist.add("May this diwali Light up new dreams, fresh hopes, undiscovered avenues, different perspectives, everythin bright & beautifulfil and fill ur days with pleasant surprises and moments.");
        englist.add("Revolution is the festival of the oppressed.");
        englist.add("Life is a festival only to the wise.");
        englist.add("This Diwali I wish you get a lot of crackers but you don’t get a match box to lit them. Save environment, so no to crackers.");
        englist.add("Life with you is like diwali, so lets promise to be together like this forever. Wish you a very Happy Diwali..");
        englist.add("Today I feel gifted and blessed that my Diwali is full of affection, love, celebrations as it was always. May God always keep his blessings on us like this.");
        englist.add("May you live your life like the festival of Diwali, happy healthy and wealthy. A Very Very Happy Diwali..");
        englist.add("May the beauty Of deepavali season fill your home with happiness..");
        englist.add("May this Diwali be as bright as ever.");
        englist.add("You are invited to the festival of diwali of this world and your life is blessed.");
        englist.add("HAPPY DIWALI TO YOU! may you celebrate it well.surrounded by family,friends,and lots of love and remember..");
        englist.add("The festival of lights is just around the corner wish you all a Very Happy Diwali..");
        englist.add("For This, Is A Special Time When Family And Friends Get Together,For Fun. Wishing Laughter And Fun To Cheer Your Days, In This Festive Season Of Diwali And Always");
        englist.add("May the light that we celebrate at Diwali show us the way and lead us together on the path of peace and social harmony.");
        englist.add("May the festival of lights brighten up you and your near and dear ones lives");
        englist.add("The festival of lights is just around the corner, wishing you all a very Happy Diwali.");

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