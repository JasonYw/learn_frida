package com.alibaba.p052a.p053a.p054a;

import com.alibaba.p052a.p061b.p065d.C0974i;
import com.bytedance.covode.number.Covode;
import p003X.TFG;

/* renamed from: com.alibaba.a.a.a.f */
/* loaded from: classes13.dex */
public enum EnumC0877f {
    ALARM(65501, 30, "alarmData", TFG.LIZIZ),
    COUNTER(65502, 30, "counterData", TFG.LIZIZ),
    OFFLINE_COUNTER(65133, 30, "counterData", TFG.LIZIZ),
    STAT(65503, 30, "statData", TFG.LIZIZ);
    

    /* renamed from: e */
    public static String f21162e = "EventType";

    /* renamed from: f */
    public int f21164f;

    /* renamed from: h */
    public int f21166h;

    /* renamed from: i */
    public String f21167i;

    /* renamed from: l */
    public int f21170l;

    /* renamed from: j */
    public int f21168j = 25;

    /* renamed from: k */
    public int f21169k = 180;

    /* renamed from: g */
    public boolean f21165g = true;

    static {
        Covode.recordClassIndex(4187);
    }

    EnumC0877f(int i, int i2, String str, int i3) {
        this.f21164f = i;
        this.f21166h = i2;
        this.f21167i = str;
        this.f21170l = i3;
    }

    /* renamed from: b */
    public static EnumC0877f m20481b(int i) {
        EnumC0877f[] values;
        for (EnumC0877f enumC0877f : values()) {
            if (enumC0877f != null && enumC0877f.m20485a() == i) {
                return enumC0877f;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final int m20485a() {
        return this.f21164f;
    }

    /* renamed from: a */
    public final void m20484a(int i) {
        String str = f21162e;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        C0974i.m20098a(str, "[setTriggerCount]", this.f21167i, sb.toString());
        this.f21166h = i;
    }

    /* renamed from: a */
    public final void m20483a(boolean z) {
        this.f21165g = z;
    }

    /* renamed from: b */
    public final boolean m20482b() {
        return this.f21165g;
    }

    /* renamed from: c */
    public final int m20480c() {
        return this.f21166h;
    }

    /* renamed from: c */
    public final void m20479c(int i) {
        this.f21168j = i;
        this.f21169k = i;
    }

    /* renamed from: d */
    public final String m20478d() {
        return this.f21167i;
    }

    /* renamed from: d */
    public final void m20477d(int i) {
        this.f21170l = i;
    }

    /* renamed from: e */
    public final int m20476e() {
        return this.f21168j;
    }

    /* renamed from: f */
    public final int m20475f() {
        return this.f21169k;
    }

    /* renamed from: g */
    public final int m20474g() {
        return this.f21170l;
    }
}
