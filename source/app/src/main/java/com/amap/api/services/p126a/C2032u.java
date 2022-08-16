package com.amap.api.services.p126a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.u */
/* loaded from: classes19.dex */
public class C2032u extends AbstractC1843b<String, Integer> {

    /* renamed from: i */
    public Context f24863i;

    /* renamed from: j */
    public String f24864j;

    static {
        Covode.recordClassIndex(5643);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        new StringBuilder();
        return C0002O.m25086C(C2006i.m16377c(), "/nearby/data/delete");
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(C1864bf.m16960f(this.f24863i));
        stringBuffer.append("&userid=");
        stringBuffer.append(this.f24864j);
        return stringBuffer.toString();
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: e */
    public Integer mo16254a(String str) {
        return 0;
    }

    public C2032u(Context context, String str) {
        super(context, str);
        this.f24863i = context;
        this.f24864j = str;
    }
}
