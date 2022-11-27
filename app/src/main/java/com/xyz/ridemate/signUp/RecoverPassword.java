package com.xyz.ridemate.signUp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.xyz.ridemate.databinding.RecoverPasswordFragmentBinding;
import com.xyz.ridemate.signUp.ViewModel.RecoverPasswordViewModel;

public class RecoverPassword extends Fragment {

    private RecoverPasswordViewModel mViewModel;
    private RecoverPasswordFragmentBinding binding;

    public static RecoverPassword newInstance() {
        return new RecoverPassword();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = RecoverPasswordFragmentBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        clickListeners();
    }

    private void clickListeners() {
        binding.toolbar.setNavigationOnClickListener(view -> requireActivity().onBackPressed());
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(RecoverPasswordViewModel.class);
        // TODO: Use the ViewModel
    }

}