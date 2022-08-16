package com.amap.api.services.p126a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.ee */
/* loaded from: classes19.dex */
public class C1996ee extends AbstractC1997ef {

    /* renamed from: b */
    public int f24809b;

    /* renamed from: c */
    public long f24810c;

    /* renamed from: d */
    public String f24811d;

    /* renamed from: e */
    public Context f24812e;

    static {
        Covode.recordClassIndex(5607);
    }

    @Override // com.amap.api.services.p126a.AbstractC1997ef
    /* renamed from: a */
    public boolean mo16397a() {
        if (this.f24810c == 0) {
            this.f24810c = m16404a(this.f24811d);
        }
        if (System.currentTimeMillis() - this.f24810c < this.f24809b) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private long m16404a(String str) {
        String m16740a = C1902bz.m16740a(this.f24812e, str);
        if (TextUtils.isEmpty(m16740a)) {
            return 0L;
        }
        return Long.parseLong(m16740a);
    }

    @Override // com.amap.api.services.p126a.AbstractC1997ef
    /* renamed from: a */
    public void mo16401a(boolean z) {
        super.mo16401a(z);
        if (z) {
            m16403a(this.f24811d, System.currentTimeMillis());
        }
    }

    /* renamed from: a */
    private void m16403a(String str, long j) {
        this.f24810c = j;
        C1902bz.m16739a(this.f24812e, str, String.valueOf(j));
    }

    public C1996ee(Context context, int i, String str, AbstractC1997ef abstractC1997ef) {
        super(abstractC1997ef);
        this.f24809b = i;
        this.f24811d = str;
        this.f24812e = context;
    }
}
