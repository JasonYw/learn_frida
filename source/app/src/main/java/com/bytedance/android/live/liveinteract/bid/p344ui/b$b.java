package com.bytedance.android.live.liveinteract.bid.p344ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.bid.ui.b$b */
/* loaded from: classes3.dex */
public final class b$b extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(new BidStartViewBinder$BidStartUserViewHolder$startPriceTv$2(this));

    static {
        Covode.recordClassIndex(25266);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b$b(View view) {
        super(view);
        C106862S5w.LIZ(view);
    }
}
