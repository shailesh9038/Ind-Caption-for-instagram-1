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

public class SchoolandCollege extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public SchoolandCollege() {
        // Required empty public constructor
    }

    public static SchoolandCollege newInstance(String param1, String param2) {
        SchoolandCollege fragment = new SchoolandCollege();
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

        englist.add("School for 12 years, college for 4 years or more.. then you work until you die. Great.");
        englist.add("College is thousands of dollars but pizza is only like ten so what is the obvious choice here.");
        englist.add("Colleges don't make fools, they only develop them.");
        englist.add("President Barack Obama was known to be a marijuana smoker in his teen & college days. His nickname used to be 'Barack Oganja.'");
        englist.add("If you always do what you have always done, you will always get what you have always got.");
        englist.add("I don't hate school. I just hate the homework, the exams and waking up early in the morning.");
        englist.add("2 Chainz played college basketball, graduated with a 4.0 GPA in 3 years at a 4 year school. Never Judge a book by it's cover!!!!");
        englist.add("I'm going to college. I don't care if it ruins my career. I'd rather be smart than a movie star");
        englist.add("College has given me the confidence I need to fail.");
        englist.add("I don't hate school. I just hate the teachers, homework, exams, and waking up in the morning.");
        englist.add("I really want to go to Penn State for college.");
        englist.add("College isn't the place to go for ideas.");
        englist.add("The difference between school and life? In school, you're taught a lesson and then given a test. In life, you're given a test that teaches you a lesson.");
        englist.add("I was thrown out of college for cheating on the metaphysics exam, I looked into the soul of the boy sitting next to me.");
        englist.add("There are three good reasons to be a teacher: June, July and august.");
        englist.add("I are a college student.. This is how stupid some college students are.");
        englist.add("Life without problems is like school without classes, you are probably not going to learn anything.");
        englist.add("Dear Teacher, My hand is not raised, therefore i don't know the answer. Sincerely, Stop Calling On Me.");
        englist.add("College is the best time of your life. When else are your parents going to spend several thousand dollars a year just for you to go to a strange town and get drunk every night?");
        englist.add("Did anyone ever notice that 'STUDYING' is a mixture of STUDY and DYING?");
        englist.add("I feel like Neve Campbell in Scream 2. She thinks she can go off to college and be happy but then the murderer comes back, starts killing off all of her friends. I learned a lot of lessons from that movie. This is just one of them.");
        englist.add("I have a horrible sleeping disorder where I have to wake up every morning and go to school.");
        englist.add("You are the reason i wake up every morning lol just kidding i have a school.");
        englist.add("Sometimes its better to bunk a class & do fun with friends because today when i look back.. Marks never make me laugh but memories do.");
        englist.add("Be quiet in the classroom to respect the fact that others are sleeping.");
        englist.add("Reading a book and having to re-read the same paragraph over and over because your mind is somewhere else.");
        englist.add("When I got to college, acting suddenly seemed like a very risky proposition.");
        englist.add("School for 12 years, college for 4 more years, then you work until you die. Cool.");
        englist.add("If you have a college degree you can be absolutely sure of one thing.. You have a college degree.");
        englist.add("Don't do drugs kids. There's a time and place for everything. It's called college.");
        englist.add("When i say i miss school, i mean my friends and the fun. Not the school.");
        englist.add("I only want to write. And there's no college for that except life.");
        englist.add("No College Students or Graduates should be voting for anyone BUT Obama... Romney wants to DOUBLE the interest on student loans");
        englist.add("Things taught in college are not education but the means of education.");
        englist.add("1st month of school: look nice & dress up. Rest of the school year: Rocking the homeless look.");
        englist.add("College is a refuge from hasty judgment.");
        englist.add("That moment you think you have finish the test and then realise you skipped a page..");
        englist.add("Cup of noodles and a movie on deck, its's all about that college life.");
        englist.add("Don't worry about those who talk behind your back, they're behind you for a reason.");
        englist.add("Everyone can pass college, most just don't feel like it.");
        englist.add("Wow now I'm a graduate.. Now thermometer is not the only thing that has degrees without brains.");
        englist.add("Education is a better safeguard of liberty than a standing army.");
        englist.add("Not drinking in college was the best decision ever!");
        englist.add("Sign above the classroom clock during exams: TIME WILL PASS, WILL YOU..???");
        englist.add("Right now, you might think popularity is everything. But just remember, you can't put popular on a college or job application.");
        englist.add("Elementary school = 50 friends. Middle school = 30 friends. High school = 20 friends. College = 3 Real Friends.");
        englist.add("College is a place where some pursue learning and others learn pursuing.");
        englist.add("That awkward moment when you shout the wrong answer out in the class with confidence..");
        englist.add("I wish there was a pen that can copy and paste.");
        englist.add("Throughout the course of eating on the go, endless nights of studying, and all that college life entails, it will be worth it once I graduate. You can do it!");
        englist.add("Your college friends know who you are, but your high school friends know why.");
        englist.add("No one can look back schooldays and say that they were unhappy.");
        englist.add("If you smell smoke don't panic.. it is just my brain on FIRE from studying for final exams. But thank you for your concern. Sincerely, stressed college student.");
        englist.add("I don't hate school. I just hate the teachers, the homework, the exams, and waking up in the morning.");
        englist.add("College is important, but saving money can be even more important.");
        englist.add("My handwriting is probably going to look like crap when I go back to school.");
        englist.add("Sit down, class isn't over yet! *bell rings* haha *uck you.");
        englist.add("School for 12 years, college for 4 years or more... then you work until you die. Great.");
        englist.add("I learned law so well, the day I graduated I sued the college, won the case, and got my tuition back.");
        englist.add("Before college, I didn't know what I was doing with my life...now I'm confident I have no idea what I'm doing.");
        englist.add("I Hate Awkwardly Walking Past Someone In An Empty Hall At School.");
        englist.add("Some people talk in their sleep. Lecturers talk while other people sleep.");
        englist.add("College is thousands of dollars but pizza is only like ten so what is the obvious choice here");
        englist.add("Bill Gates, Steve Jobs and Mark Zuckerberg = College Dropouts.");
        englist.add("That LIKE A BOSS moment when you get the right answer and the smart kid doesn't..");
        englist.add("Dear Teacher, I talk to everyone, so moving my seat won’t help. Sincerely, Student");
        englist.add("Don't cry because it's over, smile because for a few miles they believed you were the real bus driver.");
        englist.add("In school, you're taught a lesson and then given a test.In life, you're given a test that teaches you a lesson.");
        englist.add("If Child Labour Is A Crime.Then Why Teacher Gives Homework ??");
        englist.add("Rapper 2 Chainz played college basketball, and graduated with a 4.0 GPA in 3 years at a 4 year school. Never judge a book by it's cover");
        englist.add("In college, I learned more by watching my drunk friends than I did in class.");
        englist.add("That annoying moment at class when everybody seem to understand everything, except you.");
        englist.add("When the whole class is laughing & you're just sitting there like, What's so funny?!");
        englist.add("Dear Ceiling Fan, If you could hold my weight, i would never be bored again. Sincerely, Bored.");
        englist.add("That awkward moment when you're trying to cheat but you see the teacher is looking right at you so you pretend to just look around.");
        englist.add("Life is my college.. May I graduate well, and earn some honors.");
        englist.add("Right now, you might think popularity is everything. But just remember, you can`t put popular on a college or job application.");
        englist.add("College is the place where you live your life to the fullest.");
        englist.add("President Barack Obama was known to be a marijuana smoker in his teen & college days. His nickname used to be Barack Oganja.");
        englist.add("College campuses were once a hotbed of political activity.");
        englist.add("Hug a stressed college student. It helps a lot.");
        englist.add("I would love to see the pretty girls in my school remove their make up.");
        englist.add("A telephone survey says that 51 percent of college students drink until they pass out at least once a month. The other 49 percent didn't answer the phone.");
        englist.add("C.L.A.S.S- come late and start sleeping :)");
        englist.add("No College Students or Graduates should be voting for anyone BUT Obama.. Romney wants to DOUBLE the interest on student loans");
        englist.add("Dear Teacher, I talk to everyone, so moving my seat won't help. Sincerely, Student");
        englist.add("Dear twin sister, I'll take your french final if you take my math final? Sincerely, college here we come!");
        englist.add("Dear colleges, Smart middle class white people need scholarships too. Sincerely, anonymous.");
        englist.add("A lot of fellows nowadays have a B.A., M.D., or Ph.D. Unfortunately, they don't have a J.O.B.");
        englist.add("Dear Teacher, I talk to everyone, so moving my seat won't help. Sincerely, Student");
        englist.add("What Did You Get On The Test? 98, you? 48 Awkward..");
        englist.add("School for 12 years, college for 4 years.. then you work until you die. Great.");
        englist.add("Better to do something imperfectly than to do nothing flawlessly.");
        englist.add("Algebra sure has a way of making a person feel stupid!");
        englist.add("No matter how much you think you hate school, you'll always miss it when you leave.");
        englist.add("Make your best pick of status from our list of Whatsapp status for college life.");
        englist.add("I'll never forget my high school friends.");
        englist.add("Bill Gates has enough money to send every single 18 year old in the country to a 4-year college.");
        englist.add("College is not preparation for life, College is life itself.");
        englist.add("College life is that part of your life that you are going to relive in your memories till you breathe.");
        englist.add("80% of the final exam will be based on the one lecture you missed and the one book you didn't read.");
        englist.add("At night i can't sleep. In the morning i can't wake up.");
        englist.add("College is the best place to enjoy life happily, nothing else can beat that.");
        englist.add("Some people talk in their sleep. Lecturers talk while other people sleep.14.");
        englist.add("School for 12 years, college for 4 years... then you work until you die. Great.");
        englist.add("42% of people who graduate from college never read another book.");
        englist.add("Autocorrect is like that person who just graduated college and think they know everything.");
        englist.add("Every year, many, many stupid people graduate from college. And if they can do it, so can you.");
        englist.add("Taking awful cold medicine as a kid taught me how to take shots in college.");
        englist.add("Life is my college. May I graduate well, and earn some honors");
        englist.add("College is the only time in which being poor and drunk is acceptable.");
        englist.add("Saying you understand just to make the teacher go away when you really have no idea.");
        englist.add("The only person you are destined to become is the person you decide to be.");
        englist.add("One funny thing about college life is that, teachers make you sleep during day and friends don't let you to sleep at night.");
        englist.add("I was a D student in high school and on the dean's list in college");
        englist.add("While I was (in college) I was exposed to this world that I didn't know was possible.");
        englist.add("Before college, I didn't know what I was doing with my life..now I'm confident I have no idea what I'm doing.");
        englist.add("School may be hard, annoying, and irritating, but admit it, you're going to miss it when it ends.");
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