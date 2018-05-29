package com.adityasonel.ios_textview;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class IosTextViewBold extends AppCompatTextView {

    public IosTextViewBold(Context context) {
        super(context);
        init();
    }

    public IosTextViewBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public IosTextViewBold(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/ios_font_bold.otf");
            setTypeface(tf);
        }
    }
}
