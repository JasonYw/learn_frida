package com.bytedance.android.live.core.tetris.layer.core.engine;

import com.bytedance.android.live.core.tetris.layer.core.descriptor.AbstractC4101h;
import com.bytedance.android.live.core.tetris.layer.core.descriptor.AbstractC4102j;
import com.bytedance.android.live.core.tetris.layer.core.element.C4105e;
import com.bytedance.android.live.core.tetris.layer.core.element.Element;
import com.bytedance.android.live.core.tetris.layer.core.element.ElementBuilderMap;
import com.bytedance.android.live.core.tetris.layer.core.element.view.ViewElement;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C2R0;
import p003X.C2R2;
import p003X.C2R8;

/* loaded from: classes12.dex */
public final class ViewLayerEngine$elementFactory$2 extends Lambda implements Function0<C4105e> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2R0 this$0;

    static {
        Covode.recordClassIndex(23690);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewLayerEngine$elementFactory$2(C2R0 c2r0) {
        super(0);
        this.this$0 = c2r0;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, com.bytedance.android.live.core.tetris.layer.core.element.e] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4105e mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ElementBuilderMap elementBuilderMap = new ElementBuilderMap();
        elementBuilderMap.putAll(this.this$0.LIZJ);
        C2R2 c2r2 = new C2R2();
        C2R8<AbstractC4102j> c2r8 = new C2R8<AbstractC4102j>() { // from class: X.2R7
            public static ChangeQuickRedirect LIZJ;

            static {
                Covode.recordClassIndex(23685);
            }

            @Override // p003X.C2R8
            public final /* synthetic */ Element LIZ(AbstractC4102j abstractC4102j) {
                AbstractC4102j abstractC4102j2 = abstractC4102j;
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{abstractC4102j2}, this, LIZJ, false, 1);
                if (proxy2.isSupported) {
                    return (Element) proxy2.result;
                }
                C106862S5w.LIZ(abstractC4102j2);
                return new ViewElement(LIZ(), abstractC4102j2);
            }
        };
        elementBuilderMap.put(AbstractC4101h.class, c2r2);
        elementBuilderMap.put(AbstractC4102j.class, c2r8);
        C4105e c4105e = new C4105e(elementBuilderMap, this.this$0.f529LJ, this.this$0.LJFF.LIZLLL(), this.this$0.LJFF.LJIIIIZZ);
        c2r2.LIZ(c4105e);
        c2r2.LIZ(this.this$0.LJFF.LJII);
        c2r2.LIZ(this.this$0.LJFF.LJIIIIZZ);
        return c4105e;
    }
}
