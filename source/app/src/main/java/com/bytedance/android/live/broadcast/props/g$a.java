package com.bytedance.android.live.broadcast.props;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class g$a extends RecyclerView.ViewHolder {
    public final TextView LIZ;
    public final ImageView LIZIZ;

    static {
        Covode.recordClassIndex(17641);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g$a(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131193420);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZ = (TextView) findViewById;
        View findViewById2 = view.findViewById(2131178498);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZIZ = (ImageView) findViewById2;
    }
}