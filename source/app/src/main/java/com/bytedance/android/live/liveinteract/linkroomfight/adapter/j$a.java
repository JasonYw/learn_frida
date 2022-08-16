package com.bytedance.android.live.liveinteract.linkroomfight.adapter;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C414192aL;
import p003X.C4313534v;
import p003X.H5H;
import p003X.M0Q;

/* loaded from: classes3.dex */
public final class j$a extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public j$c LIZIZ;
    public HSImageView LIZJ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public TextView f26334LJ;
    public View LJFF;
    public View LJI;
    public TextView LJII;
    public final H5H LJIIIIZZ;
    public HSImageView LJIIIZ;

    static {
        Covode.recordClassIndex(27544);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j$a(View view, H5H h5h) {
        super(view);
        C106862S5w.LIZ(view, h5h);
        this.LJIIIIZZ = h5h;
        View findViewById = view.findViewById(2131167408);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZJ = (HSImageView) findViewById;
        View findViewById2 = view.findViewById(2131184129);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZLLL = (TextView) findViewById2;
        View findViewById3 = view.findViewById(2131188769);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.f26334LJ = (TextView) findViewById3;
        View findViewById4 = view.findViewById(2131188761);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LJIIIZ = (HSImageView) findViewById4;
        View findViewById5 = view.findViewById(2131189255);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.LJFF = findViewById5;
        View findViewById6 = view.findViewById(2131188760);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LJI = findViewById6;
        View findViewById7 = view.findViewById(2131182380);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        this.LJII = (TextView) findViewById7;
        view.setOnClickListener(C414192aL.LIZ(0L, new LinkRoomFightSelectGuestViewBinder$ItemViewHolder$1(this), 1, null));
        HSImageView hSImageView = this.LJIIIZ;
        SettingKey<String> settingKey = LiveSettingKeys.LIVE_ROOM_MICSEAT_VALUE_ICON;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        String value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        M0Q.LIZ(hSImageView, Uri.parse(C4313534v.LIZ(value)));
    }
}
