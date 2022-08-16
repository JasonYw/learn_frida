package com.bytedance.android.live.broadcast.gamedetail.order.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public final class ProcessView extends View {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public final Lazy LIZJ;
    public final Lazy LIZLLL;

    /* renamed from: LJ */
    public final Lazy f25882LJ;
    public final float LJFF;
    public final float LJI;

    static {
        Covode.recordClassIndex(16541);
    }

    public ProcessView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ProcessView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final ObjectAnimator getLoadingAnimator() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (ObjectAnimator) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    private final RectF getOval() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (RectF) (proxy.isSupported ? proxy.result : this.f25882LJ.mo27335getValue());
    }

    private final Paint getPaint() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (Paint) (proxy.isSupported ? proxy.result : this.LIZJ.mo27335getValue());
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        this.LIZIZ = false;
        getLoadingAnimator().cancel();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        if (this.LIZIZ) {
            LIZ();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        getLoadingAnimator().cancel();
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        this.LIZIZ = true;
        ObjectAnimator loadingAnimator = getLoadingAnimator();
        Intrinsics.checkNotNullExpressionValue(loadingAnimator, "");
        if (loadingAnimator.isRunning()) {
            return;
        }
        getLoadingAnimator().start();
    }

    public final void setColor(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        getPaint().setColor(i);
    }

    public final void setStrokeWidth(float f) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        getPaint().setStrokeWidth(f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        MethodCollector.m14708i(1276);
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 11).isSupported) {
            MethodCollector.m14707o(1276);
            return;
        }
        C106862S5w.LIZ(canvas);
        super.onDraw(canvas);
        canvas.drawArc(getOval(), this.LJFF, this.LJI, false, getPaint());
        MethodCollector.m14707o(1276);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            LIZIZ();
        } else if (this.LIZIZ) {
            LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1277);
        this.LIZJ = LazyKt__LazyJVMKt.lazy(ProcessView$paint$2.INSTANCE);
        this.LIZLLL = LazyKt__LazyJVMKt.lazy(new ProcessView$loadingAnimator$2(this));
        this.f25882LJ = LazyKt__LazyJVMKt.lazy(ProcessView$oval$2.INSTANCE);
        this.LJFF = 45.0f;
        this.LJI = 292.5f;
        MethodCollector.m14707o(1277);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float f;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 12).isSupported) {
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        int min = Math.min(i, i2);
        float strokeWidth = getPaint().getStrokeWidth() / 2.0f;
        float f2 = 0.0f;
        if (i > i2) {
            f = (i / 2.0f) - (i2 / 2.0f);
        } else {
            f2 = (i2 / 2.0f) - (i / 2.0f);
            f = 0.0f;
        }
        float f3 = min;
        getOval().set(f + strokeWidth, f2 + strokeWidth, (f + f3) - strokeWidth, (f2 + f3) - strokeWidth);
    }

    public /* synthetic */ ProcessView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
