package com.example.rgb.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import com.example.rgb.ChoosingFunction;
import com.example.rgb.MainActivity;
import com.example.rgb.R;
import com.example.rgb.Search;
import com.example.rgb.SettingsInfo;
import com.example.rgb.ui.dashboard.DashboardFragment;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    public static boolean da=false;
    private HomeViewModel homeViewModel;
    private LinearLayout ingredients;
    private LayoutInflater layoutInflater;
    private RelativeLayout dobavte,tofunctions;
    private Button torecepts;
    private TextView functionname;
    public static boolean loading=false;
    public static int what=1;
    public static ArrayList <String> spisoktorecepts =new ArrayList<String>();
    private void adding(TextView text, String texttoadd, LinearLayout lin, View view,TextView number, int i){
        text.setText(texttoadd);
        String str=Integer.toString(i);
        number.setText(str);
        lin.addView(view);
    }
    ImageButton search;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        search=root.findViewById(R.id.buttonplus);
        final Intent add = new Intent(HomeFragment.this.getActivity(), Search.class);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(add);
            }
        });
        ingredients=(LinearLayout) root.findViewById(R.id.ingredientsadd);
        layoutInflater=getLayoutInflater();
        dobavte=(RelativeLayout) root.findViewById(R.id.dobavte);
        tofunctions = (RelativeLayout) root.findViewById(R.id.tofunctions);
        torecepts=(Button) root.findViewById(R.id.torecepts);
        for(int i=0; i<Search.whattoadd.length; i++){
            if(Search.whattoadd[i]){
                dobavte.setVisibility(View.GONE);
                break;
            }
        }
        int cnt=1;
        for(int i=0; i<Search.whattoadd.length; i++){
            View view = layoutInflater.inflate(R.layout.addingredients,null);
            TextView text = view.findViewById(R.id.textingredient);
            TextView number = view.findViewById(R.id.numberofingredient);
            if(Search.whattoadd[i]){
                switch(i){
                    case 0:
                        adding(text,"Абрикос",ingredients,view,number,cnt);
                        spisoktorecepts.add("Абрикос");
                        cnt++;
                        break;
                    case 1:
                        adding(text,"Авокадо",ingredients,view,number,cnt);
                        spisoktorecepts.add("Авокадо");
                        cnt++;
                        break;
                    case 2:
                        adding(text,"Ананас",ingredients,view,number,cnt);
                        spisoktorecepts.add("Ананас");
                        cnt++;
                        break;
                    case 3:
                        adding(text,"Апельсин",ingredients,view,number,cnt);
                        spisoktorecepts.add("Апельсин");
                        cnt++;
                        break;
                    case 4:
                        adding(text,"Арбуз",ingredients,view,number,cnt);
                        spisoktorecepts.add("Арбуз");
                        cnt++;
                        break;
                    case 5:
                        adding(text,"Базилик",ingredients,view,number,cnt);
                        spisoktorecepts.add("Базилик");
                        cnt++;
                        break;
                    case 6:
                        adding(text,"Баклажан",ingredients,view,number,cnt);
                        spisoktorecepts.add("Баклажан");
                        cnt++;
                        break;
                    case 7:
                        adding(text,"Банан",ingredients,view,number,cnt);
                        spisoktorecepts.add("Банан");
                        cnt++;
                        break;
                    case 8:
                        adding(text,"Баранина",ingredients,view,number,cnt);
                        spisoktorecepts.add("Баранина");
                        cnt++;
                        break;
                    case 9:
                        adding(text,"Бекон",ingredients,view,number,cnt);
                        spisoktorecepts.add("Бекон");
                        cnt++;
                        break;
                    case 10:
                        adding(text,"Брокколи",ingredients,view,number,cnt);
                        spisoktorecepts.add("Брокколи");
                        cnt++;
                        break;
                    case 11:
                        adding(text,"Брусника",ingredients,view,number,cnt);
                        spisoktorecepts.add("Брусника");
                        cnt++;
                        break;
                    case 12:
                        adding(text,"Ветчина",ingredients,view,number,cnt);
                        spisoktorecepts.add("Ветчина");
                        cnt++;
                        break;
                    case 13:
                        adding(text,"Виноград",ingredients,view,number,cnt);
                        spisoktorecepts.add("Виноград");
                        cnt++;
                        break;
                    case 14:
                        adding(text,"Вишня",ingredients,view,number,cnt);
                        spisoktorecepts.add("Вишня");
                        cnt++;
                        break;
                    case 15:
                        adding(text,"Говядина",ingredients,view,number,cnt);
                        spisoktorecepts.add("Говядина");
                        cnt++;
                        break;
                    case 16:
                        adding(text,"Голубика",ingredients,view,number,cnt);
                        spisoktorecepts.add("Голубика");
                        cnt++;
                        break;
                    case 17:
                        adding(text,"Горошек зелёный",ingredients,view,number,cnt);
                        spisoktorecepts.add("Горошек зелёный");
                        cnt++;
                        break;
                    case 18:
                        adding(text,"Горчица",ingredients,view,number,cnt);
                        spisoktorecepts.add("Горчица");
                        cnt++;
                        break;
                    case 19:
                        adding(text,"Гранат",ingredients,view,number,cnt);
                        spisoktorecepts.add("Гранат");
                        cnt++;
                        break;
                    case 20:
                        adding(text,"Грейпфрут",ingredients,view,number,cnt);
                        spisoktorecepts.add("Грейпфрут");
                        cnt++;
                        break;
                    case 21:
                        adding(text,"Гречневая крупа",ingredients,view,number,cnt);
                        spisoktorecepts.add("Гречневая крупа");
                        cnt++;
                        break;
                    case 22:
                        adding(text,"Грибы",ingredients,view,number,cnt);
                        spisoktorecepts.add("Грибы");
                        cnt++;
                        break;
                    case 23:
                        adding(text,"Груша",ingredients,view,number,cnt);
                        spisoktorecepts.add("Груша");
                        cnt++;
                        break;
                    case 24:
                        adding(text,"Гусь",ingredients,view,number,cnt);
                        spisoktorecepts.add("Гусь");
                        cnt++;
                        break;
                    case 25:
                        adding(text,"Дрожжи",ingredients,view,number,cnt);
                        spisoktorecepts.add("Дрожжи");
                        cnt++;
                        break;
                    case 26:
                        adding(text,"Дыня",ingredients,view,number,cnt);
                        spisoktorecepts.add("Дыня");
                        cnt++;
                        break;
                    case 27:
                        adding(text,"Ежевика",ingredients,view,number,cnt);
                        spisoktorecepts.add("Ежевика");
                        cnt++;
                        break;
                    case 28:
                        adding(text,"Желатин",ingredients,view,number,cnt);
                        spisoktorecepts.add("Желатин");
                        cnt++;
                        break;
                    case 29:
                        adding(text,"Зелень",ingredients,view,number,cnt);
                        spisoktorecepts.add("Зелень");
                        cnt++;
                        break;
                    case 30:
                        adding(text,"Изюм",ingredients,view,number,cnt);
                        spisoktorecepts.add("Изюм");
                        cnt++;
                        break;
                    case 31:
                        adding(text,"Икра",ingredients,view,number,cnt);
                        spisoktorecepts.add("Икра");
                        cnt++;
                        break;
                    case 32:
                        adding(text,"Имбирь",ingredients,view,number,cnt);
                        spisoktorecepts.add("Имбирь");
                        cnt++;
                        break;
                    case 33:
                        adding(text,"Индейка",ingredients,view,number,cnt);
                        spisoktorecepts.add("Индейка");
                        cnt++;
                        break;
                    case 34:
                        adding(text,"Йогурт",ingredients,view,number,cnt);
                        spisoktorecepts.add("Йогурт");
                        cnt++;
                        break;
                    case 35:
                        adding(text,"Кабачки",ingredients,view,number,cnt);
                        spisoktorecepts.add("Кабачки");
                        cnt++;
                        break;
                    case 36:
                        adding(text,"Капуста",ingredients,view,number,cnt);
                        spisoktorecepts.add("Капуста");
                        cnt++;
                        break;
                    case 37:
                        adding(text,"Картофель",ingredients,view,number,cnt);
                        spisoktorecepts.add("Картофель");
                        cnt++;
                        break;
                    case 38:
                        adding(text,"Кефир",ingredients,view,number,cnt);
                        spisoktorecepts.add("Кефир");
                        cnt++;
                        break;
                    case 39:
                        adding(text,"Кетчуп",ingredients,view,number,cnt);
                        spisoktorecepts.add("Кетчуп");
                        cnt++;
                        break;
                    case 40:
                        adding(text,"Киви",ingredients,view,number,cnt);
                        spisoktorecepts.add("Киви");
                        cnt++;
                        break;
                    case 41:
                        adding(text,"Кинза",ingredients,view,number,cnt);
                        spisoktorecepts.add("Кинза");
                        cnt++;
                        break;
                    case 42:
                        adding(text,"Клубника",ingredients,view,number,cnt);
                        spisoktorecepts.add("Клубника");
                        cnt++;
                        break;
                    case 43:
                        adding(text,"Клюква",ingredients,view,number,cnt);
                        spisoktorecepts.add("Клюква");
                        cnt++;
                        break;
                    case 44:
                        adding(text,"Кокос",ingredients,view,number,cnt);
                        spisoktorecepts.add("Кокос");
                        cnt++;
                        break;
                    case 45:
                        adding(text,"Колбаса варёная",ingredients,view,number,cnt);
                        spisoktorecepts.add("Колбаса варёная");
                        cnt++;
                        break;
                    case 46:
                        adding(text,"Колбаса копчёная",ingredients,view,number,cnt);
                        spisoktorecepts.add("Колбаса копчёная");
                        cnt++;
                        break;
                    case 47:
                        adding(text,"Корица",ingredients,view,number,cnt);
                        spisoktorecepts.add("Корица");
                        cnt++;
                        break;
                    case 48:
                        adding(text,"Крабовые палочки",ingredients,view,number,cnt);
                        spisoktorecepts.add("Крабовые палочки");
                        cnt++;
                        break;
                    case 49:
                        adding(text,"Крахмал",ingredients,view,number,cnt);
                        spisoktorecepts.add("Крахмал");
                        cnt++;
                        break;
                    case 50:
                        adding(text,"Креветки",ingredients,view,number,cnt);
                        spisoktorecepts.add("Креветки");
                        cnt++;
                        break;
                    case 51:
                        adding(text,"Кролик",ingredients,view,number,cnt);
                        spisoktorecepts.add("Кролик");
                        cnt++;
                        break;
                    case 52:
                        adding(text,"Кукуруза",ingredients,view,number,cnt);
                        spisoktorecepts.add("Кукуруза");
                        cnt++;
                        break;
                    case 53:
                        adding(text,"Кунжут",ingredients,view,number,cnt);
                        spisoktorecepts.add("Кунжут");
                        cnt++;
                        break;
                    case 54:
                        adding(text,"Куриная грудка",ingredients,view,number,cnt);
                        spisoktorecepts.add("Куриная грудка");
                        cnt++;
                        break;
                    case 55:
                        adding(text,"Куриное крыло",ingredients,view,number,cnt);
                        spisoktorecepts.add("Куриное крыло");
                        cnt++;
                        break;
                    case 56:
                        adding(text,"Лаваш",ingredients,view,number,cnt);
                        spisoktorecepts.add("Лаваш");
                        cnt++;
                        break;
                    case 57:
                        adding(text,"Лавровый лист",ingredients,view,number,cnt);
                        spisoktorecepts.add("Лавровый лист");
                        cnt++;
                        break;
                    case 58:
                        adding(text,"Лайм",ingredients,view,number,cnt);
                        spisoktorecepts.add("Лайм");
                        cnt++;
                        break;
                    case 59:
                        adding(text,"Лапша",ingredients,view,number,cnt);
                        spisoktorecepts.add("Лапша");
                        cnt++;
                        break;
                    case 60:
                        adding(text,"Лимон",ingredients,view,number,cnt);
                        spisoktorecepts.add("Лимон");
                        cnt++;
                        break;
                    case 61:
                        adding(text,"Лосось",ingredients,view,number,cnt);
                        spisoktorecepts.add("Лосось");
                        cnt++;
                        break;
                    case 62:
                        adding(text,"Лук зелёный",ingredients,view,number,cnt);
                        spisoktorecepts.add("Лук зелёный");
                        cnt++;
                        break;
                    case 63:
                        adding(text,"Лук репчатый",ingredients,view,number,cnt);
                        spisoktorecepts.add("Лук репчатый");
                        cnt++;
                        break;
                    case 64:
                        adding(text,"Майонез",ingredients,view,number,cnt);
                        spisoktorecepts.add("Майонез");
                        cnt++;
                        break;
                    case 65:
                        adding(text,"Макароны",ingredients,view,number,cnt);
                        spisoktorecepts.add("Макароны");
                        cnt++;
                        break;
                    case 66:
                        adding(text,"Малина",ingredients,view,number,cnt);
                        spisoktorecepts.add("Малина");
                        cnt++;
                        break;
                    case 67:
                        adding(text,"Манная крупа",ingredients,view,number,cnt);
                        spisoktorecepts.add("Манная крупа");
                        cnt++;
                        break;
                    case 68:
                        adding(text,"Маслины",ingredients,view,number,cnt);
                        spisoktorecepts.add("Маслины");
                        cnt++;
                        break;
                    case 69:
                        adding(text,"Оливковое масло",ingredients,view,number,cnt);
                        spisoktorecepts.add("Оливковое масло");
                        cnt++;
                        break;
                    case 70:
                        adding(text,"Подсолнечное масло",ingredients,view,number,cnt);
                        spisoktorecepts.add("Подсолнечное масло");
                        cnt++;
                        break;
                    case 71:
                        adding(text,"Растительное масло",ingredients,view,number,cnt);
                        spisoktorecepts.add("Растительное масло");
                        cnt++;
                        break;
                    case 72:
                        adding(text,"Сливочное масло",ingredients,view,number,cnt);
                        spisoktorecepts.add("Сливочное масло");
                        cnt++;
                        break;
                    case 73:
                        adding(text,"Мёд",ingredients,view,number,cnt);
                        spisoktorecepts.add("Мёд");
                        cnt++;
                        break;
                    case 74:
                        adding(text,"Мидии",ingredients,view,number,cnt);
                        spisoktorecepts.add("Мидии");
                        cnt++;
                        break;
                    case 75:
                        adding(text,"Молоко",ingredients,view,number,cnt);
                        spisoktorecepts.add("Молоко");
                        cnt++;
                        break;
                    case 76:
                        adding(text,"Морковь",ingredients,view,number,cnt);
                        spisoktorecepts.add("Морковь");
                        cnt++;
                        break;
                    case 77:
                        adding(text,"Мука",ingredients,view,number,cnt);
                        spisoktorecepts.add("Мука");
                        cnt++;
                        break;
                    case 78:
                        adding(text,"Мята",ingredients,view,number,cnt);
                        spisoktorecepts.add("Мята");
                        cnt++;
                        break;
                    case 79:
                        adding(text,"Облепиха",ingredients,view,number,cnt);
                        spisoktorecepts.add("Облепиха");
                        cnt++;
                        break;
                    case 80:
                        adding(text,"Огурец",ingredients,view,number,cnt);
                        spisoktorecepts.add("Огурец");
                        cnt++;
                        break;
                    case 81:
                        adding(text,"Огурцы солёные",ingredients,view,number,cnt);
                        spisoktorecepts.add("Огурцы солёные");
                        cnt++;
                        break;
                    case 82:
                        adding(text,"Оливки",ingredients,view,number,cnt);
                        spisoktorecepts.add("Оливки");
                        cnt++;
                        break;
                    case 83:
                        adding(text,"Орегано",ingredients,view,number,cnt);
                        spisoktorecepts.add("Орегано");
                        cnt++;
                        break;
                    case 84:
                        adding(text,"Грецкие орехи",ingredients,view,number,cnt);
                        spisoktorecepts.add("Грецкие орехи");
                        cnt++;
                        break;
                    case 85:
                        adding(text,"Паприка",ingredients,view,number,cnt);
                        spisoktorecepts.add("Паприка");
                        cnt++;
                        break;
                    case 86:
                        adding(text,"Персик",ingredients,view,number,cnt);
                        spisoktorecepts.add("Персик");
                        cnt++;
                        break;
                    case 87:
                        adding(text,"Болгарский перец",ingredients,view,number,cnt);
                        spisoktorecepts.add("Болгарский перец");
                        cnt++;
                        break;
                    case 88:
                        adding(text,"Перец чили",ingredients,view,number,cnt);
                        spisoktorecepts.add("Перец чили");
                        cnt++;
                        break;
                    case 89:
                        adding(text,"Перловая крупа",ingredients,view,number,cnt);
                        spisoktorecepts.add("Перловая крупа");
                        cnt++;
                        break;
                    case 90:
                        adding(text,"Петрушка",ingredients,view,number,cnt);
                        spisoktorecepts.add("Петрушка");
                        cnt++;
                        break;
                    case 91:
                        adding(text,"Печенье",ingredients,view,number,cnt);
                        spisoktorecepts.add("Печенье");
                        cnt++;
                        break;
                    case 92:
                        adding(text,"Пита",ingredients,view,number,cnt);
                        spisoktorecepts.add("Пита");
                        cnt++;
                        break;
                    case 93:
                        adding(text,"Помидор",ingredients,view,number,cnt);
                        spisoktorecepts.add("Помидор");
                        cnt++;
                        break;
                    case 94:
                        adding(text,"Редис",ingredients,view,number,cnt);
                        spisoktorecepts.add("Редис");
                        cnt++;
                        break;
                    case 95:
                        adding(text,"Рис",ingredients,view,number,cnt);
                        spisoktorecepts.add("Рис");
                        cnt++;
                        break;
                    case 96:
                        adding(text,"Розмарин",ingredients,view,number,cnt);
                        spisoktorecepts.add("Розмарин");
                        cnt++;
                        break;
                    case 97:
                        adding(text,"Руккола",ingredients,view,number,cnt);
                        spisoktorecepts.add("Руккола");
                        cnt++;
                        break;
                    case 98:
                        adding(text,"Салат",ingredients,view,number,cnt);
                        spisoktorecepts.add("Салат");
                        cnt++;
                        break;
                    case 99:
                        adding(text,"Сало",ingredients,view,number,cnt);
                        spisoktorecepts.add("Сало");
                        cnt++;
                        break;
                    case 100:
                        adding(text,"Салями",ingredients,view,number,cnt);
                        spisoktorecepts.add("Салями");
                        cnt++;
                        break;
                    case 101:
                        adding(text,"Сахар",ingredients,view,number,cnt);
                        spisoktorecepts.add("Сахар");
                        cnt++;
                        break;
                    case 102:
                        adding(text,"Сахарная пудра",ingredients,view,number,cnt);
                        spisoktorecepts.add("Сахарная пудра");
                        cnt++;
                        break;
                    case 103:
                        adding(text,"Свекла",ingredients,view,number,cnt);
                        spisoktorecepts.add("Свекла");
                        cnt++;
                        break;
                    case 104:
                        adding(text,"Свинина",ingredients,view,number,cnt);
                        spisoktorecepts.add("Свинина");
                        cnt++;
                        break;
                    case 105:
                        adding(text,"Сгущённое молоко",ingredients,view,number,cnt);
                        spisoktorecepts.add("Сгущённое молоко");
                        cnt++;
                        break;
                    case 106:
                        adding(text,"Сельдерей",ingredients,view,number,cnt);
                        spisoktorecepts.add("Сельдерей");
                        cnt++;
                        break;
                    case 107:
                        adding(text,"Селёдка",ingredients,view,number,cnt);
                        spisoktorecepts.add("Селёдка");
                        cnt++;
                        break;
                    case 108:
                        adding(text,"Сёмга",ingredients,view,number,cnt);
                        spisoktorecepts.add("Сёмга");
                        cnt++;
                        break;
                    case 109:
                        adding(text,"Скумбрия",ingredients,view,number,cnt);
                        spisoktorecepts.add("Скумбрия");
                        cnt++;
                        break;
                    case 110:
                        adding(text,"Сливки",ingredients,view,number,cnt);
                        spisoktorecepts.add("Сливки");
                        cnt++;
                        break;
                    case 111:
                        adding(text,"Сметана",ingredients,view,number,cnt);
                        spisoktorecepts.add("Сметана");
                        cnt++;
                        break;
                    case 112:
                        adding(text,"Смородина",ingredients,view,number,cnt);
                        spisoktorecepts.add("Смородина");
                        cnt++;
                        break;
                    case 113:
                        adding(text,"Сода",ingredients,view,number,cnt);
                        spisoktorecepts.add("Сода");
                        cnt++;
                        break;
                    case 114:
                        adding(text,"Сом",ingredients,view,number,cnt);
                        spisoktorecepts.add("Сом");
                        cnt++;
                        break;
                    case 115:
                        adding(text,"Судак",ingredients,view,number,cnt);
                        spisoktorecepts.add("Судак");
                        cnt++;
                        break;
                    case 116:
                        adding(text,"Сухофрукты",ingredients,view,number,cnt);
                        spisoktorecepts.add("Сухофрукты");
                        cnt++;
                        break;
                    case 117:
                        adding(text,"Сыр моцарелла",ingredients,view,number,cnt);
                        spisoktorecepts.add("Сыр моцарелла");
                        cnt++;
                        break;
                    case 118:
                        adding(text,"Сыр пармезан",ingredients,view,number,cnt);
                        spisoktorecepts.add("Сыр пармезан");
                        cnt++;
                        break;
                    case 119:
                        adding(text,"Сыр творожный",ingredients,view,number,cnt);
                        spisoktorecepts.add("Сыр творожный");
                        cnt++;
                        break;
                    case 120:
                        adding(text,"Сыр чеддер",ingredients,view,number,cnt);
                        spisoktorecepts.add("Сыр чеддер");
                        cnt++;
                        break;
                    case 121:
                        adding(text,"Творог",ingredients,view,number,cnt);
                        spisoktorecepts.add("Творог");
                        cnt++;
                        break;
                    case 122:
                        adding(text,"Тесто слоёное",ingredients,view,number,cnt);
                        spisoktorecepts.add("Тесто слоёное");
                        cnt++;
                        break;
                    case 123:
                        adding(text,"Тимьян",ingredients,view,number,cnt);
                        spisoktorecepts.add("Тимьян");
                        cnt++;
                        break;
                    case 124:
                        adding(text,"Тмин",ingredients,view,number,cnt);
                        spisoktorecepts.add("Тмин");
                        cnt++;
                        break;
                    case 125:
                        adding(text,"Тортилья",ingredients,view,number,cnt);
                        spisoktorecepts.add("Тортилья");
                        cnt++;
                        break;
                    case 126:
                        adding(text,"Томатная паста",ingredients,view,number,cnt);
                        spisoktorecepts.add("Томатная паста");
                        cnt++;
                        break;
                    case 127:
                        adding(text,"Треска",ingredients,view,number,cnt);
                        spisoktorecepts.add("Треска");
                        cnt++;
                        break;
                    case 128:
                        adding(text,"Тунец",ingredients,view,number,cnt);
                        spisoktorecepts.add("Тунец");
                        cnt++;
                        break;
                    case 129:
                        adding(text,"Тыква",ingredients,view,number,cnt);
                        spisoktorecepts.add("Тыква");
                        cnt++;
                        break;
                    case 130:
                        adding(text,"Укроп",ingredients,view,number,cnt);
                        spisoktorecepts.add("Укроп");
                        cnt++;
                        break;
                    case 131:
                        adding(text,"Уксус",ingredients,view,number,cnt);
                        spisoktorecepts.add("Уксус");
                        cnt++;
                        break;
                    case 132:
                        adding(text,"Устрицы",ingredients,view,number,cnt);
                        spisoktorecepts.add("Устрицы");
                        cnt++;
                        break;
                    case 133:
                        adding(text,"Утка",ingredients,view,number,cnt);
                        spisoktorecepts.add("Утка");
                        cnt++;
                        break;
                    case 134:
                        adding(text,"Фасоль",ingredients,view,number,cnt);
                        spisoktorecepts.add("Фасоль");
                        cnt++;
                        break;
                    case 135:
                        adding(text,"Форель",ingredients,view,number,cnt);
                        spisoktorecepts.add("Форель");
                        cnt++;
                        break;
                    case 136:
                        adding(text,"Хлеб белый",ingredients,view,number,cnt);
                        spisoktorecepts.add("Хлеб белый");
                        cnt++;
                        break;
                    case 137:
                        adding(text,"Хурма",ingredients,view,number,cnt);
                        spisoktorecepts.add("Хурма");
                        cnt++;
                        break;
                    case 138:
                        adding(text,"Черешня",ingredients,view,number,cnt);
                        spisoktorecepts.add("Черешня");
                        cnt++;
                        break;
                    case 139:
                        adding(text,"Черника",ingredients,view,number,cnt);
                        spisoktorecepts.add("Черника");
                        cnt++;
                        break;
                    case 140:
                        adding(text,"Чернослив",ingredients,view,number,cnt);
                        spisoktorecepts.add("Чернослив");
                        cnt++;
                        break;
                    case 141:
                        adding(text,"Чеснок",ingredients,view,number,cnt);
                        spisoktorecepts.add("Чеснок");
                        cnt++;
                        break;
                    case 142:
                        adding(text,"Шампиньоны",ingredients,view,number,cnt);
                        spisoktorecepts.add("Шампиньоны");
                        cnt++;
                        break;
                    case 143:
                        adding(text,"Горький шоколад",ingredients,view,number,cnt);
                        spisoktorecepts.add("Горький шоколад");
                        cnt++;
                        break;
                    case 144:
                        adding(text,"Молочный шоколад",ingredients,view,number,cnt);
                        spisoktorecepts.add("Молочный шоколад");
                        cnt++;
                        break;
                    case 145:
                        adding(text,"Шпинат",ingredients,view,number,cnt);
                        spisoktorecepts.add("Шпинат");
                        cnt++;
                        break;
                    case 146:
                        adding(text,"Щавель",ingredients,view,number,cnt);
                        spisoktorecepts.add("Щавель");
                        cnt++;
                        break;
                    case 147:
                        adding(text,"Щука",ingredients,view,number,cnt);
                        spisoktorecepts.add("Щука");
                        cnt++;
                        break;
                    case 148:
                        adding(text,"Яблоко",ingredients,view,number,cnt);
                        spisoktorecepts.add("Яблоко");
                        cnt++;
                        break;
                    case 149:
                        adding(text,"Яйцо куриное",ingredients,view,number,cnt);
                        spisoktorecepts.add("Яйцо куриное");
                        cnt++;
                        break;
                }
            }
        }
        final Intent intent2 = new Intent(HomeFragment.this.getActivity(), ChoosingFunction.class);
        functionname=(TextView) root.findViewById(R.id.functionname);
        if(what==1){
            functionname.setText("Совпадение по одному");
        }
        else if(what==2){
            functionname.setText("Совпадение по половине");
        }
        else if(what==3){
            functionname.setText("Точное совпадение");
        }
        tofunctions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
            }
        });
        torecepts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                da=true;
                loading=true;
                Navigation.findNavController(v).navigate(R.id.navigation_dashboard);
            }
        });
        return root;
    }

}