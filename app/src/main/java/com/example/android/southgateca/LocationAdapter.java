package com.example.android.southgateca;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    static class ViewHolder {
        private View view;
        private TextView nameTextView;
        private TextView typeTextView;
        private TextView descriptionTextView;
        private ImageView locationImageView;

        public ViewHolder (View v){
            view = v;
            nameTextView = v.findViewById(R.id.location_name);
            typeTextView = v.findViewById(R.id.location_type);
            descriptionTextView = v.findViewById(R.id.location_description);
            locationImageView = v.findViewById(R.id.location_image);
        }
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        final Location currentLocation= getItem(position);

        holder.nameTextView.setText(currentLocation.getName());
        holder.typeTextView.setText(currentLocation.getType());
        holder.descriptionTextView.setText(currentLocation.getDescription());
        holder.locationImageView.setImageResource(currentLocation.getImageResourceId());

        return convertView;
    }
}
