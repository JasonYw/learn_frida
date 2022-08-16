package com.bytedance.als;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.R5W;

/* loaded from: classes9.dex */
public final class UIRootComponent$containerGroupScene$2 extends Lambda implements Function0<C2548w> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ R5W this$0;

    static {
        Covode.recordClassIndex(10032);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIRootComponent$containerGroupScene$2(R5W r5w) {
        super(0);
        this.this$0 = r5w;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.als.w] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2548w mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.LJIIZILJ();
    }
}
