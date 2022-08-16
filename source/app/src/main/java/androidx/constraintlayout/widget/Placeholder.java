package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.MotionEventCompat;
import com.bytedance.covode.number.Covode;

/* loaded from: classes22.dex */
public class Placeholder extends View {
    public View LIZIZ;
    public int LIZ = -1;
    public int LIZJ = 4;

    static {
        Covode.recordClassIndex(851);
    }

    public View getContent() {
        return this.LIZIZ;
    }

    public int getEmptyVisibility() {
        return this.LIZJ;
    }

    public void setEmptyVisibility(int i) {
        this.LIZJ = i;
    }

    public Placeholder(Context context) {
        super(context);
        LIZ(null);
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.LIZ == i) {
            return;
        }
        View view = this.LIZIZ;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.LIZIZ.getLayoutParams()).isInPlaceholder = false;
            this.LIZIZ = null;
        }
        this.LIZ = i;
        if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
            findViewById.setVisibility(8);
        }
    }

    private void LIZ(AttributeSet attributeSet) {
        super.setVisibility(this.LIZJ);
        this.LIZ = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{2130772784, 2130773058});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.LIZ = obtainStyledAttributes.getResourceId(index, this.LIZ);
                } else if (index == 1) {
                    this.LIZJ = obtainStyledAttributes.getInt(index, this.LIZJ);
                }
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(MotionEventCompat.ACTION_MASK, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LIZ(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LIZ(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        LIZ(attributeSet);
    }
}
