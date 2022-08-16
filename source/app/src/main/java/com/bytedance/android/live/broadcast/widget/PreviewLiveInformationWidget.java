package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.widget.PreviewLiveInformationWidget;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.android.livesdk.chatroom.event.C5993bc;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC445813kF;
import p003X.AbstractC4569445g;
import p003X.C427822wK;
import p003X.C442313eb;
import p003X.C442323ec;
import p003X.C442873fV;
import p003X.C4574547f;
import p003X.C87010KQi;

@AbstractC445813kF(LIZ = "LIVE_INFO")
/* loaded from: classes12.dex */
public final class PreviewLiveInformationWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public C442323ec LIZIZ;

    static {
        Covode.recordClassIndex(18567);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewLiveInformationWidget";
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698453;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        LIZJ(new PreviewLiveInformationWidget$onCreate$1(this));
        LJIIL().add(C87010KQi.LIZ().LIZ(C5993bc.class).subscribe(new Consumer<C5993bc>() { // from class: X.3ea
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18568);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(C5993bc c5993bc) {
                C5993bc c5993bc2 = c5993bc;
                if (!PatchProxy.proxy(new Object[]{c5993bc2}, this, LIZ, false, 1).isSupported && c5993bc2.LIZ == 2) {
                    PreviewLiveInformationWidget.this.LIZIZ();
                }
            }
        }));
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onDestroy();
        C442323ec c442323ec = this.LIZIZ;
        if (c442323ec != null && c442323ec.LJIILIIL()) {
            c442323ec.dismissAllowingStateLoss();
        }
        this.LIZIZ = null;
    }

    public final void LIZIZ() {
        C442323ec c442323ec;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        C442323ec c442323ec2 = this.LIZIZ;
        if (c442323ec2 != null && c442323ec2.LJIILIIL()) {
            c442323ec2.dismissAllowingStateLoss();
        }
        C442323ec c442323ec3 = this.LIZIZ;
        if (c442323ec3 == null || c442323ec3.getContext() == null) {
            this.LIZIZ = null;
            C442313eb c442313eb = C442323ec.LIZJ;
            C3180k LJIIJJI = LJIIJJI();
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{LJIIJJI}, c442313eb, C442313eb.LIZ, false, 1);
            if (proxy.isSupported) {
                c442323ec = (C442323ec) proxy.result;
            } else {
                c442323ec = new C442323ec();
                c442323ec.LIZIZ = LJIIJJI;
            }
            this.LIZIZ = c442323ec;
        }
        if (this.context instanceof FragmentActivity) {
            C427822wK c427822wK = C9078n.LJJIJLIJ;
            Context context = this.context;
            if (context != null) {
                c427822wK.LIZ((FragmentActivity) context, this.LIZIZ);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            HashMap hashMap = new HashMap();
            try {
                IUser LIZ2 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                hashMap.put("live_type", C442873fV.LIZ.LIZIZ(LJIIJJI().LIZ().LIZ()));
                hashMap.put("anchor_id", LIZ2.getSecUid());
                hashMap.put("event_page", "live_take_page");
            } catch (Exception unused) {
            }
            C4574547f.LIZ().LIZ("livesdk_takepage_live_info_click", hashMap, new Object[0]);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onActivityResult(i, i2, intent);
        C442323ec c442323ec = this.LIZIZ;
        if (c442323ec != null) {
            c442323ec.onActivityResult(i, i2, intent);
        }
    }
}
