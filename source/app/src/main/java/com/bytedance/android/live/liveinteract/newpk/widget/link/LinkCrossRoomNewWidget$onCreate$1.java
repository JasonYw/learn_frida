package com.bytedance.android.live.liveinteract.newpk.widget.link;

import com.bytedance.android.live.liveinteract.p382pk.C4737p;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class LinkCrossRoomNewWidget$onCreate$1 extends Lambda implements Function0<C4737p> {
    public static final LinkCrossRoomNewWidget$onCreate$1 INSTANCE = new LinkCrossRoomNewWidget$onCreate$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(28879);
    }

    public LinkCrossRoomNewWidget$onCreate$1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.liveinteract.pk.p, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4737p mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4737p();
    }
}
