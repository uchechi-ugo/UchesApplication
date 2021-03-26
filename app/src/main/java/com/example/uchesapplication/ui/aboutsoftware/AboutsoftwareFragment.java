package com.example.uchesapplication.ui.aboutsoftware;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.uchesapplication.R;

public class AboutsoftwareFragment extends Fragment {

    private AboutsoftwareViewModel aboutsoftwareViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        aboutsoftwareViewModel =
                new ViewModelProvider(this).get(AboutsoftwareViewModel.class);
        View root = inflater.inflate(R.layout.fragment_aboutsoftware, container, false);
        final TextView textView = root.findViewById(R.id.text_aboutsoftware);
        aboutsoftwareViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}