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

public class Technology extends Fragment {

    RecyclerView rajputlist;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Technology() {
        // Required empty public constructor
    }

    public static Technology newInstance(String param1, String param2) {
        Technology fragment = new Technology();
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

        englist.add("If I went binary, you would be the '1' for me.");
        englist.add("I won't be impressed with technology until I can download food.");
        englist.add("Better to be a geek than an idiot.");
        englist.add("A computer once beat me at chess, but it was no match for me at kick boxing.");
        englist.add("I heard you took an IQ test and they said your results were negative.");
        englist.add("You were born an original. Don't die a copy.");
        englist.add("I'm pretty sure my prayers go directly to God's spam folder.");
        englist.add("I dropped my laptop off the boat. It's a Dell, rolling in the deep.");
        englist.add("That moment when even Caps Lock can't express your anger.");
        englist.add("I took IQ test.. results were negative.");
        englist.add("If God is a computer programmer then there is no confusion Devil is a hacker.");
        englist.add("Even your smallest mistakes are stored in long-term memory for later retrieval.");
        englist.add("Programming is an art, be the artist.");
        englist.add("Intelligence is like underwear.. It's important that you have it but there's no need to show it off.");
        englist.add("The only problem with troubleshooting is that sometimes trouble shoots back.");
        englist.add("God made everything that has life, rest everything is made in China.");
        englist.add("Do it today, It might be illegal tomorrow.");
        englist.add("Admit it. None of us know how to play Minesweeper. We just click randoms boxes.");
        englist.add("If at first you don't succeed, call it version 1.0");
        englist.add("Relationships are a lot like Algebra. Have you ever looked at your X and wondered Y?");
        englist.add("Failure comes only with Windows bundle.");
        englist.add("3 mistakes of everyone' s life - Facebook, Twitter and Whatsapp.");
        englist.add("Yo moma is like HTML: Tiny head, huge body.");
        englist.add("Local minded people will never understand global minded goals, i mean just see yourself in the mirror.");
        englist.add("The more I C, the less I see.");
        englist.add("No matter what you do on the computer you always end up on Twitter, Youtube or Facebook.");
        englist.add("When internet stops working for 5 seconds, so does my heart.");
        englist.add("80% of boys have girlfriends. Rest 20% are having brain.");
        englist.add("The awkward momment when im just sitting here and reading those boring statuses");
        englist.add("Why cant every charger for everything that exists just be the same shape and size");
        englist.add("Words begin with A,B,C. Numbers begin with 1,2,3. Music begins with do, re, mi. And friendship begins with You and Me!");
        englist.add("We don't care.. We don't have to. We're the phone company.");
        englist.add("Travel to life is like css to html.");
        englist.add("Canc3r cur3s smo-king!!");
        englist.add("Life has no Ctrl+Z.");
        englist.add("do u ever feel like screaming 'f*ck you' to some people but you can't so you just keep the anger inside and complain on your twitter?");
        englist.add("That awkward moment when you spell a word so wrong that spellcheck has no suggestions.");
        englist.add("I don't have a bad handwriting, I have my own font.");
        englist.add("Failure is not an option - it comes bundled with Windows.");
        englist.add("Windows 8 to 10: It's like upgrading from Bill Clinton to George W. Bush.");
        englist.add("Has anyone else noticed that Blue-tooth headsets make it harder to spot the crazy people?");
        englist.add("GETTING A TEXT IN THE MORNING and reading it with one eye open. (-.~)");
        englist.add("I remember my first day on twitter.. I was like: What the f*ck is this shit?");
        englist.add("If Apple made a car, would it have Windows?");
        englist.add("----------error 404 person not found----------");
        englist.add("They have a lot of data, but are still clueless.");
        englist.add("Programming is like s3x, one mistake and you have to support it for the rest of your life.");
        englist.add("If you're texting two people at the same time, you are biTextual.");
        englist.add("A Boss is like a diaper.. Always on your @ss, and usually full of Shit.");
        englist.add("Don't drink and park - accidents cause people.");
        englist.add("Is anyone going to put anything funny on here?????");
        englist.add("I'm not anti-social, I'm just not user friendly.");
        englist.add("Marry the girl, who looks pretty in her Adhaar card.");
        englist.add("You still use Internet Explorer? You must like it nice and slow.");
        englist.add("We are living in an era where capturing moments using our phones is more important than actually living these moments with whoever is beside us.");
        englist.add("Our society will never go entirely paperless. There's always the bathroom.");
        englist.add("When Life Gives You Questions, Google has Answers.");
        englist.add("Unidentified Person Detected.");
        englist.add("A good girlfriend saves atleast 20 GB of space on your computers.");
        englist.add("Hardware: The parts of a computer system that can be kicked.");
        englist.add("times and technology have changed so much. i remember my first laptop.. an etch-a-sketch.");
        englist.add("why is there a tab called notes? its not like we can pass them back and forth in school!");
        englist.add("My mom actually believes I'm dating a girl named Siri.");
        englist.add("Artificial Intelligence usually beats natural stupidity.");
        englist.add("Knowing when your addicted to technology is when your on your laptop and cell phone together and checking them both.");
        englist.add("Travel to life is like css to html .");
        englist.add("I'm not online, it's just an optical illusion.");
        englist.add("loves it how the solution to most technical problems is to give the device a good whack.");
        englist.add("Phones are better than girlfriends, At least we can switch off.");
        englist.add("Hates that feeling when you just sent a text message and you instantly have to check to make sure you didn't send it to the wrong person! Lol");
        englist.add("Somehow I survived a childhood without DVDs, CDs, MP3s, Blu-rays, home video games, home computers, Tivos, Satellite TV, cell phones, GPS, and more. Wow.");
        englist.add("Do not be afraid to step on people. Mario made a career from it.");
        englist.add("Those who can't write programs, write help files.");
        englist.add("11:10...One More Minute!!! *Gets Distracted* 11:12... SERIOUSLY!?!");
        englist.add("You tweet a lot... Bitch, it's TWITTER.");
        englist.add("I'm thankful my childhood was filled with imagination and bruises from playing outside, instead of apps and how many damn likes u get on a pic.");
        englist.add("Error 404: No girlfriend found.");
        englist.add("User Error. Replace User. Press Any Key.");
        englist.add("If opportunity doesn't knock, build a door.");
        englist.add("Windows isn't a virus, viruses do something.");
        englist.add("When a girl says she'll be ready in 5 more minutes.. it's the same as when a guy says the game has 5 minutes left.");
        englist.add("You're beautiful until your Photoshop 30 day trial has gone.");
        englist.add("I'm not lazy, I'm on energy saving mode.");
        englist.add("You buy a Ferrari when you want to be somebody, You buy a Lamborgini when you are somebody.");
        englist.add("iPod - small musical device that allows you to ignore everyone while noticing everything.");
        englist.add("There are 10 types of people in the world: those who understand binary & those who don't.");
        englist.add("Before software can be reusable it first has to be usable.");
        englist.add("Everyone has their own SET of problems, don't try to make a VENN DIAGRAM out of it.");
        englist.add("If I went binary, you would be the 1 for me.");
        englist.add("Unfriending someone on FB is just like hanging up on someone on a cell phone. They're still bitching and whining, and they don't even know you're GONE! Love it.");
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