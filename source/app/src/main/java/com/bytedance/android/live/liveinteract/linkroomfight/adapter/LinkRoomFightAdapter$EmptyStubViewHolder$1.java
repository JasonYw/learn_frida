package com.bytedance.android.live.liveinteract.linkroomfight.adapter;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C78299Gtp;
import p003X.C79046HEa;
import p003X.C80665Hqt;
import p003X.C80715Hrh;

/* loaded from: classes3.dex */
public final class LinkRoomFightAdapter$EmptyStubViewHolder$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80715Hrh this$0;

    static {
        Covode.recordClassIndex(27503);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkRoomFightAdapter$EmptyStubViewHolder$1(C80715Hrh c80715Hrh) {
        super(1);
        this.this$0 = c80715Hrh;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        boolean z = true;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            if (this.this$0.LIZJ.LJJII) {
                if (this.this$0.LIZJ.LJJIII) {
                    a$b a_b = this.this$0.LJIIIZ.LIZIZ;
                    if (a_b != null) {
                        a_b.LIZ(C80715Hrh.LIZ(this.this$0), this.this$0.LJII);
                    }
                    C78299Gtp.LIZ(C78299Gtp.LIZIZ, false, C80715Hrh.LIZ(this.this$0).getId(), true, "seat", C80715Hrh.LIZ(this.this$0).isSubscriber(), null, null, 96, null);
                    this.this$0.LIZJ.LIZIZ();
                }
            } else {
                int adapterPosition = this.this$0.getAdapterPosition();
                C80665Hqt.LIZ(adapterPosition);
                C78299Gtp c78299Gtp = C78299Gtp.LIZIZ;
                C79046HEa LIZ = C79046HEa.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ, "");
                Integer num = (Integer) LIZ.LJJIIZI;
                if (num == null || 2 != num.intValue()) {
                    z = false;
                }
                c78299Gtp.LIZ(false, z, false, adapterPosition);
                a$b a_b2 = this.this$0.LJIIIZ.LIZIZ;
                if (a_b2 != null) {
                    a_b2.LIZ(adapterPosition, this.this$0.LIZIZ);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
