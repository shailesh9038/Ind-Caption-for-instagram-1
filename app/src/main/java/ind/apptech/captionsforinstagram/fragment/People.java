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

public class People extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public People() {
        // Required empty public constructor
    }

    public static People newInstance(String param1, String param2) {
        People fragment = new People();
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

        englist.add("A people without children would face a hopeless future; a country without trees is almost as helpless.");
        englist.add("Sometimes you have to accept that people's part in your story is over.");
        englist.add("We meet people for a specific reason. They're either a blessing or a lesson.");
        englist.add("Unity of the people can bring down any system.");
        englist.add("There are two types of people. Those that hate their life and do something about it and those that hate their life and don't do anything about it. Which type are you?");
        englist.add("There are two types of people, those who make an effort to reach their dreams and those who sit back and dream about their dreams.");
        englist.add("Life is so meaningful when spent with meaningful people.");
        englist.add("Even the most caring people can get tired of being taken for granted.");
        englist.add("The most successful people are those who were willing to do their own thoughts against the opinion of the world.");
        englist.add("There are only two possibilities why you're disappointed: wrong person or wrong expectation.");
        englist.add("I respect people that tell me the truth, no matter how hard it is.");
        englist.add("Stop telling people about their pains, they already know that. Tell them about their Strength and Hope, they may not know that.");
        englist.add("Try to manage your anger since people can't manage their stupidity.");
        englist.add("Some people will never change, and you just have to accept that.");
        englist.add("Life is like an elevator: on your way up, sometimes, you have to stop and let some people off.");
        englist.add("If you can see positive in everything, you will be able to live a much better life than other people.");
        englist.add("Usually,the people with the best advice are the one's with the most problems.");
        englist.add("If people treated you like an option, leave them like a choice.");
        englist.add("You can never change people, they are who they are, accept that. But you can always change how you feel about them.");
        englist.add("Don't ever be controlled by these three things in life; People, money and your past experiences.");
        englist.add("Never let anyone be your priority if you are only their option.");
        englist.add("When people are protecting something truly special to them, they truly can become as strong as they can be.");
        englist.add("I admire people who choose to shine even after all the storms they have been through.");
        englist.add("People always miss you more when they see how much happier you are without them.");
        englist.add("The world is full of nice people. If you can't find one, be one.");
        englist.add("You attract people by qualities you display, you keep them by the qualities you possess.");
        englist.add("Many people have ideas on how others should change, few people have idea on how they should change.");
        englist.add("Sometimes removing some people out of your life makes space for better people.");
        englist.add("Sometimes the people who act the happiest are the ones going through the most.");
        englist.add("People show up in our life for two reasons; whether for a lesson or a blessing.");
        englist.add("There is little difference in people, but that little difference makes a big difference. The little difference is attitude. The big difference is whether it is positive or negative.");
        englist.add("It is the people who touch our lives for the shortest time that are the hardest to forget.");
        englist.add("Some people are so important in our life, not because we enjoy their company, but because we feel so lonely in their absence.");
        englist.add("Don't chase people. Be you, do your own thing and work hard. The right people who belong in your life will come to you, and stay.");
        englist.add("Sometimes in life the person who tries to make everyone happy turns out to be the lonely one.");
        englist.add("A smile is a symbol of acceptance and approval, which is something most of the people in the world desperately need.");
        englist.add("Succesful people never worry about what others are doing");
        englist.add("NEVER trust anyone. Learn about them when you are around them, then learn to trust. You will regret it if you don't.");
        englist.add("It is our duty to recognize the importance of every person.");
        englist.add("If we could see others the way they see themselves it would change everything about how we relate to each other.");
        englist.add("From all the toys in the world, people choose feelings to play with");
        englist.add("People are not naturally either friends or enemies: friendship and enmity arise from circumstances.");
        englist.add("You spend your whole life trying to fit in, and when you finally do, you realize that you are surrounded by the very people who held you down.");
        englist.add("The strongest people are not those who show strength in front of us, but those who win battles we know nothing about.");
        englist.add("Respect people who find time for you, but Love people who are always there for you.");
        englist.add("Be with people who always show you your strength and hopes and not waste time with people who constantly remind you of your failures and mistakes.");
        englist.add("It's crazy how your future is somebody else's past, and that's just cause life moves too fast.");
        englist.add("In these days, people know the price of everything, and the value of nothing.");
        englist.add("Sometimes the people we should fear the most, should be the ones closest to us.");
        englist.add("Don't be upset with people and situations in your life, because both are powerless without your reaction.");
        englist.add("People who want to get everything all at once usually get nothing life.");
        englist.add("Create space in your life for people who deserve it.");
        englist.add("Haters try to expose what's wrong with you, because they're are jealous of everything that's right about you.");
        englist.add("Sometimes people don't want to hear the truth because they don't want their illusions destroyed.");
        englist.add("A person usually has two reasons for doing a thing; one that sounds good and a real one.");
        englist.add("You can't move forward whilst carrying the burden of your previous life with you. Let go of the past and move on to the future.");
        englist.add("Never treat others in the way you don't like to be treated yourself.");
        englist.add("How people treat other people is a direct reflection of how they feel about themselves.");
        englist.add("The biggest mistake people make in life is worrying what everyone else thinks.");
        englist.add("You cannot change the people around you, but you can change the people you choose to be around.");
        englist.add("One of the best investments you can make in yourself is to take a genuine interest in other people.");
        englist.add("People who come from a background of lying are suspicious of lying in others.");
        englist.add("To be around those who enhance your life is called success. To enhance the lives of those around you is called significance.");
        englist.add("There are people who Dream and there are people who Scream. There are people who Cry and there are people who Fly. The good news is that this is a CHOICE!");
        englist.add("It's amazing the lies that people will believe about me when the truth is actually much more interesting");
        englist.add("Successful people absolutely believe that they have the ability to succeed.");
        englist.add("If you want to work with people, then you have to know how to administrate, that is to organize them and lead them.");
        englist.add("Keep people in your life who truly love you, motivate you, and make you happy. If you know people who do none of these things, let them go.");
        englist.add("This is how it goes: I will respect those who respect me, and forget those who forget me. Simple as that.");
        englist.add("Look around! People have faces with no smiles, as if they are carrying heavy baggage. Stop them! Give them a SMILE and see them Light up.");
        englist.add("People who are not inclined to take great challenges just settle for something less.");
        englist.add("The happiest people in life are the givers, not the getters.");
        englist.add("People dont notice the things you do for them until you stop doing them.");
        englist.add("There are some people in life that make you laugh a little louder, smile a little bigger and live just a little bit better.");
        englist.add("There will always be people in life who treat you wrong. be sure you thank them for making you strong.");
        englist.add("Socializing is creating a virtual company with people in the network as employees.");
        englist.add("The best way to find out if you can trust someone is to trust them once.");
        englist.add("There comes a point in your life when you realize who really matters, who never did, and who always will.");
        englist.add("Stop judging how far people still have to go. Start celebrating how far they've come.");
        englist.add("There are certain people who are not meant to fit in your life, no matter how much you want them to be.");
        englist.add("Average people have wishes and hopes. Confident people have goals and plans.");
        englist.add("Some people are like pictures, if you scale them up too much, they will lose their quality.");
        englist.add("The most happy people are those who don't expect anything from anyone. Because expectation always hurts.");
        englist.add("The world could be a lot better if people correct their own mistakes rather than criticizing others.");
        englist.add("The people truly worthy to be in your life are the ones that help you through hard times, and laugh with you after the hard times pass.");
        englist.add("Some people are dead but their character kept them alive, while others are alive but their character killed them.");
        englist.add("Be that kind of person who's presence people would like to celebrate not that who has to be tolerated.");
        englist.add("In life you'll meet two types of people: The ones who inspire you and the ones who bring you down. But in the end, you'll be thanking both.");
        englist.add("When the wrong people leave your life, the right things start.");
        englist.add("Sometimes we just need someone who is like a pencil with an eraser. To write happiness and erase all sadness.");
        englist.add("You can either trust people until they fail you, or distrust people until they're proven trustworthy");
        englist.add("People who judge, don't matter. People who matter, don't judge.");
        englist.add("When we no longer hold people responsible for their choices, civility and common sense will be diminished.");
        englist.add("I never hate on the people from my past because they're the same people who evolve me to the person that I am now.");
        englist.add("Some people come into your life and you just know you will never be able to replace them if they left.");
        englist.add("It's so ironic that it took so much time for people to realize your real value. They come knocking right when you have finally closed your door.");
        englist.add("There isn't a person anywhere that isn't capable of doing more than he think he can.");
        englist.add("Everyone wants to be respected, but only a few people show other people the respect that they desire.");
        englist.add("People who want to get everything all at once, usually end up getting nothing in life.");
        englist.add("Surround yourself with strong, positive, motivated and supportive people!");
        englist.add("People might not get all they work for in this world, but they must certainly work for all they get.");
        englist.add("Some people make themselves miserable and everybody else miserable when they can rather make themselves happy and everybody else happy.");
        englist.add("Never blame anyone in your life, The good people give you happiness. The bad people give you experience. The worst people give you a lesson, The best people give you memories.");
        englist.add("The only measure of your success is in the number of people you have help.");
        englist.add("Good leadership consists of showing average people how to do the work of superior people.");
        englist.add("In life learn to show appreciation to those who do good by you and return the favor as well.");
        englist.add("Sometimes people don't realize what they have, but I'm sure they will realize what they have lost");
        englist.add("Distance sometimes let you know who's worth keeping and who's worth letting go.");
        englist.add("Surround yourself with people who make you a better person and not a bitter person.");
        englist.add("People who are truly worthy would never see any good in making others feel unworthy of themselves.");
        englist.add("A leader's most valuable asset is strength of his people.");
        englist.add("Forget those people who forget you.");
        englist.add("Trusting someone you barely know is like recommending something you haven't tried.");
        englist.add("You never have to chase people down and beg for their loyalty and respect. It's either they're with you or they're not.");
        englist.add("You can't change how people feel about you so don't try. Just live your life and be happy.");
        englist.add("All beautiful persons are not good, but good persons are always beautiful.");
        englist.add("The unhappiest people in this world, are those who care the most about what other people think");
        englist.add("We learn something from everyone who passes through our lives.. Some lessons are painful, some are painless.. but, all are priceless.");
        englist.add("Don't wait for people to be kind, show them how.");
        englist.add("Everything is getting more expensive. Except for people, they are getting cheaper!");
        englist.add("The reason why most people don't succeed in their lives is that they consider the ladder of success as an escalator.");
        englist.add("People all over the planet are searching for the meaning, purpose and fulfillment of life.");
        englist.add("Anyone can see your tears, but only few special people can understand what it really means.");
        englist.add("The loneliest people are the kindest. The saddest people smile the brightest. The most hurt people are the wisest and the people who doesn't expect from others are the happiest.");
        englist.add("People wait all weak for Friday, all year for summer, all life for happiness.");
        englist.add("You appreciate some people most when they deprive you of the pleasure of their company.");
        englist.add("Characterize people by their actions, and you'll never be fooled by their words.");
        englist.add("You must have respect for those who tell you the truth about you, no matter how hard it is.");
        englist.add("Sometimes, on our way through the world, we meet someone who touches our heart in a way others don't.");
        englist.add("An idea isn't responsible for the people who believe it.");
        englist.add("Great people discuss eras, average people discuss trends, and small people discuss labels.");
        englist.add("Don't try to change people. It's a battle you'll be sure to lose. They'll change with you through experience, but don't change them for yourself.");
        englist.add("People will always leave your life and it can be so painful, but those who are meant to stay will always be there.");
        englist.add("The best way to understand a person is to look at the company they keep.");
        englist.add("Keep away from people who try to belittle your dreams. Small people always do that, but the really great ones make you feel that you, too, can become great.");
        englist.add("Don't let yourself be controlled by three things: people, money, or past experiences.");
        englist.add("Every person has a bad habit naturally. But it's up to the person to decide whether to keep it or get rid of it!");
        englist.add("You cannot expect to stay on the right path if you are walking with the wrong people.");
        englist.add("People may not tell you how they feel about you, but they always show you. Pay attention.");
        englist.add("The most important people in your LIFE, are the ones that value you in their LIVES.");
        englist.add("When they discover the center of the universe, a lot of people are going to be very disappointed that they are not it.");
        englist.add("Sometimes the person who made you stronger, is also your greatest weakness.");
        englist.add("People always say that time changes things, but the truth is we have to change them ourselves.");
        englist.add("Never trust people from what they say, trust them from what they do.");
        englist.add("Weak people see flaws in others where strong people see potential. What they really see is a part of themselves.");
        englist.add("Most people grow old, but not everybody grows up.");
        englist.add("Life is about moving forward, accepting changes in time and people, looking forward to what makes you stronger, better and more complete.");
        englist.add("Moving on is made a lot easier when you accept that some people are seasonal.");
        englist.add("People will try to confuse your meekness for weakness, but no matter what never let anyone draw you out of your character.");
        englist.add("People who hurt you teach you the greatest lessons of life!");
        englist.add("Successful people build each other.They motivate, inspire and push each other. Unsuccessful people just hate, blame and complain.");
        englist.add("We don't meet people by accident. They are meant to cross our path for a reason.");
        englist.add("Love the people who treat you right. Pray for those who don't. Life is too short to be anything but happy!");
        englist.add("You will always have people on your side if you just let them know where you stand.");
        englist.add("Don't worry to much about people who don't worry about you at all!");
        englist.add("Stop trying to get the attention of the people who dont care about you and try keeping the attention of the people who do.");
        englist.add("From this point on, I'm going to treat people exactly how they treat me. Some should be glad, others should be scared.");
        englist.add("Don't try to understand people, but try to understand the humanity");
        englist.add("Stop worrying about people who ain't worried about you.");
        englist.add("Be careful when you choose the people you can trust. Some of them are lions in an sheep's skin.");
        englist.add("There are two reason why we don't trust people. First, we don't know them. Second, because we know them.");
        englist.add("People only have power over you if you give them power, no one can have power over you unless you submit to their will.");
        englist.add("No matter what you do, people will always try to build you up or break you down and all depends on your permission.");
        englist.add("Characterize people by their actions and you will never be fooled by their words.");
        englist.add("Try not to take things personally, what people often say is a reflection of them and not you.");
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