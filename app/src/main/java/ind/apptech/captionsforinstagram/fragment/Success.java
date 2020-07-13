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

public class Success extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Success() {
        // Required empty public constructor
    }

    public static Success newInstance(String param1, String param2) {
        Success fragment = new Success();
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

        englist.add("Success-minded people must understand that the use of profane and obscene words have no place in their vocabulary.");
        englist.add("Success is falling 9 times and getting up 10.");
        englist.add("We all have a few failures under our belt. It's what makes us ready for the successes!!!");
        englist.add("Willpower, persistence, patience and work bring your desires into manifestation.");
        englist.add("Keep the personal, personal and do not be guilty of spreading bad feelings.");
        englist.add("Your thoughts and mental images create your circumstances. Master your thoughts and mental images, and you gain power over your circumstances.");
        englist.add("The mental movie in your mind is the cause of everything that happens to you.");
        englist.add("I’m not failed…my success is just postponed for some time.");
        englist.add("Change the mental movie that you keep viewing in your mind to one that you like. Keep playing it in your mind, and before you know it, the movie turns into reality.");
        englist.add("Success is the outcome of thinking, visualizing, planning and acting.");
        englist.add("The mental movie that you play in your mind is the life that you will live tomorrow.");
        englist.add("Your mind is the generator of failure, and also the generator of success.");
        englist.add("Through perseverance, many people win success out of what seemed destined to be certain failure.");
        englist.add("Discouragement and failure are two of the surest stepping stones to success.");
        englist.add("What you think today is what you live tomorrow.");
        englist.add("Success also manifests as peace of mind, happiness, satisfaction, inner strength and spiritual enlightenment.");
        englist.add("What you get is determined by the scope of your thinking. Big thoughts lead to big accomplishments. Small thoughts lead to minor accomplishments.");
        englist.add("The key to happiness is being happy with who you are and enjoying the life you are living");
        englist.add("Success in life is a matter not so much of talent or opportunity as of concentration and perseverance.");
        englist.add("Happy thoughts make your life happy. Miserable thoughts make your life miserable. Be careful of what you think.");
        englist.add("Play a movie of success in the projection room of your mind, and soon this movie will turn into reality.");
        englist.add("Try not to become a man of success, but rather a man of value!!!");
        englist.add("We are all different and we all have a different sense of humor.");
        englist.add("The image you have of yourself, and which you broadcast to the world around you is responsible for the way people see and treat you");
        englist.add("Don't let a mediocre person tell you what you are capable of or how your future is going to be.");
        englist.add("Attaining good health, love, good relationships, promotion, status, money and possessions, and realizing desires and ambitions is material success.");
        englist.add("In order to succeed your desire for success should be greater than your fear of failure");
        englist.add("When you rehearse failure in your mind, you meet failure.");
        englist.add("The biggest slap to your enemies is your success!!!!");
        englist.add("Success manifests also in small daily events, not only in the accomplishment of great ambitions.");
        englist.add("It is rudeness of the highest order to hit a family when they are down.");
        englist.add("In order to success your desire to success should be greater than your fear of failure.");
        englist.add("If you want friends you must be friendly. Always complaining and posting negative comments is not going to bring you friends. No one likes to get puked on.");
        englist.add("Your inner world controls your outer world. Learn to improve your inner world, and your outer world would be affected too.");
        englist.add("A minute's success pays the failure of years.");
        englist.add("May my enemies live a long life to see my success.");
        englist.add("Your outer circumstances are the mirror of your inner world. Change your inner world, and you change your outer world.");
        englist.add("When you think there is nothing left in your life, just keep working hard until you die :)");
        englist.add("Remember this, posting pictures are like speaking words, you cannot take them back.");
        englist.add("The key to success is to keep growing in all areas of life--mental, emotional, spiritual, as well as physical.");
        englist.add("Heroes show us courage, honor, integrity and strength. Now more than ever, we need heroes.");
        englist.add("In order to succeed, we must first believe that we can.");
        englist.add("Wisdom tells us that the best time for silence is when we are mad or upset.");
        englist.add("We have gotten so use to humor being something nasty and offensive that we started to believe that was the only way to get a laugh.");
        englist.add("Work hard in silence & let the success make noise.");
        englist.add("No matter who it is or what you think of them, never rejoice in the pain of others. It lowers you to a level you should not be at.");
        englist.add("Behind every successful man is a surprised woman.");
        englist.add("To be truly grateful for the kindness of other and to have those you love in your life is a great and powerful emotion.”");
        englist.add("When you rehearse success in your mind, you experience success in your life.");
        englist.add("Visualize your goals clearly, add desire and faith, and you will surely achieve them.");
        englist.add("Do not undervalue the importance of success in small matters. It proves to you that with persistence, greater success is possible too.");
        englist.add("Remember that people who seek to do evil can play hit and miss all they want. People who are seeking companionship online have to be right every time. Miss out on this one and the price could be very dear, even costing your life.");
        englist.add("When the mind thinks of success, the outside world mirrors these thoughts.");
        englist.add("Success is not only more money, promotion and social status. It is also more happiness, harmonious relationships and spiritual growth.");
        englist.add("Nothing can stand in the way of absolute belief and confidence.");
        englist.add("Ambition is the fuel that feeds your thoughts, visualization and actions.");
        englist.add("Your mental movies are the trailers of the future.");
        englist.add("Choose your thoughts carefully; they are the workers building your life.");
        englist.add("Thoughts fuelled by desire and motivation make things happen.");
        englist.add("A Mistake increases your experience & experience decreases your mistakes. You learn from your mistakes then others learn from your success.");
        englist.add("Nurturing a feeling of success attracts it into your life.");
        englist.add("If at first you don't succeed-try, try again. Don't think of it as failure. Think of it as timed-release success.");
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