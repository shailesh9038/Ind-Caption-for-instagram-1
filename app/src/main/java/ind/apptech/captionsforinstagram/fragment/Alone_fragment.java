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

public class Alone_fragment extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Alone_fragment() {
        // Required empty public constructor
    }

    public static Alone_fragment newInstance(String param1, String param2) {
        Alone_fragment fragment = new Alone_fragment();
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

        Net_connection = view.findViewById(R.id.Net_connection);
        englishlists = (RecyclerView) view.findViewById(R.id.English_list);
        layoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        englishlists.setLayoutManager(layoutManager);
        englist = new ArrayList<>();

        englist.add("Sometimes the people that u don't want to get hurt doesn't care if they hurt you!");
        englist.add("It's so lonely when you don't even know yourself.");
        englist.add("Sometimes loneliness is my good Friend!!");
        englist.add("When You Sit Alone .. You Sit With Your Past.");
        englist.add("The wrong person will never give you what you want, but they'll make sure they get what they want from you.");
        englist.add("I never knew that one singe blade could mess up my life..");
        englist.add("Only you can put a smile on my face when i'm sad..");
        englist.add("Sometimes people have to cry out all their tears, to make room for a heart full of smiles.");
        englist.add("Maybe I am crazy but laughing makes the pain pass by");
        englist.add("Don't cry over someone who wouldn't cry over you.");
        englist.add("The soul of sadness is self.");
        englist.add("Being lonely is like a storm with no rain, crying without tears.");
        englist.add("I like having low self-esteem it makes me feel special.");
        englist.add("Take my word for it, the saddest thing under the sky is a soul incapable of sadness");
        englist.add("The only way is to move on, because if you don't you'll be suck where you are.");
        englist.add("I could make you happy, too, if only you'd give me a chance.");
        englist.add("How did I go from being so happy, to so sad..");
        englist.add("The worst loneliness is not to likes yourself.");
        englist.add("Your heart is the most precious part of you, never donate it to someone who doesn't appreciate it.");
        englist.add("What loneliness is more lonely than distrust?");
        englist.add("The higher you climb on love's ladder,the harder you fall.");
        englist.add("You have a place in my heart no one else ever could have.");
        englist.add("The most painful memory.. When I walked away and you let me go.");
        englist.add("The greatest pain that comes from love is loving someone you can never have.");
        englist.add("Is having one of those days where they feels like they can't do anything right.");
        englist.add("Be patient and tough; some day this pain will be useful to you.");
        englist.add("Curealty, torment and sadism have been used perennially as joke subject- matter");
        englist.add("I have to cut because it's the only way I can smile");
        englist.add("1 day you will see what you lost. 1 day I'll see what I gained.");
        englist.add("Some nights I burn in the fire of my own thoughts.");
        englist.add("There are two types of people in the world: those who prefer to be sad among others, and those who prefer to be sad alone.");
        englist.add("As a rule, our minds are sad.");
        englist.add("You sometimes think you want to disappear but all you really want is to be found.");
        englist.add("Every man has his secret sorrows which the world knows not; and often times we call a man cold when he is only sad.");
        englist.add("It must be really sad to not be able to do something you love as the years go by.");
        englist.add("Why does it always have to be the one that you love the most hits you the hardest?");
        englist.add("Loneliness is a part of you life. It teaches us that we are not complete in ourselves.");
        englist.add("Sometimes it's easier to pretend you don't care than to admit its killing you.");
        englist.add("It's sad to be happy alone.");
        englist.add("No, I'm not in a relationship, but that doesn't mean I'm available to you, or him, or anyone else. I'm waiting and going on my own terms, finding out who I am.");
        englist.add("QUIET! I can't hear you & all the voices in my head at the same time!");
        englist.add("I don't usually sleep enough, but when I do, it's still not enough.");
        englist.add("I hate being broken. I hate that i cannot go back");
        englist.add("I'm invisible,until someone needs me.");
        englist.add("Every relationship is messed up. What makes it perfect is if you still want to be there when things really suck.");
        englist.add("I hate when people say they miss you, but don't make a effort to speak to you or see you.");
        englist.add("How can I go back to where the smile i had was real.");
        englist.add("Don't judge each day by the harvest you reap but by the seeds that you plant.");
        englist.add("If you are afraid of being lonely, don't try to be right.");
        englist.add("The worst loneliness is not to be comfortable with yourself.");
        englist.add("The have no idea what a bottomless pit of misery I am.");
        englist.add("You must be, said the Cat. or you wouldn't have come here.");
        englist.add("A girl doesn't need anyone who doesn't need her.");
        englist.add("Wake me up when things are going right for once.");
        englist.add("Remember we're all in this alone.");
        englist.add("If You Want To Be Strong, Fight Alone.");
        englist.add("Sometimes It's better To be Alone. Nobody Can Hurt You!");
        englist.add("Loneliness is the universal problem of rich people.");
        englist.add("Tears are prayers too. They travel to God when we can't speak.");
        englist.add("Why be mean to animals when they treat u better then people");
        englist.add("Loneliness is about the scariest thing there is.");
        englist.add("Some friends only last but so long, then they step on you like dirt.");
        englist.add("Why am i so afraid to lose you when you are not even mine?");
        englist.add("That Sad Moment When Your Silence To Save Relation Consider As Your Ego.");
        englist.add("The pain is there to remind me that I'm still alive.");
        englist.add("People say never give up, but sometimes giving up is the best option because you realize you're just wasting your time.");
        englist.add("The worst feeling is not being lonely. It's when someone makes you feel special, then suddenly leaves you and you have to pretend you don't mind at all.");
        englist.add("There is no point in crying, the tears wont bring you back to me.");
        englist.add("I cry then I cut, then I cry again, it never ends");
        englist.add("Sometimes I wish that I never met you. If I had not met you I'd be more free to do the things that I'd want to do in my life. Because of you I'm bound constantly in restraints.");
        englist.add("I like to listen to sad music when I'm sad to make me double sad.");
        englist.add("Is feeling like the weight of the world is sitting on their shoulders.");
        englist.add("You make me feel like I'm going in spirals, I don't know what to do.");
        englist.add("I hope one day you find someone who makes flowers grow in even the saddest parts of you");
        englist.add("Is trying very hard to keep it all together, but has run out of string and super glue.");
        englist.add("You Always Get Hurt The Moment You Begin To Care.");
        englist.add("Some of us are just trying to get through the day without falling apart.");
        englist.add("I'll never forget how being depressed and lonely feels great like a companion to each other.");
        englist.add("One day you'll find someone who doesn't care about your past because they want to be your future.");
        englist.add("Don't cry because it's over, smile because it happened.");
        englist.add("Thank you for breaking my heart, because without that I wouldn't be the person I am today with the person I love.");
        englist.add("It's better to be lonely then to be played by wrong people.");
        englist.add("I'm tired of everyone telling me about their special person when I desperately want one of my own.");
        englist.add("Sometimes there is so much we feel but so little we can say.");
        englist.add("To be alone is to be different, to be different is to be alone.");
        englist.add("Loneliness is the most terrible poverty.");
        englist.add("Behind those fake smiles their lies a lonely heart.");
        englist.add("I don't have a lot of friends, I just know a lot of people.");
        englist.add("No matter how hard I try you're never satisfied..");
        englist.add("Don't try to please other people if in the end, you know it won't work.");
        englist.add("All gracefulness, it seems, is tinged with sadness");
        englist.add("Loneliness is the human condition. No one is ever going to fill that space.");
        englist.add("Alone, all alone Nobody, but nobody Can make it out here alone.");
        englist.add("Loneliness is the first thing which God's eye named, not good.");
        englist.add("Life's so shit it makes what comes out the dog's @ss look good!");
        englist.add("What's the point in all this screaming, no one's Listening any way.");
        englist.add("The truth hurts for a little while, but lies hurt for a lifetime.");
        englist.add("Don't judge each day by the harvest you reap");
        englist.add("Sometimes you need to run away just to see who will follow you");
        englist.add("The loneliest people are the kindest. The saddest people smile the brightest. the most damaged people are the wisest. All because they do not wish to see anyone else suffer the way they do.");
        englist.add("If you're going to make me cry, at least be there to wipe away the tears");
        englist.add("I will wait till the day I can forget YOU or the day you realize you can't forget Me.");
        englist.add("How did we go from talking everyday to strangers?");
        englist.add("You can't be lonely if you are in company of the person you're alone with.");
        englist.add("Smile and no one will see how broken you are inside.");
        englist.add("I hate the moment when suddenly my anger turns into tears.");
        englist.add("I have taken life on the sad side, and it had helped me to understand many many failures, many utter ruins");
        englist.add("You cannot protect yourself from sadness without protecting yourself from happiness.");
        englist.add("The surest cure for vanity is loneliness.");
        englist.add("It is strange to be known so universally and yet to be so lonely.");
        englist.add("I keep telling myself that I don't miss you, and that I don't love you, hoping someday I'll believe it.");
        englist.add("They are never alone that are accompanied with noble thoughts.");
        englist.add("I feel crappy inside, like something just broke.");
        englist.add("It seems to me that the harder I try the harder I fall");
        englist.add("I hate being the one that causes you this pain..");

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