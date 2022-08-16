package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.bytedance.covode.number.Covode;
import p003X.C138249cuS;
import p003X.C138270cun;

/* loaded from: classes10.dex */
public class AppCompatSeekBar extends SeekBar {
    public final C138249cuS mAppCompatSeekBarHelper;

    static {
        Covode.recordClassIndex(618);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        C138249cuS c138249cuS = this.mAppCompatSeekBarHelper;
        if (c138249cuS.LIZJ != null) {
            c138249cuS.LIZJ.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C138249cuS c138249cuS = this.mAppCompatSeekBarHelper;
        Drawable drawable = c138249cuS.LIZJ;
        if (drawable != null && drawable.isStateful() && drawable.setState(c138249cuS.LIZIZ.getDrawableState())) {
            c138249cuS.LIZIZ.invalidateDrawable(drawable);
        }
    }

    public AppCompatSeekBar(Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        C138249cuS c138249cuS = this.mAppCompatSeekBarHelper;
        if (c138249cuS.LIZJ != null) {
            int max = c138249cuS.LIZIZ.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = c138249cuS.LIZJ.getIntrinsicWidth();
                int intrinsicHeight = c138249cuS.LIZJ.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                c138249cuS.LIZJ.setBounds(-i, -i2, i, i2);
                float width = ((c138249cuS.LIZIZ.getWidth() - c138249cuS.LIZIZ.getPaddingLeft()) - c138249cuS.LIZIZ.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(c138249cuS.LIZIZ.getPaddingLeft(), c138249cuS.LIZIZ.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    c138249cuS.LIZJ.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130774340);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C138270cun.LIZ(getContext());
        this.mAppCompatSeekBarHelper = new C138249cuS(this);
        this.mAppCompatSeekBarHelper.LIZ(attributeSet, i);
    }
}
