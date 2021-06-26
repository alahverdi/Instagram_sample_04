package com.alroid.instagrammfttask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import com.alroid.instagrammfttask.adapter.AdapterPostProfile;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ExploreActivity extends AppCompatActivity {
    MaterialToolbar toolbar_explore;
    RecyclerView recyclerView_explore;
    BottomNavigationView bottom_navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        initViews();
        setupToolbar();
        setupExploreRecyclerView();
        setup_bottomNavigation();
    }

    private void initViews() {
        toolbar_explore = findViewById(R.id.toolbar_explore);
        recyclerView_explore = findViewById(R.id.recyclerView_explore);
        bottom_navigation = findViewById(R.id.bottom_navigation);
    }

    private void setupToolbar() {
        setSupportActionBar(toolbar_explore);
    }

    private void setupExploreRecyclerView() {
        AdapterPostProfile adapterPost = new AdapterPostProfile(this, DataGenerator.getPostsExplore(this));
        recyclerView_explore.setLayoutManager(new GridLayoutManager(this, 3, RecyclerView.VERTICAL, false));
        recyclerView_explore.setAdapter(adapterPost);

    }

    private void setup_bottomNavigation() {
        bottom_navigation.setSelectedItemId(R.id.explore);


        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent = new Intent();

                switch (item.getItemId()) {
                    case R.id.home:
                        intent = new Intent(ExploreActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.explore:
                        break;
                    case R.id.camera:
                        intent = new Intent("android.media.action.IMAGE_CAPTURE");
                        startActivity(intent);
                        break;
                    case R.id.like:
                        intent = new Intent(ExploreActivity.this, LikeActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.profile:
                        intent = new Intent(ExploreActivity.this, ProfileActivity.class);
                        startActivity(intent);
                        break;
                }
                return true;
            }
        });
    }

}