package com.bytedance.android.live.liveinteract.digitavatar.ktvavatar;

import com.bytedance.android.live.liveinteract.digitavatar.C4383i;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.View$OnClickListenerC78905H8p;

/* loaded from: classes3.dex */
public final class KTVSingModeSettingDialog$onCreate$$inlined$let$lambda$1 extends Lambda implements Function1<C4383i, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View$OnClickListenerC78905H8p this$0;

    static {
        Covode.recordClassIndex(26646);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KTVSingModeSettingDialog$onCreate$$inlined$let$lambda$1(View$OnClickListenerC78905H8p view$OnClickListenerC78905H8p) {
        super(1);
        this.this$0 = view$OnClickListenerC78905H8p;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C4383i c4383i) {
        if (!PatchProxy.proxy(new Object[]{c4383i}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c4383i);
            this.this$0.LIZIZ();
        }
        return Unit.INSTANCE;
    }
}
