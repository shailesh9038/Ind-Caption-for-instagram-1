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

public class Christmas_fragment extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Christmas_fragment() {
        // Required empty public constructor
    }

    public static Christmas_fragment newInstance(String param1, String param2) {
        Christmas_fragment fragment = new Christmas_fragment();
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

        englist.add("Christmas tells us We Are Never Alone. So WhatsApp me whenever you can.");
        englist.add("When you have Christmas in your heart it doesn’t matter what’s under the tree.");
        englist.add("The best thing I remember about Christmas is my childhood.");
        englist.add("Christmas is love in action. Every time we love, every time we give, it's Christmas.");
        englist.add("Dear Santa, I didn't want to make it too hard for you this year, So the only thing on my wish list is 1 year paid leave from work with bonus.");
        englist.add("This Christmas don't WhatsApp me, send me a gift.");
        englist.add("Well, that’s Christmas over for another year..");
        englist.add("You better WhatsApp Me on Christmas or I'll see you on a Boxing Day.");
        englist.add("Christmas is not about giving and receiving gifts. Its about the birth of Baby Jesus in the manger! Jesus is the reason for the season!");
        englist.add("Don't wait for the luck to come to you, work hard and grab it with both hands.");
        englist.add("Have an ideal Christmas; an occasion that is celebrated as a reflection of your values, desires, affections, traditions. Merry Christmas.");
        englist.add("The real magic of Christmas is that the money from wallet vanishes instantly.");
        englist.add("All I want for Christmas, cannot be found at a store.");
        englist.add("Never worry about the size of your Christmas tree. In the eyes of children, they are all 30 feet tall.");
        englist.add("Santa is always jolly, he knows where the naughty girls live.");
        englist.add("“SANTA” rearranged is “SATAN”…I’m on to you fat man.");
        englist.add("Dear Santa, I didn’t want to make it too hard for you this year, so, the only thing on my list this year is 1 year paid leave from work. with bonus");
        englist.add("If you can't commit to your resolutions. Don't worry you're not alone.");
        englist.add("This Christmas don't be a miser buy your own presents. Santa is busy.");
        englist.add("What I don’t like about office Christmas parties is looking for a job the next day.");
        englist.add("Why does Santa Claus go down the chimney on Christmas Eve? Because it suits him.");
        englist.add("Dear Santa, I didn't want to make it too hard for you this year, so, the only thing on my list this year is 1 year paid leave from work. with bonus");
        englist.add("May the New Year find your home filled with joy, your heart filled with love, and your life filled with laughter.");
        englist.add("I am sort of lazy so I've decided to postpone writing my resolutions till December.");
        englist.add("May the miracle of Christmas fill your heart with warmth and love. Christmas is the time of giving and sharing. It is the time of loving and forgiving.");
        englist.add("Santa never locks his bags because he owns a black belt.");
        englist.add("My Christmas gift is when your status changes from Last Seen At to Online and then to Typing.");
        englist.add("Wishing you a season of blessings from heaven above.Happy Christmas.");
        englist.add("Please Santa, I’ve been good all year .. most of the time .. sometimes .. Ok, Don’t worry I’ll buy my own Christmas presents.");
        englist.add("Joy Was on Christ, Love was on Mars,So Let All of This Found u Anywhere u are This Lovely Season. Merry X Mas");
        englist.add("It’s Christmas and 2011 is coming closer to an end! what’s the funniest thing you remember me doing this year?? Comment below.");
        englist.add("This year if you want a different result, make a different choice and do things in a different way.");
        englist.add("wishes you a happy time on Christmas. Merry Christmas!");
        englist.add("May the joy and peace of Christmas be with you all through the Year. Wishing you a season of blessings from heaven above. Merry Christmas");
        englist.add("Why does Santa have 3 gardens? So he can ho-ho-ho.");
        englist.add("Can I have your picture, So Santa Claus knows exactly what to give me on this CHRISTMAS.");
        englist.add("I am dreaming of a White Christmas Too bad it doesn't snow here..");
        englist.add("Unless we make Christmas an occasion to share our blessings, all the snow in Alaska won’t make it WHITE.");
        englist.add("Each one of you are precious to me! I am so blessed to have you in my life and I love each one of you! Wishing you a beautiful Christmas and a Happy New Year!");
        englist.add("My girlfriend told me she was hoping for a white Christmas.. So I spunked in her eyes");
        englist.add("Don't give up at the start because beginnings are never easy.");
        englist.add("I believe in the magic of Christmas");
        englist.add("As Christmas began in the heart of God Let us complete that love by extending our hearts to others.");
        englist.add("I will honor Christmas in my heart, and try to keep it all the year.");
        englist.add("Always Available for a Christmas Party.");
        englist.add("I wish U Enjoyable.. U shall not Lack in this X-mas thy Lord shall provide to U! Merry X-Mas.");
        englist.add("Anyone who believes that men are the equal of women has never seen a man trying to wrap a Christmas present.");
        englist.add("Selfishness makes Christmas a burden, love makes it a delight.");
        englist.add("This year I found a new device that can turn your thoughts into speech. Its called Alcohol.");
        englist.add("Life always gives you a second chance, its called Happy New Year.");
        englist.add("Christmas is like snowflakes, each beautiful and unique in its own way.");
        englist.add("ha ha ha Christmas is coming and there’s nothing you can do about it..");
        englist.add("Each one of you are precious to me! I am so blessed to have you in my life and I love each one of you! Wishing you a beautiful Christmas & a Happy New Year!");
        englist.add("Joy resounds in the hearts of those who believe in the miracle of Christmas! Wishing you all the peace, joy, and love of the season! Season's Greetings!");
        englist.add("Christmas waves a magic wand over this world, and behold, everything is softer and more beautiful.");
        englist.add("May this Christmas be so special that you never ever feel lonely again and be surrounded by loved ones throughout! Merry Christmas.");
        englist.add("What is that one thing that didn't let you fulfill your resolutions? Circumstances");
        englist.add("Its finally that time of the year when we make false promises to ourselves in the name of resolutions. Happy New Year.");
        englist.add("I have a glass ready to celebrate with anybody who has the spirit of Christmas.");
        englist.add("Wishing You All the Peace, Joy, and Love of the Season! Season's Greetings!");
        englist.add("If things are not going your way, forget your last year as a bad dream and consider your new one as a wakeup call.");
        englist.add("I'm Dreaming of a White Christmas, Not cause I like snow or anything, I'm just a racist.");
        englist.add("From Home to home, and heart to heart, from one place to another. The warmth and joy of Christmas, brings us closer to each other.");
        englist.add("Please Santa, I've been good all year .. most of the time .. sometimes .. OK, Don't worry I'll buy my own Christmas presents.");
        englist.add("well, that's Christmas over for another year..");
        englist.add("You're my guiding star so I'll follow you everywhere this Christmas.");
        englist.add("Merry Christmas! From my wall to yours..");
        englist.add("The Christmas in your heart spreads the feeling of Christmas in the air.");
        englist.add("Bells Are Ringing The Wishes of Christmas Day the Flying Snowflakes Send My Most Sincere Blessings to You Merry Christmas");
        englist.add("If you already tried things, this year focus on doing it.");
        englist.add("I am dreaming of white Christmas, with every Christmas card i write, May your days be merry and bright,and May all your Christmases be white. Happy Christmas.");
        englist.add("A boy writes to Santa asking for a brother and receives a reply back from Santa send me your mother.");
        englist.add("ha ha ha Christmas is coming and there's nothing you can do about it..");
        englist.add("What I don't like about office Christmas parties is looking for a job the next day.");
        englist.add("Merry Christmas and a Happy New Year to everyone. Keep the Christ in Christmas, and share the love, peace and forgiveness");
        englist.add("I know it's only September but there are less than 100 shopping days left til Christmas..");
        englist.add("A Christmas Candle Is a Lovely Thing It Makes No Noise At All But Softly Gives Itself a Way While Quite Unselfish It Grows Small");
        englist.add("May the Joy and Peace Of Christmas Be With You All Through The Year Wishing You A Season of Blessings From Heaven Above Happy Christmas");
        englist.add("This Christmas don't open your wallets, open your heart.");
        englist.add("We all have our own call of duty. Mine is to serve Christ.");
        englist.add("Wishing all my family and friends a happy and healthy Christmas and New Year. Be safe and Don’t Drink and Drive.");
        englist.add("Microsoft has Windows, but Santa has Chimneys.");
        englist.add("Before The Church Bells Ring. Before The Cakes and Wine Are Served. Before The Holy Star Appears. Before Networks Get JammedLet Me Wish You A Merry X'mas..");
        englist.add("A boy writes to Santa asking for a brother and receives a reply back from Santa send me your mother");
        englist.add("Has just been kidnapped by a fat man in a red suit and put in a bag, ALRIGHT! FESS UP! Who put me on there Christmas list?");
        englist.add("Wishing you Merry Xmas and let us all Live together in harmony and happiness, giving space for every one around us to complete our lives in this planet.");
        englist.add("I usually make resolutions when I am drunk, that way I never have to commit it.");
        englist.add("Go ahead make a resolution. Its not as complicated as pregnancy.");
        englist.add("A resolution is usually to avoid an evil, but in most cases the evil is far more advanced.");
        englist.add("May this Christmas be so special that you never ever feel lonely again and be surrounded by loved ones!");
        englist.add("It's not the presents that make Christmas so special, it's the presence of those you love, whether they are with you in person, or spirit.");
        englist.add("Jingle bells Jingle bells what fun it is to wish our friends a very happy merry Christmas.");
        englist.add("I know it’s only September but there are less than 100 shopping days left til Christmas..");
        englist.add("SANTA rearranged is SATAN.. I'm on to you fat man.");
        englist.add("How do you know Santa has to be a man? No woman would wear the same outfit year after year.");
        englist.add("I never believed in Santa Claus because I knew no white dude would come into my neighborhood after dark.");
        englist.add("This Christmas spread your fragrance, wear a nice perfume.");
        englist.add("I have just been kidnapped by a fat dude in a red suit, shoved in a bag and taken to the north pole and wrapped up. Who put me on their Christmas list?");
        englist.add("All I am asking this year is some luck.");
        englist.add("Santa might not visit your Christmas party this year, but I will. WhatsApp Me.");
        englist.add("I wanted to quit all my bad habits this year, but I am an optimistic, not a quitter.");
        englist.add("Christmas is just like WhatsApp. It brings you closer to me.");
        englist.add("Behind every kid's smile is Santa Claus.");
        englist.add("My Christmas wish not only for me and my family, but for all of you as well: peace of mind, health of body, strength of spirit.");
        englist.add("All my resolutions eventually get flushed in the hangover.");
        englist.add("Time is the best gift you can gift someone this Christmas.");
        englist.add("You can only believe in Santa if the kid inside you is alive.");
        englist.add("Santa Claus has the right idea. Visit people once a year.");
        englist.add("A Silent Night A Star above A Blessed Gift of Hope and Love A Blessed Christmas to You Joy Resounds in the Hearts of Those Who Believe in the Miracle of Christmas!");
        englist.add("It's Christmas and new year is coming closer to an end! what's the funniest thing you remember me doing this year?? Comment below.");
        englist.add("If this year was ordinary, do something extra in the next year and make it extra-ordinary.");
        englist.add("To my Friends and Family, Near and Far: I love you all and hope you have a very Merry Christmas..");
        englist.add("Why is Christmas just like another day at the office? You end up doing all the work and the fat guy in the suit gets all the credit.");
        englist.add("I'm not Santa. But you can still sit on my lap ;)");
        englist.add("New Year is like a restart button. Use it to start things over.");
        englist.add("To all of my family and the friends I have made, Those who left for awhile and those who have stayed, Merry Christmas with hugs and kisses..");
        englist.add("X means wrong… X means unknown… so why would you eX Christ out of His own birthday?");
        englist.add("Thank God for allowing you to have a fresh start and mess it up again.");
        englist.add("Celebrate your life as each day comes. Happy New Year.");
        englist.add("Friends like you are like Christmas lights even when they are far away they still make your Christmas seem colorful.");
        englist.add("May this Christmas end the present year on a cheerful note and make way for a fresh and bright new year. Here's wishing you a Merry Christmas and a Happy New Year!");
        englist.add("Christmas is the season when you buy this year's gifts with next year's money.");
        englist.add("So I was asleep right, when some big random guy in a red suit came and put me in a Big random bag .. OK, so who wanted me for Christmas??");
        englist.add("The real magic of Christmas is how quickly money vanishes from my wallet.");
        englist.add("Wishing You a Season of Blessings from Heaven above.");
        englist.add("What's red and white and red, red and white, and red and white? Santa Claus rolling down a hill!");
        englist.add("Hope you know how much it means to wish the best for you, because you're always thought about with love the whole year through. Warmest wishes on Christmas Day!");
        englist.add("The trouble with jogging is that the ice falls out of the glass.");
        englist.add("Warmest Wishes to All of You This Christmas.");
        englist.add("Hope you know how much it means to wish the best for you, because you’re always thought about with love the whole year through. Warmest wishes on Christmas Day!");
        englist.add("This year try and make small efforts to see big changes in your life.");
        englist.add("Grammatically Santa's elves are subordinate clauses.");
        englist.add("To my friends and family, near and far, I love you all and hope you have a very Merry Christmas..");
        englist.add("To my friends and family, near and far, I love you all and hope you have a Merry Christmas..");
        englist.add("I don't need to diet this Christmas. I am inspired by Santa Claus.");
        englist.add("Throughout this year I have bugged the hell out of you, today I just want to say that I will continue the same in the next year.");
        englist.add("when it comes to Christmas, Cher Lloyd and me have a lot in common: we're both bloody rubbish at wrapping.");
        englist.add("A lovely thing about Christmas is that it's compulsory, like a thunderstorm, and we all go through it together.");
        englist.add("Every year life gives us 365 days to find the meaning to our life.");
        englist.add("Santa won't be coming this year... He died laughing when you said you'd been a good girl.");
        englist.add("I am sleeping off this New Year so that I can work on my dreams for the next 365 days.");
        englist.add("Who doesn't like Christmas? A Turkey.");
        englist.add("When you smell my presents, Santa Claus is around.");
        englist.add("The only complaint that most shoppers have during Christmas is one of long standing.");
        englist.add("The moment the New Year party ends, it's a nightmare.");
        englist.add("This Christmas I don't need to buy a gift, because you're already by my side.");
        englist.add("Dear Santa, I didn’t want to make it too hard for you this year, So the only thing on my wish list is 1 year paid leave from work with bonus.");
        englist.add("Santa won’t be coming this year…… He died laughing when you said you’d been a good girl.");
        englist.add("Wish you happy holidays season with unforgetable Christmas and New Year.");
        englist.add("Christmas reminds me that I am in great need of gifts.");
        englist.add("Christmas carols tend to make me a little homicidal, especially in November..");
        englist.add("Dear Santa, Please send your credit card numbers. it's only fair since you're getting the credit for the gifts, that you should start paying for them also..");
        englist.add("Christmas is cancelled. I told Santa I've been good this year. He died laughing.");
        englist.add("Dear Santa, Please send your credit card numbers. it’s only fair since you’re getting the credit for the gifts, that you should start paying for them also..");
        englist.add("This year my resolution is to find out who I am.");
        englist.add("Stop checking my status. I don't post my resolutions here.");
        englist.add("This is the message of Christmas: We are never alone!!!");
        englist.add("Unless we make Christmas an occasion to share our blessings, all the snow in Alaska won't make it WHITE.");
        englist.add("This Christmas don't gift me with a present, give me your presence.");
        englist.add("Christmas does not come from the pockets, it comes from the heart. It's not about gifts, rather family and friends. MERRY CHRISTMAS");
        englist.add("I hope you have a wonderful Christmas have a great new year ! Hopefully Santa will be extra good to you . enjoy your holidays !");
        englist.add("No Greeting Card To Give.. No Sweet Flowers To Send.. No Cute Graphics To Forward.. Just A LOVING HEART Saying HAPPY X'MAS");
        englist.add("One of the most glorious messes in the world is the mess created in the living room on Christmas day. don't clean it up too quickly..");
        englist.add("Even if you had one bad year, remember there's still life ahead.");
        englist.add("May the joy and peace of Christmas be with you all through the Year. Wishing you a season of blessings from heaven above. Happy Christmas");
        englist.add("The best Christmas of all is the presence of a happy family all wrapped up with one another.");
        englist.add("Every day is a Christmas, but then we celebrate it only one day a year and wait for 364 days.");
        englist.add("May All The Sweet Magic Of Christmas Conspire To Gladden Your Hearts And Fill Every Desire To my friends and family, near and far, I love you all and hope you have a Merry Christmas..");
        englist.add("Wishing all my family and friends a happy and healthy Christmas and New Year. Be safe and Don't Drink and Drive.");
        englist.add("Why is Santa a man? Because only a man can wear the same attire every year.");
        englist.add("Christmas is the season when you buy this year’s gifts with next year’s money.");
        englist.add("New Year is not a life-changing event. You just change your resolutions.");
        englist.add("I wish U Lovely X-mas, I wish U Favorable.");
        englist.add("Every year I make a resolution to Be Myself, but circumstances change me.");
        englist.add("Santa's biggest gift to me is YOU.");
        englist.add("I am dreaming of a “White Christmas” Too bad it doesn’t snow here..");
        englist.add("New Year is the time of resolution and reflection.");
        englist.add("It’s not the presents that make Christmas so special, it’s the presence of those you love, whether they are with you in person, or spirit.");
        englist.add("Wish you happy holidays season with unforgettable Christmas and New Year.");
        englist.add("From home to home and heart to heart,From one place to another,The warmth and joy of Christmas, Brings us closer to each other.Merry X-Mas");
        englist.add("Bells are Ringing The wishes Of Christmas Day...The Flying snowflakes send my most sincere wishes To U and Ur Family... MERRY CHRISTMAS...");
        englist.add("Christmas does not come from the pockets, it comes from the heart. It’s not about gifts, rather family and friends. MERRY CHRISTMAS");
        englist.add("A Peaceful Christmas and A Happy And Prosperous New Year To You. May We All Be Seven Times Better Off At This Time Next Year");
        englist.add("Christmas, shouldnt be about gifts, it should be about love, forgiveness, kindness, compassion, to give and be someones angel when they need it the most.");
        englist.add("when it comes to Christmas, Cher Lloyd and me have a lot in common: we’re both bloody rubbish at wrapping.");
        englist.add("Christmas is always in my heart like you are always on my WhatsApp list.");
        englist.add("When you have Christmas in your heart it doesn't matter what's under the tree.");
        englist.add("The difference between snow men and snow women are snowballs.");
        englist.add("Step into a new year and kick your troubles out of the window.");
        englist.add("Finally Christmas is here. I waited 364 days for this one.");
        englist.add("The best gifts in life will never be found under a Christmas tree! Those gifts are friends, family, kids and the one you love!!");
        englist.add("The year is about to change, will you?");
        englist.add("I am dreaming of White Christmas, but it doesn't snow here.");
        englist.add("Christmas is not as much about opening our presents as opening our hearts.");
        englist.add("Christmas, shouldn't be about gifts, it should be about love, forgiveness, kindness, compassion, to give and be someones angel when they need it the most.");
        englist.add("Every year is different, treat it differently.");
        englist.add("Each one of you are precious to me! I am so blessed to have you in my life and I love each one of you! Wishing you a beautiful Christmas and a Happy New Year.");
        englist.add("Christmas is the gentlest, loveliest festival of the revolving year – and yet, for all that, when it speaks, its voice has strong authority.");

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