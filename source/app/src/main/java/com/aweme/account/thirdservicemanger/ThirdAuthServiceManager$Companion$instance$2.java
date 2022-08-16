package com.aweme.account.thirdservicemanger;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes13.dex */
public final class ThirdAuthServiceManager$Companion$instance$2 extends Lambda implements Function0<C2427b> {
    public static final ThirdAuthServiceManager$Companion$instance$2 INSTANCE = new ThirdAuthServiceManager$Companion$instance$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(9358);
    }

    public ThirdAuthServiceManager$Companion$instance$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.aweme.account.thirdservicemanger.b] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2427b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C2427b((byte) 0);
    }
}
