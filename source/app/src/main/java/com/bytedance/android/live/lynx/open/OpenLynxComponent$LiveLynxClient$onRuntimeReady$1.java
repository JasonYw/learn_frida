package com.bytedance.android.live.lynx.open;

import com.bytedance.android.live.browser.C4053p;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C88130Ko0;

/* loaded from: classes5.dex */
public final class OpenLynxComponent$LiveLynxClient$onRuntimeReady$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C88130Ko0 this$0;

    static {
        Covode.recordClassIndex(32269);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenLynxComponent$LiveLynxClient$onRuntimeReady$1(C88130Ko0 c88130Ko0) {
        super(0);
        this.this$0 = c88130Ko0;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        C4053p c4053p;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (c4053p = this.this$0.this$0.f10641LJ) != null) {
            c4053p.LIZJ(this.this$0.this$0.LIZJ);
        }
        return Unit.INSTANCE;
    }
}
