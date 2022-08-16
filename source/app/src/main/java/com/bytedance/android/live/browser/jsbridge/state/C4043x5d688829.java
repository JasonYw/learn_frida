package com.bytedance.android.live.browser.jsbridge.state;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;

/* renamed from: com.bytedance.android.live.browser.jsbridge.state.StateObserver$Companion$getValuesFromStates$$inlined$also$lambda$1 */
/* loaded from: classes8.dex */
public final class C4043x5d688829 extends Lambda implements Function1<Integer, String> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ JSONArray $jsonArray$inlined;
    public final /* synthetic */ C4044h $stateObservingService$inlined;

    static {
        Covode.recordClassIndex(22985);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4043x5d688829(JSONArray jSONArray, C4044h c4044h) {
        super(1);
        this.$jsonArray$inlined = jSONArray;
        this.$stateObservingService$inlined = c4044h;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ String invoke(Integer num) {
        int intValue = num.intValue();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.$jsonArray$inlined.optString(intValue);
    }
}
