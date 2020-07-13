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

public class Work extends Fragment {

    RecyclerView rajputlist;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Work() {
        // Required empty public constructor
    }

    public static Work newInstance(String param1, String param2) {
        Work fragment = new Work();
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

        englist.add("A clean desk is a sign of a cluttered desk drawer.");
        englist.add("Doing a job right the first time gets the job done. Doing the job wrong ten times gives you job security.");
        englist.add("Work fascinates me, I can look at it for hours!");
        englist.add("Hopefully all this hard work will pay off one day.");
        englist.add("Working; the millions of people on welfare are depending on me.");
        englist.add("I always give 100% at work: 13% Monday, 22% Tuesday, 26% Wednesday, 35% Thursday 4% Friday.");
        englist.add("I don't care how bad I feel, when I go to work I make sure I give it my all! Never any less than 12%!");
        englist.add("I fell asleep while doing work. If your my boss that's code for I'm working so hard that my head hurts.");
        englist.add("Never put off until tomorrow what you can avoid altogether.");
        englist.add("I have this thing called a job...");
        englist.add("I'm at that place that they call work. I guess I'm supposed to be working while I'm here.");
        englist.add("Not available, working... At least that's what my boss thinks.");
        englist.add("I am working, which is something that you should be doing.");
        englist.add("I love my job, it's the work I hate.");
        englist.add("I am working hard... or am I hardly working?");
        englist.add("If a cluttered desk means a cluttered mind, what does a empty desk mean?");
        englist.add("I keep thinking about quiting this job and going back to school, but then I remember how easy my job is.");
        englist.add("I wasn't sleeping, I was testing the keyboard for drool resistance.");
        englist.add("All I want is less to do, more time to do it, and higher pay for not getting it done.");
        englist.add("All work and no play makes (YOUR NAME) a dull boy/girl.");
        englist.add("Hi ho, hi ho.. off to work I go.");
        englist.add("Due to economic hardships, I must go to work.");
        englist.add("Work is so interesting. I could stare at it all day long.");
        englist.add("The boss is behind me, so don't IM me unless you have a compliment about me.");
        englist.add("Work, it ain't easy, and it ain't fun, but it's a lot safer than holding up a liquor store.");
        englist.add("All work and no play means that I am making lots and lots of money.");
        englist.add("These people at work are giving me work! Can you believe this?");
        englist.add("Talent does what it can. Genius does what it must. I do what I get paid for.");
        englist.add("Sorry, but I am at an evil place where they are holding my paycheck hostage and I won't receive it unless I do what they tell me to do.");
        englist.add("I owe, I owe, so it's off to work I go.");
        englist.add("Me, asleep on the job? No, I'm just trying to pick up my contact lens without using any hands.");
        englist.add("According to my calculations the problem doesn't exist.");
        englist.add("A procrastinator's work is never finished.");
        englist.add("Why do today what you can put off till tomorrow.");
        englist.add("The only reason I go to work is for the money.");
        englist.add("I hate going to the bathroom right after the cleaning lady finishes cleaning the toilets. I always feel like I'm ruining her hard work. It just feels really disrespectful.");
        englist.add("I'm doing a little thing called work. You should try it sometime.");
        englist.add("If you do a good job and work hard, you may get a job with a better company someday.");
        englist.add("Even if you don't have the answer, you certainly have to admire the problem.");
        englist.add("Hard work may not kill you, but why take chances?");
        englist.add("All I ever wanted was an honest week's pay for an honest day's work.");
        englist.add("I'm working right now... but next time I decide to procrastinate, I'll get back to you.");
        englist.add("Can I trade this job for what's behind door #1?");
        englist.add("A train station is where the train stops. A bus station is where the bus stops. On my desk, I have a work station...");
        englist.add("The fools look upon the world and see only pleasure. The lost look upon the world and see only pain. The wise look upon the world and see their work cut out for them.");
        englist.add("If at first you don't succeed, destroy all evidence that you ever tried.");
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