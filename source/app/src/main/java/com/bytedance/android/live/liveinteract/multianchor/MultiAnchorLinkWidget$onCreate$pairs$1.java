package com.bytedance.android.live.liveinteract.multianchor;

import com.bytedance.android.live.liveinteract.multianchor.p374pk.C4535h;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class MultiAnchorLinkWidget$onCreate$pairs$1 extends Lambda implements Function0<C4535h> {
    public static final MultiAnchorLinkWidget$onCreate$pairs$1 INSTANCE = new MultiAnchorLinkWidget$onCreate$pairs$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(27830);
    }

    public MultiAnchorLinkWidget$onCreate$pairs$1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.liveinteract.multianchor.pk.h, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4535h mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4535h();
    }
}
