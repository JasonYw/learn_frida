package anet.channel.strategy;

import anet.channel.util.ALog;
import com.alipay.sdk.p082m.p105l.C1314b;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: anet.channel.strategy.l */
/* loaded from: classes20.dex */
public class C0568l {
    static {
        Covode.recordClassIndex(2336);
    }

    /* renamed from: anet.channel.strategy.l$e */
    /* loaded from: classes20.dex */
    public static class C0573e {

        /* renamed from: a */
        public final String f20801a;

        /* renamed from: b */
        public final C0569a f20802b;

        /* renamed from: c */
        public final String f20803c;

        static {
            Covode.recordClassIndex(2341);
        }

        public C0573e(JSONObject jSONObject) {
            this.f20801a = jSONObject.optString("ip");
            this.f20803c = jSONObject.optString("path");
            this.f20802b = new C0569a(jSONObject);
        }
    }

    /* renamed from: a */
    public static C0572d m20811a(JSONObject jSONObject) {
        try {
            return new C0572d(jSONObject);
        } catch (Exception e) {
            ALog.m20787e("StrategyResultParser", "Parse HttpDns response failed.", null, e, "JSON Content", jSONObject.toString());
            return null;
        }
    }

    /* renamed from: anet.channel.strategy.l$c */
    /* loaded from: classes20.dex */
    public static class C0571c {

        /* renamed from: a */
        public final String f20791a;

        /* renamed from: b */
        public final C0573e[] f20792b;

        static {
            Covode.recordClassIndex(2339);
        }

        public C0571c(JSONObject jSONObject) {
            this.f20791a = jSONObject.optString(C1315c.f22208f);
            JSONArray optJSONArray = jSONObject.optJSONArray("strategies");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.f20792b = new C0573e[length];
                for (int i = 0; i < length; i++) {
                    this.f20792b[i] = new C0573e(optJSONArray.optJSONObject(i));
                }
                return;
            }
            this.f20792b = null;
        }
    }

    /* renamed from: anet.channel.strategy.l$a */
    /* loaded from: classes20.dex */
    public static class C0569a {

        /* renamed from: a */
        public final int f20771a;

        /* renamed from: b */
        public final String f20772b;

        /* renamed from: c */
        public final int f20773c;

        /* renamed from: d */
        public final int f20774d;

        /* renamed from: e */
        public final int f20775e;

        /* renamed from: f */
        public final int f20776f;

        /* renamed from: g */
        public final String f20777g;

        /* renamed from: h */
        public final String f20778h;

        static {
            Covode.recordClassIndex(2337);
        }

        public C0569a(JSONObject jSONObject) {
            this.f20771a = jSONObject.optInt("port");
            this.f20772b = jSONObject.optString("protocol");
            this.f20773c = jSONObject.optInt("cto");
            this.f20774d = jSONObject.optInt("rto");
            this.f20775e = jSONObject.optInt("retry");
            this.f20776f = jSONObject.optInt("heartbeat");
            this.f20777g = jSONObject.optString("rtt", "");
            this.f20778h = jSONObject.optString("publickey");
        }
    }

    /* renamed from: anet.channel.strategy.l$d */
    /* loaded from: classes2.dex */
    public static class C0572d {

        /* renamed from: a */
        public final String f20793a;

        /* renamed from: b */
        public final C0570b[] f20794b;

        /* renamed from: c */
        public final C0571c[] f20795c;

        /* renamed from: d */
        public final String f20796d;

        /* renamed from: e */
        public final String f20797e;

        /* renamed from: f */
        public final int f20798f;

        /* renamed from: g */
        public final int f20799g;

        /* renamed from: h */
        public final int f20800h;

        static {
            Covode.recordClassIndex(2340);
        }

        public C0572d(JSONObject jSONObject) {
            this.f20793a = jSONObject.optString("ip");
            this.f20796d = jSONObject.optString("uid", null);
            this.f20797e = jSONObject.optString(C1314b.f22207g, null);
            this.f20798f = jSONObject.optInt("cv");
            this.f20799g = jSONObject.optInt("fcl");
            this.f20800h = jSONObject.optInt("fct");
            JSONArray optJSONArray = jSONObject.optJSONArray("dns");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.f20794b = new C0570b[length];
                for (int i = 0; i < length; i++) {
                    this.f20794b[i] = new C0570b(optJSONArray.optJSONObject(i));
                }
            } else {
                this.f20794b = null;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("hrTask");
            if (optJSONArray2 != null) {
                int length2 = optJSONArray2.length();
                this.f20795c = new C0571c[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    this.f20795c[i2] = new C0571c(optJSONArray2.optJSONObject(i2));
                }
                return;
            }
            this.f20795c = null;
        }
    }

    /* renamed from: anet.channel.strategy.l$b */
    /* loaded from: classes2.dex */
    public static class C0570b {

        /* renamed from: a */
        public final String f20779a;

        /* renamed from: b */
        public final int f20780b;

        /* renamed from: c */
        public final String f20781c;

        /* renamed from: d */
        public final String f20782d;

        /* renamed from: e */
        public final String f20783e;

        /* renamed from: f */
        public final String[] f20784f;

        /* renamed from: g */
        public final String[] f20785g;

        /* renamed from: h */
        public final C0569a[] f20786h;

        /* renamed from: i */
        public final C0573e[] f20787i;

        /* renamed from: j */
        public final boolean f20788j;

        /* renamed from: k */
        public final boolean f20789k;

        /* renamed from: l */
        public final int f20790l;

        static {
            Covode.recordClassIndex(2338);
        }

        public C0570b(JSONObject jSONObject) {
            this.f20779a = jSONObject.optString(C1315c.f22208f);
            this.f20780b = jSONObject.optInt("ttl");
            this.f20781c = jSONObject.optString("safeAisles");
            this.f20782d = jSONObject.optString("cname", null);
            this.f20783e = jSONObject.optString("unit", null);
            this.f20788j = jSONObject.optInt("clear") != 1 ? false : true;
            this.f20789k = jSONObject.optBoolean("effectNow");
            this.f20790l = jSONObject.optInt("version");
            JSONArray optJSONArray = jSONObject.optJSONArray("ips");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.f20784f = new String[length];
                for (int i = 0; i < length; i++) {
                    this.f20784f[i] = optJSONArray.optString(i);
                }
            } else {
                this.f20784f = null;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("sips");
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                int length2 = optJSONArray2.length();
                this.f20785g = new String[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    this.f20785g[i2] = optJSONArray2.optString(i2);
                }
            } else {
                this.f20785g = null;
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("aisles");
            if (optJSONArray3 != null) {
                int length3 = optJSONArray3.length();
                this.f20786h = new C0569a[length3];
                for (int i3 = 0; i3 < length3; i3++) {
                    this.f20786h[i3] = new C0569a(optJSONArray3.optJSONObject(i3));
                }
            } else {
                this.f20786h = null;
            }
            JSONArray optJSONArray4 = jSONObject.optJSONArray("strategies");
            if (optJSONArray4 != null && optJSONArray4.length() > 0) {
                int length4 = optJSONArray4.length();
                this.f20787i = new C0573e[length4];
                for (int i4 = 0; i4 < length4; i4++) {
                    this.f20787i[i4] = new C0573e(optJSONArray4.optJSONObject(i4));
                }
                return;
            }
            this.f20787i = null;
        }
    }
}
