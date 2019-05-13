package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.navigation.NavigationView;

public class BottomNavigation extends BottomSheetDialogFragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View vv=inflater.inflate(R.layout.navigiation_drawer,container,false);


        NavigationView navigationView=vv.findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.nav1:
                        Toast.makeText(getActivity(), "nav1", Toast.LENGTH_SHORT).show();
                        break;
                }

                    return false;
            }
        });



        return vv;
    }
}
