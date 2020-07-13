package ind.apptech.captionsforinstagram;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.apptech.captionsforinstagram.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.material.tabs.TabLayout;
import com.sdsmdg.tastytoast.TastyToast;

import java.util.ArrayList;
import java.util.List;

import ind.apptech.captionsforinstagram.fragment.*;

public class NavigationActivity extends AppCompatActivity {

    boolean doubleBackToExitPressedOnce = false;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    public static InterstitialAd googlefullad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        showGoogleFull();

        Toolbar toolbar = (Toolbar) findViewById(R.id.tool);
        toolbar.setTitle("Caption For Insta");
        toolbar.setTitleTextColor(getResources().getColor(R.color.maincolor));
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Click Again To Exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new Best_fragment(), getResources().getString(R.string.Best));
        adapter.addFragment(new Amazing_fragment(), getResources().getString(R.string.Amazing));
        adapter.addFragment(new Cheat_fragment(), getResources().getString(R.string.Cheat));
        adapter.addFragment(new Alone_fragment(), getResources().getString(R.string.Alone));
        adapter.addFragment(new Angry_fragment(), getResources().getString(R.string.Angry));
        adapter.addFragment(new Anniversary_fragment(), getResources().getString(R.string.Anniversary));
        adapter.addFragment(new Change_fragment(), getResources().getString(R.string.Change));
        adapter.addFragment(new AprilFools_fragment(), getResources().getString(R.string.AprilFools));
        adapter.addFragment(new Birthday_fragment(), getResources().getString(R.string.Birthday));
        adapter.addFragment(new Attitude_fragment(), getResources().getString(R.string.Attitude));
        adapter.addFragment(new Beard_fragment(), getResources().getString(R.string.Beard));
        adapter.addFragment(new Beauty_fragment(), getResources().getString(R.string.Beauty));
        adapter.addFragment(new Breakup_fragment(), getResources().getString(R.string.Breakup));
        adapter.addFragment(new Christmas_fragment(), getResources().getString(R.string.Christmas));
        adapter.addFragment(new Brother_fragment(), getResources().getString(R.string.Brother));
        adapter.addFragment(new Busy_fragment(), getResources().getString(R.string.Busy));
        adapter.addFragment(new Childhood_fragment(), getResources().getString(R.string.Childhood));

        adapter.addFragment(new Clever(), getResources().getString(R.string.Clever));
        adapter.addFragment(new Condolence(), getResources().getString(R.string.Condolence));
        adapter.addFragment(new Cool(), getResources().getString(R.string.Cool));
        adapter.addFragment(new Crazy(), getResources().getString(R.string.Crazy));
        adapter.addFragment(new BrokenHeart_fragment(), getResources().getString(R.string.BrokenHeart));
        adapter.addFragment(new Cute(), getResources().getString(R.string.Cute));
        adapter.addFragment(new Dance(), getResources().getString(R.string.Dance));
        adapter.addFragment(new Daring(), getResources().getString(R.string.Daring));
        adapter.addFragment(new Decent(), getResources().getString(R.string.Decent));
        adapter.addFragment(new Diwali(), getResources().getString(R.string.Diwali));
        adapter.addFragment(new Emotional(), getResources().getString(R.string.Emotional));
        adapter.addFragment(new Engagement(), getResources().getString(R.string.Engagement));
        adapter.addFragment(new Exam(), getResources().getString(R.string.Exam));
        adapter.addFragment(new Facebook(), getResources().getString(R.string.Facebook));
        adapter.addFragment(new Failure(), getResources().getString(R.string.Failure));
        adapter.addFragment(new Family(), getResources().getString(R.string.Family));
        adapter.addFragment(new Eng_Famous(), getResources().getString(R.string.Famous));
        adapter.addFragment(new Festival(), getResources().getString(R.string.Festival));
        adapter.addFragment(new Flirt(), getResources().getString(R.string.Flirt));
        adapter.addFragment(new Food(), getResources().getString(R.string.Food));
        adapter.addFragment(new Forgiveness(), getResources().getString(R.string.Forgiveness));
        adapter.addFragment(new Friday(), getResources().getString(R.string.Friday));
        adapter.addFragment(new Friendship(), getResources().getString(R.string.Friendship));
        adapter.addFragment(new Funny(), getResources().getString(R.string.Funny));
        adapter.addFragment(new Get_well_soon(), getResources().getString(R.string.Get_well_soon));
        adapter.addFragment(new Girls_Boy(), getResources().getString(R.string.Girls_Boy));
        adapter.addFragment(new Goal(), getResources().getString(R.string.Goal));
        adapter.addFragment(new God(), getResources().getString(R.string.God));
        adapter.addFragment(new Love(), getResources().getString(R.string.Love));
        adapter.addFragment(new Taunt(), getResources().getString(R.string.Taunt));
        adapter.addFragment(new Teacher(), getResources().getString(R.string.Teacher));
        adapter.addFragment(new Tears(), getResources().getString(R.string.Tears));
        adapter.addFragment(new Technology(), getResources().getString(R.string.Technology));
        adapter.addFragment(new Trust(), getResources().getString(R.string.Trust));
        adapter.addFragment(new Unique(), getResources().getString(R.string.Unique));
        adapter.addFragment(new Valentine(), getResources().getString(R.string.Valentine));
        adapter.addFragment(new Winter(), getResources().getString(R.string.Winter));
        adapter.addFragment(new Wise(), getResources().getString(R.string.Wise));
        adapter.addFragment(new Work(), getResources().getString(R.string.Work));

        adapter.addFragment(new GoodLuck(), getResources().getString(R.string.GoodLuck));
        adapter.addFragment(new Creative(), getResources().getString(R.string.Creative));
        adapter.addFragment(new Crush(), getResources().getString(R.string.Crush));
        adapter.addFragment(new Crying(), getResources().getString(R.string.Crying));

        adapter.addFragment(new GoodMorning(), getResources().getString(R.string.GoodMorning));
        adapter.addFragment(new GoodNight(), getResources().getString(R.string.GoodNight));
        adapter.addFragment(new Gym(), getResources().getString(R.string.Gym));
        adapter.addFragment(new Halloween(), getResources().getString(R.string.Halloween));
        adapter.addFragment(new Happiness(), getResources().getString(R.string.Happiness));
        adapter.addFragment(new HappyFriendshipDay(), getResources().getString(R.string.HappyFriendshipDay));
        adapter.addFragment(new Hate(), getResources().getString(R.string.Hate));
        adapter.addFragment(new HeartBreak(), getResources().getString(R.string.HeartBreak));

        adapter.addFragment(new HeartTouching(), getResources().getString(R.string.HeartTouching));
        adapter.addFragment(new Hilarious(), getResources().getString(R.string.Hilarious));
        adapter.addFragment(new Home(), getResources().getString(R.string.Home));
        adapter.addFragment(new Hurt(), getResources().getString(R.string.Hurt));
        adapter.addFragment(new HusbandandWife(), getResources().getString(R.string.HusbandandWife));
        adapter.addFragment(new Inspirational(), getResources().getString(R.string.Inspirational));
        adapter.addFragment(new Insult(), getResources().getString(R.string.Insult));
        adapter.addFragment(new Jealous(), getResources().getString(R.string.Jealous));
        adapter.addFragment(new Kids(), getResources().getString(R.string.Kids));

        adapter.addFragment(new Kiss(), getResources().getString(R.string.Kiss));
        adapter.addFragment(new Latest(), getResources().getString(R.string.Latest));
        adapter.addFragment(new Life(), getResources().getString(R.string.Life));
        adapter.addFragment(new Marriage(), getResources().getString(R.string.Marriage));
        adapter.addFragment(new MenandWomen(), getResources().getString(R.string.MenandWomen));
        adapter.addFragment(new MissingYou(), getResources().getString(R.string.MissingYou));
        adapter.addFragment(new Mistake(), getResources().getString(R.string.Mistake));
        adapter.addFragment(new Motivational(), getResources().getString(R.string.Motivational));
        adapter.addFragment(new Music(), getResources().getString(R.string.Music));
        adapter.addFragment(new NewYear(), getResources().getString(R.string.NewYear));
        adapter.addFragment(new Pain(), getResources().getString(R.string.Pain));
        adapter.addFragment(new Parents(), getResources().getString(R.string.Parents));
        adapter.addFragment(new Party(), getResources().getString(R.string.Party));
        adapter.addFragment(new People(), getResources().getString(R.string.People));

        adapter.addFragment(new Pets(), getResources().getString(R.string.Pets));
        adapter.addFragment(new Positive(), getResources().getString(R.string.Positive));
        adapter.addFragment(new Present_Future_Past(), getResources().getString(R.string.Present_Future_Past));
        adapter.addFragment(new Rain(), getResources().getString(R.string.Rain));
        adapter.addFragment(new Relationship(), getResources().getString(R.string.Relationship));
        adapter.addFragment(new Romantic(), getResources().getString(R.string.Romantic));
        adapter.addFragment(new Sad(), getResources().getString(R.string.Sad));
        adapter.addFragment(new SchoolandCollege(), getResources().getString(R.string.SchoolandCollege));
        adapter.addFragment(new Selfish(), getResources().getString(R.string.Selfish));

        adapter.addFragment(new Shopping(), getResources().getString(R.string.Shopping));
        adapter.addFragment(new Single(), getResources().getString(R.string.Single));
        adapter.addFragment(new Sister(), getResources().getString(R.string.Sister));
        adapter.addFragment(new Smile(), getResources().getString(R.string.Smile));

        adapter.addFragment(new Sometimes(), getResources().getString(R.string.Sometimes));
        adapter.addFragment(new Sorry(), getResources().getString(R.string.Sorry));
        adapter.addFragment(new Success(), getResources().getString(R.string.Success));
        adapter.addFragment(new Summer(), getResources().getString(R.string.Summer));
        adapter.addFragment(new Sunday(), getResources().getString(R.string.Sunday));
        adapter.addFragment(new Sweet(), getResources().getString(R.string.Sweet));
        adapter.addFragment(new Thank_You(), getResources().getString(R.string.Thank_You));
        adapter.addFragment(new Time(), getResources().getString(R.string.Time));
        adapter.addFragment(new Tired(), getResources().getString(R.string.Tired));

        viewPager.setAdapter(adapter);
    }

    // Google Full Ad
    private void showGoogleFull() {
        final AdRequest adRequest = new AdRequest.Builder().build();
        googlefullad = new InterstitialAd(NavigationActivity.this);
        googlefullad.setAdUnitId(getString(R.string.google_interstitial_full));
        googlefullad.loadAd(adRequest);
        googlefullad.setAdListener(new AdListener() {
            public void onAdLoaded() {
            }

            @Override
            public void onAdClosed() {
                googlefullad.loadAd(adRequest);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.action_favorite:
                if (isNetworkConnected()) {
                    Intent i = new Intent(NavigationActivity.this, Favrite.class);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(i);
                } else {
                    TastyToast.makeText(getApplicationContext(), "No Internet Connection!", TastyToast.LENGTH_SHORT, TastyToast.ERROR);
                }
                return true;

            case R.id.setting:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }
}