package com.bytedance.android.btm.impl.page.p222v1.lifecycle;

import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p002O.C0002O;

/* renamed from: com.bytedance.android.btm.impl.page.v1.lifecycle.BtmPageLifecycleCallback$onPageCreated$1 */
/* loaded from: classes18.dex */
public final class BtmPageLifecycleCallback$onPageCreated$1 extends Lambda implements Function0<Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.ObjectRef $bufferBtm;
    public final /* synthetic */ Object $page;

    static {
        Covode.recordClassIndex(11496);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BtmPageLifecycleCallback$onPageCreated$1(Ref.ObjectRef objectRef, Object obj) {
        super(0);
        this.$bufferBtm = objectRef;
        this.$page = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        new StringBuilder();
        return C0002O.m25085C(((BufferBtm) this.$bufferBtm.element).getBtm(), " -> ", this.$page.getClass().getSimpleName());
    }
}
