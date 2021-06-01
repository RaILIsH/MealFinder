package com.example.rgb.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.PagerTabStrip;

import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.example.rgb.AllRecepts;
import com.example.rgb.R;
import com.example.rgb.ReceptInformation;
import com.example.rgb.Spisok;
import com.example.rgb.ui.home.HomeFragment;

import java.util.ArrayList;

import static com.example.rgb.R.drawable.czechrepublic;
import static com.example.rgb.R.drawable.france;
import static com.example.rgb.R.drawable.greece;
import static com.example.rgb.R.drawable.romania;
import static com.example.rgb.R.drawable.russia;
import static com.example.rgb.R.drawable.usa;


public class DashboardFragment extends Fragment {
    TextView textrecepts;
    private LottieAnimationView lottieAnimationView;
    private RelativeLayout rel, notused, notfounded;
    private LinearLayout lin;
    private LayoutInflater layoutInflater;
    private boolean lastcheck1(String[] ingredientsofthemeal){
        int cnt=0;
        for(int i=0; i<ingredientsofthemeal.length; i+=2){
            if(HomeFragment.spisoktorecepts.contains(ingredientsofthemeal[i])){
                cnt++;
            }
        }
        if(cnt>0){
            return true;
        }
        else{
            return false;
        }
    }
    private boolean lastcheck2(String[] ingredientsofthemeal){
        int cnt=0;
        for(int i=0; i<ingredientsofthemeal.length; i+=2){
            if(HomeFragment.spisoktorecepts.contains(ingredientsofthemeal[i])){
                cnt++;
            }
        }
        if(cnt>=(ingredientsofthemeal.length/2)/2){
            return true;
        }
        else{
            return false;
        }
    }
    private boolean lastcheck3(String[] ingredientsofthemeal){
        int cnt=0;
        for(int i=0; i<ingredientsofthemeal.length; i+=2){
            if(HomeFragment.spisoktorecepts.contains(ingredientsofthemeal[i])){
                cnt++;
            }
        }
        if(cnt>=(ingredientsofthemeal.length/2)-1){
            return true;
        }
        else{
            return false;
        }
    }
    private void onclick(View view, final Intent intent, final String string){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("recept", string);
                startActivity(intent);
            }
        });
    }
    private DashboardViewModel dashboardViewModel;
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
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        Intent intent = new Intent (DashboardFragment.this.getActivity(),ReceptInformation.class);

        notused=(RelativeLayout) root.findViewById(R.id.notused);
        notfounded=(RelativeLayout) root.findViewById(R.id.notfounded);
        int ifnotfounded=0;
        lin=(LinearLayout) root.findViewById(R.id.receptes);
        textrecepts=(TextView) root.findViewById(R.id.textrecepts);
        rel=(RelativeLayout) root.findViewById(R.id.reltorecepts);
        layoutInflater=getLayoutInflater();
        if(HomeFragment.loading){
            HomeFragment.loading=false;
            new CountDownTimer(4000, 500) {
                public void onTick(long millisUntilFinished) {
                    rel.setVisibility(View.VISIBLE);
                }
                public void onFinish() {
                    rel.setVisibility(View.GONE);
                }
            }.start();
        }
        if(HomeFragment.da){
            if(HomeFragment.spisoktorecepts.size()==0){
                notused.setVisibility(View.VISIBLE);
            }
            else {
                notused.setVisibility(View.GONE);
                if(HomeFragment.what==1){
                    if(lastcheck1(AllRecepts.classicsaladcesarlist)){
                        lastadd(lin,usa,AllRecepts.classicsaladcesarinfo,intent,AllRecepts.classicsaladcesarimg,"Классический салат «Цезарь»");
                        ifnotfounded++;
                    }
                    if(lastcheck1(AllRecepts.saladcesarskrevetkamilist)){
                        lastadd(lin,usa,AllRecepts.saladcesarskrevetkamiinfo,intent,AllRecepts.saladcesarskrevetkamiimg,"Салат «Цезарь» с креветками");
                        ifnotfounded++;
                    }
                    if(lastcheck1(AllRecepts.classicsaladolivyelist)){
                        lastadd(lin,russia,AllRecepts.classicsaladolivyeinfo,intent,AllRecepts.classicsaladolivyeimg,"Классический салат «Оливье»");
                        ifnotfounded++;
                    }
                    if(lastcheck1(AllRecepts.greeksaladlist)){
                        lastadd(lin,greece,AllRecepts.greeksaladinfo,intent,AllRecepts.greeksaladimg,"Греческий салат");
                        ifnotfounded++;
                    }
                    if(lastcheck1(AllRecepts.classicsoupborshlist)){
                        lastadd(lin,russia,AllRecepts.classicsoupborshinfo,intent,AllRecepts.classicsoupborshimg,"Классический борщ");
                        ifnotfounded++;
                    }
                    if(lastcheck1(AllRecepts.smetannogarlicsaucelist)){
                        lastadd(lin,romania,AllRecepts.smetannogarlicsauceinfo,intent,AllRecepts.smetannogarlivsauceimg,"Сметанно-чесночный соус");
                        ifnotfounded++;
                    }
                    if(lastcheck1(AllRecepts.tartarsaucelist)){
                        lastadd(lin,france,AllRecepts.tartarsauceinfo,intent,AllRecepts.tartartsauceimg,"Соус тартар");
                        ifnotfounded++;
                    }
                }
                else if(HomeFragment.what==2){
                    if(lastcheck2(AllRecepts.classicsaladcesarlist)){
                        lastadd(lin,usa,AllRecepts.classicsaladcesarinfo,intent,AllRecepts.classicsaladcesarimg,"Классический салат «Цезарь»");
                        ifnotfounded++;
                    }
                    if(lastcheck2(AllRecepts.saladcesarskrevetkamilist)){
                        lastadd(lin,usa,AllRecepts.saladcesarskrevetkamiinfo,intent,AllRecepts.saladcesarskrevetkamiimg,"Салат «Цезарь» с креветками");
                        ifnotfounded++;
                    }
                    if(lastcheck2(AllRecepts.classicsaladolivyelist)){
                        lastadd(lin,russia,AllRecepts.classicsaladolivyeinfo,intent,AllRecepts.classicsaladolivyeimg,"Классический салат «Оливье»");
                        ifnotfounded++;
                    }
                    if(lastcheck2(AllRecepts.greeksaladlist)){
                        lastadd(lin,greece,AllRecepts.greeksaladinfo,intent,AllRecepts.greeksaladimg,"Греческий салат");
                        ifnotfounded++;
                    }
                    if(lastcheck2(AllRecepts.classicsoupborshlist)){
                        lastadd(lin,russia,AllRecepts.classicsoupborshinfo,intent,AllRecepts.classicsoupborshimg,"Классический борщ");
                        ifnotfounded++;
                    }
                    if(lastcheck2(AllRecepts.smetannogarlicsaucelist)){
                        lastadd(lin,romania,AllRecepts.smetannogarlicsauceinfo,intent,AllRecepts.smetannogarlivsauceimg,"Сметанно-чесночный соус");
                        ifnotfounded++;
                    }
                    if(lastcheck2(AllRecepts.tartarsaucelist)){
                        lastadd(lin,france,AllRecepts.tartarsauceinfo,intent,AllRecepts.tartartsauceimg,"Соус тартар");
                        ifnotfounded++;
                    }
                }
                else if(HomeFragment.what==3){
                    if(lastcheck3(AllRecepts.classicsaladcesarlist)){
                        lastadd(lin,usa,AllRecepts.classicsaladcesarinfo,intent,AllRecepts.classicsaladcesarimg,"Классический салат «Цезарь»");
                        ifnotfounded++;
                    }
                    if(lastcheck3(AllRecepts.saladcesarskrevetkamilist)){
                        lastadd(lin,usa,AllRecepts.saladcesarskrevetkamiinfo,intent,AllRecepts.saladcesarskrevetkamiimg,"Салат «Цезарь» с креветками");
                        ifnotfounded++;
                    }
                    if(lastcheck3(AllRecepts.classicsaladolivyelist)){
                        lastadd(lin,russia,AllRecepts.classicsaladolivyeinfo,intent,AllRecepts.classicsaladolivyeimg,"Классический салат «Оливье»");
                        ifnotfounded++;
                    }
                    if(lastcheck3(AllRecepts.greeksaladlist)){
                        lastadd(lin,greece,AllRecepts.greeksaladinfo,intent,AllRecepts.greeksaladimg,"Греческий салат");
                        ifnotfounded++;
                    }
                    if(lastcheck3(AllRecepts.classicsoupborshlist)){
                        lastadd(lin,russia,AllRecepts.classicsoupborshinfo,intent,AllRecepts.classicsoupborshimg,"Классический борщ");
                        ifnotfounded++;
                    }
                    if(lastcheck3(AllRecepts.smetannogarlicsaucelist)){
                        lastadd(lin,romania,AllRecepts.smetannogarlicsauceinfo,intent,AllRecepts.smetannogarlivsauceimg,"Сметанно-чесночный соус");
                        ifnotfounded++;
                    }
                    if(lastcheck3(AllRecepts.tartarsaucelist)){
                        lastadd(lin,france,AllRecepts.tartarsauceinfo,intent,AllRecepts.tartartsauceimg,"Соус тартар");
                        ifnotfounded++;
                    }
                }
                if(ifnotfounded==0){
                    notfounded.setVisibility(View.VISIBLE);
                }
            }
        }
        return root;
    }
}