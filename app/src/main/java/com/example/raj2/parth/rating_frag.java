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


public class rating_frag extends Fragment {

    RecyclerView recyclerView;
    List<rating> ratingList;

    public rating_frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rating, container, false);

        recyclerView=view.findViewById(R.id.rfrating);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        Call<FecthRatingResponse> call = retrofitclient.getInstance().getApi().fetchrating();


        call.enqueue(new Callback<FecthRatingResponse>() {
            @Override
            public void onResponse(Call<FecthRatingResponse> call, Response<FecthRatingResponse> response) {

                if(response.isSuccessful()){

                    ratingList = response.body().getRatingList();

                    recyclerView.setAdapter(new ratingadapter(getActivity(),ratingList));
                }

                else {

                    Toast.makeText(getActivity(), response.body().getError(), Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<FecthRatingResponse> call, Throwable t) {

                Toast.makeText(getActivity(), t.getMessage(),Toast.LENGTH_LONG).show();
            }

        });


        return view;

    }


}