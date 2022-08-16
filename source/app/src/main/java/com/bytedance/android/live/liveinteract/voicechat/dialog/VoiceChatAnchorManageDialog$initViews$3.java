package com.bytedance.android.live.liveinteract.voicechat.dialog;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.DialogC78738H2e;

/* loaded from: classes25.dex */
public final class VoiceChatAnchorManageDialog$initViews$3 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC78738H2e this$0;

    static {
        Covode.recordClassIndex(30988);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceChatAnchorManageDialog$initViews$3(DialogC78738H2e dialogC78738H2e) {
        super(1);
        this.this$0 = dialogC78738H2e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            C116971W2r.LIZ(this.this$0);
        }
        return Unit.INSTANCE;
    }
}
