package com.bytedance.android.live.liveinteract.p382pk;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: com.bytedance.android.live.liveinteract.pk.PkAutoMatchManager$pair$1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class PkAutoMatchManager$pair$1 extends FunctionReferenceImpl implements Function0<C4731e> {
    public static final PkAutoMatchManager$pair$1 INSTANCE = new PkAutoMatchManager$pair$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(28902);
    }

    public PkAutoMatchManager$pair$1() {
        super(0, C4731e.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.liveinteract.pk.e, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4731e mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4731e();
    }
}
