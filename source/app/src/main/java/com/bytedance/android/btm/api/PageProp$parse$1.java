package com.bytedance.android.btm.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes18.dex */
public final class PageProp$parse$1 extends Lambda implements Function0<Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Exception $ex;

    static {
        Covode.recordClassIndex(11290);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageProp$parse$1(Exception exc) {
        super(0);
        this.$ex = exc;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.$ex.toString();
    }
}
