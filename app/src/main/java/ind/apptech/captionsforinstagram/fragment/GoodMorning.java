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

public class GoodMorning extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public GoodMorning() {
        // Required empty public constructor
    }

    public static GoodMorning newInstance(String param1, String param2) {
        GoodMorning fragment = new GoodMorning();
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

        englist.add("Every morning you have two choices, continue your sleep with dreams or wake up and chase ur dreams. Choice is Your. GOOD MORNING");
        englist.add("GOOD MORNING. It's a beautiful day, get out, share your beautiful smile with the world.");
        englist.add("I’m awake. Coffee: check, Cigarette: check. You may approach now.");
        englist.add("You have to Get up every morning and tell yourself 'I can do this!' Good Morning");
        englist.add("Growing old is mandatory, growing up is optional. 'Good Morning'");
        englist.add("Like the sunshine in the morning, may this brighten your day, and remind you that you're thought of in a very warm way.");
        englist.add("Good Morning! If nobody has told you they love you YET today let me be the FIRST I love you! Have a blessed day..");
        englist.add("There are no “bad” days, only inconveniences. Everyday is good for something.");
        englist.add("Wake up! it's morning time with cheerful moments.");
        englist.add("My bed and I have a special relationship. We are perfect for each other. But my alarm clock just hates seeing us together.");
        englist.add("Morning Peeps! Y’all have a good day!");
        englist.add("You have no idea how good it feels to wake up every morning knowing you are mine and I am yours. Good Morning.");
        englist.add("The way you start your day can affect your whole day… Begin it with a smile, calmness of mind, coolness of emotions and a heart filled with gratitude. Good Morning");
        englist.add("A simple good morning, have a great day, or I love you, goes a long way...So I'm sending you all three.");
        englist.add("The sooner you fall behind the more time you’ll have to catch up.");
        englist.add("You are the pulse that throbs in my veins, you are the antidote that frees me of all pains. You are the rhythm of my heartbeat, without you my life would be incomplete. Good morning.");
        englist.add("Good morning is a contradiction of terms…");
        englist.add("The game of life is not so much in holding a good hand as playing a poor hand well. Good Morning");
        englist.add("Good morning friends … Wait … what the hell m I doing up this early?");
        englist.add("Waking up to a new day is a gift, appreciate it and do remember you are loved. Good morning and have a splendid day.");
        englist.add("Three of the most powerful words you can say to a women... Good Morning Beautiful.");
        englist.add("May you begin this day with a smile on your face, and with happiness for your soul to embrace. Good Morning my Love.");
        englist.add("No matter how long have you slept … You always want those 5 MINUTES in the Morning.");
        englist.add("My alarm clock is clearly jealous of my amazing relationship with my bed.");
        englist.add("3 steps to have a great morning; open your eyes, take a deep breath and go back to sleep. Good Morning.");
        englist.add("When you arise in the morning, think of what a precious privilege it is to be alive – to breath, to think, to enjoy, to love. Good Morning and have a good day.");
        englist.add("Good Morning friends have a blessed day!!");
        englist.add("Good morning everybody! Remember you are beautiful because God never makes mistakes Good Morning!!");
        englist.add("Good Morning, hope everyone is feeling blessed this morning praise God.");
        englist.add("Success comes to those who have the will power to win over their snooze buttons. Wishing you an awesome morning.");
        englist.add("Morning brings hope, afternoon brings faith.");
        englist.add("3 things you can't recover in life. The MOMENT after it's missed, The WORD after it's said and the TIME after it's wasted. Good Morning.");
        englist.add("When you wake up you have two choices, It’s either you sleep again and continue to dream or Stand up and make your dreams real.");
        englist.add("Every morning the way you take me in your arms that makes my day special. Good Morning.");
        englist.add("Without me, my coffee is useless.");
        englist.add("Seriously ........ Our mornings are awesome when we see the text from the person we really care for.");
        englist.add("Good Morning, people. Feeling a “GOOD DAY” comin on here…");
        englist.add("I don't care whether the sun rises or not, my morning starts only after I text my girl who I love a lot. Good morning.");
        englist.add("I hate it when a dream is near the best part, and you wake up!");
        englist.add("Faith makes all things possible.. love makes all things easy...have a good day!!!");
        englist.add("Good Morning Wishing you a day full of joyful moments.");
        englist.add("It’s a good day today I woke up all by myself without anyone screaming at me to wake up, the phone didn’t ring, and no alarm! yep great day.");
        englist.add("No matter how good or bad your life is, Wake up each morning and be thankful that you still have one. Good Morning");
        englist.add("Morning would be great if it didn't come so early in the day.");
        englist.add("If the early morning sky was a representation of every person I know, you are the sun and everyone else are the fading stars, soon to disappear by your blazing love. Good morning.");
        englist.add("There is only one remedy to cold shivery mornings , warm cuddly hugs with you. Good morning.");
        englist.add("From morning first light to evening's last star, always remember how special you are!!");
        englist.add("Good Morning! Wishing you a day full of love and peace!!");
        englist.add("So simple is to live; So simple is to love; So simple is to smile, So simple is to win, So simply Good morning.");
        englist.add("Wake up! it’s morning time with cheerful moments. Wishing you a very happy good morning. Have a good day!");
        englist.add("You are the reason I can be happy even when I am sad. You are the reason I can smile even when I cry. Good morning.");
        englist.add("A morning text does not only mean good morning. It also means, I think about you when I wake up.");
        englist.add("A good idea will keep you awake during the morning, but a great idea will keep you awake during the night.");
        englist.add("I have learned that it is not what i have in my life but who I have in my life that counts. Good Morning and Have a good day.");
        englist.add("GOOD MORNING to all of my fb friends and family! I hope today’s a GREAT day, full of smiles, laughter & blessings, Don’t hide the sunshine inside you.");
        englist.add("Dont forget to pray today, because God didnt forget to wake you up this morning. Good Morning .");
        englist.add("A smile is a great way to start off your day. Good Morning.");
        englist.add("You can wake up and say 'Good Morning, God' or 'Good God, it's morning'");
        englist.add("Good thoughts precede great deeds. Great deeds precede success. Have a great day.");
        englist.add("Everyday we wake up is another blessing. Follow your dreams and don’t let anyone stop you.");
        englist.add("If you know what to do to reach your goal, it’s not a big enough goal.");
        englist.add("Add life to your days not days to your life.");
        englist.add("May you begin this day and every day with a smile on your face. Good Morning");
        englist.add("I love it how in the beginning of the day it starts out all good. Come to the end of it though, everything is screwed up.");
        englist.add("Start your day with a smile and lots of joy in your heart. Be positive that everything will be okay and full of happiness. Good Morning");
        englist.add("Every Morning Is A Symbol Of Rebirth Of Our Life So Forget All Yesterdays Bad Moments And Make Today Beautiful.... GUD MORNING");
        englist.add("Fresh coffee in my cup and my FB page is up, look at that, i already achieved all my goals for the day..");
        englist.add("The best feeling: When you wake up at 5am and realize you still have more hours to sleep.");
        englist.add("My bed is always extra comfortable when I need to get out of it in the morning.");
        englist.add("Morning is a wonderful blessing, either sunny or stormy. It stands for hope … giving us another start of what we call life.");
        englist.add("Good morning starshine, the Earth says hello….");
        englist.add("Good morning A special coffee for you, mixed with love and affestion. have a beautiful day!");
        englist.add("Awake, coffee, sunshine and another day off, aahhhhh, life is good!");
        englist.add("There are millions of ways to express love and as I learn them, you will feel more and more blessed. Good Morning.");
        englist.add("When you wake up in the morning, kiss your loved one on the forehead and wish them a good day.");
        englist.add("Good morning my friends. It's a new day and I hope things get better. For this I did pray, may all of your problems be out on their way on this bright morning that starts this new day.");
        englist.add("New day new blessing. Don’t let yesterdays failures ruin the beauty of today, because each day has its own promise of love and joy. GOOD MORNING");
        englist.add("Today ask GOD what you deserve not what you desire. Desiring in an earthly thing. Blessing is what you deserve. Good Morning");
        englist.add("Wake up greet the day and make a promise to yourself its going to be a good day and no one will change it no matter what happens.");
        englist.add("Be with a people who makes you happy and smile :)");
        englist.add("Good Morning Face Book friends, I do wish you all the happiness that one can get in a days time.");
        englist.add("Love the life you live, Live the life you love..!!");
        englist.add("What is love? It is the morning and the evening star.");
        englist.add("Every sunrise gives me a new day to love you. Good morning sweet heart, have a wonderful day.");
        englist.add("Today, give a stranger one of your smiles. It might be the only sunshine he sees all day. Good Morning");
        englist.add("Today I pray for you a heart free of sadness, a mind free of worries, a life full of gladness, a body free of illness & a day full of God's blessings. Good Morning");
        englist.add("Hello family and friends, may you all have a pleasant day! God Bless!");
        englist.add("Wake up each day and be thankful for life. Good Morning.");
        englist.add("Every selfish man, strangely enough, becomes a self slayer");
        englist.add("Every morning I wake up happy because I know I will see you. Good Morning");
        englist.add("It's really nice to wake up in the morning realizing that GOD has given you another day to live. Good Morning ..");
        englist.add("No matter how bad you think your life, wake up each day and be thankful for what you have. Someone somewhere is fighting just to survive. Good Morning..");
        englist.add("Good morning all.. it’s time to greet the day.. make the best of it come rain or shine.");
        englist.add("Nothing like waking up with GOD by your side and COFFEE in your cup!!");
        englist.add("I could be a morning person, if morning happened at Noon!");
        englist.add("Happy Day Begin :)");
        englist.add("Just want to give a shout out, a hug, some dap, a high 5, a pound, handshake, a pat on the back, a kiss, some love and a good morning to you Facebook.");
        englist.add("Love the life you live, Live teh life you love... Good Morning!!");
        englist.add("“Good Morning” May you begin this day with a smile on your face, and with happiness for your soul to…");
        englist.add("I wake up smiling because u have been in my dreams and i go to bed with that same smile because u have been on my mind all day..");
        englist.add("Good Morning.. May you begin this day with a smile on your face, and with happiness for your soul to...");
        englist.add("Don’t start your day with the broken pieces of yesterday. Every morning we wake up is the first day of the rest of our life.");
        englist.add("Your day is only as good as you make it. Make it great, Good Morning..");
        englist.add("Every morning, every moment always remember that our God is a GOD OF LOVE. Good Morning .");
        englist.add("Bin savan barsat nahi hoti, suraj dube bin rat nahi hoti, kuch aese dost hai ki unko yad kiye bina din ki sharuaat nahi hoti....GOOD MORNING :)");
        englist.add("Add life to your days not days to your life... Good Morning!");
        englist.add("Being in love with you makes every morning worth getting up for.");
        englist.add("Did you feel a little warm in the morning? I sent you warm hugs in my thoughts! Good morning and have a wonderful day.");
        englist.add("How can anyone NOT like mornings?? God gave you another day... Get up, give him your worries and enjoy the day .");
        englist.add("Forgiveness and letting go are steps on our road back to happiness. Good morning, Have A Nice Day..");
        englist.add("Every new day is a chance to change your life...Good Morning!!");
        englist.add("I'm not a morning person, don't pull my covers off. Good Morning");
        englist.add("Goodnight, sleep tight, {{HUGS}} to you all!! I'm off to bed. Sweet dreams!!");
        englist.add("Mission one accomplished, I woke up…");
        englist.add("It’s morning and I may have to rise, but I don’t have to shine.");
        englist.add("I just love when morning gets here, cuz i can send a Great Big Good Morning sms to my dearest. What a lovely way to start my day!");
        englist.add("Just the thought of you brightens up my morning.");
        englist.add("Whoever says “Good Morning” on Monday’s deserves to get slapped :)");
        englist.add("Good beautiful morning! I feel a fabulous day coming on..");
        englist.add("Each moment in a day, has its own value. Good Morning");
        englist.add("Never pretend to a love which you don't actually feel for, love is not ours to command..");
        englist.add("Good morning God, Thanks for the wake-up call.");
        englist.add("Good morning is one of my favorite things to say! It means the day is new and full of possibilities!");
        englist.add("May your pockets be heavy and your heart be light. May good luck pursue you each morning and night.");
        englist.add("Every day is the start of something beautiful. Good Morning");
        englist.add("I will say yes to all the good things that come my way...");
        englist.add("Every morning is destiny's way of telling you that your purpose in life is yet to be fulfilled. Good morning.");
        englist.add("Wake up! it's morning time with cheerful moments. Wishing you a very happy good morning. Have a good day!");
        englist.add("I wake up early like everybody does. It's just that I turn off the alarm then and sleep.");
        englist.add("Be resolute in your goals, but flexible in your tactics.");
        englist.add("GOOD MORNING ! It’s a beautiful day in the neighborhood ! EVERYONE, get out there and share your beautiful smile with the world.");
        englist.add("One kind word can change someone’s entire day. Good Morning and have a good day.");
        englist.add("I feel sorry for those who do not drink. When they wake up in the morning, thats as good as they’re going to feel all day.");
        englist.add("Dont like me? Cool, I dont wake up every day to impress you.");
        englist.add("Good Morning friends and families Blessings to you and your always Have a good ay and God Bless...");
        englist.add("It is a good morning exercise for a research scientist to discard a pet hypothesis every day before breakfast. It keeps him young.");
        englist.add("I may be up, but I don't have to like it!");
        englist.add("Whoever says Good Morning on Monday's deserves to get slapped :)");
        englist.add("Morning greetings doesn’t only mean saying Good Morning, it has a silent message saying: I remember you when I wake up!");
        englist.add("Wake up every morning with the thought that something wonderful is about to happen.");
        englist.add("Every morning reminds me of all the wrong dreams i had been chasing all my life until i found The right one. you...");
        englist.add("patience is not the ability to wait, but the ability to keep a good attitude (and my mouth shut) while waiting!");
        englist.add("Every morning take a good look at yourself in the mirror and say I am going to have a great day! Yes I can do it, and I will let nobody steal my joy..");
        englist.add("Today I promise to live without Facebook and Twitter, if you promise to kiss me all day and make me feel better. Good morning.");
        englist.add("Bad Attitude is like a flat tyre. You cannot reach anywhere until you change it. Good Morning.");
        englist.add("Every sunrise gives me a new day to love you. Good morning sweet heart. Good Morning");
        englist.add("A smile is a way of writing your thoughts on your face, telling others that they are accepted, liked and appreciated. So here's a big smile just for you. Good morning ..");
        englist.add("Laughter is the sun that drives winter from the human face.");
        englist.add("Mornings would be better if I woke up next to you. Good Morning .");
        englist.add("Wishing you a day as sunny as your smile, as warm as your heart, a day as wonderful as you are. Good Morning");
        englist.add("A sweeter smile, a brighter day, hope everything turns out great for you today. Good Morning");
        englist.add("I’m in love with my bed, we’re perfect for each other! But my alarm clock just doesn’t seem to want us together!");
        englist.add("The easiest way to wake up in mornings is coffee in bed.");
        englist.add("Usually I have good mood in the mornings, until I start meeting people.");

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