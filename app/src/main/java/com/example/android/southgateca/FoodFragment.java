package com.example.android.southgateca;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.in_n_out, R.string.fast_food, R.drawable.in_n_out,
                R.string.in_n_out_desc));
        locations.add(new Location(R.string.starbucks, R.string.coffee_shop, R.drawable.starbucks,
                R.string.starbucks_desc));
        locations.add(new Location(R.string.ihop, R.string.restaurant, R.drawable.ihop,
                R.string.ihop_desc));
        locations.add(new Location(R.string.la_favorita_bakery, R.string.bakery,
                R.drawable.la_favorita_bakery, R.string.la_favorita_bakery_desc));
        locations.add(new Location(R.string.mcdonalds, R.string.fast_food, R.drawable.mcdonalds,
                R.string.mcdonalds_desc));
        locations.add(new Location(R.string.mariscos_el_perihuete, R.string.latin_american,
                R.drawable.mariscos_el_perihuete, R.string.mariscos_el_perihuete_desc));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
