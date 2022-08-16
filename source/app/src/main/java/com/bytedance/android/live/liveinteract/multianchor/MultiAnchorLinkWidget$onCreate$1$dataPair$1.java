package com.bytedance.android.live.liveinteract.multianchor;

import com.bytedance.android.live.liveinteract.multianchor.p374pk.C4536j;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class MultiAnchorLinkWidget$onCreate$1$dataPair$1 extends Lambda implements Function0<C4536j> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C5923dp $it;

    static {
        Covode.recordClassIndex(27829);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiAnchorLinkWidget$onCreate$1$dataPair$1(C5923dp c5923dp) {
        super(0);
        this.$it = c5923dp;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.liveinteract.multianchor.pk.j, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4536j mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4536j(this.$it);
    }
}
