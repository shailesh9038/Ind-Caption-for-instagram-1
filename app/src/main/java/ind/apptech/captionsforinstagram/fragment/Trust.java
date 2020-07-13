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

public class Trust extends Fragment {

    RecyclerView rajputlist;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Trust() {
        // Required empty public constructor
    }

    public static Trust newInstance(String param1, String param2) {
        Trust fragment = new Trust();
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

        englist.add("Wise men put their trust in ideas and not in circumstances. - Ralph Waldo Emerson");
        englist.add("Never trust anyone second time because one who can make mistake one time can also repeat it.");
        englist.add("Don't trust people whose feelings change with time. Trust people whose feelings remain the same, even when the time changes.");
        englist.add("I trusted you, but now your words mean nothing because your actions spoke the truth.");
        englist.add("Find a place you trust and then try trusting it for a while. - Corita Kent");
        englist.add("Never trust someone who wouldn't stand up for you.");
        englist.add("You can't buy trust from the market, neither from the streets. It has to be built with love & dedication.");
        englist.add("Thou can't be trusted if thou can't trust.");
        englist.add("When I give you my time, I'm giving you a portion of my life that I will never get back. Please don't make me regret it.");
        englist.add("Love many, Trust few, But always paddle your own canoe!");
        englist.add("Trust takes years to build, seconds to break, and forever to fix.");
        englist.add("Trust, but verify.");
        englist.add("Trust is the first step of any relationship.");
        englist.add("Don't trust too much. Don't love too much. Don't hope too much. Because that too much can hurt you so much.");
        englist.add("Trust is the most essential thing which will enhance your relationship more and more stronger. But remember once it's broken. You'll lose everything.");
        englist.add("Half the truth is often a great lie.");
        englist.add("If we are bound to forgive an enemy, we are not bound to trust him. - Thomas Fuller");
        englist.add("If you don't know how to trust, then you are not ready to love.");
        englist.add("It hurts a lot when you trust someone blindly. And that someone proves that you are actually blind.");
        englist.add("To be trusted is a greater compliment than to be loved. - George MacDonald");
        englist.add("A person who trusts no one can't be trusted. - Jerome Blattner");
        englist.add("I trust you.. is a better compliment than I love you because you may not always trust the person you love but you can always love the person you trust..");
        englist.add("Trusting someone is giving him or her the keys to ruin your life.");
        englist.add("Never underestimate the power of trust.");
        englist.add("Trust is like an eraser. It gets smaller and smaller with every mistake.");
        englist.add("Trust the instinct to the end, though you can render no reason. - Ralph Waldo Emerson");
        englist.add("It take years to build trust and reputation and a seconds to destroy it.");
        englist.add("A spoken word of feeling is a moment of trust to those hearing.");
        englist.add("You earn someone else trust, it's not given.");
        englist.add("No person in life is trusted without reason.");
        englist.add("Before lying to one who trusts you remember one of the difficult things to do is to build trust after it has been broken");
        englist.add("Trust takes years to build.. But seconds to shatter.");
        englist.add("Trust is the key to the relationship, if you can't trust then why be together.");
        englist.add("A man who doesn't trust himself can never really trust anyone else. - Cardinal De Retz");
        englist.add("It is better to suffer wrong than to do it, and happier to be sometimes cheated than not to trust. - Samuel Johnson");
        englist.add("I am not upset because of what you did to me, I m upset that from now on I can't believe you.");
        englist.add("Trust is like paper once you crumple it it can't be perfect again.");
        englist.add("Trust is like a broken mirror; you piece together all the pieces, but you'll always see the cracks in your reflection..");
        englist.add("Trust was as painful as love.- Nicole Williams");
        englist.add("Creativity comes from trust. Trust your instincts. And never hope more than you work. - Rita Mae Brown");
        englist.add("Without communication there is no relationship. Without respect there is no LOVE. Without trust there is no reason to continue.");
        englist.add("Heart doesn't know what doubt is, heart doesn't know what believe is - heart simply knows trust. - Osho");
        englist.add("A good marriage is at least 80 percent good luck in finding the right person at the right time. The rest is trust. - Nanette Newman");
        englist.add("There's loyalty that protects secrets and loyalty that protects truth. You cannot serve them both.");
        englist.add("Sometimes the person you trust most is the one who trust you the least.");
        englist.add("Whenever the people are well- informed, they can be trusted with their own government. - Thomas Jefferson");
        englist.add("Trust with your heart not your with your head.");
        englist.add("In family relationships the most important things are trust and loyalty.");
        englist.add("Trust is like a paper, once crumpled, it can't be perfect again.");
        englist.add("The key is to get to know people and trust them to be who they are. Instead, we trust people to be who we want them to be - and when they're not, we cry.");
        englist.add("Whats hurts me most is not that you did hurt me but it's that trusting someone is so hard for me now.");
        englist.add("I'm not upset that you lied to me, I'm upset that from now on I can't believe you. - Friedrich Nietzsche");
        englist.add("I don't trust anyone who talks bad about someone else to me, they probably talk behind my back too.");
        englist.add("Trust is a key in any relation and do not need to convince anyone to prove it. If there is need to prove it then believe me there was nothing in your relation.");
        englist.add("Trust everybody, but cut the cards. - Finley Peter Dunne");
        englist.add("Trust is the foundation of love, if you don't have trust you don't have anything in your love life.");
        englist.add("Trust. Such an easy word. Such an impossible quality. - Christine Feehan");
        englist.add("You may not always trust the people you love, but you can always love the people you trust. :)");
        englist.add("Never lie to someone who trusts you. Never trust someone who lies to you.");
        englist.add("Follow your heart, but be quiet for a while first. Ask questions, then feel the answer. Learn to trust your heart.");
        englist.add("None of us knows what might happen even the next minute, yet still we go forward. Because we trust. Because we have Faith. - Paulo Coelho");
        englist.add("Without trust you have nothing.");
        englist.add("Trust, but reserved.");
        englist.add("Trust is something very powerful as it can make a relation terrible or wonderful depending on the person you are trusting.");
        englist.add("It's wonderful to climb the liquid mountains of the sky. Behind me and before me is God and I have no fears - Helen Keller");
        englist.add("Trust isn't meant to be shared with a fool, because if you give too much away, you'll end up being the fool.");
        englist.add("Trust no one unless you have eaten much salt with him. - Cicero");
        englist.add("Whoever is careless with the truth in small matters cannot be trusted with important matters. - Albert Einstein");
        englist.add("When I'm trusting and being myself.. Everything in my life reflects this by falling into place easily, often miraculously. - Shakti Gawain");
        englist.add("If you trust someone, trust till the end whatever the results might be, at the end, either you will have a very good friend or a very good lesson.");
        englist.add("Trust that little voice in your head that says Wouldn't it be interesting if.. And then do it. - Duane Michals");
        englist.add("Trust is earned not given.");
        englist.add("Trust is like a mirror, once its broken its never the same.");
        englist.add("When someone breaks your trust. Don't feel stupid for trusting them. You didn't do anything wrong, they're just an untrustworthy person.");
        englist.add("Trust is like a boomerang, once you throw it to someone, it will sooner or later return to you.");
        englist.add("There is no reward for trusting, as trust itself is a reward.");
        englist.add("Trust is the foundation of love, if you don't have trust you don't have anything.");
        englist.add("One must be fond of people and trust them if one is not to make a mess of life. - E. M. Forster");
        englist.add("When you completely trust another person, you will end up with one of two outcomes. A friend for life or a lesson for life. Both, regardless of the outcome are valuable.");
        englist.add("Perfect description of trust: To give someone the complete authority to destroy you but at the same time being confident that person will never do it.");
        englist.add("You believe lies so you eventually learn to trust no one but yourself.");
        englist.add("Breaking someone's trust is like breaking a pinky promise. It's a no-no.");
        englist.add("It's hard to trust another person after you've been betrayed by the 'one' you trusted the most..");
        englist.add("Trust? Years to earn, seconds to break.");
        englist.add("Without trust, words become the hollow sound of a wooden gong. With trust, words become life itself. - John Harold");
        englist.add("Not everybody trusts paintings but people believe photographs. - Ansel Adams");
        englist.add("Where large sums of money are concerned, it is advisable to trust nobody. - Agatha Christi");
        englist.add("Trust is like a piece of paper, once it is crumpled, it is never perfect.");
        englist.add("Never trust anyone until they have proven to you that they can be trusted.");
        englist.add("In a relation, trust is more important than love. Trust will enhance your love.");
        englist.add("Over thinking killed my happiness. Insecurities killed my self-esteem. Lies killed my trust.");
        englist.add("Trust is like a mirror easily fixed back you can still see the cracks.");
        englist.add("Trust is like a sticker, once removed, it does not sticky anymore as it did before.");
        englist.add("Trust no-one. Even your shadow leaves you in darkness!");
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