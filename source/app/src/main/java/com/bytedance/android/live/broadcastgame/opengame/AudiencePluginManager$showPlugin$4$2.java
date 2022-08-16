package com.bytedance.android.live.broadcastgame.opengame;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87742Khk;
import p003X.C87746Kho;
import p003X.KW0;

/* loaded from: classes5.dex */
public final class AudiencePluginManager$showPlugin$4$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87746Kho this$0;

    static {
        Covode.recordClassIndex(19898);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudiencePluginManager$showPlugin$4$2(C87746Kho c87746Kho) {
        super(0);
        this.this$0 = c87746Kho;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        Long l;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            KW0 kw0 = KW0.LIZIZ;
            C87742Khk c87742Khk = this.this$0.LIZIZ.LIZIZ;
            String str = null;
            if (c87742Khk != null) {
                l = Long.valueOf(c87742Khk.LIZJ);
            } else {
                l = null;
            }
            C87742Khk c87742Khk2 = this.this$0.LIZIZ.LIZIZ;
            if (c87742Khk2 != null) {
                str = c87742Khk2.LJFF;
            }
            kw0.LIZ(l, str, this.this$0.LIZIZ.LIZJ.LIZ(), "go_to_confirm");
        }
        return Unit.INSTANCE;
    }
}
