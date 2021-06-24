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

public class useradapter extends RecyclerView.Adapter<useradapter.ViewHolder> {

    List<user> userList;
    Context context;


    public useradapter(Context context, List<user> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_view,parent,false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {

        holder.username.setText(userList.get(position).getUsername());
        holder.useremail.setText(userList.get(position).getEmail());
        holder.userphone.setText(userList.get(position).getCon_number());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView username,useremail,userphone;


        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);



            username = itemView.findViewById(R.id.uname);
            useremail = itemView.findViewById(R.id.uemail);
            userphone = itemView.findViewById(R.id.upno);

        }
    }
}
