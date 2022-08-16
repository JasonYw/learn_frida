package com.bytedance.android.live.liveinteract.doublepk.widget;

import com.bytedance.android.live.liveinteract.doublepk.core.C4398a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class DoublePkBusinessWidget$initDataContext$pair$1 extends FunctionReferenceImpl implements Function0<C4398a> {
    public static final DoublePkBusinessWidget$initDataContext$pair$1 INSTANCE = new DoublePkBusinessWidget$initDataContext$pair$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(26849);
    }

    public DoublePkBusinessWidget$initDataContext$pair$1() {
        super(0, C4398a.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.liveinteract.doublepk.core.a] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4398a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4398a();
    }
}
