package com.example.project1.Activity;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.project1.Fragment.HotRecyler;
import com.example.project1.Fragment.SportFragment;
import com.example.project1.Fragment.TvFragment;
import com.example.project1.R;

public class NavigationActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        loadFragment(new SportFragment());
        BottomNavigationView bottomNavigationView = findViewById(R.id.news);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.menu_sport:
                fragment = new SportFragment();
                break;
            case R.id.menu_news:
                fragment = new HotRecyler();
                break;
            case R.id.menu_TV:
                fragment = new TvFragment();
                break;
        }

        return loadFragment(fragment);
    }

    private boolean loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container, fragment)
                .commit();
        return true;
    }

}
