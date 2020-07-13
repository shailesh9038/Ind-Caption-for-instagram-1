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

public class Condolence extends Fragment {

    RecyclerView rajputlist;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Condolence() {
        // Required empty public constructor
    }

    public static Condolence newInstance(String param1, String param2) {
        Condolence fragment = new Condolence();
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


        englist.add("We pray the love of God enfolds you during your difficult times and he helps you heal with the passage of time.");
        englist.add("Please accept our most heartfelt sympathies for your loss, our thoughts are with you and your family during this difficult time.");
        englist.add("Only distance tests the strength of horses; only time reveals the hearts of men.");
        englist.add("Al that I can say is that I m sorry to hear abt this incident. My thoughts will be with U in my future prayers.");
        englist.add("Every moment of life is a step towards death.");
        englist.add("Although it’s difficult today to see beyond the sorrow, may looking back in memory help comfort you tomorrow.");
        englist.add("May your heart and soul find peace and comfort.");
        englist.add("Heaven is a place nearby, so there’s no need to say goodbye.");
        englist.add("Strengthen me by sympathizing with my strength not my weakness.");
        englist.add("Hold tight to memories for comfort, lean on your friends for strength..");
        englist.add("Please accept our most heartfelt sympathies for your loss.");
        englist.add("We send you thoughts of peace and courage..");
        englist.add("I m deeply shocked at the suddeness of ur father’s demise. May his soul rest in peace!");
        englist.add("We must embrace pain and burn it as fuel for our journey.");
        englist.add("For death is no more than a turning of us over from time to eternity..");
        englist.add("He who has gone, so we but cherish his memory, abides with us, more potent, nay, more present than the living man.");
        englist.add("May the love of those around you help you through the days ahead.");
        englist.add("Our thoughts and prayers are with you.");
        englist.add("Our hearts go out to you in your time of sorrow.");
        englist.add("If tears could build a stairway, and memories a lane, I’d walk right up to Heaven and bring you home again.");
        englist.add("The soul would have no rainbow had the eyes no tears.");
        englist.add("While we are mourning the loss of our friend, others are rejoicing to meet him behind the veil.");
        englist.add("Remember that we love and care about you.");
        englist.add("He spoke well who said that graves are the footprints of angels.");
        englist.add("Words cannot express how sorry we are at this hard time you are going through.");

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