package com.bytedance.android.live.browser.jsbridge;

import com.bytedance.android.tools.superkv.AbstractC10535e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C91258LxM;

/* loaded from: classes8.dex */
public final class JsBridgeService$kv$2 extends Lambda implements Function0<AbstractC10535e> {
    public static final JsBridgeService$kv$2 INSTANCE;
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(22043);
        INSTANCE = new JsBridgeService$kv$2();
    }

    public JsBridgeService$kv$2() {
        super(0);
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(22043);
        INSTANCE = new JsBridgeService$kv$2();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.android.tools.superkv.e] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbstractC10535e mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        AbstractC10535e LIZ = C91258LxM.LIZ("__jsb_permission");
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        return LIZ;
    }
}
