package com.bytedance.android.live.liveinteract.voicechat.panel.adapter;

import android.view.View;
import com.bytedance.android.live.liveinteract.plantform.model.C4822q;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC78172Grm;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class RadioTalkGuestViewHolder$bindView$$inlined$let$lambda$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C4822q $prepareApplyUser$inlined;
    public final /* synthetic */ C5079d this$0;

    static {
        Covode.recordClassIndex(31644);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioTalkGuestViewHolder$bindView$$inlined$let$lambda$1(C5079d c5079d, C4822q c4822q) {
        super(1);
        this.this$0 = c5079d;
        this.$prepareApplyUser$inlined = c4822q;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            if (!this.$prepareApplyUser$inlined.LIZLLL) {
                this.$prepareApplyUser$inlined.LIZLLL = true;
                AbstractC78172Grm abstractC78172Grm = this.this$0.LJIIJ;
                if (abstractC78172Grm != null) {
                    abstractC78172Grm.LIZ(this.$prepareApplyUser$inlined);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
