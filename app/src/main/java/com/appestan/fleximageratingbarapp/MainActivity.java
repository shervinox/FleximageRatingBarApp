package com.appestan.fleximageratingbarapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.appestan.fleximageratingbar.FleximageRatingbar;

;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = findViewById(R.id.linear_layout);
        FleximageRatingbar fleximageRatingbar = findViewById(R.id.rating);
        fleximageRatingbar.setRating(2);
        fleximageRatingbar.setWidthOfEachStarInDp(35);
        fleximageRatingbar.setHeightOfEachStarInDp(35);
        fleximageRatingbar.setPaddingInBetween(10);
        fleximageRatingbar.setOrientation(LinearLayout.VERTICAL);
        fleximageRatingbar.setOnMode_imageDrawable(R.drawable.ic_on);
        fleximageRatingbar.setOffMode_imageDrawable(R.drawable.ic_off);
        fleximageRatingbar.setOnColor(R.color.BLUE);
        fleximageRatingbar.setOffColor(R.color.GRAY);
        fleximageRatingbar.display(this, linearLayout);

    }
}
