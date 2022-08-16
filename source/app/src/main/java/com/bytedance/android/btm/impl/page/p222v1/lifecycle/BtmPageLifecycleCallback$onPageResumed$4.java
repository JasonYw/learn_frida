package com.bytedance.android.btm.impl.page.p222v1.lifecycle;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* renamed from: com.bytedance.android.btm.impl.page.v1.lifecycle.BtmPageLifecycleCallback$onPageResumed$4 */
/* loaded from: classes25.dex */
public final class BtmPageLifecycleCallback$onPageResumed$4 extends Lambda implements Function0<Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.ObjectRef $pageInfo;

    static {
        Covode.recordClassIndex(11503);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BtmPageLifecycleCallback$onPageResumed$4(Ref.ObjectRef objectRef) {
        super(0);
        this.$pageInfo = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return String.valueOf(this.$pageInfo.element);
    }
}
