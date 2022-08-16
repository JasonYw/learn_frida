package com.bytedance.android.live.liveinteract.feed;

import com.bytedance.android.live.liveinteract.multianchor.p369i.C4521a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C4CB;

/* loaded from: classes12.dex */
public final class MultiAnchorFeedView$transfer$2 extends Lambda implements Function0<C4521a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C4CB this$0;

    static {
        Covode.recordClassIndex(26892);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiAnchorFeedView$transfer$2(C4CB c4cb) {
        super(0);
        this.this$0 = c4cb;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.liveinteract.multianchor.i.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4521a mo30099invoke() {
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (this.this$0.getShowFrom() == 3) {
            z = true;
        }
        return new C4521a(true, Boolean.valueOf(z));
    }
}
