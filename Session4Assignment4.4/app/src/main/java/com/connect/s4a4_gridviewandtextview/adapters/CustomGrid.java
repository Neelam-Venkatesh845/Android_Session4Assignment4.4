package com.connect.s4a4_gridviewandtextview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.connect.s4a4_gridviewandtextview.MainActivity;
import com.connect.s4a4_gridviewandtextview.R;

/**
 * Created by win7 on 30-09-2016.
 */

public class CustomGrid extends BaseAdapter {

    private Context mContext;
    private final String[] web;
    private final int[] ImageId;

    public CustomGrid(Context c, String[] web, int[] ImageId) {
        mContext = c;
        this.ImageId = ImageId;
        this.web = web;
    }

    @Override
    public int getCount() {
        return web.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.customgridview, null);
            TextView textView = (TextView) grid.findViewById(R.id.grid_text);
            ImageView imageView = (ImageView)grid.findViewById(R.id.grid_image);
            textView.setText(web[position]);
            imageView.setImageResource(ImageId[position]);
        } else {
            grid = (View) convertView;
        }

        return grid;
    }
}
