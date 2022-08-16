package com.bef.effectsdk.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Arrays;
import java.util.List;
import p003X.C116971W2r;

/* loaded from: classes10.dex */
public class ViewControllerInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final List<String> list = Arrays.asList("effect");

    /* loaded from: classes10.dex */
    public interface NativeMessageListener {
        static {
            Covode.recordClassIndex(9608);
        }

        int nativeOnMsgReceived(long j, long j2, long j3, String str);
    }

    public static native int nativeAddMessageListener(long j, NativeMessageListener nativeMessageListener);

    public static native int nativeAttachEffect(long j, long j2);

    public static native void nativeCreateHandle(long[] jArr);

    public static native void nativeCreateHandle(long[] jArr, int i);

    public static native int nativeCreateTexture(int i, int i2, int i3, int i4, int i5);

    public static native int nativeDeleteTexture(int i);

    public static native int nativeDestroy(long j);

    public static native int nativeInit(long j, int i, int i2);

    public static native void nativeOnPause(long j);

    public static native void nativeOnResume(long j);

    public static native int nativePostMessage(long j, long j2, long j3, long j4, String str);

    public static native int nativeProcess(long j, int i, int i2, int i3, float[] fArr, float[] fArr2, double d);

    public static native int nativeRemoveMessageListener(long j, NativeMessageListener nativeMessageListener);

    public static native int nativeSetRenderCacheData(long j, String str, String str2);

    public static native int nativeSetRenderCacheTexture(long j, String str, String str2);

    public static native int nativeSetRenderCacheTextureWithBuffer(long j, String str, byte[] bArr, int i, int i2);

    public static native int nativeSetResourceFinder(long j, long j2, long j3);

    public static native int nativeSetStickerPath(long j, String str);

    public static native int nativeTouchEvent(long j, int i, int[] iArr, float[] fArr, float[] fArr2, int i2);

    static {
        Covode.recordClassIndex(9607);
        try {
            for (String str : list) {
                C116971W2r.LIZIZ(str);
            }
        } catch (Throwable unused) {
        }
    }

    public static void createHandle(long[] jArr) {
        MethodCollector.m14708i(705);
        if (PatchProxy.proxy(new Object[]{jArr}, null, changeQuickRedirect, true, 1).isSupported) {
            MethodCollector.m14707o(705);
            return;
        }
        nativeCreateHandle(jArr, 0);
        MethodCollector.m14707o(705);
    }

    public static int deleteTexture(int i) {
        MethodCollector.m14708i(724);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 20);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(724);
            return intValue;
        }
        int nativeDeleteTexture = nativeDeleteTexture(i);
        MethodCollector.m14707o(724);
        return nativeDeleteTexture;
    }

    public static int destroy(long j) {
        MethodCollector.m14708i(713);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, null, changeQuickRedirect, true, 9);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(713);
            return intValue;
        }
        int nativeDestroy = nativeDestroy(j);
        MethodCollector.m14707o(713);
        return nativeDestroy;
    }

    public static void onPause(long j) {
        MethodCollector.m14708i(711);
        if (PatchProxy.proxy(new Object[]{new Long(j)}, null, changeQuickRedirect, true, 7).isSupported) {
            MethodCollector.m14707o(711);
            return;
        }
        nativeOnPause(j);
        MethodCollector.m14707o(711);
    }

    public static void onResume(long j) {
        MethodCollector.m14708i(712);
        if (PatchProxy.proxy(new Object[]{new Long(j)}, null, changeQuickRedirect, true, 8).isSupported) {
            MethodCollector.m14707o(712);
            return;
        }
        nativeOnResume(j);
        MethodCollector.m14707o(712);
    }

    public static int addMessageListener(long j, NativeMessageListener nativeMessageListener) {
        MethodCollector.m14708i(721);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), nativeMessageListener}, null, changeQuickRedirect, true, 17);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(721);
            return intValue;
        }
        int nativeAddMessageListener = nativeAddMessageListener(j, nativeMessageListener);
        MethodCollector.m14707o(721);
        return nativeAddMessageListener;
    }

    public static int attachEffect(long j, long j2) {
        MethodCollector.m14708i(708);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2)}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(708);
            return intValue;
        }
        int nativeAttachEffect = nativeAttachEffect(j, j2);
        MethodCollector.m14707o(708);
        return nativeAttachEffect;
    }

    public static int removeMessageListener(long j, NativeMessageListener nativeMessageListener) {
        MethodCollector.m14708i(722);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), nativeMessageListener}, null, changeQuickRedirect, true, 18);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(722);
            return intValue;
        }
        int nativeRemoveMessageListener = nativeRemoveMessageListener(j, nativeMessageListener);
        MethodCollector.m14707o(722);
        return nativeRemoveMessageListener;
    }

    public static int setStickerPath(long j, String str) {
        MethodCollector.m14708i(709);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(709);
            return intValue;
        }
        int nativeSetStickerPath = nativeSetStickerPath(j, str);
        MethodCollector.m14707o(709);
        return nativeSetStickerPath;
    }

    public static void createHandle(long[] jArr, int i) {
        MethodCollector.m14708i(706);
        if (PatchProxy.proxy(new Object[]{jArr, Integer.valueOf(i)}, null, changeQuickRedirect, true, 2).isSupported) {
            MethodCollector.m14707o(706);
            return;
        }
        nativeCreateHandle(jArr, i);
        MethodCollector.m14707o(706);
    }

    public static int init(long j, int i, int i2) {
        MethodCollector.m14708i(707);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(707);
            return intValue;
        }
        int nativeInit = nativeInit(j, i, i2);
        MethodCollector.m14707o(707);
        return nativeInit;
    }

    public static int setRenderCacheData(long j, String str, String str2) {
        MethodCollector.m14708i(725);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str, str2}, null, changeQuickRedirect, true, 21);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(725);
            return intValue;
        }
        int nativeSetRenderCacheData = nativeSetRenderCacheData(j, str, str2);
        MethodCollector.m14707o(725);
        return nativeSetRenderCacheData;
    }

    public static int setRenderCacheTexture(long j, String str, String str2) {
        MethodCollector.m14708i(726);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str, str2}, null, changeQuickRedirect, true, 22);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(726);
            return intValue;
        }
        int nativeSetRenderCacheTexture = nativeSetRenderCacheTexture(j, str, str2);
        MethodCollector.m14707o(726);
        return nativeSetRenderCacheTexture;
    }

    public static int setResourceFinder(long j, long j2, long j3) {
        MethodCollector.m14708i(728);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), new Long(j3)}, null, changeQuickRedirect, true, 24);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(728);
            return intValue;
        }
        int nativeSetResourceFinder = nativeSetResourceFinder(j, j2, j3);
        MethodCollector.m14707o(728);
        return nativeSetResourceFinder;
    }

    public static int touchBeginEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.m14708i(714);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), iArr, fArr, fArr2}, null, changeQuickRedirect, true, 10);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(714);
            return intValue;
        }
        int nativeTouchEvent = nativeTouchEvent(j, 0, iArr, fArr, fArr2, iArr.length);
        MethodCollector.m14707o(714);
        return nativeTouchEvent;
    }

    public static int touchEndEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.m14708i(716);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), iArr, fArr, fArr2}, null, changeQuickRedirect, true, 12);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(716);
            return intValue;
        }
        int nativeTouchEvent = nativeTouchEvent(j, 1, iArr, fArr, fArr2, iArr.length);
        MethodCollector.m14707o(716);
        return nativeTouchEvent;
    }

    public static int touchMoveEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.m14708i(715);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), iArr, fArr, fArr2}, null, changeQuickRedirect, true, 11);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(715);
            return intValue;
        }
        int nativeTouchEvent = nativeTouchEvent(j, 2, iArr, fArr, fArr2, iArr.length);
        MethodCollector.m14707o(715);
        return nativeTouchEvent;
    }

    public static int createTexture(int i, int i2, int i3, int i4, int i5) {
        MethodCollector.m14708i(723);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, null, changeQuickRedirect, true, 19);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(723);
            return intValue;
        }
        int nativeCreateTexture = nativeCreateTexture(i, i2, i3, i4, i5);
        MethodCollector.m14707o(723);
        return nativeCreateTexture;
    }

    public static int postMessage(long j, long j2, long j3, long j4, String str) {
        MethodCollector.m14708i(720);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4), str}, null, changeQuickRedirect, true, 16);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(720);
            return intValue;
        }
        int nativePostMessage = nativePostMessage(j, j2, j3, j4, str);
        MethodCollector.m14707o(720);
        return nativePostMessage;
    }

    public static int setRenderCacheTextureWithBuffer(long j, String str, byte[] bArr, int i, int i2) {
        MethodCollector.m14708i(727);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str, bArr, Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 23);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(727);
            return intValue;
        }
        int nativeSetRenderCacheTextureWithBuffer = nativeSetRenderCacheTextureWithBuffer(j, str, bArr, i, i2);
        MethodCollector.m14707o(727);
        return nativeSetRenderCacheTextureWithBuffer;
    }

    public static int touchBeginEvent(long j, int[] iArr, float[] fArr, float[] fArr2, int i) {
        MethodCollector.m14708i(717);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), iArr, fArr, fArr2, Integer.valueOf(i)}, null, changeQuickRedirect, true, 13);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(717);
            return intValue;
        }
        int nativeTouchEvent = nativeTouchEvent(j, 0, iArr, fArr, fArr2, i);
        MethodCollector.m14707o(717);
        return nativeTouchEvent;
    }

    public static int touchEndEvent(long j, int[] iArr, float[] fArr, float[] fArr2, int i) {
        MethodCollector.m14708i(719);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), iArr, fArr, fArr2, Integer.valueOf(i)}, null, changeQuickRedirect, true, 15);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(719);
            return intValue;
        }
        int nativeTouchEvent = nativeTouchEvent(j, 1, iArr, fArr, fArr2, i);
        MethodCollector.m14707o(719);
        return nativeTouchEvent;
    }

    public static int touchMoveEvent(long j, int[] iArr, float[] fArr, float[] fArr2, int i) {
        MethodCollector.m14708i(718);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), iArr, fArr, fArr2, Integer.valueOf(i)}, null, changeQuickRedirect, true, 14);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(718);
            return intValue;
        }
        int nativeTouchEvent = nativeTouchEvent(j, 2, iArr, fArr, fArr2, i);
        MethodCollector.m14707o(718);
        return nativeTouchEvent;
    }

    public static int processFrame(long j, int i, int i2, int i3, float[] fArr, float[] fArr2, double d) {
        MethodCollector.m14708i(710);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fArr, fArr2, Double.valueOf(d)}, null, changeQuickRedirect, true, 6);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(710);
            return intValue;
        }
        int nativeProcess = nativeProcess(j, i, i2, i3, fArr, fArr2, d);
        MethodCollector.m14707o(710);
        return nativeProcess;
    }
}
