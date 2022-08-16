package com.bytedance.android.live.broadcast.promotelist;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.LA9;

/* loaded from: classes5.dex */
public final class p$a$a extends RecyclerView.ViewHolder {
    public final ImageView LIZ;
    public final TextView LIZIZ;
    public final View LIZJ;

    static {
        Covode.recordClassIndex(17553);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p$a$a(LA9 la9, View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131168088);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZ = (ImageView) findViewById;
        View findViewById2 = view.findViewById(2131172009);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZIZ = (TextView) findViewById2;
        View findViewById3 = view.findViewById(2131197035);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LIZJ = findViewById3;
    }
}
