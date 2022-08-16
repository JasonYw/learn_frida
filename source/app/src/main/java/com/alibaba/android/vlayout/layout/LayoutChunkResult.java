package com.alibaba.android.vlayout.layout;

import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public class LayoutChunkResult {
    public int mConsumed;
    public boolean mFinished;
    public boolean mFocusable;
    public boolean mIgnoreConsumed;

    static {
        Covode.recordClassIndex(4393);
    }

    public void resetInternal() {
        this.mConsumed = 0;
        this.mFinished = false;
        this.mIgnoreConsumed = false;
        this.mFocusable = false;
    }

    public String toString() {
        return "LayoutChunkResult{mConsumed=" + this.mConsumed + ", mFinished=" + this.mFinished + ", mIgnoreConsumed=" + this.mIgnoreConsumed + ", mFocusable=" + this.mFocusable + '}';
    }
}
