package com.example.raj2.parth;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.raj2.R;

import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class user_frag extends Fragment {

    RecyclerView recyclerView;
    List<user> userList;

    public user_frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user, container, false);

        recyclerView=view.findViewById(R.id.rfuser);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        Call<FetchUserResponse> call = retrofitclient.getInstance().getApi().fetchusers();


        call.enqueue(new Callback<FetchUserResponse>() {
            @Override
            public void onResponse(Call<FetchUserResponse> call, Response<FetchUserResponse> response) {

                if(response.isSuccessful()){

                    userList = response.body().getUserList();

                    recyclerView.setAdapter(new useradapter(getActivity(),userList));

                }

                else {

                    Toast.makeText(getActivity(), response.body().getError(), Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<FetchUserResponse> call, Throwable t) {

                Toast.makeText(getActivity(), t.getMessage(),Toast.LENGTH_LONG).show();

            }
        });

        return view;
    }

}