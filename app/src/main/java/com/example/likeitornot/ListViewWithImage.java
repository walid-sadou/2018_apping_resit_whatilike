package com.example.likeitornot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ListViewWithImage extends AppCompatActivity{
    // Array of strings for ListView Title
    String[] listviewTitle = new String[]{
            "house Music", "falafel", "nodeJS", "docker",
            "football", "zelda", "warcraft3", "les echecs",
    };


    int[] listviewImage = new int[]{
            R.drawable.vinyle, R.drawable.falafel, R.drawable.nodejs, R.drawable.docker,
            R.drawable.ballon, R.drawable.zelda, R.drawable.warcraft3, R.drawable.echiquier,
    };

    int[] listviewImage2 = new int[]{
            R.drawable.thumb, R.drawable.thumb, R.drawable.thumb, R.drawable.thumb,
            R.drawable.thumb, R.drawable.thumb, R.drawable.thumb, R.drawable.thumb,
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 8; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", listviewTitle[i]);
            hm.put("listview_image", Integer.toString(listviewImage[i]));
            hm.put("listview_thumb", Integer.toString(listviewImage2[i]));
            aList.add(hm);
        }

        String[] from = {"listview_image", "listview_title", "listview_thumb"};
        int[] to = {R.id.listview_image, R.id.listview_item_title, R.id.listview_thumb};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.row_layout, from, to);
        ListView androidListView = (ListView) findViewById(R.id.list_view);
        androidListView.setAdapter(simpleAdapter);
    }

}
