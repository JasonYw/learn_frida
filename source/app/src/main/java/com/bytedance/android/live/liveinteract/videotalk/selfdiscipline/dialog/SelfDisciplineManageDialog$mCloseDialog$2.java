package com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.dialog;

import com.bytedance.android.livesdk.chatroom.p518ui.DialogC6336gc;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C86932KNi;
import p003X.DialogC448093nv;
import p003X.DialogInterface$OnClickListenerC422252nL;
import p003X.DialogInterface$OnClickListenerC448053nr;

/* loaded from: classes12.dex */
public final class SelfDisciplineManageDialog$mCloseDialog$2 extends Lambda implements Function0<DialogC6336gc> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC448093nv this$0;

    static {
        Covode.recordClassIndex(30409);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfDisciplineManageDialog$mCloseDialog$2(DialogC448093nv dialogC448093nv) {
        super(0);
        this.this$0 = dialogC448093nv;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.bytedance.android.livesdk.chatroom.ui.gc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.bytedance.android.livesdk.chatroom.ui.gc, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ DialogC6336gc mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        DialogC448093nv dialogC448093nv = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], dialogC448093nv, DialogC448093nv.LIZ, false, 15);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        C86932KNi c86932KNi = new C86932KNi(dialogC448093nv.getContext(), 2);
        c86932KNi.LIZJ(2131698908);
        C86932KNi m23482LJ = c86932KNi.LIZLLL(2131587631).m23482LJ(2131587630);
        m23482LJ.LJFF(17);
        C86932KNi LIZIZ = m23482LJ.LIZ(2131582393, DialogInterface$OnClickListenerC422252nL.LIZIZ).LIZIZ(2131585798, DialogInterface$OnClickListenerC448053nr.LIZIZ);
        LIZIZ.LIZ(true);
        LIZIZ.LIZIZ(false);
        DialogC6336gc LIZ = LIZIZ.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        return LIZ;
    }
}
