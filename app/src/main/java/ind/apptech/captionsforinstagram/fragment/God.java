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

public class God extends Fragment {

    RecyclerView rajputlist;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public God() {
        // Required empty public constructor
    }

    public static God newInstance(String param1, String param2) {
        God fragment = new God();
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

        englist.add("Every second God remembers you Every minute God bless you Every hour God cares for you bcoz. Every day I pray God to take care of you.");
        englist.add("Behold the beauty of the day, The shout of color to glad color, rocks and trees, and sun and seas, and wind and sky: All these are God's expression, art work of His hand, which men must love ere they can understand.");
        englist.add("Darkness cannot drive out darkness; only light can do that. Hate cannot drive out hate; only love can do that.");
        englist.add("Love yourself enough to never place all that is reserved for God into another human being. God never fails us. Humans fail constantly.");
        englist.add("A good karma helps to change destiny.");
        englist.add("Thanks god for everything.. because without my life is nothing.");
        englist.add("There are three stages in the work of God: impossible, difficult, done.");
        englist.add("God helps those to stand before anyone, who kneels down before him.");
        englist.add("The more we depend on God the more dependable we find He is.");
        englist.add("The creator of the earth cannot be seen, he needs to be felt.");
        englist.add("God Bless You & Keep you Safe Not Only Today But, Throughout Life That Is Coming In Your Way. May Year To Follow Be Among The Best you Have Ever Spend.");
        englist.add("Don't take tension, u'll get ur destination. Don't make ur mind jam, due 2 exam. Believe urself, GOD will help you to get success. Wishing U best of luck my dear.......");
        englist.add("Not seeing air doesn't keep me from breathing. Not seeing Jesus doesn't keep me from believing.");
        englist.add("Were there no God, we would be in this glorious world with grateful hearts, and no one to thank.");
        englist.add("To fall in love with God is the greatest of all romances; to seek him, the greatest adventure; to find him, the greatest human achievement.");
        englist.add("God's blesing may come as a surprise And how much YOU receive Depends on how much Ur heart can believe. May u B blessd beyond WHAT YOU expect..!");
        englist.add("A life without God is hardly a life at all.");
        englist.add("Ding Dong Ding Dong... I hear church bells ringing. No I'm not getting married. I am just at church right now.");
        englist.add("We remain such creeping Christians because we look at ourselves instead of Christ");
        englist.add("If someone hurts you don't mind it. It is the law of nature The tree that bears the sweetest fruits gets the maximum number of stones.");
        englist.add("Mostly sometimes all it takes is just 'ONE PRAYER' to change everything.");
        englist.add("It is not easy for an ordinary people to forgive, it is the task of great soul.");
        englist.add("When you are spiritually uplifted, you can face the difficulties of life smilingly.");
        englist.add("With God, all things are possible.");
        englist.add("Now I wake up, get all pretty and dressed. Brush my teeth, look my best. So I can go to church, and praise his name. I guess your not at church, what a shame. But say a prayer to the sky and He'll forgive you He is a nice guy.");
        englist.add("Beauty of every season give your heart a beautiful reason to smile. May God suceed you in every exams of your life. Good luck & God bless you.");
        englist.add("Don't be sad when we suffer because through suffering we clear our road towards heaven.");
        englist.add("I'm just a nobody telling everybody about somebody that can change anybody!");
        englist.add("Wear new values, not just clothes.");
        englist.add("Dont work too hard to give yourself the Best of everything, instead make a greater effort 2 give GOD the best of Ur self.");
        englist.add("The real significance of prayer is to connect god in our spirit and to absorb god himself.");
        englist.add("Prayer is putting oneself in the hands of god.");
        englist.add("When you find a dream inside your heart, Don't ever let it go. For dreams are the little seeds  From which beautiful tomorrows grow.");
        englist.add("God's plans are always better than our dreams.");
        englist.add("I'm at God's house.");
        englist.add("When we pray to god,god hears more than we say, answers more than we ask, gives more than we imagine..but in his own time and way.");
        englist.add("God, i cat't say it in words…can yuo please just listen through my heart.");
        englist.add("Suffering and undergoing hardship for the sake others is the sign of a great soul.");
        englist.add("I believe in The Big Bang Theory - God said it and BANG, it happened.");
        englist.add("Most of us wait until we're in trouble, and then we pray like the dickens. Wonder what would happen if, some morning, we'd wake up and say, Anything I can do for You today, Lord?");
        englist.add("Love thyself to love God.");
        englist.add("This angel has flown away to church.");
        englist.add("Once U find someone you really love,  try your hardest not to lose them, so that you will never get the feeling of loneliness BLINKING STARS");
        englist.add("We should think of the church as an orchestra in which the different churches play on different instruments while a Divine Conductor calls the tune.");
        englist.add("God never fails. He is faithful. He is love. He will never leave you. He is eternal. He is trustworthy. And more.");
        englist.add("Our God is at home with the rolling spheres, and at home with broken hearts.");
        englist.add("Little seeds of love can make a big garden.");
        englist.add("Want to prove God is real ,just look into the eyes of a newborn child.");
        englist.add("Let Jesus guide U in all your plans,  in all your dreams, in all your wish 2 happen N your life. God bless");
        englist.add("It is doubtful whether God can bless a man greatly until He has hurt him deeply.");
        englist.add("O LORD, please grant  prosperity, happiness, contentment, love & most importantly youthful looks to all my ageing friends..");
        englist.add("God knows the secret plan of the things he will do for the world, using my hand.");
        englist.add("A Successful Man Is One Who Can Lay A Firm Foundation  With The Bricks That Others Throw At Him. Good Luck");
        englist.add("Divine treat includes holy talks and holy minds.");
        englist.add("Without the Way there is no going; without the Truth there is no knowing; without the Life there is no living.");
        englist.add("Take care of your character, your reputation will be automatically taken care of.");
        englist.add("The worship most acceptable to God comes from a thankful and cheerful heart.");
        englist.add("Thank you God for pouring your blessings every moment.");
        englist.add("Next time you think you are perfect... Try walking on water.");
        englist.add("B-basic, I-instructions, B-before, L-leaving, E-earth");
        englist.add("Achievements are accomplished through difficulties.");
        englist.add("On your new little one. May you always be as happy as you are today? And, for you & your new baby we wish blessings from GOD above.");
        englist.add("May D GoD of Hope fill U with all  joy and peace as you trust in him, so that U may overflow with hope  by the power of the Holy Spirit.");
        englist.add("Is your place a small place? Tend it with care; He set you there. Is your place a large place? Guard it with care! He set you there. Whate'er your place, it is not yours alone, but his Who set you there.");
        englist.add("If God is your partner, make your plans BIG!");
        englist.add("Rain of summer, snow of winter, grace of autumn, glory of spring, May beauty of every season give Your heart a beautiful reason to smile. May God suceed you in every exams of your life. Good luck & God bless you.");
        englist.add("Always pray God ours.");
        englist.add("What a friend we have in Jesus, all our sins and griefs to bear. What a privilege to carry everything to God in prayer.");
        englist.add("If God shuts one door, he opens another.");
        englist.add("As water drops of rain come down from sky to earth, SHOWERS OF BLESSINGS from GOD come down, if we come to GOD's feet.");
        englist.add("To get the pleasure of dawn we have to pass through the dark night.");
        englist.add("Jesus is my homeboy.");
        englist.add("Nothing can make us spiritual, we have to grow from inside, our soul is the best teacher.");
        englist.add("God has blessed us with animals to LOVE us even when we are at our worst!");
        englist.add("When you face problems in life, don't ask GOD to take them away. Ask Him to show His purpose- ask ways how to live a day searching his purpose for you. GOD BLESS...");
        englist.add("God is so mighty, they will never let us fall lower than our knees.");
        englist.add("GOD doesnt require u 2 b d best, HE just wants u 2 do ur best & HE will tek ker of d rest.");
        englist.add("Through the clouds of midnight, this bright promise shone, I will never leave thee, never leave thee alone.");
        englist.add("He died for me. I live for Him.");
        englist.add("As the dawn breaks into a beautiful sunrise, May God shower you his blessings of love & lead you always to the right path.");
        englist.add("Be kind, it's good for us.");
        englist.add("Sorry I don't have time to talk to you right now because I am currently chatting with God.");
        englist.add("Be sweet not just eat sweets.");
        englist.add("God has a reason for allowing things to happen we may never understand his wisdom but we simply have to trust his will. God bless you all the way.");
        englist.add("A good book is the best pilgrimage.");
        englist.add("If you believe what you like in the gospels, and reject what you don’t like, it is not the gospel you believe, but yourself.");
        englist.add("Live in such a way that those who know you but don't know God will come to know God because they know you.");
        englist.add("Beauty is God's handwriting.");
        englist.add("Let's chant for greater cause – Global peace and happiness.");
        englist.add("No God No Peace.. Know God Know Peace");
        englist.add("Think good, our thought shapes us.");
        englist.add("God's gifts put man's best dreams to shame.");
        englist.add("Everyone who believes in God at all believes that he knows what you and I are going to do tomorrow.");
        englist.add("Be an organ donor, give your heart to God.");
        englist.add("we may never understand his wisdom but we simply have to trust his will. God bless you all the way.");
        englist.add("1 cross + 3 nails = 4given");
        englist.add("Temple, Church, Mosque, Gurudwara are the different addresses of the same resident.");
        englist.add("Church, it does a soul good.");
        englist.add("Faith and hope are the inspiration to move forward into life.");
        englist.add("Indeed, I tremble for my country when I reflect that God is just.");
        englist.add("Every bad situation will have something positive, Even a stopped Clock is correct twice a day... Think of this & lead your life");
        englist.add("God always pours love, we have to find it.");
        englist.add("Got Jesus? Because its Hell without Him!");
        englist.add("While praying we should pray not sing.");
        englist.add("We shall steer safely through every storm, so long as our heart is right, our intention fervent, our courage steadfast, and our trust fixed on God.");
        englist.add("May the blessings of Lord Vinayagar Shower upon you May he bless all your coming months of this  new Year with Happiness & Peace.. May you.");
        englist.add("All you Need In The Life Is Ignorance And Confidence & Then Success Is Sure. Good Luck. Bless you'");
        englist.add("Stop telling God how big your storm is. Instead, tell the storm how big your God is!");
        englist.add("Burn your ego into ashes.");
        englist.add("Life has many choices, eternity has two.");
        englist.add("The privilege He offers you is greater than the price you have to pay.");
        englist.add("Life is short. Pray hard.");
        englist.add("4 every hope u seek, let God give u unexpected miracles.. 4 every faith u have, let God bless u more.");
        englist.add("I Pray YOU be Safe u B Happy Every Minute, Every Hour and Everyday of YOUr life. GOD BLESS YOU");
        englist.add("To let go is the sign of a strong people.");
        englist.add("When you don't know what to do, just do pray.");
        englist.add("For he will never leave you nor foresake you,his love is eternal. .");
        englist.add("NEVER BLAME A DAY IN UR LIFE, GUD DAYS GIVES HAPPINESS, BAD DAYS GIVE U EXPERIENCE, BOTH ARE ESSENTIAL IN LIFE,  ALL ARE GOD BLESSING");
        englist.add("God never fails to amaze me everyday. Love Him so much.");
        englist.add("Fly in the plane of Ambition & Land in the Airport of Success... Luck iZ yours,Wish is mine...May Ur future always shine... Good Luck");
        englist.add("When you love God, the entire world becomes dear to you.");
        englist.add("Ultimate solace can be found only in praying God.");
        englist.add("Giving God means helping others and he will give double in return.");
        englist.add("It's not what God can do for you but what you can do for God.");
        englist.add("With my 1 Hearttt... 2 eyez... 5 liters blood... 206 bonezz... 1.2 milion Red Cells... 60 trilion DNAs... I wish you al da very blessssed day");
        englist.add("Thanks to god what happens in our life. nothing is mistake, every end or mistake leads to a new start.");
        englist.add("The universe is centred on neither the earth nor the sun. It is centred on God.");
        englist.add("Men occasionally stumble over the truth, but most of them pick themselves up and hurry off as if nothing had happened.");
        englist.add("Only God can fully satisfy the hungry heart of man.");
        englist.add("Our gift from God is who we are. Our gift to God is what we become.");
        englist.add("For external beauty we put on things, for real beauty we have to shed all things.");
        englist.add("I am at church right now. Unlike you I don't want to be consumed by the flames of Hell.");
        englist.add("Holiness is doing God’s will with a smile.");
        englist.add("Prayers and chanting abolish the toxic elements of life.");
        englist.add("I am so addicted. I started and I can't stop. I think about it every night when I go out. I can't stop doing it. I'm addicted to God!");
        englist.add("Hell and heaven exist in this world only.");
        englist.add("God returns everything in double.");
        englist.add("Blaming others means you cannot change and thus you become stagnant.");
        englist.add("The most important thing in life is happiness & cannot be bought.");
        englist.add("No pain can affect a spiritually uplifted person.");
        englist.add("May God bless you and your family today and always.");
        englist.add("It is very normal to love beautiful things, but very beautiful to love normal things.");
        englist.add("May GoD give U a caring heart so that you can become a whole person,  not just gifted wiD intellect that can understand, but wiDh heart that truly cares and loves.");
        englist.add("The beauty of the morning isn't the sunrise but the thought of God giving us a new day to see through life.");
        englist.add("If we find ourselves with a desire that nothing in this world can satisfy, the most probable explanation is that we were made for another world.");
        englist.add("Sumtimes we must b hurt in order to grow, Sumtimes we must fail in order to no,  Sumtimes we must lose in order to gain  because sum lessons in life are best learned through pain. Have a blessssed day !");
        englist.add("Life revolves around hope.");
        englist.add("The state of your heart dictates whether you harbor a grudge or give grace, seek self-pity or seek Christ, drink human misery or taste God’s mercy.");
        englist.add("7 days without prayer makes one weak.");
        englist.add("God alone cannot change our destiny, we have to act accordingly.");
        englist.add("God always makes you smile cause he believes in you so always make him smile and believe in Him.");
        englist.add("A Fulfiling Future Belongs TO Those WiTH Strong Vision And Resilence. It Doesn't Matter Where YOU Might Be Now. Starting Well AND Finishing Strong IZ What Counts.  Good Luck!");
        englist.add("n God's eyes, love iZ never absent. In GoD's heart, forgiveness iZ never impossible. In God's embrace, no 1 is ever alone or forgotten. God Bless!");
        englist.add("Prayer should be gratitude not asking for something.");
        englist.add("I ask God to bless yoU, to guide yoU, to keep yoU safe, to give yoU peace, to give you joy & love all the time.");
        englist.add("I can see how it might be possible for a man to look down upon the earth and be an atheist, but I cannot conceive how he could look up into the heavens and say there is no God.");
        englist.add("Happiness As Light As Air. Love As Deep As Ocean. Friends As Solid As Diamonds And Success As Bright As Gold. These R My Wishes 4 U Today N Everyday - Good luck");
        englist.add("I love to think of nature as an unlimited broadcasting station, through which God speaks to us every hour, if we will only tune in");
        englist.add("I might run out of cute graphics 2 Send u, sweet thoughts 2 tell u, punching Lines to hit YOU, but i'll never run Out of this:  care for a person like u.");
        englist.add("I asked Allah to take away my habit Allah said: No, its not for me to take away  but for you to give it up. I asked Allah to make my handic.");
        englist.add("Determination is the first step of the ladder of success.");
        englist.add("Warning: In case of rapture, this computer will be unattended.");
        englist.add("The world will never starve for want of wonders.");
        englist.add("Thanks god for this beautiful life and please forgive me if i don't love it.");
        englist.add("If we take our problem as challenge then nothing can remove our smile.");
        englist.add("In prosperity, GOD tests our gratitude;  N poverty, our contentment; N darkness, our faith; at all times our obidience!  GOD Bless YOU!");
        englist.add("It is always wonderful to view events and situation in a positive way.");
        englist.add("He loves us, so we should love Him with full of our heart and mind.");
        englist.add("Never regret a day in your life, good days give you happiness. Bad days give you experience . Both are essential in life. all are god's blessings. GOD BLESS YOU...");
        englist.add("Bigger lie, bigger explanation.");
        englist.add("We should light self knowledge not just lamps.");
        englist.add("All that God requires of us is an opportunity to show what He can do.");
        englist.add("Always ask God to give you what you deserve, not what you desire. Its because your desires may be few but you deserves a lot! God Bless U");
        englist.add("Never waste your today for yesterday.");
        englist.add("Prayer in the good time works as fixed deposit.");
        englist.add("It's My Pray When U Sleep Your Sorrows,  Tensions &  Worries Also Sleep FORVER Ever And When U Get Up Ur Success Of Life Get Up WiD U 4ever");

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