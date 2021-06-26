package com.alroid.instagrammfttask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.alroid.instagrammfttask.adapter.AdapterLike;
import com.alroid.instagrammfttask.entity.Like;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class LikeActivity extends AppCompatActivity implements AdapterLike.SelectedLike {

    RecyclerView recyclerView_like;
    BottomNavigationView bottom_navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_like);

        initViews();
        setup_like_recyclerView();
        setup_bottomNavigation();
    }

    private void setup_like_recyclerView() {
        AdapterLike adapterLike = new AdapterLike(this, DataGenerator.getLikes(this), this);
        recyclerView_like.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView_like.setAdapter(adapterLike);
    }

    private void initViews() {
        recyclerView_like = findViewById(R.id.recyclerView_like);
        bottom_navigation = findViewById(R.id.bottom_navigation);
    }

    private void setup_bottomNavigation() {
        bottom_navigation.setSelectedItemId(R.id.like);

        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent = new Intent();

                switch (item.getItemId()) {
                    case R.id.home:
                        intent = new Intent(LikeActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.explore:
                        intent = new Intent(LikeActivity.this, ExploreActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.camera:
                        intent = new Intent("android.media.action.IMAGE_CAPTURE");
                        startActivity(intent);
                        break;
                    case R.id.like:
                        break;
                    case R.id.profile:
                        intent = new Intent(LikeActivity.this, ProfileActivity.class);
                        startActivity(intent);
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public void selectedLike(Like likeActivity) {
    }
}