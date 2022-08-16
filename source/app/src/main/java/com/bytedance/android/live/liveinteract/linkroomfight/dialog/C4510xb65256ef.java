package com.bytedance.android.live.liveinteract.linkroomfight.dialog;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80293Hkt;
import p003X.C474644pe;
import p003X.C87308Kak;
import p003X.View$OnClickListenerC77359Gef;

/* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.dialog.LinkRoomFightDurationSettingFragment$onViewCreated$3$$special$$inlined$let$lambda$1 */
/* loaded from: classes3.dex */
public final class C4510xb65256ef extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C474644pe $it;
    public final /* synthetic */ View$OnClickListenerC77359Gef this$0;

    static {
        Covode.recordClassIndex(27675);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4510xb65256ef(C474644pe c474644pe, View$OnClickListenerC77359Gef view$OnClickListenerC77359Gef) {
        super(0);
        this.$it = c474644pe;
        this.this$0 = view$OnClickListenerC77359Gef;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C87308Kak<Long> c87308Kak = AbstractC80293Hkt.f7022ax;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            c87308Kak.LIZ(Long.valueOf(this.$it.LIZJ.get(this.$it.LIZIZ).intValue()));
            Function1<? super Integer, Unit> function1 = this.this$0.LIZIZ.LJFF;
            if (function1 != null) {
                function1.invoke(this.$it.LIZJ.get(this.$it.LIZIZ));
            }
            this.this$0.LIZIZ.LJII.LIZIZ();
        }
        return Unit.INSTANCE;
    }
}
