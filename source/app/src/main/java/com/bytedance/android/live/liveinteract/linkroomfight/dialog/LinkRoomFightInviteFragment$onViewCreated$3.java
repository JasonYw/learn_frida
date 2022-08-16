package com.bytedance.android.live.liveinteract.linkroomfight.dialog;

import android.view.View;
import com.bytedance.android.live.liveinteract.view.MarqueeNotificationView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C78764H3e;
import p003X.C78828H5q;

/* loaded from: classes3.dex */
public final class LinkRoomFightInviteFragment$onViewCreated$3 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C78764H3e this$0;

    static {
        Covode.recordClassIndex(27681);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkRoomFightInviteFragment$onViewCreated$3(C78764H3e c78764H3e) {
        super(1);
        this.this$0 = c78764H3e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            ((MarqueeNotificationView) this.this$0.LIZ(2131182695)).LIZ();
            C78828H5q.LJFF.LIZLLL("room_grouppk_panel");
        }
        return Unit.INSTANCE;
    }
}
