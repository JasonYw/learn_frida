package com.bytedance.android.live.liveinteract.linkroomfight.dialog;

import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80293Hkt;
import p003X.C77362Gei;
import p003X.C87308Kak;

/* loaded from: classes3.dex */
public final class LinkRoomFightSettingFragment$onViewCreated$1$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ boolean $isChecked;
    public final /* synthetic */ C77362Gei this$0;

    static {
        Covode.recordClassIndex(27693);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkRoomFightSettingFragment$onViewCreated$1$1(C77362Gei c77362Gei, boolean z) {
        super(0);
        this.this$0 = c77362Gei;
        this.$isChecked = z;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            LinearLayout linearLayout = (LinearLayout) this.this$0.LIZIZ.LIZ(2131181627);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(0);
            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7023ay;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            c87308Kak.LIZ(Boolean.valueOf(this.$isChecked));
        }
        return Unit.INSTANCE;
    }
}
