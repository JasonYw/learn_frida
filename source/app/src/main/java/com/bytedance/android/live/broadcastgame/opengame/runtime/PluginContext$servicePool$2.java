package com.bytedance.android.live.broadcastgame.opengame.runtime;

import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class PluginContext$servicePool$2 extends Lambda implements Function0<ConcurrentHashMap<Class<? extends AbstractC3719c>, Object>> {
    public static final PluginContext$servicePool$2 INSTANCE = new PluginContext$servicePool$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(20890);
    }

    public PluginContext$servicePool$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.ConcurrentHashMap<java.lang.Class<? extends com.bytedance.android.live.broadcastgame.opengame.service.a.c>, java.lang.Object>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ConcurrentHashMap<Class<? extends AbstractC3719c>, Object> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new ConcurrentHashMap<>();
    }
}
