package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel;

import com.bytedance.android.live.broadcastgame.api.model.C3380j;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C448003nm;

/* loaded from: classes12.dex */
public final class LiveOpenFeaturePanelViewModel$openFeatureFilter$2 extends Lambda implements Function0<C448003nm<C3380j>> {
    public static final LiveOpenFeaturePanelViewModel$openFeatureFilter$2 INSTANCE = new LiveOpenFeaturePanelViewModel$openFeatureFilter$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21450);
    }

    public LiveOpenFeaturePanelViewModel$openFeatureFilter$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.3nm<com.bytedance.android.live.broadcastgame.api.model.j>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C448003nm<C3380j> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C448003nm<>();
    }
}
