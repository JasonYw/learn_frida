package com.bytedance.android.live.core.tetris.layer.view;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.android.live.core.tetris.layer.core.element.ElementBuilderMap;
import com.bytedance.android.live.core.tetris.layer.core.event.LayerEventDispatcher;
import com.bytedance.android.live.core.tetris.layer.core.p322a.AbstractC4094b;
import com.bytedance.android.live.core.tetris.layer.view.C4118a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C2LT;
import p003X.C2NY;
import p003X.C2QU;

/* renamed from: com.bytedance.android.live.core.tetris.layer.view.a */
/* loaded from: classes12.dex */
public final class C4118a {
    public static ChangeQuickRedirect LIZ;
    public C2QU<AbstractC4092b> LIZIZ;
    public ElementBuilderMap LIZJ;
    public AbstractC4092b LIZLLL;

    /* renamed from: LJ */
    public LayerEventDispatcher f26195LJ;
    public C2NY<AbstractC4092b> LJFF;
    public ViewModelProvider LJI;
    public AbstractC4094b LJII = new AbstractC4094b() { // from class: X.2M7
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(23742);
        }

        @Override // com.bytedance.android.live.core.tetris.layer.core.p322a.AbstractC4094b
        public final <T extends ViewModel> T LIZ(Class<T> cls) {
            ViewModelProvider viewModelProvider;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, LIZ, false, 1);
            if (proxy.isSupported) {
                return (T) proxy.result;
            }
            C106862S5w.LIZ(cls);
            C4118a c4118a = C4118a.this;
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c4118a}, null, C4118a.LIZ, true, 18);
            if (proxy2.isSupported) {
                viewModelProvider = (ViewModelProvider) proxy2.result;
            } else {
                viewModelProvider = c4118a.LJI;
                if (viewModelProvider == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
            }
            T t = (T) viewModelProvider.get(cls);
            Intrinsics.checkNotNullExpressionValue(t, "");
            return t;
        }
    };
    public C2LT LJIIIIZZ = new C2LT(null);

    static {
        Covode.recordClassIndex(23741);
    }

    public final C2QU<AbstractC4092b> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C2QU) proxy.result;
        }
        C2QU<AbstractC4092b> c2qu = this.LIZIZ;
        if (c2qu == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c2qu;
    }

    public final ElementBuilderMap LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (ElementBuilderMap) proxy.result;
        }
        ElementBuilderMap elementBuilderMap = this.LIZJ;
        if (elementBuilderMap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return elementBuilderMap;
    }

    public final AbstractC4092b LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (AbstractC4092b) proxy.result;
        }
        AbstractC4092b abstractC4092b = this.LIZLLL;
        if (abstractC4092b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC4092b;
    }

    public final LayerEventDispatcher LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (LayerEventDispatcher) proxy.result;
        }
        LayerEventDispatcher layerEventDispatcher = this.f26195LJ;
        if (layerEventDispatcher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return layerEventDispatcher;
    }

    public final C4118a LIZ(C2QU<? extends AbstractC4092b> c2qu) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c2qu}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (C4118a) proxy.result;
        }
        C106862S5w.LIZ(c2qu);
        this.LIZIZ = c2qu;
        return this;
    }

    public final C4118a LIZ(ViewModelProvider viewModelProvider) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewModelProvider}, this, LIZ, false, 16);
        if (proxy.isSupported) {
            return (C4118a) proxy.result;
        }
        C106862S5w.LIZ(viewModelProvider);
        this.LJI = viewModelProvider;
        return this;
    }

    public final C4118a LIZ(AbstractC4092b abstractC4092b) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC4092b}, this, LIZ, false, 12);
        if (proxy.isSupported) {
            return (C4118a) proxy.result;
        }
        C106862S5w.LIZ(abstractC4092b);
        this.LIZLLL = abstractC4092b;
        return this;
    }

    public final C4118a LIZ(ElementBuilderMap elementBuilderMap) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{elementBuilderMap}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (C4118a) proxy.result;
        }
        C106862S5w.LIZ(elementBuilderMap);
        this.LIZJ = elementBuilderMap;
        return this;
    }

    public final C4118a LIZ(LayerEventDispatcher layerEventDispatcher) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layerEventDispatcher}, this, LIZ, false, 14);
        if (proxy.isSupported) {
            return (C4118a) proxy.result;
        }
        C106862S5w.LIZ(layerEventDispatcher);
        this.f26195LJ = layerEventDispatcher;
        return this;
    }
}
