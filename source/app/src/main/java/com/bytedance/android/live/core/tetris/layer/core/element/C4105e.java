package com.bytedance.android.live.core.tetris.layer.core.element;

import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.android.live.core.tetris.layer.core.descriptor.AbstractC4099b;
import com.bytedance.android.live.core.tetris.layer.core.event.LayerEventDispatcher;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C2LT;
import p003X.C2R8;
import p003X.C2R9;

/* renamed from: com.bytedance.android.live.core.tetris.layer.core.element.e */
/* loaded from: classes12.dex */
public final class C4105e implements C2R9 {
    public static ChangeQuickRedirect LIZ;
    public final ElementBuilderMap LIZIZ;
    public final LayerEventDispatcher LIZJ;
    public final C2LT LIZLLL;

    static {
        Covode.recordClassIndex(23679);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Class<AbstractC4099b> LIZ(Class<?> cls) {
        while (true) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, LIZ, false, 2);
            if (proxy.isSupported) {
                return (Class) proxy.result;
            }
            if (!AbstractC4099b.class.isAssignableFrom(cls) || Intrinsics.areEqual(cls, Object.class)) {
                return null;
            }
            Class<?>[] interfaces = cls.getInterfaces();
            Intrinsics.checkNotNullExpressionValue(interfaces, "");
            for (Class<AbstractC4099b> cls2 : interfaces) {
                if (AbstractC4099b.class.isAssignableFrom(cls2)) {
                    return cls2;
                }
            }
            cls = cls.getSuperclass();
            Intrinsics.checkNotNullExpressionValue(cls, "");
        }
    }

    @Override // p003X.C2R9
    public final Element<?> LIZ(AbstractC4099b abstractC4099b) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC4099b}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (Element) proxy.result;
        }
        C106862S5w.LIZ(abstractC4099b);
        Class<AbstractC4099b> LIZ2 = LIZ(abstractC4099b.getClass());
        Intrinsics.checkNotNull(LIZ2);
        C2R8<? extends AbstractC4099b> c2r8 = this.LIZIZ.get(LIZ2);
        if (c2r8 != null) {
            Element<?> LIZ3 = c2r8.LIZ(abstractC4099b);
            LayerEventDispatcher layerEventDispatcher = this.LIZJ;
            if (!PatchProxy.proxy(new Object[]{layerEventDispatcher}, LIZ3, Element.LIZ, false, 3).isSupported) {
                C106862S5w.LIZ(layerEventDispatcher);
                LIZ3.f26187LJ = layerEventDispatcher;
            }
            C2LT c2lt = this.LIZLLL;
            if (!PatchProxy.proxy(new Object[]{c2lt}, LIZ3, Element.LIZ, false, 5).isSupported) {
                C106862S5w.LIZ(c2lt);
                LIZ3.LJFF = c2lt;
            }
            return LIZ3;
        }
        throw new IllegalArgumentException("There is no ElementBuilder for " + LIZ2 + " .");
    }

    public C4105e(ElementBuilderMap elementBuilderMap, AbstractC4092b abstractC4092b, LayerEventDispatcher layerEventDispatcher, C2LT c2lt) {
        C106862S5w.LIZ(elementBuilderMap, abstractC4092b, layerEventDispatcher, c2lt);
        this.LIZIZ = elementBuilderMap;
        this.LIZJ = layerEventDispatcher;
        this.LIZLLL = c2lt;
        for (Map.Entry<Class<? extends AbstractC4099b>, C2R8<? extends AbstractC4099b>> entry : this.LIZIZ.entrySet()) {
            C2R8<? extends AbstractC4099b> value = entry.getValue();
            if (!PatchProxy.proxy(new Object[]{abstractC4092b}, value, C2R8.LIZ, false, 2).isSupported) {
                C106862S5w.LIZ(abstractC4092b);
                value.LIZIZ = abstractC4092b;
            }
        }
    }
}
