package com.bytedance.android.live.liveinteract.linkroomfight.dialog;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C77361Geh;
import p003X.C77366Gem;
import p003X.C78764H3e;
import p003X.H4B;
import p003X.HLJ;

/* loaded from: classes3.dex */
public final class LinkRoomFightInviteFragment$initTopView$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C78764H3e this$0;

    static {
        Covode.recordClassIndex(27678);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkRoomFightInviteFragment$initTopView$1(C78764H3e c78764H3e) {
        super(1);
        this.this$0 = c78764H3e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        C77361Geh c77361Geh;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            HLJ hlj = this.this$0.LJII;
            C77366Gem c77366Gem = C77361Geh.LIZJ;
            HLJ hlj2 = this.this$0.LJII;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{hlj2, this.this$0.LIZJ}, c77366Gem, C77366Gem.LIZ, false, 1);
            if (proxy.isSupported) {
                c77361Geh = (C77361Geh) proxy.result;
            } else {
                c77361Geh = new C77361Geh();
                c77361Geh.LJII = hlj2;
            }
            hlj.LIZ(c77361Geh);
            H4B.LIZIZ.LIZJ("setting");
        }
        return Unit.INSTANCE;
    }
}
