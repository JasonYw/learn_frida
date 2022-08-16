package com.bytedance.android.live.lynx.open;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.behavior.Behavior;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.T3G;
import p003X.T3H;
import p003X.T3I;
import p003X.T3J;
import p003X.T3K;
import p003X.T3L;
import p003X.T3M;
import p003X.T3N;
import p003X.T3O;
import p003X.T3P;
import p003X.T3Q;

/* loaded from: classes10.dex */
public final class OpenLynxBehaviorProvider$behaviorList$2 extends Lambda implements Function0<List<Behavior>> {
    public static final OpenLynxBehaviorProvider$behaviorList$2 INSTANCE = new OpenLynxBehaviorProvider$behaviorList$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32255);
    }

    public OpenLynxBehaviorProvider$behaviorList$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List<com.lynx.tasm.behavior.Behavior>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ List<Behavior> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return CollectionsKt__CollectionsKt.mutableListOf(new T3L("filter-image"), new T3P("inline-image"), new T3K("a"), new T3H("swiper"), new T3N("swiper-item"), new T3G("textarea"), new T3I("input"), new T3J("image"), new T3Q("live-open-avatar"), new T3M("live-open-nickname"), new T3O("live-open-refresh-view"));
    }
}
