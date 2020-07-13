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

public class HappyFriendshipDay extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public HappyFriendshipDay() {
        // Required empty public constructor
    }

    public static HappyFriendshipDay newInstance(String param1, String param2) {
        HappyFriendshipDay fragment = new HappyFriendshipDay();
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

        englist.add("Friendship is not a big thing - it's a million small things. Happy Friendship Day!");
        englist.add("Don't walk behind me, I may not lead. Don't walk in front of me, I may not follow. Just walk beside me and be my friend.");
        englist.add("Don't walk in front of me, I may not follow. Don't walk behind me, I may not lead. Walk beside me and be my friend. -Albert Camus");
        englist.add("Never make friends with people who are above or below you in status. Such friendships will never give you any happiness.. Happy Friendship Day.");
        englist.add("I never had better friends than the friends I had when I was twelve. Jesus, does anyone? - stand by me");
        englist.add("There is nothing I would not do for those who are really my friends. I have no notion of loving people by halves, it is not my nature");
        englist.add("A friend is someone who smile when you smile, laugh when you laugh, but hold your hand when you cry.");
        englist.add("Friendship is all about three things winning, losing and sharing. Winning your friends heart, losing yourself ego, and sharing joys and sorrows.");
        englist.add("The best cosmetic for the lips is truth, for the voice is prayers, for the eyes is pity, for the hands is charity & for the life is friend ship");
        englist.add("One loyal friend is worth ten thousand relatives.. Happy Friendship Day.");
        englist.add("Friends are like money in the bank, longer you keep them, the more they are worth.");
        englist.add("Love is blind, friendship closes its eyes.");
        englist.add("Your friend is the man who knows all about you, and still likes you. -Elbert Hubard");
        englist.add("Friendship is a tomorrow, yesterday, today and everyday.. Happy Friendship Day.");
        englist.add("True friends are the people who brighten your smile every time your with them.");
        englist.add("A friend is someone who knows all about U and still loves U.");
        englist.add("You can always tell a real friend: when you've made a fool of yourself he doesn't feel you've done a permanent job");
        englist.add("Friends let you know that you are not alone on the road of life");
        englist.add("The greatest gift of life is friendship, and I have received it.");
        englist.add("Everyone is a friend, until they prove otherwise.");
        englist.add("Friendship is born at that moment when one person says to another: What! You too? I thought I was the only one.");
        englist.add("I may never get the chance to win the lottery. I may never get the chance to go on vacation. But I have the chance to be your friend, that chance I will take.");
        englist.add("Friendship is a warm feeling which comes from the inner core of the heart it cannot be buy or sell.");
        englist.add("I believe in angels, the kind that heaven sends. I'm surrounded by angels but I call them my best friends");
        englist.add("Friendship is like one mind in two bodies.");
        englist.add("One of the most beautiful qualities of true friendship is to understand and to be understood.");
        englist.add("I won't promise to be ur friend forever, coz I won't live that long. But let me be ur friend as long as I live");
        englist.add("It would be easier to cut off my hand than lost you as my friend.");
        englist.add("If all my friends were flowers, I would look around and pick you.");
        englist.add("Tumhari yaadon ko yun bhula naa payenge hum, Dost ho dosti ki kasam zindagi bhar yaad ayenge hum.");
        englist.add("Square has 4 ends triangle has 3 ends line has to ends life has one end but our friendship has no end");
        englist.add("A good friend finds it harder to hold a pencil than to hold a grudge.");
        englist.add("Friendship is not a big thing it's a million little things.");
        englist.add("Each friend represents a world in us, a world possibly not born until they arrive, and it is only by this meeting that a new world is born. -Anais Nin");
        englist.add("Beware when you are judging you friends, for they maybe judging you first.");
        englist.add("I cannot even imagine where I would be today were it not for that handful of friends who have given me a heart full of joy. Let's face it, friends make life a lot more fun. #TrueFriends");
        englist.add("Friends are the siblings god forgot to give us.");
        englist.add("A faithful friend is the medicine of life.. That remove all Pain.. Happy Friendship Day.");
        englist.add("Golden rules to feel happy meet a friend, call a friend, talk to your friend, hug a friend, and love a friend.");
        englist.add("The best time to make friends is before you need them. #LoveOfFriends");
        englist.add("It is not always easy and it does not always bring happiness. But when we do not drop living, why should we drop loving.");
        englist.add("Word of true friend: I would conquer the whole world with just one hand, if you are holding the other hand.");
        englist.add("Gift from a friend is a wish for your happiness.. Happy Friendship Day.");
        englist.add("No person is your friend who demands your silence, or denies your right to grow. – Alice Walker");
        englist.add("Friends are the roses of life: pick them carefully and avoid the thorns.");
        englist.add("Rare as is true love, true friendship is rarer. Happy Friendship Day.");
        englist.add("Your friendship is a special gift generously given.. happily accepted and deeply appreciated.");
        englist.add("A single rose can be my garden.. a single friend, my world.");
        englist.add("I am very happy because my friends got some esteem for me and they are always aware of what is happening to me so I always smile at life.");
        englist.add("Someone who likes you most, sometimes hurts you, but he is the only one who feels your pain.. Happy Friendship Day.");
        englist.add("It takes a long time to grow an old friend. -John Leonard");
        englist.add("Friendship is not finding gold or silver among the rocks of life. It is accepting each other as coal until diamonds are formed with time.");
        englist.add("If we had not spoken to strangers, we would not have had any friends in life at all. Amazing but true.");
        englist.add("A friend is someone who knows the song in your heart, and can sing it back to you when you have forgotten the words.");
        englist.add("A real friend is one who walks in when the rest of the world walks out. -Walter Winchell");
        englist.add("Walking with a friend in the dark is better than walking alone in the light.");
        englist.add("Your best friends are going to hurt you every once in a while, you must forgive them for that.");
        englist.add("Let us be grateful to people who make us happy, they are the charming gardeners who make our souls blossom.. Happy Friendship Day.");
        englist.add("If you live to be a hundred I want to live to be a hundred minus one day so I never have to live without you.");
        englist.add("A True Friends Is that Which can Stand with us in Difficult time");
        englist.add("Everyone can speak sweet word every one can buy sweet chocolate every one can smell sweet rose but no one can have sweet person like you.");
        englist.add("True friendship is like sound health, the value of it is seldom known until it be lost. - Charles Caleb Colton");
        englist.add("It is the best feeling in the world when you say hi to me or smile at me, or sms me because I know at least for a sec I crossed your mind");
        englist.add("On this International Day of Friendship, let us cultivate warm ties that strengthen our common humanity and promote the well-being of the human family");
        englist.add("Friendship is the only cement that will ever hold the world together.");
        englist.add("Only a true best friend can protect you from your immortal enemies.");
        englist.add("Friendship is a incurable diseases which will finish after the death.");
        englist.add("True friends are those who care without hesitation, remember without limitation, 4give without any explanation & love even with little communication.");
        englist.add("Friends are like fishes we have to keep long patience to catch them. So, it is better to stay nice, otherwise I will fry you.");
        englist.add("A real friend is one who walks in when the rest of the world walks out.. Happy Friendship Day.");
        englist.add("A friend is someone who is there for you when he'd rather be anywhere else. -Len Wein");
        englist.add("A hug is worth a thousand words. A friend is worth more.");
        englist.add("Friends show their love in Trouble times.. Happy Friendship Day!");
        englist.add("Never look back. Never regret. Never remember the people you have met. Never begin. And never end. Never say never when it comes to your friends.");
        englist.add("A friend is someone who listens when you speak, understands when you cry and guides you on your way.");
        englist.add("Through life we suffer. Through friends we never have to suffer alone");
        englist.add("A good way to differentiate love and friendship without you I cannot live is love u must live, I m with u is friendship");
        englist.add("6 rules to be happy free your heart from hatred free your mind from worries live simply expect less give more & always have me as your friend");
        englist.add("The trouble is not so much dying for a friend, it is finding a friend worth dying for.");
        englist.add("Dua karte hain hum sar jhukaaye, Aye dost tuu apni manzil hmse jaldi paye.");
        englist.add("Nothing but heaven itself is better than a friend who is really a friend.. Happy Friendship Day.");
        englist.add("The best way to destroy an enemy is to make him a friend.");
        englist.add("True friendship are seen through the heart, not through the eyes.. Happy Friendship Day.");
        englist.add("If you open my heart, guess what you are going tp see it is you. True friends are hard to find so I kept you.");
        englist.add("Friends are the light of life. Hold a true friend with both your hands.. Happy Friendship Day.");
        englist.add("If you ever need a hand.. You will always find mine Hand.. Happy Friendship Day dear friend!!");
        englist.add("Friend is one, who (F)inds you in a (R)ush of people, (I)nspires you to do something in life, catch your (E)motions and (N)ever leaves you till (D)eath.");
        englist.add("If I die today, or even tomorrow I will have no regrets if you tell me you're my friend.");
        englist.add("It is one of the blessings of old friends that you can afford to be stupid with them.");
        englist.add("My best friend is the man who in wishing me well wishes it for my sake.");
        englist.add("A friend is one who believes in you when you have ceased to believe in yourself.");
        englist.add("A friend is someone who understands your past, believes in your future, and accepts you just the way you are.");
        englist.add("Every person is a new door to a different world.");
        englist.add("A good friend is like a computer, me 'enter' ur life, 'save' u in my heart, 'format' ur problems, 'shift' u 2 opportunities & never 'delete' u from my memory!");
        englist.add("Despite the advice about choosing your friends wisely, you really cannot choose your friends. They choose you.Our paths may change as life goes along, but the bond between friends remains ever strong.");
        englist.add("True friends are like diamonds, they are real and rare. False friends are like leaves, they are scattered everywhere. Take care, my diamond.");
        englist.add("There is nothing on this earth more to be prized than true friendship.");
        englist.add("Don't ever think that you can live without friend. Friend is the best thing in the world.");
        englist.add("Don't walk behind me, I may not lead. Don't walk in front of me, I may not follow. Just walk beside me and be my friend.. Happy Friendship Day.");
        englist.add("Friendship marks a life even more deeply than love. Love risks degenerating into obsession, friendship is never anything but sharing");
        englist.add("Promise me you'll always remember: You're braver than you believe, and stronger than you seem, and smarter than you think");
        englist.add("The greatest gift is not found in a store nor under a tree, but in the hearts of true friends.");
        englist.add("True friendship multiplies the good in life and divides its evils. Strive to have friends, for life without friends is like life on a desert island.. to find one real friend in a lifetime is good fortune, to keep him is a blessing. Happy Friendship Day.");
        englist.add("Do you think, tat any one can live without friends? It is impossible. Because friends are the inseparable part of our life.");
        englist.add("When friendship is deeply rooted, it is a plant that cannot even be uprooted by a storm.");
        englist.add("Walking with a friend in the dark is better than walking alone in the light.. Happy Friendship Day");
        englist.add("True Friends are born, not made.. Happy Friendship Day.");
        englist.add("Friendship is the most pure relation in the universe. Happy Friendship Day.");
        englist.add("A loving memory of your smiling face, a friend like you can never replace, deep in my heart you will always stay, truly remembered ever.");
        englist.add("Dosti ka yeh tohfa yaad rakhna, Dil k ek kone me hmara b naam rkhna. Happy Friendship Day.");
        englist.add("I might run out of cute graphics to send you, but ill never run out of this: care for you.");
        englist.add("In a friends you find a 2nd self.. Happy Friendship Day");

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