package com.example.rgb;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.rgb.ui.home.HomeFragment;

import org.w3c.dom.Text;

import java.math.BigInteger;
import java.util.ArrayList;

public class Search extends AppCompatActivity {
    private void checking(CheckBox cb, final int i){
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    whattoadd[i]=true;
                }
                else{
                    whattoadd[i]=false;
                }
            }

        });
    }
    Button addingredients;
    CheckBox cb0,cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24,cb25,cb26,cb27,cb28,cb29,cb30;
    CheckBox cb31,cb32,cb33,cb34,cb35,cb36,cb37,cb38,cb39,cb40,cb41,cb42,cb43,cb44,cb45,cb46,cb47,cb48,cb49,cb50,cb51,cb52,cb53,cb54,cb55,cb56,cb57,cb58,cb59,cb60;
    CheckBox cb61,cb62,cb63,cb64,cb65,cb66,cb67,cb68,cb69,cb70,cb71,cb72,cb73,cb74,cb75,cb76,cb77,cb78,cb79,cb80,cb81,cb82,cb83,cb84,cb85,cb86,cb87,cb88,cb89,cb90;
    CheckBox cb91,cb92,cb93,cb94,cb95,cb96,cb97,cb98,cb99,cb100,cb101,cb102,cb103,cb104,cb105,cb106,cb107,cb108,cb109,cb110,cb111,cb112,cb113,cb114,cb115,cb116,cb117,cb118,cb119,cb120;
    CheckBox cb121,cb122,cb123,cb124,cb125,cb126,cb127,cb128,cb129,cb130,cb131,cb132,cb133,cb134,cb135,cb136,cb137,cb138,cb139,cb140,cb141,cb142,cb143,cb144,cb145,cb146,cb147,cb148,cb149;
    public static boolean[] whattoadd=new boolean[150];
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        final Intent intent=new Intent(Search.this, MainActivity.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searching);
        addingredients=(Button) findViewById(R.id.addingredients);
        for(int i=0; i<whattoadd.length; i++){
            whattoadd[i]=false;
        }
        cb0=(CheckBox) findViewById(R.id.cb0);
        cb0.setText("Абрикос");

        cb1=(CheckBox) findViewById(R.id.cb1);
        cb1.setText("Авокадо");

        cb2=(CheckBox) findViewById(R.id.cb2);
        cb2.setText("Ананас");

        cb3=(CheckBox) findViewById(R.id.cb3);
        cb3.setText("Апельсин");

        cb4=(CheckBox) findViewById(R.id.cb4);
        cb4.setText("Арбуз");

        cb5=(CheckBox) findViewById(R.id.cb5);
        cb5.setText("Базилик");

        cb6=(CheckBox) findViewById(R.id.cb6);
        cb6.setText("Баклажан");

        cb7=(CheckBox) findViewById(R.id.cb7);
        cb7.setText("Банан");

        cb8=(CheckBox) findViewById(R.id.cb8);
        cb8.setText("Баранина");

        cb9=(CheckBox) findViewById(R.id.cb9);
        cb9.setText("Бекон");

        cb10=(CheckBox) findViewById(R.id.cb10);
        cb10.setText("Брокколи");

        cb11=(CheckBox) findViewById(R.id.cb11);
        cb11.setText("Брусника");

        cb12=(CheckBox) findViewById(R.id.cb12);
        cb12.setText("Ветчина");

        cb13=(CheckBox) findViewById(R.id.cb13);
        cb13.setText("Виноград");

        cb14=(CheckBox) findViewById(R.id.cb14);
        cb14.setText("Вишня");

        cb15=(CheckBox) findViewById(R.id.cb15);
        cb15.setText("Говядина");

        cb16=(CheckBox) findViewById(R.id.cb16);
        cb16.setText("Голубика");

        cb17=(CheckBox) findViewById(R.id.cb17);
        cb17.setText("Горошек зелёный");

        cb18=(CheckBox) findViewById(R.id.cb18);
        cb18.setText("Горчица");

        cb19=(CheckBox) findViewById(R.id.cb19);
        cb19.setText("Гранат");

        cb20=(CheckBox) findViewById(R.id.cb20);
        cb20.setText("Грейпфрут");

        cb21=(CheckBox) findViewById(R.id.cb21);
        cb21.setText("Гречневая крупа");

        cb22=(CheckBox) findViewById(R.id.cb22);
        cb22.setText("Грибы");

        cb23=(CheckBox) findViewById(R.id.cb23);
        cb23.setText("Груша");

        cb24=(CheckBox) findViewById(R.id.cb24);
        cb24.setText("Гусь");

        cb25=(CheckBox) findViewById(R.id.cb25);
        cb25.setText("Дрожжи");

        cb26=(CheckBox) findViewById(R.id.cb26);
        cb26.setText("Дыня");

        cb27=(CheckBox) findViewById(R.id.cb27);
        cb27.setText("Ежевика");

        cb28=(CheckBox) findViewById(R.id.cb28);
        cb28.setText("Желатин");

        cb29=(CheckBox) findViewById(R.id.cb29);
        cb29.setText("Зелень");

        cb30=(CheckBox) findViewById(R.id.cb30);
        cb30.setText("Изюм");

        cb31=(CheckBox) findViewById(R.id.cb31);
        cb31.setText("Икра");

        cb32=(CheckBox) findViewById(R.id.cb32);
        cb32.setText("Имбирь");

        cb33=(CheckBox) findViewById(R.id.cb33);
        cb33.setText("Индейка");

        cb34=(CheckBox) findViewById(R.id.cb34);
        cb34.setText("Йогурт");

        cb35=(CheckBox) findViewById(R.id.cb35);
        cb35.setText("Кабачки");

        cb36=(CheckBox) findViewById(R.id.cb36);
        cb36.setText("Капуста");

        cb37=(CheckBox) findViewById(R.id.cb37);
        cb37.setText("Картофель");

        cb38=(CheckBox) findViewById(R.id.cb38);
        cb38.setText("Кефир");

        cb39=(CheckBox) findViewById(R.id.cb39);
        cb39.setText("Кетчуп");

        cb40=(CheckBox) findViewById(R.id.cb40);
        cb40.setText("Киви");

        cb41=(CheckBox) findViewById(R.id.cb41);
        cb41.setText("Кинза");

        cb42=(CheckBox) findViewById(R.id.cb42);
        cb42.setText("Клубника");

        cb43=(CheckBox) findViewById(R.id.cb43);
        cb43.setText("Клюква");

        cb44=(CheckBox) findViewById(R.id.cb44);
        cb44.setText("Кокос");

        cb45=(CheckBox) findViewById(R.id.cb45);
        cb45.setText("Колбаса варёная");

        cb46=(CheckBox) findViewById(R.id.cb46);
        cb46.setText("Колбаса копчёная");

        cb47=(CheckBox) findViewById(R.id.cb47);
        cb47.setText("Корица");

        cb48=(CheckBox) findViewById(R.id.cb48);
        cb48.setText("Крабовые палочки");

        cb49=(CheckBox) findViewById(R.id.cb49);
        cb49.setText("Крахмал");

        cb50=(CheckBox) findViewById(R.id.cb50);
        cb50.setText("Креветки");

        cb51=(CheckBox) findViewById(R.id.cb51);
        cb51.setText("Кролик");

        cb52=(CheckBox) findViewById(R.id.cb52);
        cb52.setText("Кукуруза");

        cb53=(CheckBox) findViewById(R.id.cb53);
        cb53.setText("Кунжут");

        cb54=(CheckBox) findViewById(R.id.cb54);
        cb54.setText("Куриная грудка");

        cb55=(CheckBox) findViewById(R.id.cb55);
        cb55.setText("Куриное крыло");

        cb56=(CheckBox) findViewById(R.id.cb56);
        cb56.setText("Лаваш");

        cb57=(CheckBox) findViewById(R.id.cb57);
        cb57.setText("Лавровый лист");

        cb58=(CheckBox) findViewById(R.id.cb58);
        cb58.setText("Лайм");

        cb59=(CheckBox) findViewById(R.id.cb59);
        cb59.setText("Лапша");

        cb60=(CheckBox) findViewById(R.id.cb60);
        cb60.setText("Лимон");

        cb61=(CheckBox) findViewById(R.id.cb61);
        cb61.setText("Лосось");

        cb62=(CheckBox) findViewById(R.id.cb62);
        cb62.setText("Лук зелёный");

        cb63=(CheckBox) findViewById(R.id.cb63);
        cb63.setText("Лук репчатый");

        cb64=(CheckBox) findViewById(R.id.cb64);
        cb64.setText("Майонез");

        cb65=(CheckBox) findViewById(R.id.cb65);
        cb65.setText("Макароны");

        cb66=(CheckBox) findViewById(R.id.cb66);
        cb66.setText("Малина");

        cb67=(CheckBox) findViewById(R.id.cb67);
        cb67.setText("Манная крупа");

        cb68=(CheckBox) findViewById(R.id.cb68);
        cb68.setText("Маслины");

        cb69=(CheckBox) findViewById(R.id.cb69);
        cb69.setText("Оливковое масло");

        cb70=(CheckBox) findViewById(R.id.cb70);
        cb70.setText("Подсолнечное масло");

        cb71=(CheckBox) findViewById(R.id.cb71);
        cb71.setText("Растительное масло");

        cb72=(CheckBox) findViewById(R.id.cb72);
        cb72.setText("Сливочное масло");

        cb73=(CheckBox) findViewById(R.id.cb73);
        cb73.setText("Мёд");

        cb74=(CheckBox) findViewById(R.id.cb74);
        cb74.setText("Мидии");

        cb75=(CheckBox) findViewById(R.id.cb75);
        cb75.setText("Молоко");

        cb76=(CheckBox) findViewById(R.id.cb76);
        cb76.setText("Морковь");

        cb77=(CheckBox) findViewById(R.id.cb77);
        cb77.setText("Мука");

        cb78=(CheckBox) findViewById(R.id.cb78);
        cb78.setText("Мята");

        cb79=(CheckBox) findViewById(R.id.cb79);
        cb79.setText("Облепиха");

        cb80=(CheckBox) findViewById(R.id.cb80);
        cb80.setText("Огурец");

        cb81=(CheckBox) findViewById(R.id.cb81);
        cb81.setText("Огурцы солёные");

        cb82=(CheckBox) findViewById(R.id.cb82);
        cb82.setText("Оливки");

        cb83=(CheckBox) findViewById(R.id.cb83);
        cb83.setText("Орегано");

        cb84=(CheckBox) findViewById(R.id.cb84);
        cb84.setText("Грецкие орехи");

        cb85=(CheckBox) findViewById(R.id.cb85);
        cb85.setText("Паприка");

        cb86=(CheckBox) findViewById(R.id.cb86);
        cb86.setText("Персик");

        cb87=(CheckBox) findViewById(R.id.cb87);
        cb87.setText("Болгарский перец");

        cb88=(CheckBox) findViewById(R.id.cb88);
        cb88.setText("Перец чили");

        cb89=(CheckBox) findViewById(R.id.cb89);
        cb89.setText("Перловая крупа");

        cb90=(CheckBox) findViewById(R.id.cb90);
        cb90.setText("Петрушка");

        cb91=(CheckBox) findViewById(R.id.cb91);
        cb91.setText("Печенье");

        cb92=(CheckBox) findViewById(R.id.cb92);
        cb92.setText("Пита");

        cb93=(CheckBox) findViewById(R.id.cb93);
        cb93.setText("Помидор");

        cb94=(CheckBox) findViewById(R.id.cb94);
        cb94.setText("Редис");

        cb95=(CheckBox) findViewById(R.id.cb95);
        cb95.setText("Рис");

        cb96=(CheckBox) findViewById(R.id.cb96);
        cb96.setText("Розмарин");

        cb97=(CheckBox) findViewById(R.id.cb97);
        cb97.setText("Руккола");

        cb98=(CheckBox) findViewById(R.id.cb98);
        cb98.setText("Салат");

        cb99=(CheckBox) findViewById(R.id.cb99);
        cb99.setText("Сало");

        cb100=(CheckBox) findViewById(R.id.cb100);
        cb100.setText("Салями");

        cb101=(CheckBox) findViewById(R.id.cb101);
        cb101.setText("Сахар");

        cb102=(CheckBox) findViewById(R.id.cb102);
        cb102.setText("Сахарная пудра");

        cb103=(CheckBox) findViewById(R.id.cb103);
        cb103.setText("Свекла");

        cb104=(CheckBox) findViewById(R.id.cb104);
        cb104.setText("Свинина");

        cb105=(CheckBox) findViewById(R.id.cb105);
        cb105.setText("Сгущённое молоко");

        cb106=(CheckBox) findViewById(R.id.cb106);
        cb106.setText("Сельдерей");

        cb107=(CheckBox) findViewById(R.id.cb107);
        cb107.setText("Селёдка");

        cb108=(CheckBox) findViewById(R.id.cb108);
        cb108.setText("Сёмга");

        cb109=(CheckBox) findViewById(R.id.cb109);
        cb109.setText("Скумбрия");

        cb110=(CheckBox) findViewById(R.id.cb110);
        cb110.setText("Сливки");

        cb111=(CheckBox) findViewById(R.id.cb111);
        cb111.setText("Сметана");

        cb112=(CheckBox) findViewById(R.id.cb112);
        cb112.setText("Смородина");

        cb113=(CheckBox) findViewById(R.id.cb113);
        cb113.setText("Сода");

        cb114=(CheckBox) findViewById(R.id.cb114);
        cb114.setText("Сом");

        cb115=(CheckBox) findViewById(R.id.cb115);
        cb115.setText("Судак");

        cb116=(CheckBox) findViewById(R.id.cb116);
        cb116.setText("Сухофрукты");

        cb117=(CheckBox) findViewById(R.id.cb117);
        cb117.setText("Сыр моцарелла");

        cb118=(CheckBox) findViewById(R.id.cb118);
        cb118.setText("Сыр пармезан");

        cb119=(CheckBox) findViewById(R.id.cb119);
        cb119.setText("Сыр творожный");

        cb120=(CheckBox) findViewById(R.id.cb120);
        cb120.setText("Сыр чеддер");

        cb121=(CheckBox) findViewById(R.id.cb121);
        cb121.setText("Творог");

        cb122=(CheckBox) findViewById(R.id.cb122);
        cb122.setText("Тесто слоёное");

        cb123=(CheckBox) findViewById(R.id.cb123);
        cb123.setText("Тимьян");

        cb124=(CheckBox) findViewById(R.id.cb124);
        cb124.setText("Тмин");

        cb125=(CheckBox) findViewById(R.id.cb125);
        cb125.setText("Тортилья");

        cb126=(CheckBox) findViewById(R.id.cb126);
        cb126.setText("Томатная паста");

        cb127=(CheckBox) findViewById(R.id.cb127);
        cb127.setText("Треска");

        cb128=(CheckBox) findViewById(R.id.cb128);
        cb128.setText("Тунец");

        cb129=(CheckBox) findViewById(R.id.cb129);
        cb129.setText("Тыква");

        cb130=(CheckBox) findViewById(R.id.cb130);
        cb130.setText("Укроп");

        cb131=(CheckBox) findViewById(R.id.cb131);
        cb131.setText("Уксус");

        cb132=(CheckBox) findViewById(R.id.cb132);
        cb132.setText("Устрицы");

        cb133=(CheckBox) findViewById(R.id.cb133);
        cb133.setText("Утка");

        cb134=(CheckBox) findViewById(R.id.cb134);
        cb134.setText("Фасоль");

        cb135=(CheckBox) findViewById(R.id.cb135);
        cb135.setText("Форель");

        cb136=(CheckBox) findViewById(R.id.cb136);
        cb136.setText("Хлеб белый");

        cb137=(CheckBox) findViewById(R.id.cb137);
        cb137.setText("Хурма");

        cb138=(CheckBox) findViewById(R.id.cb138);
        cb138.setText("Черешня");

        cb139=(CheckBox) findViewById(R.id.cb139);
        cb139.setText("Черника");

        cb140=(CheckBox) findViewById(R.id.cb140);
        cb140.setText("Чернослив");

        cb141=(CheckBox) findViewById(R.id.cb141);
        cb141.setText("Чеснок");

        cb142=(CheckBox) findViewById(R.id.cb142);
        cb142.setText("Шампиньоны");

        cb143=(CheckBox) findViewById(R.id.cb143);
        cb143.setText("Горький шоколад");

        cb144=(CheckBox) findViewById(R.id.cb144);
        cb144.setText("Молочный шоколад");

        cb145=(CheckBox) findViewById(R.id.cb145);
        cb145.setText("Шпинат");

        cb146=(CheckBox) findViewById(R.id.cb146);
        cb146.setText("Щавель");

        cb147=(CheckBox) findViewById(R.id.cb147);
        cb147.setText("Щука");

        cb148=(CheckBox) findViewById(R.id.cb148);
        cb148.setText("Яблоко");

        cb149=(CheckBox) findViewById(R.id.cb149);
        cb149.setText("Яйцо куриное");

        checking(cb0,0);
        checking(cb1,1);
        checking(cb2,2);
        checking(cb3,3);
        checking(cb4,4);
        checking(cb5,5);
        checking(cb6,6);
        checking(cb7,7);
        checking(cb8,8);
        checking(cb9,9);
        checking(cb10,10);
        checking(cb11,11);
        checking(cb12,12);
        checking(cb13,13);
        checking(cb14,14);
        checking(cb15,15);
        checking(cb16,16);
        checking(cb17,17);
        checking(cb18,18);
        checking(cb19,19);
        checking(cb20,20);
        checking(cb21,21);
        checking(cb22,22);
        checking(cb23,23);
        checking(cb24,24);
        checking(cb25,25);
        checking(cb26,26);
        checking(cb27,27);
        checking(cb28,28);
        checking(cb29,29);
        checking(cb30,30);
        checking(cb31,31);
        checking(cb32,32);
        checking(cb33,33);
        checking(cb34,34);
        checking(cb35,35);
        checking(cb36,36);
        checking(cb37,37);
        checking(cb38,38);
        checking(cb39,39);
        checking(cb40,40);
        checking(cb41,41);
        checking(cb42,42);
        checking(cb43,43);
        checking(cb44,44);
        checking(cb45,45);
        checking(cb46,46);
        checking(cb47,47);
        checking(cb48,48);
        checking(cb49,49);
        checking(cb50,50);
        checking(cb51,51);
        checking(cb52,52);
        checking(cb53,53);
        checking(cb54,54);
        checking(cb55,55);
        checking(cb56,56);
        checking(cb57,57);
        checking(cb58,58);
        checking(cb59,59);
        checking(cb60,60);
        checking(cb61,61);
        checking(cb62,62);
        checking(cb63,63);
        checking(cb64,64);
        checking(cb65,65);
        checking(cb66,66);
        checking(cb67,67);
        checking(cb68,68);
        checking(cb69,69);
        checking(cb70,70);
        checking(cb71,71);
        checking(cb72,72);
        checking(cb73,73);
        checking(cb74,74);
        checking(cb75,75);
        checking(cb76,76);
        checking(cb77,77);
        checking(cb78,78);
        checking(cb79,79);
        checking(cb80,80);
        checking(cb81,81);
        checking(cb82,82);
        checking(cb83,83);
        checking(cb84,84);
        checking(cb85,85);
        checking(cb86,86);
        checking(cb87,87);
        checking(cb88,88);
        checking(cb89,89);
        checking(cb90,90);
        checking(cb91,91);
        checking(cb92,92);
        checking(cb93,93);
        checking(cb94,94);
        checking(cb95,95);
        checking(cb96,96);
        checking(cb97,97);
        checking(cb98,98);
        checking(cb99,99);
        checking(cb100,100);
        checking(cb101,101);
        checking(cb102,102);
        checking(cb103,103);
        checking(cb104,104);
        checking(cb105,105);
        checking(cb106,106);
        checking(cb107,107);
        checking(cb108,108);
        checking(cb109,109);
        checking(cb110,110);
        checking(cb111,111);
        checking(cb112,112);
        checking(cb113,113);
        checking(cb114,114);
        checking(cb115,115);
        checking(cb116,116);
        checking(cb117,117);
        checking(cb118,118);
        checking(cb119,119);
        checking(cb120,120);
        checking(cb121,121);
        checking(cb122,122);
        checking(cb123,123);
        checking(cb124,124);
        checking(cb125,125);
        checking(cb126,126);
        checking(cb127,127);
        checking(cb128,128);
        checking(cb129,129);
        checking(cb130,130);
        checking(cb131,131);
        checking(cb132,132);
        checking(cb133,133);
        checking(cb134,134);
        checking(cb135,135);
        checking(cb136,136);
        checking(cb137,137);
        checking(cb138,138);
        checking(cb139,139);
        checking(cb140,140);
        checking(cb141,141);
        checking(cb142,142);
        checking(cb143,143);
        checking(cb144,144);
        checking(cb145,145);
        checking(cb146,146);
        checking(cb147,147);
        checking(cb148,148);
        checking(cb149,149);
        addingredients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeFragment.spisoktorecepts.clear();
                HomeFragment.da=false;
                startActivity(intent);
            }
        });
    }
}
