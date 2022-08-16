package com.bytedance.android.live.browser.jsbridge.prefetch;

import com.bytedance.android.tools.superkv.AbstractC10535e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;
import p003X.C91258LxM;
import p003X.QIJ;

/* loaded from: classes8.dex */
public final class LivePrefetchProcessor$LocalStorageImpl$dataStore$2 extends Lambda implements Function0<AbstractC10535e> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ QIJ this$0;

    static {
        Covode.recordClassIndex(22892);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivePrefetchProcessor$LocalStorageImpl$dataStore$2(QIJ qij) {
        super(0);
        this.this$0 = qij;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.bytedance.android.tools.superkv.e] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbstractC10535e mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        AbstractC10535e LIZ = C91258LxM.LIZ(C0002O.m25086C("live_prefetch_v3_", this.this$0.LIZIZ));
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        return LIZ;
    }
}
