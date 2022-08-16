package com.bytedance.android.live.liveinteract.interact.audience.fragment.p361v2;

import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC78986HBs;
import p003X.HKN;

/* renamed from: com.bytedance.android.live.liveinteract.interact.audience.fragment.v2.InteractAudienceInviteListFragmentV2$userCenter$2 */
/* loaded from: classes3.dex */
public final class InteractAudienceInviteListFragmentV2$userCenter$2 extends Lambda implements Function0<AbstractC78986HBs<LinkPlayerInfo>> {
    public static final InteractAudienceInviteListFragmentV2$userCenter$2 INSTANCE = new InteractAudienceInviteListFragmentV2$userCenter$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(27299);
    }

    public InteractAudienceInviteListFragmentV2$userCenter$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.HBs<com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbstractC78986HBs<LinkPlayerInfo> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return HKN.LIZIZ();
    }
}
