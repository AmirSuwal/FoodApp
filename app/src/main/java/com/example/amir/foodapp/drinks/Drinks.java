package com.example.amir.foodapp.drinks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.amir.foodapp.R;
import com.example.amir.foodapp.fragment_class.adapter.*;
import com.example.amir.foodapp.fragment_class.adapter.Data_for_recyler;
import com.example.amir.foodapp.login.Login_acctivity;

import java.util.ArrayList;

/**
 * Created by Amir on 12/15/2017.
 */

public class Drinks extends Fragment implements com.example.amir.foodapp.fragment_class.adapter.OnItemClickListener {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Drink_Model> data;
    //RecyclerView.Adapter adapter;
    Drink_Adapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.drinks, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recylerview);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());


        data = new ArrayList<>();
        for (int i = 0; i < Data_for_drinks.title_array.length; i++) {
            data.add(new Drink_Model(
                    Data_for_drinks.image_array[i],
                    Data_for_drinks.title_array[i],
                    Data_for_drinks.body_array[i],
                    Data_for_drinks.price_array[i],
                    Data_for_drinks.id_[i]
            ));
        }
        adapter = new Drink_Adapter(data);
        adapter.setOnCardClickListner(this);
        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(getActivity(), "position:" + position, Toast.LENGTH_SHORT).show();
        switch (position) {

            case 0:
                startActivity(new Intent(getActivity(), Login_acctivity.class));
                break;
            case 1:

        }
    }
}


