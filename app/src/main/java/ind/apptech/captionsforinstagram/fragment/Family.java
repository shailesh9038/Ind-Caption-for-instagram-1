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

public class Family extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Family() {
        // Required empty public constructor
    }

    public static Family newInstance(String param1, String param2) {
        Family fragment = new Family();
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

        englist.add("Being a family means you are a part of something very wonderful. It means you will love and be loved for the rest of your life.");
        englist.add("Best-friend, girl-friend, boyfriend. They all have an end. Except Family.");
        englist.add("My family is my greatest strength and my biggest weakness.");
        englist.add("I miss you in all paths of my life my little sister.");
        englist.add("A father is a banker provided by nature.");
        englist.add("The younger brother must help to pay for the pleasures of the elder.");
        englist.add("The best medicine in the world is a Mother’s Hug.");
        englist.add("A family can develop only with a loving woman as its centre.");
        englist.add("There is nothing greater in this world than being loving parents. So take the first step today by getting married. Think different, do different!");
        englist.add("A sister is someone who is there and understands who you..");
        englist.add("The family is a haven in a heartless world.");
        englist.add("I love you mom with all my heart and soul and spirit’s.");
        englist.add("Having someone to love his family having someplace to go is home having both is a blessing.");
        englist.add("A family is little world created by love.");
        englist.add("Thinks no matter how old you get, there are some times you just need your mama!!!");
        englist.add("A relationship is like a house, when a light bulb burns out, you don't go and buy a new house, and you fix the light bulb.");
        englist.add("I miss my mom so much, already I can't imagine how life's going to be. It won't be the same I love you so much mom.");
        englist.add("When all else fails, I call my Mom. they has all the answers!");
        englist.add("The more I grow, the more I realize that my mom is the best best friend that I ever had.");
        englist.add("Family makes this house a home.");
        englist.add("Brothers are like streetlights along the road, they light up the path and make the walk worthwhile.");
        englist.add("Everyone needs a house to live in, but a supportive family is what makes a home.");
        englist.add("If you want your children to turn out well, spend twice as much time with them, and half as money.");
        englist.add("Having a sister is like having a best friend for life.");
        englist.add("Be the person you want your children to be.");
        englist.add("Brother and sister, together as friends, ready to face whatever life sends.");
        englist.add("A man should never neglect his family for business.");
        englist.add("Brothers are like street lights along the road.. They dont' make distance any shorter, but they light up the path & make the walk worthwhile..");
        englist.add("Family like branches on a tree, we all grow in different direction, yet our roots remain as one.");
        englist.add("Other things may change, but we start and end with family.");
        englist.add("It’s mother who can take the place of all others but whose place no one else can take.");
        englist.add("We must take care of our families wherever we find them.");
        englist.add("As long as I have memories in my heart, I will always have a smile on my face :)");
        englist.add("I love the fact that my best friend just so happens to be my only biological sibling, my sister.");
        englist.add("People come and go, friends change like the weather but I know my sister is here forever. I love you.");
        englist.add("You never appreciate things your mother did for you until you do the same things for your kids.");
        englist.add("The worst misfortune that can happen to an ordinary man is to have an extraordinary father.");
        englist.add("I always pray to God, May you live long, May you always be with me. Love you more than my life. Love You Mom.");
        englist.add("Sometimes the best families are the ones God builds using unexpected pieces of our hearts.");
        englist.add("Happy Mother’s Day! May all the love you give to others come back to you on this special day.");
        englist.add("A mother thinks about her children day and night, even if they are not with her and will love them in a way they will never understand.");
        englist.add("Happy Father’s Day Dad Wish you were with me now miss you so much");
        englist.add("For Dedicating All BROTHERS in the world");
        englist.add("More than Santa Claus, your sister knows when you've been bad and good.");
        englist.add("WHEN MY BROTHER WITH ME, I WON'T AFRAID.");
        englist.add("A family is a little world created by love.");
        englist.add("To promote world peace go home and love your family.");
        englist.add("To her the name of father was another name for love.");
        englist.add("Happiness is having a large, loving, caring, close-knit family in another city.");
        englist.add("An ounce of Father is worth a ton of priest.!!!");
        englist.add("The love of family and the admiration of friends is much more important than wealth and privilege.");
        englist.add("Children are the anchors of a mother’s life!!!!");
        englist.add("Brothers are the best friends, we can have ever");
        englist.add("My Brother.. My love & My Life");
        englist.add("Its amazing how you can feel bad as if your life was falling apart..then you hear your mother's voice and everything suddenly seems FINE :)");
        englist.add("Proud Mom: I gave them life they gave me a reason to live.");
        englist.add("Family time is not a matter of convenience. It is a matter of priority.");
        englist.add("Every family is beautiful but ours is my favorite.");
        englist.add("A father is someone who can take the place of all others, but whose place no one else can take!!!!!");
        englist.add("At some point you have to realize that some people can stay in your heart but not in your life.");
        englist.add("Sometimes your heart needs more time to accept what your mind already knows.");
        englist.add("Family, we may not have it all together, but together we have it all.");
        englist.add("I was always at peace because of the way my mom treated me.");
        englist.add("After all these years, being almost grown...I still try to run and hide when I hear my full name yelled by mom.");
        englist.add("The more I think of you, the more I love you and the more I miss you.");
        englist.add("A mother is she who can take the place of all others,but whose place no one else can take.");
        englist.add("Having my sister around can make the difference between heaven and hell.");
        englist.add("Dad you are never wrong,The only time you are wrong,is when you think, I forgot about you.,Love you Dad!");
        englist.add("You keep your past by having sisters. As you get older, they're the only ones who don't get bored if you talk about your memories.");
        englist.add("Knows your grown up when someone tell you your just like your mom and you take it as a complaint !!!");
        englist.add("No language can express the power and beauty and heroism of a Father's love.");
        englist.add("I think the family is the place where the most ridiculous and least respectable things in the world go on.");
        englist.add("Love your mother, the most beautiful person on this earth. Our best critic yet our strongest supporter.");
        englist.add("Dad a son's first hero, a daughter's first love.");
        englist.add("Home is where your mum is. I love my Mommy.");
        englist.add("My heart cannot find rest while you are gone, everything has lost its colour since you are not here, I miss you, and in short I just feel I am nothing without you. Missing you mom and dad.");
        englist.add("Sisters are different flowers from the same garden.");
        englist.add("A Father means so many things An understanding heart, A source of strength and support right from the very start. Love u Dad !!!");
        englist.add("I remember my mother’s prayers and they have always followed me. They have clung to me all my life.");
        englist.add("Weekend don't count unless you spend them doing something completely pointless.");
        englist.add("A sister is for telling secrets and making promises that will never be broken.");
        englist.add("My oldest brother was a big influence on the films I watched as a kid.");
        englist.add("A sister can be seen as someone who is both ourselves and very much not ourselves - a special kind of double.");
        englist.add("North South East West, From all DADS you are the best.!!!");
        englist.add("Life is one time offer, use it well.");
        englist.add("Fathers are angles, without father the world seems to be nothing. I love you papa!!");
        englist.add("You are one of a kind, A better DAD I could not find!!!!");
        englist.add("By the time a man realizes that maybe his father was right, he usually has a son who thinks he’s wrong.");
        englist.add("I am waiting and hoping and wishing for the time, when we can be together again. I miss you my sister a lot.");
        englist.add("You don't choose your family. They are god's gift to you, as you are to them.");
        englist.add("We may look old and wise to the outside world. But to each other, we are still in junior school.");
        englist.add("A brother shares childhood memories and grown - up dreams.");
        englist.add("I Cannot Think Of Any Need In Childhood As Strong As The Need For A Father's Protection.");
        englist.add("I miss the beautiful eyes that I can sail through forever. I miss the smile that send me to heaven. I miss you.");
        englist.add("Mothers are fonder than fathers of their children because they are more certain they are their own.");
        englist.add("When GOD made moms, he gave me the best one.");
        englist.add("Sister and Best Friend – Two words that mean the same.");
        englist.add("Spend sometime this weekend on home improvement, improve your attitude toward your family.");
        englist.add("A loving atmosphere in your home is the foundation for your life.");
        englist.add("Spend your time to those who love you unconditionally, not with those who love you only when the condition is right for them.");
        englist.add("You are the main reason that I stay up all night thinking about, coming up with cute things that I wish could happen.");
        englist.add("Because i have a sister i will always have a friend..");
        englist.add("Family is not always blood. It's the people in your life who want you in theirs. The ones who accept you for who you are. The ones who would do anything to see you smile and who love you no matter what.");
        englist.add("When you are a mother, you are never really alone in your thoughts. A mother always has to think twice, once for herself and once for her child.");
        englist.add("My Brother is the GUIDE of ma LIFE.");
        englist.add("Nothing can stop me from loving my brother.");
        englist.add("No matter how old I get, I always want my MOM when I don’t feel good.");
        englist.add("God could not be everywhere therefore he made mothers.");
        englist.add("A Loyal Sister IS Worth A Thousand Friends.");
        englist.add("Our, family is just one tent away from full-blown circus.");
        englist.add("I would like more sisters, that the taking out of one, might not leave such stillness.");
        englist.add("You should never sacrifice three things: your family, your heart, or your dignity.");
        englist.add("Mothers role is seventy times greater than the father.");
        englist.add("Arguing for the heck of it.. Borrowing & never returning the stuffs.. Brother, for everything you are, I love You very Much");
        englist.add("The reason why daughters love their dad the most is that there is atleast one man in the world who will never hurt her.");
        englist.add("The greatest gifts my parents ever gave me were my brothers.");
        englist.add("I miss you in every beat of heart, in every blink of my eyes, in every minute of my life and In every moment of the day.");
        englist.add("Being a great mother is a very hard role, but mother u r the star for this one I know, I love you Mom.");
        englist.add("There is no better friend then a Brother, and there is no better Brother than you.");
        englist.add("Motherhood is… difficult and… rewarding.");
        englist.add("I love the fact that my best friend just so happens to be my only biological sibling, my sister.");
        englist.add("I have a great mom and I LOVE HER.");
        englist.add("A Brother Is 1 of Nicest thing you can Have, and one of the best things you can be..");
        englist.add("Make your own pick from our list of Best whatsapp status for brother and make your brother feel good for being in your life!");
        englist.add("Treat your mother with respect and your children will do the same for you.");
        englist.add("This mothers day, if you have a mom that you adore, do not post a status about it, get your ass off facebook and tell them yourself!");
        englist.add("Sorry, I can't hangout. My uncle's cousin's sister in law's best friend's insurance agent's roommate's pet goldfish died. Maybe next time..");
        englist.add("Never sacrifice these three things: your family, your heart and your dignity.");
        englist.add("It's hard to be responsible, adult and sensible all the time. How good it is to have a sister whose heart is as young as your own.");
        englist.add("Being a big sister is to love your brother, even if he does not want it or love you in return.");
        englist.add("Dear Bro We gain and lose things everyday. But trust me on one thing. You'll never lose me. I will always be here.");
        englist.add("If you love your mom and want to show her that she means the world to you, put a picture of her as your profile photo. Then copy and paste this to your status.");
        englist.add("A Father understands what a child does not say.");
        englist.add("Families are like fudge, mostly sweet with a few nuts.");
        englist.add("A man loves his sweetheart the most, his wife the best, but his mother the longest.");
        englist.add("Many hugs Only love never anger Teaching me Helping me Every smile when I was sad Raising me to be strong It spells Mother. Thanks for being u.");
        englist.add("Fatherhood is pretending the present you love most is soap on a rope.");
        englist.add("My father gave me the greatest gift anyone could give another person, he believed in me.");
        englist.add("Mom, you are the best. Happy Mother’s Day!");
        englist.add("Important families are like potatoes. The best parts are underground.");
        englist.add("Glad You're My Brother.");
        englist.add("Did you ever notice that MOM spelled upside down is WOW? That's because we Moms are amazing! So have an amazing day!!");
        englist.add("When in doubt, choose the kids there will be plenty of time later to choose work.");
        englist.add("What's the good of news if you haven't a sister to share it?");
        englist.add("After a girl is grown, her little brothers - now her protectors");
        englist.add("It is not flesh and blood but the heart which makes us fathers and sons.");
        englist.add("Brother.. I am glad & lucky to have you !! I love you ..");
        englist.add("Big Brother is our First Friend and Second Father..!!!");
        englist.add("The only rock I know that stays steady, the only institution I know that works, is the family.");
        englist.add("A Brother is a gift from God, sent from above to make life worthwhile here below.");
        englist.add("Every mother on earth gave birth to child except my mother, She gave birth to Legend !");
        englist.add("No, I am not okay, I miss you my brother.");
        englist.add("Family is the most important thing in the world.");
        englist.add("Many men can make a fortune but very few, can build a family.");
        englist.add("The love in our family grows strong and deep, leaving special moments to treasure and keep.");
        englist.add("There's no buddy like a brother.");
        englist.add("Of two sisters one is always the watcher, one the dancer.");
        englist.add("If there was a day for everything you have given to me as a mother, it would be a Mother’s Day every day.");
        englist.add("Women is like music, some high notes, some low notes, but always a beautiful song.");
        englist.add("Time spent with family is worth every second.");
        englist.add("Good thing about having an older sister is to help you with the subjects you're weak in. :)");
        englist.add("No gift to your Father can ever equal her gift to you life.");
        englist.add("If you think I'm crazy wait till you meet my Mom! :)");
        englist.add("You are the sun in my day, the wind in my sky, the waves in my ocean and the beat in my heart, I miss you, miss your elder brother.");
        englist.add("My sister is the sweetest little thing alive! Words can hardly describe my love for her, she is my best friend.");
        englist.add("Being a family means you are a part of something very wonderful.");
        englist.add("It was nice growing up with someone like you - someone to lean on, someone to count on.. someone to tell on!");
        englist.add("Food tastes better when you eat it with your family.");
        englist.add("Sweet is the voice of a sister in the season of sorrow.");
        englist.add("He is everybody's best friend and my little brother.");
        englist.add("The Miracle of Life nurtured by a woman who gave us love and sacrifice… is MOTHER.");
        englist.add("A brother is a friend given by nature.");
        englist.add("You are Taller than me now.. But still you are little brother for me.");
        englist.add("Because angels are sometimes busy elsewhere, God created sisters like you.");
        englist.add("Blessed indeed is the man who hears many gentle voices call him father!");
        englist.add("Sisters function as safety nets in a chaotic world simply by being there for each other");
        englist.add("My brotherz the world best brotherz ever 1 person have.");
        englist.add("This day is very special to me, i have no words how i express my love to you my mom. Thanks for being my mom.");
        englist.add("I am smiling because you are my brother. I am laughing because there is nothing you can do about it!");
        englist.add("A good father is a man who supports his children even when he has no money.");
        englist.add("My mother was the most beautiful woman I ever saw. All I am I owe to my mother. I attribute all my success in life to the moral, intellectual and physical education I received from her.");
        englist.add("Sometimes being a brother is even better than being a superhero. Happy Raksha Bandhan everyone.. stay blessed.");
        englist.add("Having brothers never feel loneliness in life isn't it?");
        englist.add("The most important thing a father can do for his children is to love their mother.");
        englist.add("Your truest best friend is ur mom..some people just have to realize it..have u told ur mom that u love their yet today? cuz you should everyday..I LOVE U MOM!!");
        englist.add("A good father is a man who buys your toys, before he buys his.!!!!");
        englist.add("To have a loving relationship with a sister is not simply to have a buddy or a confident — it is to have a soulmate for life.");
        englist.add("My mom is definitely my rock.");
        englist.add("I Loved you from your first breath, I'll Love you till my last.Love u Mom");
        englist.add("My mother, my friend so dear. Throughout my life you are always near. A tender smile to guide my way. You are the sunshine to light my day.");
        englist.add("A family is a place where minds come in contact with one another.");
        englist.add("God gave me two angels and they are my MOM AND DAD.");
        englist.add("If you don't believe in ghosts, you've never been to a family reunion.");
        englist.add("I love you so much mum and thanks for making me what I am today.");
        englist.add("I don't breathe when we are apart I suffocate. I miss you.");
        englist.add("Mothers are roses in the garden of life. Happy Mothers Day");
        englist.add("Spend time with those you love. One of these days you will say either, I wish I had or I am glad, I did.");
        englist.add("Our family is a circle of strength of love with every birth and every union the circle grows.");
        englist.add("What can you do to promote world peace? Go home and love your family.");
        englist.add("Friends are the family we choose for ourselves.");
        englist.add("Friends come and go, but family is always there.");
        englist.add("Thank you for being a great dad to us! Your memories will always live in the very core of my heart.");
        englist.add("If we fought, If we Irritate each other, If we got angry but never Hate Each other");
        englist.add("For me you are my ideal, you taught me to be a man. Your kindness, love and care, everything is unexpressed. Thanks Mom");
        englist.add("Brothers and sisters are as close as hands and feet.");
        englist.add("The greatest gift I ever had Came from God; I call him Dad!");
        englist.add("No matter how many times we argue, how many times I don’t understand you, and how many times I get scolded by you, I still think that you are the best and will always be the greatest mom in the world.");
        englist.add("Sister and Friend two words that mean the same.");
        englist.add("I got to grow up with a mother who taught me to believe in me.");
        englist.add("Family where life begins and love never ends.");
        englist.add("Dad, your guiding hand on my shoulder will remain with me forever.");
        englist.add("The only man you can depend on is your father.");
        englist.add("You need to make time for your family no matter what happens in your life.");
        englist.add("Any man can be a father, but it takes a special person to be a dad.");
        englist.add("A father carries pictures where his money used to be.");
        englist.add("Little by Little, bit by bit, family by family, so much good can be done on so many levels.");
        englist.add("Small acts of kindness and priceless.");
        englist.add("You’ve seen me laugh You’ve seen me cry And always you were there with me I may not have always said it But thanks and I love you mom");
        englist.add("Good mom's let there kids lick the beaters...Great moms shut the beater off first.:)");
        englist.add("When a father gives to his son, both laugh; when a son gives to his father, both cry!!!!");
        englist.add("Blood makes you related, love makes you family.");
        englist.add("Love your family. Spend time, be kind and serve one another. Make no room for regrets. Tomorrow is not promised and today being short.");
        englist.add("Moms hold their children's hands for a while, but their hearts forever.");
        englist.add("I Wish My Parents Were Like Google. They Should Understand Me Even Before I Complete.");
        englist.add("The love of a family is life's greatest blessings.");
        englist.add("Every family is beautiful but ours is my favourite.");
        englist.add("Wishing you all the love and happiness you so richly deserve. Happy Mother’s Day");
        englist.add("No love is greater then mom’s love and no care is greater then dad’s care.");
        englist.add("One of the best feelings in the world is knowing your presence and absence both means something to someone.");
        englist.add("Becoming a father is easy enough, but being one can be very rough.");
        englist.add("A mother’s arms are made of tenderness and children sleep soundly in them.");
        englist.add("In the end all you'll ever have in life is your family, so keep them close, while you still have them around.");
        englist.add("Family like branches on a tree, we all grow in different directions yet our roots remain as one.");
        englist.add("Anyone who doesnt miss the past never had a Father.");
        englist.add("It is nice just spend time with someone that makes you smile and just be yourself.");
        englist.add("Our path may change as life goes along, but the bond between us remains ever strong. I miss you my sister.");
        englist.add("I sought my soul, but my soul I could not see. I sought my God, but my God eluded me. I sought my brother and I found all three.");
        englist.add("Family is not about blood. It’s about who is willing to hold your hand when you need it the most.");
        englist.add("Our family we put the fun in days functional.");
        englist.add("Family is not always about blood sometimes it's about who is there to hold your hand and support you, when you need them.");
        englist.add("There is nothing in the world of art like the songs mother used to sing.");
        englist.add("Is solace anywhere more comforting than in the arms of a sister.");
        englist.add("The Father's heart is the childs schoolroom.");
        englist.add("Family we may not have it all together, but together we have it all.");
        englist.add("DAD – A son’s first HERO and daughter’s first LOVE.");
        englist.add("Family is not an important thing, it's everything.");
        englist.add("Mother’s Love: The greatest unconditional and infinite love we will ever experience.");
        englist.add("The only reason god made cousins so that parents can compare our marks.");
        englist.add("I love you, you were there for me, you protected me, and most of all, you loved me. We'd fight, scream, and argue, but, under it all, is a love. That only exists, in a brother, and a sister.");
        englist.add("You don’t have to deserve your mother’s love. You have to deserve your father’s. He’s more particular.");
        englist.add("No family is perfect, we argue, we fight, we even stop talking to each other at times, but in the end, family is family, the love will always be there.");
        englist.add("Hey mom, I thank god for having such a mom like you. You are just not like the other moms. I LOVE YOU.");
        englist.add("Together we make a family.");
        englist.add("A mans work is from sun to sun, but a Father'ss work is never done!!!!");
        englist.add("By the time a man realizes that his father was right, he has a son who thinks he’s wrong.");
        englist.add("The older I get, the smarter my father seems to get.");
        englist.add("Dad, you’re someone to look up to no matter how tall I’ve grown.");
        englist.add("I luv my brother so much,cz he bought ruler, eraser and highlighter for me.");
        englist.add("Brothers and sisters separated by distance, joined by love.");
        englist.add("The love of a family is life's greatest blessing.");
        englist.add("The family is one of nature's masterpieces.");
        englist.add("I Love MY Sister because She Cares Meee");
        englist.add("One father is enough to govern one hundred sons, but not a hundred sons one father.");
        englist.add("Family is not an important thing. It's everything.");
        englist.add("A MOTHER thinks about her CHILDREN day and night. Even if they are not with her, and will love them in a way they will never understand.");
        englist.add("Says I'm a leader, a fighter, and a survivor and my best accomplishments in this life call me MOM! :)");
        englist.add("I Love My Brothes lot <3");
        englist.add("God could not be everywhere and therefore he made Fathers.!!!");
        englist.add("Being parents means loving your children more than you've ever loved yourself.");
        englist.add("Bless you, my darling, and remember you are always in the heart – oh tucked so close there is no chance of escape – of your sister.");
        englist.add("I love my father as the stars and he is a bright shining example and a happy twinkling in my heart");
        englist.add("Only a mother as perfect as you, could have a daughter as perfect as me.");
        englist.add("We Fighting like a Tom & Jerry.. We Taking Revenge like a Tom & Jerry.. As well we always Together Like a Tom & Jerry");
        englist.add("A mother always has to think twice, once for herself and once for her child.");
        englist.add("The only person you can believe when they say i love you is your mom; they won't go breaking your heart.");
        englist.add("My mother is an angel who loves unconditionally.");
        englist.add("A mother understands what a child does not say.");
        englist.add("We Share a Bond that connects Us as Family.. But out Friendship plays a great role in our Life journey.. I could not Have asked for a better FRIEND than the one I found in U, My BROTHER.");
        englist.add("I just spend time with you and I don't feel like you want me around anymore.");
        englist.add("There is no love like the love for a brother. There is no love like the love from a brother.");
        englist.add("Written All over My Memories, I see a Love that began within the walls of our Home.. There I see U, My brother, Noted in Every Important part of my Life.");
        englist.add("No family is perfect we argue, we fight. We even stop Talking to each other at times but in the end, family is family. The love will always be there.");
        englist.add("Friends are fake, Best Friends are only for a while, But Sisters are Forever and Real.");
        englist.add("I cannot think of any need in childhood as strong as the need for a father’s protection.");
        englist.add("You aren't just my Best Friend. You are my sister and I love you to freaking death. I don't know what I would do without you.");
        englist.add("I am born lucky, coz I have a one-in-a-million sibling like YOU.");
        englist.add("Only mothers can think of the future – because they give birth to it in their children.");
        englist.add("You r my brother, my best friend forever..");
        englist.add("ABBREVIATION OF MOTHER: M:MOST O:ORIGNAL T:TOPCLASS H:HONOURABLE E:EXCELLENT R:RESPECTABLE");
        englist.add("There is only one pretty child in the world, and every Father has it.");
        englist.add("Family means no one gets left behind or forgotten.");
        englist.add("The sign of great parenting is not the child's behaviour. The Sign of truly great parenting is the parent's behaviour.");
        englist.add("Do you believe in angels? i do its my mom.");
        englist.add("A true sister is a friend who listens with her heart.");
        englist.add("A sister is a forever friend.");
        englist.add("If I could pick the best brother, I would pick you!");
        englist.add("Mothers hold their children’s hands for a short while but their hearts forever.");
        englist.add("In the cookies of life, sisters are the chocolate chips.");
        englist.add("I love my mom. No matter what we go through, no matter how much we argue because I know, at the end she’ll always be there for me.");
        englist.add("I was very troubled, yes. Me and my brother both - we were troubled and troublemakers.");
        englist.add("Being brother & sister means being there for each other.");
        englist.add("The father who does not teach his son his duties is equally guilty with the son who neglects them.");
        englist.add("Fathers are angels sent from heaven");
        englist.add("Our family is a circle of strength, founded on faith, joined in love, kept by god.");
        englist.add("Rakhi is a perfect time to tell you just how special you are and how much you mean to me! Wish you all the peace, prosperity and success on this Raksha Bandhan.");
        englist.add("We have the sister sayings that will make you nod in agreement about how annoying sisters can be.");
        englist.add("Friends come and go, but You my dear Brother, are always there !");
        englist.add("A sister is a gift to the heart, a friend to the spirit, a golden thread to the meaning of life.");
        englist.add("Even though I'm all grown up and have my own family, I still need my mom...I love you mom");
        englist.add("A sister smiles when one tells one's stories - for she knows where the decoration has been added.");
        englist.add("Sweet, crazy conversations full of half sentences, daydreams and misunderstandings more thrilling than understanding could ever be.");
        englist.add("My Mother, my friend so dear Throughout my life you’re always near A tender smile to guide my way You’re the sunshine to light my day.");
        englist.add("I don't believe in an afterlife but I still fully expect to see my brother again.");
        englist.add("All that I am, or hope to be, I owe to my angel mother.");
        englist.add("A house is built by hands, but a home is built by heart.");
        englist.add("One father is more than a hundred schoolmasters!!!");
        englist.add("Every day we should honour our parents and remind them that we love them. Thanks mom and dad for everything you have done for me. I love you.");
        englist.add("Mom I love you so much! Thanks for everything you have given me or will give me. You will never know how much I love you.");

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