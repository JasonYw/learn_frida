package com.bytedance.android.btm.impl.page.lifecycle.layer1_outer;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;

/* renamed from: com.bytedance.android.btm.impl.page.lifecycle.layer1_outer.BtmActivityLifecycleCallbackV2$onActivityCreated$$inlined$run$lambda$1 */
/* loaded from: classes.dex */
public final class C2653x2409b9dd extends Lambda implements Function0<Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Activity $activity$inlined;

    static {
        Covode.recordClassIndex(11470);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2653x2409b9dd(Activity activity) {
        super(0);
        this.$activity$inlined = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        new StringBuilder();
        return C0002O.m25086C(this.$activity$inlined.getClass().getSimpleName(), " not FragmentActivity");
    }
}
