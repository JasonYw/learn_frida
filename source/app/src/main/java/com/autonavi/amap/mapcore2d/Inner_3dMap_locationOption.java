package com.autonavi.amap.mapcore2d;

import com.amap.api.mapcore2d.C1752gu;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p002O.C0002O;

/* loaded from: classes19.dex */
public class Inner_3dMap_locationOption implements Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isGpsFirst;
    public boolean isKillProcess;
    public boolean isMockEnable;
    public boolean isOnceLocation;
    public boolean isOnceLocationLatest;
    public boolean sensorEnable;
    public static Inner_3dMap_Enum_LocationProtocol locationProtocol = Inner_3dMap_Enum_LocationProtocol.HTTP;
    public static String APIKEY = "";
    public long interval = 2000;
    public long httpTimeOut = C1752gu.f23921f;
    public boolean isNeedAddress = true;
    public boolean isWifiActiveScan = true;
    public boolean lastWifiActiveScan = true;
    public Inner_3dMap_Enum_LocationMode locationMode = Inner_3dMap_Enum_LocationMode.Hight_Accuracy;
    public boolean isOffset = true;
    public boolean isLocationCacheEnable = true;
    public boolean isWifiScan = true;

    /* loaded from: classes19.dex */
    public enum Inner_3dMap_Enum_LocationMode {
        Battery_Saving,
        Device_Sensors,
        Hight_Accuracy;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(9340);
        }

        public static Inner_3dMap_Enum_LocationMode valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (Inner_3dMap_Enum_LocationMode) (proxy.isSupported ? proxy.result : Enum.valueOf(Inner_3dMap_Enum_LocationMode.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Inner_3dMap_Enum_LocationMode[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (Inner_3dMap_Enum_LocationMode[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    /* loaded from: classes19.dex */
    public enum Inner_3dMap_Enum_LocationProtocol {
        HTTP(0),
        HTTPS(1);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public int value;

        static {
            Covode.recordClassIndex(9341);
        }

        Inner_3dMap_Enum_LocationProtocol(int i) {
            this.value = i;
        }

        public static Inner_3dMap_Enum_LocationProtocol valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (Inner_3dMap_Enum_LocationProtocol) (proxy.isSupported ? proxy.result : Enum.valueOf(Inner_3dMap_Enum_LocationProtocol.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Inner_3dMap_Enum_LocationProtocol[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (Inner_3dMap_Enum_LocationProtocol[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        public final int getValue() {
            return this.value;
        }
    }

    static {
        Covode.recordClassIndex(9339);
    }

    private Inner_3dMap_locationOption clone(Inner_3dMap_locationOption inner_3dMap_locationOption) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{inner_3dMap_locationOption}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Inner_3dMap_locationOption) proxy.result;
        }
        this.interval = inner_3dMap_locationOption.interval;
        this.isOnceLocation = inner_3dMap_locationOption.isOnceLocation;
        this.locationMode = inner_3dMap_locationOption.locationMode;
        this.isMockEnable = inner_3dMap_locationOption.isMockEnable;
        this.isKillProcess = inner_3dMap_locationOption.isKillProcess;
        this.isGpsFirst = inner_3dMap_locationOption.isGpsFirst;
        this.isNeedAddress = inner_3dMap_locationOption.isNeedAddress;
        this.isWifiActiveScan = inner_3dMap_locationOption.isWifiActiveScan;
        this.httpTimeOut = inner_3dMap_locationOption.httpTimeOut;
        this.isOffset = inner_3dMap_locationOption.isOffset;
        this.isLocationCacheEnable = inner_3dMap_locationOption.isLocationCacheEnable;
        this.isOnceLocationLatest = inner_3dMap_locationOption.isOnceLocationLatest;
        this.sensorEnable = inner_3dMap_locationOption.isSensorEnable();
        this.isWifiScan = inner_3dMap_locationOption.isWifiScan();
        return this;
    }

    public static String getAPIKEY() {
        return APIKEY;
    }

    public static void setLocationProtocol(Inner_3dMap_Enum_LocationProtocol inner_3dMap_Enum_LocationProtocol) {
        locationProtocol = inner_3dMap_Enum_LocationProtocol;
    }

    /* renamed from: clone */
    public Inner_3dMap_locationOption m25306clone() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Inner_3dMap_locationOption) proxy.result;
        }
        try {
            super.clone();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return new Inner_3dMap_locationOption().clone(this);
    }

    public long getHttpTimeOut() {
        return this.httpTimeOut;
    }

    public long getInterval() {
        return this.interval;
    }

    public Inner_3dMap_Enum_LocationMode getLocationMode() {
        return this.locationMode;
    }

    public Inner_3dMap_Enum_LocationProtocol getLocationProtocol() {
        return locationProtocol;
    }

    public boolean isGpsFirst() {
        return this.isGpsFirst;
    }

    public boolean isKillProcess() {
        return this.isKillProcess;
    }

    public boolean isLocationCacheEnable() {
        return this.isLocationCacheEnable;
    }

    public boolean isMockEnable() {
        return this.isMockEnable;
    }

    public boolean isNeedAddress() {
        return this.isNeedAddress;
    }

    public boolean isOffset() {
        return this.isOffset;
    }

    public boolean isOnceLocation() {
        if (this.isOnceLocationLatest) {
            return true;
        }
        return this.isOnceLocation;
    }

    public boolean isOnceLocationLatest() {
        return this.isOnceLocationLatest;
    }

    public boolean isSensorEnable() {
        return this.sensorEnable;
    }

    public boolean isWifiActiveScan() {
        return this.isWifiActiveScan;
    }

    public boolean isWifiScan() {
        return this.isWifiScan;
    }

    public Inner_3dMap_locationOption setGpsFirst(boolean z) {
        this.isGpsFirst = z;
        return this;
    }

    public void setHttpTimeOut(long j) {
        this.httpTimeOut = j;
    }

    public Inner_3dMap_locationOption setInterval(long j) {
        if (j <= 800) {
            j = 800;
        }
        this.interval = j;
        return this;
    }

    public Inner_3dMap_locationOption setKillProcess(boolean z) {
        this.isKillProcess = z;
        return this;
    }

    public void setLocationCacheEnable(boolean z) {
        this.isLocationCacheEnable = z;
    }

    public Inner_3dMap_locationOption setLocationMode(Inner_3dMap_Enum_LocationMode inner_3dMap_Enum_LocationMode) {
        this.locationMode = inner_3dMap_Enum_LocationMode;
        return this;
    }

    public void setMockEnable(boolean z) {
        this.isMockEnable = z;
    }

    public Inner_3dMap_locationOption setNeedAddress(boolean z) {
        this.isNeedAddress = z;
        return this;
    }

    public Inner_3dMap_locationOption setOffset(boolean z) {
        this.isOffset = z;
        return this;
    }

    public Inner_3dMap_locationOption setOnceLocation(boolean z) {
        this.isOnceLocation = z;
        return this;
    }

    public void setOnceLocationLatest(boolean z) {
        this.isOnceLocationLatest = z;
    }

    public void setSensorEnable(boolean z) {
        this.sensorEnable = z;
    }

    public void setWifiActiveScan(boolean z) {
        this.isWifiActiveScan = z;
        this.lastWifiActiveScan = z;
    }

    public void setWifiScan(boolean z) {
        this.isWifiScan = z;
        this.isWifiActiveScan = this.isWifiScan ? this.lastWifiActiveScan : false;
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        new StringBuilder();
        return C0002O.m25080C("interval:", String.valueOf(this.interval), "#", "isOnceLocation:", String.valueOf(this.isOnceLocation), "#", "locationMode:", String.valueOf(this.locationMode), "#", "isMockEnable:", String.valueOf(this.isMockEnable), "#", "isKillProcess:", String.valueOf(this.isKillProcess), "#", "isGpsFirst:", String.valueOf(this.isGpsFirst), "#", "isNeedAddress:", String.valueOf(this.isNeedAddress), "#", "isWifiActiveScan:", String.valueOf(this.isWifiActiveScan), "#", "httpTimeOut:", String.valueOf(this.httpTimeOut), "#", "isOffset:", String.valueOf(this.isOffset), "#", "isLocationCacheEnable:", String.valueOf(this.isLocationCacheEnable), "#", "isLocationCacheEnable:", String.valueOf(this.isLocationCacheEnable), "#", "isOnceLocationLatest:", String.valueOf(this.isOnceLocationLatest), "#", "sensorEnable:", String.valueOf(this.sensorEnable), "#");
    }
}
