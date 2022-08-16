package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C87884Kk2;
import p003X.C88363Krl;
import p003X.LK1;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class NormalCardLabel extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public final Function1<String, Unit> LIZIZ;
    public Function0<Unit> LIZJ;
    public int LIZLLL;

    static {
        Covode.recordClassIndex(21598);
    }

    public NormalCardLabel(Context context) {
        this(context, null, 0, 6, null);
    }

    public NormalCardLabel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final Function0<Unit> getCountDownTimeOut() {
        return this.LIZJ;
    }

    private final C88363Krl LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (C88363Krl) proxy.result;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C88363Krl c88363Krl = new C88363Krl(context, null, 0, 6);
        LIZ(c88363Krl);
        return c88363Krl;
    }

    private final void LIZ() {
        TextView textView;
        MethodCollector.m14708i(1505);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1505);
            return;
        }
        CharSequence LIZ2 = LK5.LIZ(2131586313);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{LIZ2}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            textView = (TextView) proxy.result;
        } else {
            textView = new TextView(getContext());
            textView.setText(LIZ2);
            LIZ(textView);
        }
        LIZ(textView, 2130856976, LK1.LIZLLL(3), NormalCardLabel$setNormalLabel$1.INSTANCE);
        LIZ(this, textView);
        MethodCollector.m14707o(1505);
    }

    public final void setCountDownTimeOut(Function0<Unit> function0) {
        this.LIZJ = function0;
    }

    private final void setCountLabel(C87884Kk2 c87884Kk2) {
        if (PatchProxy.proxy(new Object[]{c87884Kk2}, this, LIZ, false, 3).isSupported) {
            return;
        }
        LIZ(2130856141, c87884Kk2);
    }

    private final void setLocalLabel(C87884Kk2 c87884Kk2) {
        if (PatchProxy.proxy(new Object[]{c87884Kk2}, this, LIZ, false, 2).isSupported) {
            return;
        }
        LIZ();
    }

    private final void setPatLabel(C87884Kk2 c87884Kk2) {
        if (PatchProxy.proxy(new Object[]{c87884Kk2}, this, LIZ, false, 4).isSupported) {
            return;
        }
        LIZ(2130856142, c87884Kk2);
    }

    public final void setLabel(C87884Kk2 c87884Kk2) {
        Integer valueOf;
        int i = 1;
        if (PatchProxy.proxy(new Object[]{c87884Kk2}, this, LIZ, false, 13).isSupported) {
            return;
        }
        int i2 = this.LIZLLL;
        if (c87884Kk2 != null) {
            if (i2 == c87884Kk2.LIZIZ) {
                int i3 = c87884Kk2.LIZIZ;
                if (i3 == 3 || i3 == 4) {
                    View childAt = getChildAt(0);
                    if (!(childAt instanceof C88363Krl)) {
                        childAt = null;
                    }
                    C88363Krl c88363Krl = (C88363Krl) childAt;
                    if (c88363Krl != null) {
                        LIZ(c88363Krl, c87884Kk2);
                    }
                }
                this.LIZLLL = c87884Kk2.LIZIZ;
                return;
            }
            i = c87884Kk2.LIZIZ;
        }
        this.LIZLLL = i;
        if (c87884Kk2 != null && (valueOf = Integer.valueOf(c87884Kk2.LIZIZ)) != null) {
            if (valueOf.intValue() == 2) {
                setLocalLabel(c87884Kk2);
                return;
            } else if (valueOf.intValue() == 3) {
                setCountLabel(c87884Kk2);
                return;
            } else if (valueOf.intValue() == 4) {
                setPatLabel(c87884Kk2);
                return;
            }
        }
        LIZ();
    }

    private final void LIZ(TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, LIZ, false, 9).isSupported) {
            return;
        }
        textView.setGravity(17);
        int i = Build.VERSION.SDK_INT;
        textView.setLetterSpacing(0.05f);
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(C116971W2r.LIZ(textView.getContext(), 2131625236));
    }

    private final void LIZ(int i, C87884Kk2 c87884Kk2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c87884Kk2}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C88363Krl LIZIZ = LIZIZ();
        LIZ(LIZIZ, i, 0, NormalCardLabel$setUpCountDownText$1.INSTANCE);
        LIZ(this, LIZIZ);
        LIZ(LIZIZ, c87884Kk2);
    }

    private final void LIZ(C88363Krl c88363Krl, C87884Kk2 c87884Kk2) {
        if (!PatchProxy.proxy(new Object[]{c88363Krl, c87884Kk2}, this, LIZ, false, 6).isSupported && c87884Kk2 != null && c87884Kk2.LJFF != null && c87884Kk2.f8588LJ != null) {
            long coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(c87884Kk2.LJFF.longValue() - Math.max(c87884Kk2.f8588LJ.longValue(), c87884Kk2.LJI), 0L);
            c88363Krl.setTimeOutListener(new NormalCardLabel$startCountDown$1(this));
            C88363Krl.LIZ(c88363Krl, coerceAtLeast, 0L, 2, null);
        }
    }

    private final void LIZ(ViewGroup viewGroup, View view) {
        MethodCollector.m14708i(1506);
        if (PatchProxy.proxy(new Object[]{viewGroup, view}, this, LIZ, false, 14).isSupported) {
            MethodCollector.m14707o(1506);
            return;
        }
        viewGroup.removeAllViews();
        viewGroup.addView(view, new LinearLayout.LayoutParams(-2, -2));
        MethodCollector.m14707o(1506);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalCardLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1507);
        this.LIZIZ = new NormalCardLabel$eventBus$1(this);
        setOrientation(0);
        setGravity(8388611);
        MethodCollector.m14707o(1507);
    }

    private final void LIZ(TextView textView, int i, int i2, Function1<? super Drawable, Unit> function1) {
        if (PatchProxy.proxy(new Object[]{textView, Integer.valueOf(i), Integer.valueOf(i2), function1}, this, LIZ, false, 10).isSupported) {
            return;
        }
        Drawable drawable = ContextCompat.getDrawable(textView.getContext(), i);
        if (drawable != null && function1 != null) {
            function1.invoke(drawable);
        }
        textView.setCompoundDrawablePadding(i2);
        textView.setCompoundDrawables(drawable, null, null, null);
    }

    public /* synthetic */ NormalCardLabel(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
