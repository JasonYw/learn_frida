package com.bytedance.android.live.liveinteract.voicechat.video;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80496HoA;
import p003X.C80478Hns;

/* loaded from: classes3.dex */
public final class KtvVideoManager$$special$$inlined$apply$lambda$1 extends Lambda implements Function2<Integer, Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80478Hns this$0;

    static {
        Covode.recordClassIndex(31733);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KtvVideoManager$$special$$inlined$apply$lambda$1(C80478Hns c80478Hns) {
        super(2);
        this.this$0 = c80478Hns;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Integer num, Boolean bool) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(num.intValue()), Byte.valueOf(bool.booleanValue() ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported && (this.this$0.LIZLLL.LIZ() instanceof AbstractC80496HoA)) {
            C80478Hns c80478Hns = this.this$0;
            c80478Hns.LIZIZ(c80478Hns.LIZLLL.LIZ().LIZIZ);
            C80478Hns c80478Hns2 = this.this$0;
            c80478Hns2.LIZJ(c80478Hns2.LIZLLL.LIZ().LIZIZ);
        }
        return Unit.INSTANCE;
    }
}
