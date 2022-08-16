package com.bytedance.android.live.broadcast.effect;

import com.bytedance.android.live.broadcast.C3005ed;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class EffectHostLiveService$stickerReportUtil$2 extends Lambda implements Function0<C3005ed> {
    public static final EffectHostLiveService$stickerReportUtil$2 INSTANCE = new EffectHostLiveService$stickerReportUtil$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(15737);
    }

    public EffectHostLiveService$stickerReportUtil$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcast.ed, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3005ed mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3005ed();
    }
}
