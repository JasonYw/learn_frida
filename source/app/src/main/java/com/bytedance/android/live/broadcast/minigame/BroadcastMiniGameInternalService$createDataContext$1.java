package com.bytedance.android.live.broadcast.minigame;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class BroadcastMiniGameInternalService$createDataContext$1 extends Lambda implements Function0<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Class $clazz;

    static {
        Covode.recordClassIndex(16929);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMiniGameInternalService$createDataContext$1(Class cls) {
        super(0);
        this.$clazz = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.$clazz.newInstance();
    }
}
