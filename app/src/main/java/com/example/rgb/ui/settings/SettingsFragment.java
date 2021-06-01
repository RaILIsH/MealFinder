package com.example.rgb.ui.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.rgb.R;
import com.example.rgb.Search;
import com.example.rgb.SettingsInfo;
import com.example.rgb.ui.home.HomeViewModel;

public class SettingsFragment extends Fragment {
    private HomeViewModel homeViewModel;
    Button howtouse;
    Button call;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_settings, container, false);
        final Intent intent = new Intent(SettingsFragment.this.getActivity(), SettingsInfo.class);
        howtouse=root.findViewById(R.id.howtouse);
        call=root.findViewById(R.id.call);
        howtouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("whatisthis","howtouse");
                startActivity(intent);
            }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("whatisthis","call" );
                startActivity(intent);
            }
        });
        return root;
    }
}