package fooster.test.reccontacts;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
private final List<Fragment>lstFragment = new ArrayList<>();
    private final List<String>lstTitles = new ArrayList<>();


    public ViewPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position){
        return lstFragment.get(position);

    }
    @Override
    public int getCount(){
        return lstTitles.size();
    }
    @Override
    public CharSequence getPageTitle (int position){
        return lstTitles.get(position);
    }
    public void AddFragment(Fragment fragmnent,String title){
        lstFragment.add(fragmnent);
        lstTitles.add(title);
    }
}
