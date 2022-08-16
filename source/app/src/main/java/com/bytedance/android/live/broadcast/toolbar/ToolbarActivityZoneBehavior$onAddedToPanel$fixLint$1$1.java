package com.bytedance.android.live.broadcast.toolbar;

import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar_behavior.p528a.C6532d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C413202Xa;
import p003X.C413422Xw;

/* loaded from: classes12.dex */
public final class ToolbarActivityZoneBehavior$onAddedToPanel$fixLint$1$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C413422Xw this$0;

    static {
        Covode.recordClassIndex(17933);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarActivityZoneBehavior$onAddedToPanel$fixLint$1$1(C413422Xw c413422Xw) {
        super(0);
        this.this$0 = c413422Xw;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C413202Xa.LIZ().LIZ(ToolbarButton.MORE, new C6532d("可以在这挂出活动", null, null, 0, null, null, 0, 0, null, 0, 1022));
            this.this$0.LIZIZ.LIZ(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
