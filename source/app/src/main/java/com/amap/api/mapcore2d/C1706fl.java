package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.amap.api.mapcore2d.fl */
/* loaded from: classes19.dex */
public class C1706fl extends AbstractC1709fo {

    /* renamed from: a */
    public StringBuilder f23620a = new StringBuilder();

    /* renamed from: b */
    public boolean f23621b = true;

    static {
        Covode.recordClassIndex(5254);
    }

    public C1706fl() {
    }

    public C1706fl(AbstractC1709fo abstractC1709fo) {
        super(abstractC1709fo);
    }

    @Override // com.amap.api.mapcore2d.AbstractC1709fo
    /* renamed from: a */
    public byte[] mo17513a(byte[] bArr) {
        byte[] m17940a = C1602db.m17940a(this.f23620a.toString());
        m17514c(m17940a);
        this.f23621b = true;
        StringBuilder sb = this.f23620a;
        sb.delete(0, sb.length());
        return m17940a;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1709fo
    /* renamed from: b */
    public void mo17515b(byte[] bArr) {
        String m17936a = C1602db.m17936a(bArr);
        if (this.f23621b) {
            this.f23621b = false;
        } else {
            this.f23620a.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        StringBuilder sb = this.f23620a;
        sb.append("{\"log\":\"");
        sb.append(m17936a);
        sb.append("\"}");
    }
}
