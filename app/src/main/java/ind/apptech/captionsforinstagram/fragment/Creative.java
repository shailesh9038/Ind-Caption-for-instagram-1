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

public class Creative extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Creative() {
        // Required empty public constructor
    }

    public static Creative newInstance(String param1, String param2) {
        Creative fragment = new Creative();
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

        englist.add("People think being alone makes you lonely, But I think being surrounded by wrong people is the loneliest thing in world.");
        englist.add("I'm drinking like there's snow tomorrow.");
        englist.add("Life is a puzzle game, you just need to find the right pieces.");
        englist.add("Look for something positive in each day, even if some days you have to look a little harder.");
        englist.add("Don’t unlock the doors to your heart for someone who won’t even unlock their cell phone for you.");
        englist.add("Decisions are the hardest move to make. Especially when its a choice between where you should be and where you want to be.");
        englist.add("The bad news is nothing is permanent …..and…. the good news is nothing is permanent :)");
        englist.add("Remember there is someone for everyone..");
        englist.add("If Pigs could fly there wouldn’t be any men on the ground.");
        englist.add("Men forget but never forgive. Women forgive but never forget.");
        englist.add("Thinks you should never take life too seriously no one ever makes it out alive! so just chill out..");
        englist.add("Let go of those who bring you down and surround yourself with those who bring out the best in you.");
        englist.add("Anger is a feeling that makes your mouth work faster than your MIND.");
        englist.add("We live in the era of smart phones and stupid people.");
        englist.add("One of the simplest ways to stay happy is … letting go of the things that makes you sad.");
        englist.add("Even a turtle only makes progress when it sticks its neck out.");
        englist.add("If Saturday and Sunday dont excite you, then change your friends & If Monday does not motivate you, then change your profession.");
        englist.add("I hate it when my friends change just because that meet new people.");
        englist.add("All relationships have problems. It just all depends if you two are strong enough to get through them together.");
        englist.add("Who remembers going on the computer as kids, just to go on paint and space pinball?");
        englist.add("Real people aren’t perfect. Perfect people aren’t real. Learn to look for the good things without expecting perfection.");
        englist.add("If things are happening according to your wish, then you are lucky. But if they are not, you are very lucky. Because they are happening according to GOD’s will.");
        englist.add("Grounded for so long, i think it’s time to now fly.");
        englist.add("Being sad with the right people is better than being happy with the wrong ones.");
        englist.add("I hate how Monday is so far away from Friday and Friday is so close to Monday.");
        englist.add("Pressure makes diamonds.");
        englist.add("I think, therefore I am.");
        englist.add("Did you ever have the feeling that you wanted to go & still have the feeling that you wanted to stay?");
        englist.add("Any woman can fool a man if she wants to and if he’s in love with her.");
        englist.add("A kiss without a hug is like a flower without the fragrance.");
        englist.add("Is posting on Twitter that he is updating his Facebook status update.");
        englist.add("People ask me why i don’t trust others.. if only i could tell you.");
        englist.add("Waiting is painful, forgetting is painfull but not knowing which to do is the worst kind of suffering.");
        englist.add("Don’t judge me until you have lived my life and have experienced all the things I have gone through. Then you can make your decision about what you think of me.");
        englist.add("Like this if you like to like things.");
        englist.add("Never assume that someone likes you by their sweetness. Sometimes you are just an option when they are bored.");
        englist.add("The more you hide your feelings, the more they show. The more you deny your feelings, the more they grow.");
        englist.add("Men are like parking spots, the good ones are taken and the free ones are handicapped..");
        englist.add("Successful people are always looking for opportunities to help others. Unsuccessful people are always asking, what’s in it for me?");
        englist.add("Experience is a cruel teacher. It gives you exam first and lesson later.");
        englist.add("Girls who say “a lot of guys are after me” should remember that cheap prices attract many costumers.");
        englist.add("My love for you is like a ring; it has no beginning and no end.");
        englist.add("When writing the story of your life, don’t let anyone else hold the pen.");
        englist.add("When someone really loves you, they dont have to say it, you know just by the way they treat you.");
        englist.add("Love is on the lips of many but in the hearts of few.");
        englist.add("It doesn’t matter how many times you fall, what counts is how many times you stand up again.");
        englist.add("Silence is text easy to misread.");
        englist.add("Put the bom in the bom sha-bom bom, but lays no claim to the ram in the ramalama ding dong.");
        englist.add("TRUST …. Need years to earn and seconds to break.");
        englist.add("Think positive and positive things will happeen.");
        englist.add("I will stop drinking when Captain Morgan puts his foot down.");
        englist.add("Before sleeping, 90% of your mind begins to imagine stuff you’d like to happen. Agree?");
        englist.add("When you know it’s real when you know it’s right, don’t let anything stand in your way.");
        englist.add("No one would ever understand you until they have been in your position so don’t complain and regret.");
        englist.add("That awkward moment when you accidentlly hit send while deciding whether or not you were going to send it.");
        englist.add("I have many problems in my life but my lips don’t know about those problems. They always smile.");
        englist.add("Freedom is not a license to do everything..");
        englist.add("The real trouble with reality is that there’s no background music.");
        englist.add("If the last page of your notebook is blank, you surely lack creativity. :)");
        englist.add("Last time I looked at my keybord, I noticed that U and I are allways together.");
        englist.add("The language of friendship is not words, but meanings.");
        englist.add("Feeling perfectly happy being single, untill you see a happy couple.");
        englist.add("There are stories behind my smile and only few people knows about it.");
        englist.add("Promises are like babies. Fun to make but hell to deliver.");
        englist.add("Never underestimate the power of your actions. With one small gesture you can change a person’s life. For better or for worse.");
        englist.add("God, if I can’t have what I want, let me want what I have.");
        englist.add("Working for the weekend, like everybody…");
        englist.add("If they talk to you about somebody, they will talk to somebody about you.");
        englist.add("Second chances don`t always mean a happy ending.");
        englist.add("My home is in heaven. I am just traveling through this world.");
        englist.add("Awkward moment when you wave and smile at someone but they dont see you.");
        englist.add("Goodbye without reasons is the most painful one. Love without reasons is the most beautiful one.");
        englist.add("Your LIFE is a PUZZLE, don’t waste your time trying to place ppl where they don’t fit.");
        englist.add("Some people don’t understand how blessed they truly are. Be thankful for what you have rather than focusing on what you don’t have.");
        englist.add("We have so many needs in our life, but at the end of the day, all we need is to be needed.");
        englist.add("That awkward moment when you don't know how to reply to a really sweet text.");
        englist.add("Believe those who are seeking the truth. Doubt those who find it.");
        englist.add("I want someone who is …. DTF ………….Dedicated Trustworthy & Faithful.");
        englist.add("Just because someone hurt you yesterday doesn’t mean you should start living life today in constant fear of being hurt tomorrow.");
        englist.add("'I don't watch tv' proudly says a person who spend 8 hours a day on the internet.");
        englist.add("Monsters are real and ghosts are real too. They live inside us and sometimes they win.");
        englist.add("Life is like a book. Some chapters sad, some happy, and some exciting. But if you never turn the page, you will never know what the next chapter holds.");
        englist.add("Life is so stupid an ordinary person makes us smile and a very special person always makes us cry but still we care for the special one.");
        englist.add("I may not always be with you, but when we are apart remember you will be with me right inside my heart.");
        englist.add("Sometimes the strongest people in the morning, are the ones that cry themselves to sleep at night.");
        englist.add("If you love someone put their name in a circle not a heart because hearts can break but circles go on.");
        englist.add("Words mean very little, but actions mean everything. Don’t just say it, show it.");
        englist.add("Sometimes the wrong choices bring us to the right places.");
        englist.add("Does a book work as a sleeping pill for you as well?");
        englist.add("Everyday is not the same then how can you expect everyoen to be the same everyday.");
        englist.add("You may not end up where you thought you would be, but you always end up where you are meant to be.");
        englist.add("My heart is not a playground, go play somewhere else.");
        englist.add("Old Saying … Think before you speak. New saying … GOOGLE, before you post.");
        englist.add("Some people are going to leave but that’s not the end of your story. That’s the end of their part in your story.");
        englist.add("Win as if you are used to it, lose as if you enjoyed it for a change.");
        englist.add("That awkward moment when you finish a math problem and your answer is not even one of the choices.");
        englist.add("Have you always been this cute, or did you have to work at it?");
        englist.add("Avoid negative people to stay positive.");
        englist.add("Do not stress the things you can not change cause we create our tomorrow by what we do today");
        englist.add("When someone doesn’t like something, it’s often because they are not familiar with it, or they are too familiar with it.");
        englist.add("How will you know if it’s the right decision if you never make it.");
        englist.add("Never be dependent to anyone in this world because even your own shadow leaves you when you’re in darkness.");
        englist.add("Tough times never last, tough people do.");
        englist.add("When it seems like nobody cares, God cares. When it seems like nobody is there for you, God is ready to listen.");
        englist.add("They say a picture is worth a thousand words but when I look at yours, Im speechless.");
        englist.add("Cant find a status that matches my mood at this very moment.");
        englist.add("Warning :- Never let your feelings get too deep, people can change at any moment.");
        englist.add("Pizza delivery cars should be allowed to use sirens.");
        englist.add("It’s not the mistake that matters; it’s how you deal with it, what you learn from it, and how you apply that lesson to your life.");
        englist.add("Everyone says that love hurts, but thats not true. Loneliness hurts, rejection hurts, losing someone hurts. Everyone confuse these things with love.");
        englist.add("Tell me who your friends are and I will tell you who you are.");
        englist.add("Why does life keep teaching me lessons I have no desire to learn?");
        englist.add("If you love someone, you better prove it. Because LOVE is not a noun to be defined but a verb to be acted upon.");
        englist.add("It’s true that we don’t know what we’ve got until we lose it, but it’s also true that we don’t know what we’ve been missing until it arrives.");
        englist.add("Here is the test to find whether your mission on Earth is finished, if you’re alive, it isn’t.");
        englist.add("Dear Heart, please stop getting involved in everything. You job is to pump blood. That’s it.");
        englist.add("Good decisions come from experience, and experience comes from bad decisions.");
        englist.add("Relationships last long because two brave people made a choice, To keep it, to fight for it and to work for it.");
        englist.add("Just high fived that wall with my face.");
        englist.add("Sometimes I just smile to cover up the pain. Sometimes I just laugh to cover up the hurt. But whether I smile or laugh, I can never hide what I really feel.");
        englist.add("Sometimes, before shooting for the stars, one must shoot in their surroundings at those that seek to distract aim.");
        englist.add("Life is 10% what you make it, and 90% how you take it.");
        englist.add("That awkward moment when you want to talk but your friend won’t shut up.");
        englist.add("Admit it, you are not the same person you were a year ago.");
        englist.add("Choose to be happy.");
        englist.add("Sometimes you tell someone to never call you again and then the phone rings and you hope it’s them …. Its the most twisted logic of all time.");
        englist.add("One of the secrets of a long and fruitful life is to forgive everybody every night before you go to bed.");
        englist.add("If your in my place what would you do??");
        englist.add("I am perfectly happy being single ….. Until I see a happy couple :(");
        englist.add("Sometimes, the more you hide your feelings for someone, the more you fall for them.");
        englist.add("Stop being afraid of what could go wrong, and start being positive about what could go right!");
        englist.add("You can only hold on to someone for so long then you have to make a choice, let them go or let them pull you down..");
        englist.add("Never fear shadows, that always means there is a light shining somewhere.");
        englist.add("You can’t handle my undivided attention.");
        englist.add("There's no place like 127.0.0.1");
        englist.add("I cannot believe you are breaking up with me! Did all those LIKES on your DP mean nothing to you?f");
        englist.add("the best part about this status message is that by the time you've finished reading it you realize that there is absolutely no point to it.");
        englist.add("Success is like being pregnant. Everybody congratulates you, But nobody knows how many times you were ****** before you got there.");
        englist.add("The best revenge is moving on and getting over it…. Don’t give someone the satisfaction of watching you suffer.");
        englist.add("Single? Taken? I'm just ready for summer 2016.");
        englist.add("Pain never really goes away; you just elevate and get used to it by growing stronger.");
        englist.add("You can’t always be nice. That’s how people take advantage of you. Sometimes you have to set your boundaries.");
        englist.add("The most valuable places to be in the world are in someone’s THOUGHTS, in someone’s PRAYERS and in someone’s HEART.");
        englist.add("Everything is easy when you`re busy, nothing is easy when you`re lazy…");
        englist.add("Create happiness in life by enjoying simple things in this complicated world.");
        englist.add("ANGER is only one letter short of DANGER.");
        englist.add("When someone looks over my shoulder while I'm on the computer, I open up a new tab and start searching, 'HOW TO KILL THE PERSON BEHIND ME.'");
        englist.add("Never give up on a dream just b’coz of the time it will take to accomplish it. The time will pass anyway.");
        englist.add("Nobody has a perfect life. Everybody has their own problems. Some people just know how to deal with them without revealing it.");
        englist.add("Sometimes the best way to get someone’s attention is to stop giving them yours.");
        englist.add("The past tense of wink is wunked.");
        englist.add("Instead of loving your enemies, treat your friends a little better.");
        englist.add("Dear GOD, My prayer for 2012 is a FAT bank account and THIN body. Please don’t mix up these like you did last year.");
        englist.add("Dont let your future be based on someone elses past.");
        englist.add("If things are sent by ship then its a cargo and if its sent by road then its a shipment.");
        englist.add("A real man never stops showing his girl how much he loves her even after he has her.");
        englist.add("Whatever you do, good or bad, people will always have something negative to say.");
        englist.add("When you give lot of importance to someone in your life, you lose your importance in their life.");
        englist.add("The best thing about waiting is having what you really deserve.");
        englist.add("Be crazy. Be stupid. Be Silly. Be weird. Be whatever because life is too short to be anything but happy.");
        englist.add("Real beauty lies not in the physical appearance, but in the heart.");
        englist.add("I automatically classify anything over $5 as expensive.");
        englist.add("Nobody wants to hear this but sometimes the person you want most is the person you are best without.");
        englist.add("When life gives you question, just google the damn thing!");
        englist.add("Women marry men hoping they will change. Men marry women hoping they will not. So each is inevitably disappointed.");
        englist.add("Always have a smile on your face. Never give anyone the satisfaction of seeing you down.");
        englist.add("You become like the 5 people you spend the most time with. Choose carefully.");
        englist.add("Don’t depend too much on anyone in this world. Even your shadow leaves you when you are in darkness.");
        englist.add("Rain falls b’coz the sky can no longer handle its weigh just like tears fall b’coz heart can no longer handle the pain.");
        englist.add("It’s easy to fool the eye but it’s hard to fool the heart.");
        englist.add("Love has 4 letters, but so does hate; Truth has 5 letters, but so does lying; Friends has 7 letters, but so does enemies.");
        englist.add("YOU want it? Then FIGHT for it.");
        englist.add("Its funny how girls run from the guys who try to make them happy and fight for the ones who make them cry.");
        englist.add("Dear LOL, Thanks for being there when I have nothing else to say.");
        englist.add("That awkward moment when your kindness is mistaken with flirting.");
        englist.add("If at first you don’t succeed blame someone else and seek counsling.");
        englist.add("Being someone’s first love may be great, but to be their last is beyond perfect.");
        englist.add("I don’t know where I stand with you. And I don’t know what I mean to you. All I know is everytime I think of you, all I wanna do is be with you.");
        englist.add("You will laugh because you feel like a fool…");
        englist.add("I have had a horribly busy day converting OXYGEN to CARBON DIOXIDE.");
        englist.add("To make someone happy, give them three things: Attention, Affection and Appreciation.");
        englist.add("The first person that you think of in the morning and the last person you think of in the night is either the cause of your happiness or the cause of your pain.");
        englist.add("Being real is like being a lady… if you have to tell people you are… you are not.");
        englist.add("What doesn’t kill you only makes you stronger.");
        englist.add("True Love is a friendship set on fire.");
        englist.add("Never allow yourself to become one of those people who, when they are old, tell you how they missed their chances.");
        englist.add("Past can hurt but you can either run from it or learn from it.");
        englist.add("The 'Earth' without 'Art' is just 'EH'.");
        englist.add("The best part about daylight savings is that the clock in my car is correct again.");
        englist.add("Men only have two faults, what they do, and what they say..");
        englist.add("Unless you have lived through what i have, don’t judge the actions i have taken. And i promise you, you don’t know the half of it.");
        englist.add("Think positive, encouraging, uplifting thoughts, and the negative will soon disappear.");
        englist.add("Amazon's recommendations are like that friend who heard you say 'ninja' once and then got you ninja stuff for your birthday every year for twenty years");
        englist.add("Strength is looking back and seeing what you have been through and knowing you were strong enough to make it through.");
        englist.add("would like my Facebook friends to comment on this status sharing how you met me. But I want you to LIE");
        englist.add("You can live without a person who says YOU ARE FINE. But you can’t live without person who says IM YOURS.");
        englist.add("How many boxes of these Thin Mints do I need to eat before I start seeing results?");
        englist.add("SINGLE is not a relationship status. Its a word describing your loneliness. If you ask me, yes I’m SINGLE.");
        englist.add("Its December and Couples are dating & Singles are waiting :)");
        englist.add("Worry is a total waste of time. It doesn’t change anything. All it does is steal your joy and keep you very busy doing nothing.");
        englist.add("If a man wants you, nothing can keep him away. If he doesn’t want you, nothing can make him stay.");
        englist.add("You want to see a perfect relationship? Watch a movie.");
        englist.add("I remember everything I choose to forget.");
        englist.add("Dear PAST, thank you for all the lessons. Dear FUTURE, I’m now ready.");
        englist.add("We all have that one person we hate but constantly look at their facebook profile.");
        englist.add("A woman either loves or hates; she knows no medium.");
        englist.add("Good, Better, Best. Never let it rest. Until your good is better and your better is best.");
        englist.add("In the end, its about being proud of yourself for being where you are now.");
        englist.add("Don’t do something permanently stupid just because you are temporarily upset.");
        englist.add("He stole my heart…So I stole his last name.");
        englist.add("Lets just pretend ITS FRIDAY :)");
        englist.add("Keeping a place for me in ur heart is ok, but keeping a place for me in your mind might be dangerous because people say… I am Mind Blowing.");
        englist.add("When people expect you to fail, prove them wrong..");
        englist.add("The only way to accept an insult is to ignore it. If you cant ignore it, than top it. If you cant top it, then laugh at it. If you cant laugh, you deserved it.");
        englist.add("You laugh at me because I am different, I laugh at you because you are all the same.");
        englist.add("Everyone deserves a 2nd chance, not for repeating mistake but for correcting …..");
        englist.add("Laugh as much as you breath and love as much as you live.");
        englist.add("That awkward moment when you're at your friend's house and he is getting yelled at, so you just stand there and pet the dog.");
        englist.add("If you chase two rabbits, both will escape.");
        englist.add("If you wait to be happy you will wait forever, but if u start to be Happy you will be happy forever..");
        englist.add("The most valuable asset you will ever have is your mind and what you put into it.");
        englist.add("Know your worth, stand your ground and never settle for less than you deserve.");
        englist.add("I taught you everything you know but not everything I KNOW.");
        englist.add("People change and forget to tell each other.");
        englist.add("Are all the men in this place shy?");
        englist.add("If you want your dreams to come true, DONT SLEEP!");
        englist.add("Pretending to be busy writing when the teacher starts calling on random people.");
        englist.add("I've set my 'life goals' to stuff I've already done so literally every day now I'm overachieving. It's all about perspective.");
        englist.add("When the rich robs the poor, it’s called business. When the poor fight back, it’s called violence.");
        englist.add("Nothing is wrong if it feels good :)");
        englist.add("I hate it when you are super excited for something and everything goes wrong.");
        englist.add("Today is the oldest you’ve even been and the youngest you’ll ever be again.");
        englist.add("All our dreams can come true – if we have the courage to pursue them.");
        englist.add("Sometimes the last thing you want to hear is the first thing you need to hear.");
        englist.add("The best revenge is just moving on and getting over it. Don’t give someone the satisfaction of watching you suffer.");
        englist.add("When you cant do anything else, LAUGH.");
        englist.add("TӨ IMPЯΣSS Λ GIЯL FIЯST IMPЯΣSS ΣЯ FЯIΣПDS.");
        englist.add("LOVE Cycle: Strangers –> Friends –> Best friends –> Lovers –> Heart Break –> Strangers");
        englist.add("You can’t start the next chapter of your life if you keep re-reading the last one.");
        englist.add("“An average person, lies 10 times a day. And the most common lie is “I AM FINE”.");
        englist.add("Impossible only means that you haven't found the solution yet.");
        englist.add("Even the darkest night will end and the sun will rise.");
        englist.add("If you're told you only have six months to live, immediately get married. It will make those six months seem like eternity.");
        englist.add("EGO is the only requirement to destroy any relationship.");
        englist.add("Everything happens for a reason. Sometimes the reason is that you are stupid and make bad decisions.");
        englist.add("Nothing in the world is more common than unsuccessful people with talent.");
        englist.add("The awkward moment when you enter class late and everyone stares at you.");
        englist.add("The person who loves you more will fight with you daily without any reason but whenever you are sad that person will fight with the world to end your sadness.");
        englist.add("Life is a game, you can be a player or a toy.");
        englist.add("Sometimes our hearts lead us to places we may be afraid to go and yet sometimes we just need to “follow our hearts”.");
        englist.add("Topless pictures of the Royal Family don't shock me as much as pictures of them doing manual labor would.");
        englist.add("Life is unfair but sometimes it is unfair in our favour.");
        englist.add("One of my biggest mistakes… is having high expectations of certain individuals.");
        englist.add("At last! I finally found the perfect girl :)");
        englist.add("My friends: wow what a perfect morning for a run. Me: wow what a perfect morning to go the heck back to sleep.");
        englist.add("I don’t believe in love at first sight, b’coz it means you are falling in love with someone’s appearance, not personality.");
        englist.add("Your eye is the only part you can not wash with soap.");
        englist.add("Love starts with “You are DIFFERENT” and ends with “You are all the SAME”. RIGHT?");
        englist.add("Two hardest things to say in life are HELLO for the first time and GOOD BYE for the last.");
        englist.add("Begin at the beginning and go on till you come to the end then stop.");
        englist.add("My Viagra addiction was the hardest time of my life.");
        englist.add("Write your sad times in the sand so the pain will wash away and write your happy times in stone, so the memories will never fade.");
        englist.add("Lets find some beautiful place to get lost.");
        englist.add("The Cutest Proposal of the world from a cute girl to a boy… Girl : “Hey, I have lost my Surname.. Can I use Yours”");
        englist.add("I speak two languages, Body and English.");
        englist.add("We make a living by what we get, we make a life by what we give.");
        englist.add("Some people are like trees, they take forever to grow up.");
        englist.add("Why is it called lipstick if you can still move your lips?");
        englist.add("I can’t, but together we can");
        englist.add("Don't make me regret letting you merge into my lane. (Source: Funny Status Update Fan Page )");
        englist.add("Just cause you're sleeping with someone doesn't automatically make them yours! If there's no commitment then it's all fair game!!");
        englist.add("What consumes your mind, control your life.");
        englist.add("Tried, Tested, and TRUE. And to think I thought DIFFERENT..");
        englist.add("Time is like money: you can either spend, waste, or invest!");
        englist.add("EGO is the only requirement to destroy any relationship. So SKIP the E and Let it GO.");
        englist.add("Only the person who has faith in himself is able to be faithful to others.");
        englist.add("Please hold, your call is important to us. Not 'hire more operators' important.. But like 'if you need to hang up, that's cool' important.");
        englist.add("Actions speak louder than words, so believe what you see and forget what you heard.");
        englist.add("Says “Don’t consider past mistakes regrets, consider them as lessons learned.");
        englist.add("Saying 'What?' And then realizing what they said a second later.");
        englist.add("The past was never a mistake if you learned from it..");
        englist.add("I hope to be just famous enough to one day have two people I’ve never met debate whether I’m alive or dead.");
        englist.add("Our life are defined by opportunities, even the ones we miss.");
        englist.add("A rumor goes in one ear and out of many mouths.");
        englist.add("If you are still looking for a happy ending I suggest you start searching for a new beginning.");
        englist.add("Don’t use your words to describe the situation. Use your words to change the situation.");
        englist.add("The longer you wait for something, the more you appreciate it when you get it, because anything worth having is definitely worth waiting for…");
        englist.add("If you want success, then dont rely on other people to do what you can also do.");
        englist.add("Before you assume, learn the facts. Before you judge, understand why. Before you hurt someone, feel. Before you speak, think.");
        englist.add("Teaching is the profession that creates all others.");
        englist.add("Keep correcting your little mistakes, B’coz nobody slips down by hills, but just slips by little stones.");
        englist.add("Sometime it’s all about presentation. The sun does all the work, the moon only presents it in a better way.");
        englist.add("Life is tough. It’s even tougher if you’re stupid.");
        englist.add("Crying doesn’t indicate that you’re weak. Since birth, it has been a sign that you’re alive.");
        englist.add("The sad moment when you see your ex and they act like you don’t even exist.");
        englist.add("Do not try to live forever. You will not succeed.");
        englist.add("Says the only constant is change, except from a vending machine.");
        englist.add("Words are seeds. They land in our hearts. Be careful what you plant and careful what you say. You might have to eat what you planted one day.");
        englist.add("Sorry, I dont have time to hate you as much as you hate me b’coz Im busy Loving the people that love me.");
        englist.add("Cheer up, the worst is yet to come.");
        englist.add("Sometimes we need to stop analyzing the past, stop planning the future, just live your life & make the best of it.");
        englist.add("Every little lie you lie brings us closer to goodbye.");
        englist.add("Dont believe the doubted one and dont doubt the believed one.");
        englist.add("Your tongue can not reach all your teeth.");
        englist.add("Trust is like an eraser. It gets smaller with every mistake you make.");
        englist.add("The worst feeling is when you smile at your crush, but they don’t even acknowledge your existence.");
        englist.add("Your life will get better when you realize it’s better to be alone than chase people who don’t really care about you.");
        englist.add("Crying doesn't indicate that you're weak. Since birth, it has been a sign that you're alive.");
        englist.add("Thinks it was something he ate.");
        englist.add("I have honestly tried to let you go, I have honestly tried to forget you, I have honestly tried not to think of you but I honestly can’t cause I honestly don’t want to.");
        englist.add("Friends, Health & Love. These things don’t come with price tags but when we lose then we realize the COST.");
        englist.add("Every mother on earth gave birth to a child except my mother. She gave birth to a legend.");
        englist.add("Whenever someone says to me 'Things could be worse' I punch them in the face and say 'Like that?'");
        englist.add("In women everything is heart, even the head.");
        englist.add("Love is a fire but whether it’s going to warm your hearth or burn down your house, you can never tell.");
        englist.add("A relationship without trust is like a car without gas. You can stay in it but it won’t go anywhere.");
        englist.add("The biggest lie I tell meself: I don’t need to write that down, I’ll remember it.");
        englist.add("Is there anything more awkward than when you are singing along to a song on youtube and the music stops loading.");
        englist.add("Real men stay faithful. They don’t have time to look for another woman b’coz they are too busy looking for new ways to love their own.");
        englist.add("Mistakes are a part of life. If you don’t make them, you will never learn. If you never learn, you will never improve.");
        englist.add("I am not weird I just find creative ways to entertain myself");
        englist.add("Don’t let your dreams just be DREAMS!");
        englist.add("To all those who received a book from me as a Christmas present, they are due back at the library today..");
        englist.add("If a relationship is to evolve, it must go through a series of endings.");
        englist.add("I am on the “Starts tomorrow” diet.");
        englist.add("Mission one accomplished, I woke up.");
        englist.add("I wish I was as smart as I think I am.");

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