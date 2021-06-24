package com.example.raj2.DineshTina;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.raj2.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    Context context;
    private ArrayList<Car> car;


    public CustomAdapter(Context context, ArrayList<Car> car) {
        this.context = context;
        this.car = car;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.custome_cars,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.car.setText(String.valueOf(car.get(position).getBrand()));
        holder.company.setText(String.valueOf(car.get(position).getColor()));
        holder.model.setText(String.valueOf(car.get(position).getInsured()));
        holder.price.setText(String.valueOf("Price : "+car.get(position).getPrice()));
    }

    @Override
    public int getItemCount() {
        return car.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView car,model,price,company;

        public MyViewHolder(View itemView) {
            super(itemView);
            car=itemView.findViewById(R.id.textView);
            model=itemView.findViewById(R.id.textView2);
            company=itemView.findViewById(R.id.textView3);
            price=itemView.findViewById(R.id.textView4);
        }
    }
}
