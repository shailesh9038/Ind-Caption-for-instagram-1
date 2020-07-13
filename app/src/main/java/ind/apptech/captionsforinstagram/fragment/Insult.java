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

public class Insult extends Fragment {

    RecyclerView rajputlist;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Insult() {
        // Required empty public constructor
    }

    public static Insult newInstance(String param1, String param2) {
        Insult fragment = new Insult();
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

        englist.add("What's the point of putting on makeup, a monkey is going to stay a monkey.");
        englist.add("Don't think of yourself as an ugly person, just a beautiful monkey.");
        englist.add("Your age doesn't lie. Neither does that face.");
        englist.add("I'd explain it to you, but your brain would explode.");
        englist.add("I like you. People say I've no taste, but I like you.");
        englist.add("Where did you come from, did someone leave your cage open?");
        englist.add("Are you in stupid mode or does this come naturally?");
        englist.add("Is that your face or did your neck throw up?");
        englist.add("Do u practice being this ugly?");
        englist.add("Mirrors can't talk, lucky for you they can't laugh either.");
        englist.add("Please tell me about yourself, I enjoy horror stories.");
        englist.add("There's no such thing as a stupid idea, it's just you.");
        englist.add("My mom says pigs don't eat biscuits. So, I better take that one out of your hand.");
        englist.add("People like you are the reason we have middle fingers.");
        englist.add("It's people like you, that make people like me, look good.");
        englist.add("The difference between us is that I have a reflection and you don't. Yours ran away when she realized she looks exactly like you.");
        englist.add("Rose are red. Violets are blue. I have five fingers, and the middle one is for you.");
        englist.add("You know most days when I look in a mirror I feel ugly, but when I look at you I feel lucky.");
        englist.add("Everyone is entitled to their own opinion, it's just that yours is stupid.");
        englist.add("Why don't you understand me like my iPhone does?");
        englist.add("A friend of mine: Do you think I am funny? Me: Yeah, every time I look at you.");
        englist.add("Holy wow, it looks like your face caught fire and someone tried to put it out with a fork.");
        englist.add("I'm not listening, but keep talking. I enjoy the way your voice makes my ears bleed.");
        englist.add("Mix with people with a good attitude.");
        englist.add("I don't want to be alone. But with you I'd rather be.");
        englist.add("Save your breath, you'll need it to blow up your date.");
        englist.add("I'm busy now. Can I ignore you some other time?");
        englist.add("Can I borrow your brain for half an hour, I am building an idiot.");
        englist.add("No need for insults, your face says it all.");
        englist.add("I'd love to have this battle of wits with you but I don't like fighting an unarmed person.");
        englist.add("If the stuff that comes out of my mouth upsets you, just think of all the things I keep to myself.");
        englist.add("Why bother talking? You'll end up embarrassing yourself in the end.");
        englist.add("Jealousy is a disease, get well soon.");
        englist.add("Anybody who told you to be yourself simply couldn't have given you worse advice.");
        englist.add("Where were you when God was giving out common sense?");
        englist.add("It's not that I hate you, it's just that I wish I had never met you.");
        englist.add("Oh you are dating my ex? Cool, Im eating a sandwich.. want those leftovers too?");
        englist.add("I don't insult people. I just describe them.");
        englist.add("You are so ugly that when you cry, the tears roll down the back of your head, just to avoid your face.");
        englist.add("You look ugly when you cry, much more when you don't.");
        englist.add("Are your parents siblings?");
        englist.add("I'm already visualizing the duct tape over your mouth.");
        englist.add("You are the reason scientists decided that we descended from apes. If you want to stay out of a zoo, then get a mask.");
        englist.add("It could be that the purpose of your life is only to serve as a warning to others.");
        englist.add("Yes, you do have a right to your opinion and I have a, right to mine, and my opinion is that your opinion is ridiculously stupid.");
        englist.add("I became so religious so that I could pray for you to burn in hell.");
        englist.add("I don't even like the people you're trying to imitate, if you are at all.");
        englist.add("Though two heads are better than one but not when one of the head is yours.");
        englist.add("You're so ugly you have to sneak up on a glass of water just to see your reflection.");
        englist.add("I don't hate you. I just don't appreciate your existence.");
        englist.add("You don't have to disrespect and insult others simply to hold your own ground. If you do, that shows how shaky your own position is.");
        englist.add("Careful now, don't let your brains go to your head..");
        englist.add("You saying you're pretty is like me saying I taught Gandhi about peace.");
        englist.add("You're so ugly, that when people see you, they know what the meaning of 'dark and handsome' means. When it's dark, you're handsome.");
        englist.add("Don't feel bad. A lot of people have no talent..");
        englist.add("You are very beautiful, no doubt about that but I will still rate a monkey ahead of you.");
        englist.add("I'd agree with you but then we'd both be wrong.");
        englist.add("I'd insult you right now. But I was raised not to make fun of the mentally challenged. You are lucky.");
        englist.add("When your mom dropped you off at the school, she got a ticket for littering.");
        englist.add("If I want your opinion, I'll ask you to fill out the necessary forms.");
        englist.add("I don't believe in plastic surgery. But in your case, go ahead.");
        englist.add("Last time I checked I didn't ask for your opinion.");
        englist.add("Your head is so big, you don't have dreams you have movies.");
        englist.add("I'm not shy. I just don't like you.");
        englist.add("Calling you ugly would be an insult to the ugly people.");
        englist.add("Don't feel special, I only keep your number in my phone so I know not to answer when you call.");
        englist.add("Hi! I'm a human being! What are you?");
        englist.add("Tell me, is being stupid a profession or are you just gifted?");
        englist.add("Wow! You have a huge pimple in between your shoulders! Oh, wait that's your face.");
        englist.add("Man, if you can get a girlfriend, there's hope for the rest of us.");
        englist.add("Don't sneeze, your brain is so small, it might slip out.");
        englist.add("I don't know what makes you so stupid, but it really works.");
        englist.add("90% of the time I say 'BRB' it just means I don't want to talk to you anymore.");
        englist.add("Just keep talking, I yawn when I'm interested.");
        englist.add("I will try being nicer, if you try being smarter.");
        englist.add("Can you turn around and look at me? Turn back again.");
        englist.add("If I could feed one child each time you did something stupid, I'd stop world hunger.");
        englist.add("Frankly, my dear, I don't give a damn.");
        englist.add("Wow! I'm impressed how long you are able to live without a brain.");
        englist.add("Whatever permission you thought you had to speak to me, I hereby remove.");
        englist.add("I'd insult you but apparently, you need qualities for me to insult.");
        englist.add("A gentleman is one who never hurts anyone's feelings unintentionally.");
        englist.add("What would beauty be without ugliness? See, you are important.");
        englist.add("Your lips are moving, but all I hear is nothing.");
        englist.add("Stupidity is not a crime so you are free to go.");
        englist.add("Are you always this stupid, or are you making a special effort today?");
        englist.add("I heard you had a brain surgery. But the brain rejected you?");
        englist.add("Looks like somebody fell out the ugly tree and hit every branch on the way down.");
        englist.add("You're so much smarter when you don't speak.");
        englist.add("Your intelligence is my common sense.");
        englist.add("If you liked my profile, Raise up ur hands. If not, raise your standard");
        englist.add("How would you like to feel the way you look?");
        englist.add("Do you still love nature, despite what it did to you?");
        englist.add("If you are shameless, you would do as you wish.");
        englist.add("I don't insult people, I just compliment them negatively.");
        englist.add("Don't take yourself so seriously, no one else does.");
        englist.add("Scientists are trying to figure out how long human can live without a brain. You can tell them your age.");
        englist.add("If you're going to be two-faced at least make one of them pretty.");
        englist.add("How do you keep an idiot in suspense? Leave a message and I'll get back to you.");
        englist.add("You must have fallen from heaven. That would explain how you messed up your face.");
        englist.add("I would love to slap you but that would-be animal abuse.");
        englist.add("I do not even need a dictionary to find out what a moron is. I have got the perfect definition standing right in front of me.");
        englist.add("Zombies eat brains. You're safe.");
        englist.add("Girls like shoes more than CLOTHES, Because No Matter How Much They Weigh, it still fits.");
        englist.add("It's not that I'm smarter than you, it's just that you're dumber than everyone else.");
        englist.add("Why are you so stupid today? Anyway, I think that's very typical of you.");
        englist.add("There are levels of ugliness which are acceptable. But looking at you, that is just illegal.");
        englist.add("Your teeth are so yellow, when you smile I can see the Spanish flag.");
        englist.add("Brains aren't everything. In fact, in your case they're nothing.");
        englist.add("If I hurt your feelings in any way I just want to know from the bottom of my heart that I don't care.");
        englist.add("Intelligence is key and you are locked out.");
        englist.add("Let's play fetch a little differently. I will throw the stick and you don't come back.");
        englist.add("You are literally too stupid to insult.");
        englist.add("Envy me, rate me, bottom line, you are not me.");
        englist.add("Heard your family went to a restaurant where they serve crabs just so they could bring you along.");
        englist.add("Go be stupid somewhere else.");
        englist.add("Life is great, you should get one.");
        englist.add("Why don't you slip into something more comfortable? Like a coma.");
        englist.add("Your family tree must be a cactus. Everyone in it is a prick.");
        englist.add("If dignity was money, you could maybe buy a soda.");
        englist.add("If I say something that offends you, let me know so I can do it again later.");
        englist.add("Don't think, it may sprain your brain!");
        englist.add("Act your age not your shoe size.");
        englist.add("You can talk? Quick, call the science community, we have a discovery.");
        englist.add("The First Human Who Hurled An Insult Instead Of A Stone Was The Founder Of Civilization.");
        englist.add("Somewhere along the line, I must have given you the impression I cared. I apologize.");
        englist.add("Me pretending to listen should be enough for you.");
        englist.add("I'm not laughing at you, I'm laughing with you, you're just not laughing.");
        englist.add("I'm not here right now so cry me a river, build yourself a bridge, and Get Over it.");
        englist.add("Do you mind not talking I am trying to ignore you.");
        englist.add("Everyone has the right to be stupid, but you're abusing the privilege.");
        englist.add("It's not that you are weird, it's just that everyone else is normal.");
        englist.add("Girl- How do I look? Boy- I would rather stay blind and let the mirror suffer.");
        englist.add("Teacher: What tense is I am beautiful in? Student: It's surely the past tense.");
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