package com.bytedance.android.live.effect.view;

import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.p329a.a$a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC86668KDe;
import p003X.C86604KAs;

/* loaded from: classes5.dex */
public final class EffectLivePreviewActivityProxy$onItemClickListener$2 extends Lambda implements Function0<a$a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ EffectLivePreviewActivityProxy this$0;

    static {
        Covode.recordClassIndex(24836);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectLivePreviewActivityProxy$onItemClickListener$2(EffectLivePreviewActivityProxy effectLivePreviewActivityProxy) {
        super(0);
        this.this$0 = effectLivePreviewActivityProxy;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.effect.a.a$a] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ a$a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new a$a() { // from class: com.bytedance.android.live.effect.view.EffectLivePreviewActivityProxy$onItemClickListener$2.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(24837);
            }

            @Override // com.bytedance.android.live.effect.p329a.a$a
            public final void LIZ(int i) {
                if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                EffectLivePreviewActivityProxy.LIZ(EffectLivePreviewActivityProxy$onItemClickListener$2.this.this$0).LIZ(i);
                AbstractC86668KDe.LIZIZ.LIZ(LiveEffectContextFactory.Type.DEFAULT, Integer.valueOf(i));
                AbstractC86668KDe.LIZLLL.LIZ(LiveEffectContextFactory.Type.DEFAULT, Long.valueOf(System.currentTimeMillis()));
                C86604KAs.LIZIZ.LIZ(i, "click", LiveEffectContextFactory.Type.DEFAULT);
            }
        };
    }
}
