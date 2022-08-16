package com.bytedance.alliance.event.netreport;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import p003X.C140181dPd;
import p003X.C140192dPo;
import p003X.C76656GKc;
import p003X.GKU;

/* loaded from: classes2.dex */
public class NetStatusReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(9945);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!PatchProxy.proxy(new Object[]{context, intent}, this, LIZ, false, 2).isSupported && !PatchProxy.proxy(new Object[]{this, context, intent}, null, LIZ, true, 1).isSupported) {
            if (!AppMonitor.INSTANCE.isAppBackground() && intent != null && !C140192dPo.LIZIZ.contains(intent.getAction()) && C140192dPo.LIZ("onBroadcastReceiverReceive")) {
                C140181dPd.m21607LJ();
            }
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, LIZ, false, 3).isSupported && intent != null && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && GKU.LJI(context)) {
                C76656GKc.LIZ(context).LIZ();
            }
        }
    }
}
