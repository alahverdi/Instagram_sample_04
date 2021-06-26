package com.alroid.instagrammfttask.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.alroid.instagrammfttask.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.snackbar.Snackbar;

public class ActionBottomDialogFragmentCreateNew extends BottomSheetDialogFragment
        implements View.OnClickListener {

    public static final String TAG = "ActionBottomDialogCreateNew";

    public static ActionBottomDialogFragmentCreateNew newInstance() {
        return new ActionBottomDialogFragmentCreateNew();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_bottom_sheet_create_new, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.tv_feedPost).setOnClickListener(this);
        view.findViewById(R.id.tv_story).setOnClickListener(this);
        view.findViewById(R.id.tv_highlights).setOnClickListener(this);
        view.findViewById(R.id.tv_igtv).setOnClickListener(this);
        view.findViewById(R.id.tv_guide).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_feedPost:
                Toast.makeText(getContext(), "Feed Post", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_story:
                Toast.makeText(getContext(), "Story", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_highlights:
                Toast.makeText(getContext(), "Story Highlights", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_igtv:
                Toast.makeText(getContext(), "IGTV video", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_guide:
                Toast.makeText(getContext(), "Guide", Toast.LENGTH_SHORT).show();
                break;
        }
        dismiss();
    }

    public interface ItemClickListener {
        void onItemClick(String item);
    }

    @Override
    public int getTheme() {
        return R.style.AppBottomSheetDialogTheme;
    }
}
