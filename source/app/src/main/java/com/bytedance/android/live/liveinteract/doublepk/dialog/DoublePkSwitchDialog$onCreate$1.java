package com.bytedance.android.live.liveinteract.doublepk.dialog;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.DialogC77492Ggo;
import p003X.DialogC77499Ggv;

/* loaded from: classes3.dex */
public final class DoublePkSwitchDialog$onCreate$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77499Ggv this$0;

    static {
        Covode.recordClassIndex(26787);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoublePkSwitchDialog$onCreate$1(DialogC77499Ggv dialogC77499Ggv) {
        super(1);
        this.this$0 = dialogC77499Ggv;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            Context context = this.this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            DialogC77499Ggv dialogC77499Ggv = this.this$0;
            C116971W2r.LIZJ(new DialogC77492Ggo(context, dialogC77499Ggv, dialogC77499Ggv.LIZLLL));
        }
        return Unit.INSTANCE;
    }
}
