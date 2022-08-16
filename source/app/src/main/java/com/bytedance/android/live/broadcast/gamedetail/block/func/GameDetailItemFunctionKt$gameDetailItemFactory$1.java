package com.bytedance.android.live.broadcast.gamedetail.block.func;

import android.content.Context;
import com.alipay.sdk.p082m.p121u.C1399n;
import com.bytedance.android.live.broadcast.comment.data.C2988e;
import com.bytedance.android.live.broadcast.gamedetail.block.C3052c;
import com.bytedance.android.live.broadcast.gamedetail.block.C3053d;
import com.bytedance.android.live.broadcast.gamedetail.block.GameTabWidget;
import com.bytedance.android.live.broadcast.gamedetail.block.reducer.C3070b;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.AudienceGameDetailInfoWidget;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.AudienceOrderGameInfoItemWidget;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.AudiencePlayGroupWidget;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.C3084e;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.C3085f;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.C3094w;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.OrderGameDetailInfoItemWidget;
import com.bytedance.android.live.broadcast.gamedetailv2.pageview.AbstractC3125c;
import com.bytedance.android.live.broadcast.gamedetailv2.widget.GameDetailCommentWidget;
import com.bytedance.android.live.broadcast.gamedetailv2.widget.GameDetailIntroItemWidget;
import com.bytedance.android.live.broadcast.gamedetailv2.widget.GameDetailLynxWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12636a;
import com.bytedance.ies.sve_core.AbstractC12641j;
import com.bytedance.ies.sve_list.RecyclerViewItemWidget;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.L6H;
import p003X.L6Z;
import p003X.L7U;
import p003X.LAB;

/* loaded from: classes5.dex */
public final class GameDetailItemFunctionKt$gameDetailItemFactory$1 extends Lambda implements Function2<Integer, LAB<AbstractC3125c, ?>, RecyclerViewItemWidget<? extends AbstractC3125c>> {
    public static final GameDetailItemFunctionKt$gameDetailItemFactory$1 INSTANCE = new GameDetailItemFunctionKt$gameDetailItemFactory$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16249);
    }

    public GameDetailItemFunctionKt$gameDetailItemFactory$1() {
        super(2);
    }

    /* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.func.GameDetailItemFunctionKt$gameDetailItemFactory$1$1 */
    /* loaded from: classes5.dex */
    public static final class C30631 extends Lambda implements Function1<RecyclerViewItemWidget<C3053d>, Object> {
        public static final C30631 INSTANCE = new C30631();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(16250);
        }

        public C30631() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(RecyclerViewItemWidget<C3053d> recyclerViewItemWidget) {
            RecyclerViewItemWidget<C3053d> recyclerViewItemWidget2 = recyclerViewItemWidget;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{recyclerViewItemWidget2}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            C106862S5w.LIZ(recyclerViewItemWidget2);
            return recyclerViewItemWidget2.LIZ(L6Z.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, C30641.INSTANCE);
        }

        /* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.func.GameDetailItemFunctionKt$gameDetailItemFactory$1$1$1 */
        /* loaded from: classes5.dex */
        public static final class C30641 extends Lambda implements Function2<C3070b, C3053d, C3053d> {
            public static final C30641 INSTANCE = new C30641();
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(16251);
            }

            public C30641() {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [com.bytedance.android.live.broadcast.gamedetail.block.d, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v11, types: [com.bytedance.android.live.broadcast.gamedetail.block.d, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9, types: [com.bytedance.android.live.broadcast.gamedetail.block.d, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C3053d invoke(C3070b c3070b, C3053d c3053d) {
                int i;
                C3070b c3070b2 = c3070b;
                C3053d c3053d2 = c3053d;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3070b2, c3053d2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3070b2);
                if (c3070b2.LIZLLL != 3) {
                    i = 1;
                } else {
                    i = 2;
                }
                if (c3053d2 == null) {
                    return null;
                }
                String str = c3070b2.LIZIZ;
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c3053d2, null, null, Integer.valueOf(i), str, 3, null}, null, C3053d.LIZ, true, 3);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                String str2 = c3053d2.LIZIZ;
                List<C3052c> list = c3053d2.LIZJ;
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{str2, list, Integer.valueOf(i), str}, c3053d2, C3053d.LIZ, false, 2);
                if (proxy3.isSupported) {
                    return proxy3.result;
                }
                C106862S5w.LIZ(str2, list, str);
                return new C3053d(str2, list, i, str);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.func.GameDetailItemFunctionKt$gameDetailItemFactory$1$2 */
    /* loaded from: classes5.dex */
    public static final class C30652 extends Lambda implements Function1<RecyclerViewItemWidget<C3094w>, Object> {
        public static final C30652 INSTANCE = new C30652();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(16252);
        }

        public C30652() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(RecyclerViewItemWidget<C3094w> recyclerViewItemWidget) {
            RecyclerViewItemWidget<C3094w> recyclerViewItemWidget2 = recyclerViewItemWidget;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{recyclerViewItemWidget2}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            C106862S5w.LIZ(recyclerViewItemWidget2);
            return recyclerViewItemWidget2.LIZ(L6Z.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, C30661.INSTANCE);
        }

        /* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.func.GameDetailItemFunctionKt$gameDetailItemFactory$1$2$1 */
        /* loaded from: classes5.dex */
        public static final class C30661 extends Lambda implements Function2<C3070b, C3094w, C3094w> {
            public static final C30661 INSTANCE = new C30661();
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(16253);
            }

            public C30661() {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.android.live.broadcast.gamedetail.block.widget.w, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v4, types: [com.bytedance.android.live.broadcast.gamedetail.block.widget.w, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v5, types: [com.bytedance.android.live.broadcast.gamedetail.block.widget.w, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C3094w invoke(C3070b c3070b, C3094w c3094w) {
                int i;
                C3070b c3070b2 = c3070b;
                C3094w c3094w2 = c3094w;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3070b2, c3094w2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3070b2);
                if (c3070b2.LIZLLL != 1) {
                    i = 1;
                } else {
                    i = 2;
                }
                if (c3094w2 == null) {
                    return null;
                }
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c3094w2, null, Integer.valueOf(i), null, null, null, null, null, Integer.valueOf((int) C1399n.f22430f), null}, null, C3094w.LIZ, true, 3);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                String str = c3094w2.LIZIZ;
                String str2 = c3094w2.LIZLLL;
                String str3 = c3094w2.f25874LJ;
                String str4 = c3094w2.LJFF;
                String str5 = c3094w2.LJI;
                List<String> list = c3094w2.LJII;
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), str2, str3, str4, str5, list}, c3094w2, C3094w.LIZ, false, 2);
                if (proxy3.isSupported) {
                    return proxy3.result;
                }
                C106862S5w.LIZ(str, str2, str3, str5);
                return new C3094w(str, i, str2, str3, str4, str5, list);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.func.GameDetailItemFunctionKt$gameDetailItemFactory$1$3 */
    /* loaded from: classes5.dex */
    public static final class C30673 extends Lambda implements Function1<RecyclerViewItemWidget<C3084e>, Object> {
        public static final C30673 INSTANCE = new C30673();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(16254);
        }

        public C30673() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(RecyclerViewItemWidget<C3084e> recyclerViewItemWidget) {
            RecyclerViewItemWidget<C3084e> recyclerViewItemWidget2 = recyclerViewItemWidget;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{recyclerViewItemWidget2}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            C106862S5w.LIZ(recyclerViewItemWidget2);
            return recyclerViewItemWidget2.LIZ(L6Z.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, C30681.INSTANCE);
        }

        /* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.func.GameDetailItemFunctionKt$gameDetailItemFactory$1$3$1 */
        /* loaded from: classes5.dex */
        public static final class C30681 extends Lambda implements Function2<C3070b, C3084e, C3084e> {
            public static final C30681 INSTANCE = new C30681();
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(16255);
            }

            public C30681() {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetail.block.widget.e] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetail.block.widget.e] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetail.block.widget.e] */
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ C3084e invoke(C3070b c3070b, C3084e c3084e) {
                int i;
                C3070b c3070b2 = c3070b;
                C3084e c3084e2 = c3084e;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3070b2, c3084e2}, this, changeQuickRedirect, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(c3070b2);
                if (c3070b2.LIZLLL != 1) {
                    i = 1;
                } else {
                    i = 2;
                }
                if (c3084e2 == null) {
                    return null;
                }
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c3084e2, null, Integer.valueOf(i), null, null, null, null, (byte) 0, null, 253, null}, null, C3084e.LIZ, true, 3);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                String str = c3084e2.LIZIZ;
                String str2 = c3084e2.LIZLLL;
                String str3 = c3084e2.f25869LJ;
                List<String> list = c3084e2.LJFF;
                Long l = c3084e2.LJI;
                boolean z = c3084e2.LJII;
                C2988e c2988e = c3084e2.LJIIIIZZ;
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), str2, str3, list, l, Byte.valueOf(z ? (byte) 1 : (byte) 0), c2988e}, c3084e2, C3084e.LIZ, false, 2);
                if (proxy3.isSupported) {
                    return proxy3.result;
                }
                C106862S5w.LIZ(str, str2, str3);
                return new C3084e(str, i, str2, str3, list, l, z, c2988e);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.func.GameDetailItemFunctionKt$gameDetailItemFactory$1$4 */
    /* loaded from: classes5.dex */
    public static final class C30694 extends Lambda implements Function1<RecyclerViewItemWidget<C3085f>, Object> {
        public static final C30694 INSTANCE = new C30694();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(16256);
        }

        public C30694() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(RecyclerViewItemWidget<C3085f> recyclerViewItemWidget) {
            RecyclerViewItemWidget<C3085f> recyclerViewItemWidget2 = recyclerViewItemWidget;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{recyclerViewItemWidget2}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            C106862S5w.LIZ(recyclerViewItemWidget2);
            Context context = recyclerViewItemWidget2.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            return L7U.LIZ(recyclerViewItemWidget2, new L6H(context, recyclerViewItemWidget2.LJIILL()), (Function1) null, 2, (Object) null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, com.bytedance.ies.sve_list.RecyclerViewItemWidget<? extends com.bytedance.android.live.broadcast.gamedetailv2.pageview.c>] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ RecyclerViewItemWidget<? extends AbstractC3125c> invoke(Integer num, LAB<AbstractC3125c, ?> lab) {
        int intValue = num.intValue();
        LAB<AbstractC3125c, ?> lab2 = lab;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), lab2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(lab2);
        switch (intValue) {
            case 0:
                return new GameDetailIntroItemWidget(lab2);
            case 1:
                return new GameDetailLynxWidget(lab2);
            case 2:
                return new GameDetailCommentWidget(lab2);
            case 3:
                return new GameTabWidget(lab2, C30631.INSTANCE);
            case 4:
                return new OrderGameDetailInfoItemWidget(lab2, C30652.INSTANCE);
            case 5:
                return new AudienceGameDetailInfoWidget(lab2, C30673.INSTANCE);
            case 6:
                return new AudienceOrderGameInfoItemWidget(lab2);
            case 7:
                return new AudiencePlayGroupWidget(lab2, C30694.INSTANCE);
            default:
                throw new IllegalArgumentException();
        }
    }
}
