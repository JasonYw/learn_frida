package com.bef.effectsdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Arrays;
import java.util.List;
import p003X.C116971W2r;

/* loaded from: classes10.dex */
public class BEFEffectNative {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final List<String> list = Arrays.asList("effect");

    public static native long nativeCreateHandle(boolean z);

    public static native int nativeDestroyHandle(long j);

    public static native String nativeGetEffectSDKVersion();

    public static native int nativeInitResourceFinder(long j, ResourceFinder resourceFinder, int i, int i2, String str);

    public static native int nativeProcessAlgorithm(long j, int i, int i2, int i3, double d);

    public static native int nativeProcessFrame(long j, int i, int i2, int i3, int i4, double d);

    public static native int nativeReleaseResourceFinder(long j, ResourceFinder resourceFinder);

    public static native int nativeSendMessage(long j, long j2, long j3, long j4, String str);

    public static native void nativeSetCameraPosition(long j, boolean z);

    public static native void nativeSetFrameOrientation(long j, int i);

    public static native void nativeSetOrientation(long j, int i);

    public static native int nativeSetStickerPath(long j, String str);

    public static native int nativeTouchEvent(long j, int i, int[] iArr, float[] fArr, float[] fArr2);

    static {
        Covode.recordClassIndex(9508);
        try {
            for (String str : list) {
                C116971W2r.LIZIZ(str);
            }
        } catch (Throwable unused) {
        }
    }

    public static String getEffectSDKVersion() {
        MethodCollector.m14708i(599);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            String str = (String) proxy.result;
            MethodCollector.m14707o(599);
            return str;
        }
        String nativeGetEffectSDKVersion = nativeGetEffectSDKVersion();
        MethodCollector.m14707o(599);
        return nativeGetEffectSDKVersion;
    }

    public static long createHandle(boolean z) {
        MethodCollector.m14708i(600);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            long longValue = ((Long) proxy.result).longValue();
            MethodCollector.m14707o(600);
            return longValue;
        }
        long nativeCreateHandle = nativeCreateHandle(z);
        MethodCollector.m14707o(600);
        return nativeCreateHandle;
    }

    public static int destroyHandle(long j) {
        MethodCollector.m14708i(601);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(601);
            return intValue;
        }
        int nativeDestroyHandle = nativeDestroyHandle(j);
        MethodCollector.m14707o(601);
        return nativeDestroyHandle;
    }

    public static int releaseResourceFinder(long j, ResourceFinder resourceFinder) {
        MethodCollector.m14708i(603);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), resourceFinder}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(603);
            return intValue;
        }
        int nativeReleaseResourceFinder = nativeReleaseResourceFinder(j, resourceFinder);
        MethodCollector.m14707o(603);
        return nativeReleaseResourceFinder;
    }

    public static void setCameraPosition(long j, boolean z) {
        MethodCollector.m14708i(608);
        if (PatchProxy.proxy(new Object[]{new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 10).isSupported) {
            MethodCollector.m14707o(608);
            return;
        }
        nativeSetCameraPosition(j, z);
        MethodCollector.m14707o(608);
    }

    public static void setFrameOrientation(long j, int i) {
        MethodCollector.m14708i(610);
        if (PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i)}, null, changeQuickRedirect, true, 12).isSupported) {
            MethodCollector.m14707o(610);
            return;
        }
        nativeSetFrameOrientation(j, i);
        MethodCollector.m14707o(610);
    }

    public static void setOrientation(long j, int i) {
        MethodCollector.m14708i(609);
        if (PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i)}, null, changeQuickRedirect, true, 11).isSupported) {
            MethodCollector.m14707o(609);
            return;
        }
        nativeSetOrientation(j, i);
        MethodCollector.m14707o(609);
    }

    public static int setStickerPath(long j, String str) {
        MethodCollector.m14708i(604);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str}, null, changeQuickRedirect, true, 6);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(604);
            return intValue;
        }
        int nativeSetStickerPath = nativeSetStickerPath(j, str);
        MethodCollector.m14707o(604);
        return nativeSetStickerPath;
    }

    public static int touchBeginEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.m14708i(611);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), iArr, fArr, fArr2}, null, changeQuickRedirect, true, 13);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(611);
            return intValue;
        }
        int nativeTouchEvent = nativeTouchEvent(j, 0, iArr, fArr, fArr2);
        MethodCollector.m14707o(611);
        return nativeTouchEvent;
    }

    public static int touchEndEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.m14708i(613);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), iArr, fArr, fArr2}, null, changeQuickRedirect, true, 15);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(613);
            return intValue;
        }
        int nativeTouchEvent = nativeTouchEvent(j, 2, iArr, fArr, fArr2);
        MethodCollector.m14707o(613);
        return nativeTouchEvent;
    }

    public static int touchMoveEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.m14708i(612);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), iArr, fArr, fArr2}, null, changeQuickRedirect, true, 14);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(612);
            return intValue;
        }
        int nativeTouchEvent = nativeTouchEvent(j, 1, iArr, fArr, fArr2);
        MethodCollector.m14707o(612);
        return nativeTouchEvent;
    }

    public static int initResourceFinder(long j, ResourceFinder resourceFinder, int i, int i2, String str) {
        MethodCollector.m14708i(602);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), resourceFinder, Integer.valueOf(i), Integer.valueOf(i2), str}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(602);
            return intValue;
        }
        int nativeInitResourceFinder = nativeInitResourceFinder(j, resourceFinder, i, i2, str);
        MethodCollector.m14707o(602);
        return nativeInitResourceFinder;
    }

    public static int processAlgorithm(long j, int i, int i2, int i3, double d) {
        MethodCollector.m14708i(605);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Double.valueOf(d)}, null, changeQuickRedirect, true, 7);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(605);
            return intValue;
        }
        int nativeProcessAlgorithm = nativeProcessAlgorithm(j, i, i2, i3, d);
        MethodCollector.m14707o(605);
        return nativeProcessAlgorithm;
    }

    public static int sendMessage(long j, long j2, long j3, long j4, String str) {
        MethodCollector.m14708i(607);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4), str}, null, changeQuickRedirect, true, 9);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(607);
            return intValue;
        }
        int nativeSendMessage = nativeSendMessage(j, j2, j3, j4, str);
        MethodCollector.m14707o(607);
        return nativeSendMessage;
    }

    public static int processFrame(long j, int i, int i2, int i3, int i4, double d) {
        MethodCollector.m14708i(606);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Double.valueOf(d)}, null, changeQuickRedirect, true, 8);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(606);
            return intValue;
        }
        int nativeProcessFrame = nativeProcessFrame(j, i, i2, i3, i4, d);
        MethodCollector.m14707o(606);
        return nativeProcessFrame;
    }
}
