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

public class Failure extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Failure() {
        // Required empty public constructor
    }

    public static Failure newInstance(String param1, String param2) {
        Failure fragment = new Failure();
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

        englist.add("You define your failures. Don't let your failures define you. Just learn from it and move on. Don't be discouraged.");
        englist.add("I have not failed. I've just found 10,000 ways that won't work.");
        englist.add("Failure is the opportunity to begin again, more intelligently.");
        englist.add("A bend in the road is not the end of the road... unless you fail to make the turn.");
        englist.add("Everybody is always trying to rush things. Success requires great patience. If you rush, you will fail. Be patient and remain focused.");
        englist.add("The only real failure in life is not to be true to the best one knows.");
        englist.add("Failure is no more a permanent condition than success! For even if you succeed, there's still another test.");
        englist.add("Don't let your past failures leave you hopeless about your future success!");
        englist.add("Many of life's failures are people who did not realize how close they were to success when they gave up.");
        englist.add("You only fail when you stop trying.");
        englist.add("There is no failure except no longer trying.");
        englist.add("Our most profitable lessons are learned from failure, not success.");
        englist.add("Doubt kills more dreams than failure ever will.");
        englist.add("Someone out there wants exactly the kind of person you are, complete with all the flaws and failings you come with");
        englist.add("Men are like cars you get a good one it'll never fail you. you get a bad one and it'll fail you every time..");
        englist.add("There is no failure except in no longer trying.");
        englist.add("There's no secret to success. It's all about preparing, hard work, and learning from failure.");
        englist.add("The only thing in life achieved without effort is failure.");
        englist.add("Every failure is a step closer to success.");
        englist.add("The winners of life's game aren't those who have never tasted failure. But, those who have tasted failure again and again but never give up.");
        englist.add("Failure is an event, never a person.");
        englist.add("Sometimes our greatest insight comes from our failure, not from our accomplishments.");
        englist.add("Difference between success and failure depends on what we decide to do with the 24 hours in our day.");
        englist.add("Everyday you either pass or fail the test of life. Everyday is an opportunity to grow. Everyday is a chance to become a better person.");
        englist.add("A little more persistence, a little more effort, and what seemed hopeless failure may turn to glorious success.");
        englist.add("In life, the best moments are those that your camera always failed to capture.");
        englist.add("Failure is an option but you don't have to choose it!");
        englist.add("Learn from your failures or be conquered by them.");
        englist.add("Misfortunes happen, but don't use it as an excuse to not try something new, or to wither in the face of a failure.");
        englist.add("Failing to prepare is preparing to fail.");
        englist.add("To aspire for success you must first recognize the possibility of failure.");
        englist.add("We learn little from our successes, but a lot from our failures");
        englist.add("It is better to have tried and failed than to never try and wonder what could've happened.");
        englist.add("If you are afraid of failure you don't deserve to be successful.");
        englist.add("Sometimes we must get hurt in order to grow, we must fail in order to know, Sometimes our vision clears only after our eyes are washed away with tears");
        englist.add("Those who try to do something and fail are infinitely better than those who try to do nothing and succeed..!");
        englist.add("It's better to have tried and failed, than not to have tried at all.");
        englist.add("Someday, somewhere - anywhere, unfailingly, you'll find yourself, and that, and only that, can be the happiest or bitterest hour of your life.");
        englist.add("The worse that can happen is that you try but fail for now, but the worst that could ever happen is if you fail to try.");
        englist.add("Success is not final, failure is not fatal: it is the courage to continue that counts.");
        englist.add("You want to be really great? Then have the courage to fail big and stick around. Make them wonder why you're still smiling");
        englist.add("It's how you deal with failure that determines how you achieve success.");
        englist.add("There are two kinds of failures: those who thought and never did, and those who did and never thought");
        englist.add("Failure is not defeat, until you stop trying.");
        englist.add("Trials in life are not meant to make us fail, but to see how far we can fly.");
        englist.add("The most crippling failure disease is.....Excuses");
        englist.add("Trying and not succeeding is not failure; it is part of the process of discovering what works.");
        englist.add("The most important thing is never be afraid to take a chance. Always remember the greatest failure is not having the will to try. Don't quit before the miracle. Have a blessed & productive day.");
        englist.add("Remember that failure is not the opposite of success, but part of it.");
        englist.add("Through perseverance many people win success out of what seemed destined to be certain failure.");
        englist.add("You may be disappointed if you fail, but you are doomed if you don't try.");
        englist.add("Success is not final, failure is not fatal. It is the courage to continue that counts");
        englist.add("If it is true that I am destined to fail, then I do have a purpose in life; to fail my destiny.");
        englist.add("We must stop pulling ourselves and start pushing ourselves towards success. Success is not final, failure is not fatal. It is the courage to continue that gets us there.");
        englist.add("Life is indeed beautiful. It's times when we sink into our hectic and stressful lifestyles when we get blinded and fail to see what we have.");
        englist.add("Every successful person has had their share of failure. Your success story is being made now.");
        englist.add("Most people fail in life because they major in minor things.");
        englist.add("I can accept failure. Everyone fails at something. But I can't accept not trying.");
        englist.add("Success is moving from failure to failure without a loss of enthusiasm.");
        englist.add("Sometimes we need to be hurt in order to grow, fail in order to know, lose in order to gain. Some lessons are learned best through pain.");
        englist.add("If what's ahead scares you, what's behind hurts you, just look above He never fails to help you");
        englist.add("Failure is not falling down but refusing to get up.");
        englist.add("Failing doesn't make you a failure. Giving up, accepting your failure, refusing to try again does ~Richard Exile");
        englist.add("It hurts to fail, but it hurts more to not try and never know, so take advantage of opportunities before they take advantage of you");
        englist.add("Never say you have failed until you have reached your last attempt, and never say it's your last attempt until you have succeeded.");
        englist.add("Set high expectations for yourself, but don't get discouraged if you come up short. With every failure you are one step closer to success.");
        englist.add("Failure is feedback. And feedback is the breakfast of champions.");
        englist.add("It is impossible to live without failing at something, unless you live so cautiously that you might as well not have lived at all - in which case, you fail by default.");
        englist.add("Use the losses and failures of the past as a reason for action, not inaction.");
        englist.add("In order to succeed, your desire for success should be greater than your fear of failure.");
        englist.add("Don't avoid failure. Use it.");
        englist.add("Whether you succeed or fail, let it be said that you gave it your best.");
        englist.add("To appreciate success, failures are necessary.");
        englist.add("Someday, somewhere   anywhere, unfailingly, you'll find yourself, and that, and only that, can be the happiest or bitterest hour of your life.");
        englist.add("If you want to succeed in your life, remember this phrase: That past does not equal the future. Because you failed yesterday, or all day today, or a moment ago. All that matters is: What are you going to do, right now?");
        englist.add("You'll never succeed if you have no will to encounter failures along the road to succession.");
        englist.add("Don't laugh at those who fail Laugh at those who don't try.");
        englist.add("Every adversity, every failure, every heartache carries with it the seed on an equal or greater benefit.");
        englist.add("The two hardest things to handle in life are failure and success.");
        englist.add("Your failure may be your greatest teacher and your success may be your greatest grade in the class called life.");
        englist.add("How you react to failure will either make you or break you.");
        englist.add("Blaming is just another sorry excuse, and making excuses is the first step towards failure");
        englist.add("It is not wanting to win that makes you a winner; it is refusing to fail.");
        englist.add("I chose a long time ago . To believe in who I am . I will not walk in someone else's shadow. Whether I fail or succeed i will know that i lived my life!");
        englist.add("Shoot for the moon, even if you fail, you'll land among the stars");
        englist.add("We are always looking for something better that we sometimes fail to realize that we already have the best.");
        englist.add("Discipline is the foundation upon which all success is built. Lack of discipline inevitably leads to failure.");
        englist.add("If you fail it doesn't mean you are stupid, but it means you are clever enough to discover things that won't work.");
        englist.add("It is better to fail at doing something than achieve in doing nothing.");
        englist.add("Just because you fail once doesn't mean you are going to fail everything. Keep trying, hold on and always, always, always believe in yourself. Because if you don't, who will ?");
        englist.add("It is hard to fail, but it is worse to never to have tried to succeed.");
        englist.add("Any dude that waits till Valentine's day to treat his woman like a Queen is failing 364 days a year");
        englist.add("The agony or pain we fail to endure that lingers as tears in our eyes; or that lingers as heartache in our emotions; becomes the stumbling blocks that impede our courage and strength to survive.");
        englist.add("Sometimes we become so focused on the finish line, that we fail to find joy in the journey.");
        englist.add("Haters will broadcast your failure, but whisper your success...");
        englist.add("Success should not go to head and failure should not go to heart");
        englist.add("They who never fail will never understand how great the adventure of life is.");
        englist.add("Never allow a failure to detour you from an accomplishment.");
        englist.add("One of the most common causes of failure is the habit of of quitting when one is overtaken by temporary defeat.");
        englist.add("If you are doing your best, you will not have to worry about failure.");
        englist.add("The season of failure is the best time for sowing the seeds of success.");
        englist.add("What would you attempt to do if you knew you could not fail");
        englist.add("It is impossible to live without failing at something, unless you live so cautiously that you might as well not have lived at all. In which case you have failed by default.");
        englist.add("Try and fail, but don't fail to try.");
        englist.add("It's better to fail in doing something, than to excel in doing nothing.");
        englist.add("People that question everything never try anything. Do not be afraid of failure. You have to endure failure to eventually succeed.");
        englist.add("Failure is a measurement that depends on the standard applied.");
        englist.add("In order to succeed, your desire for success should be greater than your fear of failure");
        englist.add("You never fail until you stop trying..");

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