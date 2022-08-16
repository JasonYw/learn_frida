package com.bytedance.android.live.browser.jsbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class JsBridgeService$createJsBridgeManager$7 extends Lambda implements Function1<C3989h, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3990j this$0;

    static {
        Covode.recordClassIndex(22042);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsBridgeService$createJsBridgeManager$7(C3990j c3990j) {
        super(1);
        this.this$0 = c3990j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3989h c3989h) {
        if (!PatchProxy.proxy(new Object[]{c3989h}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c3989h);
            this.this$0.LIZIZ.remove(c3989h);
        }
        return Unit.INSTANCE;
    }
}
