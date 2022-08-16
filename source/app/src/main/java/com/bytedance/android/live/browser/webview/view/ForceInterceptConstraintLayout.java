package com.bytedance.android.live.browser.webview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes.dex */
public class ForceInterceptConstraintLayout extends ConstraintLayout {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;

    static {
        Covode.recordClassIndex(23241);
    }

    public ForceInterceptConstraintLayout(Context context) {
        super(context);
    }

    public void setForceInterceptTouchEvent(boolean z) {
        this.LIZIZ = z;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LIZIZ && motionEvent.getAction() != 0) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            setForceInterceptTouchEvent(false);
        }
        return super.onTouchEvent(motionEvent);
    }

    public ForceInterceptConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ForceInterceptConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
