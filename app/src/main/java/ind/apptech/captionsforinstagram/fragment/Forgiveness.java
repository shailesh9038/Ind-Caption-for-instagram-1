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

public class Forgiveness extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Forgiveness() {
        // Required empty public constructor
    }

    public static Forgiveness newInstance(String param1, String param2) {
        Forgiveness fragment = new Forgiveness();
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

        englist.add("Forgiveness sometimes comes a little too late, but just remember its always better late then never.");
        englist.add("Forgiveness is the key to letting go. Forgiveness isn't about releasing him or her, its about releasing you");
        englist.add("Forgiveness is a gift you give yourself!");
        englist.add("Don't ask for permission first, beg for forgiveness later");
        englist.add("Forgiveness is not something we do for other people. We do it for ourselves to get well and move on");
        englist.add("Forgiveness is something we need to both give and ask for in return");
        englist.add("There are few things in life that cannot be resolved with kindness. Forgive the one that hurts you and you will find forgiveness back in some way or the other");
        englist.add("Forgiveness allows you to focus on the future without combating the past");
        englist.add("Forgiveness is giving up the hope that the past could be any different");
        englist.add("You must forgive those who hurt you, if you don't forgive they have the power over you, forgiveness is for you and no one else");
        englist.add("Forgiveness is the economy of the heart, it saves the expense of anger, the cost of hatred, the waste of spirits");
        englist.add("Forgive others, not because they deserve forgiveness, but because you deserve peace.  if you agree");
        englist.add("Forgiveness is not just for other people, it's for you too. Forgive yourself, move on, and try to do better next time");
        englist.add("Forgiveness does not change the past, but it gives the future a chance");
        englist.add("Forgiveness doesn't mean you excuse the crime. It just means you're no longer willing to be the victim");
        englist.add("Forgiveness is the sweetest revenge.");
        englist.add("Forgiveness does not change the past, but it does enlarge the future.");
        englist.add("Forgiveness is a gift you give to someone else; it's an act of your own will.");
        englist.add("Forgiveness is nothing but recognizing the reality that what has happened has already happened, and that there's no point in allowing it to dominate the rest of your life.");
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