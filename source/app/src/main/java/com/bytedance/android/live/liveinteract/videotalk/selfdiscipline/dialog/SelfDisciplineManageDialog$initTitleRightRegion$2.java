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
import p003X.DialogC448093nv;

/* loaded from: classes12.dex */
public final class SelfDisciplineManageDialog$initTitleRightRegion$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC448093nv this$0;

    static {
        Covode.recordClassIndex(30408);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfDisciplineManageDialog$initTitleRightRegion$2(DialogC448093nv dialogC448093nv) {
        super(1);
        this.this$0 = dialogC448093nv;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            DialogC448093nv dialogC448093nv = this.this$0;
            if (!PatchProxy.proxy(new Object[0], dialogC448093nv, DialogC448093nv.LIZ, false, 14).isSupported && !dialogC448093nv.LIZIZ().isShowing()) {
                C116971W2r.LIZJ(dialogC448093nv.LIZIZ());
            }
        }
        return Unit.INSTANCE;
    }
}
