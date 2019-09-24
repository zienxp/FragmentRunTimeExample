package com.example.fragmentruntimeexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        if(findViewById(R.id.fragment_continer)!= null){
            if (savedInstanceState!=null){
                return;
            }
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            HomeFragment homeFragment = new HomeFragment();

            fragmentTransaction.add(R.id.fragment_continer,homeFragment,null);
            fragmentTransaction.commit();

        }
    }
}
