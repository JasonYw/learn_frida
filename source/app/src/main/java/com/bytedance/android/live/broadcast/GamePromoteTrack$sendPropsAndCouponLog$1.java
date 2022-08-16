package com.bytedance.android.live.broadcast;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class GamePromoteTrack$sendPropsAndCouponLog$1 extends Lambda implements Function0<C2860ae> {
    public static final GamePromoteTrack$sendPropsAndCouponLog$1 INSTANCE = new GamePromoteTrack$sendPropsAndCouponLog$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14297);
    }

    public GamePromoteTrack$sendPropsAndCouponLog$1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.broadcast.ae] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2860ae mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C2860ae();
    }
}
