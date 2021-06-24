package com.example.raj2.Raj;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.raj2.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ThreeAdopter extends RecyclerView.Adapter<ThreeAdopter.ViewHolder> {

    public ThreeAdopter(Context context, ArrayList<Twomodel> twomodels) {
        this.context = context;
        this.twomodels = twomodels;
    }

    Context context;
    ArrayList<Twomodel> twomodels;

    public ThreeAdopter(View view) {
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_on_two, parent, false);

       return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull  ViewHolder holder, int position) {

        holder.car_name.setText(twomodels.get(position).getCar_name());
        holder.model.setText(twomodels.get(position).getModel());
        holder.price.setText(twomodels.get(position).getPrice());
        holder.ratting.setText(twomodels.get(position).getRatting());
        holder.dob.setText(twomodels.get(position).getDate_of_Register());

    }

    @Override
    public int getItemCount() {
        return twomodels.size();
    }

    public void setItems(ArrayList<Twomodel> twomodels) {
        this.twomodels=twomodels;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView car_name;
        private final TextView model;
        private final TextView price;
        private final TextView ratting;
        private final TextView dob;

        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            car_name=itemView.findViewById(R.id.tvcarname);
            model=itemView.findViewById(R.id.tvmodelid);
            price=itemView.findViewById(R.id.tvpriceid);
            ratting=itemView.findViewById(R.id.tvRatting);
            dob=itemView.findViewById(R.id.tvDob);
        }
    }
}
