package com.bytedance.android.live.lynx.element.pullrefresh;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.behavior.p1543ui.UIGroup;
import com.lynx.tasm.behavior.p1543ui.view.AndroidView;

/* loaded from: classes10.dex */
public final class LynxRefreshHeader extends UIGroup<AndroidView> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32231);
    }

    @Override // com.lynx.tasm.behavior.p1543ui.LynxUI
    /* renamed from: createView  reason: collision with other method in class */
    public final AndroidView mo29230createView(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AndroidView) proxy.result;
        }
        return new AndroidView(context);
    }
}
