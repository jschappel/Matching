package com.example.jmscha14.matching;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImageFrag extends Fragment {
    //Arraylists
    ArrayList<Integer> picList1 = new ArrayList<>();
    ArrayList<Integer> picList2 = new ArrayList<>();



    /**
     * Randomly puts images into Arraylists
     * @param r a Resource
     */
    public void randomize(Resources r) {

        //get the pictures from the resource folder into an array list
        for (int i =1;i<17;i++){
            int id = r.getIdentifier("i" + i, "drawable", getActivity().getPackageName());
            picList1.add(id);
        }

        //shuffle the arraylist
        Collections.shuffle(picList1);

        //put the first 8 items into a new arraylist and and remove them for the previous
        for(int i = 0; i<8;i++){
            int item = picList1.get(i);
            picList2.add(item);
            picList1.remove(i);
        }
    }

    /**
     * Starts the game
     * @param view A view
     */
    public void startGame(View view){





        }

    }







    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_control, container, false);
        View root = inflater.inflate(R.layout.fragment_main, container, false);


        Resources r = getResources();
        //create the array lists
        randomize(r);


        for(int i = 0;i<16;i++) {

            //set the tiles
            int id = r.getIdentifier("i" + i,"id",getActivity().getPackageName());
            ImageButton ib = root.findViewById(id);


            //set a random(0-7) tag to the id (there can only be two of each)
            Random rand = new Random(8);


    }

}
