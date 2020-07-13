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

public class Food extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Food() {
        // Required empty public constructor
    }

    public static Food newInstance(String param1, String param2) {
        Food fragment = new Food();
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

        englist.add("Chocolate is cheaper than therapy and you don't need an appointment.");
        englist.add("Food is my favorite. If I ever share it with you, then you're pretty damn special.");
        englist.add("The year is 2089. Toasters are made clear now and no one burns toast or bagels. Crime is at 0%");
        englist.add("I'm so excited for Valentines Day all the chocolate is gonna be on sale YAY");
        englist.add("Is there gonna be food? Yeah Ok then i'm coming.");
        englist.add("my hobbies include eating and complaining that i'm getting fat.");
        englist.add("I enjoy long romantic walks to the fridge.");
        englist.add("Accomplishing things before the microwave hits 00:00.");
        englist.add("I will stop eating ice cream out of the container once I make it completely level.");
        englist.add("Eating an orange before working out not only keeps you hydrated but also keeps your muscles from getting sore");
        englist.add("Alcohol - Because no good story started with someone eating a salad.");
        englist.add("Eating popcorn: 80% during trailers. 20% during the movie.");
        englist.add("We've solved so many world problems, and yet chocolate still has calories.");
        englist.add("You cannot taste me, until you undress me. Sincerely, banana.");
        englist.add("I'm trying to kick dairy and now I've got the milk shakes.");
        englist.add("Hell hath no fury like me when I'm slightly inconvenienced and hungry.");
        englist.add("True beauty is within for example opening your fridge");
        englist.add("ughh I'm so full..who wants dessert?..MEEE!!!");
        englist.add("You can't buy happiness, but you can buy ice cream. And that's kind of the same thing.");
        englist.add("I don't trust people that dislike tacos.");
        englist.add("When you're stressed you eat ice cream, cake, chocolate, and sweets.. Why? Because 'Stressed' spelled backwards is 'Desserts' :)");
        englist.add("Men: Uses love to get s3x. Women: Uses s3x to get love. Me: Uses coupons to get pizza.");
        englist.add("I need to hire someone who will follow me around and just knock the unhealthy food out of my hand.");
        englist.add("Nothing says I've already given up on this day quite like a Taco Bell breakfast.");
        englist.add("Television + food, it just goes together");
        englist.add("I just stepped on a cornflake. Now, I am officially a cereal killer.");
        englist.add("I disagree that hunger isn't an emotion. I feel it in my SOUL.");
        englist.add("Mom, can we go to McDonalds? there's food in the fridge.That's not what I asked..");
        englist.add("Poor alcohol, it gets blamed for everything.");
        englist.add("I'm not hungry. But, I am bored. Therefore, I shall eat. Story of every person's life.");
        englist.add("My dinner stomach is full, but my dessert stomach still has room.");
        englist.add("There was a piece of chocolate cake in the fridge and a note, Don't eat me. Now there's an empty plate and a note, Don't tell me what to do.");
        englist.add("I'm the type of person who looks at the menu for five minutes but ends up ordering the same exact thing every time.");
        englist.add("Dear Pringles, I cannot fit my hand inside your tube of deliciousness.");
        englist.add("If you drink enough fluids in the morning, you will feel happier, sharper, and more energetic throughout the day.");
        englist.add("Is there gonna be food? Yeah Ok then i'm coming.");
        englist.add("I'm not hungry. But, I am bored. Therefore, I shall eat... :D");
        englist.add("Everything sucks .. .. .. .. .. except FOOD !!!!");
        englist.add("Hockey is more enjoyable if you pretend they're fighting over the world's last Oreo.");
        englist.add("LIKE if you can't tell the difference between coke & pepsi.");
        englist.add("Dear Vegetarians, If you love animals so much, then why do you keep eating all their food?");
        englist.add("If there is no chocolate in heaven.. I AM NOT GOING !");
        englist.add("Dear food commercials, No one eats in slow motion with their eyes closed. Sincerely, normal people.");
        englist.add("My diabetic friend died in his sleep. I forgot to wish him sweet dreams.");
        englist.add("Dear Fridge, I will be back in 35 minutes, please go shopping. Sincerely, Hungry as hell!");
        englist.add("really doesn't get why people like brunch. What's the benefit of combining break-dancing and lunch?");
        englist.add("When I hear myself eating crunchy food, I wonder if other people can hear it too.");
        englist.add("I eat so much.. I make fat kids look skinny!");
        englist.add("all i want in life is to lose weight and gain money yet instead, here i am, gaining weight and losing money");
        englist.add("I want a hot body but I also want hot wings.");
        englist.add("Just finished my 6 minute upper body workout-it was pretty easy:arm down,pick up food,arm up,put food in mouth, switch arms :)");
        englist.add("If I was supposed to share them, they wouldn't be called nachos.");
        englist.add("That awkward moment when someone skinnier than you says I'm so fat. and you stand there like (-_-)");
        englist.add("Stop complaining about being single on valentines day. We have bigger problems here, like why McDonald's doesn't serve breakfast after 10:30");
        englist.add("You don't really truly know someone until you get ridiculously drunk with them.");
        englist.add("Mom, can we go to McDonalds? there's food in the fridge.That's not what I asked.");
        englist.add("You're at Starbucks? Please post pictures of your coffee, I've never seen one before.");
        englist.add("Stop complaining about being single. We have bigger problems here. Like why McDonald?s doesn't serve breakfast after 10:30.");
        englist.add("Arizona 99 cent drinks are the shit. Period.");
        englist.add("I need pumpkin flavored EVERYTHING.");
        englist.add("Hiding your favorite food from the rest of your family because you're a selfish bitch.");
        englist.add("The first sip of a hot beverage is always the scariest sip.");
        englist.add("Never make eye contact while eating a banana.");
        englist.add("Of course size matters. No one wants a small pizza.");
        englist.add("Chips have little nutritional value. That's why you need to eat the whole bag.");
        englist.add("That moment when skinny people call themselves fat and your heavier than them.");
        englist.add("The only clubs I'm into are sandwiches.");
        englist.add("You can't buy happiness.but you can buy ice cream,which is kinda the same thing. ;)");
        englist.add("Okay, can someone please invent the opposite of a microwave. I need my beer cold, now. And no, the freezer is not fast enough :)");
        englist.add("Eat like every day is Thanksgiving.");
        englist.add("If you open your fridge and find nothing to eat, lower your standards.");
        englist.add("I'm not hungry. But, I am bored. Therefore, I shall eat. :D");
        englist.add("If history has taught us anything, it's that reheated french fries are gross.");
        englist.add("Isn't it weird that after 30,000 years of eating bread, everyone is gluten allergic now?");
        englist.add("Celery is 95% water and 100% not pizza.");
        englist.add("If you say you can't cook what your really saying is that you can't read and follow directions.");

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