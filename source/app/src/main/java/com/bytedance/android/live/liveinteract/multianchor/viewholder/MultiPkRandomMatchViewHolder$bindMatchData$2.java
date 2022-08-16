package com.bytedance.android.live.liveinteract.multianchor.viewholder;

import android.view.View;
import com.bytedance.android.live.liveinteract.multianchor.match.AbstractC4530a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C4574547f;
import p003X.C79414HSe;

/* loaded from: classes3.dex */
public final class MultiPkRandomMatchViewHolder$bindMatchData$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C4572aa this$0;

    static {
        Covode.recordClassIndex(28427);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiPkRandomMatchViewHolder$bindMatchData$2(C4572aa c4572aa) {
        super(1);
        this.this$0 = c4572aa;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            AbstractC4530a LIZ = this.this$0.LIZ();
            if (LIZ != null) {
                LIZ.LIZ();
            }
            if (!PatchProxy.proxy(new Object[0], C79414HSe.LIZIZ, C79414HSe.LIZ, false, 2).isSupported) {
                C4574547f.LIZ().LIZ("livesdk_random_npk_matching_speedup", new LinkedHashMap(), Room.class);
            }
        }
        return Unit.INSTANCE;
    }
}
