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

public class Sad extends Fragment {

    RecyclerView englishlists;
    private RecyclerView.LayoutManager layoutManager;
    Shayri_Adapt rjptadapter;
    ArrayList<String> englist = new ArrayList<>();
    LinearLayout Net_connection;

    public Sad() {
        // Required empty public constructor
    }

    public static Sad newInstance(String param1, String param2) {
        Sad fragment = new Sad();
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

        englist.add("It's sad to be happy alone.");
        englist.add("I don't have a lot of friends, I just know a lot of people.");
        englist.add("I am not happy without you.");
        englist.add("I don't know why they call it heartbreak. It feels like other part of my body is broken too.");
        englist.add("I smile not for that I am happy, but sometimes I smile to hide sadness.");
        englist.add("I just want to fall asleep until I don't miss you anymore.");
        englist.add("What do you do when the only one who can make you stop crying is the one who is making you cry?");
        englist.add("People are lonely because they build walls instead of bridges.");
        englist.add("It's sad how people become what they had promised they never will.");
        englist.add("Its better to be lonely then to be played by wrong people.");
        englist.add("I used to love you with all my heart, but now I tell myself I'm done. And then I look at you and tell myself I'm lying.");
        englist.add("I will never stop caring, but if you decide to push me away, I will go.");
        englist.add("Everyone thinks that 'I m happy and fine' but look a lil closer, u will see tears in my eyes.");
        englist.add("Two barrels of tears do not heal a bruise.");
        englist.add("The Part Dat Hurts Me Da Most, Is Knowing Dat I Once Had U And Then Lost U. :-(");
        englist.add("You just can't please everybody.");
        englist.add("It hurts the most, when someone who made you feel special yesterday then makes you feel like you are the most unwanted person today.");
        englist.add("Is having one of those days where they feels like they can't do anything right.");
        englist.add("Just because my eyes don't tear doesn't mean my heart doesn't cry. And just because I come off strong, doesn't mean there's nothing wrong..");
        englist.add("I just want to fall asleep until i don;t miss you anymore.");
        englist.add("Sometimes what you don't say is more powerful than what you do say.");
        englist.add("One of the worst things that can happen to a person is to be forgotten by someone they will never forget.");
        englist.add("I hate the moment when suddenly my anger turns into tears.");
        englist.add("No guy is worth your tears and when you find one that is, he won't make you cry.");
        englist.add("There is no point in crying, the tears won't bring you back to me.");
        englist.add("It really hurtzz when sombody else starts taking your place in someone's life..");
        englist.add("I know they say that first love is the sweetest, but that first cut is the deepest.");
        englist.add("204 countries, 805 Islands, 7 seas, 7+ Billion people and I'm single!!!");
        englist.add("Let no one think I gave in.");
        englist.add("Life is short, there is no time to leave important words UNSAID.");
        englist.add("As I'm trying to make everyone else happy I'm making myself miserable in the process");
        englist.add("The scars you can't see are the hardest to heal.");
        englist.add("The truth hurts for a little while, but lies hurt for a lifetime.");
        englist.add("They ignore you until they need you.");
        englist.add("loves when you listen to a song and it relates 100% sure to how you feel.");
        englist.add("A great many people have a soldier's stomach - everything they eat goes to the front.");
        englist.add("The tragedy of life is not that it ends so soon, but that we wait so long to begin it.");
        englist.add("The higher you climb on love's ladder, the harder you fall.");
        englist.add("Everyone wants to be happy. No one wants to be sad and get pain. But you can't make a rainbow without a little rain.");
        englist.add("You hurt me more than I deserve, how can you be so cruel? I love you more than you deserve, why am I such a fool?");
        englist.add("No matter how much you have hurt me, I still pray for you every night.");
        englist.add("People sometimes think that you do not love them but sometimes you have to say bye.");
        englist.add("A relationship is only made for two....but some just forget how to count. Pain is the only thing that's telling me I'm still alive.");
        englist.add("When you are in love and you get hurt, it's like a cut... it will heal, but there will always be a scar.");
        englist.add("I miss how you always MADE time for me.");
        englist.add("No one knows what it's like to be the bad man, to be the sad man, behind blue eyes.");
        englist.add("The most painful memory. When I walked away and you let me go.");
        englist.add("Never give up on someone you cant spend a day not thinking about.");
        englist.add("Is finally driven to the point were they finds comfort in lies and shuns the truth.");
        englist.add("Loves when you listen to a song and it relates 100% shure to how you feel");
        englist.add("Make the most beautiful Mistakes, mine is you.");
        englist.add("Sometimes its better to be alone because then no one can hurt you.");
        englist.add("You know what friends your polite nature to others always hurts you.");
        englist.add("You know what friends ur polite nature to others always hurts you.");
        englist.add("I'm sad. No. I'm mad. No, wait... I don't know I just need a freaking hug..");
        englist.add("I don't depend on people anymore because I'm tired of being disappointed.");
        englist.add("It's weird how the happiest memories drive you to tears..");
        englist.add("The same person who said the sweetest things to me also said some of the meanest things I've ever heard :(");
        englist.add("Always feels like is going the wrong way on a one way street...");
        englist.add("Isn't it sad that you are hurt so much that finally you can say I'm used to it Sometimes It's better to be alone... No one can hurt you.");
        englist.add("There's still only one person who hasn't given up on me. God, thank you for loving me.");
        englist.add("The hardest part in life is trying to show the smile you know is fake and to hide the tears that won't stop.");
        englist.add("There is just some days when it all seems to be wrong and nothing feels right");
        englist.add("BEING IGNORED, worst feeling ever.");
        englist.add("The hardest part about loving someone, is watching that person love another person.");
        englist.add("It's never going to be the same again. And that's whats killing me.");
        englist.add("It hurts when something good ends, but it hurts even more if you cling to it, knowing that its not there.");
        englist.add("God only makes happy endings. If it's not happy, then it's not the end.");
        englist.add("When you have lived long in despair, it's hope that you can't stand anymore.");
        englist.add("Why does it always have to be the one that you love the most hits you the hardest?");
        englist.add("Love is a medicine for any kind of wound, but there is no medicine for a wound given by love.");
        englist.add("How did we go from talking everyday to strangers?");
        englist.add("Sometimes it's better to be Alone..Nobody can hurt you.");
        englist.add("Emptiness feels so heavy.");
        englist.add("I can always pretend I'm okay, but it doesn't mean I don't get hurt..");
        englist.add("Ignore me. I don't care. I'm used to it anyways. I'm invisible.");
        englist.add("I'm not afraid to fall in LOVE, I'm afraid to fall for a wrong person again.");
        englist.add("The more we are filled with love, the less room there is for hate.");
        englist.add("Sometimes it's better to just quietly and privately miss someone than to let them know and still be ignored.. !");
        englist.add("It's never the tear that measure the PAIN, sometimes its the SMILE we fake.");
        englist.add("If I could be anything, l would be ur tear, so l could be born in ur eye, live down ur cheek and die on ur lips...");
        englist.add("The hardest thing is to hurt yourself for the sake of others' happiness.");
        englist.add("Forgive me for my mistakes, I'm still a kid learning the responsibility of being an adult..");
        englist.add("Oh I'm sorry, I forgot I only exist when you want something from me.");
        englist.add("It isn't the bad memories that make you sad, but the best ones that you can't bring it back.");
        englist.add("I hate it when crying is the only way to feel better.");
        englist.add("Pain is the only thing that's telling me I'm still alive.");
        englist.add("Its better to be hated for what you are than to be loved for what your not.");
        englist.add("Every Heart Has A Pain .. Only The Way Of Expression Is Different .. Some Hide It In Eyes While Some Hide In Their Smile.");
        englist.add("It still hurts that you're doing completely okay, without me.");
        englist.add("My silence spoke a thousand words, but you never heard them.");
        englist.add("The same person who said the sweetest things to me also said some of the meanest things I've ever heard.");
        englist.add("SLEEP away the sadness of today.");
        englist.add("Loneliness doesn't KILL, but sometimes I wish it DID.");
        englist.add("Whenever you are stressed,eat chocolates,sweets etc, because when stressed is spelled backwards it becomes 'DESSERTS'.");
        englist.add("We can do no great things, only small things with great love.");
        englist.add("It hurts, but it's OK.. I'm used to it.");
        englist.add("A beautiful girl with gorgeous EYES, a hidden world of HURT & LIES.");
        englist.add("When I smile and say: Yeah, I'm fine.. it's really code for.. No I'm not okay and I feel like my world is crashing down around me.");
        englist.add("I hate missing someone and not being able to do anything about it.");
        englist.add("Life is like a roller coaster.It has is up's and down's but it's up to weather to enjoy the ride or not.");
        englist.add("Theres no point in crying, the tears wont bring you back to me.");
        englist.add("I love crying in the rain. because when i do, no one can hear the pain.");
        englist.add("I used to think that the worst thing in life was to end up all alone, it's not. The worst thing in life is the end up with people that make you feel all alone !!!");
        englist.add("Don't trust too much, don't love too much, don't care too much because that 'too much' will hurt you so much!");
        englist.add("Don't be sad because it's over. Smile because it happened.");
        englist.add("It's sad when you realize you aren't as important to someone as you thought you were");
        englist.add("My silence is just another word for pain.");
        englist.add("There is no hurt in this world worse than feeling like they just doesn't give a F..bad!");
        englist.add("What's the point in all this screaming, no one's listening anyway.");
        englist.add("One of the hardest things in life is watching the person you love, love someone else.");
        englist.add("I'm invisible, until someone needs me.");
        englist.add("Silence is the most powerful SCREAM.");
        englist.add("But the all didn't see the little bit of sadness in me.");
        englist.add("Crying doesn't make me weak, it just makes me look so.");
        englist.add("The worst felling is pretending as if you don't care at all, When in reality that's all you can think of.");
        englist.add("Forget about me, erase me, dont even think back. Because one day when you let your mind slip, you'll remember me and realize that you should have held on.");
        englist.add("I feel crappy inside, like something just broke..");
        englist.add("There are songs that can really make you sad and cry when you hear them. But it's actually not the song that makes you cry, it's the people behind the memories..");
        englist.add("I never felt true love until i was with you. And i never felt true sadness until you left me.");
        englist.add("If you're going to make me cry, at least be there to wipe away the tears.");
        englist.add("If you leave without a reason dont come back with an excuse.");
        englist.add("I tried to forget you, but the harder I tried, the more I thought about you.");
        englist.add("Sometimes i want to die for a day and just watch and see who really cares.");
        englist.add("I am not just another toy you can play with wen all your other toys are broken.");
        englist.add("The sad part isn't that we never talk, it's that we used to talk every day.");
        englist.add("One day, you will wake up realizing how much I mean to you. When that day comes, I might have woken up with someone else.");
        englist.add("We used to talk for hours on end & now its like we never knew each other.");
        englist.add("The silence isn't so bad, till I look at my hands and feel sad. Because the spaces between my fingers are right where yours fit perfectly.");
        englist.add("People cry not because they are weak, It's because they've been strong for too long.");
        englist.add("I'm not somebody who will go out of my way to hurt somebody when i love them... I'm somebody who will go out of my way to get hurt for the people i love..");
        englist.add("I'm missing something in my life these days.");
        englist.add("Today I felt life was over for me. I do not care how much longer I will be in this world, because life will have no meaning for me without his love.");
        englist.add("Sometimes people have to cry out all their tears, to make room for a heart full of smiles.");
        englist.add("I close my eyes and dream of a time when I wasn't all alone.");
        englist.add("I hate being broken. I hate that I cannot go back.");
        englist.add("It sucks to be alone, even when there are people all around you.");
        englist.add("If the only thing that makes you happy is hurting someone.. then you really need to look in the mirror and get your happiness another way..");
        englist.add("Remember, you're beautiful. But keep in mind that not everyone's gonna be able to see that.");
        englist.add("One Of The Hardest Things In Life Is Having The Words In Your Heart That You Can Not Speak :/ :/");
        englist.add("I'm missing something in my life these days");
        englist.add("We're all faced with problems in life. It's how we deal with them that determines our future.");
        englist.add("Fu(k you >------^ __ ^------< this much.");
        englist.add("You don't really know what you have until it's gone..");
        englist.add("Never give up on someone you can't spend a day not thinking about.");
        englist.add("The most painful memory.. when I walked away and you let me goI am not happy without you. :(");
        englist.add("It's not always the tears that measure the pain. Sometimes it's the smile we fake.");
        englist.add("If someone breaks you as a person, dont worry! Someone else will help you heal. And then they'll break you too. Cruel world. Get used to it.");
        englist.add("Never cry for anyone in your life, because those you cry for don't deserve your tears and those who are deserving will never let you cry.");
        englist.add("Is feeling a little smurfy today...small and blue");
        englist.add("I hate the moment when suddenly my anger turns into tears.. :@");
        englist.add("I know my silence and my tears will heal my pain one day.");
        englist.add("You'll never realize the value of what you have, until what you have is no longer yours.");
        englist.add("Please BURN my sad memories.");
        englist.add("Once you lose someone, it's never exactly the same person who comes back");
        englist.add("Can't deny that I want you.");
        englist.add("I feel crappy inside, like something just broke.");
        englist.add("There's nothing more depressing than having it all and still feeling sad.");
        englist.add("I'm slowly giving up.");
        englist.add("People are lonely because they build walls instead of bridges..");
        englist.add("Poor man walks miles to earn the food & rich man walks miles to digest the food.");
        englist.add("It's so important to have people in your life that go out of their way to make you feel better when you're sad or hurting.");
        englist.add("I am the one that said: Goodbye.. It's over but I'm the one crying.");
        englist.add("Don't cry for d person who doesn't know your value of tear.");
        englist.add("Sometimes It's better to be alone...No one can hurt you.");
        englist.add("Sometimes, you have to smile to hide your fears and laugh to hide your tears.");
        englist.add("Wants you to know that every time I take a breath, every time my heart beats, I think of you. I am helplessly in love with you...");
        englist.add("The most painful goodbye's are those which were never said and never explained....");
        englist.add("I just want someone who will stay in my life so I wont have to worry about another goodbye.");
        englist.add("Sad feeling is mute reminder of what is really important in our life.");
        englist.add("The greater your capacity to love, the greater your capacity to feel the pain.");
        englist.add("Everything takes me longer than I expect. It's the sad truth about life.");
        englist.add("I always found the right one on wrong time.");
        englist.add("My smile doesnt always mean *I'm happy *.... sometimes it means *I can manage*..... and sometimes it just means *I am tired of crying*");
        englist.add("The sad part isn't that we never talk, its that we used to talk everyday.");
        englist.add("Some people accidentally walk on my feet and apologize, while others walk all over my heart and don't even realize.");
        englist.add("I tried to forget you, but the harder I tried, the more I thought about you");
        englist.add("I remember all those crazy things you said, you left them running through my head. You are always there, you are everywhere. But right now I wish you were here.");
        englist.add("It's never the tear that measure the PAIN, sometimes it's the SMILE we fake.");
        englist.add("I never thought that you would end up meaning this much to me..I just want someone who will stay in my life so I wont have to worry about another goodbye.");
        englist.add("If there ever comes a day when we can't be together, keep me in your heart, I'll stay there forever.");
        englist.add("With each passing day, I'm finding out more and more who my real friends are.");
        englist.add("There's just some days when it all seems to be wrong and nothing feels right.");
        englist.add("I'm leaving for our own Good, Now i am happy, how about you?");
        englist.add("The hardest part of dreaming about someone you love is having to wake up.");
        englist.add("The CURE of anything is salt WATER - Sweat, Tear, or the SEA.");
        englist.add("It's funny how the person who hurts you is the one who swore they never would.");
        englist.add("Going to keep all secrets to myself since some people i can't trust .");
        englist.add("Only loneliness can teach us everything in this world except how to forget the person who made us lonely.");
        englist.add("Do you know that those who appear strong, in fact have a very emotional heart and are very vulnerable?");
        englist.add("I feel so far away from the one I wish to hold in my arms.");
        englist.add("Hate is like acid.It damages the vessel in which it is stored and destroys the vessel in which it it is poured.");
        englist.add("Never let the pain from your past punish your present and paralyze your future.");
        englist.add("It actually kills me when we don't talk, it kills me when you ignore me, it kills me when you're busy with your life");
        englist.add("Life goes on with or without you!");
        englist.add("Have you ever wondered what what hurts you most... Saying something that you wished had not or not saying anything and wish you had???");
        englist.add("Smile and no one will see how broken you are inside.");
        englist.add("Missing someone + No text from them = Worst feeling.");
        englist.add("Losing a part of yourself is much easier than losing the one you love.");
        englist.add("I want you to be FREE, but i can watch you SOAR away from me.");
        englist.add("There's no point in crying, the tears wont bring you back to me.");
        englist.add("I fell for you, but you didn't catch me.");
        englist.add("I fall too fast, crush too hard, forgive too easy, and care too much.");
        englist.add("I hate the fact that you ignore me for so long, and then you start talking to me like nothing happened !!");
        englist.add("My silence spoke a thousand words, but you never heard them..");
        englist.add("Why does life keeps teaching me lessons that I've no desire to learn.....");
        englist.add("The hardest thing is to hurt yourself for the sake of others' happiness..");
        englist.add("Some nights I burn in the fire of my own thoughts");
        englist.add("The worst kind of pain is when you're smiling to stop the tears from falling.");
        englist.add("Out of all lies you have told..... was my favorite.");
        englist.add("Sometimes I wish I had never met you, so when I lay in bed at night I wouldn't have anything to be sad about.");
        englist.add("I will wait till the day I can forget YOU or the day you realize you can't forget Me.");
        englist.add("Never put your happiness in someone Else's hands.");
        englist.add("The worst feeling is when you smile at your crush, but they don't even acknowledge your existence...");
        englist.add("I hope you'll realize how much you're hurting me someday.");
        englist.add("I was your cure and you were my disease. I was saving you, and you were killing me.");
        englist.add("Here's my heart, I'll let you break it.");
        englist.add("If it's not a happy ending then it's not the ending at all.");
        englist.add("I am the one that said Goodbye, It's over but I'm the one crying.");
        englist.add("I am not happy without you :(");
        englist.add("Why am I so afraid to lose you when you are not even mine?");
        englist.add("Oh I'm sorry, I forgot I only exist when you want something from me");
        englist.add("There are times when we must be hurt in order to grow, we must lose in order to gain, because some lessons in life are best learned through Pain!");
        englist.add("My heart was taken by you, broken by you, and now it is in pieces because of you.");
        englist.add("Seeing people change isn't what hurts. What hurts is remembering who they used to be.");
        englist.add("Seven days without love makes one weak.");
        englist.add("I don't care for people, who don't care for me.");
        englist.add("I like to listen to sad music when I'm sad to make me double sad.");
        englist.add("Say what you feel, Do what you think, Give what you got, But never regret.");
        englist.add("My silence is just another word for my PAIN.");
        englist.add("The only thing more shocking than the truth are the lies people tell to cover it up..");
        englist.add("I just wanna run away.. Run away from all of my problems and pain and never come back.. Because i don't think anyone would miss me.");
        englist.add("Out of all lies you have told.. Was my favorite.");
        englist.add("When u love someone, even though they hurt u nd break your heart, you still love them with all the little pieces!!");
        englist.add("I don't usually sleep enough, but when I do, it's still not enough.");
        englist.add("Dear heart, please stop getting involved in Everything. Your job is just to pump blood, So stick to it.");
        englist.add("If you give up on me, I'm going to give up on me too.");
        englist.add("If you fall in love... be ready for the tears..!!");
        englist.add("I don't depend on people any more because I'm tired of being disappointed.");
        englist.add("That Sad Moment When Your Silence To Save Relation Consider As Your Ego....");
        englist.add("How do you stop yourself from loving someone when you know it will never work out?");
        englist.add("Always feels like is going the wrong way on a one way street..");
        englist.add("Sometimes the person you trust most is the one who trust you the least.");
        englist.add("You sometimes think you want to disappear but all you really want is to be found.");
        englist.add("As I'm trying to make everyone else happy I'm making myself miserable in the process.");
        englist.add("Every time I start trusting someone, they show me why I shouldn't.");
        englist.add("sometimes the people that u don't want to get hurt doesn't care if they hurt you!");
        englist.add("It's great when two strangers become friends but its sad when two friends become strangers.");
        englist.add("Tears are not a sign of weakness, but of courage. Hiding your emotions is self destructive and will never allow you to heal.");
        englist.add("Time doesn't really Heal the heart. It just makes the heart forget all the pain.");
        englist.add("It hurts the worst when the person that made you feel so special yesterday, makes you feel so unwanted today.");
        englist.add("Im incomplete without you!");
        englist.add("Everyone thinks that I m happy and fine but look a li'l closer, u will see tears in my eyes.....");
        englist.add("Pretending to be happy when you're in pain is just an example of how strong you are as a person.");
        englist.add("Your mind may be sad because youre not with him, but your heart is happy just knowing him.");
        englist.add("The greatest pain that comes from love is loving someone you can never have.");
        englist.add("Sometimes it's better to be Alone, Nobody can hurt you");
        englist.add("How did I go from being so happy, to so sad..");
        englist.add("Sometimes all you ever want is someone to want and need you as much as you want and need them..");
        englist.add("The only thing more shocking than the truth are the lies people tell to cover it up.");
        englist.add("Nothing hurts more than realizing he meant everything to you and you meant nothing to him.");
        englist.add("You're the only exception.");
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