package com.bytedance.android.live.effect.sticker.p331ui.gestureV3;

import com.bytedance.android.live.effect.api.AbstractC4169j;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C86722KFg;

/* renamed from: com.bytedance.android.live.effect.sticker.ui.gestureV3.LiveGestureMagicDialogFragmentVCD$liveComposerManager$2 */
/* loaded from: classes5.dex */
public final class LiveGestureMagicDialogFragmentVCD$liveComposerManager$2 extends Lambda implements Function0<AbstractC4169j> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C86722KFg this$0;

    static {
        Covode.recordClassIndex(24701);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveGestureMagicDialogFragmentVCD$liveComposerManager$2(C86722KFg c86722KFg) {
        super(0);
        this.this$0 = c86722KFg;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.android.live.effect.api.j, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbstractC4169j mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return C4173o.LJIIJ.LIZ(this.this$0.LIZJ).LJII();
    }
}
