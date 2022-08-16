package com.bytedance.android.live.core.tetris.layer.core.engine;

import com.bytedance.android.live.core.tetris.layer.core.descriptor.AbstractC4101h;
import com.bytedance.android.live.core.tetris.layer.core.element.C4105e;
import com.bytedance.android.live.core.tetris.layer.core.element.ElementBuilderMap;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C2R1;
import p003X.C2R2;

/* loaded from: classes12.dex */
public final class ServiceLayerEngine$elementFactory$2 extends Lambda implements Function0<C4105e> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2R1 this$0;

    static {
        Covode.recordClassIndex(23689);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceLayerEngine$elementFactory$2(C2R1 c2r1) {
        super(0);
        this.this$0 = c2r1;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, com.bytedance.android.live.core.tetris.layer.core.element.e] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4105e mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ElementBuilderMap elementBuilderMap = new ElementBuilderMap();
        elementBuilderMap.putAll(this.this$0.LIZIZ);
        C2R2 c2r2 = new C2R2();
        elementBuilderMap.put(AbstractC4101h.class, c2r2);
        C4105e c4105e = new C4105e(elementBuilderMap, this.this$0.LIZJ, this.this$0.LIZLLL.LIZLLL(), this.this$0.LIZLLL.LJIIIIZZ);
        c2r2.LIZ(c4105e);
        c2r2.LIZ(this.this$0.LIZLLL.LJII);
        c2r2.LIZ(this.this$0.LIZLLL.LJIIIIZZ);
        return c4105e;
    }
}
