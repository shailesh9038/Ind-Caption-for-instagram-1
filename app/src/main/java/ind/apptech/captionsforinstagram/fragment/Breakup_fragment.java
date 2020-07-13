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

public class Breakup_fragment extends Fragment {

    RecyclerView englishlists;     private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Breakup_fragment() {
        // Required empty public constructor
    }

    public static Breakup_fragment newInstance(String param1, String param2) {
        Breakup_fragment fragment = new Breakup_fragment();
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

        englist.add("Relationships are very simple. There are only two things that can happen. You either get married or your break up.");
        englist.add("Problem is that still i care.");
        englist.add("The pain of having a broken heart is not so much as to kill you, yet not so little as to let you live.");
        englist.add("I wish you weren't in my dreams.");
        englist.add("I don't want to be needed, I need to be wanted :(");
        englist.add("It’s hard to tell your mind to stop loving someone when your heart still does.");
        englist.add("Nothing last forever.");
        englist.add("Sometimes two people have to fall apart to realise how much they need to fall back together.");
        englist.add("Dear Bad Luck ….. Let’s break up.");
        englist.add("I just hope that you miss me a little when I'm gone.");
        englist.add("One day u Will cry 4 me like i cried 4 u.");
        englist.add("Why do you have to break up with her? Be a man. Just stop calling.");
        englist.add("Before you let go. Remember the reason why you were hanging on. <3");
        englist.add("I'd rather have honest enemies than fake friends.");
        englist.add("Sometimes, you have to smile to hold back the tears.");
        englist.add("People say follow your heart…but which way do you go when your heart breaks into two?");
        englist.add("5 most annoying words after a break up: “Are you mad at me?” No, I`m perfectly happy you broke my heart..");
        englist.add("Ill never leave you- BIGGEST LIE.");
        englist.add("The heart was made to be broken.");
        englist.add("Love is blind, Be careful");
        englist.add("Silence is a most powerful conversation.");
        englist.add("A breakup is like a broken mirror, its better to give up then to hurt yourself trying to fix it.");
        englist.add("I flirt, but i am not a flirt.");
        englist.add("Just give me time and I'll get over you.");
        englist.add("Pain is inevitable. Suffering is optional.");
        englist.add("SO i heard that your dating my ex, eh? How do i taste sweetie? :)");
        englist.add("They say you have to go on and forget the past, but for me it’s not like that cause every time i try to forget the memory hunts me again..");
        englist.add("Trusting you again is my decision, Proving me wrong is your choice.");
        englist.add("There are three sides to an argument – your side, my side and the right side.");
        englist.add("When you are through changing, You are through.");
        englist.add("Since I'm always second in your life, it's time I make you last in mine.");
        englist.add("I will never learn to stop loving you I am just learning how to live without you and move on without you.");
        englist.add("Breaking Up Is Just Like Having The Worst Nightmare After Having The Best Dream");
        englist.add("It's painful to see someone you love with someone else.");
        englist.add("I loved you...but I guess that my love couldn't save this...nothing could.");
        englist.add("If you find a girl who’s willing to go through hell just to keep your relationship going, you really shouldn’t take her love for granted.");
        englist.add("I still love him. And here's the worst part. I want him back. - Ree");
        englist.add("I don't miss him, I miss who I thought he was.");
        englist.add("Man make money but money make man mad.");
        englist.add("Wrong person time to break up!!");
        englist.add("One day you'll finally see, your biggest mistake was not loving me.");
        englist.add("It's so hard to look at you and think we were so close. We were best friends. And now. I'm nothing to you.");
        englist.add("There are certain people who are not meant to fit in your life, no matter how much you want them to be.");
        englist.add("The better the relationship...the worse the breakup.");
        englist.add("You were a moment, but now, you're a memory!");
        englist.add("Its too late to take back all the you put me through.. I'm moving on with my life.");
        englist.add("Some mistakes are committed one time.");
        englist.add("Do you remember when you broke my heart well i found the guy who knows how to fix it.");
        englist.add("If you cant save the relationship, at least save your pride.");
        englist.add("The most pain full memory i have is of when i walked away and you let me leave.");
        englist.add("I'm going to take the past and burn it up.lift my head and carry on..cause baby I'm stronger than you'll ever know.");
        englist.add("A break up is like a broken mirror. It is better to leave it broken than hurt yourself to fix it.");
        englist.add("Success is steady progress toward's one's personal goal.");
        englist.add("Not everyone is meant to be in a long term thing. Maybe I should just give up.");
        englist.add("I would rather die of love than let love die.");
        englist.add("Just because i let you go, doesn't mean i wanted to.");
        englist.add("If someone really loves you, they wouldn’t let you slip away no matter how big the situation is.");
        englist.add("You had me. You lost me. So keep walking cause i am done talking.");
        englist.add("If you can't save the relationship, at least save your pride.");
        englist.add("One day you will want me and tell me sorry, but it’ll be too late.");
        englist.add("Never trust those people who don't understand your feelings.");
        englist.add("I will never learn to stop loving you I’m just learning how to live without you and move on without you there by my side.");
        englist.add("Knowledge cannot replace friendship. I would rather be an idiot than loose you.");
        englist.add("There is always that person in life that you give several chances, it's because you love them more than you hate them.");
        englist.add("My rear-view mirror has officially fallen off, no more looking back!");
        englist.add("You may be out of my life...but the memories we made remain in my heart forever <3");
        englist.add("When you love someone, even though they hurt you and break your heart, you still love them with all the little pieces !!");
        englist.add("I’m going to take the past and burn it up.lift my head and carry on..cause baby I’m stronger than you’ll ever know..");
        englist.add("It’s not the breakup that hurts the most. It’s the post trauma that follows it. It is waking up and checking your cell for the sms that is not there");
        englist.add("Sometimes when you love someone who isn't right for you, no matter how much you love them and want them back you have to let them go.");
        englist.add("Its not just the goodbyes that hurts, its the flashbacks that follow..");
        englist.add("We may love the wrong person, cry for the wrong person. but one thing is sure, mistakes help us find the right person.");
        englist.add("Love is like war easy to begin but hard to end.");
        englist.add("It's not the breakup that hurts the most. It's the post trauma that follows it. It is waking up and checking your cell for the sms that is not there.");
        englist.add("I don’t miss him, I miss who I thought he was.");
        englist.add("Is changing my relationship status to Out of Order.");
        englist.add("I want to be the god of evil, because to control the evil of my self.");
        englist.add("Its hard to tell your mind to stop loving someone when your heart still does.");
        englist.add("Sometimes breakups aren't meant for makeups, sometimes they are meant for wake-ups.");
        englist.add("Just give me time and I will get over you.");
        englist.add("Out of all the people in the world i thought you were the the one to be there for me 4 ever and always. turns out i was just your last option wasn’t i");
        englist.add("Dear Insomnia..I think we really need to break-up... I don't love you anymore...");
        englist.add("Sometimes You need to stand alone to find out who you really are..");
        englist.add("Wonders if this will ever get easier...");
        englist.add("I was born the day I met you, lived a while when you loved me, died a little when we broke.");
        englist.add("No more waisting time thinking about wasted time.");
        englist.add("There comes a time when walking away is the best for everyone.");
        englist.add("I agree its easy to cry n easy to die bt its nt easy to say goodbye.");
        englist.add("No matter how hard I try, no matter how many relationships I get into…. it will never replace the one I just lost.");
        englist.add("I hope we can still be friends~~ the worst break up line ever.");
        englist.add("Any time I break up with Dawson or question him, viewers turn against me.");
        englist.add("There is a severe pain I felt in my heart which you will never see b’coz it appears when you are not here.");
        englist.add("Like some wines our love could neither mature nor travel.");
        englist.add("Life is to Taste, not to waste.");
        englist.add("Relationships are like glass. Sometimes it’s better to leave them broken than try to hurt yourself putting it back together.");
        englist.add("I hope you're doing fine all alone.");
        englist.add("It's better to dream of something you may never have than to lose something you always dreamed of having.");
        englist.add("Not all scars show, not all wounds heal!!");
        englist.add("Missing that one person but knows i shouldn't be...");
        englist.add("Bad days call for foods that are bad for your butt.");
        englist.add("5 most annoying words after a break up: 'Are you mad at me?' No, I'm perfectly happy you broke my heart.");
        englist.add("Strong people stand up for themselves, but stronger people stand up for others.");
        englist.add("You'll get through this. And I know it's impossible to believe right now, but it gets better.");
        englist.add("Life is full of struggles.");
        englist.add("I will never learn to stop loving you I'm just learning how to live without you and move on without you there by my side.");
        englist.add("Wants to remind you that even though you can not go back and make a brand new start, you can always start now and make a brand new ending.");
        englist.add("I may not be perfect, but I'm always me");
        englist.add("Sometimes i just wonder if it is worth all of this...");
        englist.add("I know only that i know nothing.");
        englist.add("When we lose the right to be different, we lose the pre-village to be free.");
        englist.add("I’ll say goodbye this one last time. But know that I’m not really saying goodbye because in my heart I will still always love you. So goodbye..");
        englist.add("I need something more to hold then just a phone.");
        englist.add("Just give me time and I’ll get over you.");
        englist.add("If you can't save relationship, At least save your pride.");
        englist.add("You've got to believe you are worth more than being.");
        englist.add("Life is like a mountain, not a beach.");
        englist.add("What do you do when Something that was your Everything becomes a Nothing?.");
        englist.add("It’s so hard to look at you and think we were so close. We were best friends. And now. I’m nothing to you.");
        englist.add("Follow your heart and see where you land.");
        englist.add("One day they'll realize they lost a diamond while playing with worthless stones.");
        englist.add("A broken relationship would make you feel more lonely than when you were single.");
        englist.add("Hate being ignored.");
        englist.add("I’ll hide my broken heart beneath a laughing face and though you’ll think I never cared, no one can take your place.");
        englist.add("An eye with dust and a heart with trust always cries...");
        englist.add("Is tired of trying, sick of crying, yea I'm smiling, but inside I'm dying...!!");
        englist.add("A broken promise is as good as a lie .");
        englist.add("It’s better to dream of something you may never have than to lose something you always dreamed of having.");
        englist.add("If you can't change your fate then change your attitude.");
        englist.add("I wish you weren’t in my dreams.");
        englist.add("I'll say goodbye this one last time. But know that I'm not really saying goodbye because in my heart I will still always love you. So goodbye..");
        englist.add("I love you yesterday, today and tomorrow. I can't change that no matter what.");
        englist.add("When This is Over, Remember, I didn't WALK Away, You Pushed Me Away..");
        englist.add("The moment you realize that no one is your enemy, except yourself.");
        englist.add("Rules are meant to be broken.");
        englist.add("Just because I let you go, doesnt mean i wanted to.");
        englist.add("People say follow your heart.. but which way do you go when your heart breaks into two?");
        englist.add("Never stop chasing your dreams.");
        englist.add("Crazy people will always do weird stuff.");
        englist.add("I am crazy but original, You try to be me& you fail.");
        englist.add("You broke a promise and made me realize. It was all just a lie.");
        englist.add("If your love does not work with that person, it just means that someone else loves you more.");
        englist.add("A friendship that can end never really began !");
        englist.add("It's hard to tell your mind to stop loving someone when your heart still does.");
        englist.add("If you can’t save the relationship, at least save your pride..");
        englist.add("They say you have to go on and forget the past, but for me it's not like that cause every time i try to forget the memory hunts me again.");
        englist.add("Pictures are worth a thousand words.");
        englist.add("Dear Insomnia..I think we really need to break-up…I don’t love you anymore…");
        englist.add("Breakup is just like having the worst nightmare after the best dream.");
        englist.add("Love always Hurts.");
        englist.add("Be 0 in the back to 1. To make that 1 valuable.");
        englist.add("Relationships are like glass. Sometimes it's better to leave them broken than try to hurt yourself putting it back together.");
        englist.add("If you can’t save the relationship, at least save your pride.");
        englist.add("I’m too bright to shine in your dull World..");
        englist.add("Maybe, someday, i just might forgive you.");
        englist.add("Why try holding onto the past when the future could be so much better.");
        englist.add("Love is game for liars and pain for shayars.");
        englist.add("Dear Insomnia..I think we really need to break-up.. I don't love you anymore.");
        englist.add("I didn't want to be the one to forget.");
        englist.add("I hope we meet again.");
        englist.add("No more wasting time thinking about wasted time.");
        englist.add("The only way to fix this situation is to go back to when you asked me out...and say no.");
        englist.add("Revenge is the purest emotion.");
        englist.add("The most painful memory I have is of when I walked away and you let me leave.");
        englist.add("Every breakup is just another opportunity to do it right the next time.");
        englist.add("It’s not just the goodbyes that hurts, its the flashbacks that follow..");
        englist.add("Do you know why a previous relationship is called EX? It’s not the term for the past. EX is short for EXpired.");
        englist.add("It's not just the goodbyes that hurts, its the flashbacks that follow..");
        englist.add("My life grow's but my pain remains forever.");
        englist.add("Never even know if you never even try.");
        englist.add("Once upon a time, I was stupid enough to fall in love with you.");
        englist.add("Don't cry over somebody that won't cry over you.");
        englist.add("Thank you; you made my mind up for me when you started to ignore me.");
        englist.add("All failed relationships hurt, but losing someone who doesn’t appreciate you is actually a gain, not a loss.");
        englist.add("Love Is My Favourite Mistake");
        englist.add("Out of all the people in the world i thought you were the the one to be there for me 4 ever and always. turns out i was just your last option wasn't i.");
        englist.add("You don't have time to pass your love.");
        englist.add("Sometimes when you love someone who isn’t right for you, no matter how much you love them and want them back you have to let them go..");
        englist.add("Believe deep down your heart that you are destined to do great things.");
        englist.add("One day you will want me and tell me sorry, but it'll be too late.");
        englist.add("Do you know why a previous relationship is called EX? It's not the term for the past. EX is short for EXpired.");
        englist.add("What happens when it's time to let go of something you can't live without?");
        englist.add("Love is beautiful mistake of my life.");
        englist.add("Love hurts when you know it wont last :'(");
        englist.add("There is always that person in life that you give several chances, it’s because you love them more than you hate them.");

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