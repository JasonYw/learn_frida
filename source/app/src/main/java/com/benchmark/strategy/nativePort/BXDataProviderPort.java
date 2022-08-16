package com.benchmark.strategy.nativePort;

import android.os.Bundle;
import com.benchmark.ByteBenchBundle;
import com.benchmark.port.BTCFeature;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C65725BwV;

/* loaded from: classes10.dex */
public class BXDataProviderPort {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(9735);
    }

    private native void native_clearRepo(int i);

    private native void native_closeRepo(int i);

    private native boolean native_deleteRepo(int i);

    private native void native_dumpRepo(int i);

    private native boolean native_getBoolean(int i, String str, boolean z);

    private native int native_getDeviceFeature(int i, long j);

    private native float native_getFloat(int i, String str, float f);

    private native int native_getInt(int i, String str, int i2);

    private native long native_getLong(int i, String str, long j);

    private native String native_getString(int i, String str);

    private native boolean native_hasValue(int i, String str);

    private native int native_init(String str);

    private native void native_isOpenRuntimeDecision(boolean z);

    private native void native_openRepo(int i);

    private native void native_storeBoolean(int i, String str, boolean z, boolean z2);

    private native void native_storeDeviceFeatureFloat(String str, float f);

    private native void native_storeFloat(int i, String str, boolean z, float f);

    private native void native_storeInt(int i, String str, boolean z, int i2);

    private native void native_storeLong(int i, String str, boolean z, long j);

    private native void native_storeStrategy(int i, String str);

    private native void native_storeString(int i, String str, boolean z, String str2);

    private boolean ifEnableNativeEnvironment() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C65725BwV.LIZIZ();
    }

    /* renamed from: com.benchmark.strategy.nativePort.BXDataProviderPort$1 */
    /* loaded from: classes10.dex */
    public static /* synthetic */ class C25071 {
        public static final /* synthetic */ int[] LIZ = new int[BTCFeature.BTCFeatureKind.valuesCustom().length];

        static {
            Covode.recordClassIndex(9736);
            try {
                LIZ[BTCFeature.BTCFeatureKind.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LIZ[BTCFeature.BTCFeatureKind.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LIZ[BTCFeature.BTCFeatureKind.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LIZ[BTCFeature.BTCFeatureKind.BOOLEAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public void clearRepo(int i) {
        MethodCollector.m14708i(816);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 7).isSupported) {
            MethodCollector.m14707o(816);
            return;
        }
        if (ifEnableNativeEnvironment()) {
            native_clearRepo(i);
        }
        MethodCollector.m14707o(816);
    }

    public void closeRepo(int i) {
        MethodCollector.m14708i(815);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 5).isSupported) {
            MethodCollector.m14707o(815);
            return;
        }
        if (ifEnableNativeEnvironment()) {
            native_closeRepo(i);
        }
        MethodCollector.m14707o(815);
    }

    public Boolean deleteRepo(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        if (!ifEnableNativeEnvironment()) {
            return Boolean.FALSE;
        }
        return Boolean.FALSE;
    }

    public void dumpRepo(int i) {
        MethodCollector.m14708i(817);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 8).isSupported) {
            MethodCollector.m14707o(817);
            return;
        }
        if (ifEnableNativeEnvironment()) {
            native_dumpRepo(i);
        }
        MethodCollector.m14707o(817);
    }

    public int init(String str) {
        MethodCollector.m14708i(812);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(812);
            return intValue;
        } else if (!ifEnableNativeEnvironment()) {
            MethodCollector.m14707o(812);
            return -1;
        } else {
            int native_init = native_init(str);
            MethodCollector.m14707o(812);
            return native_init;
        }
    }

    public void isOpenRuntimeDecision(boolean z) {
        MethodCollector.m14708i(813);
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 3).isSupported) {
            MethodCollector.m14707o(813);
            return;
        }
        if (ifEnableNativeEnvironment()) {
            native_isOpenRuntimeDecision(z);
        }
        MethodCollector.m14707o(813);
    }

    public void openRepo(int i) {
        MethodCollector.m14708i(814);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 4).isSupported) {
            MethodCollector.m14707o(814);
            return;
        }
        if (ifEnableNativeEnvironment()) {
            native_openRepo(i);
        }
        MethodCollector.m14707o(814);
    }

    public String getString(int i, String str) {
        MethodCollector.m14708i(819);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            String str2 = (String) proxy.result;
            MethodCollector.m14707o(819);
            return str2;
        } else if (!ifEnableNativeEnvironment()) {
            MethodCollector.m14707o(819);
            return null;
        } else {
            String native_getString = native_getString(i, str);
            MethodCollector.m14707o(819);
            return native_getString;
        }
    }

    public boolean hasValue(int i, String str) {
        MethodCollector.m14708i(818);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(818);
            return booleanValue;
        } else if (!ifEnableNativeEnvironment()) {
            MethodCollector.m14707o(818);
            return false;
        } else {
            boolean native_hasValue = native_hasValue(i, str);
            MethodCollector.m14707o(818);
            return native_hasValue;
        }
    }

    public void storeDeviceFeatureFloat(String str, float f) {
        MethodCollector.m14708i(831);
        if (PatchProxy.proxy(new Object[]{str, Float.valueOf(f)}, this, changeQuickRedirect, false, 22).isSupported) {
            MethodCollector.m14707o(831);
        } else if (!ifEnableNativeEnvironment()) {
            MethodCollector.m14707o(831);
        } else {
            native_storeDeviceFeatureFloat(str, f);
            MethodCollector.m14707o(831);
        }
    }

    public void storeStrategy(int i, String str) {
        MethodCollector.m14708i(830);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 21).isSupported) {
            MethodCollector.m14707o(830);
        } else if (!ifEnableNativeEnvironment()) {
            MethodCollector.m14707o(830);
        } else {
            native_storeStrategy(i, str);
            MethodCollector.m14707o(830);
        }
    }

    public boolean getBoolean(int i, String str, boolean z) {
        MethodCollector.m14708i(823);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 14);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(823);
            return booleanValue;
        } else if (!ifEnableNativeEnvironment()) {
            MethodCollector.m14707o(823);
            return z;
        } else {
            boolean native_getBoolean = native_getBoolean(i, str, z);
            MethodCollector.m14707o(823);
            return native_getBoolean;
        }
    }

    public float getFloat(int i, String str, float f) {
        MethodCollector.m14708i(822);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, Float.valueOf(f)}, this, changeQuickRedirect, false, 13);
        if (proxy.isSupported) {
            float floatValue = ((Float) proxy.result).floatValue();
            MethodCollector.m14707o(822);
            return floatValue;
        } else if (!ifEnableNativeEnvironment()) {
            MethodCollector.m14707o(822);
            return f;
        } else {
            float native_getFloat = native_getFloat(i, str, f);
            MethodCollector.m14707o(822);
            return native_getFloat;
        }
    }

    public int getInt(int i, String str, int i2) {
        MethodCollector.m14708i(820);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2)}, this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(820);
            return intValue;
        } else if (!ifEnableNativeEnvironment()) {
            MethodCollector.m14707o(820);
            return i2;
        } else {
            int native_getInt = native_getInt(i, str, i2);
            MethodCollector.m14707o(820);
            return native_getInt;
        }
    }

    public long getLong(int i, String str, long j) {
        MethodCollector.m14708i(821);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, new Long(j)}, this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            long longValue = ((Long) proxy.result).longValue();
            MethodCollector.m14707o(821);
            return longValue;
        } else if (!ifEnableNativeEnvironment()) {
            MethodCollector.m14707o(821);
            return j;
        } else {
            long native_getLong = native_getLong(i, str, j);
            MethodCollector.m14707o(821);
            return native_getLong;
        }
    }

    public void getDeviceFeature(int i, BTCFeature[] bTCFeatureArr, Bundle bundle) {
        MethodCollector.m14708i(824);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), bTCFeatureArr, bundle}, this, changeQuickRedirect, false, 15).isSupported) {
            MethodCollector.m14707o(824);
        } else if (!ifEnableNativeEnvironment()) {
            MethodCollector.m14707o(824);
        } else {
            ByteBenchBundle obtain = ByteBenchBundle.obtain();
            native_getDeviceFeature(i, obtain.getHandle());
            for (BTCFeature bTCFeature : bTCFeatureArr) {
                int i2 = C25071.LIZ[bTCFeature.LJIIIIZZ.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                bundle.putBoolean(bTCFeature.LJII, obtain.getBool(bTCFeature.LJII));
                            }
                        } else {
                            bundle.putString(bTCFeature.LJII, obtain.getString(bTCFeature.LJII));
                        }
                    } else {
                        bundle.putFloat(bTCFeature.LJII, obtain.getFloat(bTCFeature.LJII));
                    }
                } else {
                    bundle.putInt(bTCFeature.LJII, obtain.getInt(bTCFeature.LJII));
                }
            }
            obtain.recycle();
            MethodCollector.m14707o(824);
        }
    }

    public void storeString(int i, String str, boolean z, String str2) {
        MethodCollector.m14708i(827);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2}, this, changeQuickRedirect, false, 18).isSupported) {
            MethodCollector.m14707o(827);
        } else if (!ifEnableNativeEnvironment()) {
            MethodCollector.m14707o(827);
        } else {
            native_storeString(i, str, z, str2);
            MethodCollector.m14707o(827);
        }
    }

    public void storeBoolean(int i, String str, boolean z, boolean z2) {
        MethodCollector.m14708i(828);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 19).isSupported) {
            MethodCollector.m14707o(828);
        } else if (!ifEnableNativeEnvironment()) {
            MethodCollector.m14707o(828);
        } else {
            native_storeBoolean(i, str, z, z2);
            MethodCollector.m14707o(828);
        }
    }

    public void storeFloat(int i, String str, boolean z, float f) {
        MethodCollector.m14708i(829);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f)}, this, changeQuickRedirect, false, 20).isSupported) {
            MethodCollector.m14707o(829);
        } else if (!ifEnableNativeEnvironment()) {
            MethodCollector.m14707o(829);
        } else {
            native_storeFloat(i, str, z, f);
            MethodCollector.m14707o(829);
        }
    }

    public void storeInt(int i, String str, boolean z, int i2) {
        MethodCollector.m14708i(825);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 16).isSupported) {
            MethodCollector.m14707o(825);
        } else if (!ifEnableNativeEnvironment()) {
            MethodCollector.m14707o(825);
        } else {
            native_storeInt(i, str, z, i2);
            MethodCollector.m14707o(825);
        }
    }

    public void storeLong(int i, String str, boolean z, long j) {
        MethodCollector.m14708i(826);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)}, this, changeQuickRedirect, false, 17).isSupported) {
            MethodCollector.m14707o(826);
        } else if (!ifEnableNativeEnvironment()) {
            MethodCollector.m14707o(826);
        } else {
            native_storeLong(i, str, z, j);
            MethodCollector.m14707o(826);
        }
    }
}
