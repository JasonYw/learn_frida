package com.bytedance.android.live.broadcast.banner.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes22.dex */
public final class LinearBannerIndicator extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public final Context LIZIZ;
    public Drawable LIZJ;
    public Drawable LIZLLL;

    /* renamed from: LJ */
    public int f25785LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;

    static {
        Covode.recordClassIndex(14652);
    }

    public final int getSize() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return getChildCount();
    }

    public final void setSelectedHeight(int i) {
        this.LJFF = i;
    }

    public final void setSelectedWidth(int i) {
        this.f25785LJ = i;
    }

    public final void setUnSelectedHeight(int i) {
        this.LJII = i;
    }

    public final void setUnSelectedWidth(int i) {
        this.LJI = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinearBannerIndicator(Context context) {
        this(context, null);
        C106862S5w.LIZ(context);
    }

    public final void setData(int i) {
        LinearLayout.LayoutParams layoutParams;
        MethodCollector.m14708i(1196);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1196);
            return;
        }
        removeAllViews();
        if (i <= 1) {
            setVisibility(4);
            MethodCollector.m14707o(1196);
            return;
        }
        setVisibility(0);
        for (int i2 = 0; i2 < i; i2++) {
            View view = new View(this.LIZIZ);
            if (i2 == 0) {
                this.LJIIJ = 0;
                view.setBackgroundDrawable(this.LIZJ);
                layoutParams = new LinearLayout.LayoutParams(this.f25785LJ, this.LJFF);
            } else {
                view.setBackgroundDrawable(this.LIZLLL);
                layoutParams = new LinearLayout.LayoutParams(this.LJI, this.LJII);
            }
            layoutParams.leftMargin = this.LJIIIIZZ;
            layoutParams.rightMargin = this.LJIIIZ;
            addView(view, layoutParams);
        }
        MethodCollector.m14707o(1196);
    }

    public final void setSelectPosition(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        int childCount = getChildCount();
        if (i >= 0 && i < childCount) {
            View childAt = getChildAt(this.LJIIJ);
            if (childAt != null) {
                UIUtils.updateLayout(childAt, this.LJI, this.LJII);
                childAt.setBackgroundDrawable(this.LIZLLL);
            }
            this.LJIIJ = i;
            View childAt2 = getChildAt(this.LJIIJ);
            if (childAt2 != null) {
                UIUtils.updateLayout(childAt2, this.f25785LJ, this.LJFF);
                childAt2.setBackgroundDrawable(this.LIZJ);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinearBannerIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C106862S5w.LIZ(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearBannerIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1197);
        this.LIZIZ = context;
        int dip2Px = (int) UIUtils.dip2Px(context, 4.0f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130774924, 2130774925, 2130774926, 2130774927, 2130774928, 2130774929});
            if (obtainStyledAttributes != null) {
                Drawable drawable = obtainStyledAttributes.getDrawable(0);
                this.LIZJ = drawable == null ? obtainStyledAttributes.getResources().getDrawable(2130857793) : drawable;
                Drawable drawable2 = obtainStyledAttributes.getDrawable(3);
                this.LIZLLL = drawable2 == null ? obtainStyledAttributes.getResources().getDrawable(2130857794) : drawable2;
                this.f25785LJ = obtainStyledAttributes.getDimensionPixelOffset(2, dip2Px);
                this.LJFF = obtainStyledAttributes.getDimensionPixelOffset(1, dip2Px);
                this.LJI = obtainStyledAttributes.getDimensionPixelOffset(5, dip2Px);
                this.LJII = obtainStyledAttributes.getDimensionPixelOffset(4, dip2Px);
                obtainStyledAttributes.recycle();
            }
        } else {
            this.LIZJ = getResources().getDrawable(2130857793);
            this.LIZLLL = getResources().getDrawable(2130857794);
        }
        this.LJIIIIZZ = (int) UIUtils.dip2Px(this.LIZIZ, 2.0f);
        this.LJIIIZ = (int) UIUtils.dip2Px(this.LIZIZ, 2.0f);
        MethodCollector.m14707o(1197);
    }
}
