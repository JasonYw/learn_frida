package com.amap.api.services.route;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.IDistanceSearch;
import com.amap.api.services.p126a.C1824at;
import com.amap.api.services.p126a.C1863be;
import com.amap.api.services.p126a.C1930cr;
import com.amap.api.services.p126a.C2006i;
import com.amap.api.services.p126a.C2007j;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class DistanceSearch {

    /* renamed from: a */
    public IDistanceSearch f25176a;

    /* loaded from: classes19.dex */
    public interface OnDistanceSearchListener {
        static {
            Covode.recordClassIndex(5768);
        }

        void onDistanceSearched(DistanceResult distanceResult, int i);
    }

    static {
        Covode.recordClassIndex(5765);
    }

    /* loaded from: classes19.dex */
    public static class DistanceQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<DistanceQuery> CREATOR = new Parcelable.Creator<DistanceQuery>() { // from class: com.amap.api.services.route.DistanceSearch.DistanceQuery.1
            static {
                Covode.recordClassIndex(5767);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final DistanceQuery[] newArray(int i) {
                return new DistanceQuery[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final DistanceQuery createFromParcel(Parcel parcel) {
                return new DistanceQuery(parcel);
            }
        };

        /* renamed from: a */
        public int f25177a;

        /* renamed from: b */
        public List<LatLonPoint> f25178b;

        /* renamed from: c */
        public LatLonPoint f25179c;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public LatLonPoint getDestination() {
            return this.f25179c;
        }

        public List<LatLonPoint> getOrigins() {
            return this.f25178b;
        }

        public int getType() {
            return this.f25177a;
        }

        static {
            Covode.recordClassIndex(5766);
        }

        public DistanceQuery() {
            this.f25177a = 1;
            this.f25178b = new ArrayList();
        }

        /* renamed from: clone */
        public DistanceQuery m25289clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                C2007j.m16371a(e, "DistanceSearch", "DistanceQueryclone");
            }
            DistanceQuery distanceQuery = new DistanceQuery();
            distanceQuery.setType(this.f25177a);
            distanceQuery.setOrigins(this.f25178b);
            distanceQuery.setDestination(this.f25179c);
            return distanceQuery;
        }

        public void setDestination(LatLonPoint latLonPoint) {
            this.f25179c = latLonPoint;
        }

        public void setType(int i) {
            this.f25177a = i;
        }

        public void setOrigins(List<LatLonPoint> list) {
            if (list != null) {
                this.f25178b = list;
            }
        }

        public void addOrigins(LatLonPoint... latLonPointArr) {
            for (LatLonPoint latLonPoint : latLonPointArr) {
                if (latLonPoint != null) {
                    this.f25178b.add(latLonPoint);
                }
            }
        }

        public DistanceQuery(Parcel parcel) {
            this.f25177a = 1;
            this.f25178b = new ArrayList();
            this.f25177a = parcel.readInt();
            this.f25178b = parcel.createTypedArrayList(LatLonPoint.CREATOR);
            this.f25179c = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f25177a);
            parcel.writeTypedList(this.f25178b);
            parcel.writeParcelable(this.f25179c, i);
        }
    }

    public void calculateRouteDistanceAsyn(DistanceQuery distanceQuery) {
        IDistanceSearch iDistanceSearch = this.f25176a;
        if (iDistanceSearch != null) {
            iDistanceSearch.calculateRouteDistanceAsyn(distanceQuery);
        }
    }

    public void setDistanceSearchListener(OnDistanceSearchListener onDistanceSearchListener) {
        IDistanceSearch iDistanceSearch = this.f25176a;
        if (iDistanceSearch != null) {
            iDistanceSearch.setDistanceSearchListener(onDistanceSearchListener);
        }
    }

    public DistanceResult calculateRouteDistance(DistanceQuery distanceQuery) {
        IDistanceSearch iDistanceSearch = this.f25176a;
        if (iDistanceSearch != null) {
            return iDistanceSearch.calculateRouteDistance(distanceQuery);
        }
        return null;
    }

    public DistanceSearch(Context context) {
        try {
            this.f25176a = (IDistanceSearch) C1930cr.m16606a(context, C2006i.m16379a(true), "com.amap.api.services.dynamic.DistanceSearchWrapper", C1824at.class, new Class[]{Context.class}, new Object[]{context});
        } catch (C1863be e) {
            e.printStackTrace();
        }
        if (this.f25176a == null) {
            try {
                this.f25176a = new C1824at(context);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
