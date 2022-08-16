package com.bytedance.android.live.broadcast.preview.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class StartLiveVisibilityContext$refreshListener$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function0 $onLoading;
    public final /* synthetic */ C3207d this$0;

    static {
        Covode.recordClassIndex(17464);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveVisibilityContext$refreshListener$1(C3207d c3207d, Function0 function0) {
        super(0);
        this.this$0 = c3207d;
        this.$onLoading = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            Function0 function0 = this.$onLoading;
            if (function0 != null) {
                function0.mo30099invoke();
            }
            this.this$0.LJIJI();
        }
        return Unit.INSTANCE;
    }
}
