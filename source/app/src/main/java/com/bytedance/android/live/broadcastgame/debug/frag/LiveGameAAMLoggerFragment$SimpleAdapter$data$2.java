package com.bytedance.android.live.broadcastgame.debug.frag;

import com.bytedance.android.live.broadcastgame.api.C3324a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class LiveGameAAMLoggerFragment$SimpleAdapter$data$2 extends Lambda implements Function0<List<C3324a>> {
    public static final LiveGameAAMLoggerFragment$SimpleAdapter$data$2 INSTANCE = new LiveGameAAMLoggerFragment$SimpleAdapter$data$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19711);
    }

    public LiveGameAAMLoggerFragment$SimpleAdapter$data$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<com.bytedance.android.live.broadcastgame.api.a>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ List<C3324a> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new ArrayList();
    }
}
