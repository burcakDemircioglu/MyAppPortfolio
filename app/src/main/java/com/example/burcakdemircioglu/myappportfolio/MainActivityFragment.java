package com.example.burcakdemircioglu.myappportfolio;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private ArrayAdapter<String> ButtonAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_main, container, false);

        String[] buttonArray={

                getString(R.string.spotify_streamer),
                getString(R.string.scores_app),
                getString(R.string.library_app),
                getString(R.string.build_it_bigger),
                getString(R.string.xyz_reader),
                getString(R.string.my_own_app)
        };
/*
        ButtonAdapter= new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_app_button,
                R.id.list_item_button_textview,
                buttonArray);

        ListView listView=(ListView)rootView.findViewById(R.id.button_list);
        listView.setAdapter(ButtonAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String button = "This button will launch " + ButtonAdapter.getItem(position).toLowerCase() + "!";
                Toast.makeText(getActivity(), button, Toast.LENGTH_SHORT).show();
            }
        });
*/
        return rootView;
    }

}
