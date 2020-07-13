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

public class Brother_fragment extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Brother_fragment() {
        // Required empty public constructor
    }

    public static Brother_fragment newInstance(String param1, String param2) {
        Brother_fragment fragment = new Brother_fragment();
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

        englist.add("A brother is a friend given by nature. - Jean Baptiste Legouve");
        englist.add("My Brother is the GUIDE of my LIFE.");
        englist.add("Brother can read your mind hear your heart and love you just the way you are.");
        englist.add("The younger brother must help to pay for the pleasures of the elder. - Jane Austen");
        englist.add("My brotherz the world best brotherz ever 1 person have.");
        englist.add("He is everybody's best friend and my little brother.");
        englist.add("I luv my brother so much,cz he bought ruler, eraser and highlighter for me.");
        englist.add("The highlight of my childhood was making my brother laugh so hard that food came out his nose.");
        englist.add("If you want to know how your girl will treat you after marriage, just listen to her talking to her little brother.");
        englist.add("Having brothers never feel loneliness in life, isn't it?");
        englist.add("A sister is a gift to the heart, a friend to the spirit, a golden thread to the meaning of life.");
        englist.add("We may look old and wise to the outside world. But to each other, we are still in junior school.");
        englist.add("If we fought, if we irritate each other, If we got angry but never hate each other.");
        englist.add("There is no better friend then a Brother, and there is no better Brother than you.");
        englist.add("Friends come and go, but you my dear Brother, are always there.");
        englist.add("Isn't it strange that brothers can the sweetest of friends and the most bitter of all rivals at the same time?");
        englist.add("I am smiling because you are my brother. I am laughing because there is nothing you can do about it!");
        englist.add("There is a little boy inside the man who is my brother. Oh, how I hated that little boy, and how I love him too.");
        englist.add("Mum used to say we were the same soul split in two and walking around on four legs. It seems unnatural being born together and then dying apart.");
        englist.add("When brothers agree, no fortress is as strong as their common life.");
        englist.add("Brother. I am glad and lucky to have you!! I love you.");
        englist.add("Friends come and go, but You my dear Brother, are always there!");
        englist.add("Glad You're My Brother.");
        englist.add("You r my brother, my best friend forever.");
        englist.add("If we fought, If we Irritate each other, If we got angry but never Hate Each other");
        englist.add("We Fighting like a Tom & Jerry.. We Taking Revenge like a Tom & Jerry.. As well we always Together Like a Tom & Jerry.");
        englist.add("If I could pick the best brother, I would pick you!");
        englist.add("I love you, you were there for me, you protected me, and most of all, you loved me. We'd fight, scream, and argue, but, under it, all, is a love. That only exists, in a brother, and a sister.");
        englist.add("A brother is a friend given by nature.");
        englist.add("I Love My Brothers lot.");
        englist.add("There is no better friend than a Brother, and there is no better Brother than you.");
        englist.add("When my brother with me, I won't afraid.");
        englist.add("Sometimes being a brother is better than being a superhero.");
        englist.add("Even the biggest of boulders, cannot knock shoulder to shoulder.");
        englist.add("Brothers are the best friends, we can have ever.");
        englist.add("A brother is a friend God gave you; a friend is a brother your heart chose for you.");
        englist.add("The beauty of having a little brother is that he will always protect his sister even if he is half her size. Thanks, bro, you will always be my little buddy.");
        englist.add("A Brother Is 1 of Nicest thing you can have, and one of the best things you can be.");
        englist.add("I sought my soul, but my soul I could not see. I sought my God, but my God eluded me. I sought my brother and I found all three.");
        englist.add("A Brother is a gift from God, sent from above to make life worthwhile here below.");
        englist.add("Being brother and sister means being there for each other.");
        englist.add("I don't believe in an afterlife but I still fully expect to see my brother again. - Maurice Sendak");
        englist.add("If your sister is in a tearing hurry to go out and cannot catch your eye, she's wearing your best sweater.");
        englist.add("Big Brother is our First Friend and Second Father!");
        englist.add("I am smiling because you are my brother. I am laughing because there is nothing you can do about it.");
        englist.add("We fighting like a Tom and Jerry. We taking revenge like a Tom and Jerry. As well we always together like a Tom and Jerry.");
        englist.add("There was brotherhood between people who had fed from the same breast, a kinship that even time could not break.");
        englist.add("Glad you are my brother.");
        englist.add("Like and dislike, but mostly dominated by like. Love and hate, but mostly dominated by love - this is how I will describe our cute sister-brother bond. I love you, bro.");
        englist.add("My Brother.. My love & My Life .");
        englist.add("Big Brother is our First Friend and Second Father.");
        englist.add("I think, am sure a brother's love exceeds all the world's loves in its unworldliness.");
        englist.add("There is no love like the love for a brother. There is no love like the love from a brother. - Astrid Alauda");
        englist.add("For Dedicating All BROTHERS in the world (Behalf of their siblings)");
        englist.add("Bonded for better or worse, you're always connected.");
        englist.add("Make your own pick from our list of Best whatsapp status for brother and make your brother feel good for being in your life!");
        englist.add("My sister is the sweetest little thing alive! Words can hardly describe my love for her, she is my best friend.");
        englist.add("We Share a Bond that connects Us as Family.. But out Friendship plays a great role in our Life journey.. I could not Have asked for a better FRIEND than the one I found in U, My BROTHER.");
        englist.add("Brothers are like street lights along the road.. They don't make distance any shorter, but they light up the path & make the walk worthwhile.");
        englist.add("You are Taller than me now.. But still you are little brother for me.");
        englist.add("Sometimes being a brother is better than being a superhero. - Marc Brown");
        englist.add("Sometimes being a brother is even better than being a super hero.");
        englist.add("She's my sister, my soul mate. and the best part of me.");
        englist.add("My brother is the guide of my life.");
        englist.add("A brother shares childhood memories and grown - up dreams.");
        englist.add("Brothers and sisters separated by distance, joined by love.");
        englist.add("Being a big sister is to love your brother, even if he does not want it or love you in return.");
        englist.add("Brothers are the best friends, we can have ever");
        englist.add("World's best brother is mine.");
        englist.add("Dear bro, we gain and lose things every day. But trust me on one thing. You'll never lose me. I will always be here.");
        englist.add("She had always wanted a brother. And she had one now. Sebastian. It was like always wanting a puppy and being a hellhound instead.");
        englist.add("I am born lucky, coz I have a one-in-a-million sibling like YOU.");
        englist.add("A brother may not be a friend, but a friend will always be a brother.");
        englist.add("Brothers are like streetlights along the road. They don't make distance any shorter but they light up the path and make the walk worthwhile.");
        englist.add("The greatest gifts my parents ever gave me were my brothers.");
        englist.add("As long as I have memories in my heart, I will always have a smile on my face.");
        englist.add("Brothers and sisters are as close as hands and feet.");
        englist.add("There is no love like the love for a brother. There is no love like the love from a brother.");
        englist.add("Brothers and sisters are as close as hands and feet. - Vietnamese Proverb");
        englist.add("You are a manipulator. I like to think of myself more as an outcome engineer.");
        englist.add("Brother and sister, together as friends, ready to face whatever life sends. Joy and laughter or tears and strife, holding hands tightly as we dance through life.");
        englist.add("Thanks for always being the perfect older brother who is protective without being suffocative, liberal without being careless and watchful without being stifling.");
        englist.add("Sometimes being a brother is even better than being a superhero.");
        englist.add("We must learn to live together as brothers or perish together as fools.");
        englist.add("In the cookies of life, sisters are the chocolate chips.");
        englist.add("Our paths may change as life goes along, but the bond between us remains ever strong, miss you sister.");
        englist.add("If I could pick the best brother, I would pick you.");
        englist.add("Arguing for the heck of it.. Borrowing & never returning the stuffs.. Brother, for everything you are, I love You very Much.");
        englist.add("It was nice growing up with someone like you.. someone to lean on, someone to count on.. someone to tell on.");
        englist.add("The younger brother must help to pay for the pleasures of the elder.");
        englist.add("Nothing can stop me from loving my brother.");
        englist.add("Being brother & sister means being there for each other.");
        englist.add("A sister is for telling secrets and making promises that will never be broken.");
        englist.add("You are not just my reflection, you are my heart's reverberation and my soul's resonance. Thanks for being there for me bro.");
        englist.add("Written All over My Memories, I see a Love that began within the walls of our Home.. There I see U, My brother, Noted in Every Important part of my Life.");
        englist.add("Written All over My Memories, I see a love that began within the walls of our Home. There I see you, my brother, Noted in every important part of my Life.");
        englist.add("I don't believe in an afterlife but I still fully expect to see my brother again.");
        englist.add("Our paths may change as life goes along, but the bond between us remains ever strong.");
        englist.add("Arguing for the heck of it. Borrowing and never returning the stuff. Brother, for everything you are, I love you very much.");
        englist.add("Brothers are like streetlights along the road. They don't make distance any shorter, but they light up the path and make the walk worthwhile.");
        englist.add("Brother and sister, together as friends, ready to face whatever life sends.");
        englist.add("Sisters are different flowers from the same garden.");
        englist.add("Do you know which the world's stickiest glue is? The one that's between me and you. Love you, bro.");
        englist.add("A friend is a brother who was once a bother.");
        englist.add("Brothers are like streetlights along the road, they light up the path and make the walk worthwhile.");
        englist.add("Having brothers never feel loneliness in life isn't it?");
        englist.add("I don't believe an accident of birth makes people sisters or brothers. It makes them siblings, gives them mutuality of parentage. Sisterhood and brotherhood is a condition people have to work at.");
        englist.add("You are Taller than me now. But still, you are a little brother for me.");
        englist.add("Dear Bro We gain and lose things everyday. But trust me on one thing. You'll never lose me. I will always be here.");
        englist.add("My oldest brother was a big influence on the films I watched as a kid. - Seann William Scott");
        englist.add("I was very troubled, yes. Me and my brother both - we were troubled and troublemakers.");
        englist.add("The memories of my childhood would have been a dark night if it weren't for a brother like you - the sun that lit up my life. Thanks for everything.");
        englist.add("My oldest brother was a big influence on the films I watched as a kid.");
        englist.add("It takes two men to make one brother.");
        englist.add("There's no buddy like a brother.");
        englist.add("After a girl is grown, her little brothers - now her protectors - seem like big brothers.");
        englist.add("Sisters are angels, who lift us to our feet. When our wings have trouble, remembering how to fly.");
        englist.add("After a girl is grown, her little brothers - now her protectors - seem like big brothers. - Terri Guillemets");
        englist.add("I love you, you were there for me, you protected me, and most of all, you loved me. We'd fight, scream, and argue, but, under it all, is a love. That only exists, in a brother, and a sister.");
        englist.add("It was nice growing up with someone like you. Someone to lean on, someone to count on. Someone to tell on.");

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