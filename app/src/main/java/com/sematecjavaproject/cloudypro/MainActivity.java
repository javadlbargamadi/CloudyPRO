package com.sematecjavaproject.cloudypro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ImageView imgDrawerLayout;
    ImageView imgSearchIcon;
    TabLayout tabLayout;
    ViewPager viewPager;

    FragmentAdapterActivity fragmentAdapterActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgDrawerLayout = findViewById(R.id.imgDrawerLayout);
        imgSearchIcon = findViewById(R.id.imgSearchIcon);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        fragmentAdapterActivity = new FragmentAdapterActivity(getSupportFragmentManager());

        viewPager.setAdapter(fragmentAdapterActivity);

        tabLayout.setupWithViewPager(viewPager);

    }
}
