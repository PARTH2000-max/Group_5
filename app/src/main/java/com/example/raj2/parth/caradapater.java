package com.example.raj2.parth;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.raj2.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class caradapater extends RecyclerView.Adapter<caradapater.ViewHolder> {

        List<car> carList;
        Context context;

    public caradapater(Context context, List<car> carList) {
        this.context = context;
        this.carList = carList;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_views,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {

        holder.company.setText(carList.get(position).getCompany());
        holder.model.setText(carList.get(position).getModel());
        holder.year.setText(carList.get(position).getYear());
        holder.variant.setText(carList.get(position).getVariant());
        holder.color.setText(carList.get(position).getColor());
        holder.kmdriven.setText(carList.get(position).getKmdriven());
        holder.price.setText(carList.get(position).getPrice());

    }

    @Override
    public int getItemCount() {
        return carList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView company,model,year,variant,color,kmdriven,price;

        public ViewHolder(@NonNull @NotNull View itemView) {

            super(itemView);


            company=itemView.findViewById(R.id.cname);
            model=itemView.findViewById(R.id.mname);
            year=itemView.findViewById(R.id.year);
            variant=itemView.findViewById(R.id.variant);
            color=itemView.findViewById(R.id.color);
            kmdriven=itemView.findViewById(R.id.cyear);
            price=itemView.findViewById(R.id.cprice);
        }
    }
}
