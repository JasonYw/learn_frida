package com.baichuan.nb_trade.core;

import com.bytedance.covode.number.Covode;

/* loaded from: classes13.dex */
public enum Environment {
    SANDBOX(0, "沙箱环境"),
    TEST(1, "测试环境"),
    PRE(2, "预发环境"),
    ONLINE(3, "线上环境");
    

    /* renamed from: a */
    public int f25560a;

    /* renamed from: b */
    public String f25561b;

    static {
        Covode.recordClassIndex(9461);
    }

    Environment(int i, String str) {
        this.f25560a = i;
        this.f25561b = str;
    }
}
