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
import p003X.C80735Hs1;

/* loaded from: classes3.dex */
public final class VideoTeamFightAdapter$EmptyStubViewHolder$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80735Hs1 this$0;

    static {
        Covode.recordClassIndex(29664);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTeamFightAdapter$EmptyStubViewHolder$1(C80735Hs1 c80735Hs1) {
        super(1);
        this.this$0 = c80735Hs1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        boolean z = true;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            if (this.this$0.f7361LJ.LJJII) {
                if (this.this$0.f7361LJ.LJJIII) {
                    ab$c ab_c = this.this$0.LJIIIZ.LIZIZ;
                    if (ab_c != null) {
                        ab_c.LIZ(C80735Hs1.LIZ(this.this$0), this.this$0.LJI);
                    }
                    C78299Gtp.LIZ(C78299Gtp.LIZIZ, false, C80735Hs1.LIZ(this.this$0).getId(), true, "seat", C80735Hs1.LIZ(this.this$0).isSubscriber(), null, null, 96, null);
                    this.this$0.f7361LJ.LIZIZ();
                }
            } else {
                C78299Gtp c78299Gtp = C78299Gtp.LIZIZ;
                C79046HEa LIZ = C79046HEa.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ, "");
                Integer num = (Integer) LIZ.LJJIIZI;
                if (num == null || 2 != num.intValue()) {
                    z = false;
                }
                c78299Gtp.LIZ(false, z, false, this.this$0.getLayoutPosition());
                ab$c ab_c2 = this.this$0.LJIIIZ.LIZIZ;
                if (ab_c2 != null) {
                    ab_c2.LIZ(this.this$0.getLayoutPosition(), this.this$0.LJFF);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
