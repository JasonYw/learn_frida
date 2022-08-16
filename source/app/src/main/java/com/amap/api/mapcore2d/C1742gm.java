package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.Locale;

/* renamed from: com.amap.api.mapcore2d.gm */
/* loaded from: classes19.dex */
public final class C1742gm {

    /* renamed from: a */
    public int f23733a;

    /* renamed from: b */
    public int f23734b;

    /* renamed from: c */
    public int f23735c;

    /* renamed from: d */
    public int f23736d;

    /* renamed from: e */
    public int f23737e;

    /* renamed from: f */
    public int f23738f;

    /* renamed from: g */
    public int f23739g;

    /* renamed from: h */
    public int f23740h;

    /* renamed from: i */
    public int f23741i;

    /* renamed from: k */
    public int f23743k;

    /* renamed from: l */
    public short f23744l;

    /* renamed from: m */
    public long f23745m;

    /* renamed from: n */
    public boolean f23746n;

    /* renamed from: j */
    public int f23742j = -113;

    /* renamed from: o */
    public int f23747o = 32767;

    /* renamed from: p */
    public boolean f23748p = true;

    static {
        Covode.recordClassIndex(5290);
    }

    public C1742gm(int i, boolean z) {
        this.f23743k = i;
        this.f23746n = z;
    }

    /* renamed from: a */
    public final int m17425a() {
        return this.f23735c;
    }

    /* renamed from: b */
    public final int m17424b() {
        return this.f23736d;
    }

    /* renamed from: c */
    public final int m17423c() {
        return this.f23740h;
    }

    /* renamed from: d */
    public final int m17422d() {
        return this.f23741i;
    }

    /* renamed from: e */
    public final int m17421e() {
        return this.f23742j;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1742gm)) {
            C1742gm c1742gm = (C1742gm) obj;
            int i = c1742gm.f23743k;
            if (i != 1) {
                return i != 2 ? i != 3 ? i == 4 && this.f23743k == 4 && c1742gm.f23735c == this.f23735c && c1742gm.f23736d == this.f23736d && c1742gm.f23734b == this.f23734b : this.f23743k == 3 && c1742gm.f23735c == this.f23735c && c1742gm.f23736d == this.f23736d && c1742gm.f23734b == this.f23734b : this.f23743k == 2 && c1742gm.f23741i == this.f23741i && c1742gm.f23740h == this.f23740h && c1742gm.f23739g == this.f23739g;
            } else if (this.f23743k == 1 && c1742gm.f23735c == this.f23735c && c1742gm.f23736d == this.f23736d && c1742gm.f23734b == this.f23734b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = String.valueOf(this.f23743k).hashCode();
        if (this.f23743k == 2) {
            hashCode = String.valueOf(this.f23741i).hashCode() + String.valueOf(this.f23740h).hashCode();
            i = this.f23739g;
        } else {
            hashCode = String.valueOf(this.f23735c).hashCode() + String.valueOf(this.f23736d).hashCode();
            i = this.f23734b;
        }
        return hashCode2 + hashCode + String.valueOf(i).hashCode();
    }

    public final String toString() {
        int i = this.f23743k;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? LoggerUtil.UNKNOWN : String.format(Locale.CHINA, "WCDMA lac=%d, cid=%d, mnc=%s, valid=%b, sig=%d, age=%d, reg=%b, pci=%d", Integer.valueOf(this.f23735c), Integer.valueOf(this.f23736d), Integer.valueOf(this.f23734b), Boolean.valueOf(this.f23748p), Integer.valueOf(this.f23742j), Short.valueOf(this.f23744l), Boolean.valueOf(this.f23746n), Integer.valueOf(this.f23747o)) : String.format(Locale.CHINA, "LTE lac=%d, cid=%d, mnc=%s, valid=%b, sig=%d, age=%d, reg=%b, pci=%d", Integer.valueOf(this.f23735c), Integer.valueOf(this.f23736d), Integer.valueOf(this.f23734b), Boolean.valueOf(this.f23748p), Integer.valueOf(this.f23742j), Short.valueOf(this.f23744l), Boolean.valueOf(this.f23746n), Integer.valueOf(this.f23747o)) : String.format(Locale.CHINA, "CDMA bid=%d, nid=%d, sid=%d, valid=%b, sig=%d, age=%d, reg=%b", Integer.valueOf(this.f23741i), Integer.valueOf(this.f23740h), Integer.valueOf(this.f23739g), Boolean.valueOf(this.f23748p), Integer.valueOf(this.f23742j), Short.valueOf(this.f23744l), Boolean.valueOf(this.f23746n)) : String.format(Locale.CHINA, "GSM lac=%d, cid=%d, mnc=%s, valid=%b, sig=%d, age=%d, reg=%b", Integer.valueOf(this.f23735c), Integer.valueOf(this.f23736d), Integer.valueOf(this.f23734b), Boolean.valueOf(this.f23748p), Integer.valueOf(this.f23742j), Short.valueOf(this.f23744l), Boolean.valueOf(this.f23746n));
    }
}
