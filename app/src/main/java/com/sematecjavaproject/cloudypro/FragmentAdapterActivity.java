package com.sematecjavaproject.cloudypro;

import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapterActivity extends FragmentPagerAdapter {

    TodayWeatherForecastFragment todayWeatherForecastFragment;
    Next7DaysWeatherForecastFragment next7DaysWeatherForecastFragment;
    TodayWeatherForecastFragment todayWeatherForecastFragment_default;

    public FragmentAdapterActivity(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                todayWeatherForecastFragment = new TodayWeatherForecastFragment();
                return todayWeatherForecastFragment;
            case 1:
                next7DaysWeatherForecastFragment = new Next7DaysWeatherForecastFragment();
                return next7DaysWeatherForecastFragment;
            default:
                todayWeatherForecastFragment_default = new TodayWeatherForecastFragment();
                return todayWeatherForecastFragment_default;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "Today";
            case 1:
                return "Next 7 Days";
            default:
                return "Unknown Fragment";
        }
    }
}
