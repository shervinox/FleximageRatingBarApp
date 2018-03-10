# FleximageRatingBarApp
Create RatingBar easily, and modify it as you wish.

## Features:
set custom image for both on/off rating modes,
set width and height for rating image sources,
set padding between rating image sources,
set Orientation of RatingBar,
set color of RatingBar for both on/off modes

### Installing

Add jitpack to your project build.gradle: 

```
allprojects {
    repositories {
        // other repos
        maven { url 'https://jitpack.io' }
    }
}
```

And add the following line to your app build.gradle:

```
compile 'com.github.shervinox:FleximageRatingBarApp:63054b5765'
```


### Usage

Add the following to your layout:

```
<LinearLayout
        android:id="@+id/linear_layout"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">

        <com.appestan.fleximageratingbar.FleximageRatingbar
            android:id="@+id/rating"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />

    </LinearLayout>
```

and modify it as you wish in your class, as below:
```
LinearLayout linearLayout = findViewById(R.id.linear_layout); // parent of RatingBar, mandatory
        FleximageRatingbar fleximageRatingbar = findViewById(R.id.rating);
        fleximageRatingbar.setRating(2); // set desired rating from 0 to 5
        fleximageRatingbar.setWidthOfEachStarInDp(35); // set width of each star of RatingBar
        fleximageRatingbar.setHeightOfEachStarInDp(35); // set height of each star of RatingBar
        fleximageRatingbar.setPaddingInBetween(10); // set padding between each star of RatingBar
        fleximageRatingbar.setOrientation(LinearLayout.HORIZONTAL); // set orientation of RatingBar, LinearLayout.VERTICAL or LinearLayout.HORIZONTAL
        fleximageRatingbar.setOnMode_imageDrawable(R.drawable.ic_on); // set image drawable for stars of RatingBar, when they are on
        fleximageRatingbar.setOffMode_imageDrawable(R.drawable.ic_off); // set image drawable for stars of RatingBar, when they are off
        fleximageRatingbar.setOnColor(R.color.BLUE); // set color for stars of RatingBar, when they are on
        fleximageRatingbar.setOffColor(R.color.GRAY); // set image drawable for stars of RatingBar, when they are on
        fleximageRatingbar.display(this, linearLayout); // apply the changes and display the RatingBar
```

### Screenshot
![FleximageRatingBar_App](http://appestan.com/msc/FleximageRatingBar/FleximageRatingBar_App.png)
