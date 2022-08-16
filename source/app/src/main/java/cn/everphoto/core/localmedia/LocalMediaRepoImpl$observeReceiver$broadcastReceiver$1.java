package cn.everphoto.core.localmedia;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import p003X.AbstractC536287Gk;
import p003X.C106862S5w;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* loaded from: classes26.dex */
public final class LocalMediaRepoImpl$observeReceiver$broadcastReceiver$1 extends BroadcastReceiver {
    public static ChangeQuickRedirect LIZ;
    public final /* synthetic */ C0775a LIZIZ;

    static {
        Covode.recordClassIndex(3611);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!PatchProxy.proxy(new Object[]{context, intent}, this, LIZ, false, 2).isSupported && !PatchProxy.proxy(new Object[]{this, context, intent}, null, LIZ, true, 1).isSupported) {
            if (!AppMonitor.INSTANCE.isAppBackground() && intent != null && !C140192dPo.LIZIZ.contains(intent.getAction()) && C140192dPo.LIZ("onBroadcastReceiverReceive")) {
                C140181dPd.m21607LJ();
            }
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, LIZ, false, 3).isSupported) {
                C106862S5w.LIZ(context, intent);
                AbstractC536287Gk<String> abstractC536287Gk = this.LIZIZ.LIZIZ;
                String action = intent.getAction();
                if (action == null) {
                    action = "";
                }
                abstractC536287Gk.onNext(action);
            }
        }
    }
}
