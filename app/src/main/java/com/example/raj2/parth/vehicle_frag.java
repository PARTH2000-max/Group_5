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

public class vehicle_frag extends Fragment {

    RecyclerView recyclerView;
    List<car> carList;

    public vehicle_frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vehicle, container, false);


        recyclerView = view.findViewById(R.id.rfvehicle);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        Call<FetchCarResponse> call = retrofitclient.getInstance().getApi().fetchcars();


        call.enqueue(new Callback<FetchCarResponse>() {
            @Override
            public void onResponse(Call<FetchCarResponse> call, Response<FetchCarResponse> response) {

                if (response.isSuccessful()) {

                    carList = response.body().getCarList();

                    recyclerView.setAdapter(new caradapater(getActivity(), carList));
                } else {

                    Toast.makeText(getActivity(), response.body().getError(), Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<FetchCarResponse> call, Throwable t) {

                Toast.makeText(getActivity(), t.getMessage(), Toast.LENGTH_LONG).show();
            }

        });

        return view;

    }
}