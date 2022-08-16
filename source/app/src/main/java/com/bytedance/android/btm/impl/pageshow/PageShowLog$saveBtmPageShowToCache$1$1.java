package com.bytedance.android.btm.impl.pageshow;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class PageShowLog$saveBtmPageShowToCache$1$1 extends Lambda implements Function0<Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ JSONObject $params;

    static {
        Covode.recordClassIndex(11515);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageShowLog$saveBtmPageShowToCache$1$1(JSONObject jSONObject) {
        super(0);
        this.$params = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return "save pageInfo：" + this.$params;
    }
}
