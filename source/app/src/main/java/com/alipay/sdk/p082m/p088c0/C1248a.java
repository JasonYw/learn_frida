package com.alipay.sdk.p082m.p088c0;

import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: com.alipay.sdk.m.c0.a */
/* loaded from: classes2.dex */
public final class C1248a {

    /* renamed from: a */
    public String f22085a;

    /* renamed from: b */
    public String f22086b;

    /* renamed from: c */
    public String f22087c;

    /* renamed from: d */
    public String f22088d;

    /* renamed from: e */
    public String f22089e;

    /* renamed from: f */
    public String f22090f;

    /* renamed from: g */
    public String f22091g;

    static {
        Covode.recordClassIndex(4748);
    }

    public C1248a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f22085a = str;
        this.f22086b = str2;
        this.f22087c = str3;
        this.f22088d = str4;
        this.f22089e = str5;
        this.f22090f = str6;
        this.f22091g = str7;
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String str2;
        StringBuilder sb3;
        String str3;
        StringBuffer stringBuffer = new StringBuffer(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime()));
        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP + this.f22085a);
        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP + this.f22086b);
        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP + this.f22087c);
        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP + this.f22088d);
        if (C1448a.m18665a(this.f22089e) || this.f22089e.length() < 20) {
            sb = new StringBuilder(Constants.ACCEPT_TIME_SEPARATOR_SP);
            str = this.f22089e;
        } else {
            sb = new StringBuilder(Constants.ACCEPT_TIME_SEPARATOR_SP);
            str = this.f22089e.substring(0, 20);
        }
        sb.append(str);
        stringBuffer.append(sb.toString());
        if (C1448a.m18665a(this.f22090f) || this.f22090f.length() < 20) {
            sb2 = new StringBuilder(Constants.ACCEPT_TIME_SEPARATOR_SP);
            str2 = this.f22090f;
        } else {
            sb2 = new StringBuilder(Constants.ACCEPT_TIME_SEPARATOR_SP);
            str2 = this.f22090f.substring(0, 20);
        }
        sb2.append(str2);
        stringBuffer.append(sb2.toString());
        if (C1448a.m18665a(this.f22091g) || this.f22091g.length() < 20) {
            sb3 = new StringBuilder(Constants.ACCEPT_TIME_SEPARATOR_SP);
            str3 = this.f22091g;
        } else {
            sb3 = new StringBuilder(Constants.ACCEPT_TIME_SEPARATOR_SP);
            str3 = this.f22091g.substring(0, 20);
        }
        sb3.append(str3);
        stringBuffer.append(sb3.toString());
        return stringBuffer.toString();
    }
}
