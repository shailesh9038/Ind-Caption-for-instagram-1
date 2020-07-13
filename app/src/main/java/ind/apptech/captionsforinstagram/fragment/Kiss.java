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

public class Kiss extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Kiss() {
        // Required empty public constructor
    }

    public static Kiss newInstance(String param1, String param2) {
        Kiss fragment = new Kiss();
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

        englist.add("One day you'll kiss someone and know those are the lips you want to kiss for the rest of your life.");
        englist.add("Hug me when I'm there, miss me when I'm not, kiss me every day, and love me for all eternity.");
        englist.add("For it was not into my ear you whispered, but into my heart. It was not my lips you kissed, but my soul.");
        englist.add("Kisses, Even to the air, Are beautiful.");
        englist.add("Kisses are like tears... the only real ones are the ones you can't hold back.");
        englist.add("A kiss is a lovely trick designed by nature to stop speech when words become superfluous.");
        englist.add("I wasn't kissing her, I was whispering in her mouth.");
        englist.add("Kiss, a contraction of the mouth due to an enlargement of the heart.");
        englist.add("Let me kiss you hard in the pouring rain.");
        englist.add("Any man who can drive safely while kissing a pretty girl is simply not giving the kiss the attention it deserves");
        englist.add("Does it feel the same when she kisses you?");
        englist.add("Can you kiss me on the cheek so I can at least say a cute girl kissed me tonight?");
        englist.add("I don't love him... I just like to kiss him.");
        englist.add("Kissing is like a bee sucking honey from a flower and the honey never ends.");
        englist.add("Smile! It's the second best thing you can do with your mouth. But I like the first one ;)");
        englist.add("The first time we kissed, you captured me.");
        englist.add("I am in favor of preserving the French habit of kissing ladies' hands - after all, one must start somewhere.");
        englist.add("Your taste still lingers on my lips, like I've just placed them upon yours, and I starve for you.");
        englist.add("A kiss is that thing for which the demand is higher than the supply.");
        englist.add("Kisses are like tears, the only real ones are the ones you can't hold back.");
        englist.add("Stolen kisses are always sweetest.");
        englist.add("Kissing is like drinking salted water. You drink, and your thirst increases.");
        englist.add("Kissing is like real estate. The most important thing is location, location, location.");
        englist.add("The cutest thing a guy can do is smile in the middle of kissing because he's so happy to be kissing you.");
        englist.add("I want my first kiss to be long but gentle, soft but glorious. Most of all want it to be with you.");
        englist.add("And you know what I like the best? How hours after you kiss me, I can still feel it on my lips.");
        englist.add("Her lips on his could tell him better than all her stumbling words.");
        englist.add("When I met you I didn't know you, but when I kissed you I was sure you were the one for me.");
        englist.add("Never a lip is curved with pain that can't be kissed into smile again.");
        englist.add("I hope I haven't given you the impression that I consider kissing intrinsically irrational");
        englist.add("I was not kissing him. I was just telling his lips a secret!");
        englist.add("The only thing worth stealing is a kiss from a sleeping child.");
        englist.add("People who throw kisses are mighty hopelessly lazy.");
        englist.add("Soul meets soul on lovers' lips.");
        englist.add("As he kissed me, I wondered how, in the middle of a rainstorm I could feel like I was burning alive.");
        englist.add("A kiss is something you cannot give without taking and cannot take without giving.");
        englist.add("I felt his mouth come down onto mine and I felt his kiss melt every argument away.");
        englist.add("Some people say 'never kiss a friend because that friend will forever be lost' but what if the only person you are looking for is that friend you've never kissed.");
        englist.add("It was the kind of kiss that I could never tell my friends about out loud. It was the kind of kiss that made me know that I was never so happy in my whole life.");
        englist.add("I'd walk half way around the world for just one kiss from you.");
        englist.add("The softer the lips, the better the kiss.");
        englist.add("Never close your lips to those whom you have already opened your heart.");
        englist.add("And when he kissed me that night I couldn't help but think, this is exactly what I have waited for my entire life.");
        englist.add("Let's kiss in the rain; where the rain was so hard the only thing we could see was each other.");
        englist.add("Even though a kiss is very good, there is a moment right before you begin that is even better.");
        englist.add("You changed my world with just one smile, you took my heart with just one kiss.");
        englist.add("A love without a kiss is like a rose with out petals.");
        englist.add("KISS... The best way to shut a girl up.");
        englist.add("Kiss: A contraction of the mouth due to an enlargement of the heart.");
        englist.add("Your lips look so lonely, would they like to meet mine?");
        englist.add("Some women blush when they are kissed, some call for the police, some swear, some bite. But the worst are those who laugh.");
        englist.add("You know you're head-over-heals whenever you get that warm exciting tingle that starts at the lips and flows to the tips of your toes during every kiss.");
        englist.add("It takes a lot of experience for a girl to kiss like a beginner.");
        englist.add("Kiss me, and you will see how important I am.");
        englist.add("A kiss is an event whose probability depends on the vital statistics of 36-24-36.");
        englist.add("Kiss: love professed through lips.");
        englist.add("He was so imperfect already, I could only imagine what structural damage lay beneath but still, as he kissed me, it didn't seem to matter.");
        englist.add("Whoever said, 'A kiss is just a kiss,' never kissed you.");
        englist.add("I kissed my first girl and smoked my first cigarette on the same day. I haven't had time for tobacco since.");
        englist.add("A smile does a good make up in a relationship, but a kiss does even better.");
        englist.add("The only thing better than a kiss, is the moment right before, when he looks into your eyes and leaves you breathless");
        englist.add("Kiss me until I fall asleep.");
        englist.add("If you are ever in doubt as to whether to kiss a pretty girl, always give her the benefit of the doubt.");
        englist.add("Kissing you is like dancing in the rain; it is an exciting kind of sensation that you can't help but fall in love with.");
        englist.add("Any man who can drive safely while kissing a pretty girl is simply not giving the kiss the attention it deserves.");
        englist.add("Soul meets soul on lovers lips.");
        englist.add("I am a strong believer in kissing being very intimate, and the minute you kiss, the floodgates open for everything else.");
        englist.add("Happiness is like a kiss. You must share it to enjoy it.");
        englist.add("Smile! It's the second best thing you can do with your mouth. But I like the first one .");
        englist.add("It's the way that he makes you feel, it's the way that he kisses you it's the way that he makes you fall in love..");
        englist.add("A random kiss is better than an awkwardly planed one.");
        englist.add("A legal kiss is never as good as a stolen one.");
        englist.add("Your hugs and kisses are like the stars that light up my life when things get dark.");
        englist.add("Happiness is like a kiss - it feels best when you give it to someone else.");
        englist.add("I love it when I am just walking away form kissing you good-bye and we both turn around at the some time to get just one more.");
        englist.add("A man's kiss is his signature.");
        englist.add("I fell worthy of every kiss I laid upon you for in each of them went part of my heart.");
        englist.add("I don't wanna miss one smile, I don't wanna miss one kiss. I just wanna stay here with you just like this.");
        englist.add("Inhaling your breath into my body, taking you into my soul, all this, through a kiss.");
        englist.add("So let's meet at the mouth for a kiss that's been so long overdue.");
        englist.add("Your the one I kiss, your the one I hug, your the one I hold, because you're the one I love.");
        englist.add("Your kiss at night is the sweetest for sure it allows me to dream of a thousand more.");
        englist.add("Kissing is like drinking salted water: you drink and your thirst increases.");
        englist.add("Kissing is a means of getting two people so close together that they can't see anything wrong with each other.");
        englist.add("Something has to be right about us being together, because if it wasn't, I don't think I would feel the way I do when you kiss me.");
        englist.add("It's not about butterflies in the first kiss, but that they are there in the last.");
        englist.add("A kiss is the interchange of uni sexual salivary bacteria.");
        englist.add("It's the way that he makes you feel, it's the way that he kisses you it's the way that he makes you fall in love...");
        englist.add("When I see you, I smile. When I hear you, I listen. When I touch you, I feel you. When I kiss you, I love you!");
        englist.add("Kiss me. Kiss me with the intensity that is fueled by the desperate craving of one lover for the other.");
        englist.add("We kiss and it feels like we have just shrugged off the world.");
        englist.add("A kiss without a hug is like a flower without the fragrance !!!!");
        englist.add("A book without words is like love without a kiss .... its empty.");
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