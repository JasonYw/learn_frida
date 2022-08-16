package com.benchmark;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes10.dex */
public class ByteBenchBundle {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long mHandle;
    public static Queue<ByteBenchBundle> sPools = new ArrayDeque(8);
    public static final Object sPoolSync = new Object();

    private native long nativeCreate();

    private native boolean nativeGetBool(long j, String str);

    private native float nativeGetFloat(long j, String str);

    private native int nativeGetInt(long j, String str);

    private native int[] nativeGetIntArray(long j, String str);

    private native String nativeGetString(long j, String str);

    public static native void nativeRelease(long j);

    public static native void nativeReleaseAll(long[] jArr);

    private native int nativeSetBool(long j, String str, boolean z);

    private native int nativeSetBundle(long j, String str, long j2);

    private native int nativeSetByteArray(long j, String str, byte[] bArr);

    private native int nativeSetDouble(long j, String str, double d);

    private native int nativeSetDoubleArray(long j, String str, double[] dArr);

    private native int nativeSetFloat(long j, String str, float f);

    private native int nativeSetFloatArray(long j, String str, float[] fArr);

    private native int nativeSetHandle(long j, String str, long j2);

    private native int nativeSetInt(long j, String str, int i);

    private native int nativeSetIntArray(long j, String str, int[] iArr);

    private native int nativeSetIntOrigin(long j, String str, int i);

    private native int nativeSetLong(long j, String str, long j2);

    private native int nativeSetString(long j, String str, String str2);

    private native int nativeSetStringArray(long j, String str, String[] strArr);

    public long getHandle() {
        return this.mHandle;
    }

    static {
        Covode.recordClassIndex(9613);
    }

    public ByteBenchBundle() {
        MethodCollector.m14708i(733);
        this.mHandle = nativeCreate();
        MethodCollector.m14707o(733);
    }

    public void finalize() {
        MethodCollector.m14708i(731);
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported) {
            MethodCollector.m14707o(731);
            return;
        }
        super.finalize();
        long j = this.mHandle;
        if (j != 0) {
            nativeRelease(j);
        }
        MethodCollector.m14707o(731);
    }

    public void recycle() {
        MethodCollector.m14708i(730);
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported) {
            MethodCollector.m14707o(730);
            return;
        }
        synchronized (sPoolSync) {
            try {
                sPools.add(this);
            } catch (Throwable th) {
                MethodCollector.m14707o(730);
                throw th;
            }
        }
        MethodCollector.m14707o(730);
    }

    public static void cleanAll() {
        MethodCollector.m14708i(732);
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 4).isSupported) {
            MethodCollector.m14707o(732);
            return;
        }
        synchronized (sPoolSync) {
            try {
                if (!sPools.isEmpty()) {
                    long[] jArr = new long[sPools.size()];
                    for (int i = 0; i < jArr.length; i++) {
                        ByteBenchBundle poll = sPools.poll();
                        jArr[i] = poll.getHandle();
                        poll.mHandle = 0L;
                    }
                    nativeReleaseAll(jArr);
                }
            } catch (Throwable th) {
                MethodCollector.m14707o(732);
                throw th;
            }
        }
        MethodCollector.m14707o(732);
    }

    public static ByteBenchBundle obtain() {
        ByteBenchBundle byteBenchBundle;
        MethodCollector.m14708i(729);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            ByteBenchBundle byteBenchBundle2 = (ByteBenchBundle) proxy.result;
            MethodCollector.m14707o(729);
            return byteBenchBundle2;
        }
        synchronized (sPoolSync) {
            try {
                if (!sPools.isEmpty()) {
                    byteBenchBundle = sPools.poll();
                } else {
                    byteBenchBundle = new ByteBenchBundle();
                }
            } finally {
                MethodCollector.m14707o(729);
            }
        }
        return byteBenchBundle;
    }

    public ByteBenchBundle(long j) {
        this.mHandle = j;
    }

    public boolean getBool(String str) {
        MethodCollector.m14708i(751);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(751);
            return booleanValue;
        }
        boolean nativeGetBool = nativeGetBool(this.mHandle, str);
        MethodCollector.m14707o(751);
        return nativeGetBool;
    }

    public float getFloat(String str) {
        MethodCollector.m14708i(748);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 19);
        if (proxy.isSupported) {
            float floatValue = ((Float) proxy.result).floatValue();
            MethodCollector.m14707o(748);
            return floatValue;
        }
        float nativeGetFloat = nativeGetFloat(this.mHandle, str);
        MethodCollector.m14707o(748);
        return nativeGetFloat;
    }

    public int getInt(String str) {
        MethodCollector.m14708i(752);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(752);
            return intValue;
        }
        int nativeGetInt = nativeGetInt(this.mHandle, str);
        MethodCollector.m14707o(752);
        return nativeGetInt;
    }

    public int[] getIntArray(String str) {
        MethodCollector.m14708i(750);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 21);
        if (proxy.isSupported) {
            int[] iArr = (int[]) proxy.result;
            MethodCollector.m14707o(750);
            return iArr;
        }
        int[] nativeGetIntArray = nativeGetIntArray(this.mHandle, str);
        MethodCollector.m14707o(750);
        return nativeGetIntArray;
    }

    public String getString(String str) {
        MethodCollector.m14708i(749);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 20);
        if (proxy.isSupported) {
            String str2 = (String) proxy.result;
            MethodCollector.m14707o(749);
            return str2;
        }
        String nativeGetString = nativeGetString(this.mHandle, str);
        MethodCollector.m14707o(749);
        return nativeGetString;
    }

    public int setBool(String str, boolean z) {
        MethodCollector.m14708i(734);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(734);
            return intValue;
        }
        int nativeSetBool = nativeSetBool(this.mHandle, str, z);
        MethodCollector.m14707o(734);
        return nativeSetBool;
    }

    public int setBundle(String str, ByteBenchBundle byteBenchBundle) {
        MethodCollector.m14708i(747);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, byteBenchBundle}, this, changeQuickRedirect, false, 18);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(747);
            return intValue;
        }
        int nativeSetBundle = nativeSetBundle(this.mHandle, str, byteBenchBundle.mHandle);
        MethodCollector.m14707o(747);
        return nativeSetBundle;
    }

    public int setByteArray(String str, byte[] bArr) {
        MethodCollector.m14708i(740);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, bArr}, this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(740);
            return intValue;
        }
        int nativeSetByteArray = nativeSetByteArray(this.mHandle, str, bArr);
        MethodCollector.m14707o(740);
        return nativeSetByteArray;
    }

    public int setDouble(String str, double d) {
        MethodCollector.m14708i(743);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Double.valueOf(d)}, this, changeQuickRedirect, false, 14);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(743);
            return intValue;
        }
        int nativeSetDouble = nativeSetDouble(this.mHandle, str, d);
        MethodCollector.m14707o(743);
        return nativeSetDouble;
    }

    public int setDoubleArray(String str, double[] dArr) {
        MethodCollector.m14708i(744);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, dArr}, this, changeQuickRedirect, false, 15);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(744);
            return intValue;
        }
        int nativeSetDoubleArray = nativeSetDoubleArray(this.mHandle, str, dArr);
        MethodCollector.m14707o(744);
        return nativeSetDoubleArray;
    }

    public int setFloat(String str, float f) {
        MethodCollector.m14708i(741);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Float.valueOf(f)}, this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(741);
            return intValue;
        }
        int nativeSetFloat = nativeSetFloat(this.mHandle, str, f);
        MethodCollector.m14707o(741);
        return nativeSetFloat;
    }

    public int setFloatArray(String str, float[] fArr) {
        MethodCollector.m14708i(742);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, fArr}, this, changeQuickRedirect, false, 13);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(742);
            return intValue;
        }
        int nativeSetFloatArray = nativeSetFloatArray(this.mHandle, str, fArr);
        MethodCollector.m14707o(742);
        return nativeSetFloatArray;
    }

    public int setHandle(String str, long j) {
        MethodCollector.m14708i(735);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, new Long(j)}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(735);
            return intValue;
        }
        int nativeSetHandle = nativeSetHandle(this.mHandle, str, j);
        MethodCollector.m14707o(735);
        return nativeSetHandle;
    }

    public int setInt(String str, int i) {
        MethodCollector.m14708i(736);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(736);
            return intValue;
        }
        int nativeSetInt = nativeSetInt(this.mHandle, str, i);
        MethodCollector.m14707o(736);
        return nativeSetInt;
    }

    public int setIntArray(String str, int[] iArr) {
        MethodCollector.m14708i(739);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, iArr}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(739);
            return intValue;
        }
        int nativeSetIntArray = nativeSetIntArray(this.mHandle, str, iArr);
        MethodCollector.m14707o(739);
        return nativeSetIntArray;
    }

    public int setIntOrigin(String str, int i) {
        MethodCollector.m14708i(738);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(738);
            return intValue;
        }
        int nativeSetIntOrigin = nativeSetIntOrigin(this.mHandle, str, i);
        MethodCollector.m14707o(738);
        return nativeSetIntOrigin;
    }

    public int setLong(String str, long j) {
        MethodCollector.m14708i(737);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, new Long(j)}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(737);
            return intValue;
        }
        int nativeSetLong = nativeSetLong(this.mHandle, str, j);
        MethodCollector.m14707o(737);
        return nativeSetLong;
    }

    public int setString(String str, String str2) {
        MethodCollector.m14708i(745);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 16);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(745);
            return intValue;
        }
        int nativeSetString = nativeSetString(this.mHandle, str, str2);
        MethodCollector.m14707o(745);
        return nativeSetString;
    }

    public int setStringArray(String str, String[] strArr) {
        MethodCollector.m14708i(746);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, strArr}, this, changeQuickRedirect, false, 17);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(746);
            return intValue;
        }
        int nativeSetStringArray = nativeSetStringArray(this.mHandle, str, strArr);
        MethodCollector.m14707o(746);
        return nativeSetStringArray;
    }
}
