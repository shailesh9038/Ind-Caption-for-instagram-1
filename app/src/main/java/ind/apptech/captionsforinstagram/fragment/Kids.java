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

public class Kids extends Fragment {

    RecyclerView rajputlist;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Kids() {
        // Required empty public constructor
    }

    public static Kids newInstance(String param1, String param2) {
        Kids fragment = new Kids();
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

        englist.add("We're all just kids posting are professionals, counting the days until Friday.");
        englist.add("Kids are like farts. You don't mind your own, but other peoples are unbearable.");
        englist.add("Dear kids, make the world more awesome!");
        englist.add("First of Bea's kids to post happy birthday to mom.");
        englist.add("No matter what happens, my kids come first. It's that simple.");
        englist.add("The smallest children are nearest to God, as the smallest planets are nearest the sun.");
        englist.add("Kids are watching and learning model the behaviors that you want to see. Teach them with your actions.");
        englist.add("Our kids will probably attend a middle school dance where the theme is '2010s'. They'll wear Uggs and Twerk to 'Call Me Maybe'.");
        englist.add("I often try to tell kids to think about all the people who love you, don't cry over the one person who doesn't.");
        englist.add("There is only one pretty child in the world, and every mother has it.");
        englist.add("Facebook is my escape from Disney Channel and Cartoon Network.");
        englist.add("When I was a kid I wanted to get older. This shit is not what I expected.");
        englist.add("When I grow up, I want a son first, then a daughter; So my son would beat up any boy that makes my little girl cry.");
        englist.add("Kids are always happy so be cool and act like a kid again.");
        englist.add("I like kids, but I don't think I could eat a whole one.");
        englist.add("The Problem With Today's Children Is That Today's Grown-ups ARE Idiots..");
        englist.add("A mother's dream is to see her children grow to be happy and successful.");
        englist.add("Do your kids a favor - don't have any.");
        englist.add("I have a wonderful husband. I have amazing kids.");
        englist.add("I feel sorry for the kids of next generation. They'll have parents who know how to check: Last call duration, send SMS and browser history.");
        englist.add("Encourage and support your kids because children are apt to live up to what you believe of them.");
        englist.add("Dear children, your life is your message to the world. Make sure it's inspiring.");
        englist.add("While we try to teach our children all about life.. Our children teach us what life is about!");
        englist.add("A child's laugh could simply be one of the most beautiful sounds in the world.");
        englist.add("I will love my kids to the best of my ability today, and forever.");
        englist.add("I love my kids. I'm crazy about them.");
        englist.add("If a child cannot learn in the way we teach, we must teach in a way the child can learn.");
        englist.add("Childhood is about innocence and playfulness. It is about joy and freedom.");
        englist.add("Kids today don't know how easy they have it. When I was young, I had to walk 9 feet through a shag carpet to change the TV channel.");
        englist.add("To my child.. When I tell you I love you, I don't say it out of habit or to make a conversation. I say it to remind you that you're the best thing that ever happened to me.");
        englist.add("Silence is Golden.. unless you have kids, then silence is just suspicious.");
        englist.add("Knew i had found the man of my dreams as soon as i looked into my son's eyes.");
        englist.add("Adults are just kids with money.");
        englist.add("A child has a special day of adding joy to every day!");
        englist.add("Don't just teach kids, how to count. Teach 'Em what counts. Most.");
        englist.add("My children may not have everything they want in life, but they have a mom who loves them more than anything in the world.");
        englist.add("Out of all the little kids in the whole world. How did I get the cutest ones?");
        englist.add("Happy is.. seeing yourself in your kids. (The good bits)");
        englist.add("I love my children. They are simply amazing and I couldn't imagine my life without them.");
        englist.add("My children are a blessing and they make my life worth living!");
        englist.add("Mommy, I'm sorry you're tired! Just kidding. I don't care..");
        englist.add("I tell kids to pursue their basketball dreams, but I tell them to not let that be their only dream.");
        englist.add("Why do we lock up kids who have not committed crimes?");
        englist.add("Happiness is.. seeing your kids happy.");
        englist.add("I love asking little kids what they want to be when they grow up.. cause, you know.. I'm still looking for ideas.");
        englist.add("I love my husband and our kids.");
        englist.add("Children are like wet cement. Whatever falls on them makes an impression.");
        englist.add("Not many people can drive me as CRAZY as my kids, But NOBODY can make me as happy as my kids");
        englist.add("You were made to be awesome.");
        englist.add("My children are a blessing and they make my life worth living.");
        englist.add("We're all just kids posing as professionals, counting the days until Friday.");
        englist.add("While we try to teach our Children all about Life.. Our Children teach us what Life is about.");
        englist.add("My kids are my life they mean the world to me. I love my kids. I have truly been blessed.");
        englist.add("Have a beautiful day my kid and I hope your life to be filled with joy and happiness.");
        englist.add("Do the right thing.. Even when no one is looking.");
        englist.add("No matter how old you are, if a little kid shoots you with a toy gun, you pretend to die.");
        englist.add("I'm a proud mother. I gave my children life. They gave me a reason to live. I love my children.");
        englist.add("Don't raise your kids to have more than you had, raise them to be more than you were.");
        englist.add("I believe that children are our future. Teach them well and let them lead the way. Show them all the beauty they possess inside.");
        englist.add("Do all you can to make your dreams come true.");
        englist.add("How pathetic can you possibly get?");
        englist.add("I wish that I could be like the cool kids, because all the cool kids, they seem to get it.");
        englist.add("I have a great career, and I have my daughter. So, what I don't have is not as important to me as wat I do have.");
        englist.add("Children make love stronger, the days shorter, the nights longer, savings smaller and a home happier.");
        englist.add("When your kids grow up they will realize that when you said no, you were saying I love you.");
        englist.add("I want kids. I have chores to assign.");
        englist.add("Children will soon forget your presents. They will always remember your presence.");
        englist.add("Respect your parents they pay for your internet.");
        englist.add("Mommy, I'm not joking, I'm not kidding, and I'm not playing. I need chocolate.");
        englist.add("My kids aren't just my children, they are my and everything!");
        englist.add("Children are growing up digitally.");
        englist.add("To my children, If I had to choose between loving you and breathing.. I would use my last breath to tell you. I love you.");
        englist.add("Encourage your kids because you have no idea what they are truly capable of.");
        englist.add("I have been hit hard with the 'Your kids will turn out just like you' curse.");
        englist.add("Cleaning your house while your kids are still growing is like shoveling the drive before it has stopped snowing.");
        englist.add("A mother's love for a child can only be understood by a mother.");
        englist.add("Every moment is an opportunity to teach your child something new.");
        englist.add("Dear math, grow up and solve your own problems.");
        englist.add("Don't wait for the perfect moment take the moment and make it perfect.");
        englist.add("I have three kids, one of each.");
        englist.add("Kids: They dance before they learn there is anything that isn't music.");
        englist.add("If I have kids. I'll adopt.");
        englist.add("The greatest gift I ever had, came from God, I call him DAD.");
        englist.add("Ever child is a different kind of flower, and all together, make this world a beautiful garden.");
        englist.add("Stop trying to perfect your children, but keep trying to perfect your relationship with them.");
        englist.add("My kid's teacher told me my kid is obsessed with video games and that I need to work with her on it. I'm like I do. I'm player 2");
        englist.add("Thinks their kids forgot the name 'daddy' because all they hears is 'mommy, mommy, mommy'.");
        englist.add("A mother thinks about her children day and night, even if they are not with her and will love them in a way they will never understand.");
        englist.add("That awkward moment when adults think they're funny, but they are just annoying.");
        englist.add("I may not be perfect but when. I look at my children. I know that I got something in my life perfectly right.");
        englist.add("Every child is an artist.");
        englist.add("Children need love, especially when they do not deserve it.");
        englist.add("The biggest thing we get out of it is seeing the kids smile. And hopefully we will also see that the lessons we're teaching – not only the fundamentals of hockey, but also the life values – are sinking in.");
        englist.add("Kids don't remember their best day of television.");
        englist.add("I will love my kids forever and always, for as long as I live, no matter what.");
        englist.add("The hardest job facing kids today is to learn good manners without seeing any.");
        englist.add("Insanity is hereditary. You get it from your kids.");
        englist.add("I believe in love at first sight because I love my mom since I opened my eye.");
        englist.add("We need to encourage our kids to have to eat real food - honest, nutritious, healthy food, less fast food. Less junk food. Any they need to see us eating healthy by example.");
        englist.add("The kids who need the most love will ask for it in the most unloving of ways.");
        englist.add("I know all parents think their child is the cutest thing in the world but seriously, mine is.");
        englist.add("Most people mature with age. How do some people get it backwards?");
        englist.add("It's not that I don't want kids, it's just that I don't want a minivan.");
        englist.add("Time spent playing with children is never wasted.");
        englist.add("Funny how some people call themselves parents yet, they never seem to have their kids.");
        englist.add("Please excuse our mess, the kids are making memories.");
        englist.add("Anyone can have a child and call themselves 'a parent'. A real parent is someone who puts that child above their own selfish needs and wants.");
        englist.add("A child has a special of adding joy to every day.");
        englist.add("My greatest blessings call me Mom.");
        englist.add("A child should feel nothing but, 'safe.'");
        englist.add("I'm not a violent person, but mess with my kids and I will become one.");
        englist.add("Every minute you invest in kids you get back four times over.");
        englist.add("Without my children, tomorrow wouldn't be worth the wait and yesterday wouldn't be worth remembering.");
        englist.add("How you speak to your children becomes their inner voice..");
        englist.add("Anyone who says 'Easy as taking candy from a baby' has never tried it.");
        englist.add("We worry about what a child will become tomorrow, yet we forget that he is someone today.");
        englist.add("Make It A Tule Never To Give A Child A Book You Would Not Read yourself.");
        englist.add("Children need your presence more than your presents.");
        englist.add("It's fun being a kid.");
        englist.add("If you bungle raising your kids, I don't think anything else you do well, really matters much.");
        englist.add("If I was told to go to bed. I'd be like. OK! Why can't kids be the same way?");
        englist.add("I want my kids to have the things in life that I never had when I was growing up. Things like beards and chest hair.");
        englist.add("The example we set for our kids: How to act when things don't go our way, is much, much more important than the rules we set for them.");
        englist.add("I uploaded some pics of that party last night. I better write a status about how much I love my kids so I look like a good parent.");
        englist.add("I read my kids a few select Facebook status before bed, kiss them on their heads, and whisper, 'This is why we have to stay in school'.");
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