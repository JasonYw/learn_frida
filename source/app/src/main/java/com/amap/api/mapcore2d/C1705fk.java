package com.amap.api.mapcore2d;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;

/* renamed from: com.amap.api.mapcore2d.fk */
/* loaded from: classes19.dex */
public class C1705fk extends AbstractC1709fo {

    /* renamed from: a */
    public Context f23616a;

    /* renamed from: b */
    public String f23617b;

    /* renamed from: e */
    public AbstractC1606df f23618e;

    /* renamed from: f */
    public Object[] f23619f;

    static {
        Covode.recordClassIndex(5253);
    }

    /* renamed from: a */
    private String m17519a(Context context) {
        try {
            return String.format(C1602db.m17930c(this.f23617b), this.f23619f);
        } catch (Throwable th) {
            C1616do.m17866c(th, "ofm", "gpj");
            return "";
        }
    }

    /* renamed from: b */
    private String m17518b(Context context) {
        return C1602db.m17936a(this.f23618e.m17915b(C1602db.m17940a(m17519a(context))));
    }

    @Override // com.amap.api.mapcore2d.AbstractC1709fo
    /* renamed from: a */
    public byte[] mo17513a(byte[] bArr) {
        String m17936a = C1602db.m17936a(bArr);
        if (TextUtils.isEmpty(m17936a)) {
            return null;
        }
        String m17518b = m17518b(this.f23616a);
        new StringBuilder();
        return C1602db.m17940a(C0002O.m25083C("{\"pinfo\":\"", m17518b, "\",\"els\":[", m17936a, "]}"));
    }

    public C1705fk(Context context, AbstractC1709fo abstractC1709fo, AbstractC1606df abstractC1606df, String str, Object... objArr) {
        super(abstractC1709fo);
        this.f23616a = context;
        this.f23617b = str;
        this.f23618e = abstractC1606df;
        this.f23619f = objArr;
    }
}
