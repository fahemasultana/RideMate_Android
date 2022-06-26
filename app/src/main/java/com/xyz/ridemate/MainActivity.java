package com.xyz.ridemate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.xyz.ridemate.signUp.ViewModel.MainViewModel;
import com.xyz.ridemate.signUp.recoverPassword;

public class MainActivity extends AppCompatActivity {

    private MainViewModel viewModel;
    private TextView loginBtn;
    private EditText emailEt, passwordEt;
    private TextView Signup ;
    private NavController navController;
    private TextView forgotPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        //setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.login);
        emailEt = findViewById(R.id.email);
        passwordEt = findViewById(R.id.password);
        Signup = findViewById(R.id.reset);
        forgotPass =findViewById(R.id.forgotpass);

        forgotPass.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               forgotpassword();
            }
        });





        viewModel = new ViewModelProvider(this).get(MainViewModel.class);

        viewModel.getLoginResponseLiveData().observe(this, s -> {
            Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
        });

    }




    public void forgotpassword() {

        Fragment fragment = new recoverPassword();
        getSupportFragmentManager().beginTransaction().replace(androidx.fragment.R.id.fragment_container_view_tag,fragment).commit();


    }

    public void privacy(View view) {
    }

    public void terms(View view) {
    }
}