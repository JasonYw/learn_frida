package com.bytedance.android.live.performance.views;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class PerftoolsLinearLayout extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public Activity LIZIZ;
    public Dialog LIZJ;

    static {
        Covode.recordClassIndex(32783);
    }

    public void setActivity(Activity activity) {
        this.LIZIZ = activity;
    }

    public void setDialog(Dialog dialog) {
        this.LIZJ = dialog;
    }

    public PerftoolsLinearLayout(Context context) {
        super(context);
        MethodCollector.m14708i(2156);
        MethodCollector.m14707o(2156);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{keyEvent}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Dialog dialog = this.LIZJ;
        if (dialog != null) {
            dialog.dispatchKeyEvent(keyEvent);
        }
        Activity activity = this.LIZIZ;
        if (activity != null) {
            activity.dispatchKeyEvent(keyEvent);
        }
        return false;
    }

    public PerftoolsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(2157);
        MethodCollector.m14707o(2157);
    }

    public PerftoolsLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(2158);
        MethodCollector.m14707o(2158);
    }
}
