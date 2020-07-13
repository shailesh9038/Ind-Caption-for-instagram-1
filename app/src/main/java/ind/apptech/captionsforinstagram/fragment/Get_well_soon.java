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

public class Get_well_soon extends Fragment {

    RecyclerView rajputlist;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Get_well_soon() {
        // Required empty public constructor
    }

    public static Get_well_soon newInstance(String param1, String param2) {
        Get_well_soon fragment = new Get_well_soon();
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

        englist.add("When I heard that you were ill it made me feel so sad. But I know soon you’ll feel much better and make everyone feel glad. Get Well Soon Dear.");
        englist.add("There are many reasons, for you to get well. Your family loves and needs you,your family is worried about you. Your family is totally unsupervised in your kitchen.");
        englist.add("It’s nice to hear you’re doing well, And convalescing fast, And here’s a wish that your good health, Will last and last and last.");
        englist.add("The art of medicine consists of amusing the patient while nature cures the disease.");
        englist.add("An early morning walk is a blessing for the whole day.");
        englist.add("As you rest and heal, know that you are thought of warmly and wished a quick recovery.");
        englist.add("I miss u every day. I’m always thinking of u, So this is what I say, Get Well Soon!");
        englist.add("Get well cards have become so humorous that if you don’t get sick you’re missing half the fun.");
        englist.add("If these flowers were wishes, then my wish for you is to get well soon.");
        englist.add("The track which is waiting for you to win on it! Get well soon!");
        englist.add("Hurry up and get the heck out of there!");
        englist.add("I wonder why you can always read a doctor’s bill and you can never read his prescription.");
        englist.add("A bowl of warmth, a soft face, a new day. Some get-well thoughts sent your way. Feel better soon.");
        englist.add("Remember what I say, your getting better by the day.");
        englist.add("You’re not sick you’re just in love.");

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