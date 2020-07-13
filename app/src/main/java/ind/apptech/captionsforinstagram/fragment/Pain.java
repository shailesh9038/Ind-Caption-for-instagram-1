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

public class Pain extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Pain() {
        // Required empty public constructor
    }

    public static Pain newInstance(String param1, String param2) {
        Pain fragment = new Pain();
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

        englist.add("Wishes there was something they could say or do to help you deal with all your pain but words and action are never enough");
        englist.add("My silence is just another word for pain.");
        englist.add("The walls we put up to keep the pain out are the walls that will eventually keep out our happiness take the walls down one brick at a time");
        englist.add("Strength is nothing more than how well we hide the pain.");
        englist.add("When you look at life and say When does the pain go away? Just think about your friends and family and you feel better quicker than ever.");
        englist.add("When you look in my eyes & see the pain inside why do you just keep on creating more pain & breaking me down...");
        englist.add("Why did you leave why don't you care why do you like me in pain if you don't then don't say good bye");
        englist.add("Takes a big person to cause you so much pain and then realise and try to fix what they have done, they must be a little okay :)");
        englist.add("I don't like flirtationships, they are empty but they save you pain for sure.");
        englist.add("I've done stupid things, Said stupid things i didn't mean. But i take it all back, i wish the pain would go back as well as the memory.");
        englist.add("tears in my eyes pain in my heart i will never be happy whilst we are apart.");
        englist.add("Pain is the only thing that's telling me I'm still alive.");
        englist.add("The pain is still there, the tears still run down my face, and my heart is still breaking.");
        englist.add("Never let the pain from your past punish your present and paralyze your future.");
        englist.add("When will this pain end, when will the rampant fires suspend? Will the powers of tranquility render my soul beneath my skin?");
        englist.add("Just because you have experienced pain doesn't mean you won't feel happiness again.");
        englist.add("The more I try, it just gets harder and my pain is getting old.");
        englist.add("life is like this : life is love, love is pain, pain is daily, daily is everything, everything is nothing, nothing is unknown, unknown is life");
        englist.add("If I got a chance to go back in time to change one thing you know what I would change? Nothing cause it's the mistakes and pain of my past that makes me stronger.");
        englist.add("I know i can cause you pain, and annoyance... but let me tell you this, when i say I'm sorry, i do mean t from the bottom of my heart <3");
        englist.add("Those moments when you just suddenly burst into tears... releasing the pain you've held since the past few days");
        englist.add("There are times when we must be hurt in order to grow, we must lose in order to gain, because some lessons in life are best learned through Pain!");
        englist.add("when you have lived my life suffered my pain felt how i feel only then can you judge me");
        englist.add("When someone hurts you physically the pain will go away Once someone hurts you mentally it scars you for life");
        englist.add("The greatest pain that comes from love is loving someone you can never have.");
        englist.add("I'm coming tell the world that I'm coming home let the rain wash the pain of yesterday :/");
        englist.add("says that its not the heartbreak that kills you, the pain comes from all the memories that you have.");
        englist.add("Pain makes you stronger. Tears make you braver. Heartbreak makes you wiser. So thank the past for a better future.");
        englist.add("I have tragic news today. I've just been informed that T-pain has contracted Mer-AIDS.");
        englist.add("It's not always the tears that measure the pain. Sometimes it's the smile we fake.");
        englist.add("One thing about music, when it hits you, you feel no pain ?");
        englist.add("Don't let the pain of your past effect the blessings in your future.");
        englist.add("I'm giving up on loving you,I can't take the pain you've put me through.Deep down I know the feelings will always be there...Maybe someday you'll actually care.");
        englist.add("When music hits you, you feel no pain. ~ RIP Bob Marley");
        englist.add("Time doesn't really Heal the heart. It just makes the heart forget all the pain.");
        englist.add("Life is full of shit and pain, get used to it or take a bullet in your brain");
        englist.add("Trapped in reality, living in chaos, hoping of new, seeing the pain,feeling the hate, smelling the greed,fighting off wars, trying to be, doing the usual.");
        englist.add("God grant me the serenity to live my life in happiness and peace, not in pain or despair. And at the end of my life, please welcome me home.");
        englist.add("You will never know true happiness until you have truly loved, and you will never understand what pain really is until you have lost it.");
        englist.add("Pain warns you something's wrong. Without it, you'd ignore what needs to be fixed in your life.");
        englist.add("Be cautious when playing the blame game, it usually ends up in pain !!");
        englist.add("Every time I look into your eyes I melt, when you touch me my whole body gets warm inside, and when you tell me you love me, it takes all my pain and stress away, because I know I have finally found the one...");
        englist.add("I love crying in the rain. because when i do, no one can hear the pain.");
        englist.add("people who laugh the most have experienced the most pain");
        englist.add("There's always a truth behind JUST KIDDING, a little emotion behind I DON'T CARE, a little pain behind IT'S OKAY, a little I NEED U behind LEAVE ME ALONE...");
        englist.add("Love can't be proven with poems, promises, or presents. Sometimes, only pain and patience can prove it.");
        englist.add("I close my eyes, and I can see a better day. I close my eyes, and pray. I know there's sunshine beyond that rain. I know there's good times beyond that pain (:");
        englist.add("There's always some truth behind: Just kidding, Knowledge behind: I don't know, Emotion behind: I don't care & Pain behind: It's okay.");
        englist.add("There are people you let in your life who'll hurt you, it's up to you who to let go and who's worth the pain!!");
        englist.add("People say that the bad memories cause the most pain, but actually it's the good ones that drive you insane.");
        englist.add("Just like a shoe, if someone is meant for you, they will just fit perfectly, no forcing, no struggling, no pain.");
        englist.add("Pretending to be happy when you're in pain is just an example of how strong you are as a person.");
        englist.add("Never underestimate the power of denial, the heights of assumption or the depths of pain.");
        englist.add("Why is it that the one you love the most and the one who loves you the most is the one who gives you the most pain.");
        englist.add("A relationship is only made for two....but some just forget how to count. Pain is the only thing that's telling me I'm still alive.");
        englist.add("The worst kind of pain is when you're smiling to stop the tears from falling.");
        englist.add("Everyone wants to be happy. No one wants to be sad and get pain. But you can't make a rainbow without a little rain.");
        englist.add("If God loves us so much than why is there so much depression in the world why dose they put us through so much pain and suffering its gotten crazy");
        englist.add("Every day starts a new beginning so erase the pain of yesterday and look forward to the joys of today:)");
        englist.add("A stubborn person can never look past their own hurt to see the pain of the one who caused it. By the time they do ... it's too late.");
        englist.add("Sometimes the memories are worth the pain.");
        englist.add("My favorite kind of pain is in my stomach when my friends make me laugh to hard.");
        englist.add("Every Heart Has A Pain .. Only The Way Of Expression Is Different .. Some Hide It In Eyes While Some Hide In Their Smile.");
        englist.add("Cause the pain that you've been feeling, can't compare to the joy that's coming.");
        englist.add("Sometimes, tears are a sign of unspoken happiness.. and smile is a sign of silenced pain..");
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