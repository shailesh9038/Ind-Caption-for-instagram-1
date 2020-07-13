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

public class Crying extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Crying() {
        // Required empty public constructor
    }

    public static Crying newInstance(String param1, String param2) {
        Crying fragment = new Crying();
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

        englist.add("Tears are not a sign of weakness, but of courage. Hiding your emotions is self destructive and will never allow you to heal.");
        englist.add("The irony is a sadness that can not cry and smiled.");
        englist.add("There is no point in crying, the tears won't bring you back to me.");
        englist.add("Who loves you makes you cry, who hates you laugh.");
        englist.add("Once you embrace your value, talents and strengths, it neutralises when others think less of you.");
        englist.add("I am the one that said goodbye, it's over but I'm the one crying.");
        englist.add("The angel shouldn't weep, it was wrong. I tried to find him, to tell him everything was fine, but the water was so deep, it was pressing on me, and I couldn't breathe.");
        englist.add("Crying is all right in its way while it lasts. But you have to stop sooner or later, and then you still have to decide what to do.");
        englist.add("I didn't know why I was going to cry, but I knew that if anybody spoke to me or looked at me too closely the tears would fly out of my eyes and the sobs would fly out of the throat and I'd cry for a week.");
        englist.add("No guy is worth your tears and when you find one that is, he won't make you cry.");
        englist.add("I never guessed I could cry so hard my face hurt.");
        englist.add("If you've never eaten while crying you don t know what life tastes like.");
        englist.add("Don't cry over someone who wouldn't cry over you.");
        englist.add("Two barrels of tears do not heal a bruise.");
        englist.add("The most important thing for an actor is to know whether to laugh or cry. To cry I think of my s3x life. To laugh too.");
        englist.add("Just because my eyes don't tear doesn't mean my heart doesn't cry. And just because I come off strong, doesn't mean there's nothing wrong.");
        englist.add("You cannot cry and think, because each thought absorbs a tear.");
        englist.add("Since you can sing, friend, you know crying.");
        englist.add("Your tears come easy, when you're young, and beginning the world. Your tears come easy, when you're old, and leaving it. I burst out crying.");
        englist.add("The irony is a sadness that cannot cry and smiled.");
        englist.add("I love walking in the rain because no one can see me crying.");
        englist.add("Better than pleurechante weep.");
        englist.add("Don't cry because it's over, smile because it happened.");
        englist.add("Man cries, his tears dry up and run out. So, he becomes a devil, reduced to a monster.");
        englist.add("When a girl cries, few things are more worthless than a boy.");
        englist.add("Do not apologise for crying. Without this emotion, we are only robots.");
        englist.add("I wasn't crying about mothers, he said rather indignantly. I was crying because I can't get my shadow to stick on. Besides, I wasn't crying.");
        englist.add("Laugh now, cry later.");
        englist.add("What do you do when the only one who can make you stop crying is the one who is making you cry?");
        englist.add("When the heart weeps what he has lost, the spirit laughs at what he found.");
        englist.add("And now, my poor old woman, why are you crying so bitterly? It is autumn. The leaves are falling from the trees like burning tears- the wind howls. Why must you mimic them?");
        englist.add("You would think there's a natural limit to tears: only so much the body can give at one sitting before it runs dry.");
        englist.add("I press myself to laugh at everything, for fear of being obliged to weep.");
        englist.add("Never cry for anyone in your life, because those you cry for don't deserve your tears and those who are deserving will never let you cry.");
        englist.add("You know that a good, long session of weeping can often make you feel better, even if your circumstances have not changed one bit.");
        englist.add("When someone is crying, of course, the noble thing to do is to comfort them. But if someone is trying to hide their tears, it may also be noble to pretend you do not notice them.");
        englist.add("Weeping is not the same thing as crying. It takes your whole body to weep, and when it's over, you feel like you don't have any bones left to hold you up.");
        englist.add("A baby's cry is precisely as serious as it sounds.");
        englist.add("pen if you can not cry your old address book.");
        englist.add("I love crying in the rain. Because when I do, no one can hear the pain.");
        englist.add("You can not cry and think, because each thought absorbs a tear.");
        englist.add("If you fall in love, be ready for the tears.");
        englist.add("Keep clam, don't cry.");
        englist.add("God gave us crying so other folks could see when we needed help, and help us.");
        englist.add("My smile doesn't always mean *I'm happy *.... sometimes it means *I can manage*..... and sometimes it just means *I am tired of crying*");
        englist.add("Crying wasn't like riding a bike. Give it up, and you quickly forget how it's done.");
        englist.add("Too much happiness always overflowed into tears of sorrow.");
        englist.add("Crying is one of the highest devotional songs. One who knows crying, knows spiritual practice. If you can cry with a pure heart, nothing else compares to such a prayer. Crying includes all the principles of Yoga.");
        englist.add("Sadness dries the heart of which is no more tears to cry.");
        englist.add("Something came out from my heart into my throat and then into my eyes.");
        englist.add("If you choose to be sad then you will be sad but their times you don't know why you're sad. Tears start flowing from your eyes.");
        englist.add("I felt tears prick my eyes as I looked down at the model again, looking at that girl and boy on the curb. Forever in that place, together.");
        englist.add("I have been crying, she replied, simply, and it has done me good. It helps a woman you know, just as swearing helps a man.");
        englist.add("There are songs that can really make you sad and cry when you hear them. But it's actually not the song that makes you cry, it's the people behind the memories.");
        englist.add("The hardest part in life is trying to show the smile you know is fake and to hide the tears that won't stop.");
        englist.add("There you go let it all slide out. Unhappiness can't stick in a person's soul when it's slick with tears.");
        englist.add("Those who do not weep, do not see.");
        englist.add("Pen if you cannot cry your old address book.");
        englist.add("Sometimes people have to cry out all their tears, to make room for a heart full of smiles.");
        englist.add("When she cried, he would say, there is nothing wrong with crying. Your feelings tell you who are. They tell what is important. Don't ever be ashamed of them.");
        englist.add("Often it feels like I am breathing today only because a few years back I had no idea which nerve to cut.");
        englist.add("I wondered if emotions were like menstrual cycles, if you get enough women together. Give it time, and everyone was crying.");
        englist.add("It's weird how the happiest memories drive you to tears.");
        englist.add("Guys always think tears are a sign of weakness. They're a sign of frustration. She's only crying so she won't cut your throat in your sleep. So, make nice and be grateful.");
        englist.add("Sometimes crying or laughing are the only options left, and laughing feels better right now.");
        englist.add("Like crying wolf, if you keep looking for sympathy as a justification for your actions, you will someday be left standing alone when you really need help.");
        englist.add("Singing is also a way of crying.");
        englist.add("There is an ancient tribal proverb I once heard in India. It says that before we can see properly we must first shed our tears to clear the way.");
        englist.add("It is better when you feel cry. It is so good after the compassion!");
        englist.add("In the world of dogma, you become free the day you decide to go to hell.");
        englist.add("There's no crying in the rank book.");
        englist.add("Crying doesn't make me weak, it just makes me look so.");
        englist.add("Crying relieves pressure on soul. Toba Beta, Master of Stupidity.");
        englist.add("Tears never were worth the effort of crying them.");
        englist.add("More and more, the hardest part of crying is when I can't stop.");
        englist.add("To weep is to make less the depth of grief.");
        englist.add("The tears of the world are a constant quantity. For each one who begins to weep somewhere else another stops. The same is true of the laugh.");
        englist.add("I got out on the street and started crying the kind of hysterical tears made justifiable only by turning off one's cell phone, putting it to the ear, and pretending to be told of a death in the family.");
        englist.add("Life is too short, if we are more the cry!");
        englist.add("To hide feelings when you are near crying is the secret of dignity.");
        englist.add("I shed more tears than God could ever have required.");
        englist.add("To cry was to release all sorts of ugly little pressures and tensions. Like waking out of a long, dark dream to a sun-filled day.");
        englist.add("Sometimes, you have to smile to hide your fears and laugh to hide your tears");
        englist.add("I lie on the floor, washed by nothing and hanging on. I cry at night. I am afraid of hearing voices, or a voice. I have come to the edge, of the land. I could get pushed over.");
        englist.add("Consider anything, only don't cry.");
        englist.add("Theres no point in crying, the tears wont bring you back to me.");
        englist.add("I learn from my own daughter that you don't have to be awake to cry.");
        englist.add("Life is too short, if we are more the cry");
        englist.add("Listen to God with a broken heart. He is not only the doctor who mends it, but also the father who wipes away the tears.");
        englist.add("We need never be ashamed of our tears.");
        englist.add("If you fall in love... be ready for the tears!");
        englist.add("Try, try but don't cry.");
        englist.add("It is better when you feel cry. It is so good after the compassion.");
        englist.add("I am not crying because of you; you are not worth it. I am crying because my delusion of who you were shattered by the truth of who you are.");
        englist.add("Sometimes, you have to smile to hide your fears and laugh to hide your tears.");
        englist.add("Tears are not a sign of weakness, but of courage. Hiding your emotions is self-destructive and will never allow you to heal.");
        englist.add("Tears sprang from her eyes and she bit her lip to stop herself from howling at the bright pain.");
        englist.add("God's creatures who cried themselves to sleep stirred to cry again.");
        englist.add("The worst kind of pain is when you're smiling to stop the tears from falling.");
        englist.add("And tears came before he could stop them, boiling hot then instantly freezing on his face, and what was the point in wiping them off? Or pretending? He let them fall.");
        englist.add("Two turtle doves will show thee, where my cold ashes lie and sadly murmuring tell the, how in tears I did die.");
        englist.add("She looked away, trying not to cry. She hated crying, and in public she hated it more.");
        englist.add("There is no point in crying, the tears wont bring you back to me.");
        englist.add("I am the one that said Goodbye, It's over but I'm the one crying.");
        englist.add("If I could be anything, l would be ur tear, so l could be born in ur eye, live down ur cheek and die on ur lips.");
        englist.add("Everyone thinks that I m happy and fine but look a li'l closer, u will see tears in my eyes.");
        englist.add("I try to maintain a positive attitude at all times, because clients notice little things like that, and if you're frowning and crying all the time and saying why? They get worried.");
        englist.add("Life is like an onion; you peel it off one layer at a time, and sometimes you weep.");
        englist.add("It's a shame for the lion crying face fox.");
        englist.add("Crying in the rain. No one sees your tears and your pain gets washed away.");
        englist.add("He'd always known that shit rolled downhill, but he never knew tears did the same thing.");
        englist.add("No one's ever going to shag you if you cry all the time.");
        englist.add("Crying is right at hand in the smothering dark, closed inside someone else, when you see how everything you can ever accomplish will end up as trash.");
        englist.add("The worst kind of pain is when you're smiling to stop the tears from falling :)");
        englist.add("What was the point in crying when there was no one to comfort you? And what was worse, when you couldn't even comfort yourself?");
        englist.add("We end up going crazy, or dying, if you could not cry.");
        englist.add("Who loves you makes you cry, who hates you laugh?");
        englist.add("I want to weep, she thought. I want to be comforted. I'm so tired of being strong. I want to be foolish and frightened for once. Just for a small while, that's all a day, an hour.");
        englist.add("The death of a mother is the first sorrow we cry without it.");
        englist.add("I hate the moment when suddenly my anger turns into tears.");
        englist.add("I clench my teeth as tears come. I am fed up. I am fed up with tears and weakness. But there isn't much I can do to stop them.");

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