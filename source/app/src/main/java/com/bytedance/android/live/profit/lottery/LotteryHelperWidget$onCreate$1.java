package com.bytedance.android.live.profit.lottery;

import com.bytedance.android.livesdkapi.sti.framework.AbstractC9707e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public final class LotteryHelperWidget$onCreate$1 extends Lambda implements Function1<AbstractC9707e, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LotteryHelperWidget this$0;

    static {
        Covode.recordClassIndex(33417);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LotteryHelperWidget$onCreate$1(LotteryHelperWidget lotteryHelperWidget) {
        super(1);
        this.this$0 = lotteryHelperWidget;
    }

    /* renamed from: com.bytedance.android.live.profit.lottery.LotteryHelperWidget$onCreate$1$1 */
    /* loaded from: classes12.dex */
    public static final class C52951 extends Lambda implements Function0<C5337p> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(33418);
        }

        public C52951() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.profit.lottery.p, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ C5337p mo30099invoke() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            return new C5337p(LotteryHelperWidget.LIZ(LotteryHelperWidget$onCreate$1.this.this$0));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC9707e abstractC9707e) {
        AbstractC9707e abstractC9707e2 = abstractC9707e;
        if (!PatchProxy.proxy(new Object[]{abstractC9707e2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC9707e2);
            abstractC9707e2.LIZ(C5337p.class, new C52951());
        }
        return Unit.INSTANCE;
    }
}
