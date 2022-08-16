package com.bytedance.android.live.core.tetris.layer.core.element.tetris;

import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.android.live.core.tetris.layer.core.p322a.AbstractC4094b;
import com.bytedance.android.live.core.tetris.layer.core.tetris.Tetris;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C2LT;
import p003X.C2R9;

/* loaded from: classes12.dex */
public final class TetrisElement$tetris$2 extends Lambda implements Function0<Tetris<AbstractC4092b>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ TetrisElement this$0;

    static {
        Covode.recordClassIndex(23682);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TetrisElement$tetris$2(TetrisElement tetrisElement) {
        super(0);
        this.this$0 = tetrisElement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, com.bytedance.android.live.core.tetris.layer.core.tetris.Tetris<com.bytedance.android.live.core.tetris.layer.b>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.bytedance.android.live.core.tetris.layer.b, T extends com.bytedance.android.live.core.tetris.layer.b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Tetris<AbstractC4092b> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Tetris LIZ = this.this$0.LJIIIZ.LIZ();
        if (LIZ != null) {
            ?? r3 = this.this$0.LJII;
            if (!PatchProxy.proxy(new Object[]{r3}, LIZ, Tetris.LIZIZ, false, 5).isSupported) {
                C106862S5w.LIZ((Object) r3);
                LIZ.f26191LJ = r3;
            }
            C2R9 c2r9 = this.this$0.LJIIJ;
            if (!PatchProxy.proxy(new Object[]{c2r9}, LIZ, Tetris.LIZIZ, false, 3).isSupported) {
                C106862S5w.LIZ(c2r9);
                LIZ.LIZLLL = c2r9;
            }
            TetrisElement tetrisElement = this.this$0;
            if (!PatchProxy.proxy(new Object[]{tetrisElement}, LIZ, Tetris.LIZIZ, false, 7).isSupported) {
                C106862S5w.LIZ(tetrisElement);
                LIZ.LJFF = tetrisElement;
            }
            AbstractC4094b abstractC4094b = this.this$0.LJIIL;
            if (!PatchProxy.proxy(new Object[]{abstractC4094b}, LIZ, Tetris.LIZIZ, false, 9).isSupported) {
                C106862S5w.LIZ(abstractC4094b);
                LIZ.LJI = abstractC4094b;
            }
            C2LT c2lt = this.this$0.LJIIJJI;
            if (!PatchProxy.proxy(new Object[]{c2lt}, LIZ, Tetris.LIZIZ, false, 11).isSupported) {
                C106862S5w.LIZ(c2lt);
                LIZ.LJII = c2lt;
            }
            return LIZ;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.core.tetris.layer.core.tetris.Tetris<com.bytedance.android.live.core.tetris.layer.LayerContext>");
    }
}
