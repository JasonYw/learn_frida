package com.amap.api.mapcore2d;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.fv */
/* loaded from: classes19.dex */
public class C1716fv extends AbstractC1715fu {

    /* renamed from: b */
    public Context f23639b;

    /* renamed from: c */
    public boolean f23640c;

    static {
        Covode.recordClassIndex(5264);
    }

    @Override // com.amap.api.mapcore2d.AbstractC1715fu
    /* renamed from: a */
    public boolean mo17504a() {
        if (C1587cu.m18035r(this.f23639b) == 1 || this.f23640c) {
            return true;
        }
        return false;
    }

    public C1716fv(Context context, boolean z) {
        this.f23639b = context;
        this.f23640c = z;
    }
}
