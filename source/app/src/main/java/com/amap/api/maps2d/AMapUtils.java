package com.amap.api.maps2d;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.amap.api.mapcore2d.C1572cp;
import com.amap.api.mapcore2d.C1573cq;
import com.amap.api.mapcore2d.C1583cs;
import com.amap.api.mapcore2d.C1599da;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.NaviPara;
import com.amap.api.maps2d.model.PoiPara;
import com.amap.api.maps2d.model.RoutePara;
import com.bytedance.covode.number.Covode;
import java.util.Locale;
import p003X.C116971W2r;

/* loaded from: classes19.dex */
public class AMapUtils {
    static {
        Covode.recordClassIndex(5350);
    }

    /* renamed from: com.amap.api.maps2d.AMapUtils$a */
    /* loaded from: classes19.dex */
    public static class C1785a extends Thread {

        /* renamed from: a */
        public String f24085a;

        /* renamed from: b */
        public Context f24086b;

        static {
            Covode.recordClassIndex(5351);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            if (this.f24086b != null) {
                try {
                    C1599da.C1601a c1601a = new C1599da.C1601a(this.f24085a, "6.0.0", "AMAP_SDK_Android_2DMap_6.0.0");
                    c1601a.m17957a(new String[]{"com.amap.api.maps"});
                    C1583cs.m18097a(this.f24086b, c1601a.m17960a());
                    interrupt();
                } catch (C1572cp e) {
                    e.printStackTrace();
                }
            }
        }

        public C1785a(String str, Context context) {
            this.f24085a = "";
            this.f24085a = str;
            if (context != null) {
                this.f24086b = context.getApplicationContext();
            }
        }
    }

    /* renamed from: a */
    public static boolean m17140a(Context context) {
        if (context.getPackageManager().getPackageInfo("com.autonavi.minimap", 0) == null) {
            return false;
        }
        return true;
    }

    public static void getLatestAMapApp(Context context) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(276824064);
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("http://wap.amap.com/"));
            new C1785a("glaa", context).start();
            C116971W2r.LIZ(context, intent);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static boolean m17137a(RoutePara routePara) {
        if (routePara.getStartPoint() != null && routePara.getEndPoint() != null && routePara.getStartName() != null && routePara.getStartName().trim().length() > 0 && routePara.getEndName() != null && routePara.getEndName().trim().length() > 0) {
            return true;
        }
        return false;
    }

    public static void openAMapDrivingRoute(RoutePara routePara, Context context) {
        m17135b(routePara, context, 2);
    }

    public static void openAMapTransitRoute(RoutePara routePara, Context context) {
        m17135b(routePara, context, 1);
    }

    public static void openAMapWalkingRoute(RoutePara routePara, Context context) {
        m17135b(routePara, context, 4);
    }

    /* renamed from: a */
    public static String m17139a(NaviPara naviPara, Context context) {
        return String.format(Locale.US, "androidamap://navi?sourceApplication=%s&lat=%f&lon=%f&dev=0&style=%d", C1573cq.m18123b(context), Double.valueOf(naviPara.getTargetPoint().latitude), Double.valueOf(naviPara.getTargetPoint().longitude), Integer.valueOf(naviPara.getNaviStyle()));
    }

    /* renamed from: a */
    public static String m17138a(PoiPara poiPara, Context context) {
        String format = String.format(Locale.US, "androidamap://arroundpoi?sourceApplication=%s&keywords=%s&dev=0", C1573cq.m18123b(context), poiPara.getKeywords());
        if (poiPara.getCenter() != null) {
            return format + "&lat=" + poiPara.getCenter().latitude + "&lon=" + poiPara.getCenter().longitude;
        }
        return format;
    }

    public static float calculateArea(LatLng latLng, LatLng latLng2) {
        if (latLng != null && latLng2 != null) {
            double sin = Math.sin((latLng.latitude * 3.141592653589793d) / 180.0d) - Math.sin((latLng2.latitude * 3.141592653589793d) / 180.0d);
            double d = (latLng2.longitude - latLng.longitude) / 360.0d;
            if (d < 0.0d) {
                d += 1.0d;
            }
            return (float) (sin * 2.5560394669790553E14d * d);
        }
        try {
            throw new AMapException("非法坐标值");
        } catch (AMapException e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    public static void openAMapNavi(NaviPara naviPara, Context context) {
        if (m17140a(context)) {
            if (naviPara.getTargetPoint() != null) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(276824064);
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setData(Uri.parse(m17139a(naviPara, context)));
                intent.setPackage("com.autonavi.minimap");
                new C1785a("oan", context).start();
                C116971W2r.LIZ(context, intent);
                return;
            }
            throw new AMapException("非法导航参数");
        }
        throw new AMapException("移动设备上未安装高德地图或高德地图版本较旧");
    }

    public static void openAMapPoiNearbySearch(PoiPara poiPara, Context context) {
        if (m17140a(context)) {
            if (poiPara.getKeywords() != null && poiPara.getKeywords().trim().length() > 0) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(276824064);
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setData(Uri.parse(m17138a(poiPara, context)));
                intent.setPackage("com.autonavi.minimap");
                new C1785a("oan", context).start();
                C116971W2r.LIZ(context, intent);
                return;
            }
            throw new AMapException("非法导航参数");
        }
        throw new AMapException("移动设备上未安装高德地图或高德地图版本较旧");
    }

    public static float calculateLineDistance(LatLng latLng, LatLng latLng2) {
        if (latLng != null && latLng2 != null) {
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
            return (float) (Math.asin(Math.sqrt((((dArr[0] - dArr2[0]) * (dArr[0] - dArr2[0])) + ((dArr[1] - dArr2[1]) * (dArr[1] - dArr2[1]))) + ((dArr[2] - dArr2[2]) * (dArr[2] - dArr2[2]))) / 2.0d) * 1.27420015798544E7d);
        }
        try {
            throw new AMapException("非法坐标值");
        } catch (AMapException e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    /* renamed from: b */
    public static void m17135b(RoutePara routePara, Context context, int i) {
        if (m17140a(context)) {
            if (m17137a(routePara)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(276824064);
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setData(Uri.parse(m17136a(routePara, context, i)));
                intent.setPackage("com.autonavi.minimap");
                new C1785a("oan", context).start();
                C116971W2r.LIZ(context, intent);
                return;
            }
            throw new AMapException("非法导航参数");
        }
        throw new AMapException("移动设备上未安装高德地图或高德地图版本较旧");
    }

    /* renamed from: a */
    public static String m17136a(RoutePara routePara, Context context, int i) {
        String format = String.format(Locale.US, "androidamap://route?sourceApplication=%s&slat=%f&slon=%f&sname=%s&dlat=%f&dlon=%f&dname=%s&dev=0&t=%d", C1573cq.m18123b(context), Double.valueOf(routePara.getStartPoint().latitude), Double.valueOf(routePara.getStartPoint().longitude), routePara.getStartName(), Double.valueOf(routePara.getEndPoint().latitude), Double.valueOf(routePara.getEndPoint().longitude), routePara.getEndName(), Integer.valueOf(i));
        if (i == 1) {
            return format + "&m=" + routePara.getTransitRouteStyle();
        } else if (i != 2) {
            return format;
        } else {
            return format + "&m=" + routePara.getDrivingRouteStyle();
        }
    }
}
