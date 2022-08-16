package com.bytedance.android.live.media.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;
import p003X.C140181dPd;
import p003X.C140192dPo;
import p003X.C450543rs;

/* loaded from: classes12.dex */
public final class ParentTouchScrollView extends C450543rs {
    public static ChangeQuickRedirect LIZIZ;
    public Function0<Integer> LIZJ;

    static {
        Covode.recordClassIndex(32426);
    }

    public ParentTouchScrollView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ParentTouchScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final Function0<Integer> getGetContentBottom() {
        return this.LIZJ;
    }

    @Override // p003X.C450543rs, android.widget.ScrollView, android.view.View
    public final float getTopFadingEdgeStrength() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        return super.getTopFadingEdgeStrength() * getTopFading();
    }

    public final void setGetContentBottom(Function0<Integer> function0) {
        this.LIZJ = function0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{this, motionEvent}, null, LIZIZ, true, 5);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        if (C140192dPo.LIZ("dispatchScrollViewTouchEvent")) {
            C140181dPd.LJFF();
        }
        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZIZ, false, 7);
        if (proxy3.isSupported) {
            return ((Boolean) proxy3.result).booleanValue();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Function0<Integer> function0 = this.LIZJ;
        if (function0 != null && motionEvent != null) {
            int intValue = function0.mo30099invoke().intValue();
            if (motionEvent.getAction() == 0 && motionEvent.getY() > intValue) {
                return false;
            }
            return super.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParentTouchScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
    }

    public /* synthetic */ ParentTouchScrollView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
