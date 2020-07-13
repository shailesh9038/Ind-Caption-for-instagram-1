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

public class Positive extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Positive() {
        // Required empty public constructor
    }

    public static Positive newInstance(String param1, String param2) {
        Positive fragment = new Positive();
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

        englist.add("A life of success and achievement is a direct result of utilizing the power of positive thinking.");
        englist.add("Be positive every day, every hour, every minute, every second cause if you missed a part of your life just because of your negativity, everything may fall apart.");
        englist.add("You are too blessed to be stressed. Stop focusing on the negatives. Only embrace the positives.");
        englist.add("there comes a time when, despite what we try to run from, we are faced with our past. it could be a face or a place, one day we find ourselves there. it triggers unpleasant memories and despite everything that flashes in front of us...we realize, new ones can be made and can be positive!");
        englist.add("Every moment of life, more specifically the future, holds surprises. If you have a positive attitude, you shall make most of them pleasant and beautiful. Enjoy life with meaningful developments throughout the course of it.");
        englist.add("A thousand disappointments in the past cannot equal the power of one positive action right now. Go ahead and go for it.");
        englist.add("A positive attitude gives you power over your circumstances instead of your circumstances having power over you.");
        englist.add("Having negative thoughts will change your whole perspective. Think positive.");
        englist.add("Instead of blaming life for how it goes, adapt and respond positively to whatever happens.");
        englist.add("Positivity will block the negative thoughts that overwhelm you during tough times. Stay positive and you'll achieve more than what you set yourself for.");
        englist.add("You can't live a positive life with a negative mind.");
        englist.add("Think positive, because thoughts are like the steering wheel that moves our life in the right direction.");
        englist.add("Don't ever let a negative past define you, let it be a lesson that strengthens you and leads you on the right path to a positive, better and brighter future.");
        englist.add("No matter where life takes you, always pack a positive attitude.");
        englist.add("Good things will come to you if you focus on the positives and let go of the negatives.");
        englist.add("Keep your face to the sunshine and you cannot see a shadow.");
        englist.add("Always turn a negative situation into a positive situation.");
        englist.add("The thing that lies at the foundation of positive change, the way I see it, is service to a fellow human being.");
        englist.add("You have to keep a positive attitude when trying to accomplish something that is worth accomplishing. Don't lose sight of your goals.");
        englist.add("We can complain because rose bushes have thorns, or rejoice because thorn bushes have roses");
        englist.add("Faith is what keeps us going after we have lost hope, having faith is having the intelligence and the ability to know how to use the power of positive thinking to help ourselves overcome negative situations.");
        englist.add("Strengthen your beliefs and strive to move positively in a forward and more successful direction.");
        englist.add("Every time you subtract negative, you make room for more positive.");
        englist.add("Thoughts Become Things... Choose The Good Ones!");
        englist.add("Choosing to be positive and grateful for what you have now is going to determine how you're going to live the rest of your life");
        englist.add("A strong positive mental attitude will create more miracles than any wonder drug.");
        englist.add("Positive thinking sees the invisible, feels the intangible, and can achieve the impossible.");
        englist.add("To create more positive results in your life, replace  if only' with  next time'.");
        englist.add("It's never to late. A determined mind and a positive attitude, will increase your ability to achieve and succeed any goal you want in life.");
        englist.add("A positive attitude may not solve all your problems, but it will annoy enough people to make it worth the effort.");
        englist.add("Positive outcomes come from positive people with positive thoughts, keep your mind clear & keep on the road ahead because only you can fail you.");
        englist.add("Positive energy is attracted to positive energy.");
        englist.add("Every time you subtract negative from your life, you make room for more positive.");
        englist.add("Work hard, stay positive, and get up early. It's the best part of the day.");
        englist.add("Why make everything complicated? You worry and see only the worst case scenario, instead of keeping it simple and positive.");
        englist.add("Your positive action combined with positive thinking results in success.");
        englist.add("Once you let go of negative people, positive ones appear.");
        englist.add("Take negative things that come your way such as insults others may hurl at you and make something positive from them");
        englist.add("We have a positive vision of the future founded on the belief that the gap between the promise and reality of America can one day be finally closed. We believe that.");
        englist.add("Smile Why? Because it makes you attractive. It changes your mood. It relieves stress. And it helps you stay positive.");
        englist.add("In everything we do, our own thoughts can help us succeed, or they can help us fail. Maintain a positive attitude.");
        englist.add("Yesterday is not ours to recover, but tomorrow is ours to win or lose.");
        englist.add("Being positive does not mean ignoring the negative. Being positive means overcoming the negative.");
        englist.add("You can spread positivity by creating something positive, or by reflecting positivity in your thoughts and actions.");
        englist.add("A President cannot always be popular.");
        englist.add("When life gives you every reason to be negative, think of all the reasons to be positive. There's always someone who has it worse.");
        englist.add("A positive attitude will not solve all your problems, but it will annoy enough people to make it worth the effort");
        englist.add("In every negative, it is possible to find a positive. Sometimes it is hard to find, but don't give up looking for it.");
        englist.add("Everyone's life has positive and negative aspects whether you're happy and successful or not depends greatly on which aspects you focus on.");
        englist.add("A strong positive mental attitude will create more miracles than any wonder drug");
        englist.add("H.O.P.E: Have Only Positive Expectations.");
        englist.add("Always think thoughts that are productive and positive. For the Law of Attraction possesses your key to either endless misery and woe or to an abundance you never knew could be achievable.");
        englist.add("In order to carry a positive action we must develop here a positive vision.");
        englist.add("Success is the ongoing process of striving to become more; to continually grow while contributing in some positive way to others.");
        englist.add("Always end your day with a positive thought. No matter how things are, tomorrow is another chance to make things better.");
        englist.add("You won't have a positive life, if you have a negative mind. Change your perspective.");
        englist.add("Live life to the fullest, and focus on the positive.");
        englist.add("When you think positive, good things happen.");
        englist.add("If you have a positive attitude and constantly strive to give your best effort, eventually you will overcome your immediate problems and find you are ready for greater challenges.");
        englist.add("Every positive value has its price in negative terms... the genius of Einstein leads to Hiroshima.");
        englist.add("Life continues whatever happens. All we need it is to be positive and be brave all the challenges we encounter. Faith in God is still the best armor.");
        englist.add("Every choice we make will either impact us positively or it can seriously have a negative affect on you. Choices are everything, you just have to be careful as to which one is going to help you or hurt you.");
        englist.add("Being positive doesn't mean ignoring the negative. Being positive means overcoming the negative.");
        englist.add("The best way to be happy is to turn the negatives into positives, don't let anyone steal your joy, and be thankful for what you have.");
        englist.add("Negative people need drama like oxygen.Stay positive...it will take their breath away ..!");
        englist.add("Properly used, positive reinforcement is extremely powerful.");
        englist.add("It is our mind that creates the kind of life we live. If we think positively we will transform our life accordingly. Everything starts from within, from the most simple action to the greatest achievement. We cannot always have control over our external circumstances, but we can control our inner world of thoughts, where everything starts. We can't always control our outer universe, but we can, with some effort, control our inner universe.");
        englist.add("Instead of concentrating on eliminating the negative, concentrate on creating something positive.");
        englist.add("Positive thinking will let you do everything better than negative thinking will.");
        englist.add("Positive thinking isn't about expecting the best to happen every time but, accepting that whatever happens is the best for this moment.");
        englist.add("Taking a few moments to be thankful for what is going well in your life is an excellent way to dive into the day with a positive attitude.");
        englist.add("The most important thing is to stay positive.");
        englist.add("One single positive dream is, more important than a thousand negative realities.");
        englist.add("Don't imagine the worst incidents in your emotional life -- keep a positive attitude.");
        englist.add("Positive thinking is not about EXPECTING the BEST to happen. It's about ACCEPTING that whatever happens it's for the BEST.");
        englist.add("Once you replace negative thoughts with positive ones, you'll start having positive results.");
        englist.add("I'm too positive to be doubtful, too optimistic to be fearful, and too determined to be defeated.");
        englist.add("We cant control everything about our lives, but working towards a goal gives us something positive to focus on and lays the foundation for future success.");
        englist.add("You should always surround yourself with positive, successful people.");
        englist.add("Stay strong, be positive. We all struggle sometimes.");
        englist.add("How you think about a problem is more important than the problem itself. So always think positively.");
        englist.add("Don't expect to see positive changes in your life if you surround yourself with negative people.");
        englist.add("A negative mind will never give you a positive life.");
        englist.add("A positive attitude may not solve all your problems, but it annoys enough people to make it worth while");
        englist.add("Choosing to be positive and having a grateful attitude is going to determine how you're going to live your life.");
        englist.add("Life is a maths equation. In order to gain the most, you have to know how to convert the negatives into positives.");
        englist.add("You cannot have a positive life and a negative mind.");
        englist.add("Your mind is a powerful thing. When you fill it with positive thoughts, your life will start to change.");
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