package com.bytedance.android.live.liveinteract.voicechat.fight;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.voicechat.fight.view.TeamFightPKProgressLayout;
import com.bytedance.android.livesdk.chatroom.model.interact.C6174n;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p568f.C7071a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C78644GzO;
import p003X.C78645GzP;
import p003X.C78646GzQ;
import p003X.C78647GzR;
import p003X.C78648GzS;
import p003X.C78649GzT;
import p003X.C78650GzU;
import p003X.C78651GzV;
import p003X.C78760H3a;
import p003X.C78775H3p;
import p003X.C7HK;
import p003X.C81978ISu;
import p003X.H3L;
import p003X.H3N;
import p003X.H3V;
import p003X.H3W;

/* loaded from: classes3.dex */
public final /* synthetic */ class VoiceTeamFightViewManager$1 extends FunctionReferenceImpl implements Function1<b$b, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(31304);
    }

    public VoiceTeamFightViewManager$1(H3L h3l) {
        super(1, h3l, H3L.class, "onStateChanged", "onStateChanged(Lcom/bytedance/android/live/liveinteract/voicechat/fight/TeamFightStateMachine$SideEffect;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(b$b b_b) {
        C6174n LJII;
        if (!PatchProxy.proxy(new Object[]{b_b}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(b_b);
            H3L h3l = (H3L) this.receiver;
            if (!PatchProxy.proxy(new Object[]{b_b}, h3l, H3L.LIZ, false, 4).isSupported && (LJII = C5056a.LIZJ.LJII()) != null) {
                if (Intrinsics.areEqual(b_b, C78644GzO.LIZIZ)) {
                    if (!PatchProxy.proxy(new Object[]{LJII}, h3l, H3L.LIZ, false, 7).isSupported) {
                        C106862S5w.LIZ(LJII);
                        ALogger.m15797i("TeamFightView", "onTeamFightCreate");
                        h3l.LIZ(LJII, "create");
                        h3l.LIZIZ();
                        h3l.LIZ(LJII);
                        h3l.LIZJ.LIZ();
                        C78775H3p.f6558LJ.LIZ(LJII, true);
                    }
                } else if (Intrinsics.areEqual(b_b, C78648GzS.LIZIZ)) {
                    if (!PatchProxy.proxy(new Object[]{LJII}, h3l, H3L.LIZ, false, 8).isSupported) {
                        C106862S5w.LIZ(LJII);
                        ALogger.m15797i("TeamFightView", "onTeamFightStart countDown=" + LJII.LIZ());
                        h3l.LIZ(LJII, "start");
                        h3l.LIZIZ(LJII);
                        h3l.LJIILLIIL.LIZIZ(LJII);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(h3l.LIZJ, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setDuration(250L);
                        ofFloat.addListener(new C78760H3a(h3l));
                        ofFloat.start();
                    }
                } else if (Intrinsics.areEqual(b_b, C78649GzT.LIZIZ)) {
                    if (!PatchProxy.proxy(new Object[]{LJII}, h3l, H3L.LIZ, false, 9).isSupported) {
                        C106862S5w.LIZ(LJII);
                        h3l.LIZ(LJII, "refresh");
                        TeamFightPKProgressLayout.LIZ(h3l.LIZJ, LJII, false, 2, null);
                        h3l.LJIILLIIL.LJFF(LJII);
                    }
                } else if (Intrinsics.areEqual(b_b, C78647GzR.LIZIZ)) {
                    if (!PatchProxy.proxy(new Object[]{LJII}, h3l, H3L.LIZ, false, 10).isSupported) {
                        C106862S5w.LIZ(LJII);
                        ALogger.m15797i("TeamFightView", "onTeamFightPunish");
                        h3l.LIZ(LJII, "punish");
                        if (!PatchProxy.proxy(new Object[]{LJII}, h3l, H3L.LIZ, false, 14).isSupported) {
                            SettingKey<C7071a> settingKey = LiveSettingKeys.ASSET_ANIM_ID_MAP;
                            Intrinsics.checkNotNullExpressionValue(settingKey, "");
                            C7071a value = settingKey.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "");
                            long LIZ = value.LIZ();
                            SettingKey<C7071a> settingKey2 = LiveSettingKeys.ASSET_ANIM_ID_MAP;
                            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                            C7071a value2 = settingKey2.getValue();
                            Intrinsics.checkNotNullExpressionValue(value2, "");
                            long LIZIZ = value2.LIZIZ();
                            SettingKey<C7071a> settingKey3 = LiveSettingKeys.ASSET_ANIM_ID_MAP;
                            Intrinsics.checkNotNullExpressionValue(settingKey3, "");
                            C7071a value3 = settingKey3.getValue();
                            Intrinsics.checkNotNullExpressionValue(value3, "");
                            long LIZJ = value3.LIZJ();
                            Long l = LJII.LJIIJJI;
                            if (l != null) {
                                if (l.longValue() != 1) {
                                    if (l.longValue() == 2) {
                                        LIZ = LIZIZ;
                                        LIZIZ = LIZ;
                                    }
                                }
                                h3l.f6554LJ.setVisibility(0);
                                h3l.LJFF.setVisibility(0);
                                h3l.LJI.setVisibility(0);
                                C81978ISu.LIZ(h3l.LJFF, LIZ, new H3V(h3l));
                                C81978ISu.LIZ(h3l.LJI, LIZIZ, new H3W(h3l));
                            }
                            LIZ = LIZJ;
                            LIZIZ = LIZ;
                            h3l.f6554LJ.setVisibility(0);
                            h3l.LJFF.setVisibility(0);
                            h3l.LJI.setVisibility(0);
                            C81978ISu.LIZ(h3l.LJFF, LIZ, new H3V(h3l));
                            C81978ISu.LIZ(h3l.LJI, LIZIZ, new H3W(h3l));
                        }
                        h3l.LIZJ.setVisibility(0);
                        h3l.LIZJ.LIZ(LJII, true);
                        h3l.LJIIJ = LJII.LIZJ();
                        h3l.LIZLLL.setPenalState(h3l.LJIIJ);
                        h3l.LJIILLIIL.LIZJ(LJII);
                        h3l.LIZIZ();
                        h3l.LJIILL = C7HK.LIZIZ.LIZ(1L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new H3N(h3l));
                    }
                } else if (Intrinsics.areEqual(b_b, C78645GzP.LIZIZ)) {
                    if (!PatchProxy.proxy(new Object[]{LJII}, h3l, H3L.LIZ, false, 11).isSupported) {
                        C106862S5w.LIZ(LJII);
                        ALogger.m15797i("TeamFightView", "onTeamFightRecreate");
                        h3l.LIZ(LJII, "recreate");
                        h3l.LIZ(LJII);
                        h3l.LJIILLIIL.LIZLLL(LJII);
                        h3l.LIZJ.LIZ();
                        h3l.LIZJ.setVisibility(8);
                        h3l.LIZIZ();
                    }
                } else if (Intrinsics.areEqual(b_b, C78646GzQ.LIZIZ)) {
                    if (!PatchProxy.proxy(new Object[]{LJII}, h3l, H3L.LIZ, false, 12).isSupported) {
                        C106862S5w.LIZ(LJII);
                        ALogger.m15797i("TeamFightView", "onTeamFightRestart");
                        h3l.LIZ(LJII, "restart");
                        h3l.LIZIZ(LJII);
                        h3l.LJIILLIIL.mo15646LJ(LJII);
                        C78775H3p.f6558LJ.LIZ(LJII, false);
                    }
                } else if (b_b instanceof C78651GzV) {
                    h3l.LIZ("Reset");
                } else {
                    Intrinsics.areEqual(b_b, C78650GzU.LIZIZ);
                }
                h3l.LJIILIIL = LJII.LJFF;
            }
        }
        return Unit.INSTANCE;
    }
}
