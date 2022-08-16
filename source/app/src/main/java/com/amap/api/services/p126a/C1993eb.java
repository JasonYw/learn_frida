package com.amap.api.services.p126a;

import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.amap.api.services.a.eb */
/* loaded from: classes19.dex */
public class C1993eb extends AbstractC1997ef {

    /* renamed from: b */
    public int f24802b;

    /* renamed from: c */
    public String f24803c;

    static {
        Covode.recordClassIndex(5604);
    }

    @Override // com.amap.api.services.p126a.AbstractC1997ef
    /* renamed from: a */
    public boolean mo16397a() {
        if (m16405a(this.f24803c) < this.f24802b) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public int m16405a(String str) {
        int i = 0;
        try {
            File file = new File(str);
            if (!file.exists()) {
                return 0;
            }
            i = file.list().length;
            return i;
        } catch (Throwable th) {
            C1906cb.m16716c(th, "fus", "gfn");
            return i;
        }
    }

    public C1993eb(int i, String str, AbstractC1997ef abstractC1997ef) {
        super(abstractC1997ef);
        this.f24802b = i;
        this.f24803c = str;
    }
}
