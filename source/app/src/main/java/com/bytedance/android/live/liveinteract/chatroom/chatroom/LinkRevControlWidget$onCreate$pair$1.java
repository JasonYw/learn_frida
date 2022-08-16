package com.bytedance.android.live.liveinteract.chatroom.chatroom;

import com.bytedance.android.live.liveinteract.plantform.p385a.C4768aj;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class LinkRevControlWidget$onCreate$pair$1 extends Lambda implements Function0<C4768aj> {
    public static final LinkRevControlWidget$onCreate$pair$1 INSTANCE = new LinkRevControlWidget$onCreate$pair$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(25296);
    }

    public LinkRevControlWidget$onCreate$pair$1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.liveinteract.plantform.a.aj, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4768aj mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4768aj();
    }
}
