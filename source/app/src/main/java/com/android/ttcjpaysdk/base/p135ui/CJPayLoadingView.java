package com.android.ttcjpaysdk.base.p135ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: com.android.ttcjpaysdk.base.ui.CJPayLoadingView */
/* loaded from: classes25.dex */
public class CJPayLoadingView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public View LIZIZ;

    static {
        Covode.recordClassIndex(6600);
    }

    public final void LIZ() {
        View view;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported && (view = this.LIZIZ) != null) {
            view.setVisibility(0);
        }
    }

    public final void LIZIZ() {
        View view;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported && (view = this.LIZIZ) != null) {
            view.setVisibility(8);
        }
    }

    public CJPayLoadingView(Context context) {
        this(context, null);
    }

    public CJPayLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CJPayLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(410);
        if (!PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 1).isSupported) {
            this.LIZIZ = LayoutInflater.from(context).inflate(2131690757, this).findViewById(2131169899);
            this.LIZIZ.setVisibility(8);
            this.LIZIZ.setOnClickListener(new View.OnClickListener(this) { // from class: com.android.ttcjpaysdk.base.ui.CJPayLoadingView.1
                static {
                    Covode.recordClassIndex(6601);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
        }
        MethodCollector.m14707o(410);
    }
}
