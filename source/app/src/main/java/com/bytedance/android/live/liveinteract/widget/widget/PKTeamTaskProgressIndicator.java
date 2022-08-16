package com.bytedance.android.live.liveinteract.widget.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.LK5;

/* loaded from: classes12.dex */
public final class PKTeamTaskProgressIndicator extends View {
    public static ChangeQuickRedirect LIZ;
    public static final int LIZIZ = LK5.LIZ(3.0f);
    public static final int LIZJ = LK5.LIZ(20.0f);
    public static final int LIZLLL = LK5.LIZ(30.0f);

    /* renamed from: LJ */
    public static final int f26509LJ = LK5.LIZIZ(2131628469);
    public int LJFF;
    public final Paint LJI = new Paint();
    public final RectF LJII = new RectF();

    static {
        Covode.recordClassIndex(31944);
    }

    private final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJI.setAntiAlias(true);
        this.LJI.setStyle(Paint.Style.FILL);
        this.LJI.setColor(LK5.LIZIZ(2131629506));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PKTeamTaskProgressIndicator(Context context) {
        super(context);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2110);
        LIZ();
        MethodCollector.m14707o(2110);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        MethodCollector.m14708i(2109);
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(2109);
            return;
        }
        super.onDraw(canvas);
        RectF rectF = this.LJII;
        rectF.left = 0.0f;
        int i = LIZIZ;
        rectF.right = i;
        rectF.top = 0.0f;
        rectF.bottom = this.LJFF;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, i, i, this.LJI);
            MethodCollector.m14707o(2109);
            return;
        }
        MethodCollector.m14707o(2109);
    }

    public final void setupParams(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        if (z) {
            this.LJFF = LIZLLL;
            this.LJI.setColor(f26509LJ);
        } else {
            this.LJFF = LIZJ;
            this.LJI.setColor(LK5.LIZIZ(2131629506));
        }
        postInvalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PKTeamTaskProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2111);
        LIZ();
        MethodCollector.m14707o(2111);
    }
}
