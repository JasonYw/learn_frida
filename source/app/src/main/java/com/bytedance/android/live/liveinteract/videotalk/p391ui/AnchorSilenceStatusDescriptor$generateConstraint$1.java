package com.bytedance.android.live.liveinteract.videotalk.p391ui;

import com.bytedance.android.live.core.tetris.layer.core.descriptor.C4100c;
import com.bytedance.android.live.core.tetris.layer.view.ElementConstraint;
import com.bytedance.android.live.core.widget.p327b.C4163a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C2QY;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.AnchorSilenceStatusDescriptor$generateConstraint$1 */
/* loaded from: classes12.dex */
public final class AnchorSilenceStatusDescriptor$generateConstraint$1 extends Lambda implements Function1<ElementConstraint, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C4163a $layerContext;

    static {
        Covode.recordClassIndex(30429);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorSilenceStatusDescriptor$generateConstraint$1(C4163a c4163a) {
        super(1);
        this.$layerContext = c4163a;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.AnchorSilenceStatusDescriptor$generateConstraint$1$1 */
    /* loaded from: classes12.dex */
    public static final class C49531 extends Lambda implements Function1<ElementConstraint.C4117d, Unit> {
        public static final C49531 INSTANCE = new C49531();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(30430);
        }

        public C49531() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ElementConstraint.C4117d c4117d) {
            ElementConstraint.C4117d c4117d2 = c4117d;
            if (!PatchProxy.proxy(new Object[]{c4117d2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c4117d2);
                c4117d2.LIZ = -1.0f;
                c4117d2.LIZIZ = 22.0f;
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.AnchorSilenceStatusDescriptor$generateConstraint$1$2 */
    /* loaded from: classes12.dex */
    public static final class C49542 extends Lambda implements Function1<ElementConstraint.C4116c, Unit> {
        public static final C49542 INSTANCE = new C49542();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(30431);
        }

        public C49542() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ElementConstraint.C4116c c4116c) {
            ElementConstraint.C4116c c4116c2 = c4116c;
            if (!PatchProxy.proxy(new Object[]{c4116c2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(c4116c2);
                c4116c2.f26193LJ = 12.0f;
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(ElementConstraint elementConstraint) {
        ElementConstraint elementConstraint2 = elementConstraint;
        if (!PatchProxy.proxy(new Object[]{elementConstraint2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(elementConstraint2);
            C49531 c49531 = C49531.INSTANCE;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c49531}, elementConstraint2, ElementConstraint.LIZ, false, 1);
            if (proxy.isSupported) {
                Object obj = proxy.result;
            } else {
                C106862S5w.LIZ(c49531);
                ElementConstraint.C4117d c4117d = new ElementConstraint.C4117d();
                c49531.invoke(c4117d);
                elementConstraint2.LJIIL = c4117d.LIZ;
                elementConstraint2.LIZIZ = c4117d.LIZJ;
                elementConstraint2.LJIILIIL = c4117d.LIZIZ;
                elementConstraint2.LIZJ = c4117d.LIZLLL;
            }
            C4100c LIZ = C2QY.LIZ();
            C49542 c49542 = C49542.INSTANCE;
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{LIZ, c49542}, elementConstraint2, ElementConstraint.LIZ, false, 8);
            if (proxy2.isSupported) {
                Object obj2 = proxy2.result;
            } else {
                C106862S5w.LIZ(LIZ);
                elementConstraint2.LIZ(ElementConstraint.Side.RIGHT, LIZ, ElementConstraint.Side.RIGHT, c49542);
            }
            C4100c c4100c = this.$layerContext.LIZLLL.LJJIIJ;
            PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{elementConstraint2, c4100c, null, 2, null}, null, ElementConstraint.LIZ, true, 13);
            if (proxy3.isSupported) {
                Object obj3 = proxy3.result;
            } else {
                PatchProxyResult proxy4 = PatchProxy.proxy(new Object[]{c4100c, null}, elementConstraint2, ElementConstraint.LIZ, false, 12);
                if (proxy4.isSupported) {
                    Object obj4 = proxy4.result;
                } else {
                    C106862S5w.LIZ(c4100c);
                    elementConstraint2.LIZ(ElementConstraint.Side.TOP, c4100c, ElementConstraint.Side.BOTTOM, (Function1<? super ElementConstraint.C4116c, Unit>) null);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
