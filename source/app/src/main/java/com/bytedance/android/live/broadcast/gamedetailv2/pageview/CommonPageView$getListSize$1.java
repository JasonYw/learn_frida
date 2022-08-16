package com.bytedance.android.live.broadcast.gamedetailv2.pageview;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C89048L6s;

/* loaded from: classes5.dex */
public final class CommonPageView$getListSize$1 extends Lambda implements Function0<Integer> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C89048L6s this$0;

    static {
        Covode.recordClassIndex(16661);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonPageView$getListSize$1(C89048L6s c89048L6s) {
        super(0);
        this.this$0 = c89048L6s;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Integer mo30099invoke() {
        int size;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            size = ((Integer) proxy.result).intValue();
        } else {
            size = this.this$0.LIZLLL.size();
        }
        return Integer.valueOf(size);
    }
}
