package com.amap.api.services.busline;

import com.amap.api.services.p126a.C2007j;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class BusStationQuery implements Cloneable {

    /* renamed from: a */
    public String f24905a;

    /* renamed from: b */
    public String f24906b;

    /* renamed from: c */
    public int f24907c = 20;

    /* renamed from: d */
    public int f24908d = 1;

    static {
        Covode.recordClassIndex(5658);
    }

    public String getCity() {
        return this.f24906b;
    }

    public int getPageNumber() {
        return this.f24908d;
    }

    public int getPageSize() {
        return this.f24907c;
    }

    public String getQueryString() {
        return this.f24905a;
    }

    /* renamed from: a */
    private boolean m16243a() {
        if (!C2007j.m16372a(this.f24905a)) {
            return true;
        }
        return false;
    }

    /* renamed from: clone */
    public BusStationQuery m25283clone() {
        BusStationQuery busStationQuery = new BusStationQuery(this.f24905a, this.f24906b);
        busStationQuery.setPageNumber(this.f24908d);
        busStationQuery.setPageSize(this.f24907c);
        return busStationQuery;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f24906b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (((((hashCode + 31) * 31) + this.f24908d) * 31) + this.f24907c) * 31;
        String str2 = this.f24905a;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public void setCity(String str) {
        this.f24906b = str;
    }

    public void setPageSize(int i) {
        this.f24907c = i;
    }

    public void setQueryString(String str) {
        this.f24905a = str;
    }

    public void setPageNumber(int i) {
        if (i <= 0) {
            i = 1;
        }
        this.f24908d = i;
    }

    public boolean weakEquals(BusStationQuery busStationQuery) {
        if (this == busStationQuery) {
            return true;
        }
        if (busStationQuery == null) {
            return false;
        }
        String str = this.f24906b;
        if (str == null) {
            if (busStationQuery.f24906b != null) {
                return false;
            }
        } else if (!str.equals(busStationQuery.f24906b)) {
            return false;
        }
        if (this.f24907c != busStationQuery.f24907c) {
            return false;
        }
        String str2 = this.f24905a;
        if (str2 == null) {
            if (busStationQuery.f24905a != null) {
                return false;
            }
        } else if (!str2.equals(busStationQuery.f24905a)) {
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
        BusStationQuery busStationQuery = (BusStationQuery) obj;
        String str = this.f24906b;
        if (str == null) {
            if (busStationQuery.f24906b != null) {
                return false;
            }
        } else if (!str.equals(busStationQuery.f24906b)) {
            return false;
        }
        if (this.f24908d != busStationQuery.f24908d || this.f24907c != busStationQuery.f24907c) {
            return false;
        }
        String str2 = this.f24905a;
        if (str2 == null) {
            if (busStationQuery.f24905a != null) {
                return false;
            }
        } else if (!str2.equals(busStationQuery.f24905a)) {
            return false;
        }
        return true;
    }

    public BusStationQuery(String str, String str2) {
        this.f24905a = str;
        this.f24906b = str2;
        if (!m16243a()) {
            new IllegalArgumentException("Empty query").printStackTrace();
        }
    }
}
