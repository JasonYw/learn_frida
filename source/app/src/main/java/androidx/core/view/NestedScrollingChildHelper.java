package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import p003X.C139054d7S;

/* loaded from: classes17.dex */
public class NestedScrollingChildHelper {
    public boolean mIsNestedScrollingEnabled;
    public ViewParent mNestedScrollingParentNonTouch;
    public ViewParent mNestedScrollingParentTouch;
    public int[] mTempNestedScrollConsumed;
    public final View mView;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            Covode.recordClassIndex(1073);
        } else {
            Covode.recordClassIndex(1073);
        }
    }

    public boolean isNestedScrollingEnabled() {
        return this.mIsNestedScrollingEnabled;
    }

    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    public void onDetachedFromWindow() {
        ViewCompat.stopNestedScroll(this.mView);
    }

    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    private int[] getTempNestedScrollConsumed() {
        if (this.mTempNestedScrollConsumed == null) {
            this.mTempNestedScrollConsumed = new int[2];
        }
        return this.mTempNestedScrollConsumed;
    }

    public NestedScrollingChildHelper(View view) {
        this.mView = view;
    }

    public void onStopNestedScroll(View view) {
        ViewCompat.stopNestedScroll(this.mView);
    }

    public boolean startNestedScroll(int i) {
        return startNestedScroll(i, 0);
    }

    private ViewParent getNestedScrollingParentForType(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.mNestedScrollingParentNonTouch;
        }
        return this.mNestedScrollingParentTouch;
    }

    public boolean hasNestedScrollingParent(int i) {
        if (getNestedScrollingParentForType(i) != null) {
            return true;
        }
        return false;
    }

    public void setNestedScrollingEnabled(boolean z) {
        if (this.mIsNestedScrollingEnabled) {
            ViewCompat.stopNestedScroll(this.mView);
        }
        this.mIsNestedScrollingEnabled = z;
    }

    public void stopNestedScroll(int i) {
        ViewParent nestedScrollingParentForType = getNestedScrollingParentForType(i);
        if (nestedScrollingParentForType != null) {
            View view = this.mView;
            if (nestedScrollingParentForType instanceof AbstractC0254k) {
                ((AbstractC0254k) nestedScrollingParentForType).onStopNestedScroll(view, i);
            } else if (i == 0) {
                int i2 = Build.VERSION.SDK_INT;
                try {
                    nestedScrollingParentForType.onStopNestedScroll(view);
                } catch (AbstractMethodError unused) {
                }
            }
            setNestedScrollingParentForType(i, null);
        }
    }

    private void setNestedScrollingParentForType(int i, ViewParent viewParent) {
        if (i != 0) {
            if (i == 1) {
                this.mNestedScrollingParentNonTouch = viewParent;
                return;
            }
            return;
        }
        this.mNestedScrollingParentTouch = viewParent;
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        ViewParent nestedScrollingParentForType;
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(0)) == null) {
            return false;
        }
        return C139054d7S.LIZ(nestedScrollingParentForType, this.mView, f, f2);
    }

    public boolean startNestedScroll(int i, int i2) {
        if (hasNestedScrollingParent(i2)) {
            return true;
        }
        if (isNestedScrollingEnabled()) {
            View view = this.mView;
            for (ViewParent parent = this.mView.getParent(); parent != null; parent = parent.getParent()) {
                if (C139054d7S.LIZ(parent, view, this.mView, i, i2)) {
                    setNestedScrollingParentForType(i2, parent);
                    View view2 = this.mView;
                    if (parent instanceof AbstractC0254k) {
                        ((AbstractC0254k) parent).onNestedScrollAccepted(view, view2, i, i2);
                    } else if (i2 == 0) {
                        int i3 = Build.VERSION.SDK_INT;
                        try {
                            parent.onNestedScrollAccepted(view, view2, i);
                            return true;
                        } catch (AbstractMethodError unused) {
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = parent;
                }
            }
            return false;
        }
        return false;
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        ViewParent nestedScrollingParentForType;
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(0)) == null) {
            return false;
        }
        return C139054d7S.LIZ(nestedScrollingParentForType, this.mView, f, f2, z);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return dispatchNestedScrollInternal(i, i2, i3, i4, iArr, 0, null);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent nestedScrollingParentForType;
        int i4;
        int i5;
        int[] iArr3 = iArr;
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.mView.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr3 == null) {
            iArr3 = getTempNestedScrollConsumed();
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view = this.mView;
        if (nestedScrollingParentForType instanceof AbstractC0254k) {
            ((AbstractC0254k) nestedScrollingParentForType).onNestedPreScroll(view, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            int i6 = Build.VERSION.SDK_INT;
            try {
                nestedScrollingParentForType.onNestedPreScroll(view, i, i2, iArr3);
            } catch (AbstractMethodError unused) {
            }
        }
        if (iArr2 != null) {
            this.mView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return dispatchNestedScrollInternal(i, i2, i3, i4, iArr, i5, null);
    }

    public void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        dispatchNestedScrollInternal(i, i2, i3, i4, iArr, i5, iArr2);
    }

    private boolean dispatchNestedScrollInternal(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent nestedScrollingParentForType;
        int i6;
        int i7;
        int[] iArr3 = iArr2;
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.mView.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr3 == null) {
            iArr3 = getTempNestedScrollConsumed();
            iArr3[0] = 0;
            iArr3[1] = 0;
        }
        View view = this.mView;
        if (nestedScrollingParentForType instanceof NestedScrollingParent3) {
            ((NestedScrollingParent3) nestedScrollingParentForType).onNestedScroll(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (nestedScrollingParentForType instanceof AbstractC0254k) {
                ((AbstractC0254k) nestedScrollingParentForType).onNestedScroll(view, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                int i8 = Build.VERSION.SDK_INT;
                try {
                    nestedScrollingParentForType.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError unused) {
                }
            }
        }
        if (iArr != null) {
            this.mView.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }
}
