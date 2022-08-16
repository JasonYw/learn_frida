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
import p003X.C106862S5w;
import p003X.C116971W2r;

/* renamed from: com.bytedance.android.live.broadcast.view.c */
/* loaded from: classes22.dex */
public final class C3252c extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public TextView LIZIZ;
    public ImageView LIZJ;

    static {
        Covode.recordClassIndex(18097);
    }

    public final void setImageLayoutParams(LinearLayout.LayoutParams layoutParams) {
        if (PatchProxy.proxy(new Object[]{layoutParams}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(layoutParams);
        ImageView imageView = this.LIZJ;
        if (imageView != null) {
            imageView.setLayoutParams(layoutParams);
        }
    }

    public final void setImageRes(Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(drawable);
        ImageView imageView = this.LIZJ;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public final void setMsgText(String str) {
        TextView textView;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported && (textView = this.LIZIZ) != null) {
            textView.setText(str);
        }
    }

    public final void setMsgTextColor(int i) {
        TextView textView;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1).isSupported && (textView = this.LIZIZ) != null) {
            textView.setTextColor(i);
        }
    }

    public final void setMsgTextSize(float f) {
        TextView textView;
        if (!PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 3).isSupported && (textView = this.LIZIZ) != null) {
            textView.setTextSize(f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3252c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1351);
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(context), 2131699113, (ViewGroup) this, false);
        this.LIZIZ = (TextView) LIZ2.findViewById(2131194210);
        this.LIZJ = (ImageView) LIZ2.findViewById(2131179017);
        addView(LIZ2);
        MethodCollector.m14707o(1351);
    }

    public /* synthetic */ C3252c(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, null, 0);
    }
}
