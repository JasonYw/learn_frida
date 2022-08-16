package com.bytedance.als;

import com.bytedance.als.monitor.C2546b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.NY6;

/* loaded from: classes6.dex */
public final class LogicComponent$performanceMonitorCalculate$2 extends Lambda implements Function0<C2546b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ NY6 this$0;

    static {
        Covode.recordClassIndex(10031);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogicComponent$performanceMonitorCalculate$2(NY6 ny6) {
        super(0);
        this.this$0 = ny6;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.monitor.b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2546b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C2546b(this.this$0);
    }
}
