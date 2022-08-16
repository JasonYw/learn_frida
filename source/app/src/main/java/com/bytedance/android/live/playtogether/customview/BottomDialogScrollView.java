package com.bytedance.android.live.playtogether.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC130367aqy;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* loaded from: classes16.dex */
public final class BottomDialogScrollView extends ScrollView {
    public static ChangeQuickRedirect LIZ;
    public View LIZIZ;
    public AbstractC130367aqy LIZJ;

    static {
        Covode.recordClassIndex(32939);
    }

    public BottomDialogScrollView(Context context) {
        super(context);
        MethodCollector.m14708i(2168);
        MethodCollector.m14707o(2168);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{this, motionEvent}, null, LIZ, true, 1);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        if (C140192dPo.LIZ("dispatchScrollViewTouchEvent")) {
            C140181dPd.LJFF();
        }
        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 3);
        if (proxy3.isSupported) {
            return ((Boolean) proxy3.result).booleanValue();
        }
        if (this.LIZJ != null && motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null && valueOf.intValue() == 2 && !PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            View view = this.LIZIZ;
            if (view != null) {
                Intrinsics.checkNotNull(view);
                if (view.getMeasuredHeight() <= getScrollY() + getHeight()) {
                    AbstractC130367aqy abstractC130367aqy = this.LIZJ;
                    if (abstractC130367aqy != null) {
                        abstractC130367aqy.LIZ();
                    }
                }
            }
            if (getScrollY() == 0) {
                AbstractC130367aqy abstractC130367aqy2 = this.LIZJ;
                if (abstractC130367aqy2 != null) {
                    abstractC130367aqy2.LIZIZ();
                }
            } else {
                AbstractC130367aqy abstractC130367aqy3 = this.LIZJ;
                if (abstractC130367aqy3 != null) {
                    abstractC130367aqy3.LIZJ();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public BottomDialogScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(2169);
        MethodCollector.m14707o(2169);
    }

    public BottomDialogScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(2170);
        MethodCollector.m14707o(2170);
    }
}
