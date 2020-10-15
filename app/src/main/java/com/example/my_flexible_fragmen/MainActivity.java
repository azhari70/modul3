package com.example.my_flexible_fragmen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        HomeFragmen mHomeFragmen = new HomeFragmen();
        mFragmentTransaction.add(R.id.frame_container, mHomeFragmen, HomeFragmen.class.getSimpleName());

        Log.d("MyFlexibleFragment", "Fragment Name :"+HomeFragmen.class.getSimpleName());
        mFragmentTransaction.commit();
        }
}