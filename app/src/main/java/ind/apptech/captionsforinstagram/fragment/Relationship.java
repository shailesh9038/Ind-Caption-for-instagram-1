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

public class Relationship extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Relationship() {
        // Required empty public constructor
    }

    public static Relationship newInstance(String param1, String param2) {
        Relationship fragment = new Relationship();
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

        englist.add("A beautiful relationship does not depend on how well we understand someone, but it depends on how well we avoid the misunderstanding.");
        englist.add("I wonder, what I could Do or say to make him like me. I wonder, what or who I need to be, to be his. I wonder, when just being me will be enough.");
        englist.add("I don't know which is worse, keeping your love for someone a secret or telling them and risk being rejected.");
        englist.add("Before I met you I never knew what it was like to look at someone and smile for no reason.");
        englist.add("Perfect Relationship = Two people never giving up on each other.");
        englist.add("She loves him more then he would ever know, he love's her more than he would ever show.");
        englist.add("I've convinced everyone else that I don't like you and that I don't love you anymore. Now all I need to do is convince myself.");
        englist.add("Don't be mad because I don't give a f*ck, be mad because I once did and you were too blind to see.");
        englist.add("Relations are like electric currents. Wrong connection will give you shocks but the right ones light up your life.");
        englist.add("Don't let someone get in between your relationship. It's based on two hearts not three.");
        englist.add("Sometime you forgive people simply because you still want them in your life");
        englist.add("You can't just cling on to something because it's familiar.");
        englist.add("If you are torn between staying and going, maybe it's time to go. Because if you were meant to stay, then you would not be thinking of going.");
        englist.add("A strong relationship starts with two brave people who are ready to sacrifice anything for one another...");
        englist.add("Don't expect to find the right person if you aren't willing to let the wrong one go.");
        englist.add("I sit here and wonder if you'll ever understand just how much of me belongs to you.");
        englist.add("Sometimes I wonder what you think of me or if you do at all.");
        englist.add("Trust is the biggest form of human relationships, it might take a life time to earn and a second to loose.");
        englist.add("Sometimes I wish I had never met you because then I could go to sleep at night not knowing there was someone like you out there.");
        englist.add("Don't be in relationship if you are going to act single");
        englist.add("Relationships should have the determination on like SANDAL WOOD...which never loses its fragrance even if its broken into thousands pieces..!!");
        englist.add("A Perfecft Relationship Is when You Fight Like A Married Couple Talk Like Best Frnd");
        englist.add("The happiest Couples never have the Same Character but They have the best Understanding Of their Differences ...");
        englist.add("Sometimes you meet someone and before you know their name, before you know where they are from, you know that sometime in the future this person is going to mean something to you.");
        englist.add("Don't push your relationship with a person too hard, if its meant to be then it will happen.");
        englist.add("I wonder if you think of me half as much as I think about you.");
        englist.add("No one can accuse you of falling in love with the wrong person if inside you know he is the one.");
        englist.add("Sometimes it takes being away from someone for a while to realise how much you need them in your life.");
        englist.add("Relationships would be easier if people came with a CLEAR HISTORY button.");
        englist.add("It's so crazy, you walked into the room that day, just like every other day except this time my heart skipped a beat.");
        englist.add("Don't push it hard, if its meant to be, it'll happen.");
        englist.add("Sometimes there are things that are worth the chance, and when you find them, everything in the world doesn't matter.");
        englist.add("sometimes you forgive people just for the simple fact that you still want them to be in your life.");
        englist.add("The worst way to miss someone is when they are right beside you and yet you know you can never have them.");
        englist.add("A final FULL STOP is Much better than those Painful SEMI COLONS in a Relationship..!!");
        englist.add("Relationships are for honest people, if you're not honest, you don't belong in any relationship !!!");
        englist.add("Some relationships are undefined....");
        englist.add("Relationship Status: Your message was successfully sent... and ignored.");
        englist.add("I want our relationship to be like Tom and Jerry. No matter how many times we fight, we won't be apart.");
        englist.add("Any relationship is a blessing that comes without conditions or expectations. Whether forever or faor a season, God puts and removes people in your life for a reason....");
        englist.add("Why can't you just tell me how you feel, because how you act is confusing me. You walk by me like I'm no one, you smile at me like I'm anyone, you hug me like I'm someone... but kiss, the way you kiss me, its as if I'm the only one.");
        englist.add("I want a relationship where we talk like best friends, play like kids, argue like husband and wife, and protect each other like siblings.!!");
        englist.add("Rule #1 never tell a guy that you like them because then they will immediately stop liking you so DON'T DO IT!");
        englist.add("I can't just drift away from you, I can't get on with my life and not give you a second thought. When I kissed you that night, walking away stopped being an option.");
        englist.add("Never long for anyone from the past. There is a reason why they never made it to your future.");
        englist.add("Have you ever hated somebody so much that you wish they would just leave and never come back but yet, loved them so much, you knew you'd die if they did?");
        englist.add("That relation is the best one, in which Yesterday's fights do not stop Today's love.");
        englist.add("My gum lasts longer than new age Facebook relationships.");
        englist.add("Everyone's known someone that they just can't help but want.");
        englist.add("Learn to let go. If a relationship is over let it be over. No time outs and no second chances.");
        englist.add("How come you have enough time to go out and make other girls fall in love with you, but you don't have enough time to pay attention to the girl who already is.");
        englist.add("If I open up to you, then you're probably pretty damn special.");
        englist.add("You seem like a sweet person. Mind if I lick you to find out?");
        englist.add("Death is not the Biggest Loss in LIFE! The Biggest Loss is When Relationships Die Among us While We are Alive");
        englist.add("Once U Loose Someone,Its Never Exactly The Same Person Who Comes Back...");
        englist.add("I look at him as a friend, then I realized I loved him.");
        englist.add("Never Lose Yourself trying to Hold On to someone who doesn't care about Losing You.");
        englist.add("I used to think that if I loved you enough you would realize it and love me back, but I can only love so much for so long.");
        englist.add("I'd rather be your lover then your friend, but I'd rather be your friend then your nobody.");
        englist.add("I want a relationship where everyone is like: Damn, they're still together?");
        englist.add("Lets be lovers tonight, and go back to being best friends tomorrow.");
        englist.add("The purpose of relationship is not to have someone who makes u complete...!");
        englist.add("But to have someone with whom u can share your incompleteness.");
        englist.add("When Nails are Growing, We Cut our Nails, Not Fingers... similarly, When Ego Start Rising, we should cut Ego, Not Relations");
        englist.add("No relationship is perfect. You just have to know in your heart of hearts that the person you are with is truly worth fighting for no matter what.");
        englist.add("Any Great relationship is based on two important things. First is to find out the similarities, n second is to respect the differences.");
        englist.add("Relationship cycle: Strangers - Friends - Close Friends - Crush - Relationship - Heartbroken - Strangers.");
        englist.add("A relationship doesn't need any promises, terms or conditions, it just need to wonderful people One who can trust and One who can understand.");
        englist.add("Even a big pot full of water can be emptied by a small hole so a little anger or ego can burn up all the nobility of a good relation be good with everyone.");
        englist.add("Learn The Wisdom Of Compromise.");
        englist.add("It's Better To Bend A Little Rather Than To Break A relationship Forever!");
        englist.add("May be you will never know, May be I will never show.");
        englist.add("Third person never creates misunderstanding between two people, but misunderstanding between two people create space for third person!!!!");
        englist.add("I don't know which is worse, loving someone knowing its going to cause you pain or being in pain because you can't love someone.");
        englist.add("Even now after all this time, you called me and wanted me I'd say yes! It's about time what took you so damn long!");
        englist.add("I never knew it would be this hard to lose someone I never truly had.");
        englist.add("EVERY relationship is temporary u never know when u will die or some one leaves u without a reason");
        englist.add("Maybe they are right. Maybe I did get my hopes up too high. Maybe I was in over my head. Maybe I am the stupid one for ever thinking that you loved me, but maybe, just maybe, I am tired of being alone.");
        englist.add("It's hard not to love someone when he's all you ever think about.");
        englist.add("The man of your dreams could be standing right in front of you.");
        englist.add("Three rules in a relationship... Don't lie, don't cheat and don't make promised you can't keep..");
        englist.add("It's about being with that person that makes you happy in a way no one else can!");
        englist.add("People say whats the point in liking someone who doesn't like you back. They are right, there isn't a point. But you can't help who you like, it's not up to you. Your heart kinda just decides for you and there is no turning back once your heart makes up its mind.");
        englist.add("Who better to share your dreams with than the person you dream about?");
        englist.add("I love him but I cannot show it, want him but he cannot know it, need him but I know it'll never be, if only he needed me.");
        englist.add("This could be so much more. So much more than a casual kiss, and a quick caress beneath the sheets. This really could be the beginning of something, something that's takes us both somewhere, that translates both of us. Changes us. And we can only do it together.");
        englist.add("Why is it that no matter how many times I remind myself that we can't be together, I still won't let myself fall for anyone else?");
        englist.add("Sometimes we expect more from others because we would be willing to do that much for them.");
        englist.add("Starting A relationship is easy but the part where everyone stumbles Is sustaining it.");
        englist.add("We'll do what we gotta do, see what we gotta see, and if in the end we end up together, then we'll know it was meant to be.");
        englist.add("For someone who is suppose to be just friends why do I always get butterflies in my stomach when you smile at me.");
        englist.add("No matter how Crazy and Funny the Scenes are around You, They are Useless without the Person You want to Laugh with .. !!");
        englist.add("The difference between friendship and love is how much you can hurt each other.");
        englist.add("Why is it always as soon as I start to like you, you like another girl and when I stop liking you, you like me.");
        englist.add("Don't screw up the best thing that ever happened to you just because you're a little unsure about who you are.");
        englist.add("If you love something, set it free if it comes back, it was meant to be. If it continues to fly, let it soar, have faith that God has something better in store.");
        englist.add("Hurting someone with the truth is better than killing them with a lie.");
        englist.add("Isn't it funny how you can still get butterflies in your stomach, even though you have known the person for years.");
        englist.add("Communication is the lifeline of any relation. when you stop communicating");
        englist.add("Cuddling in bed and falling asleep together is probably the best feeling in a relationship!!!");
        englist.add("If you want a long term relationship. Follow the simple rule Never Lie...");
        englist.add("Relationships are like a Book. It takes years to write but second to burn.");
        englist.add("The most important things are the hardest things to say. They are the things you get ashamed of because words diminish your feelings - words shrink things that seem timeless when they are in your head to no more than living size when they are brought out.");
        englist.add("Flirtationship: More than a friendship and less than a relationship.");
        englist.add("The most ironic thing of all is, I think this will be the most difficult breakup I ever go through, and we never even went out.");
        englist.add("I wish you could hear all the words I'm too afraid to say.");
        englist.add("I am perfectly happy being his friend, in fact I love it... I just have this incredible urge to kiss him, that doesn't go away... and this feeling that we would be perfect together.");
        englist.add("Relations are not exams so y cheat :(");
        englist.add("I've learned that guys can make the best of friends... my best friend is a guy, and I can tell him anything and everything... oh except the fact that I'm absolutely crazy about him... that part always seems to stay out of our conversations.");
        englist.add("It amazes me how people can fake whole relationships. I can't even fake a hello to someone I don't like.");
        englist.add("You can say I don't matter to you but I'm not the one calling every night, that's you.");
        englist.add("I'm glad you're happy. I can't say that I'm completely happy for you but I guess that's just a part of life, I'll always have feelings for you but the rest of the world is forcing me to move on.");
        englist.add("We are afraid to care to much, for fear that the other person does not care at all.");
        englist.add("I never found the words to say, you're the one I think about each day.");
        englist.add("I want to be the girl who makes your bad days better, and the one that makes you say my life has changed since I met her");
        englist.add("Relationships are made BY Heart NOT by force.");
        englist.add("It's just hard to think I'll never get the chance to say you're mine.");
        englist.add("Being in a relationship isn't about the kissing.. the dates.. or the showing off.");
        englist.add("EGO is the only thing that needs no reason to destroy relationships... so skip the E and let it GO...!");
        englist.add("Perfect relationship is not that you never get angry, upset or irritated with each other, Its how fast you resolve and bounce back to normal");
        englist.add("Relationship never dies a natural death... They are murdered by ego, Attitude and ignorance..");
        englist.add("I just wonder how many people never get the one they want, but end up with the one they're supposed to have.");
        englist.add("Sometimes people don't change, their priorities do and you just stop being as important.");
        englist.add("The true measure of compatibility is not the years spent together... but how good you are for each other.");
        englist.add("You don't just stop feeling something for someone because you start feeling something for someone else.");
        englist.add("When he's around, my whole body knows it. I'll keep talking and stuff, but my mind will have no idea what I'm saying, I keep wondering if there's a term for this.");
        englist.add("I play the same song, over and over cause it reminds me of you.");
        englist.add("Sometimes people decide to be just friends, even if their feeling is mutual.");
        englist.add("Maybe I'm so caught up in getting over him I don't notice the perfect person that is sitting right in front of me... actually I'm starting to think he is standing up and doing a dance.");
        englist.add("I want a cute, long relationship where everyone is like damn, they're still together?");
        englist.add("Sometimes the one love you can't get over is the one love you never really had.");
        englist.add("Most relationships fail because we spend too much time pointing out each others mistakes and don't spend enough time enjoying each others company....");
        englist.add("Wheter it's a friendship or relationship, all bonds are built on trust without it, you have nothing..");
        englist.add("If I was pretty would you love me? If I was perfect would you want me? If I loved you would you leave me?");
        englist.add("Do I really love him or am I addicted to the pain of wanting something I can't have.");
        englist.add("Maybe tomorrow, when you are done with your anger and I am done with mine, we can smile at each other and remember just how much we mean to each other.");
        englist.add("Usually, when any guy looks me in the eyes... I have to look away after about 3 seconds, but with him... I struggle to take my eyes off of him.");
        englist.add("Me? I'm scared of everything. I'm scared of what I feel, of what I've said, of who I am, but most of all I'm scared of walking out of this room and never feeling the rest of my life the way I feel when I'm with you.");
        englist.add("Sometimes you wish for something. You want it so badly, but you want even more for it to be perfect like you imagined it. And sometimes, you get it, and it's everything you thought it would be.");
        englist.add("I believe that you and me, we could be so happy and free in a world of misery.");
        englist.add("Sometimes we go out of our way to make someone love us in return, but suddenly fate intervenes and says oops, wrong person.");
        englist.add("Best Relationship is.... When You Can Act Like Lovers And Best Friends At The Same Time.");
        englist.add("Never tell your friends all what goes on with your relationship. That should be between you and that person only.");
        englist.add("I've had a few crush's so I have a lot of these ones!");
        englist.add("I think it's weird when I love you, I think it's weird when I want you, when you don't even know I'm there!");
        englist.add("You know, one day you look at the person and you see something more than you did the night before. Like a switch has been flicked somewhere. And the person who was just a friend is suddenly the only person you can ever imagine yourself with.");
        englist.add("Make a relation with someone, who is not only proud to have you; but will take every risk just to be with you .");
        englist.add("It's not telling you how I feel that scares me it's what you'll say back.");
        englist.add("If you are in a relationship. Flirting is CHEATING.");
        englist.add("I may hate myself in the morning But I'm gonna love you tonight.");
        englist.add("It is tearing me up on the inside to have these feelings for you, but I can't get rid of them.");
        englist.add("People who respond to the emoticons are the ones who care for the relationship most.");
        englist.add("When you thought I was in love with him, you were so wrong, baby, I was loving you.");
        englist.add("Look into my eyes for one moment, and then you will realize how much you mean to me.");
        englist.add("I wonder how many times we forgive just because we don't want to lose someone. Even if they don't deserve forgiveness..:))");
        englist.add("The hardest part is being around him knowing you can't have him and he'll never want you.");
        englist.add("This is so different you're so different, finally I've realized what I deserve and it's not what I had before.");
        englist.add("You don't know what you mean to me, you don't have a clue, you can't tell by looking at me what I feel for you.");
        englist.add("After all this time you still have this amazing power to make me feel absolutely crazy each time I see you.");
        englist.add("People never know how special someone is until they leave, but maybe sometimes its important to leave, so they are given that chance to see how special that someone really is!");
        englist.add("you start losing your valuable relation...!!!");
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