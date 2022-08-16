package com.bytedance.android.live.p482ui;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bytedance.android.live.ui.PingFangSCTextView */
/* loaded from: classes22.dex */
public final class PingFangSCTextView extends AppCompatTextView {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(36325);
    }

    private final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        TextPaint paint = getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "");
        paint.setFakeBoldText(true);
    }

    public PingFangSCTextView(Context context) {
        super(context);
        LIZ();
    }

    public PingFangSCTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LIZ();
    }

    public PingFangSCTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LIZ();
    }
}
