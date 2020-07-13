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

public class Home extends Fragment {

    RecyclerView rajputlist;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Home() {
        // Required empty public constructor
    }

    public static Home newInstance(String param1, String param2) {
        Home fragment = new Home();
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

        englist.add("Where we love is home - home that our feet may leave, but not our hearts. - Oliver Wendell Holmes");
        englist.add("Home is where the heart can laugh without shyness. Home is where the heart's tears can dry at their own pace. - Vernon Baker");
        englist.add("There is no place like home.");
        englist.add("The greatest thing you'll ever learn, is just to love and be loved in return.");
        englist.add("The best journey takes you home.");
        englist.add("Family is a gift that lasts forever.");
        englist.add("Every morning I still wake up and the first thing I want to do is to see your face.");
        englist.add("One should never be the oldest thing in one's house.");
        englist.add("This is my idea of heaven, going home and watching the news.");
        englist.add("Home is a name, a word, it is a strong one; stronger than magician ever spoke, or spirit ever answered to, in the strongest conjuration. - Charles Dickens");
        englist.add("The only rock I know that stays steady, the only institution I know that works, is the family.");
        englist.add("Everything has a place, and everything in its place.");
        englist.add("I long, as does every human being, to be at home wherever I find myself. - Maya Angelou");
        englist.add("Home is where one starts from. - T. S. Eliot");
        englist.add("I wish I could go home sometimes, but it takes so long and costs so much!");
        englist.add("Going home must be like going to render an account.");
        englist.add("Peace, like charity, begins at home.");
        englist.add("Going home and spending time with your family and your real friends keeps you grounded.");
        englist.add("The light is what guides you home, the warmth is what keeps you there. - Ellie Rodriguez");
        englist.add("Bless this home and all who enter.");
        englist.add("God is at home, it's we who have gone out for a walk. - Meister Eckhart");
        englist.add("Home, the spot of earth supremely best, A dearer, sweeter spot than all the rest. - Robert Montgomery");
        englist.add("Many a man who pays rent all his life owns his own home; and many a family has successfully saved for a home only to find itself at last with nothing but a house.");
        englist.add("A good laugh is sunshine in a house.");
        englist.add("Hold on we're going home.");
        englist.add("Life is too short to be anything but happy.");
        englist.add("Home life is no more natural to us than a cage is natural to a cockatoo. - George Bernard Shaw");
        englist.add("It is the old, the new, the hand-me-down, the collected, the worn but loved things in your home that make it your own.");
        englist.add("The prospect of going home is very appealing.");
        englist.add("With you I'm home.");
        englist.add("I hate being tired in school and thinking 'I'm going to take a nap as soon as I get home' and then when I get home I'm not tired anymore.");
        englist.add("If you can dream it you can make it.");
        englist.add("In our home let love abide and bless all those who step inside.");
        englist.add("It takes hands to build a house, but only hearts can build a home.");
        englist.add("Love begins at home, and it is not how much we do.. but how much love we put in that action. - Mother Teresa");
        englist.add("Home is where the heart is. - Pliny the Elder");
        englist.add("May love be the heart of this home.");
        englist.add("You can never go home again, but the truth is you can never leave home, so it's all right. - Maya Angelou");
        englist.add("There is nothing like staying at home for real comfort. - Jane Austen");
        englist.add("There's nothing half so pleasant as going home again.");
        englist.add("May I'm not at home but I badly missing my sweet home.");
        englist.add("Home is where I want to back at-once, cause I can't stay missing my home!");
        englist.add("The strength of a nation derives from the integrity of the home. - Confucius");
        englist.add("Fill a house with love and it becomes a home.");
        englist.add("I wouldn't change one second of our life together.");
        englist.add("Life is painful here on earth, but just remember: Far beyond the Sun U have a home, a Home Sweet Home, where there will be eternal happiness.");
        englist.add("What I love most about my home is who I share with.");
        englist.add("I constantly ensure that you are warm and secure in your own home.");
        englist.add("If someone ask me if you miss home? I would say 'I miss home!'");
        englist.add("The love of family and the admiration of friends is much more important than wealth and privilege.");
        englist.add("AT HOME- Me: 'I want to go out, I want friends.' OUT SIDE- 'I want to go home, I hate people.'");
        englist.add("There is always a reason to smile.");
        englist.add("Just sitting here on the corner of awesome and bomb dignity.");
        englist.add("He makes his home where the living is best.");
        englist.add("I think our love can do anything we want it to.");
        englist.add("Anyone moved away from home and miss it.. I surely do..");
        englist.add("The magic thing about home is that it feels good to leave and it feels even better to come back.");
        englist.add("A comfortable house is a great source of happiness. It ranks immediately after health and a good conscience.");
        englist.add("Live every moment, laugh everyday, love beyond words.");
        englist.add("Home is not where you live but where they understand you. - Christian Morgenstern");
        englist.add("The thrill of going home has never changed.");
        englist.add("The ache for home lives in all of us, the safe place where we can go as we are and not be questioned. - Maya Angelou");
        englist.add("Home isn't a place. It's you.");
        englist.add("Be grateful for the home you have, knowing that at this moment, all you have is all you need. - Sarah Ban Breathnach");
        englist.add("Where thou art - that - is Home. - Emily Dickinson");
        englist.add("Life is a dream walking death is a going home.");
        englist.add("True luck consists not in holding the best of the cards at the table; luckiest is he who knows just when to rise and go home.");
        englist.add("I wanna back home.. cause I feel so empty and missing so much my family at home!");
        englist.add("Be grateful for the home you have, knowing that at this moment, all you have is all you need.");
        englist.add("Laugh our loud. Follow your heart. Enjoy the little things.");
        englist.add("Going home to my family afterward makes the work richer, easier and more fun.");
        englist.add("Missing home is such kind of feelings which cause high rate of homesickness.");
        englist.add("Love begins by taking care of the closest ones - the ones at home. - Mother Teresa");
        englist.add("I miss my home more than the sun misses the sky at night.");
        englist.add("Strength of character may be learned at work, but beauty of character is learned at home. - Henry Drummond");
        englist.add("A house is no home unless it contain food and fire for the mind as well as for the body. - Margaret Fuller");
        englist.add("I'm missing home so much right now. I want my parents. I want my friends. I want my bed.");
        englist.add("Home is where our story begins.");
        englist.add("A recipe for love: A spoon full of smiles, A jar of joy, A cup of kisses and a handful of big hugs!");
        englist.add("Live with what you love.");
        englist.add("Enter with a happy heart.");
        englist.add("If Home is where the heart is then may your Home be blessed.");
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