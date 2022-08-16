package com.amap.api.mapcore2d;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.fr */
/* loaded from: classes19.dex */
public class C1712fr extends AbstractC1715fu {

    /* renamed from: b */
    public Context f23629b;

    /* renamed from: c */
    public boolean f23630c;

    /* renamed from: d */
    public int f23631d;

    /* renamed from: e */
    public int f23632e;

    static {
        Covode.recordClassIndex(5260);
    }

    @Override // com.amap.api.mapcore2d.AbstractC1715fu
    /* renamed from: b */
    public int mo17507b() {
        int i;
        if (C1587cu.m18035r(this.f23629b) == 1 || (i = this.f23631d) <= 0) {
            i = Integer.MAX_VALUE;
        }
        if (this.f23638a != null) {
            return Math.max(i, this.f23638a.mo17507b());
        }
        return i;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1715fu
    /* renamed from: a */
    public boolean mo17504a() {
        if (C1587cu.m18035r(this.f23629b) == 1) {
            return true;
        }
        if (!this.f23630c) {
            return false;
        }
        String m17889a = C1613dm.m17889a(this.f23629b, "iKey");
        if (TextUtils.isEmpty(m17889a)) {
            return true;
        }
        String[] split = m17889a.split("\\|");
        if (split != null && split.length >= 2) {
            if (!C1602db.m17948a(System.currentTimeMillis(), "yyyyMMdd").equals(split[0]) || Integer.parseInt(split[1]) < this.f23632e) {
                return true;
            }
            return false;
        }
        C1613dm.m17884b(this.f23629b, "iKey");
        return true;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1715fu
    /* renamed from: a */
    public void mo17509a(int i) {
        if (C1587cu.m18035r(this.f23629b) == 1) {
            return;
        }
        String m17948a = C1602db.m17948a(System.currentTimeMillis(), "yyyyMMdd");
        String m17889a = C1613dm.m17889a(this.f23629b, "iKey");
        if (!TextUtils.isEmpty(m17889a)) {
            String[] split = m17889a.split("\\|");
            if (split != null && split.length >= 2) {
                if (m17948a.equals(split[0])) {
                    i += Integer.parseInt(split[1]);
                }
            } else {
                C1613dm.m17884b(this.f23629b, "iKey");
            }
        }
        Context context = this.f23629b;
        C1613dm.m17888a(context, "iKey", m17948a + "|" + i);
    }

    public C1712fr(Context context, boolean z, int i, int i2) {
        this.f23629b = context;
        this.f23630c = z;
        this.f23631d = i;
        this.f23632e = i2;
    }
}
