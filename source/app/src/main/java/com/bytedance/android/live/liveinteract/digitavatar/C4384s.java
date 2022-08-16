package com.bytedance.android.live.liveinteract.digitavatar;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.videotalk.emoji.model.C4929c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.digitavatar.s */
/* loaded from: classes3.dex */
public final class C4384s extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final HSImageView LIZIZ;
    public final TextView LIZJ;
    public C4929c LIZLLL;

    static {
        Covode.recordClassIndex(26715);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4384s(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        this.LIZIZ = (HSImageView) view2.findViewById(2131173853);
        View view3 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "");
        this.LIZJ = (TextView) view3.findViewById(2131173863);
    }
}
