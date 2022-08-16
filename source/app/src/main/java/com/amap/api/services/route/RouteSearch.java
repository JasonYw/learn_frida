package com.amap.api.services.route;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.IRouteSearch;
import com.amap.api.services.p126a.C1844ba;
import com.amap.api.services.p126a.C1863be;
import com.amap.api.services.p126a.C1930cr;
import com.amap.api.services.p126a.C2006i;
import com.amap.api.services.p126a.C2007j;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class RouteSearch {

    /* renamed from: a */
    public IRouteSearch f25263a;

    /* loaded from: classes19.dex */
    public interface OnRoutePlanSearchListener {
        static {
            Covode.recordClassIndex(5818);
        }

        void onDriveRoutePlanSearched(DriveRoutePlanResult driveRoutePlanResult, int i);
    }

    /* loaded from: classes19.dex */
    public interface OnRouteSearchListener {
        static {
            Covode.recordClassIndex(5819);
        }

        void onBusRouteSearched(BusRouteResult busRouteResult, int i);

        void onDriveRouteSearched(DriveRouteResult driveRouteResult, int i);

        void onRideRouteSearched(RideRouteResult rideRouteResult, int i);

        void onWalkRouteSearched(WalkRouteResult walkRouteResult, int i);
    }

    /* loaded from: classes19.dex */
    public interface OnTruckRouteSearchListener {
        static {
            Covode.recordClassIndex(5820);
        }

        void onTruckRouteSearched(TruckRouteRestult truckRouteRestult, int i);
    }

    static {
        Covode.recordClassIndex(5809);
    }

    /* loaded from: classes19.dex */
    public static class BusRouteQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<BusRouteQuery> CREATOR = new Parcelable.Creator<BusRouteQuery>() { // from class: com.amap.api.services.route.RouteSearch.BusRouteQuery.1
            static {
                Covode.recordClassIndex(5811);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final BusRouteQuery[] newArray(int i) {
                return new BusRouteQuery[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final BusRouteQuery createFromParcel(Parcel parcel) {
                return new BusRouteQuery(parcel);
            }
        };

        /* renamed from: a */
        public FromAndTo f25264a;

        /* renamed from: b */
        public int f25265b;

        /* renamed from: c */
        public String f25266c;

        /* renamed from: d */
        public String f25267d;

        /* renamed from: e */
        public int f25268e;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public BusRouteQuery() {
        }

        public String getCity() {
            return this.f25266c;
        }

        public String getCityd() {
            return this.f25267d;
        }

        public FromAndTo getFromAndTo() {
            return this.f25264a;
        }

        public int getMode() {
            return this.f25265b;
        }

        public int getNightFlag() {
            return this.f25268e;
        }

        static {
            Covode.recordClassIndex(5810);
        }

        /* renamed from: clone */
        public BusRouteQuery m25290clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                C2007j.m16371a(e, "RouteSearch", "BusRouteQueryclone");
            }
            BusRouteQuery busRouteQuery = new BusRouteQuery(this.f25264a, this.f25265b, this.f25266c, this.f25268e);
            busRouteQuery.setCityd(this.f25267d);
            return busRouteQuery;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            String str = this.f25266c;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode + 31) * 31;
            FromAndTo fromAndTo = this.f25264a;
            if (fromAndTo == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = fromAndTo.hashCode();
            }
            int i3 = (((((i2 + hashCode2) * 31) + this.f25265b) * 31) + this.f25268e) * 31;
            String str2 = this.f25267d;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return i3 + i;
        }

        public void setCityd(String str) {
            this.f25267d = str;
        }

        public BusRouteQuery(Parcel parcel) {
            this.f25264a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            this.f25265b = parcel.readInt();
            this.f25266c = parcel.readString();
            this.f25268e = parcel.readInt();
            this.f25267d = parcel.readString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BusRouteQuery busRouteQuery = (BusRouteQuery) obj;
            String str = this.f25266c;
            if (str == null) {
                if (busRouteQuery.f25266c != null) {
                    return false;
                }
            } else if (!str.equals(busRouteQuery.f25266c)) {
                return false;
            }
            String str2 = this.f25267d;
            if (str2 == null) {
                if (busRouteQuery.f25267d != null) {
                    return false;
                }
            } else if (!str2.equals(busRouteQuery.f25267d)) {
                return false;
            }
            FromAndTo fromAndTo = this.f25264a;
            if (fromAndTo == null) {
                if (busRouteQuery.f25264a != null) {
                    return false;
                }
            } else if (!fromAndTo.equals(busRouteQuery.f25264a)) {
                return false;
            }
            if (this.f25265b == busRouteQuery.f25265b && this.f25268e == busRouteQuery.f25268e) {
                return true;
            }
            return false;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f25264a, i);
            parcel.writeInt(this.f25265b);
            parcel.writeString(this.f25266c);
            parcel.writeInt(this.f25268e);
            parcel.writeString(this.f25267d);
        }

        public BusRouteQuery(FromAndTo fromAndTo, int i, String str, int i2) {
            this.f25264a = fromAndTo;
            this.f25265b = i;
            this.f25266c = str;
            this.f25268e = i2;
        }
    }

    /* loaded from: classes19.dex */
    public static class DrivePlanQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<DrivePlanQuery> CREATOR = new Parcelable.Creator<DrivePlanQuery>() { // from class: com.amap.api.services.route.RouteSearch.DrivePlanQuery.1
            static {
                Covode.recordClassIndex(5813);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final DrivePlanQuery[] newArray(int i) {
                return new DrivePlanQuery[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final DrivePlanQuery createFromParcel(Parcel parcel) {
                return new DrivePlanQuery(parcel);
            }
        };

        /* renamed from: a */
        public FromAndTo f25269a;

        /* renamed from: b */
        public String f25270b;

        /* renamed from: c */
        public int f25271c;

        /* renamed from: d */
        public int f25272d;

        /* renamed from: e */
        public int f25273e;

        /* renamed from: f */
        public int f25274f;

        /* renamed from: g */
        public int f25275g;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getCarType() {
            return this.f25272d;
        }

        public int getCount() {
            return this.f25275g;
        }

        public String getDestParentPoiID() {
            return this.f25270b;
        }

        public int getFirstTime() {
            return this.f25273e;
        }

        public FromAndTo getFromAndTo() {
            return this.f25269a;
        }

        public int getInterval() {
            return this.f25274f;
        }

        public int getMode() {
            return this.f25271c;
        }

        static {
            Covode.recordClassIndex(5812);
        }

        public DrivePlanQuery() {
            this.f25271c = 1;
            this.f25275g = 48;
        }

        /* renamed from: clone */
        public DrivePlanQuery m25291clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                C2007j.m16371a(e, "RouteSearch", "DriveRouteQueryclone");
            }
            DrivePlanQuery drivePlanQuery = new DrivePlanQuery(this.f25269a, this.f25273e, this.f25274f, this.f25275g);
            drivePlanQuery.setDestParentPoiID(this.f25270b);
            drivePlanQuery.setMode(this.f25271c);
            drivePlanQuery.setCarType(this.f25272d);
            return drivePlanQuery;
        }

        public int hashCode() {
            int hashCode;
            FromAndTo fromAndTo = this.f25269a;
            int i = 0;
            if (fromAndTo == null) {
                hashCode = 0;
            } else {
                hashCode = fromAndTo.hashCode();
            }
            int i2 = (hashCode + 31) * 31;
            String str = this.f25270b;
            if (str != null) {
                i = str.hashCode();
            }
            return ((((((((((i2 + i) * 31) + this.f25271c) * 31) + this.f25272d) * 31) + this.f25273e) * 31) + this.f25274f) * 31) + this.f25275g;
        }

        public void setCarType(int i) {
            this.f25272d = i;
        }

        public void setDestParentPoiID(String str) {
            this.f25270b = str;
        }

        public void setMode(int i) {
            this.f25271c = i;
        }

        public DrivePlanQuery(Parcel parcel) {
            this.f25271c = 1;
            this.f25275g = 48;
            this.f25269a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            this.f25270b = parcel.readString();
            this.f25271c = parcel.readInt();
            this.f25272d = parcel.readInt();
            this.f25273e = parcel.readInt();
            this.f25274f = parcel.readInt();
            this.f25275g = parcel.readInt();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DrivePlanQuery drivePlanQuery = (DrivePlanQuery) obj;
            FromAndTo fromAndTo = this.f25269a;
            if (fromAndTo == null) {
                if (drivePlanQuery.f25269a != null) {
                    return false;
                }
            } else if (!fromAndTo.equals(drivePlanQuery.f25269a)) {
                return false;
            }
            String str = this.f25270b;
            if (str == null) {
                if (drivePlanQuery.f25270b != null) {
                    return false;
                }
            } else if (!str.equals(drivePlanQuery.f25270b)) {
                return false;
            }
            if (this.f25271c == drivePlanQuery.f25271c && this.f25272d == drivePlanQuery.f25272d && this.f25273e == drivePlanQuery.f25273e && this.f25274f == drivePlanQuery.f25274f && this.f25275g == drivePlanQuery.f25275g) {
                return true;
            }
            return false;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f25269a, i);
            parcel.writeString(this.f25270b);
            parcel.writeInt(this.f25271c);
            parcel.writeInt(this.f25272d);
            parcel.writeInt(this.f25273e);
            parcel.writeInt(this.f25274f);
            parcel.writeInt(this.f25275g);
        }

        public DrivePlanQuery(FromAndTo fromAndTo, int i, int i2, int i3) {
            this.f25271c = 1;
            this.f25275g = 48;
            this.f25269a = fromAndTo;
            this.f25273e = i;
            this.f25274f = i2;
            this.f25275g = i3;
        }
    }

    /* loaded from: classes19.dex */
    public static class DriveRouteQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<DriveRouteQuery> CREATOR = new Parcelable.Creator<DriveRouteQuery>() { // from class: com.amap.api.services.route.RouteSearch.DriveRouteQuery.1
            static {
                Covode.recordClassIndex(5815);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final DriveRouteQuery[] newArray(int i) {
                return new DriveRouteQuery[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final DriveRouteQuery createFromParcel(Parcel parcel) {
                return new DriveRouteQuery(parcel);
            }
        };

        /* renamed from: a */
        public FromAndTo f25276a;

        /* renamed from: b */
        public int f25277b;

        /* renamed from: c */
        public List<LatLonPoint> f25278c;

        /* renamed from: d */
        public List<List<LatLonPoint>> f25279d;

        /* renamed from: e */
        public String f25280e;

        /* renamed from: f */
        public boolean f25281f;

        /* renamed from: g */
        public int f25282g;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getAvoidRoad() {
            return this.f25280e;
        }

        public List<List<LatLonPoint>> getAvoidpolygons() {
            return this.f25279d;
        }

        public int getCarType() {
            return this.f25282g;
        }

        public FromAndTo getFromAndTo() {
            return this.f25276a;
        }

        public int getMode() {
            return this.f25277b;
        }

        public List<LatLonPoint> getPassedByPoints() {
            return this.f25278c;
        }

        public boolean isUseFerry() {
            return this.f25281f;
        }

        public DriveRouteQuery() {
            this.f25281f = true;
        }

        static {
            Covode.recordClassIndex(5814);
        }

        public boolean hasAvoidRoad() {
            if (C2007j.m16372a(getAvoidRoad())) {
                return false;
            }
            return true;
        }

        public boolean hasAvoidpolygons() {
            if (C2007j.m16372a(getAvoidpolygonsStr())) {
                return false;
            }
            return true;
        }

        public boolean hasPassPoint() {
            if (C2007j.m16372a(getPassedPointStr())) {
                return false;
            }
            return true;
        }

        /* renamed from: clone */
        public DriveRouteQuery m25292clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                C2007j.m16371a(e, "RouteSearch", "DriveRouteQueryclone");
            }
            DriveRouteQuery driveRouteQuery = new DriveRouteQuery(this.f25276a, this.f25277b, this.f25278c, this.f25279d, this.f25280e);
            driveRouteQuery.setUseFerry(this.f25281f);
            driveRouteQuery.setCarType(this.f25282g);
            return driveRouteQuery;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            String str = this.f25280e;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode + 31) * 31;
            List<List<LatLonPoint>> list = this.f25279d;
            if (list == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = list.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            FromAndTo fromAndTo = this.f25276a;
            if (fromAndTo == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = fromAndTo.hashCode();
            }
            int i4 = (((i3 + hashCode3) * 31) + this.f25277b) * 31;
            List<LatLonPoint> list2 = this.f25278c;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return ((i4 + i) * 31) + this.f25282g;
        }

        public String getAvoidpolygonsStr() {
            StringBuffer stringBuffer = new StringBuffer();
            List<List<LatLonPoint>> list = this.f25279d;
            if (list != null && list.size() != 0) {
                for (int i = 0; i < this.f25279d.size(); i++) {
                    List<LatLonPoint> list2 = this.f25279d.get(i);
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        LatLonPoint latLonPoint = list2.get(i2);
                        stringBuffer.append(latLonPoint.getLongitude());
                        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                        stringBuffer.append(latLonPoint.getLatitude());
                        if (i2 < list2.size() - 1) {
                            stringBuffer.append(";");
                        }
                    }
                    if (i < this.f25279d.size() - 1) {
                        stringBuffer.append("|");
                    }
                }
                return stringBuffer.toString();
            }
            return null;
        }

        public String getPassedPointStr() {
            StringBuffer stringBuffer = new StringBuffer();
            List<LatLonPoint> list = this.f25278c;
            if (list != null && list.size() != 0) {
                for (int i = 0; i < this.f25278c.size(); i++) {
                    LatLonPoint latLonPoint = this.f25278c.get(i);
                    stringBuffer.append(latLonPoint.getLongitude());
                    stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    stringBuffer.append(latLonPoint.getLatitude());
                    if (i < this.f25278c.size() - 1) {
                        stringBuffer.append(";");
                    }
                }
                return stringBuffer.toString();
            }
            return null;
        }

        public void setCarType(int i) {
            this.f25282g = i;
        }

        public void setUseFerry(boolean z) {
            this.f25281f = z;
        }

        public DriveRouteQuery(Parcel parcel) {
            boolean z = true;
            this.f25281f = true;
            this.f25276a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            this.f25277b = parcel.readInt();
            this.f25278c = parcel.createTypedArrayList(LatLonPoint.CREATOR);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                this.f25279d = null;
            } else {
                this.f25279d = new ArrayList();
                for (int i = 0; i < readInt; i++) {
                    this.f25279d.add(parcel.createTypedArrayList(LatLonPoint.CREATOR));
                }
            }
            this.f25280e = parcel.readString();
            this.f25281f = parcel.readInt() != 1 ? false : z;
            this.f25282g = parcel.readInt();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DriveRouteQuery driveRouteQuery = (DriveRouteQuery) obj;
            String str = this.f25280e;
            if (str == null) {
                if (driveRouteQuery.f25280e != null) {
                    return false;
                }
            } else if (!str.equals(driveRouteQuery.f25280e)) {
                return false;
            }
            List<List<LatLonPoint>> list = this.f25279d;
            if (list == null) {
                if (driveRouteQuery.f25279d != null) {
                    return false;
                }
            } else if (!list.equals(driveRouteQuery.f25279d)) {
                return false;
            }
            FromAndTo fromAndTo = this.f25276a;
            if (fromAndTo == null) {
                if (driveRouteQuery.f25276a != null) {
                    return false;
                }
            } else if (!fromAndTo.equals(driveRouteQuery.f25276a)) {
                return false;
            }
            if (this.f25277b != driveRouteQuery.f25277b) {
                return false;
            }
            List<LatLonPoint> list2 = this.f25278c;
            if (list2 == null) {
                if (driveRouteQuery.f25278c != null) {
                    return false;
                }
            } else if (!list2.equals(driveRouteQuery.f25278c) || this.f25281f != driveRouteQuery.isUseFerry() || this.f25282g != driveRouteQuery.f25282g) {
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f25276a, i);
            parcel.writeInt(this.f25277b);
            parcel.writeTypedList(this.f25278c);
            List<List<LatLonPoint>> list = this.f25279d;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(list.size());
                for (List<LatLonPoint> list2 : this.f25279d) {
                    parcel.writeTypedList(list2);
                }
            }
            parcel.writeString(this.f25280e);
            parcel.writeInt(this.f25281f ? 1 : 0);
            parcel.writeInt(this.f25282g);
        }

        public DriveRouteQuery(FromAndTo fromAndTo, int i, List<LatLonPoint> list, List<List<LatLonPoint>> list2, String str) {
            this.f25281f = true;
            this.f25276a = fromAndTo;
            this.f25277b = i;
            this.f25278c = list;
            this.f25279d = list2;
            this.f25280e = str;
        }
    }

    /* loaded from: classes19.dex */
    public static class FromAndTo implements Parcelable, Cloneable {
        public static final Parcelable.Creator<FromAndTo> CREATOR = new Parcelable.Creator<FromAndTo>() { // from class: com.amap.api.services.route.RouteSearch.FromAndTo.1
            static {
                Covode.recordClassIndex(5817);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final FromAndTo[] newArray(int i) {
                return new FromAndTo[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final FromAndTo createFromParcel(Parcel parcel) {
                return new FromAndTo(parcel);
            }
        };

        /* renamed from: a */
        public LatLonPoint f25283a;

        /* renamed from: b */
        public LatLonPoint f25284b;

        /* renamed from: c */
        public String f25285c;

        /* renamed from: d */
        public String f25286d;

        /* renamed from: e */
        public String f25287e;

        /* renamed from: f */
        public String f25288f;

        /* renamed from: g */
        public String f25289g;

        /* renamed from: h */
        public String f25290h;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public FromAndTo() {
        }

        public String getDestinationPoiID() {
            return this.f25286d;
        }

        public String getDestinationType() {
            return this.f25288f;
        }

        public LatLonPoint getFrom() {
            return this.f25283a;
        }

        public String getOriginType() {
            return this.f25287e;
        }

        public String getPlateNumber() {
            return this.f25290h;
        }

        public String getPlateProvince() {
            return this.f25289g;
        }

        public String getStartPoiID() {
            return this.f25285c;
        }

        public LatLonPoint getTo() {
            return this.f25284b;
        }

        static {
            Covode.recordClassIndex(5816);
        }

        /* renamed from: clone */
        public FromAndTo m25293clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                C2007j.m16371a(e, "RouteSearch", "FromAndToclone");
            }
            FromAndTo fromAndTo = new FromAndTo(this.f25283a, this.f25284b);
            fromAndTo.setStartPoiID(this.f25285c);
            fromAndTo.setDestinationPoiID(this.f25286d);
            fromAndTo.setOriginType(this.f25287e);
            fromAndTo.setDestinationType(this.f25288f);
            return fromAndTo;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            String str = this.f25286d;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode + 31) * 31;
            LatLonPoint latLonPoint = this.f25283a;
            if (latLonPoint == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = latLonPoint.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            String str2 = this.f25285c;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            LatLonPoint latLonPoint2 = this.f25284b;
            if (latLonPoint2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = latLonPoint2.hashCode();
            }
            int i5 = (i4 + hashCode4) * 31;
            String str3 = this.f25287e;
            if (str3 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str3.hashCode();
            }
            int i6 = (i5 + hashCode5) * 31;
            String str4 = this.f25288f;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return i6 + i;
        }

        public void setDestinationPoiID(String str) {
            this.f25286d = str;
        }

        public void setDestinationType(String str) {
            this.f25288f = str;
        }

        public void setOriginType(String str) {
            this.f25287e = str;
        }

        public void setPlateNumber(String str) {
            this.f25290h = str;
        }

        public void setPlateProvince(String str) {
            this.f25289g = str;
        }

        public void setStartPoiID(String str) {
            this.f25285c = str;
        }

        public FromAndTo(Parcel parcel) {
            this.f25283a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
            this.f25284b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
            this.f25285c = parcel.readString();
            this.f25286d = parcel.readString();
            this.f25287e = parcel.readString();
            this.f25288f = parcel.readString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            FromAndTo fromAndTo = (FromAndTo) obj;
            String str = this.f25286d;
            if (str == null) {
                if (fromAndTo.f25286d != null) {
                    return false;
                }
            } else if (!str.equals(fromAndTo.f25286d)) {
                return false;
            }
            LatLonPoint latLonPoint = this.f25283a;
            if (latLonPoint == null) {
                if (fromAndTo.f25283a != null) {
                    return false;
                }
            } else if (!latLonPoint.equals(fromAndTo.f25283a)) {
                return false;
            }
            String str2 = this.f25285c;
            if (str2 == null) {
                if (fromAndTo.f25285c != null) {
                    return false;
                }
            } else if (!str2.equals(fromAndTo.f25285c)) {
                return false;
            }
            LatLonPoint latLonPoint2 = this.f25284b;
            if (latLonPoint2 == null) {
                if (fromAndTo.f25284b != null) {
                    return false;
                }
            } else if (!latLonPoint2.equals(fromAndTo.f25284b)) {
                return false;
            }
            String str3 = this.f25287e;
            if (str3 == null) {
                if (fromAndTo.f25287e != null) {
                    return false;
                }
            } else if (!str3.equals(fromAndTo.f25287e)) {
                return false;
            }
            String str4 = this.f25288f;
            if (str4 == null) {
                if (fromAndTo.f25288f != null) {
                    return false;
                }
            } else if (!str4.equals(fromAndTo.f25288f)) {
                return false;
            }
            return true;
        }

        public FromAndTo(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f25283a = latLonPoint;
            this.f25284b = latLonPoint2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f25283a, i);
            parcel.writeParcelable(this.f25284b, i);
            parcel.writeString(this.f25285c);
            parcel.writeString(this.f25286d);
            parcel.writeString(this.f25287e);
            parcel.writeString(this.f25288f);
        }
    }

    /* loaded from: classes19.dex */
    public static class RideRouteQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<RideRouteQuery> CREATOR = new Parcelable.Creator<RideRouteQuery>() { // from class: com.amap.api.services.route.RouteSearch.RideRouteQuery.1
            static {
                Covode.recordClassIndex(5822);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final RideRouteQuery[] newArray(int i) {
                return new RideRouteQuery[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final RideRouteQuery createFromParcel(Parcel parcel) {
                return new RideRouteQuery(parcel);
            }
        };

        /* renamed from: a */
        public FromAndTo f25291a;

        /* renamed from: b */
        public int f25292b;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public RideRouteQuery() {
        }

        public FromAndTo getFromAndTo() {
            return this.f25291a;
        }

        public int getMode() {
            return this.f25292b;
        }

        static {
            Covode.recordClassIndex(5821);
        }

        /* renamed from: clone */
        public RideRouteQuery m25294clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                C2007j.m16371a(e, "RouteSearch", "RideRouteQueryclone");
            }
            return new RideRouteQuery(this.f25291a);
        }

        public int hashCode() {
            int hashCode;
            FromAndTo fromAndTo = this.f25291a;
            if (fromAndTo == null) {
                hashCode = 0;
            } else {
                hashCode = fromAndTo.hashCode();
            }
            return ((hashCode + 31) * 31) + this.f25292b;
        }

        public RideRouteQuery(FromAndTo fromAndTo) {
            this.f25291a = fromAndTo;
        }

        public RideRouteQuery(Parcel parcel) {
            this.f25291a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            this.f25292b = parcel.readInt();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            WalkRouteQuery walkRouteQuery = (WalkRouteQuery) obj;
            FromAndTo fromAndTo = this.f25291a;
            if (fromAndTo == null) {
                if (walkRouteQuery.f25302a != null) {
                    return false;
                }
            } else if (!fromAndTo.equals(walkRouteQuery.f25302a)) {
                return false;
            }
            if (this.f25292b == walkRouteQuery.f25303b) {
                return true;
            }
            return false;
        }

        public RideRouteQuery(FromAndTo fromAndTo, int i) {
            this.f25291a = fromAndTo;
            this.f25292b = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f25291a, i);
            parcel.writeInt(this.f25292b);
        }
    }

    /* loaded from: classes19.dex */
    public static class TruckRouteQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<TruckRouteQuery> CREATOR = new Parcelable.Creator<TruckRouteQuery>() { // from class: com.amap.api.services.route.RouteSearch.TruckRouteQuery.1
            static {
                Covode.recordClassIndex(5824);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final TruckRouteQuery[] newArray(int i) {
                return new TruckRouteQuery[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final TruckRouteQuery createFromParcel(Parcel parcel) {
                return new TruckRouteQuery(parcel);
            }
        };

        /* renamed from: a */
        public FromAndTo f25293a;

        /* renamed from: b */
        public int f25294b;

        /* renamed from: c */
        public int f25295c;

        /* renamed from: d */
        public List<LatLonPoint> f25296d;

        /* renamed from: e */
        public float f25297e;

        /* renamed from: f */
        public float f25298f;

        /* renamed from: g */
        public float f25299g;

        /* renamed from: h */
        public float f25300h;

        /* renamed from: i */
        public float f25301i;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public FromAndTo getFromAndTo() {
            return this.f25293a;
        }

        public int getMode() {
            return this.f25295c;
        }

        public float getTruckAxis() {
            return this.f25301i;
        }

        public float getTruckHeight() {
            return this.f25297e;
        }

        public float getTruckLoad() {
            return this.f25299g;
        }

        public int getTruckSize() {
            return this.f25294b;
        }

        public float getTruckWeight() {
            return this.f25300h;
        }

        public float getTruckWidth() {
            return this.f25298f;
        }

        static {
            Covode.recordClassIndex(5823);
        }

        public boolean hasPassPoint() {
            if (C2007j.m16372a(getPassedPointStr())) {
                return false;
            }
            return true;
        }

        /* renamed from: clone */
        public TruckRouteQuery m25295clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                C2007j.m16371a(e, "RouteSearch", "TruckRouteQueryclone");
            }
            return new TruckRouteQuery(this.f25293a, this.f25295c, this.f25296d, this.f25294b);
        }

        public String getPassedPointStr() {
            StringBuffer stringBuffer = new StringBuffer();
            List<LatLonPoint> list = this.f25296d;
            if (list != null && list.size() != 0) {
                for (int i = 0; i < this.f25296d.size(); i++) {
                    LatLonPoint latLonPoint = this.f25296d.get(i);
                    stringBuffer.append(latLonPoint.getLongitude());
                    stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    stringBuffer.append(latLonPoint.getLatitude());
                    if (i < this.f25296d.size() - 1) {
                        stringBuffer.append(";");
                    }
                }
                return stringBuffer.toString();
            }
            return null;
        }

        public void setMode(int i) {
            this.f25295c = i;
        }

        public void setTruckAxis(float f) {
            this.f25301i = f;
        }

        public void setTruckHeight(float f) {
            this.f25297e = f;
        }

        public void setTruckLoad(float f) {
            this.f25299g = f;
        }

        public void setTruckSize(int i) {
            this.f25294b = i;
        }

        public void setTruckWeight(float f) {
            this.f25300h = f;
        }

        public void setTruckWidth(float f) {
            this.f25298f = f;
        }

        public TruckRouteQuery(Parcel parcel) {
            this.f25294b = 2;
            this.f25293a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            this.f25294b = parcel.readInt();
            this.f25295c = parcel.readInt();
            this.f25296d = parcel.createTypedArrayList(LatLonPoint.CREATOR);
            this.f25297e = parcel.readFloat();
            this.f25298f = parcel.readFloat();
            this.f25299g = parcel.readFloat();
            this.f25300h = parcel.readFloat();
            this.f25301i = parcel.readFloat();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f25293a, i);
            parcel.writeInt(this.f25294b);
            parcel.writeInt(this.f25295c);
            parcel.writeTypedList(this.f25296d);
            parcel.writeFloat(this.f25297e);
            parcel.writeFloat(this.f25298f);
            parcel.writeFloat(this.f25299g);
            parcel.writeFloat(this.f25300h);
            parcel.writeFloat(this.f25301i);
        }

        public TruckRouteQuery(FromAndTo fromAndTo, int i, List<LatLonPoint> list, int i2) {
            this.f25294b = 2;
            this.f25293a = fromAndTo;
            this.f25295c = i;
            this.f25296d = list;
            this.f25294b = i2;
        }
    }

    /* loaded from: classes19.dex */
    public static class WalkRouteQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<WalkRouteQuery> CREATOR = new Parcelable.Creator<WalkRouteQuery>() { // from class: com.amap.api.services.route.RouteSearch.WalkRouteQuery.1
            static {
                Covode.recordClassIndex(5826);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final WalkRouteQuery[] newArray(int i) {
                return new WalkRouteQuery[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final WalkRouteQuery createFromParcel(Parcel parcel) {
                return new WalkRouteQuery(parcel);
            }
        };

        /* renamed from: a */
        public FromAndTo f25302a;

        /* renamed from: b */
        public int f25303b;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public WalkRouteQuery() {
        }

        public FromAndTo getFromAndTo() {
            return this.f25302a;
        }

        public int getMode() {
            return this.f25303b;
        }

        static {
            Covode.recordClassIndex(5825);
        }

        /* renamed from: clone */
        public WalkRouteQuery m25296clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                C2007j.m16371a(e, "RouteSearch", "WalkRouteQueryclone");
            }
            return new WalkRouteQuery(this.f25302a);
        }

        public int hashCode() {
            int hashCode;
            FromAndTo fromAndTo = this.f25302a;
            if (fromAndTo == null) {
                hashCode = 0;
            } else {
                hashCode = fromAndTo.hashCode();
            }
            return ((hashCode + 31) * 31) + this.f25303b;
        }

        public WalkRouteQuery(FromAndTo fromAndTo) {
            this.f25302a = fromAndTo;
        }

        public WalkRouteQuery(Parcel parcel) {
            this.f25302a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            this.f25303b = parcel.readInt();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            WalkRouteQuery walkRouteQuery = (WalkRouteQuery) obj;
            FromAndTo fromAndTo = this.f25302a;
            if (fromAndTo == null) {
                if (walkRouteQuery.f25302a != null) {
                    return false;
                }
            } else if (!fromAndTo.equals(walkRouteQuery.f25302a)) {
                return false;
            }
            if (this.f25303b == walkRouteQuery.f25303b) {
                return true;
            }
            return false;
        }

        public WalkRouteQuery(FromAndTo fromAndTo, int i) {
            this.f25302a = fromAndTo;
            this.f25303b = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f25302a, i);
            parcel.writeInt(this.f25303b);
        }
    }

    public void calculateBusRouteAsyn(BusRouteQuery busRouteQuery) {
        IRouteSearch iRouteSearch = this.f25263a;
        if (iRouteSearch != null) {
            iRouteSearch.calculateBusRouteAsyn(busRouteQuery);
        }
    }

    public void calculateDrivePlanAsyn(DrivePlanQuery drivePlanQuery) {
        IRouteSearch iRouteSearch = this.f25263a;
        if (iRouteSearch != null) {
            iRouteSearch.calculateDrivePlanAsyn(drivePlanQuery);
        }
    }

    public void calculateDriveRouteAsyn(DriveRouteQuery driveRouteQuery) {
        IRouteSearch iRouteSearch = this.f25263a;
        if (iRouteSearch != null) {
            iRouteSearch.calculateDriveRouteAsyn(driveRouteQuery);
        }
    }

    public void calculateRideRouteAsyn(RideRouteQuery rideRouteQuery) {
        IRouteSearch iRouteSearch = this.f25263a;
        if (iRouteSearch != null) {
            iRouteSearch.calculateRideRouteAsyn(rideRouteQuery);
        }
    }

    public void calculateTruckRouteAsyn(TruckRouteQuery truckRouteQuery) {
        IRouteSearch iRouteSearch = this.f25263a;
        if (iRouteSearch != null) {
            iRouteSearch.calculateTruckRouteAsyn(truckRouteQuery);
        }
    }

    public void calculateWalkRouteAsyn(WalkRouteQuery walkRouteQuery) {
        IRouteSearch iRouteSearch = this.f25263a;
        if (iRouteSearch != null) {
            iRouteSearch.calculateWalkRouteAsyn(walkRouteQuery);
        }
    }

    public void setOnRoutePlanSearchListener(OnRoutePlanSearchListener onRoutePlanSearchListener) {
        IRouteSearch iRouteSearch = this.f25263a;
        if (iRouteSearch != null) {
            iRouteSearch.setOnRoutePlanSearchListener(onRoutePlanSearchListener);
        }
    }

    public void setOnTruckRouteSearchListener(OnTruckRouteSearchListener onTruckRouteSearchListener) {
        IRouteSearch iRouteSearch = this.f25263a;
        if (iRouteSearch != null) {
            iRouteSearch.setOnTruckRouteSearchListener(onTruckRouteSearchListener);
        }
    }

    public void setRouteSearchListener(OnRouteSearchListener onRouteSearchListener) {
        IRouteSearch iRouteSearch = this.f25263a;
        if (iRouteSearch != null) {
            iRouteSearch.setRouteSearchListener(onRouteSearchListener);
        }
    }

    public BusRouteResult calculateBusRoute(BusRouteQuery busRouteQuery) {
        IRouteSearch iRouteSearch = this.f25263a;
        if (iRouteSearch != null) {
            return iRouteSearch.calculateBusRoute(busRouteQuery);
        }
        return null;
    }

    public DriveRoutePlanResult calculateDrivePlan(DrivePlanQuery drivePlanQuery) {
        IRouteSearch iRouteSearch = this.f25263a;
        if (iRouteSearch != null) {
            return iRouteSearch.calculateDrivePlan(drivePlanQuery);
        }
        return null;
    }

    public DriveRouteResult calculateDriveRoute(DriveRouteQuery driveRouteQuery) {
        IRouteSearch iRouteSearch = this.f25263a;
        if (iRouteSearch != null) {
            return iRouteSearch.calculateDriveRoute(driveRouteQuery);
        }
        return null;
    }

    public RideRouteResult calculateRideRoute(RideRouteQuery rideRouteQuery) {
        IRouteSearch iRouteSearch = this.f25263a;
        if (iRouteSearch != null) {
            return iRouteSearch.calculateRideRoute(rideRouteQuery);
        }
        return null;
    }

    public TruckRouteRestult calculateTruckRoute(TruckRouteQuery truckRouteQuery) {
        IRouteSearch iRouteSearch = this.f25263a;
        if (iRouteSearch != null) {
            return iRouteSearch.calculateTruckRoute(truckRouteQuery);
        }
        return null;
    }

    public WalkRouteResult calculateWalkRoute(WalkRouteQuery walkRouteQuery) {
        IRouteSearch iRouteSearch = this.f25263a;
        if (iRouteSearch != null) {
            return iRouteSearch.calculateWalkRoute(walkRouteQuery);
        }
        return null;
    }

    public RouteSearch(Context context) {
        try {
            this.f25263a = (IRouteSearch) C1930cr.m16606a(context, C2006i.m16379a(true), "com.amap.api.services.dynamic.RouteSearchWrapper", C1844ba.class, new Class[]{Context.class}, new Object[]{context});
        } catch (C1863be e) {
            e.printStackTrace();
        }
        if (this.f25263a == null) {
            try {
                this.f25263a = new C1844ba(context);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
