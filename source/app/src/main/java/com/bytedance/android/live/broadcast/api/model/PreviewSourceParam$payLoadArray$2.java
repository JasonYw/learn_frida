package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class PreviewSourceParam$payLoadArray$2 extends Lambda implements Function0<C2919v> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewSourceParam this$0;

    static {
        Covode.recordClassIndex(14504);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewSourceParam$payLoadArray$2(PreviewSourceParam previewSourceParam) {
        super(0);
        this.this$0 = previewSourceParam;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.bytedance.android.live.broadcast.api.model.v] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2919v mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return C2919v.LIZJ.LIZ(this.this$0.payLoad);
    }
}
