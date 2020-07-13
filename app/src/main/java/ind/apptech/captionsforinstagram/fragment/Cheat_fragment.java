package ind.apptech.captionsforinstagram.fragment;

import android.animation.AnimatorSet;
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

public class Cheat_fragment extends Fragment {

    AnimatorSet set;
    RecyclerView gujarati_list;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt hindiadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Cheat_fragment() {
        // Required empty public constructor
    }

    public static Cheat_fragment newInstance(String param1, String param2) {
        Cheat_fragment fragment = new Cheat_fragment();
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

        gujarati_list = (RecyclerView) view.findViewById(R.id.English_list);
        Net_connection = view.findViewById(R.id.Net_connection);
        layoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        gujarati_list.setLayoutManager(layoutManager);
        englist = new ArrayList<>();

        englist.add("Love only one girl or boy at a time. Or break up with the person. DO NOT CHEAT!!!!");
        englist.add("Cheating is easy. Try something hard, like being committed.");
        englist.add("Cheating is a choice.. Not a mistake. Don't be fooled.");
        englist.add("Forget who hurt you yesterday, but don't forget who loves you tenderly today.");
        englist.add("History repeats itself. Liars will be liars, cheaters will be cheaters, and the person who has always been there for you, will always be.");
        englist.add("I don't understand why people cheat, if you're not happy, just leave.");
        englist.add("People don't cheat by chance, they cheat by choice.");
        englist.add("If you had enough time to cheat, you had enough time to think about it.");
        englist.add("If a guy cheats on another girl for you, he's more than likely to cheat on you for somebody else. As they always say, Once a cheater.. always a cheater!");
        englist.add("No man is more cheated than the selfish man. - Henry Ward Beecher");
        englist.add("All people have feelings, they are not there to be used. If you're not longer interested in someone, they have the right to be informed before you go and cheat or go looking elsewhere. - Jerry Springer");
        englist.add("Some people treat relationships as a video game.. they play them and when they get bored they cheat.");
        englist.add("Some guys will cheat on their girlfriends and sleep like a baby at night but feel guilty when they go to another barber.");
        englist.add("Don't lie, don't cheat, and don;t make promises you can't keep");
        englist.add("If you leave someone for another person, don't be surprised if that person leaves you for someone else.");
        englist.add("I just want an honest relationship. No lies. No mind games. No cheating.");
        englist.add("Cheating on a girl is deeper than people realize. It destroys her outlook on love, her future relationships and peace within herself.");
        englist.add("You knew damn well what you were doing. You knew damn well who you were breaking.");
        englist.add("There is no excuse for cheating in a relationship. - Vicki Sein");
        englist.add("Cheating isn't always kissing, touching or flirting. If you gotta delete your text messages so your partner won't see them, you're already there.");
        englist.add("Anyone can cheat, it takes a real man to be faithful.");
        englist.add("Being labeled a cheater is the worst ever.");
        englist.add("If a man cheats on his woman with you, what makes you think he wont cheat on you with another.");
        englist.add("A mistake is an accident. Cheating and lying are not mistakes, they are intentional choices. Stop hiding behind the word mistake when you get caught!");
        englist.add("The first and worst of all frauds is to cheat one's self. All sin is easy after that. - Pearl Bailey");
        englist.add("Sleeping alone is better than sharing your bed with someone who shares a bed with someone else when you're not around.");
        englist.add("Cheating on a good woman is like failing an open book test.");
        englist.add("You already got caught lying! Stop being fake and try being real for once in your life.");
        englist.add("Once a cheater, always a cheater. If they cheat with you, they'll cheat on you.");
        englist.add("Once a cheater, always a repeater. - Melissa Edwards");
        englist.add("Cheaters think everyone cheats. Liars think everyone lies. Keep this in mind.");
        englist.add("Boys are supposed to love & protect their girlfriends, not hurt & betray them.");
        englist.add("Moving on is simple, what you leave behind that makes it difficult.");
        englist.add("Fraud is the daughter of greed.- Jonathan Gash");
        englist.add("Before lying to one who trusts you remember one of the difficult things to do is to build trust after it has been broken.");
        englist.add("You know you're not sorry if you cheated you're just sorry you got caught.");
        englist.add("If you marry a man who cheats on his wife, you'll be married to a man who cheats on his wife. - Ann Landers");
        englist.add("Don't cry over someone that won't cry over you.");
        englist.add("Cheating on a good person is like throwing away a diamond and picking up a rock.");
        englist.add("Don't cheat in a relationship. If you're not happy then just leave.");
        englist.add("If he will cheat on her that means he will cheat on you. - Lyfe Jennings");
        englist.add("Most people cheat because they're too focused on what they're missing instead of appreciating what they have.");
        englist.add("Being drunk will never, ever, be an excuse for cheating.");
        englist.add("Cheating is easy. Try something more like being faithful. - Don Kel");
        englist.add("You said you'd always be there for me, but I guess that was just another one of your lies.");
        englist.add("He who stands for nothing will fall for anything. - Alexander Hamilton");
        englist.add("I would prefer even to fail with honor than to win by cheating. - Sophocles");
        englist.add("A real man ends a relationship before he starts searching for another.");
        englist.add("Behind the mask of ice that people wear, there beats a heart of fire. - Paulo Coelho");
        englist.add("Someday you'll miss her like she missed you. Someday you'll need her like she needed you. Someday you'll love her and she won't love you. - Lamon Jordan");
        englist.add("Once a cheater always a cheater, they can never be trusted again.");
        englist.add("The only things you give yourself when you cheat are fear and guilt.");
        englist.add("If you cheat on a girl that's willing to do anything for you, you actually cheated yourself out of true loyalty.");
        englist.add("He's playing you because you're the only one who doesn't know. - Stephanie Hernandez");
        englist.add("It is impossible for a man to be cheated by anyone but himself. - Ralph Waldo Emerson");
        englist.add("If your boyfriend or girlfriend has no texts in their phone's history, chances are you're being cheated on.");
        englist.add("If I had to choose between betraying my country and betraying my friend, I hope I should have the guts to betray my country. - E.M. Forster");
        englist.add("There's no pass or fail in relationships, so there's no need for cheating. - Heritier Ndele");
        englist.add("Most people end up cheating because they're paying more attention to what they're missing, rather than what they have.");
        englist.add("Don't lie, don't cheat, and don't make promises you know you can't keep.");
        englist.add("Cheating and lying aren't struggles, they're reasons to break up. - Patti Callahan Henry");

        if (isNetworkConnected()) {
            gujarati_list.setVisibility(View.VISIBLE);
            Net_connection.setVisibility(View.GONE);

        } else {
            gujarati_list.setVisibility(View.GONE);
            Net_connection.setVisibility(View.VISIBLE);
        }

        hindiadapter = new Shayri_Adapt(getActivity(), englist, "rjpthindi");
        gujarati_list.setAdapter(hindiadapter);
        return view;
    }

    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }

}