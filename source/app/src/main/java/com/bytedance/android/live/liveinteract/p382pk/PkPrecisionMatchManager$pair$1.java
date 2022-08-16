package com.bytedance.android.live.liveinteract.p382pk;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C79232HLe;
import p003X.C79309HOd;

/* renamed from: com.bytedance.android.live.liveinteract.pk.PkPrecisionMatchManager$pair$1 */
/* loaded from: classes3.dex */
public final class PkPrecisionMatchManager$pair$1 extends Lambda implements Function0<C4736n> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C79309HOd $pkLinkDataContext;
    public final /* synthetic */ C79232HLe this$0;

    static {
        Covode.recordClassIndex(28914);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkPrecisionMatchManager$pair$1(C79232HLe c79232HLe, C79309HOd c79309HOd) {
        super(0);
        this.this$0 = c79232HLe;
        this.$pkLinkDataContext = c79309HOd;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.live.liveinteract.pk.n, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4736n mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4736n(this.this$0.LJFF, this.$pkLinkDataContext);
    }
}
