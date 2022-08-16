package com.bytedance.android.live.broadcastgame.debug;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class LiveGameDebugChannel$listeners$2 extends Lambda implements Function0<Map<Class<?>, List<Function1<?, ? extends Unit>>>> {
    public static final LiveGameDebugChannel$listeners$2 INSTANCE = new LiveGameDebugChannel$listeners$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19692);
    }

    public LiveGameDebugChannel$listeners$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map<java.lang.Class<?>, java.util.List<kotlin.jvm.functions.Function1<?, ? extends kotlin.Unit>>>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Map<Class<?>, List<Function1<?, ? extends Unit>>> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new LinkedHashMap();
    }
}
