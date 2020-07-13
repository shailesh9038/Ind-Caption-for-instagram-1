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

public class HeartTouching extends Fragment {

    RecyclerView rajputlist;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public HeartTouching() {
        // Required empty public constructor
    }

    public static HeartTouching newInstance(String param1, String param2) {
        HeartTouching fragment = new HeartTouching();
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

        englist.add("I hate the moment when suddenly my anger turns into tears.");
        englist.add("My silence is just another word for my PAIN.");
        englist.add("Let no one think I gave in.");
        englist.add("Without communication there is no relationship. Without respect, there is no love. Without trust, there is no reason to continue.");
        englist.add("I just want to fall asleep until i don't miss you anymore.");
        englist.add("Sometimes when I say: I am okay.. I want someone Too look me in the eyes Hug me tight and say: I know you're not.");
        englist.add("A silent hug means a thousand words to the unhappy heart.");
        englist.add("It's better to be alone NOBODY can hurt you.");
        englist.add("I have Many problems in my life.. But My lips don't know that They Always Smile.");
        englist.add("Live life to express NOT to IMPRESS");
        englist.add("I hate when people say they miss you, but don't make a effort to speak to you or see you!");
        englist.add("Missing someone is your heart's way of reminding you that you love them.");
        englist.add("Success always hugs you in private.. but failure always slaps you in the public ! that's life.");
        englist.add("I wish I could ignore you, the way you ignore me.");
        englist.add("The sad part isn't that we never talk, its that we used to talk everyday.");
        englist.add("I want you to be FREE, but i can watch you SOAR away from me.");
        englist.add("I will wait till the day I can forget YOU or the day you realize you can't forget Me.");
        englist.add("True Love never dies it only gets stronger with time. <3");
        englist.add("Is finally driven to the point were they finds comfort in lies and shuns the truth.");
        englist.add("A great many people have a soldier's stomach - everything they eat goes to the front.");
        englist.add("If I could be anything, l would be ur tear, so l could be born in ur eye, live down ur cheek and die on ur lips.");
        englist.add("You made me Laugh you made me cry but you killed me when you said goodbye");
        englist.add("I hope you'll realize how much you're hurting me someday.");
        englist.add("There is always someone who cares for you without your knowledge.");
        englist.add("How did we go from talking everyday to strangers?");
        englist.add("No matter how much you have hurt me, I still pray for you every night.");
        englist.add("I like having low self-esteem it makes me feel special.");
        englist.add("First time I cut was just to feel the pain, Strange because I didn't feel a thing.");
        englist.add("You must be, said the Cat. or you wouldn't have come here.");
        englist.add("Love is like a rubber band held at both ends by two people. When one leaves.. it hurts the other.");
        englist.add("Never giveup on someone you cant spend a day not thinking about.");
        englist.add("Some of us are just trying to get through the day without falling apart.");
        englist.add("Whatever our souls are made of, HIS and Mine are the SAME. - Emily Bronte");
        englist.add("If you really love that person, learn to wait. Maybe you're not meant to be together today but meant to be in the future.");
        englist.add("SLEEP away the sadness of today!");
        englist.add("Those who say sunshine brings happiness have never danced in the rain.");
        englist.add("I hate being broken. I hate that i cannot go back.");
        englist.add("The higher you climb on love's ladder, the harder you fall.");
        englist.add("The have no idea what a bottomless pit of misery I am.");
        englist.add("The worst missing is missing your own self which you used to be once upon a time..");
        englist.add("Silence is the most powerful SCREAM.");
        englist.add("The loss of a loved one is one of the most tragic and devastating things a person could endure.");
        englist.add("Maybe I am crazy but laughing makes the pain pass by.");
        englist.add("It seems to me that the harder I try the harder I fall.");
        englist.add("You know you really love someone when you can't hate them for breaking your heart.");
        englist.add("Life's so shit it makes wot comes out the dog's @ss look good!");
        englist.add("The hardest part about loving someone, is watching that person love another person.");
        englist.add("Sometimes you have to know when to stop hoping :-(");
        englist.add("If you give up on me, I'm going to give up on me too.");
        englist.add("Going to keep all secrets to myself since some people i can't trust :'(");
        englist.add("Be patient and tough, some day this pain will be useful to you.");
        englist.add("I'm slowly giving up.");
        englist.add("When I miss you it seems every song I listen to is about you.");
        englist.add("I feel crappy inside, like something just broke.");
        englist.add("Its better to be lonely then to be played by wrong people.");
        englist.add("Why be mean to animals when they treat u better then people");
        englist.add("I always found the right one on wrong time.");
        englist.add("Loneliness is the human condition. No one is ever going to fill that space.");
        englist.add("Never let the pain from your past punish your present and paralyze your future.");
        englist.add("BEING IGNORED, worst feeling ever.");
        englist.add("If you're mine, you're only mine, I don't like sharing.");
        englist.add("How can I go back to where the smile i had was real.");
        englist.add("Life and death are balanced on the edge of a razor.");
        englist.add("Don't trust too much, don't love too much, don't care too much because that 'too much' will hurt you so much!");
        englist.add("Every day, I am acting like I am okay but you'll never know the truth.");
        englist.add("I never knew that one singe blade could mess up my life..");
        englist.add("Waiting is painful. Forgetting is painful. But not knowing which to do is the worse kind of suffering.");
        englist.add("Don't be much closer to anybody because a small change in their behavior hurts a lot.");
        englist.add("The hardest part in life is trying to show the smile you know is fake and to hide the tears that won't stop.");
        englist.add("QUIET! I can't hear you & all the voices in my head at the same time!");
        englist.add("It's sad to be happy alone.");
        englist.add("She was a girl who knew how to be happy even when she was sad and that's important you know.");
        englist.add("I don't usually sleep enough, but when I do, it's still not enough.");
        englist.add("The sky isn't always blue. The sun doesn't always shine. So it's okay to fall apart sometimes.");
        englist.add("Never put your happiness in someone else's hands.");
        englist.add("I'm tired of everyone telling me about their special person when I desperately want one of my own.");
        englist.add("A beautiful dress can change the personality but beautiful behavior can change the Life!");
        englist.add("Is feeling like the weight of the world is sitting on their shoulders.");
        englist.add("Sometimes it's better to be alone. Nobody can hurt you!");
        englist.add("It isn't the bad memories that make you sad, but the best ones that you can't bring it back.");
        englist.add("Your mind may be sad because you're not with him, but your heart is happy just knowing him.");
        englist.add("Everyone says to follow your heart, but what if your heart wants something it can never have");
        englist.add("We write our own chapters on love, it's up to us how we turn these pages.");
        englist.add("Some people try to understand, but nobody can know what living like this is like.");
        englist.add("I'm invisible, until someone needs me.");
        englist.add("You'll never realize the value of what you have, until what you have is no longer yours.");
        englist.add("The skin of a scar is stronger than the original, less aware of pain.");
        englist.add("A beautiful face doesn't mean anything without a beautiful heart.");
        englist.add("I hate missing someone and not being able to do anything about it.");
        englist.add("It's never the tear that measure the PAIN, sometimes its the SMILE we fake.");
        englist.add("Sometimes the hardest thing and the right thing are the same.");
        englist.add("I tried to forget you, but the harder I tried, the more I thought about you.");
        englist.add("You can love someone so much but you can never love people as much as you can miss them.");
        englist.add("If you're going to make me cry, at least be there to wipe away the tears :'(");
        englist.add("Love can't be found Where it doesn't exist.");
        englist.add("This isn't a Whatsapp Status..this is just to show that no status matches my feelings right now.");
        englist.add("Please BURN my sad memories.");
        englist.add("Loneliness doesn't KILL, but sometimes I wish it DID.");
        englist.add("Some nights I burn in the fire of my own thoughts.");
        englist.add("Never Forget who was there for you when no one else was.");
        englist.add("Find someone who can change your life, not your relationship status.");
        englist.add("Why am i so afraid to lose you when you are not even mine?");
        englist.add("People cry not because they are weak, It's because they've been strong for too long.");
        englist.add("I'll miss you forever like the starts miss the sun in the morning skies.");
        englist.add("Make the most beautiful Mistakes, mine is you.");
        englist.add("Only you can put a smile on my face when i'm sad..");
        englist.add("1 day you will see what you lost. 1 day I'll see what I gained.");
        englist.add("I'm sad. No. I'm mad. No, wait.. I don't know I just need a freaking hug.");
        englist.add("Every text I get, I hope it's from you.");
        englist.add("I miss how you always MADE time for me.");
        englist.add("One day you'll meet someone who doesn't care about your past because they want to be with you in future.");
        englist.add("I act like I don't care, but deep inside, it hurts.");
        englist.add("I never feel alone, because loneliness is always with me.");
        englist.add("I'm not afraid to fall in LOVE, I'm afraid to fall for a wrong person again.");
        englist.add("People sometimes think that you do not love them but sometimes you have to say bye.");
        englist.add("During the day I keep myself busy and sometimes time passes. But at night, I really miss you.");
        englist.add("What's the point in all this screaming, no one's listening anyway.");
        englist.add("There is no point in crying, the tears wont bring you back to me.");
        englist.add("When You Sit Alone.. You Sit With Your Past. :(");
        englist.add("Keep this heart with you always as a reminder that I will always love you.");
        englist.add("I'm leaving for our own Good, Now I am happy, how about you?");
        englist.add("I know my silence and my tears will heal my pain one day.");
        englist.add("Is having one of those days where they feels like they can't do anything right.");
        englist.add("How did I go from being so happy, to so sad..");
        englist.add("What's the point in all this screaming, no one's Listening any way.");
        englist.add("The deepest people are the ones who've been hurt the most.");
        englist.add("LOVE, love quotes, heart touching quotes");
        englist.add("It's not how tragically we suffer but how miraculously we live.");
        englist.add("Sometimes the people that u don't want to get hurt doesn't care if they hurt you.");
        englist.add("I heard someone whisper your name but when I turned around to see who it was, I was alone then I realized that it was my heart telling me that I miss you.");
        englist.add("One Of The Hardest Things To Do.Is To Delete Old Messages That Once Meant A Lot To You.");
        englist.add("The pain is there to remind me that I'm still alive.");
        englist.add("If is short, there is no time to leave important words UNSAID.");
        englist.add("I just want you, that's all.");
        englist.add("Tears are prayers too. They travel to God when we can't speak.");
        englist.add("We can do no great things, only small things with great love.");
        englist.add("You aren't the person I knew back then.");
        englist.add("A pretty face is nothing if you have an ugly heart.");
        englist.add("Is so sad to see vacation go, it's back to school tomorrow! =(");
        englist.add("LOVE is not free the price is your heart. <3");
        englist.add("I miss your cuddles, I miss your kisses but most of all I miss you! the love I have will never change as each day goes by I will love you till the day I die.");
        englist.add("Six letters, two words, easy to say, hard to explain, harder to do. MOVE ON.");
        englist.add("It hurts the worst when the person that made you feel so special yesterday, makes you feel so unwanted today.");
        englist.add("Reality has exiled me, I am no longer bound by it's laws.");
        englist.add("I'm freezing, I'm starving, I'm bleeding to death, Everything's fine.");
        englist.add("One morning you wake up afraid to live.");
        englist.add("The only way is to move on, because if you don't you'll be suck where you are.");
        englist.add("There is no hurt in this world worse then feeling like they just doesn't give a F..bad!");
        englist.add("I fell for you, but you didn't catch me");
        englist.add("I care too much that's the problem.");
        englist.add("It's never going to be the same again. And that's whats killing me.");
        englist.add("Sometimes there is so much we feel but so little we can say.");
        englist.add("I won't leave a note for anyone to find tomorrow they will know what I've done here tonight.");
        englist.add("I cry then I cut, then I cry again, it never ends.");
        englist.add("Sometimes people have to cry out all their tears, to make room for a heart full of smiles.");
        englist.add("Look at me. You may think you see who I really am, but you'll never know me.");
        englist.add("Sometimes you need to run away just to see who will follow you.");
        englist.add("My two most HATED words..'I PROMISE'..It doesn't mean $hit to me!");
        englist.add("When I miss you I re-read our old conversations and smile like an idiot.");
        englist.add("Fall too fast, crush too hard, forgive too easy, and care too much.");
        englist.add("Don't make me your option, when I have made you my priority.");
        englist.add("Everybody knows that something's wrong but nobody knows what's going on.");
        englist.add("I have to cut because it's the only way I can smile.");
        englist.add("The past cannot be changed, edited, deleted or forgotten. just accept it and move on.");
        englist.add("The greatest pain that comes from love is loving someone you can never have.");
        englist.add("The people who hide their feelings usually care the most!");
        englist.add("When I close my eyes I see you, when I open my eyes I miss you.");
        englist.add("Sometimes your heart needs more time to accept what you mind already knows.");
        englist.add("Losing a part of yourself is much easier than losing the one you love.");
        englist.add("No one knows what it's like to be the bad man, to be the sad man, behind blue eyes.");
        englist.add("My silence spoke a thousand words, but you never heard them.");
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