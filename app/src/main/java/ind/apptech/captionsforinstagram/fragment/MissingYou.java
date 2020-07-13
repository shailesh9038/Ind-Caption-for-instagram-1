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

public class MissingYou extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public MissingYou() {
        // Required empty public constructor
    }

    public static MissingYou newInstance(String param1, String param2) {
        MissingYou fragment = new MissingYou();
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

        englist.add("True love does not have a happy ending, because true love never ends.");
        englist.add("Missing someone so much that you re-read old text conversations and smile.");
        englist.add("I am incomplete without you!");
        englist.add("Remembering is easy for those who have brains. But forgetting is hard for those who have heart.");
        englist.add("Distance means so little when someone means so much.");
        englist.add("The best feeling in the world is when you think that someone forgot you & suddenly you receive a msg from that person saying Hey I am Missing you yaar.");
        englist.add("Have you ever wished that there was a fairy godmother standing next to you right now, waving her magic wand, and taking you to the person you miss the most?");
        englist.add("I keep myself busy with things to do, but everytime I pause, I still think of you.");
        englist.add("Memories behave in a crazy way..They leave u alone, when u are in a crowd.. & when u are alone, they stand with u like a crowd..");
        englist.add("It's hard to forget someone who gave you so much to remember.");
        englist.add("Standing alone on the terrace with cool breez, sky full of stars and your memories.");
        englist.add("You never stop loving someone, you just learn to live without them.");
        englist.add("Time goes by a lot slower when you miss the one you love.");
        englist.add("Usually I am finebut my heartbeat tells me that my heart misses you.");
        englist.add("When you really miss someone, you miss the little things the most,like just laughing together.");
        englist.add("If some thing happens and you lose me, please don' think that' the end, come and find again.");
        englist.add("You have no idea how much your ‘I miss you' means to me. :')");
        englist.add("I feel bad when you miss me, I feel sad when you don't.");
        englist.add("When you love someone, you miss them more, cry when their not there and fear the worst when you haven't heard from them.");
        englist.add("Why does time move so fast when we're together, and so damn slow when we're apart.");
        englist.add("Sometimes when I'm sitting here thinking about you, I wonder if you're also sitting.");
        englist.add("I never Expect Other's to Miss me.. But I will Always Drop my messages into their Inbox to Show: I Still MISS them,with or without their response..");
        englist.add("Love is missing someone whenever you're apart, but somehow feeling warm inside because you're close in heart.");
        englist.add("Yesterday I caught myself smiling for no reason. Then I realized I was thinking of you.");
        englist.add("Sometimes when I'm sitting here thinking about you, I wonder if you're also sitting there thinkingabout me.");
        englist.add("I pretend that I don't care, but it makes me miss you more.");
        englist.add("7 Billions Peoples In The World But My Heart Loves Yew.");
        englist.add("I wake up wanting to talk to you, I go to sleep thinking about you, and I dream about you holding me the way only you do. I miss you.");
        englist.add("Losing someone is not something you ever get over.");
        englist.add("Eight letters, three words, one regret. I miss you.");
        englist.add("If I text you, it means I miss you. If I don't text you, it just means Im waiting for you to miss me.");
        englist.add("When the night has come and the land's dark, when the moon is the only light we'll see, look at the stars, can you count them? I miss you that much.");
        englist.add("Missing you isn't the problem, it's wondering if you'll ever come back that's killing me.");
        englist.add("Before I sleep and after I wake up and all the hours in between .. you occupy my mind. So, practically every moment of the day you are in my thoughts. I miss you.");
        englist.add("If it takes til the end of time I will wait. I miss you <3");
        englist.add("Nothing feels better than a surprise text from that person you miss. :p");
        englist.add("Memories play very confusing role. Make you laugh when you remember the time you cried together. But make you cry when you remember the time you laughed together..!");
        englist.add("Every moment we don't talk or text each other is a precious moment we loose from our lives sia!");
        englist.add("Don't make a special person miss you too much. Try to keep in touch because missing often times leads to, forgetting.");
        englist.add("Sometimes, we hate being bored. Because it gives us a lot of time to think about the people we miss.. :(");
        englist.add("It's not easy to forget everything about you when everything reminds me of you. Miss you :(");
        englist.add("I can love anyone like the way I loved you but no one can love you the way I did.");
        englist.add("Roses are red, violets are blue, I'm counting the days until I can finally see you.");
        englist.add("Every minute I spend with you is like being in heaven and looking in an angel's eyes.");
        englist.add("I did three things today, miss you, miss you and miss you.");
        englist.add("The worst mOment is when both are missing each Otherz buh dOnt wana tell.. Share on FB Share on twitter");
        englist.add("I miss you when I'm not with you.. when I'm not with you all I do is think about you..when I think about you I just want to be with you.. and when I'm with you it's like all of my dreams have come true. I love you.");
        englist.add("Life is so short, so fast the lone hours fly, We ought to be together, you and I. Miss You So Much.");
        englist.add("It's good to miss someone sometimes, even if it hurts your heart.");
        englist.add("Memory is a way of holding onto the things you love, the things you are, the things you never want to lose.!");
        englist.add("Need an app that flashes their name on your phone the moment they miss you :)");
        englist.add("I text you first because I miss you. If I dont text you, Im waiting for you to miss me.");
        englist.add("No Matter How Mature We Are, There's Always A Childish Side Of Us That Comes Out Of Us When We Are In Love.");
        englist.add("I keep myself BUSY with the things I have to do .. but every time i pause , i still END UP thinking of you! :(");
        englist.add("To me you are my rose, every day when I see a beatiful rose I think of you, and miss you, and hope to hold you in my arms.");
        englist.add("When I Miss you.. I read Your old messages :')");
        englist.add("I wish my mind was like a computer and that, with one click on the delete-button, I could erase you. why the hell I miss you ?");
        englist.add("Have been trying really hard not to think of you! It's not working.");
        englist.add("If only you knew how much i really want you with me. If you only knew.");
        englist.add("You're the main reason that I stay up all night thinking about, coming up with cute things that I wish could happen.");
        englist.add("The best feeling in d world is when u think that ur frnd forgot u & suddenly u receive a message from ur frnd saying - I just missed you!");
        englist.add("Whenever I miss you, I just HUG my pillow and imagine its YOU.");
        englist.add("If tears can prove the depth of love, i can fill a sea for u..");
        englist.add("Sometimes when I'm sitting here thinking about you, I wonder if you're also sitting there thinking about me.");
        englist.add("Sometimes it's not about missing someone. its wondering if they're missing you.");
        englist.add("Today I m feeling so low as you are not with me, I miss u every moment wherever I may be I miss you with every beat of my heart, no doubt you are the only one of whom i can think about!");
        englist.add("I miss when we were close and told each other everything.");
        englist.add("If you miss someone, that means you're lucky. It means you had someone special in your life, someone worth missing.");
        englist.add("Even when you hang up, I miss you right away. Even when we're texting, and I'm waiting for your reply, I'm still missing you. Miss you even now.");
        englist.add("Distances are n0t a matter, when the mem0ries are sweet special pe0ple are never f0rg0tten, b'c0z they remain in  Heart Beats :)");
        englist.add("When I text you, it means I miss you. When I don't text you it means I'm waiting for you to miss me.");
        englist.add("sitting here thinking of how much I enjoyed our last moment together and how much I can't wait until the next. I love and miss you very much. Be home soon");
        englist.add("You are on my mind and in my heart. MISS YOU.");
        englist.add("It's not easy to forget everything about you when everything reminds me of you. Miss you.");
        englist.add("I am sitting here thinking of how much I enjoyed our last moment together and how much I can't wait until the next. I love and miss you very much. Be home soon.");
        englist.add("The scariest thing about distance is that you don't know whether they'll miss you or forget you");
        englist.add("The scariest thing about thinking about someone so much is that you'll never know whether they think about you at all.");
        englist.add("You may be out of my sight.. but never out of my mind.. I Miss You!");
        englist.add("Until God closes my eyes, i can't imagine life without you.. Miss You.");
        englist.add("Sometimes, not remembering mey be the better.");
        englist.add("You're so easy to be with and so hard to be without. Always missing you.");
        englist.add("Generally we belive our memory is weak.. But, When we want to forget someone we realize how powerfull our memory is ..!!");
        englist.add("I miss your smile but I miss my own even more.");
        englist.add("Just because you make new friends does not mean you have to erase old ones.");
        englist.add("Memories have a replay button by default :)");
        englist.add("If you hide, I'll seek for you. If you're lost, I'll search for you. If you leave, I'll wait for you. If they try to ta you away from me, I'll fight for you. Because I never want to lose someone I love.");
        englist.add("I miss how we used to talk every minute of every day & how I was able to tell you everything that was on my mind. I miss our conversations.");
        englist.add("Missing someone is a part of loving them.If you're never apart then you'll never know how strong your love really is..");
        englist.add("Behind my smile is everything you'll never understand.");
        englist.add("Just because two people argue, it does not mean they dont love each other. And just because they don't argue, it does not mean they do.");
        englist.add("The person who really loves you sees what a mess you can be, how moody you can get, how hard you are to handle. but still wants you in his/her life.");
        englist.add("When I Listen to My Heart, It Whisper your Name..!!!");
        englist.add("I did three things today; miss you, miss you and miss you.");
        englist.add("Missing you everyday and every moment so much it's hard to handle. But I'm still alive thanks to my great best friends!");
        englist.add("Why is it that when that special someone is far away times goes so slowly, but when they are here it goes so fast? That is so not fair, I want you here always!");
        englist.add("If You ask how much I miss you, I might just say 'a lot', Coz when you are away, I feel so lonely, I try to be okay, but I cannot.");
        englist.add("It's crazy how you can go months or years without talking to someone but they still cross your mind everyday.");
        englist.add("Missing you is a very small word, the extent of which is felt when the winds strike my door and i feel you passing by.");
        englist.add("I miss you more than the sun misses the sky at night.");
        englist.add("Everytime my phone vibrates, i hope its you !!");
        englist.add("I'm tired of missing you, I just want you right here by my side.");
        englist.add("When you touched my hand for the first time, I wanted nothing more than to hold it forever.");
        englist.add("I miss you in every beats of heart, in every blink of my eyes, in every minute of my life and.. In every moment of the day!");
        englist.add("If missing you is a sign you are falling in love.. I MISS you endlessly.");
        englist.add("Time passes.. Memories fade.. Feelings change.. People leave.. But hearts never forget! Missing Some One.");
        englist.add("I Might Have Erased Ur Text. But I Will Never Forget Wat U Wrote. I May Never See You Again But I Will Never Forget Ur Picture. We Might Have Stopped Talking. But I Will Never Forget Ur Voice. I Will Never Forget Our Love I Will Never Forget U.");
        englist.add("Some memory can never be shared with anyone.. Because they're unexplainable.");
        englist.add("Without you every day is a rainy day. I MISS YOU!");
        englist.add("Sometimes its not only the bad memories that makes you sad, but also the best ones which you know will not happen for the second time.");
        englist.add("Absence makes the heart grow fonder.");
        englist.add("I miss you, not the 'I haven't seen you in a while' kind of miss you, but the 'I wish you were here at this very moment' kind of miss you.");
        englist.add("Reading old messages then realizing how much u actually miss that one person :'(");
        englist.add("The distance between us doesn't matter, because in the end, i know we'll both be happy in each others arms. Forever.");
        englist.add("I dont miss him, I miss who I thought he was.");
        englist.add("When a Boy Says I Miss You, he has nothing else to do When Girl says I Miss You, no one in this world can miss you more than her");
        englist.add("It's normal to miss someone when you're alone and lonely. But missing someone when you're busy having fun, that's true affection.");
        englist.add("I m missing someone a ton and don't know how to make it stop or get over it or just hold out hope. the heart wants what it wants and i can't change that.");
        englist.add("Don't be upset because you miss something from your past, there is always a reason why it didn't make it into your future.");
        englist.add("Missing you can turn from pain to pleasure if I knew you were missing me too.");
        englist.add("Tears don't come wen U miss A person Bt they come wen U don't want to miss a person.");
        englist.add("If missing you is a sign you are falling in love... I MISS you endlessly.");
        englist.add("I wish one day you will miss me terribly that no matter how hard you look for me, you won't find me. Why? Because, I want you to miss me the way I'm missing you right now.");
        englist.add("Just the thought of being with you tomorrow, is enough to get me through today.");
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