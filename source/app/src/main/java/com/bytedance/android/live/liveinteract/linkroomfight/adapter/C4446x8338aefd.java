package com.bytedance.android.live.liveinteract.linkroomfight.adapter;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C80107Hht;

/* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.adapter.LinkRoomFightSearchLenovoAdapter$SearchLenovoViewHolder$bindView$2 */
/* loaded from: classes3.dex */
public final class C4446x8338aefd extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80107Hht this$0;

    static {
        Covode.recordClassIndex(27506);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4446x8338aefd(C80107Hht c80107Hht) {
        super(1);
        this.this$0 = c80107Hht;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            this.this$0.f6928LJ.LIZLLL.LIZ(this.this$0.LIZLLL);
        }
        return Unit.INSTANCE;
    }
}
