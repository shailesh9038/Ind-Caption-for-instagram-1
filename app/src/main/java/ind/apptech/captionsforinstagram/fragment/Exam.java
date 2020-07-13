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

public class Exam extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Exam() {
        // Required empty public constructor
    }

    public static Exam newInstance(String param1, String param2) {
        Exam fragment = new Exam();
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


        englist.add("Exam is over = OH YEAH! Result comes = OH SHIT -_-");
        englist.add("80% of the exam is always based on 1 lecture that you missed and 1 topic that you didn’t prepare.");
        englist.add("In exams, we look up for inspiration, down for desperation, left and right for information.");
        englist.add("What is the main reason for failure? .. I think its EXAMS. What do you think?");
        englist.add("Life is like an exam I am determined to pass.");
        englist.add("The only people who never fail are those who never try..");
        englist.add("Im the type of person who want to get good grades but doesn't want to study.");
        englist.add("Never let success get to your head. Never let failure get to your heart.");
        englist.add("The mind is not a book, to be opened at will and examined at leisure.");
        englist.add("Sometimes I think to write LOL at the end of every answer in exams :)");
        englist.add("There is creative reading as well as creative writing.");
        englist.add("Where it is a duty to worship the sun it is pretty sure to be a crime to examine the laws of heat.");
        englist.add("Push yourself harder when it hurts and you will win your dream.");
        englist.add("If you can't change your fate, change your attitude.");
        englist.add("If you need an example of how to live you should not have been born.");
        englist.add("Nothing in the world is more common than unsuccessful people with talent.");
        englist.add("How is a poor man a lot like a rich man? They both have an iPhone.");
        englist.add("After the first exams, I switched to the Faculty of Philosophy and studied Zoology in Munich and Vienna");
        englist.add("Facebook will be much more interesting if only they let you decide which part of the body you wanna Poke.......!!");
        englist.add("How much easier it is to be critical than to be correct.");
        englist.add("80% of the final exam will be based on the one lecture you missed and the one book you didn’t read.");
        englist.add("Never let any body come so close to your heart that it is painful to forget them.");
        englist.add("I’m visiting my high school. Every half year I do the exams, and then this year I’m going to graduate.");
        englist.add("During last 5 minutes of examination every student gets a super natural power.");
        englist.add("Lovely days in my life : Childhood Days, School Days & collage Days, Horrible days in my life : ONLY EXAM DAYS :)");
        englist.add("If i m pretty does not mean that any boy can get me..");
        englist.add("If you want to make your dreams come true, The first thing you have to do is wake up.");
        englist.add("Be a good person, But don't try to prove.");
        englist.add("Sometimes we lose, sometimes we win, but in the end... its all same to me.");
        englist.add("I was thrown out of college for cheating on the metaphysics exam, I looked into the soul of the boy sitting next to me.");
        englist.add("The only people who never fail are those who never try..");
        englist.add("You never know how strong you are, until being strong is the only choice you have.");
        englist.add("Being ignorant is not so much a shame, as being unwilling to learn.");
        englist.add("Every person be's a nobody before becoming somebody.");
        englist.add("What is the main reason for failure? …………………….. I think its EXAMS. What do you think?");
        englist.add("I hates studying for exams, Is there an APP for that?");
        englist.add("Exams make us tired nervous & sick ahhhh im looking forward for a day without ,exams im sure that it will be a day in heaven because life is fuuullll of exams.");
        englist.add("Make yourself an example, achieve it, but don’t hurt anyone on the way up. I don’t think I did that.");
        englist.add("The worst thing I ever tried was being normal");
        englist.add("Biggest Mystery of Maths, 1000s of years passed, Millions of theorems derived, Millions of formulas made, But still, X is unknown!");
        englist.add("The examined life is no picnic.");
        englist.add("When the student is ready, the master appears.");
        englist.add("If you don't succeed at first, hide all evidence that you tried.");
        englist.add("Although I know trust can get you killed, love can leave you hurt, and being real can result in hatred, I still aim for all three.");
        englist.add("It takes 15 trees to produce the amount of paper that we use to write one exam. Join us in promoting the noble cause of saving trees. Say No To Exams.");
        englist.add("Resolve to perform what you ought, perform without fail what you resolve.");
        englist.add("Cousins are created so that our Parents can compare marks.");
        englist.add("Why study for exams? Are they not about what you know, not about how much you can cram into your head the night before?");
        englist.add("I wish studying for an exam was as easy as remembering lyrics. I'd pass every exam.");
        englist.add("No one knows what it’s like to be the bad man, to be the sad man, behind blue eyes!!!");
        englist.add("Low of studentology: Book continues to be in state of rest or covered with dust and soil, unless exams are appeared :)");
        englist.add("Why is it so EASY to fail but so HARD to SUCCEED?");
        englist.add("You might not make heaven if you cover your script during an exam.. Sharing is caring!");
        englist.add("Every instructor assumes that you have nothing else to do except study for that instructor’s course.");
        englist.add("You only live once, but if you do it right, once is enough.");
        englist.add("A good example has twice the value of good advice..");
        englist.add("If you are given a take-home exam, you will forget where you live.");
        englist.add("If you like me Then raise your hand, If not then raise your standard.");
        englist.add("Its Cute When your Crush's Crush is You.");
        englist.add("I am not failed.. My success is just postponed.");
        englist.add("The more studying you did for the exam, the less sure you are as to which answer they want.");
        englist.add("HOW TO SOLVE MATHS: 1. Write down the problem. 2. CRY :P.");
        englist.add("Failure is not an option — it comes bundled with Windows.");
        englist.add("Every burned book enlightens the world.");
        englist.add("Dear Math, please grow up and solve your own problems, I'm tired of solving them for you.");
        englist.add("I had never passed a single school exam, and clearly never would.");
        englist.add("Examinations are formidable even to the best prepared, for the greatest fool may ask more than the wisest man can answer.");
        englist.add("The richer you get, the more expensive happiness becomes.");
        englist.add("Those who do not study are only cattle dressed up in men’s clothes..");
        englist.add("God created the living to worship him.. well no one is worshiping me.");
        englist.add("Student who changes tha course of history is now probably taking exam.");
        englist.add("I wish I could forget all the bad times in my life like I forget everything I have studied seconds before an exam.");
        englist.add("Born to fight fight to kill ready to die but never will.");
        englist.add("My one hand is enough to fight against the world.. If u hold the other one...!");
        englist.add("The direction in which education starts a man will determine his future.");
        englist.add("The goal of education is to replace an empty mind with an open mind.");
        englist.add("If you are given an open-book exam, you will forget your book.");
        englist.add("I am in a relationship with studies and it’s complicated");
        englist.add("Never be a busy signal on the Prayer line.");
        englist.add("Get one bad grade, Drops your GPA like the freaking Economy.");
        englist.add("I know i am something, Because god doesn't create garbage.");
        englist.add("Success all depends on the second letter.");
        englist.add("Group Project: 1 person does all the work. Everyone takes credit :)");
        englist.add("A bottle of wine contains more philosophy than all the books in the world..");
        englist.add("Examinations – the only way to know something at least for a few days.");
        englist.add("The more we study, the more we discover our ignorance..");
        englist.add("The brain is the most outstanding organ. It works for 24 hours, 365 days, right from your birth, until you step in the exam hall.");
        englist.add("My school cares more about the uniform than about my education.");
        englist.add("Science does not know its debt to imagination.");
        englist.add("The fate of empires depends upon the education of the youth.");
        englist.add("When everything comes your way.. Then you are on the wrong way.");
        englist.add("Self-trust is the first secret of success.");

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