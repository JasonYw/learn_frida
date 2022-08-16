package com.bytedance.android.live.performance.views;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class PerftoolsRelativeLayout extends RelativeLayout {
    public static ChangeQuickRedirect LIZ;
    public Activity LIZIZ;
    public Dialog LIZJ;

    static {
        Covode.recordClassIndex(32784);
    }

    public void setActivity(Activity activity) {
        this.LIZIZ = activity;
    }

    public void setDialog(Dialog dialog) {
        this.LIZJ = dialog;
    }

    public PerftoolsRelativeLayout(Context context) {
        super(context);
        MethodCollector.m14708i(2159);
        MethodCollector.m14707o(2159);
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

    public PerftoolsRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(2160);
        MethodCollector.m14707o(2160);
    }

    public PerftoolsRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(2161);
        MethodCollector.m14707o(2161);
    }
}
