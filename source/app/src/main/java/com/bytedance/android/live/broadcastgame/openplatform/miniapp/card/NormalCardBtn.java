package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C87886Kk4;
import p003X.C88361Krj;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class NormalCardBtn extends FrameLayout {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(21597);
    }

    public NormalCardBtn(Context context) {
        this(context, null, 0, 6, null);
    }

    public NormalCardBtn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final void setSnapUpBtn(C87886Kk4 c87886Kk4) {
        if (PatchProxy.proxy(new Object[]{c87886Kk4}, this, LIZ, false, 6).isSupported) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C88361Krj c88361Krj = new C88361Krj(context, null, 0, 6);
        c88361Krj.setData(c87886Kk4);
        LIZ(this, c88361Krj);
    }

    private final void setDesText(int i) {
        String LIZ2;
        MethodCollector.m14708i(1502);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 4).isSupported) {
            MethodCollector.m14707o(1502);
            return;
        }
        TextView textView = new TextView(getContext());
        if (i == 200) {
            LIZ2 = LK5.LIZ(2131586315);
        } else {
            LIZ2 = LK5.LIZ(2131586312);
        }
        textView.setText(LIZ2);
        textView.setGravity(17);
        textView.setTextSize(12.0f);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        textView.setTextColor(C116971W2r.LIZ(getContext(), 2131625236));
        LIZ(this, textView);
        MethodCollector.m14707o(1502);
    }

    public final void setInfo(C87886Kk4 c87886Kk4) {
        String str;
        Integer num;
        String str2;
        if (PatchProxy.proxy(new Object[]{c87886Kk4}, this, LIZ, false, 2).isSupported) {
            return;
        }
        if (c87886Kk4 != null) {
            str = c87886Kk4.LIZLLL;
        } else {
            str = null;
        }
        setBtnColor(str);
        if (c87886Kk4 != null) {
            Integer num2 = c87886Kk4.LIZIZ;
            if (num2 != null && num2.intValue() == 200) {
                setDesText(c87886Kk4.LIZIZ.intValue());
                return;
            } else if (c87886Kk4 != null && (num = c87886Kk4.LIZIZ) != null && num.intValue() == 301 && (str2 = c87886Kk4.LIZJ) != null && !StringsKt__StringsJVMKt.isBlank(str2)) {
                setSnapUpBtn(c87886Kk4);
                return;
            }
        }
        if (!PatchProxy.proxy(new Object[]{this, 0, 1, null}, null, LIZ, true, 5).isSupported) {
            setDesText(100);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setBtnColor(java.lang.String r8) {
        /*
            r7 = this;
            r3 = 1
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r4 = 0
            r2[r4] = r8
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.NormalCardBtn.LIZ
            r1 = 3
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r7, r0, r4, r1)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L12
            return
        L12:
            if (r8 == 0) goto L1f
            boolean r0 = kotlin.text.StringsKt__StringsJVMKt.isBlank(r8)     // Catch: java.lang.IllegalArgumentException -> L98
            if (r0 != 0) goto L1f
            int r0 = android.graphics.Color.parseColor(r8)     // Catch: java.lang.IllegalArgumentException -> L98
            goto L25
        L1f:
            java.lang.String r0 = "#FE2C55"
            int r0 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.IllegalArgumentException -> L98
        L25:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> L98
            if (r0 == 0) goto L99
            int r5 = r0.intValue()
            r0 = 8
            float[] r6 = new float[r0]
            r2 = 2
            float r0 = p003X.LK1.LIZJ(r2)
            r6[r4] = r0
            float r0 = p003X.LK1.LIZJ(r2)
            r6[r3] = r0
            float r0 = p003X.LK1.LIZJ(r2)
            r6[r2] = r0
            float r0 = p003X.LK1.LIZJ(r2)
            r6[r1] = r0
            r1 = 4
            float r0 = p003X.LK1.LIZJ(r2)
            r6[r1] = r0
            r1 = 5
            float r0 = p003X.LK1.LIZJ(r2)
            r6[r1] = r0
            r1 = 6
            float r0 = p003X.LK1.LIZJ(r2)
            r6[r1] = r0
            r1 = 7
            float r0 = p003X.LK1.LIZJ(r2)
            r6[r1] = r0
            android.graphics.drawable.ShapeDrawable r3 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.RoundRectShape r2 = new android.graphics.drawable.shapes.RoundRectShape
            android.graphics.RectF r1 = new android.graphics.RectF
            r0 = 0
            r1.<init>(r0, r0, r0, r0)
            r2.<init>(r6, r1, r6)
            r3.<init>(r2)
            android.graphics.Paint r1 = r3.getPaint()
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            r1.setColor(r5)
            android.graphics.Rect r2 = new android.graphics.Rect
            int r1 = r7.getHeight()
            int r0 = r7.getBottom()
            r2.<init>(r4, r4, r1, r0)
            r3.setBounds(r2)
            r7.setBackground(r3)
            return
        L98:
            r0 = 0
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.NormalCardBtn.setBtnColor(java.lang.String):void");
    }

    private final void LIZ(ViewGroup viewGroup, View view) {
        MethodCollector.m14708i(1503);
        if (PatchProxy.proxy(new Object[]{viewGroup, view}, this, LIZ, false, 7).isSupported) {
            MethodCollector.m14707o(1503);
            return;
        }
        viewGroup.removeAllViews();
        viewGroup.addView(view, new LinearLayout.LayoutParams(-1, -1));
        MethodCollector.m14707o(1503);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalCardBtn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1504);
        MethodCollector.m14707o(1504);
    }

    public /* synthetic */ NormalCardBtn(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
