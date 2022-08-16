package com.bytedance.android.live.profit.fansclub.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.profit.fansclub.AbstractC5268p;
import com.bytedance.android.live.profit.fansclub.FansClubEntranceParams;
import com.bytedance.android.live.profit.fansclub.transfer.C5275e;
import com.bytedance.android.live.profit.fansclub.widget.UserInfoFansClubWidget;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C18T;
import p003X.C4BM;
import p003X.C4BO;
import p003X.C87308Kak;
import p003X.IQA;
import p003X.LK5;

/* loaded from: classes12.dex */
public final class UserInfoFansClubWidget extends FansClubWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LJIILL;

    static {
        Covode.recordClassIndex(33360);
    }

    @Override // p003X.C4BQ
    public final int LJIIJ() {
        return 2130858047;
    }

    @Override // com.bytedance.android.live.profit.fansclub.widget.FansClubWidget, com.bytedance.android.livesdk.chatroom.widget.RoomRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJIILL, false, 19).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    private final boolean LJIJJ() {
        if (this.LJIILJJIL && this.LJIILIIL) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        if (this.LJIILJJIL) {
            return 2131700021;
        }
        return 2131700016;
    }

    @Override // p003X.C4BQ
    public final int LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILL, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (LJIJJ()) {
            return 2130858261;
        }
        return 2130858046;
    }

    @Override // p003X.C4BQ
    public final int LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILL, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (LJIJJ()) {
            return 2130858192;
        }
        return 2130858038;
    }

    @Override // p003X.C4BQ
    public final String LJIILJJIL() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILL, false, 4);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (LJIJJ()) {
            str = "ttlive_vs_user_follow_animator.webp";
        } else {
            str = "ttlive_user_follow_animator.webp";
        }
        return C0002O.m25086C("asset://com.ss.android.ies.live.sdk/", str);
    }

    @Override // p003X.C4BQ
    public final String LJIILL() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILL, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (LJIJJ()) {
            str = "ttlive_vs_user_join_fan_club_guid_animator.webp";
        } else {
            str = "ttlive_user_join_fan_club_guid_animator.webp";
        }
        return C0002O.m25086C("asset://com.ss.android.ies.live.sdk/", str);
    }

    @Override // p003X.C4BQ
    public final String LJIILLIIL() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILL, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (LJIJJ()) {
            str = "ttlive_vs_user_join_fan_club_guid_animator.webp";
        } else {
            str = "ttlive_user_fansclub_icon_active_guide.webp";
        }
        return C0002O.m25086C("asset://com.ss.android.ies.live.sdk/", str);
    }

    @Override // p003X.C4BQ
    public final String LJIIZILJ() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILL, false, 7);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (LJIJJ()) {
            str = "ttlive_vs_user_join_fan_club_guid_animator.webp";
        } else {
            str = "ttlive_user_fansclub_renew_icon.webp";
        }
        return C0002O.m25086C("asset://com.ss.android.ies.live.sdk/", str);
    }

    @Override // com.bytedance.android.live.profit.fansclub.widget.FansClubWidget
    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LJIILL, false, 10).isSupported || LJIJI()) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LIZIZ, "scaleX", 1.0f, 1.2f);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LIZIZ, "scaleY", 1.0f, 1.3f);
        Intrinsics.checkNotNullExpressionValue(ofFloat2, "");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setInterpolator(C4BO.LIZ);
        animatorSet.start();
        super.LJI();
    }

    @Override // p003X.C4BQ
    public final int LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILL, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (LJIJJ() && LIZIZ().LIZLLL().LIZ().intValue() == C5275e.LIZIZ) {
            return 2130858192;
        }
        if (this.LJIIL) {
            return 2130858037;
        }
        return 2130858045;
    }

    public final boolean LJIJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILL, false, 13);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_CLEAR_SCREEN_OPTIMIZE_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (!value.booleanValue()) {
            return false;
        }
        C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LLJILJIL;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Boolean LIZ = c87308Kak.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        if (!LIZ.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.profit.fansclub.widget.FansClubWidget
    public final void LJIIIZ() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LJIILL, false, 14).isSupported) {
            return;
        }
        AbstractC5268p LIZ = LIZIZ().LIZ(new FansClubEntranceParams(FansClubEntranceParams.Page.Default, LJIJJ(), "fans_club_button", "top", null, FansClubEntranceParams.Entrance.UserInfoFansClubWidget, m15617LJ(), 16));
        if (LIZ != null) {
            LIZ.LIZ();
        }
        if (!PatchProxy.proxy(new Object[0], this, LJIILL, false, 18).isSupported) {
            C87308Kak<Map<String, String>> c87308Kak = AbstractC80293Hkt.f7196eL;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            Map<String, String> LIZ2 = c87308Kak.LIZ();
            String valueOf = String.valueOf(LIZ().LIZ().LIZ().getRoomId());
            if (LIZ2.containsKey("livesdk_fansclubinterface_show") && Intrinsics.areEqual(LIZ2.get("livesdk_fansclubinterface_show"), valueOf)) {
                LIZ2.put("livesdk_fansclubinterface_show", "0");
            }
            C87308Kak<Map<String, String>> c87308Kak2 = AbstractC80293Hkt.f7196eL;
            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
            c87308Kak2.LIZ(LIZ2);
        }
        if (LJIJJ()) {
            str = "livesdk_fans_club_icon_click";
        } else {
            str = "livesdk_fans_club_entrance_click";
        }
        LIZ(str);
    }

    public final boolean LJIJ() {
        Long l;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILL, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        User owner = LIZ().LIZ().LIZ().getOwner();
        if (owner != null) {
            l = Long.valueOf(owner.getId());
        } else {
            l = null;
        }
        C87308Kak<Long> c87308Kak = AbstractC80293Hkt.LLLLJI;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Long LIZ = c87308Kak.LIZ();
        if (LIZ != null) {
            LIZ.longValue();
            if (!IQA.LIZIZ(LIZ.longValue())) {
                C87308Kak<Long> c87308Kak2 = AbstractC80293Hkt.LLLLJI;
                Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                c87308Kak2.LIZ(Long.valueOf(System.currentTimeMillis()));
                C87308Kak<List<String>> c87308Kak3 = AbstractC80293Hkt.LLLLL;
                Intrinsics.checkNotNullExpressionValue(c87308Kak3, "");
                c87308Kak3.LIZ(new ArrayList());
            } else {
                C87308Kak<List<String>> c87308Kak4 = AbstractC80293Hkt.LLLLL;
                Intrinsics.checkNotNullExpressionValue(c87308Kak4, "");
                List<String> LIZ2 = c87308Kak4.LIZ();
                if (LIZ2 != null && LIZ2.size() < 3 && !LIZ2.contains(String.valueOf(l))) {
                    LIZ2.add(String.valueOf(l));
                    C87308Kak<List<String>> c87308Kak5 = AbstractC80293Hkt.LLLLL;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak5, "");
                    c87308Kak5.LIZ(LIZ2);
                    return true;
                }
            }
        }
        return false;
    }

    public UserInfoFansClubWidget(boolean z) {
        super(z);
    }

    @Override // com.bytedance.android.live.profit.fansclub.widget.FansClubWidget
    public final void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LJIILL, false, 9).isSupported) {
            return;
        }
        super.LIZIZ(i);
        if (!LJIJI() && LJIJ()) {
            LIZIZ().LJII().LIZ(C4BM.LIZ);
        }
    }

    @Override // com.bytedance.android.live.profit.fansclub.widget.FansClubWidget
    public final void LIZ(final boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJIILL, false, 11).isSupported) {
            return;
        }
        this.LJIIJ.add(Observable.timer(2L, TimeUnit.SECONDS).map(new Function<Long, Boolean>() { // from class: X.4B0
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(33364);
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Boolean, java.lang.Object] */
            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Boolean apply(Long l) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{l}, this, LIZ, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C106862S5w.LIZ(l);
                if (!UserInfoFansClubWidget.this.LJIJI()) {
                    if (z) {
                        return Boolean.valueOf(UserInfoFansClubWidget.this.LJIJ());
                    }
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Boolean>() { // from class: X.4Az
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(33365);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Boolean bool) {
                Boolean bool2 = bool;
                if (!PatchProxy.proxy(new Object[]{bool2}, this, LIZ, false, 1).isSupported) {
                    Intrinsics.checkNotNullExpressionValue(bool2, "");
                    if (bool2.booleanValue()) {
                        UserInfoFansClubWidget.this.LIZIZ().LJII().LIZ(C4BL.LIZ);
                    }
                }
            }
        }, C18T.LIZ));
    }

    @Override // p003X.C4BQ
    public final void LIZJ(int i) {
        Drawable LIZJ;
        Drawable LIZJ2;
        RelativeLayout relativeLayout;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LJIILL, false, 8).isSupported) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (!this.LJIIL && (relativeLayout = this.LIZIZ) != null) {
                        relativeLayout.setBackground(LK5.LIZJ(2130854802));
                        return;
                    }
                    return;
                }
                RelativeLayout relativeLayout2 = this.LIZIZ;
                if (relativeLayout2 != null) {
                    relativeLayout2.setBackground(LK5.LIZJ(2130858043));
                    return;
                }
                return;
            }
            RelativeLayout relativeLayout3 = this.LIZIZ;
            if (relativeLayout3 != null) {
                if (LJIJJ()) {
                    LIZJ2 = LK5.LIZJ(2130858121);
                } else if (this.LJIIL) {
                    LIZJ2 = LK5.LIZJ(2130858041);
                } else {
                    LIZJ2 = LK5.LIZJ(2130858043);
                }
                relativeLayout3.setBackground(LIZJ2);
                return;
            }
            return;
        }
        RelativeLayout relativeLayout4 = this.LIZIZ;
        if (relativeLayout4 != null) {
            if (LJIJJ()) {
                LIZJ = LK5.LIZJ(2130858121);
            } else {
                LIZJ = LK5.LIZJ(2130858042);
            }
            relativeLayout4.setBackground(LIZJ);
        }
    }
}
