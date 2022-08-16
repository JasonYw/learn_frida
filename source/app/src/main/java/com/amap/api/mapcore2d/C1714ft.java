package com.amap.api.mapcore2d;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.ft */
/* loaded from: classes19.dex */
public class C1714ft extends AbstractC1715fu {

    /* renamed from: b */
    public int f23634b;

    /* renamed from: c */
    public long f23635c;

    /* renamed from: d */
    public String f23636d;

    /* renamed from: e */
    public Context f23637e;

    static {
        Covode.recordClassIndex(5262);
    }

    @Override // com.amap.api.mapcore2d.AbstractC1715fu
    /* renamed from: a */
    public boolean mo17504a() {
        if (this.f23635c == 0) {
            this.f23635c = m17511a(this.f23636d);
        }
        if (System.currentTimeMillis() - this.f23635c < this.f23634b) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private long m17511a(String str) {
        String m17889a = C1613dm.m17889a(this.f23637e, str);
        if (TextUtils.isEmpty(m17889a)) {
            return 0L;
        }
        return Long.parseLong(m17889a);
    }

    @Override // com.amap.api.mapcore2d.AbstractC1715fu
    /* renamed from: a */
    public void mo17508a(boolean z) {
        super.mo17508a(z);
        if (z) {
            m17510a(this.f23636d, System.currentTimeMillis());
        }
    }

    /* renamed from: a */
    private void m17510a(String str, long j) {
        this.f23635c = j;
        C1613dm.m17888a(this.f23637e, str, String.valueOf(j));
    }

    public C1714ft(Context context, int i, String str, AbstractC1715fu abstractC1715fu) {
        super(abstractC1715fu);
        this.f23634b = i;
        this.f23636d = str;
        this.f23637e = context;
    }
}
