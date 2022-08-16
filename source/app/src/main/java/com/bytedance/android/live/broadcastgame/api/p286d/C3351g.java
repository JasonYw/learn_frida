package com.bytedance.android.live.broadcastgame.api.p286d;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6508ci;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.api.d.g */
/* loaded from: classes12.dex */
public final class C3351g extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final HSImageView LIZIZ;
    public final TextView LIZJ;
    public final View LIZLLL;

    /* renamed from: LJ */
    public final View f26014LJ;
    public final View.OnClickListener LJFF;
    public final C6508ci LJI;

    static {
        Covode.recordClassIndex(19072);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3351g(View view, View.OnClickListener onClickListener, C6508ci c6508ci) {
        super(view);
        C106862S5w.LIZ(view, onClickListener, c6508ci);
        this.LJFF = onClickListener;
        this.LJI = c6508ci;
        View findViewById = view.findViewById(2131167533);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = (HSImageView) findViewById;
        View findViewById2 = view.findViewById(2131165259);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZJ = (TextView) findViewById2;
        View findViewById3 = view.findViewById(2131187532);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LIZLLL = findViewById3;
        View findViewById4 = view.findViewById(2131165784);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.f26014LJ = findViewById4;
    }
}
