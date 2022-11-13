package com.xyz.ridemate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class homepage extends Fragment {
    private NavController navController;
    private BottomNavigationView bottomNavigationView;

    private BottomNavigationMenuView bottomNavigationMenuView;

    private HomepageViewModel mViewModel;

    public static homepage newInstance() {
        return new homepage();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.homepage_fragment, container, false);
    }


    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = NavHostFragment.findNavController(this);
        bottomNavigationView.findViewById(R.id.bottom_navigation_view);
       //Navigation.findNavController(view).navigate(R.id.bottom_navigation_view);
         //bottomNavigationView.findViewById(R.id.bottom_navigation_view);
        //NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(HomepageViewModel.class);
        // TODO: Use the ViewModel
    }

}