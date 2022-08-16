package com.bytedance.android.live.liveinteract.videotalk.battle;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleSeatEffectView$setSeatWebpEffect$controller$1$onFinalImageSet$1 */
/* loaded from: classes3.dex */
public final class C4850xb0a94bd9 extends Lambda implements Function0<Unit> {
    public static final C4850xb0a94bd9 INSTANCE = new C4850xb0a94bd9();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(29815);
    }

    public C4850xb0a94bd9() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            ALogger.m15800e("GuestBattleSeatEffectView", "stop effect");
        }
        return Unit.INSTANCE;
    }
}
