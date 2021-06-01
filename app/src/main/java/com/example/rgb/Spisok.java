package com.example.rgb;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import static com.example.rgb.R.drawable.france;
import static com.example.rgb.R.drawable.greece;
import static com.example.rgb.R.drawable.romania;
import static com.example.rgb.R.drawable.russia;
import static com.example.rgb.R.drawable.usa;
import static com.example.rgb.R.drawable.czechrepublic;


public class Spisok extends AppCompatActivity {
    private LinearLayout lin;
    private LayoutInflater layoutInflater;
    private LottieAnimationView animationView;
    private RelativeLayout rel;
    private ScrollView scrollvisible;
    private void onclick(View view, final Intent intent, final String string){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("recept", string);
                startActivity(intent);
            }
        });
    }
    private void adding(TextView name, TextView timeday, ImageView country, TextView countryname, TextView time, int R, String[] info){
        name.setText(info[0]);
        timeday.setText(info[1]);
        countryname.setText(info[2]);
        time.setText(info[3]);
        country.setImageResource(R);
    }
    private void lastadd(LinearLayout linn, int rcountryname, String[] info, Intent intent, String img, String namee){
        View view = layoutInflater.inflate(R.layout.newdefault, null);
        ImageView photoofrecept = view.findViewById(R.id.photoofrecept);
        TextView name = view.findViewById(R.id.nazvanie);
        TextView timeday = view.findViewById(R.id.timeday);
        ImageView country = view.findViewById(R.id.country);
        TextView countryname = view.findViewById(R.id.countryname);
        TextView texttime = view.findViewById(R.id.texttime);
        adding(name,timeday,country,countryname,texttime, rcountryname, info);
        Glide.with(this).load(img).into(photoofrecept);
        linn.addView(view);
        onclick(view,intent,namee);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spisok);
        lin = (LinearLayout) findViewById(R.id.spisok);
        layoutInflater=getLayoutInflater();
        final Intent intent = new Intent(Spisok.this,ReceptInformation.class);
        rel=(RelativeLayout) findViewById(R.id.rel);
        scrollvisible=(ScrollView) findViewById(R.id.scrolvisible);
        String category=getIntent().getStringExtra("category");
        String src="";
        String whatisthis="";
        new CountDownTimer(4000, 500) {
            public void onTick(long millisUntilFinished) {
                scrollvisible.setVisibility(View.GONE);
            }
            public void onFinish() {
                scrollvisible.setVisibility(View.VISIBLE);
                rel.setVisibility(View.GONE);
            }
        }.start();
        if(category.equals("breakfast")){
            for(int i=1; i<=1; i++){
                switch(i){
                    case 1:
                        lastadd(lin,greece,AllRecepts.greeksaladinfo,intent,AllRecepts.greeksaladimg,"Греческий салат");
                        break;
                    default:
                        break;
                }
            }
        }
        else if(category.equals("mainmeal")){
            for(int i=1; i<=1; i++){

            }
        }
        else if(category.equals("soups")){
            for(int i=1; i<=1; i++){
                switch(i){
                    case 1:
                        lastadd(lin,russia,AllRecepts.classicsoupborshinfo,intent,AllRecepts.classicsoupborshimg,"Классический борщ");
                        break;
                }
            }
        }
        else if(category.equals("desserts")){
            for(int i=1; i<=1; i++){

            }
        }
        else if(category.equals("salads")){
            for(int i=1; i<=4; i++){
                switch(i) {
                    case 1:
                        lastadd(lin, usa, AllRecepts.classicsaladcesarinfo, intent, AllRecepts.classicsaladcesarimg, "Классический салат «Цезарь»");
                        break;
                    case 2:
                        lastadd(lin,usa,AllRecepts.saladcesarskrevetkamiinfo,intent,AllRecepts.saladcesarskrevetkamiimg,"Салат «Цезарь» с креветками");
                        break;
                    case 3:
                        lastadd(lin,russia,AllRecepts.classicsaladolivyeinfo,intent,AllRecepts.classicsaladolivyeimg,"Классический салат «Оливье»");
                        break;
                    case 4:
                        lastadd(lin,greece,AllRecepts.greeksaladinfo,intent,AllRecepts.greeksaladimg,"Греческий салат");
                }
            }
        }
        else if(category.equals("sauces")){
            for(int i=1; i<=2; i++){
                switch(i){
                    case 1:
                        lastadd(lin,romania,AllRecepts.smetannogarlicsauceinfo,intent,AllRecepts.smetannogarlivsauceimg,"Сметанно-чесночный соус");
                        break;
                    case 2:
                        lastadd(lin,france,AllRecepts.tartarsauceinfo,intent,AllRecepts.tartartsauceimg,"Соус тартар");
                        break;
                }
            }
        }
    }
}
