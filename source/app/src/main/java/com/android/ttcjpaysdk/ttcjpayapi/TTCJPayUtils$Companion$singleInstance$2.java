package com.android.ttcjpaysdk.ttcjpayapi;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes17.dex */
public final class TTCJPayUtils$Companion$singleInstance$2 extends Lambda implements Function0<TTCJPayUtils> {
    public static final TTCJPayUtils$Companion$singleInstance$2 INSTANCE = new TTCJPayUtils$Companion$singleInstance$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(9314);
    }

    public TTCJPayUtils$Companion$singleInstance$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final TTCJPayUtils mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (TTCJPayUtils) proxy.result;
        }
        return new TTCJPayUtils(null);
    }
}
