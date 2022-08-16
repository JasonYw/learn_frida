package com.bef.effectsdk.haptics;

import android.content.Context;
import android.p006ss.com.vboost.CapabilityScheduler;
import android.p006ss.com.vboost.CapabilityType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes18.dex */
public class EffectCapabilityScheduler {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(9571);
    }

    public static boolean isSupportCapability(CapabilityType capabilityType) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{capabilityType}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return CapabilityScheduler.isSupportCapability(capabilityType);
    }

    public static void registerApplication(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        CapabilityScheduler.registerApplication(context);
    }

    public static void requestVibrateCapability(int i, float f, float f2, float f3, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), str}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        CapabilityScheduler.requestVibrateCapability(i, f, f2, f3, str);
    }
}
