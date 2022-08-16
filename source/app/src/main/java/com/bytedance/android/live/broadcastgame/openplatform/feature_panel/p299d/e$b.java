package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.p299d;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C88239Kpl;
import p003X.View$OnClickListenerC88240Kpm;
import p003X.View$OnClickListenerC88241Kpn;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.d.e$b */
/* loaded from: classes5.dex */
public final class e$b extends RecyclerView.ViewHolder {
    public final TextView LIZ;
    public final /* synthetic */ C88239Kpl LIZIZ;
    public final ImageView LIZJ;

    static {
        Covode.recordClassIndex(21357);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e$b(C88239Kpl c88239Kpl, View view) {
        super(view);
        C106862S5w.LIZ(view);
        this.LIZIZ = c88239Kpl;
        View findViewById = view.findViewById(2131176758);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZ = (TextView) findViewById;
        View findViewById2 = view.findViewById(2131176753);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZJ = (ImageView) findViewById2;
        this.LIZJ.setOnClickListener(new View$OnClickListenerC88240Kpm(this));
        view.setOnClickListener(new View$OnClickListenerC88241Kpn(this));
    }
}
