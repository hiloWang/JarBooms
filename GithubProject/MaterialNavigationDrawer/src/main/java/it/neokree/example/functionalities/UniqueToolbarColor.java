package it.neokree.example.functionalities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import it.neokree.example.R;
import it.neokree.example.mockedActivity.Settings;
import it.neokree.example.mockedFragments.FragmentButton;
import it.neokree.example.mockedFragments.FragmentIndex;
import it.neokree.materialnavigationdrawer.MaterialNavigationDrawer;

/**
 * Created by neokree on 20/01/15.
 */
public class UniqueToolbarColor extends MaterialNavigationDrawer {

    @Override
    public void init(Bundle savedInstanceState) {

        // create sections
        this.addSection(newSection("Section 1", new FragmentIndex()));
        this.addSection(newSection("Section 2",new FragmentIndex()));
        this.addSection(newSection("Section 3", R.drawable.ic_mic_white_24dp,new FragmentButton()).setSectionColor(Color.parseColor("#9c27b0")));
        this.addSection(newSection("Section",R.drawable.ic_hotel_grey600_24dp,new FragmentButton()).setSectionColor(Color.parseColor("#03a9f4")));

        // create bottom section
        this.addBottomSection(newSection("Bottom Section",R.drawable.ic_settings_black_24dp,new Intent(this,Settings.class)));
    }
}
