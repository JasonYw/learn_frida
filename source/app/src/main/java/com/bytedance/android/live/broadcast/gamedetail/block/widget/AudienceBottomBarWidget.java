package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.comment.data.C2988e;
import com.bytedance.android.live.broadcast.comment.data.C2989f;
import com.bytedance.android.live.broadcast.comment.data.C2990g;
import com.bytedance.android.live.broadcast.download.C3002c;
import com.bytedance.android.live.broadcast.gamedetail.order.C3100d;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3119b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12636a;
import com.bytedance.ies.sve_core.AbstractC12641j;
import com.bytedance.ies.sve_core.AbstractC12642p;
import com.bytedance.ies.sve_core.PureWidget;
import com.bytedance.live.datacontext.C13491f;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C88962L3k;
import p003X.C89021L5r;
import p003X.C89030L6a;
import p003X.C89032L6c;
import p003X.C89055L6z;
import p003X.C89119L9l;
import p003X.C89235LDx;
import p003X.IQV;
import p003X.L6W;
import p003X.L7U;
import p003X.LAC;
import p003X.LE4;
import p003X.LHU;

/* loaded from: classes5.dex */
public final class AudienceBottomBarWidget extends PureWidget<C3083c> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public C89119L9l LIZIZ;
    public C88962L3k LIZJ;
    public PureWidget<?> LIZLLL;

    /* renamed from: LJ */
    public final FragmentManager f25861LJ;
    public C3002c LJFF;

    static {
        Covode.recordClassIndex(16316);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698326;
    }

    @Override // com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    /* renamed from: r_ */
    public final void mo14489r_() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.mo14489r_();
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        C88962L3k c88962L3k;
        MethodCollector.m14708i(1267);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1267);
            return;
        }
        super.LIZLLL();
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.LIZIZ = new C89119L9l(context, null, 0, 6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        C89119L9l c89119L9l = this.LIZIZ;
        if (c89119L9l != null) {
            c89119L9l.setLayoutParams(layoutParams);
        }
        View view = this.contentView;
        if (!(view instanceof FrameLayout)) {
            view = null;
        }
        FrameLayout frameLayout = (FrameLayout) view;
        if (frameLayout != null) {
            frameLayout.addView(this.LIZIZ);
        }
        Context context2 = this.context;
        Intrinsics.checkNotNull(context2);
        this.LIZJ = new C88962L3k(context2, null, 0, 6);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        C88962L3k c88962L3k2 = this.LIZJ;
        if (c88962L3k2 != null) {
            c88962L3k2.setLayoutParams(layoutParams2);
        }
        C13491f LIZ2 = IQV.LIZ(C2990g.class);
        if (!(LIZ2 instanceof C2990g)) {
            LIZ2 = null;
        }
        C2990g c2990g = (C2990g) LIZ2;
        if (c2990g != null && (c88962L3k = this.LIZJ) != null) {
            c88962L3k.LIZ(c2990g);
        }
        C88962L3k c88962L3k3 = this.LIZJ;
        if (c88962L3k3 != null) {
            c88962L3k3.LIZ(this.f25861LJ);
        }
        C88962L3k c88962L3k4 = this.LIZJ;
        if (c88962L3k4 != null) {
            c88962L3k4.LIZ("promote_detail");
        }
        View view2 = this.contentView;
        if (!(view2 instanceof FrameLayout)) {
            view2 = null;
        }
        FrameLayout frameLayout2 = (FrameLayout) view2;
        if (frameLayout2 != null) {
            frameLayout2.addView(this.LIZJ);
        }
        LAC<C3088n> LIZ3 = new GameBottomButtonWidget(false, 1).LIZ(this, 2131168169);
        Context context3 = this.context;
        Intrinsics.checkNotNullExpressionValue(context3, "");
        this.LIZLLL = LIZ3.LIZ(new C89055L6z(context3, LJIILL()), AudienceBottomBarWidget$onMount$2.INSTANCE).LIZ(C89030L6a.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, C89021L5r.LJIIIIZZ).LIZ(C89032L6c.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, L6W.LIZ).LJIIJ();
        MethodCollector.m14707o(1267);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceBottomBarWidget(FragmentManager fragmentManager) {
        super(null, 1);
        C106862S5w.LIZ(fragmentManager);
        this.f25861LJ = fragmentManager;
    }

    @Override // p003X.LAL
    public final /* synthetic */ void LIZ(AbstractC12642p abstractC12642p) {
        C3083c c3083c = (C3083c) abstractC12642p;
        if (!PatchProxy.proxy(new Object[]{c3083c}, this, LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(c3083c);
            L7U.LIZ(this, c3083c, AudienceBottomBarWidget$onUpdate$1.INSTANCE, null, new AudienceBottomBarWidget$onUpdate$2(this), 2, null);
            L7U.LIZ(this, c3083c, AudienceBottomBarWidget$onUpdate$3.INSTANCE, null, new AudienceBottomBarWidget$onUpdate$4(this), 2, null);
            L7U.LIZ(this, c3083c, AudienceBottomBarWidget$onUpdate$5.INSTANCE, null, new AudienceBottomBarWidget$onUpdate$6(this, c3083c), 2, null);
        }
    }

    public final void LIZ(C3119b c3119b, C3100d c3100d) {
        String str;
        List<String> list;
        String str2;
        Integer num;
        String str3;
        String str4;
        double d;
        String str5;
        Double d2;
        if (!PatchProxy.proxy(new Object[]{c3119b, c3100d}, this, LIZ, false, 4).isSupported && this.LJFF == null && c3100d != null) {
            C89235LDx c89235LDx = C89235LDx.LIZIZ;
            C3243u c3243u = c3119b.LIZIZ;
            if (c3243u != null) {
                str = c3243u.LIZJ;
            } else {
                str = null;
            }
            C3243u c3243u2 = c3119b.LIZIZ;
            if (c3243u2 != null) {
                list = c3243u2.LJIIIIZZ;
            } else {
                list = null;
            }
            String str6 = c3100d.f25876LJ;
            String str7 = c3100d.LJI;
            String str8 = c3100d.LJII;
            String str9 = c3100d.LJIIIIZZ;
            String str10 = c3100d.LJFF;
            String str11 = c3100d.LJIILIIL;
            C3243u c3243u3 = c3119b.LIZIZ;
            if (c3243u3 != null) {
                str2 = c3243u3.LJIJJLI;
            } else {
                str2 = null;
            }
            C89119L9l c89119L9l = this.LIZIZ;
            if (c89119L9l != null) {
                num = Integer.valueOf(c89119L9l.getViewToken());
            } else {
                num = null;
            }
            C3243u c3243u4 = c3119b.LIZIZ;
            if (c3243u4 != null) {
                str3 = c3243u4.LJIL;
            } else {
                str3 = null;
            }
            C3243u c3243u5 = c3119b.LIZIZ;
            if (c3243u5 != null) {
                str4 = c3243u5.LJJ;
            } else {
                str4 = null;
            }
            String str12 = str;
            List<String> list2 = list;
            this.LJFF = C89235LDx.LIZ(c89235LDx, str12, list2, false, str6, str7, str8, str9, str10, "promote_detail", str11, str2, num, str3, str4, Boolean.TRUE, null, c3100d.LJIILJJIL, c3100d.LJIILL, null, 294912, null);
            C89119L9l c89119L9l2 = this.LIZIZ;
            if (c89119L9l2 != null) {
                c89119L9l2.setDownloadInfo(this.LJFF);
            }
            Pair[] pairArr = new Pair[5];
            pairArr[0] = TuplesKt.m137to("detail_enter_from", c3100d.LIZJ);
            pairArr[1] = TuplesKt.m137to("detail_game_ad_type", c3100d.LIZLLL);
            pairArr[2] = TuplesKt.m137to("start_page", c3100d.LJIILIIL);
            LHU lhu = LHU.LIZIZ;
            C2988e c2988e = c3119b.LJII;
            if (c2988e != null) {
                d = c2988e.LIZ;
            } else {
                d = 0.0d;
            }
            pairArr[3] = TuplesKt.m137to("game_rating", String.valueOf(lhu.LIZ(d, 1)));
            pairArr[4] = TuplesKt.m137to("coupon_type", c3100d.LJIIL);
            Map<String, String> mutableMapOf = MapsKt__MapsKt.mutableMapOf(pairArr);
            if (!c3119b.LJIIIIZZ.isEmpty()) {
                C2989f c2989f = c3119b.LJIIIIZZ.get(0).f25808LJ;
                if (c2989f != null) {
                    d2 = Double.valueOf(c2989f.LIZLLL);
                } else {
                    d2 = null;
                }
                mutableMapOf.put("game_rating_from_comment", String.valueOf(d2));
            }
            if (c3119b.LJIJ) {
                str5 = "1";
            } else {
                str5 = "0";
            }
            mutableMapOf.put("is_task", str5);
            C89119L9l c89119L9l3 = this.LIZIZ;
            if (c89119L9l3 != null) {
                c89119L9l3.setExtraGameInfo(mutableMapOf);
            }
            LE4.LIZIZ.LIZ(this.context, this.LJFF, this.LIZIZ);
        }
    }
}
