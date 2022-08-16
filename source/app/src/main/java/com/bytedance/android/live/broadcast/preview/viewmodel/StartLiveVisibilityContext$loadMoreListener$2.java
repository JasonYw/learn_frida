package com.bytedance.android.live.broadcast.preview.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class StartLiveVisibilityContext$loadMoreListener$2 extends Lambda implements Function1<Throwable, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $onError;
    public final /* synthetic */ C3207d this$0;

    static {
        Covode.recordClassIndex(17461);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveVisibilityContext$loadMoreListener$2(C3207d c3207d, Function1 function1) {
        super(1);
        this.this$0 = c3207d;
        this.$onError = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Throwable th) {
        Throwable th2 = th;
        if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 1).isSupported) {
            Function1 function1 = this.$onError;
            if (function1 != null) {
                function1.invoke(th2);
            }
            this.this$0.LIZIZ(th2);
        }
        return Unit.INSTANCE;
    }
}
