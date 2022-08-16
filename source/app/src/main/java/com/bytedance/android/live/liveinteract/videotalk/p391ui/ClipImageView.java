package com.bytedance.android.live.liveinteract.videotalk.p391ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;
import p003X.C499305oK;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.ClipImageView */
/* loaded from: classes3.dex */
public final class ClipImageView extends HSImageView {
    public static ChangeQuickRedirect LIZIZ;
    public Path LIZJ;

    static {
        Covode.recordClassIndex(30444);
    }

    public ClipImageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ClipImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final Path getMClipPath() {
        return this.LIZJ;
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 7).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZIZ, true, 6).isSupported) {
            if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 8).isSupported) {
                super.onDetachedFromWindow();
            }
            C499305oK.LIZ(this);
        }
    }

    public final void setMClipPath(Path path) {
        if (PatchProxy.proxy(new Object[]{path}, this, LIZIZ, false, 1).isSupported) {
            return;
        }
        this.LIZJ = path;
        invalidate();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZIZ, false, 3).isSupported) {
            return;
        }
        Path path = this.LIZJ;
        if (path != null && canvas != null) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        super.draw(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
    }

    public /* synthetic */ ClipImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
