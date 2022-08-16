package com.bytedance.android.live.broadcast.gamedetail.order.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC450853sN;
import p003X.C106862S5w;
import p003X.LK1;

/* loaded from: classes12.dex */
public final class ReserveButton extends ConstraintLayout {
    public static ChangeQuickRedirect LIZ;
    public AbstractC450853sN LIZIZ;
    public TextView LIZJ;
    public ProcessView LIZLLL;

    static {
        Covode.recordClassIndex(16545);
    }

    public ReserveButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public ReserveButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final AbstractC450853sN getConfig() {
        return this.LIZIZ;
    }

    public final void LIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported && this.LIZIZ != null) {
            ProcessView processView = this.LIZLLL;
            if (processView != null) {
                LK1.LIZJ(processView);
            }
            TextView textView = this.LIZJ;
            if (textView != null) {
                LK1.LIZ(textView);
            }
            ProcessView processView2 = this.LIZLLL;
            if (processView2 != null) {
                processView2.LIZ();
            }
        }
    }

    public final void LIZIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported && this.LIZIZ != null) {
            ProcessView processView = this.LIZLLL;
            if (processView != null) {
                LK1.LIZ(processView);
            }
            ProcessView processView2 = this.LIZLLL;
            if (processView2 != null) {
                processView2.LIZIZ();
            }
            TextView textView = this.LIZJ;
            if (textView != null) {
                LK1.LIZJ(textView);
            }
        }
    }

    public final void setConfig(AbstractC450853sN abstractC450853sN) {
        AbstractC450853sN abstractC450853sN2;
        TextView textView;
        AbstractC450853sN abstractC450853sN3;
        ProcessView processView;
        AbstractC450853sN abstractC450853sN4;
        AbstractC450853sN abstractC450853sN5;
        if (PatchProxy.proxy(new Object[]{abstractC450853sN}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZIZ = abstractC450853sN;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported && (abstractC450853sN5 = this.LIZIZ) != null) {
            TextView textView2 = this.LIZJ;
            if (textView2 != null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                textView2.setText(abstractC450853sN5.LIZ(context));
            }
            TextView textView3 = this.LIZJ;
            if (textView3 != null) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                textView3.setTextColor(abstractC450853sN5.LIZJ(context2));
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && (abstractC450853sN4 = this.LIZIZ) != null) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            setBackground(abstractC450853sN4.LIZIZ(context3));
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported && (abstractC450853sN3 = this.LIZIZ) != null && (processView = this.LIZLLL) != null) {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            processView.setColor(abstractC450853sN3.LIZJ(context4));
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported && (abstractC450853sN2 = this.LIZIZ) != null && (textView = this.LIZJ) != null) {
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            textView.setCompoundDrawablesWithIntrinsicBounds(abstractC450853sN2.LIZLLL(context5), (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReserveButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1278);
        View.inflate(context, 2131699304, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130773659, 2130774762});
        this.LIZJ = (TextView) findViewById(2131171823);
        this.LIZLLL = (ProcessView) findViewById(2131186340);
        TextView textView = this.LIZJ;
        if (textView != null) {
            textView.setTextSize(0, obtainStyledAttributes.getDimension(1, LK1.LIZJ(12)));
        }
        ProcessView processView = this.LIZLLL;
        if (processView != null) {
            processView.setStrokeWidth(obtainStyledAttributes.getDimension(0, LK1.LIZJ(4)));
            MethodCollector.m14707o(1278);
            return;
        }
        MethodCollector.m14707o(1278);
    }

    public /* synthetic */ ReserveButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
