package com.bytedance.android.live.broadcast.props;

import com.bytedance.android.live.browser.jsbridge.event.C3952am;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class PropDetailPresenter$onQueryOrderStatusResult$3 extends Lambda implements Function1<C3952am, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3231j this$0;

    static {
        Covode.recordClassIndex(17588);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropDetailPresenter$onQueryOrderStatusResult$3(C3231j c3231j) {
        super(1);
        this.this$0 = c3231j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3952am c3952am) {
        if (!PatchProxy.proxy(new Object[]{c3952am}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ();
        }
        return Unit.INSTANCE;
    }
}
