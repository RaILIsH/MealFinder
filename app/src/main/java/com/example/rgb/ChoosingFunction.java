package com.example.rgb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.rgb.ui.home.HomeFragment;

public class ChoosingFunction extends Activity {
    RadioGroup functions;
    RadioButton function1,function2,function3;
    Button onback;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choosingfunction);
        functions=(RadioGroup) findViewById(R.id.functions);
        function1=(RadioButton) findViewById(R.id.function1);
        function2=(RadioButton) findViewById(R.id.function2);
        function3=(RadioButton) findViewById(R.id.function3);
        onback=(Button) findViewById(R.id.onback);
        if(HomeFragment.what==1){
            function1.setChecked(true);
            function2.setChecked(false);
            function3.setChecked(false);
        }
        else if(HomeFragment.what==2){
            function1.setChecked(false);
            function2.setChecked(true);
            function3.setChecked(false);
        }
        else if(HomeFragment.what==3){
            function1.setChecked(false);
            function2.setChecked(false);
            function3.setChecked(true);
        }
        final Intent intent = new Intent(ChoosingFunction.this, MainActivity.class);
        onback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = functions.getCheckedRadioButtonId();
                if (id == (R.id.function1)) {
                    HomeFragment.what = 1;
                } else if (id == (R.id.function2)) {
                    HomeFragment.what = 2;
                } else if (id == (R.id.function3)) {
                    HomeFragment.what = 3;
                }
                startActivity(intent);
            }
        });
    }
}
