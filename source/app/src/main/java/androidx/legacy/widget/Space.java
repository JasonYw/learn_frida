package androidx.legacy.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* loaded from: classes10.dex */
public class Space extends View {
    static {
        Covode.recordClassIndex(1345);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public Space(Context context) {
        this(context, null);
    }

    public Space(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int LIZ(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0 && mode == 1073741824) {
                return size;
            }
            return i;
        }
        return Math.min(i, size);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(LIZ(getSuggestedMinimumWidth(), i), LIZ(getSuggestedMinimumHeight(), i2));
    }

    public Space(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }
}
