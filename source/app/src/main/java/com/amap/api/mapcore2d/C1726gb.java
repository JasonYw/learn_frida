package com.amap.api.mapcore2d;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.autonavi.amap.mapcore2d.Inner_3dMap_location;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationListener;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.gb */
/* loaded from: classes19.dex */
public final class C1726gb {

    /* renamed from: a */
    public static Inner_3dMap_location f23662a;

    /* renamed from: b */
    public C1722fz f23663b;

    /* renamed from: com.amap.api.mapcore2d.gb$1 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C17271 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23664a = new int[Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode.valuesCustom().length];

        static {
            Covode.recordClassIndex(5275);
            try {
                f23664a[Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode.Battery_Saving.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23664a[Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode.Device_Sensors.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23664a[Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode.Hight_Accuracy.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        Covode.recordClassIndex(5274);
    }

    /* renamed from: a */
    public static AMapLocationClientOption m17485a(Inner_3dMap_locationOption inner_3dMap_locationOption) {
        AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
        aMapLocationClientOption.setInterval(inner_3dMap_locationOption.getInterval());
        int i = C17271.f23664a[inner_3dMap_locationOption.getLocationMode().ordinal()];
        aMapLocationClientOption.setLocationMode(i != 1 ? i != 2 ? AMapLocationClientOption.AMapLocationMode.Hight_Accuracy : AMapLocationClientOption.AMapLocationMode.Device_Sensors : AMapLocationClientOption.AMapLocationMode.Battery_Saving);
        aMapLocationClientOption.setOnceLocation(inner_3dMap_locationOption.isOnceLocation());
        aMapLocationClientOption.setNeedAddress(inner_3dMap_locationOption.isNeedAddress());
        return aMapLocationClientOption;
    }

    /* renamed from: a */
    public static Inner_3dMap_location m17486a(AMapLocation aMapLocation) {
        Inner_3dMap_location inner_3dMap_location = new Inner_3dMap_location("");
        if (aMapLocation != null) {
            try {
                inner_3dMap_location.setLatitude(aMapLocation.getLatitude());
                inner_3dMap_location.setLongitude(aMapLocation.getLongitude());
                inner_3dMap_location.setAccuracy(aMapLocation.getAccuracy());
                inner_3dMap_location.setBearing(aMapLocation.getBearing());
                inner_3dMap_location.setAltitude(aMapLocation.getAltitude());
                inner_3dMap_location.setProvider(aMapLocation.getProvider());
                inner_3dMap_location.setSpeed(aMapLocation.getSpeed());
                inner_3dMap_location.setTime(aMapLocation.getTime());
                inner_3dMap_location.setErrorCode(aMapLocation.getErrorCode());
                inner_3dMap_location.setErrorInfo(aMapLocation.getErrorInfo());
                inner_3dMap_location.setLocationType(aMapLocation.getLocationType());
                inner_3dMap_location.setLocationDetail(aMapLocation.getLocationDetail());
                inner_3dMap_location.setProvince(aMapLocation.getProvince());
                inner_3dMap_location.setCity(aMapLocation.getCity());
                inner_3dMap_location.setCityCode(aMapLocation.getCityCode());
                inner_3dMap_location.setCountry(aMapLocation.getCountry());
                inner_3dMap_location.setDistrict(aMapLocation.getDistrict());
                inner_3dMap_location.setAddress(aMapLocation.getAddress());
                inner_3dMap_location.setAdCode(aMapLocation.getAdCode());
                inner_3dMap_location.setExtras(aMapLocation.getExtras());
                inner_3dMap_location.setRoad(aMapLocation.getRoad());
                return inner_3dMap_location;
            } catch (Throwable th) {
                C1752gu.m17302a(th, "Util", "converterLocation");
            }
        }
        return inner_3dMap_location;
    }

    /* renamed from: a */
    public static void m17483a(Object obj, Inner_3dMap_locationOption inner_3dMap_locationOption) {
        if (obj == null) {
            return;
        }
        ((AMapLocationClient) obj).setLocationOption(m17485a(inner_3dMap_locationOption));
    }

    /* renamed from: a */
    public final void m17484a(Object obj, Inner_3dMap_locationListener inner_3dMap_locationListener) {
        if (this.f23663b == null) {
            this.f23663b = new C1722fz();
        }
        this.f23663b.m17495a(inner_3dMap_locationListener);
        ((AMapLocationClient) obj).setLocationListener(this.f23663b);
    }
}
