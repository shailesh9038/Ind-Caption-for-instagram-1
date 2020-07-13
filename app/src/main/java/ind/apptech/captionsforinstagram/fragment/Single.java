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

public class Single extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Single() {
        // Required empty public constructor
    }

    public static Single newInstance(String param1, String param2) {
        Single fragment = new Single();
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

        englist.add("Single is single and you're gonna have to be down right AWESOME if you're gonna change it!");
        englist.add("They ignore each other and look the other way. but, they both know deep down inside, that it wasn't supposed to end this way.");
        englist.add("Don't be a woman who needs a man... Be the woman a man needs... Because every woman is worth fighting for... But not every man is worth you.");
        englist.add("When I'm single all I see are happy couples!!! and when I'm in a relationship all I see are happy singles!!! The grass is always greener on the other side!!");
        englist.add("I'm not single because I don't get offers; I'm single because I won't settle for less than I deserve. ~MNW~");
        englist.add("Single ladies remember: U are not a side item, an appetizer, or an after-dinner dessert. U are the WHOLE MEAL or no deal!");
        englist.add("I think that love isn't something you search for, it's something that just happens. So quit looking and let love come to you.");
        englist.add("Single means you're only taking your time deciding how you want your life to be and who you want to spend it with.");
        englist.add("It's not that I can't stop being single, it's that I haven't found anyone that's been up to the challenge.");
        englist.add("Wishes people didn't think that single parent means desperate for s3x... it doesn't!!");
        englist.add("People need to realize that when other people want u to change they are not worth it so stay ur self and be proud of u and don't ever change u for someone else");
        englist.add("So bored with being single and alone, need someone who can make me smile and love me for who i am. So any ideas?");
        englist.add("Single and looking for a guy who's not an a*s h0le, who knows what they wants and won't play games");
        englist.add("Flirting is a habit for those who are single; it is their way of saying I am free.");
        englist.add("I am gonna complain about guys til one steps up and thinks they can handle me. Til then, they're all weak!");
        englist.add("We don't need someone to make us whole...it's just nice to have that one person who you mean something to...its nice to be in someones arms and feel special");
        englist.add("Some people are settling down, some people are just plain settling but I refuse to settle for anything less than butterflies.");
        englist.add("Has changed their relationship status from single to staying single!!");
        englist.add("I'm only single because out of all the men out there I just haven't met one brave enough to take me on or who can handle me, but you are welcome to try.");
        englist.add("loves being single because you can flirt with anyone you god damn please ;)");
        englist.add("Stay single until someone special actually compliments you in a way that it makes it better to not be alone. If it is not, then it's not worth it.");
        englist.add("Being single doesn't mean nobody wanted you. It means you're only taking your time deciding how you want your life to be and who you want to spend it with.");
        englist.add("No one can tell me what to do, how to do it, or when to do it. I'm single, I can do what the hell I like now and it's great");
        englist.add("Single does not necessarily mean loneliness and to have a relationship does not always mean being happy.");
        englist.add("totally single, totally free, totally happy, TOTALLY SATISFIED ..");
        englist.add("*ahem* May I have your attention please? I have an announcement to make. I am single&looking! I repeat I am single&looking! Thank you that is all!");
        englist.add("it seems romance is dead these days so therefore I am happy staying single until someone proves me wrong!!");
        englist.add("Single? No, I am just inRelation ship with FREEDOM. ");
        englist.add("they'll get here some day.");
        englist.add("Yes I'm single and any guy who wants to change that is going to have to be pretty damn amazing!");
        englist.add("feels like walking up to someone and kissing them just for the hell of it.");
        englist.add("Just because my status says I'm single, does NOT mean I'm looking! My eyes will remain closed until that special someone is brave enough to try to open them!~");
        englist.add("Dear Santa, please leave a tall, dark, handsome man under my tree this Christmas.");
        englist.add("Is single and needs someone 2 change that.If u can change that,then leave comments giving some good reasons why i should pick u!!!");
        englist.add("What would you say if i asked you out? Put this as your status an see what people say.");
        englist.add("Life's a bitch then you die or marry one...hm it both is death one way or another just one is less painful!");
        englist.add("If you're single, focus on being a better you instead of looking for someone better than your ex. A better you will attract a better next.");
        englist.add("Looking for that boy who deserves the key to my heart");
        englist.add("Oh well looks like mr jack dainels will be my date along with mr sambuca who will get me drunk and mr red bull will fly me home safely");
        englist.add("Some people are settling down, some people are settling and some people refuse to settle for anything less than butterflies. - S3x in the City");
        englist.add("Single is not Single & Alone...I'm Independent & Available ;-) Until I find my Equal !!");
        englist.add("Dear heart, please fall in love only when you're ready, not when you're lonely.");
        englist.add("I may be single and I may not have a million comments on my profile and pictures but at least I have fun and don't have to worry about hiding who I really am (:");
        englist.add("Single & LOOKING.. for someone who will stand by my side through thick & thin.. who won't make me cry.. who will accept me for who I am. Please appear soon");
        englist.add("was thinking about bringing s3xy back...but I can't find the receipt... damn... I was gonna exchange it at Wal-mart for the new book...Being Single for Dummies.");
        englist.add("Has had enough of the single life and is now taking applications for a boyfriend please send all enquiries to my in box xx");
        englist.add("Guys are like parking spots... all the good ones are taken, but all the free ones are handicapped.");
        englist.add("In NEED of a F..bad.. buddy ;)");
        englist.add("When I'm single all I see are happy couples!!!");
        englist.add("You can never be happy as someones other half unless you can be happy as a whole all on your own. ;)");
        englist.add("Hi Hun I'm home........ damn!! forgot i was single.");
        englist.add("Has already met Mr player, Mr bullshit, Mr fxckabout, Mr jealous, Mr slag & Mr stress so where's Mr Right? (:");
        englist.add("I'm not single... I'm riding solo and loving it!");
        englist.add("Trust me, this time baby. I'll be bulletproof!");
        englist.add("Yes Facebook i know I'm single,but stop with the damn dating sites ads!");
        englist.add("Single is SINGLE and loving every single moment of it!!!");
        englist.add("Dear Santa, i have been a good girl all year all i ask for in return is a tall dark handsome maybe odd tattoo,single,funny,can drive and good job thank u Santa");
        englist.add("Being single used to mean that nobody wanted you. Now it means you're taking your time deciding how you want your life to be and who you want to spend it with<3");
        englist.add("Smart, yes, sometimes cute, but never s3xy.s3xy is the thing I try to get them to see me as after I win them over with my personality. S3x and the City");
        englist.add("Can't get wit' no deadbeat @ss So (no)SCRUBS");
        englist.add("The more pricks i date the closer i come to meeting my Mr.right(: they is out there some where.they just took a wrong turn. they'll get here some day. I'll wait.");
        englist.add("Wanted by many but taken by none. ;P");
        englist.add("Always hears ur cute and ur so sweet so what i'm good enough to be your friend but nothing more? be honest for once and tell me whats wrong w/ me...");
        englist.add("I just want someone who holds me tight ,and keeps me safe and warm while i sleep, to make me feel loved, and never puts me down, know is that to much to ask?");
        englist.add("I don't consider myself.. 'SINGLE & ALONE' I consider myself ' INDEPENDENT & AVAILABLE'.. =] , so if your SINGLE i am AVAILABLE ;) xxx");
        englist.add("Ok let me get this straight, you are relying on me being a gentlemen .. lmao you idiot!!");
        englist.add("Love being single NO kids NO man I can do whatever I want without a bitchy man and not having to find a sitter if I wanna go out.");
        englist.add("What's worse then being single? Having someone in mind to change that status. And that person doesn't feel the same, or is too far away to do anything about it");
        englist.add("I never get jealous when I see my ex with another girl. I was taught to give my used toys to the less fortunate! Have fun I, got rid of them for a reason!");
        englist.add("No, I am not single. I am in a long distance relationship because my boyfriend lives in the future.");
        englist.add("Sometimes you have to stand alone to prove to others and yourself that you can still stand");
        englist.add("1 Universe, 8 planets, 192 countries, 180497 islands, 85 seas, more than 7 billion people. And I'm still single!");
        englist.add("Flirting is a habit for those who are single; it is their way of saying I am free. But for those who are committed, it is their way of saying I am bored.");
        englist.add("I'm feeling like a star, you can't stop my shine, I'm loving cloud nine, my head's in the sky, I'm feeling good tonight, finally doing me and it feels so right.");
        englist.add("Being single is smarter than being in the wrong relationship.");
        englist.add("I'm tired of hearing there are plenty of fish in the sea well not anymore! The dang oil spill got em'! Now what am i gonna do?~ Single~");
        englist.add("needs to get away from here for a while. Don't care where, just need to get away to sort myself, my life, and my head out..");
        englist.add("Yes, I'm Single. [I]t's Means: [S]tress [I]s [N]ow [G]one [L]ife is [E]asier");
        englist.add("God is busy writing D Best love Story");
        englist.add("Tell me get my shit togetha, now i got my shit togetha, now i made it thru the weather, better days are gonna get better");
        englist.add("New year's eve is just round the corner and i don't want to leave this year single n being alone , i want you to change that and be with me going into the new year xxx");
        englist.add("I'm single but if you would like to change that like this status. :)");
        englist.add("Says the reason I'm single is cause you can't handle this girl");
        englist.add("OK Christmas time is here now where is the hot guy and the mistletoe :D");
        englist.add("Enjoys the single life, but like a car, could do with a good service... or at least an m.o.t, just to check all my parts are working right, lol.");
        englist.add("I am what i am i cant help myself & if you don't like it get with somebody else ill never change my ways its not a phase this is how it is & how its gonna stay.");
        englist.add("Single.. anybody wanna change that? :]");
        englist.add("I'm tired of hearing 'There are plenty of fish in the sea'! Who wants a fish?? They're slimy and they smell!!");
        englist.add("I'm not picky, I just have standards.");
        englist.add("Being single isn't all that bad. You eat when you want...sleep when you want...go where you want when you want. What more could you want?!? Oh, yeah.. that!");
        englist.add("Sometimes i wish i wasn't single but then again being single is awesome cause i ain't let tin a stupid idiot guy let(me go for) ever");
        englist.add("I'm as single as a dollar & ain't looking 4 no change");
        englist.add("Single is single and now taking applications if u think Ur suitable 4 the job apply ere lol");
        englist.add("Is single, I make the best of it, It doesn't mean that I'm not good enough , It means no ones good enough for me xx");
        englist.add("I'm single. You're single. You like me. I like you. Am I missing something?");
        englist.add("I don't need a guy to tell me they love me or that they will always be there for me because my best friends already do that!");
        englist.add("I throw my condoms in the air sometimes saying THEERRRE NOO USSEEE! I'll never get laid!");
        englist.add("Single and it will take some-one very special to change it ;)");
        englist.add("Loves being single and not having to answer to anybody, doing what ya want, who ya want, when ya want!!!");
        englist.add("Tempt me. I dare you!");
        englist.add("I'm a free bitch baby. :)");
        englist.add("{NAME} is so thankful for all my friends who are in a relationship.' Yeah, reminds me of how thankful I am to God that I am Single");
        englist.add("Met Mr. wrong, Mr. jerk, Mr. cheater, Mr. liar, Mr. horn-dog. Where's my Mr. right? Have you seen (him/her)?");
        englist.add("loves it when people find out they's single n say sorry like they r offering condolences at a funeral. Being single isn't a disease, sometimes its the cure !!!");
        englist.add("thinks being single is like having a McDonalds - I'm Lovin' It :)");
        englist.add("Facebook should change single to riding solo");
        englist.add("I want a Guy that makes me laugh everyday makes me smile and loves me for who i am Is that 2 much 2 ask for");
        englist.add("has standards when it comes to dating...and wonders why so many put on a pretense until the day to meet comes...then all you see is a idiot in front of you?!");
        englist.add("Hubby n wife die n arrived in heaven. Wife says  Here we r together again.  Hubby says F... dat shit! The deal was til death do us part. ! Bitch I'm single!");
        englist.add("I'm single because i am saving myself for someone who deserves me.");
        englist.add("I just wish one guy could prove me wrong and be different from all the rest. But that's as impossible as nailing jello to a tree <3");
        englist.add("Free to a good home:- one heart, slightly battered, in need of some TLC");
        englist.add("Doesn't feel sorry for themself, just sorry for the guy that is missing out on such an amazing girl.");
        englist.add("Being single doesn't mean you're weak... It means you're strong enough to wait for what you deserve.");
        englist.add("Everyone always says You need to get a boyfriend! It's great having a boyfriend! then I say Its even better not suffering heart break. Single ladies rock ");
        englist.add("Don't play hard to get with a man who is hard to get - S3x in the City");
        englist.add("I'm not single because I don't pray for love. I'm single because I don't play around with love.");
        englist.add("I F..bad..ing hate being single! it sucks! > :pI");
        englist.add("I know for damn sure what love is... cause bet your @ss the last mother F..bad..er showed me EVERYTHING IT'S NOT! *Ridin Solo*");
        englist.add("I don't consider myself.. 'SINGLE & ALONE' I consider myself ' INDEPENDENT & AVAILABLE'.. =]");
        englist.add("I have a empty hand for someone to hold. I have an empty heart for someone to fill.I have an empty spot for someone to take. -Devon Foley");
        englist.add("I wish Facebook would change Single to Riding Solo. It would sound much cooler");
        englist.add("Being single is not always a curse. Sometimes it is a blessing because you don't have to worry about being disappointed.");
        englist.add("I'd like to think that I'm a good person..so WTF!");
        englist.add("Hates it when people say 'there's someone for everyone'. so where the F..bad.. is they.I HATE BEING SINGLE");
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