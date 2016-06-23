package com.song.viewpagertransition;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

import com.song.transitionlib.FlipTransformer;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private TestPagerAdapter mPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = (ViewPager)this.findViewById(R.id.viewPager);
        mPagerAdapter = new TestPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mPagerAdapter);

        mViewPager.setPageTransformer(true, new FlipTransformer());

        /* @see http://stackoverflow.com/questions/8155257/slowing-speed-of-viewpager-controller-in-android */
        try {
            Field mScroller;
            mScroller = ViewPager.class.getDeclaredField("mScroller");
            mScroller.setAccessible(true);
            FixedSpeedScroller scroller = new FixedSpeedScroller(mViewPager.getContext(), new AccelerateDecelerateInterpolator());
            scroller.setFixedDuration(1000);
            mScroller.set(mViewPager, scroller);
        } catch (NoSuchFieldException e) {
        } catch (IllegalArgumentException e) {
        } catch (IllegalAccessException e) {
        }

    }
    //btn onclick
    public void changePage(View view){
        if (mViewPager.getCurrentItem()==0)
            mViewPager.setCurrentItem(1);
        else
            mViewPager.setCurrentItem(0);
    }
}
