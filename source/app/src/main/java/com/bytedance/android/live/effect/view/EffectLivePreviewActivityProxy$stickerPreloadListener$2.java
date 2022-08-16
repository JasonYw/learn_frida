package com.bytedance.android.live.effect.view;

import com.bytedance.android.live.effect.api.l$d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class EffectLivePreviewActivityProxy$stickerPreloadListener$2 extends Lambda implements Function0<C42291> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ EffectLivePreviewActivityProxy this$0;

    static {
        Covode.recordClassIndex(24838);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectLivePreviewActivityProxy$stickerPreloadListener$2(EffectLivePreviewActivityProxy effectLivePreviewActivityProxy) {
        super(0);
        this.this$0 = effectLivePreviewActivityProxy;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.android.live.effect.view.EffectLivePreviewActivityProxy$stickerPreloadListener$2$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.effect.view.EffectLivePreviewActivityProxy$stickerPreloadListener$2$1, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C42291 mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new l$d() { // from class: com.bytedance.android.live.effect.view.EffectLivePreviewActivityProxy$stickerPreloadListener$2.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(24839);
            }

            @Override // com.bytedance.android.live.effect.api.l$d
            /* renamed from: I_ */
            public final void mo15781I_() {
            }

            /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
            /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
            @Override // com.bytedance.android.live.effect.api.l$d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void LIZ(com.p1594ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r7) {
                /*
                    Method dump skipped, instructions count: 272
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.view.EffectLivePreviewActivityProxy$stickerPreloadListener$2.C42291.LIZ(com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse):void");
            }
        };
    }
}
