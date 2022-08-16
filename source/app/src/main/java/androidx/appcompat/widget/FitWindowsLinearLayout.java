package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import p003X.C4V4;
import p003X.C4V5;

/* loaded from: classes22.dex */
public class FitWindowsLinearLayout extends LinearLayout implements C4V5 {
    public C4V4 LIZ;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            Covode.recordClassIndex(637);
        } else {
            Covode.recordClassIndex(637);
        }
    }

    public FitWindowsLinearLayout(Context context) {
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

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
