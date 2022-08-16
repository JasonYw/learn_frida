package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import com.amap.api.mapcore2d.C1599da;
import com.amap.api.maps2d.MapsInitializer;
import com.amap.api.maps2d.model.BitmapDescriptorFactory;
import com.amap.api.maps2d.model.LatLng;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.amap.api.mapcore2d.cm */
/* loaded from: classes19.dex */
public class C1569cm {

    /* renamed from: a */
    public static double[] f23158a = {7453.642d, 3742.9905d, 1873.333d, 936.89026d, 468.472d, 234.239d, 117.12d, 58.56d, 29.28d, 14.64d, 7.32d, 3.66d, 1.829d, 0.915d, 0.4575d, 0.228d, 0.1144d};

    /* renamed from: a */
    public static double m18160a(double d, double d2, double d3, double d4, double d5, double d6) {
        return ((d3 - d) * (d6 - d2)) - ((d5 - d) * (d4 - d2));
    }

    /* renamed from: a */
    public static float m18158a(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f <= 45.0f) {
            return f;
        }
        return 45.0f;
    }

    /* renamed from: a */
    public static boolean m18159a(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        double d9 = d3 - d;
        double d10 = d8 - d6;
        double d11 = d4 - d2;
        double d12 = d7 - d5;
        double d13 = (d9 * d10) - (d11 * d12);
        if (d13 != 0.0d) {
            double d14 = d2 - d6;
            double d15 = d - d5;
            double d16 = ((d12 * d14) - (d10 * d15)) / d13;
            double d17 = ((d14 * d9) - (d15 * d11)) / d13;
            return d16 >= 0.0d && d16 <= 1.0d && d17 >= 0.0d && d17 <= 1.0d;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m18156a(int i, int i2) {
        return i > 0 && i2 > 0;
    }

    /* renamed from: a */
    public static String m18148a(String str, Object obj) {
        new StringBuilder();
        return C0002O.m25085C(str, "=", String.valueOf(obj));
    }

    /* renamed from: a */
    public static String m18145a(String... strArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String str : strArr) {
            sb.append(str);
            if (i != strArr.length - 1) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m18151a(LatLng latLng, List<LatLng> list) {
        double d = latLng.longitude;
        double d2 = latLng.latitude;
        double d3 = latLng.latitude;
        if (list.size() < 3) {
            return false;
        }
        if (!list.get(0).equals(list.get(list.size() - 1))) {
            list.add(list.get(0));
        }
        int i = 0;
        int i2 = 0;
        while (i < list.size() - 1) {
            double d4 = list.get(i).longitude;
            double d5 = list.get(i).latitude;
            i++;
            double d6 = list.get(i).longitude;
            double d7 = list.get(i).latitude;
            double d8 = d2;
            if (m18144b(d, d2, d4, d5, d6, d7)) {
                return true;
            }
            if (Math.abs(d7 - d5) >= 1.0E-9d) {
                if (m18144b(d4, d5, d, d8, 180.0d, d3)) {
                    if (d5 <= d7) {
                    }
                    i2++;
                } else if (m18144b(d6, d7, d, d8, 180.0d, d3)) {
                    if (d7 <= d5) {
                    }
                    i2++;
                } else if (m18159a(d4, d5, d6, d7, d, d8, 180.0d, d3)) {
                    i2++;
                }
            }
            d2 = d8;
        }
        return i2 % 2 != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0028, code lost:
        if (r1 == android.net.NetworkInfo.State.DISCONNECTING) goto L27;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean m18155a(android.content.Context r4) {
        /*
            java.lang.Class<com.amap.api.mapcore2d.cm> r3 = com.amap.api.mapcore2d.C1569cm.class
            monitor-enter(r3)
            r2 = 0
            if (r4 != 0) goto L8
            monitor-exit(r3)
            return r2
        L8:
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r4.getSystemService(r0)     // Catch: java.lang.Throwable -> L2c
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L14
            monitor-exit(r3)
            return r2
        L14:
            android.net.NetworkInfo r0 = p003X.C116971W2r.LIZ(r0)     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L1c
            monitor-exit(r3)
            return r2
        L1c:
            android.net.NetworkInfo$State r1 = r0.getState()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L2a
            android.net.NetworkInfo$State r0 = android.net.NetworkInfo.State.DISCONNECTED     // Catch: java.lang.Throwable -> L2c
            if (r1 == r0) goto L2a
            android.net.NetworkInfo$State r0 = android.net.NetworkInfo.State.DISCONNECTING     // Catch: java.lang.Throwable -> L2c
            if (r1 != r0) goto L2c
        L2a:
            monitor-exit(r3)
            return r2
        L2c:
            r0 = 1
            monitor-exit(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.C1569cm.m18155a(android.content.Context):boolean");
    }

    /* renamed from: a */
    public static void m18147a(Throwable th, String str, String str2) {
        try {
            C1616do m17864e = C1616do.m17864e();
            if (m17864e == null) {
                return;
            }
            m17864e.m17868b(th, str, str2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static boolean m18150a(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return true;
        }
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i].isFile()) {
                if (!C116971W2r.LIZ(listFiles[i])) {
                    return false;
                }
            } else if (!m18150a(listFiles[i])) {
                return false;
            } else {
                C116971W2r.LIZ(listFiles[i]);
            }
        }
        return true;
    }

    static {
        Covode.recordClassIndex(5117);
    }

    /* renamed from: a */
    public static C1599da m18161a() {
        try {
            if (C1771q.f24027p == null) {
                C1599da.C1601a c1601a = new C1599da.C1601a("2dmap", "6.0.0", "AMAP_SDK_Android_2DMap_6.0.0");
                c1601a.m17957a(new String[]{"com.amap.api.maps2d", "com.amap.api.mapcore2d"});
                c1601a.m17958a("6.0.0");
                return c1601a.m17960a();
            }
            return C1771q.f24027p;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static int m18146a(Object[] objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: b */
    public static float m18143b(float f) {
        int i;
        if (f > C1771q.f24014c) {
            i = C1771q.f24014c;
        } else if (f >= C1771q.f24015d) {
            return f;
        } else {
            i = C1771q.f24015d;
        }
        return i;
    }

    /* renamed from: a */
    public static Bitmap m18149a(String str) {
        try {
            if (C1484ar.f22704a != null) {
                InputStream open = C1484ar.f22704a.getAssets().open(str);
                Bitmap LIZ = C116971W2r.LIZ(open);
                open.close();
                return LIZ;
            }
            InputStream resourceAsStream = BitmapDescriptorFactory.class.getResourceAsStream(C0002O.m25086C("/assets/", str));
            Bitmap LIZ2 = C116971W2r.LIZ(resourceAsStream);
            resourceAsStream.close();
            return LIZ2;
        } catch (Throwable th) {
            m18147a(th, "Util", "fromAsset");
            return null;
        }
    }

    /* renamed from: b */
    public static String m18142b(Context context) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return C116971W2r.LIZJ(context).getPath();
        }
        if (MapsInitializer.sdcardDir != null && !MapsInitializer.sdcardDir.equals("")) {
            File file = new File(MapsInitializer.sdcardDir);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, "Amap");
            if (!file2.exists()) {
                file2.mkdir();
            }
            new StringBuilder();
            return C0002O.m25086C(file2.toString(), "/");
        }
        File file3 = new File(C116971W2r.LIZIZ(), "AMap");
        if (!file3.exists()) {
            file3.mkdir();
        }
        new StringBuilder();
        return C0002O.m25086C(file3.toString(), "/");
    }

    /* renamed from: a */
    public static C1781w m18153a(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return new C1781w((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
    }

    /* renamed from: a */
    public static String m18157a(int i) {
        if (i < 1000) {
            return i + "m";
        }
        return (i / 1000) + "km";
    }

    /* renamed from: a */
    public static Bitmap m18154a(Bitmap bitmap, float f) {
        if (bitmap == null) {
            return null;
        }
        try {
            return C116971W2r.LIZ(bitmap, (int) (bitmap.getWidth() * f), (int) (bitmap.getHeight() * f), true);
        } catch (Throwable th) {
            m18147a(th, "Util", "zoomBitmap");
            return null;
        }
    }

    /* renamed from: a */
    public static double m18152a(LatLng latLng, LatLng latLng2) {
        double d = latLng.longitude;
        double d2 = d * 0.01745329251994329d;
        double d3 = latLng.latitude * 0.01745329251994329d;
        double d4 = latLng2.longitude * 0.01745329251994329d;
        double d5 = latLng2.latitude * 0.01745329251994329d;
        double sin = Math.sin(d2);
        double sin2 = Math.sin(d3);
        double cos = Math.cos(d2);
        double cos2 = Math.cos(d3);
        double sin3 = Math.sin(d4);
        double sin4 = Math.sin(d5);
        double cos3 = Math.cos(d4);
        double cos4 = Math.cos(d5);
        double[] dArr = {cos * cos2, cos2 * sin, sin2};
        double[] dArr2 = {cos3 * cos4, cos4 * sin3, sin4};
        return Math.asin(Math.sqrt((((dArr[0] - dArr2[0]) * (dArr[0] - dArr2[0])) + ((dArr[1] - dArr2[1]) * (dArr[1] - dArr2[1]))) + ((dArr[2] - dArr2[2]) * (dArr[2] - dArr2[2]))) / 2.0d) * 1.27420015798544E7d;
    }

    /* renamed from: b */
    public static boolean m18144b(double d, double d2, double d3, double d4, double d5, double d6) {
        if (Math.abs(m18160a(d, d2, d3, d4, d5, d6)) < 1.0E-9d && (d - d3) * (d - d5) <= 0.0d && (d2 - d4) * (d2 - d6) <= 0.0d) {
            return true;
        }
        return false;
    }
}
