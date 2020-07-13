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

public class Facebook extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Facebook() {
        // Required empty public constructor
    }

    public static Facebook newInstance(String param1, String param2) {
        Facebook fragment = new Facebook();
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

        englist.add("2 mints silent for those.. Who seen but didn't like my posts.");
        englist.add("You are the reason behind why I log-in to facebook everyday.");
        englist.add("Facebook is like the fridge, you know there is nothing new but check it anyway.");
        englist.add("The worst mistake you can make is walking away from the person who actually stood there and waited for you.");
        englist.add("If a thousand painters worked for a thousand years, they could not create a work of art as beautiful as you.");
        englist.add("Fake is the new trend and some of my friends seem to be in style.");
        englist.add("“Best Revenge” Smile, Be Happy, Never let them know it hurt.");
        englist.add("A whisper in your ear, a flutter in your heart, a hand on your shoulder, Listen for it, God is always speaking to us.");
        englist.add("No matter how far life seperates us, no one will ever love you like I did.");
        englist.add("Do more of what makes you happy.");
        englist.add("That annoying couple who decided to show the world over Facebook how much they love each other :/");
        englist.add("Listen to your enemy’s speech, because your mistakes are well known by your enemies only.");
        englist.add("Facebook Saves Life..!! A depressed college Student went to Railway Track for Suicide.... Train was Coming Closer and He Suddenly came out of the track and Said... Oh Shitt !! Forgot to Update status In Facebook that Im Gonna Die :D");
        englist.add("Goodbye 2012 You made me cry, you made me laugh but its time to move on.");
        englist.add("Dear FACEBOOK! Don't show us so much attitude, You can't even Sign Up without us Yours Sincerely: Msn, Yahoo, Gmail, Hotmail :P");
        englist.add("Difference between Love and Life? Without Love there is no life.");
        englist.add("I don’t wish to be everything to everyone but I would like to be something to someone.");
        englist.add("3 things I have learned from facebook! (1) Never trust FB friends. One day they will backstab you. (2) Never be in a relationship from FB. Better be in relationship with 1 you know personally. (3) Don't be excited if you receive friend request from girl, it may be fake id. :P");
        englist.add("Never lie to a girl. Chances are, we already know the truth before we ask.");
        englist.add("What is the problem of boys on facebook, They fell in love with fake profile... And it hurts them :-P :-P");
        englist.add("My day is not complete without hearing your voice or getting a text from you.");
        englist.add("Relationships are like computer games. It ends fast when cheats exist.");
        englist.add("Time is still the best answer, forgiveness is still the best pain killer and God is still the best healer.");
        englist.add("The minute you think of giving up, think of the reason why you held on so long.");
        englist.add("Confidence is the ability to feel beautiful, without needing someone to tell you.");
        englist.add("If you wanna know something, ask them. Don’t assume. That’s how drama starts.");
        englist.add("Smiling when something dirty comes on your mind.");
        englist.add("School may be hard, annoying, and irritating. But admit it, you’re going to miss it when it ends.");
        englist.add("The only guy who deserves you, is the one who thinks he doesn’t.");
        englist.add("If you are not treating her right, don’t be mad when someone else steps in and does your job.");
        englist.add("Everyone has baggage from past relationships, but the person who really matters is the one that will stand there and help you “unpack”.");
        englist.add("Dear Facebook..! Plz change your What's on your mind to Copied..??...Now Paste Here! :P :P :P:P");
        englist.add("That awkward moment when you hear yourself eating crunchy food and wonder if other people can hear it too.");
        englist.add("On social networking sites, the winner of any argument is always the one with better English. :D");
        englist.add("Everything Happens For A Reason. Do you agree?");
        englist.add("There Are Lessons In Life That Cannot Be Taught In School That's Why There Is.... F A C E B O O K...:p :D :O");
        englist.add("Patience is the key to achieve your goals.");
        englist.add("In a great romance, each person plays a part the other really likes.");
        englist.add("We have all the solutions to the problems that aren’t ours.");
        englist.add("“Facebook” Where I lie to my friends.”Twitter” Where Im honest with strangers.");
        englist.add("The first thing we think when someone takes a photo of us..Will it look good on Facebook ? ;) :P");
        englist.add("Did anyone else notice the sound if you click the like button on my status?");
        englist.add("How Stories Will Begin In The Future Once Upon A Timeline... :D");
        englist.add("Don’t look for happiness, create it..");
        englist.add("When I'll Die, I'll Give Permission To Ma Friend For Changing My Status To - Is Chilling With God");
        englist.add("The best person to talk about the problems is your relationship is the person you are in a relationship with.");
        englist.add("You can’t have a better tomorrow if you are thinking about yesterday all the time.");
        englist.add("Distance never separates a couple if the feelings are from the heart.");
        englist.add("I am a thief, and I am here to steal your heart.");
        englist.add("Forget what hurt you in the past. But never forget what it taught you.");
        englist.add("SINGLE is not a relationship status. Its a word describing your loneliness. If you ask me, yes I'm SINGLE.");
        englist.add("A bank is a place that will lend you money, if you can prove that you don’t need it.");
        englist.add("Being single doesn’t mean you are weak, it means you are strong enough to wait for what you deserve.");
        englist.add("Apart from being sexy, what do you do for a living?");
        englist.add("It’s not important where you are, important are the people you are with.");
        englist.add("I was born to make mistakes, and I’ll die with all of my lessons learned.");
        englist.add("Send me game request and Win Free Unfriend .. :P");
        englist.add("Don’t you hate it when people just randomly tag you in their Facebook post!?");
        englist.add("Sometimes you cannot believe what you see. You have to believe what you feel.");
        englist.add("Your smile is a very powerful weapon, use it wisely. You can make someone really happy or unhappy with that little movement of your lips.");
        englist.add("Some relationships come when you don’t need them, some relationships go when you realize you need them.");
        englist.add("I Still Remember Those Days When Photos Were Taken For Memories & Not For Facebook Profiles..!! :-| ;)");
        englist.add("Never conclude a person by his present status. Because time has the great power to change a useless coal into a valuable diamond.");
        englist.add("As long as there’s ALLAH in the sky protects me. There’s no one on earth who would break me.");
        englist.add("If you want to change your life, change your mind.");
        englist.add("GOD knows who belongs in your life and who doesn’t. Trust and let go. Whoever is meant to be there, will still be there.");
        englist.add("We are only given today and never promised tomorrow. So make sure you tell the people who are special in your life that you love them.");
        englist.add("People too weak to follow their own dreams will always find a way to discourage yours.");
        englist.add("Be thankful for all you have, because you never know what will happen next.");
        englist.add("Never cry for someone who hurts you, smile and say thanks for helping me realize I don’t even need you.");
        englist.add("Definition of LIKE button on Facebook!!! Girls believe that it will cost Rs 5 for hitting like button 1 Time and they don't like anything except their own status.... Whereas boys know that its completely free of cost and effectively utilize it to impress girls by Liking their Status updates and comments even if they are senseless.... Welcome To FACEBOOK :P");
        englist.add("Dear God, thank you for being there when no one else was.");
        englist.add("In every heart there is a secret nerve that answers to the vibration of love :)");
        englist.add("Time is the most elastic element in the world. It increases minutes when we are waiting and decreases hours when we are enjoying.");
        englist.add("Facebook and Twitter are becoming new favorite investigative tools for divorce lawyers.:p=D");
        englist.add("It is better to have an enemy who honesty says they hate you than to have a friend who’s putting you down SECRETLY.");
        englist.add("You appear just like a dream to me!");
        englist.add("Don’t promise when you are happy, don’t reply when you are angry and don’t decide when you are sad.");
        englist.add("No matter how old I get I’ll never need glasses to see your beauty.");
        englist.add("By the time children realize their parents were right, they have children who think they are wrong.");
        englist.add("Don’t bother yourself crying for people who leave you. But start loving people who come in to your life to stay.");
        englist.add("People who spend their time taking selfies should change their last name to .JPEG");
        englist.add("I guess actions Speak Everything..... Not a Facebook Status!!!");
        englist.add("Everybody deserves someone who makes them look forward to a beautiful tomorrow.");
        englist.add("Just because my status is Single... doesn't mean I am 'Available'.. It's just that my family members are in my friends list on Facebook.");
        englist.add("My mom told me angels are in heaven, so why is she on Earth?");
        englist.add("You need a rajnikanth's heart... to reject a Girl's request on facebook =)) :p");
        englist.add("Don’t waste your time with explainations, people only hear what they want to hear.");
        englist.add("Sometimes people thousands of miles away from you can make you feel better than people right besides you.");
        englist.add("A lot of problems would disappear if we talked to each other more than talking about each other.");
        englist.add("If you never give anything to the world, how will anyone ever know you exist?");
        englist.add("Even if you live your life as a open book, people will still wonder which pages have secret messages.");
        englist.add("You know you are addicted to Facebook when you log off Facebook, turn your computer off, go to bed, role over, and log onto your Facebook from your phone one last time for the night.");
        englist.add("If you want to make this world a better place, make yourself a better person.");
        englist.add("Is convinced Facebook is a time machine. . . I only came on a minute ago and already 2 hours have passed!?");
        englist.add("First date is awkward, first kiss is heavenly, first love is irreplaceable and first heart break is unforgettable.");
        englist.add("You can close your eyes to things you don’t want to see, but you can’t close your heart to the things you don’t want to feel.");
        englist.add("Just because Im busy doesn’t mean I don’t love you.");
        englist.add("Today I caught myself smiling for no reason, then I realized I was thinking about you.");
        englist.add("When you have nothing good to Post on FB, don't put pressure on yourself....you may Shit.");
        englist.add("Admit it, you are not the same person you were a year ago.");
        englist.add("Do not make assumptions unless you know the whole story. If in doubt, ask the person directly.");
        englist.add("It really sucks when the only status that comes to your mind is something you can't share :/ :P");
        englist.add("When you accept somebody, you accept their past, too. Don’t hold it against them later.");
        englist.add("God save me from my friends, I can protect myself from my enemies.");
        englist.add("Just because you can’t see the air, doesn’t mean you stop breathing. Just because you can’t see God, doesn’t mean you stop believing.");
        englist.add("Nokia Connecting People.... Facebook connecting Fake People :D");
        englist.add("Forever and always is a long time, but it’s a long time I wanna spend with you.");
        englist.add("I remember when staying up until midnight was hard to do, now it’s a bad habit.");
        englist.add("When you take an amazing picture you automatically think: That will be my new profile picture.");
        englist.add("Wouldn’t we look cute on a wedding cake together?");
        englist.add("Take time to WORK, it is the price of success.");
        englist.add("If you can’t get someone out of your head then may be they are supposed to be there.");
        englist.add("People who are not happy with themselves, can not possibly be happy with you.");
        englist.add("We may love the wrong person, cry for the wrong person. but one thing is sure, mistakes help us find the right person.");
        englist.add("Never interrupt your enemy when he is making a mistake.");
        englist.add("Don’t cheat. If you’re not happy just leave.");
        englist.add("Be so happy that when others look at you they become happy too.");
        englist.add("Never cry for that person who doesn’t know the value of your tears.");
        englist.add("A daughter is a little girl that grows up to be a FRIEND.");
        englist.add("Relationship now a days.... start wid poking And... end wid blocking :p :)");
        englist.add("Never say, ‘oops’ Always say, Ah, interesting.");
        englist.add("You are my every breath that I breathe.");
        englist.add("I need someone really bad, are you really bad? :-)");
        englist.add("Wanting to end your life while you are alive is worst than death it self.");
        englist.add("Even though we yelled at each other, it’s still nice to know he cared.");
        englist.add("Not everything that is faced can be changed, but nothing can be changed until it is faced.");
        englist.add("Having a sharp memory is great, but sometimes the ability to forget is a lot better.");
        englist.add("I lost my mind long ago, ever since I never mind.");
        englist.add("Love is like the wind, you can’t see it but you can feel it all over.");
        englist.add("You’re so hot, you must be the cause for global warming.");
        englist.add("When I truly care for someone, their mistakes never change my feelings b’coz its the mind that gets angry but the heart still cares.");
        englist.add("I want to be weird with you :)");
        englist.add("Be thankful for facebook … The way gas prices are headed .. we may never actually see each other again.");
        englist.add("Problems can’t be solved by the same level of thinking that created them.");
        englist.add("It’s so funny how the people who know the least about you, have the most to say.");
        englist.add("Getting Blocked by your GF/BF on Facebook is like electronic Divorce :p :D");
        englist.add("Don’t search for someone you can live with, search for someone you can’t live without.");
        englist.add("Whatever you do, good or bad, people will always have something negative to say!");
        englist.add("If your relationship status says, It's complicated you should stop kidding yourself and change it to Single");
        englist.add("Accept what you can’t change and change what you can’t accept.");
        englist.add("Love someone not because they give you what you need, but b’coz they give you feelings you never thought you needed.");
        englist.add("“LOVE ONE ANOTEHER” If it doesn’t work, just interchange the last two words.");
        englist.add("When you see me smiling at you its not that I’m happy but you might want to run..");
        englist.add("Life doesn’t get easier, you just get stronger.");
        englist.add("My Girlfriend ask me... Facebook or Me? Sometimes I really miss her.. :P :D");
        englist.add("Empty pockets teaches you a million things in life but full pockets spoils you in a million ways.");
        englist.add("In my life I must confess. I wish I had loved more & hated less.");
        englist.add("Tell me what status should be if the person is single but also telling that he/she not available....?");
        englist.add("Confidence is admitting who you are, what you’ve done, and loving yourself for who you’ve become, no matter what others think of you.");
        englist.add("Someone asked me, How’s life? I just smiled and replied, She’s fine.");
        englist.add("My life is nothing without you.. cant live a moment without you, thinking of you going away from my life, even from my dreams.");
        englist.add("Every story has an ending. But in life every ending is just a new beginning.");
        englist.add("I’m going to bed, and nothings going to stop m");
        englist.add("I wish memories were like text messages. You can delete the ones you hate and keep the ones you like.");
        englist.add("The sweetest things you can do for a girl are the little things that let her know she’s in your heart & on your mind.");
        englist.add("Did you know that when people appear in your dreams, it’s because that person wants to see you?");
        englist.add("Easy is to judge the mistakes of others. Difficult is to recognize our own mistakes.");
        englist.add("Awesome moment is when you reading someone's status and you know its for you.... :-)");
        englist.add("Behind every deleted Facebook & Whatsapp account there is an untold story");
        englist.add("Make sure the important people in your life know how important they are before it’s too late.");
        englist.add("We all have that one friend who’s family likes us better than they like their own child.");
        englist.add("Smile and let the whole world wonder why.");
        englist.add("Success is simple. Do what’s right, the right way, at the right time.");
        englist.add("When Ever I see Your NaMe In My NotiFication I dun Know wHy a SMILE AutomatiCally ComeS On My Face....");
        englist.add("Never feel sad about losing anything in life because whenever a tree loses a leaf, A new leaf grows in its place.");
        englist.add("Action may not always bring happiness but there is no happiness without action.");
        englist.add("Hi , I Exist !");
        englist.add("Love starts when another person’s needs become more important than your own.");
        englist.add("All my friends are getting jobs, engaged, or married. I am just getting more awesome.");
        englist.add("Be very careful about what you think …. Your thoughts run your life.");
        englist.add("Missing someone is not an indication that you are meant to be with them");
        englist.add("Accept your past without regrets, handle your present with confidence and face your future without fear.");
        englist.add("Im not single. Im in a long standing relationship with fun and freedom :)");
        englist.add("The best revenge you can have is simply moving on and getting over your troubles. Don’t give anyone the satisfaction of seeing you suffer.");
        englist.add("Communication + Trust = A relationship that will last a lifetime.");
        englist.add("I hate studying for exams, Is there any fb APPLICATION for that?");
        englist.add("A man’s biggest mistake is giving another man the opportunity to make his woman smile.");
        englist.add("Just because someone is not your definition of beautiful doesn’t give you the right to call them ugly.");
        englist.add("Facebook is like a relationship, Faithful on your wall, but cheating in their inbox..");
        englist.add("I love my life because it gave me you. I love you because you are my life.");
        englist.add("The more you love your decisions, the less you need others to love them.");
        englist.add("That awkward moment when there’s more than one camera taking a picture and you have no idea which one to look at.");
        englist.add("Because of you, half the time I dont even know that I am smiling.");
        englist.add("Look back, remember, smile, then move on.");
        englist.add("I wish I can delete you from my mind as easy as deleting you from facebook.");
        englist.add("Don’t be afraid to change. You may lose something good but you may gain something better.");
        englist.add("People on facebook dont even bother to say HI.. but they never forget to wish you birthday! how cute :)");
        englist.add("Why is Facebook such a hit? It works on the principle that People are more interested in others lyf then their own!");
        englist.add("I will never stop trying, because when you find the one …. you never give up.");
        englist.add("When I was younger, I wanted to be older. Now that im older, I want to be a kid again.");
        englist.add("Who says that Facebook friends are not your real friends? They enjoy seeing you on the internet every day. Miss you when you're not on. Showing compassion when you lose someone you love. Sends you greetings on your birthday. Viewing the pictures you put on, likes your status. Makes you laugh when you are sad. Makes you laugh when you have the urge to cry.");
        englist.add("Nothing is more romantic than letting you know that I love you… via this facebook status.");
        englist.add("People can`t change the truth, but the truth can change people.");
        englist.add("I am so confused. They told me that angels are only in heaven, but I’ve found one here.");
        englist.add("Forever is long time, but I wouldn’t mind spending it by your side.");
        englist.add("Some people have to close their eyes to dream, with you I only have to open mine.");
        englist.add("Whenever I See Your name in My notifications I Don't Know Why, I automatically Smile ... :):)");
        englist.add("I login to Facebook, I get bored, but i still don't wanna leave it.");
        englist.add("Just remember, you can’t put your arms around a memory, so hug someone you love, today.");
        englist.add("Facebook is in relationship with youtube..:-P");
        englist.add("I was content with my life till people started sharing pictures of their vacations, cars and parties on Facebook!");
        englist.add("I want to be the only hand you ever need to hold.");
        englist.add("When people try to bring you down, it just means you’re above them..");
        englist.add("The happiness of your life depends upon the quality of your thoughts.");
        englist.add("I thought I wanted a career, but it turns out I just wanted paychecks.");
        englist.add("You grow up the day you have your first real laugh …………. at yourself.");
        englist.add("Life is about change, sometimes it’s painful, sometimes it’s beautiful, but most of the time it’s both.");
        englist.add("Sometimes I wish you were in my shoes so that one day you would be able to understand my pain and the hell I go through for you.");
        englist.add("I had a facebook crush, it all ended after her photoshop trial version expired.");
        englist.add("You don’t realize what you had until it’s gone , but there is a reason for every goodbye. God just chose a different path for you.");
        englist.add("Single is not a status. It is a word that best describes a person who is strong enough to live and enjoy life without depending on others.");
        englist.add("Everything is funny as long as it is happening to somebody else.");
        englist.add("A scond chance means nothing if nothing is learned from past mistakes.");
        englist.add("I hate it when you have to be nice to someone you really want to throw a brick at.");
        englist.add("Never forget those who gave you a helping hand, and always remember those who didnt.");
        englist.add("No texts? No phone calls? I understand, so when you see me with someone else. Please Understand.");
        englist.add("Learn how to give your absence to those who don’t appreciate your presence, in the end you will make them realize how important your presence is.");
        englist.add("You`ll never be perfect. But you`ll always be unique.");
        englist.add("Your prince will come one day. He may not ride a white horse or live in a big castle but he will love you and only you.");
        englist.add("Laugh when you can, apologize when you should and let go of what you can’t change.");
        englist.add("Be nice to everyone, always smile, and appreciate things because it could all be gone tomorrow.");
        englist.add("The ancestor of every action is a thought.");
        englist.add("There is only one perfect child in the world and every mother has it.");
        englist.add("Smile, A curve that can set a lot of things straight.");
        englist.add("The greatest challenge in life is discovering who you really are and second thing is being happy with what you find.");
        englist.add("Love is like a call if you don’t recieve, it will be missed. FRIENDSHIP is like an sms until you open it waits.");
        englist.add("You don’t need words to show that you care for someone, just like Mr Bean. He rarely speaks but never leaves his teddy behind.");
        englist.add("I don’t trust easily. So when I say I trust you, Don’t make me regret it.");
        englist.add("The future is scary, but you can’t just run back to the past b’coz it’s fimiliar. Yes, it’s tempting but its a mistake.");
        englist.add("Just because you think your way is right, doesn’t mean all people must follow your way.");
        englist.add("I just want to lay on your chest and listen your heartbeat.");
        englist.add("Your life is a result of the choices you make. If you dont like your life, it is time to start making better choices.");
        englist.add("Don’t find reasons to stay with someone who always finds a reason to leave.");
        englist.add("Single and looking… anyone wanna be found?");
        englist.add("Why are you always waiting, tomorrow isn’t guaranteed.");
        englist.add("I’m not heartless, I’ve just learned how to use my heart less.");
        englist.add("You know you are the best when people you don’t know hate you.");
        englist.add("If someone hurts you, just keep your head up high and prove to them that you don’t need them to be happy.");
        englist.add("SMILE ……………… It confuses people :)");
        englist.add("Dear Facebook, Don't feel proud about your popularity 60% of your profiles are fake ! :P");
        englist.add("Life is like Facebook. People will like your problems and comment, but no one will solve them because everyone is busy updating theirs.");
        englist.add("There’s difference between giving up & letting go. Letting go is sacrificing what was rightfull yours. And giving up is forgetting what was never yours.");
        englist.add("The difference between school and life? In school, you’re taught a lesson and then given a test. In life, you’re given a test that teaches you a lesson.");
        englist.add("You can’t always get what you want.");
        englist.add("When your mood is not good without any reason, you are definitely missing someone.");
        englist.add("Whoever invented the COPY and PASTE has saved many hours of my life.");
        englist.add("The best kind of relationship in the world is the one in which a sorry & a smile can make everything back to normal again.");
        englist.add("Every sweet has its sour; every evil it`s good..");
        englist.add("Life is unpredictable and you never know what is coming next. Don’t ever get too comfortable. Always be ready for change.");
        englist.add("A new day, a new sun rise, a new blessing.");
        englist.add("Everything happens for a reason. May be you don’t see the reason right now, but when it is finally revealed…. it will blow you away.");
        englist.add("Rumors are carried by haters, spread by fools and accepted by idiots.");
        englist.add("No one loves the man whom he fears.");
        englist.add("Why should I waste a flower when I know he loves me not?");
        englist.add("I`m not arguing, I`m just explaining why I`m right.");
        englist.add("I don’t give up easily. I fight for what I want.");
        englist.add("Distance doesn’t matter if you really love the person, what matters most is your honesty and trust for that relationship to work out.");
        englist.add("Why is FaceboOk such a hit? It wOrks on the principle that- PeOple are mOre interested in Others life than their Own");
        englist.add("Facebook needs to add a maybe button for friend requests, some people deserve to wait.");
        englist.add("Dear Facebook... Everytime I add a girl you ask me Do you know her? Is she your sister..??? :p");
        englist.add("There’s a reason why BF stands for boyfriend and bestfriend, b’coz they should be one and the same.");
        englist.add("If you spend your life trying to be good at everything, you will never be great at anything.");
        englist.add("It is not what we take up but what we give up that makes us rich.");
        englist.add("Your looks don’t make you pretty, it’s the person inside who makes you pretty.");
        englist.add("The person who looks good in the group photos is always the one who uploads it.!!");
        englist.add("If I ran the country, things would be a lot better. Well ….. for me anyway.");
        englist.add("Life is really simple. Feelings make it complicated.");
        englist.add("The secret to creativity is knowing how to hide your sources.");
        englist.add("One of the hardest things you’ll ever have to do is stop loving someone because they have stopped loving you.");
        englist.add("I hate when I look horrible in a group picture and the person that looks good refuses to delete it.");
        englist.add("Why is it that when you are with me, time goes by fast but when you are not, it’s the opposite.");
        englist.add("Once you lost me, you can never have me back. And if you have me again, it will never be the same.");
        englist.add("Quitting Facebook is the new, adult version of running away from Home. We all know you're doing it for attention and we all know that you'll be back. :p");
        englist.add("For all those Facebook addicts press “Ctrl and W” at the same time and see what happens! Good Luck");
        englist.add("I won`t live for ever, So it`s now or never.");
        englist.add("Life is like Facebook - People will like your problems & often comment on them, but only a few will try and help you solve them, while everyone else is too busy trying to update their status.");
        englist.add("I need someone new in my life.");
        englist.add("When going to work has become a nice break from Facebook, it’s safe to say you’re a Facebook junkie.");
        englist.add("Parents worry about what their sons download and what their daughters upload on the internet.");
        englist.add("I don’t make typos. I make new words.");
        englist.add("You dont become what you want, you become what you believe.");
        englist.add("Sometimes the plan itself sounds so exciting that it is hard for me not to join in.");
        englist.add("Hold Ctrl + n for 30 seconds to see Facebook in green instead of blue.");
        englist.add("Love is so strange. Sometimes it become reason to live life & sometimes it becomes reason to leave life.");
        englist.add("Don’t look back with regets. Look forward with hope.");
        englist.add("Stay true to yourself b’coz there are very few people who will always be true to you.");
        englist.add("Don’t let someone else’s opinion change the way you feel about something. Always stand by what you believe in.");
        englist.add("Be Consistent. Do something every day to make your dreams closer to reality.");
        englist.add("Knowing you are the last generation to remember life before the internet.");
        englist.add("When I first joined Facebook I never thought this sh*t would be this addictive.");
        englist.add("Time decides who you meet in life, your heart decides who you want in your life, but you behaviors decide who will stay in your life…");
        englist.add("I hate it when I look horrible in a group photo and the person who looks good refuses to delete it....");
        englist.add("There are moments in my life that I’ll always remember, not because they were important, but because you were there.");
        englist.add("Even some of the greatest people in life, started out as nothing.");
        englist.add("Our days are happier when we give people a bit of our heart rather than a price of our mind.");
        englist.add("Trust yourself. You know more than you think you do.");
        englist.add("Drug?? No thanks, I am addicted to worst than that.... i:e Facebook xD");
        englist.add("Sometimes the dreams that come true, are the dreams you never even knew you had.");
        englist.add("I will wait for you because I dont want anyone else.");
        englist.add("The most important opinion is the one you have of yourself.");
        englist.add("You are in love with someone when you save their texts and re-read them when no one is watching.");
        englist.add("If you feel a bit lonely, forgotten, or just need someone to cheer you up, remember, you can always change your birthday on Facebook :-P");
        englist.add("A relationship with no arguments, is a relationship with a lot of secrets.");
        englist.add("Stealing other people's statuses on Facebook is called a Facelift.");
        englist.add("Unfriend on Facebook... Is the modern form of Childhood Katti.");
        englist.add("Relationship is like a book, it takes few seconds to burn but years to write. So write it carefully and never let it burn.");
        englist.add("People too weak to follow their own dreams, will always find a way to discourage yours.");
        englist.add("I’ll be burger king and you’ll be mcdonald. I’ll be doing it my way and you’ll be lovin’ it.");
        englist.add("Just because my status is Single... doesn't mean I am ''Available'.. It's just that my family members are in my friends list on Facebook.");
        englist.add("Don’t choose the one who is beautiful, choose the one who makes your world beautiful.");
        englist.add("I really believe that if you set yourself to reach a goal, then one day, you are going to reach it.");
        englist.add("A woman brought you into this world, so you have no right to disrespect one.");
        englist.add("We all have that person that makes our day so much better after they just say “hi”");
        englist.add("Never get so busy with life that you forget to take time to live.");
        englist.add("It is better to live only one day as a tiger than a thousand years as a sheep.");
        englist.add("The things you take for granted, someone else is praying for.");
        englist.add("Don’t care about what other people think of you. There will always be those people who want to see you fail b’coz they can’t succeed.");
        englist.add("Can’t sleep unless im holding on to something or someone.");
        englist.add("The spaces between our fingers were created so that another persons fingers could fill them in.");
        englist.add("I hates studying for exams, Is there any fb APPLICATION for that?");
        englist.add("If a drop of water falls in lake there is no identity.But if it falls on a leaf of lotus it shine like a pearl. Choose the best place where you would shine.");
        englist.add("Sometimes you have to be your own hero, and we be willing to let go of things in your life that you know will never do anything but slow you down.");
        englist.add("One spelling mistake in your update and there you find illegitimate sons and daughters of englishmen to correct it. :D :P");
        englist.add("No matter how ugly someone looks to you, someone out there thinks they are beautiful.");
        englist.add("The two hardest things to say in life are hello for first time and goodbye for the last.");

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