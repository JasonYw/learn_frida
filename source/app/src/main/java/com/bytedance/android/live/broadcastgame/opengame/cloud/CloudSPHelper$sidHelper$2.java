package com.bytedance.android.live.broadcastgame.opengame.cloud;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.utility.SharedPrefHelper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class CloudSPHelper$sidHelper$2 extends Lambda implements Function0<SharedPrefHelper> {
    public static final CloudSPHelper$sidHelper$2 INSTANCE = new CloudSPHelper$sidHelper$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19974);
    }

    public CloudSPHelper$sidHelper$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.bytedance.ies.utility.SharedPrefHelper] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ SharedPrefHelper mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ALogger.m15797i("CloudSPHelper_initialize", "create sp helper");
        return SharedPrefHelper.LIZ(LK5.LJIIJ(), "open_game_cloud_sid");
    }
}
