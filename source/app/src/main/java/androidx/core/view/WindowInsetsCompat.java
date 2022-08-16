package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.WindowInsets;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import p003X.C109592TCw;
import p003X.C138591czz;
import p003X.C138593d01;
import p003X.C138595d03;
import p003X.C138596d04;
import p003X.C138597d05;
import p003X.C138598d06;
import p003X.C138599d07;
import p003X.C14V;
import p003X.N8G;

/* loaded from: classes17.dex */
public class WindowInsetsCompat {
    public static final WindowInsetsCompat CONSUMED;
    public final C138595d03 mImpl;

    public WindowInsetsCompat consumeDisplayCutout() {
        return this.mImpl.LJFF();
    }

    public WindowInsetsCompat consumeStableInsets() {
        return this.mImpl.LIZLLL();
    }

    public WindowInsetsCompat consumeSystemWindowInsets() {
        return this.mImpl.LIZJ();
    }

    public C14V getDisplayCutout() {
        return this.mImpl.mo21648LJ();
    }

    public C138591czz getMandatorySystemGestureInsets() {
        return this.mImpl.LJIIIZ();
    }

    public int getStableInsetBottom() {
        return getStableInsets().f18360LJ;
    }

    public int getStableInsetLeft() {
        return getStableInsets().LIZIZ;
    }

    public int getStableInsetRight() {
        return getStableInsets().LIZLLL;
    }

    public int getStableInsetTop() {
        return getStableInsets().LIZJ;
    }

    public C138591czz getStableInsets() {
        return this.mImpl.LJII();
    }

    public C138591czz getSystemGestureInsets() {
        return this.mImpl.LJIIIIZZ();
    }

    public int getSystemWindowInsetBottom() {
        return getSystemWindowInsets().f18360LJ;
    }

    public int getSystemWindowInsetLeft() {
        return getSystemWindowInsets().LIZIZ;
    }

    public int getSystemWindowInsetRight() {
        return getSystemWindowInsets().LIZLLL;
    }

    public int getSystemWindowInsetTop() {
        return getSystemWindowInsets().LIZJ;
    }

    public C138591czz getSystemWindowInsets() {
        return this.mImpl.LJI();
    }

    public C138591czz getTappableElementInsets() {
        return this.mImpl.LJIIJ();
    }

    public boolean isConsumed() {
        return this.mImpl.LIZIZ();
    }

    public boolean isRound() {
        return this.mImpl.LIZ();
    }

    public boolean hasStableInsets() {
        if (!getStableInsets().equals(C138591czz.LIZ)) {
            return true;
        }
        return false;
    }

    public boolean hasSystemWindowInsets() {
        if (!getSystemWindowInsets().equals(C138591czz.LIZ)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        C138595d03 c138595d03 = this.mImpl;
        if (c138595d03 == null) {
            return 0;
        }
        return c138595d03.hashCode();
    }

    public WindowInsets toWindowInsets() {
        C138595d03 c138595d03 = this.mImpl;
        if (c138595d03 instanceof C138596d04) {
            return ((C138596d04) c138595d03).LIZIZ;
        }
        return null;
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(1098);
        CONSUMED = new C138593d01().LIZ().consumeDisplayCutout().consumeStableInsets().consumeSystemWindowInsets();
    }

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(1098);
        CONSUMED = new C138593d01().LIZ().consumeDisplayCutout().consumeStableInsets().consumeSystemWindowInsets();
    }

    public boolean hasInsets() {
        if (!hasSystemWindowInsets() && !hasStableInsets() && getDisplayCutout() == null && getSystemGestureInsets().equals(C138591czz.LIZ) && getMandatorySystemGestureInsets().equals(C138591czz.LIZ) && getTappableElementInsets().equals(C138591czz.LIZ)) {
            return false;
        }
        return true;
    }

    public static WindowInsetsCompat toWindowInsetsCompat(WindowInsets windowInsets) {
        C109592TCw.LIZ(windowInsets);
        return new WindowInsetsCompat(windowInsets);
    }

    public WindowInsetsCompat inset(C138591czz c138591czz) {
        return inset(c138591czz.LIZIZ, c138591czz.LIZJ, c138591czz.LIZLLL, c138591czz.f18360LJ);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowInsetsCompat)) {
            return false;
        }
        return N8G.LIZ(this.mImpl, ((WindowInsetsCompat) obj).mImpl);
    }

    public WindowInsetsCompat(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.mImpl = new C138597d05(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.mImpl = new C138599d07(this, windowInsets);
        } else {
            int i = Build.VERSION.SDK_INT;
            this.mImpl = new C138598d06(this, windowInsets);
        }
    }

    public WindowInsetsCompat replaceSystemWindowInsets(Rect rect) {
        C138593d01 c138593d01 = new C138593d01(this);
        c138593d01.LIZ(C138591czz.LIZ(rect.left, rect.top, rect.right, rect.bottom));
        return c138593d01.LIZ();
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            C138595d03 c138595d03 = windowInsetsCompat.mImpl;
            if (Build.VERSION.SDK_INT >= 29 && (c138595d03 instanceof C138597d05)) {
                this.mImpl = new C138597d05(this, (C138597d05) c138595d03);
                return;
            } else if (Build.VERSION.SDK_INT >= 28 && (c138595d03 instanceof C138599d07)) {
                this.mImpl = new C138599d07(this, (C138599d07) c138595d03);
                return;
            } else {
                int i = Build.VERSION.SDK_INT;
                if (c138595d03 instanceof C138598d06) {
                    this.mImpl = new C138598d06(this, (C138598d06) c138595d03);
                    return;
                }
                int i2 = Build.VERSION.SDK_INT;
                if (c138595d03 instanceof C138596d04) {
                    this.mImpl = new C138596d04(this, (C138596d04) c138595d03);
                    return;
                } else {
                    this.mImpl = new C138595d03(this);
                    return;
                }
            }
        }
        this.mImpl = new C138595d03(this);
    }

    public WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
        return this.mImpl.LIZ(i, i2, i3, i4);
    }

    public WindowInsetsCompat replaceSystemWindowInsets(int i, int i2, int i3, int i4) {
        C138593d01 c138593d01 = new C138593d01(this);
        c138593d01.LIZ(C138591czz.LIZ(i, i2, i3, i4));
        return c138593d01.LIZ();
    }

    public static C138591czz insetInsets(C138591czz c138591czz, int i, int i2, int i3, int i4) {
        int max = Math.max(0, c138591czz.LIZIZ - i);
        int max2 = Math.max(0, c138591czz.LIZJ - i2);
        int max3 = Math.max(0, c138591czz.LIZLLL - i3);
        int max4 = Math.max(0, c138591czz.f18360LJ - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return c138591czz;
        }
        return C138591czz.LIZ(max, max2, max3, max4);
    }
}
