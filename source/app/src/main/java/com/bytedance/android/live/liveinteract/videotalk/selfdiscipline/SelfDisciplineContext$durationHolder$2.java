package com.bytedance.android.live.liveinteract.videotalk.selfdiscipline;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class SelfDisciplineContext$durationHolder$2 extends Lambda implements Function0<ConcurrentHashMap<Long, Long>> {
    public static final SelfDisciplineContext$durationHolder$2 INSTANCE = new SelfDisciplineContext$durationHolder$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(30385);
    }

    public SelfDisciplineContext$durationHolder$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.Long>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ConcurrentHashMap<Long, Long> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new ConcurrentHashMap<>();
    }
}
