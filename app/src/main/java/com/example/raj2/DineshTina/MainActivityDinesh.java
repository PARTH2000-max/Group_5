package com.example.raj2.DineshTina;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.raj2.Activity.LoginActivity;
import com.example.raj2.R;

import java.io.Serializable;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityDinesh extends AppCompatActivity {

    CheckBox blue,green,black,nissan,ford,benz,insured;
    EditText minimum,maximum;
    Button button;
    public static ArrayList<Car> cars;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_maindinesh);

        Car car = new Car(1,"Blue",Boolean.TRUE,450000.0,"Ford");
        Car car1 = new Car(2,"Green",Boolean.TRUE,390000.0,"Nissan");
        Car car2 = new Car(3,"Black",Boolean.FALSE,550000.0,"Nissan");
        Car car3 = new Car(4,"Green",Boolean.TRUE,550000.0,"Benz");
        Car car4 = new Car(5,"Blue",Boolean.TRUE,250000.0,"Ford");
        Car car5 = new Car(6,"Black",Boolean.TRUE,450000.0,"Benz");
        cars = new ArrayList<Car>();
        cars.add(car);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
//        for (Car car_curr:
//             cars) {
//            Log.i("Car",car_curr.toString());
//
//        }

        button = findViewById(R.id.buttonks);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityDinesh.this, LoginActivity.class);

                startActivity(intent);
                finish();
            }
        });
    }


    public void show(View view){

        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> brand = new ArrayList<>();
        Boolean insure = Boolean.FALSE;
//        String min,max;
        Double low_price = null,high_price = null;


        blue = (CheckBox)findViewById(R.id.blue);
        green = (CheckBox)findViewById(R.id.green);
        black = (CheckBox)findViewById(R.id.black);

        nissan = (CheckBox)findViewById(R.id.nissan);
        ford = (CheckBox)findViewById(R.id.ford);
        benz = (CheckBox)findViewById(R.id.benz);

        insured = (CheckBox)findViewById(R.id.insure);

        minimum = (EditText)findViewById(R.id.min);
        maximum = (EditText)findViewById(R.id.max);


        if(blue.isChecked()){
//            System.out.println(blue.getText());
            colors.add("Blue");

        }if(green.isChecked()){
//            System.out.println(green.getText());
            colors.add("Green");
        }if(black.isChecked()){
//            System.out.println(black.getText());
            colors.add("Black");
        }if(nissan.isChecked()){
//            System.out.println(nissan.getText());
            brand.add("Nissan");
        }if(ford.isChecked()){
//            System.out.println(ford.getText());
            brand.add("Ford");
        }if(benz.isChecked()){
//            System.out.println(benz.getText());
            brand.add("Benz");
        }if(insured.isChecked()){
//            System.out.println(insured.getText());
            insure = Boolean.TRUE;
        }
        if(!minimum.getText().toString().isEmpty()){
            low_price = Double.valueOf(minimum.getText().toString());
        }
        if(!maximum.getText().toString().isEmpty()){
            high_price = Double.valueOf(maximum.getText().toString());
        }


        Intent intent = new Intent(MainActivityDinesh.this, Filter.class);

        Bundle args = new Bundle();
        args.putSerializable("BUNDLE",(Serializable)colors);
        intent.putExtra("colors",args);
//        intent.putExtra("color",colors);

        Bundle args1 = new Bundle();
        args1.putSerializable("BRAND",(Serializable)brand);
        intent.putExtra("brands",args1);

//        intent.putExtra("brand",brand);
        intent.putExtra("insured",insure);
        intent.putExtra("min",low_price);
        intent.putExtra("max",high_price);
        startActivity(intent);

    }
}