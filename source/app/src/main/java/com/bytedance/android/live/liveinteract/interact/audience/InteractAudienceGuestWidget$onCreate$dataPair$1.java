package com.bytedance.android.live.liveinteract.interact.audience;

import com.bytedance.android.live.liveinteract.interact.audience.context.C4427c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class InteractAudienceGuestWidget$onCreate$dataPair$1 extends Lambda implements Function0<C4427c> {
    public static final InteractAudienceGuestWidget$onCreate$dataPair$1 INSTANCE = new InteractAudienceGuestWidget$onCreate$dataPair$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(27015);
    }

    public InteractAudienceGuestWidget$onCreate$dataPair$1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.liveinteract.interact.audience.context.c, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4427c mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4427c();
    }
}
