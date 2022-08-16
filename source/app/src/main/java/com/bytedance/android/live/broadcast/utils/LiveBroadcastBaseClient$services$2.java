package com.bytedance.android.live.broadcast.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class LiveBroadcastBaseClient$services$2 extends Lambda implements Function0<ConcurrentHashMap<Class<?>, Object>> {
    public static final LiveBroadcastBaseClient$services$2 INSTANCE = new LiveBroadcastBaseClient$services$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(17969);
    }

    public LiveBroadcastBaseClient$services$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, java.lang.Object>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ConcurrentHashMap<Class<?>, Object> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new ConcurrentHashMap<>();
    }
}
