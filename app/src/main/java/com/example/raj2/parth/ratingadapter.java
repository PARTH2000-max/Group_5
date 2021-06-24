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

public class ratingadapter extends RecyclerView.Adapter<ratingadapter.ViewHolder> {

    List<rating> ratingList;
    Context context;

    public ratingadapter(Context context , List<rating> ratingList) {
        this.context = context;
        this.ratingList = ratingList;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_viewing,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {

        holder.company.setText(ratingList.get(position).getCompany());
        holder.model.setText(ratingList.get(position).getModel());
        holder.year.setText(ratingList.get(position).getYear());
        holder.variant.setText(ratingList.get(position).getVariant());
        holder.color.setText(ratingList.get(position).getColor());
        holder.kmdriven.setText(ratingList.get(position).getKmdriven());
        holder.price.setText(ratingList.get(position).getPrice());
        holder.rating.setText(ratingList.get(position).getRating());

    }


    @Override
    public int getItemCount() {
        return ratingList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView company,model,year,variant,color,kmdriven,price,rating;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            company=itemView.findViewById(R.id.rname);
            model=itemView.findViewById(R.id.rmname);
            year=itemView.findViewById(R.id.ryear);
            variant=itemView.findViewById(R.id.rvariant);
            color=itemView.findViewById(R.id.rcolor);
            kmdriven=itemView.findViewById(R.id.rkm);
            price=itemView.findViewById(R.id.rprice);
            rating=itemView.findViewById(R.id.rrating);
        }
    }
}
