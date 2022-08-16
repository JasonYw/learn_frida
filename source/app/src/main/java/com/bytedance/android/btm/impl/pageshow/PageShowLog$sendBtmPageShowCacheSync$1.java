package com.bytedance.android.btm.impl.pageshow;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class PageShowLog$sendBtmPageShowCacheSync$1 extends Lambda implements Function0<Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ List $pageInfoList;

    static {
        if (ReDexClinitStringAb.abTest >= 4) {
            Covode.recordClassIndex(11516);
        } else {
            Covode.recordClassIndex(11516);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageShowLog$sendBtmPageShowCacheSync$1(List list) {
        super(0);
        this.$pageInfoList = list;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return "send btm_page_show cache " + this.$pageInfoList;
    }
}
