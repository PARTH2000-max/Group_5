package com.example.raj2.Raj;

import android.os.Bundle;

import com.example.raj2.R;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ThreeWheller extends AppCompatActivity {

    private RecyclerView RecylerThree;
    private ArrayList<Twomodel> twomodels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_wheller);

        RecylerThree=findViewById(R.id.RecyclerThree);

        twomodels = new ArrayList<Twomodel>();

        twomodels.add(0,new Twomodel("Honda","City","25000","5","20-12-2001"));
        twomodels.add(1,new Twomodel("Hundai","accent","255000","1","20-12-2001"));
        twomodels.add(2,new Twomodel("Maruti","scross","250500","5","20-12-2001"));
        twomodels.add(3,new Twomodel("kia","scross","250005","4","20-12-2001"));
        twomodels.add(4,new Twomodel("Reounlad","duster","255000","5","20-12-2001"));
        twomodels.add(5,new Twomodel("City","model","250005","3","20-12-2001"));
        twomodels.add(6,new Twomodel("Fiat","ecosoprt","250005","4","20-12-2001"));


        LinearLayoutManager manager = new LinearLayoutManager(this);
        RecylerThree.setLayoutManager(manager);
        ThreeAdopter threeAdopter = new ThreeAdopter(this,twomodels);
        threeAdopter.setItems(twomodels);
        RecylerThree.setAdapter(threeAdopter);
    }
}