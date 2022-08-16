package com.bytedance.android.btm.bridge.method;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;

/* loaded from: classes11.dex */
public final class RegisterBtmPageBridgeHelper$handle$1 extends Lambda implements Function0<Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $btm;

    static {
        Covode.recordClassIndex(11355);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterBtmPageBridgeHelper$handle$1(String str) {
        super(0);
        this.$btm = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return C0002O.m25086C("registerBtmPage\nbtm=", this.$btm);
    }
}
