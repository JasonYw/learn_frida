package com.bef.effectsdk;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes24.dex */
public class ImgporcUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* loaded from: classes24.dex */
    public static class InterpolationFlags {
        static {
            Covode.recordClassIndex(9537);
        }
    }

    static {
        Covode.recordClassIndex(9536);
    }

    public static native float nativeCalculateAspectRatio(PointF[] pointFArr, int i, int i2);

    public static native Bitmap nativeCorrectPerspective(Bitmap bitmap, PointF[] pointFArr, int i, int i2, int i3);

    public static float calculateAspectRatio(PointF[] pointFArr, int i, int i2) {
        MethodCollector.m14708i(641);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pointFArr, Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            float floatValue = ((Float) proxy.result).floatValue();
            MethodCollector.m14707o(641);
            return floatValue;
        }
        float nativeCalculateAspectRatio = nativeCalculateAspectRatio(pointFArr, i, i2);
        MethodCollector.m14707o(641);
        return nativeCalculateAspectRatio;
    }

    public static Bitmap correctPerspective(Bitmap bitmap, PointF[] pointFArr, int i, int i2) {
        MethodCollector.m14708i(640);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bitmap, pointFArr, Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            Bitmap bitmap2 = (Bitmap) proxy.result;
            MethodCollector.m14707o(640);
            return bitmap2;
        }
        Bitmap nativeCorrectPerspective = nativeCorrectPerspective(bitmap, pointFArr, i, i2, 1);
        MethodCollector.m14707o(640);
        return nativeCorrectPerspective;
    }

    public static Bitmap correctPerspective(Bitmap bitmap, PointF[] pointFArr, int i, int i2, int i3) {
        MethodCollector.m14708i(639);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bitmap, pointFArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            Bitmap bitmap2 = (Bitmap) proxy.result;
            MethodCollector.m14707o(639);
            return bitmap2;
        }
        Bitmap nativeCorrectPerspective = nativeCorrectPerspective(bitmap, pointFArr, i, i2, i3);
        MethodCollector.m14707o(639);
        return nativeCorrectPerspective;
    }
}
