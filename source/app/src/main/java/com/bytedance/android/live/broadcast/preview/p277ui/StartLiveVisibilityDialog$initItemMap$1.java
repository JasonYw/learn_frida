package com.bytedance.android.live.broadcast.preview.p277ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C77741Gkp;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.StartLiveVisibilityDialog$initItemMap$1 */
/* loaded from: classes3.dex */
public final class StartLiveVisibilityDialog$initItemMap$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C77741Gkp this$0;

    static {
        Covode.recordClassIndex(17326);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveVisibilityDialog$initItemMap$1(C77741Gkp c77741Gkp) {
        super(0);
        this.this$0 = c77741Gkp;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        LIZ();
        return Unit.INSTANCE;
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        if (!this.this$0.LJFF) {
            C77741Gkp c77741Gkp = this.this$0;
            C77741Gkp.LIZ(c77741Gkp, c77741Gkp.LIZJ, 0, this.this$0.LIZIZ(), false, 4, null);
            return;
        }
        C77741Gkp c77741Gkp2 = this.this$0;
        c77741Gkp2.LIZ(c77741Gkp2.LIZJ, 1, this.this$0.LIZLLL(), this.this$0.LJFF);
    }
}
