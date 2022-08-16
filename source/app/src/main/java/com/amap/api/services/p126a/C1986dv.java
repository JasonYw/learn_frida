package com.amap.api.services.p126a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.dv */
/* loaded from: classes19.dex */
public class C1986dv extends AbstractC1990dz {

    /* renamed from: a */
    public Context f24791a;

    /* renamed from: b */
    public String f24792b;

    /* renamed from: e */
    public AbstractC1895bs f24793e;

    /* renamed from: f */
    public Object[] f24794f;

    static {
        Covode.recordClassIndex(5597);
    }

    /* renamed from: a */
    private String m16413a(Context context) {
        try {
            return String.format(C1892bp.m16776c(this.f24792b), this.f24794f);
        } catch (Throwable th) {
            C1906cb.m16716c(th, "ofm", "gpj");
            return "";
        }
    }

    /* renamed from: b */
    private String m16412b(Context context) {
        return C1892bp.m16782a(this.f24793e.m16766b(C1892bp.m16786a(m16413a(context))));
    }

    @Override // com.amap.api.services.p126a.AbstractC1990dz
    /* renamed from: a */
    public byte[] mo16406a(byte[] bArr) {
        String m16782a = C1892bp.m16782a(bArr);
        if (TextUtils.isEmpty(m16782a)) {
            return null;
        }
        String m16412b = m16412b(this.f24791a);
        new StringBuilder();
        return C1892bp.m16786a(C0002O.m25083C("{\"pinfo\":\"", m16412b, "\",\"els\":[", m16782a, "]}"));
    }

    public C1986dv(Context context, AbstractC1990dz abstractC1990dz, AbstractC1895bs abstractC1895bs, String str, Object... objArr) {
        super(abstractC1990dz);
        this.f24791a = context;
        this.f24792b = str;
        this.f24793e = abstractC1895bs;
        this.f24794f = objArr;
    }
}
