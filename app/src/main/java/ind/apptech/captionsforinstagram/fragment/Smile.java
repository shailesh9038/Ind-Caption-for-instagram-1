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

public class Smile extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Smile() {
        // Required empty public constructor
    }

    public static Smile newInstance(String param1, String param2) {
        Smile fragment = new Smile();
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

        englist.add("A smile is the shortest distance between two people.");
        englist.add("Keep the smile, leave the tension, feel the joy, forget the worry, hold the peace, leave the pain, and always be happy");
        englist.add("By the way, I'm wearing the smile you gave me.");
        englist.add("Life is short; smile while you still have teeth.");
        englist.add("Life only comes around once, so do whatever makes you happy, and be with whoever makes you smile");
        englist.add("At the end of the day before you close your eyes, smile and be happy with where you've been and grateful for what you have. Life is pretty darn good");
        englist.add("Show your smile to everyone, and see how the whole world will smile at you back");
        englist.add("I'm going to smile and move on with my life. You don't deserve someone as great as me. So your loss");
        englist.add("A smile is always the best form of introduction.");
        englist.add("It's not the tears that measure the pain. Sometimes, it's the smile we fake just to show others we are okay");
        englist.add("Keep smiling, because life is a beautiful thing and there's so much to smile about.");
        englist.add("sometimes tears are a sign of unspoken happiness :) and a smile is sign of silent pain.");
        englist.add("If you're not using your smile, you're a man with a million dollars in the bank and no checkbook.");
        englist.add("The world can be a brutal place - please don't let it steal your smile away");
        englist.add("A smile can brighten the darkest day.");
        englist.add("Should I smile because we are friends? Or cry because we'll never be anything more?!!");
        englist.add("Peace begins with a smile.");
        englist.add("A smile is a window on your face to show your heart is at home.");
        englist.add("Every smile makes you a day younger.");
        englist.add("The more you smile, the more things you will have to smile about.!");
        englist.add("If you smile when no one else is around, you really mean it.");
        englist.add("Your smile is literally the cutest thing I've ever seen");
        englist.add("When life gives you limes, rearrange the letters so it says smile");
        englist.add("Always wear a smile, because your smile is a reason for many others to smile..");
        englist.add("Having class is having the ability to walk away from a bad situation with a smile on your face and forgiveness in your heart");
        englist.add("Smile and forgive, it's the only way to live.");
        englist.add("You make me smile, you make me laugh. You make me forget all the pain. Even if it's only for a little while");
        englist.add("Smile is the way to solve many problems, and silence is the way to avoid many problems.");
        englist.add("Here's to the people who always have a smile on their face..");
        englist.add("Don't count your problems. There are thousands of reasons for you to smile. Your blessings are much greater than what you deserve");
        englist.add("Nothing is more beautiful than a real smile that struggled through tears");
        englist.add("A good life is when you assume nothing, do more, need less, smile often, dream big, laugh a lot and realize how blessed you are");
        englist.add("The world always looks brighter from behind a smile");
        englist.add("Best friends are the people in your life that make you laugh louder, smile brighter and live better");
        englist.add("A warm smile is the universal language of kindness.");
        englist.add("Use your smile to change the world; don't let the world change your smile.");
        englist.add("There are hundreds of languages in this world ,but a smile speaks them all");
        englist.add("I've got nothing to do today but smile");
        englist.add("It only takes one smile to stop one thousand tears.");
        englist.add("All smiles should come from the heart");
        englist.add("True friends see the hurt in your eyes while others are fooled by your smile");
        englist.add("A true friend is someone who knows there's something wrong even if you smile");
        englist.add("I was smiling yesterday, I am smiling today and I will smile tomorrow. Simply because life is too short to cry for anything.");
        englist.add("sometimes good things end in tears, so that you can have new ones with the smiles");
        englist.add("Strong people know how to keep their life in order. Even with tears in their eyes, they still manage to say,  I'm OK  with a smile");
        englist.add("If the simple things in life don't put a smile on your face then you will never be truly happy");
        englist.add("And then that smile fell off her face for the last time. And she was no longer perfect, no longer flawless. All that was left of her was a beautiful disaster");
        englist.add("Count the garden by the flowers, never by the leaves that fall. Count your life with smiles and not the tears that roll");
        englist.add("Be careful the ones that make you smile are the same ones that can shatter your heart");
        englist.add("Sometimes people have to cry out all their tears to make room for a heart full of smiles");
        englist.add("No smile is as beautiful as the one that struggles through tears");
        englist.add("You are right here, right now, with what you have, breathing. Enjoy it. You've got nothing to do today except to smile");
        englist.add("Even if you are in pain, smile. Show everyone that even though you are hurt, you're to strong to let it get to you.");
        englist.add("Each morning when you wake up, before you do anything else, smile");
        englist.add("fake smiles can only hold in your tears for so long");
        englist.add("A smile is the lighting system of the face, the cooling system of the head and the heating system of the heart");
        englist.add("Never regret something that made you smile");
        englist.add("If that special person in your life is responsible for your smile, please be responsible with their heart. Have a blessed & productive day");
        englist.add("Keep smiling nd ONe DaY Life ll b tired of upsetting U");
        englist.add("Think about this. Someone in this world right now couldn't imagine living their life without you. That alone should give you a reason to smile");
        englist.add("No matter what you deserve to smile. Don't ever let anyone take that away from you");
        englist.add("You walk through life much easier with a smile on your face.");
        englist.add("Life is like a mirror, we get the best results when we smile at it.");
        englist.add("It is hard to deal with someone who smiles and pretends to like you to your face and sticks that eight inch blade in your back when you turn around");
        englist.add("You are not fully dressed until you wear a smile.");
        englist.add("never stop smiling; because once you do, your realize how hard and sad life is...and you may never smile again");
        englist.add("Behind many smiles hide rivers of tears! Never be fooled by a smile! Sometimes people who laugh the most in our presence... Are those who cry the most when they are alone at night!");
        englist.add("A smile from you can bring happiness to anyone, even if they don't like you");
        englist.add("I can always make you smiling.");
        englist.add("The smile on my face doesn't mean my life is perfect. It means i appreciate what i have and what god has blessed me with.");
        englist.add("Expect less, prepare more. Judge less, respect more. Complain less, thank more. Regret less, smile more");
        englist.add("Keep smiling and one day life will get tired of upsetting you.");
        englist.add("Sometimes a fake smile is the only way to deal with real life");
        englist.add("Be the reason someone smiles today.");
        englist.add("Every day you spend without a smile, is a lost day.");
        englist.add("Good or bad, just smile. You have a lot to be thankful for");
        englist.add("The best way to get your attention is to smile. The best way to earn your respect is to listen without judgement");
        englist.add("My real smile comes when I'm with you.");
        englist.add("Use your smile to change this world, but don't let this world to change your smile.");
        englist.add("A smile is a curve that sets everything straight");
        englist.add("Whatever makes you feel bad, leave it. Whatever makes you smile, keep it");
        englist.add("In life there are 1000 reasons to cry, 100 reasons to smile, 10 reasons to keep going and 1 reason to care");
        englist.add("If you see someone without a smile, give them yours");
        englist.add("Never stop smiling, because the eyes are the window to the soul, and the smile is the front door to your heart");
        englist.add("The shortest distance between two people is a smile.");
        englist.add("We cry to remember, and smile to forget");
        englist.add("When a new day begins, dare to smile gratefully.");
        englist.add("Sometimes it's just one of those days when you feel the need to look back and smile at all of those embarrassing, childish, silly moments that just so happened to define who you are");
        englist.add("Start every day with a smile and get it over with.");
        englist.add("Be someone else's sunshine. Be the reason someone smiles today.");
        englist.add("This isn't a perfect world, people get hurt, you smile when you feel like crying, you say you are okay when you're falling apart but you got to let go and move on. There's nothing else you can do");
        englist.add("Don't cry because life has it's bad endings but smile because a whole new adventure has just started. Respect it");
        englist.add("Life is like a mirror, if you frown at it, it frowns back; if you smile, it returns the greeting");
        englist.add("Make someone smile whenever you can, you never know how much of a difference you could be making in their life at that moment");
        englist.add("A smile is the prettiest thing you can wear. Don't forget to smile.");
        englist.add("Today is one of the good old days you'll be talking about someday. Do something that will make you smile when you look back on it");
        englist.add("Don't ever judge anyone. You don't know their story and what's really going on. A smile can hide so much");
        englist.add("Always remember to be happy because you never know who's falling in love with your smile.");
        englist.add("When life gives you a hundred reasons to cry, show life you have a thousand reasons to smile");
        englist.add("Wear a smile - one size fits all.");
        englist.add("If you don't start out the day with a smile, it's not too late to start practicing for tomorrow.");
        englist.add("We live in a world where there is so much beyond our power to change, so keep reminding yourself DON'T stress over what you can't change, give life your best shot and at the end of the day sit back with a smile and be very proud of who you are");
        englist.add("Always remember that, no matter how useless you feel, you're someone's reason to smile. Remember that..");
        englist.add("Sometimes it is easier to smile even if you are hurting inside, than to explain to the whole world why you are sad.");
        englist.add("Be filled with wonder, be touched by peace");
        englist.add("Memories good or bad are our experiences in life, which is copied and photographed in our thoughts for our entire lifetime. There will be a time when we'll be alone and our memories keep flashing out with a smile");
        englist.add("Life is about finding a way to have a smile on your face while going through the worst in life");
        englist.add("Never lose site of who you are, always remember the reason you are smiling today. Count your blessings for been the gift to smile.");
        englist.add("There are three things life brings us: tears, smiles and memories. Tears gets wipe away. A smile fades away. But memories last a lifetime");
        englist.add("If you can't find a reason to smile, find a smile (on other's face) and you'll find the reason");
        englist.add("A smile is an inexpensive way to change your looks.");
        englist.add("You can fake a smile, but you can't fake your feelings");
        englist.add("It's easy to look at people and make quick judgements about them, their present and their past, but you would be amazed at the pain and tears a single smile hides. Never judge, learn to respect and acknowledge the feelings of another");
        englist.add("Someday, everything will make perfect sense. So for now, laugh at the confusion, smile through the tears, and keep reminding yourself that everything happens for a reason");
        englist.add("I hate the world, but I've still got plenty of things to smile about");
        englist.add("I want to look back and be able to smile at my past And know that I did all the wrong things for all the right reasons");
        englist.add("When life gives you a hundred reasons to cry, show life that you have a thousand reasons to smile.");
        englist.add("Smile like you have never cried, fight like you have never lost, love like you have never been hurt, and live like there is no tomorrow.");
        englist.add("wonders why every morning I get up, I put on a fake smile for the rest of the world to see, just to come back home and break down");
        englist.add("Silence and smile: those are two powerful tools.");
        englist.add("Today, give a stranger one of your smiles. It might be the only sunshine he sees all day.");
        englist.add("Be happy with the little you have. There are some people with nothing who still manage to smile.");
        englist.add("Never regret something that once made you smile.");
        englist.add("She gave me a smile I could feel in my hip pocket.");
        englist.add("Forgive me if I smile, it's just to hide my fears. Forgive me if I laugh, it's just to hide the tears.");
        englist.add("Yeah i'm smiling but you are not the reason anymore.");
        englist.add("It's amazing what you can hide just by putting on a smile");
        englist.add("A smile is a symbol of appreciation despite any circumstance");
        englist.add("Try not to hate the haters, smile knowing their thinking about you");
        englist.add("NO smile is more beautiful than the one that struggles through the tears");
        englist.add("There are many reasons in life which makes us cry ,but it's better to show life you can smile more than it makes you cry");
        englist.add("Smiling is the best way to face every problem, to crush every fear, to hide every pain.");
        englist.add("I smile because you're my family, I laugh because there is nothing you can do about it");
        englist.add("smile. it kills the people who want to see you cry");
        englist.add("A laugh is a smile that bursts.");
        englist.add("Be nice and smile to everyone you meet. You don't know what they are going through and they may need that smile and treasure it");
        englist.add("Keep smiling; it makes people wonder what you are up to.");
        englist.add("Never underestimate the power of your smile :)");
        englist.add("The prettiest smiles hides the deepest secrets. The prettiest eyes have cried the most tears, and the kindest hearts have felt the most pain");
        englist.add("Keep a smile on your face and let your personality be your autograph");
        englist.add("A smile takes a moment, but the memory of it lasts forever.");
        englist.add("A good life is when you assume nothing, do more, smile often, dream big, laugh a lot and realize how blessed you are for what you have");
        englist.add("Just because I smile doesn't mean that I'm happy, because it takes one smile to cover a million tears");
        englist.add("laugh when you can, smile everyday, keep moving forward and don't look back because life goes by fast & it only happens once");
        englist.add("A smile confuses an approaching frown.");
        englist.add("I've been through a lot of crap in my life, but I've learned it's better to smile through it than frown upon it");
        englist.add("You know when someone has been through crap in their life when you see the fake smile and the hurt eyes");
        englist.add("You are never fully dressed without a smile.");
        englist.add("Family isn't always by blood. It is the people in your life who want you in theirs; the ones who accept you as you are. The ones who would do anything to see your smile");
        englist.add("Count your age by friends, not years. Count your life by smiles, not tears");
        englist.add("When reality hits you in the face, it won't hurt so much if you're wearing a smile");
        englist.add("A smile is the most beautiful curve on woman's body.");
        englist.add("Wrinkles should merely indicate where smiles have been.");
        englist.add("Live for the moments that bring butterflies to your stomach and a smile to your face");
        englist.add("Just because a person smiles all the time, doesn't mean their life is perfect. That smile is a symbol of hope & strength");
        englist.add("People seldom notice old clothes if you wear a big smile.");
        englist.add("I cried yesterday so I could smile today");
        englist.add("I admire those who are able to still smile and put a smile on others after all that person has gone and is still going through");
        englist.add("Silence and smiles are two powerful tools. Smile is the way to solve many problems and Silence is the way to avoid many problems");
        englist.add("You'll find that life is still worthwhile, if you just smile.");
        englist.add("You smile looks adorable on you ! You should wear it more often.");
        englist.add("life is like a book no matter how many smiles and tears there are, it's always got to end.");
        englist.add("Life is like a mirror: It'll smile at you if you smile at it");
        englist.add("Let your smile change the world, Don't let the world change your smile.");
        englist.add("One day i caught myself smiling for no reason... then i realized i was thinking of you ..");
        englist.add("Nobody can be happy all the time. It's not healthy to keep your hurt in or your tears.  But once they are out wipe them away, put a smile on your face, and walk away from whatever or whoever made you hurt");
        englist.add("Somewhere there's someone who dreams of your smile, And finds in your presence that life is worthwhile, So when you are lonely, remember it's true: Somebody, somewhere is thinking of you");
        englist.add("behind almost every smile is a tear...");
        englist.add("Behind almost every smile is a tear");
        englist.add("There's always that one person that makes you laugh a little louder, smile a little brighter, and just live a little better. Never let them go");
        englist.add("Every tear has its own reason...Every smile has its own season");
        englist.add("Most smiles are started by another smile.");
        englist.add("Smile let everyone know that today, you're a lot stronger than you were yesterday.");
        englist.add("Do what makes u happy , be with who makes u smile");
        englist.add("Smile.. it is the key that fits the lock of everybody's heart.");
        englist.add("A strong woman is one who is able to smile this morning like she wasn't crying last night.");
        englist.add("A smile is a passport that will take you anywhere you want to go");
        englist.add("You are somebody's reason to smile.");
        englist.add("Everyone sees who I appear to be but only a few know the real me, you only see what I choose to show, there's so much behind my smile you just don't know");
        englist.add("Never regret what made you smile. Just learn from the tears that followed");
        englist.add("Sometimes you have to take off those fake smiles, and just cry");
        englist.add("The world always looks brighter from behind a smile.");
        englist.add("There may be a smile on my face, but inside I'm crying. I may be laughing, but inside I'm dying");
        englist.add("The only people that should be in your life are the ones that make you smile");
        englist.add("The truth about a fake smile ; it doesn't make you feel any better");
        englist.add("Any fool can be happy when times are good. It takes a strong soul with real heart to develop smiles out of situations that make us weep");
        englist.add("Keep your head high, keep your chin up, and most importantly, keep smiling, because life is a beautiful gift and there is so much to smile about.");
        englist.add("There are hundreds of languages ... but a smile speaks them all");
        englist.add("A smile is something you can't give away; it always comes back to you.");
        englist.add("Smile can't cover your pain. But smile can cover your weakness");
        englist.add("If you see someone without a smile today, give them one of yours");
        englist.add("Sometimes you got to laugh through the tears, smile through the pain so that you can live through the sorrow");
        englist.add("Sometimes it's just enough to smile sincerely.");
        englist.add("Sometimes you just have to smile, pretend every thing's okay, hold back the tears, and walk away");
        englist.add("Always wear a smile, not because life is full a reasons to smile, but because your smile itself could be a reason for others to smile");
        englist.add("You can wear mask, you can find sweet words to tell, you can fake smiles, you can make tears up, you can act innocence, but the way you treat your family will reveal everything");
        englist.add("Everyone smiles in the same language. ");
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