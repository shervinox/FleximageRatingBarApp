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

        LinearLayout firstLinearLayout = findViewById(R.id.first_layout); // parent of RatingBar, mandatory
        FleximageRatingbar fleximageRatingbarFirst = new FleximageRatingbar(this); // findViewById(R.id.first_rating);
        fleximageRatingbarFirst.setRating(2); // set desired rating from 0 to 5
        fleximageRatingbarFirst.setWidthOfEachStarInDp(35); // set width of each star of RatingBar
        fleximageRatingbarFirst.setHeightOfEachStarInDp(35); // set height of each star of RatingBar
        fleximageRatingbarFirst.setPaddingInBetween(10); // set padding between each star of RatingBar
        fleximageRatingbarFirst.setOrientation(LinearLayout.HORIZONTAL); // set orientation of RatingBar, LinearLayout.VERTICAL or LinearLayout.HORIZONTAL
        fleximageRatingbarFirst.setOnColor(R.color.BLUE); // set color for stars of RatingBar, when they are on
        fleximageRatingbarFirst.setOffColor(R.color.GRAY); // set image drawable for stars of RatingBar, when they are on
        fleximageRatingbarFirst.display(this, firstLinearLayout); // apply the changes and display the RatingBar


        LinearLayout secondLinearLayout = findViewById(R.id.second_layout); // parent of RatingBar, mandatory
        FleximageRatingbar fleximageRatingbar_second = new FleximageRatingbar(this); // findViewById(R.id.first_rating);
        fleximageRatingbar_second.setRating(3); // set desired rating from 0 to 5
        fleximageRatingbar_second.setWidthOfEachStarInDp(50); // set width of each star of RatingBar
        fleximageRatingbar_second.setHeightOfEachStarInDp(50); // set height of each star of RatingBar
        fleximageRatingbar_second.setPaddingInBetween(10); // set padding between each star of RatingBar
        fleximageRatingbar_second.setOrientation(LinearLayout.HORIZONTAL); // set orientation of RatingBar, LinearLayout.VERTICAL or LinearLayout.HORIZONTAL
        fleximageRatingbar_second.setOnColor(R.color.GREEN); // set color for stars of RatingBar, when they are on
        fleximageRatingbar_second.setOffColor(R.color.YELLOW); // set image drawable for stars of RatingBar, when they are on
        fleximageRatingbar_second.display(this, secondLinearLayout); // apply the changes and display the RatingBar


        LinearLayout thirdLinearLayout = findViewById(R.id.third_layout); // parent of RatingBar, mandatory
        FleximageRatingbar fleximageRatingbar_third = new FleximageRatingbar(this);
        fleximageRatingbar_third.setRating(2); // set desired rating from 0 to 5
        fleximageRatingbar_third.setWidthOfEachStarInDp(35); // set width of each star of RatingBar
        fleximageRatingbar_third.setHeightOfEachStarInDp(35); // set height of each star of RatingBar
        fleximageRatingbar_third.setPaddingInBetween(10); // set padding between each star of RatingBar
        fleximageRatingbar_third.setOrientation(LinearLayout.HORIZONTAL); // set orientation of RatingBar, LinearLayout.VERTICAL or LinearLayout.HORIZONTAL
        fleximageRatingbar_third.setOnMode_imageDrawable(R.drawable.ic_on); // set image drawable for stars of RatingBar, when they are on
        fleximageRatingbar_third.setOffMode_imageDrawable(R.drawable.ic_off); // set image drawable for stars of RatingBar, when they are off
        fleximageRatingbar_third.setOnColor(R.color.BLUE); // set color for stars of RatingBar, when they are on
        fleximageRatingbar_third.setOffColor(R.color.GRAY); // set image drawable for stars of RatingBar, when they are on
        fleximageRatingbar_third.display(this, thirdLinearLayout); // apply the changes and display the RatingBar

        LinearLayout fourthLinearLayout = findViewById(R.id.fourth_layout); // parent of RatingBar, mandatory
        FleximageRatingbar fleximageRatingbar_fourth = new FleximageRatingbar(this);
        fleximageRatingbar_fourth.setRating(2); // set desired rating from 0 to 5
        fleximageRatingbar_fourth.setWidthOfEachStarInDp(50); // set width of each star of RatingBar
        fleximageRatingbar_fourth.setHeightOfEachStarInDp(50); // set height of each star of RatingBar
        fleximageRatingbar_fourth.setPaddingInBetween(10); // set padding between each star of RatingBar
        fleximageRatingbar_fourth.setOrientation(LinearLayout.VERTICAL); // set orientation of RatingBar, LinearLayout.VERTICAL or LinearLayout.HORIZONTAL
        fleximageRatingbar_fourth.setOnMode_imageDrawable(R.drawable.ic_star_on); // set image drawable for stars of RatingBar, when they are on
        fleximageRatingbar_fourth.setOffMode_imageDrawable(R.drawable.ic_star_off); // set image drawable for stars of RatingBar, when they are off
        fleximageRatingbar_fourth.setOnColor(R.color.GREEN); // set color for stars of RatingBar, when they are on
        fleximageRatingbar_fourth.setOffColor(R.color.YELLOW); // set image drawable for stars of RatingBar, when they are on
        fleximageRatingbar_fourth.display(this, fourthLinearLayout); // apply the changes and display the RatingBar

    }
}
