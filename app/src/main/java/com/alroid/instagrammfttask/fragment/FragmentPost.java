package com.alroid.instagrammfttask.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alroid.instagrammfttask.DataGenerator;
import com.alroid.instagrammfttask.R;
import com.alroid.instagrammfttask.adapter.AdapterPostProfile;

public class FragmentPost extends Fragment {

    RecyclerView recyclerView_post;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_post, null);
        recyclerView_post = view.findViewById(R.id.recyclerView_post);
        AdapterPostProfile adapterPost = new AdapterPostProfile(getActivity(), DataGenerator.getPostsProfile(getActivity()));
        recyclerView_post.setLayoutManager(new GridLayoutManager(getActivity(), 3, RecyclerView.VERTICAL, false));
        recyclerView_post.setAdapter(adapterPost);

        return view;
    }

}
