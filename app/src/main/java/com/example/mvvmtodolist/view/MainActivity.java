package com.example.mvvmtodolist.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.mvvmtodolist.R;
import com.example.mvvmtodolist.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding; //dataBinding

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainBinding.setMain(this); //현재 binding시킨 xml의 variable name

        mainBinding.btnChange.setOnClickListener(view ->{
            mainBinding.btnChange.setText("변경되었습니다.");
        });
    }
}