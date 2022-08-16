package com.bytedance.android.live.profit.lottery;

import com.bytedance.android.livesdkapi.sti.framework.AbstractC9710i;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.QBF;

/* loaded from: classes8.dex */
public final class LotteryIconModel$applyState$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC9710i $icon;

    static {
        Covode.recordClassIndex(33419);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LotteryIconModel$applyState$1(AbstractC9710i abstractC9710i) {
        super(0);
        this.$icon = abstractC9710i;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            ((QBF) this.$icon).setBackgroundEnabled(true);
        }
        return Unit.INSTANCE;
    }
}
