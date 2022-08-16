package com.bytedance.android.live.broadcastgame.opengame.debug;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcastgame.api.openplatform.AbstractC3398b;
import com.bytedance.android.live.broadcastgame.opengame.AbstractC3497h;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC87170KWm;
import p003X.AbstractC87937Kkt;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C87911KkT;
import p003X.C87921Kkd;
import p003X.C87923Kkf;
import p003X.C87925Kkh;
import p003X.C87930Kkm;
import p003X.KMW;
import p003X.LK1;

/* loaded from: classes5.dex */
public abstract class OpenPlatformBaseDebugger implements AbstractC87937Kkt, AbstractC3497h {
    public static final C87923Kkf Companion = new C87923Kkf((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public String appId = "";
    public WeakReference<ViewGroup> containerViewWeakRef;
    public WeakReference<Context> contextWeakRef;
    public C87930Kkm debugFloatBall;
    public long gameId;
    public AbstractC3497h.AbstractC3498a initCallback;
    public AbstractC3398b pluginManager;

    static {
        Covode.recordClassIndex(20071);
    }

    public abstract boolean onScanFail(int i);

    public abstract boolean onScanSuccess(String str);

    public void stopDebug() {
    }

    public final String getAppId() {
        return this.appId;
    }

    public final long getGameId() {
        return this.gameId;
    }

    public final AbstractC3497h.AbstractC3498a getInitCallback() {
        return this.initCallback;
    }

    public final AbstractC3398b getPluginManager() {
        return this.pluginManager;
    }

    public final WeakReference<ViewGroup> getContainerViewWeakRef() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (WeakReference) proxy.result;
        }
        WeakReference<ViewGroup> weakReference = this.containerViewWeakRef;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return weakReference;
    }

    public final WeakReference<Context> getContextWeakRef() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (WeakReference) proxy.result;
        }
        WeakReference<Context> weakReference = this.contextWeakRef;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return weakReference;
    }

    public void releaseDebug() {
        MethodCollector.m14708i(1442);
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7).isSupported) {
            MethodCollector.m14707o(1442);
            return;
        }
        C87930Kkm c87930Kkm = this.debugFloatBall;
        if (c87930Kkm != null) {
            WeakReference<ViewGroup> weakReference = this.containerViewWeakRef;
            if (weakReference == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            ViewGroup viewGroup = weakReference.get();
            if (viewGroup != null) {
                viewGroup.removeView(c87930Kkm);
            }
            if (!PatchProxy.proxy(new Object[0], c87930Kkm, C87930Kkm.LIZ, false, 5).isSupported) {
                if (!PatchProxy.proxy(new Object[0], c87930Kkm, C87930Kkm.LIZ, false, 4).isSupported) {
                    LK1.LIZ(c87930Kkm);
                }
                c87930Kkm.LIZIZ = null;
            }
        }
        this.debugFloatBall = null;
        this.pluginManager = null;
        this.initCallback = null;
        MethodCollector.m14707o(1442);
    }

    @Override // p003X.AbstractC87937Kkt
    public void scanQRCode() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        C87911KkT c87911KkT = C87911KkT.LIZIZ;
        if (!PatchProxy.proxy(new Object[0], c87911KkT, C87911KkT.LIZ, false, 5).isSupported) {
            C87911KkT.LIZ(c87911KkT, "扫描二维码", null, 2, null);
        }
        KMW kmw = (KMW) ServiceManager.getService(KMW.class);
        if (kmw != null) {
            WeakReference<Context> weakReference = this.contextWeakRef;
            if (weakReference == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            Context context = weakReference.get();
            if (context == null) {
                return;
            }
            kmw.startScanQRCode(context, new C87921Kkd(this));
        }
    }

    public final void createDebugFloatBall() {
        C87930Kkm c87930Kkm;
        C2WC<Boolean> LJJ;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        C87925Kkh c87925Kkh = C87930Kkm.LIZJ;
        WeakReference<Context> weakReference = this.contextWeakRef;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        Context context = weakReference.get();
        if (context == null) {
            return;
        }
        WeakReference<ViewGroup> weakReference2 = this.containerViewWeakRef;
        if (weakReference2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ViewGroup viewGroup = weakReference2.get();
        if (viewGroup == null) {
            return;
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, viewGroup, this}, c87925Kkh, C87925Kkh.LIZ, false, 1);
        if (proxy.isSupported) {
            c87930Kkm = (C87930Kkm) proxy.result;
        } else {
            C106862S5w.LIZ(context, viewGroup, this);
            c87930Kkm = new C87930Kkm(viewGroup, context);
            c87930Kkm.LIZIZ = this;
        }
        this.debugFloatBall = c87930Kkm;
        C87930Kkm c87930Kkm2 = this.debugFloatBall;
        if (c87930Kkm2 != null && !PatchProxy.proxy(new Object[0], c87930Kkm2, C87930Kkm.LIZ, false, 3).isSupported) {
            LK1.LIZJ(c87930Kkm2);
        }
        AbstractC87170KWm LIZ = AbstractC87170KWm.LJI.LIZ();
        if (LIZ != null && (LJJ = LIZ.LJJ()) != null) {
            LJJ.LIZ(Boolean.TRUE);
        }
        C87911KkT.LIZ(C87911KkT.LIZIZ, "执行 createDebugFloatBall()，显示调试悬浮球", null, 2, null);
    }

    public final void setGameId(long j) {
        this.gameId = j;
    }

    public final void setInitCallback(AbstractC3497h.AbstractC3498a abstractC3498a) {
        this.initCallback = abstractC3498a;
    }

    public final void setPluginManager(AbstractC3398b abstractC3398b) {
        this.pluginManager = abstractC3398b;
    }

    public final void setAppId(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.appId = str;
    }

    public final void setContainerViewWeakRef(WeakReference<ViewGroup> weakReference) {
        if (PatchProxy.proxy(new Object[]{weakReference}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(weakReference);
        this.containerViewWeakRef = weakReference;
    }

    public final void setContextWeakRef(WeakReference<Context> weakReference) {
        if (PatchProxy.proxy(new Object[]{weakReference}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(weakReference);
        this.contextWeakRef = weakReference;
    }

    public void initDebug(Context context, DataCenter dataCenter, ViewGroup viewGroup, AbstractC3398b abstractC3398b, Map<String, ? extends Object> map, AbstractC3497h.AbstractC3498a abstractC3498a) {
        if (PatchProxy.proxy(new Object[]{context, dataCenter, viewGroup, abstractC3398b, map, abstractC3498a}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(context, dataCenter, viewGroup, abstractC3398b, map, abstractC3498a);
        this.contextWeakRef = new WeakReference<>(context);
        this.containerViewWeakRef = new WeakReference<>(viewGroup);
        this.pluginManager = abstractC3398b;
        this.initCallback = abstractC3498a;
    }
}
