package com.bytedance.android.live.broadcastgame.channel.interceptor;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class SeqInterceptor$hashSet$2 extends Lambda implements Function0<HashSet<Long>> {
    public static final SeqInterceptor$hashSet$2 INSTANCE = new SeqInterceptor$hashSet$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19504);
    }

    public SeqInterceptor$hashSet$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashSet<java.lang.Long>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ HashSet<Long> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new HashSet<>();
    }
}
