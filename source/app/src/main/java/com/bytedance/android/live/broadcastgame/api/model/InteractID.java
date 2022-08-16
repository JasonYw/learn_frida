package com.bytedance.android.live.broadcastgame.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;
import p003X.C441293cx;

/* loaded from: classes12.dex */
public enum InteractID {
    Unknown(0),
    Comment(1),
    Lottery(2),
    DrawSth(3),
    KTV(4),
    Blinked(5),
    GiftVote(6),
    EffectGame(7),
    WGameX(8),
    CloudGame(10),
    DynamicItem(11),
    LinkMicEmojiItem(12),
    Predictor(13),
    InteractiveSong(14),
    VProject(15),
    KtvRoomSelect(16),
    PkOperationalPlayBo3(17),
    GuestBattle(18),
    DigitAvatar(19),
    KTVChallenge(20),
    TeamFight(21),
    PlayTogether(22),
    VideoKtv(23),
    PaidLink(25),
    LinkRoomFight(26),
    SelfDiscipline(27),
    DoublePk(28),
    OpenGame(100),
    Zhufen(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS),
    OpenMicroApp(103),
    SonicMiniGame(104);
    
    public static final C441293cx Companion = new C441293cx((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int value;

    public static InteractID valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (InteractID) (proxy.isSupported ? proxy.result : Enum.valueOf(InteractID.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static InteractID[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (InteractID[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(19147);
    }

    InteractID(int i) {
        this.value = i;
    }
}
