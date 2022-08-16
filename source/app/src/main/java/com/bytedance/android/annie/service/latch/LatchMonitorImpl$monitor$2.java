package com.bytedance.android.annie.service.latch;

import com.bytedance.android.annie.service.p216g.AbstractC2629b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C99782PRo;
import p003X.PRG;

/* loaded from: classes7.dex */
public final class LatchMonitorImpl$monitor$2 extends Lambda implements Function0<AbstractC2629b> {
    public static final LatchMonitorImpl$monitor$2 INSTANCE = new LatchMonitorImpl$monitor$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11085);
    }

    public LatchMonitorImpl$monitor$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.android.annie.service.g.b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbstractC2629b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return ((PRG) C99782PRo.LIZIZ.LIZ(PRG.class)).LIZJ();
    }
}
