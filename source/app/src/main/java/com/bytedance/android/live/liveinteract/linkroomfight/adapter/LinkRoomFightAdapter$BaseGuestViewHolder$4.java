package com.bytedance.android.live.liveinteract.linkroomfight.adapter;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C80666Hqu;

/* loaded from: classes3.dex */
public final class LinkRoomFightAdapter$BaseGuestViewHolder$4 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80666Hqu this$0;

    static {
        Covode.recordClassIndex(27501);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkRoomFightAdapter$BaseGuestViewHolder$4(C80666Hqu c80666Hqu) {
        super(1);
        this.this$0 = c80666Hqu;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            a$b a_b = this.this$0.LJIIIZ.LIZIZ;
            if (a_b != null) {
                a_b.LIZIZ(this.this$0.LJI);
            }
        }
        return Unit.INSTANCE;
    }
}
