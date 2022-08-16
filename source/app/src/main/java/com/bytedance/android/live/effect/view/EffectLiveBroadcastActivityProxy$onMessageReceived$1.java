package com.bytedance.android.live.effect.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
import p003X.AbstractC86595KAj;

/* loaded from: classes5.dex */
public final class EffectLiveBroadcastActivityProxy$onMessageReceived$1 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ EffectLiveBroadcastActivityProxy this$0;

    static {
        Covode.recordClassIndex(24814);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectLiveBroadcastActivityProxy$onMessageReceived$1(EffectLiveBroadcastActivityProxy effectLiveBroadcastActivityProxy) {
        super(1);
        this.this$0 = effectLiveBroadcastActivityProxy;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        AbstractC86595KAj abstractC86595KAj;
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported && (abstractC86595KAj = this.this$0.LIZJ) != null) {
            abstractC86595KAj.LIZ(50, RangesKt___RangesKt.coerceAtLeast(intValue, 1), 0, "");
        }
        return Unit.INSTANCE;
    }
}
