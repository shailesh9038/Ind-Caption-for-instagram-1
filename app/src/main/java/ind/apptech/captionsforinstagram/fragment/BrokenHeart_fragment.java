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

public class BrokenHeart_fragment extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public BrokenHeart_fragment() {
        // Required empty public constructor
    }

    public static BrokenHeart_fragment newInstance(String param1, String param2) {
        BrokenHeart_fragment fragment = new BrokenHeart_fragment();
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

        englist.add("A BROKEN HEART is glancing at the pictures of the two of you, & then quickly turning your attention to something else to avoid your tears.");
        englist.add("I LOST the one person who thought loved me. He broke his promise and now..I just want another second chance.");
        englist.add("A BROKEN HEART is forcing yourself to hang up the phone after you have dialed the first three digits to his number.");
        englist.add("A BROKEN HEART is secretly wanting to run back to him & secretly wanting to just be loved by him again. ");
        englist.add("Abuse is abuse;;; Be nice.. Harsh words don't break bones but they often break hearts");
        englist.add("I thought when love for you died, I should die. Its dead.Alone, most strangely, I live on.");
        englist.add("Love is like a puzzle. When youre in love, all the pieces fit but when your heart gets broken, it takes a while to get everything back together.");
        englist.add("A BROKEN HEART is asking desperately for just one last chance with the only person responsible for your loneliness. ");
        englist.add("A BROKEN HEART is pretending to not care what his friends are saying about you.");
        englist.add("A BROKEN HEART is when you actually refuse to get out of bed in the morning because you are afraid of the reality that awaits you.");
        englist.add("I hate the day, because it lendeth light To see all things, but not my love to see.");
        englist.add("A BROKEN HEART is seeing him, & even though it may be the hardest thing that you have ever had to do, you decide to walk away.");
        englist.add("I dont know why they call it heartbreak. It feels like every other part of my body is broken too.");
        englist.add("What is the opposite of two? A lonely me, a lonely you.");
        englist.add("I REALLY CARE ABOUT U.... BUT U CARE ABOUT SOMEONE ELSE WHO NEVER CARE ABOUT U...");
        englist.add("A BROKEN HEART is the cold shattering feeling you receive when you hear the syllables of his name. ");
        englist.add("One day you`ll realize...all the love that i gave to you...is now being given to someone else");
        englist.add("A BROKEN HEART is the unforgettable smell of his shirt that sits in that empty box;");
        englist.add("when i close my eyes i think of u and u der on my mind does it call love. No its just my dream ..");
        englist.add("Sometimes I wish you were in my shoes so that one day you would be able to understand my pain and the hell I go through for you.");
        englist.add("Where you used to be, there is a hole in the world, which I find myself constantly walking around in the daytime, and falling in at night. I miss you like hell.");
        englist.add("Just because someone broke your heart does not mean that someone else cannot repair it. Stay strong ladies and gents. Be patient!");
        englist.add("why do girls run away from people that make them happy and stay with the ones who don't?");
        englist.add("I’m tormented, I’m crushed, I don’t know what to do. I’m confused, I’m lost, I totally got no clue. I know I love you. Yeah, that’s true. But when will you start loving me too?");
        englist.add("The hardest thing about realizing you don't love me., is that you spent so much time pretending that you did.");
        englist.add("A BROKEN HEART is knowing that no matter what you do or say to yourself, you can't fool your heart into believing that you will in fact Be Alright.");
        englist.add("A BROKEN HEART is when you think about the individual that broke your heart constantly.");
        englist.add("You reminisce the Good Times almost as if the Bad Times never existed.");
        englist.add("Yet leave me not; yet, if thou wilt, be free; Love me no more, but love my love of thee.");
        englist.add("When love is lost, do not bow your head in sadness; instead keep your head up high and gaze into heaven for that is where your broken heart has been sent to heal.");
        englist.add("A BROKEN HEART is listening to that one song that makes you break down over & over again.");
        englist.add("Sometimes, when one person is missing, the whole world seems depopulated.");
        englist.add("A BROKEN HEART is the emptiness & heart-wrenching feeling you encounter when you see him with his new love.");
        englist.add("Giving up doesnt always mean you are weak; sometimes it means that you are strong enough to let go.");
        englist.add("If there is no more tears to cry thats a reason behind this is your loneliness......!!");
        englist.add("A BROKEN HEART is screaming & begging for a second chance inside.");
        englist.add("Sometimes I wish I were a little kid again, skinned knees are easier to fix than broken hearts.");
        englist.add("A BROKEN HEART is re-reading his ancient letters & putting away the jewelry that he once bought for you.");
        englist.add("A BROKEN HEART is when you are crying yourself to sleep every night & yet crying more & more each morning.");
        englist.add("Sometimes I wish I was a little baby again, because bruised knees heal faster than broken hearts");
        englist.add("TwInKlE TwInKlE LiTtLe sTaR , WhY GaLz hUrTs sO MuCh yAaR ");
        englist.add("Count the garden by the flowers, never by the leaves that fall. Count your life with smiles and not the tears that roll.");
        englist.add("You treat me like shit for no reason, yet I'm still in love with you. Stop breaking my heart. I just want to love you.");
        englist.add("A BROKEN HEART sometimes means: not wanting to go on.");
        englist.add("Have you ever been hurt and the place tries to heal a bit, and you just pull the scar off of it over and over again.");
        englist.add("Just because she comes off strong doesn't mean she didn't fall asleep crying.");
        englist.add("If y0u Flirt nicely,Y0u will enj0y Daily,");
        englist.add("But If y0u l0ve truly,Y0u will Die Daily...!!");
        englist.add("I have Many problems in my life...But My lips don't know that' They Always Smile..");

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