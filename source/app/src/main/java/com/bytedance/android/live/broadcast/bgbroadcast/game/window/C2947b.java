package com.bytedance.android.live.broadcast.bgbroadcast.game.window;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.game.window.b */
/* loaded from: classes5.dex */
public final class C2947b extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public TextView LIZIZ;

    static {
        Covode.recordClassIndex(14877);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2947b(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131171162);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = (TextView) findViewById;
    }
}
