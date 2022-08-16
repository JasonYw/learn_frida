package com.bytedance.android.live.broadcastgame.p291d;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.d.b */
/* loaded from: classes22.dex */
public final class C3464b extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final TextView LIZIZ;

    static {
        Covode.recordClassIndex(19680);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3464b(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131175897);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = (TextView) findViewById;
    }
}
