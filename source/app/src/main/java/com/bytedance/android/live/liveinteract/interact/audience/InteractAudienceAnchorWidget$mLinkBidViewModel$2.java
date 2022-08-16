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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC413392Xt;
import p003X.C78531GxZ;

/* loaded from: classes3.dex */
public final class InteractAudienceAnchorWidget$mLinkBidViewModel$2 extends Lambda implements Function0<C4378a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ InteractAudienceAnchorWidget this$0;

    static {
        Covode.recordClassIndex(26987);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractAudienceAnchorWidget$mLinkBidViewModel$2(InteractAudienceAnchorWidget interactAudienceAnchorWidget) {
        super(0);
        this.this$0 = interactAudienceAnchorWidget;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.bytedance.android.live.liveinteract.chatroom.chatroom.vm.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.bytedance.android.live.liveinteract.chatroom.chatroom.vm.a, androidx.lifecycle.ViewModel, java.lang.Object] */
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
            ALogger.m15801d("InteractAudienceAnchorWidget", "init newBidViewModel");
            return c4378a;
        }
        Context context = this.this$0.context;
        if (context != null) {
            ?? r1 = ViewModelProviders.m21142of((FragmentActivity) context).get(C4378a.class);
            Intrinsics.checkNotNullExpressionValue(r1, "");
            return r1;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
