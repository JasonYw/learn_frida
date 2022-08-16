package com.bytedance.android.annie.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public class ForceInterceptConstraintLayout extends ConstraintLayout {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public Function1<KeyEvent, Boolean> LIZJ;

    static {
        Covode.recordClassIndex(11238);
    }

    public ForceInterceptConstraintLayout(Context context) {
        super(context);
    }

    public void setForceInterceptTouchEvent(boolean z) {
        this.LIZIZ = z;
    }

    public void setOnDispatchKeyEvent(Function1<KeyEvent, Boolean> function1) {
        this.LIZJ = function1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{keyEvent}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Function1<KeyEvent, Boolean> function1 = this.LIZJ;
        if (function1 != null && function1.invoke(keyEvent).booleanValue()) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
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
