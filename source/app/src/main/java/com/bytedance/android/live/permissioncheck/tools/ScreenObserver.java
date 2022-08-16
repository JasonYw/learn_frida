package com.bytedance.android.live.permissioncheck.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* loaded from: classes3.dex */
public final class ScreenObserver {
    public static ChangeQuickRedirect LIZ;
    public Context LIZIZ;
    public ScreenBroadcastReceiver LIZJ = new ScreenBroadcastReceiver(this, (byte) 0);
    public AbstractC5187a LIZLLL;

    /* renamed from: com.bytedance.android.live.permissioncheck.tools.ScreenObserver$a */
    /* loaded from: classes3.dex */
    public interface AbstractC5187a {
        static {
            Covode.recordClassIndex(32822);
        }

        void LIZIZ();

        void LIZJ();
    }

    static {
        Covode.recordClassIndex(32820);
    }

    /* loaded from: classes3.dex */
    public class ScreenBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect LIZ;
        public String LIZJ;

        static {
            Covode.recordClassIndex(32821);
        }

        public ScreenBroadcastReceiver() {
        }

        public /* synthetic */ ScreenBroadcastReceiver(ScreenObserver screenObserver, byte b) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, LIZ, false, 2).isSupported && !PatchProxy.proxy(new Object[]{this, context, intent}, null, LIZ, true, 1).isSupported) {
                if (!AppMonitor.INSTANCE.isAppBackground() && intent != null && !C140192dPo.LIZIZ.contains(intent.getAction()) && C140192dPo.LIZ("onBroadcastReceiverReceive")) {
                    C140181dPd.m21607LJ();
                }
                if (!PatchProxy.proxy(new Object[]{context, intent}, this, LIZ, false, 3).isSupported) {
                    this.LIZJ = intent.getAction();
                    if (ScreenObserver.this.LIZLLL != null && !"android.intent.action.SCREEN_ON".equals(this.LIZJ)) {
                        if ("android.intent.action.SCREEN_OFF".equals(this.LIZJ)) {
                            ScreenObserver.this.LIZLLL.LIZIZ();
                        } else if ("android.intent.action.USER_PRESENT".equals(this.LIZJ)) {
                            ScreenObserver.this.LIZLLL.LIZJ();
                        }
                    }
                }
            }
        }
    }

    public ScreenObserver(Context context) {
        this.LIZIZ = context;
    }
}
