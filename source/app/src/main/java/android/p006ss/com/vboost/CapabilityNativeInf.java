package android.p006ss.com.vboost;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C116971W2r;

/* renamed from: android.ss.com.vboost.CapabilityNativeInf */
/* loaded from: classes10.dex */
public class CapabilityNativeInf {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static native boolean nativeIsSupportCapability(CapabilityType capabilityType);

    public static native void nativeLoadMethod();

    public static native void nativeRegisterApplication(Context context);

    public static native void nativeRequestVibrateCapability(int i, float f, float f2, float f3, String str);

    static {
        Covode.recordClassIndex(25);
        try {
            C116971W2r.LIZIZ("vboost");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    public static void loadMethod() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        nativeLoadMethod();
    }

    public static boolean isSupportCapability(CapabilityType capabilityType) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{capabilityType}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return nativeIsSupportCapability(capabilityType);
    }

    public static void registerApplication(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        nativeRegisterApplication(context);
    }

    public static void requestVibrateCapability(int i, float f, float f2, float f3, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), str}, null, changeQuickRedirect, true, 4).isSupported) {
            return;
        }
        nativeRequestVibrateCapability(i, f, f2, f3, str);
    }
}
