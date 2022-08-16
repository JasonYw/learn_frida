package com.baichuan.nb_trade.core;

import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;

/* loaded from: classes.dex */
public enum ErrorEnum {
    APPLINK_START_APP_SUCCESS(1001, "唤端成功"),
    APPLINK_PARAMS_ERROR(2001, "唤端异常"),
    APPLINK_APP_UNINSTALL(2002, "淘宝APP未安装~"),
    APPLINK_START_APP_FAIL(PushConstants.NOTIFICATION_SERVICE_SEND_MESSAGE, "唤端失败"),
    CONVERT_URL_SUCCESS(2400, "转链成功");
    

    /* renamed from: a */
    public int f25563a;

    /* renamed from: b */
    public String f25564b;

    static {
        Covode.recordClassIndex(9462);
    }

    ErrorEnum(int i, String str) {
        this.f25563a = i;
        this.f25564b = str;
    }

    public static ErrorEnum LIZ(int i) {
        ErrorEnum[] values = values();
        for (int i2 = 0; i2 < values.length; i2++) {
            if (i == values[i2].f25563a) {
                return values[i2];
            }
        }
        return null;
    }
}
