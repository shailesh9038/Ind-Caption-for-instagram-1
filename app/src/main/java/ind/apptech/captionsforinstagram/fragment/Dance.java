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

public class Dance extends Fragment {

    RecyclerView rajputlist;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Dance() {
        // Required empty public constructor
    }

    public static Dance newInstance(String param1, String param2) {
        Dance fragment = new Dance();
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

        englist.add("Dance for yourself, if someone understands good. If not then no matter, go right on doing what you love.");
        englist.add("Life isn't about waiting for the storm to pass, it's about learning to dance in the rain.");
        englist.add("Life is sweet when you pay attention. When it doesn't seem sweet, put a sticker on your nose and do a funky dance.");
        englist.add("The moment in between what you once were, and who you are now becoming, is where the dance of life really takes place.");
        englist.add("Let us read and let us dance - two amusements that will never do any harm to the world. -Voltaire");
        englist.add("While I dance I can not judge, I can not hate, I can not separate myself from life. I can only be joyful and whole. This is why I dance.");
        englist.add("Let us read, and let us dance, these two amusements will never do any harm to the world.");
        englist.add("We're fools whether we dance or not, so we might as well dance.");
        englist.add("Poetry is to prose as dancing is to walking. -John Wain");
        englist.add("There are shortcuts to happiness, and dancing is one of them.");
        englist.add("You've gotta dance like there's nobody watching, Love like you'll never be hurt,Sing like there's nobody listening,And live like it's heaven on earth.");
        englist.add("Those move easiest who have learn'd to dance.");
        englist.add("Dance, when you're broken open. Dance, if you've torn the bandage off. Dance in the middle of the fighting. Dance in your blood. Dance when you're perfectly free.");
        englist.add("Dancing is the loftiest, the most moving, the most beautiful of the arts, because it is no mere translation or abstraction from life; it is life itself. Have lock Ellis");
        englist.add("Work like you don't need the money. Love like you've never been hurt. Dance like nobody's watching.");
        englist.add("Life is like dancing. If we have a big floor, many people will dance. Some will get angry when the rhythm changes. But life is changing all the time.");
        englist.add("There is a bit of insanity in dancing that does everybody a great deal of good.");
        englist.add("Dance is the hidden language of the soul. -Martha Graham");
        englist.add("And those who were seen dancing were thought to be insane by those who could not hear the music.");
        englist.add("We ought to dance with rapture that we might be alive.. and part of the living, incarnate cosmos. -D.H. Lawrence");
        englist.add("When you dance, your purpose is not to get to a certain place on the floor. It's to enjoy each step along the way.");
        englist.add("Dance, even if you have nowhere to do it but your living room. -Kurt Vonnegut");
        englist.add("There are short-cuts to happiness, and dancing is one of them. -Hedwig (Vicki) Baum");
        englist.add("Dancing is the poetry of the foot. -John Dryden");
        englist.add("To dance is to be out of yourself. Larger, more beautiful, more powerful.. This is power, it is glory on earth and it is yours for the taking.");
        englist.add("Opportunity dances with those already on the dance floor.");
        englist.add("We're fools whether we dance or not, so we might as well dance. -Japanese proverb");
        englist.add("Dancing faces you towards Heaven, whichever direction you turn.");
        englist.add("The only way to make sense out of change is to plunge into it, move with it, and join the dance.");
        englist.add("I do not know what the spirit of a philosopher could more wish to be than a good dancer. For the dance is his ideal. -Friedrich Wilhelm Nietzsche");
        englist.add("We should consider every day lost on which we have not danced at least once.");

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