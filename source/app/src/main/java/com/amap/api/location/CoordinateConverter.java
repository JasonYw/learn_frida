package com.amap.api.location;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.loc.C15968ej;
import com.loc.C15975ep;
import p003X.TFG;

/* loaded from: classes19.dex */
public class CoordinateConverter {

    /* renamed from: b */
    public static int f22635b;

    /* renamed from: c */
    public static int f22636c = 1;

    /* renamed from: d */
    public static int f22637d = 2;

    /* renamed from: e */
    public static int f22638e = 4;

    /* renamed from: f */
    public static int f22639f = 8;

    /* renamed from: g */
    public static int f22640g = 16;

    /* renamed from: h */
    public static int f22641h = 32;

    /* renamed from: i */
    public static int f22642i = 64;

    /* renamed from: a */
    public DPoint f22643a;

    /* renamed from: j */
    public Context f22644j;

    /* renamed from: k */
    public CoordType f22645k;

    /* renamed from: l */
    public DPoint f22646l;

    /* loaded from: classes19.dex */
    public enum CoordType {
        BAIDU,
        MAPBAR,
        MAPABC,
        SOSOMAP,
        ALIYUN,
        GOOGLE,
        GPS;

        static {
            Covode.recordClassIndex(5002);
        }
    }

    static {
        Covode.recordClassIndex(TFG.LIZIZ);
    }

    public CoordinateConverter(Context context) {
        this.f22644j = context;
    }

    public static float calculateLineDistance(DPoint dPoint, DPoint dPoint2) {
        try {
            return C15975ep.m10625a(dPoint, dPoint2);
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static boolean isAMapDataAvailable(double d, double d2) {
        return C15968ej.m10703a(d, d2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0103 A[Catch: all -> 0x0133, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:9:0x0018, B:11:0x0027, B:13:0x0036, B:15:0x0045, B:16:0x0052, B:17:0x0055, B:21:0x0059, B:23:0x006a, B:24:0x00f5, B:25:0x00f8, B:27:0x0103, B:28:0x0108, B:29:0x0072, B:31:0x0079, B:32:0x0083, B:33:0x00db, B:36:0x008c, B:38:0x0093, B:39:0x009d, B:40:0x00a0, B:42:0x00a7, B:43:0x00b1, B:44:0x00b4, B:46:0x00bb, B:47:0x00c5, B:48:0x00c8, B:50:0x00cf, B:51:0x00d9, B:52:0x00e0, B:54:0x00ef, B:55:0x0113, B:56:0x011a, B:57:0x011b, B:58:0x0122, B:59:0x0123, B:60:0x012a, B:61:0x012b, B:62:0x0132), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized com.amap.api.location.DPoint convert() {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.location.CoordinateConverter.convert():com.amap.api.location.DPoint");
    }

    public synchronized CoordinateConverter coord(DPoint dPoint) {
        if (dPoint == null) {
            throw new IllegalArgumentException("传入经纬度对象为空");
        }
        if (dPoint.getLongitude() > 180.0d || dPoint.getLongitude() < -180.0d) {
            throw new IllegalArgumentException("请传入合理经度");
        }
        if (dPoint.getLatitude() > 90.0d || dPoint.getLatitude() < -90.0d) {
            throw new IllegalArgumentException("请传入合理纬度");
        }
        this.f22646l = dPoint;
        return this;
    }

    public synchronized CoordinateConverter from(CoordType coordType) {
        this.f22645k = coordType;
        return this;
    }
}
