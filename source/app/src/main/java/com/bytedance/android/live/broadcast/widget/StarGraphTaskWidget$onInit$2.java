package com.bytedance.android.live.broadcast.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class StarGraphTaskWidget$onInit$2 extends Lambda implements Function0<Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ StarGraphTaskWidget this$0;

    static {
        Covode.recordClassIndex(18792);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarGraphTaskWidget$onInit$2(StarGraphTaskWidget starGraphTaskWidget) {
        super(0);
        this.this$0 = starGraphTaskWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Boolean mo30099invoke() {
        boolean areEqual;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            areEqual = ((Boolean) proxy.result).booleanValue();
        } else {
            areEqual = Intrinsics.areEqual(this.this$0.LIZJ().LJFF.getValue(), Boolean.TRUE);
        }
        return Boolean.valueOf(areEqual);
    }
}
