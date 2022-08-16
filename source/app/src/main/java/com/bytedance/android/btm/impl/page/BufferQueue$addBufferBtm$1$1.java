package com.bytedance.android.btm.impl.page;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.RunnableC141385dj9;

/* loaded from: classes18.dex */
public final class BufferQueue$addBufferBtm$1$1 extends Lambda implements Function0<Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ RunnableC141385dj9 this$0;

    static {
        Covode.recordClassIndex(11427);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferQueue$addBufferBtm$1$1(RunnableC141385dj9 runnableC141385dj9) {
        super(0);
        this.this$0 = runnableC141385dj9;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.LIZIZ + " has expired";
    }
}
