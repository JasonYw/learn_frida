package com.bytedance.android.live.liveinteract.interact.audience.emoji;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.videotalk.emoji.model.C4929c;
import com.bytedance.covode.number.Covode;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.interact.audience.emoji.h */
/* loaded from: classes3.dex */
public final class C4432h extends RecyclerView.ViewHolder {
    public C4929c LIZ;
    public final ConstraintLayout LIZIZ;
    public final HSImageView LIZJ;

    static {
        Covode.recordClassIndex(27189);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4432h(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        this.LIZIZ = (ConstraintLayout) view2.findViewById(2131166277);
        View view3 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "");
        this.LIZJ = (HSImageView) view3.findViewById(2131173853);
    }
}
