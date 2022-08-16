package com.bytedance.android.live.browser;

import com.bytedance.android.annie.service.data.C2628b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonElement;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC101043Pqn;
import p003X.C106862S5w;
import p003X.IR5;

/* loaded from: classes8.dex */
public final class AnnieParamUtil$getCacheParam$3 extends Lambda implements Function1<String, JsonElement> {
    public static final AnnieParamUtil$getCacheParam$3 INSTANCE = new AnnieParamUtil$getCacheParam$3();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21871);
    }

    public AnnieParamUtil$getCacheParam$3() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.gson.JsonElement, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ JsonElement invoke(String str) {
        String str2 = str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(str2);
        AbstractC101043Pqn<?> LIZ = C2628b.LIZLLL.LIZ(IR5.LIZ.LIZ());
        if (LIZ != null) {
            return LIZ.LIZIZ(str2);
        }
        return null;
    }
}
