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

public class MenandWomen extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public MenandWomen() {
        // Required empty public constructor
    }

    public static MenandWomen newInstance(String param1, String param2) {
        MenandWomen fragment = new MenandWomen();
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

        englist.add("Guys have no idea how long something they said can stay in a girl's mind.");
        englist.add("Girls are funny creatures. They hate it when you ask their age, but will kill you if you forget their birthday's :-)");
        englist.add("Guys: When she's not yours, you'll do everything you can to get her. But when you do have her, you take everything for granted.");
        englist.add("I just love getting dirty.");
        englist.add("Girls want a lot of things from one guy. Conversely, guys want one thing from a lot of girls.");
        englist.add("All your love, all your caring ways, all your giving these years are the reasons why my heart thinks of you on Women's Day! with a wish for happiness and a world full of love. Happy Women's Day!");
        englist.add("Like this if you have ever checked Facebook while naked..");
        englist.add("I am single, because i haven't found someone who deserves ME.");
        englist.add("it's Very easy to sacrifice for a girl , but it's difficult to find a girl deserve sacrificing");
        englist.add("Woman is the companion of man, gifted with equal mental capacity. Happy Woman's Day.");
        englist.add("Remember You Are Unique, Know Your Own Worth Believe That Your Existence Is A Blessing To This Earth. Happy women's day.");
        englist.add("There are some people in this world that give my middle finger a boner..");
        englist.add("If a girl cries, there may be thousand reasons. But if a boy cries, there is only one reason: 'GIRL'");
        englist.add("Whats the worst thing you can do to a blind man? Leave the plunger in the toilet!");
        englist.add("Work,@play@fun just everywhere u r amazing!! Happy Women's Day");
        englist.add("Behind every great woman, there is a guy looking at her @ss :D");
        englist.add("What goes in hard and pink and comes out soft and squishy? What?! It’s bubble gum. Jeez, what were you thinking?!");
        englist.add("We are cute daughters, we are sweet sisters, we are lovely lovers, we are darling wives, we are adorable mothers, we are source of strength, we are WOMEN! Happy Women's Day!");
        englist.add("We may not be able to see each other or listen to each other often. But thoughts of you fill my heart with fond memories of the times we have spent together. Thinking of you! Happy Women's Day sweetheart.");
        englist.add("I-L-O-V-E-Y-O-U has eight letters, but baby, so does B-U-L-L-S-H-I-T...");
        englist.add("When girls get jealous, it's normal. But, when boys get jealous, lucky the girl he loves.");
        englist.add("A smart girl knows how to love. A smarter one knows who to love.");
        englist.add("Here's to the woman who is loyal to family and friends. Who expects nothing from others, than she is willing to give. Happy Women's day!");
        englist.add("Wishing a very happy women's day to the most amazing woman I know...");
        englist.add("Great minds think alike but dirty minds work together :)");
        englist.add("A real man is a man that can overlook every other female because all his attention is already on one.");
        englist.add("Often we leave our appreciation unspoken! Today we all say Happy Women's Day!!");
        englist.add("When guys get jealous, it's actually kinda cute. When girls get jealous, World War III is about to start!");
        englist.add("Worlds Shortest Joke: 2 women were sitting quietly...");
        englist.add("Girls don't dress for boys, they dress for themselves. If girls dressed for boys, they’d just walk around naked all the time.");
        englist.add("My world is beautiful because of you and I wish to spend the rest of my life loving you. I love you forever!");
        englist.add("A beautiful woman draws strength from troubles, smiles during distress and grows stronger with prayers & hope. Happy women's day.");
        englist.add("An excellent lady must hope to be more responsible for her steps, than one less alluring.");
        englist.add("When a boyfriend brings his girlfriend flowers for no reason, there's a reason :)");
        englist.add("Knows the real fountain of youth is to have a dirty mind and a naughty smile..");
        englist.add("Dear Girls, remember catching a husband is an art, to hold him is a job.");
        englist.add("I Was Born Intelligent But Girlzz Ruined Me :)");
        englist.add("Hey girl, I’d like to be a part of your next abortion.");
        englist.add("you'll never loose women by chasing money. But you'll loose money by chasing women.");
        englist.add("Touch it gently, put 2 fingers inside, if it’s wide use 3 fingers, make sure it’s wet and rub up and down. Yep that’s how you wash a cup.");
        englist.add("Women and rocks are very much alike … We skip the flat ones.");
        englist.add("I'm a boy. I don't smoke, drink, or party every weekend. I don't sleep around or start drama to get attention. Yes, we still do exist.");
        englist.add("A beautiful woman, a great friend and a wonderful mother. You are all this to me and much more.. I feel so lucky and proud to have a mom like you. Happy Women's Day to Mother!");
        englist.add("I can remember when the air was clean and sex was dirty.");
        englist.add("Dear girls, don't flatter yourself. i sent you a friend request, NOT a wedding proposal.");
        englist.add("Thee willingness to listen, The patience to understand, The Heart to Care and Just to be there. That is the Beauty of a Lady.");
        englist.add("You miss 100 percent of the shots u never take.");
        englist.add("He slides into second with a stand up double.");
        englist.add("My girlfriend says that I treat her like a child, So I gave her a sticker for standing up for her self.");
        englist.add("If a girl is shopping she's trendy, if boy is shopping he's wasting money.");
        englist.add("If abortion is murder then are condoms kidnapping?");
        englist.add("Never underestimate a girl's ability to find things out.");
        englist.add("Wishing you a day that's just like you.. really special! Happy Women's day!");
        englist.add("I always start writing with a clean piece of paper and a dirty mind.");
        englist.add("When a person is really into you, he or she will always find a way to have time with you.. NO EXCUSES.");
        englist.add("The smarter the woman gets, the more difficult for her to find the right man! Happy Women's Day ;)");
        englist.add("If they play dirty, then you play dirty.");
        englist.add("The secret of being a great man = having a great woman who supports you all the time!");
        englist.add("Some words of advice to men: Treat women the same way you would want your daughter to be treated.");
        englist.add("My Girlfriend says I need to be more affectionate.... Now I have 2 Girlfriends! :p");
        englist.add("Sex education may be a good idea in the schools, but I don’t believe the kids should be given homework.");
        englist.add("Women need a reason to have sex. Men just need a place.");
        englist.add("Ladies: A REAL Man Won't Send You Mixed Signals... Cause a Real Man Knows What He Wants..");
        englist.add("I swear my pillow could be a hairstylist I always wake up with the wierdest hairdos.");
        englist.add("Girls Are Like Police. Once They Get Hold Of All The Evidences, They Still Want To Hear The Truth From You.");
        englist.add("Girls don't need make up to look pretty for a guy. Is it true?");
        englist.add("Three words a boyfriend will never heard from his girlfriend - 'You Are Right'");
        englist.add("Don’t you wish people could be like money, so you could hold them up to the sun and see which ones are fake and who are real.");
        englist.add("Sending you wishes to say you blossom up the world around me! Happy Women's Day!");
        englist.add("This Women's Day just stand tall cos you are the most special woman of my life!!");
        englist.add("My idea of “friends with benefits” is another one of my friends doing my laundry. What were you people thinking.. I have morals.");
        englist.add("I hate how chocolate immediately melt on my fingers. I mean.. am I that hot?");
        englist.add("I once made love for an hour and fifteen minutes, but it was the night the clocks are set ahead.");
        englist.add("Women have an amazingly mysterious ability of communication. They listen half, understand quarter but can tell double.");
        englist.add("Wishing you a day filled with goodness and warmth. Wishing you happiness, today and forever. Happy Women's Day!");
        englist.add("Happy Women's Day to the one who has stolen my heart! Happy Women's Day 2015.");
        englist.add("I've just moved you to the top of my 'To do list' ;)");
        englist.add("Today is yours, and so is ever other day. Happy Women's Day!");
        englist.add("Woman without curves is like a road without bends…. You may get to your destination quicker, but the ride is boring as hell.");
        englist.add("Happy Women's Day! Wishing you a day as beautiful as you are!");
        englist.add("It's funny how girls RUN from the guy who try to make them happy, and FIGHT for the ones that make them cry.");
        englist.add("Best line which help you save money when going on restaurents with your girlfriend - So what's you gonna eat Fatty ??");
        englist.add("Dear Good Boys, do not worry having no girlfriend this time. Remember, bad boys will always have the best girlfriend but they will never have the best wife.");
        englist.add("She gave you birth, she gives you love, she teaches you to smile to reach that extra mile, its the woman behind everyone. HAPPY WOMEN'S DAY.");
        englist.add("Needs to wash his mind out with soap..");
        englist.add("You can do almost anything your mind to. You can swim the deepest ocean and climb the highest peak. Be a doctor or fly a plane.. You can face adversity and still walk tall. You are strong, beautiful, compassionate and much more than words could ever say! Today is yours and so is every other day.. Happy Women's Day");
        englist.add("Make your girlfriend happy by telling those 3 words every girl loves to hear 'Here's my Wallet'");
        englist.add("Hey Girls, I'm Mr. Right. Someone said you were looking for me? :p");
        englist.add("If you`re texting two people at the same time, you are bitextual.");
        englist.add("Words that spoiled many boys' life .... 'Dude she's looking at you.'");
        englist.add("On this special day, celebrate life. Take a break from your busy schedule. Let your hair down, have fun and do what your heart says. Cause today is your day. Have a great Women's Day!");
        englist.add("Whatever you do, you do it with grace, style, warmth and a smile! (Tell me your secret, will you?).. HAPPY WOMEN'S DAY....");
        englist.add("Feel special, unique, on top of the world.. Its your day!! Happy Women's Day.");
        englist.add("Half you boys better pray your daughter never runs into a guy like you");
        englist.add("Men hang out in bars for one of two reasons: Either they have no wife to go home to, or they do. :p");
        englist.add("A female can be your best friend, worst enemy, or your worst nightmare...It all depends on how you treat her!");
        englist.add("Girls, being beautiful doesn't make you nice. Being nice makes you beautiful!");
        englist.add("So many stupid people, and so few asteroids.");
        englist.add("You can get her love in the form of a sister, friend, beloved, wife, or in the form of a mother and also in the form of a grandmother; so respect HER.. She is a Woman! Happy Women's Day!");
        englist.add("Treat your girlfriend right, or someone else will.");
        englist.add("Your lips are like wine & I wanna get drunk.");
        englist.add("Don’t call the world dirty because you forgot to clean your glasses.");
        englist.add("3 dreams of a man: To be as handsome as his mother thinks.To be as rich as his child believes.To have as many women as his wife suspects .");
        englist.add("In a cramped bus.. Lady: Something of yours is touching me. Man: Oh! That’s… that’s just my salary in my pocket. Lady: Did your salary just triple in the last 5 minutes?");
        englist.add("My mother never understood the irony in calling me a “son-of-a-bitch.");
        englist.add("Today I came across a book that said: 'All the things men know about woman', it was blank inside.");
        englist.add("You are strong, beautiful, compassionate and much more than words could ever say! Happy Women's Day!");
        englist.add("Some people can make happiness bloom just by saying just by being what they are. You're one of them. Happy Women's Day!");
        englist.add("I think the woman who invented the phrase “All Men Are The Same” was a chinese woman who lost her husband in the crowd :)");
        englist.add("We may not be able to see each other or listen to each other often. But thoughts of you fill my heart with fond memories of the times we have spent together. Thinking of you!");
        englist.add("one day you'll realize...all the love that i gave to you...is now being given to someone else");
        englist.add("A man in love is incomplete until he is married. Then he's finished. :P");
        englist.add("Girls biggest lie: I'm OK.");
        englist.add("I need no reason to love you, but I need thousands of reasons to leave you.");
        englist.add("You are the passion, You are the mystery, You are the magic! Happy Woaman's Day to the most Special woman of my life.");
        englist.add("Being a woman is a terribly difficult task, since it consists principally in dealing with men. – Joseph Conrad.");
        englist.add("As I watch the shooting star flash across the sky. I thank it once again for having you in my life! I love you sweetheart!");
        englist.add("A beautiful woman must expect to be more accountable for her steps, than one less attractive.");
        englist.add("What do the Chinese call a 69? Twocanchew");
        englist.add("When your single, you see all the happy couples, when your in a relationship, you see the happy single's");
        englist.add("This Women's Day just stand tall cos you are the most special woman of my life!");
        englist.add("People say I have a dirty mind… But I say its just creative!");
        englist.add("Hands are so overrated..I think I’ll use my mouth..");
        englist.add("Don't take too much time to text her back.. It makes her feel you're talking to someone more important than her.");
        englist.add("Never underestimate the power of a woman.");
        englist.add("Through the years, I have shared so much with you, both bitter and sweet. You have been such a comfort to me, helping me in every way, and all I wanna say today is: Sis, I treasure you close to my heart. Happy Women's Day!");
        englist.add("I guess if you spoke your mind, you’d be speechless, huh?");
        englist.add("For all the times you've brought a smile and made my days seem brighter. For sharing ups and downs with me and making my burdens lighter. For doing the caring things that make a special friend. Your friendship is a joy. I wish it never ends! Happy Women's Day!");
        englist.add("Sending u wishes to say you blossom up the world around me! Happy Women's Day!");
        englist.add("If you choose between two girls, always pick the second one; If you really loved the first one, you would have never thought of the second one.");
        englist.add("Age, like distance lends a double charm.");
        englist.add("a man is never careful until he buys a new car and a white shirt.");
        englist.add("When a girl cancels a date she cancels it because she has to...But when an boy cancels a date he cancels it because he has two.");
        englist.add("A woman has the last word in any argument. Anything a man says after that, is the beginning of a new argument.");
        englist.add("People say I have a dirty mind But I say its just creative");
        englist.add("I would love to see the 'pretty girls' in my school remove their make up.");
        englist.add("A man's biggest mistake is giving another man an opportunity to make his woman smile.");
        englist.add("This life has no existence without a strong ally in ‘Woman' in every stage of life starting from motherhood to wife, from sister and finally a daughter. Happy Women's Day!");
        englist.add("Women are like IPhones, you have to touch them all over before they respond. Men are like Blackberrys, rub one ball and everything moves!");
        englist.add("A wonderful person and a great friend. It's a blessing to have both of them in you! A very Happy Women's Day to you!");
        englist.add("Some idiots say: 'Behind every successful man, there is a woman. But nobody knows the fact. Fact: 'Women Go Only Behind Successful Men'.");
        englist.add("I’m a freelance gynecologist. How long has it been since your last checkup?");
        englist.add("Latest research: 'Boys Always remain faithful to girlfriend....!!!' But Which Girlfriend...? That is still a topic of research! :P");
        englist.add("Across the miles comes this wish from me to say you are Special! Happy Women's Day.");
        englist.add("An evil person is like a dirty window, they never let the light shine through.");
        englist.add("People say I got a dirty mind, I just think I’ve got a good imagination lol..");
        englist.add("Girls are like phones. they love to be held, talked too but if you press the wrong button you'll be disconnected!");
        englist.add("I universe, 8 planets, 192 countries, 189, 497 islands, 85 seas, 7 billion people & I'm still single. :p");
        englist.add("Is that your ex? No, that's the biggest mistake of my life.");
        englist.add("Wouldn't it be good if Ctrl+Alt+Del worked for ex girlfriend");
        englist.add("God created Man first,, but,, he wanted to create something better,,, Guess what He created woman! Happy Women's Day!");
        englist.add("Why's NASA never sent a woman to the Moon? Because it doesn't need cleaning yet.");
        englist.add("Guys, if she worries about you, she cares. But when she stops caring, that's when you should be worried.");
        englist.add("I’m listening to the voices in my head and I’ve come to realize that they are having more fun than me. I’m gonna go join them for a few drinks.");
        englist.add("I’m spread before I’m eaten. Your tongue gets me off. People sometimes like to lick my nuts. What am I? “Peanut Butter”.");
        englist.add("You keep smiling like that and everyone is gonna wonder what you did last night..");
        englist.add("Women have strengths that amazes man.. She can handle trouble & carry heavy burdens.. She holds happiness, love & opinions.. And she will always smile when she feels like screaming.");
        englist.add("Whenever group of Women comes with oriented intention, the magic happens.");
        englist.add("I hate sitting in a seat warmed by someone else..");
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