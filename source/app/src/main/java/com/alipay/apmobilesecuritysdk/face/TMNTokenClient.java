package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.alipay.apmobilesecuritysdk.p076a.C1180a;
import com.alipay.apmobilesecuritysdk.p081f.C1200b;
import com.alipay.sdk.p082m.p105l.C1314b;
import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class TMNTokenClient {

    /* renamed from: a */
    public static TMNTokenClient f21987a;

    /* renamed from: b */
    public Context f21988b;

    /* loaded from: classes2.dex */
    public interface InitResultListener {
        static {
            Covode.recordClassIndex(4681);
        }

        void onResult(String str, int i);
    }

    static {
        Covode.recordClassIndex(4679);
    }

    public TMNTokenClient(Context context) {
        this.f21988b = null;
        if (context != null) {
            this.f21988b = context;
            return;
        }
        throw new IllegalArgumentException("TMNTokenClient initialization error: context is null.");
    }

    public static TMNTokenClient getInstance(Context context) {
        if (f21987a == null) {
            synchronized (TMNTokenClient.class) {
                if (f21987a == null) {
                    f21987a = new TMNTokenClient(context);
                }
            }
        }
        return f21987a;
    }

    public void intiToken(final String str, String str2, String str3, final InitResultListener initResultListener) {
        if (C1448a.m18665a(str) && initResultListener != null) {
            initResultListener.onResult("", 2);
        }
        if (C1448a.m18665a(str2) && initResultListener != null) {
            initResultListener.onResult("", 3);
        }
        final HashMap hashMap = new HashMap();
        hashMap.put(C1314b.f22207g, UtdidWrapper.getUtdid(this.f21988b));
        hashMap.put("tid", "");
        hashMap.put("userId", "");
        hashMap.put("appName", str);
        hashMap.put("appKeyClient", str2);
        hashMap.put("appchannel", "openapi");
        hashMap.put("sessionId", str3);
        hashMap.put("rpcVersion", "8");
        C1200b.m19493a().m19491a(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.TMNTokenClient.1
            static {
                Covode.recordClassIndex(4680);
            }

            @Override // java.lang.Runnable
            public void run() {
                int m19586a = new C1180a(TMNTokenClient.this.f21988b).m19586a(hashMap);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 == null) {
                    return;
                }
                if (m19586a != 0) {
                    initResultListener2.onResult("", m19586a);
                    return;
                }
                initResultListener.onResult(C1180a.m19587a(TMNTokenClient.this.f21988b, str), 0);
            }
        });
    }
}
