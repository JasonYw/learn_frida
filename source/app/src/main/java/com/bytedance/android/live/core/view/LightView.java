package com.bytedance.android.live.core.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public final class LightView extends View {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;

    static {
        Covode.recordClassIndex(24211);
    }

    public LightView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LightView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    public final boolean getNeedDraw() {
        return this.LIZIZ;
    }

    public final void setNeedDraw(boolean z) {
        this.LIZIZ = z;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        MethodCollector.m14708i(1631);
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1631);
            return;
        }
        if (this.LIZIZ) {
            super.draw(canvas);
        }
        MethodCollector.m14707o(1631);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LightView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1632);
        MethodCollector.m14707o(1632);
    }

    public /* synthetic */ LightView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
