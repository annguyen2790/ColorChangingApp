package edu.temple.colorchangingapp;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PalletteFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PalletteFragment extends Fragment {


    private static final String COLOR_LIST = "colorList";
    String [] colorList;
    View v;

    public PalletteFragment() {
        // Required empty public constructor
    }

    public static PalletteFragment newInstance(String [] colours) {
        PalletteFragment fragment = new PalletteFragment();
        Bundle args = new Bundle();
        args.putStringArray(COLOR_LIST, colours);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v  = inflater.inflate(R.layout.fragment_pallette, container, false);
        GridView gv = v.findViewById(R.id.Grid_View);
        if(getArguments() != null){
            colorList = getArguments().getStringArray(COLOR_LIST);
        }
        ColorAdapter CA = new ColorAdapter(getActivity(), colorList);
        gv.setAdapter(CA);

        return v;
    }
}