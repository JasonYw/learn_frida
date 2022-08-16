package com.bytedance.android.btm.impl.monitor;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes23.dex */
public final class BtmMonitor$monitor$1$2$1 extends Lambda implements Function0<Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ JSONObject $category;
    public final /* synthetic */ JSONObject $extraLog;

    static {
        Covode.recordClassIndex(11411);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BtmMonitor$monitor$1$2$1(JSONObject jSONObject, JSONObject jSONObject2) {
        super(0);
        this.$category = jSONObject;
        this.$extraLog = jSONObject2;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return "category: " + this.$category + ",\n extra: " + this.$extraLog;
    }
}
