package com.bytedance.android.btm.api.viewpager;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmPageLifecycle;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.inner.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes18.dex */
public final class BtmViewPagerUtils {
    public static final BtmViewPagerUtils INSTANCE = new BtmViewPagerUtils();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11331);
    }

    public final void setUserVisibleHint(Object obj, boolean z) {
        if (PatchProxy.proxy(new Object[]{obj, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(obj);
        if (z && BtmSDK.INSTANCE.getPageLifecycle().getNativeState(obj) == BtmPageLifecycle.State.RESUMED) {
            Activity topActivity = BtmSDK.INSTANCE.getService().getTopActivity();
            boolean judgeTopActivity = BtmSDK.INSTANCE.getService().judgeTopActivity();
            if ((obj instanceof Fragment) && topActivity != null && judgeTopActivity && (!Intrinsics.areEqual(((Fragment) obj).getActivity(), topActivity))) {
                return;
            }
            if ((obj instanceof IBtmFragment) && Intrinsics.areEqual(((IBtmFragment) obj).disableUserVisibleHint(), Boolean.TRUE)) {
                return;
            }
            BtmPageLifecycle.DefaultImpls.onPageShow$default(BtmSDK.INSTANCE.getPageLifecycle(), obj, null, 2, null);
        }
        BtmSDK.INSTANCE.getPageLifecycle().setUserVisibleHint(obj, z);
        Logger.INSTANCE.m15960d("ViewPager", new BtmViewPagerUtils$setUserVisibleHint$1(obj, z));
    }
}
