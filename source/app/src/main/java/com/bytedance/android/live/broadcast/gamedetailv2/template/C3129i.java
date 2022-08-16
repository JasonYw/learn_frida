package com.bytedance.android.live.broadcast.gamedetailv2.template;

import android.net.Uri;
import android.view.View;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3121e;
import com.bytedance.android.live.broadcast.hybrid.uielement.GameDetailLynxCard;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C89043L6n;
import p003X.C89045L6p;
import p003X.IQV;
import p003X.L7T;

/* renamed from: com.bytedance.android.live.broadcast.gamedetailv2.template.i */
/* loaded from: classes5.dex */
public final class C3129i extends L7T<C3121e> {
    public static ChangeQuickRedirect LIZ;
    public final GameDetailLynxCard LIZLLL;

    /* renamed from: LJ */
    public final C89045L6p f25894LJ;

    static {
        Covode.recordClassIndex(16718);
    }

    @Override // p003X.L7T
    public final void LIZ() {
        GameDetailLynxCard gameDetailLynxCard;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported && (gameDetailLynxCard = this.LIZLLL) != null) {
            gameDetailLynxCard.LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3129i(View view) {
        super(view);
        C106862S5w.LIZ(view);
        this.LIZLLL = (GameDetailLynxCard) view.findViewById(2131182418);
        C13491f LIZ2 = IQV.LIZ(C89045L6p.class);
        this.f25894LJ = (C89045L6p) (!(LIZ2 instanceof C89045L6p) ? null : LIZ2);
    }

    @Override // p003X.L7T
    public final /* synthetic */ void LIZ(C3121e c3121e) {
        C3121e c3121e2 = c3121e;
        if (!PatchProxy.proxy(new Object[]{c3121e2}, this, LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(c3121e2);
            SettingKey<Map<String, String>> settingKey = LiveSettingKeys.LIVE_DYNAMIC_DETAIL_LYNX_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            String uri = Uri.parse(C89043L6n.LIZ(settingKey.getValue().get(c3121e2.LIZIZ), this.f25894LJ)).buildUpon().build().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "");
            GameDetailLynxCard gameDetailLynxCard = this.LIZLLL;
            if (gameDetailLynxCard != null) {
                gameDetailLynxCard.LIZ(uri, MapsKt__MapsJVMKt.mapOf(TuplesKt.m137to("gameDetailInfo", c3121e2.LIZJ)));
            }
        }
    }

    @Override // p003X.L7T
    public final /* synthetic */ void LIZ(boolean z, C3121e c3121e) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3121e}, this, LIZ, false, 3).isSupported) {
            C106862S5w.LIZ(c3121e);
        }
    }
}
