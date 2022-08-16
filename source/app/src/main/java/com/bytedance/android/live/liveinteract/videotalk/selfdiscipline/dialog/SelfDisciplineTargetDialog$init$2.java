package com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.dialog;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.DialogC448133nz;

/* loaded from: classes12.dex */
public final class SelfDisciplineTargetDialog$init$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC448133nz this$0;

    static {
        Covode.recordClassIndex(30414);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfDisciplineTargetDialog$init$2(DialogC448133nz dialogC448133nz) {
        super(1);
        this.this$0 = dialogC448133nz;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            b$a b_a = this.this$0.LIZLLL;
            if (b_a != null) {
                b_a.LIZ(this.this$0.LIZIZ);
            }
            C116971W2r.LIZ(this.this$0);
        }
        return Unit.INSTANCE;
    }
}
