package com.example.amir.foodapp.fragment_class;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Toast;

import com.example.amir.foodapp.R;
import com.example.amir.foodapp.drinks.Drinks;
import com.example.amir.foodapp.fragment_class.adapter.Data_for_recyler;
import com.example.amir.foodapp.fragment_class.adapter.Menu_model;
import com.example.amir.foodapp.fragment_class.adapter.OnItemClickListener;
import com.example.amir.foodapp.fragment_class.adapter.menu_adapter;
import com.example.amir.foodapp.login.Login_acctivity;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Menu extends Fragment implements OnItemClickListener {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Menu_model> data;
    //RecyclerView.Adapter adapter;
    menu_adapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());


        data = new ArrayList<>();
        for (int i = 0; i < Data_for_recyler.title_array.length; i++) {
            data.add(new Menu_model(
                    Data_for_recyler.title_array[i],
                    Data_for_recyler.body_array[i],
                    Data_for_recyler.image_array[i],
                    Data_for_recyler.id_[i]
            ));
        }
        adapter = new menu_adapter(data);
        adapter.setOnCardClickListner(this);
        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(getActivity(), "position:"+position, Toast.LENGTH_SHORT).show();

        switch (position){

            case 0:
                startActivity(new Intent(getActivity(),Login_acctivity.class));
                break;
            case 1:
                Fragment fragment = new Drinks();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container, fragment);
                transaction.commit();
                break;
        }
    }
}
