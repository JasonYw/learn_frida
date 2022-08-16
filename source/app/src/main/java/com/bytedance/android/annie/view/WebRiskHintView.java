package com.bytedance.android.annie.view;

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
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC90724Lok;
import p003X.C106862S5w;
import p003X.C90746Lp6;

/* loaded from: classes8.dex */
public final class WebRiskHintView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public TextView LIZIZ;
    public ImageView LIZJ;
    public ViewGroup LIZLLL;

    static {
        Covode.recordClassIndex(11242);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebRiskHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView;
        C106862S5w.LIZ(context, attributeSet);
        MethodCollector.m14708i(958);
        C90746Lp6<Boolean> c90746Lp6 = AbstractC90724Lok.LJJIJIL;
        Intrinsics.checkNotNullExpressionValue(c90746Lp6, "");
        if (!c90746Lp6.LIZ().booleanValue()) {
            this.LIZLLL = (ViewGroup) LayoutInflater.from(getContext()).inflate(2131689761, this);
            ViewGroup viewGroup = this.LIZLLL;
            ImageView imageView = null;
            if (viewGroup != null) {
                textView = (TextView) viewGroup.findViewById(2131166934);
            } else {
                textView = null;
            }
            this.LIZIZ = textView;
            ViewGroup viewGroup2 = this.LIZLLL;
            this.LIZJ = viewGroup2 != null ? (ImageView) viewGroup2.findViewById(2131166932) : imageView;
            ImageView imageView2 = this.LIZJ;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.annie.view.WebRiskHintView.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(11243);
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ViewGroup viewGroup3;
                        if (!PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported && (viewGroup3 = WebRiskHintView.this.LIZLLL) != null) {
                            viewGroup3.setVisibility(8);
                        }
                    }
                });
                MethodCollector.m14707o(958);
                return;
            }
        }
        MethodCollector.m14707o(958);
    }
}
