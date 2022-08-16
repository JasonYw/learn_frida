package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.BroadcastStarGraphApi;
import com.bytedance.android.live.broadcast.viewmodel.C3260j;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C88306Kqq;

/* loaded from: classes12.dex */
public final class PreviewStarGraphTaskWidget$viewModel$2 extends Lambda implements Function0<C3260j> {
    public static final PreviewStarGraphTaskWidget$viewModel$2 INSTANCE = new PreviewStarGraphTaskWidget$viewModel$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(18697);
    }

    public PreviewStarGraphTaskWidget$viewModel$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.bytedance.android.live.broadcast.viewmodel.j] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3260j mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Object LIZ = C88306Kqq.LIZ().LIZ(BroadcastStarGraphApi.class);
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        return new C3260j((BroadcastStarGraphApi) LIZ, false, 2);
    }
}
