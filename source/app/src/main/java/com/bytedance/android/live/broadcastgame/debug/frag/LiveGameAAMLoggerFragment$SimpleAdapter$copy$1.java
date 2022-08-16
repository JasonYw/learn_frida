package com.bytedance.android.live.broadcastgame.debug.frag;

import com.bytedance.android.live.broadcastgame.api.C3324a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class LiveGameAAMLoggerFragment$SimpleAdapter$copy$1 extends Lambda implements Function1<C3324a, CharSequence> {
    public static final LiveGameAAMLoggerFragment$SimpleAdapter$copy$1 INSTANCE = new LiveGameAAMLoggerFragment$SimpleAdapter$copy$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19710);
    }

    public LiveGameAAMLoggerFragment$SimpleAdapter$copy$1() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ CharSequence invoke(C3324a c3324a) {
        C3324a c3324a2 = c3324a;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3324a2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3324a2);
        return c3324a2.LIZ();
    }
}
