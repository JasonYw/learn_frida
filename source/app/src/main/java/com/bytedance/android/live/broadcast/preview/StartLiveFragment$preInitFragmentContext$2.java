package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.AbstractC2929ar;
import com.bytedance.android.live.broadcast.model.AbstractC3155a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.KCK;

/* loaded from: classes5.dex */
public final class StartLiveFragment$preInitFragmentContext$2 extends Lambda implements Function0<AbstractC3155a> {
    public static final StartLiveFragment$preInitFragmentContext$2 INSTANCE = new StartLiveFragment$preInitFragmentContext$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(17124);
    }

    public StartLiveFragment$preInitFragmentContext$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.android.live.broadcast.model.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbstractC3155a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        AbstractC2929ar abstractC2929ar = new KCK().LIZ;
        if (abstractC2929ar != null) {
            return abstractC2929ar.LIZ();
        }
        return null;
    }
}
