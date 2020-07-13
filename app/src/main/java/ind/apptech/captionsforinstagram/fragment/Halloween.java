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

public class Halloween extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Halloween() {
        // Required empty public constructor
    }

    public static Halloween newInstance(String param1, String param2) {
        Halloween fragment = new Halloween();
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

        englist.add("The number one reason why trick or treating is better than sex is, you can do the whole neighborhood.");
        englist.add("Asked my kid what her favorite part of today's Halloween party and she pointed at thin air and said, 'that ghost'... Now I have to move houses.");
        englist.add("Thank goodness for Halloween, all of a sudden, cobwebs in my house are decorations!");
        englist.add("When you buy Halloween candy to hand out as an adult, it's like you are paying for all the free candy you got when you were a kid.");
        englist.add("Decades have gone by and STILL my parents have not given back the Halloween candy they took from me for safe keeping");
        englist.add("Another year we will celebrate the day witches do not know why everyone has to pay homage to my mother.");
        englist.add("If you walk under the moonlight on this night of Halloween, really safe silhouette of a witch on her broom laughing because the world marks the night in which the living and the dead seamlessly blend.");
        englist.add("A witch come to my room tonight, she and I play with the souls of all who are in Facebook, Alamas people like you.");
        englist.add("My love tonight .. I wish you were a devil to come into my hell");
        englist.add("Happy Halloween! Remember: Do not waste time by mask .. just a coiffed and you're ready!");
        englist.add("Dear Girls : No Need To Do Anything For Halloween .. Just Remove The Makeup And Go To The Party");
        englist.add("I'm putting more thought into my Halloween costume than into my job.");
        englist.add("How much fun it would be to own a lightsaber in a zombie apocalypse???");
        englist.add("If a child asks you a sweet night of witches, tell him you will find many in the cemetery.");
        englist.add("If a child asks you a sweet night of witches, many say they find in the cemetery.");
        englist.add("Halloween is the holiday of monsters .. then this is your night: Enjoy!");
        englist.add("Couples Halloween costumes always end up looking like one person went along with it to save the relationship.");
        englist.add("The oldest and strongest emotion of mankind is fear, and the oldest and strongest kind of fear is fear of the unknown.");
        englist.add("Happy Halloween.. may all of your skeletons stay in the closet where they belong!");
        englist.add("That awkward moment when you can't tell if it's a Halloween costume or their regular clothes..");
        englist.add("Friend: What are you gonna be for halloween? Me: Drunk!");
        englist.add("Why can't Ghosts have babies? Cuz' they have Hollow weenies!");
        englist.add("For Halloween I'm going to write 'Life' on a plain white T-shirt and hand out lemons to strangers.");
        englist.add("You know you're getting old when you have to have a drink to motivate you to go out and have a drink.");
        englist.add("I found out that you do at a Halloween party in honor of the witches .. we need to get a gift?");
        englist.add("You can discover what your enemy fears most by observing the means he uses to frighten you. – Eric HofferActing Is Like A Halloween");
        englist.add("To think that everyone has to find costume for Halloween parties, you only thing you need is to wear a pair of jeans and a shirt, and if you want to give more fear, just let me know and we'll come together.");
        englist.add("Tonight I'll be your bitch! For you I'll do magic!");
        englist.add("Could I borrow your face for Halloween? :PI'll Be Your TrickI'll be your trick if you'll be my treat.Halloween");
        englist.add("If today you go out at night to walk, watch a spirit in the form of man to walk beside you and take you by the hand into the world of the dead.");
        englist.add("Happy Halloween my little monster. I love you!");
        englist.add("[Name] is going to dress up like kanye west for halloween and right after the kids yell, 'trick or treat!' i'm yelling, 'christmas is better!'On Halloween Night");
        englist.add("THe night has just arrived and all spirits come from beyond us dancing next to a bonfire");
        englist.add("Give me a moment I must disguise myself. You're so perfect. Happy Halloween.");
        englist.add("This message goes out to all those who like Halloween. That the great passes beside the werewolf, nonstop dance with the ugliest tomato witch and a picture with the most mischievous ghost, upload to Facebook and scares anyone.");
        englist.add("Halloween is great because kids just show up at your door and hold out bags of candy for you to steal");
        englist.add("When I see kids all dressed up for Halloween I always pretend that I have not recognized them :)");
        englist.add("Tonight we finally leave the house quiet my love .. no problems! Living Halloween!");
        englist.add("Today when entering the Facebook, I get an email with the following message, all your contacts that are today will die, but laughing.");
        englist.add("This message is for those who like Halloween. That the great passes beside the werewolf, nonstop dance with the ugliest tomato witch and a picture with the most mischievous ghost, upload to Facebook and frightens anyone.");
        englist.add("Halloween is my favorite holiday where you can trespass on a stranger's property and make a non-negotiable demand.");
        englist.add("A bold wings was drunk and asks GOD Dear God I'm an angel? Right? And God will not answer my son! Tu're A happy little bat halloween day!");
        englist.add("Halloween should just be changed to National Dress Like a Hoe Day.");
        englist.add("I thought about dressing up as Turn Signal for Halloween, but nobody around here knows what that is.....");
        englist.add("On Halloween night, moon howls and wolves, beasts and ghosts are waiting for you to end the party in your house.Could I Borrow Your Face");
        englist.add("Happy Halloween! Will you come with me on my broomstick, love?");
        englist.add("Halloween Costume Idea: Flower Print Scrubs, Skechers Shape-Ups, Perm. I call it 'Not Sexy Nurse'");
        englist.add("Halloween: The one time of year your parents allow you to go out in the dark of night, dressed like a weirdo, and receive candy from strangers.I'm Not Cleaning This Week");
        englist.add("I was going to change my profile pic to a pumpkin for Halloween, but it didn't look that much different from my actual head.");
        englist.add("I want to wear the scariest costume I can think of to work for Halloween this year, so I'm going as a pregnancy test.");
        englist.add("I'm surprised kids haven't found a way to trick or treat online yet.");
        englist.add("I'm surprised kids haven't found a way to trick or treat online yet");
        englist.add("Halloween is, by far, the safest day to kill a person and leave them in a chair on your porch.");
        englist.add("I don't know what's scarier. Houses with Halloween decorations or houses that still have up Christmas decorations from last year.");
        englist.add("Acting is like a Halloween mask that you put on. – River PhoenixDress Up Like Kanye West");
        englist.add("Friend call me urgent. There was an accident broom witch is a very hurt. I wonder if this well? Happy halloween.!");
        englist.add("Halloween Drinking Game: Drink every-time an Elsa (from Frozen) visits your house.");
        englist.add("I'm not cleaning this week. I'm going to tell everyone the cobwebs and dust are part of the Halloween decorations!!HALLOWEEN");
        englist.add("Halloween is the perfect time to redistribute those undesired condiment packets of ketchup, mustard, BBQ and soy sauce.");
        englist.add("I'm not saying your house is haunted, but I think a ghost just ate all of your Gummy Bears while you were in the bathroom.");
        englist.add("The sun has just dropped and I see souls hovering near my window, I've been laughing because today will be with us.");
        englist.add("Passed a vampire, a zombie, and a prostitute on the way to work tonight. Not sure which ones were in costume..");
        englist.add("The main thing I learned from watching my wife carve pumpkins is she's really good at stabbing things. I should probably be nicer to her.");
        englist.add("For Halloween I'm going as an invisible person. I will be at all your parties.");
        englist.add("I bet when spiders see those fake green cob webs on Halloween they must be like 'Ugh, tourists'.");
        englist.add("I need to borrow someones kid for Halloween. I miss free candy.");
        englist.add("Me and the pumpkin will discuss how to make people scream in fear on the streets.");
        englist.add("'HALLOWEEN'.. the one day I get to dress up and embarrass my kids.. legally. :P");
        englist.add("I think for Halloween I am going to go as Karma. Some of you should be worried.");
        englist.add("Wait .. I prepare for the party. Not everyone has the luck of being ready as you. Happy Halloween.");
        englist.add("Best thing about Halloween is... you can wear whatever you want ;-)");
        englist.add("A grandmother pretends she doesn't know who you are on Halloween.");
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