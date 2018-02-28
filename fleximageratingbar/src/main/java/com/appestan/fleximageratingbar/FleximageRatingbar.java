package com.appestan.fleximageratingbar;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created with love and care by shervin on 02/27/2018.
 */

public class FleximageRatingbar extends LinearLayout {
    private static final String TAG = "FleximageRatingbar";
    private Context context;
    private static int widthOfEachStarInDp = 30;
    private static int heightOfEachStarInDp = 30;
    private static int paddingInBetween = 0;
    private static int orientation = LinearLayout.VERTICAL;
    private static int onMode_imageDrawable = R.drawable.ic_star_on;
    private static int offMode_imageDrawable = R.drawable.ic_star_off;
    private static boolean onModeColorIsSet = false;
    private static boolean offModeColorIsSet = false;
    private static int onColor = R.color.BLUE;
    private static int offColor = R.color.GRAY;
    private int ratingRate;


    public void setWidthOfEachStarInDp(int widthInDp) {
        FleximageRatingbar.widthOfEachStarInDp = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, widthInDp, getResources().getDisplayMetrics());
    }

    public void setHeightOfEachStarInDp(int heightInDp) {
        FleximageRatingbar.heightOfEachStarInDp = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, heightInDp, getResources().getDisplayMetrics());
    }

    public void setPaddingInBetween(int paddingInBetween) {
        FleximageRatingbar.paddingInBetween = paddingInBetween;
    }

    public int getOrientation() {
        return orientation;
    }

    public void setOrientation(int orientation) {
        FleximageRatingbar.orientation = orientation;
    }

    public void setOnMode_imageDrawable(int onMode_imageDrawable) {
        FleximageRatingbar.onMode_imageDrawable = onMode_imageDrawable;
    }

    public void setOffMode_imageDrawable(int offMode_imageDrawable) {
        FleximageRatingbar.offMode_imageDrawable = offMode_imageDrawable;
    }

    public void setOnColor(int onColor) {
        onModeColorIsSet = true;
        FleximageRatingbar.onColor = onColor;
    }

    public void setOffColor(int offColor) {
        offModeColorIsSet = true;
        FleximageRatingbar.offColor = offColor;
    }

    public FleximageRatingbar(Context context) {
        super(context);
    }

    public FleximageRatingbar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public FleximageRatingbar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public FleximageRatingbar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void display(Context context, LinearLayout view) {
        this.context = context;
        display(view);
    }

    private void display(LinearLayout view) {
        LinearLayout containerLayout = new LinearLayout(context);
        containerLayout.setOrientation(LinearLayout.VERTICAL);

        ImageView imageView_0 = new ImageView(context);
        ImageView imageView_1 = new ImageView(context);
        ImageView imageView_2 = new ImageView(context);
        ImageView imageView_3 = new ImageView(context);
        ImageView imageView_4 = new ImageView(context);

        imageView_0.setImageResource(offMode_imageDrawable);
        imageView_1.setImageResource(offMode_imageDrawable);
        imageView_2.setImageResource(offMode_imageDrawable);
        imageView_3.setImageResource(offMode_imageDrawable);
        imageView_4.setImageResource(offMode_imageDrawable);
        switch (ratingRate) {
            case (0): {
                if (offModeColorIsSet) {
                    imageView_0.setColorFilter(ContextCompat.getColor(context, offColor));
                    imageView_1.setColorFilter(ContextCompat.getColor(context, offColor));
                    imageView_2.setColorFilter(ContextCompat.getColor(context, offColor));
                    imageView_3.setColorFilter(ContextCompat.getColor(context, offColor));
                    imageView_4.setColorFilter(ContextCompat.getColor(context, offColor));
                }
            }
            break;
            case (1): {
                changeImageResource(imageView_0, onMode_imageDrawable);
                if (onModeColorIsSet) {
                    imageView_0.setColorFilter(ContextCompat.getColor(context, onColor));
                }
                if (offModeColorIsSet) {
                    imageView_1.setColorFilter(ContextCompat.getColor(context, offColor));
                    imageView_2.setColorFilter(ContextCompat.getColor(context, offColor));
                    imageView_3.setColorFilter(ContextCompat.getColor(context, offColor));
                    imageView_4.setColorFilter(ContextCompat.getColor(context, offColor));
                }
            }
            break;
            case (2): {
                changeImageResource(imageView_0, onMode_imageDrawable);
                changeImageResource(imageView_1, onMode_imageDrawable);
                if (onModeColorIsSet) {
                    imageView_0.setColorFilter(ContextCompat.getColor(context, onColor));
                    imageView_1.setColorFilter(ContextCompat.getColor(context, onColor));
                }
                if (offModeColorIsSet) {
                    imageView_2.setColorFilter(ContextCompat.getColor(context, offColor));
                    imageView_3.setColorFilter(ContextCompat.getColor(context, offColor));
                    imageView_4.setColorFilter(ContextCompat.getColor(context, offColor));
                }
            }
            break;
            case (3): {
                changeImageResource(imageView_0, onMode_imageDrawable);
                changeImageResource(imageView_1, onMode_imageDrawable);
                changeImageResource(imageView_2, onMode_imageDrawable);
                if (onModeColorIsSet) {
                    imageView_0.setColorFilter(ContextCompat.getColor(context, onColor));
                    imageView_1.setColorFilter(ContextCompat.getColor(context, onColor));
                    imageView_2.setColorFilter(ContextCompat.getColor(context, onColor));
                }
                if (offModeColorIsSet) {
                    imageView_3.setColorFilter(ContextCompat.getColor(context, offColor));
                    imageView_4.setColorFilter(ContextCompat.getColor(context, offColor));
                }
            }
            break;

            case (4): {
                changeImageResource(imageView_0, onMode_imageDrawable);
                changeImageResource(imageView_1, onMode_imageDrawable);
                changeImageResource(imageView_2, onMode_imageDrawable);
                changeImageResource(imageView_3, onMode_imageDrawable);
                if (onModeColorIsSet) {
                    imageView_0.setColorFilter(ContextCompat.getColor(context, onColor));
                    imageView_1.setColorFilter(ContextCompat.getColor(context, onColor));
                    imageView_2.setColorFilter(ContextCompat.getColor(context, onColor));
                    imageView_3.setColorFilter(ContextCompat.getColor(context, onColor));
                }
                if (offModeColorIsSet) {
                    imageView_4.setColorFilter(ContextCompat.getColor(context, offColor));
                }
            }
            break;
            case (5): {
                changeImageResource(imageView_0, onMode_imageDrawable);
                changeImageResource(imageView_1, onMode_imageDrawable);
                changeImageResource(imageView_2, onMode_imageDrawable);
                changeImageResource(imageView_3, onMode_imageDrawable);
                changeImageResource(imageView_4, onMode_imageDrawable);
                if (onModeColorIsSet) {
                    imageView_0.setColorFilter(ContextCompat.getColor(context, onColor));
                    imageView_1.setColorFilter(ContextCompat.getColor(context, onColor));
                    imageView_2.setColorFilter(ContextCompat.getColor(context, onColor));
                    imageView_3.setColorFilter(ContextCompat.getColor(context, onColor));
                    imageView_4.setColorFilter(ContextCompat.getColor(context, onColor));
                }
            }
            break;
        }


        view.setOrientation(orientation);

        if (orientation == LinearLayout.HORIZONTAL) {
            imageView_0.setPadding(0, paddingInBetween, 0, 0);
            imageView_1.setPadding(0, paddingInBetween, 0, 0);
            imageView_2.setPadding(0, paddingInBetween, 0, 0);
            imageView_3.setPadding(0, paddingInBetween, 0, 0);

        } else if (orientation == LinearLayout.VERTICAL) {

            imageView_0.setPadding(0, 0, 0, paddingInBetween);
            imageView_1.setPadding(0, 0, 0, paddingInBetween);
            imageView_2.setPadding(0, 0, 0, paddingInBetween);
            imageView_3.setPadding(0, 0, 0, paddingInBetween);
        }

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(widthOfEachStarInDp,
                heightOfEachStarInDp);
        imageView_0.setLayoutParams(params);
        imageView_1.setLayoutParams(params);
        imageView_2.setLayoutParams(params);
        imageView_3.setLayoutParams(params);
        imageView_4.setLayoutParams(params);

        view.addView(imageView_0);
        view.addView(imageView_1);
        view.addView(imageView_2);
        view.addView(imageView_3);
        view.addView(imageView_4);

    }

    private void changeImageResource(ImageView imageView_0, int ic_star_on) {
        imageView_0.setImageResource(ic_star_on);
    }

    public void setRating(int rating) {
        ratingRate = rating;
    }

}
