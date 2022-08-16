package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.p299d;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcastgame.openplatform.feature_panel.p298b.AbstractC3743d;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.d.d */
/* loaded from: classes5.dex */
public final class C3767d extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final TextView LIZIZ;
    public final TextView LIZJ;
    public final HSImageView LIZLLL;

    /* renamed from: LJ */
    public final View f26104LJ;
    public final View LJFF;
    public final View LJI;
    public final View LJII;
    public final AbstractC3743d LJIIIIZZ;

    static {
        Covode.recordClassIndex(21354);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3767d(View view, AbstractC3743d abstractC3743d) {
        super(view);
        C106862S5w.LIZ(view);
        this.LJIIIIZZ = abstractC3743d;
        this.LIZIZ = (TextView) view.findViewById(2131195858);
        this.LIZJ = (TextView) view.findViewById(2131195859);
        this.LIZLLL = (HSImageView) view.findViewById(2131177052);
        View findViewById = view.findViewById(2131187532);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.f26104LJ = findViewById;
        View findViewById2 = view.findViewById(2131165784);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LJFF = findViewById2;
        View findViewById3 = view.findViewById(2131172714);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LJI = findViewById3;
        View findViewById4 = view.findViewById(2131171662);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LJII = findViewById4;
    }
}
