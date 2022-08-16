package com.bytedance.android.annie.param;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonElement;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.QPC;

/* loaded from: classes8.dex */
public final class GsonList$subList$2 extends Lambda implements Function1<JsonElement, Object> {
    public static final GsonList$subList$2 INSTANCE = new GsonList$subList$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10884);
    }

    public GsonList$subList$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(JsonElement jsonElement) {
        JsonElement jsonElement2 = jsonElement;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jsonElement2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (jsonElement2 != null) {
            return QPC.LIZIZ(jsonElement2);
        }
        return null;
    }
}
