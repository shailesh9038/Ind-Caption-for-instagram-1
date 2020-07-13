package ind.apptech.captionsforinstagram;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.apptech.captionsforinstagram.R;

import java.util.List;

public class CustmPager extends PagerAdapter {

    ViewPager viewPagerrjpt;
    Activity activityrjpt;
    List defflistrjpt;

    public CustmPager(Activity activityrjpt, List defflistrjpt) {
        this.activityrjpt = activityrjpt;
        this.defflistrjpt = defflistrjpt;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {

        LayoutInflater inflater = LayoutInflater.from(activityrjpt);
        ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.pager_layout, collection, false);
        TextView button = (TextView) layout.findViewById(R.id.valuebtn);
        button.setText(defflistrjpt.get(position).toString());
        collection.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return defflistrjpt.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

}