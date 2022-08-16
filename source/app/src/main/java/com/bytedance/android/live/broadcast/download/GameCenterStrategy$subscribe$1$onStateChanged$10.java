package com.bytedance.android.live.broadcast.download;

import com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C89255LEr;

/* loaded from: classes5.dex */
public final class GameCenterStrategy$subscribe$1$onStateChanged$10 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C89255LEr this$0;

    static {
        Covode.recordClassIndex(15518);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameCenterStrategy$subscribe$1$onStateChanged$10(C89255LEr c89255LEr) {
        super(0);
        this.this$0 = c89255LEr;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C3002c c3002c = this.this$0.LIZJ;
            if (c3002c != null) {
                c3002c.LJJIJLIJ = 0L;
            }
            C3002c c3002c2 = this.this$0.LIZJ;
            if (c3002c2 != null) {
                c3002c2.LJJIL = 0L;
            }
            AbstractC2889a abstractC2889a = this.this$0.LIZLLL;
            if (abstractC2889a != null) {
                abstractC2889a.LIZ();
            }
        }
        return Unit.INSTANCE;
    }
}
