package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import p003X.C4V4;
import p003X.C4V5;

/* loaded from: classes22.dex */
public class FitWindowsFrameLayout extends FrameLayout implements C4V5 {
    public C4V4 LIZ;

    static {
        Covode.recordClassIndex(636);
    }

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    @Override // p003X.C4V5
    public void setOnFitSystemWindowsListener(C4V4 c4v4) {
        this.LIZ = c4v4;
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        C4V4 c4v4 = this.LIZ;
        if (c4v4 != null) {
            c4v4.LIZ(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
