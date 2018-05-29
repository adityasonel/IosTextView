package com.adityasonel.ios_textview;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class IosTextViewRegular extends AppCompatTextView {

    public IosTextViewRegular(Context context) {
        super(context);
        init();
    }

    public IosTextViewRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public IosTextViewRegular(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/ios_font_regular.otf");
            setTypeface(tf);
        }
    }
}
