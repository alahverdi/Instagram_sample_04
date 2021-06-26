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

public class ActionBottomDialogFragment extends BottomSheetDialogFragment
        implements View.OnClickListener {

    public static final String TAG = "ActionBottomDialog";

    public static ActionBottomDialogFragment newInstance() {
        return new ActionBottomDialogFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_bottom_sheet_more, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.tv_report).setOnClickListener(this);
        view.findViewById(R.id.tv_turn_on_notification).setOnClickListener(this);
        view.findViewById(R.id.tv_copy_link).setOnClickListener(this);
        view.findViewById(R.id.tv_share_to).setOnClickListener(this);
        view.findViewById(R.id.tv_unFollow).setOnClickListener(this);
        view.findViewById(R.id.tv_mute).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_report:
                Toast.makeText(getContext(), "Report", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_turn_on_notification:
                Toast.makeText(getContext(), "Notification", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_copy_link:
                Toast.makeText(getContext(), "Copy link", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_share_to:
                Toast.makeText(getContext(), "Share to", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_unFollow:
                Toast.makeText(getContext(), "Unfollow", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_mute:
                Toast.makeText(getContext(), "Mute", Toast.LENGTH_SHORT).show();
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
