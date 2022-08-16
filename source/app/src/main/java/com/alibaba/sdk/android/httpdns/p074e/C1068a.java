package com.alibaba.sdk.android.httpdns.p074e;

import com.alibaba.sdk.android.httpdns.p072c.C1043a;
import com.bytedance.covode.number.Covode;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.Random;

/* renamed from: com.alibaba.sdk.android.httpdns.e.a */
/* loaded from: classes19.dex */
public class C1068a {

    /* renamed from: t */
    public String f21601t;

    /* renamed from: com.alibaba.sdk.android.httpdns.e.a$1 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C10691 {
        static {
            Covode.recordClassIndex(4475);
        }
    }

    /* renamed from: com.alibaba.sdk.android.httpdns.e.a$a */
    /* loaded from: classes19.dex */
    public static final class C1070a {

        /* renamed from: a */
        public static final C1068a f21602a = new C1068a(null);

        static {
            Covode.recordClassIndex(4476);
        }
    }

    static {
        Covode.recordClassIndex(4474);
    }

    public C1068a() {
        try {
            Random random = new Random();
            char[] cArr = new char[12];
            int i = 0;
            do {
                cArr[i] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(random.nextInt(62));
                i++;
            } while (i < 12);
            this.f21601t = new String(cArr);
        } catch (Exception unused) {
        }
    }

    public /* synthetic */ C1068a(C10691 c10691) {
        this();
    }

    /* renamed from: a */
    public static C1068a m19891a() {
        return C1070a.f21602a;
    }

    public String getSessionId() {
        return this.f21601t;
    }

    /* renamed from: l */
    public String m19890l() {
        int networkType = C1043a.m19945a().getNetworkType();
        if (networkType != 0) {
            if (networkType == 1) {
                return "wifi";
            }
            if (networkType == 2) {
                return "2g";
            }
            if (networkType == 3) {
                return "3g";
            }
            if (networkType == 4) {
                return "4g";
            }
            if (networkType != 255) {
                return LoggerUtil.UNKNOWN;
            }
        }
        return LoggerUtil.UNKNOWN;
    }
}
