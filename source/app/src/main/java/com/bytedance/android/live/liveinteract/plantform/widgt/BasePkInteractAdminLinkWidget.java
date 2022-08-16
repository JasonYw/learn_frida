package com.bytedance.android.live.liveinteract.plantform.widgt;

import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.linkpk.AbstractC4254a;
import com.bytedance.android.live.liveinteract.plantform.core.AbstractC4801m;
import com.bytedance.android.live.liveinteract.plantform.p385a.r$c;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.interact.model.C6068x;
import com.bytedance.android.livesdk.message.model.C8854es;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdk.message.model.LinkMicGuideMessage;
import com.bytedance.android.livesdk.message.model.ReplyType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C88440Kt0;
import p003X.C88469KtT;
import p003X.HBR;

/* loaded from: classes3.dex */
public abstract class BasePkInteractAdminLinkWidget<T extends r$c> extends BasePkInteractGuestWidget<T> implements AbstractC4801m, AbstractC4569445g {

    /* renamed from: e_ */
    public static ChangeQuickRedirect f26432e_;
    public boolean LIZIZ;
    public AbstractC4254a LIZJ;
    public HBR LJIIJJI;

    static {
        Covode.recordClassIndex(29578);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4801m
    public final void LIZ(long j) {
    }

    public void LIZ(C8874fl c8874fl) {
        if (PatchProxy.proxy(new Object[]{c8874fl}, this, f26432e_, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8874fl);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4801m
    public final void LIZIZ(LinkMicGuideMessage linkMicGuideMessage) {
        if (PatchProxy.proxy(new Object[]{linkMicGuideMessage}, this, f26432e_, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkMicGuideMessage);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4801m
    public final void LIZIZ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, f26432e_, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
    }

    public void LIZIZ(C8874fl c8874fl) {
        if (PatchProxy.proxy(new Object[]{c8874fl}, this, f26432e_, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8874fl);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4801m
    /* renamed from: X_ */
    public final void mo15699X_() {
        this.LIZIZ = false;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, f26432e_, false, 19).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget
    public final AbstractC4254a LJIILLIIL() {
        return this.LIZJ;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, f26432e_, false, 3).isSupported) {
            return;
        }
        super.onCreate();
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        this.LJIIJJI = new HBR(dataCenter, LJIILLIIL());
        HBR hbr = this.LJIIJJI;
        if (hbr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hbr.LIZ();
        HBR hbr2 = this.LJIIJJI;
        if (hbr2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hbr2.LIZ(this);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, f26432e_, false, 4).isSupported) {
            return;
        }
        super.onDestroy();
        HBR hbr = this.LJIIJJI;
        if (hbr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hbr.LIZIZ(this);
        HBR hbr2 = this.LJIIJJI;
        if (hbr2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hbr2.LIZLLL();
    }

    public final boolean LJIILL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, f26432e_, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        boolean LJI = ((IUserService) ServiceManager.getService(IUserService.class)).user().LJI();
        if (!LJI) {
            if (((IUserService) ServiceManager.getService(IUserService.class)).user().mo22927LJ()) {
                C88440Kt0.LIZ(2131581829);
            } else {
                C88440Kt0.LIZ(2131583931);
                return LJI;
            }
        }
        return LJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePkInteractAdminLinkWidget(AbstractC4254a abstractC4254a) {
        super(abstractC4254a);
        C106862S5w.LIZ(abstractC4254a);
        this.LIZJ = abstractC4254a;
        new CompositeDisposable();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4801m
    public final void LIZ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, f26432e_, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        if (c8854es.LJIILJJIL == ReplyType.Reject.ordinal()) {
            if (!TextUtils.isEmpty(c8854es.LJIILL)) {
                C88440Kt0.LIZ(c8854es.LJIILL);
            } else {
                C88440Kt0.LIZ(2131585451);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4801m
    public final void LIZ(long j, C6068x c6068x) {
        if (PatchProxy.proxy(new Object[]{new Long(j), c6068x}, this, f26432e_, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6068x);
        C88440Kt0.LIZ(2131584497);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4801m
    public final void LIZIZ(long j, Throwable th) {
        if (!PatchProxy.proxy(new Object[]{new Long(j), th}, this, f26432e_, false, 12).isSupported && (th instanceof ApiServerException)) {
            C88440Kt0.LIZ(((ApiServerException) th).mPrompt);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4801m
    /* renamed from: LJ */
    public final void mo15700LJ(long j, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), th}, this, f26432e_, false, 10).isSupported) {
            return;
        }
        this.LIZIZ = false;
        C88469KtT.LIZ(getContext(), th, 2131585533);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4801m
    public final void LIZ(long j, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), th}, this, f26432e_, false, 9).isSupported) {
            return;
        }
        C88469KtT.LIZ(this.context, th, 2131585534);
    }

    public void LIZ(long j, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, str2}, this, f26432e_, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        if (!LJIILL() || this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        HBR hbr = this.LJIIJJI;
        if (hbr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hbr.LIZ(j, str, str2);
    }
}
