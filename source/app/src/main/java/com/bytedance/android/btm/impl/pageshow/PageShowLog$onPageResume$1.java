package com.bytedance.android.btm.impl.pageshow;

import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes18.dex */
public final class PageShowLog$onPageResume$1 extends Lambda implements Function0<Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PageInfo $pageInfo;
    public final /* synthetic */ PageInfo $resumedPageInfo;

    static {
        Covode.recordClassIndex(11514);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageShowLog$onPageResume$1(PageInfo pageInfo, PageInfo pageInfo2) {
        super(0);
        this.$pageInfo = pageInfo;
        this.$resumedPageInfo = pageInfo2;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.$pageInfo + "\n " + this.$resumedPageInfo;
    }
}
