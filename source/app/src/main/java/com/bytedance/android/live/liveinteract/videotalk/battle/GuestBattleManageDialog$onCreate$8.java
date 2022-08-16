package com.bytedance.android.live.liveinteract.videotalk.battle;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.liveinteract.view.MarqueeNotificationView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C78828H5q;
import p003X.DialogC77516GhC;
import p003X.LK1;

/* loaded from: classes3.dex */
public final class GuestBattleManageDialog$onCreate$8 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77516GhC this$0;

    static {
        Covode.recordClassIndex(29810);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuestBattleManageDialog$onCreate$8(DialogC77516GhC dialogC77516GhC) {
        super(1);
        this.this$0 = dialogC77516GhC;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            ((MarqueeNotificationView) this.this$0.findViewById(2131182695)).LIZ();
            TextView textView = (TextView) this.this$0.findViewById(2131172424);
            Intrinsics.checkNotNullExpressionValue(textView, "");
            LK1.LIZJ(textView);
            C78828H5q.LJFF.LIZLLL("boom_panel");
        }
        return Unit.INSTANCE;
    }
}
