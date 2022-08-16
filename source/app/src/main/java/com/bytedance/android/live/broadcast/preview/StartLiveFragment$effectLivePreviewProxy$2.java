package com.bytedance.android.live.broadcast.preview;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.broadcast.AbstractC2863ai;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.view.EffectLivePreviewActivityProxy;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC86605KAt;
import p003X.C86660KCw;
import p003X.KJV;

/* loaded from: classes5.dex */
public final class StartLiveFragment$effectLivePreviewProxy$2 extends Lambda implements Function0<EffectLivePreviewActivityProxy> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KJV this$0;

    static {
        Covode.recordClassIndex(17111);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveFragment$effectLivePreviewProxy$2(KJV kjv) {
        super(0);
        this.this$0 = kjv;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.bytedance.android.live.effect.view.EffectLivePreviewActivityProxy, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ EffectLivePreviewActivityProxy mo30099invoke() {
        AbstractC86605KAt LIZLLL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        FragmentActivity activity = this.this$0.getActivity();
        if (activity != null) {
            AbstractC2863ai abstractC2863ai = this.this$0.LJIILL;
            if (abstractC2863ai != null && (LIZLLL = abstractC2863ai.LIZLLL()) != null) {
                C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZ(LIZLLL);
            }
            return new EffectLivePreviewActivityProxy(activity, new C86660KCw(this));
        }
        return null;
    }
}
