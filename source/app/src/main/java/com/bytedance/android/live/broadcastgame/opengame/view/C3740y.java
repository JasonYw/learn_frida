package com.bytedance.android.live.broadcastgame.opengame.view;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.view.y */
/* loaded from: classes5.dex */
public final class C3740y extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public TextView LIZIZ;
    public HSImageView LIZJ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public TextView f26100LJ;

    static {
        Covode.recordClassIndex(21277);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3740y(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131170086);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = (TextView) findViewById;
        View findViewById2 = view.findViewById(2131188380);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZJ = (HSImageView) findViewById2;
        View findViewById3 = view.findViewById(2131194722);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LIZLLL = (TextView) findViewById3;
        View findViewById4 = view.findViewById(2131172459);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.f26100LJ = (TextView) findViewById4;
    }
}
