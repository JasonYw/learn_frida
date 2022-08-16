package com.bytedance.android.live.playtogether.presenter;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.playtogether.C5234h;
import com.bytedance.android.live.playtogether.viewmodel.C5245d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C392521gU;
import p003X.LU8;
import p003X.LUG;
import p003X.LUH;

/* loaded from: classes5.dex */
public final class PlayTogetherPresenter$floatWindowContainerController$2 extends Lambda implements Function0<C5234h> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LU8 this$0;

    static {
        Covode.recordClassIndex(33064);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayTogetherPresenter$floatWindowContainerController$2(LU8 lu8) {
        super(0);
        this.this$0 = lu8;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, com.bytedance.android.live.playtogether.h] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C5234h mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C5234h c5234h = new C5234h();
        ALogger.m15801d("Together#PlayTogetherPresenter", "handleFloatWindowStatusByExtern");
        C5245d LIZ = this.this$0.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        if (!PatchProxy.proxy(new Object[]{LIZ}, c5234h, C5234h.LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(LIZ);
            C392521gU.LIZ(LIZ.LIZLLL(), LIZ.LIZLLL().getValue(), new LUG(LIZ));
            C392521gU.LIZ(LIZ.LIZ(), LIZ.LIZ().getValue(), new LUH(LIZ));
        }
        return c5234h;
    }
}
