package com.bytedance.android.annie.service.latch;

import com.bytedance.android.annie.service.prefetch.C2641a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class LatchScriptContentLoader$loader$2 extends Lambda implements Function0<C2641a> {
    public static final LatchScriptContentLoader$loader$2 INSTANCE = new LatchScriptContentLoader$loader$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11091);
    }

    public LatchScriptContentLoader$loader$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.annie.service.prefetch.a] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2641a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C2641a();
    }
}