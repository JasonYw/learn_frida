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

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.d.a */
/* loaded from: classes5.dex */
public final class C3766a extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final HSImageView LIZIZ;
    public final TextView LIZJ;
    public final View LIZLLL;

    /* renamed from: LJ */
    public final View f26103LJ;
    public final View LJFF;
    public final View LJI;
    public final AbstractC3743d LJII;

    static {
        Covode.recordClassIndex(21350);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3766a(View view, AbstractC3743d abstractC3743d) {
        super(view);
        C106862S5w.LIZ(view);
        this.LJII = abstractC3743d;
        View findViewById = view.findViewById(2131167533);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = (HSImageView) findViewById;
        View findViewById2 = view.findViewById(2131165259);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZJ = (TextView) findViewById2;
        View findViewById3 = view.findViewById(2131187532);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LIZLLL = findViewById3;
        View findViewById4 = view.findViewById(2131165784);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.f26103LJ = findViewById4;
        View findViewById5 = view.findViewById(2131172714);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.LJFF = findViewById5;
        View findViewById6 = view.findViewById(2131171662);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LJI = findViewById6;
    }
}
