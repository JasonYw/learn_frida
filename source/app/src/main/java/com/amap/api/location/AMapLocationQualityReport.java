package com.amap.api.location;

import com.amap.api.location.AMapLocationClientOption;
import com.bytedance.covode.number.Covode;
import com.loc.C15968ej;

/* loaded from: classes19.dex */
public class AMapLocationQualityReport implements Cloneable {

    /* renamed from: b */
    public boolean f22625b;

    /* renamed from: d */
    public int f22627d;

    /* renamed from: f */
    public long f22629f;

    /* renamed from: g */
    public boolean f22630g;

    /* renamed from: c */
    public int f22626c = 2;

    /* renamed from: e */
    public String f22628e = "UNKNOWN";

    /* renamed from: a */
    public AMapLocationClientOption.AMapLocationMode f22624a = AMapLocationClientOption.AMapLocationMode.Hight_Accuracy;

    static {
        Covode.recordClassIndex(4997);
    }

    /* renamed from: clone */
    public AMapLocationQualityReport m25273clone() {
        AMapLocationQualityReport aMapLocationQualityReport = new AMapLocationQualityReport();
        try {
            super.clone();
        } catch (Throwable unused) {
        }
        try {
            aMapLocationQualityReport.setGpsStatus(this.f22626c);
            aMapLocationQualityReport.setGPSSatellites(this.f22627d);
            aMapLocationQualityReport.setWifiAble(this.f22625b);
            aMapLocationQualityReport.setNetUseTime(this.f22629f);
            aMapLocationQualityReport.setNetworkType(this.f22628e);
            aMapLocationQualityReport.setLocationMode(this.f22624a);
            aMapLocationQualityReport.setInstallHighDangerMockApp(this.f22630g);
            return aMapLocationQualityReport;
        } catch (Throwable th) {
            C15968ej.m10694a(th, "AMapLocationQualityReport", "clone");
            return aMapLocationQualityReport;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getAdviseMessage() {
        /*
            r4 = this;
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = r4.f22624a
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r0 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Battery_Saving
            if (r1 == r0) goto L20
            int r1 = r4.f22626c
            r3 = 4
            if (r1 == 0) goto L59
            r0 = 1
            if (r1 == r0) goto L56
            r0 = 2
            if (r1 == r0) goto L53
            r0 = 3
            if (r1 == r0) goto L50
            if (r1 != r3) goto L20
            java.lang.String r0 = "您的设置禁用了GPS定位权限，开启GPS定位权限有助于提高定位的精确度\n"
        L1d:
            r2.append(r0)
        L20:
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = r4.f22624a
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r0 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Device_Sensors
            if (r1 == r0) goto L3e
            java.lang.String r1 = r4.f22628e
            java.lang.String r0 = "DISCONNECTED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L43
            java.lang.String r0 = "您的设备未连接到网络，无法进行网络定位\n"
        L32:
            r2.append(r0)
        L35:
            boolean r0 = r4.f22625b
            if (r0 != 0) goto L3e
            java.lang.String r0 = "您的设备WIFI开关已关闭，打开WIFI开关有助于提高定位的成功率\n"
            r2.append(r0)
        L3e:
            java.lang.String r0 = r2.toString()
            return r0
        L43:
            java.lang.String r1 = r4.f22628e
            java.lang.String r0 = "2G"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            java.lang.String r0 = "您的设备网络状态不太好，网络定位可能会有延迟\n"
            goto L32
        L50:
            java.lang.String r0 = "您的设备当前设置的定位模式不包含GPS定位，选择包含GPS模式的定位模式有助于提高定位的精确度\n"
            goto L1d
        L53:
            java.lang.String r0 = "您的设备关闭了GPS定位功能，开启GPS定位功能有助于提高定位的精确度\n"
            goto L1d
        L56:
            java.lang.String r0 = "您的设备没有GPS模块或者GPS模块异常，无法进行GPS定位\n"
            goto L1d
        L59:
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = r4.f22624a
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r0 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Device_Sensors
            if (r1 != r0) goto L20
            int r0 = r4.f22627d
            if (r0 >= r3) goto L20
            java.lang.String r0 = "当前GPS信号弱，位置更新可能会延迟\n"
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.location.AMapLocationQualityReport.getAdviseMessage():java.lang.String");
    }

    public int getGPSSatellites() {
        return this.f22627d;
    }

    public int getGPSStatus() {
        return this.f22626c;
    }

    public long getNetUseTime() {
        return this.f22629f;
    }

    public String getNetworkType() {
        return this.f22628e;
    }

    public boolean isInstalledHighDangerMockApp() {
        return this.f22630g;
    }

    public boolean isWifiAble() {
        return this.f22625b;
    }

    public void setGPSSatellites(int i) {
        this.f22627d = i;
    }

    public void setGpsStatus(int i) {
        this.f22626c = i;
    }

    public void setInstallHighDangerMockApp(boolean z) {
        this.f22630g = z;
    }

    public void setLocationMode(AMapLocationClientOption.AMapLocationMode aMapLocationMode) {
        this.f22624a = aMapLocationMode;
    }

    public void setNetUseTime(long j) {
        this.f22629f = j;
    }

    public void setNetworkType(String str) {
        this.f22628e = str;
    }

    public void setWifiAble(boolean z) {
        this.f22625b = z;
    }
}
