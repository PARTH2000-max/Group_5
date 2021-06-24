package com.example.raj2.Ayush;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.raj2.R;

import java.util.ArrayList;
import java.util.List;


public class BlankFragment extends Fragment {


    ListView listView;
    List<String> Login;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        listView=view.findViewById(R.id.list_item);


        Login=new ArrayList<>();

        Login.add("Des 25,2021 7:33pm");
        Login.add("Nov 20,2021 7:34pm");
        Login.add("Oct 21,2021 7:32pm");
        Login.add("FEb 22,2021 7:31pm");
        Login.add("Jan 5,2021 7:30pm");


        ArrayAdapter<String> Adapter = new ArrayAdapter<>(getActivity(),R.layout.row,Login);
        listView.setAdapter(Adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getContext(), "You Login At "+Login.get(position), Toast.LENGTH_SHORT).show();
            }
        });




        return view;
    }

}