package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class w$a extends RecyclerView.ViewHolder {
    public final TextView LIZ;

    static {
        Covode.recordClassIndex(26271);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w$a(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131194081);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZ = (TextView) findViewById;
    }
}
