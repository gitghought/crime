package com.simple.gh.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.simple.gh.criminalintent.fragment.CrimeFragment;

public class CrimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        FragmentManager fm = this.getSupportFragmentManager();
        Fragment frag = fm.findFragmentById(R.id.fragment_container_in_activity);
        if (frag == null) {
            FragmentTransaction trans = fm.beginTransaction();
            trans.add(R.id.fragment_container_in_activity, new CrimeFragment());
            trans.commit();
        }
    }
}
