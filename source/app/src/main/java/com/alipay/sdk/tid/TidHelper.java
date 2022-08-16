package com.alipay.sdk.tid;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.alipay.sdk.p082m.p107m.C1331b;
import com.alipay.sdk.p082m.p113p.C1351b;
import com.alipay.sdk.p082m.p115q.C1363c;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.alipay.sdk.p082m.p119s.C1378b;
import com.alipay.sdk.p082m.p120t.C1379a;
import com.alipay.sdk.p082m.p121u.C1383c;
import com.alipay.sdk.p082m.p121u.C1385e;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TidHelper {
    static {
        Covode.recordClassIndex(4952);
    }

    public static void clearTID(Context context) {
        C1379a.m18912a(context).m18913a();
    }

    /* renamed from: a */
    public static void m18653a(Context context) {
        if (context == null) {
            return;
        }
        C1378b.m18915d().m18918a(context);
    }

    public static String getIMEI(Context context) {
        m18653a(context);
        return C1383c.m18876b(context).m18877b();
    }

    public static String getIMSI(Context context) {
        m18653a(context);
        return C1383c.m18876b(context).m18875c();
    }

    public static String getVirtualImei(Context context) {
        m18653a(context);
        C1331b.m19097b();
        return C1331b.m19091f();
    }

    public static String getVirtualImsi(Context context) {
        m18653a(context);
        C1331b.m19097b();
        return C1331b.m19090g();
    }

    public static synchronized String getTIDValue(Context context) {
        synchronized (TidHelper.class) {
            Tid loadOrCreateTID = loadOrCreateTID(context);
            if (Tid.isEmpty(loadOrCreateTID)) {
                return "";
            }
            return loadOrCreateTID.getTid();
        }
    }

    public static Tid loadTID(Context context) {
        m18653a(context);
        Tid m18652a = m18652a(context, C1379a.m18912a(context));
        if (m18652a == null) {
            C1385e.m18865b("mspl", "load_tid null");
        }
        return m18652a;
    }

    /* renamed from: b */
    public static Tid m18651b(Context context) {
        try {
            C1351b m19006a = new C1363c().m19006a(C1376a.m18925f(), context);
            if (m19006a != null) {
                JSONObject jSONObject = new JSONObject(m19006a.m19021a());
                C1379a m18912a = C1379a.m18912a(context);
                String optString = jSONObject.optString("tid");
                String string = jSONObject.getString("client_key");
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(string)) {
                    m18912a.m18911a(optString, string);
                }
                return m18652a(context, m18912a);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static Tid loadLocalTid(Context context) {
        C1379a m18912a = C1379a.m18912a(context);
        if (m18912a.m18901h()) {
            return null;
        }
        return new Tid(m18912a.m18905d(), m18912a.m18906c(), m18912a.m18904e().longValue());
    }

    public static synchronized Tid loadOrCreateTID(Context context) {
        synchronized (TidHelper.class) {
            C1385e.m18865b("mspl", "load_create_tid");
            m18653a(context);
            Tid loadTID = loadTID(context);
            if (Tid.isEmpty(loadTID)) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return null;
                }
                try {
                    loadTID = m18651b(context);
                } catch (Throwable unused) {
                }
            }
            return loadTID;
        }
    }

    public static boolean resetTID(Context context) {
        C1385e.m18865b("mspl", "reset_tid");
        if (Looper.myLooper() != Looper.getMainLooper()) {
            m18653a(context);
            clearTID(context);
            Tid tid = null;
            try {
                tid = m18651b(context);
            } catch (Throwable unused) {
            }
            if (Tid.isEmpty(tid)) {
                return false;
            }
            return true;
        }
        throw new Exception("Must be called on worker thread");
    }

    /* renamed from: a */
    public static Tid m18652a(Context context, C1379a c1379a) {
        if (c1379a != null && !c1379a.m18900i()) {
            return new Tid(c1379a.m18905d(), c1379a.m18906c(), c1379a.m18904e().longValue());
        }
        return null;
    }
}
