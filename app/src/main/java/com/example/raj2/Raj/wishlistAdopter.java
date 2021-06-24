package com.example.raj2.Raj;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.raj2.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class wishlistAdopter extends RecyclerView.Adapter<wishlistAdopter.ViewHolder> {



    Context context;
    ArrayList<Car> cars;



    public wishlistAdopter(Context context, ArrayList<Car> twomodels) {
        this.context = context;
        this.cars = twomodels;
    }

    


    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup viewGroup, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View view=inflater.inflate(R.layout.item_on_view,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  ViewHolder holder, int position) {

        holder.car_name.setText(cars.get(position).getCar_name());




        holder.car_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, Two_Wheller.class);
                context.startActivity(intent);
            }
        });

    }




    @Override
    public int getItemCount() {
        return cars.size() ;
    }

    public void setItems(ArrayList<Car> cars) {
        this.cars=cars;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView car_name;

        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            car_name=itemView.findViewById(R.id.tvVarname);



        }
    }
}
