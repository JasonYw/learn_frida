package com.bytedance.android.live.liveinteract.multianchor.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class MultiPkExtraResultAnimWidget$onCreate$pair$1 extends FunctionReferenceImpl implements Function0<C4583c> {
    public static final MultiPkExtraResultAnimWidget$onCreate$pair$1 INSTANCE = new MultiPkExtraResultAnimWidget$onCreate$pair$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(28469);
    }

    public MultiPkExtraResultAnimWidget$onCreate$pair$1() {
        super(0, C4583c.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.liveinteract.multianchor.widget.c, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4583c mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4583c();
    }
}
