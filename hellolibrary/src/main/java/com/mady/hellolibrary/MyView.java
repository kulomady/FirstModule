package com.mady.hellolibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by kulomady on 2/14/16.
 * LearnLibrary
 */
public class MyView extends LinearLayout {

    public MyView(Context context) {
        super(context);
        initialize(context);
    }
    public MyView(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
        initialize(context);
    }

    private void initialize(Context context){
        inflate(context, R.layout.my_view, this);
    }
}
