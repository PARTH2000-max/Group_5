package com.example.raj2.Raj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.raj2.R;
import com.example.raj2.parth.MainActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivityRaj extends AppCompatActivity {

    /*private RecyclerView Recycler;
    private ArrayList<Car> cars;*/
    private TextView TvitemTwo;
    private CardView cardTwo;
    private CardView cardThree;
    private TextView TvitemThree;
    private CardView cardFour;
    private TextView Tvitemfour;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainraj);

        
        cardTwo=findViewById(R.id.CardTwo);
        TvitemTwo=findViewById(R.id.tvVarnameTwo);

        cardThree= findViewById(R.id.Cardthree);
        TvitemThree=findViewById(R.id.tvVarnameTRhree);

        cardFour=findViewById(R.id.CardFour);
        Tvitemfour=findViewById(R.id.tvVarnamefour);


        button = findViewById(R.id.buttonp);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivityRaj.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        cardTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivityRaj.this,Two_Wheller.class);
                startActivity(intent);

            }
        });

        cardThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivityRaj.this, ThreeWheller.class);
                startActivity(intent);

            }
        });

        cardFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivityRaj.this, FourWheller.class);
                startActivity(intent);

            }
        });

       /* Recycler = findViewById(R.id.RecylerView);

        cars = new ArrayList<Car>();

        cars.add(0,new Car("Two Wheller"));
        cars.add(1,new Car("Three Wheller"));
        cars.add(2,new Car("Four Wheller"));

        LinearLayoutManager manager = new LinearLayoutManager(this);
        Recycler.setLayoutManager(manager);
        wishlistAdopter mainAdopter = new wishlistAdopter(this,cars);
        mainAdopter.setItems(cars);
        Recycler.setAdapter(mainAdopter);*/

    }
}