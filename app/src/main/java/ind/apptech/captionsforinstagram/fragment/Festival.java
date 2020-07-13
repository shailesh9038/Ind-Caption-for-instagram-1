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

public class Festival extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Festival() {
        // Required empty public constructor
    }

    public static Festival newInstance(String param1, String param2) {
        Festival fragment = new Festival();
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

        englist.add("The best Christmas of all is the presence of a happy family all wrapped up with one another.");
        englist.add("May Allah accept your good deeds, forgive your transgressions and Sins and ease the suffering of all peoples around the globe.");
        englist.add("Wishing all my family and friends a happy and healthy Christmas and New Year. Be safe and Don’t Drink and Drive.");
        englist.add("Santa is always jolly, he knows where the naughty girls live.");
        englist.add("Freedom was taken by the blood that was given. Happy Independence Day..");
        englist.add("Happy, Happy Diwali! I hope the day has been blessed with the presence of those you love most, and many magical moments!");
        englist.add("Hope you know how much it means to wish the best for you, because you’re always thought about with love the whole year through. Warmest wishes on Christmas Day!");
        englist.add("Tom Cruise, Angelina Jolie, Aishwarya Rai, Arnold, Jennifer Lopez, Amitabh Bachhan & Me.. All the Stars wish You a Very Happy New Year.");
        englist.add("Unless we make Christmas an occasion to share our blessings, all the snow in Alaska won’t make it WHITE.");
        englist.add("Wishing You Blessings at this very special occasion, Wishing you a happy and blessed Eid surrounded by those you love.");
        englist.add("I wish a Happy Holi to everyone. Let the colors of holi fill your heart with warmth and love.");
        englist.add("Selfishness makes Christmas a burden, love makes it a delight.");
        englist.add("The festival of lights is just around the corner, wishing you all a very Happy Diwali.");
        englist.add("Across the miles at Eid people who are dear to us are never far away, they’re always close in thought and heart, the way you are today! Happy Eid Day");
        englist.add("A boy writes to Santa asking for a brother and receives a reply back from Santa send me your mother");
        englist.add("I will honor Christmas in my heart, and try to keep it all the year.");
        englist.add("Some words can be left unsaid, Some feeling can be left unexpressed, But person like you can never be forgotton on this day.");
        englist.add("May you find success in all your endeavors, May Allah blessings be always with you..“Eid Mubarak”");
        englist.add("I have just been kidnapped by a fat dude in a red suit, shoved in a bag and taken to the north pole and wrapped up. Who put me on their Christmas list?");
        englist.add("I wish you Wisdom to choose priorities for those things that really matter in life.");
        englist.add("Life with you is like diwali, so lets promise to be together like this forever. Wish you a very Happy Diwali");
        englist.add("May His love fill your heart with Joy and peace this Eid and each day of the year to come.");
        englist.add("On Eid ul-Fitr, wish that Allah’s blessings light up the path and lead to happiness, Peace and success. Happy Eid");
        englist.add("May this Eid bring Fun, Happiness, God’s Endless Blessings, and fresh love EID MUBARAK to You with all best wishes.");
        englist.add("Holi is a time to reach out with the colors of joy. It is the time to love and forgive. It is the time expresses the happiness of being loved and to be loved through colors. Happy Holi!");
        englist.add("Christmas does not come from the pockets, it comes from the heart. It’s not about gifts, rather family and friends. MERRY CHRISTMAS");
        englist.add("Wish you happy holidays season with unforgetable Christmas and New Year.");
        englist.add("On the precious moment of diwali I wish you happy diwali and I pray that you get all your endeavors fulfilled as well as you get lots of gifts and sweets this diwali.");
        englist.add("Hope this diwali brings contentment to your life along with the key to success");
        englist.add("I will no longer waste my time relieving the past, instead I will spend it worrying about the future.");
        englist.add("Everything that is really great and inspiring is created by the individual who can labor in freedom.");
        englist.add("May you never see the warmth of hardships and there would be always happiness in your home and you see many more happy moments like this Eid Day. Eid Mubarak");
        englist.add("All the loving wishes for you today to bring much happiness your way. Eid Greetings");
        englist.add("This is a day which makes us together at one place, creates smiles on all Muslim faces, and increases our love for each other. May we always keep this spirit for each other! Happy Eid day");
        englist.add("Where liberty dwells, there is my country.");
        englist.add("May this Diwali be as bright as ever.");
        englist.add("May Allah bless you & Your dear ones for happy & prosperous life on Eid Ul Azha & always.");
        englist.add("HAPPY DIWALI TO YOU! may you celebrate it well.surrounded by family,friends,and lots of love and remember..");
        englist.add("Patriotism is your conviction that this country is superior to all other countries because you were born in it.");
        englist.add("May you be able to develop your capabilities, may all your weaknesses turn into your strengths. Happy Eid Day.");
        englist.add("May eid be a special day that’s filled with warmth and love, and may it hold the happiness You’re so deserving of.");
        englist.add("Those who deny freedom to others deserve it not for themselves.");
        englist.add("well, that’s Christmas over for another year..");
        englist.add("I wish you a very happy and peaceful Eid ul Adhaa.");
        englist.add("Let me make your Diwali more colorful with the lights of wishes of my heart. Happy Diwali..");
        englist.add("Wishing you an Eid that brings with it the love and protection of Allah to stay always. Eid Mubarak.");
        englist.add("May Eid be a special day that’s filled with warmth and love, and may it hold the happiness You’re so deserving of!");
        englist.add("Just wanted to wish a little sunshine back into the heart of someone who gives it away all year long. Happy Diwali!");
        englist.add("Eid is a day to wish and make merry together. May your life be full of such great days! Wish you all splendors of this beautiful Eid day.");
        englist.add("True independence and freedom can only exist in doing what’s right.");
        englist.add("My Eid day will be incomplete if I would not wish you with my best wishes. Happy Eid Day");
        englist.add("Diwali night is full of lights, may your life be filled with colors and lights of happiness. Happy Diwali..");
        englist.add("The United States is the only country with a known birthday.");
        englist.add("As Christmas began in the heart of God Let us complete that love by extending our hearts to others.");
        englist.add("Each one of you are precious to me! I am so blessed to have you in my life and I love each one of you! Wishing you a beautiful Christmas & a Happy New Year!");
        englist.add("Let this diwali burn all your bad times and enter you in good times.");
        englist.add("May the miracle of Christmas fill your heart with warmth and love. Christmas is the time of giving and sharing. It is the time of loving and forgiving.");
        englist.add("May you all attain the inexhaustible spiritual wealth of the Self.");
        englist.add("Life is a festival only to the wise.");
        englist.add("When you have Christmas in your heart it doesn’t matter what’s under the tree.");
        englist.add("May the blessings of Allah upon you throughout the your life with happiness and open all the doors of success & happiness for you.");
        englist.add("The American Revolution was a beginning, not a consummation.");
        englist.add("Christmas is not as much about opening our presents as opening our hearts.");
        englist.add("Wishing you a successful life with contentment and peace. Eid Mubarak");
        englist.add("I prefer liberty with danger to peace with slavery.");
        englist.add("True patriotism hates injustice in its own land more than anywhere else.");
        englist.add("One flag, one land, one heart, one hand. Happy Independence Day!");
        englist.add("Wishing you all a very happy eid, And hoping that all the things you wish for will be yours through out the year.");
        englist.add("I wish you the gift of faith, the blessing of hope and the peace of his love at Eid and always.");
        englist.add("Happy Holi to you and your family. We wish your health, prosperity and business achievements at this prismic colour eve.");
        englist.add("We have gained this land after many sacrifices, so value your land. Enjoy the day of independence.");
        englist.add("May Allah flood your life With happiness on this occasion. Happy Eid");
        englist.add("I wish I could send you some warming rays to make your day a little brighter. Happy Eid Day");
        englist.add("May the good times and treasures of the present become the golden memories of tomorrow. Wish you lots of love, joy and happiness.");
        englist.add("Like this land, may you have independence in your life.");
        englist.add("Merry Christmas! From my wall to yours..");
        englist.add("For This, Is A Special Time When Family And Friends Get Together,For Fun. Wishing Laughter And Fun To Cheer Your Days, In This Festive Season Of Diwali And Always");
        englist.add("May the blessings of God keep Your heart & home happy & joyous! Eid Mubarak!");
        englist.add("You cannot build character and courage by taking away man’s initiative and independence.");
        englist.add("The truth is that existence wants your life to become a festival because when you are unhappy, you also throw unhappiness all around.");
        englist.add("This Diwali I wish you get a lot of crackers but you don’t get a match box to lit them. Save environment, so no to crackers.");
        englist.add("Christmas carols tend to make me a little homicidal, especially in November..");
        englist.add("Without moral and intellectual independence, there is no anchor for national independence.");
        englist.add("May all your worries turn into pleasures, May all your problems be solved on this Eid.");
        englist.add("May the warmth and splendor, that are a part of this auspicious occasion, fill your life with happiness and bright cheer, and bring to you joy and prosperity, for the whole year.");
        englist.add("May this Diwali lights up dreams, hopes, undiscovered avenues and everything bright. Happy Diwali");
        englist.add("From every mountain side Let Freedom ring…");
        englist.add("Santa Claus has the right idea. Visit people once a year.");
        englist.add("Santa won’t be coming this year…… He died laughing when you said you’d been a good girl.");
        englist.add("May this diwali Light up new dreams, fresh hopes, undiscovered avenues, different perspectives, everythin bright & beautifulfil and fill ur days with pleasant surprises and moments.");
        englist.add("Dear Santa, I didn’t want to make it too hard for you this year, so, the only thing on my list this year is 1 year paid leave from work. with bonus");
        englist.add("If you see the magic in a fairy tale, you can face the future.");
        englist.add("Gulal ka rang gubbaro ki maar suraj ki kirne khushiyo ki bahaar chand ki chandni apno ka pyaar mubarak ho A apko RANGO KA TYOHAAR Happy Holi");
        englist.add("May you all attain full inner illumination, May the supreme light of lights enlighten your understanding.");
        englist.add("Best wishes to you for a Holi filled with sweet moments and memories to cherish for long.");
        englist.add("May God give you happiness of heaven above. Happy Eid");
        englist.add("Whenever Eid comes, it brings a lot of happiness and memories with it. I wish these memories be the more precious ones for you. Happy Eid Day");
        englist.add("May this new year all your dreams turn into reality and all your efforts into great achievements.");
        englist.add("I love my freedom, I love my Pakistan");
        englist.add("The festival of light is full of delight Let me double the charm of your diwali night Happy Diwali!");
        englist.add("You are special, you are unique; may your Eid be also as special and unique as you are..");
        englist.add("You are invited to the festival of diwali of this world and your life is blessed.");
        englist.add("May the Choicest Blessings of Allah fill your life with Peace, Joy and Prosperity!");
        englist.add("May this new year bring many opportunities your way, To explore every joy of life & turning all your dreams into reality & all your efforts into great achievements. Happy new year..");
        englist.add("Anyone who believes that men are the equal of women has never seen a man trying to wrap a Christmas present.");
        englist.add("May the beauty Of deepavali season fill your home with happiness..");
        englist.add("May you all prosper gloriously on the material as well as spiritual planes..");
        englist.add("Eid is an event which provides us an opportunity to sit together, to share our happiness and sorrows, May this great union be always a part of our lives. Happy eid day and Eid Mubarak.");
        englist.add("Accept my deep heart prayers for you successful life on this day of Eid. Wish you a Happy Eid.");
        englist.add("It’s not the presents that make Christmas so special, it’s the presence of those you love, whether they are with you in person, or spirit.");
        englist.add("Wish we could share this great occasion “Warm memories have a lovely way of bringing folks together.” Although Eid finds us spending time apart, You’re very close in memory and always close in heart.");
        englist.add("A colourful message to a colourful person for a colourful day, in a colourful way, as a pray, that the colourful ray, may forever stay, Happy Holi.");
        englist.add("To all of my family and the friends I have made, Those who left for awhile and those who have stayed, Merry Christmas with hugs and kisses..");
        englist.add("May the joy and peace of Christmas be with you all through the Year. Wishing you a season of blessings from heaven above. Merry Christmas");
        englist.add("Holi is a special time of year to remember those who are close to our hearts with splashing colors.");
        englist.add("May you live your life like the festival of Diwali, happy healthy and wealthy. A Very Very Happy Diwali..");
        englist.add("Holi is the day to express love with colors. It is a time to show affection. All the colors that are on you are of love!");
        englist.add("Christmas waves a magic wand over this world, and behold, everything is softer and more beautiful.");
        englist.add("May Allah bless you on this auspicious day of Eid, and May it be a new beginning of greater prosperity, success and happiness.");
        englist.add("May peace transcend the earth. Happy Diwali");
        englist.add("May you be guided by your faith in Allah & shine in his divine blessings! Eid Mubarak");
        englist.add("From Home to home, and heart to heart, from one place to another. The warmth and joy of Christmas, brings us closer to each other.");
        englist.add("The price for independence is often isolation and solitude.");
        englist.add("Many are the wishes that are being sent your way, but this is a special one for a very happy Eid Day.");
        englist.add("Sending you smiles for every moment of your special day. Have a wonderful time and a very Happy Diwali.");
        englist.add("May everything in your life sparkle with a radiance that comes only from happiness.");
        englist.add("May this day bring peace and smoothness in your life, may it provide you the best time of your life. Happy Eid day");
        englist.add("Mickey Mouse is, to me, a symbol of independence. He was a means to an end.");
        englist.add("Freedom is the oxygen of the soul.");
        englist.add("May the sun in his course visit no land more free, more happy, more lovely, than this our own country..");
        englist.add("All I want for Christmas, cannot be found at a store.");
        englist.add("Celebrate your freedom in the world’s larget democracy “Pakistan”. Happy Independence Day.");
        englist.add("Hope Love & Laughter, warmth, wishes, joy & a bouquet of Eid wishes, jubilation become a part of your Eid & Your Life.");
        englist.add("May Allah bless us with the same repotation that we have in the past.");
        englist.add("Bright colors, Water balloons, Lavish gujiyas & Melodious songs are the ingredients of perfect Holi. Wish you a very happy Holi.");
        englist.add("May beautiful flowers keep you in smilling frame of happiness on Eid Day");
        englist.add("Without freedom, no one really has a name..");
        englist.add("It is day to pay salute to all those who became the reason of this land. Happy Independence.");
        englist.add("Radha ke rang aur kanhaiya ki pichkari pyar ke rang se rang do duniya sari ye rang na koi jat na koi boli mubrak ho apko ye mast Holi.");
        englist.add("May Allah bless you and your dear ones with peace, prosperity and happiness on the auspicious occasion of Eid-ul-Fitar. Eid Mubarak");
        englist.add("May the blessings of God upon you throughout the life with happiness & open all the doors of success & happiness for you.");
        englist.add("This country is the reason of our existence,our life our recognition.");
        englist.add("May this eid bring new horizons of successes and achievements in your life. May you find all the love of this world! Happy Eid day");
        englist.add("A true and caring relation doesn’t have to speak loud, a soft message is just enough to express the heartiest feelings. Enjoy the festival of Holi with lot of fun.");
        englist.add("May the blessings of Allah fill your life with happiness and open all the doors of success now and always.");
        englist.add("Christmas is the season when you buy this year’s gifts with next year’s money.");
        englist.add("Revolution is the festival of the oppressed.");
        englist.add("Democracy is the government of the people, by the people, for the people.");
        englist.add("Let freedom never perish in your hands.");
        englist.add("May the light that we celebrate at Diwali show us the way and lead us together on the path of peace and social harmony.");
        englist.add("Christmas, shouldnt be about gifts, it should be about love, forgiveness, kindness, compassion, to give and be someones angel when they need it the most.");
        englist.add("I know it’s only September but there are less than 100 shopping days left til Christmas..");
        englist.add("Let the colors of holi spread the message of peace and happiness.");
        englist.add("Has just been kidnapped by a fat man in a red suit and put in a bag, ALRIGHT! FESS UP! Who put me on there Christmas list?");
        englist.add("I wish you a life full of smiles and happiness.");
        englist.add("Economic independence is the foundation of the only sort of freedom worth a damn.");
        englist.add("May the New Year find your home filled with joy, your heart filled with love, and your life filled with laughter.");
        englist.add("Liberty is always dangerous, but it is the safest thing we have.");
        englist.add("I may not put colors on your face in this colorful festival but Im praying God to add more and more colors in your life. Wish you Happy Holi.");
        englist.add("Solitude is independence.");
        englist.add("Our ancestors have devoted their lives to get this land, so this the day of breathing.");
        englist.add("Liberty is the breath of life to nations.");
        englist.add("I stand for freedom of expression, doing what you believe in, and going after your dreams.");
        englist.add("Fear is the foundation of most governments.");
        englist.add("Wishing you smiles & all things nice. May this Eid bring all the comforts you have ever wanted, And all the joy & laughter you have ever wished . Happy Eid Mubarak.");
        englist.add("Wish you a great smile, laugh and successes for you on this day of Eid. Have a wonderful Eid day. Eid Mubarak");
        englist.add("So I was asleep right, when some big random guy in a red suit came and put me in a Big random bag .. OK, so who wanted me for Christmas??");
        englist.add("We shed many tears to get this land,now filled it with smiles and happiness.");
        englist.add("Can I have your picture, So Santa Claus knows exactly what to give me on this CHRISTMAS.");
        englist.add("Blue is song, Yellow is music, Green is dance, Red is beauty, White is love & Pink is for joy. I wish you all these on Holi. HAPPY HOLI");
        englist.add("It’s a fine line between standing behind a principle and hiding behind one.");
        englist.add("X means wrong… X means unknown… so why would you eX Christ out of His own birthday?");
        englist.add("We all have our own call of duty. Mine is to serve Christ.");
        englist.add("May the Joy, Cheer, Mirth and Merriment of this festival surround you forever. Happy Eid");
        englist.add("Eid is the holy festival to rejoice. Let everybody enjoy and enjoy yourself too.");
        englist.add("When moon of Eid arises it makes all of us so happy and excited. May all of your times be full of such an amusing excitement and happiness! Happy Eid Day");
        englist.add("Wish you a Happy Eid and may this festival bring abundant joy and happiness in your life!");
        englist.add("Please Santa, I’ve been good all year .. most of the time .. sometimes .. Ok, Don’t worry I’ll buy my own Christmas presents.");
        englist.add("Liberty, when it begins to take root, is a plant of rapid growth.");
        englist.add("If our country is worth dying for in time of war let us resolve that it is truly worth living for in time of peace.");
        englist.add("What I don’t like about office Christmas parties is looking for a job the next day.");
        englist.add("May this Christmas be so special that you never ever feel lonely again and be surrounded by loved ones!");
        englist.add("The best gifts in life will never be found under a Christmas tree! Those gifts are friends, family, kids and the one you love!!");
        englist.add("Let all your obstacles vanish in just a friction of second. Happy Eid");
        englist.add("It’s Christmas and 2011 is coming closer to an end! what’s the funniest thing you remember me doing this year?? Comment below.");
        englist.add("Freedom is nothing but a chance to be better.");
        englist.add("when it comes to Christmas, Cher Lloyd and me have a lot in common: we’re both bloody rubbish at wrapping.");
        englist.add("If wishes come in rainbow colors then I would send the brightest one to say Happy Holi.");
        englist.add("In the truest sense, freedom cannot be bestowed, it must be achieved.");
        englist.add("Dear Santa, Please send your credit card numbers. it’s only fair since you’re getting the credit for the gifts, that you should start paying for them also..");
        englist.add("May God bless you with the abundance of new friends, and all other blessings. Eid Mubarak");
        englist.add("May GOD send his love like sunshine in his warm and gentle ways to fill every corner of your heart and life with a lot of happiness like this Eid Day. Eid Mubarak!");
        englist.add("May this diwali bring you the utmost in peace and prosperity.");
        englist.add("The real magic of Christmas is how quickly money vanishes from my wallet.");
        englist.add("Wish you and your family a bombastic Diwali, Have loads of fun and loads of masti..");
        englist.add("Today I feel gifted and blessed that my Diwali is full of affection, love, celebrations as it was always. May God always keep his blessings on us like this.");
        englist.add("My well wishes, my good wishes for you are the just prayers for your long happy life from God on this noble event. Happy Eid Day");
        englist.add("Christmas is not about giving and receiving gifts. Its about the birth of Baby Jesus in the manger! Jesus is the reason for the season!");
        englist.add("May you be blessed with happiness and well being to last through the year. Happy Diwali..");
        englist.add("Have a Happy Eid Day! I hope you get lots of fun! Spend time with your loved ones..");
        englist.add("I am dreaming of a “White Christmas” Too bad it doesn’t snow here..");
        englist.add("We wish you and your beloved ones a very happy and blessed Eid.");
        englist.add("The difference between ordinary and extraordinary is that little extra.");
        englist.add("As you celebrate this holy occasion, you are wished the brightest moments that Diwali can bring, lots of love and laughter to fill your days with cheer and a New year that is sure to bring you, the best of everything.");
        englist.add("Sending you wishes for a happy year filled with health, prosperity, love and loads of fun!");
        englist.add("May the festival of lights brighten up you and your near and dear ones lives");
        englist.add("To my friends and family, near and far, I love you all and hope you have a Merry Christmas..");
        englist.add("Merry Christmas and a Happy New Year to everyone. Keep the Christ in Christmas, and share the love, peace and forgiveness");

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