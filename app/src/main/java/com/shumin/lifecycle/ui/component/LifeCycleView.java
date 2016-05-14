package com.shumin.lifecycle.ui.component;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.shumin.lifecycle.R;

/**
 * Created by shumin on 5/14/16.
 *
 * This class is to show custom view life cycle.
 *
 * To implement a custom view, you will usually begin by providing overrides
 * for some of the standard methods that the framework calls on all views.
 *
 */
public class LifeCycleView extends FrameLayout {

    public LifeCycleView(Context context) {
        super(context);
        Log.d("LifeCycleView", "(Context context)");
    }

    public LifeCycleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.d("LifeCycleView", "(Context context, AttributeSet attrs)");
    }

    public LifeCycleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.d("LifeCycleView", "(Context context, AttributeSet attrs, int defStyleAttr)");
    }

    public void init() {
        ((TextView) findViewById(R.id.first_view_title)).setText("Bang! It's first view");
    }

    /*
     * Creation : Called after a view and all of its children has been inflated from XML.
     */
    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        Log.d("LifeCycleView", "onFinishInflate");
    }

    /*
     * Attaching : Called when the view is attached to a window. (after onFinishInflate)
     */
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d("LifeCycleView", "onAttachedToWindow");
    }

    /*
     * Attaching : Called when the view is detached from its window.
     */
    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d("LifeCycleView", "onDetachedFromWindow");
    }

    /*
     * Attaching : Called when the visibility of the window containing the view has changed.
     */
    @Override
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        Log.d("LifeCycleView", "onWindowVisibilityChanged");
    }

    /*
     * Layout : Called to determine the size requirements for this view and all of its children.
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    /*
     * Layout : Called when the size of this view has changed.
     */
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }

    // requestLayout() => go back to measure()
    // invalidate() => go back to dispatchDraw()
}
