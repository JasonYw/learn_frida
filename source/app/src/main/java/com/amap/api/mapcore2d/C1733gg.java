package com.amap.api.mapcore2d;

import android.text.TextUtils;
import com.autonavi.amap.mapcore2d.Inner_3dMap_location;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.amap.api.mapcore2d.gg */
/* loaded from: classes19.dex */
public final class C1733gg extends Inner_3dMap_location {

    /* renamed from: b */
    public String f23684b;

    /* renamed from: d */
    public int f23686d;

    /* renamed from: g */
    public JSONObject f23689g;

    /* renamed from: j */
    public long f23692j;

    /* renamed from: k */
    public String f23693k;

    /* renamed from: c */
    public String f23685c = "";

    /* renamed from: e */
    public String f23687e = "";

    /* renamed from: f */
    public String f23688f = "new";

    /* renamed from: h */
    public String f23690h = "";

    /* renamed from: a */
    public boolean f23683a = true;

    /* renamed from: i */
    public String f23691i = "";

    static {
        Covode.recordClassIndex(5281);
    }

    public C1733gg(String str) {
        super(str);
    }

    /* renamed from: a */
    public final String m17466a() {
        return this.f23684b;
    }

    /* renamed from: a */
    public final void m17465a(String str) {
        this.f23684b = str;
    }

    /* renamed from: b */
    public final String m17464b() {
        return this.f23685c;
    }

    /* renamed from: b */
    public final void m17463b(String str) {
        this.f23685c = str;
    }

    /* renamed from: c */
    public final int m17462c() {
        return this.f23686d;
    }

    /* renamed from: c */
    public final void m17461c(String str) {
        int i;
        if (!TextUtils.isEmpty(str)) {
            if (getProvider().equals("gps")) {
                this.f23686d = 0;
                return;
            } else if (str.equals("0")) {
                this.f23686d = 0;
                return;
            } else if (str.equals("1")) {
                i = 1;
                this.f23686d = i;
            }
        }
        i = -1;
        this.f23686d = i;
    }

    /* renamed from: d */
    public final String m17460d() {
        return this.f23687e;
    }

    /* renamed from: d */
    public final void m17459d(String str) {
        this.f23687e = str;
    }

    /* renamed from: e */
    public final JSONObject m17458e() {
        return this.f23689g;
    }

    /* renamed from: e */
    public final void m17457e(String str) {
        this.desc = str;
    }

    @Override // com.autonavi.amap.mapcore2d.Inner_3dMap_location
    public final void setFloor(String str) {
        if (!TextUtils.isEmpty(str)) {
            str = str.replace("F", "");
            try {
                Integer.parseInt(str);
            } catch (Throwable th) {
                str = null;
                C1752gu.m17302a(th, "MapLocationModel", "setFloor");
            }
        }
        this.floor = str;
    }

    @Override // com.autonavi.amap.mapcore2d.Inner_3dMap_location
    public final JSONObject toJson(int i) {
        try {
            JSONObject json = super.toJson(i);
            if (i == 1) {
                json.put("retype", this.f23687e);
                json.put("cens", this.f23691i);
                json.put("poiid", this.buildingId);
                json.put("floor", this.floor);
                json.put("coord", this.f23686d);
                json.put("mcell", this.f23690h);
                json.put("desc", this.desc);
                json.put("address", getAddress());
                if (this.f23689g != null && C1757gy.m17268a(json, "offpct")) {
                    json.put("offpct", this.f23689g.getString("offpct"));
                }
            } else if (i != 2 && i != 3) {
                return json;
            }
            json.put("type", this.f23688f);
            json.put("isReversegeo", this.f23683a);
            return json;
        } catch (Throwable th) {
            C1752gu.m17302a(th, "MapLocationModel", "toStr");
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore2d.Inner_3dMap_location
    public final String toStr(int i) {
        JSONObject jSONObject;
        try {
            jSONObject = super.toJson(i);
            jSONObject.put("nb", this.f23693k);
        } catch (Throwable th) {
            C1752gu.m17302a(th, "MapLocationModel", "toStr part2");
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }
}
