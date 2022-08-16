package com.bytedance.android.live.liveinteract.linkroomfight.adapter;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C88440Kt0;
import p003X.H5H;

/* loaded from: classes3.dex */
public final class LinkRoomFightSelectGuestViewBinder$ItemViewHolder$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ j$a this$0;

    static {
        Covode.recordClassIndex(27508);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkRoomFightSelectGuestViewBinder$ItemViewHolder$1(j$a j_a) {
        super(1);
        this.this$0 = j_a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            j$c j_c = this.this$0.LIZIZ;
            if (j_c != null) {
                if (j_c.LIZIZ) {
                    C88440Kt0.LIZ(2131584228);
                } else if (j_c.LIZJ) {
                    C88440Kt0.LIZ(2131584227);
                } else {
                    H5H h5h = this.this$0.LJIIIIZZ;
                    User LIZ = j_c.LIZLLL.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ, "");
                    h5h.LIZ(LIZ.getId(), !j_c.LIZ);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
