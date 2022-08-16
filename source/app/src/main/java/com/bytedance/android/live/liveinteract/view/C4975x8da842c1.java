package com.bytedance.android.live.liveinteract.view;

import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C81130HyO;

/* renamed from: com.bytedance.android.live.liveinteract.view.PositionNameCountDownController$hideHostLabelAndShowCountDownTimer$$inlined$let$lambda$3 */
/* loaded from: classes3.dex */
public final class C4975x8da842c1 extends Lambda implements Function1<Animator, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C81130HyO this$0;

    static {
        Covode.recordClassIndex(30768);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4975x8da842c1(C81130HyO c81130HyO) {
        super(1);
        this.this$0 = c81130HyO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Animator animator) {
        if (!PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(animator);
            this.this$0.f7393LJ.setVisibility(8);
        }
        return Unit.INSTANCE;
    }
}
