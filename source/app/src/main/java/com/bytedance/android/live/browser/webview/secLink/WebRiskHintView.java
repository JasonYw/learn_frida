package com.bytedance.android.live.browser.webview.secLink;

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
import p003X.C106862S5w;

/* loaded from: classes22.dex */
public final class WebRiskHintView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public TextView LIZIZ;
    public ViewGroup LIZJ = (ViewGroup) LayoutInflater.from(getContext()).inflate(2131700789, this);
    public ImageView LIZLLL;

    static {
        Covode.recordClassIndex(23235);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebRiskHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView;
        C106862S5w.LIZ(context, attributeSet);
        MethodCollector.m14708i(1559);
        ViewGroup viewGroup = this.LIZJ;
        ImageView imageView = null;
        if (viewGroup != null) {
            textView = (TextView) viewGroup.findViewById(2131193243);
        } else {
            textView = null;
        }
        this.LIZIZ = textView;
        ViewGroup viewGroup2 = this.LIZJ;
        this.LIZLLL = viewGroup2 != null ? (ImageView) viewGroup2.findViewById(2131193241) : imageView;
        ImageView imageView2 = this.LIZLLL;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.live.browser.webview.secLink.WebRiskHintView.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(23236);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewGroup viewGroup3;
                    if (!PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported && (viewGroup3 = WebRiskHintView.this.LIZJ) != null) {
                        viewGroup3.setVisibility(8);
                    }
                }
            });
            MethodCollector.m14707o(1559);
            return;
        }
        MethodCollector.m14707o(1559);
    }
}
