package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class p$a extends RecyclerView.ViewHolder {
    public final HSImageView LIZ;
    public final View LIZIZ;
    public final TextView LIZJ;
    public final TextView LIZLLL;

    /* renamed from: LJ */
    public final LinearLayout f26287LJ;
    public final SimpleDraweeView LJFF;

    static {
        Covode.recordClassIndex(26258);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p$a(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131177580);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZ = (HSImageView) findViewById;
        View findViewById2 = view.findViewById(2131196430);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZIZ = findViewById2;
        View findViewById3 = view.findViewById(2131194722);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LIZJ = (TextView) findViewById3;
        View findViewById4 = view.findViewById(2131168639);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LIZLLL = (TextView) findViewById4;
        View findViewById5 = view.findViewById(2131166895);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.f26287LJ = (LinearLayout) findViewById5;
        View findViewById6 = view.findViewById(2131168924);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LJFF = (SimpleDraweeView) findViewById6;
    }
}
