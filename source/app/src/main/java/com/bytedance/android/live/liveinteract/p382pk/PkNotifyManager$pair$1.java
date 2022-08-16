package com.bytedance.android.live.liveinteract.p382pk;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.liveinteract.pk.PkNotifyManager$pair$1 */
/* loaded from: classes3.dex */
public final class PkNotifyManager$pair$1 extends Lambda implements Function0<C4734l> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DataCenter $dataCenter;

    static {
        Covode.recordClassIndex(28913);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkNotifyManager$pair$1(DataCenter dataCenter) {
        super(0);
        this.$dataCenter = dataCenter;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.liveinteract.pk.l, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4734l mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4734l(this.$dataCenter);
    }
}
