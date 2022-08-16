package com.bytedance.android.live.playtogether.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.C116971W2r;
import p003X.LK5;
import p003X.LVH;
import p003X.LVI;
import p003X.LVJ;

/* loaded from: classes5.dex */
public final class DigitSelectorView extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ = 1;
    public int LIZJ = 4;
    public int LIZLLL = 4;

    /* renamed from: LJ */
    public final int f26543LJ = 2131626873;
    public final int LJFF = 2131626871;
    public final int LJI = 2130857678;
    public final int LJII = 2130857677;
    public final int LJIIIIZZ = 2130857676;
    public final int LJIIIZ = 2130857675;
    public HashMap LJIIJ;

    static {
        Covode.recordClassIndex(32942);
    }

    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIIJ == null) {
            this.LJIIJ = new HashMap();
        }
        View view = (View) this.LJIIJ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJIIJ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getValue() {
        return this.LIZLLL;
    }

    private final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        C116971W2r.LIZ(LayoutInflater.from(getContext()), 2131700103, (ViewGroup) this, true);
        TextView textView = (TextView) LIZ(2131195628);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setText(String.valueOf(this.LIZLLL));
        ((Button) LIZ(2131168691)).setOnClickListener(new LVH(this));
        ((Button) LIZ(2131168660)).setOnClickListener(new LVI(this));
        LIZ();
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        if (this.LIZLLL >= this.LIZJ) {
            Button button = (Button) LIZ(2131168691);
            Intrinsics.checkNotNullExpressionValue(button, "");
            button.setEnabled(false);
            ((Button) LIZ(2131168691)).setTextColor(LK5.LIZIZ(this.LJFF));
            ((Button) LIZ(2131168691)).setBackgroundResource(this.LJII);
        } else {
            Button button2 = (Button) LIZ(2131168691);
            Intrinsics.checkNotNullExpressionValue(button2, "");
            button2.setEnabled(true);
            ((Button) LIZ(2131168691)).setTextColor(LK5.LIZIZ(this.f26543LJ));
            ((Button) LIZ(2131168691)).setBackgroundResource(this.LJI);
        }
        if (this.LIZLLL <= this.LIZIZ) {
            Button button3 = (Button) LIZ(2131168660);
            Intrinsics.checkNotNullExpressionValue(button3, "");
            button3.setEnabled(false);
            ((Button) LIZ(2131168660)).setTextColor(LK5.LIZIZ(this.LJFF));
            ((Button) LIZ(2131168660)).setBackgroundResource(this.LJIIIZ);
            return;
        }
        Button button4 = (Button) LIZ(2131168660);
        Intrinsics.checkNotNullExpressionValue(button4, "");
        button4.setEnabled(true);
        ((Button) LIZ(2131168660)).setTextColor(LK5.LIZIZ(this.f26543LJ));
        ((Button) LIZ(2131168660)).setBackgroundResource(this.LJIIIIZZ);
    }

    public DigitSelectorView(Context context) {
        super(context);
        MethodCollector.m14708i(2171);
        LIZIZ();
        MethodCollector.m14707o(2171);
    }

    public final void setValue(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1).isSupported && i <= this.LIZJ && i >= this.LIZIZ) {
            this.LIZLLL = i;
            post(new LVJ(this));
        }
    }

    public DigitSelectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(2172);
        LIZIZ();
        MethodCollector.m14707o(2172);
    }

    public DigitSelectorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(2173);
        LIZIZ();
        MethodCollector.m14707o(2173);
    }
}
