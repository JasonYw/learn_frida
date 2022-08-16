package com.bytedance.android.live.playtogether.p410ui;

import com.bytedance.android.live.playtogether.p410ui.adapter.C5241e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.LUQ;

/* renamed from: com.bytedance.android.live.playtogether.ui.PlayTogetherAnchorOnInvitedFragment$adapter$2 */
/* loaded from: classes.dex */
public final class PlayTogetherAnchorOnInvitedFragment$adapter$2 extends Lambda implements Function0<C5241e> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LUQ this$0;

    static {
        Covode.recordClassIndex(33124);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayTogetherAnchorOnInvitedFragment$adapter$2(LUQ luq) {
        super(0);
        this.this$0 = luq;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.playtogether.ui.adapter.e, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C5241e mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        LUQ luq = this.this$0;
        return new C5241e(luq, luq);
    }
}
