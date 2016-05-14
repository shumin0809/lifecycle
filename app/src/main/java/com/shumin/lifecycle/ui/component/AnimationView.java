package com.shumin.lifecycle.ui.component;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * Created by shumin on 5/14/16.
 *
 * This class is to show animation of custom view.
 *
 */
public class AnimationView extends RelativeLayout {
    public AnimationView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AnimationView(Context context) {
        super(context);
    }

    public AnimationView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
