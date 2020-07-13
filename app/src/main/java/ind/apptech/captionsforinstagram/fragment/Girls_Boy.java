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

public class Girls_Boy extends Fragment {

    RecyclerView rajputlist;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Girls_Boy() {
        // Required empty public constructor
    }

    public static Girls_Boy newInstance(String param1, String param2) {
        Girls_Boy fragment = new Girls_Boy();
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

        englist.add("When girls get jealous, it's normal. But, when boys get jealous, lucky the girl he loves.");
        englist.add("Girls, being beautiful doesn't make you nice. Being nice makes you beautiful!");
        englist.add("It’s a man’s job to respect women but its a woman’s job to give him something to respect.");
        englist.add("A boy never forgets the girl he couldn’t have. NEVER.");
        englist.add("Women are like stars, there are millions of them out there, but only one can make your dreams come true.");
        englist.add("Girls want a lot of things from one guy. Conversely, guys want one thing from a lot of girls.");
        englist.add("Every girl deserves to be treated like a princess.");
        englist.add("Boys are like songs: Some of them you like and listen to all the time, but there is that one you just can't get out of your head.");
        englist.add("Dear Boys I have sent you a Friend Request Not a Marriage Proposal so kindly stop over acting :p");
        englist.add("When guys get jealous, it's kinda cute. When girls get jealous, World War III is about to start.");
        englist.add("If she catches me staring, at least I will know she was looking back.");
        englist.add("Girls are like roads more the curves more the dangerous they are.");
        englist.add("A GIRL is the most beautiful part of Gods creation.");
        englist.add("Man made money, but Money made man Mad :)");
        englist.add("Girls are like phones. they love to be held, talked too but if you press the wrong button you'll be disconnected!");
        englist.add("Mine is- Never trust on girls coz they didn't care any boy");
        englist.add("Half you boys better pray your daughter never runs into a guy like you");
        englist.add("3 dreams of a man: To be as handsome as his mother thinks.To be as rich as his child believes.To have as many women as his wife suspects .");
        englist.add("A true lady doesn't demand, She thanks and true man doesn't promise, He commit's.");
        englist.add("5 Things A Girl Could Not Live Without: 1. Make-up 2. Cell phone 3. Her purse 4. The mall 5. Her best friends.");
        englist.add("Girls with the prettiest smiles, Always seem to tell the saddest stories.");
        englist.add("Guys have no idea how long something they said can stay in a girl's mind.");
        englist.add("Never Judge The Beauty Of A Girl By Her Profile Picture.. Judge It By The Photos She Is Tagged In! ;-)");
        englist.add("A girl doesn't need to tell you how she feels. Its written all over the way she behaves when you are around.");
        englist.add("Every girls dream is to find the perfect guy, eat without getting fat, and to have a best friend who’ll stay true to her!");
        englist.add("A man's biggest mistake is giving another man an opportunity to make his woman smile.");
        englist.add("Having Wife is a part of living But having Girlfriend along with Wife is a art of living.");
        englist.add("If you have to convince someone you are right for them, Then maybe they are not right for you.");
        englist.add("You will find a girl prettier than me, smarter than me, and funnier than me, but you will never find a girl just like me.");
        englist.add("I'm a girl Im allowed to change my mind every second.");
        englist.add("When a boyfriend brings his girlfriend flowers for no reason, there's a reason :)");
        englist.add("Words that spoiled many boys' life .... 'Dude she's looking at you.'");
        englist.add("Every girls dream is to find the perfect guy, eat without getting fat, and to have a best friend who'll stay true to her!");
        englist.add("I universe, 8 planets, 192 countries, 189, 497 islands, 85 seas, 7 billion people & I'm still single. :p");
        englist.add("Every girl wants to mean something to somebody. All it takes is a little text to show her she’s on your mind.");
        englist.add("I hate boys, most of them don't know how much one word can hurt a girl.");
        englist.add("Girls can survive without a boyfriend but they can’t survive without a best friend.");
        englist.add("Girls don't need make up to look pretty for a guy. Is it true?");
        englist.add("Don't worry if you're still single. God is looking at you right now saying, Im saving this girl for someone special.");
        englist.add("20 percent boys of the world have brains, rest have girlfriends.");
        englist.add("Dear Girls … Guys don’t get hints. You have to be straight forward.");
        englist.add("Dear girls, don't flatter yourself. i sent you a friend request, NOT a wedding proposal.");
        englist.add("Girls go from 'I hate boys, they are all the same' to Oh I love him he gonna be my husband' in a week and wonder why they always single.");
        englist.add("Young love is two hearts with only one thing in mind.");
        englist.add("Boys think of girls like books. If the cover does not catch their eyes, They won't bother to read whats inside.");
        englist.add("When a girl is quiet and does not talk a word that's when she needs you the most.");
        englist.add("A boy makes his girl jealous of other woman. A gentleman makes other women jealous of his girl.");
        englist.add("I am single, because i haven't found someone who deserves ME.");
        englist.add("Girls get 90+ in computer science but doesn’t know how to format. Boys get 40 marks but become professional hacker :)");
        englist.add("She can be your best friend, Worst enemy or a real sweetheart. It all depends on how you treat her.");
        englist.add("you'll never loose women by chasing money. But you'll loose money by chasing women.");
        englist.add("The secret of being a great man = having a great woman who supports you all the time!");
        englist.add("one day you'll realize...all the love that i gave to you...is now being given to someone else");
        englist.add("Men always want to be a woman's first love – women like to be a man's last romance.");
        englist.add("Touch her heart.. not her body. Steal her attention.. not her virginity. Make her smile.. don't waste her tears.");
        englist.add("Tell her she's beautiful, not HOT. she's a girl not a cup of tea.");
        englist.add("If you can make a girl laugh, you can make her do anything.");
        englist.add("Men are like roses, watch out for all of the pricks.");
        englist.add("You broke my heart into several pieces, Good! Now I can give it to several girls.");
        englist.add("Every sunrise gives me a new day to love you. Good morning sweet heart, have a wonderful day.");
        englist.add("A girl will not admit she's wrong because she believes her heart and her heart says she's right.");
        englist.add("If you make a boy laugh, he likes you. But if you can make him cry he loves you.");
        englist.add("A woman has only 2 problems. 1. Nothing to waer. 2. No room for all the clothes.");
        englist.add("Silence is a girls loudest cry. You know she's really hurt when she starts ignoring you.");
        englist.add("Good girls go to heaven, bad girls go everywhere.");
        englist.add("a man is never careful until he buys a new car and a white shirt.");
        englist.add("Dear boys, what is the point of giving a fake hope? Sincerely, Girls");
        englist.add("Fellas: The most precious gift you can give a girl is the gift of your time and attention.");
        englist.add("If you choose between two girls, always pick the second one; If you really loved the first one, you would have never thought of the second one.");
        englist.add("If a guy doesn't get jealous when you're with other guys, He doesn't honestly care about you.");
        englist.add("I Like to study …. arithmetic, NO …. world history, NO …. chemistry, NO …. GIRLS, YES!!!");
        englist.add("Boys are like busses, you wait for one for ages, then suddenly 3 come at the same time.");
        englist.add("Love is the whole history of a woman's life, it is but an episode in a man's.");
        englist.add("Most guys are players until that one special girl comes along that makes them lose their game.");
        englist.add("Okay boys, 'being honest' isn't an excuse to be a douche bag.");
        englist.add("This girl makes me crazy. Her lips are soft like a flower, her eyes are deep like sea. And when she smiles, happiness is unleashed all around.");
        englist.add("Women have an amazingly mysterious ability of communication. They listen half, understand quarter but can tell double.");
        englist.add("I'm his first and last. He is my one and only.");
        englist.add("He thinks he's a player, But he doesn't know she's the coach.");
        englist.add("I-L-O-V-E-Y-O-U has eight letters, but baby, so does B-U-L-L-S-H-I-T...");
        englist.add("Guys, if she worries about you, she cares. But when she stops caring, that's when you should be worried.");
        englist.add("Boys never realize how much one little thing can hurt a girl.");
        englist.add("Never go back to your EX. It's like reading the same book again and again when you know how the story ends.");
        englist.add("Every girl wants one guy to meet all her needs, while every guy wants all the girls to meet his one need.");
        englist.add("I've just moved you to the top of my 'To do list' ;)");
        englist.add("Girls work on their looks, not their minds, because they know boys are dumb, not blind.");
        englist.add("Some words of advice to men: Treat women the same way you would want your daughter to be treated.");
        englist.add("If a girl cries, there may be thousand reasons. But if a boy cries, there is only one reason: 'GIRL'");
        englist.add("Dear Santa, what I want for Christmas is... your list with names of bad girls.");
        englist.add("The way he looked at her was the way all girls want to be looked at.");
        englist.add("My girlfriend says that I treat her like a child, So I gave her a sticker for standing up for her self.");
        englist.add("Every girl deserves a guy who will say, I can't imagine my life without you.");
        englist.add("Latest research: 'Boys Always remain faithful to girlfriend....!!!' But Which Girlfriend...? That is still a topic of research! :P");
        englist.add("No girl want to be with a guy that can’t let other girls know he’s taken.");
        englist.add("A guy who likes you wants to be the only guy you talk to.");
        englist.add("I Like to study.. arithmetic, NO.. world history, NO.. chemistry, NO.. GIRLS, YES!");
        englist.add("Don't take too much time to text her back.. It makes her feel you're talking to someone more important than her.");
        englist.add("I wanna be the reason for the smile on your face and that one girl in your life who can never be replaced.");
        englist.add("When a girl cancels a date she cancels it because she has to...But when an boy cancels a date he cancels it because he has two.");
        englist.add("Girls are not toys.. You can't just drop them when you get boared.");
        englist.add("If two past lovers can remain friends, its either they are still in love, or never were.");
        englist.add("Too many teenagers are worried about love and finding it. This is the time to find yourself, who you really are and what you want to be.");
        englist.add("I'm a boy. I don't smoke, drink, or party every weekend. I don't sleep around or start drama to get attention. Yes, we still do exist.");
        englist.add("To ex boyfriend, No, I'm not jealous, I know what she's getting.");
        englist.add("Wait for the boy who will do anything to be your everything.");
        englist.add("When guys get jealous, it's actually kinda cute. When girls get jealous, World War III is about to start!");
        englist.add("Guys have no ideas how long something they said can stay in a girl's mind.");
        englist.add("Every problem comes with a solution. If it doesn’t have any solution, it’s a…………. woman :)");
        englist.add("Girls problem: They love the ones that hurt them. Boys problem: They hurt the ones they love.");
        englist.add("Every time you mistreat a woman, you give up the right to be treated like a man.");
        englist.add("Girls, the second you stop chasing him is the second he'll start chasing you.");
        englist.add("A real girl is not perfect and a perfect girl is not real.");
        englist.add("Want to surprise your girlfriend? Introduce her to your wife.");
        englist.add("Girls know how to fake smiles and guys know how to fake feelings.");
        englist.add("A boy will never forget the girl he couldn't have. A girl will never forget the boy she should have had.");
        englist.add("When a girl asks a guy to listen a song, its because the lyrics are all the words she's afraid to say.");
        englist.add("Dear Girls, remember catching a husband is an art, to hold him is a job.");
        englist.add("Okay future girlfriend, You can stop playing hide and seek now :-) Why a daughter loves her father more....Bcz She knows he is the only men who can never Hurt her.");
        englist.add("Don't cry over a guy, Let a guy cry over you. Bcz girls give and forgive but boys get and forget.");
        englist.add("Girls who have more guys as friends than girls, go through less depression and anxiety.");
        englist.add("Girls are funny creatures. They hate it when you ask their age, but will kill you if you forget their birthday's :-)");
        englist.add("Girl: I have changed my mind. Boy: Thank God! Does the new one work?");
        englist.add("Today I came across a book that said: 'All the things men know about woman', it was blank inside.");
        englist.add("Ladies: A REAL Man Won't Send You Mixed Signals... Cause a Real Man Knows What He Wants..");
        englist.add("A man in love is incomplete until he is married. Then he's finished. :P");
        englist.add("Guys: When she's not yours, you'll do everything you can to get her. But when you do have her, you take everything for granted.");
        englist.add("A real man is a man that can overlook every other female because all his attention is already on one.");
        englist.add("My lips are the gun. My smile is the trigger. My kisses are the bullets. Label me a killer.");
        englist.add("Dear boys, I can make your girlfriend scream louder then you ever will. Sincerely, Spider.");
        englist.add("Good girls are bad girls that never get caught.");
        englist.add("Girls use photoshop to look beautiful.. Boys use photoshop to show their creativity.");
        englist.add("If a man expects his wife to be an angel in his life, Then he should first create a heaven for her.");
        englist.add("Boys are just like bubble gum: Sweet in the beginning but dull at the end.");
        englist.add("Women worry about the things that men forget. Men worry about the things that women remember.");
        englist.add("It's funny how girls RUN from the guy who try to make them happy, and FIGHT for the ones that make them cry.");
        englist.add("Girls biggest lie: I'm OK.");
        englist.add("it's Very easy to sacrifice for a girl , but it's difficult to find a girl deserve sacrificing");
        englist.add("When hugging her, lift her off her feet and spin around. she'll love it.");
        englist.add("Wouldn't it be good if Ctrl+Alt+Del worked for ex girlfriend");
        englist.add("I would love to see the 'pretty girls' in my school remove their make up.");
        englist.add("Nothing is s3xier than a girl who knows how to take control.");
        englist.add("Boys will be boys as long as there are no girls in the picture.");
        englist.add("Behind every great woman, there is a guy looking at her @ss :D");
        englist.add("A female can be your best friend, worst enemy, or your worst nightmare...It all depends on how you treat her!");
        englist.add("Hey Girls, I'm Mr. Right. Someone said you were looking for me? :p");
        englist.add("Every problem comes with a solution. If it doesn't have any solution, it's a.. Girl");
        englist.add("No matter how skinny, fat, ugly, or pretty. She’s a girl, and you have to respect that.");
        englist.add("Behind every untrusting girl, Is a boy who lied, cheated, Broke his promises to her.");
        englist.add("Talk to a man about himself and he will listen for hours.");
        englist.add("A real man treats his lady like a queen, and a real lady treats her man like a king.");
        englist.add("Women are meant to be loved, Not to be understood.");
        englist.add("When your single, you see all the happy couples, when your in a relationship, you see the happy single's");
        englist.add("Never underestimate the power of a woman.");
        englist.add("The problem with us girls is that we fall for boys who gives us the sweetest words they never really mean.");
        englist.add("Girls Are Like Police. Once They Get Hold Of All The Evidences, They Still Want To Hear The Truth From You.");
        englist.add("Treat her like a queen and she will treat you like a king. Treat her like a game and she will show you how it's played.");
        englist.add("I have had a really bad day and it always makes me feel better to see a pretty girl's smile. Would you smile for me today?");
        englist.add("Dear boyfriend, Your wallet was getting fat so I thought I`d take it out for some exercise. Sincerely, Girlfriend.");
        englist.add("When a girl is in LOVE, you can see it in her smile and when a boy is in LOVE, you can see it in his eyes.");
        englist.add("Boys, if you pay more attention to the words of every girl's favourite songs, you'll find out everything she's too afraid to say.");
        englist.add("Message to my ex: Roses are Red Violets are Blue So glad I finally realized I'm better off without you!");
        englist.add("Perfect boyfriend : Does not drink, does not smoke, does not cheat and also Does not exist :P");
        englist.add("If you treat her the same way you treat others, How is she supposed to know that she is special to you?");
        englist.add("Women are like internet viruses they enter your life, scan your pocket, edit your mind, download their problems, delete your smile.");
        englist.add("Love is when you tell a guy you like his shirt, then he wears it everyday :)");
        englist.add("If a girl is shopping she's trendy, if boy is shopping he's wasting money.");
        englist.add("She likes him, He likes her. Everyone knows, Except them.");
        englist.add("Worlds Shortest Joke: 2 women were sitting quietly...");
        englist.add("I'm the type of girl that puts on her better smile, her better outfit, and better attitude and shows him what he left behind.");
        englist.add("Dear boys, Please surprise us and text us first? Love every girl.");
        englist.add("I Was Born Intelligent But Girlzz Ruined Me :)");
        englist.add("I hate boys who will continue to argue with a female. You will never win. Girls keep going until they get the last word, or piss you off.");
        englist.add("I'm not one in a million kind of girls. I'm once in a lifetime kind of woman.");
        englist.add("A smart girl knows how to love. A smarter one knows who to love.");
        englist.add("Respect her like your mother, protect her like your daughter & love her like your wife.");
        englist.add("Girl's eyes are faster than GOOGLE in searching handsome guy but girl's heart is slower than a turtle in forgetting a boy that she loved.");
        englist.add("Men hang out in bars for one of two reasons: Either they have no wife to go home to, or they do. :p");
        englist.add("I need no reason to love you, but I need thousands of reasons to leave you.");
        englist.add("Holding a girls hand in public is just another way of saying you are proud to have her.");
        englist.add("Some guys say that natural girls are best, yet when a pouty, fake comes along...they start drooling.");
        englist.add("The sweetest things you can do for a girl are the little things that let her know she's in your heart and on your mind.");
        englist.add("I hate boys who can't treat their girls right, disrespect their mom's, don't want a job and want to smoke to fit in.");
        englist.add("Why's NASA never sent a woman to the Moon? Because it doesn't need cleaning yet.");
        englist.add("That awkward moment when your parents ask if you like anyone.");
        englist.add("Love is when you fall asleep in his arms and wake up in his dreams.");
        englist.add("Dear guys,We love when you share your feelings, it doesn't make you any less of a man, it just makes you more adorable.");
        englist.add("Women fall in love to stay in love forever. They don’t dump men unless they are lied to or cheated upon.");
        englist.add("I hate boys who think they can get any girl.");
        englist.add("When a girl is silent, she's either over thinking, tired of waiting, falling apart, crying inside or all of the above.");
        englist.add("Were you in Boy Scouts? Because you sure have tied my heart in a knot.");
        englist.add("If you have a good boyfriend, Don't make him pay for the mistakes that other boys made.");
        englist.add("The problem of being a good guy.. Its that the bad ones get the girls.");
        englist.add("A smile is the most beautiful curve on a womans body.");
        englist.add("Im a girl. I overreact. I underestimate. I overestimate. I over think everything. I dream big. And when I say I love you, Im not lying!");
        englist.add("I'm a girl but I'd rather hang out with boys because it is less drama.");
        englist.add("When a person is really into you, he or she will always find a way to have time with you.. NO EXCUSES.");
        englist.add("Why girls are not in sports?? Only 4% are playing hockey, tennis and cricket.. Bcoz . . . Other 96% are busy in playing with boys :)");
        englist.add("Two dangerous weapons in this world! Girl's SMILE and her TEARS! These things make a man to do anything. Agree?");
        englist.add("Three words a boyfriend will never heard from his girlfriend - 'You Are Right'");
        englist.add("Never underestimate a girl's ability to find things out.");
        englist.add("Treat your girlfriend right, or someone else will.");
        englist.add("Girls are like internet domain names...... The ones I like are already taken.");
        englist.add("God made woman beautiful and foolish; beautiful, that man might love her and foolish, that she might love him.");
        englist.add("A woman brought you into this world. Therefore you have no right to disrespect one.");
        englist.add("If a boy wants you, nothing can keep him away. If he doesn't want you, nothing can make him stay.");
        englist.add("Best line which help you save money when going on restaurants with your girlfriend - So what's you gonna eat Fatty ??");
        englist.add("Only 2 phrases can change a woman’s mood: “I Love You” & “50% Off” :)");
        englist.add("Every girl is an angel. Don't waste time in selecting unique. Instead spend time in understanding them.");
        englist.add("Why do girls run away from people that make them happy and stay with the ones who don't.");
        englist.add("With women the heart argues, Not the mind.");
        englist.add("I was only a time pass in your life but one day you will realise that the time that you passed with me was the most beautiful time you have ever spend.");
        englist.add("Good girls go to Heaven, bad girls just make you FEEL like you're in Heaven.");
        englist.add("Is that your ex? No, that's the biggest mistake of my life.");
        englist.add("Don't be a woman that needs a man.. Be a woman a man needs.");
        englist.add("In every girl's heart there is a sea of secrets she wont ever let you swim in.");
        englist.add("Too many teenagers are worried about love and finding it. This is the time to find yourself, who you really are and what you want to be.Love is when you tell a guy you like his shirt, then he wears it everyday. :)");
        englist.add("A woman has the last word in any argument. Anything a man says after that, is the beginning of a new argument.");
        englist.add("If you made your girl say sorry, You did not win a fight you won a girl who really loves you.");
        englist.add("Make your girlfriend happy by telling those 3 words every girl loves to hear 'Here's my Wallet'");
        englist.add("Girls Theory Listen Half, Understand Quarter, Think Zero & React DOUBLE");
        englist.add("No matter how skinny, fat, ugly, or pretty. She's a girl, and you have to respect that.");
        englist.add("My Girlfriend says I need to be more affectionate.... Now I have 2 Girlfriends! :p");
        englist.add("Boys are great, Every girl should have one.");
        englist.add("Most guys want to be a girl's first. Smart guys want to be her last. Lucky guys get to be both.");
        englist.add("Guys: Wow, her status is dumb. But shes cute, so Im gonna like it. Girls have a bad habit of holding on too long but guys have a bad habit of letting go too easily.");
        englist.add("I am a girl who needs to stay strong no matter what happens:)");
        englist.add("I have learned that it is not what i have in my life but who I have in my life that counts. Good Morning and Have a good day.");
        englist.add("Girls get butterflies. Guys get boners. Girls play hard to get.. Guys play to get hard.");
        englist.add("Dear Good Boys, do not worry having no girlfriend this time. Remember, bad boys will always have the best girlfriend but they will never have the best wife.");

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