package com.bytedance.android.live.broadcast.api;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostApp;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import java.lang.ref.WeakReference;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC150230g2A;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C140181dPd;
import p003X.C140192dPo;
import p003X.C75548FqY;
import p003X.G4T;

@Deprecated(message = "这个判断退后台的方法问题太多，使用HostAppMonitorService")
/* loaded from: classes2.dex */
public final class LiveLifecycle extends BroadcastReceiver implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect LIZ;
    public AbstractC150230g2A LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public Handler f25772LJ;
    public int LJFF;
    public WeakReference<Context> LJI;

    static {
        Covode.recordClassIndex(14402);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public LiveLifecycle() {
    }

    public final void LIZ() {
        Context context;
        Context context2;
        Context context3;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        WeakReference<Context> weakReference = this.LJI;
        if (weakReference != null && (context3 = weakReference.get()) != null) {
            C116971W2r.LIZ(context3, this);
        }
        WeakReference<Context> weakReference2 = this.LJI;
        if (weakReference2 != null) {
            context = weakReference2.get();
        } else {
            context = null;
        }
        if (context instanceof Application) {
            WeakReference<Context> weakReference3 = this.LJI;
            if (weakReference3 != null && (context2 = weakReference3.get()) != null) {
                ((Application) context2).unregisterActivityLifecycleCallbacks(this);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
        }
        this.LJI = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.LJFF++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, LIZ, false, 2).isSupported) {
            return;
        }
        int i = this.LIZJ;
        if (i > 0) {
            this.LIZJ = i - 1;
        }
        Handler handler = this.f25772LJ;
        Intrinsics.checkNotNull(handler);
        handler.postDelayed(new G4T(this, activity), 300L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(activity);
        this.LIZJ++;
        if (this.LIZLLL) {
            this.LIZLLL = false;
            AbstractC150230g2A abstractC150230g2A = this.LIZIZ;
            if (abstractC150230g2A != null) {
                abstractC150230g2A.LIZ();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        IHostApp iHostApp;
        AbstractC150230g2A abstractC150230g2A;
        if (PatchProxy.proxy(new Object[]{activity}, this, LIZ, false, 3).isSupported) {
            return;
        }
        int i = this.LJFF;
        if (i > 0) {
            this.LJFF = i - 1;
        }
        if (this.LIZJ <= 0 && this.LJFF == 0) {
            if (!this.LIZLLL && (((iHostApp = (IHostApp) ServiceManager.getService(IHostApp.class)) == null || iHostApp.getCurrentActivity() == null) && (abstractC150230g2A = this.LIZIZ) != null)) {
                abstractC150230g2A.LIZ((Context) activity);
            }
            this.LIZLLL = true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveLifecycle(Context context, AbstractC150230g2A abstractC150230g2A) {
        this();
        Context context2;
        Context context3;
        C106862S5w.LIZ(context);
        this.LIZIZ = abstractC150230g2A;
        this.f25772LJ = new Handler();
        this.LJI = new WeakReference<>(context.getApplicationContext());
        WeakReference<Context> weakReference = this.LJI;
        if ((weakReference != null ? weakReference.get() : null) instanceof Application) {
            WeakReference<Context> weakReference2 = this.LJI;
            if (weakReference2 != null && (context3 = weakReference2.get()) != null) {
                ((Application) context3).registerActivityLifecycleCallbacks(this);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
        }
        WeakReference<Context> weakReference3 = this.LJI;
        if (weakReference3 != null && (context2 = weakReference3.get()) != null) {
            C116971W2r.LIZ(context2, this, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        AbstractC150230g2A abstractC150230g2A;
        if (!PatchProxy.proxy(new Object[]{context, intent}, this, LIZ, false, 5).isSupported && !PatchProxy.proxy(new Object[]{this, context, intent}, null, LIZ, true, 4).isSupported) {
            if (!AppMonitor.INSTANCE.isAppBackground() && intent != null && !C140192dPo.LIZIZ.contains(intent.getAction()) && C140192dPo.LIZ("onBroadcastReceiverReceive")) {
                C140181dPd.m21607LJ();
            }
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, LIZ, false, 6).isSupported) {
                C106862S5w.LIZ(intent);
                if (!C75548FqY.LIZJ() && !C75548FqY.LIZLLL() && (action = intent.getAction()) != null && Intrinsics.areEqual(action, "android.intent.action.CLOSE_SYSTEM_DIALOGS") && Intrinsics.areEqual("homekey", intent.getStringExtra(MiPushCommandMessage.KEY_REASON))) {
                    if (!this.LIZLLL && (abstractC150230g2A = this.LIZIZ) != null) {
                        abstractC150230g2A.LIZ(context);
                    }
                    this.LIZLLL = true;
                }
            }
        }
    }
}
