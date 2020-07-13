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

public class Decent extends Fragment {

    RecyclerView rajputlist;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    private RecyclerView.LayoutManager layoutManager;
    LinearLayout Net_connection;

    public Decent() {
        // Required empty public constructor
    }

    public static Decent newInstance(String param1, String param2) {
        Decent fragment = new Decent();
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

        englist.add("A Smile is the best one which is on others face but created by YOU!");
        englist.add("Distance does not matter if two hearts are loyal to one another.");
        englist.add("If you run, make sure you’re running towards something. Never away.");
        englist.add("When you are young everything feels like it’s the end of the world, but it’s not it’s just the beginning.");
        englist.add("Always be true to yourself, don’t live by the opinions or choices of others, but by your own..");
        englist.add("Only few will try to find the reason behind your silence. Rest of the people will misunderstand you.");
        englist.add("Talking about your problems is our greatest addiction. Break the habit. Talk about your joys.");
        englist.add("A moment of patience in a moment of anger saves a thousand moments of regret.");
        englist.add("Focus on the journey, not the destination. Joy is found not in finishing an activity but in doing it.");
        englist.add("We all make mistakes, hurt and disappoint people but don’t get caught up in the past, learn from it and move on.");
        englist.add("Never change yourself for someone. Just be what you are and let them love your original copy.");
        englist.add("Don’t confuse your path with your destination. Just because it’s stormy now doesn’t mean that you are not headed for sunshine.");
        englist.add("Always remember to thank God for what he has given you that you didn’t ask for.");
        englist.add("A good way to change someone’s attitude is to change your own. Because, the same sun that melts butter, also hardens clay!");
        englist.add("Those moments when all the thoughts you have tried so hard to forget all come rushing back to you.");
        englist.add("Remember to treat your significant other the RIGHT because there’s ALWAYS another person out there that’s looking at them the same way you did at first..");
        englist.add("Understanding is much deeper than knowledge. There are many people who know us, but very few who understand us.");
        englist.add("Take pride in how far you have come, and have faith in how far you can go.");
        englist.add("To gain something you’ve never had you may have to do something you’ve never done..");
        englist.add("Success is a beautiful place and only those who never give up will get the chance to be there.");
        englist.add("If a girl asks a question, it’s better to tell her the truth. Chances are, she’s asking you because she already knows the answer.");
        englist.add("Sometimes it’s hard to find words to tell you, how much you mean to me. A lot of times I don’t say anything at all but I hope someday you will understand having you is what I live for.");
        englist.add("Sometimes words are not enough to make someone feel that you care for them. Sometimes it needs a little effort.");
        englist.add("The past cannot be changed, forgotten, edited, or erased. It can only be accepted.");
        englist.add("Where love is concerned, too much is not even enough.");
        englist.add("You make me smile more than anyone else in world.");
        englist.add("If it’s still on your mind, it’s still in your heart.");
        englist.add("You never stop loving someone. You either never did, or you always will.");
        englist.add("You are truly a blessing from God. Thank you for being my partner, spouse, lover, and friend.");
        englist.add("We can not predict the future, nor can we change the past, all we can do is appreciate the present and live in the moment.");
        englist.add("Be who you are and say what you feel because those who mind don’t matter and those who matter don’t mind.");
        englist.add("Its better to step back when ignored rather than waiting to be insulted.");
        englist.add("Sometimes the strongest people are the ones who love beyond all faults, cry behind closed doors and fight battles that noboday knows about.");
        englist.add("Two things define your personality, the way you manage things when you have nothing, and the way you behave when you have everything.");
        englist.add("Some people have nice eyes, some have nice smiles & others have nice faces. But you have all of them with a nice heart.");
        englist.add("Education is not the learning of facts but the training of the mind to think.");
        englist.add("You miss 100 percent of the shots you never take.");
        englist.add("No matter how great you are, not everybody will like you. That’s life.");
        englist.add("Sometimes I need someone there for me. Tired of being there for everyone else.");
        englist.add("Time is still the best answer, forgiveness is still the best pain killer and God is still the best healer.");
        englist.add("I hate staring at your name and debating whether or not to start the conversation.");
        englist.add("We never understand our home until we have left it.");
        englist.add("Success is sweet and sweeter if long delayed and gotten through many struggles and defeats.");
        englist.add("All good things come to those who wait. BUT Time and tide wait for no man.");
        englist.add("There comes a time in life when you just need to sit back and relax and focus on all the good things in your life and just put all the bad aside for awhile.");
        englist.add("Together forever we’ll never be apart, maybe in distance, but never in heart.");
        englist.add("One of the simplest ways to stay happy is to let go of all the things that make you sad.");
        englist.add("When I’m alone, I think of so many things to say to you but when I have a chance to tell you, I go speechless.");
        englist.add("The difference between earning a good living and living a good life, is enjoying what you do.");
        englist.add("Friends don’t fight because their not very close best friends fight because their like sisters!");
        englist.add("Its not about perfect. Its about living your life and doing the best you can.");
        englist.add("Don’t waste your time trying to fix your past … Because your past is already gone.");
        englist.add("Make sure the important people in your life know how important they are before it’s too late.");
        englist.add("No matter the miles between us, we always stand under the same stars.");
        englist.add("When you are thankful for what you have, you are always rewarded with more. Try to stay positive & things will get batter.");
        englist.add("If only trees would give WiFi signal, people would have planted thousands of them happily.");
        englist.add("If someone throws a stone at you, throw a flower at them. But remember to throw the flower pot with it.");
        englist.add("BIG or SMALL, Lies are Lies");
        englist.add("Learn the wisdom of compromise, for it is better to bend a little than to break.");
        englist.add("The most beautiful thing in this world is to see parents smiling and knowing that you are the reason behind that smile.");
        englist.add("I am not as good as I want to be, not as great as I will be, but thank God I’m much better than I used to be.");
        englist.add("If you’re going to make me cry, at least be there to wipe away the tears.");
        englist.add("Life has knocked me down a few times, it showed me things I never wanted to see. I experienced sadness and failures but one thing for sure. I always get up.");
        englist.add("Sometimes silence says everything louder than any words could ever be said..");
        englist.add("No matter how hard the past anyone can always begin again today.");
        englist.add("All endings are also beginnings; we just don’t know it at the time.");
        englist.add("Winners never quit and quitters never win.");
        englist.add("The happiest couples never have the same character. They have the best understanding of their differences.");
        englist.add("Forget the risk and take the fall, if its what you want, then it’s worth it all.");
        englist.add("In true love smallest distance is too great and greatest distance can be bridged.");
        englist.add("Don’t strive to make your presence noticed, but to make your absence felt.");
        englist.add("Live life to the fullest.");
        englist.add("We are who we choose to be.");
        englist.add("Look into my eyes and you’ll find me. look into my heart and you’ll find you");
        englist.add("Comparison is the best way to judge our progress but not with others, compare your yesterday with your today.");
        englist.add("If it’s wrong to love uthen my heart just wont let me be right.");
        englist.add("When someone is so sweet to you, don’t expect that they will be like that all the time bcoz even the sweetest chocolate also expires.");
        englist.add("Sometimes we make someone else our priority than those who really deserves it!");
        englist.add("Everything happens for a reason, though the reason is not always as clear as we would like it to be.");
        englist.add("If you want to be sad, live in the past. If you want to be anxious, live in the future. If you want to be peaceful, live in the NOW.");
        englist.add("Don’t wait for extraordinary opportunities. Seize common occasions and make them great. Weak men wait for opportunities; strong men make them.");
        englist.add("Don’t judge me for my choices b’coz trust me you will never understand my reasons.");
        englist.add("Happiness is not a goal, but a way of life.");
        englist.add("After the game, the king and the pawn go into the same box.");
        englist.add("Sometimes the only thing that people see is what you did. When in fact, they should be looking at why you did it.");
        englist.add("Jealousy comes from counting others blessings instead of our own.");
        englist.add("Do not allow negative people to turn you into one of them.");
        englist.add("The one you pushed away today may be the one you’re needing tomorrow.");
        englist.add("Knowing is not enough; we must apply. Willing is not enough; we must do.");
        englist.add("Take every chance. Drop every fear.");
        englist.add("Moving on doesn’t mean you forgot about things. It just means you have to accept what happened and continue living.");
        englist.add("War does not determine who is right – only who is left.");
        englist.add("Three things are needed for a good life, good friends, good food, and good song.");
        englist.add("Trust is not something you win; it’s something you build.");
        englist.add("Don’t try to dominate those who apologize for their mistakes b’coz they understand your importance more than their ego.");
        englist.add("Smiling does not necessarily mean you`re happy. Sometimes it just means you`re strong.");
        englist.add("Everything in your life is a reflection of a choice you have made. If you want a different result, make different choices.");
        englist.add("If you keep your eyes, mind, and heart open ……. love, kindness and wisdom will enter.");
        englist.add("If the relationship doesn’t make you a better person then you are with the wrong one.");
        englist.add("The key to happiness is to always have control over your emotions.");
        englist.add("If you hold on tight to what you think is your thing, you may find you are missing all the rest.");
        englist.add("Never give up on your dreams. It’s difficult to wait but it is more difficult to regret.");
        englist.add("We pick our friends and then life sorts them out.");
        englist.add("I fall, I rise, I make mistakes, I live, I learn, I have been hurt, But I’m alive. I’m human and I’m not perfect But I’m thankful.");
        englist.add("Beautiful pictures are developed from negatives in a dark room, So if you see darkness in your life be reassured that a beautiful picture is being prepared.");
        englist.add("If you are forced to choose between a relationship and a friendship, always choose the friendship. In a good relationship you wouldn’t be forced to choose.");
        englist.add("Write your sad times in sand, and write your good times in stone..");
        englist.add("Dear Past: Thank you for all the lessons you have taught me.");
        englist.add("Things will always work out if you do what you want without worrying about the consequences.");
        englist.add("Think with your head not with your heart.");
        englist.add("Be happy with what you have while working for what you want.");
        englist.add("You can only lose something that you have but you can’t lose something that you are.");
        englist.add("Cheating is easy, Try something more challenging … Like being Faithful.");
        englist.add("You can get everything in life if you will help other people get what they want.");
        englist.add("Each one has its own story. But the truth lies within you.");
        englist.add("Somebody from the left is much more likely to make a decent challenge to Chavez.");
        englist.add("Tear of your eye is most trusted than smile b’coz you can smile at any body but you can’t cry at any one without true feelings.");
        englist.add("Single doesn’t always mean lonely. Relationship doesn’t always mean happy.");
        englist.add("Man is still the most extraordinary computer of all.");
        englist.add("I wish my book of life was written in pencil. There are a few pages I would like to erase.");
        englist.add("The best proof of love is trust.");
        englist.add("Dont underestimate the power of stupid people in large numbers.");
        englist.add("If you believe strongly in something, don’t be afraid to fight for it.");
        englist.add("You can replace me but you can’t replace the memories you had with me.");
        englist.add("Nobody gets to live life backward. Look ahead, that is where your future lies.");
        englist.add("My life is like a movie. Theirs success, failure..but most of all DRAMA.");
        englist.add("Don’t condemn people b’coz they did wrong. Try to know the reason behind why they did it and try to understand them.");
        englist.add("Your time is limited. Dont waste it living someone else’s life.");
        englist.add("Love builds bridges where there are none.");
        englist.add("One of the hardest parts of life is deciding whether to walk away or try harder.");
        englist.add("When you judge someone else, It doesn’t define who they are, It defines who you are.");
        englist.add("Communication + Trust = A relationship that will last a lifetime.");
        englist.add("People can steal your ideas, but they can never come close to stealing your intellect.");
        englist.add("I learned to give not b’coz I have many but because I know exactly how it feels to have nothing.");
        englist.add("No matter what, how, where and who – you can almost always turn around and get a second chance.");
        englist.add("If someone doesn’t appreciate your presence, make them appreciate your absence.");
        englist.add("If you want something, dont wish for it. Life is too short to wait.");
        englist.add("Your mistakes should be your motivation, not your excuses.");
        englist.add("Your parents brought you up. Don’t ever bring them down.");
        englist.add("Don’t cry because of one person. Remember, there are still 6,870,135,814 people to smile to.");
        englist.add("Before going to sleep every night forgive everyone and sleep with a clean heart.");
        englist.add("God has a reason for allowing things to happen. We may never understand his wisdom but we simply have to trust his will.");
        englist.add("There is a lot of difference between human being and being human. Very few understand it.");
        englist.add("Whatever you do, good or bad, people will always have something negative to say!");
        englist.add("Junk is something you’ve kept for years and throw away few days before you need it.");
        englist.add("Fake friends are like autumn leaves, they are scattered everywhere.");
        englist.add("There are many things that I would like to say to you but I dont know how.");
        englist.add("I have no regrets in my life. I think that everything happens to you for a reason. The hard times that you go through build character, making you a much stronger person.");
        englist.add("You’re like a Pringle. Once I pop ya, I just can’t stop ya.");
        englist.add("Please remember that your greatest talent is so much more powerful than your biggest fear.");
        englist.add("It is nice to be important, but it’s more important to be NICE.");
        englist.add("I don’t need to lie. But, sometimes, I like to give the truth an extreme makeover.");
        englist.add("If you don`t dream big, there`s no use of dreaming. If you don`t have faith, there`s nothing worth believing.");
        englist.add("No one notices your tears, No one notices your sadness, No one notices your pains, but they all notice your mistakes.");
        englist.add("Im sweet like suger, soft like suade, but unlike you I never get played.");
        englist.add("Words alone do not make a relationship of any kind. Put actions of trust, honesty, kindness, empathy and strength behind them and it will last all of eternity.");
        englist.add("This is your life and its ending one minute at a time.");
        englist.add("Sometimes on the way to what’s supposed to happen, something even better happens.");
        englist.add("Sometimes you realize too late that what you’re looking for is exactly what you just let go.");
        englist.add("A Smile is the best one which is on others face but created by YOU!");
        englist.add("Enjoy the little things in life because one day you`ll look back and realize they were the big things.");
        englist.add("Eventually, you stop caring. Eventually it stops being the most important thing in your life.");
        englist.add("Happiness never comes to those who don’t appreciate what they already have.");
        englist.add("Never look back unless youre planning to go that way.");
        englist.add("Beauty catches the attention but character catches the heart..");
        englist.add("Don’t be pushed by your problems, be led by your dreams.");
        englist.add("You haven’t lost your smile at all, it’s right under your nose. You just forgot it was there.");
        englist.add("I may not have the cutest eyes, prettiest smile, gorgeous face or perfect body. But I do have a caring heart.");
        englist.add("It’s hard to accept the truth when the lies were exactly what you wanted to hear.");
        englist.add("Trust is like paper…Once it`s crumpled, it can`t be perfect again…");
        englist.add("I don’t think much, I don’t think often but when I think, I think of you.");
        englist.add("There comes a time when you need to look at who is in your life, who you want in your life, who you need in your life and who you need to get out of your life.");
        englist.add("The past can hurt. But the way I see it, you can either run from it or learn from it.");
        englist.add("I wonder how many times we forgive just because we don’t want to lose someone. Even if they don’t deserve forgiveness.");
        englist.add("Every step I took since the moment I could walk was a step towards finding you.");
        englist.add("TRUST that GOD will put the right people in your life at right time and for the right reasons.");
        englist.add("Even though I finished my test first, I wait for someone else to get up…");
        englist.add("If we have no peace, it is because we have forgotten that we belong to each other.");
        englist.add("We can’t solve problems by using the same kind of thinking we used when we created them.");
        englist.add("I dont need a perfect one. I just need someone who can make me feel that I am the only one.");
        englist.add("Be thankful for the bad things in life. For they opened your eyes to the goo things you were not paying attention to before.");
        englist.add("The only source of knowledge is experience.");
        englist.add("When you focus on problems, you will have more problems. When you focus on possibilities, you will have more opportunities. Dream, Wish, Make it happen.");
        englist.add("Whatever our souls are made of, his and mine are the same.");
        englist.add("Find a heart that will love you at your worst, and arms that will hold you at your weakest.");
        englist.add("When I started counting my blessings, my whole life turned around.");
        englist.add("I am not afraid to make mistakes. Sometimes “My Bad” works out for “My Good”.");
        englist.add("Without my phone, my life feels so empty, boring, clueless and awkward.");
        englist.add("Its time to break out of your shell and show the world who you are and what you’re really made of.");
        englist.add("What’s better than having your dreams come true, your wishes granted and your prayers answered.");
        englist.add("If you don’t care about what people think, you already passed the first step of success.");

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