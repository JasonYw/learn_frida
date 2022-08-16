package com.bytedance.android.live.broadcast.anchorshow;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C89433LLn;

/* loaded from: classes5.dex */
public final class AddAnchorShowDialog$mController$2 extends Lambda implements Function0<C2870b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C89433LLn this$0;

    static {
        Covode.recordClassIndex(14355);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddAnchorShowDialog$mController$2(C89433LLn c89433LLn) {
        super(0);
        this.this$0 = c89433LLn;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.bytedance.android.live.broadcast.anchorshow.b] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2870b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C2870b(this.this$0.LIZIZ(), this.this$0.LIZJ(), this.this$0.LJI);
    }
}
