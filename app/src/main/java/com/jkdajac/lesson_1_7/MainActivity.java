package com.jkdajac.lesson_1_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String kattle = "чайни";

        ArrayList<String> name = new ArrayList<>();


        String[] partOfName = new String[]{"Юл", "Кат", "Ол", "Ма", "Ан"};

        String text = " Машка, привет! Как ты? У Ани тут день рождения был, так я ей подарок так долго\n" +
                "выбирала… прямо в голову ничего не лезло. Короче, чайник ей купила. А че, классная тема\n" +
                "– всегда пригодится, и с размером угадывать не надо. Я думаю Юле тоже чайник подарить,\n" +
                "когда у нее ДР будет. Или кофеварку… Короче, что-нибудь в таком духе.\n";

        ArrayList<String> list = new ArrayList<>();

        if(text.contains(kattle)) {
           for (int i = 0; i < partOfName.length; i++){
               if(text.contains(partOfName[i])){
                   list.add(partOfName[i]);


               }
           }
            Log.d("MyLOG", String.valueOf(list));
           String names = list.toString();
            String myStr =names.replaceAll("Юл(\\w*)", "Юлия");
            String myStr1 =names.replaceAll("Ма(\\w*)", "Мария");
            String myStr2 =names.replaceAll("Ан(\\w*)", "Анна");

            Log.d("MyLOG", String.valueOf(myStr));
            Log.d("MyLOG", String.valueOf(myStr1));
            Log.d("MyLOG", String.valueOf(myStr2));


        }


    }
}