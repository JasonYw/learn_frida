package com.bytedance.android.live.media.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public final class FadingEdgeHorizontalScrollView extends HorizontalScrollView {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;

    static {
        Covode.recordClassIndex(32424);
    }

    public FadingEdgeHorizontalScrollView(Context context) {
        this(context, null, 0, 6, null);
    }

    public FadingEdgeHorizontalScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final boolean getNeedLeftEdge() {
        return this.LIZIZ;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final float getLeftFadingEdgeStrength() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        if (this.LIZIZ) {
            return super.getLeftFadingEdgeStrength();
        }
        return 0.0f;
    }

    public final void setNeedLeftEdge(boolean z) {
        this.LIZIZ = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FadingEdgeHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2138);
        this.LIZIZ = true;
        MethodCollector.m14707o(2138);
    }

    public /* synthetic */ FadingEdgeHorizontalScrollView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
