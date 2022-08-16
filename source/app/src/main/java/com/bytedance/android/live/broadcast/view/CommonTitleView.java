package com.bytedance.android.live.broadcast.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;

/* loaded from: classes.dex */
public final class CommonTitleView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public View LIZIZ;
    public TextView LIZJ;
    public ImageView LIZLLL;

    static {
        Covode.recordClassIndex(18082);
    }

    public CommonTitleView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommonTitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setTitle(String str) {
        TextView textView;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported && (textView = this.LIZJ) != null) {
            textView.setText(str);
        }
    }

    public final void setOnBackClickListener(final Function0<Unit> function0) {
        if (PatchProxy.proxy(new Object[]{function0}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(function0);
        ImageView imageView = this.LIZLLL;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: X.1ea
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18083);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    Function0.this.mo30099invoke();
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1342);
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(context), 2131699240, (ViewGroup) this, true);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        this.LIZIZ = LIZ2;
        this.LIZJ = (TextView) this.LIZIZ.findViewById(2131194198);
        this.LIZLLL = (ImageView) this.LIZIZ.findViewById(2131178761);
        MethodCollector.m14707o(1342);
    }

    public /* synthetic */ CommonTitleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
