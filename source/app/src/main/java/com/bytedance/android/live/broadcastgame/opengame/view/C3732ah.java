package com.bytedance.android.live.broadcastgame.opengame.view;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.view.ah */
/* loaded from: classes5.dex */
public final class C3732ah extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public TextView LIZIZ;

    static {
        Covode.recordClassIndex(21189);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3732ah(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131195575);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = (TextView) findViewById;
    }
}
