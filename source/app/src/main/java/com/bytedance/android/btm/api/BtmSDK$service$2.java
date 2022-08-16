package com.bytedance.android.btm.api;

import com.bytedance.android.btm.api.inner.IBtmService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes18.dex */
public final class BtmSDK$service$2 extends Lambda implements Function0<IBtmService> {
    public static final BtmSDK$service$2 INSTANCE = new BtmSDK$service$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11281);
    }

    public BtmSDK$service$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final IBtmService mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (IBtmService) proxy.result;
        }
        return BtmSDK.INSTANCE.createService();
    }
}
