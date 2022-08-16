package com.amap.api.services.p126a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.ec */
/* loaded from: classes19.dex */
public class C1994ec extends AbstractC1997ef {

    /* renamed from: b */
    public Context f24804b;

    /* renamed from: c */
    public boolean f24805c;

    /* renamed from: d */
    public int f24806d;

    /* renamed from: e */
    public int f24807e;

    static {
        Covode.recordClassIndex(5605);
    }

    @Override // com.amap.api.services.p126a.AbstractC1997ef
    /* renamed from: b */
    public int mo16400b() {
        int i;
        if (C1878bj.m16873s(this.f24804b) == 1 || (i = this.f24806d) <= 0) {
            i = Integer.MAX_VALUE;
        }
        if (this.f24813a != null) {
            return Math.max(i, this.f24813a.mo16400b());
        }
        return i;
    }

    @Override // com.amap.api.services.p126a.AbstractC1997ef
    /* renamed from: a */
    public boolean mo16397a() {
        if (C1878bj.m16873s(this.f24804b) == 1) {
            return true;
        }
        if (!this.f24805c) {
            return false;
        }
        String m16740a = C1902bz.m16740a(this.f24804b, "iKey");
        if (TextUtils.isEmpty(m16740a)) {
            return true;
        }
        String[] split = m16740a.split("\\|");
        if (split != null && split.length >= 2) {
            if (!C1892bp.m16794a(System.currentTimeMillis(), "yyyyMMdd").equals(split[0]) || Integer.parseInt(split[1]) < this.f24807e) {
                return true;
            }
            return false;
        }
        C1902bz.m16735b(this.f24804b, "iKey");
        return true;
    }

    @Override // com.amap.api.services.p126a.AbstractC1997ef
    /* renamed from: a */
    public void mo16402a(int i) {
        if (C1878bj.m16873s(this.f24804b) == 1) {
            return;
        }
        String m16794a = C1892bp.m16794a(System.currentTimeMillis(), "yyyyMMdd");
        String m16740a = C1902bz.m16740a(this.f24804b, "iKey");
        if (!TextUtils.isEmpty(m16740a)) {
            String[] split = m16740a.split("\\|");
            if (split != null && split.length >= 2) {
                if (m16794a.equals(split[0])) {
                    i += Integer.parseInt(split[1]);
                }
            } else {
                C1902bz.m16735b(this.f24804b, "iKey");
            }
        }
        Context context = this.f24804b;
        C1902bz.m16739a(context, "iKey", m16794a + "|" + i);
    }

    public C1994ec(Context context, boolean z, int i, int i2) {
        this.f24804b = context;
        this.f24805c = z;
        this.f24806d = i;
        this.f24807e = i2;
    }
}
