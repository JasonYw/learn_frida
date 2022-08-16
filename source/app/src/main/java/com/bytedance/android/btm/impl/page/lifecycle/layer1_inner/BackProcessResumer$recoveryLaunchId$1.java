package com.bytedance.android.btm.impl.page.lifecycle.layer1_inner;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes18.dex */
public final class BackProcessResumer$recoveryLaunchId$1 extends Lambda implements Function0<Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: $e */
    public final /* synthetic */ Exception f25636$e;

    static {
        Covode.recordClassIndex(11463);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackProcessResumer$recoveryLaunchId$1(Exception exc) {
        super(0);
        this.f25636$e = exc;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.f25636$e.toString();
    }
}
