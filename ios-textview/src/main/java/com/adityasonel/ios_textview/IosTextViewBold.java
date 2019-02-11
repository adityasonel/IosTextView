package com.adityasonel.ios_textview;

import android.content.Context;

import androidx.appcompat.widget.AppCompatTextView;
import android.util.AttributeSet;

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
