package com.bytedance.android.live.liveinteract.videotalk.adapter;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C80663Hqr;

/* loaded from: classes3.dex */
public final class VideoTeamFightAdapter$AnchorStubViewHolder$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80663Hqr this$0;

    static {
        Covode.recordClassIndex(29660);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTeamFightAdapter$AnchorStubViewHolder$1(C80663Hqr c80663Hqr) {
        super(1);
        this.this$0 = c80663Hqr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            ab$c ab_c = this.this$0.LIZJ.LIZIZ;
            if (ab_c != null) {
                ab_c.LIZIZ(this.this$0.LJIIIIZZ);
            }
        }
        return Unit.INSTANCE;
    }
}
