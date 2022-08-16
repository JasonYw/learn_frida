package com.bytedance.android.live.broadcast.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.L5L;

/* renamed from: com.bytedance.android.live.broadcast.view.d */
/* loaded from: classes5.dex */
public final class C3253d extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public Function0<Unit> LIZIZ;
    public TextView LIZJ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public ImageView f25954LJ;

    static {
        Covode.recordClassIndex(18098);
    }

    public final void LIZ() {
        TextView textView;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported && (textView = this.LIZLLL) != null) {
            textView.setVisibility(8);
        }
    }

    public final void setImageLayoutParams(LinearLayout.LayoutParams layoutParams) {
        if (PatchProxy.proxy(new Object[]{layoutParams}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(layoutParams);
        ImageView imageView = this.f25954LJ;
        if (imageView != null) {
            imageView.setLayoutParams(layoutParams);
        }
    }

    public final void setImageRes(Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(drawable);
        ImageView imageView = this.f25954LJ;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public final void setMsgText(String str) {
        TextView textView;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported && (textView = this.LIZJ) != null) {
            textView.setText(str);
        }
    }

    public final void setMsgTextColor(int i) {
        TextView textView;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 2).isSupported && (textView = this.LIZJ) != null) {
            textView.setTextColor(i);
        }
    }

    public final void setMsgTextSize(float f) {
        TextView textView;
        if (!PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 3).isSupported && (textView = this.LIZJ) != null) {
            textView.setTextSize(f);
        }
    }

    public final void setOnRetryClickListener(Function0<Unit> function0) {
        if (PatchProxy.proxy(new Object[]{function0}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(function0);
        this.LIZIZ = function0;
    }

    public final void setRetryButtonBackground(Drawable drawable) {
        TextView textView;
        if (!PatchProxy.proxy(new Object[]{drawable}, this, LIZ, false, 5).isSupported && (textView = this.LIZLLL) != null) {
            textView.setBackground(drawable);
        }
    }

    public final void setRetryButtonTextColor(int i) {
        TextView textView;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 7).isSupported && (textView = this.LIZLLL) != null) {
            textView.setTextColor(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3253d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1352);
        this.LIZIZ = CommonErrorView$mAction$1.INSTANCE;
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(context), 2131699115, (ViewGroup) this, false);
        this.LIZJ = (TextView) LIZ2.findViewById(2131194211);
        this.LIZLLL = (TextView) LIZ2.findViewById(2131194212);
        this.f25954LJ = (ImageView) LIZ2.findViewById(2131179018);
        TextView textView = this.LIZLLL;
        if (textView != null) {
            textView.setOnClickListener(new L5L(this));
        }
        addView(LIZ2);
        MethodCollector.m14707o(1352);
    }

    public /* synthetic */ C3253d(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, null, 0);
    }
}
