package com.alipay.sdk.p082m.p101j;

import com.bytedance.covode.number.Covode;
import p003X.TFG;

/* renamed from: com.alipay.sdk.m.j.c */
/* loaded from: classes2.dex */
public enum EnumC1296c {
    SUCCEEDED(9000, "处理成功"),
    FAILED(4000, "系统繁忙，请稍后再试"),
    CANCELED(6001, "用户取消"),
    NETWORK_ERROR(6002, "网络连接异常"),
    ACTIVITY_NOT_START_EXIT(6007, "支付未完成"),
    PARAMS_ERROR(4001, "参数错误"),
    DOUBLE_REQUEST(TFG.LIZIZ, "重复请求"),
    PAY_WAITTING(8000, "支付结果确认中");
    

    /* renamed from: a */
    public int f22177a;

    /* renamed from: b */
    public String f22178b;

    /* renamed from: a */
    public final String m19233a() {
        return this.f22178b;
    }

    /* renamed from: b */
    public final int m19230b() {
        return this.f22177a;
    }

    static {
        Covode.recordClassIndex(4796);
    }

    /* renamed from: a */
    public final void m19232a(int i) {
        this.f22177a = i;
    }

    /* renamed from: a */
    public final void m19231a(String str) {
        this.f22178b = str;
    }

    /* renamed from: b */
    public static EnumC1296c m19229b(int i) {
        if (i != 4001) {
            if (i != 5000) {
                if (i != 8000) {
                    if (i != 9000) {
                        if (i != 6001) {
                            if (i != 6002) {
                                return FAILED;
                            }
                            return NETWORK_ERROR;
                        }
                        return CANCELED;
                    }
                    return SUCCEEDED;
                }
                return PAY_WAITTING;
            }
            return DOUBLE_REQUEST;
        }
        return PARAMS_ERROR;
    }

    EnumC1296c(int i, String str) {
        this.f22177a = i;
        this.f22178b = str;
    }
}
