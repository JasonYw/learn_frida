package androidx.core.view;

import com.bytedance.covode.number.Covode;

/* loaded from: classes15.dex */
public interface ScrollingView {
    static {
        Covode.recordClassIndex(1078);
    }

    int computeHorizontalScrollExtent();

    int computeHorizontalScrollOffset();

    int computeHorizontalScrollRange();

    int computeVerticalScrollExtent();

    int computeVerticalScrollOffset();

    int computeVerticalScrollRange();
}
