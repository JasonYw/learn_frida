package com.bytedance.android.live.broadcast.promotelist;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C89110L9c;
import p003X.View$OnClickListenerC89116L9i;

/* loaded from: classes5.dex */
public final class q$b extends RecyclerView.ViewHolder {
    public final HSImageView LIZ;
    public final /* synthetic */ C89110L9c LIZIZ;

    static {
        Covode.recordClassIndex(17572);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q$b(C89110L9c c89110L9c, View view) {
        super(view);
        C106862S5w.LIZ(view);
        this.LIZIZ = c89110L9c;
        View findViewById = view.findViewById(2131179307);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZ = (HSImageView) findViewById;
        view.setOnClickListener(new View$OnClickListenerC89116L9i(this));
    }
}
