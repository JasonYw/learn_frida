package com.bytedance.android.live.liveinteract.linkroomfight.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC80099Hhl;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class i$c extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public HSImageView LIZIZ;
    public ImageView LIZJ;
    public HSImageView LIZLLL;

    /* renamed from: LJ */
    public TextView f26333LJ;
    public TextView LJFF;
    public TextView LJI;
    public TextView LJII;
    public boolean LJIIIIZZ;
    public final AbstractC80099Hhl LJIIIZ;
    public final String LJIIJ;

    static {
        Covode.recordClassIndex(27542);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i$c(View view, AbstractC80099Hhl abstractC80099Hhl, String str) {
        super(view);
        C106862S5w.LIZ(view, abstractC80099Hhl, str);
        this.LJIIIZ = abstractC80099Hhl;
        this.LJIIJ = str;
        View findViewById = view.findViewById(2131166381);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = (HSImageView) findViewById;
        View findViewById2 = view.findViewById(2131181465);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZJ = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(2131181463);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LIZLLL = (HSImageView) findViewById3;
        View findViewById4 = view.findViewById(2131184122);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.f26333LJ = (TextView) findViewById4;
        View findViewById5 = view.findViewById(2131189802);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.LJFF = (TextView) findViewById5;
        View findViewById6 = view.findViewById(2131174572);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LJI = (TextView) findViewById6;
        View findViewById7 = view.findViewById(2131191080);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        this.LJII = (TextView) findViewById7;
    }
}
