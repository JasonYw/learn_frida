package com.bytedance.android.live.broadcast.preview.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class StartLiveVisibilityContext$limitInfoLoadItemList$1 extends Lambda implements Function0<Long> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3207d this$0;

    static {
        Covode.recordClassIndex(17455);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveVisibilityContext$limitInfoLoadItemList$1(C3207d c3207d) {
        super(0);
        this.this$0 = c3207d;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Long, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Long mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Integer num = this.this$0.LJII.LJFF;
        if (num != null) {
            return Long.valueOf(num.intValue());
        }
        return 0L;
    }
}
