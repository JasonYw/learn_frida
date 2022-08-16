package com.bytedance.android.live.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* loaded from: classes5.dex */
public class PhoneStateReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect LIZ;
    public AbstractC2858a LIZIZ;

    /* renamed from: com.bytedance.android.live.broadcast.PhoneStateReceiver$a */
    /* loaded from: classes5.dex */
    public interface AbstractC2858a {
        static {
            Covode.recordClassIndex(14303);
        }

        void LIZIZ(String str);
    }

    static {
        Covode.recordClassIndex(14302);
    }

    public PhoneStateReceiver(AbstractC2858a abstractC2858a) {
        this.LIZIZ = abstractC2858a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!PatchProxy.proxy(new Object[]{context, intent}, this, LIZ, false, 2).isSupported && !PatchProxy.proxy(new Object[]{this, context, intent}, null, LIZ, true, 1).isSupported) {
            if (!AppMonitor.INSTANCE.isAppBackground() && intent != null && !C140192dPo.LIZIZ.contains(intent.getAction()) && C140192dPo.LIZ("onBroadcastReceiverReceive")) {
                C140181dPd.m21607LJ();
            }
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, LIZ, false, 3).isSupported && "android.intent.action.PHONE_STATE".equals(intent.getAction())) {
                this.LIZIZ.LIZIZ(intent.getStringExtra("state"));
            }
        }
    }
}
