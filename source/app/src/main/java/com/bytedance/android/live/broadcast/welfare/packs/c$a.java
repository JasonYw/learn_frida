package com.bytedance.android.live.broadcast.welfare.packs;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class c$a extends RecyclerView.ViewHolder {
    public final HSImageView LIZ;
    public final TextView LIZIZ;
    public final TextView LIZJ;
    public final Button LIZLLL;

    static {
        Covode.recordClassIndex(18244);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c$a(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131176943);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZ = (HSImageView) findViewById;
        View findViewById2 = view.findViewById(2131194811);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZIZ = (TextView) findViewById2;
        View findViewById3 = view.findViewById(2131194810);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LIZJ = (TextView) findViewById3;
        View findViewById4 = view.findViewById(2131168847);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LIZLLL = (Button) findViewById4;
    }
}
