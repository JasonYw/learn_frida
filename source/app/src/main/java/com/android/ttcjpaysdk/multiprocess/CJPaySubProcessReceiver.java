package com.android.ttcjpaysdk.multiprocess;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayResult;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* loaded from: classes17.dex */
public class CJPaySubProcessReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(7873);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!PatchProxy.proxy(new Object[]{context, intent}, this, LIZ, false, 2).isSupported && !PatchProxy.proxy(new Object[]{this, context, intent}, null, LIZ, true, 1).isSupported) {
            if (!AppMonitor.INSTANCE.isAppBackground() && intent != null && !C140192dPo.LIZIZ.contains(intent.getAction()) && C140192dPo.LIZ("onBroadcastReceiverReceive")) {
                C140181dPd.m21607LJ();
            }
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, LIZ, false, 3).isSupported) {
                try {
                    String stringExtra = intent.getStringExtra("multi_process_result_type");
                    int hashCode = stringExtra.hashCode();
                    if (hashCode != 1257036724) {
                        if (hashCode == 1714305967 && stringExtra.equals("H5_RESULT")) {
                            C2118a.LIZ().LJIILIIL.onResult(intent.getIntExtra("multi_process_h5_code_result", 0), intent.getStringExtra("multi_process_h5_msg_result"));
                        }
                    } else if (stringExtra.equals("PAY_RESULT")) {
                        C2118a.LIZ().LJIIIIZZ.onPayCallback((TTCJPayResult) intent.getParcelableExtra("multi_process_pay_result"));
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
