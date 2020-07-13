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

public class Teacher extends Fragment {

    RecyclerView rajputlist;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Teacher() {
        // Required empty public constructor
    }

    public static Teacher newInstance(String param1, String param2) {
        Teacher fragment = new Teacher();
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

        englist.add("We are fortunate we had a teacher as wonderful loving and caring as You..");
        englist.add("Teachers open the door, but you must enter by yourself.");
        englist.add("A good teacher is like a candle, it consumes itself to light the way for others.");
        englist.add("The mediocre teacher tells. The good teacher explains. The superior teacher demonstrates. The great teacher inspires");
        englist.add("The best teachers teach from the heart, not from the book.");
        englist.add("Teacher: Where is your homework? ME: I lost it fighting with kid who said you weren’t the best teacher in school.");
        englist.add("Teaching is not a lost art, but the regard for it is a lost tradition..");
        englist.add("Thanks for being a true mentor of our hearts. Happy Teachers day");
        englist.add("When it comes to teaching no one can compete with you. Happy teachers day.");
        englist.add("A good teacher, like a good entertainer first must hold his audience’s attention, then he can teach his lesson.");
        englist.add("Dear Teacher, Thanks for making us what we are today. Happy teachers Day");
        englist.add("Those who educate children well are more to be honored than parents, for these only gave life, those the art of living well.");
        englist.add("It is the supreme art of the teacher to awaken joy in creative expression and knowledge.");
        englist.add("Don’t tell them they are wrong if you can’t prove them wrong.");
        englist.add("The authority of those who teach is often an obstacle to those who want to learn.");

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