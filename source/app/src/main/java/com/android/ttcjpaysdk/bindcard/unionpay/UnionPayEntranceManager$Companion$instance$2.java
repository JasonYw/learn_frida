package com.android.ttcjpaysdk.bindcard.unionpay;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes17.dex */
public final class UnionPayEntranceManager$Companion$instance$2 extends Lambda implements Function0<C2248a> {
    public static final UnionPayEntranceManager$Companion$instance$2 INSTANCE = new UnionPayEntranceManager$Companion$instance$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(7310);
    }

    public UnionPayEntranceManager$Companion$instance$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.android.ttcjpaysdk.bindcard.unionpay.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2248a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C2248a((byte) 0);
    }
}
