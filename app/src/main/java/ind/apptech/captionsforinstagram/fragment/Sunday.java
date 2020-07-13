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

public class Sunday extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Sunday() {
        // Required empty public constructor
    }

    public static Sunday newInstance(String param1, String param2) {
        Sunday fragment = new Sunday();
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

        englist.add("Dear Weekend, I really enjoyed the time we spent together the past couple days. I'm sorry you had to leave so quickly, but just know that you'll be on my mind.");
        englist.add("Climb into bed tonight with that blissful feeling that there will be no alarm clock in the morning, It's the WEEKEND! - Woohoo!");
        englist.add("It takes centuries to tolerate idleness idleness Sunday.");
        englist.add("It's Sunday night, the end of the weekend. I don't want to go to bed, cause when I wake up it will be Monday and the weekend's over.");
        englist.add("A Sunday well-spent brings a week of content.");
        englist.add("Thinks Sunday should be 48 hours instead of the usual 24, so we have more time to prepare for Monday.");
        englist.add("As Laughing Friday cry on Sunday.");
        englist.add("Monday, I hate you. Tuesday, you stink too, Wednesday still pushing it, Thursday getting better, Friday.. love ya! Saturday you are heaven, u you're OK");
        englist.add("Three of the worst words to hear.. Tomorrow is Monday.");
        englist.add("Going to sleep on Sunday will cause symptoms called 'Monday'. Conversely, also note that staying awake all night on Sunday does not prevent Monday.");
        englist.add("Wishes that Sundays came with a pause button!");
        englist.add("Sunday is my official LAZY DAY.");
        englist.add("A Sunday school is a prison in which children do penance for the evil conscience of their parents.");
        englist.add("It doesn't have to be Sunday to Praise God.God loves us everyday!");
        englist.add("Sunday.. the day you realize how much you've procrastinated.");
        englist.add("Sunday already, now where is the weekend remote so I can hit the rewind button.");
        englist.add("Do not let Sunday be taken from you If your soul has no Sunday, it becomes an orphan.");
        englist.add("What better way to spend Sunday than remembering the One who made it possible for us to be here at all. Praise the Lord!");
        englist.add("Sunday clears the rust of the whole week.");
        englist.add("Loves Sundays..even it's name sounds happy..hope your Sunday is a happy one.");
        englist.add("The hand Saturday, holds a broom is that Sunday caress best.");
        englist.add("I hate Sunday all the people who crowd the streets, ostensibly to rest.");
        englist.add("On Sunday, we exchange the troubles of the week against Boredom.");
        englist.add("Sunday clears away the rust of the whole week.");
        englist.add("Searching for the remote to rewind the weekend! Sunday always comes so fast & Monday is now closing in.");
        englist.add("Sunday, good day, good work, Typhoon haired snake.");
        englist.add("Does anyone else smell that? I do believe it's the nasty stench of Monday coming on.");
        englist.add("Wishing everyone a great sunday full of laughter and family.");
        englist.add("Day by day getting closer to irritating summer.");
        englist.add("Loves Sundays and being lazy.. Then Monday comes and things get crazy!");
        englist.add("FRIDAY one of the most beautiful words in the English language, followed closely by SATURDAY and SUNDAY. Happy Friday and Happy Weekend to all.");
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