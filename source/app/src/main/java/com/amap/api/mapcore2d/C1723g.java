package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.amap.api.mapcore2d.C1574cr;
import com.amap.api.maps2d.MapsInitializer;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.amap.api.mapcore2d.g */
/* loaded from: classes19.dex */
public class C1723g extends Thread {

    /* renamed from: a */
    public Context f23649a;

    /* renamed from: b */
    public AbstractC1783y f23650b;

    static {
        Covode.recordClassIndex(5271);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            if (!MapsInitializer.getNetworkEnable()) {
                return;
            }
            C1590cw.m18013a().m18012a(this.f23649a);
            C1599da m18161a = C1569cm.m18161a();
            new StringBuilder();
            C1574cr.C1575a m18115a = C1574cr.m18115a(this.f23649a, m18161a, C0002O.m25081C("002", ";", "11K", ";", "001", ";", "145"), null);
            if (C1574cr.f23179a != 1) {
                Message obtainMessage = this.f23650b.getMainHandler().obtainMessage();
                obtainMessage.what = 2;
                if (m18115a.f23189a != null) {
                    obtainMessage.obj = m18115a.f23189a;
                }
                this.f23650b.getMainHandler().sendMessage(obtainMessage);
            } else {
                if (m18115a != null) {
                }
                C1771q.f24027p = m18161a;
                C1616do.m17878a(this.f23649a, m18161a);
                interrupt();
            }
            if (m18115a.f23212x != null) {
                C1569cm.m18161a().m17970a(m18115a.f23212x.f23215a);
            }
            if (!C1602db.m17934b(this.f23649a) && m18115a.f23181A != null) {
                new C1596cz(this.f23649a, "2dmap", m18115a.f23181A.f23223a, m18115a.f23181A.f23224b).m17976a();
            }
            if (m18115a.f23208t != null) {
                JSONObject jSONObject = m18115a.f23208t;
                int i = C1771q.f24028q;
                if (jSONObject.has("t")) {
                    i = jSONObject.getInt("t");
                }
                C1528bg.m18296a().m18290b("period_day", i);
                if (jSONObject.has("able")) {
                    boolean m18111a = C1574cr.m18111a(jSONObject.getString("able"), false);
                    C1528bg.m18296a();
                    C1528bg.m18288b("UpdateDataActiveEnable", m18111a);
                    MapsInitializer.setUpdateDataActiveEnable(m18111a);
                }
                if (jSONObject.has("oi")) {
                    C1771q.m17200a(C1574cr.m18111a(jSONObject.getString("oi"), false));
                }
            }
            if (m18115a.f23213y != null) {
                C1574cr.C1575a.C1579d c1579d = m18115a.f23213y;
                if (c1579d != null) {
                    String str = c1579d.f23226b;
                    String str2 = c1579d.f23225a;
                    String str3 = c1579d.f23227c;
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                        new C1633dz(this.f23649a, new C1637ea(str2, str, str3, m18115a.m18104a()), C1569cm.m18161a()).m17796a();
                    } else {
                        new C1633dz(this.f23649a, null, C1569cm.m18161a()).m17796a();
                    }
                } else {
                    new C1633dz(this.f23649a, null, C1569cm.m18161a()).m17796a();
                }
            }
            C1771q.f24027p = m18161a;
            C1616do.m17878a(this.f23649a, m18161a);
            interrupt();
        } catch (Throwable th) {
            interrupt();
            C1616do.m17866c(th, "AMapDelegateImpGLSurfaceView", "mVerfy");
        }
    }

    public C1723g(Context context, AbstractC1783y abstractC1783y) {
        this.f23649a = context;
        this.f23650b = abstractC1783y;
    }
}
