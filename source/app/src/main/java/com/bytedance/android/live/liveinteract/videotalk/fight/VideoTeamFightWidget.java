package com.bytedance.android.live.liveinteract.videotalk.fight;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah;
import com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget;
import com.bytedance.android.live.liveinteract.voicechat.fight.b$c;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6302f;
import com.bytedance.android.livesdk.chatroom.p517u.C6307m;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.C8866fg;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413392Xt;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C3VF;
import p003X.C77524GhK;
import p003X.C77543Ghd;
import p003X.C78336GuQ;
import p003X.C78352Gug;
import p003X.C78538Gxg;
import p003X.C78628Gz8;
import p003X.C78636GzG;
import p003X.C79242HLo;
import p003X.C87308Kak;

/* loaded from: classes3.dex */
public final class VideoTeamFightWidget extends LinkMicTeamFightWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(30250);
    }

    @Override // androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(KVData kVData) {
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 17).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget
    public final boolean LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C78538Gxg.LJI();
    }

    private final C6307m LJIIZILJ() {
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C6307m) proxy.result;
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJJZZIII = LJJJI.LJJZZIII()) != null && (LIZIZ = LJJZZIII.LIZIZ()) != null) {
            return LIZIZ.LIZIZ();
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget
    public final void LJI() {
        C5923dp LJJJI;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        Observable<C6307m> mo15536LJ;
        Disposable subscribe;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported && (LJJJI = LJJJI()) != null && (LJJZZIII = LJJJI.LJJZZIII()) != null && (LIZIZ = LJJZZIII.LIZIZ()) != null && (mo15536LJ = LIZIZ.mo15536LJ()) != null && (subscribe = mo15536LJ.subscribe(new C78628Gz8(new VideoTeamFightWidget$initSceneSwitchListener$1(this)))) != null) {
            LIZ(subscribe);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget
    public final boolean LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f6983aK;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Boolean LIZ2 = c87308Kak.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        return LIZ2.booleanValue();
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget
    public final boolean LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 14);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        int LJIIJ = C79242HLo.LJIIJ();
        if (LJIIJ != 12 && LJIIJ != 8) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget
    public final boolean LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C6307m LJIIZILJ = LJIIZILJ();
        if ((LJIIZILJ != null && LJIIZILJ.LIZ()) || LJIILL().LIZIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget
    public final boolean LJIIJJI() {
        boolean LJIILIIL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4767ah LIZ2 = AbstractC4767ah.LIZIZ.LIZ();
        if (LIZ2 != null) {
            LJIILIIL = LIZ2.LJIIIZ();
        } else {
            AbstractC4766ag LIZ3 = AbstractC4766ag.LIZ.LIZ();
            if (LIZ3 == null) {
                return false;
            }
            LJIILIIL = LIZ3.LJIILIIL();
        }
        Boolean valueOf = Boolean.valueOf(LJIILIIL);
        if (valueOf == null) {
            return false;
        }
        return valueOf.booleanValue();
    }

    private final int LJIJ() {
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        C6307m LIZ2;
        int i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI == null || (LJJZZIII = LJJJI.LJJZZIII()) == null || (LIZIZ = LJJZZIII.LIZIZ()) == null || (LIZ2 = LIZIZ.LIZ()) == null || (i = LIZ2.LIZIZ) == 0) {
            return 12;
        }
        if (i != 8 || C79242HLo.LJFF() <= 7) {
            return i;
        }
        ALogger.m15800e("TeamFightWidget", "targetScene reset to equal since too much online users");
        return 12;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget
    public final void LIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(th);
        if (LJIILL().LIZIZ()) {
            return;
        }
        LIZLLL("createFightFailed");
    }

    private final void LIZLLL(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 9).isSupported) {
            return;
        }
        int LJIJ = LJIJ();
        ALogger.m15800e("TeamFightWidget", "switchSceneToPreviousState " + LJIJ + " reason=" + str + LoggerUtil.BLANK_TAG + LJIILL());
        AbstractC4766ag LIZ2 = AbstractC4766ag.LIZ.LIZ();
        if (LIZ2 != null) {
            C78336GuQ.LIZ(LIZ2, LJIJ, null, str, 2, null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget, com.bytedance.android.live.liveinteract.p343b.AbstractC4286c
    public final void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        ALogger.m15795w("TeamFightWidget", "try finish team fight reason=" + i + " current=" + LJIILL() + LoggerUtil.BLANK_TAG + LJIIZILJ());
        if (i == 3 && LJIILL().LIZIZ()) {
            LIZJ(i);
            return;
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_BATTLE_SWITCH_BY_SERVER;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        C6307m LJIIZILJ = LJIIZILJ();
        if (LJIIZILJ != null && LJIIZILJ.LIZ() && !value.booleanValue()) {
            if (LJIILL().LIZIZ() && i == 2) {
                LIZJ(i);
            }
            LIZLLL("finishTeamFight " + i);
        } else if (LJIILL().LIZIZ()) {
            LIZJ(i);
        } else {
            ALogger.m15800e("TeamFightWidget", "no finish action needed, all state correct");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget
    public final void LIZ(b$c b_c, Object obj) {
        Object obj2;
        boolean z = false;
        if (PatchProxy.proxy(new Object[]{b_c, obj}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(b_c);
        super.LIZ(b_c, obj);
        if (!LJIIL()) {
            return;
        }
        if (!(obj instanceof C8866fg.C8868b)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        C8866fg.C8868b c8868b = (C8866fg.C8868b) obj2;
        if (c8868b != null) {
            if (c8868b.LIZLLL == 5) {
                z = true;
            }
            if (c8868b.LIZLLL == 3) {
                z = true;
            }
        }
        ALogger.m15795w("TeamFightWidget", "onFinishTeamFight needSwitchScene=" + z + " fromState=" + b_c + LoggerUtil.BLANK_TAG + obj);
        if (z) {
            LIZLLL("onFinishTeamFight");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget, com.bytedance.android.live.liveinteract.p343b.AbstractC4286c
    public final C77543Ghd LIZ(int i, long j, String str) {
        boolean z;
        C3VF user;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), new Long(j), str}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (C77543Ghd) proxy.result;
        }
        C106862S5w.LIZ(str);
        ALogger.m15797i("TeamFightWidget", "tryCreateTeamFight reqFrom=" + str + " option=" + i + " duration=" + j);
        if (this.LJIIL) {
            ALogger.m15800e("TeamFightWidget", "cannot create fight when finishing fight " + LJIILLIIL());
            return C77543Ghd.f6432LJ.LIZIZ();
        }
        C77543Ghd LIZ2 = C77524GhK.LIZ(this, null, 1, null);
        if (C78636GzG.LIZ() && LIZ2.LIZ()) {
            LIZ(i, j);
            return C77543Ghd.f6432LJ.LIZ();
        }
        C6307m LJIIZILJ = LJIIZILJ();
        if (LJIIZILJ != null && LJIIZILJ.LIZ()) {
            LIZ(i, j);
        } else if (!LIZ2.LIZ()) {
            ALogger.m15800e("TeamFightWidget", "tryCreateTeamFight check failed: " + LIZ2);
            return LIZ2;
        } else {
            IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
            if (iUserService != null && (user = iUserService.user()) != null && user.mo22927LJ()) {
                z = true;
            } else {
                z = false;
            }
            if (LJIIL()) {
                AbstractC4766ag LIZ3 = AbstractC4766ag.LIZ.LIZ();
                if (LIZ3 != null) {
                    LIZ3.LIZ(12, (Integer) 4, "createTeamFight");
                }
            } else if (z) {
                LIZ(i, j);
                AbstractC4767ah LIZ4 = AbstractC4767ah.LIZIZ.LIZ();
                if (LIZ4 != null && !PatchProxy.proxy(new Object[]{LIZ4, 12, 4, "createTeamFight", null, 8, null}, null, C78352Gug.LIZ, true, 6).isSupported) {
                    LIZ4.LIZ(12, (Integer) 4, "createTeamFight", Boolean.FALSE);
                }
            }
        }
        return C77543Ghd.f6432LJ.LIZ();
    }
}
