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

public class Parents extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Parents() {
        // Required empty public constructor
    }

    public static Parents newInstance(String param1, String param2) {
        Parents fragment = new Parents();
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

        englist.add("One father is more than a hundred schoolmasters!!!");
        englist.add("Home is where your mum is. I love my Mommy.");
        englist.add("No language can express the power and beauty and heroism of a Father's love.");
        englist.add("Thank you for being a great dad ! Your memories will always live in the very core of my heart.");
        englist.add("I love my mother as the trees love water and sunshine. She helps me grow, prosper, and reach great heights.");
        englist.add("Parents are friends that LIFE gives us, & Friends are parents that the heart chooses..");
        englist.add("A mother's love is something we keep locked deep in our hearts, always knowing it will be there to comfort us.");
        englist.add("ABBREVIATION OF MOTHER: M:MOST O:ORIGNAL T:TOPCLASS H:HONOURABLE E:EXCELLENT R:RESPECTABLE");
        englist.add("My mom is definitely my rock.");
        englist.add("Mother is the biggest gift of god to all human being believe it or not she is the real queen she protect her child and not mean love u a lot mom.");
        englist.add("A mother's heart is always with her children.");
        englist.add("F.A.M.I.L.Y is one of the strongest words anyone can say, because the letters of family means Father and Mother I Love You!!");
        englist.add("Fathers are angles, without father the world seems to be nothing. I love you papa I miss you very much!!!");
        englist.add("God could not be everywhere and therefore he made Fathers.!!!");
        englist.add("Honor your parents and your childrens will honor you..");
        englist.add("Treat your parents with loving care, you will only know their value when you see their empty chair.");
        englist.add("Being a mother is the highest paid job in the world, since the payment is in pure love..");
        englist.add("Grown means nothing to a mother. A child is a child. They get bigger, older, but grown? In a mother's heart each will always be her baby..");
        englist.add("Mother is a beautiful creation, because in this selfish world, she is the only one who always want to see you happy.");
        englist.add("The Miracle of Life nurtured by a woman who gave us love and sacrifice… is MOTHER.");
        englist.add("ur truest best friend is ur mom..some people just have to realise it..have u told ur mom that u love their yet today? cuz you should everyday..I LOVE U MOM!! ");
        englist.add("MOTHER means, Magnificent, Outstanding, Tender, Honorable, Extraordinary, Remarkable");
        englist.add("I love my parents a lot. Even if they can be annoying i know they want the best for me.");
        englist.add("I was always at peace because of the way my mom treated me.");
        englist.add("My father gave me the greatest gift anyone could give another person, he believed in me.");
        englist.add("One of life is greatest jobs: Fatherhood!!!!");
        englist.add("Anyone who doesnt miss the past never had a Father.");
        englist.add("We never know the love of our parents for us, till we have become parents.");
        englist.add("Being a great mother is a very hard role, but mother u r the star for this one I know, I love you Mom.");
        englist.add("We cannot all do great things, but we can do small things with great love. Happy Mother's Day..");
        englist.add("A mother is not a person to lean on but a person to make leaning unnecessary.");
        englist.add("Always remember your parents are the only two person in this world, who will never let you down until end of their time. They spend everything behind you only for to see you a successful person.");
        englist.add("Youth Fades; love droops the leaves of friendship fall. A mother's secret love outlives them all.. Happy Mother's Day..");
        englist.add("A mother's love is patient and forgiving when all others are forsaking, it never fails or falters, even though the heart is breaking..");
        englist.add("Never forget your parents coz they are the reason why you are and who you are.");
        englist.add("A mother thinks about her children day and night, even if they are not with her and will love them in a way they will never understand.");
        englist.add("Knows your grown up when someone tell you your just like your mom and you take it as a complaint !!!");
        englist.add("My Mother, my friend so dear Throughout my life you’re always near A tender smile to guide my way You’re the sunshine to light my day.");
        englist.add("Did you ever notice that MOM spelled upside down is WOW? That's because we Moms are amazing! So have an amazing day!!");
        englist.add("If you think being a mom is a full time job, try being a working mom, it's like having two full time jobs, with halftime pay!");
        englist.add("A Father understands what a child does not say.");
        englist.add("I love my father as the stars and he is a bright shining example and a happy twinkling in my heart");
        englist.add("A mother’s arms are made of tenderness and children sleep soundly in them.");
        englist.add("Mother, no matter how old you get, you will always be the queen of my heart. Happy Mother's Day..");
        englist.add("Motherhood: All love begins and ends there.");
        englist.add("its amazing how you can feel bad as if your life was falling apart..then you hear your mother's voice and everything suddenly seems FINE :) ");
        englist.add("The greatest gift I ever had Came from God; I call him Dad! Love u Dad !!");
        englist.add("If you think I'm crazy wait till you meet my Mom! :)");
        englist.add("every day we should honour our parents and remind them that we love them. Thanks mom and dad for everything you have done for me. I love you.");
        englist.add("Many hugs Only love never anger Teaching me Helping me Every smile when I was sad Raising me to be strong It spells Mother. Thanks for being u.");
        englist.add("It takes some one really brave to be a mother, someone strong to raise a child and someone special to love someone more than herself.");
        englist.add("Heaven.. must be really small, because i can see it in my Mom's eyes, Happy Mother's Day to you Mom..");
        englist.add("A mother understands what a child does not say.. Happy Mother's Day..");
        englist.add("It doesn't matter how younger or older we are, we are always be a child in our mother's eye. And she will always worried about us that like we are the child.");
        englist.add("Moms hold their children's hands for a while, but their hearts forever.");
        englist.add("A mother is she who can take the place of all others,but whose place no one else can take.");
        englist.add("Parents are the only God to help and guide you in your life!!!");
        englist.add("My mother is an angel who loves unconditionally. If your mother is an angel click like.");
        englist.add("Good mom's let there kids lick the beaters...Great moms shut the beater off first.:) ");
        englist.add("What do u call an employee who works 24/7 and is seriously underpaid??? A Mom!! ");
        englist.add("thinks no matter how old you get, there are some times you just need your mama!!!");
        englist.add("All Fathers are working Fathers.");
        englist.add("There is nothing in the world of art like the songs mother used to sing.");
        englist.add("There is only one pretty child in the world, and every Father has it.");
        englist.add("Moms are as relentless as the tides. they don't just drive us to practice, they drive us to greatness. Happy Mother's Day..");
        englist.add("Never forgot your parents, they are the reason why you are and who you are.");
        englist.add("There is nothing greater in this world than being loving parents. So take the first step today by getting married. Think different, do different!");
        englist.add("A happy family needs a loving and caring father, and he who knows how to be a mother sometimes. Fathers hold their children's hands for a short while, but their hearts forever.");
        englist.add("Never forget two people in your life... The person who lost everything just to make you win. [your father] The person who was with you in every pain [your mother]");
        englist.add("North South East West, From all DADS you are the best.!!!");
        englist.add("Anyone can have a child and call themselves a parent. A real parent is someone who puts that child above their own selfish needs and wants.");
        englist.add("Proud Mom: I gave them life they gave me a reason to live. ");
        englist.add("A man loves his sweetheart the most, his wife the best, but his mother the longest.");
        englist.add("I thank God that I'm a product of my parents, that they infected me with their intelligence and energy for life, with their thirst for knowledge and their love. I'm grateful that I know where I come from.");
        englist.add("I believe that Presence of Parents with you makes you the richest person of the world.");
        englist.add("Mothers role is seventy times greater than the father.");
        englist.add("The only man you can depend on is your father.");
        englist.add("You’ve seen me laugh You’ve seen me cry And always you were there with me I may not have always said it But thanks and I love you mom");
        englist.add("The best sentence ever spoken- I love you mom .");
        englist.add("A good father is a man who supports his children even when he has no money.");
        englist.add("My father didn't tell me how to live, he lived and let me watched him do it.");
        englist.add("Dad you are never wrong,The only time you are wrong,is when you think, I forgot about you.,Love you Dad!");
        englist.add("do you believe in angels? i do its my mom.");
        englist.add("The bond between mothers and their children is one defined by love. As a mothers prayers for her children are unending, so are the wisdom, grace, and strength they provide to their children.");
        englist.add("Only mothers can think of the future – because they give birth to it in their children.");
        englist.add("The Father's heart is the childs schoolroom.");
        englist.add("Fathers are angels sent from heaven");
        englist.add("When a father gives to his son, both laugh; when a son gives to his father, both cry!!!!");
        englist.add("A mother always has to think twice, once for herself and once for her child.");
        englist.add("I cannot think of any need in childhood as strong as the need for a father's protection.");
        englist.add("Your fades, love droops the leaves of friendship fall. A mother's secret love outlives them all.");
        englist.add("The most beautiful thing in this world is, to see your parents smile and knowing that you are the reason behind that smile.");
        englist.add("God give us life with happy and sad moments. But parents always try to give us only happy moments.");
        englist.add("When all else fails, I call my Mom. they has all the answers!");
        englist.add("Mother love is a fuel that enables the human being to do the impossible.");
        englist.add("All that I am, or hope to be, I owe to my angel mother.");
        englist.add("I got to grow up with a mother who taught me to believe in me.");
        englist.add("I have a MOM who makes me laugh, wiped my tears, hugged me tight, watched me succeed, saw me fail, cheered me on and kept me strong! I <3 you mom!");
        englist.add("Any man can be a father but it takes someone special to be a dad.");
        englist.add("A mans work is from sun to sun, but a Father'ss work is never done!!!!");
        englist.add("A father is someone who can take the place of all others, but whose place no one else can take!!!!!");
        englist.add("Says I'm a leader, a fighter, and a survivor and my best accomplishments in this life call me MOM! :)");
        englist.add("Any woman can be a mother but it takes someone special to be called “Mom”.");
        englist.add("After all these years, being almost grown...I still try to run and hide when I hear my full name yelled by mom.");
        englist.add("God gave me the greatest gift I ever had,God gave me a best friend in the form of my dad. Father's Day wishes for a dad who is one in a million");
        englist.add("Even though I'm all grown up and have my own family, I still need my mom...I love you mom");
        englist.add("A MOTHER thinks about her CHILDREN day and night. Even if they are not with her, and will love them in a way they will never understand.");
        englist.add("Pay My Regards To Ur Father ,Who Is Tolerating Such A Dumb Duffer Child,What A Stamina He Has Got.. I Salute Ur Father:p");
        englist.add("Always love your mother, cause you never get another.");
        englist.add("Motherhood is… difficult and… rewarding.");
        englist.add("Parents need to teach their children principles of respect and acceptence.");
        englist.add("No love is greater than mom's love, and no care is greater than dad's care..");
        englist.add("Mother's love is peace. it need not be acquired, it need not be deserved. Happy Mother's Day..");
        englist.add("Life began with waking up and loving my mother’s face.");
        englist.add("I Love my MOM.. No matter what we go through, and no matter how much we argue, i know in the end, she will always be there for me. Happy Mother's Day..");
        englist.add("An ounce of Father is worth a ton of priest.!!!");
        englist.add("The most important thing a father can do for his children is to love their mother.");
        englist.add("If father is happy then God is happy and if father is angry the God also angry so try to happy your father");
        englist.add("No matter how old i get, i always want my mom when i don't feel good.");
        englist.add("I Loved you from your first breath, I'll Love you till my last.Love u Mom");
        englist.add("We never know the love of a parents till we become parents ourselves.");
        englist.add("Sometimes the strength of Fatherhood is greater than natural laws!!!!");
        englist.add("Parents are the stars that guide you in their love and care. They pains when they are far away. But they are in your thoughts always.");
        englist.add("The reason why daughters love their dad the most is that there is at least one man in the world who will never hurt her!!!");
        englist.add("A dad is someone who holds you when you cry, scolds you when you break the rules, shines with pride when you succeed and has faith in you even when you fall.");
        englist.add("Your parents may not be perfect, but they are the most precious gift God has ever given you.");
        englist.add("A mother's love reaches far beyond circumstances and feelings, it sees past flaws and imperfections, and celebrates God's gift of love, sent from heaven in the form of a child.");
        englist.add("If you are beautiful, that's a gift from your parents. If you make your life beautiful, that's a gift for your parents.");
        englist.add("Children are the anchors of a mother’s life!!!!");
        englist.add("No gift to your Father can ever equal her gift to you life.");
        englist.add("I believe in love at first sight, because i have been loving my mother ever since i opened my eyes.");
        englist.add("Love your parents we are so busy growing up, we often forget they are also growing old..");
        englist.add("A Father means so many things An understanding heart, A source of strength and support right from the very start. Love u Dad !!!");
        englist.add("You are one of a kind, A better DAD I could not find!!!!");
        englist.add("Dads are great at ironing out life is wrinkles.!!!");
        englist.add("A good father is a man who buys your toys, before he buys his.!!!!");
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