package com.bef.effectsdk.game;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Arrays;
import java.util.List;
import p003X.C116971W2r;

/* loaded from: classes10.dex */
public class NativeInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final List<String> list = Arrays.asList("effect");

    /* loaded from: classes10.dex */
    public interface NativeMessageListener {
        static {
            Covode.recordClassIndex(9569);
        }

        int nativeOnMsgReceived(long j, long j2, long j3, String str);
    }

    public static native int nativeAddMessageListener(long j, NativeMessageListener nativeMessageListener);

    public static native void nativeCreateHandle(long[] jArr);

    public static native int nativeDestroy(long j);

    public static native int nativeInit(long j, int i, int i2);

    public static native int nativePause(long j);

    public static native int nativePostMessage(long j, long j2, long j3, long j4, String str);

    public static native int nativeProcess(long j, int i, int i2, double d);

    public static native int nativeRemoveMessageListener(long j, NativeMessageListener nativeMessageListener);

    public static native int nativeResume(long j);

    public static native int nativeSetSize(long j, int i, int i2);

    public static native int nativeSetStickerPath(long j, String str);

    public static native int nativeTouchesBegin(long j, int[] iArr, float[] fArr, float[] fArr2);

    public static native int nativeTouchesEnd(long j, int[] iArr, float[] fArr, float[] fArr2);

    public static native int nativeTouchesMove(long j, int[] iArr, float[] fArr, float[] fArr2);

    static {
        Covode.recordClassIndex(9568);
        try {
            for (String str : list) {
                C116971W2r.LIZIZ(str);
            }
        } catch (Throwable unused) {
        }
    }

    public static void createHandle(long[] jArr) {
        MethodCollector.m14708i(668);
        if (PatchProxy.proxy(new Object[]{jArr}, null, changeQuickRedirect, true, 1).isSupported) {
            MethodCollector.m14707o(668);
            return;
        }
        nativeCreateHandle(jArr);
        MethodCollector.m14707o(668);
    }

    public static int destroy(long j) {
        MethodCollector.m14708i(675);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, null, changeQuickRedirect, true, 8);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(675);
            return intValue;
        }
        int nativeDestroy = nativeDestroy(j);
        MethodCollector.m14707o(675);
        return nativeDestroy;
    }

    public static int pause(long j) {
        MethodCollector.m14708i(673);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, null, changeQuickRedirect, true, 6);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(673);
            return intValue;
        }
        int nativePause = nativePause(j);
        MethodCollector.m14707o(673);
        return nativePause;
    }

    public static int resume(long j) {
        MethodCollector.m14708i(674);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, null, changeQuickRedirect, true, 7);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(674);
            return intValue;
        }
        int nativeResume = nativeResume(j);
        MethodCollector.m14707o(674);
        return nativeResume;
    }

    public static int addMessageListener(long j, NativeMessageListener nativeMessageListener) {
        MethodCollector.m14708i(680);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), nativeMessageListener}, null, changeQuickRedirect, true, 13);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(680);
            return intValue;
        }
        int nativeAddMessageListener = nativeAddMessageListener(j, nativeMessageListener);
        MethodCollector.m14707o(680);
        return nativeAddMessageListener;
    }

    public static int removeMessageListener(long j, NativeMessageListener nativeMessageListener) {
        MethodCollector.m14708i(681);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), nativeMessageListener}, null, changeQuickRedirect, true, 14);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(681);
            return intValue;
        }
        int nativeRemoveMessageListener = nativeRemoveMessageListener(j, nativeMessageListener);
        MethodCollector.m14707o(681);
        return nativeRemoveMessageListener;
    }

    public static int setGameBundlePath(long j, String str) {
        MethodCollector.m14708i(670);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(670);
            return intValue;
        }
        int nativeSetStickerPath = nativeSetStickerPath(j, str);
        MethodCollector.m14707o(670);
        return nativeSetStickerPath;
    }

    public static int init(long j, int i, int i2) {
        MethodCollector.m14708i(669);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(669);
            return intValue;
        }
        int nativeInit = nativeInit(j, i, i2);
        MethodCollector.m14707o(669);
        return nativeInit;
    }

    public static int setSize(long j, int i, int i2) {
        MethodCollector.m14708i(671);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(671);
            return intValue;
        }
        int nativeSetSize = nativeSetSize(j, i, i2);
        MethodCollector.m14707o(671);
        return nativeSetSize;
    }

    public static int touchesBegin(long j, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.m14708i(676);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), iArr, fArr, fArr2}, null, changeQuickRedirect, true, 9);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(676);
            return intValue;
        }
        int nativeTouchesBegin = nativeTouchesBegin(j, iArr, fArr, fArr2);
        MethodCollector.m14707o(676);
        return nativeTouchesBegin;
    }

    public static int touchesEnd(long j, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.m14708i(678);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), iArr, fArr, fArr2}, null, changeQuickRedirect, true, 11);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(678);
            return intValue;
        }
        int nativeTouchesEnd = nativeTouchesEnd(j, iArr, fArr, fArr2);
        MethodCollector.m14707o(678);
        return nativeTouchesEnd;
    }

    public static int touchesMove(long j, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.m14708i(677);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), iArr, fArr, fArr2}, null, changeQuickRedirect, true, 10);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(677);
            return intValue;
        }
        int nativeTouchesMove = nativeTouchesMove(j, iArr, fArr, fArr2);
        MethodCollector.m14707o(677);
        return nativeTouchesMove;
    }

    public static int processFrame(long j, int i, int i2, double d) {
        MethodCollector.m14708i(672);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), Integer.valueOf(i2), Double.valueOf(d)}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(672);
            return intValue;
        }
        int nativeProcess = nativeProcess(j, i, i2, d);
        MethodCollector.m14707o(672);
        return nativeProcess;
    }

    public static int postMessage(long j, long j2, long j3, long j4, String str) {
        MethodCollector.m14708i(679);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4), str}, null, changeQuickRedirect, true, 12);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(679);
            return intValue;
        }
        int nativePostMessage = nativePostMessage(j, j2, j3, j4, str);
        MethodCollector.m14707o(679);
        return nativePostMessage;
    }
}
