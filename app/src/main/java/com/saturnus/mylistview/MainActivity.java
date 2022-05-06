package com.saturnus.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView =  findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("Semangka");
        list.add("Melon");
        list.add("Mangga");
        list.add("Jambu Biji");


        ArrayAdapter arrayAdapter = new ArrayAdapter (getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position==0){
                    //Klik Semangka
                    startActivity(new Intent(MainActivity.this,SemangkaActivity.class));

                }else if (position==1){
                    //Klik Melon
                    startActivity(new Intent(MainActivity.this,MelonActivity.class));

                }else if (position==2){
                    //Klik Mangga
                    startActivity(new Intent(MainActivity.this,ManggaActivity.class));

                }else{
                    //Klik Jambu Biji
                    startActivity(new Intent(MainActivity.this,JambubijiActivity.class));
                }
            }
        });



    }
}