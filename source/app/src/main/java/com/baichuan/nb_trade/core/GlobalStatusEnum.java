package com.baichuan.nb_trade.core;

import com.bytedance.covode.number.Covode;

/* loaded from: classes13.dex */
public enum GlobalStatusEnum {
    INIT_SDK_STATUS(1, "初始化成功"),
    INIT_SDK_FAIL(0, "初始化失败"),
    SDK_NEED_UPGRADE(0, "SDK需要升级"),
    SDK_NO_NEED_UPGRADE(1, "SDK正常初始化");
    

    /* renamed from: a */
    public int f25566a;

    /* renamed from: b */
    public String f25567b;

    static {
        Covode.recordClassIndex(9463);
    }

    GlobalStatusEnum(int i, String str) {
        this.f25566a = i;
        this.f25567b = str;
    }
}
