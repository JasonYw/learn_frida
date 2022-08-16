package com.bytedance.android.live.liveinteract.interact.audience;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.bid.C4287a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p354vm.C4378a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC413392Xt;
import p003X.C78531GxZ;

/* loaded from: classes3.dex */
public final class InteractAudienceGuestWidget$bidViewModel$2 extends Lambda implements Function0<C4378a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ InteractAudienceGuestWidget this$0;

    static {
        Covode.recordClassIndex(26992);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractAudienceGuestWidget$bidViewModel$2(InteractAudienceGuestWidget interactAudienceGuestWidget) {
        super(0);
        this.this$0 = interactAudienceGuestWidget;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [com.bytedance.android.live.liveinteract.chatroom.chatroom.vm.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4378a mo30099invoke() {
        C4378a c4378a;
        AbstractC413392Xt<C4378a> LIZIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C4287a LIZ = C4287a.LIZJ.LIZ();
        if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null) {
            c4378a = LIZIZ.LIZIZ();
        } else {
            c4378a = null;
        }
        if (C78531GxZ.LIZJ() && c4378a != null) {
            ALogger.m15801d("InteractAudienceGuestWidget", "init newBidViewModel");
        } else {
            if (this.this$0.context instanceof FragmentActivity) {
                Context context = this.this$0.context;
                if (context != null) {
                    c4378a = (C4378a) ViewModelProviders.m21142of((FragmentActivity) context).get(C4378a.class);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            } else {
                c4378a = new C4378a();
                this.this$0.LJIIIZ = c4378a;
            }
            Intrinsics.checkNotNullExpressionValue(c4378a, "");
        }
        DataCenter dataCenter = this.this$0.dataCenter;
        if (!PatchProxy.proxy(new Object[]{dataCenter}, c4378a, C4378a.LIZ, false, 3).isSupported) {
            c4378a.LJJIJ = dataCenter;
            if (dataCenter != null) {
                dataCenter.observe("cmd_interact_link_window_change", c4378a.LJJIIZI, true);
            }
        }
        return c4378a;
    }
}
