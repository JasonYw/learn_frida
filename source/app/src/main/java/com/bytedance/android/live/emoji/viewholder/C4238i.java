package com.bytedance.android.live.emoji.viewholder;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC91105Lut;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.emoji.viewholder.i */
/* loaded from: classes5.dex */
public final class C4238i extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final HSImageView LIZIZ;
    public final HSImageView LIZJ;
    public final TextView LIZLLL;

    /* renamed from: LJ */
    public AbstractC91105Lut f26247LJ;

    static {
        Covode.recordClassIndex(24888);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4238i(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131191004);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = (HSImageView) findViewById;
        View findViewById2 = view.findViewById(2131191006);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZJ = (HSImageView) findViewById2;
        View findViewById3 = view.findViewById(2131191007);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LIZLLL = (TextView) findViewById3;
    }
}
