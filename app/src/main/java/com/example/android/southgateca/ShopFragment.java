package com.example.android.southgateca;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShopFragment extends Fragment {


    public ShopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.family_dollar, R.string.discount_supplies,
                R.drawable.family_dollar, R.string.family_dollar_desc));
        locations.add(new Location(R.string.el_super, R.string.grocery_store, R.drawable.el_super,
                R.string.el_super_desc));
        locations.add(new Location(R.string.best_true_value_hardware,
                R.string.home_improvement_store, R.drawable.best_true_value_hardware,
                R.string.best_true_value_hardware_desc));
        locations.add(new Location(R.string.greenspans, R.string.mens_clothing_store,
                R.drawable.greenspans, R.string.greenspans_desc));
        locations.add(new Location(R.string.azalea_regional_shopping_center, R.string.shopping_mall,
                R.drawable.azalea_regional_shopping_center,
                R.string.azalea_regional_shopping_center_desc));
        locations.add(new Location(R.string.seven_11, R.string.convenience_store,
                R.drawable.seven_11, R.string.seven_11_desc));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
