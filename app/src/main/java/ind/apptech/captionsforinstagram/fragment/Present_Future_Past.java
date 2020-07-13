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

public class Present_Future_Past extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Present_Future_Past() {
        // Required empty public constructor
    }

    public static Present_Future_Past newInstance(String param1, String param2) {
        Present_Future_Past fragment = new Present_Future_Past();
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

        englist.add("Let go of the past. Enjoy your present and Fight for your future");
        englist.add("It's not what I have been through in my life that defines who I am, it's how I got through it that has made me the person I am today...");
        englist.add("Never forget yesterday, but always live for today. Because you never know what tomorrow can bring, or what it can take away.");
        englist.add("Decide today that u will look at everything that happens to you as something happening FOR YOU");
        englist.add("What you do today can improve all your tomorrows.");
        englist.add("After all, tomorrow is another day!");
        englist.add("Keep smiling because it may be the only sunshine someone else sees today");
        englist.add("Stop living in the past. The only thing we should do about what happened yesterday is to learn from it. Yesterday, good or bad, is history. Tomorrow is a dream, a hope, a passion. Don't let your history destroy your dream.");
        englist.add("You are what you are today, because of the decisions and the choices you made yesterday");
        englist.add("I don't regret my past, I just regret the time, I've wasted with wrong people.");
        englist.add("Your Past! It's always behind you.");
        englist.add("I don't know what's going to happen to me tomorrow. That's why I don't save my best for last.");
        englist.add("The truth is you don't know what's going to happen tomorrow, life is a crazy ride and nothing is guaranteed.");
        englist.add("You're off to Great Places! Today is your day! Your mountain is waiting, So... get on your way!");
        englist.add("Look closely at the present you are constructing. It should look like the future you are dreaming.");
        englist.add("Today is an opportunity to get better. Don't waste it.");
        englist.add("Don't live your life today performing for people. because every show at some point.. must come to an end.");
        englist.add("Don't live in the past, just learn from it and move on.");
        englist.add("The Past is in the past,, Your Future is a Mystery that makes Your Family History, The Present Is Yours So Open it Up and make the Best of It.!!");
        englist.add("Don't say hi to your future if you haven't said bye to your past..");
        englist.add("Don't let your past determine your present or destroy your destiny.");
        englist.add("Don't let your past dictate who you are, but let it be a lesson that strengthens the person you will become.");
        englist.add("In life, When something bad happens to you, don't let it keep you down, you have to try and move on and be happy, it's not that you're ignoring the past, it's just that you have decided to stop living in it.");
        englist.add("You are not what happened to you in the past. No matter how chaotic the past has been, the future is a clean, fresh, wide open slate.");
        englist.add("What lies ahead may be far better than anything you ever thought possible. But it's up to you to get over the past.");
        englist.add("In this bright future you can't forget your past.");
        englist.add("The past is never dead. It's not even past");
        englist.add("Your past may be cloudy, but your future is spotless.");
        englist.add("Live life today, yesterday is gone and tomorrow may never come.");
        englist.add("You can't correct the path of the past, but you can correct the path of now so that the future's path will lead where you really want to be in life.");
        englist.add("Dream as if you'll live forever, live as if you'll die today.");
        englist.add("People say I'm different & I'll show you that's okay, because I'm way past tomorrow & your just stuck here in today");
        englist.add("Just because today is a terrible day, doesn't mean tomorrow won't be the best day of your life. You just have to get there.");
        englist.add("What I do today is important, because I'm trading a day of my life for it");
        englist.add("The only person you should try to be better than, is the person you were yesterday");
        englist.add("Understand that the past cannot and will not take you down. If it didn't then, it certainly can?t now.");
        englist.add("It's better to regret tomorrow because of the choices I make today, than to regret tomorrow because of the choices someone made for me. If am to suffer the loss of my choices tomorrow let it be, maybe I'll learn to be wiser in the future.");
        englist.add("People are always available for work in the past tense.");
        englist.add("Yesterday, I was grateful. Tomorrow, I'll be thankful. But for now, I'm blessed.");
        englist.add("Today, I am thankful for ALL the good people in my life, and the bad. To the bad ones- you have shown me exactly who I wish never to become.");
        englist.add("The good you do today, people will often forget tomorrow, Do good anyway.");
        englist.add("Give thanks for what you are now, and keep fighting for what you want to be tomorrow.");
        englist.add("Why didn't I learn to treat everything like it was the last time. My greatest regret was how much I believed in the future.");
        englist.add("may the happiest days of your past , be the saddest days of your future.");
        englist.add("Worrying is carrying tomorrow's load with today's strength- carrying two days at once. It is moving into tomorrow ahead of time. Worrying doesn't empty tomorrow of its sorrow, it empties today of its strength.");
        englist.add("instead of finding ways to fix the past....fix your future");
        englist.add("Everyone is fighting their own battle. to be free from their past. to live in their present. And to create a better future....So have heart!");
        englist.add("The future belongs to those who believe...");
        englist.add("When you want to enjoy life, think today as your life's First day. When you want to achieve something in life, think today as your life's Last day....");
        englist.add("Today is the tomorrow you worried about yesterday.");
        englist.add("The future may be rooted in the past, but you can always uproot and replant.");
        englist.add("decide TODAY that you're going to look at everything that happens TO you as something that is happening FOR you");
        englist.add("Everyone lives with the scars of their past and the fear of their future.");
        englist.add("Don't regret for people who left you in half, for you will realize in future that they never belonged to you");
        englist.add("Worrying does not empty tomorrow of its troubles. It empties today of its strength.");
        englist.add("Don't worry about your past, there's a damn good reason why it didn't make it to your future.");
        englist.add("Let go of the past and the past will let go of you.");
        englist.add("Never judge anyone's past instead see the consistent progress they made to better their future. Have a blessed & productive day.");
        englist.add("I'm not doing anything special... Just struggling with my present to make my future enjoyable.");
        englist.add("Tomorrow is a new beginning. Embrace the light of a new day, for you have a fresh chance to begin again, to make life beautiful.");
        englist.add("I am what I am today because of the choices I made yesterday.");
        englist.add("Live as if today was your last!");
        englist.add("Your future starts when it begins to be present in you. It is a line of thought not a point in time.");
        englist.add("Everybody deserves somebody who makes them look forward to tomorrow.");
        englist.add("Learn from yesterday, live for today, hope for tomorrow. The important thing is not to stop questioning");
        englist.add("Move on. It is just a chapter in the past, but don't close the book- just turn the page.");
        englist.add("Moving on is not about not looking back. It's taking a glance at yesterday, and seeing how much you've grown since then");
        englist.add("Worrying does not take away tomorrow's troubles, it takes away today's peace.");
        englist.add("Don't worry about tomorrow: it will have enough worries of its own. There is no need to add to the troubles each day brings.");
        englist.add("If we are ever to enjoy life, now is the time. Not tomorrow or next year... today should always be our most wonderful day.");
        englist.add("The purpose of the past is to teach you, not trap you.");
        englist.add("Everyone needs someone to make them feel like tomorrow is more than just another day.");
        englist.add("The reason people find it so hard to be happy is they see the past better than it was and the present worse than it is.");
        englist.add("When we are present in each moment, the past gently rolls up behind us and the future slowly unravels before us.");
        englist.add("If you worry about what tomorrow brings, you're going to be worrying for a whole lifetime.");
        englist.add("don't worry about the people in your past there's a reason they didn't make it to the future.");
        englist.add("Leave the bad memories in the past where they belong.");
        englist.add("Many great things can be done in a day if you don't always make that day tomorrow.");
        englist.add("The past is like using your rear-view mirror in the car, its good to glance back and see how far you've come, but if you stare too long you'll miss what's right in front of you");
        englist.add("One of life's sharpest paradoxes is that our brightest future hinges on our ability to pay attention to what we're doing right now, today.");
        englist.add("Plan for the future, because that is where you are going to spend the rest of your life.");
        englist.add("When the past calls, let it go to voice-mail. It has nothing new to say.");
        englist.add("No one can predict the future, you just need to live your life, do the right things and everything will be exactly as it was meant to be.");
        englist.add("In life there is no fairy tales, no happily ever after, no prince charming. In life it's reality where you are going to be hurt, you are going to cry. But the best thing about reality is that there is a tomorrow.");
        englist.add("The more anger of the past you carry in your heart, the less capable you are of loving the present.");
        englist.add("Get your faith together so you can get your future together. Your faith and your future go hand in hand.");
        englist.add("Oh yes, the past can hurt. But you can either run from it, or learn from it.");
        englist.add("Be thankful for everybody in your life, good and bad, past and present. They all made you the person that you are today.");
        englist.add("The more you take responsibility for your past and present, the more you are able to create the future you seek.");
        englist.add("Nobody can go back and start a new beginning, but anyone can start today and make a new ending.");
        englist.add("Only put off until tomorrow what you are willing to die having left undone.");
        englist.add("Worrying is literally a waste of energy. It will not drain tomorrow of its troubles, it will drain you of your strength today.");
        englist.add("I learned from my past, I don't talk about. Yeah I have a story but you won't hear it from me.");
        englist.add("Being stuck in the past is like walking forward with your back facing the front. You'll always miss out on what's in front of you.");
        englist.add("No matter how dirty your past is  but your future is still spotless.");
        englist.add("I never regret anything that happened to me because the sweetest lessons in my life I've learned are usually comes from my bitter past.");
        englist.add("I think it's time I let go of the past, live in the present, and look forward to the future");
        englist.add("People who judge you by your past don't belong in your present.");
        englist.add("Don't let your past dictate who you are, but let it be a lesson that strengthens the person you'll become.");
        englist.add("If today was perfect there would be no need for tomorrow.");
        englist.add("Always choose the future over the past.");
        englist.add("Today's tears bring tomorrow's rainbows.");
        englist.add("Never forget yesterday, but always live for today, because you never know what tomorrow can bring, or what it can take away.");
        englist.add("Don't let your past dictate who you are, but let it be a part of who you will become!");
        englist.add("Dream as though you'll live forever live as though you'll die today.");
        englist.add("Stop cheating on the present and future with your past it's over.");
        englist.add("Often people that criticize your life are usually the same people that don't know the price you paid to get where you are today.");
        englist.add("The past should be the past. It can destroy the future. Live life for what tomorrow has to offer, not for what yesterday has taken away.");
        englist.add("Don't cry over the past, it's gone. Don't stress about the future, it hasn't arrived. Live in the present and make the most of it.");
        englist.add("Learn from yesterday, live for today, dream for tomorrow.");
        englist.add("All we can do is learn from the past and make peace with it.");
        englist.add("Don`t judge me tomorrow by the way I am acting today.");
        englist.add("You can never be happy if you're trapped in the past and fearful of the future. Living in the present is the only way to be happy.");
        englist.add("No matter how dirty your past is, your future is spotless.");
        englist.add("You cannot undo what you did in the past, but who said you cannot start building a new future?");
        englist.add("One of the keys to longevity and good health is to develop a habit of gratitude and let go of past hurts.");
        englist.add("Parenting is the biggest sacrifice one can make, it's putting your life on hold to fulfill the promise of your children's tomorrow's.");
        englist.add("The great thing about the past is that it is in the past.");
        englist.add("You and I have no guarantee of tomorrow. Live life to the fullest.");
        englist.add("The future lies before you, like paths of pure white snow. Be careful how you tread it, for every step will show.");
        englist.add("Dreams are today's answers to tomorrow's questions");
        englist.add("Don't let your past steal your present.");
        englist.add("You can't create new moments if you are busy with your past memories.");
        englist.add("If you tell the truth it becomes a part of your past, but if you tell a lie it becomes a part of your future");
        englist.add("The Future's So Bright, I Got to Wear Shades!");
        englist.add("Turn around, look in front of you. See the future, not the past.");
        englist.add("Don't let the past dictate where you're going. You're in this life for you, forget everyone else, forget trying to please others. Be you.");
        englist.add("Learn a little about your past, and you may end up with a pretty nice future");
        englist.add("One of lifes sharpest paradoxes is that our brightest future hinges on our ability to pay attention to what were doing right now, today.");
        englist.add("The future needs your attention. It has something beautiful to offer you, but first you must let go of the past in order to receive it.");
        englist.add("Today, history will repeat itself. But you know what? This time, I'm ready.");
        englist.add("Every sorrow and difficulty that comes in your way are stepping stones for a better tomorrow.");
        englist.add("Noting Lasts Forever..So..Forget the future..Lets live in the moment.");
        englist.add("Today is Tomorrow's Memory.");
        englist.add("The past is a place of reference, not a place of residence.");
        englist.add("Finish each day and be done with it. You have done what you could. Learn from it; tomorrow is a new day.");
        englist.add("Never stop dreaming. Yesterday's dream can become the reality of tomorrow, and the innovation of the future.");
        englist.add("Accept the past, manage the present and work hard towards the future.");
        englist.add("once you realize your past is just a story  it no longer has any power over you.");
        englist.add("Just remember...... when you think all is lost THE FUTURE REMAINS");
        englist.add("You have to let go of your past in order to have a future.");
        englist.add("I don't consider my past full of regrets, I consider it full of lessons I've learned.");
        englist.add("The choices you make today shape your world tomorrow");
        englist.add("Life has its bad times, put them in the past. But most importantly, life is what you make it.");
        englist.add("To grasp the future, you must first release the past.");
        englist.add("May you be strengthened by yesterday's rain; Walk straight in tomorrow's wind; And cherish each moment of the sun today");
        englist.add("The best feeling in the world is knowing you finally took a step in the right direction,a step towards the future where everything that you never thought was possible is possible...");
        englist.add("Don't let the past steal your present.");
        englist.add("The journey is much easier when you are not carrying your past.");
        englist.add("It's not what I have been through in my life that defines who I am, it's how I got through it that has made me the person I am today.");
        englist.add("Forgive anyone who has hurt you and leave unresolved circumstances in Gods hands. Life is too short to let yesterday take up too much of today..");
        englist.add("The future belongs to those who believe in the beauty of their dreams.");
        englist.add("Never plan a future with someone who has no future plans for themselves.");
        englist.add("The past is your lesson. The present is your gift. The future is your motivation");
        englist.add("Never put off tomorrow what you can do today");
        englist.add("Letting go doesn't mean that we forget but it does mean that we can move on without regrets and without pain. Don't let the past ruin your present and let the present tell you the future");
        englist.add("Today you are You, that is truer than true. There is no one alive who is Your than You");
        englist.add("Never dwell on the past, Just always be one step ahead for the future is so very bright. You never know what will happen.");
        englist.add("Never Base Your Future On A Broken Past.");
        englist.add("Life is a pen. You can cross out your past, but you can't erase it.");
        englist.add("Celebrate every step you take today, no matter how small!");
        englist.add("Live for what today has to offer, not for what yesterday has taken away...");
        englist.add("How are you supposed to grasp the future when you are still clinging on the past?");
        englist.add("In past my motivation was my life, now my life is my motivation");
        englist.add("Let your past make you better, not bitter.");
        englist.add("No matter what your situation is, you can become a successful person today. You may not be able to reap the rewards yet, but you can start planting the seeds.");
        englist.add("Don't waste today worrying about tomorrow.");
        englist.add("When you accept someone, you accept their past too. Don't hold it against them later.");
        englist.add("If you don't see them in your future, it's time to put them in your past.");
        englist.add("Dear Past, thanks for all the lessons.. Dear Future, I'm ready.");
        englist.add("Holding on to the past is to stay stuck in a place where you no longer belong.");
        englist.add("I may not be there yet, but I'm closer than I was yesterday");
        englist.add("Nothing lasts forever, no matter how it feels today...");
        englist.add("If you keep going over the past, you're going to end up with a thousand pasts and no future");
        englist.add("Don't lose hope..You never know what tomorrow will bring.!!");
        englist.add("If you tell the truth, it becomes a part of your past. If you lie, it becomes a part of your future.");
        englist.add("Don't think of the past; the only thing that matters is the everlasting present");
        englist.add("Do not look back and grieve over the past, for it is gone and do not be troubled about the future, for it has not yet come. Live in the present, and make it so beautiful that it will be worth remembering..");
        englist.add("The past is where you learned the lesson. The future is where you apply the lesson.");
        englist.add("Your character is far more important than your past or your future; its who you are that matters, not what you've done or will do.");
        englist.add("The truth is you don't know what is going to happen tomorrow, life is a crazy ride & nothings guaranteed.");
        englist.add("Getting old is when u become a person with a long past and a short future");
        englist.add("I'M OVER THE PAST, LIVING IN THE PRESENT,MOVING FORWARD TO MY FUTURE");
        englist.add("Always keep your words tender, just in-case you have to eat them tomorrow.");
        englist.add("Just because the past didn't turn out like you wanted it to, doesn't mean your future can't be better than you've ever imagined.");
        englist.add("Yesterday was the deadline for all complaints.");
        englist.add("I think I'm living in my past because I'm scared of the future.");
        englist.add("Moving on to the future without letting go of the past is like tying your arm to a post while catching a train.");
        englist.add("Every person from your past lives as a shadow in your mind. Good or bad, they all helped you write the story of your life, and shaped the person you are today.");
        englist.add("Faith is not knowing what the future holds, but knowing who holds the future");
        englist.add("Instead of judging people by their past, stand by them and help repair their future.");
        englist.add("Your new life starts today. Don't waste it trying to get back what was taken away.");
        englist.add("Worry never robs tomorrow of its misery, it only steals today of its joy.");
        englist.add("Once you've made the decision to move on, don't look back. You will never find your future in the rear view mirror.");
        englist.add("Learn from yesterday.");
        englist.add("Memories remind us that nothing last forever, you can be happy today and sad tomorrow, time is precious and should not be wasted, enjoy life and remember don't count your days, make your days count.");
        englist.add("Instead of judging people by their past, stand by them and help repair their future!");
        englist.add("The struggle you're in today is developing the strength you need for tomorrow");
        englist.add("It is difficult to live in the present, ridiculous to live in the future, and impossible to live in the past.");
        englist.add("Start everyday with a new hope, leave bad memories behind and have faith for a better tomorrow.");
        englist.add("Never let yesterday's disappointments overshadow tomorrow's dreams.");
        englist.add("What is not started today is never finished tomorrow.");
        englist.add("The best thing about the future is that it comes only one day at a time.");
        englist.add("A true friend is someone who understands your past, believes in your future, and accepts you just the way you are.");
        englist.add("Everyone deserves someone who makes them look forward to tomorrow");
        englist.add("Behind you are the challenges you've met. Before you lies new possibilities. Today you choose the direction of your life.");
        englist.add("With each new day, put away the past and discover the new beginnings you have been given.");
        englist.add("Just because the past didn't turn out like you wanted it to, doesn't mean your future can't be better than you ever imagined.");
        englist.add("The future is waiting, but it will never fight with the past to get your attention.");
        englist.add("Do something today that your future self will thank you for.");
        englist.add("The lessons of the past becomes the teachers of the future.");
        englist.add("Stop breathing life into the past. It died for a reason. Let go and move on.");
        englist.add("Sooner or later one has to make decisions that will move them away from their past, bring satisfaction to their present, and set the stage for their future");
        englist.add("Don't use the past as an excuse to miss out on your future.");
        englist.add("Dear past, thank you for all the lessons. Dear future, I'm ready.");
        englist.add("You can't just forget about your past, so instead reflect about it. Live your life with lessons learned than full of regrets.");
        englist.add("Tomorrow may not look the same as today, no matter how much you try to control it, all you need right now is to appreciate and enjoy what you have.");
        englist.add("I wish I could just revisit my past where I felt like I was doing everything right.");
        englist.add("You can't have a better tomorrow if you're always thinking about yesterday.");
        englist.add("Learn from yesterday, live for today, hope for tomorrow.");
        englist.add("It's annoying when people throw things from your past in your face.");
        englist.add("The past has no power over the present moment.");
        englist.add("Keep pushing, keep dreaming keep believing. Today could be the day. Stay faithed up, prayed up and ready.");
        englist.add("Just because you have a past with someone, doesn't mean you should have a future with them.");
        englist.add("Make Peace With Your Past so it does not spoil your present. Your past does not define your future, your actions and beliefs do.");
        englist.add("Do something now, that will make the person you'll be tomorrow, proud to have been the person you are today.");
        englist.add("No matter how hard the past, you can always begin again.");
        englist.add("Focus on the present and the past will take care of itself.");
        englist.add("Live for today, pray for tomorrow.");
        englist.add("Take advantage of today because tomorrow is not promised.");
        englist.add("Life is knowing that the past is over and learning from it, knowing that the future will come and preparing for it, and knowing that the present is here and living it up.");
        englist.add("The hopes of tomorrow can often diminish the pains of today.");
        englist.add("Don't cry over the past, it's gone. Don't stress about the future, it hasn't arrived. Live in the present and make it beautiful.");
        englist.add(", We must begin thinking like a river if we are to leave a legacy of beauty and life for future generations.");
        englist.add("When you come to another bridge in your life to cross, move on. Looking back, it's just a chapter in the past, but don't close the book. Just turn the pages.");
        englist.add("It's not about the past, and it's not about the future, its about taking this moment you're living in right now, and making it count.");
        englist.add("Today is the tomorrow you worried about yesterday");
        englist.add("How to predict your future: Create it.");
        englist.add("Don't let the burdens of your past be obstacles of your future.");
        englist.add("People ask me if I believe in forever just laugh, because with the way my life's going i don't even believe in tomorrow.");
        englist.add("The deeper the 'past' and the 'present' pull you down, the higher the 'future' will lift you up.");
        englist.add("Don't look into the past and regret anything that you did. Because, at that point in your life that's what you wanted.");
        englist.add("Your past can't determine your future unless you allow it.");
        englist.add("Just because the past taps you on the shoulder, doesn't mean you have to look back");
        englist.add("Once you realize that your past is just a story, it no longer has any power over you.");
        englist.add("Just because today may have been a bad day doesn't mean tomorrow can't be the best day of your entire life. You just have to get there.");
        englist.add("Never live in the past, but always learn from it.");
        englist.add("Choose your friends with caution, plan your future with purpose, and frame your life with faith.");
        englist.add("Just move on, it's the past. Life is not perfect and nothing lasts.");
        englist.add("Let your past make you better..not bitter.");
        englist.add("Spending today complaining about yesterday won't make tomorrow any better.");
        englist.add("If you tell the truth it becomes part of your past.... If you tell a lie it becomes part of your future...");
        englist.add("Right now, someone is planning something for tomorrow without realizing they are going to die today. Life is short. Live it!");
        englist.add("life is like writing with a pen. You can cross out your past but you can't erase it.");
        englist.add("In life you have to build barriers.. not to block everyone out, but to see who will make the effort to get past them... they are the ones who deserve to be part of your life");
        englist.add("Never live in the past but always learn from it.");
        englist.add("Be thankful for what you are NOW, and keep fighting for what you want to be tomorrow.");
        englist.add("Yesterday is the memory we made for today, so make today a good day to remember tomorrow");
        englist.add("Breathe in the future, breathe out the past.");
        englist.add("We cannot build our own future without helping others to build theirs.");
        englist.add("Never plan a future with someone that has no future plans for themselves.");
        englist.add("If you want the present to be different from the past, study the past.");
        englist.add("A true friend is someone who understands your past, believes in your future, and accepts you today just the way you are.");
        englist.add("Just because today is a terrible day doesn't mean tomorrow won't be the best day of your life. You just have to get there.");
        englist.add("Stop rehearsing the pain of your past. It's time to write the rest of your script.");
        englist.add("Nobody can go back and start a new beginning, but anyone can start today and make a new ending");
        englist.add("One day is worth a thousand tomorrows.");
        englist.add("Remember the past, plan for the future, but live for today, because yesterday is gone and tomorrow may never come.");
        englist.add("Live as if you were to die tomorrow. Learn as if you were to live forever.");
        englist.add("Forget what has happened to you in the past but never forget the lesson it taught you.");
        englist.add("A pessimist is a man with a bright future behind him, and a terrible past ahead of him.");
        englist.add("Take pride in who you are as a unique individual by trying to be more today than you were yesterday, more tomorrow than you were today.");
        englist.add("The good you do today, people will often forget tomorrow. Do good anyway.");
        englist.add("Don't let your past ruin your present. It is not worth for your future.");
        englist.add("Every morning we wake up we are born again, what we do today is what matters most. Yesterday is but today's memory, but tomorrow is today's dream.");
        englist.add("Remember... Every good & bad memory.. Lines your personality, curves it's details & makes who you are today.");
        englist.add("Every passing minute is another chance to turn it all around.Forget about the people in your past... they didn't make it to your future for a reason!");
        englist.add("Don't be bitter about your past. Just do all that you can to make your present and future better.");
        englist.add("Don't judge me by my past, I don't live there any-more.");
        englist.add("What I do today is important because I am exchanging a day of my life for it.");
        englist.add("Forget everything about your past, start a fresh life and allow the lessons learnt to guide your present which you have total control over whatever you intend to do right now.");
        englist.add("Life always offers you a second chance...it's called tomorrow.");
        englist.add("Let go of the judgements, forgive the past, and let this moment be as incredible as it is.");
        englist.add("Learn from the past, make a vision for the future and work for it in the present. Remember today is tomorrows past.");
        englist.add("Dear Past, Thank you for all the life lessons you have taught me.  Dear Future, I am ready now.");
        englist.add("If a door closes today, know that a new one and most likely better one will be there for you to open tomorrow.");
        englist.add("The Future is waiting; but it will never fight with the Past to get your attention.");
        englist.add("Everything you've been through was preparation for where you are right now, and where you can be tomorrow.");
        englist.add("The decisions you make today can affect your way of life tomorrow, always think carefully before making any big decisions.");
        englist.add("Yesterday is history. Tomorrow is a mystery. Today is a gift. That's why it's called the present.");
        englist.add("Break down the walls of your past, and pave the way for your future.");
        englist.add("A single step in the right direction will pave your future with gold.");
        englist.add("If nothing else, one day you can look someone straight in the eyes and say But I lived through it and it made me who I am today.");
        englist.add("Don't waste today regretting yesterday instead of making a memory for tomorrow.");
        englist.add("Living in the past is like scratching a wound. If you don't leave it alone, it will never go away. Let it heal, accept the scar and move on with your life.");
        englist.add("Turning back the clock is for fools whose memory lingers in the Past, afraid to face the present, without knowing what the future contains.");
        englist.add("Forever is a long time, but not as long as it was yesterday.");
        englist.add("Don't leave so much room in your future for someone who left you in their past.");
        englist.add("The obstacles of your past can become the gateways that lead to new beginnings.");
        englist.add("When you focus on the past you're just relieving it. Let go and move forward.");
        englist.add("Remember the past, but don't live in it.");
        englist.add("The best thing about the past is that it shows you what not to bring into your future.");
        englist.add("The future belongs to those who believe in the beauty of their dreams");
        englist.add("The past, I think, has helped me appreciate the present - and I don't want to spoil any of it by fretting about the future.");
        englist.add("The past is already gone, the future is not yet here. There?s only one moment for you to live.");
        englist.add("Tomorrow, today will be the past, live and make each moment last, the yesterdays and today's we'll never forget, I pray that the tomorrows well never regret.");
        englist.add("What you do today is important because you are exchanging a day of your life for it.");
        englist.add("Make peace with your past so it won't spoil the present.");
        englist.add("People bring up your past when they're intimidated by your present.");
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