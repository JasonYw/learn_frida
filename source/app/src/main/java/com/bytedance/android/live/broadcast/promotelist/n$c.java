package com.bytedance.android.live.broadcast.promotelist;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.download.DownloadView;
import com.bytedance.android.live.broadcast.gamedetail.order.view.ReserveButton;
import com.bytedance.android.live.broadcast.view.GamePromoteCommonRatingBar;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.config.C6837at;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.widget.FlowLayout;
import com.bytedance.covode.number.Covode;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class n$c extends RecyclerView.ViewHolder {
    public final TextView LIZ;
    public final DownloadView LIZIZ;
    public final ReserveButton LIZJ;
    public final TextView LIZLLL;

    /* renamed from: LJ */
    public final HSImageView f25929LJ;
    public final View LJFF;
    public final TextView LJI;
    public final FlowLayout LJII;
    public final FlowLayout LJIIIIZZ;
    public final FlowLayout LJIIIZ;
    public final GamePromoteCommonRatingBar LJIIJ;
    public final TextView LJIIJJI;
    public final ViewGroup LJIIL;
    public final TextView LJIILIIL;
    public final RecyclerView LJIILJJIL;
    public final View LJIILL;

    static {
        Covode.recordClassIndex(17544);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n$c(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131194204);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZ = (TextView) findViewById;
        View findViewById2 = view.findViewById(2131172922);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZIZ = (DownloadView) findViewById2;
        View findViewById3 = view.findViewById(2131168696);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LIZJ = (ReserveButton) findViewById3;
        View findViewById4 = view.findViewById(2131195122);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LIZLLL = (TextView) findViewById4;
        View findViewById5 = view.findViewById(2131179010);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.f25929LJ = (HSImageView) findViewById5;
        View findViewById6 = view.findViewById(2131166677);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LJFF = findViewById6;
        View findViewById7 = view.findViewById(2131194209);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        this.LJI = (TextView) findViewById7;
        View findViewById8 = view.findViewById(2131175201);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "");
        this.LJII = (FlowLayout) findViewById8;
        View findViewById9 = view.findViewById(2131175202);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "");
        this.LJIIIIZZ = (FlowLayout) findViewById9;
        View findViewById10 = view.findViewById(2131175189);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "");
        this.LJIIIZ = (FlowLayout) findViewById10;
        View findViewById11 = view.findViewById(2131187143);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "");
        this.LJIIJ = (GamePromoteCommonRatingBar) findViewById11;
        View findViewById12 = view.findViewById(2131195043);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "");
        this.LJIIJJI = (TextView) findViewById12;
        View findViewById13 = view.findViewById(2131197643);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "");
        this.LJIIL = (ViewGroup) findViewById13;
        View findViewById14 = view.findViewById(2131195056);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "");
        this.LJIILIIL = (TextView) findViewById14;
        View findViewById15 = view.findViewById(2131188545);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "");
        this.LJIILJJIL = (RecyclerView) findViewById15;
        View findViewById16 = view.findViewById(2131197027);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "");
        this.LJIILL = findViewById16;
        SettingKey<C6837at> settingKey = LiveSettingKeys.LIVE_GAME_SECURITY_SIGN_PROGRESS_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (settingKey.getValue().LIZIZ == 1) {
            Drawable LIZJ = LK5.LIZJ(2130856322);
            Intrinsics.checkNotNullExpressionValue(LIZJ, "");
            LIZJ.setBounds(2, 2, LIZJ.getIntrinsicWidth() - 2, LIZJ.getIntrinsicHeight() - 2);
            this.LIZ.setCompoundDrawables(null, null, LIZJ, null);
            this.LIZ.setCompoundDrawablePadding(4);
        }
    }
}
