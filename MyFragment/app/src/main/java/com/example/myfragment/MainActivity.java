package com.example.myfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Akhilan on 1/24/2017.
 */

public class MainActivity extends AppCompatActivity implements ComicListFragment.OnComicSelected {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.root_layout, ComicListFragment.newInstance(), "comicList").commit();
        }
    }

    @Override
    public void onComicSeleted(int imageResId, String name, String description, String url) {
        final ComicDetailFragment detailsFragment = ComicDetailFragment.newInstance(imageResId, name, description, url);
        getSupportFragmentManager().beginTransaction().replace(R.id.root_layout, detailsFragment, "comicDetail").addToBackStack(null).commit();

    }
}
