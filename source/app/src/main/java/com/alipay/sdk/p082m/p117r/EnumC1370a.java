package com.alipay.sdk.p082m.p117r;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.r.a */
/* loaded from: classes2.dex */
public enum EnumC1370a {
    None("none"),
    WapPay("js://wappay"),
    Update("js://update"),
    OpenWeb("loc:openweb"),
    SetResult("loc:setResult"),
    Exit("loc:exit");
    

    /* renamed from: a */
    public String f22352a;

    static {
        Covode.recordClassIndex(4870);
    }

    /* renamed from: a */
    public static EnumC1370a m18964a(String str) {
        EnumC1370a[] values;
        if (TextUtils.isEmpty(str)) {
            return None;
        }
        EnumC1370a enumC1370a = None;
        for (EnumC1370a enumC1370a2 : values()) {
            if (str.startsWith(enumC1370a2.f22352a)) {
                return enumC1370a2;
            }
        }
        return enumC1370a;
    }

    EnumC1370a(String str) {
        this.f22352a = str;
    }
}
