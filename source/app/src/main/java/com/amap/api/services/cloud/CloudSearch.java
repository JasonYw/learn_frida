package com.amap.api.services.cloud;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.ICloudSearch;
import com.amap.api.services.p126a.C1800aa;
import com.amap.api.services.p126a.C1821as;
import com.amap.api.services.p126a.C1863be;
import com.amap.api.services.p126a.C1930cr;
import com.amap.api.services.p126a.C2006i;
import com.amap.api.services.p126a.C2007j;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p002O.C0002O;

/* loaded from: classes19.dex */
public class CloudSearch {

    /* renamed from: a */
    public ICloudSearch f24930a;

    /* loaded from: classes19.dex */
    public interface OnCloudSearchListener {
        static {
            Covode.recordClassIndex(5670);
        }

        void onCloudItemDetailSearched(CloudItemDetail cloudItemDetail, int i);

        void onCloudSearched(CloudResult cloudResult, int i);
    }

    static {
        Covode.recordClassIndex(5669);
    }

    /* loaded from: classes19.dex */
    public static class Query implements Cloneable {

        /* renamed from: a */
        public String f24931a;

        /* renamed from: d */
        public String f24934d;

        /* renamed from: e */
        public SearchBound f24935e;

        /* renamed from: f */
        public Sortingrules f24936f;

        /* renamed from: b */
        public int f24932b = 1;

        /* renamed from: c */
        public int f24933c = 20;

        /* renamed from: g */
        public ArrayList<C1800aa> f24937g = new ArrayList<>();

        /* renamed from: h */
        public HashMap<String, String> f24938h = new HashMap<>();

        static {
            Covode.recordClassIndex(5671);
        }

        public SearchBound getBound() {
            return this.f24935e;
        }

        public int getPageNum() {
            return this.f24932b;
        }

        public int getPageSize() {
            return this.f24933c;
        }

        public String getQueryString() {
            return this.f24931a;
        }

        public Sortingrules getSortingrules() {
            return this.f24936f;
        }

        public String getTableID() {
            return this.f24934d;
        }

        public Query() {
        }

        /* renamed from: a */
        private ArrayList<C1800aa> m16232a() {
            if (this.f24937g == null) {
                return null;
            }
            ArrayList<C1800aa> arrayList = new ArrayList<>();
            arrayList.addAll(this.f24937g);
            return arrayList;
        }

        /* renamed from: b */
        private HashMap<String, String> m16229b() {
            if (this.f24938h == null) {
                return null;
            }
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.putAll(this.f24938h);
            return hashMap;
        }

        /* renamed from: clone */
        public Query m25284clone() {
            Query query;
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            try {
                query = new Query(this.f24934d, this.f24931a, this.f24935e);
                try {
                    query.setPageNum(this.f24932b);
                    query.setPageSize(this.f24933c);
                    query.setSortingrules(getSortingrules());
                    query.f24937g = m16232a();
                    query.f24938h = m16229b();
                    return query;
                } catch (AMapException e2) {
                    e = e2;
                    e.printStackTrace();
                    if (query == null) {
                        return new Query();
                    }
                    return query;
                }
            } catch (AMapException e3) {
                e = e3;
                query = null;
            }
        }

        public String getFilterNumString() {
            StringBuffer stringBuffer = new StringBuffer();
            try {
                Iterator<C1800aa> it = this.f24937g.iterator();
                while (it.hasNext()) {
                    C1800aa next = it.next();
                    stringBuffer.append(next.m17085a());
                    stringBuffer.append(":[");
                    stringBuffer.append(next.m17084b());
                    stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    stringBuffer.append(next.m17083c());
                    stringBuffer.append("]");
                    stringBuffer.append("+");
                }
                if (stringBuffer.length() > 0) {
                    stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                }
            } catch (Throwable unused) {
            }
            return stringBuffer.toString();
        }

        public String getFilterString() {
            StringBuffer stringBuffer = new StringBuffer();
            try {
                for (Map.Entry<String, String> entry : this.f24938h.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    stringBuffer.append(key.toString());
                    stringBuffer.append(Constants.COLON_SEPARATOR);
                    stringBuffer.append(value.toString());
                    stringBuffer.append("+");
                }
                if (stringBuffer.length() > 0) {
                    stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                }
            } catch (Throwable unused) {
            }
            return stringBuffer.toString();
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            ArrayList<C1800aa> arrayList = this.f24937g;
            int i = 0;
            if (arrayList == null) {
                hashCode = 0;
            } else {
                hashCode = arrayList.hashCode();
            }
            int i2 = (hashCode + 31) * 31;
            HashMap<String, String> hashMap = this.f24938h;
            if (hashMap == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = hashMap.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            SearchBound searchBound = this.f24935e;
            if (searchBound == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = searchBound.hashCode();
            }
            int i4 = (((((i3 + hashCode3) * 31) + this.f24932b) * 31) + this.f24933c) * 31;
            String str = this.f24931a;
            if (str == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str.hashCode();
            }
            int i5 = (i4 + hashCode4) * 31;
            Sortingrules sortingrules = this.f24936f;
            if (sortingrules == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = sortingrules.hashCode();
            }
            int i6 = (i5 + hashCode5) * 31;
            String str2 = this.f24934d;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return i6 + i;
        }

        public void setBound(SearchBound searchBound) {
            this.f24935e = searchBound;
        }

        public void setPageNum(int i) {
            this.f24932b = i;
        }

        public void setSortingrules(Sortingrules sortingrules) {
            this.f24936f = sortingrules;
        }

        public void setTableID(String str) {
            this.f24934d = str;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof Query)) {
                if (obj == this) {
                    return true;
                }
                Query query = (Query) obj;
                if (queryEquals(query) && query.f24932b == this.f24932b) {
                    return true;
                }
            }
            return false;
        }

        public void setPageSize(int i) {
            if (i <= 0) {
                this.f24933c = 20;
            } else if (i > 100) {
                this.f24933c = 100;
            } else {
                this.f24933c = i;
            }
        }

        public boolean queryEquals(Query query) {
            if (query == null) {
                return false;
            }
            if (query == this) {
                return true;
            }
            if (!CloudSearch.m16233b(query.f24931a, this.f24931a) || !CloudSearch.m16233b(query.getTableID(), getTableID()) || !CloudSearch.m16233b(query.getFilterString(), getFilterString()) || !CloudSearch.m16233b(query.getFilterNumString(), getFilterNumString()) || query.f24933c != this.f24933c || !m16231a(query.getBound(), getBound()) || !m16230a(query.getSortingrules(), getSortingrules())) {
                return false;
            }
            return true;
        }

        public void addFilterString(String str, String str2) {
            this.f24938h.put(str, str2);
        }

        /* renamed from: a */
        private boolean m16231a(SearchBound searchBound, SearchBound searchBound2) {
            if (searchBound == null) {
                if (searchBound2 == null) {
                    return true;
                }
                return false;
            } else if (searchBound2 != null) {
                return searchBound.equals(searchBound2);
            } else {
                return false;
            }
        }

        /* renamed from: a */
        private boolean m16230a(Sortingrules sortingrules, Sortingrules sortingrules2) {
            if (sortingrules == null) {
                if (sortingrules2 == null) {
                    return true;
                }
                return false;
            } else if (sortingrules2 != null) {
                return sortingrules.equals(sortingrules2);
            } else {
                return false;
            }
        }

        public void addFilterNum(String str, String str2, String str3) {
            this.f24937g.add(new C1800aa(str, str2, str3));
        }

        public Query(String str, String str2, SearchBound searchBound) {
            if (!C2007j.m16372a(str) && searchBound != null) {
                this.f24934d = str;
                this.f24931a = str2;
                this.f24935e = searchBound;
                return;
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
    }

    /* loaded from: classes19.dex */
    public static class SearchBound implements Cloneable {

        /* renamed from: a */
        public LatLonPoint f24939a;

        /* renamed from: b */
        public LatLonPoint f24940b;

        /* renamed from: c */
        public int f24941c;

        /* renamed from: d */
        public LatLonPoint f24942d;

        /* renamed from: e */
        public String f24943e;

        /* renamed from: f */
        public List<LatLonPoint> f24944f;

        /* renamed from: g */
        public String f24945g;

        static {
            Covode.recordClassIndex(5672);
        }

        public LatLonPoint getCenter() {
            return this.f24942d;
        }

        public String getCity() {
            return this.f24945g;
        }

        public LatLonPoint getLowerLeft() {
            return this.f24939a;
        }

        public List<LatLonPoint> getPolyGonList() {
            return this.f24944f;
        }

        public int getRange() {
            return this.f24941c;
        }

        public String getShape() {
            return this.f24943e;
        }

        public LatLonPoint getUpperRight() {
            return this.f24940b;
        }

        /* renamed from: a */
        private List<LatLonPoint> m16228a() {
            if (this.f24944f == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (LatLonPoint latLonPoint : this.f24944f) {
                arrayList.add(new LatLonPoint(latLonPoint.getLatitude(), latLonPoint.getLongitude()));
            }
            return arrayList;
        }

        /* renamed from: clone */
        public SearchBound m25285clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            if (getShape().equals("Bound")) {
                return new SearchBound(this.f24942d, this.f24941c);
            }
            if (getShape().equals("Polygon")) {
                return new SearchBound(m16228a());
            }
            if (getShape().equals("Local")) {
                return new SearchBound(this.f24945g);
            }
            return new SearchBound(this.f24939a, this.f24940b);
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            LatLonPoint latLonPoint = this.f24942d;
            int i = 0;
            if (latLonPoint == null) {
                hashCode = 0;
            } else {
                hashCode = latLonPoint.hashCode();
            }
            int i2 = (hashCode + 31) * 31;
            LatLonPoint latLonPoint2 = this.f24939a;
            if (latLonPoint2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = latLonPoint2.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            LatLonPoint latLonPoint3 = this.f24940b;
            if (latLonPoint3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = latLonPoint3.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            List<LatLonPoint> list = this.f24944f;
            if (list == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = list.hashCode();
            }
            int i5 = (((i4 + hashCode4) * 31) + this.f24941c) * 31;
            String str = this.f24943e;
            if (str == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str.hashCode();
            }
            int i6 = (i5 + hashCode5) * 31;
            String str2 = this.f24945g;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return i6 + i;
        }

        public SearchBound(String str) {
            this.f24943e = "Local";
            this.f24945g = str;
        }

        public SearchBound(List<LatLonPoint> list) {
            this.f24943e = "Polygon";
            this.f24944f = list;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof SearchBound)) {
                SearchBound searchBound = (SearchBound) obj;
                if (!getShape().equalsIgnoreCase(searchBound.getShape())) {
                    return false;
                }
                if (getShape().equals("Bound")) {
                    if (!searchBound.f24942d.equals(this.f24942d) || searchBound.f24941c != this.f24941c) {
                        return false;
                    }
                    return true;
                } else if (getShape().equals("Polygon")) {
                    return m16226a(searchBound.f24944f, this.f24944f);
                } else {
                    if (getShape().equals("Local")) {
                        return searchBound.f24945g.equals(this.f24945g);
                    }
                    if (searchBound.f24939a.equals(this.f24939a) && searchBound.f24940b.equals(this.f24940b)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public SearchBound(LatLonPoint latLonPoint, int i) {
            this.f24943e = "Bound";
            this.f24941c = i;
            this.f24942d = latLonPoint;
        }

        public SearchBound(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f24943e = "Rectangle";
            if (!m16227a(latLonPoint, latLonPoint2)) {
                new IllegalArgumentException("invalid rect ").printStackTrace();
            }
        }

        /* renamed from: a */
        private boolean m16227a(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f24939a = latLonPoint;
            this.f24940b = latLonPoint2;
            LatLonPoint latLonPoint3 = this.f24939a;
            if (latLonPoint3 == null || this.f24940b == null || latLonPoint3.getLatitude() >= this.f24940b.getLatitude() || this.f24939a.getLongitude() >= this.f24940b.getLongitude()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private boolean m16226a(List<LatLonPoint> list, List<LatLonPoint> list2) {
            if (list == null && list2 == null) {
                return true;
            }
            if (list == null || list2 == null || list.size() != list2.size()) {
                return false;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!list.get(i).equals(list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: classes19.dex */
    public static class Sortingrules {

        /* renamed from: a */
        public int f24946a;

        /* renamed from: b */
        public String f24947b;

        /* renamed from: c */
        public boolean f24948c;

        static {
            Covode.recordClassIndex(5673);
        }

        public int hashCode() {
            int i;
            int hashCode;
            if (this.f24948c) {
                i = 1231;
            } else {
                i = 1237;
            }
            int i2 = (i + 31) * 31;
            String str = this.f24947b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return ((i2 + hashCode) * 31) + this.f24946a;
        }

        public String toString() {
            if (C2007j.m16372a(this.f24947b)) {
                int i = this.f24946a;
                if (i == 0) {
                    return "_weight";
                }
                if (i == 1) {
                    return "_distance";
                }
                return "";
            } else if (this.f24948c) {
                new StringBuilder();
                return C0002O.m25086C(this.f24947b, ":1");
            } else {
                new StringBuilder();
                return C0002O.m25086C(this.f24947b, ":0");
            }
        }

        public Sortingrules(int i) {
            this.f24948c = true;
            this.f24946a = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Sortingrules sortingrules = (Sortingrules) obj;
            if (this.f24948c != sortingrules.f24948c) {
                return false;
            }
            String str = this.f24947b;
            if (str == null) {
                if (sortingrules.f24947b != null) {
                    return false;
                }
            } else if (!str.equals(sortingrules.f24947b)) {
                return false;
            }
            if (this.f24946a == sortingrules.f24946a) {
                return true;
            }
            return false;
        }

        public Sortingrules(String str, boolean z) {
            this.f24948c = true;
            this.f24947b = str;
            this.f24948c = z;
        }
    }

    public void searchCloudAsyn(Query query) {
        ICloudSearch iCloudSearch = this.f24930a;
        if (iCloudSearch != null) {
            iCloudSearch.searchCloudAsyn(query);
        }
    }

    public void setOnCloudSearchListener(OnCloudSearchListener onCloudSearchListener) {
        ICloudSearch iCloudSearch = this.f24930a;
        if (iCloudSearch != null) {
            iCloudSearch.setOnCloudSearchListener(onCloudSearchListener);
        }
    }

    public CloudSearch(Context context) {
        try {
            this.f24930a = (ICloudSearch) C1930cr.m16606a(context, C2006i.m16379a(true), "com.amap.api.services.dynamic.CloudSearchWrapper", C1821as.class, new Class[]{Context.class}, new Object[]{context});
        } catch (C1863be e) {
            e.printStackTrace();
        }
        if (this.f24930a == null) {
            try {
                this.f24930a = new C1821as(context);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void searchCloudDetailAsyn(String str, String str2) {
        ICloudSearch iCloudSearch = this.f24930a;
        if (iCloudSearch != null) {
            iCloudSearch.searchCloudDetailAsyn(str, str2);
        }
    }

    /* renamed from: b */
    public static boolean m16233b(String str, String str2) {
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
}
