package com.bytedance.android.live.liveinteract.videotalk.adapter;

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
import p003X.C80683HrB;

/* loaded from: classes3.dex */
public final class BaseEqualTalkRoomAdapter$EmptyStubViewHolder$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80683HrB this$0;

    static {
        Covode.recordClassIndex(29638);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseEqualTalkRoomAdapter$EmptyStubViewHolder$1(C80683HrB c80683HrB) {
        super(1);
        this.this$0 = c80683HrB;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        boolean z = true;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            if (this.this$0.f7339LJ.LJJII) {
                if (this.this$0.f7339LJ.LJJIII) {
                    AbstractC4848n abstractC4848n = this.this$0.LJIIIZ.LIZIZ;
                    if (abstractC4848n != null) {
                        abstractC4848n.LIZ(C80683HrB.LIZ(this.this$0), this.this$0.LJFF);
                    }
                    C78299Gtp.LIZ(C78299Gtp.LIZIZ, false, C80683HrB.LIZ(this.this$0).getId(), true, "seat", C80683HrB.LIZ(this.this$0).isSubscriber(), null, null, 96, null);
                    this.this$0.f7339LJ.LIZIZ();
                }
            } else {
                int LIZ = this.this$0.LJIIIZ.LIZ(this.this$0.getAdapterPosition());
                C78299Gtp c78299Gtp = C78299Gtp.LIZIZ;
                C79046HEa LIZ2 = C79046HEa.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                Integer num = (Integer) LIZ2.LJJIIZI;
                if (num == null || 2 != num.intValue()) {
                    z = false;
                }
                c78299Gtp.LIZ(false, z, false, LIZ);
                AbstractC4848n abstractC4848n2 = this.this$0.LJIIIZ.LIZIZ;
                if (abstractC4848n2 != null) {
                    abstractC4848n2.LIZ(LIZ, this.this$0.LIZIZ);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
