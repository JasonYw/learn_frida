package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class ToolItemFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public Function1<? super Integer, Unit> LIZIZ;
    public Function1<? super MotionEvent, Unit> LIZJ;

    static {
        Covode.recordClassIndex(18851);
    }

    public ToolItemFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public ToolItemFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setDispatchTouchEventListener(Function1<? super MotionEvent, Unit> function1) {
        if (PatchProxy.proxy(new Object[]{function1}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(function1);
        this.LIZJ = function1;
    }

    public final void setVisibilityChangeListener(Function1<? super Integer, Unit> function1) {
        if (PatchProxy.proxy(new Object[]{function1}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(function1);
        this.LIZIZ = function1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Function1<? super MotionEvent, Unit> function1;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (motionEvent != null && (function1 = this.LIZJ) != null) {
            function1.invoke(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        super.setVisibility(i);
        Function1<? super Integer, Unit> function1 = this.LIZIZ;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolItemFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1382);
        MethodCollector.m14707o(1382);
    }

    public /* synthetic */ ToolItemFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
