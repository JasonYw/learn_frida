package com.bytedance.android.live.liveinteract.p382pk;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.liveinteract.pk.PkControlWidget$onCreate$linkDataPair$1 */
/* loaded from: classes3.dex */
public final class PkControlWidget$onCreate$linkDataPair$1 extends Lambda implements Function0<C4733k> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PkControlWidget this$0;

    static {
        Covode.recordClassIndex(28910);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkControlWidget$onCreate$linkDataPair$1(PkControlWidget pkControlWidget) {
        super(0);
        this.this$0 = pkControlWidget;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.liveinteract.pk.k, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4733k mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        DataCenter dataCenter = this.this$0.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        Context context = this.this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return new C4733k(dataCenter, context);
    }
}
