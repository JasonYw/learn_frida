package com.amap.api.location;

import com.bytedance.covode.number.Covode;

/* loaded from: classes.dex */
public class CoordUtil {

    /* renamed from: a */
    public static boolean f22634a;

    static {
        Covode.recordClassIndex(4999);
    }

    public static native int convertToGcj(double[] dArr, double[] dArr2);

    public static boolean isLoadedSo() {
        return f22634a;
    }

    public static void setLoadedSo(boolean z) {
        f22634a = z;
    }
}
