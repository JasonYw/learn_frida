package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.route.RouteSearch;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class DriveRoutePlanResult extends RoutePlanResult implements Parcelable {
    public static final Parcelable.Creator<DriveRoutePlanResult> CREATOR = new Parcelable.Creator<DriveRoutePlanResult>() { // from class: com.amap.api.services.route.DriveRoutePlanResult.1
        static {
            Covode.recordClassIndex(5780);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DriveRoutePlanResult[] newArray(int i) {
            return new DriveRoutePlanResult[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DriveRoutePlanResult createFromParcel(Parcel parcel) {
            return new DriveRoutePlanResult(parcel);
        }
    };

    /* renamed from: a */
    public List<DrivePlanPath> f25198a;

    /* renamed from: b */
    public List<TimeInfo> f25199b;

    /* renamed from: c */
    public RouteSearch.DrivePlanQuery f25200c;

    @Override // com.amap.api.services.route.RoutePlanResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<DrivePlanPath> getPaths() {
        return this.f25198a;
    }

    public List<TimeInfo> getTimeInfos() {
        return this.f25199b;
    }

    static {
        Covode.recordClassIndex(5779);
    }

    public DriveRoutePlanResult() {
        this.f25198a = new ArrayList();
        this.f25199b = new ArrayList();
    }

    public void setPaths(List<DrivePlanPath> list) {
        this.f25198a = list;
    }

    public void setTimeInfos(List<TimeInfo> list) {
        this.f25199b = list;
    }

    public void setDrivePlanQuery(RouteSearch.DrivePlanQuery drivePlanQuery) {
        this.f25200c = drivePlanQuery;
        RouteSearch.FromAndTo fromAndTo = this.f25200c.getFromAndTo();
        if (fromAndTo != null) {
            setStartPos(fromAndTo.getFrom());
            setTargetPos(fromAndTo.getTo());
        }
    }

    public DriveRoutePlanResult(Parcel parcel) {
        super(parcel);
        this.f25198a = new ArrayList();
        this.f25199b = new ArrayList();
        this.f25198a = parcel.createTypedArrayList(DrivePlanPath.CREATOR);
        this.f25199b = parcel.createTypedArrayList(TimeInfo.CREATOR);
        this.f25200c = (RouteSearch.DrivePlanQuery) parcel.readParcelable(RouteSearch.DrivePlanQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RoutePlanResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f25198a);
        parcel.writeTypedList(this.f25199b);
        parcel.writeParcelable(this.f25200c, i);
    }
}
