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

public class Sweet extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Sweet() {
        // Required empty public constructor
    }

    public static Sweet newInstance(String param1, String param2) {
        Sweet fragment = new Sweet();
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

        englist.add("In a relationship, honesty and trust must exist. If they don't, there's no point of loving. So if you can't afford to be honest, stay single.");
        englist.add("Everyone tells me I deserve better, but I dont want better. I want you.");
        englist.add("There's only one thing I want to change about you.. Your Last Name.");
        englist.add("You know you're in love when you see the world in her eyes and her eyes everywhere in the world.");
        englist.add("We loved with a love that was more than love.");
        englist.add("Life will give you exactly what you need, not what you want.");
        englist.add("you are the first and last thing on my mind each and every day.");
        englist.add("I fell in love with you, I don't know why or how. I just did.");
        englist.add("Tried to lose weight. But it keeps finding me.");
        englist.add("You never stop loving someone. You either never did, or you always will.");
        englist.add("The main difference between a cat and a lie is that a cat only has nine lives.");
        englist.add("Words don’t have the power to hurt you. Unless the person who said them means a lot to you.");
        englist.add("I am selfish because I will never share you with anyone else.");
        englist.add("I love you for who you are from the inside. The lovely looking outside is just a bonus.");
        englist.add("I myself am made entirely of flaws, stitched together with good intentions. Secret of life is to be honestly who you are, not being a passenger in YOUR life.");
        englist.add("i need you, and you need me, That's the way it's supposed to be.");
        englist.add("Yeah you, the one reading my status, get lost.");
        englist.add("Trials come into our lives when God is trying to teach us, lead us or correct us.");
        englist.add("Laughter is the closest distance between two people.");
        englist.add("If you want to live a happy life, tie it to a goal, not to people or things.");
        englist.add("Its hard to find a friend thats 96% funky 98% sexy and 100% sweet. SO don’t lose me!");
        englist.add("If someone throws a stone at you, throw a flower at them. But remember to throw the flower pot with it.");
        englist.add("Let's flip a coin: 'Head' your mine - 'Tail' Im yours.");
        englist.add("The best relationship is when you two can act like lovers and best friends.");
        englist.add("Once in a while, night in the middle of an ordinary life, love gives us a fairy tale.");
        englist.add("I love my life because it's you.");
        englist.add("Let’s flip a coin: “Head” your mine – “Tail” Im yours.");
        englist.add("Thinking of you is easy, I do it every day. Missing you is the heartache that never goes away.");
        englist.add("Yesterday is history. Tomorrow is a mystery. Today is a gift. Thats why its called the present.");
        englist.add("I wish I could record my dreams and watch them later.");
        englist.add("Knowledge cannot replace friendship. I'd rather be an idiot than lose you.");
        englist.add("The roots of education are bitter, but the fruit is sweet.");
        englist.add("Make sure your words are sweet in case you need to eat them someday..");
        englist.add("That’s so sweet when couples act like bestfriends and bestfriends act like couples.");
        englist.add("You are too lovely to be so lonely.");
        englist.add("I wish i could move on as easy as you, But unlike you my feelings were true.");
        englist.add("Sometimes, the people you think don't want to talk to you are the ones waiting for you to talk to them.");
        englist.add("One day I caught myself smiling for no reason, then I realised I was thinking of you.");
        englist.add("I am not shy, I am holding back my awesomeness, so I don't intimidate you.");
        englist.add("Hey I found your nose, it was in my business again.");
        englist.add("Forever is a long time, But, I wouldn't mind spending it by your side.");
        englist.add("All I want is to sleep and wake up next to you.");
        englist.add("We don't fall in love, we grow in love. Everything that falls gets broken and everything that grows get stronger.");
        englist.add("Beautiful lies in face not in mind.");
        englist.add("Learn from the mistakes of others. You can’t live long enough to make them all yourself.");
        englist.add("Stop checking my status, go get a life.");
        englist.add("Even though you are far away… I think about you every day… And for now I send you hugs & smiles across the miles.");
        englist.add("The sweetest place is to be in someones thoughts and the safest place is to be in someones heart.");
        englist.add("Life is like a camera. Focus only on what is important and you will capture it perfectly.");
        englist.add("Since you have been around I smile a lot more than I use to.");
        englist.add("Don't treat people as bad as they are, treat them as good as you are.");
        englist.add("Never let something go, that you’ve worked so hard to get.");
        englist.add("People say nothing's impossible, but I do nothing every day.");
        englist.add("True Love is not based on romance, candle light dinner and walk alone beach. Infect, it's based on care, compromise, respect and trust.");
        englist.add("Forgiveness is the Sweetest Revenge.");
        englist.add("If you treat someone like a celebrity then you`ll only be treated like a fan.");
        englist.add("The happiest I've ever felt was that moment I discovered you loved me too.");
        englist.add("If you don't like something, change it. If you can't change it, change your attitude.");
        englist.add("Are you a dictionary because you add meaning in my life.");
        englist.add("I’ll admit I never was the perfect one. I was not always there. I didn’t make you smile at all times but there is one thing I’ll admit I did… I was the best person I could be for you.");
        englist.add("Don’t lose hope. When the sun goes down, the stars come out.");
        englist.add("If I had my way, you would be here right beside me..");
        englist.add("There’s only one thing I want to change about you …. Your Last Name :)");
        englist.add("I will always try my best for you sweet heart.");
        englist.add("Every time you text me my cheeks hurt! I guess I smile too big.");
        englist.add("I dint change, I just grew up. You should try it once.");
        englist.add("Life is too short. Don't waste it removing pen drive safely.");
        englist.add("A true friend can make you laugh until you pee, a best friend will continue laughing at you until she does too.");
        englist.add("I am not special, I am just limited edition.");
        englist.add("I don't have a bad handwriting, I have my own font.");
        englist.add("Every day may not be good… but there’s something good in every day.");
        englist.add("I am nobody, nobody is perfect, and therefore I am perfect.");
        englist.add("Cute lady need cute boy and I'm here for the same.");
        englist.add("Some may call it destiny and some may call it meant to be. But I just call it you and me.");
        englist.add("They say best friends are hard to find: well that’s cause the best ones are already mine..");
        englist.add("Keep your feet on the ground, when your head's in the clouds.");
        englist.add("I think our love can do anything we want it to.");
        englist.add("I want to today and tomorrow, and next week and for the rest of my life.");
        englist.add("You have no idea how fast my heart beats when I see you.");
        englist.add("Say it's true. There's nothing like me and you.");
        englist.add("It doesn’t matter if the guy is perfect or the girl is perfect, as long as they are perfect for each other.");
        englist.add("Caring for someone is easy, but to make someone care for you is difficult, So never lose the one who really cares for you..");
        englist.add("It is the good girls who keep diaries, the bad girls never have the time.");
        englist.add("Coins always make sound but the currency notes are always silent. That is why I am always calm and quiet.");
        englist.add("Being deeply loved by someone gives you strength. While loving someone deeply gives you courage.");
        englist.add("When the past calls, let it go to voice mail, it`s got nothing new to say.");
        englist.add("People with attitude are rich by pocket but weak by heart.");
        englist.add("Love is not a maybe thing. You know when you're in love.");
        englist.add("Lord give me patience because if you give me strength I may beat someone to death.");
        englist.add("If you think i look good.. Just IMAGINE how I TASTE.");
        englist.add("Promise me you'll always remember: You're braver than you believe, and stronger than you seem, and smarter than you think.");
        englist.add("Your smile is the key to my heart.");
        englist.add("Say it before you run out of time. Say it before it is too late. Say what you are feeling. Waiting is a mistake.");
        englist.add("My attitude depends on the people in front of me.");
        englist.add("Excuse me, do you have the time? Woman: No. Man: Well I have the time and it says I have time for you all the time.");
        englist.add("My heart told me it's definitely you!!!");
        englist.add("Always remember a person who talks to you about others, will also talk to others about you.");
        englist.add("Every morning would be perfect if I woke up next to you.");
        englist.add("Heaven is a place on Earth when you are around.");
        englist.add("Be a girl with a mind, a bitch with an attitude, and a lady with class.");
        englist.add("The Greatest thing in life is finding someone who knows all of your mistakes and weaknesses and still finds you completely amazing and will never walk away.");
        englist.add("Somewhere theres someone who dreams of your smile.");
        englist.add("Everything is excellent in Love and War.");
        englist.add("Love is like a baby, it needs to be treated gently.");
        englist.add("It’s easy to forget things you want to remember. Its hard to forget things you don’t want to remember.");
        englist.add("Parents spend the first part of our lives teaching us to walk and talk, and the rest of it telling us to sit down and shut up.");
        englist.add("They ask me what I see in you and I smile, look down and say nothing b'coz I don't want them to fall in love with you too.");
        englist.add("A wise girl kisses but doesn't love, listens but doesn't believe, and leaves before she is left.");
        englist.add("Love is a painful game, your heart will get broken, stomped, crushed and shattered before you find the one person that can put it all back together again.");
        englist.add("You don’t have to be great to start, but you have to start to be great.");
        englist.add("I can't fix all your problems but I can promise you won't have to face them all alone.");
        englist.add("without you. I am nothing with you. I am something. Together, we are everything.");
        englist.add("Love is when you look into someone's eyes and see everything you need.");
        englist.add("It's better to be wanted for murder that not to be wanted at all.");
        englist.add("Love is like a rubber band you need to hold it from both the sides by two people. When one leaves it hurts.");
        englist.add("Beauty isn’t all about having a pretty face. It’s about having a pretty mind, a pretty heart, and a pretty soul..");
        englist.add("Attitude is like underwear don't show it just wore it.");
        englist.add("Don't date the most beautiful girl in the world, date the girl who makes your world the most beautiful.");
        englist.add("Beauty might bring happiness, but happiness always brings beauty.");
        englist.add("I am sorry my fault. I forgot you are an idiot.");
        englist.add("Never trust your heart because it is on the right side.");
        englist.add("We never really grow up, we only learn how to act in public.");
        englist.add("When someone touches my phone I automatically turn into a ninja.");
        englist.add("I'll admit I never was the perfect one. I was not always there. I didn't make you smile at all times but there is one thing I'll admit I did.. I was the best person I could be for you.");
        englist.add("I just saved a bunch of money on my car insurance by selling my car.");
        englist.add("Never be dependent to anyone in this world because even your own shadow leaves you when you’re in darkness..");
        englist.add("Truth is, i miss you. i miss the way you held me, the way you told me you kissed me, i miss it all.");
        englist.add("I will marry the girls who look as pretty as in her Aadhaar card.");
        englist.add("When I am with you, hours feel like seconds. But when we are apart, days seem like years.");
        englist.add("A successful relationship requires falling in love many times, always with the same person.");
        englist.add("My last seen at was just to check your last seen at.");
        englist.add("The best feeling is hearing someone else's heartbeat and knowing it's beating that way because of you.");
        englist.add("I promise you no one will ever love you like I do.");
        englist.add("The biggest slap to your enemies is your success.");
        englist.add("If you live life with regrets of yesterday, you will have no today to be thankful for.");
        englist.add("Hurt me with the truth but, please never comfort me with a lie.");
        englist.add("Lotus, Tulip, Jasmin, Lilly All flowers are sweet but they have no comparison with YOU.");
        englist.add("I wish I had Google in my mind and antivirus in my heart.");
        englist.add("Smile in front of people who hate you. Your happiness kills them.");
        englist.add("Being someone's first love may be great but to be their last is beyond perfect.");
        englist.add("When I'm good I'm best, when I'm bad I'm worst.");
        englist.add("I love you not because of who you are, but because of who I am when I am with you.");
        englist.add("I'm sorry did I give you would impression that I give a damn about you?");
        englist.add("Treat people nicely even if they don`t return the favor. Thats being nice.");
        englist.add("Falling in love is only half of I want, staying in love with you for till forever is the other.");
        englist.add("Wouldn't it be the perfect crime it i stole your heart, and you stole mine?");
        englist.add("Let me love you if not for the rest of your life then for the rest of mine.");
        englist.add("I hate when people look at my phone while I'm typing. It is not that I have something to hide, it is just none of their damn business.");
        englist.add("I am single because God is busy writing the best love story for me.");
        englist.add("I WISH i could be a status, so you could LIKE me .");
        englist.add("You know someone means a lot to you when their mood can easily affect yours.");
        englist.add("Love is a gift from god and I have accepted this gift with open arms. I love you very much and promise never to leave you.");
        englist.add("Sometimes a cute smile hides a huge pain that only God knows about…");
        englist.add("I am explosive, you are the bomb. With our awesomeness, together we are an atomic bomb.");
        englist.add("If I got paid of caring you. I`d be a billionaire.");
        englist.add("Relationships are like fat people, most of them don't work out.");
        englist.add("you can never change the past nor control the future,but u can change the mood of the day by touching someones heart with your smile.");
        englist.add("‎”A friend is like a rainbow. They brighten your life when you`ve been through a storm.”");
        englist.add("One thing is for sure, Love keeps us going when everything stops moving.");
        englist.add("Every day is a start of something beautiful.");
        englist.add("Never take a shortcut in life, take the long route because you pick up more experiences on the way.");
        englist.add("True love is like a pair of socks. You need to have two and they need to match.");
        englist.add("Life is full of fake people. Before you decide to judge them, make sure you`re not one of them.");
        englist.add("Don't marry someone you can live with. Marry the person who cannot live without.");
        englist.add("The best way to be happy with someone is to learn to be happy alone. that way the company will be a matter of choice and not necessity.");
        englist.add("Excuse me. I found something under my shoes oh it's your attitude.");
        englist.add("Great personality will always make you more attractive than someone who only has a great face.");
        englist.add("Sincere people, sometimes, may not be in a position to pull you up. But, they always think of ways, not to let you fall.");
        englist.add("God is really creative, I mean, just look at me.");
        englist.add("The best feeling in the world is knowing your presence and absence both mean something to someone.");
        englist.add("So many ways to say “I love you”, but not enough words in the world to say how much.");
        englist.add("Going to McDonald’s to get a salad is like going to a brothel for a hug.");
        englist.add("Sometimes you forgive people simply because you still want them in your life.");
        englist.add("I never get jealous when I see my ex with someone else, because my parents always taught me to give my used toys to the less fortunate.");
        englist.add("You can’t have a relationship without any fights but you can make your relationship worth the fight.");
        englist.add("Every time I tell myself I’m over you, you give me that look, and when I look into your eyes I remember everything it used to be.");
        englist.add("Everything that kills me makes me feel alive.");
        englist.add("People say me wrong. Trust me I am the worst.");
        englist.add("Time is all we have, we can not fast forward it, we can not rewind it, all we can do is live in the time of now..");
        englist.add("Walking with a friend in the dark is better than walking alone in the light.");
        englist.add("I don't care or think about the people in my past, there's some reason why they don't make it to my future.");
        englist.add("The real art of conversation is not only to say the right thing at the right time, but also to leave unsaid the wrong thing at the tempting moment.");
        englist.add("Let's walk together.. Be together.. Stay together and Grow old together.");
        englist.add("Nothing is fine, but when I'm with you everything is fine.");
        englist.add("All the things that hurt you, actually teach you.");
        englist.add("If I had to choose between loving you and breathing. I would use my last breath to say I love you.");
        englist.add("In the middle of life, love enters and make it a fairy tale.");
        englist.add("You taught me how to love but not how to stop.");
        englist.add("I am going to make the rest of my life, the best of my life.");
        englist.add("Everyone Deserves A Chance To Clean UP Their Mistakes.");
        englist.add("I am not saying I am the best. I only know that I am doing my best to be the best.");
        englist.add("When I'm sad don't look at me, just kiss me.");
        englist.add("A true man does not need to romance a different girl every night, a true man romances the same girl for the rest of her life.");
        englist.add("Happiness keeps you sweet, trials keep you strong, sorrows keep you human, failures keep you humble, success keeps you glowin, friends and family keep you goin..");
        englist.add("Live to love and love to live.");
        englist.add("My attitude is my born gift and nobody take from me.");
        englist.add("Wonders if he can rewind the last few weeks and watch it over, and maybe this time figure out what the hell went wrong!");
        englist.add("The world's happiest couple never has the same character. They just have the best understanding of their difference.");
        englist.add("From A to Z all that really matters is I and U.");
        englist.add("A life without love is like a year without summer.");
        englist.add("I’m not thin, pretty, rich, or talented. I am honest, generous, loyal, and loving. Pass me by for what I’m not, and you’ll miss out on what I am: AMAZING!");
        englist.add("“No one can change a person, but someone can be a person`s reason to change”");
        englist.add("Never do anything yourself that others can do for you.");
        englist.add("I dont want to be your whole life — Just your favorite part.");
        englist.add("I’m really the type of person you should appreciate.");
        englist.add("We do not smile because something good has happened, rather something good happens b’coz we smile.");
        englist.add("The Best FEELING Ever: Is when you have someone who cares ONLY about you.");
        englist.add("To be perfectly honest I don’t really give a damn what my status says. I’m just so glad your wasting your time reading it.");
        englist.add("Don’t treat people as bad as they are, treat them as good as you are.");
        englist.add("Where there is love there is life.");
        englist.add("Its not what you learn in school its what you learn in life that counts.");
        englist.add("When you think there is nothing left in your life, just keep working hard until you die.");
        englist.add("Falling in love with you is the second-best thing in the world. Finding you is the first.");
        englist.add("I am not lazy, I am on energy saving mode.");
        englist.add("The greatest achievement in my life thus far has been to love you and be loved by you.");
        englist.add("I smile like a fool when I am talking to you. Doesn't matter if it's in person or through text or anything else. I just smile because it's you.");
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