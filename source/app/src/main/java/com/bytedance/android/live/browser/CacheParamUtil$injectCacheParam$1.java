package com.bytedance.android.live.browser;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class CacheParamUtil$injectCacheParam$1 extends Lambda implements Function1<Map<String, ? extends Object>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.BooleanRef $hasPrefetch;
    public final /* synthetic */ Function1 $prefetchResolve;

    static {
        Covode.recordClassIndex(21880);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheParamUtil$injectCacheParam$1(Ref.BooleanRef booleanRef, Function1 function1) {
        super(1);
        this.$hasPrefetch = booleanRef;
        this.$prefetchResolve = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Map<String, ? extends Object> map) {
        if (!PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(map);
            this.$hasPrefetch.element = true;
            this.$prefetchResolve.invoke(map);
        }
        return Unit.INSTANCE;
    }
}
