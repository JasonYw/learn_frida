package com.amap.api.services.nearby;

import android.content.Context;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.INearbySearch;
import com.amap.api.services.p126a.C1833ax;
import com.amap.api.services.p126a.C1863be;
import com.amap.api.services.p126a.C1930cr;
import com.amap.api.services.p126a.C2006i;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class NearbySearch {

    /* renamed from: a */
    public static NearbySearch f25088a;

    /* renamed from: b */
    public INearbySearch f25089b;

    /* loaded from: classes19.dex */
    public interface NearbyListener {
        static {
            Covode.recordClassIndex(5732);
        }

        void onNearbyInfoSearched(NearbySearchResult nearbySearchResult, int i);

        void onNearbyInfoUploaded(int i);

        void onUserInfoCleared(int i);
    }

    static {
        Covode.recordClassIndex(5730);
    }

    /* loaded from: classes18.dex */
    public static class NearbyQuery {

        /* renamed from: a */
        public LatLonPoint f25091a;

        /* renamed from: b */
        public NearbySearchFunctionType f25092b = NearbySearchFunctionType.DISTANCE_SEARCH;

        /* renamed from: c */
        public int f25093c = 1000;

        /* renamed from: d */
        public int f25094d = 1800;

        /* renamed from: e */
        public int f25095e = 1;

        static {
            Covode.recordClassIndex(5733);
        }

        public LatLonPoint getCenterPoint() {
            return this.f25091a;
        }

        public int getCoordType() {
            return this.f25095e;
        }

        public int getRadius() {
            return this.f25093c;
        }

        public int getTimeRange() {
            return this.f25094d;
        }

        public int getType() {
            int i = C20561.f25090a[this.f25092b.ordinal()];
            if (i == 1 || i != 2) {
                return 0;
            }
            return 1;
        }

        public void setCenterPoint(LatLonPoint latLonPoint) {
            this.f25091a = latLonPoint;
        }

        public void setType(NearbySearchFunctionType nearbySearchFunctionType) {
            this.f25092b = nearbySearchFunctionType;
        }

        public void setCoordType(int i) {
            if (i != 0 && i != 1) {
                this.f25095e = 1;
            } else {
                this.f25095e = i;
            }
        }

        public void setRadius(int i) {
            if (i > 10000) {
                i = 10000;
            }
            this.f25093c = i;
        }

        public void setTimeRange(int i) {
            if (i < 5) {
                i = 5;
            } else if (i > 86400) {
                i = 86400;
            }
            this.f25094d = i;
        }
    }

    public void clearUserInfoAsyn() {
        INearbySearch iNearbySearch = this.f25089b;
        if (iNearbySearch != null) {
            iNearbySearch.clearUserInfoAsyn();
        }
    }

    /* renamed from: a */
    private void m16198a() {
        INearbySearch iNearbySearch = this.f25089b;
        if (iNearbySearch != null) {
            iNearbySearch.destroy();
        }
        this.f25089b = null;
    }

    public synchronized void stopUploadNearbyInfoAuto() {
        if (this.f25089b != null) {
            this.f25089b.stopUploadNearbyInfoAuto();
        }
    }

    public static synchronized void destroy() {
        synchronized (NearbySearch.class) {
            if (f25088a != null) {
                f25088a.m16198a();
            }
            f25088a = null;
        }
    }

    /* renamed from: com.amap.api.services.nearby.NearbySearch$1 */
    /* loaded from: classes18.dex */
    public static /* synthetic */ class C20561 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25090a = new int[NearbySearchFunctionType.values().length];

        static {
            Covode.recordClassIndex(5731);
            try {
                f25090a[NearbySearchFunctionType.DISTANCE_SEARCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25090a[NearbySearchFunctionType.DRIVING_DISTANCE_SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void searchNearbyInfoAsyn(NearbyQuery nearbyQuery) {
        INearbySearch iNearbySearch = this.f25089b;
        if (iNearbySearch != null) {
            iNearbySearch.searchNearbyInfoAsyn(nearbyQuery);
        }
    }

    public void setUserID(String str) {
        INearbySearch iNearbySearch = this.f25089b;
        if (iNearbySearch != null) {
            iNearbySearch.setUserID(str);
        }
    }

    public void uploadNearbyInfoAsyn(UploadInfo uploadInfo) {
        INearbySearch iNearbySearch = this.f25089b;
        if (iNearbySearch != null) {
            iNearbySearch.uploadNearbyInfoAsyn(uploadInfo);
        }
    }

    public synchronized void addNearbyListener(NearbyListener nearbyListener) {
        if (this.f25089b != null) {
            this.f25089b.addNearbyListener(nearbyListener);
        }
    }

    public synchronized void removeNearbyListener(NearbyListener nearbyListener) {
        if (this.f25089b != null) {
            this.f25089b.removeNearbyListener(nearbyListener);
        }
    }

    public NearbySearchResult searchNearbyInfo(NearbyQuery nearbyQuery) {
        INearbySearch iNearbySearch = this.f25089b;
        if (iNearbySearch != null) {
            return iNearbySearch.searchNearbyInfo(nearbyQuery);
        }
        return null;
    }

    public static synchronized NearbySearch getInstance(Context context) {
        NearbySearch nearbySearch;
        synchronized (NearbySearch.class) {
            if (f25088a == null) {
                f25088a = new NearbySearch(context);
            }
            nearbySearch = f25088a;
        }
        return nearbySearch;
    }

    public NearbySearch(Context context) {
        try {
            this.f25089b = (INearbySearch) C1930cr.m16606a(context, C2006i.m16379a(true), "com.amap.api.services.dynamic.NearbySearchWrapper", C1833ax.class, new Class[]{Context.class}, new Object[]{context});
        } catch (C1863be e) {
            e.printStackTrace();
        }
        if (this.f25089b == null) {
            try {
                this.f25089b = new C1833ax(context);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public synchronized void startUploadNearbyInfoAuto(UploadInfoCallback uploadInfoCallback, int i) {
        if (this.f25089b != null) {
            this.f25089b.startUploadNearbyInfoAuto(uploadInfoCallback, i);
        }
    }
}
