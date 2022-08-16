package com.bytedance.android.live.broadcastgame.opengame.test;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.test.c */
/* loaded from: classes12.dex */
public final class C3729c extends RecyclerView.ViewHolder {
    public final TextView LIZ;
    public final LinearLayout LIZIZ;

    static {
        Covode.recordClassIndex(21131);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3729c(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131176305);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZ = (TextView) findViewById;
        View findViewById2 = view.findViewById(2131176259);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZIZ = (LinearLayout) findViewById2;
    }
}
