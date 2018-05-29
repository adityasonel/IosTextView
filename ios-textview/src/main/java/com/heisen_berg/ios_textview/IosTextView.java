package com.heisen_berg.ios_textview;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class IosTextView extends AppCompatTextView {

    public IosTextView(Context context) {
        super(context);
        init();
    }

    public IosTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public IosTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/ios_font.otf");
            setTypeface(tf);
        }
    }
}
