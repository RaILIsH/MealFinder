package com.example.rgb.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.rgb.R;
import com.example.rgb.Spisok;

public class NotificationsFragment extends Fragment {
    ImageView breakfast,dinner,soups,desserts,salads,sauces;
    private NotificationsViewModel notificationsViewModel;
    private void press(ImageView button, final Intent intent, final String string){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("category",string);
                startActivity(intent);
            }
        });
    }
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        final Intent intent = new Intent(NotificationsFragment.this.getActivity(), Spisok.class);
        breakfast = root.findViewById(R.id.imgbreakfast);
        dinner=root.findViewById(R.id.imgdinner);
        soups = root.findViewById(R.id.imgsoups);
        desserts = root.findViewById(R.id.imgdesserts);
        salads = root.findViewById(R.id.imgsalads);
        sauces = root.findViewById(R.id.imgsauces);
        press(desserts,intent,"desserts");
        press(breakfast,intent,"breakfast");
        press(soups,intent,"soups");
        press(dinner,intent,"mainmeal");
        press(salads,intent,"salads");
        press(sauces,intent,"sauces");
        return root;
    }
}