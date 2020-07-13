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

public class Change_fragment extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Change_fragment() {
        // Required empty public constructor
    }

    public static Change_fragment newInstance(String param1, String param2) {
        Change_fragment fragment = new Change_fragment();
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

        englist.add("Life is about changing for the better, to become the best. If you have to let go of some people along the way, go right ahead.");
        englist.add("Change is the law of life. And those who look only to the past or present are certain to miss the future!");
        englist.add("I wanted to change the world. But I have found that the only thing one can be sure of changing is oneself.");
        englist.add("Growth means change and change involves risk, stepping from the known to the unknown.");
        englist.add("Faith changes everything. It changes your outlook and it changes your life.");
        englist.add("Life is all about the little decisions you make everyday. You can't change the decisions of the past, but every new day is another opportunity to make the right ones.");
        englist.add("People who are crazy enough to think they can change the world, are the ones who do.");
        englist.add("The 3 C's of life: choices, chances, and changes. You must make a choice to take a chance or your life will never change.");
        englist.add("Without change nothing would grow, and without growth nothing would survive.");
        englist.add("Things change. And friends leave. Life doesn't stop for anybody");
        englist.add("Memories fade. And stories change. It all circles back to this thing called LIFE.");
        englist.add("Be yourself, don't change being you for anyone, if they don't like you for who you are then they don't deserve to be in your life. You are you and you can't be anyone different.");
        englist.add("Memories can change the future, but the future can't change memories.");
        englist.add("Focus on the things you can change and let go of the things you can't.");
        englist.add("To change your life, you need to change your priorities.");
        englist.add("Some things in life you have to accept because you have no control over it. Other things you can change because you have the control. You just have to figure out what's worth fighting for.");
        englist.add("Don't sit around and try to change your past, when you have your entire future to look forward to.");
        englist.add("No one can change a person, but someone can be a person's reason to change");
        englist.add("People change and often they become the person they said they will never be.");
        englist.add("If you change the way you look at things, the things you look at change");
        englist.add("Don t worry, If nothing happens it could be because of things will get better or it s better that it really should not happen.");
        englist.add("Always remember, you may not be able to reach what's in front of you, until you let go of what's behind you.");
        englist.add("If someone breaks your heart, just punch them in the face. Seriously, just punch them in the face and go get some ice cream");
        englist.add("Maybe sometimes people don't change; maybe you just never really knew who they were.");
        englist.add("Not everything that is faced can be changed, but nothing can be changed until it is faced");
        englist.add("Your life does not get better by CHANCE It gets better by CHANGE");
        englist.add("No matter how much you change you still have to pay the price for the things you've done. So I got a long road. But I know I'll see you again, this side or the other.");
        englist.add("I've learned that things change, people change, and it doesn't mean you forget the past or try to cover it up; it simply means that you move on and treasure the memories. Letting go doesn't mean giving up, it means accepting that some things weren't meant to be.");
        englist.add("people need to start excepting that the past is the past and there's no then you can do to change it. yes people mess up but that life you live an u learn");
        englist.add("Every human is a combination of spirit and matter. You can change the form but you can't change the essence.");
        englist.add("Great changes may not happen right away, but with effort even the difficult may become easy.");
        englist.add("When you have to start compromising yourself or your morals for the people around you, it's probably time to change the people around you!");
        englist.add("I never changed, I just finally got tired of pretending to be happy");
        englist.add("Don't ever change just to impress and please someone. Change because it makes you a better person and it leads you to a better future.");
        englist.add("Everything changed in the blink of an eye. Everything happens for a reason, but only God knows why.");
        englist.add("Sometimes you've got to embrace the unexpected. The things we never saw coming often take us to the places we never imagined we could go. Take responsibility of your own life, and it will give you the power to make changes.");
        englist.add("A certain situation can change things in a way you never imagine.");
        englist.add("Laugh when you can, apologize when you should, let go of what you can't change. Life's too short to be anything.....but happy.");
        englist.add("I never changed, I just grew up.");
        englist.add("Screw second chances...People never changes");
        englist.add("Strength comes from within. At the end of the day, you are always by yourself. If you want to make a change, it's up to you and only you.");
        englist.add("Things can change faster then they even happen");
        englist.add("Change is not easy, but it is simple. Things will always change, we don't have a choice about that... but we do have a choice on how we react to change~");
        englist.add("Remember that no matter where you are, it is there that you are supposed to be. Today is not a result of yesterday nor will tomorrow be a result of today, everyday is simply the result of God's intention for your life. You can't change fate but you can change the way you handle it.");
        englist.add("Life can either be accepted or changed. If it is not accepted, it must be changed. If it cannot be changed, then it must be accepted");
        englist.add("You can't change people, either you accept who they are or start living life without them.");
        englist.add("Things change. People change.");
        englist.add("Everything changes. We plant trees for those born later");
        englist.add("If you're going to stay, stay forever. If you're going to leave, then do it today. If you're going to change, change for the better. And if you're going to talk, make sure you mean what you say.");
        englist.add("WORDS CAN BE CHANGED.............BUT MEMORIES CAN NOT");
        englist.add("Remember, when people leave, it's either because they've changed, or you've changed.");
        englist.add("The more you resist change, the more it will be painful for you to accept it.");
        englist.add("You cannot expect miracles to happen overnight. Be patient, be loving and little by little the change you seek will come.");
        englist.add("What makes you Different, Makes you Special. Don't ever change to fit someone else's needs.");
        englist.add("Just like seasons, people change.");
        englist.add("You can't get where you want in life, if you don't make the necessary strides of change.");
        englist.add("I choose to live by choice, not by chance. To make changes, not excuses. To be motivated, not manipulated. To be useful, not used. To excel, not compete. I choose self-esteem, not self pity. I choose to listen to my inner voice, not the random opinions of others.");
        englist.add("Your Life Doesn't Get Better By Chance , It Gets Better By Change");
        englist.add("Make Your Smile Change the World - But Don't Let the World Change Your Smile");
        englist.add("Our destiny changes with our thought; we shall become what we wish to become, do what we wish to do, when our habitual thought corresponds with our desire");
        englist.add("The past cannot be changed. The future is in your power.");
        englist.add("open yourself to change, but do not let go of your values!");
        englist.add("Money doesn't change who people are, it just amplifies their personality.");
        englist.add("Every day you need to look yourself in the eye and ask yourself if this is what you should be doing with your life.");
        englist.add("The most common way people give up their power is by thinking they don't have any. There are two ways of meeting difficulties. You alter the difficulties or you alter yourself to meet them.");
        englist.add("DON'T FEAR CHANGE....CHANGE FEAR");
        englist.add("I've finally realized that I have to just learn from the past and know that change isn't always bad thing even if it hurts sometimes.");
        englist.add("I can't change the direction of the wind, but I can adjust my sails to always reach my destination.");
        englist.add("I didn't change I just have less people in my heart .");
        englist.add("Realize that life isn't always fair. Accept what you must, and change what you can.");
        englist.add("Change is a Process, Not an Event...");
        englist.add("Don't think for a second your back won't be stabbed, because people change, and feelings fade, but don't worry new friendships are made.");
        englist.add("Every exit is an entry somewhere else. Live, learn, and let go. Don't hold yourself down with the changes you cant control.");
        englist.add("I think that the only reason people hold onto memories so tight is because memories are the only things that don't change; when everybody else does.");
        englist.add("Accept whatever changes that life throws at you because the day will come when there are no changes.");
        englist.add("All you need to change is will.");
        englist.add("some people never change, some games never end... they keep coming back not realizing its well over. Trying to crawl under your skin again, bring you down, twist thoughts in your head, make you frown.... hope you will take the bait and fall into their trap of manipulation to gain control. Sorry, you don't matter anymore. Your words will not affect me, your games I will not play, I will not listen to what you say. I will never go back to your self-imposed hell. I braved three storms to leave you As hard as you still try, no, I will never be knocked down. You will never be close enough to hurt me.....so let go.");
        englist.add("If you cease to be responsible for yourself your fate will also change hands.");
        englist.add("Our bodies change our minds, and our minds can change our behaviour, and our behaviour can change our outcomes.");
        englist.add("you reap what you sow, if you don't like what you're getting then change your behaviour and get a different result");
        englist.add("Everyone says I've changed, but I've only just starting acting like myself.");
        englist.add("I wanted everything to stay the same, but feelings fade & people change.");
        englist.add("It's never too late to be who you might have been.");
        englist.add("Ever noticed how day by day nothing changes and then we look back and nothing is the same.");
        englist.add("Don't let the things you can't change stop you from changing the things you can change");
        englist.add("When you can no longer change the situation you're in...remove yourself from the situation.");
        englist.add("Don't try to make people change pray for them and let God do the changing");
        englist.add("When someone special walks into your life and changes things for the better, don't let them walk away.");
        englist.add("Life is change. Growth is optional. Choose wisely.");
        englist.add("People change for two reasons... Either, they learn enough that they want to... Or they've been hurt enough that they have to...");
        englist.add("Life is based on perception. Perception is based on opinion. Opinion is based on thought. Thought comes from the mind. Change your mind, change your life.");
        englist.add("What a shame, what a shame, to judge a life that you can't change");
        englist.add("Only you can change your life. No one can do it for you.");
        englist.add("Flexibility is an essential ingredient to building a more robust, tough and resilient you. You got to be able to adjust, adapt, change and thrive no matter what circumstance you find yourself in. Be awesome, be tough and be resilient.");
        englist.add("It's funny how one moment can change a million after it");
        englist.add("Don't judge the way I am, until you know my story.");
        englist.add("Don't exchange what you want most for what you want for the moment.");
        englist.add("I am in the world to change the world.");
        englist.add("To finally move on and start something new, you must release the unchangeable past and embrace your future.");
        englist.add("If Nothing ever Changed, There'd Be No Butterflies.");
        englist.add("The only reason people hold on to memories so tight is because they're the only things that don't change when everything else does.");
        englist.add("No matter how much you change, you still got to pay the price for the things you've done.");
        englist.add("When you think people change, think again...it's not always that they have changed, it's that you never even knew who they really were");
        englist.add("When you look into a mirror, and don't know the person whose looking back at you, its time to change.");
        englist.add("Life doesn't change, but people do. So learn to accept that not everybody is who you thought you knew.");
        englist.add("One of the biggest lessons that I have learned in this life is how futile it is to fight inevitability. Life is change; if we stop changing, we stop growing. Life is never going to go exactly the way that you want it to. Something is always waiting to pop up and bite you. The more that you attempt to make life go your way the more that it won't. Your life will be so much more peaceful and smooth if you just learn to stop swimming upstream.");
        englist.add("When people tell you you've changed, it's only because you stopped acting the way they want you to act.");
        englist.add("People don't change, their priorities do.");
        englist.add("You can't change how people feel about you, so don't try. Just live your life and be happy.");
        englist.add("If you accept the expectations of others, especially the negative ones, then you will never change the outcome.");
        englist.add("Things change before you even realize what you had.");
        englist.add("You can't change the truth, but the truth can change you.");
        englist.add("Nothing is worse than missing an opportunity that could have changed your life.");
        englist.add("Life doesn't come with a remote. You have to get up and change it yourself.");
        englist.add("Don't you hate it when things change just when you started loving the way things are now?");
        englist.add("Understand that people change and sometimes they're no longer compatible with our lives. We just have to learn to accept it and move on.");
        englist.add("Don't be too organized for your future. Life is unpredictable. Things change.");
        englist.add("When somebody says you've changed, it's only because you stopped living your life their way.");
        englist.add("You can change your mind but you can never change what's inside your heart");
        englist.add("If you keep doing the same thing, you'll keep getting the same result. Change inspires change.");
        englist.add("Some people don't really change much... They just get better at making people believe they have...");
        englist.add("To many days i wonder what i could have done in the past, to change who i am today.");
        englist.add("Things in life are going to change. It's not about the changes it's about how you react to these changes, accept these changes and understand things change for a reason and usually it's for the better.");
        englist.add("Before you utter a complaint, remember someone didn't wake up today. Change your complaint to a praise.");
        englist.add("There are two reasons why people change. First, they've learned a lot. Second, they've been hurt too much.");
        englist.add("You change for two reasons: either you learn enough that you want to or you've been hurt enough that you have to.");
        englist.add("People change, stuff goes wrong, but just remember, life goes on.");
        englist.add("Before you try to change others, remember how hard it is to change yourself.");
        englist.add("Everything happens for a reason and people change like the seasons.");
        englist.add("The key to change is to let go of fear.");
        englist.add("If it doesn't challenge you, it won't change you.");
        englist.add("You were born with the ability to change someone's life, don't waste it.");
        englist.add("remember...... change your surroundings before they change you");
        englist.add("People don't change because you want them to. People change because they want to. They have to find that desire to change on their own and in their own time.");
        englist.add("I don't think people change who they are but become who they want to be.");
        englist.add("You can't change people.");
        englist.add("Just because you turn your back doesn't mean your shadow has to change.");
        englist.add("Anger, resentment and jealousy doesn't change the heart of others, it only changes yours.");
        englist.add("Every encounter is an opportunity. If we always do what we've always done, we'll always get what we've always got. Life is all about change.");
        englist.add("The hardest choice in life is usually between what you want, and what you deserve.");
        englist.add("You can't always change someone. Sometimes ,you have to either accept who they are, or learn to live without them.");
        englist.add("Accept what you can't change - change what you can't accept.");
        englist.add("There are two types of PAIN in this world. PAIN that hurts you. PAIN that changes you...");
        englist.add("people don't really let us down, it's what we think of them that does. and no matter how much we try, we cannot change that, we cannot change them.");
        englist.add("in life we cant change people the only thing we can do is change who we allow in our circle, if they are true & real then there worth staying if not tell them keep it moving.");
        englist.add("Don't be afraid of change. You may end up losing something good, but you'll probably end up gaining something so much better.");
        englist.add("Weaknesses are to be managed, not changed. Instead of focusing on what was left out, concentrate on what was left in.");
        englist.add("Never doubt that a small group of thoughtful, committed, citizens can change the world. Indeed, it is the only thing that ever has");
        englist.add("Change is something that many people fear, but we never should really fear if the change is for the better.");
        englist.add("It takes years to build up trust and only seconds to destroy it.");
        englist.add("Have patience. All things change in due time. Wishing cannot bring autumn glory or cause winter to cease");
        englist.add("One of the happiest moments ever is when you feel the courage to let go of what you can't change.");
        englist.add("You can stand there thinking, if only, or you can go and take charge and change it.");
        englist.add("Your past has passed. Nothing will change it. You're only hurting yourself with your bitterness.");
        englist.add("Don't let regrets paralyze your present, it's time to accept what is instead of what could have been.");
        englist.add("Holding on to the unchangeable past is a waste of energy and serves no purpose in creating a better future.");
        englist.add("True life is lived when tiny changes occur.");
        englist.add("Once in a lifetime, you meet someone who takes your breath away. Not because you want them too, but because they were meant to, and that person will change your life forever.");
        englist.add("One of the most beautiful things about life is that you can make it better.");
        englist.add("There's going to be a lot of changes in your life. It's not the changes that matter. It's how you react to the changes. That's what makes you who you are.");
        englist.add("Sometimes we just need someone to show us something we can't see for ourselves, then we change forever.");
        englist.add("Two things define your personality, the way you manage things when you have nothing.. The way you behave when you have everything...");
        englist.add("You can't change the past, but you can learn and start it again.");
        englist.add("Today is that Tomorrow that we thought about yesterday.");
        englist.add("Change is hard because people overestimate the value of what they have and underestimate the value of what they may gain by giving that up");
        englist.add("Let go, forget the burdens of the past. The past can't be changed.");
        englist.add("Change will always come, not because it has to, not because it wants to, but because it's necessary.");
        englist.add("Change is not merely necessary to life - it is life.");
        englist.add("Sometimes it takes the worst pain to bring about the best change.");
        englist.add("You can suffer the pain of change or suffer remaining the way you are.");
        englist.add("People change. Friends become enemies. Things go wrong, but life goes on.");
        englist.add("I believe everything happens for a reason. People change so that you can learn to let go, things go wrong so that you appreciate them when they're right, you believe lies so you learn to trust no one but yourself, and sometimes good things fall apart so better things can fall together.");
        englist.add("Life is about change, sometimes it's painful, sometimes it's beautiful, but most of the time its both.");
        englist.add("Many people have told me I've changed. But the truth is... I think I've just found myself.");
        englist.add("People never change. They just become more of who they really are");
        englist.add("Regretting is only a waste of time. if something happened, accept that it happened and there is nothing that can be done to change it. just be happy that it is not yet the end of the world.");
        englist.add("There are some things that can't be changed and there are some situations where an apology won't be able to change a thing. The twist of fate can bring people together and  everything happens for a reason' can tear them apart.");
        englist.add("I've learned that things change, people change, and it doesn't mean you forget the past or try to cover it up. It simply means you move on and treasure the moments.");
        englist.add("Pain can change you, but that doesn't mean it has to be a bad change. Take that pain and turn it into wisdom.");
        englist.add("Life is too short, laugh when you can, apologize when you should, and let go of the things you cannot change.");
        englist.add("Everyone has those nights when you lay down and just think about those moments in life, you would do anything to re-live...");
        englist.add("Change is nature, the part that we can influence, and it starts when we decide.");
        englist.add("Making a big life change is scary. But do you know what's even scarier? Regret.");
        englist.add("Wishing to change the past is only wishing to change who you are now");
        englist.add("Change your thoughts and you change your world.");
        englist.add("Sometimes what hurts so bad is too hard to talk about.");
        englist.add("Don't exchange what you want the most for what you want at the moment");
        englist.add("To change reality let reality change you");
        englist.add("I wanted to change the world - but I found that the only thing one can be sure of changing is oneself");
        englist.add("People hold on to memories because unlike people, they never change.");
        englist.add("One kind word can change someones entire day");
        englist.add("I cannot predict the future, i cannot change the past, I have just this moment... I will live it like my last.");
        englist.add("Find something good within your life and give every ounce of positivity you have towards it, then watch how your life changes.");
        englist.add("Everything you need right now is inside of you. Change your beliefs and you change your life.");
        englist.add("Never let your feelings get too deep, people can change at any moment.");
        englist.add("You CANT change your past, but you CAN change your future");
        englist.add("Worrying will never change the outcome.");
        englist.add("To change your life, you have to change yourself. To change yourself, you have to change your mindset.");
        englist.add("The world hates change, yet it is the only thing that has brought progress.");
        englist.add("When we are no longer able to change a situation, we are challenged to change ourselves");
        englist.add("You can never change people, they are who they are, accept that. But you can always change how you feel about them.");
        englist.add("Nothing happens until the pain of remaining the same outweighs the pain of change.");
        englist.add("Pain doesn't just show up in our lives for no reason. It's a sign that something in our lives needs to change.");
        englist.add("Don't ever be afraid of change. Always remember, God will never take anything away from you without the intention of replacing it with something much better.");
        englist.add("Seeing people change isn't what hurts. What hurts is remembering how they used to be.");
        englist.add("It's funny how a single decision can change entire course of your life and it turns you into what you never wanted to be.");
        englist.add("Understand that not everything is meant to be understood. Live, let go, and don't worry about what you can't change.");
        englist.add("Don't be afraid of change. You may lose something good, but you'll gain something even better.");
        englist.add("Don't make excuses. Make changes...");
        englist.add("There's no way to change the past. Things have already happened, you must learn to accept it.");
        englist.add("No one can change the way I am ,I will never allow certain people , to bring me down to their level.");
        englist.add("Its funny how when you go through the year nothing seems to change... but when you look back everything is different.");
        englist.add("You can't change how people treat you or what they say about you. All you can do is change how you react to it.");
        englist.add("People change, even when they don't want to.");
        englist.add("When things break, it's not the actual breaking that prevents them from getting back together again. It's because a little piece gets lost - the two remaining ends couldn't fit together even if they wanted to. The whole shape has changed");
        englist.add("We change emotions. We're happy when something good happens, we're sad when something sad happens, and we're mad when something bad happens. Life goes along with these feelings. We shouldn't be stopping it, sometimes these feelings are the things that we need to feel.");
        englist.add("When we hit our lowest point, we are open to our greatest change.");
        englist.add("Don't change the way you are just to make somebody happy.");
        englist.add("You can't change what's happened in your past, so before you let it destroy your future; learn to live with it");
        englist.add("There's two days in every week you can't worry about. YESTERDAY & TOMORROW. You can't change what happened yesterday and can't control what will happen tomorrow. SO LIVE FOR TODAY!!");
        englist.add("Day by day, nothing really changes. Yet when you look back, everything seems different.");
        englist.add("You cannot change what you refuse to confront.");
        englist.add("If you think life is not fair, change it your way.");
        englist.add("All progress stems from change, but all change is not necessarily progress.");
        englist.add("no one can change a person but someone can be the reason for that person to change");
        englist.add("Time passes. Memories fade. Feelings change. People leave. But hearts never forget.");
        englist.add("Life is unpredictable, it changes along with every individual. Today you have and tomorrow you may not have, be thankful for the good that stays with you.");
        englist.add("Friends that don't accept you for who you are, aren't really your friends. Your true friends will never try to change you.");
        englist.add("People can change, but they have to want to change. You can't force them to change.");
        englist.add("Your life does not get better by chance, it gets better by change.");
        englist.add("second chances they don't even matter people never change");
        englist.add("No matter who you are, no matter what you did, no matter where you've come from, you can always change, become a better version of yourself.");
        englist.add("It's amazing how a really small thing could change your mood for a day.");
        englist.add("Be careful who you trust. If someone will discuss others with you, they will certainly discuss you with others.");
        englist.add("There's no use stressing over something in the past, because there's not a thing you can do to change it.");
        englist.add("Women can never have too many shoes and men will never understand why.");
        englist.add("People fade and feelings change.");
        englist.add("You must be the change you wish to see in the world.");
        englist.add("The only reason people hold onto memories so tight is because memories are the only things that dont change, even when everybody else does.");
        englist.add("They always say time changes things, but you actually have to change them yourself.");
        englist.add("The adventure of life is to learn. The purpose of life is to grow. The nature of life is to change. The challenge of life is to overcome. The essence of life is to care. The opportunity of like is to serve. The secret of life is to dare. The spice of life is to befriend. The beauty of life is to give.");
        englist.add("Victory in life is like starting a journey on a sickbed, it takes courage and endurance of the inner man to prevail over fear and circumstances regardless.");
        englist.add("it might be too late change your choice but it's never too late to start making the right ones");
        englist.add("when you change the way you look at things, the things you look at change");
        englist.add("A lot of people say that people can't change. I think they're wrong. My theory is: People can change. It's just easier for them not to.");
        englist.add("You only need to change one thing to make this world a better place: your perspective.");
        englist.add("Don't tell me I've changed when in reality I've just stopped living life your way.");
        englist.add("Wishing to change the past is only wishing to change who you are now.");
        englist.add("People always say they want a new life or they want to start over. Well the truth is you get that chance everyday but choose not to change it.");
        englist.add("Laugh when you can, apologize when you should, and let go of what you can't change.");
        englist.add("You cannot change the people around you, but you can change the people that you choose to be around.");
        englist.add("In your life you will meet two special people: one who changes the way you see yourself and the world and the other one, who puts you back together after you have lost the other one.....");
        englist.add("Change will never happen when people lack the ability and courage to see themselves for who they are.");
        englist.add("When life changes to be harder, change yourself to be stronger.");
        englist.add("You have control over your life. Don't blame others. You have the power to change your life at any time and turn your worries into wisdom.");
        englist.add("You can't change how people think of you. But they can't change the fact that you really don't care what they think.");
        englist.add("It may be unfair, but what happens in a few days, sometimes even a single day, can change the course of a whole lifetime...");
        englist.add("What we think determines what happens to us, so if we want to change our lives, we need to stretch our minds.");
        englist.add("Well, that's your opinion, isn't it? And I'm not about to waste my time trying to change it.");
        englist.add("When you look at a person, any person, remember that everyone has a story. Everyone has gone through something that has changed them.");
        englist.add("Sometimes it's the smallest decisions that can change your life forever.");
        englist.add("If I have to change my lifestyle, I don't want to live.");
        englist.add("The price of anything is the amount of life you exchange for it.");
        englist.add("accept what you cannot change, change what you cannot accept!");
        englist.add("Sometimes we feel like the world is against us, but the only person against us is ourselves, because we allow the words and actions of others to change our moods, feelings and the way we live our lives.");
        englist.add("Success comes from the way you act. The way you act comes from the way you think and feel. Therefore, to become more successful, you must first change something within yourself.");
        englist.add("I've learned...that to ignore the facts does not change the facts.");
        englist.add("Common sense isn't common, freedom isn't free, and justice isn't always just. Those principles will never change.");
        englist.add("If we do not change direction, we may end up at the point at which we are heading.");
        englist.add("i used to be scared of change but eventually that was all there was left");
        englist.add("Don't let someone change who you are, to become what they need.");
        englist.add("Most people are afraid to listen because what they hear might make them change");
        englist.add("I didn't really change.. I just got tired of pretending..");
        englist.add("You were born with the ability to change someone's life, don't ever waste it.");
        englist.add("Find the courage to let go of what you can't change.");
        englist.add("Stop regretting things, you can't change them anyway.");
        englist.add("Things change, that's just part of life. Instead of hanging onto the old things, start embracing the new things, you'll be much happier.");
        englist.add("Life is not rehearsal, each day is a new show , no repeat no rewind, so give your best shot in all your acts, as the show goes on and on...");
        englist.add("Sometimes there are things in life that aren't meant to stay. Sometimes change may not be what we want. Sometimes change is what we need.");
        englist.add("Life changes so quickly that in a second so many things can happen. It is in these flickering moments that we suffer, we endure, we rejoice, and we mourn. It is these moments that will make memories that last a lifetime.");
        englist.add("You come across a person that you don't know and they change your whole life but its your decision on if its going to make it better or worse.");
        englist.add("You can't change the past but you can change the future so move forward.");
        englist.add("Sometimes the things we can't change, end up changing us instead");
        englist.add("The consequences of today are determined by the actions of the past. To change your future, alter your decisions today.");
        englist.add("Memory is the diary that we all carry about with us. We cannot change our memories, but we can change their meaning and the power they have over us.");
        englist.add("You can't expect things to be the same after so much has changed.");
        englist.add("Change is inevitable, except from a vending machine.");

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