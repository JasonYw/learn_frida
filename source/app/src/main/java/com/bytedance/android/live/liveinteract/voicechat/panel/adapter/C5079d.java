package com.bytedance.android.live.liveinteract.voicechat.panel.adapter;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413402Xu;
import p003X.AbstractC78172Grm;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C409882Kg;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.panel.adapter.d */
/* loaded from: classes3.dex */
public final class C5079d extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final HSImageView LIZIZ;
    public final TextView LIZJ;
    public final TextView LIZLLL;

    /* renamed from: LJ */
    public final ImageView f26500LJ;
    public final HSImageView LJFF;
    public final HSImageView LJI;
    public final TextView LJII;
    public final FrameLayout LJIIIIZZ;
    public final TextView LJIIIZ;
    public final AbstractC78172Grm LJIIJ;

    static {
        Covode.recordClassIndex(31652);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5079d(View view, AbstractC78172Grm abstractC78172Grm) {
        super(view);
        C2WC<Room> LIZ2;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        C106862S5w.LIZ(view);
        this.LJIIJ = abstractC78172Grm;
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        HSImageView hSImageView = (HSImageView) view2.findViewById(2131179063);
        Intrinsics.checkNotNullExpressionValue(hSImageView, "");
        this.LIZIZ = hSImageView;
        View view3 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "");
        TextView textView = (TextView) view3.findViewById(2131172009);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        this.LIZJ = textView;
        View view4 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view4, "");
        TextView textView2 = (TextView) view4.findViewById(2131185045);
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        this.LIZLLL = textView2;
        View view5 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view5, "");
        ImageView imageView = (ImageView) view5.findViewById(2131179019);
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        this.f26500LJ = imageView;
        View view6 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view6, "");
        HSImageView hSImageView2 = (HSImageView) view6.findViewById(2131179076);
        Intrinsics.checkNotNullExpressionValue(hSImageView2, "");
        this.LJFF = hSImageView2;
        View view7 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view7, "");
        HSImageView hSImageView3 = (HSImageView) view7.findViewById(2131194532);
        Intrinsics.checkNotNullExpressionValue(hSImageView3, "");
        this.LJI = hSImageView3;
        View view8 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view8, "");
        TextView textView3 = (TextView) view8.findViewById(2131194185);
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        this.LJII = textView3;
        View view9 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view9, "");
        FrameLayout frameLayout = (FrameLayout) view9.findViewById(2131174568);
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        this.LJIIIIZZ = frameLayout;
        View view10 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view10, "");
        TextView textView4 = (TextView) view10.findViewById(2131194099);
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        this.LJIIIZ = textView4;
        C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ3 != null && (LJIILJJIL = LIZ3.LJIILJJIL()) != null && (LIZIZ = LJIILJJIL.LIZIZ()) != null) {
            LIZIZ.booleanValue();
        }
        C5923dp LIZ4 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ4 != null && (LIZ2 = LIZ4.LIZ()) != null) {
            LIZ2.LIZ();
        }
    }
}
