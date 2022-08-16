package com.bytedance.android.live.broadcast.gamedetail.audience.p268a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.LCB;
import p003X.LHN;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.audience.a.a$a */
/* loaded from: classes5.dex */
public final class a$a extends RecyclerView.ViewHolder {
    public final HSImageView LIZ;
    public final TextView LIZIZ;
    public final TextView LIZJ;
    public final TextView LIZLLL;

    /* renamed from: LJ */
    public final TextView f25847LJ;
    public final TextView LJFF;

    static {
        Covode.recordClassIndex(16119);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a$a(LCB lcb, View view) {
        super(view);
        C106862S5w.LIZ(view);
        int LIZLLL = lcb.LIZJ ? (LHN.LIZLLL() - LK5.LIZ(47.0f)) / 4 : LK5.LIZ(86.0f);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = LIZLLL;
        layoutParams.height = (LIZLLL * 104) / 82;
        View findViewById = view.findViewById(2131168088);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZ = (HSImageView) findViewById;
        View findViewById2 = view.findViewById(2131194213);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZIZ = (TextView) findViewById2;
        View findViewById3 = view.findViewById(2131195061);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LIZJ = (TextView) findViewById3;
        View findViewById4 = view.findViewById(2131194992);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LIZLLL = (TextView) findViewById4;
        View findViewById5 = view.findViewById(2131194993);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.f25847LJ = (TextView) findViewById5;
        View findViewById6 = view.findViewById(2131194999);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LJFF = (TextView) findViewById6;
    }
}
