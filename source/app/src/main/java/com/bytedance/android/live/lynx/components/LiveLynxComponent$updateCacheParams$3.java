package com.bytedance.android.live.lynx.components;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonElement;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;
import p003X.C101322PvI;
import p003X.C106862S5w;
import p003X.IR5;

/* loaded from: classes8.dex */
public final class LiveLynxComponent$updateCacheParams$3 extends Lambda implements Function1<String, JsonElement> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C101322PvI this$0;

    static {
        Covode.recordClassIndex(32178);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveLynxComponent$updateCacheParams$3(C101322PvI c101322PvI) {
        super(1);
        this.this$0 = c101322PvI;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.gson.JsonElement, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ JsonElement invoke(String str) {
        String str2 = str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(str2);
        return this.this$0.LIZ(IR5.LIZ.LIZ(), C0002O.m25086C("storage.", str2));
    }
}
