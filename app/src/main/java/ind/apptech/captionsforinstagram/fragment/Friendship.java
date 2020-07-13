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

public class Friendship extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Friendship() {
        // Required empty public constructor
    }

    public static Friendship newInstance(String param1, String param2) {
        Friendship fragment = new Friendship();
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

        englist.add("A friendship that can end never really began !");
        englist.add("Beware when you are judging you friends, for they maybe judging you first!!!");
        englist.add("Should I be happy that we're friends or sad b'boz thats all we will ever be?");
        englist.add("A real friend is one who walks in when the rest of the world walks out.");
        englist.add("Life is a party whenever I'm with you. You turn my tears into smiles when we share and laugh together. You make me spend a lot and it is worth it because I care about you my friend.");
        englist.add("The best cosmetic for the lips is truth, for the voice is prayers, for the eyes is pity, for the hands is charity & for the life is friend ship");
        englist.add("Flirting is a risky game. One mistake, and you are committed.");
        englist.add("Great friends are hard to find, difficult to leave, impossible to forget.");
        englist.add("Love is Docomo, do the new. Marriage is idea can change your life, wife is Hutch, where ever you go she follows but friendship is Airtel one express yourself.");
        englist.add("There may not be something between us to remember forever but there is something that will not make us forget each other, our friends hip.");
        englist.add("Friendship requires little effort even when friends are busy with their own lives, a simple sms reminds each other that you are not forgotten!!!");
        englist.add("Friends show their love in times of trouble, not in happiness.");
        englist.add("A friendship is a see deep like ocean, high like sky, kind like mother, strong like iron, cute like tum and sweet like hum");
        englist.add("Never love a friend who hurts you never hurt a friend who loves you sacrifice everything for a friend who care for you.");
        englist.add("Hold a true friend and don't let go. True friend comes once in a lifetime.");
        englist.add("Your best friends are going to hurt you every once in a while, you must forgive them for that.");
        englist.add("True friends will pick you up when you fall. The bad friends will have been the one who made you fall in the first place.");
        englist.add("There is nothing I would not do for those who are really my friends . I have no notion of loving people by halves, it is not my nature.");
        englist.add("Friendship isn't a big thing it's a million little things.");
        englist.add("Great day that everybody believes that this friendship is everlasting than any other relationship.");
        englist.add("A good way to differentiate love and friendship without you I cannot  live is love u must live, I m with u is friendship!!!!");
        englist.add("I appreciate you deeply, especially knowing that you have loved me in spite of my weakness and allowed me to shine with you as my friend.");
        englist.add("True friends are those who stick by you not only during good times, but also struggle with you through hard times.");
        englist.add("Friendship is a warm feeling which comes from the inner core of the heart it cannot be buy or sell!!");
        englist.add("A friend is one special person who can pull out a happy tear from your eye.. Even if you do not have tears to cry!!");
        englist.add("Friendship is all about three things winning, losing and sharing. Winning your friends heart, losing yourself ego, and sharing joys and sorrows.!!!");
        englist.add("Me and my best friends can communicate just with ...... Face Expressions.");
        englist.add("Nice friends hip is Like The breathing air You Will Never See it But You Will Always Feel its Presence.");
        englist.add("If friends hip is your weakest point then ou are strongest person in the world..");
        englist.add("Good Friends Are Hard to Find, Difficult to Leave, Impossible to Forget.");
        englist.add("Do you think, tat any one can live without friends? It is impossible. Because friends are the inseparable part of our life!!!!");
        englist.add("I know yu hate me, but the day when you will know the truth, you will hate yourself!!!");
        englist.add("Friends tell you not to hit the girl you have wanted to for ages. best friends stand there and watch you kick the shit out of their shouting go on girl....");
        englist.add("Nice friends hip is like the breathing air, you will never see it but you will always feel its presence.");
        englist.add("Never forget who was there for you when no one else was.");
        englist.add("It is easy to earn. Friendship is hard to get; wealthy depreciates everyday but our friends hip will ever appreciate and be there forever.");
        englist.add("True friends are always there for you. Fake friends only appear when they need something from you.");
        englist.add("Friendship is like a paper once it's crumpled it can't be perfect.");
        englist.add("Friendship is a mirror, so that nothing can be hidden.");
        englist.add("Never leave your friends side unless you want drama.");
        englist.add("Good Thinks come to those who wait.");
        englist.add("I care about you deeply and always thank God for you. I want to be your best friend, to support you and be there for you.");
        englist.add("Friends are like stars, they come and go, but the ones that stay are the ones that glow");
        englist.add("True friends say good things behind you back and bad things to your face.");
        englist.add("No one can be friends after being lovers but if they are friends again after being lovers they are the best friends in the world");
        englist.add("Life is a heart attack.. Love is a medicine.. Lover is a treatment.. But, friend is a doctor.. How are you ? My lovable doctor..");
        englist.add("People who tolerate me on the daily basis! are real heroes in my eye.");
        englist.add("Friendship consists in forgetting what one gives and remembering what one receives.");
        englist.add("Liking someone doesn't mean you have to be lovers, sometimes you just have to be friends .");
        englist.add("A true friend never gets in your way unless you happen to be going down");
        englist.add("Be careful about who you trust and tell your problems to. Not everyone who smiles at you is your FRIEND.");
        englist.add("Don't ever think that you can live without friend. Friend is the best thing in the world!!!");
        englist.add("Don't make friends before understand and don't break friends hip after misunderstanding.");
        englist.add("Friends are like fishes we have to keep long patience to catch them. So, it is better to stay nice, otherwise I will fry you.");
        englist.add("A true Friend loves at all times..");
        englist.add("Cute relationship is..... When someone is angry with you and says i will never talk to you... And later comes back to you to just from you.. i am still angry....");
        englist.add("Friendship... is not something you learn in school. But if you haven't learned the meaning of friends hip, you really haven't learned anything.");
        englist.add("Sometimes the best way to stay close to someone you love is being just a friend, nothing more nothing less.");
        englist.add("A true friend is someone who accepts your past, supports your present and encourages your future.");
        englist.add("A friend is someone who knows the song in your heart, and can sing it back to you when you have forgotten the words.");
        englist.add("A friend is someone who knows all abt u and accept u as u are.");
        englist.add("True friend's silence hurts more than an enemy's rough words.");
        englist.add("When friendship is deeply rooted, it is a plant that cannot even be uprooted by a storm.");
        englist.add("One place where you can pretend to have a lot of friends ... FACEBOOK ...");
        englist.add("If you lose a friend because you're honest,he wasn't a good friend..!!");
        englist.add("True friends are the ones who have nice things to say about you behind you back.");
        englist.add("Never say your happy when your sad, never say your fine when you are not ok, never say you feel good when you feel bad, and never say your alone when I m there.");
        englist.add("A poor man says work is life. A rich man says money is life. A lover says love is life but. I say my idiot friends are my life.");
        englist.add("True friends hip comes when silence between two people is comfortable.");
        englist.add("Fan is changed to ac radio is changed to tv cassette to CD lover to wife but, do you know any option to change a friend ?");
        englist.add("Though I may seem not to be expressing anything now, some day you will come to will come to understand that having you is what I will ever live for in life.");
        englist.add("A true friend reaches for your hand and touches your hear.");
        englist.add("True friends hip is sitting together in silence and feeling like it was the best conversation you've ever had.");
        englist.add("Once best friends now strangers with memories.");
        englist.add("The day your f.r.i.e.n.d.s stop bringing their ..problems to you is the day you have lost command over their hearts!!!");
        englist.add("In a multiple choice world a f are I e and the is not a be or c but d. All of the above.");
        englist.add("A single rose can be my garden, a single friend, my world.");
        englist.add("True Friend will stand up for you!");
        englist.add("A loving memory of your smiling face, a friend like you can never replace, deep in my heart you will always stay, truly remembered ever!!");
        englist.add("A single rose can be my garden... a single friend, my world.");
        englist.add("When people see my messages, they think I am addicted to messaging. They are wrong because they do not know that I am addicted . To my sweet friends.!");
        englist.add("Fake Friends Believe In Rumors Real Friends Believe In You.");
        englist.add("friend has no end.");
        englist.add("Heart never hate blood! Flower never hate honey! My heart never hate you and your friendship!!!");
        englist.add("Friends are like stars, they come and go, but the ones that stay are the ones that glow!!!!");
        englist.add("Sound become music, movement becomes dance, smile becomes laughter & life becomes celebration. When old friend keep in touch. Happy friends day!!!");
        englist.add("A true friend sees the first tear, catches the second an stops the third.");
        englist.add("A good friend finds it harder to hold a pencil than to hold a grudge!!!");
        englist.add("A best friend is someone who tells you the truth even when you don't want to hear it.");
        englist.add("Friends are the family you choose");
        englist.add("Friendship is the hardest thing in the world to explain. It's not something you learn in school. But if you haven't learned the meaning of friends hip, you really haven't learned anything.");
        englist.add("Don't walk behind me, I may not lead. Don't walk in front of me, I may not follow. Just walk beside me and be my friend.");
        englist.add("A good friend is always encouraging. He will always appreciate your talent and will support you in doing your best to excel in your academics and in the fields of your interest.");
        englist.add("A loving smile a heart of gold your dearest person this world can hold though heart fails life departs you will live as a friend forever.");
        englist.add("If friends were flowers I would not pick you! I will let you grow in the garden & cultivate you with love and care so I can keep you as a friend forever.");
        englist.add("Golden rules to feel happy: meet a friend, call a friend, talk to your friend, hug a friend, and love a friend.");
        englist.add("Friendship is the only cement that will ever hold the world together.");
        englist.add("Read it carefully and get meaning! Minimum love is friendship. But maximum friendship is love strange but true! Happy friendship day!");
        englist.add("Friendship improves happiness, and abates misery, by doubling our joys, and dividing our grief.");
        englist.add("The single finger of friend that wipes out your tear during your failure is much better than the one0fingers which come together to clap for you.");
        englist.add("What is a Best friend? A single soul in two bodies.");
        englist.add("A true friend is someone who never gets tried of listening to your pointless dramas over and over again.");
        englist.add("Fake friends are like shadows. They follow you in the sun and leave you in the dark.");
        englist.add("At the shrine of friendship never say die, let the wine of friendship never run dry.");
        englist.add("Anybody can sympathize with the sufferings of a friend, but it requires a very fine nature to sympathise with a friend's success.");
        englist.add("You don't make friends , recognize them.");
        englist.add("I would rather walk with a friend in the dark, than alone in the light.");
        englist.add("Your father guides your mother cares your brother shares your sister loves..But a true friend does all. Be a true friend.");
        englist.add("A beautiful friends hip can change people.");
        englist.add("If friends hip is your weakest point then your the strongest person in the world.");
        englist.add("A single rose can be my garden, a single friend is my world.");
        englist.add("Never let your friends feel lonely ....... Disturb them all the time.");
        englist.add("If you want to have real friends , the first step you have to do is to Be ONE.");
        englist.add("A friend is someone who understand your past, believes in your future, and accepts you today just the way you are.");
        englist.add("Life will change from classroom to office, jeans to formals, books to files, pocket money to salary, what will never change is friendship. Let it be4ever!!!!");
        englist.add("True friends are never apart. Maybe in distance, but not in heart.");
        englist.add("Friendship is always a sweet responsibility, never an opportunity.");
        englist.add("Friendship... is not something you learn in school. But if you haven't learned the meaning of friendship, you really haven't learned anything.");
        englist.add("You have been the best friend ever. Supporting and cheering me on. I hope I can reciprocate the kindness you have shown me all this time.");
        englist.add("Tree is green.. Sea is blue.. Night is black.. Milk is white.. Friends are red.. Because.. My friends are my blood!!!");
        englist.add("I Can't Be Your Friend If you Can't Handle My Weirdness, Stupid Jokes And My Tendency To Laugh At Almost Everything. :)");
        englist.add("A friend is one that knows you as you are, understands where you have been, accepts what you have become, and still, gently allows you to grow.");
        englist.add("Alone.? I am beside you. Afraid.? I will comfort you. Hurt.? You may cry on my shoulder. Need a hug.? My arms are yours. Y? Because your my best.");
        englist.add("I don't need a friend who changes when I change and who nods when I nod; my shadow does that much better.");
        englist.add("There are no strangers in this world. There are only friends you haven't met yet!");
        englist.add("God never wanted us to face the tough times alone! That is y god made us friends.");
        englist.add("Ur father guides your mother cares your brother shares your sister loves. But a true friend does all. Be a true friend.");
        englist.add("The best type of relationship is one where you're not only in love, but you're each others best friend also.");
        englist.add("Our paths may change as life goes along, but the bond between friends remains ever strong!!!");
        englist.add("To be a best friend doesn't take much, a shoulder, an ear, some understanding, and not even have to say a word to make you laugh or smile.");
        englist.add("Friends are more expensive then diamonds because the diamond always have a price but friends are priceless.");
        englist.add("It's the friends you can call up at 4 a.m. that matter.");
        englist.add("Relation of friends hip is greater then the relation of blood.");
        englist.add("Should I be happy that we're friends or sad b'coz thats all we will ever be?");
        englist.add("Friendship is based on trust, without it.. there is nothing.");
        englist.add("Friends are like melons. Shall I tell you why?. To find one good.. You must a hundred try!!");
        englist.add("A good friend knows all your best stories. A best friend has lived them with you.");
        englist.add("World is full of smiles, whenever friends are with me.");
        englist.add("A good friend is a connection to life a tie to past a road to future the key to sanity in a totally insane world.");
        englist.add("Just when I'm about to part with my friends is when I realize that I had the best group of friends ever.");
        englist.add("A smile is a sign of joy . A hug is a sign of love. A laugh is a sign of happiness and having a friend like me ... well, that's just a sign of your good judgement!");
        englist.add("Life is the art of drawing.. Without an eraser!!!");
        englist.add("The one and only time, I hated the word 'f are I e and the s'.. Is when she said let us be only 'f are I e and the s' !!");
        englist.add("True friends hip is when two friends can walk in opposite directions, yet remain side by side.");
        englist.add("6 rules to be happy free your heart from hatred free your mind from worries live simply expect less give more & always have me as your friend!!!");
        englist.add("My best friend is the only person in the world who could stop me from crying.");
        englist.add("Only a true best friend can protect you from your immortal enemies.");
        englist.add("The best mirror is an old friend.");
        englist.add("Do you think, that anyone can live without friends? It is impossible. Because friends are the inseparable part of our life.");
        englist.add("Don't walk behind me; I may not lead. Don't walk in front of me; I may not follow. Just walk beside me and be my friend.");
        englist.add("Best friends are those people who make your problems their problems so that you don't have to go through them alone.");
        englist.add("Friendship is so weird... you just pick a human you've met and you’re like “yup I like this one” and you just do stuff with them.");
        englist.add("Its better to be friends than to be lovers b'coz you forget a lover but you never forget a friend.");
        englist.add("Friends are the roses of life: pick them carefully and avoid the thorns.");
        englist.add("Two things are important in our life. Friend friendship first one, you should make. Second one, you should keep.");
        englist.add("If all my friends were flowers, I would look around and pick you.");
        englist.add("Good friends are like starts. You don't always see them but you know they're always there.");
        englist.add("I have benefits if anybody needs a friend :)");
        englist.add("A true friend never gets in your way unless you happen to be going down!!!");
        englist.add("A friend is one who believes in you when you have ceased to believe in yourself..");
        englist.add("Friends give us the change to lift the blinds on our hearts to open up and show what we generally keep hidden from the rest of world.");
        englist.add("My best friend is the one who brings out the best in me.");
        englist.add("If you live to be a hundred I want to live to be a hundred minus one day so I never have to live without you.");
        englist.add("I might run out of cute graphics to send you, but ill never run out of this: care for you");
        englist.add("A loving smile & a heart of gold your dearest person this world can hold though heart fails & life departs you will live as a friend forever in my heart.");
        englist.add("if your falling off the edge of the bed, a friend would help you... a best friend would yell HA HA and shove you off! don't you just love best friends ?");
        englist.add("Golden rules to feel happy meet a friend, call a friend, talk to your friend, hug a friend, and love a friend.");
        englist.add("Best friends are like shoes. Too many to choose from, but there's always that one pair you like the most. (:");
        englist.add("If I die today, or even tomorrow I will have no regrets if you tell me you're my friend.");
        englist.add("Just wanted to say thank you for coming into my life and being my TRUE FRIEND.");
        englist.add("Everything happens for a purpose our friendship was not an accident, god wanted me to get the best but, unfortunately you got the best!!");
        englist.add("True friends are not the ones who are there when it's convenient. True friends are there when it's not.");
        englist.add("The language of friends hip is not words but meanings.");
        englist.add("Love a set of heart attraction a set of style marriage a set of life but friendship a set of you!!!");
        englist.add("I have learnt that once a friends hip is broken.. it never gets normal again!");
        englist.add("The one who likes you most, sometimes hurts you, but again he is the only one who feels your pain.");
        englist.add("I don't have a lot of friends , I just know a lot of people.");
        englist.add("FRIENDS - They make you laugh a little louder, smile a little brighter and live a little better than before.");
        englist.add("Fake friends are around when they think you're cool. True friends are around even when they think you're fool.");
        englist.add("Friendship is so weird... you just pick a human you've met and you're like 'yup I like this one' and you just do stuff with them.");
        englist.add("A good friend would bail you out of jail but your best friend would be the one sitting next to you saying, damn that was cool.");
        englist.add("Never choose a friend without complete understanding and never lose a friend because of a small misunderstanding.");
        englist.add("Friends are like stars, they come and go, but the ones that stay are the ones that glow!!!");
        englist.add("Love begins with a smile grows with a kiss and end with tear drop.");
        englist.add("A friends hip that can end never really began");
        englist.add("If I was asked what a friend looks like, I would seat next to you and hold you tight because you define what true friends hip really is.");
        englist.add("A fake friend calls when they need something. A real friend calls to ask if you're in need of something.");
        englist.add("Friendship is born at that moment when one person says to another: What! You too? I thought I was the only one.");
        englist.add("A friend is someone who gives you total freedom to be yourself.");
        englist.add("Friendship is never forgettable in your whole life. It is always sweet like chocolate but never bitter like Neem.");
        englist.add("A good friend helps you up when yo fall a best friend laughs in your face and trips you again.");
        englist.add("True friends hip is when you walk into their house and your WiFi connects automatically.");
        englist.add("That awkward moment when you keep talking & you don't realize your friend walked away.");
        englist.add("If care is a wave, I give you sea. Leaf. If trust is a planet, I give you galaxy, if friendship is life, I give you mine for free.keep smiling friend.");
        englist.add("Best friends are sent from the heavens. They provider a shoulder to cry on during heartbreaks.");
        englist.add("That awesome moment when you're telling a lie and your best friend notices and joins you.");
        englist.add("It would be easier to cut off my hand than lost you as my friend!!!");
        englist.add("Friendship doubles your joy and divides your sorrow.");
        englist.add("I don't have an attitude, I have standards for the people who are supposed to be my friends .");
        englist.add("I find rest in the shadow of your friends hip. You always know the right words to say which gives me the strength to move on.");
        englist.add("Friends Are Shade And Happiness Of Our Lives. I Love My Freinds Forever.");
        englist.add("The best friends in life may not be always there when you want them but are always there when you need them.");
        englist.add("Friends are notes to life's great songs. A melody that carries you along.");
        englist.add("Fake friends believe in rumors. Real friends believe in you.");
        englist.add("We have three types of friends in life: Friends for a reason, friends for a season, and friends for a lifetime.");
        englist.add("Friendship is not finding gold or silver among the rocks of life. It is accepting each other as coal until diamonds are formed with time!!!");
        englist.add("I want to true friend.. To whom I can share my every problem, I can share my every happy moment anyone interested than call me.");
        englist.add("Two of my friends were arguing as who is dear to me.. I was smiling silently thinking of you.");
        englist.add("Walking with a friend in the dark is better than walking alone in the light.");
        englist.add("Despite the advice about choosing your friends wisely, you really cannot choose your friends. They choose you!!!");
        englist.add("A day spend with friends is always a day well spend.");
        englist.add("A good friend can tell you what is the matter with you in a minute. He may not seem such a good friend after telling.");
        englist.add("Do I not destroy my enemies when I make them my friends ?");
        englist.add("Friends are like money in the bank, longer you keep them, the more they are worth!!!");
        englist.add("There is nothing better than a friend, unless it is a friend with chocolate.");
        englist.add("Friendship is born at that moment when one person says to another: ‘What! You too? I thought I was the only one.");
        englist.add("Your friends hip reminds me of God's faithfulness because you show me where I'm and that I'm not where I used to be. Thank you, for being my friend.");
        englist.add("Your real friends aren't the ones you spend the most time with, but the ones you share the most memories with.");
        englist.add("Friendship is a mercury drop. If it is dropped. Impossible to recollect. So do not drop your friends!!!!");
        englist.add("In the time of crises I was not hurt by the harsh words of my enemies, but by the silence of my friends.");
        englist.add("It is better to live alone. There is no friends hip with a fool.");
        englist.add("You can never be just friends with somebody you used to love, simply because a little part of you will always love them.");
        englist.add("A best friend is like a four leaf cover. Hard to find and luck to have.");
        englist.add("Word of true friend: I would conquer the whole world with just one hand, if you are holding the other hand.");
        englist.add("Somebody asked me to explain the relationship between you and me, they expected the answer as, just friends. But I simply smiled and said. God's gift.");
        englist.add("Fake friends are like shadows, always near you at your brightest moments but nowhere to be seen at your darkest hours.");
        englist.add("Love is not only made for lovers. It is also made 4 true friends. A true friend can love more than a lover.");
        englist.add("One day I may die without saying good bye to you but I will never forget to say thank you because you have given me one of loveliest friendship.");
        englist.add("Good friends don't let you do stupid things alone.");
        englist.add("A friend is someone who listens when you speak, understands when you cry and guides you on your way!!");
        englist.add("A good friend will be there for you when you cry. But a best friend will have a wet shoulder because of your tears.");
        englist.add("Friends are the siblings god forgot to give us.");
        englist.add("No person is your friend who demands your silence, or denies your right to grow.");
        englist.add("You are my smile which will never fade. A breathe sweet to take. That is why I will treasure our friends hip forever.");
        englist.add("A true friend wish - miles ahead but doesn't mind me zooming by and still stays a supportive friend.");
        englist.add("Friendship is like money, easier made than kept.");
        englist.add("Sign of a true friend he always see the pain behind your eyes at that time when everyone says man you smile a lot!!");
        englist.add("Friends are family you choose for yourself.");
        englist.add("The greatest gift is not found in a store nor under a tree, but in the hearts of t are you e f are I e and the s.");
        englist.add("Great friends are part of memories, which time can never erase when life is blessed with friend like you sweeter memories still remain.");
        englist.add("Love is a small coin life is a big coin lover is a sweet coin but friendship is gold coin.");
        englist.add("Your friends hip to me means a lot to me.");
        englist.add("I may never get the chance to win the lottery. I may never get the chance to go on vacation. But I have the chance to be your friend, that chance I will take!!!");
        englist.add("A friend is someone who can see the truth and pain in you even when you are fooling everyone else.");
        englist.add("Friends are connected heart to heart. Distance and time can't break them apart.");
        englist.add("Friendship is a incurable diseases which will finish after the death.");
        englist.add("The more dependent you are on your friends to have a good time, the lonelier you are deep down inside. So be friends with 'yourself' first.!");
        englist.add("Some people go to priests, others to poetry, I to my friends .");
        englist.add("Friendship is blessed on trust, without it there is nothing.");
        englist.add("If you open my heart, guess what you are going tp see it is you. True friends are hard to find so I kept you.");
        englist.add("True friends hip is like what water is to the fish, I cannot do without it and you are my true friend.");
        englist.add("Selfless love is more common than true friends hip.");
        englist.add("Friendship isn't meant to be a one way street.");
        englist.add("That awkward moment when people act like they know your best friend better than you do.");
        englist.add("Fake friends treats you like a tree, they care as long as you give away fruits but once you stop, they fire your branches to cook those fruits you gave.");
        englist.add("A friend is a person who goes around saying nice things about you behind your back.");
        englist.add("True friends are the people who brighten your smile every time your with them.");
        englist.add("A friend is someone who knows all about you and still loves you.");
        englist.add("A friend is someone who smile when you smile, laugh when you laugh, but hold your hand when you cry!!!!");
        englist.add("Be slow to fall into friends hip; but when thou art in, continue firm & constant.");
        englist.add("Good friends will share the umbrella. Best friends Will steal it and yell: RUN LOSER RUN!");
        englist.add("If we had not spoken to strangers, we would not have had any friends in life at all. Amazing but true!!");
        englist.add("Tree is green. Sea is blue. Night is black. Milk is white. Friends are red. Because. My friends are my blood!!");
        englist.add("Good Friends are hard to find, are hard to fine, harder to leave, and impossible to forget..");
        englist.add("Friends are like streets lights, they do not shorten the distance but they make the path worth a walk. I treasure you my friend.");
        englist.add("When you quarrel with your best friend and tell I hate you. You can hear their heart saying good joke. When you tell them to leave me alone you can find near you.");
        englist.add("My friends are the weirdest, most craziest people I know but I love them.");
        englist.add("In the end we will remember not the words of our enemies but the silence of our friends .");
        englist.add("Heart comes from birth. Love comes from birth. Life starts from birth. But friendship comes only when you want it and search for it.");
        englist.add("Love is blind; friends hip closes its eyes.");
        englist.add("Square has 4 ends triangle has 3 ends line has to ends life has one end but our friendship has no end!!!");
        englist.add("Meeting you was fate, becoming your friend was a choice, but falling in love with you was beyond my control.");
        englist.add("If you need a friend and there are a 100 steps bet when us, you can take the 1st step to get near me and I will take all 99 steps to be there for you.");
        englist.add("Every friends hip doesn't change into love but every love begins with friends hip.");

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