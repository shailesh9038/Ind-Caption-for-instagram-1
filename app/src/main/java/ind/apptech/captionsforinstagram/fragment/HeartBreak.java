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

public class HeartBreak extends Fragment {

    RecyclerView rajputlist;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public HeartBreak() {
        // Required empty public constructor
    }

    public static HeartBreak newInstance(String param1, String param2) {
        HeartBreak fragment = new HeartBreak();
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

        englist.add("Time will make you forget me but time will make me love you more than before.");
        englist.add("Why you never loved me the way I do :-(");
        englist.add("It hurts to breathe because every breath I take proves I can't live without you.");
        englist.add("Dont end it in away that you dont like to see each other face");
        englist.add("A broken heart is like broken ribs. You can't see the damage, but every breath hurts.");
        englist.add("He said he'd love me forever. Forever ended quick .");
        englist.add("Before lying to one who trusts you remember one of the difficult things to do is to build trust after it has been broken.");
        englist.add("Some people will always stay in your heart, even if you're gone from theirs");
        englist.add("Some people are so lucky that even after hurting, They get so much love & Some are so unlucky that even after loving so much, They always get hurt !!!");
        englist.add("You can close your eyes to the things you do not want to see, but you cannot close your heart to the things you do not want to feel.");
        englist.add("Its Still Hurts To See That You're Doing Completely Okay Without Me :(");
        englist.add("One Of The Hardest Things In Life Is Having The Words In Your Heart That You Can Not Speak :/ :/");
        englist.add("I compromised everything for my love, But at d end my love compromised me for everything.");
        englist.add("What hurts more than losing you is knowing you're not fighting to keep me.");
        englist.add("Your mind may be sad because you're not with him, but your heart is happy just knowing him.");
        englist.add("You said i love you and my heart skipped a beat... then i realized you weren't talking to me");
        englist.add("Sometimes I wish I had never met you because then I could go to sleep at night not knowing there was someone like you out there.");
        englist.add("My heart was taken by you, broken by you, and now it is in pieces because of you.");
        englist.add("Why waste your tears on someone who makes you cry?");
        englist.add("If you could choose between life and death, you would almost rather die, love is fun but hurts so much the price you pay is high. And so I say don't fall in love...");
        englist.add("Like being in love there must be a corresponding painful side like losing in love, it's just a fact of life.");
        englist.add("The truth of the matter is, I still have feelings for you. And no matter how many times I tell myself that I'm better off with out you, a part of me just won't let go.");
        englist.add("Even If I Already Knew You Were Gonna Break My Heart, I Still Wouldn't Change The Fact That I Fell In Love With You.");
        englist.add("What do you do when the only person who can stop your tears is the one making you cry.");
        englist.add("I tried to forget you, but the harder I tried, the more I thought about you.");
        englist.add("I'm not going to feel sorry for myself anymore. If you were stupid enough to walk away, I'll be smart enough to let you go.");
        englist.add("Love is like falling down... in the end you're left hurt, scarred, and with a memory of it forever.");
        englist.add("You took everything and just left me here unraveling.");
        englist.add("I know you'll be better without me, but I'm having a hard time convincing myself I'll be better without you.");
        englist.add("It hurts to love someone and not be loved in return, but what is more painful is to love someone and never find the courage to let that person know how you feel.");
        englist.add("Make me stay. Say something sweet and tender and untrue and make me stay.");
        englist.add("I was only a time-pass in your life..");
        englist.add("Every time I see him all cool, calm and collected, I lose my breath, my heart starts pounding, and I am painfully aware that I am not over him and he is over me.");
        englist.add("Some Day You'll Love Me But I Won't Love You");
        englist.add("I don't understand why destiny allowed some people to meet... when there's no way for them to be together... :'(");
        englist.add("Breaking up is not a stupid thing, instead it makes you a better person and realize your mistakes.");
        englist.add("Every few nights or so you pop into my dreams, I just can't get rid of you like you got rid of me.");
        englist.add("Some Day You'll Cry For Me Like I Cried For You, Some Day You'll Miss Me Like I Missed You, Some Day You'll Need Me Like I Needed You.");
        englist.add("To fall in love is so easy. Staying in love is a challenge. Letting go is the hardest part. And moving on is god damn suicide.");
        englist.add("I don't know why they call it heartbreak. It feels like other part of my body is broken too.");
        englist.add("But someday u will truly realize that the time passed wid me was the most beautiful time ever...");
        englist.add("You really know you love someone when all you want is for them to be happy, even if that means that you are not a part of it.");
        englist.add("If you love me as much as you say you do then you'll leave.");
        englist.add("A BROKEN HEART is knowing that no matter what you do or say to yourself, you can't fool your heart into believing that you will in fact Be Alright.");
        englist.add("To let go of someone doesn't mean you have to stop loving, it only means that you allow that person to find his own happiness without expecting him to come back.");
        englist.add("Now I believe it when people say love is blind... 'cause I must have been blind to love a person like you.");
        englist.add("Perhaps I saw what I wanted to see in him and made him to be more than he was.");
        englist.add("Erasing someone from your mind could be easy, but, getting them out of your heart is another damn story.");
        englist.add("Sometimes,you gotta listen to your brain,just to save your HEART...");
        englist.add("Just because my eyes don't tear doesn't mean my heart doesn't cry. And just because I come off strong, doesn't mean there's nothing wrong..");
        englist.add("No Guy Is Worth Your Tears & When You Find The One.. He Would Never Make You Cry.");
        englist.add("Hearts will never be practical until they are made unbreakable.");
        englist.add("I think its time I let you go... and that is hard to do because part of me will be in love with you for the rest of my life.");
        englist.add("You Can Ignore Me As Long As You Want, But.. You Can Never Change The Memories I Brought To Your Life...");
        englist.add("Smile and no one will see how broken you are inside.");
        englist.add("Sometimes breakups aren't meant for makeups, sometimes they are meant for wake-ups.");
        englist.add("The saddest part isn't that with each passing day I feel like I need you more, but it's the fact that you don't need me at all...");
        englist.add("I'm holding on to something that used to be there hoping it will come back, knowing it won't.");
        englist.add("I wish I could go back to the day I met you...and walk the hell away.");
        englist.add("The part that hurts me the most, is knowing that I once had you and then lost you");
        englist.add("Wants you to know that every time I take a breath, every time my heart beats, I think of you. I am helplessly in love with you...");
        englist.add("Everybody can see a LAUGHING FACE..., but no body can see a BROKEN HEART");
        englist.add("The more you show your feelings, the more people can find ways to hurt you..!!");
        englist.add("Stop trying to change yourself for a relationship that's not meant to be.");
        englist.add("Why am I afraid to lose you when you're not even mine");
        englist.add("Don't say we're not right for each other, the way I see it, we're not meant for anyone else.");
        englist.add("The only thing you gave before leaving me is endless pain and ever lasting tears.");
        englist.add("It's better to be lonely than to make silent sacrifices 4 those who r never going to notice your feelings.");
        englist.add("All I'm asking for is one night together. Just you and me. All alone. And if you can honestly say you don't feel anything for me after that night, I will finally let you go.");
        englist.add("I love crying in the rain because when i do, no one can hear the pain.");
        englist.add("When you love someone more then they deserve, you will always end up with more pain than you deserve :( :(");
        englist.add("Should I hate you because you hurt me? Or should I love you because you made me feel special?");
        englist.add("It's only when you are broken do you know what you are made of...");
        englist.add("I just want someone to come up to me and kiss me and tell me that they're in love with me. I don't just want it though. I need it. I'm desperate for it.");
        englist.add("I'd like to think I'll be happy again, but I really need to just stop and cry now, and sometimes I wish I could just scream at you, and show you what you do to me.");
        englist.add("Is that my ex ? No, that's the biggest mistake of my life.");
        englist.add("We both said I LOVE YOU to each other but the difference was, I didn't lie..");
        englist.add("In my mind he isn't worth anything, but in my heart he is worth everything");
        englist.add("Sometimes I may hate you, but I'll always love you.");
        englist.add("How do you heal a broken heart? I have no idea where to start because everything I do reminds me of you.");
        englist.add("LOVE is like HEAVEN... But it hurts like HELL....");
        englist.add("A Heartbreak Is A Blessing From God. It's Just His Way Of Letting You Realize He Saved You From The Wrong One..");
        englist.add("You treat me like shit for no reason, yet I'm still in love with you. Stop breaking my heart. I just want to love you.");
        englist.add("Here's my heart, I'll let you break it.");
        englist.add("When u love someone, even though they hurt u nd break your heart, you still love them with all the little pieces!!");
        englist.add("Some people accidentally walk on my feet and apologize, while others walk all over my heart and don't even realize.");
        englist.add("It's hard to forget someone who gave you so much to remember.");
        englist.add("I know you won't come back but my heart will take life long time to accept this.");
        englist.add("If you fall in love... be ready for the tears..!!");
        englist.add("It seems to me that the harder I try the harder I fall.");
        englist.add("I hate being broken. I hate that I cannot go back.");
        englist.add("When you are in love and you get hurt, it's like a cut it will heal, but there will always be a scar.");
        englist.add("If one day you realize I haven't talked to you in a while, its not that I dont care, its because you pushed me away and left me there.");
        englist.add("I'm sorry that I'm not the one you wanted that I made your life ****ed up its not telling you how I feel that scares me. Its what you'll say back that does.");
        englist.add("Time doesn't really Heal the heart. It just makes the heart forget all the pain.");
        englist.add("You won't let anyone hurt her. But you'll hurt her worse than anyone else.");
        englist.add("The hardest thing about growing up is that you have to do what is right for you even if it means breaking someone's heart. Including your own.");
        englist.add("I Know You Were The Most Prestigious Trophy I Ever Had, But.. Some Time I Feel I Was The Game That You Played.");
        englist.add("You don't deserve me..You never did.");
        englist.add("Too often we don't realize what we have until it's gone... too often we wait too long to say I'm sorry, I was wrong");
        englist.add("I just wonder how many people never get the one they want, but end up with the one they're supposed to have.");
        englist.add("Breakup in Love is Wakeup in Life.");
        englist.add("Don't let someone become your everything, because when they're gone you have nothing");
        englist.add("Apologies don't fix broken hearts.");
        englist.add("Life goes on with or without you!");
        englist.add("Sometimes people have to cry out all their tears, to make room for a heart full of smiles.");
        englist.add("I used to love you with all my heart, but now I tell myself I'm done. And then I look at you and tell myself I'm lying.");
        englist.add("Love that makes you give up smoking and drinking, not because you value your health, but because she doesn't like it.");
        englist.add("The most difficult part of letting someone go is we cannot change what we have become because of them.... :(");
        englist.add("Deep down I know it's best for me, but I hate the thought of him being with someone else.");
        englist.add("The hardest moment are not those when tears flow from eyes. It's when you have to hide the tears in your eyes with a smile on your lips.");
        englist.add("No more crying, I can't cry anymore. Don't take my hand this time. Just go please and don't look back, because I know if you did, I'd come running back to you and I can't do that.");
        englist.add("Dear heart, please stop getting involved in Everything. Your job is just to pump blood, So stick to it.");
        englist.add("If I treated you the way you treat me, I promise you wouldn't stick around the way I do.");
        englist.add("I still love you, that's a fact. But a million apologies can't bring me back.");
        englist.add("I said I am over you, But every time my phone vibrates, my heart still wishes its a text from you.");
        englist.add("Should I smile because he's my friend, or cry because that's all he is?");
        englist.add("I am not just another toy you can play with wen all your other toys are broken.");
        englist.add("If there ever comes a day when we can't be together, keep me in your heart, I'll stay there forever.");
        englist.add("I don't hate you... but I have lost all the reason to love you!!!");
        englist.add("One can not truly experience the beauty of love without enduring the pain that comes with it once it is lost.");
        englist.add("Maybe sometimes you just have to say what's in your heart, not just what you think someone wants to hear.");
        englist.add("One of the hardest decisions you will ever have to make, is whether to stay and try harder, or take your memories and walk away.");
        englist.add("If someone breaks you as a person, don't worry! Someone else will help you heal. And then they'll break you too. Cruel world. Get used to it.");
        englist.add("Every Heart Has A Pain .. Only The Way Of Expression Is Different .. Some Hide It In Eyes While Some Hide In Their Smile.");
        englist.add("Do you know that those who appear strong, in fact have a very emotional heart and are very vulnerable?");
        englist.add("Relationships are very simple. There are only two things that can happen. You either get married or your break up.");
        englist.add("I wish I had the guts to walk away and forget about what we had. But, I can't because I know you won't come after me, and I guess that's what hurts the most.");
        englist.add("She said she'd love me forever. Forever ended quick");
        englist.add("I'm not going to say how much I love you, When the feeling was never there. I'm not going to try to make you stay here, Because I know you never cared.");
        englist.add("I can handle the heart which is broken with a truth but wont be able to handle it when I come to know that wat you said was just a lie.");
        englist.add("Love don't cost a thing except a lot of tears, a broken heart, and wasted years");
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