package com.alipay.sdk.p082m.p122w;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.ConditionVariable;
import android.text.TextUtils;
import android.util.Pair;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.sdk.p082m.p085b.C1227c;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p105l.C1314b;
import com.alipay.sdk.p082m.p107m.C1328a;
import com.alipay.sdk.p082m.p110n0.C1338a;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.alipay.sdk.p082m.p121u.C1385e;
import com.alipay.sdk.p082m.p122w.C1403a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.w.b */
/* loaded from: classes2.dex */
public class C1405b {
    static {
        Covode.recordClassIndex(4906);
    }

    /* renamed from: com.alipay.sdk.m.w.b$c */
    /* loaded from: classes2.dex */
    public static class CallableC1408c implements Callable<String> {

        /* renamed from: a */
        public final /* synthetic */ Context f22442a;

        static {
            Covode.recordClassIndex(4909);
        }

        @Override // java.util.concurrent.Callable
        public final String call() {
            return C1227c.m19356a(this.f22442a);
        }

        public CallableC1408c(Context context) {
            this.f22442a = context;
        }
    }

    /* renamed from: com.alipay.sdk.m.w.b$a */
    /* loaded from: classes2.dex */
    public static class CallableC1406a implements Callable<WifiInfo> {

        /* renamed from: a */
        public final /* synthetic */ Context f22441a;

        static {
            Covode.recordClassIndex(4907);
        }

        /* renamed from: com_alipay_sdk_m_w_b$a_android_net_wifi_WifiManager_getConnectionInfo */
        public static WifiInfo m18747xb8b0a059(WifiManager wifiManager) {
            ActionInvokeEntrance.setEventUuid(102301);
            Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(wifiManager, new Object[0], 102301, "android.net.wifi.WifiInfo", false, null, false);
            if (((Boolean) actionIntercept.first).booleanValue()) {
                return (WifiInfo) actionIntercept.second;
            }
            WifiInfo LIZ = C116971W2r.LIZ(wifiManager);
            ActionInvokeEntrance.actionInvoke(LIZ, wifiManager, new Object[0], 102301, "com_alipay_sdk_m_w_b$a_android_net_wifi_WifiManager_getConnectionInfo(Landroid/net/wifi/WifiManager;)Landroid/net/wifi/WifiInfo;");
            return LIZ;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /* renamed from: call */
        public final WifiInfo mo25264call() {
            return m18747xb8b0a059((WifiManager) this.f22441a.getApplicationContext().getSystemService("wifi"));
        }

        public CallableC1406a(Context context) {
            this.f22441a = context;
        }
    }

    /* renamed from: com.alipay.sdk.m.w.b$e */
    /* loaded from: classes26.dex */
    public static class CallableC1410e implements Callable<NetworkInfo> {

        /* renamed from: a */
        public final /* synthetic */ Context f22443a;

        static {
            Covode.recordClassIndex(4911);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /* renamed from: call */
        public final NetworkInfo mo25267call() {
            return C116971W2r.LIZ((ConnectivityManager) this.f22443a.getApplicationContext().getSystemService("connectivity"));
        }

        public CallableC1410e(Context context) {
            this.f22443a = context;
        }
    }

    /* renamed from: com.alipay.sdk.m.w.b$g */
    /* loaded from: classes2.dex */
    public static class CallableC1412g implements Callable<String> {

        /* renamed from: a */
        public final /* synthetic */ Context f22444a;

        /* renamed from: b */
        public final /* synthetic */ C1376a f22445b;

        static {
            Covode.recordClassIndex(4913);
        }

        @Override // java.util.concurrent.Callable
        public final String call() {
            try {
                return C1338a.m19067c(this.f22444a);
            } catch (Throwable th) {
                C1301a.m19211b(this.f22445b, "third", "GetUtdidEx", th.getClass().getName());
                return "";
            }
        }

        public CallableC1412g(Context context, C1376a c1376a) {
            this.f22444a = context;
            this.f22445b = c1376a;
        }
    }

    /* renamed from: com.alipay.sdk.m.w.b$i */
    /* loaded from: classes2.dex */
    public static class CallableC1414i implements Callable<String> {

        /* renamed from: a */
        public final /* synthetic */ String f22446a;

        /* renamed from: b */
        public final /* synthetic */ String f22447b;

        /* renamed from: c */
        public final /* synthetic */ Context f22448c;

        /* renamed from: d */
        public final /* synthetic */ C1376a f22449d;

        static {
            Covode.recordClassIndex(4915);
        }

        @Override // java.util.concurrent.Callable
        public final String call() {
            HashMap hashMap = new HashMap();
            hashMap.put("tid", this.f22446a);
            hashMap.put(C1314b.f22207g, this.f22447b);
            String[] strArr = {""};
            try {
                APSecuritySdk aPSecuritySdk = APSecuritySdk.getInstance(this.f22448c);
                ConditionVariable conditionVariable = new ConditionVariable();
                aPSecuritySdk.initToken(0, hashMap, new C1415a(strArr, conditionVariable));
                conditionVariable.block(JsBridgeDelegate.GET_URL_OUT_TIME);
            } catch (Throwable th) {
                C1385e.m18866a(th);
                C1301a.m19211b(this.f22449d, "third", "GetApdidEx", th.getClass().getName());
            }
            if (TextUtils.isEmpty(strArr[0])) {
                C1301a.m19211b(this.f22449d, "third", "GetApdidNull", "missing token");
            }
            return strArr[0];
        }

        /* renamed from: com.alipay.sdk.m.w.b$i$a */
        /* loaded from: classes2.dex */
        public class C1415a implements APSecuritySdk.InitResultListener {

            /* renamed from: a */
            public final /* synthetic */ String[] f22450a;

            /* renamed from: b */
            public final /* synthetic */ ConditionVariable f22451b;

            static {
                Covode.recordClassIndex(4916);
            }

            @Override // com.alipay.apmobilesecuritysdk.face.APSecuritySdk.InitResultListener
            public void onResult(APSecuritySdk.TokenResult tokenResult) {
                if (tokenResult != null) {
                    this.f22450a[0] = tokenResult.apdidToken;
                }
                this.f22451b.open();
            }

            public C1415a(String[] strArr, ConditionVariable conditionVariable) {
                this.f22450a = strArr;
                this.f22451b = conditionVariable;
            }
        }

        public CallableC1414i(String str, String str2, Context context, C1376a c1376a) {
            this.f22446a = str;
            this.f22447b = str2;
            this.f22448c = context;
            this.f22449d = c1376a;
        }
    }

    /* renamed from: com.alipay.sdk.m.w.b$b */
    /* loaded from: classes2.dex */
    public static class C1407b implements C1403a.AbstractC1404a<Object, Boolean> {
        static {
            Covode.recordClassIndex(4908);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.alipay.sdk.p082m.p122w.C1403a.AbstractC1404a
        /* renamed from: a */
        public final Boolean mo25270a(Object obj) {
            boolean z;
            if (!(obj instanceof String) && obj != null) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.alipay.sdk.m.w.b$d */
    /* loaded from: classes2.dex */
    public static class C1409d implements C1403a.AbstractC1404a<Object, Boolean> {
        static {
            Covode.recordClassIndex(4910);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.alipay.sdk.p082m.p122w.C1403a.AbstractC1404a
        /* renamed from: a */
        public final Boolean mo25270a(Object obj) {
            boolean z;
            if (!(obj instanceof NetworkInfo) && obj != null) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.alipay.sdk.m.w.b$f */
    /* loaded from: classes2.dex */
    public static class C1411f implements C1403a.AbstractC1404a<Object, Boolean> {
        static {
            Covode.recordClassIndex(4912);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.alipay.sdk.p082m.p122w.C1403a.AbstractC1404a
        /* renamed from: a */
        public final Boolean mo25270a(Object obj) {
            boolean z;
            if (!(obj instanceof String) && obj != null) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.alipay.sdk.m.w.b$h */
    /* loaded from: classes2.dex */
    public static class C1413h implements C1403a.AbstractC1404a<Object, Boolean> {
        static {
            Covode.recordClassIndex(4914);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.alipay.sdk.p082m.p122w.C1403a.AbstractC1404a
        /* renamed from: a */
        public final Boolean mo25270a(Object obj) {
            boolean z;
            if (!(obj instanceof String) && obj != null) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.alipay.sdk.m.w.b$j */
    /* loaded from: classes2.dex */
    public static class C1416j implements C1403a.AbstractC1404a<Object, Boolean> {
        static {
            Covode.recordClassIndex(4917);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.alipay.sdk.p082m.p122w.C1403a.AbstractC1404a
        /* renamed from: a */
        public final Boolean mo25270a(Object obj) {
            boolean z;
            if (!(obj instanceof WifiInfo) && obj != null) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static NetworkInfo m18752a(C1376a c1376a, Context context) {
        return (NetworkInfo) C1403a.m18756a(2, 10L, TimeUnit.SECONDS, new C1409d(), new CallableC1410e(C1403a.m18753a(context)), false, 10L, TimeUnit.SECONDS, c1376a, false);
    }

    /* renamed from: c */
    public static String m18749c(C1376a c1376a, Context context) {
        return (String) C1403a.m18756a(3, 1L, TimeUnit.DAYS, new C1411f(), new CallableC1412g(C1403a.m18753a(context), c1376a), true, 3L, TimeUnit.SECONDS, c1376a, false);
    }

    /* renamed from: d */
    public static WifiInfo m18748d(C1376a c1376a, Context context) {
        return (WifiInfo) C1403a.m18756a(5, 10L, TimeUnit.SECONDS, new C1416j(), new CallableC1406a(C1403a.m18753a(context)), false, 10L, TimeUnit.SECONDS, c1376a, false);
    }

    /* renamed from: b */
    public static String m18750b(C1376a c1376a, Context context) {
        if (!C1328a.m19107z().m19112u()) {
            return "";
        }
        return (String) C1403a.m18756a(1, 1L, TimeUnit.DAYS, new C1407b(), new CallableC1408c(C1403a.m18753a(context)), true, 200L, TimeUnit.MILLISECONDS, c1376a, true);
    }

    /* renamed from: a */
    public static String m18751a(C1376a c1376a, Context context, String str, String str2) {
        return (String) C1403a.m18756a(4, 10L, TimeUnit.SECONDS, new C1413h(), new CallableC1414i(str, str2, C1403a.m18753a(context), c1376a), true, 3L, TimeUnit.SECONDS, c1376a, true);
    }
}
