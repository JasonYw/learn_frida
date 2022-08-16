package com.alipay.android.phone.mrpc.core;

import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public class HttpException extends Exception {
    public static final long serialVersionUID = -6320569206365033676L;
    public int mCode;
    public String mMsg;

    static {
        Covode.recordClassIndex(4609);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HttpException(java.lang.Integer r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Http Transport error"
            r1.<init>(r0)
            if (r3 == 0) goto L16
            java.lang.String r0 = "["
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "]"
            r1.append(r0)
        L16:
            java.lang.String r0 = " : "
            r1.append(r0)
            if (r4 == 0) goto L20
            r1.append(r4)
        L20:
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            int r0 = r3.intValue()
            r2.mCode = r0
            r2.mMsg = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.mrpc.core.HttpException.<init>(java.lang.Integer, java.lang.String):void");
    }

    public HttpException(String str) {
        super(str);
        this.mCode = 0;
        this.mMsg = str;
    }

    public int getCode() {
        return this.mCode;
    }

    public String getMsg() {
        return this.mMsg;
    }
}
