package com.bytedance.android.live.broadcast.gamedetailv2.template;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.C3232q;
import com.bytedance.android.live.broadcast.C3233r;
import com.bytedance.android.live.broadcast.C3237s;
import com.bytedance.android.live.broadcast.C3242t;
import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.C3261w;
import com.bytedance.android.live.broadcast.gamedetail.C3096j;
import com.bytedance.android.live.broadcast.gamedetail.C3097n;
import com.bytedance.android.live.broadcast.gamedetail.VideoRotation;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.chatroom.p518ui.ExpandableTextView;
import com.bytedance.android.livesdk.config.C6824ag;
import com.bytedance.android.livesdk.config.C6835ar;
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
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.C106862S5w;
import p003X.C88965L3n;
import p003X.C88999L4v;
import p003X.C89045L6p;
import p003X.C89276LFm;
import p003X.IQV;
import p003X.L3N;
import p003X.L3Q;
import p003X.L3S;
import p003X.L7T;
import p003X.L90;
import p003X.L99;
import p003X.L9N;
import p003X.L9P;

/* loaded from: classes5.dex */
public final class e$a extends L7T<C3243u> {
    public static ChangeQuickRedirect LIZ;
    public final C89276LFm LIZLLL;

    /* renamed from: LJ */
    public RecyclerView f25892LJ;
    public boolean LJFF;
    public final Rect LJI;
    public final C89045L6p LJII;
    public final ExpandableTextView LJIIIIZZ;
    public final FlowLayout LJIIIZ;
    public VideoRotation LJIIJ;
    public final List<C3096j> LJIIJJI;
    public final L90 LJIIL;
    public final Lazy LJIILIIL;
    public final Lazy LJIILJJIL;
    public final Lazy LJIILL;
    public final Lazy LJIILLIIL;
    public final L99 LJIIZILJ;
    public final Lazy LJIJ;

    static {
        Covode.recordClassIndex(16710);
    }

    private final RecyclerView LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (RecyclerView) (proxy.isSupported ? proxy.result : this.LJIILIIL.mo27335getValue());
    }

    private final ConstraintLayout LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (ConstraintLayout) (proxy.isSupported ? proxy.result : this.LJIILJJIL.mo27335getValue());
    }

    private final View LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (View) (proxy.isSupported ? proxy.result : this.LJIILL.mo27335getValue());
    }

    /* renamed from: LJ */
    private final RecyclerView m15899LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (RecyclerView) (proxy.isSupported ? proxy.result : this.LJIJ.mo27335getValue());
    }

    @Override // p003X.L7T
    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        this.LIZLLL.LIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e$a(View view) {
        super(view);
        C106862S5w.LIZ(view);
        C13491f LIZ2 = IQV.LIZ(C89045L6p.class);
        this.LJII = (C89045L6p) (!(LIZ2 instanceof C89045L6p) ? null : LIZ2);
        this.LIZLLL = new C89276LFm(null, true, 1);
        View findViewById = view.findViewById(2131175915);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LJIIIIZZ = (ExpandableTextView) findViewById;
        View findViewById2 = view.findViewById(2131175199);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LJIIIZ = (FlowLayout) findViewById2;
        View findViewById3 = view.findViewById(2131175912);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.f25892LJ = (RecyclerView) findViewById3;
        this.LJIIJJI = new ArrayList();
        this.LJI = new Rect();
        this.LJIIL = new L90(null, 1);
        this.LJIILIIL = LazyKt__LazyJVMKt.lazy(new GameIntroTemplate$GameIntroViewHolder$rvAssessVideo$2(view));
        this.LJIILJJIL = LazyKt__LazyJVMKt.lazy(new GameIntroTemplate$GameIntroViewHolder$clGameAssess$2(view));
        this.LJIILL = LazyKt__LazyJVMKt.lazy(new GameIntroTemplate$GameIntroViewHolder$vDivide$2(view));
        this.LJIILLIIL = LazyKt__LazyJVMKt.lazy(new GameIntroTemplate$GameIntroViewHolder$tvAssessTitle$2(view));
        this.LJIIZILJ = new L99(null, 1);
        this.LJIJ = LazyKt__LazyJVMKt.lazy(new GameIntroTemplate$GameIntroViewHolder$rvAwardVideo$2(view));
        this.f25892LJ.setAdapter(this.LIZLLL);
        RecyclerView recyclerView = this.f25892LJ;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        this.f25892LJ.setTag("HorizontalListView");
        this.LJIIIIZZ.setNeedFoldedAfterUnFolded(false);
        LIZIZ().setAdapter(this.LJIIL);
        RecyclerView LIZIZ = LIZIZ();
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(view.getContext());
        linearLayoutManager2.setOrientation(0);
        LIZIZ.setLayoutManager(linearLayoutManager2);
        m15899LJ().setAdapter(this.LJIIZILJ);
        RecyclerView m15899LJ = m15899LJ();
        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(view.getContext());
        linearLayoutManager3.setOrientation(0);
        m15899LJ.setLayoutManager(linearLayoutManager3);
    }

    /* renamed from: LIZ  reason: avoid collision after fix types in other method */
    public final void LIZ2(C3243u c3243u) {
        boolean z;
        ArrayList<C3097n> arrayList;
        ArrayList<C3097n> arrayList2;
        C3097n c3097n;
        int i;
        List list;
        VideoRotation videoRotation;
        VideoRotation videoRotation2;
        C3261w c3261w;
        if (PatchProxy.proxy(new Object[]{c3243u}, this, LIZ, false, 11).isSupported) {
            return;
        }
        this.LJIIJJI.clear();
        this.LJIIJ = null;
        ArrayList arrayList3 = new ArrayList();
        Map<String, String> map = c3243u.LJIIJJI;
        if (map != null && (list = MapsKt___MapsKt.toList(map)) != null && (!list.isEmpty())) {
            for (Pair pair : CollectionsKt___CollectionsKt.sortedWith(list, new Comparator<T>() { // from class: X.1ag
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(16711);
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
                if (this.LJIIJ == null) {
                    if (TextUtils.equals(c3261w2.LIZJ, "0")) {
                        videoRotation2 = VideoRotation.Vertical;
                    } else {
                        videoRotation2 = VideoRotation.Horizontal;
                    }
                    this.LJIIJ = videoRotation2;
                }
                if (TextUtils.equals(c3261w2.LIZJ, "0")) {
                    videoRotation = VideoRotation.Vertical;
                } else {
                    videoRotation = VideoRotation.Horizontal;
                }
                arrayList3.add(new C3096j(str, 1, videoRotation, false, 8));
            }
        }
        VideoRotation videoRotation3 = this.LJIIJ;
        if (!PatchProxy.proxy(new Object[]{c3243u, videoRotation3}, this, LIZ, false, 14).isSupported) {
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
                    this.LJIIJJI.add(new C3096j(str2, 2, LIZ2, false, 8));
                }
                z = false;
                this.LJFF = z;
            }
            if (!this.LJIIJJI.isEmpty()) {
                z = true;
                this.LJFF = z;
            }
            z = false;
            this.LJFF = z;
        }
        this.LJIIJJI.addAll(arrayList3);
        if (!this.LJIIJJI.isEmpty()) {
            this.LIZLLL.LIZ(this.LJIIJJI, c3243u);
            if (this.LJFF) {
                RecyclerView recyclerView = this.f25892LJ;
                GameIntroTemplate$GameIntroViewHolder$updateMediaUrls$3 gameIntroTemplate$GameIntroViewHolder$updateMediaUrls$3 = new GameIntroTemplate$GameIntroViewHolder$updateMediaUrls$3(this);
                if (!PatchProxy.proxy(new Object[]{recyclerView, gameIntroTemplate$GameIntroViewHolder$updateMediaUrls$3}, this, LIZ, false, 12).isSupported) {
                    Integer valueOf = Integer.valueOf(recyclerView.getMeasuredHeight());
                    if (valueOf.intValue() > 0 && valueOf != null) {
                        gameIntroTemplate$GameIntroViewHolder$updateMediaUrls$3.invoke(Integer.valueOf(valueOf.intValue()));
                        return;
                    }
                    recyclerView.addOnLayoutChangeListener(new L9N(recyclerView, gameIntroTemplate$GameIntroViewHolder$updateMediaUrls$3));
                    recyclerView.requestLayout();
                }
            }
        }
    }

    @Override // p003X.L7T
    public final /* synthetic */ void LIZ(C3243u c3243u) {
        List<C3237s> list;
        C3233r c3233r;
        List<C3232q> list2;
        Object mo27335getValue;
        C3233r c3233r2;
        boolean z;
        C3243u c3243u2 = c3243u;
        if (!PatchProxy.proxy(new Object[]{c3243u2}, this, LIZ, false, 6).isSupported) {
            C106862S5w.LIZ(c3243u2);
            ExpandableTextView.LIZ(this.LJIIIIZZ, "", false, false, 4, null);
            String str = c3243u2.LJIIL;
            String str2 = null;
            if ((!StringsKt__StringsJVMKt.isBlank(str)) && str != null) {
                this.LJIIIIZZ.setOnExpandClickListener(new C3127x96ac7566(this, c3243u2));
                ExpandableTextView expandableTextView = this.LJIIIIZZ;
                C89045L6p c89045L6p = this.LJII;
                if (c89045L6p != null) {
                    z = c89045L6p.LJJI;
                } else {
                    z = false;
                }
                expandableTextView.LIZ(str, false, z);
            }
            Long l = c3243u2.LJJIIJ;
            if (l != null && l.longValue() == 1) {
                LIZIZ(false, c3243u2);
            } else {
                LIZIZ(true, c3243u2);
            }
            if (C88999L4v.LIZIZ.LIZ()) {
                SettingKey<C6835ar> settingKey = LiveSettingKeys.LIVE_GAME_PROMOTE_DETAIL_VIDEO_SCENE_CONFIG;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                if (!settingKey.getValue().LIZIZ) {
                    LIZ2(false, c3243u2);
                }
                LIZ2(true, c3243u2);
            } else {
                SettingKey<Integer> settingKey2 = LiveSettingKeys.LIVE_GAME_PROMOTE_DETAIL_STYLE_CONFIG;
                Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                Integer value = settingKey2.getValue();
                if (value != null && value.intValue() == 1) {
                    LIZ2(false, c3243u2);
                }
                LIZ2(true, c3243u2);
            }
            if (!PatchProxy.proxy(new Object[]{c3243u2}, this, LIZ, false, 7).isSupported) {
                C3242t c3242t = c3243u2.LJJIIZI;
                if (c3242t != null && (c3233r = c3242t.LIZJ) != null && (list2 = c3233r.LIZIZ) != null && (!list2.isEmpty())) {
                    LIZJ().setVisibility(0);
                    LIZLLL().setVisibility(0);
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
                    if (proxy.isSupported) {
                        mo27335getValue = proxy.result;
                    } else {
                        mo27335getValue = this.LJIILLIIL.mo27335getValue();
                    }
                    TextView textView = (TextView) mo27335getValue;
                    C3242t c3242t2 = c3243u2.LJJIIZI;
                    if (c3242t2 != null && (c3233r2 = c3242t2.LIZJ) != null) {
                        str2 = c3233r2.LIZ;
                    }
                    textView.setText(str2);
                    this.LJIIL.LIZ(list2);
                } else {
                    LIZJ().setVisibility(8);
                    LIZLLL().setVisibility(8);
                    this.LJIIL.LIZ(new ArrayList());
                }
            }
            if (!PatchProxy.proxy(new Object[]{c3243u2}, this, LIZ, false, 8).isSupported) {
                C3242t c3242t3 = c3243u2.LJJIIZI;
                if (c3242t3 != null && (list = c3242t3.LIZIZ) != null && (!list.isEmpty())) {
                    m15899LJ().setVisibility(0);
                    this.LJIIZILJ.LIZ(list);
                    return;
                }
                m15899LJ().setVisibility(8);
                this.LJIIZILJ.LIZ(new ArrayList());
            }
        }
    }

    /* renamed from: LIZ  reason: avoid collision after fix types in other method */
    private final void LIZ2(boolean z, C3243u c3243u) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3243u}, this, LIZ, false, 9).isSupported) {
            return;
        }
        if (z) {
            if (C88965L3n.LIZ(c3243u.LJIJJ)) {
                this.f25892LJ.setVisibility(8);
                return;
            }
            this.f25892LJ.setVisibility(0);
            LIZ2(c3243u);
            return;
        }
        this.f25892LJ.setVisibility(0);
        LIZ2(c3243u);
    }

    @Override // p003X.L7T
    public final /* synthetic */ void LIZ(boolean z, C3243u c3243u) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3243u}, this, LIZ, false, 16).isSupported) {
            C106862S5w.LIZ(c3243u);
            if (!z) {
                this.LIZLLL.LIZJ();
            } else {
                this.LIZLLL.LIZIZ();
            }
        }
    }

    private final void LIZIZ(boolean z, C3243u c3243u) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3243u}, this, LIZ, false, 10).isSupported) {
            return;
        }
        this.LJIIIZ.setVisibility(0);
        this.LJIIIZ.removeAllViews();
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        L3Q l3q = new L3Q(context, c3243u.LJI, Float.valueOf(12.0f), 2131628620);
        this.LJIIIZ.addView(l3q);
        C89045L6p c89045L6p = this.LJII;
        if (c89045L6p != null && c89045L6p.LIZLLL == 2) {
            if (!c3243u.LJJIJIIJI) {
                l3q.LIZ();
                return;
            }
        } else if (!z) {
            l3q.LIZ();
            return;
        }
        FlowLayout flowLayout = this.LJIIIZ;
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        Context context2 = view2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        flowLayout.addView(new L3Q(context2, c3243u.LJIILJJIL, Float.valueOf(12.0f), 2131628620));
        FlowLayout flowLayout2 = this.LJIIIZ;
        View view3 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "");
        Context context3 = view3.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        flowLayout2.addView(new L3N(context3, c3243u.LJIIZILJ, Float.valueOf(12.0f), 2131628620));
        FlowLayout flowLayout3 = this.LJIIIZ;
        View view4 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view4, "");
        Context context4 = view4.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        flowLayout3.addView(new L3S(context4, c3243u.LJIILLIIL, Float.valueOf(12.0f), 2131628620));
    }
}
