package com.amap.api.mapcore2d;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.umeng.analytics.pro.C33764r;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.amap.api.mapcore2d.bs */
/* loaded from: classes19.dex */
public class C1541bs implements Cloneable {

    /* renamed from: a */
    public int f23052a;

    /* renamed from: b */
    public final int f23053b;

    /* renamed from: c */
    public final int f23054c;

    /* renamed from: d */
    public final int f23055d;

    /* renamed from: e */
    public final int f23056e;

    /* renamed from: f */
    public final boolean f23057f;

    /* renamed from: g */
    public PointF f23058g;

    /* renamed from: h */
    public int f23059h = -1;

    /* renamed from: i */
    public boolean f23060i;

    /* renamed from: j */
    public String f23061j;

    static {
        Covode.recordClassIndex(5089);
    }

    /* renamed from: c */
    public String m18257c() {
        return this.f23061j;
    }

    /* renamed from: a */
    public C1541bs clone() {
        return new C1541bs(this);
    }

    public int hashCode() {
        return (this.f23053b * 7) + (this.f23054c * 11) + (this.f23055d * 13) + this.f23056e;
    }

    /* renamed from: b */
    public void m18258b() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f23053b);
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        sb.append(this.f23054c);
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        sb.append(this.f23055d);
        if (this.f23057f && C1771q.f24020i == 1) {
            sb.append(C33764r.f42396f);
        }
        this.f23061j = sb.toString();
    }

    public String toString() {
        return this.f23053b + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.f23054c + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.f23055d + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.f23056e;
    }

    public C1541bs(C1541bs c1541bs) {
        this.f23053b = c1541bs.f23053b;
        this.f23054c = c1541bs.f23054c;
        this.f23055d = c1541bs.f23055d;
        this.f23056e = c1541bs.f23056e;
        this.f23058g = c1541bs.f23058g;
        this.f23052a = c1541bs.f23052a;
        this.f23057f = !C1568cl.m18162a(this.f23053b, this.f23054c, this.f23055d);
        m18258b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1541bs)) {
            return false;
        }
        C1541bs c1541bs = (C1541bs) obj;
        if (this.f23053b == c1541bs.f23053b && this.f23054c == c1541bs.f23054c && this.f23055d == c1541bs.f23055d && this.f23056e == c1541bs.f23056e) {
            return true;
        }
        return false;
    }

    public C1541bs(int i, int i2, int i3, int i4) {
        this.f23053b = i;
        this.f23054c = i2;
        this.f23055d = i3;
        this.f23056e = i4;
        this.f23057f = !C1568cl.m18162a(this.f23053b, this.f23054c, this.f23055d);
        m18258b();
    }
}
