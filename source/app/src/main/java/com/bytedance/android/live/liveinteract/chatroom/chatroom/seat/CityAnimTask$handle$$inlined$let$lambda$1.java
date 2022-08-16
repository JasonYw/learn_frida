package com.bytedance.android.live.liveinteract.chatroom.chatroom.seat;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC81014HwW;
import p003X.AbstractC81047Hx3;
import p003X.C80848Htq;
import p003X.C81066HxM;
import p003X.C81105Hxz;

/* loaded from: classes3.dex */
public final class CityAnimTask$handle$$inlined$let$lambda$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C81105Hxz $event$inlined;
    public final /* synthetic */ C81066HxM $info$inlined;
    public final /* synthetic */ C80848Htq this$0;

    static {
        Covode.recordClassIndex(26291);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CityAnimTask$handle$$inlined$let$lambda$1(C81066HxM c81066HxM, C80848Htq c80848Htq, C81105Hxz c81105Hxz) {
        super(0);
        this.$info$inlined = c81066HxM;
        this.this$0 = c80848Htq;
        this.$event$inlined = c81105Hxz;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        AbstractC81014HwW abstractC81014HwW;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZJ.LIZ(SeatAnimTaskState.IDLE);
            C80848Htq c80848Htq = this.this$0;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c80848Htq}, null, C80848Htq.LIZ, true, 3);
            if (proxy.isSupported) {
                abstractC81014HwW = (AbstractC81014HwW) proxy.result;
            } else {
                abstractC81014HwW = c80848Htq.LIZIZ;
                if (abstractC81014HwW == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
            }
            abstractC81014HwW.LIZIZ();
            AbstractC81047Hx3 LIZ = this.this$0.LIZ();
            if (LIZ != null) {
                LIZ.LIZ(this.$event$inlined);
            }
        }
        return Unit.INSTANCE;
    }
}
