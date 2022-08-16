package com.bytedance.android.live.broadcast.gamedetail.order.view;

import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class ProcessView$oval$2 extends Lambda implements Function0<RectF> {
    public static final ProcessView$oval$2 INSTANCE = new ProcessView$oval$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16543);
    }

    public ProcessView$oval$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.RectF, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ RectF mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new RectF();
    }
}
