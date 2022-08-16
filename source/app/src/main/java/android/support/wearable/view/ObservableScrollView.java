package android.support.wearable.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC130366aqx;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* loaded from: classes16.dex */
public class ObservableScrollView extends ScrollView {
    public AbstractC130366aqx LIZ;

    static {
        Covode.recordClassIndex(329);
    }

    public void setOnScrollListener(AbstractC130366aqx abstractC130366aqx) {
        this.LIZ = abstractC130366aqx;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C140192dPo.LIZ("dispatchScrollViewTouchEvent")) {
            C140181dPd.LJFF();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }
}
