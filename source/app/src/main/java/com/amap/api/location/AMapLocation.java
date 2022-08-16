package com.amap.api.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.loc.C15968ej;
import com.loc.C15975ep;
import com.xiaomi.mipush.sdk.MiPushMessage;
import org.json.JSONObject;

/* loaded from: classes19.dex */
public class AMapLocation extends Location implements Parcelable, Cloneable {
    public static final Parcelable.Creator<AMapLocation> CREATOR = new Parcelable.Creator<AMapLocation>() { // from class: com.amap.api.location.AMapLocation.1
        static {
            Covode.recordClassIndex(4987);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AMapLocation createFromParcel(Parcel parcel) {
            AMapLocation aMapLocation = new AMapLocation((Location) Location.CREATOR.createFromParcel(parcel));
            aMapLocation.f22567h = parcel.readString();
            aMapLocation.f22568i = parcel.readString();
            aMapLocation.f22582w = parcel.readString();
            aMapLocation.f22560a = parcel.readString();
            aMapLocation.f22564e = parcel.readString();
            aMapLocation.f22566g = parcel.readString();
            aMapLocation.f22570k = parcel.readString();
            aMapLocation.f22565f = parcel.readString();
            aMapLocation.f22575p = parcel.readInt();
            aMapLocation.f22576q = parcel.readString();
            aMapLocation.f22561b = parcel.readString();
            boolean z = true;
            aMapLocation.f22556A = parcel.readInt() != 0;
            aMapLocation.f22574o = parcel.readInt() != 0;
            aMapLocation.f22579t = parcel.readDouble();
            aMapLocation.f22577r = parcel.readString();
            aMapLocation.f22578s = parcel.readInt();
            aMapLocation.f22580u = parcel.readDouble();
            if (parcel.readInt() == 0) {
                z = false;
            }
            aMapLocation.f22584y = z;
            aMapLocation.f22573n = parcel.readString();
            aMapLocation.f22569j = parcel.readString();
            aMapLocation.f22563d = parcel.readString();
            aMapLocation.f22571l = parcel.readString();
            aMapLocation.f22581v = parcel.readInt();
            aMapLocation.f22583x = parcel.readInt();
            aMapLocation.f22572m = parcel.readString();
            aMapLocation.f22585z = parcel.readString();
            aMapLocation.f22557B = parcel.readString();
            aMapLocation.f22558C = parcel.readInt();
            aMapLocation.f22559D = parcel.readInt();
            return aMapLocation;
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AMapLocation[] newArray(int i) {
            return new AMapLocation[i];
        }
    };

    /* renamed from: A */
    public boolean f22556A;

    /* renamed from: D */
    public int f22559D;

    /* renamed from: p */
    public int f22575p;

    /* renamed from: s */
    public int f22578s;

    /* renamed from: t */
    public double f22579t;

    /* renamed from: u */
    public double f22580u;

    /* renamed from: v */
    public int f22581v;

    /* renamed from: y */
    public boolean f22584y;

    /* renamed from: d */
    public String f22563d = "";

    /* renamed from: e */
    public String f22564e = "";

    /* renamed from: f */
    public String f22565f = "";

    /* renamed from: g */
    public String f22566g = "";

    /* renamed from: h */
    public String f22567h = "";

    /* renamed from: i */
    public String f22568i = "";

    /* renamed from: j */
    public String f22569j = "";

    /* renamed from: k */
    public String f22570k = "";

    /* renamed from: l */
    public String f22571l = "";

    /* renamed from: m */
    public String f22572m = "";

    /* renamed from: n */
    public String f22573n = "";

    /* renamed from: o */
    public boolean f22574o = true;

    /* renamed from: q */
    public String f22576q = "success";

    /* renamed from: r */
    public String f22577r = "";

    /* renamed from: w */
    public String f22582w = "";

    /* renamed from: x */
    public int f22583x = -1;

    /* renamed from: z */
    public String f22585z = "";

    /* renamed from: a */
    public String f22560a = "";

    /* renamed from: b */
    public String f22561b = "";

    /* renamed from: c */
    public AMapLocationQualityReport f22562c = new AMapLocationQualityReport();

    /* renamed from: B */
    public String f22557B = "GCJ02";

    /* renamed from: C */
    public int f22558C = 1;

    static {
        Covode.recordClassIndex(4986);
    }

    public AMapLocation(Location location) {
        super(location);
        this.f22579t = location.getLatitude();
        this.f22580u = location.getLongitude();
    }

    public AMapLocation(String str) {
        super(str);
    }

    /* renamed from: clone */
    public AMapLocation m25271clone() {
        try {
            super.clone();
        } catch (Throwable unused) {
        }
        AMapLocation aMapLocation = new AMapLocation(this);
        try {
            aMapLocation.setLatitude(this.f22579t);
            aMapLocation.setLongitude(this.f22580u);
            aMapLocation.setAdCode(this.f22567h);
            aMapLocation.setAddress(this.f22568i);
            aMapLocation.setAoiName(this.f22582w);
            aMapLocation.setBuildingId(this.f22560a);
            aMapLocation.setCity(this.f22564e);
            aMapLocation.setCityCode(this.f22566g);
            aMapLocation.setCountry(this.f22570k);
            aMapLocation.setDistrict(this.f22565f);
            aMapLocation.setErrorCode(this.f22575p);
            aMapLocation.setErrorInfo(this.f22576q);
            aMapLocation.setFloor(this.f22561b);
            aMapLocation.setFixLastLocation(this.f22556A);
            aMapLocation.setOffset(this.f22574o);
            aMapLocation.setLocationDetail(this.f22577r);
            aMapLocation.setLocationType(this.f22578s);
            aMapLocation.setMock(this.f22584y);
            aMapLocation.setNumber(this.f22573n);
            aMapLocation.setPoiName(this.f22569j);
            aMapLocation.setProvince(this.f22563d);
            aMapLocation.setRoad(this.f22571l);
            aMapLocation.setSatellites(this.f22581v);
            aMapLocation.setGpsAccuracyStatus(this.f22583x);
            aMapLocation.setStreet(this.f22572m);
            aMapLocation.setDescription(this.f22585z);
            aMapLocation.setExtras(getExtras());
            if (this.f22562c != null) {
                aMapLocation.setLocationQualityReport(this.f22562c.m25273clone());
            }
            aMapLocation.setCoordType(this.f22557B);
            aMapLocation.setTrustedLevel(this.f22558C);
            aMapLocation.setConScenario(this.f22559D);
            return aMapLocation;
        } catch (Throwable th) {
            C15968ej.m10694a(th, "AMapLocation", "clone");
            return aMapLocation;
        }
    }

    @Override // android.location.Location, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.location.Location
    public float getAccuracy() {
        return super.getAccuracy();
    }

    public String getAdCode() {
        return this.f22567h;
    }

    public String getAddress() {
        return this.f22568i;
    }

    @Override // android.location.Location
    public double getAltitude() {
        return super.getAltitude();
    }

    public String getAoiName() {
        return this.f22582w;
    }

    @Override // android.location.Location
    public float getBearing() {
        return super.getBearing();
    }

    public String getBuildingId() {
        return this.f22560a;
    }

    public String getCity() {
        return this.f22564e;
    }

    public String getCityCode() {
        return this.f22566g;
    }

    public int getConScenario() {
        return this.f22559D;
    }

    public String getCoordType() {
        return this.f22557B;
    }

    public String getCountry() {
        return this.f22570k;
    }

    public String getDescription() {
        return this.f22585z;
    }

    public String getDistrict() {
        return this.f22565f;
    }

    public int getErrorCode() {
        return this.f22575p;
    }

    public String getErrorInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22576q);
        if (this.f22575p != 0) {
            sb.append(" 请到http://lbs.amap.com/api/android-location-sdk/guide/utilities/errorcode/查看错误码说明");
            sb.append(",错误详细信息:" + this.f22577r);
        }
        return sb.toString();
    }

    public String getFloor() {
        return this.f22561b;
    }

    public int getGpsAccuracyStatus() {
        return this.f22583x;
    }

    @Override // android.location.Location
    public double getLatitude() {
        return this.f22579t;
    }

    public String getLocationDetail() {
        return this.f22577r;
    }

    public AMapLocationQualityReport getLocationQualityReport() {
        return this.f22562c;
    }

    public int getLocationType() {
        return this.f22578s;
    }

    @Override // android.location.Location
    public double getLongitude() {
        return this.f22580u;
    }

    public String getPoiName() {
        return this.f22569j;
    }

    @Override // android.location.Location
    public String getProvider() {
        return super.getProvider();
    }

    public String getProvince() {
        return this.f22563d;
    }

    public String getRoad() {
        return this.f22571l;
    }

    public int getSatellites() {
        return this.f22581v;
    }

    @Override // android.location.Location
    public float getSpeed() {
        return super.getSpeed();
    }

    public String getStreet() {
        return this.f22572m;
    }

    public String getStreetNum() {
        return this.f22573n;
    }

    public int getTrustedLevel() {
        return this.f22558C;
    }

    public boolean isFixLastLocation() {
        return this.f22556A;
    }

    @Override // android.location.Location
    public boolean isMock() {
        return this.f22584y;
    }

    public boolean isOffset() {
        return this.f22574o;
    }

    public void setAdCode(String str) {
        this.f22567h = str;
    }

    public void setAddress(String str) {
        this.f22568i = str;
    }

    public void setAoiName(String str) {
        this.f22582w = str;
    }

    public void setBuildingId(String str) {
        this.f22560a = str;
    }

    public void setCity(String str) {
        this.f22564e = str;
    }

    public void setCityCode(String str) {
        this.f22566g = str;
    }

    public void setConScenario(int i) {
        this.f22559D = i;
    }

    public void setCoordType(String str) {
        this.f22557B = str;
    }

    public void setCountry(String str) {
        this.f22570k = str;
    }

    public void setDescription(String str) {
        this.f22585z = str;
    }

    public void setDistrict(String str) {
        this.f22565f = str;
    }

    public void setErrorCode(int i) {
        if (this.f22575p != 0) {
            return;
        }
        this.f22576q = C15975ep.m10616b(i);
        this.f22575p = i;
    }

    public void setErrorInfo(String str) {
        this.f22576q = str;
    }

    public void setFixLastLocation(boolean z) {
        this.f22556A = z;
    }

    public void setFloor(String str) {
        if (!TextUtils.isEmpty(str)) {
            str = str.replace("F", "");
            try {
                Integer.parseInt(str);
            } catch (Throwable th) {
                str = null;
                C15968ej.m10694a(th, "AmapLoc", "setFloor");
            }
        }
        this.f22561b = str;
    }

    public void setGpsAccuracyStatus(int i) {
        this.f22583x = i;
    }

    @Override // android.location.Location
    public void setLatitude(double d) {
        this.f22579t = d;
    }

    public void setLocationDetail(String str) {
        this.f22577r = str;
    }

    public void setLocationQualityReport(AMapLocationQualityReport aMapLocationQualityReport) {
        if (aMapLocationQualityReport == null) {
            return;
        }
        this.f22562c = aMapLocationQualityReport;
    }

    public void setLocationType(int i) {
        this.f22578s = i;
    }

    @Override // android.location.Location
    public void setLongitude(double d) {
        this.f22580u = d;
    }

    @Override // android.location.Location
    public void setMock(boolean z) {
        this.f22584y = z;
    }

    public void setNumber(String str) {
        this.f22573n = str;
    }

    public void setOffset(boolean z) {
        this.f22574o = z;
    }

    public void setPoiName(String str) {
        this.f22569j = str;
    }

    public void setProvince(String str) {
        this.f22563d = str;
    }

    public void setRoad(String str) {
        this.f22571l = str;
    }

    public void setSatellites(int i) {
        this.f22581v = i;
    }

    public void setStreet(String str) {
        this.f22572m = str;
    }

    public void setTrustedLevel(int i) {
        this.f22558C = i;
    }

    public JSONObject toJson(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (i == 1) {
                try {
                    jSONObject.put("altitude", getAltitude());
                    jSONObject.put("speed", getSpeed());
                    jSONObject.put("bearing", getBearing());
                } catch (Throwable unused) {
                }
                jSONObject.put("citycode", this.f22566g);
                jSONObject.put("adcode", this.f22567h);
                jSONObject.put("country", this.f22570k);
                jSONObject.put("province", this.f22563d);
                jSONObject.put("city", this.f22564e);
                jSONObject.put("district", this.f22565f);
                jSONObject.put("road", this.f22571l);
                jSONObject.put("street", this.f22572m);
                jSONObject.put("number", this.f22573n);
                jSONObject.put("poiname", this.f22569j);
                jSONObject.put("errorCode", this.f22575p);
                jSONObject.put("errorInfo", this.f22576q);
                jSONObject.put("locationType", this.f22578s);
                jSONObject.put("locationDetail", this.f22577r);
                jSONObject.put("aoiname", this.f22582w);
                jSONObject.put("address", this.f22568i);
                jSONObject.put("poiid", this.f22560a);
                jSONObject.put("floor", this.f22561b);
                jSONObject.put(MiPushMessage.KEY_DESC, this.f22585z);
            } else if (i != 2) {
                if (i != 3) {
                    return jSONObject;
                }
                jSONObject.put("provider", getProvider());
                jSONObject.put("lon", getLongitude());
                jSONObject.put("lat", getLatitude());
                jSONObject.put("accuracy", getAccuracy());
                jSONObject.put("isOffset", this.f22574o);
                jSONObject.put("isFixLastLocation", this.f22556A);
                jSONObject.put("coordType", this.f22557B);
                return jSONObject;
            }
            jSONObject.put("time", getTime());
            jSONObject.put("provider", getProvider());
            jSONObject.put("lon", getLongitude());
            jSONObject.put("lat", getLatitude());
            jSONObject.put("accuracy", getAccuracy());
            jSONObject.put("isOffset", this.f22574o);
            jSONObject.put("isFixLastLocation", this.f22556A);
            jSONObject.put("coordType", this.f22557B);
            return jSONObject;
        } catch (Throwable th) {
            C15968ej.m10694a(th, "AmapLoc", "toStr");
            return null;
        }
    }

    public String toStr() {
        return toStr(1);
    }

    public String toStr(int i) {
        JSONObject jSONObject;
        try {
            jSONObject = toJson(i);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "AMapLocation", "toStr part2");
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    @Override // android.location.Location
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append("latitude=" + this.f22579t + "#");
            stringBuffer.append("longitude=" + this.f22580u + "#");
            stringBuffer.append("province=" + this.f22563d + "#");
            stringBuffer.append("coordType=" + this.f22557B + "#");
            stringBuffer.append("city=" + this.f22564e + "#");
            stringBuffer.append("district=" + this.f22565f + "#");
            stringBuffer.append("cityCode=" + this.f22566g + "#");
            stringBuffer.append("adCode=" + this.f22567h + "#");
            stringBuffer.append("address=" + this.f22568i + "#");
            stringBuffer.append("country=" + this.f22570k + "#");
            stringBuffer.append("road=" + this.f22571l + "#");
            stringBuffer.append("poiName=" + this.f22569j + "#");
            stringBuffer.append("street=" + this.f22572m + "#");
            stringBuffer.append("streetNum=" + this.f22573n + "#");
            stringBuffer.append("aoiName=" + this.f22582w + "#");
            stringBuffer.append("poiid=" + this.f22560a + "#");
            stringBuffer.append("floor=" + this.f22561b + "#");
            stringBuffer.append("errorCode=" + this.f22575p + "#");
            stringBuffer.append("errorInfo=" + this.f22576q + "#");
            stringBuffer.append("locationDetail=" + this.f22577r + "#");
            stringBuffer.append("description=" + this.f22585z + "#");
            stringBuffer.append("locationType=" + this.f22578s + "#");
            StringBuilder sb = new StringBuilder("conScenario=");
            sb.append(this.f22559D);
            stringBuffer.append(sb.toString());
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    @Override // android.location.Location, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f22567h);
            parcel.writeString(this.f22568i);
            parcel.writeString(this.f22582w);
            parcel.writeString(this.f22560a);
            parcel.writeString(this.f22564e);
            parcel.writeString(this.f22566g);
            parcel.writeString(this.f22570k);
            parcel.writeString(this.f22565f);
            parcel.writeInt(this.f22575p);
            parcel.writeString(this.f22576q);
            parcel.writeString(this.f22561b);
            int i2 = 1;
            parcel.writeInt(this.f22556A ? 1 : 0);
            parcel.writeInt(this.f22574o ? 1 : 0);
            parcel.writeDouble(this.f22579t);
            parcel.writeString(this.f22577r);
            parcel.writeInt(this.f22578s);
            parcel.writeDouble(this.f22580u);
            if (!this.f22584y) {
                i2 = 0;
            }
            parcel.writeInt(i2);
            parcel.writeString(this.f22573n);
            parcel.writeString(this.f22569j);
            parcel.writeString(this.f22563d);
            parcel.writeString(this.f22571l);
            parcel.writeInt(this.f22581v);
            parcel.writeInt(this.f22583x);
            parcel.writeString(this.f22572m);
            parcel.writeString(this.f22585z);
            parcel.writeString(this.f22557B);
            parcel.writeInt(this.f22558C);
            parcel.writeInt(this.f22559D);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "AMapLocation", "writeToParcel");
        }
    }
}
