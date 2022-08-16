package com.amap.api.services.poisearch;

import android.content.Context;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.interfaces.IPoiSearch;
import com.amap.api.services.p126a.C1838ay;
import com.amap.api.services.p126a.C1863be;
import com.amap.api.services.p126a.C1930cr;
import com.amap.api.services.p126a.C2006i;
import com.amap.api.services.p126a.C2007j;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;

/* loaded from: classes19.dex */
public class PoiSearch {

    /* renamed from: a */
    public IPoiSearch f25116a;

    /* loaded from: classes19.dex */
    public interface OnPoiSearchListener {
        static {
            Covode.recordClassIndex(5746);
        }

        void onPoiItemSearched(PoiItem poiItem, int i);

        void onPoiSearched(PoiResult poiResult, int i);
    }

    static {
        Covode.recordClassIndex(5745);
    }

    /* loaded from: classes19.dex */
    public static class Query implements Cloneable {

        /* renamed from: a */
        public String f25117a;

        /* renamed from: b */
        public String f25118b;

        /* renamed from: c */
        public String f25119c;

        /* renamed from: d */
        public int f25120d;

        /* renamed from: e */
        public int f25121e;

        /* renamed from: f */
        public String f25122f;

        /* renamed from: g */
        public boolean f25123g;

        /* renamed from: h */
        public boolean f25124h;

        /* renamed from: i */
        public String f25125i;

        /* renamed from: j */
        public boolean f25126j;

        /* renamed from: k */
        public LatLonPoint f25127k;

        static {
            Covode.recordClassIndex(5747);
        }

        /* renamed from: a */
        private String m16188a() {
            return "";
        }

        public String getBuilding() {
            return this.f25125i;
        }

        public String getCity() {
            return this.f25119c;
        }

        public boolean getCityLimit() {
            return this.f25123g;
        }

        public LatLonPoint getLocation() {
            return this.f25127k;
        }

        public int getPageNum() {
            return this.f25120d;
        }

        public int getPageSize() {
            return this.f25121e;
        }

        public String getQueryLanguage() {
            return this.f25122f;
        }

        public String getQueryString() {
            return this.f25117a;
        }

        public boolean isDistanceSort() {
            return this.f25126j;
        }

        public boolean isRequireSubPois() {
            return this.f25124h;
        }

        public String getCategory() {
            String str = this.f25118b;
            if (str != null && !str.equals("00") && !this.f25118b.equals("00|")) {
                return this.f25118b;
            }
            return m16188a();
        }

        /* renamed from: clone */
        public Query m25287clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                C2007j.m16371a(e, "PoiSearch", "queryclone");
            }
            Query query = new Query(this.f25117a, this.f25118b, this.f25119c);
            query.setPageNum(this.f25120d);
            query.setPageSize(this.f25121e);
            query.setQueryLanguage(this.f25122f);
            query.setCityLimit(this.f25123g);
            query.requireSubPois(this.f25124h);
            query.setBuilding(this.f25125i);
            query.setLocation(this.f25127k);
            query.setDistanceSort(this.f25126j);
            return query;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int i;
            int hashCode3;
            int hashCode4;
            String str = this.f25118b;
            int i2 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i3 = (hashCode + 31) * 31;
            String str2 = this.f25119c;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i4 = (i3 + hashCode2) * 31;
            int i5 = 1231;
            if (this.f25123g) {
                i = 1231;
            } else {
                i = 1237;
            }
            int i6 = (i4 + i) * 31;
            if (!this.f25124h) {
                i5 = 1237;
            }
            int i7 = (i6 + i5) * 31;
            String str3 = this.f25122f;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i8 = (((((i7 + hashCode3) * 31) + this.f25120d) * 31) + this.f25121e) * 31;
            String str4 = this.f25117a;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i9 = (i8 + hashCode4) * 31;
            String str5 = this.f25125i;
            if (str5 != null) {
                i2 = str5.hashCode();
            }
            return i9 + i2;
        }

        public void requireSubPois(boolean z) {
            this.f25124h = z;
        }

        public void setBuilding(String str) {
            this.f25125i = str;
        }

        public void setCityLimit(boolean z) {
            this.f25123g = z;
        }

        public void setDistanceSort(boolean z) {
            this.f25126j = z;
        }

        public void setLocation(LatLonPoint latLonPoint) {
            this.f25127k = latLonPoint;
        }

        public void setPageNum(int i) {
            if (i <= 0) {
                i = 1;
            }
            this.f25120d = i;
        }

        public void setQueryLanguage(String str) {
            if ("en".equals(str)) {
                this.f25122f = "en";
            } else {
                this.f25122f = "zh-CN";
            }
        }

        public void setPageSize(int i) {
            if (i <= 0) {
                this.f25121e = 20;
            } else if (i > 30) {
                this.f25121e = 30;
            } else {
                this.f25121e = i;
            }
        }

        public boolean queryEquals(Query query) {
            if (query == null) {
                return false;
            }
            if (query == this) {
                return true;
            }
            if (!PoiSearch.m16189b(query.f25117a, this.f25117a) || !PoiSearch.m16189b(query.f25118b, this.f25118b) || !PoiSearch.m16189b(query.f25122f, this.f25122f) || !PoiSearch.m16189b(query.f25119c, this.f25119c) || query.f25123g != this.f25123g || query.f25125i != this.f25125i || query.f25121e != this.f25121e || query.f25126j != this.f25126j) {
                return false;
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Query query = (Query) obj;
            String str = this.f25118b;
            if (str == null) {
                if (query.f25118b != null) {
                    return false;
                }
            } else if (!str.equals(query.f25118b)) {
                return false;
            }
            String str2 = this.f25119c;
            if (str2 == null) {
                if (query.f25119c != null) {
                    return false;
                }
            } else if (!str2.equals(query.f25119c)) {
                return false;
            }
            String str3 = this.f25122f;
            if (str3 == null) {
                if (query.f25122f != null) {
                    return false;
                }
            } else if (!str3.equals(query.f25122f)) {
                return false;
            }
            if (this.f25120d != query.f25120d || this.f25121e != query.f25121e) {
                return false;
            }
            String str4 = this.f25117a;
            if (str4 == null) {
                if (query.f25117a != null) {
                    return false;
                }
            } else if (!str4.equals(query.f25117a)) {
                return false;
            }
            String str5 = this.f25125i;
            if (str5 == null) {
                if (query.f25125i != null) {
                    return false;
                }
            } else if (!str5.equals(query.f25125i)) {
                return false;
            }
            if (this.f25123g == query.f25123g && this.f25124h == query.f25124h) {
                return true;
            }
            return false;
        }

        public Query(String str, String str2) {
            this(str, str2, null);
        }

        public Query(String str, String str2, String str3) {
            this.f25120d = 1;
            this.f25121e = 20;
            this.f25122f = "zh-CN";
            this.f25126j = true;
            this.f25117a = str;
            this.f25118b = str2;
            this.f25119c = str3;
        }
    }

    /* loaded from: classes19.dex */
    public static class SearchBound implements Cloneable {

        /* renamed from: a */
        public LatLonPoint f25128a;

        /* renamed from: b */
        public LatLonPoint f25129b;

        /* renamed from: c */
        public int f25130c;

        /* renamed from: d */
        public LatLonPoint f25131d;

        /* renamed from: e */
        public String f25132e;

        /* renamed from: f */
        public boolean f25133f;

        /* renamed from: g */
        public List<LatLonPoint> f25134g;

        static {
            Covode.recordClassIndex(5748);
        }

        public LatLonPoint getCenter() {
            return this.f25131d;
        }

        public LatLonPoint getLowerLeft() {
            return this.f25128a;
        }

        public List<LatLonPoint> getPolyGonList() {
            return this.f25134g;
        }

        public int getRange() {
            return this.f25130c;
        }

        public String getShape() {
            return this.f25132e;
        }

        public LatLonPoint getUpperRight() {
            return this.f25129b;
        }

        public boolean isDistanceSort() {
            return this.f25133f;
        }

        /* renamed from: clone */
        public SearchBound m25288clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                C2007j.m16371a(e, "PoiSearch", "SearchBoundClone");
            }
            return new SearchBound(this.f25128a, this.f25129b, this.f25130c, this.f25131d, this.f25132e, this.f25134g, this.f25133f);
        }

        public int hashCode() {
            int hashCode;
            int i;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            LatLonPoint latLonPoint = this.f25131d;
            int i2 = 0;
            if (latLonPoint == null) {
                hashCode = 0;
            } else {
                hashCode = latLonPoint.hashCode();
            }
            int i3 = (hashCode + 31) * 31;
            if (this.f25133f) {
                i = 1231;
            } else {
                i = 1237;
            }
            int i4 = (i3 + i) * 31;
            LatLonPoint latLonPoint2 = this.f25128a;
            if (latLonPoint2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = latLonPoint2.hashCode();
            }
            int i5 = (i4 + hashCode2) * 31;
            LatLonPoint latLonPoint3 = this.f25129b;
            if (latLonPoint3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = latLonPoint3.hashCode();
            }
            int i6 = (i5 + hashCode3) * 31;
            List<LatLonPoint> list = this.f25134g;
            if (list == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = list.hashCode();
            }
            int i7 = (((i6 + hashCode4) * 31) + this.f25130c) * 31;
            String str = this.f25132e;
            if (str != null) {
                i2 = str.hashCode();
            }
            return i7 + i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SearchBound searchBound = (SearchBound) obj;
            LatLonPoint latLonPoint = this.f25131d;
            if (latLonPoint == null) {
                if (searchBound.f25131d != null) {
                    return false;
                }
            } else if (!latLonPoint.equals(searchBound.f25131d)) {
                return false;
            }
            if (this.f25133f != searchBound.f25133f) {
                return false;
            }
            LatLonPoint latLonPoint2 = this.f25128a;
            if (latLonPoint2 == null) {
                if (searchBound.f25128a != null) {
                    return false;
                }
            } else if (!latLonPoint2.equals(searchBound.f25128a)) {
                return false;
            }
            LatLonPoint latLonPoint3 = this.f25129b;
            if (latLonPoint3 == null) {
                if (searchBound.f25129b != null) {
                    return false;
                }
            } else if (!latLonPoint3.equals(searchBound.f25129b)) {
                return false;
            }
            List<LatLonPoint> list = this.f25134g;
            if (list == null) {
                if (searchBound.f25134g != null) {
                    return false;
                }
            } else if (!list.equals(searchBound.f25134g)) {
                return false;
            }
            if (this.f25130c != searchBound.f25130c) {
                return false;
            }
            String str = this.f25132e;
            if (str == null) {
                if (searchBound.f25132e != null) {
                    return false;
                }
            } else if (!str.equals(searchBound.f25132e)) {
                return false;
            }
            return true;
        }

        public SearchBound(List<LatLonPoint> list) {
            this.f25130c = PushConstants.WORK_RECEIVER_EVENT_CORE_ERROR;
            this.f25133f = true;
            this.f25132e = "Polygon";
            this.f25134g = list;
        }

        public SearchBound(LatLonPoint latLonPoint, int i) {
            this.f25130c = PushConstants.WORK_RECEIVER_EVENT_CORE_ERROR;
            this.f25133f = true;
            this.f25132e = "Bound";
            this.f25130c = i;
            this.f25131d = latLonPoint;
        }

        public SearchBound(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f25130c = PushConstants.WORK_RECEIVER_EVENT_CORE_ERROR;
            this.f25133f = true;
            this.f25132e = "Rectangle";
            m16187a(latLonPoint, latLonPoint2);
        }

        /* renamed from: a */
        private void m16187a(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f25128a = latLonPoint;
            this.f25129b = latLonPoint2;
            if (this.f25128a.getLatitude() >= this.f25129b.getLatitude() || this.f25128a.getLongitude() >= this.f25129b.getLongitude()) {
                new IllegalArgumentException("invalid rect ").printStackTrace();
            }
            this.f25131d = new LatLonPoint((this.f25128a.getLatitude() + this.f25129b.getLatitude()) / 2.0d, (this.f25128a.getLongitude() + this.f25129b.getLongitude()) / 2.0d);
        }

        public SearchBound(LatLonPoint latLonPoint, int i, boolean z) {
            this.f25130c = PushConstants.WORK_RECEIVER_EVENT_CORE_ERROR;
            this.f25133f = true;
            this.f25132e = "Bound";
            this.f25130c = i;
            this.f25131d = latLonPoint;
            this.f25133f = z;
        }

        public SearchBound(LatLonPoint latLonPoint, LatLonPoint latLonPoint2, int i, LatLonPoint latLonPoint3, String str, List<LatLonPoint> list, boolean z) {
            this.f25130c = PushConstants.WORK_RECEIVER_EVENT_CORE_ERROR;
            this.f25133f = true;
            this.f25128a = latLonPoint;
            this.f25129b = latLonPoint2;
            this.f25130c = i;
            this.f25131d = latLonPoint3;
            this.f25132e = str;
            this.f25134g = list;
            this.f25133f = z;
        }
    }

    public void searchPOIAsyn() {
        IPoiSearch iPoiSearch = this.f25116a;
        if (iPoiSearch != null) {
            iPoiSearch.searchPOIAsyn();
        }
    }

    public SearchBound getBound() {
        IPoiSearch iPoiSearch = this.f25116a;
        if (iPoiSearch != null) {
            return iPoiSearch.getBound();
        }
        return null;
    }

    public String getLanguage() {
        IPoiSearch iPoiSearch = this.f25116a;
        if (iPoiSearch != null) {
            return iPoiSearch.getLanguage();
        }
        return null;
    }

    public Query getQuery() {
        IPoiSearch iPoiSearch = this.f25116a;
        if (iPoiSearch != null) {
            return iPoiSearch.getQuery();
        }
        return null;
    }

    public PoiResult searchPOI() {
        IPoiSearch iPoiSearch = this.f25116a;
        if (iPoiSearch != null) {
            return iPoiSearch.searchPOI();
        }
        return null;
    }

    public void searchPOIIdAsyn(String str) {
        IPoiSearch iPoiSearch = this.f25116a;
        if (iPoiSearch != null) {
            iPoiSearch.searchPOIIdAsyn(str);
        }
    }

    public void setBound(SearchBound searchBound) {
        IPoiSearch iPoiSearch = this.f25116a;
        if (iPoiSearch != null) {
            iPoiSearch.setBound(searchBound);
        }
    }

    public void setLanguage(String str) {
        IPoiSearch iPoiSearch = this.f25116a;
        if (iPoiSearch != null) {
            iPoiSearch.setLanguage(str);
        }
    }

    public void setOnPoiSearchListener(OnPoiSearchListener onPoiSearchListener) {
        IPoiSearch iPoiSearch = this.f25116a;
        if (iPoiSearch != null) {
            iPoiSearch.setOnPoiSearchListener(onPoiSearchListener);
        }
    }

    public void setQuery(Query query) {
        IPoiSearch iPoiSearch = this.f25116a;
        if (iPoiSearch != null) {
            iPoiSearch.setQuery(query);
        }
    }

    public PoiItem searchPOIId(String str) {
        IPoiSearch iPoiSearch = this.f25116a;
        if (iPoiSearch != null) {
            return iPoiSearch.searchPOIId(str);
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m16189b(String str, String str2) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (str2 != null) {
            return str.equals(str2);
        } else {
            return false;
        }
    }

    public PoiSearch(Context context, Query query) {
        try {
            this.f25116a = (IPoiSearch) C1930cr.m16606a(context, C2006i.m16379a(true), "com.amap.api.services.dynamic.PoiSearchWrapper", C1838ay.class, new Class[]{Context.class, Query.class}, new Object[]{context, query});
        } catch (C1863be e) {
            e.printStackTrace();
        }
        if (this.f25116a == null) {
            try {
                this.f25116a = new C1838ay(context, query);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
