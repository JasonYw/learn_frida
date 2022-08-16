package com.android.ttcjpaysdk.base.p135ui.widget;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import p003X.C106862S5w;

/* renamed from: com.android.ttcjpaysdk.base.ui.widget.FakeBoldColorSpan */
/* loaded from: classes22.dex */
public final class FakeBoldColorSpan extends ForegroundColorSpan {
    public static ChangeQuickRedirect LIZ;
    public final float LIZIZ;

    static {
        Covode.recordClassIndex(6692);
    }

    public FakeBoldColorSpan() {
        this(0.0f, 0, 3);
    }

    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (PatchProxy.proxy(new Object[]{textPaint}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(textPaint);
        super.updateDrawState(textPaint);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint.setStrokeWidth(this.LIZIZ);
    }

    public FakeBoldColorSpan(float f, int i) {
        super(i);
        this.LIZIZ = f;
    }

    public /* synthetic */ FakeBoldColorSpan(float f, int i, int i2) {
        this((i2 & 1) != 0 ? 0.5f : f, (i2 & 2) != 0 ? CastProtectorUtils.parseColor("#161823") : i);
    }
}
