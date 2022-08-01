package com.xyz.ridemate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.xyz.ridemate.databinding.LoginFragmentBinding;
import com.xyz.ridemate.signUp.ViewModel.MainViewModel;

public class Login extends Fragment {

    private MainViewModel viewModel;
    private TextView loginBtn;
    private EditText emailEt, passwordEt;
    private TextView Signup;
    private NavController navController;
    private TextView forgotPass;
    private LoginFragmentBinding binding;



    private LoginViewModel mViewModel;

    public static Login newInstance() {
        return new Login();
    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.login_fragment,container,false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = NavHostFragment.findNavController(this);



        // click listeners
        binding.sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.signUp);
            }
        });

        binding.forgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.recoverPassword);
            }
        });
    }

        @Override
        public void onActivityCreated (@Nullable Bundle savedInstanceState){
            super.onActivityCreated(savedInstanceState);
            mViewModel = new ViewModelProvider(this).get(LoginViewModel.class);


            // TODO: Use the ViewModel
        }




    }
