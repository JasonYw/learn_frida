package com.bytedance.android.live.liveinteract.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C78534Gxc;
import p003X.LK5;
import p003X.View$OnClickListenerC78533Gxb;
import p003X.View$OnClickListenerC78535Gxd;

/* loaded from: classes3.dex */
public final class SteadyNumModifilerView extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public int LIZLLL;

    /* renamed from: LJ */
    public Integer f26469LJ;
    public List<C4984d> LJI;
    public int LJII;
    public final TextView LJIIIIZZ;
    public final TextView LJIIIZ;
    public final TextView LJIIJ;
    public final TextView LJIIJJI;
    public final NextLiveData<String> LIZIZ = new NextLiveData<>();
    public final NextLiveData<Integer> LIZJ = new NextLiveData<>();
    public boolean LJFF = true;

    static {
        Covode.recordClassIndex(30775);
    }

    public final boolean getEnable() {
        return this.LJFF;
    }

    public final List<C4984d> getMCaculateRule() {
        return this.LJI;
    }

    public final Integer getMaxNum() {
        return this.f26469LJ;
    }

    public final int getMinimum() {
        return this.LIZLLL;
    }

    public final NextLiveData<Integer> getNum() {
        return this.LIZJ;
    }

    public final TextView getNumber() {
        return this.LJIIJ;
    }

    public final TextView getPlus() {
        return this.LJIIIIZZ;
    }

    public final TextView getReduce() {
        return this.LJIIIZ;
    }

    public final NextLiveData<String> getStrTips() {
        return this.LIZIZ;
    }

    public final TextView getTips() {
        return this.LJIIJJI;
    }

    public final int getStep() {
        C4984d c4984d;
        Integer valueOf;
        C4984d c4984d2;
        Object obj;
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (this.LJI == null) {
            this.LJIIJJI.setText("加价幅度  " + Integer.valueOf(this.LJII));
            return this.LJII;
        }
        Integer value = this.LIZJ.getValue();
        if (value == null) {
            value = 0;
        }
        Intrinsics.checkNotNullExpressionValue(value, "");
        int intValue = value.intValue();
        List<C4984d> list = this.LJI;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    C4984d c4984d3 = (C4984d) obj;
                    if (c4984d3.LIZIZ <= intValue && intValue <= c4984d3.LIZJ) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C4984d c4984d4 = (C4984d) obj;
            if (c4984d4 != null) {
                i = c4984d4.LIZLLL;
                this.LJIIJJI.setText("加价幅度  " + i);
                return i;
            }
        }
        List<C4984d> list2 = this.LJI;
        if (list2 != null && (c4984d2 = (C4984d) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list2)) != null && c4984d2.LIZIZ > intValue) {
            valueOf = Integer.valueOf(c4984d2.LIZLLL);
        } else {
            List<C4984d> list3 = this.LJI;
            if (list3 != null && (c4984d = (C4984d) CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) list3)) != null && c4984d.LIZJ < intValue) {
                valueOf = Integer.valueOf(c4984d.LIZLLL);
            }
            this.LJIIJJI.setText("加价幅度  " + i);
            return i;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        }
        this.LJIIJJI.setText("加价幅度  " + i);
        return i;
    }

    public final void setEnable(boolean z) {
        this.LJFF = z;
    }

    public final void setMaxNum(Integer num) {
        this.f26469LJ = num;
    }

    public final void setMinimum(int i) {
        this.LIZLLL = i;
    }

    public final void setStep(int i) {
        this.LJII = i;
    }

    public final void setMCaculateRule(List<C4984d> list) {
        C4984d c4984d;
        Integer valueOf;
        C4984d c4984d2;
        Object obj;
        int i = 0;
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 1).isSupported) {
            return;
        }
        Integer value = this.LIZJ.getValue();
        if (value == null) {
            value = 0;
        }
        Intrinsics.checkNotNullExpressionValue(value, "");
        int intValue = value.intValue();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    C4984d c4984d3 = (C4984d) obj;
                    if (c4984d3.LIZIZ <= intValue && intValue <= c4984d3.LIZJ) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C4984d c4984d4 = (C4984d) obj;
            if (c4984d4 != null) {
                i = c4984d4.LIZLLL;
                this.LJIIJJI.setText("加价幅度  " + i);
                this.LJI = list;
            }
        }
        List<C4984d> list2 = this.LJI;
        if (list2 != null && (c4984d2 = (C4984d) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list2)) != null && c4984d2.LIZIZ > intValue) {
            valueOf = Integer.valueOf(c4984d2.LIZLLL);
        } else {
            List<C4984d> list3 = this.LJI;
            if (list3 != null && (c4984d = (C4984d) CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) list3)) != null && c4984d.LIZJ < intValue) {
                valueOf = Integer.valueOf(c4984d.LIZLLL);
            }
            this.LJIIJJI.setText("加价幅度  " + i);
            this.LJI = list;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        }
        this.LJIIJJI.setText("加价幅度  " + i);
        this.LJI = list;
    }

    public SteadyNumModifilerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable;
        Resources resources;
        Resources resources2;
        MethodCollector.m14708i(2070);
        TextView textView = new TextView(context);
        Drawable drawable2 = null;
        if (context != null && (resources2 = context.getResources()) != null) {
            drawable = resources2.getDrawable(2130857578);
        } else {
            drawable = null;
        }
        textView.setBackground(drawable);
        textView.setGravity(17);
        textView.setOnClickListener(new View$OnClickListenerC78535Gxd(this, context));
        textView.setTextSize(LK5.LIZ(8.0f));
        this.LJIIIIZZ = textView;
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(LK5.LIZ(8.0f));
        textView2.setOnClickListener(new View$OnClickListenerC78533Gxb(this, context));
        if (context != null && (resources = context.getResources()) != null) {
            drawable2 = resources.getDrawable(2130857579);
        }
        textView2.setBackground(drawable2);
        this.LJIIIZ = textView2;
        TextView textView3 = new TextView(context);
        textView3.setText("0");
        textView3.setScaleY(1.2f);
        textView3.setTextColor(CastProtectorUtils.parseColor("#FE2C55"));
        textView3.setTextSize(LK5.LIZ(9.0f));
        textView3.setGravity(17);
        this.LIZJ.observeForever(new C78534Gxc(textView3, this));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        textView3.setGravity(1);
        textView3.setLayoutParams(layoutParams);
        this.LJIIJ = textView3;
        final TextView textView4 = new TextView(context);
        textView4.setTextColor(CastProtectorUtils.parseColor("#70161823"));
        textView4.setTextSize(1, 12.0f);
        textView4.setGravity(17);
        textView4.setText("加价幅度");
        this.LIZIZ.observeForever(new Observer<String>() { // from class: X.1UQ
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(30780);
            }

            @Override // androidx.lifecycle.Observer
            public final /* synthetic */ void onChanged(String str) {
                String str2 = str;
                if (!PatchProxy.proxy(new Object[]{str2}, this, LIZ, false, 1).isSupported) {
                    textView4.setText(str2);
                }
            }
        });
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        textView4.setLayoutParams(layoutParams2);
        this.LJIIJJI = textView4;
        setOrientation(0);
        int LIZ2 = LK5.LIZ(32.0f);
        this.LJIIIZ.setGravity(17);
        this.LJIIIIZZ.setGravity(17);
        View view = this.LJIIIZ;
        ViewGroup.LayoutParams layoutParams3 = new ViewGroup.LayoutParams(LIZ2, LIZ2);
        setGravity(16);
        addView(view, layoutParams3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.addView(this.LJIIJ);
        linearLayout.addView(this.LJIIJJI);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -1);
        layoutParams4.weight = 1.0f;
        addView(linearLayout, layoutParams4);
        View view2 = this.LJIIIIZZ;
        ViewGroup.LayoutParams layoutParams5 = new ViewGroup.LayoutParams(LIZ2, LIZ2);
        setGravity(16);
        addView(view2, layoutParams5);
        requestLayout();
        MethodCollector.m14707o(2070);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.view.SteadyNumModifilerView$d */
    /* loaded from: classes3.dex */
    public static final class C4984d {
        public static ChangeQuickRedirect LIZ;
        public final int LIZIZ;
        public final int LIZJ;
        public final int LIZLLL;

        static {
            Covode.recordClassIndex(30779);
        }

        private Object[] LIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
            return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL)};
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof C4984d) {
                return C106862S5w.LIZ(((C4984d) obj).LIZ(), LIZ());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("SteadyNumModifilerView$CaculateRule:%s,%s,%s", LIZ());
        }

        public C4984d(int i, int i2, int i3) {
            this.LIZIZ = i;
            this.LIZJ = i2;
            this.LIZLLL = i3;
        }
    }
}
