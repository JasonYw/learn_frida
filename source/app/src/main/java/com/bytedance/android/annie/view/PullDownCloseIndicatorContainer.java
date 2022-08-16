package com.bytedance.android.annie.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes.dex */
public class PullDownCloseIndicatorContainer extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public ForceInterceptConstraintLayout LIZIZ;

    static {
        Covode.recordClassIndex(11241);
    }

    public PullDownCloseIndicatorContainer(Context context) {
        super(context);
        MethodCollector.m14708i(954);
        MethodCollector.m14707o(954);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        int action = motionEvent.getAction();
        if (this.LIZIZ == null && (getParent() instanceof ForceInterceptConstraintLayout)) {
            this.LIZIZ = (ForceInterceptConstraintLayout) getParent();
        }
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                }
            }
            ForceInterceptConstraintLayout forceInterceptConstraintLayout = this.LIZIZ;
            if (forceInterceptConstraintLayout != null) {
                forceInterceptConstraintLayout.setForceInterceptTouchEvent(false);
            }
            return true;
        }
        ForceInterceptConstraintLayout forceInterceptConstraintLayout2 = this.LIZIZ;
        if (forceInterceptConstraintLayout2 != null) {
            forceInterceptConstraintLayout2.setForceInterceptTouchEvent(true);
        }
        return true;
    }

    public PullDownCloseIndicatorContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(955);
        MethodCollector.m14707o(955);
    }

    public PullDownCloseIndicatorContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(956);
        MethodCollector.m14707o(956);
    }
}
