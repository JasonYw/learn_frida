package com.alipay.sdk.p082m.p121u;

import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.u.g */
/* loaded from: classes2.dex */
public enum EnumC1387g {
    WIFI(0, "WIFI"),
    NETWORK_TYPE_1(1, "unicom2G"),
    NETWORK_TYPE_2(2, "mobile2G"),
    NETWORK_TYPE_4(4, "telecom2G"),
    NETWORK_TYPE_5(5, "telecom3G"),
    NETWORK_TYPE_6(6, "telecom3G"),
    NETWORK_TYPE_12(12, "telecom3G"),
    NETWORK_TYPE_8(8, "unicom3G"),
    NETWORK_TYPE_3(3, "unicom3G"),
    NETWORK_TYPE_13(13, "LTE"),
    NETWORK_TYPE_11(11, "IDEN"),
    NETWORK_TYPE_9(9, "HSUPA"),
    NETWORK_TYPE_10(10, "HSPA"),
    NETWORK_TYPE_15(15, "HSPAP"),
    NETWORK_TYPE_20(20, "5G"),
    NONE(-1, "none");
    

    /* renamed from: a */
    public int f22409a;

    /* renamed from: b */
    public String f22410b;

    /* renamed from: a */
    public final int m18860a() {
        return this.f22409a;
    }

    /* renamed from: b */
    public final String m18858b() {
        return this.f22410b;
    }

    static {
        Covode.recordClassIndex(4887);
    }

    /* renamed from: a */
    public static EnumC1387g m18859a(int i) {
        EnumC1387g[] values;
        for (EnumC1387g enumC1387g : values()) {
            if (enumC1387g.m18860a() == i) {
                return enumC1387g;
            }
        }
        return NONE;
    }

    EnumC1387g(int i, String str) {
        this.f22409a = i;
        this.f22410b = str;
    }
}
