package com.alibaba.android.vlayout.extend;

import android.view.View;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* loaded from: classes20.dex */
public class ViewLifeCycleHelper {
    public ViewLifeCycleListener mViewLifeCycleListener;
    public HashMap<View, STATUS> mViewStatusMap = new HashMap<>();
    public VirtualLayoutManager mVirtualLayoutManager;
    public int scrHeight;

    static {
        Covode.recordClassIndex(4370);
    }

    /* loaded from: classes20.dex */
    public enum STATUS {
        APPEARING,
        APPEARED,
        DISAPPEARING,
        DISAPPEARED;

        static {
            Covode.recordClassIndex(4371);
        }
    }

    public void checkViewStatusInScreen() {
        for (int i = 0; i < this.mVirtualLayoutManager.getChildCount(); i++) {
            View childAt = this.mVirtualLayoutManager.getChildAt(i);
            if (this.scrHeight == 0) {
                this.scrHeight = childAt.getContext().getResources().getDisplayMetrics().heightPixels;
            }
            if (this.mVirtualLayoutManager.getVirtualLayoutDirection() == 1) {
                if (childAt.getTop() <= 0 && childAt.getBottom() >= 0 && isViewReadyDisAppearing(childAt)) {
                    setViewDisappearing(childAt);
                } else if (childAt.getTop() <= this.scrHeight && childAt.getBottom() >= this.scrHeight && isViewReadyAppearing(childAt)) {
                    setViewAppearing(childAt);
                }
            } else if (childAt.getTop() <= 0 && childAt.getBottom() >= 0 && isViewReadyAppearing(childAt)) {
                setViewAppearing(childAt);
            } else if (childAt.getTop() <= this.scrHeight && childAt.getBottom() >= this.scrHeight && isViewReadyDisAppearing(childAt)) {
                setViewDisappearing(childAt);
            }
            if (childAt.getTop() >= 0 && childAt.getBottom() <= this.scrHeight) {
                if (isViewReadyAppearing(childAt)) {
                    setViewAppearing(childAt);
                } else if (isViewReadyAppeared(childAt)) {
                    setViewAppeared(childAt);
                }
            } else if (childAt.getBottom() <= 0 || childAt.getTop() >= this.scrHeight) {
                if (isViewReadyDisAppearing(childAt)) {
                    setViewDisappearing(childAt);
                } else if (isViewReadyDisAppeared(childAt)) {
                    setViewDisappeared(childAt);
                }
            }
        }
    }

    private boolean isViewReadyAppeared(View view) {
        if (getViewStatus(view) == STATUS.APPEARING) {
            return true;
        }
        return false;
    }

    private boolean isViewReadyAppearing(View view) {
        if (getViewStatus(view) == STATUS.DISAPPEARED) {
            return true;
        }
        return false;
    }

    private boolean isViewReadyDisAppeared(View view) {
        if (getViewStatus(view) == STATUS.DISAPPEARING) {
            return true;
        }
        return false;
    }

    private boolean isViewReadyDisAppearing(View view) {
        if (getViewStatus(view) == STATUS.APPEARED) {
            return true;
        }
        return false;
    }

    private STATUS getViewStatus(View view) {
        if (!this.mViewStatusMap.containsKey(view)) {
            this.mViewStatusMap.put(view, STATUS.DISAPPEARED);
            return STATUS.DISAPPEARED;
        }
        return this.mViewStatusMap.get(view);
    }

    private void setViewAppeared(View view) {
        if (getViewStatus(view) == STATUS.APPEARED) {
            return;
        }
        setViewstatus(view, STATUS.APPEARED);
        ViewLifeCycleListener viewLifeCycleListener = this.mViewLifeCycleListener;
        if (viewLifeCycleListener != null) {
            viewLifeCycleListener.onAppeared(view);
        }
    }

    private void setViewAppearing(View view) {
        if (getViewStatus(view) == STATUS.APPEARING) {
            return;
        }
        setViewstatus(view, STATUS.APPEARING);
        ViewLifeCycleListener viewLifeCycleListener = this.mViewLifeCycleListener;
        if (viewLifeCycleListener != null) {
            viewLifeCycleListener.onAppearing(view);
        }
    }

    private void setViewDisappeared(View view) {
        if (getViewStatus(view) == STATUS.DISAPPEARED) {
            return;
        }
        setViewstatus(view, STATUS.DISAPPEARED);
        ViewLifeCycleListener viewLifeCycleListener = this.mViewLifeCycleListener;
        if (viewLifeCycleListener != null) {
            viewLifeCycleListener.onDisappeared(view);
        }
    }

    private void setViewDisappearing(View view) {
        if (getViewStatus(view) == STATUS.DISAPPEARING) {
            return;
        }
        setViewstatus(view, STATUS.DISAPPEARING);
        ViewLifeCycleListener viewLifeCycleListener = this.mViewLifeCycleListener;
        if (viewLifeCycleListener != null) {
            viewLifeCycleListener.onDisappearing(view);
        }
    }

    private void setViewstatus(View view, STATUS status) {
        this.mViewStatusMap.put(view, status);
    }

    public ViewLifeCycleHelper(VirtualLayoutManager virtualLayoutManager, ViewLifeCycleListener viewLifeCycleListener) {
        this.mViewLifeCycleListener = viewLifeCycleListener;
        this.mVirtualLayoutManager = virtualLayoutManager;
    }
}
