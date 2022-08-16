package androidx.core.view;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.view.k */
/* loaded from: classes17.dex */
public interface AbstractC0254k extends NestedScrollingParent {
    static {
        Covode.recordClassIndex(1152);
    }

    void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3);

    void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5);

    void onNestedScrollAccepted(View view, View view2, int i, int i2);

    boolean onStartNestedScroll(View view, View view2, int i, int i2);

    void onStopNestedScroll(View view, int i);
}
