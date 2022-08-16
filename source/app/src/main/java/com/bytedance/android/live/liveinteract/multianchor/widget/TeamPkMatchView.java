package com.bytedance.android.live.liveinteract.multianchor.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.multianchor.match.AbstractC4530a;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC79685Hb5;
import p003X.C106862S5w;
import p003X.C4313534v;
import p003X.C79682Hb2;
import p003X.C89748LXq;
import p003X.M0Q;
import p003X.View$OnClickListenerC79670Haq;
import p003X.View$OnClickListenerC79679Haz;

/* loaded from: classes3.dex */
public final class TeamPkMatchView extends ConstraintLayout {
    public static ChangeQuickRedirect LIZ;

    /* renamed from: LJ */
    public static final String f26377LJ = C0002O.m25085C("https://", C4313534v.LIZIZ(), "/obj/live-android/ttlive_team_pk_match_view_bg.png");
    public static final C4581a LJFF = new C4581a(new ImageModel(), "", Gender.UNKNOWN, 0, false, false, 0, new User(), false, 256);
    public final AbstractC4782v LIZIZ;
    public AbstractC79685Hb5 LIZJ;
    public final List<Integer> LIZLLL;

    /* loaded from: classes3.dex */
    public enum Gender {
        MALE,
        FEMALE,
        UNKNOWN;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28475);
        }

        public static Gender valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (Gender) (proxy.isSupported ? proxy.result : Enum.valueOf(Gender.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Gender[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (Gender[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    public final AbstractC79685Hb5 getChangeTeamSupportCallback() {
        return this.LIZJ;
    }

    static {
        Covode.recordClassIndex(28474);
    }

    public final void setChangeTeamSupportCallback(AbstractC79685Hb5 abstractC79685Hb5) {
        this.LIZJ = abstractC79685Hb5;
    }

    private final boolean LIZ(C4581a c4581a) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4581a}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4530a LIZ2 = AbstractC4530a.LIZ.LIZ();
        if (LIZ2 != null && LIZ2.mo15726LJ()) {
            return false;
        }
        if (c4581a.f26378LJ || c4581a.LJFF) {
            return true;
        }
        return false;
    }

    public TeamPkMatchView(Context context) {
        super(context);
        MethodCollector.m14708i(1962);
        this.LIZLLL = CollectionsKt__CollectionsKt.arrayListOf(2131193153, 2131193154, 2131193155, 2131193156);
        this.LIZIZ = AbstractC4782v.LJIIL.LIZ();
        setWillNotDraw(false);
        LayoutInflater.from(getContext()).inflate(2131700250, this);
        HSImageView hSImageView = (HSImageView) findViewById(2131181260);
        if (hSImageView != null) {
            M0Q.LIZ(hSImageView, f26377LJ, C89748LXq.LIZIZ.LIZ(375.0f), C89748LXq.LIZIZ.LIZ(111.0f));
            MethodCollector.m14707o(1962);
            return;
        }
        MethodCollector.m14707o(1962);
    }

    public final void LIZIZ(List<C4581a> list) {
        int i = 0;
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 3).isSupported || list.isEmpty()) {
            return;
        }
        int size = list.size() - 1;
        int size2 = list.size();
        while (true) {
            if (i >= size2) {
                break;
            } else if (list.get(i).LJIIIIZZ) {
                size = i;
                break;
            } else {
                i++;
            }
        }
        if (size != list.size() - 1) {
            Collections.swap(list, list.size() - 1, size);
        }
    }

    private final void LIZ(ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, LIZ, false, 8).isSupported) {
            return;
        }
        HSImageView hSImageView = (HSImageView) viewGroup.findViewById(2131177454);
        if (hSImageView != null) {
            hSImageView.setVisibility(8);
        }
        HSImageView hSImageView2 = (HSImageView) viewGroup.findViewById(2131177453);
        if (hSImageView2 != null) {
            hSImageView2.setVisibility(8);
        }
        HSImageView hSImageView3 = (HSImageView) viewGroup.findViewById(2131177455);
        if (hSImageView3 != null) {
            hSImageView3.setVisibility(0);
        }
        TextView textView = (TextView) viewGroup.findViewById(2131194722);
        if (textView != null) {
            textView.setText(2131588028);
            textView.setAlpha(0.5f);
        }
        View findViewById = viewGroup.findViewById(2131169288);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        HSImageView hSImageView4 = (HSImageView) viewGroup.findViewById(2131177459);
        if (hSImageView4 != null) {
            hSImageView4.setVisibility(8);
        }
        TextView textView2 = (TextView) viewGroup.findViewById(2131193694);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        VHeadView vHeadView = (VHeadView) viewGroup.findViewById(2131179019);
        if (vHeadView != null) {
            vHeadView.setVisibility(8);
        }
        TextView textView3 = (TextView) viewGroup.findViewById(2131195419);
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        VHeadView vHeadView2 = (VHeadView) viewGroup.findViewById(2131167988);
        if (vHeadView2 != null) {
            vHeadView2.setVisibility(8);
        }
    }

    public final void LIZ(List<C4581a> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 2).isSupported || list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).LJIIIIZZ) {
                if (i != 0) {
                    Collections.swap(list, 0, i);
                    return;
                }
                return;
            }
        }
    }

    private final void LIZ(ViewGroup viewGroup, boolean z) {
        if (PatchProxy.proxy(new Object[]{viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 11).isSupported) {
            return;
        }
        View findViewById = viewGroup.findViewById(2131169288);
        HSImageView hSImageView = (HSImageView) viewGroup.findViewById(2131177459);
        hSImageView.setSelected(false);
        TextView textView = (TextView) viewGroup.findViewById(2131193694);
        textView.setSelected(false);
        if (z) {
            Intrinsics.checkNotNullExpressionValue(findViewById, "");
            findViewById.setVisibility(0);
            hSImageView.setVisibility(0);
            textView.setVisibility(0);
        } else {
            Intrinsics.checkNotNullExpressionValue(findViewById, "");
            findViewById.setVisibility(8);
            hSImageView.setVisibility(8);
            textView.setVisibility(8);
        }
        findViewById.setOnClickListener(new View$OnClickListenerC79679Haz(this, hSImageView, textView));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 13).isSupported) {
            return;
        }
        super.onMeasure(i, i2);
        HSImageView hSImageView = (HSImageView) findViewById(2131181260);
        if (hSImageView != null) {
            hSImageView.measure(View.MeasureSpec.makeMeasureSpec(C89748LXq.LIZIZ.LIZ(375.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(C89748LXq.LIZIZ.LIZ(111.0f), 1073741824));
        }
    }

    public TeamPkMatchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(1963);
        this.LIZLLL = CollectionsKt__CollectionsKt.arrayListOf(2131193153, 2131193154, 2131193155, 2131193156);
        this.LIZIZ = AbstractC4782v.LJIIL.LIZ();
        setWillNotDraw(false);
        LayoutInflater.from(getContext()).inflate(2131700250, this);
        HSImageView hSImageView = (HSImageView) findViewById(2131181260);
        if (hSImageView != null) {
            M0Q.LIZ(hSImageView, f26377LJ, C89748LXq.LIZIZ.LIZ(375.0f), C89748LXq.LIZIZ.LIZ(111.0f));
            MethodCollector.m14707o(1963);
            return;
        }
        MethodCollector.m14707o(1963);
    }

    private final void LIZJ(List<C4581a> list, List<C4581a> list2) {
        if (PatchProxy.proxy(new Object[]{list, list2}, this, LIZ, false, 5).isSupported || list.size() + list2.size() != 4) {
            return;
        }
        View findViewById = findViewById(2131176519);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.leftToRight = -1;
            layoutParams2.leftToLeft = -1;
            layoutParams2.rightToLeft = -1;
            layoutParams2.rightToRight = -1;
            int size = list.size();
            if (size == 0) {
                layoutParams2.leftToLeft = 0;
                layoutParams2.rightToLeft = this.LIZLLL.get(0).intValue();
                return;
            } else if (size == 4) {
                layoutParams2.leftToRight = this.LIZLLL.get(3).intValue();
                layoutParams2.rightToRight = 0;
                return;
            } else {
                layoutParams2.leftToRight = this.LIZLLL.get(size - 1).intValue();
                layoutParams2.rightToLeft = this.LIZLLL.get(size).intValue();
                return;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
    }

    public final Pair<List<C4581a>, List<C4581a>> LIZIZ(List<C4581a> list, List<C4581a> list2) {
        int size;
        C4581a c4581a;
        C4581a c4581a2;
        int i = 2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, list2}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (Pair) proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list.size() <= 2 && list2.size() <= 2) {
            size = 2;
        } else if (list.size() > list2.size()) {
            i = list.size();
            size = 4 - list.size();
        } else {
            i = 4 - list2.size();
            size = list2.size();
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 >= 0 && i2 < list.size()) {
                c4581a2 = list.get(i2);
            } else {
                c4581a2 = LJFF;
            }
            arrayList.add(c4581a2);
        }
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 >= 0 && i3 < list2.size()) {
                c4581a = list2.get(i3);
            } else {
                c4581a = LJFF;
            }
            arrayList2.add(c4581a);
        }
        return TuplesKt.m137to(arrayList, arrayList2);
    }

    private final void LIZ(ViewGroup viewGroup, C4581a c4581a) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{viewGroup, c4581a}, this, LIZ, false, 9).isSupported) {
            return;
        }
        HSImageView hSImageView = (HSImageView) viewGroup.findViewById(2131177454);
        if (hSImageView != null) {
            hSImageView.setVisibility(0);
        }
        HSImageView hSImageView2 = (HSImageView) viewGroup.findViewById(2131177453);
        if (hSImageView2 != null) {
            M0Q.LIZIZ((ImageView) hSImageView2, c4581a.LIZ);
            hSImageView2.setVisibility(0);
        }
        HSImageView hSImageView3 = (HSImageView) viewGroup.findViewById(2131177455);
        if (hSImageView3 != null) {
            hSImageView3.setVisibility(8);
        }
        TextView textView = (TextView) viewGroup.findViewById(2131194722);
        if (textView != null) {
            textView.setText(c4581a.LIZIZ);
            textView.setAlpha(1.0f);
        }
        LIZ(viewGroup, c4581a.LJIIIIZZ);
        VHeadView vHeadView = (VHeadView) viewGroup.findViewById(2131179019);
        if (vHeadView != null) {
            int i5 = C79682Hb2.LIZ[c4581a.LIZJ.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    i3 = 8;
                    vHeadView.setVisibility(i3);
                } else {
                    vHeadView.setImageResource(2130855958);
                }
            } else {
                vHeadView.setImageResource(2130855960);
            }
            i3 = 0;
            vHeadView.setVisibility(i3);
        }
        if (c4581a.LJI != 1) {
            z = false;
        }
        TextView textView2 = (TextView) viewGroup.findViewById(2131195419);
        if (textView2 != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            textView2.setVisibility(i);
            if (c4581a.LIZLLL == 4) {
                i2 = 2131582006;
            } else {
                i2 = 2131582014;
            }
            textView2.setText(i2);
        }
        VHeadView vHeadView2 = (VHeadView) viewGroup.findViewById(2131167988);
        if (vHeadView2 != null) {
            if (!z || !LIZ(c4581a)) {
                i4 = 8;
            }
            vHeadView2.setVisibility(i4);
            vHeadView2.setOnClickListener(new View$OnClickListenerC79670Haq(this, z, c4581a));
        }
    }

    private final void LIZLLL(List<C4581a> list, List<C4581a> list2) {
        float f;
        float f2;
        float f3;
        if (PatchProxy.proxy(new Object[]{list, list2}, this, LIZ, false, 6).isSupported || list.size() + list2.size() != 4) {
            return;
        }
        ArrayList arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(2131193148, 2131193149, 2131193150, 2131193151, 2131193152);
        int size = list.size();
        Object obj = arrayListOf.get(0);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        View findViewById = findViewById(((Number) obj).intValue());
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            float f4 = 3.0f;
            if (size == 0) {
                f = 6.0f;
            } else {
                f = 3.0f;
            }
            layoutParams2.horizontalWeight = f;
            Object obj2 = arrayListOf.get(1);
            Intrinsics.checkNotNullExpressionValue(obj2, "");
            View findViewById2 = findViewById(((Number) obj2).intValue());
            Intrinsics.checkNotNullExpressionValue(findViewById2, "");
            ViewGroup.LayoutParams layoutParams3 = findViewById2.getLayoutParams();
            if (layoutParams3 != null) {
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                float f5 = 2.0f;
                if (size == 1) {
                    f2 = 6.0f;
                } else {
                    f2 = 2.0f;
                }
                layoutParams4.horizontalWeight = f2;
                Object obj3 = arrayListOf.get(2);
                Intrinsics.checkNotNullExpressionValue(obj3, "");
                View findViewById3 = findViewById(((Number) obj3).intValue());
                Intrinsics.checkNotNullExpressionValue(findViewById3, "");
                ViewGroup.LayoutParams layoutParams5 = findViewById3.getLayoutParams();
                if (layoutParams5 != null) {
                    ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                    if (size == 2) {
                        f3 = 6.0f;
                    } else {
                        f3 = 2.0f;
                    }
                    layoutParams6.horizontalWeight = f3;
                    Object obj4 = arrayListOf.get(3);
                    Intrinsics.checkNotNullExpressionValue(obj4, "");
                    View findViewById4 = findViewById(((Number) obj4).intValue());
                    Intrinsics.checkNotNullExpressionValue(findViewById4, "");
                    ViewGroup.LayoutParams layoutParams7 = findViewById4.getLayoutParams();
                    if (layoutParams7 != null) {
                        ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
                        if (size == 3) {
                            f5 = 6.0f;
                        }
                        layoutParams8.horizontalWeight = f5;
                        Object obj5 = arrayListOf.get(4);
                        Intrinsics.checkNotNullExpressionValue(obj5, "");
                        View findViewById5 = findViewById(((Number) obj5).intValue());
                        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
                        ViewGroup.LayoutParams layoutParams9 = findViewById5.getLayoutParams();
                        if (layoutParams9 != null) {
                            ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams9;
                            if (size == 4) {
                                f4 = 6.0f;
                            }
                            layoutParams10.horizontalWeight = f4;
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
    }

    public final void LIZ(List<C4581a> list, List<C4581a> list2) {
        int i = 0;
        if (PatchProxy.proxy(new Object[]{list, list2}, this, LIZ, false, 4).isSupported) {
            return;
        }
        List plus = CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) list2);
        if (plus.size() != 4 || this.LIZLLL.size() != 4) {
            return;
        }
        do {
            ViewGroup viewGroup = (ViewGroup) findViewById(this.LIZLLL.get(i).intValue());
            boolean areEqual = Intrinsics.areEqual(plus.get(i), LJFF);
            Intrinsics.checkNotNullExpressionValue(viewGroup, "");
            if (areEqual) {
                LIZ(viewGroup);
            } else {
                LIZ(viewGroup, (C4581a) plus.get(i));
            }
            i++;
        } while (i < 4);
        LIZLLL(list, list2);
        LIZJ(list, list2);
    }

    public TeamPkMatchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1964);
        this.LIZLLL = CollectionsKt__CollectionsKt.arrayListOf(2131193153, 2131193154, 2131193155, 2131193156);
        this.LIZIZ = AbstractC4782v.LJIIL.LIZ();
        setWillNotDraw(false);
        LayoutInflater.from(getContext()).inflate(2131700250, this);
        HSImageView hSImageView = (HSImageView) findViewById(2131181260);
        if (hSImageView != null) {
            M0Q.LIZ(hSImageView, f26377LJ, C89748LXq.LIZIZ.LIZ(375.0f), C89748LXq.LIZIZ.LIZ(111.0f));
            MethodCollector.m14707o(1964);
            return;
        }
        MethodCollector.m14707o(1964);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 14).isSupported) {
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        View findViewById = findViewById(2131176519);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        float left = (findViewById.getLeft() + findViewById.getRight()) / 2.0f;
        int LIZ2 = C89748LXq.LIZIZ.LIZ(375.0f);
        HSImageView hSImageView = (HSImageView) findViewById(2131181260);
        if (hSImageView != null) {
            float f = LIZ2 / 2.0f;
            hSImageView.layout((int) (left - f), 0, (int) (left + f), getHeight());
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multianchor.widget.TeamPkMatchView$a */
    /* loaded from: classes3.dex */
    public static final class C4581a {
        public final ImageModel LIZ;
        public final String LIZIZ;
        public final Gender LIZJ;
        public final int LIZLLL;

        /* renamed from: LJ */
        public boolean f26378LJ;
        public boolean LJFF;
        public final int LJI;
        public final User LJII;
        public final boolean LJIIIIZZ;

        static {
            Covode.recordClassIndex(28476);
        }

        public C4581a(ImageModel imageModel, String str, Gender gender, int i, boolean z, boolean z2, int i2, User user, boolean z3) {
            C106862S5w.LIZ(imageModel, str, gender, user);
            this.LIZ = imageModel;
            this.LIZIZ = str;
            this.LIZJ = gender;
            this.LIZLLL = i;
            this.f26378LJ = z;
            this.LJFF = z2;
            this.LJI = i2;
            this.LJII = user;
            this.LJIIIIZZ = z3;
        }

        public /* synthetic */ C4581a(ImageModel imageModel, String str, Gender gender, int i, boolean z, boolean z2, int i2, User user, boolean z3, int i3) {
            this(imageModel, str, gender, 0, false, false, 0, user, false);
        }
    }
}
