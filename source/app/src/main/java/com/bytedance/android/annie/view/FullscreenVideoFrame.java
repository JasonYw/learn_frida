package com.bytedance.android.annie.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC101312Pv8;

/* loaded from: classes8.dex */
public class FullscreenVideoFrame extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public AbstractC101312Pv8 LIZIZ;

    static {
        Covode.recordClassIndex(11239);
    }

    private void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public void setListener(AbstractC101312Pv8 abstractC101312Pv8) {
        this.LIZIZ = abstractC101312Pv8;
    }

    public FullscreenVideoFrame(Context context) {
        super(context);
        MethodCollector.m14708i(951);
        LIZ();
        MethodCollector.m14707o(951);
    }

    public FullscreenVideoFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(952);
        LIZ();
        MethodCollector.m14707o(952);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), keyEvent}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (i == 4) {
            AbstractC101312Pv8 abstractC101312Pv8 = this.LIZIZ;
            if (abstractC101312Pv8 != null) {
                abstractC101312Pv8.LIZ();
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), keyEvent}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (i == 4) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public FullscreenVideoFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(953);
        LIZ();
        MethodCollector.m14707o(953);
    }
}
