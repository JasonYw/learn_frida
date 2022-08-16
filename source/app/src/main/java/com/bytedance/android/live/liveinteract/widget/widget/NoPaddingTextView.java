package com.bytedance.android.live.liveinteract.widget.widget;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.covode.number.Covode;

/* loaded from: classes3.dex */
public class NoPaddingTextView extends AppCompatTextView {
    static {
        Covode.recordClassIndex(31938);
    }

    public NoPaddingTextView(Context context) {
        this(context, null, 0);
    }

    public NoPaddingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NoPaddingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        paint.setTextSize(getTextSize());
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        setPadding(0, -Math.abs(fontMetricsInt.top - fontMetricsInt.ascent), 0, fontMetricsInt.top - fontMetricsInt.ascent);
    }
}
