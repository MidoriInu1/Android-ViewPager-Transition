package com.song.transitionlib;

import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;


public class FlipTransformer implements ViewPager.PageTransformer {
    private static final float MIN_SCALE = 0.9f;

    @Override
    public void transformPage(View view, float position) {
        int pageWidth = view.getWidth();
        float density = view.getContext().getResources().getDisplayMetrics().density;
        if (position <= -1)
        {
            view.setAlpha(0);
            view.setTranslationX(0);

        } else if (position <= 1)
        {
            float scaleFactor = Math.max(MIN_SCALE,(1 - (Math.abs(position)) * 0.5f));
            view.setCameraDistance(pageWidth * density * 10);
            if (position < 0)
            {
                if(position < -0.5){
                    view.setAlpha(0);
                }else{
                    view.setAlpha(1 + position);
                }
                view.setRotationY(Math.abs(position) * -180);
                view.setTranslationX(pageWidth * -position);
            } else
            {
                if(position < 0.5){
                    view.setAlpha(1);
                }else{
                    view.setAlpha(1 - position);
                }
                view.setRotationY( Math.abs(position) * 180);
                view.setTranslationX(pageWidth * -position);
            }

            view.setScaleX(scaleFactor);
            view.setScaleY(scaleFactor);
            //fix touch bug
            if (position==1||position==0){
                view.setTranslationX(0);
            }

        } else
        {
            view.setAlpha(0);
            view.setTranslationX(0);
        }
    }
}
