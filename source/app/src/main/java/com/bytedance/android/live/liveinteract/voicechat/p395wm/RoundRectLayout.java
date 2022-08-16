package com.bytedance.android.live.liveinteract.voicechat.p395wm;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.wm.RoundRectLayout */
/* loaded from: classes12.dex */
public final class RoundRectLayout extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public final Path LIZIZ;
    public float LIZJ;
    public float LIZLLL;

    /* renamed from: LJ */
    public float f26505LJ;
    public float LJFF;
    public float LJI;

    static {
        Covode.recordClassIndex(31875);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundRectLayout(Context context) {
        super(context);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2103);
        this.LIZIZ = new Path();
        MethodCollector.m14707o(2103);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(canvas);
        float f = this.LIZJ;
        float f2 = this.LIZLLL;
        float f3 = this.LJFF;
        float f4 = this.f26505LJ;
        this.LIZIZ.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CW);
        canvas.clipPath(this.LIZIZ);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundRectLayout(Context context, AttributeSet attributeSet) {
        this(context);
        C106862S5w.LIZ(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{2130773567, 2130773581, 2130774141, 2130774161, 2130774185});
        this.LJI = obtainStyledAttributes.getDimension(4, this.LJI);
        this.LIZJ = obtainStyledAttributes.getDimension(1, this.LIZJ);
        this.LIZLLL = obtainStyledAttributes.getDimension(3, this.LIZLLL);
        this.LJFF = obtainStyledAttributes.getDimension(2, this.LJFF);
        this.f26505LJ = obtainStyledAttributes.getDimension(0, this.f26505LJ);
        float f = this.LJI;
        if (f != 0.0f) {
            this.LIZJ = f;
            this.LIZLLL = f;
            this.LJFF = f;
            this.f26505LJ = f;
        }
        obtainStyledAttributes.recycle();
    }
}
