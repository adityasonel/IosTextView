package com.adityasonel.ios_textview;

import android.content.Context;

import androidx.appcompat.widget.AppCompatTextView;
import android.util.AttributeSet;

public class IosTextViewRegular extends AppCompatTextView {

    public IosTextViewRegular(Context context) {
        super(context);
        Util.initRegularFont(context, this);
    }

    public IosTextViewRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        Util.initRegularFont(context, this);
    }

    public IosTextViewRegular(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Util.initRegularFont(context, this);
    }

}
