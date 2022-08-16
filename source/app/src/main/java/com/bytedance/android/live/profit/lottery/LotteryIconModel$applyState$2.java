package com.bytedance.android.live.profit.lottery;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.QBL;

/* loaded from: classes8.dex */
public final class LotteryIconModel$applyState$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C5337p this$0;

    static {
        Covode.recordClassIndex(33420);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LotteryIconModel$applyState$2(C5337p c5337p) {
        super(0);
        this.this$0 = c5337p;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.android.live.profit.lottery.LotteryIconModel$applyState$2.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(33421);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    LotteryIconModel$applyState$2.this.this$0.LIZIZ.LIZ(new QBL());
                }
            });
        }
        return Unit.INSTANCE;
    }
}
