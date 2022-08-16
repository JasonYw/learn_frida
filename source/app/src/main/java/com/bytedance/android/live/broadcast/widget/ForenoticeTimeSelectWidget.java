package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.p274n.C3166a;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.livesdk.widget.LiveNumberPicker;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import p003X.AbstractC4569445g;
import p003X.AbstractC89398LKe;
import p003X.C100852Pni;
import p003X.C106862S5w;
import p003X.C89394LKa;
import p003X.C89395LKb;
import p003X.C89396LKc;
import p003X.C89397LKd;
import p003X.C89401LKh;
import p003X.C89402LKi;
import p003X.LK1;
import p003X.LKY;
import p003X.LKZ;
import p003X.LLY;

/* loaded from: classes5.dex */
public final class ForenoticeTimeSelectWidget extends LiveRecyclableWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final String[] LJII;
    public LiveNumberPicker LIZIZ;
    public LiveNumberPicker LIZJ;
    public final int LIZLLL;

    /* renamed from: LJ */
    public final C3166a f25972LJ;
    public LinearLayout LJIIJ;
    public HorizontalScrollView LJIIJJI;
    public static final C89397LKd LJIIIIZZ = new C89397LKd((byte) 0);
    public static final String[] LJFF = {"每周一", "每周二", "每周三", "每周四", "每周五", "每周六", "每周日"};
    public static final String[] LJI = {"00", "10", "20", "30", "40", "50"};
    public final Lazy LJIIIZ = LazyKt__LazyJVMKt.lazy(new ForenoticeTimeSelectWidget$mThemeStrategy$2(this));
    public List<TextView> LJIIL = new ArrayList();
    public View.OnClickListener LJIILIIL = new LKZ(this);

    private final AbstractC3323y LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (AbstractC3323y) (proxy.isSupported ? proxy.result : this.LJIIIZ.mo27335getValue());
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699799;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        this.LJIIL.clear();
    }

    static {
        Covode.recordClassIndex(18331);
        int i = 0;
        String[] strArr = new String[24];
        while (true) {
            String str = "0" + i;
            while (true) {
                strArr[i] = str;
                i++;
                if (i < 24) {
                    if (i >= 10) {
                        str = String.valueOf(i);
                    }
                } else {
                    LJII = strArr;
                    return;
                }
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LIZIZ = (LiveNumberPicker) findViewById(2131176934);
        this.LIZJ = (LiveNumberPicker) findViewById(2131183116);
        this.LJIIJ = (LinearLayout) findViewById(2131172052);
        this.LJIIJJI = (HorizontalScrollView) findViewById(2131188809);
        C100852Pni.LIZ(this.LJIIJJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        float f;
        AppCompatTextView appCompatTextView;
        boolean z;
        MethodCollector.m14708i(1371);
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(1371);
            return;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            this.LJIIL.clear();
            LinearLayout linearLayout = this.LJIIJ;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
                String[] strArr = LJFF;
                int length = strArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    String str = strArr[i];
                    int i3 = i2 + 1;
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i2), str}, this, LIZ, false, 8);
                    if (proxy.isSupported) {
                        appCompatTextView = (TextView) proxy.result;
                    } else {
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(this.context);
                        appCompatTextView2.setGravity(17);
                        appCompatTextView2.setWidth(LK1.LIZIZ(60.0f));
                        appCompatTextView2.setHeight(LK1.LIZIZ(28.0f));
                        appCompatTextView2.setText(str);
                        appCompatTextView2.setTag(new C89396LKc(i2, false));
                        appCompatTextView2.setTextSize(1, 13.0f);
                        appCompatTextView2.setTextColor(LK1.LJFF(LIZ().LJI()));
                        appCompatTextView2.setBackgroundResource(LIZ().LJIIIZ());
                        appCompatTextView2.setOnClickListener(this.LJIILIIL);
                        LLY.LIZ(appCompatTextView2, new LKY(appCompatTextView2, this, str, i2));
                        appCompatTextView = appCompatTextView2;
                    }
                    if (this.f25972LJ.LJI[i2] == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LIZ(appCompatTextView, z);
                    this.LJIIL.add(appCompatTextView);
                    i++;
                    i2 = i3;
                }
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
                    Object last = CollectionsKt___CollectionsKt.last((List<? extends Object>) this.LJIIL);
                    List<TextView> list = this.LJIIL;
                    list.remove(list.size() - 1);
                    this.LJIIL.add(0, last);
                }
                int i4 = 0;
                for (Object obj : this.LJIIL) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    TextView textView = (TextView) obj;
                    if (i4 == 0) {
                        f = 0.0f;
                    } else {
                        f = 8.0f;
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    layoutParams.leftMargin = LK1.LIZIZ(f);
                    linearLayout.addView(textView, layoutParams);
                    i4 = i5;
                }
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            LiveNumberPicker liveNumberPicker = this.LIZIZ;
            if (liveNumberPicker != null) {
                liveNumberPicker.LIZLLL(LK1.LJFF(LIZ().LIZ()));
                liveNumberPicker.m15271LJ(LK1.LJFF(LIZ().mo15853LJ()));
                liveNumberPicker.LIZ(0);
                liveNumberPicker.LIZIZ(LJII.length - 1);
                liveNumberPicker.LIZ(LJII);
            }
            LiveNumberPicker liveNumberPicker2 = this.LIZJ;
            if (liveNumberPicker2 != null) {
                liveNumberPicker2.LIZLLL(LK1.LJFF(LIZ().LIZ()));
                liveNumberPicker2.m15271LJ(LK1.LJFF(LIZ().mo15853LJ()));
                liveNumberPicker2.LIZ(0);
                liveNumberPicker2.LIZIZ(LJI.length - 1);
                liveNumberPicker2.LIZ(LJI);
            }
            LiveNumberPicker liveNumberPicker3 = this.LIZIZ;
            if (liveNumberPicker3 != null) {
                liveNumberPicker3.LIZ((AbstractC89398LKe) null);
            }
            LiveNumberPicker liveNumberPicker4 = this.LIZJ;
            if (liveNumberPicker4 != null) {
                liveNumberPicker4.LIZ((AbstractC89398LKe) null);
            }
            Pair<Integer, Integer> LIZIZ = this.f25972LJ.LIZIZ();
            if (LIZIZ.getFirst().intValue() >= 0 && LIZIZ.getFirst().intValue() < LJII.length && LIZIZ.getSecond().intValue() >= 0 && LIZIZ.getSecond().intValue() < LJI.length) {
                LiveNumberPicker liveNumberPicker5 = this.LIZIZ;
                if (liveNumberPicker5 != null) {
                    liveNumberPicker5.LIZJ(LIZIZ.getFirst().intValue());
                }
                LiveNumberPicker liveNumberPicker6 = this.LIZJ;
                if (liveNumberPicker6 != null) {
                    liveNumberPicker6.LIZJ(LIZIZ.getSecond().intValue());
                }
            }
            LiveNumberPicker liveNumberPicker7 = this.LIZIZ;
            if (liveNumberPicker7 != null) {
                liveNumberPicker7.LIZ(new C89394LKa(this));
            }
            LiveNumberPicker liveNumberPicker8 = this.LIZJ;
            if (liveNumberPicker8 != null) {
                liveNumberPicker8.LIZ(new C89395LKb(this));
            }
            LiveNumberPicker liveNumberPicker9 = this.LIZIZ;
            if (liveNumberPicker9 != null) {
                this.f25972LJ.f25911LJ = liveNumberPicker9.LJFF(liveNumberPicker9.getCurrentNumber());
            }
            LiveNumberPicker liveNumberPicker10 = this.LIZJ;
            if (liveNumberPicker10 != null) {
                this.f25972LJ.LJFF = liveNumberPicker10.LJFF(liveNumberPicker10.getCurrentNumber());
            }
            LLY.LIZ(this.LIZIZ, new C89402LKi(this));
            LLY.LIZ(this.LIZJ, new C89401LKh(this));
        }
        MethodCollector.m14707o(1371);
    }

    public ForenoticeTimeSelectWidget(int i, C3166a c3166a) {
        C106862S5w.LIZ(c3166a);
        this.LIZLLL = i;
        this.f25972LJ = c3166a;
    }

    public final void LIZ(TextView textView, boolean z) {
        if (PatchProxy.proxy(new Object[]{textView, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 9).isSupported) {
            return;
        }
        if (z) {
            textView.setTextColor(LK1.LJFF(LIZ().LJFF()));
            textView.setBackgroundResource(LIZ().LJIIJ());
        } else {
            textView.setTextColor(LK1.LJFF(LIZ().LJI()));
            textView.setBackgroundResource(LIZ().LJIIIZ());
        }
        Object tag = textView.getTag();
        if (tag != null && (tag instanceof C89396LKc)) {
            ((C89396LKc) tag).LIZJ = z;
        }
    }
}
