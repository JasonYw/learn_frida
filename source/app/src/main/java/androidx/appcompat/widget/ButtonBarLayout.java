package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.covode.number.Covode;

/* loaded from: classes12.dex */
public class ButtonBarLayout extends LinearLayout {
    public boolean LIZ;
    public int LIZIZ = -1;
    public int LIZJ;

    static {
        Covode.recordClassIndex(632);
    }

    private boolean LIZ() {
        if (getOrientation() == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.LIZJ, super.getMinimumHeight());
    }

    private int LIZ(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void setAllowStacking(boolean z) {
        if (this.LIZ != z) {
            this.LIZ = z;
            if (!this.LIZ && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    private void setStacked(boolean z) {
        int i;
        int i2;
        setOrientation(z ? 1 : 0);
        if (z) {
            i = 5;
        } else {
            i = 80;
        }
        setGravity(i);
        View findViewById = findViewById(2131190220);
        if (findViewById != null) {
            if (z) {
                i2 = 8;
            } else {
                i2 = 4;
            }
            findViewById.setVisibility(i2);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130772183});
        ViewCompat.saveAttributeDataForStyleable(this, context, new int[]{2130772183}, attributeSet, obtainStyledAttributes, 0, 0);
        this.LIZ = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
        if (r2 != false) goto L21;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r2 = android.view.View.MeasureSpec.getSize(r7)
            boolean r0 = r6.LIZ
            r5 = 0
            if (r0 == 0) goto L18
            int r0 = r6.LIZIZ
            if (r2 <= r0) goto L16
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L16
            r6.setStacked(r5)
        L16:
            r6.LIZIZ = r2
        L18:
            boolean r0 = r6.LIZ()
            r4 = 1
            if (r0 != 0) goto La7
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 != r0) goto La7
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r2 = 1
        L2e:
            super.onMeasure(r0, r8)
            boolean r0 = r6.LIZ
            if (r0 == 0) goto La4
            boolean r0 = r6.LIZ()
            if (r0 != 0) goto La4
            int r1 = r6.getMeasuredWidthAndState()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r0
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 != r0) goto La4
            r6.setStacked(r4)
            r0 = 1
        L4a:
            super.onMeasure(r7, r8)
        L4d:
            int r2 = r6.LIZ(r5)
            if (r2 < 0) goto L93
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r3 = r6.getPaddingTop()
            int r0 = r0.getMeasuredHeight()
            int r3 = r3 + r0
            int r0 = r1.topMargin
            int r3 = r3 + r0
            int r0 = r1.bottomMargin
            int r3 = r3 + r0
            int r3 = r3 + r5
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L9d
            int r2 = r2 + r4
            int r0 = r6.LIZ(r2)
            if (r0 < 0) goto L92
            android.view.View r0 = r6.getChildAt(r0)
            int r2 = r0.getPaddingTop()
            r1 = 1098907648(0x41800000, float:16.0)
            android.content.res.Resources r0 = r6.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r0 = r0 * r1
            int r0 = (int) r0
            int r2 = r2 + r0
            int r3 = r3 + r2
        L92:
            r5 = r3
        L93:
            int r0 = androidx.core.view.ViewCompat.getMinimumHeight(r6)
            if (r0 == r5) goto L9c
            r6.setMinimumHeight(r5)
        L9c:
            return
        L9d:
            int r0 = r6.getPaddingBottom()
            int r5 = r3 + r0
            goto L93
        La4:
            if (r2 == 0) goto L4d
            goto L4a
        La7:
            r0 = r7
            r2 = 0
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ButtonBarLayout.onMeasure(int, int):void");
    }
}
