package com.bytedance.android.live.liveinteract.multianchor.dialog;

import com.bytedance.android.live.liveinteract.randompkcheck.C4832a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class MultiAnchorPkLaunchDialog$onCreate$1 extends Lambda implements Function0<C4832a> {
    public static final MultiAnchorPkLaunchDialog$onCreate$1 INSTANCE = new MultiAnchorPkLaunchDialog$onCreate$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(27951);
    }

    public MultiAnchorPkLaunchDialog$onCreate$1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.liveinteract.randompkcheck.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4832a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4832a();
    }
}
