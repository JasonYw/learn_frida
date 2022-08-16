package com.bytedance.android.live.broadcast.preview;

import android.widget.FrameLayout;
import com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager;
import com.bytedance.android.live.broadcast.api.model.C2918r;
import com.bytedance.android.live.broadcast.api.model.C2921x;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC86668KDe;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C87307Kaj;
import p003X.C87308Kak;
import p003X.KJV;

/* loaded from: classes5.dex */
public final class StartLiveFragment$realOnViewCreated$5 extends Lambda implements Function1<RoomCreateInfo, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KJV this$0;

    static {
        Covode.recordClassIndex(17186);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveFragment$realOnViewCreated$5(KJV kjv) {
        super(1);
        this.this$0 = kjv;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(RoomCreateInfo roomCreateInfo) {
        C2WC<Integer> c2wc;
        C2WD<C2921x> c2wd;
        C2918r c2918r;
        RoomCreateInfo roomCreateInfo2 = roomCreateInfo;
        boolean z = true;
        int i = 0;
        if (!PatchProxy.proxy(new Object[]{roomCreateInfo2}, this, changeQuickRedirect, false, 1).isSupported) {
            KJV kjv = this.this$0;
            if (!PatchProxy.proxy(new Object[]{roomCreateInfo2}, kjv, KJV.LIZ, false, 91).isSupported && roomCreateInfo2 != null) {
                AnchorVideoResolutionManager.LJIIIZ.LIZ(roomCreateInfo2);
                SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_CHECK_COMPUTER_LIVE_CAPABILITY;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue() && (c2918r = roomCreateInfo2.LJJIIJ) != null) {
                    kjv.LIZ().m15891LJ().LIZ(c2918r);
                }
                String str = roomCreateInfo2.LJJIJ;
                if (str != null) {
                    kjv.LIZ().LJJIJIL().LIZ(str);
                }
                int i2 = roomCreateInfo2.LJJIJIIJI;
                C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.f7084cF;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                c87308Kak.LIZ(Integer.valueOf(i2));
                int i3 = roomCreateInfo2.LJJIJIIJIL;
                C87307Kaj<Boolean> c87307Kaj = AbstractC86668KDe.LJJIFFI;
                LiveEffectContextFactory.Type type = LiveEffectContextFactory.Type.DEFAULT;
                if (i3 != 2) {
                    z = false;
                }
                c87307Kaj.LIZ(type, Boolean.valueOf(z));
                AbstractC86668KDe.LJJII.LIZ(LiveEffectContextFactory.Type.DEFAULT, Boolean.valueOf(roomCreateInfo2.LJJIJIL));
                C2921x c2921x = roomCreateInfo2.LJJJIL;
                C2WC<String> c2wc2 = null;
                if (c2921x != null) {
                    C3199v LIZ = kjv.LIZ();
                    if (LIZ != null) {
                        c2wd = LIZ.LJJIFFI();
                    } else {
                        c2wd = null;
                    }
                    c2wd.LIZ(c2921x);
                }
                int i4 = roomCreateInfo2.LJJJJJL;
                C3199v LIZ2 = kjv.LIZ();
                if (LIZ2 != null) {
                    c2wc = LIZ2.LJJJJIZL();
                } else {
                    c2wc = null;
                }
                c2wc.LIZ(Integer.valueOf(i4));
                String str2 = roomCreateInfo2.LJJJJL;
                if (str2 != null) {
                    C3199v LIZ3 = kjv.LIZ();
                    if (LIZ3 != null) {
                        c2wc2 = LIZ3.LJJJJJ();
                    }
                    c2wc2.LIZ(str2);
                }
                SettingKey<Boolean> settingKey2 = LiveSettingKeys.USE_NEW_LIVE_COMPANION_GUIDE_PAGE;
                Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                if (!settingKey2.getValue().booleanValue()) {
                    FrameLayout frameLayout = (FrameLayout) kjv.m23490LJ(2131181138);
                    Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                    if (!roomCreateInfo2.LJIJ) {
                        i = 8;
                    }
                    frameLayout.setVisibility(i);
                }
                if (roomCreateInfo2.LJJIFFI) {
                    kjv.LIZJ().LIZ().LIZ(LiveMode.MEDIA);
                }
                if (kjv.LJIIIIZZ != null) {
                    kjv.LIZJ(kjv.LJIIIIZZ);
                }
                C87308Kak<Integer> c87308Kak2 = AbstractC80293Hkt.f7186eB;
                Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                c87308Kak2.LIZ(Integer.valueOf((int) roomCreateInfo2.LJJJI));
            }
        }
        return Unit.INSTANCE;
    }
}
