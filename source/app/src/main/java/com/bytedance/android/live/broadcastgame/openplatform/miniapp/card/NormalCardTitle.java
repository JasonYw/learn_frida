package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;
import p003X.C116971W2r;

/* loaded from: classes22.dex */
public final class NormalCardTitle extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public final TextView LIZIZ;
    public final TextView LIZJ;

    static {
        Covode.recordClassIndex(21603);
    }

    public NormalCardTitle(Context context) {
        this(context, null, 0, 6, null);
    }

    public NormalCardTitle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setUpSubTitleView(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported) {
            return;
        }
        if (this.LIZIZ.getParent() == null) {
            addView(this.LIZIZ, new LinearLayout.LayoutParams(-1, -2));
            this.LIZIZ.setEllipsize(TextUtils.TruncateAt.END);
            this.LIZIZ.setTextSize(1, 11.0f);
        }
        this.LIZIZ.setTextColor(C116971W2r.LIZ(getContext(), 2131629070));
        this.LIZIZ.setMaxLines(1);
        this.LIZIZ.setText(str);
    }

    public final void LIZ(int i, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, LIZ, false, 1).isSupported) {
            return;
        }
        if (this.LIZJ.getParent() == null) {
            addView(this.LIZJ, new LinearLayout.LayoutParams(-1, -2));
            this.LIZJ.setEllipsize(TextUtils.TruncateAt.END);
            this.LIZJ.setTextSize(1, 11.0f);
        }
        this.LIZJ.setTextColor(C116971W2r.LIZ(getContext(), 2131628183));
        this.LIZJ.setMaxLines(i);
        this.LIZJ.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalCardTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1508);
        setOrientation(1);
        this.LIZJ = new TextView(context);
        this.LIZIZ = new TextView(context);
        MethodCollector.m14707o(1508);
    }

    public /* synthetic */ NormalCardTitle(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
