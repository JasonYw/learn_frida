package com.bytedance.android.live.liveinteract.linkroomfight.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.linkroomfight.p363a.C4444c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC78767H3h;
import p003X.C106862S5w;
import p003X.C414192aL;

/* loaded from: classes3.dex */
public final class e$a extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public C4444c LIZIZ;
    public HSImageView LIZJ;
    public HSImageView LIZLLL;

    /* renamed from: LJ */
    public TextView f26331LJ;
    public TextView LJFF;
    public View LJI;
    public TextView LJII;
    public View LJIIIIZZ;
    public TextView LJIIIZ;
    public TextView LJIIJ;
    public final AbstractC78767H3h LJIIJJI;

    static {
        Covode.recordClassIndex(27528);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e$a(View view, AbstractC78767H3h abstractC78767H3h) {
        super(view);
        C106862S5w.LIZ(view, abstractC78767H3h);
        this.LJIIJJI = abstractC78767H3h;
        View findViewById = view.findViewById(2131166381);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZJ = (HSImageView) findViewById;
        View findViewById2 = view.findViewById(2131166404);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZLLL = (HSImageView) findViewById2;
        View findViewById3 = view.findViewById(2131166434);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.f26331LJ = (TextView) findViewById3;
        View findViewById4 = view.findViewById(2131181377);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LJFF = (TextView) findViewById4;
        View findViewById5 = view.findViewById(2131196206);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.LJI = findViewById5;
        View findViewById6 = view.findViewById(2131196207);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LJII = (TextView) findViewById6;
        View findViewById7 = view.findViewById(2131188760);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        this.LJIIIIZZ = findViewById7;
        View findViewById8 = view.findViewById(2131188769);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "");
        this.LJIIIZ = (TextView) findViewById8;
        View findViewById9 = view.findViewById(2131178110);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "");
        this.LJIIJ = (TextView) findViewById9;
        this.LJIIJ.setOnClickListener(C414192aL.LIZ(0L, new LinkRoomFightInviteContentViewBinder$ContentViewHolder$1(this), 1, null));
    }
}
