package com.bytedance.android.live.liveinteract.videotalk.battle;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.DialogC77489Ggl;

/* loaded from: classes3.dex */
public final class GuestBattleSelectLoserDialog$onCreate$3 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77489Ggl this$0;

    static {
        Covode.recordClassIndex(29820);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuestBattleSelectLoserDialog$onCreate$3(DialogC77489Ggl dialogC77489Ggl) {
        super(1);
        this.this$0 = dialogC77489Ggl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            this.this$0.f6424LJ.LIZIZ(this.this$0.LIZJ);
            C116971W2r.LIZ(this.this$0);
        }
        return Unit.INSTANCE;
    }
}