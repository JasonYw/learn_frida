package com.bytedance.android.annie.service.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class DataProviderService$preDealProps$1$1 extends Lambda implements Function1<Integer, String> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ JSONArray $jsonArray;

    static {
        Covode.recordClassIndex(11025);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataProviderService$preDealProps$1$1(JSONArray jSONArray) {
        super(1);
        this.$jsonArray = jSONArray;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ String invoke(Integer num) {
        int intValue = num.intValue();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.$jsonArray.optString(intValue);
    }
}
