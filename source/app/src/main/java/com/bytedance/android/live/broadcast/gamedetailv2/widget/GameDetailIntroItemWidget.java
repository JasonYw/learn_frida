package com.bytedance.android.live.broadcast.gamedetailv2.widget;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.C3261w;
import com.bytedance.android.live.broadcast.gamedetail.C3096j;
import com.bytedance.android.live.broadcast.gamedetail.C3097n;
import com.bytedance.android.live.broadcast.gamedetail.VideoRotation;
import com.bytedance.android.live.broadcast.gamedetailv2.pageview.AbstractC3125c;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.chatroom.p518ui.ExpandableTextView;
import com.bytedance.android.livesdk.config.C6824ag;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.widget.FlowLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt___MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C89045L6p;
import p003X.C89276LFm;
import p003X.IQV;
import p003X.L3N;
import p003X.L3Q;
import p003X.L3S;
import p003X.L7U;
import p003X.L90;
import p003X.L99;
import p003X.L9O;
import p003X.L9P;
import p003X.LAB;

/* loaded from: classes5.dex */
public final class GameDetailIntroItemWidget extends BaseGameDetailWidget<C3140c> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final C89045L6p LIZIZ;
    public final C89276LFm LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public final Rect f25900LJ;
    public final L90 LJFF;
    public final Lazy LJI;
    public final L99 LJII;
    public final Lazy LJIIJJI;
    public final Lazy LJIIL;
    public final Lazy LJIILIIL;
    public VideoRotation LJIILL;
    public final List<C3096j> LJIILLIIL;
    public final Lazy LJIIZILJ;
    public final Lazy LJIJ;
    public final Lazy LJIJI;
    public final Lazy LJIJJ;

    static {
        Covode.recordClassIndex(16744);
    }

    private final FlowLayout LJIJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (FlowLayout) (proxy.isSupported ? proxy.result : this.LJIIL.mo27335getValue());
    }

    private final RecyclerView LJIJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (RecyclerView) (proxy.isSupported ? proxy.result : this.LJIIZILJ.mo27335getValue());
    }

    public final ExpandableTextView LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (ExpandableTextView) (proxy.isSupported ? proxy.result : this.LJIIJJI.mo27335getValue());
    }

    public final RecyclerView LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (RecyclerView) (proxy.isSupported ? proxy.result : this.LJIILIIL.mo27335getValue());
    }

    public final ConstraintLayout LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (ConstraintLayout) (proxy.isSupported ? proxy.result : this.LJIJ.mo27335getValue());
    }

    public final View LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return (View) (proxy.isSupported ? proxy.result : this.LJIJI.mo27335getValue());
    }

    public final RecyclerView LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return (RecyclerView) (proxy.isSupported ? proxy.result : this.LJIJJ.mo27335getValue());
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699273;
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, com.bytedance.ies.sve_list.RecyclerViewItemWidget, com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 24).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        super.onPause();
        this.LIZJ.LIZJ();
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        super.onResume();
        this.LIZJ.LIZIZ();
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, com.bytedance.ies.sve_list.RecyclerViewItemWidget, com.bytedance.ies.sve_core.PureWidget
    /* renamed from: r_ */
    public final void mo14489r_() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        super.mo14489r_();
        this.LIZJ.LIZ();
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, com.bytedance.ies.sve_list.RecyclerViewItemWidget, com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        super.LIZLLL();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            LJFF().setAdapter(this.LIZJ);
            RecyclerView LJFF = LJFF();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.context);
            linearLayoutManager.setOrientation(0);
            LJFF.setLayoutManager(linearLayoutManager);
            LJFF().setTag("HorizontalListView");
            LIZJ().setNeedFoldedAfterUnFolded(false);
            LJIJJ().setAdapter(this.LJFF);
            RecyclerView LJIJJ = LJIJJ();
            LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this.context);
            linearLayoutManager2.setOrientation(0);
            LJIJJ.setLayoutManager(linearLayoutManager2);
            LJIIIIZZ().setAdapter(this.LJII);
            RecyclerView LJIIIIZZ = LJIIIIZZ();
            LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(this.context);
            linearLayoutManager3.setOrientation(0);
            LJIIIIZZ.setLayoutManager(linearLayoutManager3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, p003X.LAL
    public void LIZ(C3140c c3140c) {
        if (PatchProxy.proxy(new Object[]{c3140c}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3140c);
        super.LIZ((GameDetailIntroItemWidget) c3140c);
        L7U.LIZ(this, c3140c, GameDetailIntroItemWidget$onUpdate$1.INSTANCE, null, new GameDetailIntroItemWidget$onUpdate$2(this), 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailIntroItemWidget(LAB<AbstractC3125c, ?> lab) {
        super(lab, null, 2);
        C106862S5w.LIZ(lab);
        C13491f LIZ2 = IQV.LIZ(C89045L6p.class);
        this.LIZIZ = (C89045L6p) (!(LIZ2 instanceof C89045L6p) ? null : LIZ2);
        this.LIZJ = new C89276LFm(null, true, 1);
        this.LJIIJJI = LazyKt__LazyJVMKt.lazy(new GameDetailIntroItemWidget$introTxtView$2(this));
        this.LJIIL = LazyKt__LazyJVMKt.lazy(new GameDetailIntroItemWidget$flowLayout$2(this));
        this.LJIILIIL = LazyKt__LazyJVMKt.lazy(new GameDetailIntroItemWidget$rvIntroMedia$2(this));
        this.LJIILLIIL = new ArrayList();
        this.f25900LJ = new Rect();
        this.LJFF = new L90(null, 1);
        this.LJIIZILJ = LazyKt__LazyJVMKt.lazy(new GameDetailIntroItemWidget$rvAssessVideo$2(this));
        this.LJIJ = LazyKt__LazyJVMKt.lazy(new GameDetailIntroItemWidget$clGameAssess$2(this));
        this.LJIJI = LazyKt__LazyJVMKt.lazy(new GameDetailIntroItemWidget$vDivide$2(this));
        this.LJI = LazyKt__LazyJVMKt.lazy(new GameDetailIntroItemWidget$tvAssessTitle$2(this));
        this.LJII = new L99(null, 1);
        this.LJIJJ = LazyKt__LazyJVMKt.lazy(new GameDetailIntroItemWidget$rvAwardVideo$2(this));
    }

    public final void LIZ(C3243u c3243u) {
        boolean z;
        ArrayList<C3097n> arrayList;
        ArrayList<C3097n> arrayList2;
        C3097n c3097n;
        int i;
        List list;
        VideoRotation videoRotation;
        VideoRotation videoRotation2;
        C3261w c3261w;
        if (PatchProxy.proxy(new Object[]{c3243u}, this, LIZ, false, 16).isSupported) {
            return;
        }
        this.LJIILLIIL.clear();
        this.LJIILL = null;
        ArrayList arrayList3 = new ArrayList();
        Map<String, String> map = c3243u.LJIIJJI;
        if (map != null && (list = MapsKt___MapsKt.toList(map)) != null && (!list.isEmpty())) {
            for (Pair pair : CollectionsKt___CollectionsKt.sortedWith(list, new Comparator<T>() { // from class: X.1ah
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(16745);
                }

                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{t, t2}, this, LIZ, false, 1);
                    if (proxy.isSupported) {
                        return ((Integer) proxy.result).intValue();
                    }
                    return ComparisonsKt__ComparisonsKt.compareValues((String) ((Pair) t).getFirst(), (String) ((Pair) t2).getFirst());
                }
            })) {
                Object component1 = pair.component1();
                String str = (String) pair.component2();
                C3261w c3261w2 = new C3261w();
                Map<String, C3261w> map2 = c3243u.LJJI;
                if (map2 != null && (c3261w = map2.get(component1)) != null) {
                    c3261w2 = c3261w;
                }
                c3261w2.LIZ(str);
                if (this.LJIILL == null) {
                    if (TextUtils.equals(c3261w2.LIZJ, "0")) {
                        videoRotation2 = VideoRotation.Vertical;
                    } else {
                        videoRotation2 = VideoRotation.Horizontal;
                    }
                    this.LJIILL = videoRotation2;
                }
                if (TextUtils.equals(c3261w2.LIZJ, "0")) {
                    videoRotation = VideoRotation.Vertical;
                } else {
                    videoRotation = VideoRotation.Horizontal;
                }
                arrayList3.add(new C3096j(str, 1, videoRotation, false, 8));
            }
        }
        VideoRotation videoRotation3 = this.LJIILL;
        if (!PatchProxy.proxy(new Object[]{c3243u, videoRotation3}, this, LIZ, false, 19).isSupported) {
            SettingKey<C6824ag> settingKey = LiveSettingKeys.LIVE_COOPERATION_PARTNER_DETAIL_MEDIA_CONFIG;
            String str2 = "";
            Intrinsics.checkNotNullExpressionValue(settingKey, str2);
            if (settingKey.getValue().LIZIZ && (arrayList = c3243u.LJJIII) != null && (!arrayList.isEmpty()) && (arrayList2 = c3243u.LJJIII) != null && (c3097n = arrayList2.get(0)) != null) {
                L9P l9p = VideoRotation.Companion;
                Integer num = c3097n.LIZJ;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 1;
                }
                VideoRotation LIZ2 = l9p.LIZ(i);
                if (videoRotation3 == null || LIZ2 == videoRotation3) {
                    String str3 = c3097n.LIZIZ;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    if (LIZ2 == null) {
                        LIZ2 = VideoRotation.Horizontal;
                    }
                    this.LJIILLIIL.add(new C3096j(str2, 2, LIZ2, false, 8));
                }
                z = false;
                this.LIZLLL = z;
            }
            if (!this.LJIILLIIL.isEmpty()) {
                z = true;
                this.LIZLLL = z;
            }
            z = false;
            this.LIZLLL = z;
        }
        this.LJIILLIIL.addAll(arrayList3);
        if (!this.LJIILLIIL.isEmpty()) {
            this.LIZJ.LIZ(this.LJIILLIIL, c3243u);
            if (this.LIZLLL) {
                RecyclerView LJFF = LJFF();
                GameDetailIntroItemWidget$updateMediaUrls$3 gameDetailIntroItemWidget$updateMediaUrls$3 = new GameDetailIntroItemWidget$updateMediaUrls$3(this);
                if (!PatchProxy.proxy(new Object[]{LJFF, gameDetailIntroItemWidget$updateMediaUrls$3}, this, LIZ, false, 17).isSupported) {
                    Integer valueOf = Integer.valueOf(LJFF.getMeasuredHeight());
                    if (valueOf.intValue() > 0 && valueOf != null) {
                        gameDetailIntroItemWidget$updateMediaUrls$3.invoke(Integer.valueOf(valueOf.intValue()));
                        return;
                    }
                    LJFF.addOnLayoutChangeListener(new L9O(LJFF, gameDetailIntroItemWidget$updateMediaUrls$3));
                    LJFF.requestLayout();
                }
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget
    public final /* synthetic */ void LIZ(boolean z, C3140c c3140c) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3140c}, this, LIZ, false, 23).isSupported) {
            C106862S5w.LIZ(c3140c);
            if (!z) {
                this.LIZJ.LIZJ();
            } else {
                this.LIZJ.LIZIZ();
            }
        }
    }

    public final void LIZ(boolean z, C3243u c3243u) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3243u}, this, LIZ, false, 13).isSupported) {
            return;
        }
        if (z) {
            Long l = c3243u.LIZIZ;
            if (l != null && ((int) l.longValue()) == 3) {
                LJFF().setVisibility(8);
                return;
            }
            LJFF().setVisibility(0);
            LIZ(c3243u);
            return;
        }
        LJFF().setVisibility(0);
        LIZ(c3243u);
    }

    public final void LIZIZ(boolean z, C3243u c3243u) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3243u}, this, LIZ, false, 15).isSupported) {
            return;
        }
        LJIJI().setVisibility(0);
        LJIJI().removeAllViews();
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        L3Q l3q = new L3Q(context, c3243u.LJI, Float.valueOf(12.0f), 2131628620);
        LJIJI().addView(l3q);
        C89045L6p c89045L6p = this.LIZIZ;
        if (c89045L6p != null && c89045L6p.LIZLLL == 2) {
            if (!c3243u.LJJIJIIJI) {
                l3q.LIZ();
                return;
            }
        } else if (!z) {
            l3q.LIZ();
            return;
        }
        FlowLayout LJIJI = LJIJI();
        Context context2 = this.context;
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LJIJI.addView(new L3Q(context2, c3243u.LJIILJJIL, Float.valueOf(12.0f), 2131628620));
        FlowLayout LJIJI2 = LJIJI();
        Context context3 = this.context;
        Intrinsics.checkNotNullExpressionValue(context3, "");
        LJIJI2.addView(new L3N(context3, c3243u.LJIIZILJ, Float.valueOf(12.0f), 2131628620));
        FlowLayout LJIJI3 = LJIJI();
        Context context4 = this.context;
        Intrinsics.checkNotNullExpressionValue(context4, "");
        LJIJI3.addView(new L3S(context4, c3243u.LJIILLIIL, Float.valueOf(12.0f), 2131628620));
    }
}
