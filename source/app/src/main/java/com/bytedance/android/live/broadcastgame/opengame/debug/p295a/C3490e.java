package com.bytedance.android.live.broadcastgame.opengame.debug.p295a;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.debug.a.e */
/* loaded from: classes5.dex */
public final class C3490e extends RecyclerView.ViewHolder {
    public final TextView LIZ;
    public final SwitchCompat LIZIZ;

    static {
        Covode.recordClassIndex(20096);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3490e(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131171295);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZ = (TextView) findViewById;
        View findViewById2 = view.findViewById(2131191329);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZIZ = (SwitchCompat) findViewById2;
    }
}
