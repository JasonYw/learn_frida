package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.plantform.model.C4824t;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.View$OnClickListenerC78290Gtg;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder.ak */
/* loaded from: classes3.dex */
public final class C4337ak extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final TextView LIZIZ;
    public final HSImageView LIZJ;
    public final TextView LIZLLL;

    /* renamed from: LJ */
    public final HSImageView f26279LJ;
    public final HSImageView LJFF;
    public final LinearLayout LJI;
    public final TextView LJII;
    public final TextView LJIIIIZZ;
    public final TextView LJIIIZ;
    public C4824t LJIIJ;

    static {
        Covode.recordClassIndex(26103);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4337ak(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        this.LIZIZ = (TextView) view2.findViewById(2131194754);
        View view3 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "");
        this.LIZJ = (HSImageView) view3.findViewById(2131179063);
        View view4 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view4, "");
        this.LIZLLL = (TextView) view4.findViewById(2131172009);
        View view5 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view5, "");
        this.f26279LJ = (HSImageView) view5.findViewById(2131179162);
        View view6 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view6, "");
        this.LJFF = (HSImageView) view6.findViewById(2131179076);
        View view7 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view7, "");
        this.LJI = (LinearLayout) view7.findViewById(2131174568);
        View view8 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view8, "");
        this.LJII = (TextView) view8.findViewById(2131194099);
        View view9 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view9, "");
        this.LJIIIIZZ = (TextView) view9.findViewById(2131171823);
        View view10 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view10, "");
        this.LJIIIZ = (TextView) view10.findViewById(2131194352);
        TextView textView = this.LJIIIZ;
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC78290Gtg(this));
        }
    }
}
