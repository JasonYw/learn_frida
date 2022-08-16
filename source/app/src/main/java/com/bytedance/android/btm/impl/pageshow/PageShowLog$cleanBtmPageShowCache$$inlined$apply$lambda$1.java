package com.bytedance.android.btm.impl.pageshow;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;

/* loaded from: classes11.dex */
public final class PageShowLog$cleanBtmPageShowCache$$inlined$apply$lambda$1 extends Lambda implements Function0<Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $scene$inlined;

    static {
        Covode.recordClassIndex(11513);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageShowLog$cleanBtmPageShowCache$$inlined$apply$lambda$1(String str) {
        super(0);
        this.$scene$inlined = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return C0002O.m25086C("clear btm_page_show cache ", this.$scene$inlined);
    }
}
