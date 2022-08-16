package com.amap.api.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.loc.C15968ej;
import com.p1594ss.android.ugc.aweme.lego.experiment.LegoCommitOptExperiment;
import p002O.C0002O;

/* loaded from: classes19.dex */
public class AMapLocationClientOption implements Parcelable, Cloneable {

    /* renamed from: d */
    public static int f22589d;

    /* renamed from: A */
    public float f22594A;

    /* renamed from: B */
    public AMapLocationPurpose f22595B;

    /* renamed from: b */
    public boolean f22596b;

    /* renamed from: c */
    public String f22597c;

    /* renamed from: h */
    public long f22598h;

    /* renamed from: i */
    public long f22599i;

    /* renamed from: j */
    public boolean f22600j;

    /* renamed from: k */
    public boolean f22601k;

    /* renamed from: l */
    public boolean f22602l;

    /* renamed from: m */
    public boolean f22603m;

    /* renamed from: n */
    public boolean f22604n;

    /* renamed from: o */
    public AMapLocationMode f22605o;

    /* renamed from: q */
    public boolean f22606q;

    /* renamed from: r */
    public boolean f22607r;

    /* renamed from: s */
    public boolean f22608s;

    /* renamed from: t */
    public boolean f22609t;

    /* renamed from: u */
    public boolean f22610u;

    /* renamed from: v */
    public boolean f22611v;

    /* renamed from: w */
    public boolean f22612w;

    /* renamed from: x */
    public long f22613x;

    /* renamed from: y */
    public long f22614y;

    /* renamed from: z */
    public GeoLanguage f22615z;

    /* renamed from: e */
    public static int f22590e = 1;

    /* renamed from: f */
    public static int f22591f = 2;

    /* renamed from: g */
    public static int f22592g = 4;

    /* renamed from: p */
    public static AMapLocationProtocol f22593p = AMapLocationProtocol.HTTP;

    /* renamed from: a */
    public static String f22588a = "";
    public static final Parcelable.Creator<AMapLocationClientOption> CREATOR = new Parcelable.Creator<AMapLocationClientOption>() { // from class: com.amap.api.location.AMapLocationClientOption.1
        static {
            Covode.recordClassIndex(4990);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AMapLocationClientOption createFromParcel(Parcel parcel) {
            return new AMapLocationClientOption(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AMapLocationClientOption[] newArray(int i) {
            return new AMapLocationClientOption[i];
        }
    };
    public static boolean OPEN_ALWAYS_SCAN_WIFI = true;
    public static long SCAN_WIFI_INTERVAL = 30000;

    /* renamed from: com.amap.api.location.AMapLocationClientOption$2 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C14552 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22616a = new int[AMapLocationPurpose.values().length];

        static {
            Covode.recordClassIndex(4991);
            try {
                f22616a[AMapLocationPurpose.SignIn.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22616a[AMapLocationPurpose.Transport.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22616a[AMapLocationPurpose.Sport.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes19.dex */
    public enum AMapLocationMode {
        Battery_Saving,
        Device_Sensors,
        Hight_Accuracy;

        static {
            Covode.recordClassIndex(4992);
        }
    }

    /* loaded from: classes19.dex */
    public enum AMapLocationProtocol {
        HTTP(0),
        HTTPS(1);
        

        /* renamed from: a */
        public int f22619a;

        static {
            Covode.recordClassIndex(4993);
        }

        AMapLocationProtocol(int i) {
            this.f22619a = i;
        }

        public final int getValue() {
            return this.f22619a;
        }
    }

    /* loaded from: classes19.dex */
    public enum AMapLocationPurpose {
        SignIn,
        Transport,
        Sport;

        static {
            Covode.recordClassIndex(4994);
        }
    }

    /* loaded from: classes19.dex */
    public enum GeoLanguage {
        DEFAULT,
        ZH,
        EN;

        static {
            Covode.recordClassIndex(4995);
        }
    }

    static {
        Covode.recordClassIndex(4989);
    }

    public AMapLocationClientOption() {
        this.f22598h = 2000L;
        this.f22599i = C15968ej.f33111g;
        this.f22601k = true;
        this.f22602l = true;
        this.f22603m = true;
        this.f22604n = true;
        this.f22605o = AMapLocationMode.Hight_Accuracy;
        this.f22608s = true;
        this.f22609t = true;
        this.f22612w = true;
        this.f22613x = 30000L;
        this.f22614y = 30000L;
        this.f22615z = GeoLanguage.DEFAULT;
    }

    public AMapLocationClientOption(Parcel parcel) {
        this.f22598h = 2000L;
        this.f22599i = C15968ej.f33111g;
        boolean z = true;
        this.f22601k = true;
        this.f22602l = true;
        this.f22603m = true;
        this.f22604n = true;
        this.f22605o = AMapLocationMode.Hight_Accuracy;
        this.f22608s = true;
        this.f22609t = true;
        this.f22612w = true;
        this.f22613x = 30000L;
        this.f22614y = 30000L;
        this.f22615z = GeoLanguage.DEFAULT;
        this.f22598h = parcel.readLong();
        this.f22599i = parcel.readLong();
        this.f22600j = parcel.readByte() != 0;
        this.f22601k = parcel.readByte() != 0;
        this.f22602l = parcel.readByte() != 0;
        this.f22603m = parcel.readByte() != 0;
        this.f22604n = parcel.readByte() != 0;
        int readInt = parcel.readInt();
        this.f22605o = readInt == -1 ? AMapLocationMode.Hight_Accuracy : AMapLocationMode.values()[readInt];
        this.f22606q = parcel.readByte() != 0;
        this.f22607r = parcel.readByte() != 0;
        this.f22608s = parcel.readByte() != 0;
        this.f22609t = parcel.readByte() != 0;
        this.f22610u = parcel.readByte() != 0;
        this.f22611v = parcel.readByte() != 0;
        this.f22612w = parcel.readByte() != 0;
        this.f22613x = parcel.readLong();
        int readInt2 = parcel.readInt();
        f22593p = readInt2 == -1 ? AMapLocationProtocol.HTTP : AMapLocationProtocol.values()[readInt2];
        int readInt3 = parcel.readInt();
        this.f22615z = readInt3 == -1 ? GeoLanguage.DEFAULT : GeoLanguage.values()[readInt3];
        this.f22594A = parcel.readFloat();
        int readInt4 = parcel.readInt();
        this.f22595B = readInt4 == -1 ? null : AMapLocationPurpose.values()[readInt4];
        OPEN_ALWAYS_SCAN_WIFI = parcel.readByte() == 0 ? false : z;
        this.f22614y = parcel.readLong();
    }

    public static String getAPIKEY() {
        return f22588a;
    }

    public static boolean isDownloadCoordinateConvertLibrary() {
        return false;
    }

    public static boolean isOpenAlwaysScanWifi() {
        return OPEN_ALWAYS_SCAN_WIFI;
    }

    public static void setDownloadCoordinateConvertLibrary(boolean z) {
    }

    public static void setLocationProtocol(AMapLocationProtocol aMapLocationProtocol) {
        f22593p = aMapLocationProtocol;
    }

    public static void setOpenAlwaysScanWifi(boolean z) {
        OPEN_ALWAYS_SCAN_WIFI = z;
    }

    public static void setScanWifiInterval(long j) {
        SCAN_WIFI_INTERVAL = j;
    }

    /* renamed from: clone */
    public AMapLocationClientOption m25272clone() {
        try {
            super.clone();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
        aMapLocationClientOption.f22598h = this.f22598h;
        aMapLocationClientOption.f22600j = this.f22600j;
        aMapLocationClientOption.f22605o = this.f22605o;
        aMapLocationClientOption.f22601k = this.f22601k;
        aMapLocationClientOption.f22606q = this.f22606q;
        aMapLocationClientOption.f22607r = this.f22607r;
        aMapLocationClientOption.f22602l = this.f22602l;
        aMapLocationClientOption.f22603m = this.f22603m;
        aMapLocationClientOption.f22599i = this.f22599i;
        aMapLocationClientOption.f22608s = this.f22608s;
        aMapLocationClientOption.f22609t = this.f22609t;
        aMapLocationClientOption.f22610u = this.f22610u;
        aMapLocationClientOption.f22611v = isSensorEnable();
        aMapLocationClientOption.f22612w = isWifiScan();
        aMapLocationClientOption.f22613x = this.f22613x;
        setLocationProtocol(getLocationProtocol());
        aMapLocationClientOption.f22615z = this.f22615z;
        setDownloadCoordinateConvertLibrary(isDownloadCoordinateConvertLibrary());
        aMapLocationClientOption.f22594A = this.f22594A;
        aMapLocationClientOption.f22595B = this.f22595B;
        setOpenAlwaysScanWifi(isOpenAlwaysScanWifi());
        setScanWifiInterval(getScanWifiInterval());
        aMapLocationClientOption.f22614y = this.f22614y;
        return aMapLocationClientOption;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getDeviceModeDistanceFilter() {
        return this.f22594A;
    }

    public GeoLanguage getGeoLanguage() {
        return this.f22615z;
    }

    public long getGpsFirstTimeout() {
        return this.f22614y;
    }

    public long getHttpTimeOut() {
        return this.f22599i;
    }

    public long getInterval() {
        return this.f22598h;
    }

    public long getLastLocationLifeCycle() {
        return this.f22613x;
    }

    public AMapLocationMode getLocationMode() {
        return this.f22605o;
    }

    public AMapLocationProtocol getLocationProtocol() {
        return f22593p;
    }

    public AMapLocationPurpose getLocationPurpose() {
        return this.f22595B;
    }

    public long getScanWifiInterval() {
        return SCAN_WIFI_INTERVAL;
    }

    public boolean isGpsFirst() {
        return this.f22607r;
    }

    public boolean isKillProcess() {
        return this.f22606q;
    }

    public boolean isLocationCacheEnable() {
        return this.f22609t;
    }

    public boolean isMockEnable() {
        return this.f22601k;
    }

    public boolean isNeedAddress() {
        return this.f22602l;
    }

    public boolean isOffset() {
        return this.f22608s;
    }

    public boolean isOnceLocation() {
        return this.f22600j;
    }

    public boolean isOnceLocationLatest() {
        return this.f22610u;
    }

    public boolean isSensorEnable() {
        return this.f22611v;
    }

    public boolean isWifiActiveScan() {
        return this.f22603m;
    }

    public boolean isWifiScan() {
        return this.f22612w;
    }

    public AMapLocationClientOption setDeviceModeDistanceFilter(float f) {
        this.f22594A = f;
        return this;
    }

    public AMapLocationClientOption setGeoLanguage(GeoLanguage geoLanguage) {
        this.f22615z = geoLanguage;
        return this;
    }

    public AMapLocationClientOption setGpsFirst(boolean z) {
        this.f22607r = z;
        return this;
    }

    public AMapLocationClientOption setGpsFirstTimeout(long j) {
        if (j < LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME) {
            j = LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME;
        } else if (j > 30000) {
            j = 30000;
        }
        this.f22614y = j;
        return this;
    }

    public AMapLocationClientOption setHttpTimeOut(long j) {
        this.f22599i = j;
        return this;
    }

    public AMapLocationClientOption setInterval(long j) {
        if (j <= 800) {
            j = 800;
        }
        this.f22598h = j;
        return this;
    }

    public AMapLocationClientOption setKillProcess(boolean z) {
        this.f22606q = z;
        return this;
    }

    public AMapLocationClientOption setLastLocationLifeCycle(long j) {
        this.f22613x = j;
        return this;
    }

    public AMapLocationClientOption setLocationCacheEnable(boolean z) {
        this.f22609t = z;
        return this;
    }

    public AMapLocationClientOption setLocationMode(AMapLocationMode aMapLocationMode) {
        this.f22605o = aMapLocationMode;
        return this;
    }

    public AMapLocationClientOption setLocationPurpose(AMapLocationPurpose aMapLocationPurpose) {
        String str;
        this.f22595B = aMapLocationPurpose;
        if (aMapLocationPurpose != null) {
            int i = C14552.f22616a[aMapLocationPurpose.ordinal()];
            if (i == 1) {
                this.f22605o = AMapLocationMode.Hight_Accuracy;
                this.f22600j = true;
                this.f22610u = true;
                this.f22607r = false;
                this.f22601k = false;
                this.f22612w = true;
                int i2 = f22589d;
                int i3 = f22590e;
                if ((i2 & i3) == 0) {
                    this.f22596b = true;
                    f22589d = i2 | i3;
                    this.f22597c = "signin";
                    return this;
                }
            } else if (i == 2) {
                int i4 = f22589d;
                int i5 = f22591f;
                if ((i4 & i5) == 0) {
                    this.f22596b = true;
                    f22589d = i4 | i5;
                    str = "transport";
                    this.f22597c = str;
                }
                this.f22605o = AMapLocationMode.Hight_Accuracy;
                this.f22600j = false;
                this.f22610u = false;
                this.f22607r = true;
                this.f22601k = false;
                this.f22612w = true;
            } else if (i == 3) {
                int i6 = f22589d;
                int i7 = f22592g;
                if ((i6 & i7) == 0) {
                    this.f22596b = true;
                    f22589d = i6 | i7;
                    str = "sport";
                    this.f22597c = str;
                }
                this.f22605o = AMapLocationMode.Hight_Accuracy;
                this.f22600j = false;
                this.f22610u = false;
                this.f22607r = true;
                this.f22601k = false;
                this.f22612w = true;
            }
        }
        return this;
    }

    public AMapLocationClientOption setMockEnable(boolean z) {
        this.f22601k = z;
        return this;
    }

    public AMapLocationClientOption setNeedAddress(boolean z) {
        this.f22602l = z;
        return this;
    }

    public AMapLocationClientOption setOffset(boolean z) {
        this.f22608s = z;
        return this;
    }

    public AMapLocationClientOption setOnceLocation(boolean z) {
        this.f22600j = z;
        return this;
    }

    public AMapLocationClientOption setOnceLocationLatest(boolean z) {
        this.f22610u = z;
        return this;
    }

    public AMapLocationClientOption setSensorEnable(boolean z) {
        this.f22611v = z;
        return this;
    }

    public AMapLocationClientOption setWifiActiveScan(boolean z) {
        this.f22603m = z;
        this.f22604n = z;
        return this;
    }

    public AMapLocationClientOption setWifiScan(boolean z) {
        this.f22612w = z;
        this.f22603m = this.f22612w ? this.f22604n : false;
        return this;
    }

    public String toString() {
        new StringBuilder();
        return C0002O.m25080C("interval:", String.valueOf(this.f22598h), "#", "isOnceLocation:", String.valueOf(this.f22600j), "#", "locationMode:", String.valueOf(this.f22605o), "#", "locationProtocol:", String.valueOf(f22593p), "#", "isMockEnable:", String.valueOf(this.f22601k), "#", "isKillProcess:", String.valueOf(this.f22606q), "#", "isGpsFirst:", String.valueOf(this.f22607r), "#", "isNeedAddress:", String.valueOf(this.f22602l), "#", "isWifiActiveScan:", String.valueOf(this.f22603m), "#", "wifiScan:", String.valueOf(this.f22612w), "#", "httpTimeOut:", String.valueOf(this.f22599i), "#", "isLocationCacheEnable:", String.valueOf(this.f22609t), "#", "isOnceLocationLatest:", String.valueOf(this.f22610u), "#", "sensorEnable:", String.valueOf(this.f22611v), "#", "geoLanguage:", String.valueOf(this.f22615z), "#", "locationPurpose:", String.valueOf(this.f22595B), "#");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f22598h);
        parcel.writeLong(this.f22599i);
        parcel.writeByte(this.f22600j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f22601k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f22602l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f22603m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f22604n ? (byte) 1 : (byte) 0);
        AMapLocationMode aMapLocationMode = this.f22605o;
        int i2 = -1;
        parcel.writeInt(aMapLocationMode == null ? -1 : aMapLocationMode.ordinal());
        parcel.writeByte(this.f22606q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f22607r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f22608s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f22609t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f22610u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f22611v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f22612w ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f22613x);
        parcel.writeInt(f22593p == null ? -1 : getLocationProtocol().ordinal());
        GeoLanguage geoLanguage = this.f22615z;
        parcel.writeInt(geoLanguage == null ? -1 : geoLanguage.ordinal());
        parcel.writeFloat(this.f22594A);
        AMapLocationPurpose aMapLocationPurpose = this.f22595B;
        if (aMapLocationPurpose != null) {
            i2 = aMapLocationPurpose.ordinal();
        }
        parcel.writeInt(i2);
        parcel.writeInt(OPEN_ALWAYS_SCAN_WIFI ? 1 : 0);
        parcel.writeLong(this.f22614y);
    }
}
