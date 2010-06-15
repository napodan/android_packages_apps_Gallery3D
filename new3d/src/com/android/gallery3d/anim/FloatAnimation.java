package com.android.gallery3d.anim;

public class FloatAnimation extends Animation {

    private final float mFrom;
    private final float mTo;
    private float mCurrent;

    public FloatAnimation(float from, float to, int duration) {
        mFrom = from;
        mTo = to;
        setDuration(duration);
    }

    @Override
    protected boolean onCalculate(float progress) {
        if (progress < 1f) {
            mCurrent = mFrom + (mTo - mFrom) * progress;
            return true;
        } else {
            mCurrent = mTo;
            return false;
        }
    }

    public float get() {
        return mCurrent;
    }
}