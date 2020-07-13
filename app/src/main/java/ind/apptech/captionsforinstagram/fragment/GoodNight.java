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

public class GoodNight extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public GoodNight() {
        // Required empty public constructor
    }

    public static GoodNight newInstance(String param1, String param2) {
        GoodNight fragment = new GoodNight();
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

        englist.add("I wish I could be there to hold u tight, instead of saying this loving good night.");
        englist.add("My day may be hectic. My schedule may be tight. But I would never let the day end without saying good night. :-*");
        englist.add("You make my day special now please make my night remember able by coming to my dreams. GoodNight");
        englist.add("Tonight I’m going to sleep earlier because I want to see you in my dream very early. Good Night");
        englist.add("When an angel came to me, he asked: What is your wish for tonight? I said Please take care of the person reading this message. Good Night!");
        englist.add("Its time to say Good Night real world, Hello dream world.");
        englist.add("One day I shall rule the World! Until then, I am going to bed. Good Night :D");
        englist.add("One day, we will never have to say goodbye, only goodnight.");
        englist.add("You are the reason why I have sleepless nights, why I tend to hold my pillow tight and I can’t sleep without saying good night.");
        englist.add("I wish that God would hold you tight. I hope that angels would keep you in sight. Now just to make sure you feel all right, I’m gonna blow you a sweet goodnight");
        englist.add("Let’s go to bed. I’m tired of this day. I need a new one. Good Night");
        englist.add("The good people sleep much better at night than the bad people. Of course, the bad people enjoy the waking hours much more");
        englist.add("You are the first thought of every morning, the best thought of each day and the last thought of every night. Good Night");
        englist.add("Time to end a shitty day and start again tomorrow.");
        englist.add("You are the reason why I have sleepless nights. You are the reason why I tend to hold my pillow tight. And you are the reason I can’t sleep without saying Good Night.");
        englist.add("Good Night messages doesn’t only mean good night or sweet dreams. It also silently says that I think of you before going to bed. Good Night. Mmmmmmuah");
        englist.add("Good night sleep tight I will be dreaming of you with all my might.");
        englist.add("You are the reason why I have sleepless nights. You are the reason why I tend to hold my pillow tight. And you are the reason I can’t sleep without saying goodnight.");
        englist.add("Night is longer than day for those who dream and day is longer than night for those who make their dreams come true. Good Night and Sweet Dreams.");
        englist.add("One day I shall rule the World until then, I am going to bed. Good Night");
        englist.add("Loving you is like breathing. How can I stop it? Good Night. See you in dreams world.");
        englist.add("Remember to put me in your dreams and make that dream INTENSE. Love you good night.");
        englist.add("A day is going to end again. It is nice to have a friend like you making my everyday seems so great. Good night and sweet dreams.");
        englist.add("As the day turns into night, keep your worries out of sight. Close your eyes and go to sleep, for all the good times are yours to keep. Sweet Dreams.");
        englist.add("As the day turns into night. Keep your worries out of sight. No matter how tough the world may seem, you still deserve the sweetest dreams and good night.");
        englist.add("Dear sleep, I know we had problems when I was younger but I love you now.");
        englist.add("Dont lose hope. You never know what tomorrow will bring. Good night & sweet dreams.");
        englist.add("Good Night all, May the words of God dance in your ears and bring Joy to your hearts as you sleep tonight!");
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