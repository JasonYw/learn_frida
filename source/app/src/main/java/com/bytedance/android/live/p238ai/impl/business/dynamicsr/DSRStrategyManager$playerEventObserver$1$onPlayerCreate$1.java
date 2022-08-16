package com.bytedance.android.live.p238ai.impl.business.dynamicsr;

import com.bytedance.android.livesdkapi.roomplayer.ILivePlayerClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C99978PZc;

/* renamed from: com.bytedance.android.live.ai.impl.business.dynamicsr.DSRStrategyManager$playerEventObserver$1$onPlayerCreate$1 */
/* loaded from: classes8.dex */
public final class DSRStrategyManager$playerEventObserver$1$onPlayerCreate$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ILivePlayerClient $player;

    static {
        Covode.recordClassIndex(13857);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DSRStrategyManager$playerEventObserver$1$onPlayerCreate$1(ILivePlayerClient iLivePlayerClient) {
        super(0);
        this.$player = iLivePlayerClient;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C99978PZc.LJFF.LIZ(this.$player);
        }
        return Unit.INSTANCE;
    }
}
