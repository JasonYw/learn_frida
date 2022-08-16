package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.alipay.apmobilesecuritysdk.p076a.C1180a;
import com.alipay.apmobilesecuritysdk.p077b.C1181a;
import com.alipay.apmobilesecuritysdk.p080e.C1190a;
import com.alipay.apmobilesecuritysdk.p080e.C1193d;
import com.alipay.apmobilesecuritysdk.p080e.C1196g;
import com.alipay.apmobilesecuritysdk.p080e.C1197h;
import com.alipay.apmobilesecuritysdk.p080e.C1198i;
import com.alipay.apmobilesecuritysdk.p081f.C1200b;
import com.alipay.sdk.p082m.p105l.C1314b;
import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class APSecuritySdk {

    /* renamed from: a */
    public static APSecuritySdk f21980a;

    /* renamed from: c */
    public static Object f21981c = new Object();

    /* renamed from: b */
    public Context f21982b;

    /* loaded from: classes2.dex */
    public interface InitResultListener {
        static {
            Covode.recordClassIndex(4676);
        }

        void onResult(TokenResult tokenResult);
    }

    /* loaded from: classes2.dex */
    public class TokenResult {
        public String apdid;
        public String apdidToken;
        public String clientKey;
        public String umidToken;

        static {
            Covode.recordClassIndex(4677);
        }

        public TokenResult() {
        }
    }

    static {
        Covode.recordClassIndex(4674);
    }

    public APSecuritySdk(Context context) {
        this.f21982b = context;
    }

    public static APSecuritySdk getInstance(Context context) {
        if (f21980a == null) {
            synchronized (f21981c) {
                if (f21980a == null) {
                    f21980a = new APSecuritySdk(context);
                }
            }
        }
        return f21980a;
    }

    public static String getUtdid(Context context) {
        return UtdidWrapper.getUtdid(context);
    }

    public String getApdidToken() {
        String m19587a = C1180a.m19587a(this.f21982b, "");
        if (C1448a.m18665a(m19587a)) {
            initToken(0, new HashMap(), null);
        }
        return m19587a;
    }

    public String getSdkName() {
        return "APPSecuritySDK-ALIPAYSDK";
    }

    public String getSdkVersion() {
        return "3.4.0.202203211140";
    }

    public synchronized TokenResult getTokenResult() {
        TokenResult tokenResult;
        tokenResult = new TokenResult();
        try {
            tokenResult.apdidToken = C1180a.m19587a(this.f21982b, "");
            tokenResult.clientKey = C1197h.m19519f(this.f21982b);
            tokenResult.apdid = C1180a.m19588a(this.f21982b);
            tokenResult.umidToken = UmidSdkWrapper.getSecurityToken(this.f21982b);
            if (C1448a.m18665a(tokenResult.apdid) || C1448a.m18665a(tokenResult.apdidToken) || C1448a.m18665a(tokenResult.clientKey)) {
                initToken(0, new HashMap(), null);
            }
        } catch (Throwable unused) {
        }
        return tokenResult;
    }

    public void initToken(int i, Map<String, String> map, final InitResultListener initResultListener) {
        C1181a.m19582a().m19581a(i);
        String m19527b = C1197h.m19527b(this.f21982b);
        String m19578c = C1181a.m19582a().m19578c();
        if (C1448a.m18661b(m19527b) && !C1448a.m18664a(m19527b, m19578c)) {
            C1190a.m19560a(this.f21982b);
            C1193d.m19553a(this.f21982b);
            C1196g.m19535a(this.f21982b);
            C1198i.m19498h();
        }
        if (!C1448a.m18664a(m19527b, m19578c)) {
            C1197h.m19524c(this.f21982b, m19578c);
        }
        String m18662a = C1448a.m18662a(map, C1314b.f22207g, "");
        String m18662a2 = C1448a.m18662a(map, "tid", "");
        String m18662a3 = C1448a.m18662a(map, "userId", "");
        if (C1448a.m18665a(m18662a)) {
            m18662a = UtdidWrapper.getUtdid(this.f21982b);
        }
        final HashMap hashMap = new HashMap();
        hashMap.put(C1314b.f22207g, m18662a);
        hashMap.put("tid", m18662a2);
        hashMap.put("userId", m18662a3);
        hashMap.put("appName", "");
        hashMap.put("appKeyClient", "");
        hashMap.put("appchannel", "");
        hashMap.put("rpcVersion", "8");
        C1200b.m19493a().m19491a(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.APSecuritySdk.1
            static {
                Covode.recordClassIndex(4675);
            }

            @Override // java.lang.Runnable
            public void run() {
                new C1180a(APSecuritySdk.this.f21982b).m19586a(hashMap);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 != null) {
                    initResultListener2.onResult(APSecuritySdk.this.getTokenResult());
                }
            }
        });
    }
}
