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

public class Goal extends Fragment {

    RecyclerView rajputlist;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Goal() {
        // Required empty public constructor
    }

    public static Goal newInstance(String param1, String param2) {
        Goal fragment = new Goal();
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

        englist.add("No matter how many goals you have achieved, you must set your sights on a higher one.");
        englist.add("Good things don't come to those who wait. Good things come to those who pursue the goals and dreams they believe in.");
        englist.add("Whenever you make a mistake or get knocked down by life, don't look back at it too long. Mistakes are life's way of teaching you. Your capacity for occasional blunders is inseparable from your capacity to reach your goals. No one wins them all, and your failures, when they happen, are just part of your growth. Shake off your blunders. How will you know your limits without an occasional failure? Never quit. Your turn will come.");
        englist.add("By recording your dreams and goals on paper, you set in motion the process of becoming the person you most want to be. Put your future in good hands   your own.");
        englist.add("Don't let life change your goals, because achieving your goals can change your life.");
        englist.add("Whatever your goal is, don't give up on it, perseverance will lead to your ultimate achievements.");
        englist.add("It may take years till you succeed at a goal but you keep trying and when you earn the victory you'll appreciate its value.");
        englist.add("Goals are dreams with deadlines.");
        englist.add("Discipline is the bridge between goals and accomplishments.");
        englist.add("You are never to old to set another goal or to dream a new dream");
        englist.add("There must be a goal at every stage of life! There must be a goal!");
        englist.add("If you're bored with life - you don't get up every morning with a burning desire to do things - you don't have enough goals.");
        englist.add("sometimes you don't need a goal in life, you don't need to know the big picture. you just need to know what you're going to do next!");
        englist.add("All who have accomplished great things have had a great aim, have fixed their gaze on a goal which was high, one which sometimes seemed impossible.");
        englist.add("Setting goals is the first step in turning the invisible into the visible.");
        englist.add("We all die. The goal isn't to live forever, the goal is to create something that will.");
        englist.add("Whenever you feel like giving up, remember why you set this goal in the first place.");
        englist.add("If you want a happy life, tie it to a goal, not to people or things.");
        englist.add("If you want to live a happy life, tie it to a goal, not to people or things.");
        englist.add("Not every end is the goal. The end of a melody is not its goal, and yet if the melody has not reached its end, it has not reached its goal.");
        englist.add("Difficulties increase the nearer we approach the goal.");
        englist.add("Try not to change your goals and plans simply because somebody special came along. Because you'll never know if they plan to stay forever");
        englist.add("The big secret in life is that there is no big secret. Whatever your goal, you can get there if you're willing  to work.");
        englist.add("Our goals can only be reached through a vehicle of a plan, in which we must vigorously act. There is no other route to success.");
        englist.add("Goals provide the energy source that powers our lives. One of the best ways we can get the most from the energy we have is to focus it. That is what goals can do for us; concentrate our energy.");
        englist.add("You are never too old to set another goal or to dream a new dream.");
        englist.add("Dreaming is wonderful, goal setting is crucial, but action is supreme. To make something great happen you must get busy and make it happen.");
        englist.add("The more reasons you have for achieving your goal, the more determined you will become.");
        englist.add("Crystallize your goals. Make a plan for achieving them and set yourself a deadline. Then, with supreme confidence, determination and disregard for obstacles and other people's criticisms, carry out your plan.");
        englist.add("What you get by achieving your goals is not as important as what you become by achieving your goals");
        englist.add("You may be closer to accomplishing  your goals than you think. Don't give up.");
        englist.add("You must take action now that will move you towards your goals. Develop a sense of urgency in your life.");
        englist.add("Do something to move yourself toward your major goal every day.");
        englist.add("Think before you speak. Plan before you act. Accomplish your goals before it's too late.");
        englist.add("A goal is not always meant to be reached. It often serves simply as something to aim at.");
        englist.add("People with goals succeed because they know where they're going.");
        englist.add("Reach high, for the stars lie hidden in your soul. Dream deep, for every dream precedes the goal.");
        englist.add("A successful individual typically sets his next goal somewhat but not too much above his last achievement. In this way he steadily raises his level of aspiration.");
        englist.add("A goal without a plan is just a wish.");
        englist.add("Decide whether or not the goal is worth the risks involved. If it is, stop worrying.");
        englist.add("If you don't have goals, You will always work for someone who does");
        englist.add("You control your future, your destiny. What you think about comes about. By recording your dreams and goals on paper, you set in motion the process of becoming the person you most want to be. Put your future in good hands   your own.");
        englist.add("If we feed the seed of an unselfish goal in our life with prominence, do our deeds with persistence, proceed with perseverance, accede patience; then we surely reap the result of a profound success with an excellence.");
        englist.add("Life takes on meaning when you become motivated, set goals and charge after them in an unstoppable manner.");
        englist.add("A goal is a dream with a deadline.");
        englist.add("The more intensely we feel about an idea or a goal, the more assuredly the idea, buried deep in our subconscious, will direct us along the path to its fulfillment.");
        englist.add("I don't have goals in life.");
        englist.add("Don't even think about quitting. You are always closer to your goals than you think. There's no reason to backtrack now. It makes no sense.");
        englist.add("Discipline is the bridge between goals and accomplishment.");
        englist.add("Always stay true to yourself no matter what, and never let what anybody says distract you from your goals.");
        englist.add("If you want to reach a goal, you must  see the reaching' in your own mind before you actually arrive at your goal.");
        englist.add("A person should set his goals as early as he can and devote all his energy and talent to getting there. With enough effort, he may achieve it. Or he may find something that is even more rewarding. But in the end, no matter what the outcome, he will know he has been alive.");
        englist.add("Choosing a goal and sticking to it changes everything.");

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