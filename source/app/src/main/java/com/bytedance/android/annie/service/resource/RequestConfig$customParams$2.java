package com.bytedance.android.annie.service.resource;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class RequestConfig$customParams$2 extends Lambda implements Function0<Map<String, Object>> {
    public static final RequestConfig$customParams$2 INSTANCE = new RequestConfig$customParams$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11207);
    }

    public RequestConfig$customParams$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map<java.lang.String, java.lang.Object>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Map<String, Object> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new LinkedHashMap();
    }
}
