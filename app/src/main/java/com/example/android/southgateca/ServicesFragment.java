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
public class ServicesFragment extends Fragment {


    public ServicesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.la_siesta_inn, R.string.hotel, R.drawable.la_siesta_inn,
                R.string.la_siesta_inn_desc));
        locations.add(new Location(R.string.yolandas_beauty_salon, R.string.beauty_salon,
                R.drawable.yolandas_beauty_salon, R.string.yolandas_beauty_salon_desc));
        locations.add(new Location(R.string.pack_and_ship, R.string.shipping_and_mailing,
                R.drawable.pack_and_ship, R.string.pack_and_ship_desc));
        locations.add(new Location(R.string.chevron, R.string.gas_station, R.drawable.chevron,
                R.string.chevron_desc));
        locations.add(new Location(R.string.sg_car_wash,R.string.car_wash, R.drawable.car_wash,
                R.string.sg_car_wash_desc));
        locations.add(new Location(R.string.sg_auto_repair, R.string.auto_repair,
                R.drawable.auto_repair, R.string.auto_repair_desc));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
