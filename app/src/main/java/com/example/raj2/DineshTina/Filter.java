package com.example.raj2.DineshTina;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.raj2.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Filter extends AppCompatActivity {

    public static ArrayList<Car> cars_filter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.cars);

        Car car = new Car(1,"Blue",Boolean.TRUE,450000.0,"Ford");
        Car car1 = new Car(2,"Green",Boolean.TRUE,390000.0,"Nissan");
        Car car2 = new Car(3,"Black",Boolean.FALSE,550000.0,"Nissan");
        Car car3 = new Car(4,"Green",Boolean.TRUE,550000.0,"Benz");
        Car car4 = new Car(5,"Blue",Boolean.TRUE,250000.0,"Ford");
        Car car5 = new Car(6,"Black",Boolean.TRUE,450000.0,"Benz");
        cars_filter = new ArrayList<Car>();
        cars_filter.add(car);
        cars_filter.add(car1);
        cars_filter.add(car2);
        cars_filter.add(car3);
        cars_filter.add(car4);
        cars_filter.add(car5);

        RecyclerView rs=(RecyclerView)findViewById(R.id.recyler);


        HashSet<Car> cars = new HashSet<>();
        Intent extras = getIntent();

        Bundle args = extras.getBundleExtra("colors");
        ArrayList<String> color = (ArrayList<String>) args.getSerializable("BUNDLE");
//        Log.i("Brands",color.toString());
        Bundle args1 = extras.getBundleExtra("brands");
        ArrayList<String> brand = (ArrayList<String>) args1.getSerializable("BRAND");
//        Log.i("Brands",brand.toString());
        Boolean insure = extras.getBooleanExtra("insured",Boolean.FALSE);

        Double min = extras.getDoubleExtra("min",Double.MIN_VALUE);
        Double max = extras.getDoubleExtra("man",Double.MAX_VALUE);

        cars = populate_cars(color,brand,insure,min,max);

        ArrayList<Car> list = new ArrayList<>(cars);

        Collections.sort(list,new Comparator<Car>() {
            @Override
            public int compare(Car a, Car b) {
                return a.getPrice().compareTo(b.getPrice());
            }
        });
//        Log.i("result",list.toString());
        try {

            rs.setLayoutManager(new LinearLayoutManager(this));
            CustomAdapter customAdapter=new CustomAdapter(this,list);
            rs.setAdapter(customAdapter);

        } catch (Exception throwables) {
            throwables.printStackTrace();
        }

    }

    public void home(View view){
        Intent intent = new Intent(this, MainActivityDinesh.class);
        startActivity(intent);
    }


    private HashSet<Car> populate_cars(ArrayList<String> colors,ArrayList<String> brands, Boolean insured, Double min, Double max){
        HashSet<Car> cars = new HashSet<>();

        for (Car car:
             cars_filter) {
            for (String c:
                 colors) {
                if(c.equals(car.getColor())) {
                    cars.add(car);
                }
//                else if (c.equals(car.getBrand())) {
//                    cars.add(car);
//                }
//                else if(car.getPrice() <= min && car.getPrice() >= max){
//                    cars.add(car);
//                }
            }
        }

        for (Car car:
                cars_filter) {
            for (String c:
                    brands) {
                if(c.equals(car.getBrand())){
                    cars.add(car);
                }
            }
        }

        for (Car car:
                cars_filter) {
            if(car.getInsured() == insured){
                cars.add(car);
            }
        }

        for (Car car:
                cars_filter) {
            if(car.getPrice() <= min && car.getPrice() >= max){
                cars.add(car);
            }
        }

        return cars;
    }
}
