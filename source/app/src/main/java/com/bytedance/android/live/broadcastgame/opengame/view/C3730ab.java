package com.bytedance.android.live.broadcastgame.opengame.view;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.view.ab */
/* loaded from: classes22.dex */
public final class C3730ab extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public TextView LIZIZ;
    public TextView LIZJ;
    public final Function0<Unit> LIZLLL;

    static {
        Covode.recordClassIndex(21176);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3730ab(View view, Function0<Unit> function0) {
        super(view);
        C106862S5w.LIZ(view, function0);
        this.LIZLLL = function0;
        View findViewById = view.findViewById(2131165279);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = (TextView) findViewById;
        View findViewById2 = view.findViewById(2131192207);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZJ = (TextView) findViewById2;
    }
}
