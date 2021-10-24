package com.example.mywork_lt;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link lianxirenFragment# method to
 * create an instance of this fragment.
 */
public class lianxirenFragment extends Fragment {

    public lianxirenFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lianxiren, container, false);
    }



}