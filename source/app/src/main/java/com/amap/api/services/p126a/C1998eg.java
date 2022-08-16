package com.amap.api.services.p126a;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.eg */
/* loaded from: classes19.dex */
public class C1998eg extends AbstractC1997ef {

    /* renamed from: b */
    public Context f24814b;

    /* renamed from: c */
    public boolean f24815c;

    static {
        Covode.recordClassIndex(5609);
    }

    @Override // com.amap.api.services.p126a.AbstractC1997ef
    /* renamed from: a */
    public boolean mo16397a() {
        if (C1878bj.m16873s(this.f24814b) == 1 || this.f24815c) {
            return true;
        }
        return false;
    }

    public C1998eg(Context context, boolean z) {
        this.f24814b = context;
        this.f24815c = z;
    }
}
