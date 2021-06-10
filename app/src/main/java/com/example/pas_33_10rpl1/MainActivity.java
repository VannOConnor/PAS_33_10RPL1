package com.example.pas_33_10rpl1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<SetterGetter> datamenu;
    GridLayoutManager   gridLayoutManager   ;
    DashBoardAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView            =   findViewById(R.id. rv_menu);

        addData();
        gridLayoutManager           =   new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(gridLayoutManager);
        adapter     =   new DashBoardAdapter(datamenu);
        recyclerView.setAdapter(adapter);
    }



    public void addData(){

        datamenu        =   new ArrayList<>();
        datamenu.add(new SetterGetter( "Hamburger", "logomenu1"));
        datamenu.add(new SetterGetter( "Pizza", "logomenu2"));
        datamenu.add(new SetterGetter( "French Fries", "logomenu3"));
        datamenu.add(new SetterGetter( "Nigiri Sushi", "logomenu4"));
        datamenu.add(new SetterGetter( "Rack Of Lamb", "logomenu5"));
        datamenu.add(new SetterGetter( "Doughnut", "logomenu6"));
        datamenu.add(new SetterGetter( "Cocktail", "logomenu7"));
        datamenu.add(new SetterGetter( "Milkshake", "logomenu8"));
        datamenu.add(new SetterGetter( "Energy Drink", "logomenu9"));
    }
}