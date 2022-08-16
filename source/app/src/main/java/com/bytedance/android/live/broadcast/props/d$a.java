package com.bytedance.android.live.broadcast.props;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class d$a extends RecyclerView.ViewHolder {
    public final TextView LIZ;
    public final TextView LIZIZ;
    public final TextView LIZJ;
    public final TextView LIZLLL;

    static {
        Covode.recordClassIndex(17632);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d$a(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131193850);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZ = (TextView) findViewById;
        View findViewById2 = view.findViewById(2131193851);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZIZ = (TextView) findViewById2;
        View findViewById3 = view.findViewById(2131193849);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LIZJ = (TextView) findViewById3;
        View findViewById4 = view.findViewById(2131193852);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LIZLLL = (TextView) findViewById4;
    }
}
