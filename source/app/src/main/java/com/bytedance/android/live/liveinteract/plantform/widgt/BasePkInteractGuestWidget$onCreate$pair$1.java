package com.bytedance.android.live.liveinteract.plantform.widgt;

import com.bytedance.android.live.liveinteract.plantform.C4785b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class BasePkInteractGuestWidget$onCreate$pair$1 extends FunctionReferenceImpl implements Function0<C4785b> {
    public static final BasePkInteractGuestWidget$onCreate$pair$1 INSTANCE = new BasePkInteractGuestWidget$onCreate$pair$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(29584);
    }

    public BasePkInteractGuestWidget$onCreate$pair$1() {
        super(0, C4785b.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.liveinteract.plantform.b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4785b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4785b();
    }
}
