package edu.temple.colorchangingapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PalletteFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PalletteFragment extends Fragment {

    private PListener parentActivity;
    private static final String COLOR_LIST = "colorList";
    String [] colorList;
    View v;

    public PalletteFragment() {
        // Required empty public constructor
    }
    public interface PListener{
        void onInputPallette(String input);
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
        if(CA != null) {
            gv.setAdapter(CA);
        }else{
            Resources resources = getResources();
            String [] colours = resources.getStringArray(R.array.colors_array);
            CA = new ColorAdapter(getActivity(), colours);
            gv.setAdapter(CA);
        }
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String input = adapterView.getItemAtPosition(i).toString();
                parentActivity.onInputPallette(input);

            }
        });

        return v;
    }
    /*Enforce interface communication with activity*/
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof PListener){
            parentActivity = (PListener) context;
        }else{
            throw new RuntimeException("Please implement PalletteListener interface");
        }
    }
}