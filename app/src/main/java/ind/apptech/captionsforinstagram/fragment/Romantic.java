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

public class Romantic extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Romantic() {
        // Required empty public constructor
    }

    public static Romantic newInstance(String param1, String param2) {
        Romantic fragment = new Romantic();
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

        englist.add("I wanted to climb over the mountain and get on with my life; but I never even made it to the top because I fell for you..");
        englist.add("Your eyes are the sweetest stars I've ever seen.");
        englist.add("There are a lot of people who call you by your name, but there is only one person who can make it sound so special.");
        englist.add("I wanna be the one your 'EX' will hate, your mom dad will love, and the one you'll never forget.");
        englist.add("I finally realized this, I need you more than I thought.");
        englist.add("I fall in love with you, I don't know why or how. I just did...");
        englist.add("YOU.. The first thing I thought of every morning, the last thing that stays on my mind every night.");
        englist.add("I'll always catch you when you think you are about to fall.");
        englist.add("A love without a kiss is like a rose with out petals. what s the point?");
        englist.add("I love my life because it gave me you I love you because you are my life");
        englist.add("I tried but I can't stop thinking about you.");
        englist.add("Someday somewhere somehow me & you will be together.");
        englist.add("Sometimes we make love with our eyes. Sometimes we make love with our hands. Sometimes we make love with our bodies. Always we make love with our hearts.");
        englist.add("One day you’ll kiss someone and know those are the lips you want to kiss for the rest of your life.");
        englist.add("The most beautiful clothes that can dress a woman are the arms of the man she loves.");
        englist.add("I get the best feeling in the world when you say hi or even smile at me b’coz I know, even if its just for a second, that I’ve crossed your mind.");
        englist.add("Love my life because it gave me you I love you because you are my life.");
        englist.add("There are only two times that I want to be with you.. Now and Forever. Best romantic love status");
        englist.add("Falling in love with you is the second best thing in the world. Finding you is the first.");
        englist.add("Missing someone is your heart's way of reminding you that you love them.");
        englist.add("I have had a very terrible day. But it always makes me feel better to see a gorgeous girl smile. Would you smile for me?");
        englist.add("The first time I saw you, my heart whispered: That's the one.");
        englist.add("Everyone says you only fall in love once, but that's not true. Every time I hear you voice I fall in Love all over again.");
        englist.add("I love you and you love me, then why can't we be together?");
        englist.add("Forever is not a word rather a place where two lovers go when true love takes them there.");
        englist.add("Sitting next to you doing nothing means absolutely everything to me.");
        englist.add("Life becomes romantic when eyes start looking at some one silently.");
        englist.add("When I first saw you, I fell in love with you and you smiled because you knew.");
        englist.add("I don’t want to lose this feeling. If I could choose a place to die, it would be in your arms.");
        englist.add("Sometimes its better to put LOVE into hugs than to put it into words.");
        englist.add("Distance is to love what wind is to fire; it extinguishes the small, it inflames the great.");
        englist.add("Kissing is like drinking salted water, you drink and your thirst increases.");
        englist.add("YOU …. The first thing I thought of every morning, the last thing that stays on my mind every night.");
        englist.add("I want to be in your arms, where you hold me tight and never let me go.");
        englist.add("If she is responsible for your smile, be responsible with her heart.");
        englist.add("Can you kiss me on the cheek so I can at least say a cute girl kissed me tonight?");
        englist.add("Kissing you is like dancing in the rain; it is an exciting kind of sensation that you can’t help but fall in love with.");
        englist.add("I want to hold your hands, look in your eyes and enjoy everything that you want to say to me.");
        englist.add("Sweetness is not sugar or honey but the kind of feeling that makes you call your lover sweetheart.");
        englist.add("Since you've been around I smile a lot more than I use to.");
        englist.add("Never let a fool kiss you or a kiss fool you.");
        englist.add("I wish I could tell you how I feel because every night before I sleep, you are all I think about.");
        englist.add("Happiness means you. I Love You <3");
        englist.add("Being single doesn`t mean you know nothing about love. Sometimes, its wiser to be alone than with the wrong person.");
        englist.add("If I know what love is, it is because of you.");
        englist.add("Today I caught myself smiling for no reason, then I realized I was thinking about you.");
        englist.add("Dear heart, please fall in love only when you're ready, not when you're lonely.");
        englist.add("I have ONE heart that is true. It has gone from me to you. Now please take its care because I have NO heart and you have TWO.");
        englist.add("Kiss, a contraction of the mouth due to an enlargement of the heart.");
        englist.add("I love you for who your from the inside. The lovely looking outside is just a bonus.");
        englist.add("I am a strong believer in kissing being very intimate, and the minute you kiss, the floodgates open for everything else.");
        englist.add("If I could be anything, l would be ur tear, so l could be born in ur eye, live down ur cheek and die on ur lips.");
        englist.add("Being someone's first love may be great but to be their last is beyond perfect.");
        englist.add("Spaces between your fingers are supposed to be filled with mine.");
        englist.add("Hold me tighter, Kiss me longer, Love me harder and I’ll be yours forever.");
        englist.add("Let me love you if not for the rest of your life then for the rest of mine.");
        englist.add("The only day that I will stop loving her, is when the earth stands still.");
        englist.add("Cloud dances because of wind; flower sings b’coz of rain; grass grows b’coz of earth; I live because of you; you are only the reason, you are all the reasons.");
        englist.add("Every night i think of you before bed with the hopes of having you in my dreams.");
        englist.add("My dream is to be your dream.");
        englist.add("A kiss without a hug is like a flower without the fragrance.");
        englist.add("I’ll always catch you when you think you are about to fall.");
        englist.add("You're my favorite song.");
        englist.add("It`s funny how a person who was once just a stranger suddenly mean the world to you.");
        englist.add("When someone talks about LOVE I think about YOU. ♥");
        englist.add("Your presence in my life brings smiles and loving throughts within my heart!");
        englist.add("Soul meets soul on lovers’ lips.");
        englist.add("You can never fully forget the ones who gave you butterflies.");
        englist.add("In the world there are billions of people, In my eyes I see only you");
        englist.add("Let me be the one you love for life. Let me stay with you, every day and every night.");
        englist.add("I crave a love so deep the ocean would be jealous.");
        englist.add("There must be something wrong with my eyes, I can`t take them off of you ;)");
        englist.add("My life started the day i met you, now when i look back i have no idea how i survived all this time without you. You are my life..");
        englist.add("Every love story is beautiful, but ours is my favorite.");
        englist.add("The essence of romantic love is that wonderful beginning, after which sadness and impossibility may become the rule.");
        englist.add("Excuse me, do you mind if I stare at you for a minute? I want to remember your face for my dreams.");
        englist.add("You can love me or hate me I swear it won't make me or break me");
        englist.add("A special smile, A special face. A special someone i cant replace. I luv U, I always will. U have filled a space no one can fill !!");
        englist.add("I didn’t have any body piercing until just now. You pierced my heart.");
        englist.add("Your taste still lingers on my lips, like I’ve just placed them upon yours, and I starve for you.");
        englist.add("I want to be with you until the sun falls from the sky.");
        englist.add("Some people says “Make love not war”. . why not get married and make both..");
        englist.add("I don’t need anything else… Your love is the greatest gift I could ever receive.");
        englist.add("There must be something wrong with my eyes, I can't take them off of youYour eyes are the sweetest stars I've ever seen.");
        englist.add("Thinking of you is easy, I do it every day. Missing you is the heartache that never goes away.");
        englist.add("Yes i am selfish because i will never share you with anyone.");
        englist.add("I dont know much about algebra but what i do know is you plus me equals forever.");
        englist.add("I love my eyes when you look into them I love my name when you say it I love my heart when you love it I love my life when you are in it.");
        englist.add("Listen to my little heart. It always says your name with every heartbeat.");
        englist.add("When I looked into your eyes I didnt see just you, I saw my today, my tomorrow and my future for the rest of my life..");
        englist.add("I was wondering if you had an extra heart mine seems to have been stolen.");
        englist.add("It's not the roses, but the wildflowers that are the key to a woman's heart.");
        englist.add("My love for you is like a mirror. You can break it into pieces but when you look closely, you’re still in it.");
        englist.add("I love it when I am just walking away form kissing you good-bye and we both turn around at the some time to get just one more.");
        englist.add("I love your smile and the way you make me smile.");
        englist.add("I want to be the girl you fall for when everybody else is falling for you.");
        englist.add("Go for someone who is not only proud to have you but will also take every risk just to be with you.");
        englist.add("Smile! It’s the second best thing you can do with your mouth. But I like the first one .");
        englist.add("I don’t wanna miss one smile, I don’t wanna miss one kiss. I just wanna stay here with you just like this.");
        englist.add("If distance is what I have to overcome to be with you, then give me a map. I am going to find you.");
        englist.add("One day i caught myself smiling for no reason... then i realized i was thinking of you ..");
        englist.add("When I dream, I dream of you. Maybe one day, dreams will come true. Because, I really love you.");
        englist.add("I can't place anyone above you but I can place myself above you, not to be a master but to be your shield and always protect you.");
        englist.add("Any man who can drive safely while kissing a pretty girl is simply not giving the kiss the attention it deserves.");
        englist.add("Don’t be with someone because it’s easy. Be with someone because you love them. Even if it’s difficult..");
        englist.add("I don’t love him… I just like to kiss him.");
        englist.add("I think the perfect hug is when someone hugs me without asking me.");
        englist.add("The few hours I spend with you are worth the thousand hours I spend without you.");
        englist.add("When I look at you, I cant deny there is a GOD. Bcoz only GOD could have created someone as wonderful and beautiful as you.");
        englist.add("I wasn’t kissing her, I was whispering in her mouth.");
        englist.add("I love you and you love me, then why can`t we be together?");
        englist.add("You changed my world with just one smile, you took my heart with just one kiss.");
        englist.add("A person who loves you truly will never let you go whatever the situation is.");
        englist.add("I smile like an idiot when I'm talking to you. Doesn't matter if it's a person or through text or anything else. I just smile because it's you.");
        englist.add("You have no idea how fast my heart beats when I see you,");
        englist.add("KISS …. The best way to shut a girl up.");
        englist.add("I’m not Shakespeare to write about you, I am not Piccaso to Paint you, I am just yours who wants to say “I am always with you”.");
        englist.add("I need you like the desert needs rain. Like the breathless need air, like the flowers need sunshine. I need you from the first chapter of my love story to the last.");
        englist.add("Can I borrow a quarter? I just want to call my mom and tell her I just met the girl of my dream.");
        englist.add("Everyone tells me I deserve better, but I dont want better. I want You.");
        englist.add("SEEING YOU is the favorite part of my day.");
        englist.add("Everyday I ask myself, how's it possible to love anyone as much as I love you? When I look in your eyes all my questions are answered.");
        englist.add("If you wake up one day and were asked to have a wish, what would it be? Mine would be that our love would last until you see an apple in an orange tree.");
        englist.add("The world is a scary place but somehow in your arms, it doesn't feel so bad.");
        englist.add("My heart beats your name because it’s your love that runs through my veins.");
        englist.add("I wish dreams were like wishes, and wishes came true, cause in my dreams I'm always with you.");
        englist.add("I'll love you until the day after forever.");
        englist.add("Young love is two hearts with only one thing in mind.");
        englist.add("I was sitting in my room today thinking of all the good things GOD has given me then I thought of you and smiled :)");
        englist.add("I don`t like you for your looks. But I fell in love with you because of your personality.");
        englist.add("I sent an angel to look over you at night. The angel came back a minute later. I asked it why. It told me Angels don’t watch other angels.");
        englist.add("Love is but the discovery of ourselves in others, and the delight of recognition.");
        englist.add("Age does not protect us from love, But love to some extent protects us from age.");
        englist.add("Sometimes you have to stop thinking so much and go where your heart takes you.");
        englist.add("Love is not a maybe thing. You know when you're in love.");
        englist.add("love my life because it gave me you I love you because you are my life");
        englist.add("I have tested all sweet dishes but they are not as sweet as my lover's lips.");
        englist.add("I tried but I can’t stop thinking about you.");
        englist.add("You have no idea how good it feels to wake up every morning knowing that you are mine and I’m yours.");
        englist.add("What is known in the heart doesn't always need to be uttered by Mouth.");
        englist.add("You are the reason why I smile, I love, I breath, I live.");
        englist.add("A kiss is a lovely trick designed by nature to stop speech when words become superfluous.");
        englist.add("I want to hold your hand, laugh at your jokes, walk by your side, snuggle on the couch, look into your eyes, talk about whatever and kiss your lips every single day.");
        englist.add("The secret of love is seeking variety in your life together, and never letting routine chords dull the melody of your romance.");
        englist.add("Kissing is a means of getting two people so close together that they can’t see anything wrong with each other.");
        englist.add("On the scale of 1 to 10: you are a 9 & I am the 1 you need.");
        englist.add("My head tells me that i don't love you, But my heart tells me you are a liar..");
        englist.add("I don't want to lose this feeling. If I could choose a place to die, it would be in your arms.");
        englist.add("I don't know much about algebra but what i do know is you plus me equals forever.");
        englist.add("A book without words is like love without a kiss …. its empty.");
        englist.add("When I'm sad don't look at me Just kiss me.");
        englist.add("Don’t promise me the moon or the stars. Just promise you’ll stay under them with me forever.");
        englist.add("Nothing makes me happier then seeing you smile at me..");
        englist.add("It takes a million people to complete the world, but it only takes one to complete mine.");
        englist.add("I universe, 8 planets, 204 countries, 804 islands, 7 seas, 7 billion people and my heart still tell me it’s only you.");
        englist.add("A cloak of leaves, a moonbeam ray.");
        englist.add("Life can give us lots' of beautiful persons, But only one person is enough for a beautiful life..");
        englist.add("I really hate my heart b’coz it lives inside me but beats only for you.");
        englist.add("I don’t wish to be everything to everyone, but I would like to be something to someone.");
        englist.add("Nothing is perfect, but when I'm with you everything is perfect.");
        englist.add("True romance isn't Romeo and Juliet who died together but grandma and grandpa who grew old together.");
        englist.add("Does it feel the same when she kisses you?");
        englist.add("A successful relationship requires falling in love many times, always with the same person.");
        englist.add("I am in favor of preserving the French habit of kissing the hands of ladies. After all, one must start somewhere.");
        englist.add("I can live without any friends, any family and any money but I can’t live without you.");
        englist.add("Last night I hugged my pillow and dreamt of you. I wish that someday I'd dream about my pillow and I'd be hugging you.");
        englist.add("Your lips look so lonely, would they like to meet mine?");
        englist.add("I don’t need to see the sun again, there is enough light in your eyes to light up all the world.");
        englist.add("Deep in the meadow, hidden far away.");
        englist.add("It takes millions people to make the world, but mine is completed with 1 and its you.");
        englist.add("Happiness is like a kiss. You must share it to enjoy it.");
        englist.add("My eyes literally turn to hearts when I see you.");
        englist.add("A random kiss is better than an awkwardly planed one.");
        englist.add("There`s a weird pleasure in loving someone who doesn`t love you.");
        englist.add("Making me happy doesn’t require a lot of efforts. Actually your presence is just enough.");
        englist.add("I made a list of special people in my life with pencil but when I reached your name, I used a pen b’coz I’m sure, I’ll never have to make any change.");
        englist.add("Within you I lose myself. Without you I find myself wanting to become lost again.");
        englist.add("A true romantic is one who romances one woman forever.");
        englist.add("you have my heart can I have yours..");
        englist.add("Loving you is like breathing. How can I stop it?");
        englist.add("I want you to be happy but i want to be the reason.");
        englist.add("I was not kissing him. I was just telling his lips a secret!");
        englist.add("I could conquer the world with just one hand as long as you were holding the other.");
        englist.add("True love is not the number of kisses or how often you get them, true love is the feeling that still lingers long after the kiss is over.");
        englist.add("Your smile is literally the cutest thing I've ever seen");
        englist.add("Kisses are like tears, the only real ones are the ones you can’t hold back.");
        englist.add("You know you are in love when you see the world in her eyes, and her eyes everywhere in the world.");
        englist.add("Please know that no matter what happens between us, I will always love you. You will always be my favourite, my number one.");
        englist.add("Hug me when I’m there, miss me when I’m not, kiss me every day, and love me for all eternity.");
        englist.add("Love distils desire upon the eyes, love brings bewitching grace into the heart.");
        englist.add("It’s not about butterflies in the first kiss, but that they are there in the last.");
        englist.add("I wanna be the last number you call late at night and the first one that you dial when you open your eyes.");
        englist.add("It’s the way that he makes you feel, it’s the way that he kisses you it’s the way that he makes you fall in love..");
        englist.add("My day could have been better if I had spent it with you.");
        englist.add("Love is not something you say and it happens. It is a feeling that is felt deep in the heart and I feel it for you");
        englist.add("When I tell you I love you I don’t say it out of habit or to start a conversation, I say it to remind you that you’re the best thing that ever happened to me.");
        englist.add("I fell worthy of every kiss I laid upon you for in each of them went part of my heart.");
        englist.add("It would be a waste of dream if you were not in it.");
        englist.add("We kiss and it feels like we have just shrugged off the world.");
        englist.add("Whatever our souls are made of, his and mine are the same.");
        englist.add("I dont know exactly what I was waiting for but when Im with you, It feel like everything I've been waiting for.");
        englist.add("They say that Disney World is the happiest place on earth but obviously they have never been in your arms.");
        englist.add("You look almost perfect, the only thing I can see that's wrong is your lips, they're not touching mine..");
        englist.add("I fall in love with you, I don't know why or how. I just did..");
        englist.add("When you truly love someone, you can never get bored of that person.");
        englist.add("I don't need to see the sun again, there is enough light in your eyes to light up all the world.");
        englist.add("Life becomes romantic when someone start looking silently but life becomes more romantic when somone start reading those eyes.");
        englist.add("The way you walk, way you talk, way you say my name; it’s beautiful, wonderful, don’t you ever change.");
        englist.add("The best relationship is when you two can act like lovers and best friends.");
        englist.add("I just wanna spend the rest of my life with you, believe it …");
        englist.add("People who throw kisses are mighty hopelessly lazy.");
        englist.add("Some love one, some love two. I love one .. that is you.");
        englist.add("Even though we are far apart you will always be in my little heart.");
        englist.add("I can never let me heart break if it beats for you. I can never let my smile fade if it smiles for you. I can never let my love end if its for YOU.");
        englist.add("Meeting you was fate, becoming your friend, was a choice, but falling in love with you was beyond my control.");
        englist.add("A smile does a good make up in a relationship, but a kiss does even better.");
        englist.add("True love comes once in a lifetime…open your eyes and your heart and see the miracle in front of you.");
        englist.add("Anyone can be passionate, but it takes real lovers to be silly.");
        englist.add("I don’t need a burning sun and a cooling moon to show me my way. Just want you to hold me whenever I tumble.");
        englist.add("I want my first kiss to be long but gentle, soft but glorious. Most of all want it to be with you.");
        englist.add("When I miss you, I don't have to go far. I just have to look inside my heart because that's where I'll find you.");
        englist.add("I want to be the reason why you fall asleep with your phone in your hand.");
        englist.add("Never say you are happy when you are sad. Never say you feel good when you feel bad. And never say you are alone when I’m still here.");
        englist.add("No matter what has happened. No matter what you've done. No matter what you will do. I will always love you. I swear it.");
        englist.add("Forget your woes and let your trouble lay.");
        englist.add("I know that I’m in love with you. Because I see the world in your eyes and your eyes everywhere in the world.");
        englist.add("If I could be anything I would be your tear, so I could be born in your eye, live down your cheek and die on your lips.");
        englist.add("As he kissed me, I wondered how, in the middle of a rainstorm I could feel like I was burning alive.");
        englist.add("Your the key to my soul.");
        englist.add("Someday when the pages of my life end, I know that you will be one of its most beautiful chapters.");
        englist.add("If I had my life to live over again, I would find you sooner so that I would love you longer.");
        englist.add("Falling in love with you is the second best thing in the world. Finding you is the first.Loving you is like breathing. How can I stop it?");
        englist.add("The most magical moments are those when you forget yourself in the job of someone's presence.");
        englist.add("I think it's cute when someone tells you straight up that they like you.");
        englist.add("The way I see you is like the way I see the stars, far but still beautiful.");
        englist.add("Someone asked me, How's life? I just smiled and replied, She's fine. :)");
        englist.add("I have seen only you, I have admired only you and I desire only you.");
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