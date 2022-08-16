package com.bytedance.android.live.liveinteract.linkroomfight.adapter;

import android.view.View;
import com.bytedance.android.live.liveinteract.linkroomfight.p363a.C4444c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class LinkRoomFightInviteContentViewBinder$ContentViewHolder$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ e$a this$0;

    static {
        Covode.recordClassIndex(27504);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkRoomFightInviteContentViewBinder$ContentViewHolder$1(e$a e_a) {
        super(1);
        this.this$0 = e_a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            C4444c c4444c = this.this$0.LIZIZ;
            if (c4444c != null) {
                this.this$0.LJIIJJI.LIZ(c4444c);
            }
        }
        return Unit.INSTANCE;
    }
}
