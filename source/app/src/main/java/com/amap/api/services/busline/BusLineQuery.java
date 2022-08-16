package com.amap.api.services.busline;

import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class BusLineQuery implements Cloneable {

    /* renamed from: a */
    public String f24887a;

    /* renamed from: b */
    public String f24888b;

    /* renamed from: c */
    public int f24889c = 20;

    /* renamed from: d */
    public int f24890d = 1;

    /* renamed from: e */
    public SearchType f24891e;

    static {
        Covode.recordClassIndex(5651);
    }

    public SearchType getCategory() {
        return this.f24891e;
    }

    public String getCity() {
        return this.f24888b;
    }

    public int getPageNumber() {
        return this.f24890d;
    }

    public int getPageSize() {
        return this.f24889c;
    }

    public String getQueryString() {
        return this.f24887a;
    }

    /* renamed from: clone */
    public BusLineQuery m25282clone() {
        BusLineQuery busLineQuery = new BusLineQuery(this.f24887a, this.f24891e, this.f24888b);
        busLineQuery.setPageNumber(this.f24890d);
        busLineQuery.setPageSize(this.f24889c);
        return busLineQuery;
    }

    /* loaded from: classes18.dex */
    public enum SearchType {
        BY_LINE_ID,
        BY_LINE_NAME;

        static {
            Covode.recordClassIndex(5652);
        }
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        SearchType searchType = this.f24891e;
        int i = 0;
        if (searchType == null) {
            hashCode = 0;
        } else {
            hashCode = searchType.hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        String str = this.f24888b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (((((i2 + hashCode2) * 31) + this.f24890d) * 31) + this.f24889c) * 31;
        String str2 = this.f24887a;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }

    public void setCategory(SearchType searchType) {
        this.f24891e = searchType;
    }

    public void setCity(String str) {
        this.f24888b = str;
    }

    public void setPageSize(int i) {
        this.f24889c = i;
    }

    public void setQueryString(String str) {
        this.f24887a = str;
    }

    public void setPageNumber(int i) {
        if (i <= 0) {
            i = 1;
        }
        this.f24890d = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BusLineQuery busLineQuery = (BusLineQuery) obj;
        if (this.f24891e != busLineQuery.f24891e) {
            return false;
        }
        String str = this.f24888b;
        if (str == null) {
            if (busLineQuery.f24888b != null) {
                return false;
            }
        } else if (!str.equals(busLineQuery.f24888b)) {
            return false;
        }
        if (this.f24890d != busLineQuery.f24890d || this.f24889c != busLineQuery.f24889c) {
            return false;
        }
        String str2 = this.f24887a;
        if (str2 == null) {
            if (busLineQuery.f24887a != null) {
                return false;
            }
        } else if (!str2.equals(busLineQuery.f24887a)) {
            return false;
        }
        return true;
    }

    public boolean weakEquals(BusLineQuery busLineQuery) {
        if (this == busLineQuery) {
            return true;
        }
        if (busLineQuery == null) {
            return false;
        }
        if (this.f24887a == null) {
            if (busLineQuery.getQueryString() != null) {
                return false;
            }
        } else if (!busLineQuery.getQueryString().equals(this.f24887a)) {
            return false;
        }
        if (this.f24888b == null) {
            if (busLineQuery.getCity() != null) {
                return false;
            }
        } else if (!busLineQuery.getCity().equals(this.f24888b)) {
            return false;
        }
        if (this.f24889c == busLineQuery.getPageSize() && busLineQuery.getCategory().compareTo(this.f24891e) == 0) {
            return true;
        }
        return false;
    }

    public BusLineQuery(String str, SearchType searchType, String str2) {
        this.f24887a = str;
        this.f24891e = searchType;
        this.f24888b = str2;
    }
}
