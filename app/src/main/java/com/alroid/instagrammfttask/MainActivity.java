package com.alroid.instagrammfttask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.alroid.instagrammfttask.adapter.AdapterPostMain;
import com.alroid.instagrammfttask.adapter.AdapterStory;
import com.alroid.instagrammfttask.entity.PostMain;
import com.alroid.instagrammfttask.entity.Story;
import com.alroid.instagrammfttask.fragment.ActionBottomDialogFragment;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements AdapterStory.SelectedStory, AdapterPostMain.SelectedPost {

    RecyclerView recyclerView_story,
            recyclerView_post;
    BottomNavigationView bottom_navigation;
    MaterialToolbar toolbar_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        toolbar_main.showOverflowMenu();
        setup_story_recyclerView();
        setup_post_recyclerView();
        setup_bottomNavigation();

    }

    private void setup_bottomNavigation() {
        bottom_navigation.setSelectedItemId(R.id.home);

        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent = new Intent();

                switch (item.getItemId()) {
                    case R.id.home:
                        break;
                    case R.id.explore:
                        intent = new Intent(MainActivity.this, ExploreActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.camera:
                        intent = new Intent("android.media.action.IMAGE_CAPTURE");
                        startActivity(intent);
                        break;
                    case R.id.like:
                        intent = new Intent(MainActivity.this, LikeActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.profile:
                        intent = new Intent(MainActivity.this, ProfileActivity.class);
                        startActivity(intent);
                        break;
                }
                return true;
            }
        });
    }

    private void initViews() {
        recyclerView_story = findViewById(R.id.recyclerView_story);
        recyclerView_post = findViewById(R.id.recyclerView_post);
        bottom_navigation = findViewById(R.id.bottom_navigation);
        toolbar_main = findViewById(R.id.toolbar_main);
    }

    private void setup_post_recyclerView() {
        AdapterPostMain adapterPost = new AdapterPostMain(this, DataGenerator.getPostsMain(this), this);
        recyclerView_post.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView_post.setAdapter(adapterPost);
    }

    private void setup_story_recyclerView() {
        AdapterStory adapterStory = new AdapterStory(this, DataGenerator.getStories(this), this);
        recyclerView_story.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        recyclerView_story.setAdapter(adapterStory);
    }

    public void onclick_direct(View view) {
        Snackbar snackBar = Snackbar.make(view, "Opening direct :)", BaseTransientBottomBar.LENGTH_SHORT);
        snackBar.setAnchorView(bottom_navigation)
                .setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        snackBar.dismiss();
                    }
                });
        snackBar.show();
    }

    @Override
    public void selectedStory(Story story) {
    }

    @Override
    public void selectedPost(PostMain post) {
    }

}