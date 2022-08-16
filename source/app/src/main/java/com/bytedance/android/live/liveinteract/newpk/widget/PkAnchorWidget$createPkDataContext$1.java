package com.bytedance.android.live.liveinteract.newpk.widget;

import com.bytedance.android.live.liveinteract.newpk.p379vm.C4688b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class PkAnchorWidget$createPkDataContext$1 extends Lambda implements Function0<C4688b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PkAnchorWidget this$0;

    static {
        Covode.recordClassIndex(28755);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkAnchorWidget$createPkDataContext$1(PkAnchorWidget pkAnchorWidget) {
        super(0);
        this.this$0 = pkAnchorWidget;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.android.live.liveinteract.newpk.vm.b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4688b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        DataCenter dataCenter = this.this$0.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        return new C4688b(dataCenter, this.this$0.LJJIFFI, this.this$0.LJJII);
    }
}
