package com.alroid.instagrammfttask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.alroid.instagrammfttask.adapter.AdapterStory;
import com.alroid.instagrammfttask.adapter.AdapterViewPagerProfile;
import com.alroid.instagrammfttask.entity.Story;
import com.alroid.instagrammfttask.fragment.ActionBottomDialogFragment;
import com.alroid.instagrammfttask.fragment.ActionBottomDialogFragmentCreateNew;
import com.alroid.instagrammfttask.fragment.FragmentIGTv;
import com.alroid.instagrammfttask.fragment.FragmentTag;
import com.alroid.instagrammfttask.fragment.FragmentPost;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import java.util.HashMap;
import java.util.Map;

public class ProfileActivity extends AppCompatActivity implements AdapterStory.SelectedStory {

    RecyclerView recyclerView_highlights;
    ViewPager viewPager_profile;
    TabLayout tabLayout_profile;
    BottomNavigationView bottom_navigation;
    ImageView iv_profile;
    MaterialButton btn_editProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        initViews();
        setupToolbar();
        setupNavigationView();
        setup_highlights_recyclerView();
        setup_viewpager();
        setup_bottomNavigation();
    }

    private void setup_viewpager() {
        Map<String, Fragment> map = new HashMap<>();
        map.put("post", new FragmentIGTv());
        map.put("IGTv", new FragmentPost());
        map.put("tag", new FragmentTag());

        AdapterViewPagerProfile adapterViewPagerProfile = new AdapterViewPagerProfile(
                getSupportFragmentManager(),
                map);

        viewPager_profile.setAdapter(adapterViewPagerProfile);
        tabLayout_profile.setupWithViewPager(viewPager_profile);

        tabLayout_profile.getTabAt(0).setIcon(R.drawable.ic_post_grid);
        tabLayout_profile.getTabAt(1).setIcon(R.drawable.ic_igtv);
        tabLayout_profile.getTabAt(2).setIcon(R.drawable.ic_tag);

        tabLayout_profile.getTabAt(0).select();
    }

    private void initViews() {
        recyclerView_highlights = findViewById(R.id.recyclerView_highlights);
        viewPager_profile = findViewById(R.id.viewPager_profile);
        tabLayout_profile = findViewById(R.id.tabLayout_profile);
        bottom_navigation = findViewById(R.id.bottom_navigation);
        iv_profile = findViewById(R.id.iv_profile);
        btn_editProfile = findViewById(R.id.btn_editProfile);
    }

    private void setup_highlights_recyclerView() {
        AdapterStory adapterHighlight = new AdapterStory(this, DataGenerator.getHighlights(this), this);

        recyclerView_highlights.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, true));
        recyclerView_highlights.setAdapter(adapterHighlight);
    }

    private void setupNavigationView() {
        NavigationView navigationView = findViewById(R.id.nav_view_profile);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.nav_menu_archive:
                        Snackbar.make(navigationView, "Archive", 1000).show();
                        break;

                    case R.id.nav_download_insights:
                        Snackbar.make(navigationView, "Insights", 1000).show();
                        break;

                    case R.id.nav_menu_your_activity:
                        Snackbar.make(navigationView, "Your activity", 1000).show();
                        break;

                    case R.id.nav_menu_qr_code:
                        Snackbar.make(navigationView, "QR code", 1000).show();
                        break;

                    case R.id.nav_menu_saved:
                        Snackbar.make(navigationView, "Saved", 1000).show();
                        break;
                    case R.id.nav_menu_close_friends:
                        Snackbar.make(navigationView, "Close friends", 1000).show();
                        break;
                    case R.id.nav_menu_discover_people:
                        Snackbar.make(navigationView, "Discover people", 1000).show();
                        break;
                    case R.id.nav_menu_covid19:
                        Snackbar.make(navigationView, "COVID-19 Info", 1000).show();
                        break;
                    case R.id.nav_menu_setting:
                        Snackbar.make(navigationView, "Setting", 1000).show();
                        break;
                }
                return false;
            }
        });
    }

    private void setupToolbar() {
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout_Profile_activity);
        Toolbar toolbarProfile = findViewById(R.id.toolbar_profile);
        toolbarProfile.setTitleTextColor(ContextCompat.getColor(this, R.color.design_default_color_primary_variant));
        setSupportActionBar(toolbarProfile);

        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this,
                drawerLayout, toolbarProfile, 0, 0);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
    }

    public void onclick_add_profile_toolbar(View view) {
        showBottomSheet(view);
    }

    @Override
    public void selectedStory(Story story) {
    }

    private void setup_bottomNavigation() {
        bottom_navigation.setSelectedItemId(R.id.profile);

        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent = new Intent();

                switch (item.getItemId()) {
                    case R.id.home:
                        intent = new Intent(ProfileActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.explore:
                        intent = new Intent(ProfileActivity.this, ExploreActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.camera:
                        intent = new Intent("android.media.action.IMAGE_CAPTURE");
                        startActivity(intent);
                        break;
                    case R.id.like:
                        intent = new Intent(ProfileActivity.this, LikeActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.profile:
                        break;
                }
                return false;
            }
        });
    }

    public void showBottomSheet(View view) {
        ActionBottomDialogFragmentCreateNew actionBottomDialogFragmentCreateNew =
                ActionBottomDialogFragmentCreateNew.newInstance();
        actionBottomDialogFragmentCreateNew.show(((AppCompatActivity) this).getSupportFragmentManager(),
                ActionBottomDialogFragment.TAG);
    }

    public void onclick_iv_profile(View view) {
        Snackbar snackbar = Snackbar.make(view, "Opening Story :)", 1000);
        snackbar.setAnchorView(R.id.btn_editProfile)
                .show();
    }

    public void onclick_Followers(View view) {
        Snackbar snackbar = Snackbar.make(view, "Opening Followers List :)", 1000);
        snackbar.setAnchorView(R.id.btn_editProfile)
                .show();
    }

    public void onclick_Folloing(View view) {
        Snackbar snackbar = Snackbar.make(view, "Opening Following List :)", 1000);
        snackbar.setAnchorView(R.id.btn_editProfile)
                .show();
    }

    public void onclick_editProfile(View view) {
        Snackbar snackbar = Snackbar.make(view, "Edit Profile", 1000);
        snackbar.setAnchorView(R.id.btn_editProfile)
                .show();
    }

    public void onclick_promotions(View view) {
        Snackbar snackbar = Snackbar.make(view, "Promotions", 1000);
        snackbar.setAnchorView(R.id.btn_editProfile)
                .show();
    }

    public void onclick_insights(View view) {
        Snackbar snackbar = Snackbar.make(view, "Insights", 1000);
        snackbar.setAnchorView(R.id.btn_editProfile)
                .show();
    }

    public void onclick_tv_post(View view) {
        Snackbar snackbar = Snackbar.make(view, "show posts", 1000);
        snackbar.setAnchorView(R.id.btn_editProfile)
                .show();
    }
}