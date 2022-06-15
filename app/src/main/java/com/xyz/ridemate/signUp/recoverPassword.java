package com.xyz.ridemate.signUp;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xyz.ridemate.R;
import com.xyz.ridemate.signUp.ViewModel.RecoverPasswordViewModel;

public class recoverPassword extends Fragment {

    private RecoverPasswordViewModel mViewModel;

    public static recoverPassword newInstance() {
        return new recoverPassword();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.recover_password_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(RecoverPasswordViewModel.class);
        // TODO: Use the ViewModel
    }

}