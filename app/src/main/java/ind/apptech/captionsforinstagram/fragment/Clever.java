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

public class Clever extends Fragment {

    RecyclerView rajputlist;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Clever() {
        // Required empty public constructor
    }

    public static Clever newInstance(String param1, String param2) {
        Clever fragment = new Clever();
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

        englist.add("Any one need relationship advice? Message me and i’ll be here for anyone :)");
        englist.add("ADMIT IT: Life would be so boring without me.");
        englist.add("History is made by those who BREAK THE RULES.");
        englist.add("The whole world is great! That is…until you wake up.");
        englist.add("“Be Brave” Even if you are not pretend to be. No one can tell the difference.");
        englist.add("A man likes his wife to be just clever enough to appreciate his cleverness and just stupid enough to admire it.");
        englist.add("You are not born a winner; you are not born a loser. You are born a chooser.");
        englist.add("We will flip a coin to determine our future. Head, we will be together. Tail, we will flip again.");
        englist.add("The longest five minutes are the last five minutes of a lecture while the shortest five minutes are the last five minutes of an exam.");
        englist.add("STUDY? The act of texting, eating and watching TV with an open textbook nearby.");
        englist.add("would like to remind you that amateurs built the ark professionals built the Titanic");
        englist.add("I don’t like to think myself as ‘Special’ I like to think myself as limited edition.");
        englist.add("You want to come in my life, the door is open. You want to get out of my life, the door is open. Just one request. Don’t stand at the door, you are blocking the traffic.");
        englist.add("My Friend ask me, How is your life? I said she is fine.");
        englist.add("Genius by birth evil by nature human by chance..");
        englist.add("Everything is getting more expensive. Except for people, they are getting cheaper.");
        englist.add("You see a person’s true colors when you are no longer beneficial to their life.");
        englist.add("You know sweety, my lips won’t just kiss themselves. Please help.");
        englist.add("I never make stupid mistakes, only very-very clever ones.");
        englist.add("If you really want to do something, you’ll find a way. If you dont, you’ll find an excuse.");
        englist.add("ME without you is like: Facebook without friends, Youtube without videos and Google with no results.");
        englist.add("If you expect the world to be fair with you b'coz you are fair with them. It's like expecting a lion not to eat you b'coz you don't eat lion.");
        englist.add("Shany has lost her mind, if found, please handle with care it may blow at any time. I apologize for the inconvenience,but could you return it anyway.");
        englist.add("LIFE – LOVE = ZERO");
        englist.add("Girls are like parking spaces, all the good ones are taken.");
        englist.add("Just wondering why brain cells die, skin cells die, your hair follicle die, but fat cells live FOREVER?");
        englist.add("People who are closed mind always open their mouth!");
        englist.add("Ray says crazy is good, crazy is free, crazy is me..");
        englist.add("All man are not fools, some stay bachelors.!");
        englist.add("Sometimes people try way so hard to sound clever on Facebook.");
        englist.add("Leave present time good, No one know about the tomorrow!");
        englist.add("Rules are made to the break!");
        englist.add("My mind tells me to give up, my heart won’t let me.");
        englist.add("Dont let your ears witness what your eyes didn't see... and don't let your mouth speak what your heart doesn't feel.");
        englist.add("Dream is not complete by sleeping!");
        englist.add("I was blinded by your beauty so I’m going to need your name and number for insurance reasons.");
        englist.add("I am so clever that sometimes I don't understand a single word of what I am saying.");
        englist.add("Not all man are fools, some stay bachelors.");
        englist.add("The best nicknames are usually the ones people don’t know they have.");
        englist.add("Never be fooled by what you see on the outside, b’coz on the inside it’s often a different story.");
        englist.add("I don’t trust anyone. Even the Devil was once an Angel.");
        englist.add("If people are trying to bring you down it only means that you are above them.");
        englist.add("If nothing lasts forever, I was wondering if you might wanna be my nothing?");
        englist.add("No matter where I am, no matter where you are, I’ll be there when its over baby. Cause I was there from the start.");
        englist.add("You are gonna need therapy after you meet me..");
        englist.add("It’s funny how many lies can be packed in one LOVE LETTER.");
        englist.add("Money can’t buy friends but you can get a better class of enemy.");
        englist.add("Don't talk to me Because I was attached easily!");
        englist.add("God made every person different, He got tired! when time he got to china.");
        englist.add("GIRL: Describe me in 1 word. —- BOY: Mine ;)");
        englist.add("If all men are the same, why do women take so long to choose one?");
        englist.add("About 90% of the high scores in mobile games are made either in the toilet or in a lecture or while preparing for exams.");
        englist.add("If you are going to speak bad things about me on my back, come to me. I’ll tell you more.");
        englist.add("Cheating is easy …. try something more challenging … like being faithful.");
        englist.add("LOVE is when I can’t pay attention in class because Im too busy writing her first name with my last name.");
        englist.add("Life is too short to be serious all the time. So, if you can’t laugh at yourself, call me … I’ll");
        englist.add("Plese don’t talk to me, I get attached too easily.");
        englist.add("I’m not actually this tall. I am sitting on my wallet.");
        englist.add("Happy on the outside, but simply dieing on the inside.");
        englist.add("Never run after a bus or a girl. There will always be another one.");
        englist.add("Everybody is beautiful to somebody.");
        englist.add("I am type of person, who wants to get good Marks, but doesn't want to study!");
        englist.add("I am not failed, Because my success is lost.!");
        englist.add("Thanks to all those who ask the awkward questions on yahoo answers so that we don’t have to.");
        englist.add("Yesterday is history. Tomorrow is a mystery. Today is a gift. That's why it's called the present.");
        englist.add("Did anyone else notice the sound if you click the like button on my status?");
        englist.add("Kids born in 2000 never have to worry about forgetting how old they are.");
        englist.add("I might as well call you Google, Because you have everything that I am looking for.");
        englist.add("I want a real relationship, not a facebook one..");
        englist.add("What you see on the outside is usually the opposite of what’s on the inside.");
        englist.add("In today's world, the key to success is to delete your.. Whatsapp and Facebook account!");
        englist.add("God made coke. God made pepsi. God made me. Oh so s3xy. God made rivers. God made lakes. God made you. Well...we all make mistakes.");
        englist.add("If nobody love you, then you are doing something wrong!");
        englist.add("Two things only a man cannot hide, that he is drunk and that he is in love.");
        englist.add("When you meet me, you think I am quiet. Then you get to know me and just wish I was quiet.");
        englist.add("No matter how full my wardrobe is, I never seem to find anything to wear.");
        englist.add("Better late than never, but never late is better.");
        englist.add("FACEBOOK: the only book teens read these days.");
        englist.add("I'm a nobody, nobody is perfect, therefore I'm perfect.");
        englist.add("Why does Facebook want to know what I am thinking? Do they not realize that is classified and somewhat scary information??");
        englist.add("There is a thin line between insanity and genius. I, myself, am in the middle, and quite frankly, I enjoy every second of it.");
        englist.add("Never trust a person with one only facebook picture.");
        englist.add("My heart is in the right place, I know, because I hid it there.");
        englist.add("When I close my eyes, I see you …. when I open my eyes, I miss you.");
        englist.add("You are not to old complete your dream true!");
        englist.add("If APPLE made a car, would it have windows?");
        englist.add("People need to lose the attitudes today b’coz I am NOT in the mood.");
        englist.add("Sometimes even I’M afraid of the things my mind comes up with.");
        englist.add("‎BUT is just a word you use when you’re afraid to try.");
        englist.add("I am Not link to my self 'Special' I think I am 'Limited' Edition!");
        englist.add("I wish I could google the things I have misplaced.");
        englist.add("Sometimes its better to keep silent than to tell others what you feel.");
        englist.add("Always try don't feel fail without try!");
        englist.add("Advantages of speaking truth is that you don't need to think to speak!");
        englist.add("If a book about failures doesn't sell, is it a success?");
        englist.add("Can you see yourself the way others see you?");
        englist.add("You remind me of my Chinese friend.. Ug Lee");
        englist.add("Sometimes the best revenge is moving forward and being happy despite the people that try to drag you down.");
        englist.add("Some people are perfect in being *FAKE* then being *REAL*.");
        englist.add("like this if you like to like things");
        englist.add("HUMAN BRAIN: Forgets what we want to remember & remembers what we want to forget.");
        englist.add("I lost my teddy bear. Can i sleep with you?");
        englist.add("There is nothing greater in this world than being loving parents. So take the first step today by getting married. Think different, do different!");
        englist.add("You don’t have to watch what you say if you watch what you think.");
        englist.add("Love doesn't show up on an X-ray... but it's there.");
        englist.add("Hi – Im the girl of your dreams. Someone said you were looking for me.");
        englist.add("I wish my phone never ran out of battery, my fridge never ran out of food and my wallet never ran out of money.");
        englist.add("If nobody hates you, you are doing something boring.");
        englist.add("I stepped on a cornflake today! So I am a cereal killer now…");
        englist.add("I am not scared of dying, I just don’t want to!");
        englist.add("Im a humble person, really. I'm actually much greater than I think I am.");
        englist.add("Finding friends with the same mental disorder as you …….. Priceless :)");
        englist.add("Hanry says my mind not only wanders, sometimes it leaves completely..");
        englist.add("IMMATURE: A word boring people use to describe fun people.");
        englist.add("Relationships are a lot like yard sales, they look really fun from a couple hundred feet away, but then you realize it’s just a bunch of crap you don’t need.");
        englist.add("I am free of all prejudices. I hate everyone equally….");
        englist.add("I feel like a Indiana Jones, b'coz you are the treasure I am looking for.");
        englist.add("Facebook: where stalking people is OK.");
        englist.add("Real relationship is that in which we fight love trust each other!");
        englist.add("I’m jealous of my parents. I will never have a son so cute as they have.");
        englist.add("Try and fail, but don’t fail to try.");
        englist.add("My Girl = My Life …. Touch Her = Your Last Day On Earth.");
        englist.add("The only math I can remember is that …. You + Me = Forever");
        englist.add("When you miss someone, you keep checking their profile.");
        englist.add("LIFE is a given. LIVING is optional. Don`t be a passenger when YOU are already the CAPTAIN.");
        englist.add("Women are meant to be loved, not to be understood.");
        englist.add("Its not illegal unless you get caught.");
        englist.add("I’ve noticed you noticing me and I’m just giving you notice that I’ve noticed you!");
        englist.add("It’s not cheating unless you get caught.");
        englist.add("Don’t worry about tomorrow you did that yesterday.");
        englist.add("Some people might be less attractive but once you get to know them they are hot as hell.");
        englist.add("You can’t make the same mistake twice. The second time you make it, it’s no longer a mistake, it’s a choice.");
        englist.add("Hearts know things that the eyes don’t see and feels things that the mind cannot understand.");
        englist.add("Sometimes no matter..! how much you want things to happen!, all you can do is wait.");
        englist.add("Crazy people love crazy people cuz normal people don’t understand..");
        englist.add("No one is perfect understanding is important!");
        englist.add("My life is open book but i don’t allow everyone to read it.");
        englist.add("When your ex says you’ll never find anyone like me reply that’s the point.");
        englist.add("We should love, Not fall in love...Because everything that falls, gets broken.");
        englist.add("I am SINGLE because I haven't found someone who deserves ME.");
        englist.add("For all of you who gossip about me: Thanks for making me the center of your world.");
        englist.add("When your enemies are making mistakes, don’t interrupt them.");
        englist.add("I never look for trouble, it just always seems to find me.");
        englist.add("My first name and your last name would sound great together.");
        englist.add("I can drive you crazy without a drivers license.");
        englist.add("Lets learn to ignore selfish people just like the way we ignore Terms & conditions of any software.");
        englist.add("Wonders, do you do anything on your own or does everyone else think and make your decisions for you?");
        englist.add("Problem of solving a problem is not a problem, but when a problem solves a problem without any problem then the problem is not at all a problem. Any problem?");
        englist.add("I need a lifetime lover, not a night time lover.");
        englist.add("There is something wrong with my cell phone. It does not have your number in it.");
        englist.add("People wanna see you doing well but not better than them :)");
        englist.add("My first name and your last name, together make sound great!");
        englist.add("When it's time to go, don't doubt or hesitate, hello to Great and Good Bye to good!");
        englist.add("I used to have an imaginary friend. Then he had an imaginary accident.");
        englist.add("The greatest pleasure in Life is that what people say you can't do!");
        englist.add("Its Cute When your Crush's Crush is You.");
        englist.add("Just thought a thought but the thought I thought wasn't the thought I thought I thought.");
        englist.add("The true beauty of a woman is her ability to make a man better in every way.");
        englist.add("My life is like open book but I am not allowed to anyone to read it!");
        englist.add("I am the type of person who wants to get good grades but doesn't want to study :)");
        englist.add("Warning, it’s not safe to talk to me at the moment..");
        englist.add("Why do people with closed minds always open their mouths?");
        englist.add("People are gonna hurt you, but its your decision who gets a second chance.");
        englist.add("An empty web browsing history is a sure sign of pure guilt. ;)");
        englist.add("You are never too old to set another goal or to dream a new dream.");
        englist.add("Laziness is the mother of all bad habbits but ultimately she is a MOTHER and we should respect her.");
        englist.add("Everyone seems normal until you get to know them.");
        englist.add("I won’t try to be awesome, awesome tries to be me.");
        englist.add("if Any one need relationship than Msg me I am free for everyone!");
        englist.add("I have to admit, God was just showing off when he created me.");
        englist.add("In today's world, the key to success is to delete your Whatsapp account!");
        englist.add("No matter how long we have traveled on the wrong road, we can always turn around.");
        englist.add("Can you stop being so attractive? I`m trying to move on here..");
        englist.add("If they can’t do their part, they don’t deserve your heart.");
        englist.add("Don't think about tomorrow, Think about the now!");
        englist.add("People wear masks to see who cares enough to see through it. I built a wall around me to see who would be brave enough to climb it.");
        englist.add("If somebody really cares about you they will never put you on the back burner.");
        englist.add("I speak my mind. I never mind what I speak.");
        englist.add("Women always worry about the things that men forget; men always worry about the things women remember.");
        englist.add("No I didn't trip The floor looked like it needed a hug.");
        englist.add("Typing a long text to your crush with your true feelings but then erasing it and typing… Yeah. Ever Happened?");
        englist.add("People might say your not normal but if you ask me normal isn’t that much fun. being yourself and being abnormal is Awesome, don’t change who you really are..");

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