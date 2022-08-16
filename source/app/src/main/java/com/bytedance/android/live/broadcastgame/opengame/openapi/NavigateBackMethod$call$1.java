package com.bytedance.android.live.broadcastgame.opengame.openapi;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.navigator.LynxNavigator;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import p003X.AbstractC87551Kef;
import p003X.C87586KfE;

/* loaded from: classes5.dex */
public final class NavigateBackMethod$call$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ y$a $params;
    public final /* synthetic */ C87586KfE this$0;

    static {
        Covode.recordClassIndex(20509);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigateBackMethod$call$1(C87586KfE c87586KfE, y$a y_a) {
        super(0);
        this.this$0 = c87586KfE;
        this.$params = y_a;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            if (this.$params.LIZIZ > 0) {
                Iterator<Integer> it = new IntRange(1, this.$params.LIZIZ).iterator();
                while (it.hasNext()) {
                    ((IntIterator) it).nextInt();
                    LynxNavigator.inst().goBack();
                }
                this.this$0.LIZIZ();
            } else {
                AbstractC87551Kef.LIZ(this.this$0, OpenApiErrorInfo.INCORRECT_PARAMS, null, 2, null);
            }
        }
        return Unit.INSTANCE;
    }
}
