package com.example.dust.kolesanews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView catList;
    private String[] cats = {"Политика", "В мире", "Общество", "Экономика"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.mainToolbar);
        setSupportActionBar(toolbar);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,cats);
        catList = (ListView) findViewById(R.id.catList);
        catList.setAdapter(adapter);
        catList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, News.class);
                switch (position){
                    case 0:
                        intent.putExtra("cat", "Новости политики");
                        break;
                    case 1:
                        intent.putExtra("cat", "Новости стран мира");
                        break;
                    case 2:
                        intent.putExtra("cat", "Общество");
                        break;
                    case 3:
                        intent.putExtra("cat", "Новости экономики");
                        break;
                }
                startActivity(intent);
            }
        });

    }
}
