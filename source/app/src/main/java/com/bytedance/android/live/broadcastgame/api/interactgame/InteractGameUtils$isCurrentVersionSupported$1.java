package com.bytedance.android.live.broadcastgame.api.interactgame;

import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import p003X.C443233g5;

/* loaded from: classes12.dex */
public final class InteractGameUtils$isCurrentVersionSupported$1 extends Lambda implements Function0<Long> {
    public static final InteractGameUtils$isCurrentVersionSupported$1 INSTANCE = new InteractGameUtils$isCurrentVersionSupported$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19107);
    }

    public InteractGameUtils$isCurrentVersionSupported$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Long mo30099invoke() {
        long j;
        String versionCode;
        Long longOrNull;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            j = ((Long) proxy.result).longValue();
        } else {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], C443233g5.LIZIZ, C443233g5.LIZ, false, 15);
            if (proxy2.isSupported) {
                j = ((Long) proxy2.result).longValue();
            } else {
                IHostContext iHostContext = (IHostContext) ServiceManager.getService(IHostContext.class);
                if (iHostContext != null && (versionCode = iHostContext.getVersionCode()) != null && (longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(versionCode)) != null) {
                    j = longOrNull.longValue();
                } else {
                    j = 0;
                }
            }
        }
        return Long.valueOf(j);
    }
}
