package com.bytedance.android.live.liveinteract.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.Constants;
import p003X.C116971W2r;
import p003X.LK5;

/* loaded from: classes22.dex */
public final class CountDownClockView extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public final TextView LIZIZ;
    public final TextView LIZJ;
    public final TextView LIZLLL;

    static {
        Covode.recordClassIndex(30739);
    }

    public final TextView getMinute() {
        return this.LIZIZ;
    }

    public final TextView getSecond() {
        return this.LIZJ;
    }

    public final TextView getSeparator() {
        return this.LIZLLL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
    }

    public CountDownClockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(2065);
        TextView textView = new TextView(context);
        textView.setTypeface(null, 1);
        textView.setTextColor(C116971W2r.LIZ(textView.getResources(), 2131626090));
        textView.setBackgroundResource(2130855583);
        textView.setLines(1);
        textView.setScaleY(1.1f);
        textView.setTextSize(LK5.LIZ(6.0f));
        textView.setLayoutParams(new ViewGroup.LayoutParams(LK5.LIZ(30.0f), LK5.LIZ(32.0f)));
        textView.setGravity(17);
        this.LIZIZ = textView;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(C116971W2r.LIZ(textView2.getResources(), 2131626090));
        textView2.setBackgroundResource(2130855583);
        textView2.setLayoutParams(new ViewGroup.LayoutParams(LK5.LIZ(30.0f), LK5.LIZ(32.0f)));
        textView2.setLines(1);
        textView2.setScaleY(1.1f);
        textView2.setTypeface(null, 1);
        textView2.setGravity(17);
        textView2.setTextSize(LK5.LIZ(6.0f));
        this.LIZJ = textView2;
        TextView textView3 = new TextView(context);
        textView3.setTextColor(C116971W2r.LIZ(textView3.getResources(), 2131626090));
        textView3.setGravity(17);
        textView3.setPadding(10, 10, 10, 10);
        textView3.setText(Constants.COLON_SEPARATOR);
        this.LIZLLL = textView3;
        setOrientation(0);
        addView(this.LIZIZ);
        addView(this.LIZLLL);
        addView(this.LIZJ);
        MethodCollector.m14707o(2065);
    }
}
