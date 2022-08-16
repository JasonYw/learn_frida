package com.bytedance.android.live.broadcast.onestep.utils;

import com.bytedance.android.live.broadcast.viewmodel.C3257c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class FastStartLiveHelper$preInitFragmentContext$2 extends Lambda implements Function0<C3257c> {
    public static final FastStartLiveHelper$preInitFragmentContext$2 INSTANCE = new FastStartLiveHelper$preInitFragmentContext$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(17058);
    }

    public FastStartLiveHelper$preInitFragmentContext$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.broadcast.viewmodel.c, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3257c mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C3257c LIZ = C3257c.LJIIIIZZ.LIZ();
        if (LIZ == null) {
            return new C3257c();
        }
        return LIZ;
    }
}
