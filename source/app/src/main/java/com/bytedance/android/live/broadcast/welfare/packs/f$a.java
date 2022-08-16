package com.bytedance.android.live.broadcast.welfare.packs;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public final class f$a extends RecyclerView.ViewHolder {
    public final HSImageView LIZ;

    static {
        Covode.recordClassIndex(18271);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f$a(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131168088);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZ = (HSImageView) findViewById;
    }
}
