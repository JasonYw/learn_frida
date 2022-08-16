package com.bytedance.android.live.broadcast.anchorshow;

import android.view.View;
import com.bytedance.android.live.broadcast.anchorshow.C2870b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.broadcast.anchorshow.AnchorShowFlowController$AnchorShowFlowItem$mBtnAnchorShowDelete$2 */
/* loaded from: classes5.dex */
public final class C2869xa74f57a3 extends Lambda implements Function0<View> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2870b.C2871a this$0;

    static {
        Covode.recordClassIndex(14357);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2869xa74f57a3(C2870b.C2871a c2871a) {
        super(0);
        this.this$0 = c2871a;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ View mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.LJFF.findViewById(2131168521);
    }
}
