package com.bytedance.android.live.broadcast.promotelist;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.L31;
import p003X.L32;

/* loaded from: classes5.dex */
public final class a$b extends RecyclerView.ViewHolder {
    public final TextView LIZ;
    public final /* synthetic */ L32 LIZIZ;

    static {
        Covode.recordClassIndex(17521);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a$b(L32 l32, View view) {
        super(view);
        C106862S5w.LIZ(view);
        this.LIZIZ = l32;
        View findViewById = view.findViewById(2131193844);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZ = (TextView) findViewById;
        view.setOnClickListener(new L31(this));
    }
}
