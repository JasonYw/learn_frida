package com.bytedance.android.btm.api.dialog;

import android.app.Dialog;
import com.bytedance.android.btm.api.BtmPageLifecycle;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes18.dex */
public final class BtmDialogUtils {
    public static final BtmDialogUtils INSTANCE = new BtmDialogUtils();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11301);
    }

    public final void unregisterPage(Dialog dialog) {
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(dialog);
        BtmSDK.INSTANCE.getDepend().unregisterPageInstance(dialog);
    }

    public final void dismiss(Dialog dialog) {
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(dialog);
        BtmPageLifecycle.DefaultImpls.onPageHide$default(BtmSDK.INSTANCE.getPageLifecycle(), dialog, null, 2, null);
        BtmSDK.INSTANCE.getPageLifecycle().onPageDestroy(dialog);
        BtmSDK.INSTANCE.getPageLifecycle().setNativeState(dialog, BtmPageLifecycle.State.DESTROYED);
    }

    public final void hide(Dialog dialog) {
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(dialog);
        BtmPageLifecycle.DefaultImpls.onPageHide$default(BtmSDK.INSTANCE.getPageLifecycle(), dialog, null, 2, null);
        BtmSDK.INSTANCE.getPageLifecycle().setNativeState(dialog, BtmPageLifecycle.State.PAUSED);
    }

    public final void show(Dialog dialog) {
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(dialog);
        BtmPageLifecycle.DefaultImpls.onPageShow$default(BtmSDK.INSTANCE.getPageLifecycle(), dialog, null, 2, null);
        BtmSDK.INSTANCE.getPageLifecycle().setNativeState(dialog, BtmPageLifecycle.State.RESUMED);
    }

    public final void registerPage(Dialog dialog, String str) {
        if (PatchProxy.proxy(new Object[]{dialog, str}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(dialog, str);
        BtmSDK.INSTANCE.getDepend().registerPageInstance(dialog, str, false);
    }

    public static /* synthetic */ void registerPage$default(BtmDialogUtils btmDialogUtils, Dialog dialog, String str, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{btmDialogUtils, dialog, str, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        btmDialogUtils.registerPage(dialog, str);
    }
}
