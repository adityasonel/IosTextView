package com.adityasonel.ios_textview;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;

public class IosTextViewBold extends AppCompatTextView {

    public IosTextViewBold(Context context) {
        super(context);
        Util.initBoldFont(context, this);
    }

    public IosTextViewBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        Util.initBoldFont(context, this);
    }

    public IosTextViewBold(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Util.initBoldFont(context, this);
    }

}
