package com.bytedance.android.live.broadcast.promotelist;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C89056L7a;
import p003X.L8G;

/* loaded from: classes5.dex */
public final class f$b extends RecyclerView.ViewHolder {
    public final HSImageView LIZ;
    public final TextView LIZIZ;
    public final /* synthetic */ C89056L7a LIZJ;

    static {
        Covode.recordClassIndex(17530);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f$b(C89056L7a c89056L7a, View view) {
        super(view);
        C106862S5w.LIZ(view);
        this.LIZJ = c89056L7a;
        View findViewById = view.findViewById(2131179307);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZ = (HSImageView) findViewById;
        View findViewById2 = view.findViewById(2131193431);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZIZ = (TextView) findViewById2;
        view.setOnClickListener(new L8G(this));
    }
}
