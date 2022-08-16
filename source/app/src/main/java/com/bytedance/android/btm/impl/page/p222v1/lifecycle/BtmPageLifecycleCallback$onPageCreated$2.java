package com.bytedance.android.btm.impl.page.p222v1.lifecycle;

import com.bytedance.android.btm.api.PageProp;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;

/* renamed from: com.bytedance.android.btm.impl.page.v1.lifecycle.BtmPageLifecycleCallback$onPageCreated$2 */
/* loaded from: classes18.dex */
public final class BtmPageLifecycleCallback$onPageCreated$2 extends Lambda implements Function0<Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Object $page;
    public final /* synthetic */ PageProp $prop;

    static {
        Covode.recordClassIndex(11497);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BtmPageLifecycleCallback$onPageCreated$2(Object obj, PageProp pageProp) {
        super(0);
        this.$page = obj;
        this.$prop = pageProp;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return C0002O.m25084C("Page ", this.$page.getClass().getSimpleName(), " B: ", this.$prop.getBtm());
    }
}
