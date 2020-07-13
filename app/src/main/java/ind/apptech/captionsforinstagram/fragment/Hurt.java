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

public class Hurt extends Fragment {

    RecyclerView rajputlist;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Hurt() {
        // Required empty public constructor
    }

    public static Hurt newInstance(String param1, String param2) {
        Hurt fragment = new Hurt();
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

        englist.add("Expecting too much is one way of hurting yourself.");
        englist.add("My silence/smile is just another word for my pain.");
        englist.add("People cry, not because they're weak. It's because they've been strong for too long.");
        englist.add("When you are in love and you get hurt, it's like a cut... it will heal, but there will always be a scar.");
        englist.add("Sometimes you have to hurt someone's feelings just to let them understand how it felt when they hurt yours.");
        englist.add("Hurt me with the truth, but never comfort me with lie.");
        englist.add("There are times when we must be hurt in order to grow, we must lose in order to gain, because some lessons in life are best learned through Pain!");
        englist.add("Sometimes life doesn't want to give you something you want, not because you don't deserve it, but because you deserve more.");
        englist.add("One day you will realize how much i was there for you, when i'm gone.");
        englist.add("The worst kind of pain is when you're smiling to stop the tears from falling.");
        englist.add("It really hurtzz when sombody else starts taking your place in someone's life..");
        englist.add("Hurting back the people who hurt you, makes you become just like them.");
        englist.add("Isn't it sad when you get hurt so much, you can finally say 'i'm used to it'.");
        englist.add("When I close my eyes I see you, when I open my eyes I miss you.");
        englist.add("The same person who said the sweetest things to me also said some of the meanest things I've ever heard.");
        englist.add("The person you care for the most, is the person you'll let hurt you the most.");
        englist.add("Pain is the only thing that's telling me I'm still alive.");
        englist.add("When I see you smile and know that it is not for me, that is when I will miss you the most.");
        englist.add("Sometimes i'm not angry i'm hurt and there's a big difference.");
        englist.add("If it's not a happy ending then it's not the ending at all.");
        englist.add("Smile. It will make him so jealous to see you're happy without him.");
        englist.add("The truth may hurt for a little while but a lie hurts forever.");
        englist.add("If you fall in love... be ready for the tears..!!");
        englist.add("You know what friends ur polite nature to others always hurts you.");
        englist.add("No matter how much you have hurt me, I still pray for you every night.");
        englist.add("It hurts when something good ends, but it hurts even more if you cling to it, knowing that its not there.");
        englist.add("The most painful goodbye's are those which were never said and never explained.");
        englist.add("During the day I keep myself busy and sometimes time passes. But at night, I really miss you.");
        englist.add("It's not your fault for hurting me. It's mine for thinking you wouldn't.");
        englist.add("I hate the moment when suddenly my anger turns into tears.");
        englist.add("When it hurts so much that you can't breathe, that's when you know you're still alive.");
        englist.add("Dear Hear, please stop getting involved in everything. Your job is to pump blood that's it.");
        englist.add("You can't keep hurting a person and expect them to keep loving you.");
        englist.add("I feel so far away from the one I wish to hold in my arms.");
        englist.add("Sometimes the people who are thousands of miles away from you can make you feel better than the people who are right beside you.");
        englist.add("The hardest thing is to hurt yourself for the sake of others' happiness..");
        englist.add("The worst feeling is saying goodbye to someone you want to spend every minute with.");
        englist.add("Don't ask why someone keep hurting you. Ask yourself why you're allowing them.");
        englist.add("It hurts the most, when someone who made you feel special yesterday then makes you feel like you are the most unwanted person today.");
        englist.add("Nothing hurts more than realizing he meant everything to you and you meant nothing to him");
        englist.add("The easiest way to not get hurt is to care but that's the hardest thing to do.");
        englist.add("It still hurts that you're doing completely okay, without me.");
        englist.add("Isn't it sad that you are hurt so much that finally you can say.. I'm used to it Sometimes It's better to be alone... No one can hurt you.");
        englist.add("Sometimes it's better to be Alone, Nobody can hurt you");
        englist.add("I can always pretend I'm okay, but it doesn't mean I don't get hurt..");
        englist.add("Every time I start trusting someone,they show me why I shouldn't.");
        englist.add("Sometimes when I say: I'm okay. I want someone to look me in the eyes, hug me tight, and say: I know you're not.");
        englist.add("When u love someone, even though they hurt u nd break your heart, you still love them with all the little pieces!!");
        englist.add("Seeing people change isn't what hurts. What hurts is remembering who they used to be.");
        englist.add("Words don't have the power to hurt you, unless the person who said them means a lot to you.");
        englist.add("I hope you'll realise how much you're hurting me some day.");
        englist.add("The truth hurts for a little while, but lies hurt for a lifetime.");
        englist.add("Sometimes the person you trust most is the one who trust you the least.");
        englist.add("You hurt me more than I deserve, how can you be so cruel? I love you more than you deserve, why am I such a fool?");
        englist.add("Don't trust too much, don't love too much, don't care too much because that 'too much' will hurt you so much!");
        englist.add("I'm not somebody who will go out of my way to hurt somebody when i love them... I'm somebody who will go out of my way to get hurt for the people i love..");
        englist.add("It hurts the worst when the person that made you feel so special yesterday, makes you feel so unwanted today.");
        englist.add("Sometimes It's better to be alone... No one can hurt you.");
        englist.add("It's a lot easier to say you're mad than to admit you're hurt.");
        englist.add("I'm not afraid to fall in love. I'm afraid to fall for the wrong person again.");

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