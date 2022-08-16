package com.bytedance.android.live.broadcast.preview.widget;

import android.content.Context;
import android.content.res.AssetManager;
import android.view.TextureView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.AbstractC2863ai;
import com.bytedance.android.live.broadcast.AbstractC2864aj;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.pushstream.IPushStreamService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.avframework.livestreamv2.core.LiveCore;
import com.p1594ss.avframework.livestreamv2.filter.IFilterManager;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.AbstractC86658KCu;
import p003X.C86568K9i;
import p003X.K70;
import p003X.K71;
import p003X.K7O;
import p003X.K8D;
import p003X.K8E;
import p003X.K8Q;
import p003X.K9P;

/* loaded from: classes5.dex */
public final class LiveCameraWidget extends LiveRecyclableWidget implements AbstractC86658KCu, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public C86568K9i LIZIZ;
    public AbstractC2864aj LIZJ;
    public AbstractC2863ai LIZLLL;

    /* renamed from: LJ */
    public AbstractC5436a f25927LJ;
    public TextureView LJFF;

    static {
        Covode.recordClassIndex(17510);
    }

    @Override // p003X.AbstractC86658KCu
    public final void LIZ(K9P k9p) {
        boolean z = PatchProxy.proxy(new Object[]{k9p}, this, LIZ, false, 21).isSupported;
    }

    @Override // p003X.AbstractC86658KCu
    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131700805;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 22).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public LiveCameraWidget() {
        K8Q.LIZ().LIZIZ().LIZ(this);
    }

    @Override // p003X.AbstractC86658KCu
    public final void LIZIZ() {
        AbstractC5436a abstractC5436a;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported && (abstractC5436a = this.f25927LJ) != null) {
            abstractC5436a.LJI();
        }
    }

    @Override // p003X.AbstractC86658KCu
    public final void LIZJ() {
        AbstractC5436a abstractC5436a;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported && (abstractC5436a = this.f25927LJ) != null) {
            abstractC5436a.LJII();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        AbstractC5436a abstractC5436a = this.f25927LJ;
        if (abstractC5436a != null) {
            abstractC5436a.LJII();
        }
        super.onPause();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onResume();
        AbstractC5436a abstractC5436a = this.f25927LJ;
        if (abstractC5436a != null) {
            abstractC5436a.LJI();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        AbstractC5436a abstractC5436a = this.f25927LJ;
        if (abstractC5436a != null) {
            abstractC5436a.LIZ();
        }
        AbstractC5436a abstractC5436a2 = this.f25927LJ;
        if (abstractC5436a2 != null) {
            abstractC5436a2.mo15611LJ();
        }
    }

    private final AbstractC5436a LIZLLL() {
        AssetManager assetManager;
        K71 LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 18);
        if (proxy.isSupported) {
            return (AbstractC5436a) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 19);
        if (proxy2.isSupported) {
            LIZ2 = (K71) proxy2.result;
        } else {
            if (this.context != null) {
                K70 k70 = new K70(this.context);
                k70.LIZ((K7O) new K8E());
                k70.LJI(720);
                k70.LJII(1280);
                k70.LIZ("live-preview");
                k70.LIZ(720, 1280);
                k70.LJFF(15);
                Context context = this.context;
                if (context != null) {
                    assetManager = context.getAssets();
                } else {
                    assetManager = null;
                }
                k70.LIZ(assetManager);
                k70.LIZJ(C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZJ());
                C4173o LIZ3 = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT);
                Context context2 = this.context;
                Intrinsics.checkNotNull(context2);
                k70.LIZ(LIZ3.LIZ(context2));
                k70.LJIIJJI(0);
                k70.LJIIJ(1);
                LIZ2 = k70.LIZ();
            }
            return null;
        }
        if (LIZ2 != null) {
            try {
                AbstractC5436a createLiveStreamWithConfig = ((IPushStreamService) ServiceManager.getService(IPushStreamService.class)).createLiveStreamWithConfig(LIZ2);
                LiveCore LJIILL = createLiveStreamWithConfig.LJIILL();
                if (LJIILL != null) {
                    LJIILL.setDisplay(this.LJFF);
                }
                createLiveStreamWithConfig.LJIIJ().enable(true);
                createLiveStreamWithConfig.LJIIJ().composerSetMode(1, 0);
                return createLiveStreamWithConfig;
            } catch (NoClassDefFoundError e) {
                AbstractC2863ai abstractC2863ai = this.LIZLLL;
                if (abstractC2863ai != null) {
                    abstractC2863ai.LIZ(this.context, "LiveCameraWidget", e);
                    return null;
                }
                return null;
            } catch (UnsatisfiedLinkError e2) {
                AbstractC2863ai abstractC2863ai2 = this.LIZLLL;
                if (abstractC2863ai2 != null) {
                    abstractC2863ai2.LIZ(this.context, "LiveCameraWidget", e2);
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LJFF = (TextureView) this.contentView.findViewById(2131191092);
    }

    @Override // p003X.AbstractC86658KCu
    public final int LIZIZ(String[] strArr) {
        IFilterManager LJIIJ;
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{strArr}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC5436a abstractC5436a = this.f25927LJ;
        if (abstractC5436a != null && (LJIIJ = abstractC5436a.LJIIJ()) != null) {
            if (strArr != null) {
                i = strArr.length;
            }
            return LJIIJ.composerAppendNodes(strArr, i);
        }
        return -1;
    }

    @Override // p003X.AbstractC86658KCu
    public final int LIZJ(String[] strArr) {
        IFilterManager LJIIJ;
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{strArr}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC5436a abstractC5436a = this.f25927LJ;
        if (abstractC5436a != null && (LJIIJ = abstractC5436a.LJIIJ()) != null) {
            if (strArr != null) {
                i = strArr.length;
            }
            return LJIIJ.composerRemoveNodes(strArr, i);
        }
        return -1;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        AbstractC5436a LIZLLL;
        IFilterManager iFilterManager;
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 2).isSupported || (LIZLLL = LIZLLL()) == null) {
            return;
        }
        this.f25927LJ = LIZLLL;
        AbstractC5436a abstractC5436a = this.f25927LJ;
        if (abstractC5436a != null) {
            iFilterManager = abstractC5436a.LJIIJ();
        } else {
            iFilterManager = null;
        }
        this.LIZIZ = new C86568K9i(iFilterManager);
        AbstractC2864aj abstractC2864aj = this.LIZJ;
        if (abstractC2864aj != null) {
            abstractC2864aj.LIZ(new K8D(this));
        }
    }

    @Override // p003X.AbstractC86658KCu
    public final int LIZ(String str) {
        IFilterManager LJIIJ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC5436a abstractC5436a = this.f25927LJ;
        if (abstractC5436a != null && (LJIIJ = abstractC5436a.LJIIJ()) != null) {
            return LJIIJ.setEffect(str);
        }
        return -1;
    }

    @Override // p003X.AbstractC86658KCu
    public final int LIZ(String[] strArr) {
        IFilterManager LJIIJ;
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{strArr}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC5436a abstractC5436a = this.f25927LJ;
        if (abstractC5436a != null && (LJIIJ = abstractC5436a.LJIIJ()) != null) {
            if (strArr != null) {
                i = strArr.length;
            }
            return LJIIJ.composerSetNodes(strArr, i);
        }
        return -1;
    }

    @Override // p003X.AbstractC86658KCu
    public final void LIZIZ(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 15).isSupported && LIZ()) {
            C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJFF().LIZ(i);
        }
    }

    @Override // p003X.AbstractC86658KCu
    public final void LIZ(int i) {
        AbstractC5436a abstractC5436a;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        if (i == 0) {
            AbstractC5436a abstractC5436a2 = this.f25927LJ;
            if (abstractC5436a2 != null) {
                abstractC5436a2.LIZIZ(2);
            }
        } else if (i == 1 && (abstractC5436a = this.f25927LJ) != null) {
            abstractC5436a.LIZIZ(1);
        }
    }

    @Override // p003X.AbstractC86658KCu
    public final int LIZ(int i, int i2) {
        IFilterManager LJIIJ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 12);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC5436a abstractC5436a = this.f25927LJ;
        if (abstractC5436a != null && (LJIIJ = abstractC5436a.LJIIJ()) != null) {
            return LJIIJ.composerSetMode(1, 0);
        }
        return -1;
    }

    @Override // p003X.AbstractC86658KCu
    public final int LIZIZ(String[] strArr, String[] strArr2) {
        IFilterManager LJIIJ;
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{strArr, strArr2}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC5436a abstractC5436a = this.f25927LJ;
        if (abstractC5436a != null && (LJIIJ = abstractC5436a.LJIIJ()) != null) {
            if (strArr != null) {
                i = strArr.length;
            }
            return LJIIJ.composerAppendNodesWithTags(strArr, i, strArr2);
        }
        return -1;
    }

    @Override // p003X.AbstractC86658KCu
    public final int LIZ(String[] strArr, String[] strArr2) {
        IFilterManager LJIIJ;
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{strArr, strArr2}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC5436a abstractC5436a = this.f25927LJ;
        if (abstractC5436a != null && (LJIIJ = abstractC5436a.LJIIJ()) != null) {
            if (strArr != null) {
                i = strArr.length;
            }
            return LJIIJ.composerSetNodesWithTags(strArr, i, strArr2);
        }
        return -1;
    }
}
