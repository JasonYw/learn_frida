package com.bytedance.android.live.common.keyboard;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C134434bum;
import p003X.C134435bun;
import p003X.C74673FcR;

/* loaded from: classes17.dex */
public class MeasureLinearLayout extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public C134434bum LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    static {
        Covode.recordClassIndex(23250);
    }

    public C134434bum getKeyBoardObservable() {
        return this.LIZIZ;
    }

    public final void LIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported && C74673FcR.LIZ().booleanValue()) {
            this.LIZJ++;
        }
    }

    public MeasureLinearLayout(Context context) {
        this(context, null);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        C134435bun LIZ2;
        MethodCollector.m14708i(1565);
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 2).isSupported) {
            MethodCollector.m14707o(1565);
            return;
        }
        super.onDraw(canvas);
        C134434bum c134434bum = this.LIZIZ;
        Context context = getContext();
        if (!PatchProxy.proxy(new Object[]{context, this}, c134434bum, C134434bum.LIZ, false, 4).isSupported && (LIZ2 = c134434bum.LIZIZ.LIZ(context, this)) != null) {
            c134434bum.LIZ(LIZ2.LIZIZ, LIZ2.LIZJ);
        }
        MethodCollector.m14707o(1565);
    }

    public MeasureLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        C134435bun LIZ2;
        MethodCollector.m14708i(1564);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1564);
            return;
        }
        int i3 = this.LIZLLL;
        int i4 = this.LIZJ;
        if (i3 == i4) {
            C134434bum c134434bum = this.LIZIZ;
            Context context = getContext();
            if (!PatchProxy.proxy(new Object[]{context, Integer.valueOf(i2)}, c134434bum, C134434bum.LIZ, false, 3).isSupported && (LIZ2 = c134434bum.LIZIZ.LIZ(context, i2)) != null) {
                c134434bum.LIZ(LIZ2.LIZIZ, LIZ2.LIZJ);
            }
        } else {
            this.LIZLLL = i4;
        }
        super.onMeasure(i, i2);
        MethodCollector.m14707o(1564);
    }

    public MeasureLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1563);
        this.LIZIZ = new C134434bum(this);
        MethodCollector.m14707o(1563);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C134435bun LIZ2;
        MethodCollector.m14708i(1566);
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(1566);
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        C134434bum c134434bum = this.LIZIZ;
        Context context = getContext();
        if (!PatchProxy.proxy(new Object[]{context, this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, c134434bum, C134434bum.LIZ, false, 5).isSupported && (LIZ2 = c134434bum.LIZIZ.LIZ(context, this, i, i2, i3, i4)) != null) {
            c134434bum.LIZ(LIZ2.LIZIZ, LIZ2.LIZJ);
        }
        MethodCollector.m14707o(1566);
    }
}
