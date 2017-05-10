package com.connect.s4a4_gridviewandtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.connect.s4a4_gridviewandtextview.adapters.CustomGrid;

public class MainActivity extends AppCompatActivity {

    String[] web = {
            "GingerBread",
            "HoneyComb",
            "IceCream",
            "JellyBean",
            "KitKat",
            "LollyPop"
    } ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        GridView grid;


        int[] imageId = {
                R.drawable.onegingerbread,
                R.drawable.twohoneycomb,
                R.drawable.threeicecream,
                R.drawable.fourjellybean,
                R.drawable.fivekitkat,
                R.drawable.sixlollypop

        };
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomGrid adapter=new CustomGrid(MainActivity.this,web,imageId);

        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}
