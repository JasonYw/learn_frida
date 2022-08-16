package com.bytedance.android.live.liveinteract.interact.audience.p362ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bytedance.android.live.liveinteract.interact.audience.ui.StarView */
/* loaded from: classes22.dex */
public final class StarView extends View {
    public static ChangeQuickRedirect LIZ;
    public float LIZIZ;
    public final Drawable LIZJ;
    public final Drawable LIZLLL;

    static {
        Covode.recordClassIndex(27414);
    }

    public final float getPercent() {
        return this.LIZIZ;
    }

    public final Drawable getStarImageBg() {
        return this.LIZJ;
    }

    public final Drawable getStarImageCover() {
        return this.LIZLLL;
    }

    public final void setPercent(float f) {
        if (f >= 0.0f && f <= 1.0f) {
            this.LIZIZ = f;
        }
    }

    public StarView(Context context) {
        super(context);
        MethodCollector.m14708i(1882);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Drawable drawable = context2.getResources().getDrawable(2130857222);
        Intrinsics.checkNotNullExpressionValue(drawable, "");
        this.LIZJ = drawable;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Drawable drawable2 = context3.getResources().getDrawable(2130857223);
        Intrinsics.checkNotNullExpressionValue(drawable2, "");
        this.LIZLLL = drawable2;
        MethodCollector.m14707o(1882);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        MethodCollector.m14708i(1881);
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1881);
            return;
        }
        super.onDraw(canvas);
        if (canvas != null) {
            this.LIZJ.setBounds(0, 0, getWidth(), getHeight());
            this.LIZJ.draw(canvas);
            int save = canvas.save();
            canvas.clipRect(0, 0, (int) (getWidth() * this.LIZIZ), getHeight());
            this.LIZLLL.setBounds(0, 0, getWidth(), getHeight());
            this.LIZLLL.draw(canvas);
            canvas.restoreToCount(save);
            MethodCollector.m14707o(1881);
            return;
        }
        MethodCollector.m14707o(1881);
    }

    public StarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(1883);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Drawable drawable = context2.getResources().getDrawable(2130857222);
        Intrinsics.checkNotNullExpressionValue(drawable, "");
        this.LIZJ = drawable;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Drawable drawable2 = context3.getResources().getDrawable(2130857223);
        Intrinsics.checkNotNullExpressionValue(drawable2, "");
        this.LIZLLL = drawable2;
        MethodCollector.m14707o(1883);
    }

    public StarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1884);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Drawable drawable = context2.getResources().getDrawable(2130857222);
        Intrinsics.checkNotNullExpressionValue(drawable, "");
        this.LIZJ = drawable;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Drawable drawable2 = context3.getResources().getDrawable(2130857223);
        Intrinsics.checkNotNullExpressionValue(drawable2, "");
        this.LIZLLL = drawable2;
        MethodCollector.m14707o(1884);
    }
}
