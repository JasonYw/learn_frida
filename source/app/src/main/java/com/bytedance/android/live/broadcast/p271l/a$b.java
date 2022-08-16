package com.bytedance.android.live.broadcast.p271l;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.download.DownloadView;
import com.bytedance.android.live.broadcast.gamedetail.order.view.ReserveButton;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.widget.FlowLayout;
import com.bytedance.covode.number.Covode;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.l.a$b */
/* loaded from: classes5.dex */
public final class a$b extends RecyclerView.ViewHolder {
    public final TextView LIZ;
    public final DownloadView LIZIZ;
    public final HSImageView LIZJ;
    public final View LIZLLL;

    /* renamed from: LJ */
    public final TextView f25906LJ;
    public final FlowLayout LJFF;
    public final ImageView LJI;
    public final HSImageView LJII;
    public final TextView LJIIIIZZ;
    public final TextView LJIIIZ;
    public final ReserveButton LJIIJ;

    static {
        Covode.recordClassIndex(16862);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a$b(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131194204);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZ = (TextView) findViewById;
        View findViewById2 = view.findViewById(2131172921);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZIZ = (DownloadView) findViewById2;
        View findViewById3 = view.findViewById(2131179010);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LIZJ = (HSImageView) findViewById3;
        View findViewById4 = view.findViewById(2131166677);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LIZLLL = findViewById4;
        View findViewById5 = view.findViewById(2131171900);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.f25906LJ = (TextView) findViewById5;
        View findViewById6 = view.findViewById(2131175201);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LJFF = (FlowLayout) findViewById6;
        View findViewById7 = view.findViewById(2131179226);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        this.LJI = (ImageView) findViewById7;
        View findViewById8 = view.findViewById(2131178529);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "");
        this.LJII = (HSImageView) findViewById8;
        View findViewById9 = view.findViewById(2131193475);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "");
        this.LJIIIIZZ = (TextView) findViewById9;
        View findViewById10 = view.findViewById(2131193935);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "");
        this.LJIIIZ = (TextView) findViewById10;
        View findViewById11 = view.findViewById(2131168715);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "");
        this.LJIIJ = (ReserveButton) findViewById11;
    }
}
