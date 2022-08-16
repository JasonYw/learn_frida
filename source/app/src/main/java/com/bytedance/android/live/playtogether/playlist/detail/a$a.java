package com.bytedance.android.live.playtogether.playlist.detail;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public final class a$a extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final HSImageView LIZIZ;
    public final TextView LIZJ;
    public final TextView LIZLLL;

    /* renamed from: LJ */
    public final ImageView f26548LJ;
    public final LinearLayout LJFF;
    public final TextView LJI;
    public final View LJII;

    static {
        Covode.recordClassIndex(33054);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a$a(View view) {
        super(view);
        C106862S5w.LIZ(view);
        this.LJII = view;
        View findViewById = this.LJII.findViewById(2131193066);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = (HSImageView) findViewById;
        View findViewById2 = this.LJII.findViewById(2131193070);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZJ = (TextView) findViewById2;
        this.LIZLLL = (TextView) this.LJII.findViewById(2131193071);
        this.f26548LJ = (ImageView) this.LJII.findViewById(2131193065);
        this.LJFF = (LinearLayout) this.LJII.findViewById(2131193063);
        this.LJI = (TextView) this.LJII.findViewById(2131193064);
    }
}
