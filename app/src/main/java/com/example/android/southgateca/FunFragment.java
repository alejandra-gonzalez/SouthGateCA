package com.example.android.southgateca;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FunFragment extends Fragment {


    public FunFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.south_gate_park, R.string.park,
                R.drawable.south_gate_park, R.string.south_gate_park_desc));
        locations.add(new Location(R.string.south_gate_park_sports_center, R.string.gym,
                R.drawable.south_gate_park_sports_center,
                R.string.south_gate_park_sports_center_desc));
        locations.add(new Location(R.string.leland_r_weaver_library, R.string.public_library,
                R.drawable.leland_r_weaver_library, R.string.leland_r_weaver_library_desc));
        locations.add(new Location(R.string.edwards_cinema, R.string.movie_theater,
                R.drawable.edwards_cinema, R.string.edwards_cinema_desc));
        locations.add(new Location(R.string.stanford_avenue_park, R.string.park,
                R.drawable.stanford_avenue_park, R.string.stanford_avenue_park_desc));
        locations.add(new Location(R.string.planet_fitness, R.string.gym, R.drawable.planet_fitness,
                R.string.planet_fitness_desc));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
