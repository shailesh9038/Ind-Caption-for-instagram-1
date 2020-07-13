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

public class Cool extends Fragment {

    RecyclerView rajputlist;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    private RecyclerView.LayoutManager layoutManager;
    LinearLayout Net_connection;

    public Cool() {
        // Required empty public constructor
    }

    public static Cool newInstance(String param1, String param2) {
        Cool fragment = new Cool();
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

        englist.add("Your looks don't make you Beautiful, it's the person inside who makes you beautiful.");
        englist.add("Please don't get confused between my my attitude and personality!");
        englist.add("Nowadays, Cool means- I really don't care.");
        englist.add("*Walking around supermarket* *Don't see mom* ACT COOL, ACT COOL!");
        englist.add("Never too busy to be happy :-)");
        englist.add("Don't judge me I was born to be awesome not perfect.");
        englist.add("Dear Lord, there is a bug in your software.. It's called #Sunday, please fix it!");
        englist.add("FBI, Open the door!.. Uh.. no .. it's cool when you break in.");
        englist.add("I am not arguing, I'm simply explaining why I am right.");
        englist.add("Life is like riding a bicycle to keep your balance, you must keep moving.");
        englist.add("Going to Macdonald for a salad is like going to prostitute for a hug.");
        englist.add("Why is 'Monday' so far from 'Friday' and 'Friday' so near to 'Monday'??");
        englist.add("Apni to bass ek hi wish hai.. Ser pe Taaj.. Sath me koi Khass Aur is kamini duniya pe Raaj!");
        englist.add("Pople are like 'MuSic' some say the 'TrUth' and rest, Just noise.");
        englist.add("Always trying to cool my self.");
        englist.add("Your profile picture is a car.. that's cool I didn't know you were a transformer");
        englist.add("Yes I am smiling and you're not the reason anymore.");
        englist.add("Try to solve your problem yourself.. Don't Depend on other!");
        englist.add("There comes a point in life, when you realize who really matters, who never did, and who always will.");
        englist.add("Never too busy to be happy. :-)");
        englist.add("Oh so now I'm invisible to you? That's cool. I've always wanted a superpower.");
        englist.add("Maybe being nice is more important than being cool.");
        englist.add("Good thing is listening a new song is that it doesn't remind you of anyone.");
        englist.add("I'm jealous of my parents, i'll never have a kid as cool as theirs :)");
        englist.add("Someone asked me How is your life? I just smiled and replied, She is fine.");
        englist.add("It's not an attitude, it's the way I am.");
        englist.add("Those who know love has also the risk of knowing pain.");
        englist.add("Had a really great 'Night Out' last night, according to my police report.");
        englist.add("I don't have an attitude problem, I just have a personality that you can't handle.");
        englist.add("Sometimes It's better to be alone.. No one can hurt you.");
        englist.add("Some people need a HIGH-FIVE, in the face with a chair.");
        englist.add("Friend: I'm so over him! Me: Cool, let's go get a soda. Friend: HE DRANK SODA.");
        englist.add("There are three sides to an argument.. my side, your side and the right side.");
        englist.add("Do never compare dogs to men. Dogs are cool and faithful.. Remember that.");
        englist.add("The thing that impresses me the most about America is the way parents obey their children");
        englist.add("Every problem comes with solution, but my GF don't have.");
        englist.add("There are two type of people winner and Losser,Winner always Working Hard,Losser Always try to shortcut for win.");
        englist.add("Like if: When you talk to your crush you use that 'cool' mood. 'Like' you dont really care.");
        englist.add("Life must go on. :-)");
        englist.add("I'm cool but Summer made me hot!");
        englist.add("You're sorry ? that's cool. go write a book about it and let someone who actually cares read it.");
        englist.add("The only reason I am fat because a tiny body couldn't store all this personality.");
        englist.add("Don't you just love it when you flip your pillow over and its cool on the other side :-)");
        englist.add("The thing that impresses me the most about America is the way parents obey their children.");
        englist.add("Many a man owes his success to his first wife and his second wife to his success.");
        englist.add("Or, you know.. DON'T text back.. that's cool too.");
        englist.add("Time is precious waste it wisely.");
        englist.add("Dreams are just the brain's Screen-savers.");
        englist.add("I'm the dude with cool attitude");
        englist.add("You hate drama? Cool. Stop starting it.");
        englist.add("I have no time to hate people, who hate me.. because, I'm always busy in loving people, who love me.");
        englist.add("A jealous woman does better research than FBI.");
        englist.add("I wish I had 'Google' in my mind and 'Antivirus' in my heart.");
        englist.add("Wow you're cool. LIKE if you just read that in a sarcastic voice.");
        englist.add("You are; crazy, silly, funny, goofy, amazing, cool, and awesome. That's what I like about you.");
        englist.add("Brains are awesome, I wish everyone had one.");
        englist.add("My life my rules. _|_");
        englist.add("I don't care what people think or say about me!");
        englist.add("I Wish My Parents Were Like Google.. They Should Understand Me Even Before I Complete.");
        englist.add("A smile suits every kind of clothes");
        englist.add("How come wrong numbers are never busy?");
        englist.add("Life is journey. I am traveler.");
        englist.add("They say: Don't drink and drive. Well, yesterday I was drinking a juice box while riding my tricycle. Yeah. I'm a bad@ss.");
        englist.add("Life is short. Smile while you still have teeth.");
        englist.add("Every people is a intelligent, When he work Hard!");
        englist.add("People with status don't need status.");
        englist.add("A tear is made of 1% of water and 99% of feelings.");
        englist.add("When you care about someone, their happiness matters more than yours!");
        englist.add("DRINK TRIPLE, SEE DOUBLE, & ACT SINGLE.");
        englist.add("People say me bad.. but trust me I am the worst!");
        englist.add("life is simple if we are simple.");
        englist.add("You're already a successful personal. The things we take for granted someone else is praying for.");
        englist.add("Silence is the best response to a fool.");
        englist.add("WIFE and INSULT Are Somewhat Similar, They Always Look Good, IF IT IS NOT YOURS!");
        englist.add("The best things in life are free, the second best are very expensive.");
        englist.add("Dont like me? Cool, I dont wake up every day to impress YOU.");
        englist.add("Silent people have the loudest minds.");
        englist.add("Teachers Only Teach The Rules.. But Winners, Winners Make The Rules.");
        englist.add("A smile suits every kind of clothes.");
        englist.add("The road to success is always under construction.");
        englist.add("Doing the moonwalk is the only way to look cool while wiping dog crap off your shoes.");
        englist.add("It's cool that you know all the lines to the movie and all, but it wold be pretty cool if you let the actual actors say them.");
        englist.add("Always smiling, because your smile is a reason for many others to smile.. Smile please!");
        englist.add("They say don't drink and drive. Well.. yesterday I was drinking a juice box while riding my tricycle. Yeah. I'm a bad@ss.");
        englist.add("Yelling You're cool! when you see somebody doing something stupid.");
        englist.add("The perfect seat in class would be one where you are surrounded by your best friend, your crush, a smart person, & a really cool funny kid.");
        englist.add("Unless your name is GOOGLE, stop acting like you f*cking know everything.");
        englist.add("Who says nothing is impossible. I've been doing nothing for years.");
        englist.add("'Dream' as if you'll live forever.. Live as if tomorrow is last one.");
        englist.add("Self-control is the ability to stay cool when someone is making you HOT.");
        englist.add("I am learn from My Mistake!Without Mistake We Can't Learn Best.");
        englist.add("You have to learn the rules of the game. And then you have to play better than anyone else.");
        englist.add("Live ?, Laugh ?, Love ?");
        englist.add("Totally available!! Please disturb me!");
        englist.add("Work until you don't have to, introduce yourself.");
        englist.add("I miss the days when I was put my head on my desk.");
        englist.add("I want my Girlfriend like Google, She will understand me better.");
        englist.add("If my boss saw how many cool things I post on Facebook in a day, he'd stop saying I'm unproductive.");
        englist.add("Do not give up, the beginning is always the hardest.");
        englist.add("Galileo-Great mind! Einstein-genius mind! Newton-Extraordinary mind! Bill gates-brilliant mind.. ME-Never Mind!");
        englist.add("I do not get drunk- I get awesome.");
        englist.add("Doubt kills more dreams than failure ever will.");
        englist.add("Phones are better than GF, At least we can switch it off.");
        englist.add("DRINK TRIPLE, SEE DOUBLE AND ACT SINGLE.");
        englist.add("Life must go on :-)");
        englist.add("A journey of a thousand miles begins with a single step.");
        englist.add("When I was born. Devil said, Oh Shit! Competition!");
        englist.add("Sitting at home: Oh cool it's raining. Sitting at school: HOLY CRAP! LOOK, IT'S RAINING!");
        englist.add("I'm pretty sure the whole 'ladies first' thing was created by a guy just to check out @ss.");
        englist.add("The only way to do great work is to love what you do.");
        englist.add("Born to express not to impress.");
        englist.add("Sometimes you need to maintain a distance to keep them close to you.");
        englist.add("Dreams is not what you see in sleep, Is the thing which doesn't let you sleep.");
        englist.add("Life without mistakes is like, education without books.");
        englist.add("I can't clean my room because I get distracted by the cool stuff I find.");
        englist.add("I am not Spiderman Nor Superman However i am superhero for my GF!");
        englist.add("Life is too short Don't waste it updating status!");
        englist.add("In Love Story, Mom Agrees And Dad Disagrees? It's Because Mom Knows What Love Is, And Dad Knows What Boys Are.");
        englist.add("My bank lets me send a text message and it'll text back with my balance.. It's a cool feature but I didn't think the 'LOL' was necessary.");
        englist.add("Never give people permission to disrespect you.");
        englist.add("Whenever I find the key to success, someone changes the lock.");
        englist.add("If people are trying to bring you 'Down', It only means that you are 'Above them'.");
        englist.add("I don't need to explain myself because, I know I'm right.");
        englist.add("Every problem comes with some solution.. If it doesn't have any solution, it's a Girl!");
        englist.add("If opportunity doesn't knock, build a door.");
        englist.add("Do not argue with an idiot, he will drag you down to his level and beat you with experience.");
        englist.add("Keep calm and enjoy life.");
        englist.add("Life is too short. Don't waste it reading my status.");
        englist.add("My room + internet connection + music + food - homework = perfect day.");
        englist.add("Oh you're dating my ex? Cool. Im eating a sandwhich.. You want those leftovers too?");
        englist.add("Beauty is like Moon, looks much better at Night.");
        englist.add("I'm jealous my parents, I'll never have a kid as cool as theirs.");
        englist.add("Your whatsapp status say's online.. If your online then, why aren't you msg me!");
        englist.add("On Facebook seaching up people with the last name hontas.I think it would be cool to poke a hontas :)");
        englist.add("I will win, not immediately but definitely.");

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