package com.example.rgb;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.rgb.ui.home.HomeFragment;

import org.w3c.dom.Text;

import uk.co.deanwild.flowtextview.FlowTextView;

public class ReceptInformation extends AppCompatActivity {
    TextView receptname;
    ImageView receptimage;
    TextView cnt;
    private LinearLayout lin;
    private LinearLayout ingredientsofrecept;
    private LayoutInflater layoutInflater;
    ImageView backlist;
    private void info(String[] text, LinearLayout lin, String[] ingredientsofrecept, LinearLayout ingredients){
        for(int i=0; i<ingredientsofrecept.length; i+=2){
            View view=layoutInflater.inflate(R.layout.ingredientsofrecept,null);
            TextView ingredient = view.findViewById(R.id.nameingredient);
            TextView size=view.findViewById(R.id.size);
            ingredient.setText(ingredientsofrecept[i]);
            size.setText(ingredientsofrecept[i+1]);
            ingredients.addView(view);
        }
        for(int i=0; i<text.length; i++){
            View view=layoutInflater.inflate(R.layout.info,null);
            TextView number = view.findViewById(R.id.number);
            String num=String.valueOf(i+1);
            number.setText(num);
            FlowTextView flowTextView=(FlowTextView) view.findViewById(R.id.ftv);
            flowTextView.setTextSize(80);
            flowTextView.invalidate();
            Typeface type = Typeface.createFromAsset(getAssets(),"fonts/sourcesanspro.otf");
            flowTextView.setTypeface(type);
            flowTextView.setText(text[i]);
            lin.addView(view);
        }
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receptinformation);
        receptname = (TextView) findViewById(R.id.receptname);
        receptimage = (ImageView) findViewById(R.id.receptimage);
        String whatisthis = getIntent().getStringExtra("recept");
        receptname.setText(whatisthis);
        layoutInflater=getLayoutInflater();
        lin=(LinearLayout) findViewById(R.id.scrollinfo);
        ingredientsofrecept=(LinearLayout) findViewById(R.id.ingredientsofrecept);
        backlist=(ImageView) findViewById(R.id.backlist);
        String receptphoto="";
        backlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        cnt=(TextView) findViewById(R.id.cnt);
        switch(whatisthis){
            case "Классический салат «Цезарь»":
                cnt.setText("4 порции");
                receptphoto=AllRecepts.classicsaladcesarimg;
                info(AllRecepts.classicsaladcesartext,lin,AllRecepts.classicsaladcesarlist,ingredientsofrecept);
                break;
            case "Салат «Цезарь» с креветками":
                cnt.setText("4 порции");
                receptphoto=AllRecepts.saladcesarskrevetkamiimg;
                info(AllRecepts.saladcesarskrevetkitext,lin,AllRecepts.saladcesarskrevetkamilist,ingredientsofrecept);
                break;
            case "Классический салат «Оливье»":
                cnt.setText("8 порций");
                receptphoto=AllRecepts.classicsaladolivyeimg;
                info(AllRecepts.classicsaladolivyetext,lin,AllRecepts.classicsaladolivyelist,ingredientsofrecept);
                break;
            case "Греческий салат":
                cnt.setText("5 порций");
                receptphoto=AllRecepts.greeksaladimg;
                info(AllRecepts.greeksaladtext,lin,AllRecepts.greeksaladlist,ingredientsofrecept);
                break;
            case "Классический борщ":
                cnt.setText("5 порций");
                receptphoto=AllRecepts.classicsoupborshimg;
                info(AllRecepts.classicsoupborshtext,lin,AllRecepts.classicsoupborshlist,ingredientsofrecept);
                break;
            case "Сметанно-чесночный соус":
                cnt.setText("6 порций");
                receptphoto=AllRecepts.smetannogarlivsauceimg;
                info(AllRecepts.smetannogarlivsaucetext,lin,AllRecepts.smetannogarlicsaucelist,ingredientsofrecept);
                break;
            case "Соус тартар":
                cnt.setText("4 порции");
                receptphoto=AllRecepts.tartartsauceimg;
                info(AllRecepts.tartarsaucetext,lin,AllRecepts.tartarsaucelist,ingredientsofrecept);
                break;
            default:
                cnt.setText("LOL");
                lin.removeAllViews();
                break;
        }
        Glide.with(getApplicationContext()).load(receptphoto).into(receptimage);
        View appetit=layoutInflater.inflate(R.layout.appetit,null);
        lin.addView(appetit);
    }
}
