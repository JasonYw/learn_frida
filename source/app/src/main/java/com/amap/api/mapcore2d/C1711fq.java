package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.amap.api.mapcore2d.fq */
/* loaded from: classes19.dex */
public class C1711fq extends AbstractC1715fu {

    /* renamed from: b */
    public int f23627b;

    /* renamed from: c */
    public String f23628c;

    static {
        Covode.recordClassIndex(5259);
    }

    @Override // com.amap.api.mapcore2d.AbstractC1715fu
    /* renamed from: a */
    public boolean mo17504a() {
        if (m17512a(this.f23628c) < this.f23627b) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public int m17512a(String str) {
        int i = 0;
        try {
            File file = new File(str);
            if (!file.exists()) {
                return 0;
            }
            i = file.list().length;
            return i;
        } catch (Throwable th) {
            C1616do.m17866c(th, "fus", "gfn");
            return i;
        }
    }

    public C1711fq(int i, String str, AbstractC1715fu abstractC1715fu) {
        super(abstractC1715fu);
        this.f23627b = i;
        this.f23628c = str;
    }
}
