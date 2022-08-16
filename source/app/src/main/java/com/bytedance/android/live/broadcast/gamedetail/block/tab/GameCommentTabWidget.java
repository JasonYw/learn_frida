package com.bytedance.android.live.broadcast.gamedetail.block.tab;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.comment.data.AudienceGamePromoteCommentApi;
import com.bytedance.android.live.broadcast.comment.data.C2985a;
import com.bytedance.android.live.broadcast.comment.data.C2986b;
import com.bytedance.android.live.broadcast.comment.data.C2990g;
import com.bytedance.android.live.broadcast.gamedetailv2.view.NestedChildRecyclerView;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12636a;
import com.bytedance.ies.sve_core.AbstractC12641j;
import com.bytedance.ies.sve_core.AbstractC12642p;
import com.bytedance.live.datacontext.C13491f;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.C89032L6c;
import p003X.C89045L6p;
import p003X.IQV;
import p003X.L46;
import p003X.L4U;
import p003X.L58;
import p003X.L59;
import p003X.L5C;
import p003X.L5G;
import p003X.L5I;
import p003X.L5K;
import p003X.L5Y;
import p003X.LK5;
import p003X.QB4;

/* loaded from: classes5.dex */
public final class GameCommentTabWidget extends BaseGameDetailTabWidget<C3073a> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZJ;
    public final C2990g LIZLLL;

    /* renamed from: LJ */
    public NestedChildRecyclerView f25855LJ;
    public L4U LJFF;
    public C3243u LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public long LJIIL;
    public String LJIILIIL;
    public final C89045L6p LJIILLIIL;
    public final CompositeDisposable LJIIZILJ;
    public final int LJIJ;
    public boolean LJIJI;

    static {
        Covode.recordClassIndex(16284);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699245;
    }

    @Override // com.bytedance.android.live.broadcast.gamedetail.block.tab.BaseGameDetailTabWidget, com.bytedance.ies.viewpager.PagerItemWidget, com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZJ, false, 10).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.AbstractC3123l
    public final NestedChildRecyclerView LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 4);
        if (proxy.isSupported) {
            return (NestedChildRecyclerView) proxy.result;
        }
        View view = this.contentView;
        if (view != null) {
            return (NestedChildRecyclerView) view.findViewById(2131183783);
        }
        return null;
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    /* renamed from: r_ */
    public final void mo14489r_() {
        String str;
        C2WC<String> LJFF;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 2).isSupported) {
            return;
        }
        super.mo14489r_();
        C89045L6p c89045L6p = this.LJIILLIIL;
        if (c89045L6p != null && (LJFF = c89045L6p.LJFF()) != null) {
            str = LJFF.LIZ();
        } else {
            str = null;
        }
        if (Intrinsics.areEqual(str, "tab_comment")) {
            L46.LIZIZ.LIZ(System.currentTimeMillis() - this.LJIIL);
        }
        this.LJIIZILJ.dispose();
    }

    public GameCommentTabWidget() {
        C2WC<String> LJFF;
        C13491f LIZ = IQV.LIZ(C89045L6p.class);
        String str = null;
        this.LJIILLIIL = (C89045L6p) (!(LIZ instanceof C89045L6p) ? null : LIZ);
        C13491f LIZ2 = IQV.LIZ(C2990g.class);
        this.LIZLLL = (C2990g) (!(LIZ2 instanceof C2990g) ? null : LIZ2);
        this.LJIIZILJ = new CompositeDisposable();
        this.LJIJ = 10;
        this.LJIIIIZZ = true;
        C89045L6p c89045L6p = this.LJIILLIIL;
        if (c89045L6p != null && (LJFF = c89045L6p.LJFF()) != null) {
            str = LJFF.LIZ();
        }
        this.LJIILIIL = str;
        this.LJIJI = true;
    }

    @Override // com.bytedance.ies.viewpager.PagerItemWidget
    public final void LJII() {
        String str;
        C3243u c3243u;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 5).isSupported) {
            return;
        }
        this.LJIIL = System.currentTimeMillis();
        LIZJ(new L5K("tab_comment"));
        L46.LIZIZ.LIZ();
        if (this.LJIJI) {
            C2990g c2990g = this.LIZLLL;
            C3243u c3243u2 = null;
            if (c2990g != null) {
                C3073a c3073a = (C3073a) LJIIZILJ();
                if (c3073a != null && (c3243u = c3073a.LIZIZ) != null) {
                    str = c3243u.LIZJ;
                } else {
                    str = null;
                }
                c2990g.LJFF = str;
            }
            C2990g c2990g2 = this.LIZLLL;
            if (c2990g2 != null) {
                C3073a c3073a2 = (C3073a) LJIIZILJ();
                if (c3073a2 != null) {
                    c3243u2 = c3073a2.LIZIZ;
                }
                c2990g2.f25812LJ = c3243u2;
            }
            if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 6).isSupported) {
                LIZ(this.LJIIJJI);
            }
            this.LJIJI = false;
        }
    }

    @Override // com.bytedance.android.live.broadcast.gamedetail.block.tab.BaseGameDetailTabWidget, com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        NestedChildRecyclerView nestedChildRecyclerView;
        ViewGroup.LayoutParams layoutParams;
        C2WC<String> LJFF;
        Observable<String> LIZIZ;
        Disposable subscribe;
        boolean z;
        C2WC<String> LIZ;
        Observable<String> LIZIZ2;
        Disposable subscribe2;
        C2WC<Boolean> LIZJ2;
        Boolean LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 1).isSupported) {
            return;
        }
        super.LIZLLL();
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 7).isSupported) {
            View view = this.contentView;
            if (view != null) {
                nestedChildRecyclerView = (NestedChildRecyclerView) view.findViewById(2131183783);
            } else {
                nestedChildRecyclerView = null;
            }
            this.f25855LJ = nestedChildRecyclerView;
            if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 8).isSupported) {
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.context);
                linearLayoutManager.setOrientation(1);
                NestedChildRecyclerView nestedChildRecyclerView2 = this.f25855LJ;
                if (nestedChildRecyclerView2 != null) {
                    nestedChildRecyclerView2.setLayoutManager(linearLayoutManager);
                }
                Context context = this.context;
                Intrinsics.checkNotNullExpressionValue(context, "");
                C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                if (LIZ3 != null && (LIZJ2 = LIZ3.LIZJ()) != null && (LIZ2 = LIZJ2.LIZ()) != null) {
                    z = LIZ2.booleanValue();
                } else {
                    z = true;
                }
                this.LJFF = new L4U(context, z, new ArrayList(), Boolean.FALSE, "comment_page");
                L4U l4u = this.LJFF;
                if (l4u != null) {
                    l4u.LIZLLL = this.LIZLLL;
                }
                NestedChildRecyclerView nestedChildRecyclerView3 = this.f25855LJ;
                if (nestedChildRecyclerView3 != null) {
                    nestedChildRecyclerView3.setAdapter(this.LJFF);
                }
                NestedChildRecyclerView nestedChildRecyclerView4 = this.f25855LJ;
                if (nestedChildRecyclerView4 != null) {
                    nestedChildRecyclerView4.addItemDecoration(new L5Y());
                }
                NestedChildRecyclerView nestedChildRecyclerView5 = this.f25855LJ;
                if (nestedChildRecyclerView5 != null) {
                    nestedChildRecyclerView5.addOnScrollListener(new L5C(this));
                }
                L4U l4u2 = this.LJFF;
                if (l4u2 != null) {
                    l4u2.LIZ(new GameCommentTabWidget$initRecyclerView$2(this));
                }
                L4U l4u3 = this.LJFF;
                if (l4u3 != null) {
                    l4u3.LIZJ(new GameCommentTabWidget$initRecyclerView$3(this));
                }
                L4U l4u4 = this.LJFF;
                if (l4u4 != null) {
                    l4u4.LIZIZ(new GameCommentTabWidget$initRecyclerView$4(this));
                }
                L4U l4u5 = this.LJFF;
                if (l4u5 != null) {
                    l4u5.LIZ(new GameCommentTabWidget$initRecyclerView$5(this));
                }
                C2990g c2990g = this.LIZLLL;
                if (c2990g != null && (LIZ = c2990g.LIZ()) != null && (LIZIZ2 = LIZ.LIZIZ()) != null && (subscribe2 = LIZIZ2.subscribe(new L5G(this))) != null) {
                    QB4.LIZ(subscribe2, this.LJIIZILJ);
                }
            }
            View view2 = this.contentView;
            if (view2 != null) {
                layoutParams = view2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                layoutParams = null;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.bottomMargin = LK5.LIZ(75.0f);
                View view3 = this.contentView;
                if (view3 != null) {
                    view3.setLayoutParams(layoutParams2);
                }
            }
            C89045L6p c89045L6p = this.LJIILLIIL;
            if (c89045L6p != null && (LJFF = c89045L6p.LJFF()) != null && (LIZIZ = LJFF.LIZIZ()) != null && (subscribe = LIZIZ.subscribe(new L5I(this))) != null) {
                QB4.LIZ(subscribe, this.LJIIZILJ);
            }
        }
        LJFF();
        LIZ(C89032L6c.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, GameCommentTabWidget$onMount$1.INSTANCE);
    }

    @Override // p003X.LAL
    public final /* synthetic */ void LIZ(AbstractC12642p abstractC12642p) {
        if (!PatchProxy.proxy(new Object[]{abstractC12642p}, this, LIZJ, false, 3).isSupported) {
            C106862S5w.LIZ(abstractC12642p);
        }
    }

    public final void LIZ(int i) {
        ArrayList<C2985a> arrayList;
        String str;
        Observable<C5176i<C2986b>> observeOn;
        Disposable subscribe;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZJ, false, 9).isSupported) {
            return;
        }
        if (!this.LJIIIIZZ) {
            C88440Kt0.LIZ(LK5.LIZ(2131583536));
        } else if (this.LJIIIZ) {
        } else {
            this.LJIIIZ = true;
            ArrayList arrayList2 = new ArrayList();
            if (this.LJII == 0) {
                LJFF();
            } else {
                L4U l4u = this.LJFF;
                if (l4u != null && (arrayList = l4u.LJIIL) != null) {
                    arrayList2.addAll(arrayList);
                }
            }
            AudienceGamePromoteCommentApi audienceGamePromoteCommentApi = (AudienceGamePromoteCommentApi) C88306Kqq.LIZ().LIZ(AudienceGamePromoteCommentApi.class);
            C2990g c2990g = this.LIZLLL;
            if (c2990g != null) {
                str = c2990g.LJFF;
            } else {
                str = null;
            }
            Observable<C5176i<C2986b>> commentDetailList = audienceGamePromoteCommentApi.getCommentDetailList(str, i, this.LJIJ, this.LJII);
            if (commentDetailList != null && (observeOn = commentDetailList.observeOn(AndroidSchedulers.mainThread())) != null && (subscribe = observeOn.subscribe(new L58(this, arrayList2, i), new L59(this, arrayList2))) != null) {
                QB4.LIZ(subscribe, this.LJIIZILJ);
            }
        }
    }
}
