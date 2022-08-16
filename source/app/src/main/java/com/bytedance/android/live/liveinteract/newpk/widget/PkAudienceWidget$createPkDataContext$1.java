package com.bytedance.android.live.liveinteract.newpk.widget;

import com.bytedance.android.live.liveinteract.newpk.p379vm.C4689c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class PkAudienceWidget$createPkDataContext$1 extends Lambda implements Function0<C4689c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PkAudienceWidget this$0;

    static {
        Covode.recordClassIndex(28770);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkAudienceWidget$createPkDataContext$1(PkAudienceWidget pkAudienceWidget) {
        super(0);
        this.this$0 = pkAudienceWidget;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.android.live.liveinteract.newpk.vm.c, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4689c mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        DataCenter dataCenter = this.this$0.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        return new C4689c(dataCenter, this.this$0.LJJIFFI, this.this$0.LJJII);
    }
}
