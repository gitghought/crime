package com.simple.gh.criminalintent.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.simple.gh.criminalintent.R;
import com.simple.gh.criminalintent.obj.Crime;

import java.util.UUID;

/**
 * Created by gh on 2017-08-01.
 */

public class CrimeFragment  extends Fragment{
    Crime mCrime;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mCrime = new Crime();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.crime_fragment_layout, container, false);

        TextView tvTitle = (TextView) view.findViewById(R.id.tv_title);

        return view;
    }
}
