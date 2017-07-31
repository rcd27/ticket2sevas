package rcd27.github.com.dribbbleapp.view;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import rcd27.github.com.dribbbleapp.R;
import rcd27.github.com.dribbbleapp.model.Shot;

public class ShotListAdapter extends ArrayAdapter<Shot> {
    public ShotListAdapter(@NonNull Context context) {
        super(context, R.layout.list_item_cardview);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Shot shot = getItem(position);
        assert shot != null;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item_cardview, parent, false);
        }
        ((ImageView) convertView.findViewById(R.id.card_view_image_view))
                .setImageDrawable(shot.shotImage);
        ((TextView) convertView.findViewById(R.id.card_view_text_title))
                .setText(shot.title);
        ((TextView) convertView.findViewById(R.id.card_view_text_description))
                .setText(shot.description);

        return convertView;
    }
}