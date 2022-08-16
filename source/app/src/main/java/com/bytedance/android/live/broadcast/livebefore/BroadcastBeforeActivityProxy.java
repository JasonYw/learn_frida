package com.bytedance.android.live.broadcast.livebefore;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcast.AbstractC2863ai;
import com.bytedance.android.live.broadcast.AbstractC2868an;
import com.bytedance.android.live.broadcast.LiveCameraResManager;
import com.bytedance.android.live.broadcast.livebefore.BroadcastBeforeActivityProxy;
import com.bytedance.android.live.core.p317e.C4070a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostApp;
import com.bytedance.android.livehostapi.foundation.depend.PluginType;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC4569445g;
import p003X.AbstractC91058Lu8;
import p003X.C116971W2r;
import p003X.C88440Kt0;
import p003X.C88613Kvn;
import p003X.DialogC88906L1g;
import p003X.K8Q;
import p003X.KD7;
import p003X.KDC;
import p003X.KDD;

/* loaded from: classes5.dex */
public class BroadcastBeforeActivityProxy extends LiveActivityProxy implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public DialogC88906L1g LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public int f25909LJ;
    public boolean LJFF;
    public AbstractC2863ai LJI;
    public AbstractC2868an LJII;
    public boolean LJIIJJI;

    static {
        Covode.recordClassIndex(16920);
    }

    @Override // com.bytedance.android.livesdkapi.LiveActivityProxy, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 15).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdkapi.LiveActivityProxy
    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return super.LIZ();
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        LiveCameraResManager.INST.isLoadedRes.observe(this.LJIIJ, new Observer(this) { // from class: X.KD8
            public static ChangeQuickRedirect LIZ;
            public final BroadcastBeforeActivityProxy LIZIZ;

            static {
                Covode.recordClassIndex(16922);
            }

            {
                this.LIZIZ = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Bundle extras;
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                BroadcastBeforeActivityProxy broadcastBeforeActivityProxy = this.LIZIZ;
                Boolean bool = (Boolean) obj;
                if (PatchProxy.proxy(new Object[]{bool}, broadcastBeforeActivityProxy, BroadcastBeforeActivityProxy.LIZ, false, 13).isSupported) {
                    return;
                }
                PluginType.LiveResource.LIZJ();
                if (bool != null && bool.booleanValue()) {
                    KD7.LIZ();
                    if (broadcastBeforeActivityProxy.LIZJ != null && broadcastBeforeActivityProxy.LIZJ.isShowing()) {
                        C116971W2r.LIZ(broadcastBeforeActivityProxy.LIZJ);
                    }
                    if (broadcastBeforeActivityProxy.LJFF) {
                        return;
                    }
                    broadcastBeforeActivityProxy.LJFF = true;
                    FragmentTransaction beginTransaction = broadcastBeforeActivityProxy.LJIIJ.getSupportFragmentManager().beginTransaction();
                    if (broadcastBeforeActivityProxy.LJII == null) {
                        return;
                    }
                    AbstractC2868an abstractC2868an = broadcastBeforeActivityProxy.LJII;
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[0], broadcastBeforeActivityProxy, BroadcastBeforeActivityProxy.LIZ, false, 12);
                    if (proxy.isSupported) {
                        extras = (Bundle) proxy.result;
                    } else {
                        extras = (broadcastBeforeActivityProxy.LJIIJ == null || broadcastBeforeActivityProxy.LJIIJ.getIntent() == null) ? null : broadcastBeforeActivityProxy.LJIIJ.getIntent().getExtras();
                    }
                    C4070a LIZ2 = abstractC2868an.LIZ(extras);
                    if (LIZ2 instanceof AbstractC86582K9w) {
                        ((AbstractC86582K9w) LIZ2).LIZ(broadcastBeforeActivityProxy.LIZIZ);
                    }
                    beginTransaction.replace(2131197842, LIZ2);
                    beginTransaction.commitAllowingStateLoss();
                } else if (broadcastBeforeActivityProxy.LIZLLL > 3) {
                    KD7.LIZ(5);
                    C88440Kt0.LIZ(2131586082);
                    if (broadcastBeforeActivityProxy.LIZJ != null && broadcastBeforeActivityProxy.LIZJ.isShowing()) {
                        C116971W2r.LIZ(broadcastBeforeActivityProxy.LIZJ);
                    }
                    broadcastBeforeActivityProxy.LJIIJ.finish();
                } else {
                    LiveCameraResManager.INST.LIZIZ();
                    broadcastBeforeActivityProxy.LIZLLL++;
                }
            }
        });
    }

    @Override // com.bytedance.android.livesdkapi.LiveActivityProxy
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdkapi.LiveActivityProxy
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onStart();
    }

    @Override // com.bytedance.android.livesdkapi.LiveActivityProxy
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onStop();
    }

    @Override // com.bytedance.android.livesdkapi.LiveActivityProxy
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onPause();
        DialogC88906L1g dialogC88906L1g = this.LIZJ;
        if (dialogC88906L1g != null && dialogC88906L1g.isShowing()) {
            C116971W2r.LIZ(this.LIZJ);
        }
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        if (PluginType.LiveResource.LIZIZ()) {
            LIZJ();
        } else if (!NetworkUtils.isNetworkAvailable(this.LJIIJ)) {
            C88613Kvn.LIZ(this.LJIIJ, 2131582739);
        } else if (NetworkUtils.getNetworkType(this.LJIIJ) == NetworkUtils.NetworkType.MOBILE_2G) {
            C88613Kvn.LIZ(this.LJIIJ, 2131586496);
        } else if (this.f25909LJ > 3) {
        } else {
            PluginType.LiveResource.LIZ(this.LJIIJ, new AbstractC91058Lu8() { // from class: com.bytedance.android.live.broadcast.livebefore.BroadcastBeforeActivityProxy.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(16921);
                }

                @Override // p003X.AbstractC91058Lu8
                public final void LIZIZ(String str) {
                    if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported) {
                        return;
                    }
                    BroadcastBeforeActivityProxy.this.LIZIZ();
                    BroadcastBeforeActivityProxy.this.f25909LJ++;
                }

                @Override // p003X.AbstractC91058Lu8
                public final void LIZ(String str) {
                    if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    if (!NetworkUtils.isNetworkAvailable(BroadcastBeforeActivityProxy.this.LJIIJ)) {
                        KD7.LIZ(2);
                        C88613Kvn.LIZ(BroadcastBeforeActivityProxy.this.LJIIJ, 2131582739);
                    } else if (NetworkUtils.getNetworkType(BroadcastBeforeActivityProxy.this.LJIIJ) == NetworkUtils.NetworkType.MOBILE_2G) {
                        KD7.LIZ(3);
                        C88613Kvn.LIZ(BroadcastBeforeActivityProxy.this.LJIIJ, 2131586496);
                    } else {
                        BroadcastBeforeActivityProxy.this.LIZJ();
                    }
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdkapi.LiveActivityProxy
    public void onCreate() {
        Intent intent;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        K8Q.LIZ().LJIIIIZZ().LIZ(this);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            Intent intent2 = this.LJIIJ.getIntent();
            this.LIZIZ = 0;
            if (intent2 != null) {
                this.LIZIZ = intent2.getIntExtra("START_LIVE_TYPE", 0);
                this.LJIIJJI = intent2.getBooleanExtra("START_LIVE_AUTH", false);
            }
        }
        this.LJFF = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LiveActivityProxy.LJIIIIZZ, false, 5);
        String str = null;
        if (proxy.isSupported) {
            intent = (Intent) proxy.result;
        } else if (this.LJIIJ != null) {
            intent = this.LJIIJ.getIntent();
        } else {
            intent = null;
        }
        if (intent != null) {
            str = intent.getStringExtra("broadcast_enter_from");
        }
        if (!KDD.LIZ || (this.LIZIZ != 2 && !this.LJIIJJI)) {
            Intent intent3 = new Intent(this.LJIIJ, ((IHostApp) ServiceManager.getService(IHostApp.class)).getHostActivity(17));
            intent3.putExtra("START_LIVE_TYPE", this.LIZIZ);
            intent3.putExtra("START_LIVE_AUTH", this.LJIIJJI);
            if (!TextUtils.isEmpty(str)) {
                intent3.putExtra("broadcast_enter_from", str);
            }
            C116971W2r.LIZIZ(this.LJIIJ, intent3);
            this.LJIIJ.finish();
            return;
        }
        KDC kdc = (KDC) ServiceManager.getService(KDC.class);
        if (kdc != null) {
            PluginType.LiveResource.LIZ();
            if (kdc.LIZ()) {
                AbstractC2863ai abstractC2863ai = this.LJI;
                if (abstractC2863ai != null) {
                    abstractC2863ai.LIZ();
                }
                this.LJIIJ.setContentView(2131700877);
                LIZIZ();
                return;
            }
        }
        C88440Kt0.LIZ(this.LJIIJ, 2131589717);
        this.LJIIJ.finish();
    }

    @Override // com.bytedance.android.livesdkapi.LiveActivityProxy
    public final void LIZ(int i, int i2, Intent intent) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, LIZ, false, 9).isSupported) {
            return;
        }
        super.LIZ(i, i2, intent);
    }
}
