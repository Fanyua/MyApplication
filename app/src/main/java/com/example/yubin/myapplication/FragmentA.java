package com.example.yubin.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by yubin on 2015/10/5.
 */
public class FragmentA extends BaseFragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a, container,false);
    }
    @Override
    public String getTitle() {
        return "A";
    }
}
