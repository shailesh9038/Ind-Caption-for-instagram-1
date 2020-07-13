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

public class Wise extends Fragment {

    RecyclerView rajputlist;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    private RecyclerView.LayoutManager layoutManager;
    LinearLayout Net_connection;

    public Wise() {
        // Required empty public constructor
    }

    public static Wise newInstance(String param1, String param2) {
        Wise fragment = new Wise();
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

        englist.add("There are only two ways to live your life. One is as though nothing is a miracle. The other is as though everything is a miracle. - Albert Einstein");
        englist.add("You need Power,only when you want to do something harmful, otherwise Love is enough to get everything done. - Charlie Chaplin");
        englist.add("Busy Life Makes Prayers Harder, But Prayers Make A Hard And Busy Life Easier. So Keep Praying . :)");
        englist.add("Don’t be afraid of death, be afraid of an unlived life.");
        englist.add("Whether you live to be 50 or 100 makes no difference, if you made no difference in the world.");
        englist.add("The tongue is a sword or a magic wand, it can cut and kill or love and heal.");
        englist.add("Extraordinary: it is the 'extra' that make us more than ordinary.");
        englist.add("The secret to a rich life is to have more beginnings than endings.");
        englist.add("When you have someone special in your life, don’t ruin it by making stupid decisions.");
        englist.add("Without communication there is no relationship. Without respect there is no LOVE. Without trust there is no reason to continue.");
        englist.add("Treat your parents with loving care… You will only know their value, when you see their empty chair");
        englist.add("Everything in life is temporary. So if things are going good, enjoy it because it won't last forever. And if things are going bad, don't worry. It cannot last forever either. :)");
        englist.add("Don’t wait for the Last Judgment. It happens every day.");
        englist.add("Our dreams inspire us to live life to the fullest, our sorrows guide us in learning and accepting who we are, wisdom is what we achieve from experiencing both.");
        englist.add("Some people come in your life as blessings, others come in your life as lessons.");
        englist.add("People are made to be loved & things are made to be used, But the confusion in this world is that people are used & the things are loved.");
        englist.add("Alone doesn`t mean lonely, lonely doesn`t have to be alone.");
        englist.add("God is the best listener and you don’t need to shout, nor cry out loud. Because he hears even the very silent prayer of a sincere heart.");
        englist.add("The happiest people in this world are not those who have NO PROBLEM, but those who learn to live with things that are less than PERFECT.");
        englist.add("A person needs 3 things to be truly happy in this world: someone to love, something to do & something to hope for.");
        englist.add("Dear GOD, no matter what happens give me the heart that is willing to obey you whatever the cost may be.");
        englist.add("If past is written with memories of regret & sorrows. Then close the book.");
        englist.add("Win as if you were used to it, lose as if you enjoyed it for a change.");
        englist.add("Remember, You are unique, but then again so is everyone else in this world.");
        englist.add("Go for someone who is not only proud to have you but will also take every risk just to be with you.");
        englist.add("Don't be sad if a person prefers another person over you. Because You can't convince a monkey that honey is sweeter than a banana.");
        englist.add("Don't let your victories go to your head, or your failures go to your heart.");
        englist.add("Laugh when you can, Cry when you need to, Apologize when you should, Forgive what needs to be forgiven and then move on from past mistakes.");
        englist.add("?Anybody can Love a Rose, but it Takes a Great Deal to love a leaf. Don't love Some one Who is Beautiful, but Love the one who can make your Life Beautiful.");
        englist.add(" someone has something bad to say about you, it's probably because they have nothing good to say about themselves.");
        englist.add("The real art of conversation is not only to say the right thing at the right time. But also to leave the wrong thing unsaid at the most tempting Moment.:)");
        englist.add("You can’t lose what you never had, you can’t keep what’s not yours & you can’t hold on to something that does not want to stay.");
        englist.add("`t run from your fears, when they catch up with you, you`ll be too tired to fight.");
        englist.add("You'll never realize the value of what you have, until what you have is no longer yours.");
        englist.add("If you are depressed, you are living in the past. If you are anxious, you are living in the future. If you are at peace, you are living in the present.");
        englist.add("Never stop learning, because life never stops teaching.");
        englist.add("The busy man is never wise and the wise man is never busy.");
        englist.add("Honesty is the first chapter in the book of wisdom.");
        englist.add("It does not matter that people don’t notice the good that you do. What matter is that ALLAH notices it. Never forget that.");
        englist.add("NEVER get attached to anyone nor anything, because attachments leads to expectations and expectations leads to disappointments.");
        englist.add("If others are jealous, you are doing something right.");
        englist.add("Don't be a fake. Because everyone likes the original.");
        englist.add("I think of you in colours that don`t exist.");
        englist.add("Nothing in the world is ever completely wrong. Even a stopped clock is right twice a day.");
        englist.add("Happiness can't be found when you seek it for yourself, But when you give it to others it finds its way back to you that is the mystery of happiness. It grows when shared.");
        englist.add("Choose your life’s mate carefully: from this one decision will come 90% of your happiness or misery.");
        englist.add("Don't waste your time with people who don't want to be in your life for whatever reason but enjoy it with the people who want to be there for every reason.");
        englist.add("Experience is what you get when you dont get what you want.");
        englist.add("Money should be used, and people loved, instead money is loved, and people used.");
        englist.add("Happiness comes when you believe in what you are doing, know what you are doing, and love what you are doing.");
        englist.add("Everything has its beauty, but not everyone sees it.");
        englist.add("As soon as the fear approaches near, attack and destroy it. - Chanakya");
        englist.add("Don't let yourself be controlled by these three things: your past, people, and money.");
        englist.add("Its impossible to please everyone so I suggest we all stop trying.");
        englist.add("Imagination is more important than knowledge. - Albert Einstein");
        englist.add("Never look down on someone unless you are helping him up.");
        englist.add("Respect old people: they graduated highschool without Google or Wikipedia!");
        englist.add("Never take a shortcut in life, take the long route because you pick up more experiences on the way.");
        englist.add("When you pray for others, God listens to you and blesses them, so when you are safe and happy, remember that someone is praying for you.");
        englist.add("What you are is what you have been. What you’ll be is what you do now..");
        englist.add("The biggest mistake you'll ever make, are the risks you didn't take.");
        englist.add("Cutting my wings won`t keep me safe,it will make me fall when i try to reach the sky.");
        englist.add("Problems are not to be feared in life, for they are merely opportunities in disguise, meant to test you, smarten you and strengthen you inside.");
        englist.add("Don't feel bad if people remember you only when they need you. Feel privileged that you are like a candle that comes to their mind when there is Darkness... :)");
        englist.add("A person who never makes mistakes never makes anything.");
        englist.add("Live your life for God and God will lead your life to a world full of love and true happiness.");
        englist.add("Each pain makes you more strong, each betrayal more intelligent, every disappointment more skillful and each experience more wise.");
        englist.add("Never Blame any Day in Your Life. Good Days Give you Happines. Bad days Give you Experience. Both are Essencial in Life.");
        englist.add("Our prime purpose in this life is to help others. And if you can't help them, at least don't hurt them.");
        englist.add("When the past calls, let it go to voicemail.. it`s got nothing new to say.");
        englist.add("Only the wisest and the stupidest of men never change.");
        englist.add("One negative thought can burn all positive thoughts.");
        englist.add("Don't make friends before understanding and Don't break friendship after Misunderstanding!");
        englist.add("A person should not be too honest. Straight trees are cut first and Honest people are screwed first. - Chanakya");
        englist.add("The greatest barrier to success is the fear of failure.");
        englist.add("Live each day as if your life had just begun.");
        englist.add("Everything comes to you in the right moment. Be patient.");
        englist.add("Life is too short to waste your time on people that treat you bad, so give your love to the people who deserve it and treat you the way you should be treated!");
        englist.add("Always laugh when you can. It is cheaper than medicine.");
        englist.add("Great things never come from comfort zones.");
        englist.add("Behind every mistake there is always a lesson…");
        englist.add("Treat women the same way you would want your daughter to be treated.");
        englist.add("When you teach your son, you teach your son's son. - The Talmud");
        englist.add("Time is never wasted, if you are wasted all the time.");
        englist.add("Believe Half of what you see And None of what you hear.");
        englist.add("Life doesn't give you what you want. It gives you what you work for.");
        englist.add("Never look back unless you're planning to go that way.");
        englist.add("If they can`t swallow facts, let them eat fiction.");
        englist.add("A female can be your best friend and worst enemy. It all depends on how you treat her.");
        englist.add("Run with your dreams and follow your passions. Make things happen. Change courses. This will lead you to your destiny.");
        englist.add("The more you know, the less you need to show.");
        englist.add("R.I.P to the millions of people who die every day and don’t get recognized.");
        englist.add("Always forgive your enemies; nothing annoys them so much.");
        englist.add("A big laugh and a long sleep are the 2 best cures of everything.");
        englist.add("The best way to succeed in life is to act on the advice we give to others.");
        englist.add("Work eight hours and sleep eight hours and make sure they are not the same eight hours.");
        englist.add("Never bottle in anything it makes the whole situation your in worse..");
        englist.add("God's plan is like a movie. All the good and bad things are arranged together for the good ending.");
        englist.add("Hope is the power that gives a person the confidence to step out and try.....");
        englist.add("Sometimes the right one for you is the one who was there the whole time.");
        englist.add("Dear GOD, Thank you for being there when noboy else was.");
        englist.add("Always do what you want never mind what others say, because if you do it or not people always have something to say.");
        englist.add("GOD always gives his best to those who leave the choice with him.");
        englist.add("A wise man can learn more from a foolish question than a fool can learn from a wise answer.");
        englist.add("If you educate a man you educate a person, but if you educate a woman you educate a family.");
        englist.add("That moment you were so stressed then you suddenly feel fine just because you prayed.");
        englist.add("Work for a cause, not for applause. Live Life to express not to impress. Don't strive to make your presence noticed, just make your absence felt.");
        englist.add("Life is like riding a bicycle. To keep your balance, you must keep moving.");
        englist.add("Never play with the feelings of others because you may win the game but the risk is that you'll surely lose the person for lifetime.");
        englist.add("The fear of death follows from the fear of life. A man who lives fully is prepared to die at any time.");
        englist.add("Life is an echo.. all comes back, the good, the bad, the false, and the true. So, give the world the best you have and the best will come back to you. :)");
        englist.add("Your beliefs don’t make you a better person, your behavior does.");
        englist.add("Laugh as much as you breathe and love as long as you live.");
        englist.add("A candle loses nothing by lighting another candle.");
        englist.add("All of us could take a lesson from the weather. It pays no attention to criticism.");
        englist.add("Never test the depth of the water with both feet.");
        englist.add("If you are not dying to live, you are just living to die.");
        englist.add("Do not give up, the beginning is always the hardest.");
        englist.add("Everything you do makes a difference, but it is up to you to decide what kind of difference you want to make.");
        englist.add("The best feeling in the world is realizing you're perfectly happy without the thing you thought you needed the most.");
        englist.add("[Name] says... Time is your most precious gift, you only have a set amount of it. Time is your life. That is why the greatest gift you can give someone is your time.");
        englist.add("Soft speech, clean heart, Peaceful eyes, focused mind and determined decisions always makes you THE WINNER.");
        englist.add("Never forget the three powerful resources you always have available to you: love, prayer, and forgiveness.");
        englist.add("Don`t be a fake. Because everyone likes the original.");
        englist.add("Words can change your feeling. But actions can change your whole life.");
        englist.add("There are many things in life that will catch your eye, but only a few can catch your heart.");
        englist.add("Live without pretending, Love without depending, Listen without defending, Speak without offending.");
        englist.add("Sometimes people have to cry out all their tears, to make room for a heart full of smiles.");
        englist.add(" happiest of people do not necessarily have the best of everything, They just make the most of everything they have.");
        englist.add("You will always meet problems in life. If you can handle it well, it will make you stronger.");
        englist.add("Dont talk if you dont have any good thing to say");
        englist.add("The greatest mistake you can make in life is to be continually fearing you will make one.");
        englist.add("Real people are never fake, and fake people are never real.");
        englist.add("Everyday is a gift, that's why they call it the present.");
        englist.add("The mind is like a parachute. It doesn't work unless it's open.");
        englist.add("Like birds, let us, leave behind what we don't need to carry.. Grudges, Sadness, Pain, Fear and Regrets. Life is beautiful, Enjoy it.");
        englist.add("NEVER underestimate GOD’s hand in all your plans.");
        englist.add("When the character of a man is not clear to you, look at his friends.");
        englist.add("Every morning, every moment, always remember that our God is GOD OF LOVE.");
        englist.add("5 things you can't recover in life; 1) A stone after its thrown. 2) A word after its said. 3) An occasion after its missed. 4) Time after its gone. 5) Trust after its lost.");
        englist.add("The reason people have No room for wisdom iz because they are so full of judgment.");
        englist.add("An educated man is one who knows a lot and says nothing about it.");
        englist.add(" the life you love, Love the life you live. The past is the past look forward to the future and live for the present.");
        englist.add("Got to have big hopes before you capture your dreams.");
        englist.add("The definition of being stupid: seeing the truth, knowing the truth, and choosing to still believe the lies…");
        englist.add("All your lies made it that much easier to see the truth.");
        englist.add("Dreams can be real if you see them through your heart and not through your brain.");
        englist.add("God often removes a person from your life for your protection. Think about that before you go running after them.");
        englist.add("Cheer up, tomorrow will be a better day, just believe!");
        englist.add("Love the people who treat you right, Pray for the ones who don't. Life is ten percent what you make it, and ninety percent how you take it .");
        englist.add("Sometimes you have options, but no choice.");
        englist.add("Losing an illusion makes you wiser than finding a truth.");
        englist.add("Life is a festival only to the wise.");
        englist.add("Good friends, good books, and a sleepy conscience: this is the ideal life. - Mark Twain");
        englist.add("Give thanks to the LORD in all things. Thank You LORD for giving me life and giving me a chance to live with purpose.");
        englist.add("People are made to be loved and things are made to be used, But the confusion in this world is that people are used and the things are loved.");
        englist.add("Once you start a working on something, don't be afraid of failure and don't abandon it. People who work sincerely are the happiest. - Chanakya");
        englist.add("Not everything is meant to last forever, so enjoy every moment as it happens.");
        englist.add("Accept that you have lost, but never accept that you have failed.");
        englist.add("Best way to deal with haters, Keep calm, and stay classy..");
        englist.add("No matter how far wrong you have gone. You can always turn around.");
        englist.add("We all need mirrors to remind ourselves who we are.");
        englist.add("Yesterday is history, tomorrow is a mystery, today is a gift, so don't live in history and don't live in mystery, live for today.");
        englist.add("Life is like race between cat and rat. But rat mostly wins because cat runs for food and rat runs for life. Always remember purpose is more important then need.");
        englist.add("People who gossip with you, most likely gossip about you.");
        englist.add("Sometimes no matter how much you try to speak your heart out, words are not just enough to describe how you truly feel.");
        englist.add("Work like you don't need the money, love like you've never been hurt and dance like no one is watching. - Randall G Leighton");
        englist.add("Never forget what a man says to you when he is angry.");
        englist.add("You can never make the same mistake twice, because the second time you make it, its not a mistake, its a choice..");
        englist.add("Learn to appreciate what you have, before time makes you appreciate what you had..");
        englist.add("It takes a strong person to say sorry and an even stronger person to forgive.");
        englist.add("Life is a lesson you'll learn it when you're through.");
        englist.add("Classic book is a book which people praise, but do not read.");
        englist.add("It might take awhile, but eventually you`re going to find the good in goodbye.");
        englist.add("Sometimes no matter how many prayers we pray, or how many tears we shed, or how many hearts get broken. God says no, because God has a better way and answer.");
        englist.add("Patience is not the ability to wait, but the ability to keep a good attitude while waiting.");
        englist.add("Don't waste your time on a guy that isn't willing to waste his time on you.");
        englist.add("Beauty is power; a smile is its sword..");
        englist.add("?'Discussion Is The Way For Gaining Knowledge' and 'Argument Is The Way For Gaining Enemies.'");
        englist.add("Some of the best lessons we ever learn we learn from our mistakes and failures. The error of the past is the wisdom of the future.");
        englist.add("Success depends on where intention is. - Gita Bellin");
        englist.add("Don’t let your victories go to your head, or your failures go to your heart.");
        englist.add("Stop being afraid of what could go wrong and start being positive about what could go right.");
        englist.add("Either you control your attitude or it controls you..");
        englist.add("Knowledge is realizing that the street is one-way, wisdom is looking both directions anyway.");
        englist.add("Start by doing whats necessary, then do whats possible and suddenly you are doing impossible.");
        englist.add("More people would learn from their mistakes if they weren't so busy denying them.");
        englist.add("You can never invite the wind, but you must leave the window open.");
        englist.add("History is life's rear view mirror. It allows us to briefly look back and learn from our past so we can adjust our future positively and not repeat mistakes.");
        englist.add("Its OK to cry if you are in pain. Remember tears are prayers too. They travel to GOD when we can’t speak.");
        englist.add("Forgive but dont forget otherwise you might make the same mistake again.");
        englist.add("When life puts you in tough situations don't say 'WHY ME?', just say 'TRY ME'.");
        englist.add("Prayer is the key to all the treasures of this life and the hereafter.");
        englist.add("Don't sacrifice yourself too much, because if you sacrifice too much theres nothing else you can give and nobody will care for you.");
        englist.add("Telling your parents something funny, but it turns into a life lesson…");
        englist.add("It`s quite ironic that in life, the person that brings out the best in you and makes you strong.. is actually your weakness.");
        englist.add("Behind every stong soldier, there is an even stronger woman who stands behind him, supports him, and loves him with all her heart.");
        englist.add("Life is too short to stress yourself with people who don’t even deserve to be an issue in your life.");
        englist.add("Be yourself. People may or may not like you, but it's important that you stay true to who you are..");
        englist.add("If you want to live a happy life, tie it to a goal, not to people or things.");
        englist.add("Even if a snake is not poisonous, it should pretend to be venomous. - Chanakya");
        englist.add("Remember that everything that had happened in the past is either a lesson or a blessing.");
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