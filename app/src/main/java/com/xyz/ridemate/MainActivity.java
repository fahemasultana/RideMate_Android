package com.xyz.ridemate;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.xyz.ridemate.databinding.ActivityMainBinding;
import com.xyz.ridemate.signUp.ViewModel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    private MainViewModel viewModel;
    private TextView loginBtn;
    private EditText emailEt, passwordEt;
    private TextView Signup;
    private NavController navController;
    private TextView forgotPass;

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.login);
        emailEt = findViewById(R.id.email);
        passwordEt = findViewById(R.id.password);
        Signup = findViewById(R.id.sign);

        //activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        //setContentView(activityMainBinding.getRoot());
        
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView);
        navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(bottomNavigationView, navController);

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);

        viewModel.getLoginResponseLiveData().observe(this, s -> {
            Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
        });

    }
}




