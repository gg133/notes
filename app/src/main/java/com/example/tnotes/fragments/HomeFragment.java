package com.example.tnotes.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tnotes.R;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;


public class HomeFragment extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        TextView txt_time = (TextView) getView().findViewById(R.id.txt_time);
//
//        Date currentTime = Calendar.getInstance().getTime();
//        String formattedDate = DateFormat.getDateInstance(DateFormat.FULL).format(currentTime);
//        String[] splitDate = formattedDate.split(",");
//
//
//
//        txt_time.setText(currentTime.toString());

        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}