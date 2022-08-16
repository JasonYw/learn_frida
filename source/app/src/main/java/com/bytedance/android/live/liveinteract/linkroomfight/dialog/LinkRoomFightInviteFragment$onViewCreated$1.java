package com.bytedance.android.live.liveinteract.linkroomfight.dialog;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C78764H3e;
import p003X.C80087HhZ;
import p003X.H4B;

/* loaded from: classes3.dex */
public final class LinkRoomFightInviteFragment$onViewCreated$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C78764H3e this$0;

    static {
        Covode.recordClassIndex(27679);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkRoomFightInviteFragment$onViewCreated$1(C78764H3e c78764H3e) {
        super(1);
        this.this$0 = c78764H3e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            this.this$0.LJII.LIZ(C80087HhZ.LJIILIIL.LIZ(this.this$0.LJII, C78764H3e.LIZ(this.this$0)));
            H4B.LIZIZ.LIZJ("search");
        }
        return Unit.INSTANCE;
    }
}
