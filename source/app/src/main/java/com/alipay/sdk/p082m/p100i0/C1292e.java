package com.alipay.sdk.p082m.p100i0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import java.util.ArrayList;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* renamed from: com.alipay.sdk.m.i0.e */
/* loaded from: classes18.dex */
public final class C1292e extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(4792);
    }

    public final void com_alipay_sdk_m_i0_e__onReceive$___twin___(Context context, Intent intent) {
        C1288a c1288a;
        if (context == null || intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("openIdNotifyFlag", 0);
        C1293f.m19249a("shouldUpdateId, notifyFlag : ".concat(String.valueOf(intExtra)));
        if (intExtra == 1) {
            if (!TextUtils.equals(intent.getStringExtra("openIdPackage"), context.getPackageName())) {
                return;
            }
        } else if (intExtra == 2) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("openIdPackageList");
            if (stringArrayListExtra == null || !stringArrayListExtra.contains(context.getPackageName())) {
                return;
            }
        } else if (intExtra != 0) {
            return;
        }
        String stringExtra = intent.getStringExtra("openIdType");
        C1293f m19255a = C1293f.m19255a();
        if ("oaid".equals(stringExtra)) {
            c1288a = m19255a.f22157b;
        } else if ("vaid".equals(stringExtra)) {
            c1288a = m19255a.f22159d;
        } else if ("aaid".equals(stringExtra)) {
            c1288a = m19255a.f22158c;
        } else if (!"udid".equals(stringExtra)) {
            return;
        } else {
            c1288a = m19255a.f22156a;
        }
        if (c1288a == null) {
            return;
        }
        c1288a.m19268b();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        m19256xc3460b5a(this, context, intent);
    }

    /* renamed from: com_alipay_sdk_m_i0_e_com_ss_android_ugc_aweme_lancet_JatoBoostLancet_onBroadcastReceiverReceive */
    public static void m19256xc3460b5a(C1292e c1292e, Context context, Intent intent) {
        if (!AppMonitor.INSTANCE.isAppBackground() && intent != null && !C140192dPo.LIZIZ.contains(intent.getAction()) && C140192dPo.LIZ("onBroadcastReceiverReceive")) {
            C140181dPd.m21607LJ();
        }
        c1292e.com_alipay_sdk_m_i0_e__onReceive$___twin___(context, intent);
    }
}
