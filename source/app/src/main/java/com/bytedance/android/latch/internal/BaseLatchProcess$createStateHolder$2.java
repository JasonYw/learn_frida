package com.bytedance.android.latch.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC137655ckl;
import p003X.PUJ;

/* loaded from: classes17.dex */
public final class BaseLatchProcess$createStateHolder$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC137655ckl this$0;

    static {
        Covode.recordClassIndex(13702);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseLatchProcess$createStateHolder$2(AbstractC137655ckl abstractC137655ckl) {
        super(0);
        this.this$0 = abstractC137655ckl;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            PUJ puj = this.this$0.LIZJ;
            if (!PatchProxy.proxy(new Object[0], puj, PUJ.LIZ, false, 4).isSupported) {
                puj.LIZ(5);
            }
            this.this$0.dispose();
        }
        return Unit.INSTANCE;
    }
}
