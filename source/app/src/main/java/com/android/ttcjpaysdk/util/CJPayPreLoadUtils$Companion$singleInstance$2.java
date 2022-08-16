package com.android.ttcjpaysdk.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes17.dex */
public final class CJPayPreLoadUtils$Companion$singleInstance$2 extends Lambda implements Function0<C2423d> {
    public static final CJPayPreLoadUtils$Companion$singleInstance$2 INSTANCE = new CJPayPreLoadUtils$Companion$singleInstance$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(9329);
    }

    public CJPayPreLoadUtils$Companion$singleInstance$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.android.ttcjpaysdk.util.d, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2423d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C2423d((byte) 0);
    }
}
