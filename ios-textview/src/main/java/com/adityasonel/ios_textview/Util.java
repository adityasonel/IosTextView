package com.adityasonel.ios_textview;

import android.content.Context;
import android.graphics.Typeface;
import androidx.appcompat.widget.AppCompatTextView;

public class Util {

    public static void initBoldFont(Context context, AppCompatTextView textView) {
        if (!textView.isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(context.getAssets(), context.getResources().getString(R.string.ios_bold_font_path));
            textView.setTypeface(tf);
        }
    }

    public static void initRegularFont(Context context, AppCompatTextView textView) {
        if (!textView.isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(context.getAssets(), context.getResources().getString(R.string.ios_regular_font_path));
            textView.setTypeface(tf);
        }
    }

}
