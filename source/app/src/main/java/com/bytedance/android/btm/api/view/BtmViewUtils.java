package com.bytedance.android.btm.api.view;

import android.view.View;
import com.bytedance.android.btm.api.BtmPageLifecycle;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes18.dex */
public final class BtmViewUtils {
    public static final BtmViewUtils INSTANCE = new BtmViewUtils();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11330);
    }

    public final void unregisterPage(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        BtmSDK.INSTANCE.getDepend().unregisterPageInstance(view);
    }

    public final void hide(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        BtmPageLifecycle.DefaultImpls.onPageHide$default(BtmSDK.INSTANCE.getPageLifecycle(), view, null, 2, null);
        BtmSDK.INSTANCE.getPageLifecycle().setNativeState(view, BtmPageLifecycle.State.PAUSED);
    }

    public final void show(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        BtmPageLifecycle.DefaultImpls.onPageShow$default(BtmSDK.INSTANCE.getPageLifecycle(), view, null, 2, null);
        BtmSDK.INSTANCE.getPageLifecycle().setNativeState(view, BtmPageLifecycle.State.RESUMED);
    }

    public final void registerPage(View view, String str) {
        if (PatchProxy.proxy(new Object[]{view, str}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(view, str);
        BtmSDK.INSTANCE.getDepend().registerPageInstance(view, str, false);
    }

    public static /* synthetic */ void registerPage$default(BtmViewUtils btmViewUtils, View view, String str, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{btmViewUtils, view, str, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        btmViewUtils.registerPage(view, str);
    }
}
