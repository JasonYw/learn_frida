package com.bytedance.android.annie.resource;

import com.bytedance.android.annie.service.p219n.C2634j;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC90724Lok;
import p003X.C90746Lp6;

/* loaded from: classes5.dex */
public final class ForestLoader$memoryConfig$2 extends Lambda implements Function0<C2634j> {
    public static final ForestLoader$memoryConfig$2 INSTANCE = new ForestLoader$memoryConfig$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10957);
    }

    public ForestLoader$memoryConfig$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.android.annie.service.n.j] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2634j mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C90746Lp6<C2634j> c90746Lp6 = AbstractC90724Lok.LJJIJIIJI;
        Intrinsics.checkNotNullExpressionValue(c90746Lp6, "");
        return c90746Lp6.LIZ();
    }
}
