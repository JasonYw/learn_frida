package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcast.api.model.PreviewStatusInfo;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.widget.DialogC9362aa;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC445813kF;
import p003X.AbstractC4569445g;
import p003X.C2WC;
import p003X.C413602Yo;
import p003X.C77347GeT;
import p003X.C88306Kqq;
import p003X.KK6;
import p003X.KLW;
import p003X.KLY;

@AbstractC445813kF(LIZ = "GROUP_PURCHASE")
/* loaded from: classes5.dex */
public final class PreviewGroupPurchaseWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public final IUser LIZJ;
    public DialogC9362aa LIZLLL;

    /* renamed from: LJ */
    public final Lazy f25988LJ = C77347GeT.LIZ(new PreviewGroupPurchaseWidget$dotView$2(this));
    public final Lazy LJFF = C77347GeT.LIZ(new PreviewGroupPurchaseWidget$bubbleTv$2(this));

    static {
        Covode.recordClassIndex(18523);
    }

    private final TextView LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (TextView) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewGroupPurchaseWidget";
    }

    public final View LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (View) (proxy.isSupported ? proxy.result : this.f25988LJ.mo27335getValue());
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 23).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C3199v LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C3199v) proxy.result;
        }
        return (C3199v) LIZ(C3199v.class).mo27335getValue();
    }

    /* renamed from: LJ */
    public final void m15869LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        View LIZJ = LIZJ();
        Intrinsics.checkNotNullExpressionValue(LIZJ, "");
        LIZJ.setVisibility(8);
    }

    public PreviewGroupPurchaseWidget() {
        IUser LIZ2 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        this.LIZJ = LIZ2;
    }

    public final String LIZLLL() {
        Integer valueOf;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        View LIZJ = LIZJ();
        if (LIZJ != null && (valueOf = Integer.valueOf(LIZJ.getVisibility())) != null && valueOf.intValue() == 0) {
            return "1";
        }
        return "0";
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (KK6.LIZ()) {
            return 2131698444;
        }
        return 2131698418;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onCreate();
        LJIILL();
        C413602Yo.LIZ(LJIIJJI().LJI(), new PreviewGroupPurchaseWidget$onCreate$1(this));
        final PreviewGroupPurchaseWidget$onCreate$2 previewGroupPurchaseWidget$onCreate$2 = new PreviewGroupPurchaseWidget$onCreate$2(this);
        if (!PatchProxy.proxy(new Object[]{previewGroupPurchaseWidget$onCreate$2}, this, LIZ, false, 14).isSupported) {
            ((GroupPurchaseApi) C88306Kqq.LIZ().LIZ(GroupPurchaseApi.class)).checkShowPermission().subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new KLW(previewGroupPurchaseWidget$onCreate$2), new Consumer<Throwable>() { // from class: X.11g
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18525);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Throwable th) {
                    if (!PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 1).isSupported) {
                        Function1.this.invoke(Boolean.FALSE);
                    }
                }
            }, KLY.LIZ);
        }
        LIZJ(new PreviewGroupPurchaseWidget$onCreate$3(this));
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 17).isSupported) {
            return;
        }
        this.LIZIZ = i;
        if (i == 0) {
            TextView LJFF = LJFF();
            Intrinsics.checkNotNullExpressionValue(LJFF, "");
            LJFF.setVisibility(8);
        } else {
            TextView LJFF2 = LJFF();
            Intrinsics.checkNotNullExpressionValue(LJFF2, "");
            LJFF2.setVisibility(0);
            TextView LJFF3 = LJFF();
            Intrinsics.checkNotNullExpressionValue(LJFF3, "");
            LJFF3.setText(String.valueOf(Math.min(i, 99)));
            m15869LJ();
        }
        C2WC<PreviewStatusInfo> m15893LJ = LJIIJJI().m15893LJ();
        PreviewStatusInfo LIZ2 = LJIIJJI().m15893LJ().LIZ();
        LIZ2.groupPurchaseCount = i;
        m15893LJ.LIZ(LIZ2);
        LIZIZ().LJJJJI().LIZ(Integer.valueOf(this.LIZIZ));
    }
}
