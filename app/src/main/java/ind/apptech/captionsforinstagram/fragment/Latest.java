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

public class Latest extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Latest() {
        // Required empty public constructor
    }

    public static Latest newInstance(String param1, String param2) {
        Latest fragment = new Latest();
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

        englist.add("Shortest horror story: Monday");
        englist.add("Say what you feel. It's not being rude, it's called being real");
        englist.add("Love yourself love your day love your life.");
        englist.add("Saw a Chinese kid and a black kid wave to each other today. It gave me hope.. for another Rush Hour movie.");
        englist.add("True love doesn't have a happy ending. It has NO ending.");
        englist.add("Keep smiling nd ONe DaY Life ll b tired of upsetting U");
        englist.add("Finding friends that have the same mental disorder as you.");
        englist.add("Sometimes the person you trust most is the one who trust you the least.");
        englist.add("I dont have a lot of friends, I just know a lot of people.");
        englist.add("When your past calls, don't answer. It has nothing newto say");
        englist.add("Sometimes it's not about missing someone. its wondering if they're missing you");
        englist.add("Nothing makes a room feel emptier than wanting someone in it.");
        englist.add("Hum indians ke pas har cheez ka solution hai!! bas problem dusaro ki honi chahiye!!");
        englist.add("They say what goes around comes around, passed a packet of chips and never came back.");
        englist.add("Go for someone who is not only proud to have you but will also take every risk just to be with you.");
        englist.add("You say it best when you say nothing at all!!");
        englist.add("Be a warrior not a worrier");
        englist.add("Love is like a Heaven... but... Hurt is like a HELL");
        englist.add("Girls need a moral support after their breakup and the moral support thinks that the girl genuinely cares for him.");
        englist.add("Absence makes the heart grow fonder");
        englist.add("If we evolved from monkeys, why are there still monkeys?");
        englist.add("Can't talk, wife around");
        englist.add("Happiness is when you suggest someone to listen to your favourite song and they also start falling for that song. Yeaaahhh");
        englist.add("Say what you mean, mean what you say");
        englist.add("Alone doesn't mean lonely, lonely doesn't have to be alone.");
        englist.add("That weird feeling when someone you barely know introduce you as a close friend.");
        englist.add("Aarju honi chahiye dill me kise ko yad karne ki.. Lamhe toh apne ap he miljate he dost");
        englist.add("I think of you in colours that don't exist.");
        englist.add("Guys who run girl's account on Facebook are the ones who secretly buy barbie and comb its hair.");
        englist.add("The Ones Who Are Crazy Enough To Think That They Can Change The World Are The Ones Who Do.");
        englist.add("After all we all are stories in the end.");
        englist.add("I am not really your friend until I start insulting you on a daily basis");
        englist.add("Sometimes I'ts better To be Alone.. Nobody Can Hurt You!");
        englist.add("Me: I'm finally happy. Life: Lol, wait a sec!!");
        englist.add("Maturity is knowing that most people around us are pieces of shit and having the courage to deal with them anyway.");
        englist.add("The amount of energy a girl uses to brush her hair every minute is enough to generate electricity for few villages.");
        englist.add("Play the moments. Pause the memories. Stop the pain. Rewind the happiness.");
        englist.add("Bahut gurur tha sbko apni daulat pe.. zara sa zameen kya hili sb aukat me aa gye.");
        englist.add("Be bold to own your mistakes in Life, accept your faults and improve your personality.");
        englist.add("You're in love. That makes you actually kind of boring to people who aren't in love.");
        englist.add("The most painful memory.. when I walked away and you let me go!");
        englist.add("My definition of a clean room is a clear path from my door to my bed");
        englist.add("I am the circle, and the circle is me.");
        englist.add("LOVE is when you don't know why you seem to be attracted to that person.");
        englist.add("Once you realize you deserve better, letting go will be the best decision ever!");
        englist.add("Thanks to the words 'dude' 'bro' and 'man' I haven't said my best friends name in 10 years.");
        englist.add("Sometimes, i want to meet myself from someone else's point of view!");
        englist.add("I hate fake people. You know what I'm talking about. Mannequins. :D");
        englist.add("Jab koi ladki khud se 'Hi' bheje to.. Samaj lena us ladki ka timepass nahi ho raha hai!");
        englist.add("Romantic are people that had never seen the other side of the things.");
        englist.add("Sometimes I wish I was an octopus so that I can slap you 8 times at once.");
        englist.add("Life is to short to remove USB slowly.");
        englist.add("We're all mature until someone pulls out the bubble wrap.");
        englist.add("Reality of life When you give importance to people they think that you are always free But They don't understand that you make yourself available for them every time");
        englist.add("Awesome Moment is when you Readong Someone's Status And You know that it's for you!!?");
        englist.add("Some women are lost in the fire.Some women are built from it.");
        englist.add("Some people accidentally walk on your feet & apologize. While, others walk all over your heart and don't even realize!!");
        englist.add("If a girl compares herself with any other girl you're friend with, it certainly means she likes you");
        englist.add("Life is like an ice-cream.. Enjoy it before it melts");
        englist.add("Love is the only thing that we can carry with us when we go, and it makes the end so easy.");
        englist.add("When the past calls, let it go to voice mail.. it's got nothing newto say.");
        englist.add("You can't change how people feel about you. so don't try.. Just live your life and be happy");
        englist.add("Some people make me want to gift them a t-shirt. Which reads, My parents send their apologies to the world!");
        englist.add("Hope is the power that gives a person the confidence to step out and try.");
        englist.add("Ladki ki hasi... aur kutte ki khaamoshi par kabhi bharosa nahi karna.");
        englist.add("Life doesn't get easier u get stronger.");
        englist.add("We all need mirrors to remind ourselves who we are.");
        englist.add("I think I might be falling for you. I love who you are and every little thing you do.");
        englist.add("Hum the jink sahare.. wo hue na humare.");
        englist.add("One day i caught myself smiling for no reason... then i realized i was thinking of you.");
        englist.add("If you make a boy laugh, He likes you. But if you make a boy cry, He loves you.");
        englist.add("Ye zami ruk jaye, Ye aasma tam jaye, Jab tere chara samn aaye.");
        englist.add("Right? or ?Wrong? doesn't ??exist?! When u have a ??CONFIDENCE?.");
        englist.add("The hardest part about being rejected is that I end up liking them even more as a person for their ability to make great decisions.");
        englist.add("Life is Just a Journey.");
        englist.add("Sometimes you have to act like you don't care, even when you do.");
        englist.add("I couldn't tell you how much i love you not even if the sky were my paper and the ocean my ink.");
        englist.add("I wonder if I am anyone's crush.");
        englist.add("Make your nature simple, the time will not be wasted.");
        englist.add("Status no need, Name is enough!");
        englist.add("I'm A Far Better Kisser Than Emraan Hashmi, But Not Getting Chance To Prove It!!");
        englist.add("Love is missing someone whenever you're apart, but somehow feeling warm inside because you're close in heart.");
        englist.add("People who tolerate me on the daily basis! are real heroes in my eye.");
        englist.add("A friend is someone who knows all abt u and accept u as u are.");
        englist.add("Tu hi ye mujhko bata de.. chahu main ya na.");
        englist.add("Pluviophile: a lover of rain, someone who finds joy and peace of mind during rainy days.");
        englist.add("When your ex says: You'll never find anyone like me.... Just smile and reply: that�s the point.");
        englist.add("Don't feel special. Some people keep your number in phone list just not to answer your call.");
        englist.add("It might take awhile, but eventually you're going to find the good in goodbye.");
        englist.add("Before people get to know me: OMG you're so shy and quiet..its so adorable... After they know me: Dear God, do you ever shut up?");
        englist.add("Life becomes so much better when you decide not to care and just live for the moment and not let the drama bring you down.");
        englist.add("There are two types of friends: Yaar sunn- Haan bol, Yaar sunn- Haan Bhok");
        englist.add("Some cheesy couples be like.. Aaj heart shaped shit huyi baby.. tumhari yaad aa gayi!!");
        englist.add("I wonder if anyone ever looks at me while I'm doing something and thinks I'm pretty.Because I do that all the time to people.");
        englist.add("Some People Change Your Life, Then Leave Without Explanation !!");
        englist.add("Last night my boyfriend and I got into a fight & I told him to get what's his and leave. He picked me up and walked out the door. I really love him.");
        englist.add("Love is when u have seen the best and the worst of sam1, yet u still love them for what they have.");
        englist.add("A female can be your best friend and worst enemy. It all depends on how you treat her.");
        englist.add("If someone hates you for no reason, then give them a reason ;)");
        englist.add("Life goes on with or without you!");
        englist.add("I Miss you dearly my heart aches, My head is lost, I really miss you.");
        englist.add("Stop saying I wish start saying I will.");
        englist.add("Classic book is a book which people praise, but do not read.");
        englist.add("Life is too short. Don't waste it reading my status.");
        englist.add("24 Hours Online!");
        englist.add("Maturity is not when we start speaking big things. It is when we start understanding small things.");
        englist.add("The best hug is when you don't let her feet touch the ground.");
        englist.add("Beauty is power, a smile is its sword.");
        englist.add("Shit happens. Everyday. To everyone. The difference is in how people deal with it.");
        englist.add("Love is when u have seen the best and the worst of sam1,yet u still love them for what they have.");
        englist.add("Neend aankh band karne se nai, wifi band karne se aati hai Good Night");
        englist.add("What is known in the heart doesn't always need to be uttered by Mouth.");
        englist.add("You're either as beautiful or as ugly as you believe you are. You define your beauty. That's not a power anyone can have over you");
        englist.add("Every problem comes with solution, but my GF don't have.");
        englist.add("The most eloquent silence, that of two mouths meeting in a kiss.");
        englist.add("World is small and life is short.. Spread smiles and share peace.");
        englist.add("True love doesan't have a happy ending. It has NO ending. <3");
        englist.add("Love is not possible without sacrifice, and sacrifice is not possible without love.");
        englist.add("We both belong to each other, nature and myself.");
        englist.add("If you fall in love... be ready for the tears..!!");
        englist.add("You know how you don't want to miss them, but you want them to miss you");
        englist.add("Shy people are mostly misunderstand as the must innocent one... But once u get to know them.. they can be as crazy as heLL.. LIKE ME");
        englist.add("Maine to tere naa mein bhi dhundh li apni khushi..");
        englist.add("The person who looks good in the group photos is always the one who uploads it.!!");
        englist.add("The awkward moment when you walk out of your room in your pajamas and there's a guest in your house.");
        englist.add("You have no idea how much l like you. How much you make me smile, how much l love talking to you, or how much l wish you were here.");
        englist.add("I told my parents I had my eye on a bike for my birthday. They told me to keep my eye on it because my arse won't be on it.");
        englist.add("The Most Beautiful Smile Is When You Smile Because You Remembered Someone Special.");
        englist.add("Imperfection is beauty, madness is genius and its better to be absolutely ridiculous than absolutely boring.");
        englist.add("It can take me anywhere between 0.02 seconds and 3 days to reply to a text.");
        englist.add("When you mess up a guy's hair, he thinks it's cute. But when you mess up a girl's hair, make sure you're wearing something bulletproof.");
        englist.add("Reading a book and having to re-read the same paragraph over and over because your mind is somewhere else.");
        englist.add("Remember, You are unique, but then again so is everyone else in this world.");
        englist.add("God is really creative, I mean.. just look at me! :)");
        englist.add("Before people get to know me: OMG you're so shy and quiet.. its so adorable... After they know me: Dear God, do you ever shut up?");
        englist.add("Opportunity tends to knock once, then it's gone...temptation, however, likes to stand there and lean on the damn doorbell!");
        englist.add("It does not matter how many times you get knocked down, but how many times you get up.");
        englist.add("Be somebody who makes everybody feel like a somebody.");
        englist.add("Mine is- Never trust on girls coz they didn't care any boy");
        englist.add("If you need me and there are one thousand steps between us, just take one step and i'll take nine hundred ninety-nine to be with you!");
        englist.add("Things r beautiful if u love them.");
        englist.add("Sometimes the right one for you is the one who was there the whole time.");
        englist.add("When a girl says 'dont worry about it' you better f*cking worry about it.");
        englist.add("BROKEN HEART: When i think about d people who really mean a lot to me, my thought alwayz turn to u.");
        englist.add("Duniya main sirf 2 Chize Mashoor Hai, tere bhai ka Style, aur teri bhabhi ki smile.");
        englist.add("Baharo phool barshao mera mehboob aya hain.");
        englist.add("Nobody is too busy, its just a matter of priorities");
        englist.add("You know you're in Love when you want to tell everyone about it, even if they haven't asked.");
        englist.add("No girl feels beautiful until a guy comes along and makes her feel like she is ^_^");
        englist.add("People who spend their time taking selfies should change their last name to .JPEG");
        englist.add("Nobody can teach me who I am.");
        englist.add("Don't let a bad day make u feel u have a bad life.");
        englist.add("I am hopeful that one day my accidental starring would make you fall in love.");
        englist.add("I've got nothing to bo today but smile.");
        englist.add("Your smile is literally the cutest thing I've ever seen.");
        englist.add("Give a man a match, and he'll be warm for a minute, but set him on fire, and he'll be warm for the rest of his life.");
        englist.add("A friendship that can end never really began !");
        englist.add("Give thanks for a little and you will find a lot.");
        englist.add("Don't talk if you dont have any good thing to say");
        englist.add("Sometimes all you can do is smile, move on with your day, hold back the tears and pretend you're okay.");
        englist.add("Girls with open messy hair, chubby cheeks, a dimple and spectacles.. Aww you look so cute!");
        englist.add("Sometimes it is painful to see that the people most appreciate is a false.");
        englist.add("You know what friends ur polite nature to others always hurts you.");
        englist.add("It doesn't have to be perfect to be beautiful.");
        englist.add("Call me crazy, but I'm madly in love with you and this won't go away for a while, so get use to it.");
        englist.add("Thinking holds what you feel, feeling drives what we think.");
        englist.add("Mujhe teri mohabbat ko sahara mil gaya hota.. agar tufan nahi aata kinara mil gaya hota.");
        englist.add("2 reasons why a guy doesn't text you back: 1. He has a girlfriend.... 2. You are his girlfriend.");
        englist.add("I don't care how I look, I don't care how I act, as long as I can be happy with my life, i enjoy it.");
        englist.add("Never ask why i love you just accept that i do because words simply cannot tell how much i love you.");
        englist.add("Life begins at the end of your comfort zone.");
        englist.add("You don't know the struggle if you don't have parents that turn off the WiFi every night");
        englist.add("Simplicity is the ultimate sophistication");
        englist.add("If I could be anything, l would be ur tear, so l could be born in ur eye, live down ur cheek and die on ur lips.");
        englist.add("Cheer up, tomorrow will be a better day, just believe!");
        englist.add("GOLDEN WORDS: Second chance Is rare, if u get once try to make most of it.");
        englist.add("Akele ham hi shamil nahi hai is jurm mai janab, Najar jab mili thi to muskuraye aap bhi the.");
        englist.add("When u love someone, even though they hurt u nd break your heart, you still love them with all the little pieces!!");
        englist.add("It doesn't matter who hurt you, or broke you down,what matters is who made you smile again.");
        englist.add("I need a course in.. How to talk to relative for more than 40 seconds!");
        englist.add("Court- Innocent until proven Guilty. Relationship- Guilty until proven innocent.");
        englist.add("I've seen you at your worst and I still think you're the best");
        englist.add("Its funny how you can do nice things for people all the time and they never notice. But once you make one mistake, its never forgotten.");
        englist.add("Group study is the best way.. To ensure that none of your friends have studied either.");
        englist.add("Cute relationship is... when someone is angry with you and says I will never talk to you And later comes back to you to just inform you: I am still angry");
        englist.add("If they can't swallow facts, let them eat fiction.");
        englist.add("I speak for what i see, I stand for what I Believe. I strive for what i want.");
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