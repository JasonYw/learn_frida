package com.bytedance.android.live.playtogether.playlist;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.LT9;

/* loaded from: classes5.dex */
public final class a$a extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final HSImageView LIZIZ;
    public final TextView LIZJ;
    public final TextView LIZLLL;

    /* renamed from: LJ */
    public final TextView f26546LJ;
    public final TextView LJFF;
    public final TextView LJI;
    public final View LJII;
    public final LT9 LJIIIIZZ;

    static {
        Covode.recordClassIndex(33036);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a$a(View view, LT9 lt9) {
        super(view);
        C106862S5w.LIZ(view);
        this.LJII = view;
        this.LJIIIIZZ = lt9;
        View findViewById = this.LJII.findViewById(2131179346);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = (HSImageView) findViewById;
        View findViewById2 = this.LJII.findViewById(2131194889);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZJ = (TextView) findViewById2;
        View findViewById3 = this.LJII.findViewById(2131194890);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LIZLLL = (TextView) findViewById3;
        View findViewById4 = this.LJII.findViewById(2131194888);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.f26546LJ = (TextView) findViewById4;
        View findViewById5 = this.LJII.findViewById(2131194892);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.LJFF = (TextView) findViewById5;
        View findViewById6 = this.LJII.findViewById(2131194891);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LJI = (TextView) findViewById6;
    }
}
