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

public class Music extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Music() {
        // Required empty public constructor
    }

    public static Music newInstance(String param1, String param2) {
        Music fragment = new Music();
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

        englist.add("When you're happy.. You enjoy the music.. When you're sad.. You understand the lyrics ..");
        englist.add("You are who you are that’s alright with me, but i am who i am that’s all i can be.");
        englist.add("Music makes one feel so romatic, at least it always get on one’s nerves, which is the same thing nowadays.");
        englist.add("Play a song and then realize you were too distracted to appreciate the beauty of the song so you replay it.");
        englist.add("Hard times call for awesome music.");
        englist.add("Listening to something more interesting than you.");
        englist.add("I'm listening to music because I don't want to listen to you.");
        englist.add("Sometimes hearing the music is just the best way to ignore the world.");
        englist.add("Tuning out the world...");
        englist.add("Music is my way out, Music is my way of getting away, music is another life, some times music is all you need to get away to that world no one knows about");
        englist.add("I'm sorry, I can't hear you, my stereo is on full blast.");
        englist.add("When I listen to old songs, the memories hit me.");
        englist.add("Music: My escape. My way of expression. Poetry for the soul in which each note is a word filled with as much emotion as saying I love you.");
        englist.add("Druming on my eardrums.");
        englist.add("Listening to the sweet sound of music.");
        englist.add("Rocking and rolling.");
        englist.add("Music makes the world go round.");
        englist.add("Every love song makes me cry b’coz every love song reminds me of you.");
        englist.add("Don't interupt me when I'm listening to my music.");
        englist.add("Music is the essence of life.");
        englist.add("Behind every girl's favorite song is an untold story.");
        englist.add("No matter how many walls you put around your heart, the music you listen will tell everyone how you really feel.");
        englist.add("Sometimes it feels like music is my only friend.");
        englist.add("Some songs can make you cry When you hear them. But Actually it isn't the songs, It's the people behind the memories.");
        englist.add("What? I can't hear you, my headphones on so you have to type louder.");
        englist.add("No matter how bad you sing, sing for her.. she'll smile :)");
        englist.add("Isn’t it weird how there’s always a song that expresses my feelings?");
        englist.add("I hate when I have to Pause my Music everytime someone Talks to me :/");
        englist.add("Sometimes music make us realize us how much we love that person :)");
        englist.add("I'm turning you down and I'm turning up the music.");
        englist.add("Classical music is the kind we keep thinking will turn into a tune.");
        englist.add("I'm listening to a magical device that is singing to me.");
        englist.add("Jamming to some jams...");
        englist.add("Music (n): The art of arranging sounds in time so as to produce a continuous, unified, and evocative composition, as through melody, harmony, rhythm, and timbre.");
        englist.add("Music and sleep are the two most common ways to escape from everything.");
        englist.add("All it takes in 1 song to bring back 1000 memories.");
        englist.add("Music has carried me away from the computer.");
        englist.add("Music always helps, no matter what you`re going through.");
        englist.add("Not only do I sing in the shower, but I also dance. Jealous?");
        englist.add("I'm tuning you out and turning up my music.");
        englist.add("I have a song on replay in my head..");
        englist.add("Sometimes, it's not the song that makes you emotional, it's the people & things that come to your mind when you hear it.");
        englist.add("I'm consuming some loud music.");
        englist.add("Music is good for your soul. So... Rock on!");
        englist.add("My room is alive with the sound of music.");
        englist.add("Why do they sing? So I don't have to!");
        englist.add("When I ask you to listen to a song, it's because the lyrics mean everything I'm trying to say to you.");
        englist.add("Without music life would be a mistake.");
        englist.add("Cranking the music up and blowing my eardrums out.");
        englist.add("I believe in music like some people believe in fairy tales..");
        englist.add("I'd rather listen to my music than to you.");
        englist.add("Music is my best friend.");
        englist.add("That awkward moment when you have 10 tabs open and you cant figure out which one the music is coming from.");
        englist.add("No matter what you're going through, no matter how you feel, music always helps.");
        englist.add("Listening to some tunes..");
        englist.add("Sometimes the old songs I hear make my heart glow inside because they remind me of the good moments that are not happening anymore.");
        englist.add("If it's too loud, you're too old!");
        englist.add("Listening to something more pleasant than you.");
        englist.add("MP3ing it.");
        englist.add("Music always put me in a good mood when nobody else can..");
        englist.add("Dear music, i will never be able to thank you enough for always being there for me.");
        englist.add("I'm a really bad singer. No one wants to hear me sing. That's why I'm listening to other people sing.");
        englist.add("My ears were getting bored, so I decided to make them happy.");
        englist.add("Music is my life... So let me enjoy it.");
        englist.add("I hate when I'm listening to music really loud and I have to keep pausing it because I constantly think I'm hearing my name being called.");
        englist.add("Can't hear you! Listening to music!");
        englist.add("One good thing about music, when it hits you, you feel no pain.");
        englist.add("Restarting The Whole Song Because U Missed Your Favorite Line.. :P");
        englist.add("A good song is not based on how many people like it, but on how many memories and feelings you get. that's the true beauty about music.");
        englist.add("When I ask you to listen to a song, it’s because the lyrics mean everything I`m trying to say to you.");
        englist.add("Rya is playing loud music to keep from hearing her own thoughts.");
        englist.add("I'm tuned in to a tune.");
        englist.add("Sometimes hearing the music is just the best way to ignore the world :-))");
        englist.add("Blasting my music to see if I can wake the neighbors up, if I don't come back soon, they probably called the cops on me.");
        englist.add("I would rather listen to someone other than me sing and that does not include you.");
        englist.add("Music is the one thing that never betrays me.");
        englist.add("A Day Without Music Is Like A Year Without Rain.");
        englist.add("Music expresses that which cannot be said and on which it is impossible to be silent.");
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