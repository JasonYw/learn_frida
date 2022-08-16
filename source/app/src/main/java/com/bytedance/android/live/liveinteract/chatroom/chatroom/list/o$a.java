package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.covode.number.Covode;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class o$a extends RecyclerView.ViewHolder {
    public FrameLayout LIZ;
    public VHeadView LIZIZ;
    public VHeadView LIZJ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public TextView f26286LJ;
    public HSImageView LJFF;
    public HSImageView LJI;
    public LinearLayout LJII;
    public TextView LJIIIIZZ;
    public TextView LJIIIZ;

    static {
        Covode.recordClassIndex(26254);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o$a(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131177581);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZ = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(2131178134);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZIZ = (VHeadView) findViewById2;
        View findViewById3 = view.findViewById(2131178135);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LIZJ = (VHeadView) findViewById3;
        View findViewById4 = view.findViewById(2131168639);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LIZLLL = (TextView) findViewById4;
        View findViewById5 = view.findViewById(2131172260);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.f26286LJ = (TextView) findViewById5;
        View findViewById6 = view.findViewById(2131177669);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LJFF = (HSImageView) findViewById6;
        View findViewById7 = view.findViewById(2131177624);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        this.LJI = (HSImageView) findViewById7;
        View findViewById8 = view.findViewById(2131177608);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "");
        this.LJII = (LinearLayout) findViewById8;
        View findViewById9 = view.findViewById(2131177607);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "");
        this.LJIIIIZZ = (TextView) findViewById9;
        View findViewById10 = view.findViewById(2131193958);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "");
        this.LJIIIZ = (TextView) findViewById10;
        Intrinsics.checkNotNullExpressionValue(view.findViewById(2131196238), "");
    }
}
