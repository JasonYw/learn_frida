package com.bytedance.android.debug;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class a$a extends RecyclerView.ViewHolder {
    public TextView LIZ;

    static {
        Covode.recordClassIndex(11598);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a$a(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131167050);
        if (findViewById != null) {
            this.LIZ = (TextView) findViewById;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }
}
