package com.bytedance.android.latch.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC137655ckl;

/* loaded from: classes17.dex */
public final class BaseLatchProcess$createStateHolder$4 extends Lambda implements Function0<a$a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC137655ckl this$0;

    static {
        Covode.recordClassIndex(13704);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseLatchProcess$createStateHolder$4(AbstractC137655ckl abstractC137655ckl) {
        super(0);
        this.this$0 = abstractC137655ckl;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.bytedance.android.latch.internal.a$a] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ a$a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        a$a value = this.this$0.LJFF.getValue();
        if (value != null) {
            return value;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
