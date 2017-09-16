package com.pimsupanato.myservice.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pimsupanato.myservice.R;

/**
 * Created by Chaiwoot on 16/9/2560.
 */

public class MainFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_main,container,false);
        return view;
    }      //Create Fragment view สร้าวหน้ากาก แผ่นใส
}//Main Class
