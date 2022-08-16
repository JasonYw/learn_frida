package com.alibaba.sdk.android.httpdns;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.alibaba.sdk.android.httpdns.p071b.C1035b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import java.util.ArrayList;
import p002O.C0002O;
import p003X.C116971W2r;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* renamed from: com.alibaba.sdk.android.httpdns.p */
/* loaded from: classes18.dex */
public class C1089p {

    /* renamed from: a */
    public static Context f21649a;

    /* renamed from: i */
    public static boolean f21650i;

    /* renamed from: j */
    public static String f21651j;

    static {
        Covode.recordClassIndex(4496);
    }

    /* renamed from: f */
    public static String m19848f() {
        try {
            NetworkInfo LIZ = C116971W2r.LIZ((ConnectivityManager) f21649a.getSystemService("connectivity"));
            if (LIZ != null && LIZ.isAvailable()) {
                String typeName = LIZ.getTypeName();
                C1074i.m19882d(C0002O.m25084C("[detectCurrentNetwork] - Network name:", typeName, " subType name: ", LIZ.getSubtypeName()));
                return typeName == null ? "None_Network" : typeName;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "None_Network";
    }

    public static void setContext(Context context) {
        if (context != null) {
            f21649a = context;
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.alibaba.sdk.android.httpdns.p.1
                static {
                    Covode.recordClassIndex(4497);
                }

                /* renamed from: com_alibaba_sdk_android_httpdns_p$1_com_ss_android_ugc_aweme_lancet_JatoBoostLancet_onBroadcastReceiverReceive */
                public static void m19845x62f7804c(C10901 c10901, Context context2, Intent intent) {
                    if (!AppMonitor.INSTANCE.isAppBackground() && intent != null && !C140192dPo.LIZIZ.contains(intent.getAction()) && C140192dPo.LIZ("onBroadcastReceiverReceive")) {
                        C140181dPd.m21607LJ();
                    }
                    c10901.com_alibaba_sdk_android_httpdns_p$1__onReceive$___twin___(context2, intent);
                }

                public final void com_alibaba_sdk_android_httpdns_p$1__onReceive$___twin___(Context context2, Intent intent) {
                    try {
                        if (isInitialStickyBroadcast() || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                            return;
                        }
                        C1035b.m19972b(context2);
                        String m19848f = C1089p.m19848f();
                        if (m19848f != "None_Network" && !m19848f.equalsIgnoreCase(C1089p.f21651j)) {
                            C1074i.m19882d("[BroadcastReceiver.onReceive] - Network state changed");
                            ArrayList<String> m19935a = C1046d.m19936a().m19935a();
                            C1046d.m19936a().clear();
                            C1046d.m19936a().m19933a();
                            if (C1089p.f21650i && HttpDns.instance != null) {
                                C1074i.m19882d("[BroadcastReceiver.onReceive] - refresh host");
                                HttpDns.instance.setPreResolveHosts(m19935a);
                            }
                        }
                        String unused = C1089p.f21651j = m19848f;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    m19845x62f7804c(this, context2, intent);
                }
            };
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                C116971W2r.LIZ(f21649a, broadcastReceiver, intentFilter);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        throw new IllegalStateException("Context can't be null");
    }
}
