package com.bytedance.android.live.liveinteract.plantform.core;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.chatroom.model.LinkApplyType;
import com.bytedance.android.live.liveinteract.bid.AbstractC4289e;
import com.bytedance.android.live.liveinteract.bid.C4287a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p354vm.C4378a;
import com.bytedance.android.live.liveinteract.interact.audience.paid.C4441a;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.model.LinkmicPositionItem;
import com.bytedance.android.live.liveinteract.multianchor.model.ListUserContent;
import com.bytedance.android.live.liveinteract.multianchor.model.ListUserLinkmicAudienceContent;
import com.bytedance.android.live.liveinteract.p356e.AbstractC4408a;
import com.bytedance.android.live.liveinteract.p356e.AbstractC4409d;
import com.bytedance.android.live.liveinteract.p356e.AbstractC4410g;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAnchorApi;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.model.MessageBoardInfo;
import com.bytedance.android.live.liveinteract.plantform.model.RoomLinkerContent;
import com.bytedance.android.live.liveinteract.plantform.model.UserType;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag;
import com.bytedance.android.live.liveinteract.videotalk.paid.C4935a;
import com.bytedance.android.live.liveinteract.voicechat.paid.C5077a;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.model.C6094ae;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkmicInteractEntrance;
import com.bytedance.android.livesdk.chatroom.model.interact.MultiRtcInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.SingingChallengeRtcInfo;
import com.bytedance.android.livesdk.config.C6860br;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.linker.ChangePlayModeData;
import com.bytedance.android.livesdk.message.linker.LinkerChangePlayModeContent;
import com.bytedance.android.livesdk.message.linker.LinkerLockPositionContent;
import com.bytedance.android.livesdk.message.model.C8861ey;
import com.bytedance.android.livesdk.message.model.C8862ez;
import com.bytedance.android.livesdk.message.model.C8864fa;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.CommentPinContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9519ad;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9520ae;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9527am;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9536f;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9549v;
import com.bytedance.common.utility.Lists;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.p1594ss.avframework.livestreamv2.core.interact.model.Config;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC78986HBs;
import p003X.AbstractC79253HLz;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C436843Py;
import p003X.C449833qj;
import p003X.C449933qt;
import p003X.C78403GvV;
import p003X.C78538Gxg;
import p003X.C79007HCn;
import p003X.C79046HEa;
import p003X.C79180HJe;
import p003X.C79183HJh;
import p003X.C79184HJi;
import p003X.C79185HJj;
import p003X.C79186HJk;
import p003X.C79242HLo;
import p003X.C79244HLq;
import p003X.C79246HLs;
import p003X.C87010KQi;
import p003X.C88306Kqq;
import p003X.C91301Ly3;
import p003X.H6J;
import p003X.H6L;
import p003X.HDP;
import p003X.HEK;
import p003X.HEL;
import p003X.HH8;
import p003X.HKF;
import p003X.HKG;
import p003X.HM1;
import p003X.HMC;
import p003X.HMP;
import p003X.KM9;

/* renamed from: com.bytedance.android.live.liveinteract.plantform.core.x */
/* loaded from: classes3.dex */
public final class C4806x implements AbstractC78986HBs<LinkPlayerInfo>, OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public boolean LJI;
    public boolean LJII;
    public final Boolean LJIIIZ;
    public C4807a LJIIJ;
    public long LJIIJJI;
    public boolean LJIIL;
    public final Room LJIILL;
    public final IMessageManager LJIJJ;
    public boolean LJIJJLI;
    public final C6860br LJJIFFI;
    public final boolean LJJII;
    public int LJJIIZ;
    public Disposable LJJIJ;
    public C8874fl LJJIJIIJI;
    public final DataCenter LJJIJIIJIL;
    public final int LJJIJIL;
    public final String LIZIZ = "ttlive_link_list";
    public final int LJIILLIIL = 5;
    public final CopyOnWriteArrayList<LinkPlayerInfo> LIZJ = new CopyOnWriteArrayList<>();
    public CopyOnWriteArrayList<LinkPlayerInfo> LIZLLL = new CopyOnWriteArrayList<>();

    /* renamed from: LJ */
    public final CopyOnWriteArrayList<LinkmicPositionItem> f26413LJ = new CopyOnWriteArrayList<>();
    public CopyOnWriteArrayList<LinkPlayerInfo> LJFF = new CopyOnWriteArrayList<>();
    public CopyOnWriteArrayList<LinkPlayerInfo> LJIIZILJ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<LinkPlayerInfo> LJIJ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<LinkPlayerInfo> LJIJI = new CopyOnWriteArrayList<>();
    public final List<AbstractC79253HLz<LinkPlayerInfo>> LJIIIIZZ = new ArrayList();
    public final CompositeDisposable LJIL = new CompositeDisposable();
    public final Map<Long, Long> LJJ = new HashMap();
    public final Set<Integer> LJJI = SetsKt__SetsKt.setOf((Object[]) new Integer[]{4, 5, 8, 9, 10, 12, 13, 16});
    public final C79244HLq LJJIII = new C79244HLq();
    public final int LJJIIJ = 6;
    public final int LJJIIJZLJL = 9;
    public Map<Long, Boolean> LJJIIZI = new LinkedHashMap();
    public List<LinkmicInteractEntrance> LJIILIIL = new ArrayList();
    public Map<Long, List<LinkmicInteractEntrance>> LJIILJJIL = new LinkedHashMap();

    static {
        Covode.recordClassIndex(29342);
    }

    @Override // p003X.AbstractC78986HBs
    public final void LIZ(String str) {
    }

    @Override // p003X.AbstractC78986HBs
    public final List<LinkPlayerInfo> LIZJ() {
        return this.LIZJ;
    }

    @Override // p003X.AbstractC78986HBs
    public final List<LinkPlayerInfo> LIZLLL() {
        return this.LIZLLL;
    }

    @Override // p003X.AbstractC78986HBs
    /* renamed from: LJ */
    public final List<LinkmicPositionItem> mo15707LJ() {
        return this.f26413LJ;
    }

    @Override // p003X.AbstractC78986HBs
    public final List<LinkPlayerInfo> LJFF() {
        return this.LJFF;
    }

    @Override // p003X.AbstractC78986HBs
    public final void LIZ() {
        boolean booleanValue;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        IMessageManager iMessageManager = this.LJIJJ;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(MessageType.LINK_MIC.LIZ(), this);
            this.LJIJJ.addMessageListener(MessageType.LINKER.LIZ(), this);
            this.LJIJJ.addMessageListener(MessageType.LINK_MIC_SIGNAL.LIZ(), this);
            this.LJIJJ.addMessageListener(MessageType.LINKER_CONTRIBUTE_MESSAGE.LIZ(), this);
            this.LJIJJ.addMessageListener(MessageType.LINK_MIC_POSITION.LIZ(), this);
        }
        this.LJIJJLI = true;
        LIZ(true);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 54);
        if (proxy.isSupported) {
            booleanValue = ((Boolean) proxy.result).booleanValue();
        } else {
            DataCenter dataCenter = this.LJJIJIIJIL;
            Boolean bool = dataCenter != null ? (Boolean) dataCenter.get("data_room_video_talk_integration_audience_has_send_prepare_apply_flag", (String) Boolean.FALSE) : null;
            Intrinsics.checkNotNullExpressionValue(bool, "");
            booleanValue = bool.booleanValue();
        }
        LIZ(!booleanValue, "interactiveModeStart");
        this.LJJIIZ = 0;
    }

    @Override // p003X.AbstractC78986HBs
    public final void LIZ(AbstractC79253HLz<LinkPlayerInfo> abstractC79253HLz) {
        if (PatchProxy.proxy(new Object[]{abstractC79253HLz}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC79253HLz);
        this.LJIIIIZZ.add(abstractC79253HLz);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x005a, code lost:
        if (r0.booleanValue() != false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.bytedance.android.livesdk.message.model.C8874fl r8) {
        /*
            r7 = this;
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r6 = 0
            r2[r6] = r8
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.plantform.core.C4806x.LIZ
            r0 = 10
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r7, r1, r6, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L13
            return
        L13:
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo> r0 = r7.LIZJ
            r3.<init>(r0)
            int r4 = r8.LIZIZ
            r0 = 6
            java.lang.String r5 = ""
            r2 = 2
            r1 = 0
            if (r4 == r0) goto L4b
            r0 = 7
            if (r4 == r0) goto L46
            r0 = 11
            if (r4 == r0) goto L41
            r0 = 12
            if (r4 == r0) goto L3c
            r0 = 23
            if (r4 == r0) goto L37
            r0 = 26
            if (r4 == r0) goto L66
            return
        L37:
            boolean r0 = r7.LIZIZ(r8)
            goto L6a
        L3c:
            boolean r0 = LIZJ(r7, r8, r1, r2, r1)
            goto L6a
        L41:
            boolean r0 = LIZLLL(r7, r8, r1, r2, r1)
            goto L6a
        L46:
            boolean r0 = LIZIZ(r7, r8, r1, r2, r1)
            goto L6a
        L4b:
            boolean r0 = p003X.C79242HLo.LIZJ()
            if (r0 != 0) goto L5c
            java.lang.Boolean r0 = r7.LJIIIZ
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L61
        L5c:
            java.lang.String r0 = "messageLinkUserEnter"
            r7.LIZ(r6, r0)
        L61:
            boolean r0 = LIZ(r7, r8, r1, r2, r1)
            goto L6a
        L66:
            boolean r0 = r7.LIZJ(r8)
        L6a:
            if (r0 != 0) goto L6d
            return
        L6d:
            java.util.Iterator r4 = r3.iterator()
        L71:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L9f
            java.lang.Object r3 = r4.next()
            com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo r3 = (com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo) r3
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo> r0 = r7.LIZJ
            java.util.Iterator r2 = r0.iterator()
        L83:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo r0 = (com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo) r0
            boolean r0 = r7.LIZ(r0, r3)
            if (r0 == 0) goto L83
            if (r1 != 0) goto L71
        L98:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
            r7.LIZ(r3)
            goto L71
        L9f:
            java.lang.String r1 = r7.LIZIZ
            java.lang.String r0 = "message onOnlineListChanged callback"
            com.bytedance.android.live.core.log.ALogger.m15795w(r1, r0)
            java.util.List<X.HLz<com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo>> r0 = r7.LJIIIIZZ
            java.util.Iterator r4 = r0.iterator()
        Lac:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Ldb
            java.lang.Object r3 = r4.next()
            X.HLz r3 = (p003X.AbstractC79253HLz) r3
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo> r0 = r7.LIZJ
            r3.LIZ(r0)
            X.HMC r2 = p003X.HMC.LIZIZ
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo> r1 = r7.LIZJ
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo> r0 = r7.LIZLLL
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.LIZ(r1, r0)
            r7.LIZLLL = r0
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo> r0 = r7.LIZLLL
            if (r0 == 0) goto Lac
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lac
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo> r1 = r7.LIZJ
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo> r0 = r7.LIZLLL
            r3.LIZ(r1, r0)
            goto Lac
        Ldb:
            X.HCn r1 = p003X.C79007HCn.LJII()
            int r0 = r7.LJIIJJI()
            r1.LJIILJJIL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.plantform.core.C4806x.LIZ(com.bytedance.android.livesdk.message.model.fl):void");
    }

    public final boolean LIZ(C8874fl c8874fl, List<? extends AnchorLinkUser> list) {
        boolean z;
        Iterator<Map.Entry<Long, RoomLinkerContent>> it;
        Map<Long, RoomLinkerContent> map;
        Iterator<Map.Entry<Long, RoomLinkerContent>> it2;
        Map.Entry<Long, RoomLinkerContent> next;
        RoomLinkerContent value;
        AbstractC4289e LIZIZ;
        int i;
        C4287a LIZ2;
        C2WC<Integer> LIZLLL;
        int i2;
        C4287a LIZ3;
        C2WC<Integer> LIZLLL2;
        C2WC<Integer> LIZLLL3;
        Integer LIZ4;
        List<? extends AnchorLinkUser> list2 = list;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c8874fl, list2}, this, LIZ, false, 20);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (c8874fl.LJIIIIZZ == null) {
            return false;
        }
        C9549v c9549v = c8874fl.LJIIIIZZ;
        Intrinsics.checkNotNullExpressionValue(c9549v, "");
        if (list2 == null) {
            list2 = c9549v.LIZJ;
        }
        LIZIZ(c9549v.LJFF);
        MessageBoardInfo messageBoardInfo = c9549v.LJIIIZ;
        if (messageBoardInfo != null) {
            Boolean bool = this.LJIIIZ;
            Intrinsics.checkNotNullExpressionValue(bool, "");
            if (bool.booleanValue() && !PatchProxy.proxy(new Object[]{messageBoardInfo}, this, LIZ, false, 40).isSupported) {
                C87010KQi LIZ5 = C87010KQi.LIZ();
                CommentPinContent commentPinContent = new CommentPinContent();
                commentPinContent.LIZIZ = messageBoardInfo.getMsgBoardContent();
                commentPinContent.LIZLLL = messageBoardInfo.getId();
                commentPinContent.LJFF = messageBoardInfo.getSenderNickName();
                commentPinContent.f28118LJ = messageBoardInfo.getSenderId();
                commentPinContent.LJIIL = "gift_msg_board";
                commentPinContent.LJIILIIL = "gift_word";
                LIZ5.LIZ(commentPinContent);
            }
        }
        HH8.LIZ(c8874fl.getMessageId(), c9549v.LIZLLL, c9549v.toString(), (list2 == null || list2.isEmpty()) ? "enter linkUsers invalid" : null, Integer.valueOf(list2.size()), c9549v.LIZLLL == C79242HLo.LIZ());
        if (!(list2 == null || list2.isEmpty())) {
            LIZ(c9549v, list2);
            z = LIZIZ(list2, c9549v.LIZIZ, "enterMsg");
            m15704LJ(list2);
            if (C4378a.LJJIJIL.LIZJ() && C4378a.LJJIJIL.LIZLLL()) {
                String str = "0";
                for (AnchorLinkUser anchorLinkUser : list2) {
                    User LIZ6 = anchorLinkUser.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ6, "");
                    if (LIZ6.getId() == c9549v.LIZLLL) {
                        str = anchorLinkUser.LIZLLL;
                        Intrinsics.checkNotNullExpressionValue(str, "");
                    }
                }
                AbstractC4289e LIZIZ2 = C4287a.LIZJ.LIZIZ();
                if (LIZIZ2 != null) {
                    LIZIZ2.LIZ(Long.valueOf(c9549v.LIZLLL), str);
                }
                AbstractC4289e LIZIZ3 = C4287a.LIZJ.LIZIZ();
                if ((LIZIZ3 != null && LIZIZ3.LJIIJJI()) || ((LIZIZ = C4287a.LIZJ.LIZIZ()) != null && LIZIZ.LJIIL())) {
                    C4287a LIZ7 = C4287a.LIZJ.LIZ();
                    int intValue = (LIZ7 == null || (LIZLLL3 = LIZ7.LIZLLL()) == null || (LIZ4 = LIZLLL3.LIZ()) == null) ? 0 : LIZ4.intValue();
                    int i3 = this.LJJIJIL;
                    if (i3 == 8) {
                        if (intValue > 0 && intValue < LJIIJJI() && (i2 = intValue + 1) <= this.LJJIIJ && (LIZ3 = C4287a.LIZJ.LIZ()) != null && (LIZLLL2 = LIZ3.LIZLLL()) != null) {
                            LIZLLL2.LIZ(Integer.valueOf(i2));
                        }
                    } else if (i3 == 12 && intValue > 0 && intValue < LJIIJJI() + 1 && (i = intValue + 1) <= this.LJJIIJZLJL && (LIZ2 = C4287a.LIZJ.LIZ()) != null && (LIZLLL = LIZ2.LIZLLL()) != null) {
                        LIZLLL.LIZ(Integer.valueOf(i));
                    }
                }
            }
            if (z) {
                long currentTimeMillis = System.currentTimeMillis();
                String valueOf = String.valueOf(c8874fl.getMessageId());
                this.LJIIJ = new C4807a(currentTimeMillis, "enterMsg", valueOf, "enterUser=" + c9549v.LIZLLL);
            }
        } else {
            z = false;
        }
        List<AnchorLinkUser> emptyList = CollectionsKt__CollectionsKt.emptyList();
        Map<Long, RoomLinkerContent> map2 = c9549v.LJIIIIZZ;
        if (map2 != null && (it = map2.entrySet().iterator()) != null && it.hasNext() && ((map = c9549v.LJIIIIZZ) == null || (it2 = map.entrySet().iterator()) == null || (next = it2.next()) == null || (value = next.getValue()) == null || (emptyList = value.linkedUsers) == null)) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (emptyList != null && !emptyList.isEmpty()) {
            LIZ(c9549v, emptyList);
            boolean LIZ8 = LIZ(c9549v.LJIIIIZZ, c9549v.LIZIZ, "enterMsg", this.LIZLLL);
            m15704LJ(emptyList);
            if (LIZ8) {
                long currentTimeMillis2 = System.currentTimeMillis();
                String valueOf2 = String.valueOf(c8874fl.getMessageId());
                this.LJIIJ = new C4807a(currentTimeMillis2, "enterMsg", valueOf2, "enterUser=" + c9549v.LIZLLL);
            }
        }
        return z;
    }

    public final boolean LIZIZ(C8874fl c8874fl, List<? extends AnchorLinkUser> list) {
        Object obj;
        Iterator<Map.Entry<Long, RoomLinkerContent>> it;
        Map<Long, RoomLinkerContent> map;
        Iterator<Map.Entry<Long, RoomLinkerContent>> it2;
        Map.Entry<Long, RoomLinkerContent> next;
        RoomLinkerContent value;
        Object obj2;
        AbstractC4289e LIZIZ;
        C4287a LIZ2;
        C2WC<Integer> LIZLLL;
        Integer LIZ3;
        int intValue;
        C2WC<Integer> LIZLLL2;
        List<? extends AnchorLinkUser> list2 = list;
        C4806x c4806x = this;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c8874fl, list2}, c4806x, LIZ, false, 22);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (c8874fl.LJIIIZ == null) {
            return false;
        }
        C9519ad c9519ad = c8874fl.LJIIIZ;
        Intrinsics.checkNotNullExpressionValue(c9519ad, "");
        if (list2 == null) {
            list2 = c9519ad.LIZLLL;
        }
        c4806x.LIZIZ(c9519ad.f28166LJ);
        String str = null;
        if (!(list2 == null || list2.isEmpty())) {
            c4806x.LIZIZ(list2, c9519ad.LIZIZ, "leaveMsg");
            c4806x.m15704LJ(list2);
            Iterator<T> it3 = c4806x.LIZJ.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj2 = it3.next();
                    LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj2;
                    Intrinsics.checkNotNullExpressionValue(linkPlayerInfo, "");
                    User LIZ4 = linkPlayerInfo.LIZ();
                    if (LIZ4 != null && LIZ4.getId() == c9519ad.LIZJ) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            if (obj2 != null) {
                c4806x.LIZJ.remove(obj2);
            }
            if (C4378a.LJJIJIL.LIZJ() && C4378a.LJJIJIL.LIZLLL() && (LIZIZ = C4287a.LIZJ.LIZIZ()) != null && LIZIZ.LJIILIIL() != null && (LIZ2 = C4287a.LIZJ.LIZ()) != null && (LIZLLL = LIZ2.LIZLLL()) != null && (LIZ3 = LIZLLL.LIZ()) != null && (intValue = LIZ3.intValue()) > 0) {
                int i = intValue - 1;
                C4287a LIZ5 = C4287a.LIZJ.LIZ();
                if (LIZ5 != null && (LIZLLL2 = LIZ5.LIZLLL()) != null) {
                    LIZLLL2.LIZ(Integer.valueOf(i));
                }
            }
            long messageId = c8874fl.getMessageId();
            long j = c9519ad.LIZJ;
            String c9519ad2 = c9519ad.toString();
            Integer valueOf = Integer.valueOf(list2.size());
            if (obj2 != null) {
                str = "leaved user in list";
            }
            HH8.LIZ(messageId, j, c9519ad2, str, valueOf, false, null, 96, null);
            c4806x.LJIIJ = new C4807a(System.currentTimeMillis(), "leaveMsg", String.valueOf(c8874fl.getMessageId()), "leaveUser=" + c9519ad.LIZJ);
        } else {
            Iterator<T> it4 = c4806x.LIZJ.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it4.next();
                LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) obj;
                Intrinsics.checkNotNullExpressionValue(linkPlayerInfo2, "");
                User LIZ6 = linkPlayerInfo2.LIZ();
                if (LIZ6 != null && LIZ6.getId() == c9519ad.LIZJ && c9519ad.LIZJ > 0) {
                    break;
                }
            }
            if (obj == null) {
                HH8.LIZ(c8874fl.getMessageId(), c9519ad.LIZJ, null, "leave user not found", null, c9519ad.LIZJ != 0, null, 84, null);
            }
            c4806x = this;
            c4806x.LIZJ.remove(obj);
        }
        List<AnchorLinkUser> emptyList = CollectionsKt__CollectionsKt.emptyList();
        Map<Long, RoomLinkerContent> map2 = c9519ad.LJFF;
        if (map2 != null && (it = map2.entrySet().iterator()) != null && it.hasNext() && ((map = c9519ad.LJFF) == null || (it2 = map.entrySet().iterator()) == null || (next = it2.next()) == null || (value = next.getValue()) == null || (emptyList = value.linkedUsers) == null)) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (emptyList != null && !emptyList.isEmpty()) {
            LIZ(c9519ad.LJFF, c9519ad.LIZIZ, "leaveMsg", c4806x.LIZLLL);
            c4806x.m15704LJ(emptyList);
            HH8.LIZ(c8874fl.getMessageId(), c9519ad.LIZJ, c9519ad.toString(), null, Integer.valueOf(emptyList.size()), false, "_link_room_fight", 32, null);
            c4806x.LJIIJ = new C4807a(System.currentTimeMillis(), "leaveMsg", String.valueOf(c8874fl.getMessageId()), "leaveUser=" + c9519ad.LIZJ);
        }
        c4806x.LJIIJJI = c9519ad.LIZIZ;
        c4806x.LJIIJ = new C4807a(System.currentTimeMillis(), "leaveMsg", String.valueOf(c8874fl.getMessageId()), "fallback leaveUser=" + c9519ad.LIZJ);
        HH8.LIZ(c8874fl.getMessageId(), c9519ad.LIZJ, c9519ad.toString(), null, null, false, null, 120, null);
        return true;
    }

    public final boolean LIZJ(C8874fl c8874fl, List<? extends AnchorLinkUser> list) {
        boolean z;
        Iterator<Map.Entry<Long, RoomLinkerContent>> it;
        Map<Long, RoomLinkerContent> map;
        Iterator<Map.Entry<Long, RoomLinkerContent>> it2;
        Map.Entry<Long, RoomLinkerContent> next;
        RoomLinkerContent value;
        int m15250LJ;
        ChangePlayModeData changePlayModeData;
        List<AnchorLinkUser> list2;
        AnchorLinkUser anchorLinkUser;
        ListUserContent listUserContent;
        ListUserLinkmicAudienceContent listUserLinkmicAudienceContent;
        ChangePlayModeData changePlayModeData2;
        List<AnchorLinkUser> list3;
        AnchorLinkUser anchorLinkUser2;
        ListUserContent listUserContent2;
        ListUserLinkmicAudienceContent listUserLinkmicAudienceContent2;
        ChangePlayModeData changePlayModeData3;
        List<AnchorLinkUser> list4;
        ChangePlayModeData changePlayModeData4;
        MultiRtcInfo multiRtcInfo;
        SingingChallengeRtcInfo singingChallengeRtcInfo;
        Map<Long, String> map2;
        List<AnchorLinkUser> list5;
        AnchorLinkUser anchorLinkUser3;
        ListUserContent listUserContent3;
        ListUserLinkmicAudienceContent listUserLinkmicAudienceContent3;
        List<AnchorLinkUser> list6;
        AnchorLinkUser anchorLinkUser4;
        ListUserContent listUserContent4;
        ListUserLinkmicAudienceContent listUserLinkmicAudienceContent4;
        List<AnchorLinkUser> list7;
        ChangePlayModeData changePlayModeData5;
        MultiRtcInfo multiRtcInfo2;
        SingingChallengeRtcInfo singingChallengeRtcInfo2;
        Map<Long, String> map3;
        List<? extends AnchorLinkUser> list8 = list;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c8874fl, list8}, this, LIZ, false, 24);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        LinkPlayerInfo linkPlayerInfo = null;
        if (!PatchProxy.proxy(new Object[]{c8874fl}, this, LIZ, false, 12).isSupported) {
            if (c8874fl == null) {
                ALogger.m15797i("printMsg", "msg is null");
            } else if (c8874fl.LIZIZ == 12) {
                StringBuilder sb = new StringBuilder("type:");
                sb.append(c8874fl.LIZIZ);
                sb.append('\n');
                sb.append("rtcmap size: ");
                LinkerChangePlayModeContent linkerChangePlayModeContent = c8874fl.LJJIIJZLJL;
                sb.append((linkerChangePlayModeContent == null || (changePlayModeData5 = linkerChangePlayModeContent.changePlayModeData) == null || (multiRtcInfo2 = changePlayModeData5.multiRtcInfo) == null || (singingChallengeRtcInfo2 = multiRtcInfo2.singingChallengeRtcInfo) == null || (map3 = singingChallengeRtcInfo2.LIZIZ) == null) ? null : Integer.valueOf(map3.size()));
                sb.append("----\nuser count:");
                C9527am c9527am = c8874fl.LJIILJJIL;
                sb.append((c9527am == null || (list7 = c9527am.LJIIIIZZ) == null) ? 0 : list7.size());
                sb.append("---user1 enlarge:");
                C9527am c9527am2 = c8874fl.LJIILJJIL;
                sb.append((c9527am2 == null || (list6 = c9527am2.LJIIIIZZ) == null || (anchorLinkUser4 = (AnchorLinkUser) CollectionsKt___CollectionsKt.getOrNull(list6, 0)) == null || (listUserContent4 = anchorLinkUser4.LJIJI) == null || (listUserLinkmicAudienceContent4 = listUserContent4.LIZLLL) == null) ? null : Boolean.valueOf(listUserLinkmicAudienceContent4.LJIILJJIL));
                sb.append("----\nuser2 enlarge:");
                C9527am c9527am3 = c8874fl.LJIILJJIL;
                sb.append((c9527am3 == null || (list5 = c9527am3.LJIIIIZZ) == null || (anchorLinkUser3 = (AnchorLinkUser) CollectionsKt___CollectionsKt.getOrNull(list5, 1)) == null || (listUserContent3 = anchorLinkUser3.LJIJI) == null || (listUserLinkmicAudienceContent3 = listUserContent3.LIZLLL) == null) ? null : Boolean.valueOf(listUserLinkmicAudienceContent3.LJIILJJIL));
                sb.append('\n');
                ALogger.m15797i("printMsg", sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder("type:");
                sb2.append(c8874fl.LIZIZ);
                sb2.append('\n');
                sb2.append("rtcmap size: ");
                LinkerChangePlayModeContent linkerChangePlayModeContent2 = c8874fl.LJJIIJZLJL;
                sb2.append((linkerChangePlayModeContent2 == null || (changePlayModeData4 = linkerChangePlayModeContent2.changePlayModeData) == null || (multiRtcInfo = changePlayModeData4.multiRtcInfo) == null || (singingChallengeRtcInfo = multiRtcInfo.singingChallengeRtcInfo) == null || (map2 = singingChallengeRtcInfo.LIZIZ) == null) ? null : Integer.valueOf(map2.size()));
                sb2.append("----\nuser count:");
                LinkerChangePlayModeContent linkerChangePlayModeContent3 = c8874fl.LJJIIJZLJL;
                sb2.append((linkerChangePlayModeContent3 == null || (changePlayModeData3 = linkerChangePlayModeContent3.changePlayModeData) == null || (list4 = changePlayModeData3.mLinkedUsers) == null) ? 0 : list4.size());
                sb2.append("---\nuser1 enlarge:");
                LinkerChangePlayModeContent linkerChangePlayModeContent4 = c8874fl.LJJIIJZLJL;
                sb2.append((linkerChangePlayModeContent4 == null || (changePlayModeData2 = linkerChangePlayModeContent4.changePlayModeData) == null || (list3 = changePlayModeData2.mLinkedUsers) == null || (anchorLinkUser2 = (AnchorLinkUser) CollectionsKt___CollectionsKt.getOrNull(list3, 0)) == null || (listUserContent2 = anchorLinkUser2.LJIJI) == null || (listUserLinkmicAudienceContent2 = listUserContent2.LIZLLL) == null) ? null : Boolean.valueOf(listUserLinkmicAudienceContent2.LJIILJJIL));
                sb2.append("----\nuser2 enlarge:");
                LinkerChangePlayModeContent linkerChangePlayModeContent5 = c8874fl.LJJIIJZLJL;
                sb2.append((linkerChangePlayModeContent5 == null || (changePlayModeData = linkerChangePlayModeContent5.changePlayModeData) == null || (list2 = changePlayModeData.mLinkedUsers) == null || (anchorLinkUser = (AnchorLinkUser) CollectionsKt___CollectionsKt.getOrNull(list2, 1)) == null || (listUserContent = anchorLinkUser.LJIJI) == null || (listUserLinkmicAudienceContent = listUserContent.LIZLLL) == null) ? null : Boolean.valueOf(listUserLinkmicAudienceContent.LJIILJJIL));
                sb2.append('\n');
                ALogger.m15797i("printMsg", sb2.toString());
            }
        }
        if (c8874fl.LJIILJJIL == null) {
            return false;
        }
        C9527am c9527am4 = c8874fl.LJIILJJIL;
        if (list8 == null) {
            list8 = c9527am4.LJIIIIZZ;
        }
        HH8.LIZ(c8874fl.getMessageId(), c9527am4.LJFF, c9527am4.toString(), list8 != null ? Integer.valueOf(list8.size()) : null);
        if (c9527am4.LIZ()) {
            return LIZ(c8874fl, c9527am4);
        }
        if (list8 != null && !list8.isEmpty()) {
            LIZIZ(list8, c9527am4.LJIIIZ, "updateMsg");
            m15704LJ(list8);
            Iterator<T> it3 = this.LIZJ.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) next2;
                Intrinsics.checkNotNullExpressionValue(linkPlayerInfo2, "");
                User LIZ2 = linkPlayerInfo2.LIZ();
                if (LIZ2 != null && LIZ2.getId() == c9527am4.LJFF) {
                    linkPlayerInfo = next2;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo3 = linkPlayerInfo;
            if (linkPlayerInfo3 != null && c9527am4.LIZLLL() && (m15250LJ = c9527am4.m15250LJ()) >= 0) {
                linkPlayerInfo3.LJJIIJ = m15250LJ;
            }
            this.LJIIJ = new C4807a(System.currentTimeMillis(), "updateMsg", String.valueOf(c8874fl.getMessageId()), c9527am4.LJI());
            z = true;
        } else {
            Iterator<T> it4 = this.LIZJ.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next3 = it4.next();
                LinkPlayerInfo linkPlayerInfo4 = (LinkPlayerInfo) next3;
                Intrinsics.checkNotNullExpressionValue(linkPlayerInfo4, "");
                User LIZ3 = linkPlayerInfo4.LIZ();
                if (LIZ3 != null && LIZ3.getId() == c9527am4.LJFF) {
                    linkPlayerInfo = next3;
                    break;
                }
            }
            if (linkPlayerInfo == null) {
                HH8.LIZ(c8874fl.getMessageId(), c9527am4.LJFF, "update user not found", c9527am4.toString(), (Integer) null, c9527am4.LJFF != 0, 16, (Object) null);
            } else if (c9527am4.LIZJ()) {
                HH8.LIZ(c8874fl.getMessageId(), c9527am4.LJFF, "fallback SilenceStatusUpdate", c9527am4.toString(), (Integer) 0, false, 32, (Object) null);
            }
            z = false;
        }
        List<AnchorLinkUser> emptyList = CollectionsKt__CollectionsKt.emptyList();
        Map<Long, RoomLinkerContent> map4 = c9527am4.LJIIJ;
        if (map4 != null && (it = map4.entrySet().iterator()) != null && it.hasNext() && ((map = c9527am4.LJIIJ) == null || (it2 = map.entrySet().iterator()) == null || (next = it2.next()) == null || (value = next.getValue()) == null || (emptyList = value.linkedUsers) == null)) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (emptyList != null && !emptyList.isEmpty()) {
            LIZ(c9527am4.LJIIJ, c9527am4.LJIIIZ, "updateMsg", this.LIZLLL);
            m15704LJ(emptyList);
            this.LJIIJ = new C4807a(System.currentTimeMillis(), "updateMsg", String.valueOf(c8874fl.getMessageId()), c9527am4.LJI());
        } else if (!z) {
            return false;
        }
        return true;
    }

    private final boolean LIZ(C8874fl c8874fl, C9527am c9527am) {
        Object obj;
        Object obj2;
        boolean LIZIZ;
        boolean z;
        Object obj3;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c8874fl, c9527am}, this, LIZ, false, 26);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Iterator<T> it = this.LIZJ.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj2;
                Intrinsics.checkNotNullExpressionValue(linkPlayerInfo, "");
                User LIZ2 = linkPlayerInfo.LIZ();
                if (LIZ2 != null && LIZ2.getId() == c9527am.f28171LJ) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) obj2;
        JsonObject LIZ3 = C436843Py.LIZ(c9527am.LJII);
        if (linkPlayerInfo2 != null && LIZ3 != null && LIZ3.has("shouldUpdateAllGuestActiveStatus")) {
            JsonElement jsonElement = LIZ3.get("shouldUpdateAllGuestActiveStatus");
            Intrinsics.checkNotNullExpressionValue(jsonElement, "");
            if (Intrinsics.areEqual("1", jsonElement.getAsString())) {
                ALogger.m15800e(this.LIZIZ, "shouldUpdateAllGuestActiveStatus, all user isBackground set to " + c9527am.LIZIZ());
                Iterator<LinkPlayerInfo> it2 = this.LIZJ.iterator();
                while (it2.hasNext()) {
                    LinkPlayerInfo next = it2.next();
                    int indexOf = this.LIZJ.indexOf(next);
                    LinkPlayerInfo LJIIIZ = next.LJIIIZ();
                    if (!c9527am.LIZIZ()) {
                        long j = this.LJIILL.ownerUserId;
                        Intrinsics.checkNotNullExpressionValue(LJIIIZ, "");
                        User LIZ4 = LJIIIZ.LIZ();
                        if (LIZ4 == null || j != LIZ4.getId()) {
                            List<AnchorLinkUser> list = c9527am.LJIIIIZZ;
                            if (list != null) {
                                Iterator<T> it3 = list.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = it3.next();
                                    AnchorLinkUser anchorLinkUser = (AnchorLinkUser) obj3;
                                    Intrinsics.checkNotNullExpressionValue(anchorLinkUser, "");
                                    User LIZ5 = anchorLinkUser.LIZ();
                                    Long valueOf = LIZ5 != null ? Long.valueOf(LIZ5.getId()) : null;
                                    User LIZ6 = LJIIIZ.LIZ();
                                    if (Intrinsics.areEqual(valueOf, LIZ6 != null ? Long.valueOf(LIZ6.getId()) : null)) {
                                        break;
                                    }
                                }
                                AnchorLinkUser anchorLinkUser2 = (AnchorLinkUser) obj3;
                                if (anchorLinkUser2 != null && anchorLinkUser2.LJIIL == 1) {
                                    z = true;
                                    LIZIZ = !c9527am.LIZIZ() || z;
                                    LJIIIZ.LJJJ = LIZIZ;
                                    this.LIZJ.set(indexOf, LJIIIZ);
                                }
                            }
                            z = false;
                            if (!c9527am.LIZIZ()) {
                            }
                            LJIIIZ.LJJJ = LIZIZ;
                            this.LIZJ.set(indexOf, LJIIIZ);
                        }
                    }
                    LIZIZ = c9527am.LIZIZ();
                    LJIIIZ.LJJJ = LIZIZ;
                    this.LIZJ.set(indexOf, LJIIIZ);
                }
                this.LJIIL = c9527am.LIZIZ();
                this.LJIIJJI = c9527am.LJIIIZ;
                this.LJIIJ = new C4807a(System.currentTimeMillis(), "backgroundMsg", String.valueOf(c8874fl.getMessageId()), c9527am.LJI());
                return true;
            }
        }
        if (!this.LJIIL && linkPlayerInfo2 != null && linkPlayerInfo2.LJJJ != c9527am.LIZIZ()) {
            List<AnchorLinkUser> list2 = c9527am.LJIIIIZZ;
            ALogger.m15795w(this.LIZIZ, c9527am.LJFF + " updateBackground " + linkPlayerInfo2.LJJJ + " to " + c9527am.LIZIZ());
            if (!this.LJJII || list2 == null || list2.isEmpty()) {
                int indexOf2 = this.LIZJ.indexOf(linkPlayerInfo2);
                LinkPlayerInfo LJIIIZ2 = linkPlayerInfo2.LJIIIZ();
                LJIIIZ2.LJJJ = c9527am.LIZIZ();
                this.LIZJ.set(indexOf2, LJIIIZ2);
            } else {
                Iterator<T> it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next2 = it4.next();
                    AnchorLinkUser anchorLinkUser3 = (AnchorLinkUser) next2;
                    Intrinsics.checkNotNullExpressionValue(anchorLinkUser3, "");
                    User LIZ7 = anchorLinkUser3.LIZ();
                    if (LIZ7 != null && LIZ7.getId() == c9527am.LJFF) {
                        obj = next2;
                        break;
                    }
                }
                AnchorLinkUser anchorLinkUser4 = (AnchorLinkUser) obj;
                if (anchorLinkUser4 != null) {
                    anchorLinkUser4.LJIIL = c9527am.LIZIZ() ? 1 : 0;
                }
                LIZIZ(list2, c9527am.LJIIIZ, "backgroundMsg");
            }
            this.LJIIJ = new C4807a(System.currentTimeMillis(), "backgroundMsg", String.valueOf(c8874fl.getMessageId()), c9527am.LJI());
            return true;
        }
        String str = this.LIZIZ;
        StringBuilder sb = new StringBuilder("not consumeBackgroundMsg ");
        if (linkPlayerInfo2 != null) {
            obj = Boolean.valueOf(linkPlayerInfo2.LJJJ);
        }
        sb.append(obj);
        sb.append(LoggerUtil.BLANK_TAG);
        sb.append(this.LJIIL);
        sb.append(LoggerUtil.BLANK_TAG);
        sb.append(c9527am);
        ALogger.m15800e(str, sb.toString());
        return false;
    }

    public final boolean LIZIZ(List<? extends AnchorLinkUser> list, long j, String str) {
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, new Long(j), str}, this, LIZ, false, 33);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        List<AnchorLinkUser> LIZJ = LIZJ(CollectionsKt___CollectionsKt.toMutableList((Collection) list), j, str);
        if (LIZJ.isEmpty()) {
            return false;
        }
        if (Intrinsics.areEqual(str, "listV2")) {
            this.LIZJ.clear();
            this.LIZJ.addAll(C79242HLo.LIZ((List<? extends AnchorLinkUser>) LIZJ, true));
            return true;
        }
        ArrayList arrayList = new ArrayList();
        for (AnchorLinkUser anchorLinkUser : LIZJ) {
            Iterator<T> it = this.LIZJ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
                User user = anchorLinkUser.LIZIZ;
                Long valueOf = user != null ? Long.valueOf(user.getId()) : null;
                Intrinsics.checkNotNullExpressionValue(linkPlayerInfo, "");
                User LIZ2 = linkPlayerInfo.LIZ();
                if (Intrinsics.areEqual(valueOf, LIZ2 != null ? Long.valueOf(LIZ2.getId()) : null)) {
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) obj;
            if (linkPlayerInfo2 == null) {
                arrayList.add(C79242HLo.LIZ(anchorLinkUser, false, 1, null));
            } else {
                LinkPlayerInfo LJIIIZ = linkPlayerInfo2.LJIIIZ();
                Intrinsics.checkNotNullExpressionValue(LJIIIZ, "");
                C79242HLo.LIZ(LJIIIZ, anchorLinkUser, false, 2, null);
                arrayList.add(LJIIIZ);
            }
        }
        this.LIZJ.clear();
        this.LIZJ.addAll(arrayList);
        return true;
    }

    public final boolean LIZ(Map<Long, ? extends RoomLinkerContent> map, long j, String str, CopyOnWriteArrayList<LinkPlayerInfo> copyOnWriteArrayList) {
        Map.Entry LIZ2;
        RoomLinkerContent roomLinkerContent;
        List<AnchorLinkUser> list;
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{map, new Long(j), str, copyOnWriteArrayList}, this, LIZ, false, 34);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (map == null || (LIZ2 = C449933qt.LIZ((Map) map)) == null || (roomLinkerContent = (RoomLinkerContent) LIZ2.getValue()) == null || (list = roomLinkerContent.linkedUsers) == null) {
            return false;
        }
        List<AnchorLinkUser> LIZLLL = LIZLLL(CollectionsKt___CollectionsKt.toMutableList((Collection) list), j, str);
        if (LIZLLL.isEmpty()) {
            return false;
        }
        C79007HCn.LJII().LIZ((Map<Long, RoomLinkerContent>) map);
        if (Intrinsics.areEqual(str, "listV2")) {
            copyOnWriteArrayList.clear();
            copyOnWriteArrayList.addAll(C79242HLo.LIZ((List<? extends AnchorLinkUser>) LIZLLL, true));
            return true;
        }
        ArrayList arrayList = new ArrayList();
        for (AnchorLinkUser anchorLinkUser : LIZLLL) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
                User user = anchorLinkUser.LIZIZ;
                Long valueOf = user != null ? Long.valueOf(user.getId()) : null;
                Intrinsics.checkNotNullExpressionValue(linkPlayerInfo, "");
                User LIZ3 = linkPlayerInfo.LIZ();
                if (Intrinsics.areEqual(valueOf, LIZ3 != null ? Long.valueOf(LIZ3.getId()) : null)) {
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) obj;
            if (linkPlayerInfo2 == null) {
                arrayList.add(C79242HLo.LIZ(anchorLinkUser, false, 1, null));
            } else {
                LinkPlayerInfo LJIIIZ = linkPlayerInfo2.LJIIIZ();
                Intrinsics.checkNotNullExpressionValue(LJIIIZ, "");
                C79242HLo.LIZ(LJIIIZ, anchorLinkUser, false, 2, null);
                arrayList.add(LJIIIZ);
            }
        }
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.addAll(arrayList);
        return true;
    }

    public final void LIZ(C6094ae c6094ae) {
        if (PatchProxy.proxy(new Object[]{c6094ae}, this, LIZ, false, 35).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6094ae);
        C9549v LIZ2 = C79242HLo.LIZ(c6094ae);
        List<AnchorLinkUser> list = c6094ae.LJI;
        if (list != null && !list.isEmpty()) {
            LIZ(LIZ2, list);
            boolean LIZIZ = LIZIZ(list, c6094ae.LJFF, "joinChannel");
            m15704LJ(list);
            if (LIZIZ) {
                this.LJIIJ = new C4807a(System.currentTimeMillis(), "joinChannel", "", null, 8);
                String str = this.LIZIZ;
                ALogger.m15795w(str, "refreshList from=joinChannel version=" + c6094ae.LJFF + " onOnlineListChanged callback");
                for (AbstractC79253HLz<LinkPlayerInfo> abstractC79253HLz : this.LJIIIIZZ) {
                    abstractC79253HLz.LIZ(this.LIZJ);
                }
                C79007HCn.LJII().LJIILJJIL = LJIIJJI();
                return;
            }
            String str2 = this.LIZIZ;
            ALogger.m15800e(str2, "list not updated, from=joinChannel version=" + c6094ae.LJFF + " current=" + this.LJIIJJI);
            return;
        }
        String str3 = this.LIZIZ;
        ALogger.m15800e(str3, "onSelfJoinChannel user list is empty! " + LIZ2);
    }

    @Override // p003X.AbstractC78986HBs
    public final void LIZ(List<? extends AnchorLinkUser> list, long j, String str) {
        if (PatchProxy.proxy(new Object[]{list, new Long(j), str}, this, LIZ, false, 36).isSupported) {
            return;
        }
        C106862S5w.LIZ(list, str);
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_INTERACT_API_LIST_USER_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (!settingKey.getValue().booleanValue()) {
            return;
        }
        if (list.isEmpty()) {
            String str2 = this.LIZIZ;
            ALogger.m15800e(str2, "refreshOnlineUserList list is empty! version=" + j + " from=" + str);
        } else if (!LIZIZ(list, j, str)) {
            String str3 = this.LIZIZ;
            ALogger.m15800e(str3, "list not updated, from=" + str + " version=" + j + " current=" + this.LJIIJJI);
        } else {
            String str4 = this.LIZIZ;
            ALogger.m15795w(str4, "refreshList from=" + str + " version=" + j + " onOnlineListChanged callback");
            this.LJIIJ = new C4807a(System.currentTimeMillis(), str, "", null, 8);
            for (AbstractC79253HLz<LinkPlayerInfo> abstractC79253HLz : this.LJIIIIZZ) {
                abstractC79253HLz.LIZ(this.LIZJ);
            }
            C79007HCn.LJII().LJIILJJIL = LJIIJJI();
        }
    }

    @Override // p003X.AbstractC78986HBs
    public final void LIZ(List<? extends AnchorLinkUser> list, long j, String str, Map<Long, ? extends RoomLinkerContent> map) {
        if (PatchProxy.proxy(new Object[]{list, new Long(j), str, map}, this, LIZ, false, 37).isSupported) {
            return;
        }
        C106862S5w.LIZ(list, str);
        if (map == null) {
            LIZ(list, j, str);
            return;
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_INTERACT_API_LIST_USER_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (!settingKey.getValue().booleanValue()) {
            return;
        }
        if (list.isEmpty()) {
            String str2 = this.LIZIZ;
            ALogger.m15800e(str2, "refreshOnlineUserList list is empty! version=" + j + " from=" + str);
        } else if (!LIZIZ(list, j, str)) {
            String str3 = this.LIZIZ;
            ALogger.m15800e(str3, "list not updated, from=" + str + " version=" + j + " current=" + this.LJIIJJI);
        } else {
            String str4 = this.LIZIZ;
            ALogger.m15795w(str4, "refreshList from=" + str + " version=" + j + " onOnlineListChanged callback");
            this.LJIIJ = new C4807a(System.currentTimeMillis(), str, "", null, 8);
            List<AnchorLinkUser> emptyList = CollectionsKt__CollectionsKt.emptyList();
            Iterator<Map.Entry<Long, ? extends RoomLinkerContent>> it = map.entrySet().iterator();
            if (it != null && it.hasNext() && (emptyList = map.entrySet().iterator().next().getValue().linkedUsers) == null) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            if (emptyList != null && !emptyList.isEmpty() && LIZ(map, j, "enterMsg", this.LIZLLL)) {
                this.LJIIJ = new C4807a(System.currentTimeMillis(), str, "", null, 8);
            }
            for (AbstractC79253HLz<LinkPlayerInfo> abstractC79253HLz : this.LJIIIIZZ) {
                abstractC79253HLz.LIZ(this.LIZJ);
                this.LIZLLL = HMC.LIZIZ.LIZ(this.LIZJ, this.LIZLLL);
                CopyOnWriteArrayList<LinkPlayerInfo> copyOnWriteArrayList = this.LIZLLL;
                if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                    abstractC79253HLz.LIZ(this.LIZJ, this.LIZLLL);
                }
            }
            C79007HCn.LJII().LJIILJJIL = LJIIJJI();
        }
    }

    public final void LIZIZ(List<? extends AnchorLinkUser> list) {
        if (!PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 39).isSupported && list != null) {
            ArrayList arrayList = new ArrayList();
            for (AnchorLinkUser anchorLinkUser : list) {
                arrayList.add(C79242HLo.LIZ(anchorLinkUser, false, 1, null));
            }
            LIZLLL(arrayList);
        }
    }

    public final boolean LIZIZ(int i, List<LinkPlayerInfo> list, boolean z, HashMap<String, Integer> hashMap, HashMap<String, Integer> hashMap2) {
        int intValue;
        boolean z2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), list, Byte.valueOf(z ? (byte) 1 : (byte) 0), hashMap, hashMap2}, this, LIZ, false, 43);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(list);
        SettingKey<Integer> settingKey = LiveSettingKeys.LIVE_PREVIEW_ENTER_ROOM_SMOOTH;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Integer value = settingKey.getValue();
        if (value == null || !((intValue = value.intValue()) == 1 || intValue == 3)) {
            return false;
        }
        Integer num = (Integer) this.LJJIJIIJIL.get("feed_live_enter_sei_version", (String) 0);
        if (num.intValue() > 0 && num != Integer.valueOf(i)) {
            this.LJJIJIIJIL.put("feed_live_seat_list_model", new ArrayList());
            return false;
        } else if (list.isEmpty()) {
            return false;
        } else {
            Object obj = this.LJJIJIIJIL.get("feed_live_seat_list_model", (String) new ArrayList());
            Intrinsics.checkNotNullExpressionValue(obj, "");
            List list2 = (List) obj;
            if (list2.isEmpty()) {
                return false;
            }
            if (z) {
                int size = list2.size();
                z2 = false;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = ((LinkPlayerInfo) list2.get(i2)).LJIIJJI;
                    int size2 = list.size();
                    if (i3 >= 0 && size2 > i3) {
                        list.set(i3, list2.get(i2));
                        list.get(i3).LJJJJI = ((LinkPlayerInfo) list2.get(i2)).m15703LJ();
                        z2 = true;
                    }
                }
            } else {
                int size3 = list2.size();
                z2 = false;
                for (int i4 = 0; i4 < size3; i4++) {
                    int size4 = list.size();
                    if (i4 >= 0 && size4 > i4) {
                        list.set(i4, list2.get(i4));
                        list.get(i4).LJJJJI = ((LinkPlayerInfo) list2.get(i4)).m15703LJ();
                        z2 = true;
                    }
                }
            }
            if (!z2) {
                return false;
            }
            if (hashMap != null && hashMap2 != null) {
                int size5 = list2.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) list2.get(i5);
                    String LIZLLL = linkPlayerInfo.LIZLLL();
                    Intrinsics.checkNotNullExpressionValue(LIZLLL, "");
                    hashMap.put(LIZLLL, Integer.valueOf(linkPlayerInfo.m15703LJ()));
                    String LIZLLL2 = linkPlayerInfo.LIZLLL();
                    Intrinsics.checkNotNullExpressionValue(LIZLLL2, "");
                    hashMap2.put(LIZLLL2, Integer.valueOf(linkPlayerInfo.LJIIJJI));
                }
            }
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x00c4, code lost:
        if (r11 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f2, code lost:
        if (r2 != null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean LIZIZ(long r16, java.util.List<com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo> r18, boolean r19, long r20, boolean r22, java.util.HashMap<java.lang.String, java.lang.Integer> r23, java.util.HashMap<java.lang.String, java.lang.Integer> r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.plantform.core.C4806x.LIZIZ(long, java.util.List, boolean, long, boolean, java.util.HashMap, java.util.HashMap, java.lang.String):boolean");
    }

    public final void LIZ(boolean z, String str) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, this, LIZ, false, 51).isSupported && !this.LJI) {
            this.LJI = true;
            SettingKey<Boolean> settingKey = LiveSettingKeys.LINK_LIST_INTERFACE_OPTIMIZE_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                this.LJIL.add(((LinkAnchorApi) C88306Kqq.LIZ().LIZ(LinkAnchorApi.class)).getLinkWaitingList(this.LJIILL.getId(), 50L, "").subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new H6J(this, z), new C79186HJk(this)));
            } else {
                this.LJIL.add(((LinkAnchorApi) C88306Kqq.LIZ().LIZ(LinkAnchorApi.class)).getAllList(this.LJIILL.getId(), this.LJIILL.ownerUserId, 1, 0, false, str).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new H6L(this, z), new C79185HJj(this)));
            }
        }
    }

    @Override // p003X.AbstractC78986HBs
    public final void LIZ(boolean z) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 52).isSupported && !this.LJII) {
            this.LJII = true;
            long currentTimeMillis = System.currentTimeMillis();
            HDP.LIZJ();
            this.LJIL.add(((LinkAnchorApi) C88306Kqq.LIZ().LIZ(LinkAnchorApi.class)).getLinkListV2(this.LJIILL.getId(), this.LJIILL.ownerUserId).subscribeOn(Schedulers.m138io()).flatMap(HM1.LIZIZ).observeOn(AndroidSchedulers.mainThread()).subscribe(new C79246HLs(this, currentTimeMillis, z), new C79184HJi(this, currentTimeMillis)));
        }
    }

    public final void LIZ(LinkPlayerInfo linkPlayerInfo) {
        if (PatchProxy.proxy(new Object[]{linkPlayerInfo}, this, LIZ, false, 65).isSupported) {
            return;
        }
        if (this.LJIJ.size() >= this.LJIILLIIL) {
            this.LJIJ.remove(0);
        }
        this.LJIJ.add(linkPlayerInfo);
    }

    public final boolean LIZ(LinkPlayerInfo linkPlayerInfo, LinkPlayerInfo linkPlayerInfo2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{linkPlayerInfo, linkPlayerInfo2}, this, LIZ, false, 67);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (linkPlayerInfo != null && linkPlayerInfo.LIZ() != null && linkPlayerInfo2 != null && linkPlayerInfo2.LIZ() != null) {
            if (TextUtils.isEmpty(linkPlayerInfo.LIZLLL()) || !TextUtils.equals(linkPlayerInfo.LIZLLL(), linkPlayerInfo2.LIZLLL())) {
                User LIZ2 = linkPlayerInfo.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                if (LIZ2.getId() > 0) {
                    User LIZ3 = linkPlayerInfo.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                    long id = LIZ3.getId();
                    User LIZ4 = linkPlayerInfo2.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                    if (id == LIZ4.getId()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void LIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 68).isSupported) {
            return;
        }
        ALogger.stacktrace(6, "ttlive_link", th.getStackTrace());
    }

    private final boolean LIZ(List<? extends LinkPlayerInfo> list, LinkPlayerInfo linkPlayerInfo) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, linkPlayerInfo}, this, LIZ, false, 73);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        for (LinkPlayerInfo linkPlayerInfo2 : list) {
            User LIZ2 = linkPlayerInfo2.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            long id = LIZ2.getId();
            User LIZ3 = linkPlayerInfo.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
            if (id == LIZ3.getId()) {
                return true;
            }
        }
        return false;
    }

    @Override // p003X.AbstractC78986HBs
    public final User LIZ(long j) {
        User LIZ2;
        User LIZ3;
        User LIZ4;
        User LIZ5;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 78);
        if (proxy.isSupported) {
            return (User) proxy.result;
        }
        Iterator<LinkPlayerInfo> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            LinkPlayerInfo next = it.next();
            if (next != null && (LIZ5 = next.LIZ()) != null && LIZ5.getId() == j) {
                return next.LIZ();
            }
        }
        Iterator<LinkPlayerInfo> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            LinkPlayerInfo next2 = it2.next();
            if (next2 != null && (LIZ4 = next2.LIZ()) != null && LIZ4.getId() == j) {
                return next2.LIZ();
            }
        }
        Iterator<LinkPlayerInfo> it3 = this.LJIJ.iterator();
        while (it3.hasNext()) {
            LinkPlayerInfo next3 = it3.next();
            if (next3 != null && (LIZ3 = next3.LIZ()) != null && LIZ3.getId() == j) {
                return next3.LIZ();
            }
        }
        Iterator<LinkPlayerInfo> it4 = this.LJIJI.iterator();
        while (it4.hasNext()) {
            LinkPlayerInfo next4 = it4.next();
            if (next4 != null && (LIZ2 = next4.LIZ()) != null && LIZ2.getId() == j) {
                return next4.LIZ();
            }
        }
        return null;
    }

    @Override // p003X.AbstractC78986HBs
    public final void LIZ(long j, String str, int i) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, 3}, this, LIZ, false, 79).isSupported) {
            return;
        }
        Iterator<LinkPlayerInfo> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            LinkPlayerInfo next = it.next();
            if (LIZ(j, str, next)) {
                next.LJIIL = 3;
                return;
            }
        }
    }

    @Override // p003X.AbstractC78986HBs
    public final int LIZ(int i) {
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 81);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        Iterator<T> it = this.f26413LJ.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((LinkmicPositionItem) obj).LIZIZ == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        LinkmicPositionItem linkmicPositionItem = (LinkmicPositionItem) obj;
        return linkmicPositionItem != null ? linkmicPositionItem.LIZJ : LinkmicPositionItem.LinkmicPositionStatus.NORMAL.ordinal();
    }

    @Override // p003X.AbstractC78986HBs
    public final void LIZ(List<LinkmicPositionItem> list) {
        if (PatchProxy.proxy(new Object[]{null}, this, LIZ, false, 82).isSupported) {
            return;
        }
        for (LinkmicPositionItem linkmicPositionItem : this.f26413LJ) {
            linkmicPositionItem.LIZJ = LinkmicPositionItem.LinkmicPositionStatus.NORMAL.ordinal();
        }
    }

    @Override // p003X.AbstractC78986HBs
    public final boolean LIZJ(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 83);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Iterator<LinkPlayerInfo> it = this.LIZJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            LinkPlayerInfo next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            if (next.LIZ() != null) {
                User LIZ2 = next.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                if (LIZ2.getId() == j) {
                    if (next.LJIIL != 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final long LJIIL() {
        C4807a c4807a = this.LJIIJ;
        if (c4807a != null) {
            return c4807a.LIZIZ;
        }
        return 0L;
    }

    private final boolean LJIILL() {
        Config.MixStreamType mixStreamType;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 64);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Boolean bool = this.LJIIIZ;
        Intrinsics.checkNotNullExpressionValue(bool, "");
        if (!bool.booleanValue()) {
            return false;
        }
        AbstractC4766ag LIZ2 = AbstractC4766ag.LIZ.LIZ();
        if (LIZ2 != null) {
            mixStreamType = LIZ2.LJIIJ();
        } else {
            mixStreamType = null;
        }
        if (mixStreamType != Config.MixStreamType.CLIENT_MIX) {
            return false;
        }
        return true;
    }

    @Override // p003X.AbstractC78986HBs
    public final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 56).isSupported) {
            return;
        }
        for (AbstractC79253HLz<LinkPlayerInfo> abstractC79253HLz : this.LJIIIIZZ) {
            abstractC79253HLz.LIZ(this.LIZJ);
        }
    }

    @Override // p003X.AbstractC78986HBs
    public final int LJIIJJI() {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 57);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (Lists.isEmpty(this.LIZJ)) {
            return 0;
        }
        Iterator<LinkPlayerInfo> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            LinkPlayerInfo next = it.next();
            if (next != null && next.LJIIIIZZ != 1) {
                i++;
            }
        }
        return i;
    }

    @Override // p003X.AbstractC78986HBs
    public final List<LinkPlayerInfo> LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 70);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        CopyOnWriteArrayList<LinkPlayerInfo> copyOnWriteArrayList = this.LJFF;
        ArrayList arrayList = new ArrayList();
        for (Object obj : copyOnWriteArrayList) {
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
            CopyOnWriteArrayList<LinkPlayerInfo> copyOnWriteArrayList2 = this.LJIIZILJ;
            Intrinsics.checkNotNullExpressionValue(linkPlayerInfo, "");
            if (!LIZ(copyOnWriteArrayList2, linkPlayerInfo)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p003X.AbstractC78986HBs
    public final void LJII() {
        AbstractC4408a LIZIZ;
        AbstractC4409d LIZIZ2;
        AbstractC4410g LIZIZ3;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 71).isSupported) {
            return;
        }
        this.LJIIZILJ.clear();
        this.LJIIZILJ.addAll(this.LJFF);
        if (!PatchProxy.proxy(new Object[0], C78538Gxg.LIZIZ, C78538Gxg.LIZ, false, 28).isSupported) {
            if (C79242HLo.LJIILL() && (LIZIZ3 = C4935a.LIZJ.LIZIZ()) != null) {
                LIZIZ3.mo15685LJ();
            }
            if (C79242HLo.LJIILJJIL() && (LIZIZ2 = C4441a.LIZJ.LIZIZ()) != null) {
                LIZIZ2.LIZLLL();
            }
            if (C79242HLo.LJJI() && (LIZIZ = C5077a.LIZJ.LIZIZ()) != null) {
                LIZIZ.mo15642LJ();
            }
        }
    }

    public final int LJIILIIL() {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 69);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        CopyOnWriteArrayList<LinkmicPositionItem> copyOnWriteArrayList = this.f26413LJ;
        if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
            return 0;
        }
        for (LinkmicPositionItem linkmicPositionItem : copyOnWriteArrayList) {
            if ((!TextUtils.isEmpty(linkmicPositionItem.LIZLLL)) && (i = i + 1) < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return i;
    }

    public final void LJIILJJIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 72).isSupported) {
            return;
        }
        CopyOnWriteArrayList<LinkPlayerInfo> copyOnWriteArrayList = this.LJIIZILJ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : copyOnWriteArrayList) {
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
            CopyOnWriteArrayList<LinkPlayerInfo> copyOnWriteArrayList2 = this.LJFF;
            Intrinsics.checkNotNullExpressionValue(linkPlayerInfo, "");
            if (LIZ(copyOnWriteArrayList2, linkPlayerInfo)) {
                arrayList.add(obj);
            }
        }
        this.LJIIZILJ.clear();
        this.LJIIZILJ.addAll(arrayList);
    }

    @Override // p003X.AbstractC78986HBs
    public final void LJIIIZ() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 62).isSupported) {
            return;
        }
        HMP hmp = new HMP();
        hmp.LJIIIIZZ = 100101;
        long LIZIZ = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ();
        hmp.f6763LJ = String.valueOf(LIZIZ);
        hmp.LJI = C79007HCn.LJII().LIZLLL;
        hmp.LIZIZ = "0";
        hmp.LIZJ = "0";
        hmp.LIZLLL = "0";
        HashMap hashMapOf = MapsKt__MapsKt.hashMapOf(TuplesKt.m137to("shouldUpdateAllGuestActiveStatus", "1"));
        if (C79242HLo.LJIILL() && LIZIZ == this.LJIILL.ownerUserId && LJIILL()) {
            str = C436843Py.LIZ(hashMapOf);
        } else {
            str = "";
        }
        ALogger.m15795w(this.LIZIZ, C0002O.m25086C("sendSignalV1 onEnterBackground ", str));
        long currentTimeMillis = System.currentTimeMillis();
        HDP.LIZ(100101);
        this.LJIL.add(((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).sendSignalV1(this.LJIILL.getId(), GsonProtectorUtils.toJson(KM9.LIZ(), hmp), null, str).subscribeOn(Schedulers.m138io()).subscribe(new HEK(currentTimeMillis, hmp), new HKF(this, currentTimeMillis, hmp)));
    }

    @Override // p003X.AbstractC78986HBs
    public final void LJIIJ() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 63).isSupported) {
            return;
        }
        HMP hmp = new HMP();
        hmp.LJIIIIZZ = 100102;
        long LIZIZ = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ();
        hmp.f6763LJ = String.valueOf(LIZIZ);
        hmp.LJI = C79007HCn.LJII().LIZLLL;
        hmp.LIZIZ = "0";
        hmp.LIZJ = "0";
        hmp.LIZLLL = "0";
        HashMap hashMapOf = MapsKt__MapsKt.hashMapOf(TuplesKt.m137to("shouldUpdateAllGuestActiveStatus", "1"));
        if (!C79242HLo.LJIILL() || LIZIZ != this.LJIILL.ownerUserId || !LJIILL()) {
            str = "";
        } else {
            str = C436843Py.LIZ(hashMapOf);
        }
        ALogger.m15795w(this.LIZIZ, C0002O.m25086C("sendSignalV1 onEnterForeground ", str));
        long currentTimeMillis = System.currentTimeMillis();
        HDP.LIZ(100102);
        CompositeDisposable compositeDisposable = this.LJIL;
        Observable<C5176i<Unit>> observable = ((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).sendSignalV1(this.LJIILL.getId(), GsonProtectorUtils.toJson(KM9.LIZ(), hmp), null, str).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "");
        compositeDisposable.add(C91301Ly3.LIZ(observable, new C449833qj(5, JsBridgeDelegate.GET_URL_OUT_TIME)).subscribeOn(Schedulers.m138io()).subscribe(new HEL(currentTimeMillis, hmp), new HKG(this, currentTimeMillis, hmp)));
    }

    @Override // p003X.AbstractC78986HBs
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJIJJLI = false;
        this.LJIL.clear();
        this.LIZJ.clear();
        this.LJIIIIZZ.clear();
        this.LJJ.clear();
        IMessageManager iMessageManager = this.LJIJJ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LJJIIZ = 0;
        this.LJIILJJIL.clear();
        this.LJIILIIL.clear();
    }

    @Override // p003X.AbstractC78986HBs
    public final void LIZIZ(AbstractC79253HLz<LinkPlayerInfo> abstractC79253HLz) {
        if (PatchProxy.proxy(new Object[]{abstractC79253HLz}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC79253HLz);
        this.LJIIIIZZ.remove(abstractC79253HLz);
    }

    @Override // p003X.AbstractC78986HBs
    public final void LJFF(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 5).isSupported || j <= 0) {
            return;
        }
        this.LJJ.put(Long.valueOf(j), Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public final void LJI(long j) {
        if (!PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 74).isSupported && this.LJJIIZI.containsKey(Long.valueOf(j))) {
            this.LJJIIZI.put(Long.valueOf(j), Boolean.TRUE);
        }
    }

    public final boolean LJII(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 75);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Boolean bool = this.LJJIIZI.get(Long.valueOf(j));
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    private final boolean LIZIZ(C8874fl c8874fl) {
        int i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c8874fl}, this, LIZ, false, 14);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (c8874fl == null || c8874fl.LJIL == null || c8874fl.LJIL.LIZIZ == null || (i = c8874fl.LJIL.LIZ) == 0 || i == 2 || !C78403GvV.LIZIZ.LIZIZ()) {
            return false;
        }
        User user = c8874fl.LJIL.LIZIZ;
        Iterator<T> it = this.LJIIIIZZ.iterator();
        while (it.hasNext()) {
            ((AbstractC79253HLz) it.next()).mo15710a_(user);
        }
        return true;
    }

    private final boolean LIZJ(C8874fl c8874fl) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c8874fl}, this, LIZ, false, 15);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        LinkerLockPositionContent linkerLockPositionContent = c8874fl.LJJIII;
        Intrinsics.checkNotNullExpressionValue(linkerLockPositionContent, "");
        LIZ(this, linkerLockPositionContent.lockedPositions, true, false, 4, null);
        return true;
    }

    private final void LIZ(C8861ey c8861ey) {
        C8862ez c8862ez;
        List<C8864fa> list;
        String str;
        Object obj;
        List<LinkmicPositionItem> list2;
        Object obj2;
        if (PatchProxy.proxy(new Object[]{c8861ey}, this, LIZ, false, 13).isSupported) {
            return;
        }
        Boolean bool = this.LJIIIZ;
        Intrinsics.checkNotNullExpressionValue(bool, "");
        if (bool.booleanValue() && (c8862ez = c8861ey.LIZJ) != null && (list = c8862ez.LIZIZ) != null) {
            for (C8864fa c8864fa : list) {
                Iterator<T> it = this.f26413LJ.iterator();
                while (true) {
                    str = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((LinkmicPositionItem) obj).LIZIZ == c8864fa.LIZ) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                LinkmicPositionItem linkmicPositionItem = (LinkmicPositionItem) obj;
                if (linkmicPositionItem != null) {
                    linkmicPositionItem.f26349LJ = c8864fa.LIZJ;
                    if (linkmicPositionItem.f26349LJ == 3) {
                        str = c8864fa.LIZIZ;
                    } else {
                        C8862ez c8862ez2 = c8861ey.LIZJ;
                        if (c8862ez2 != null && (list2 = c8862ez2.LIZJ) != null) {
                            Iterator<T> it2 = list2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = it2.next();
                                    if (((LinkmicPositionItem) obj2).LIZIZ == linkmicPositionItem.LIZIZ) {
                                        break;
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            LinkmicPositionItem linkmicPositionItem2 = (LinkmicPositionItem) obj2;
                            if (linkmicPositionItem2 != null) {
                                str = linkmicPositionItem2.LIZLLL;
                            }
                        }
                    }
                    linkmicPositionItem.LIZLLL = str;
                }
                for (AbstractC79253HLz<LinkPlayerInfo> abstractC79253HLz : this.LJIIIIZZ) {
                    abstractC79253HLz.LIZIZ(this.f26413LJ);
                }
            }
        }
    }

    /* renamed from: LJ */
    private final void m15704LJ(List<? extends AnchorLinkUser> list) {
        boolean z;
        Object obj;
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 49).isSupported) {
            return;
        }
        Iterator<Map.Entry<Long, Boolean>> it = this.LJJIIZI.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Long, Boolean> next = it.next();
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    long longValue = next.getKey().longValue();
                    User LIZ2 = ((AnchorLinkUser) obj).LIZ();
                    if (LIZ2 != null && longValue == LIZ2.getId()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj == null) {
                it.remove();
            }
        }
        for (AnchorLinkUser anchorLinkUser : list) {
            User LIZ3 = anchorLinkUser.LIZ();
            if (LIZ3 != null) {
                long id = LIZ3.getId();
                if (!this.LJJIIZI.containsKey(Long.valueOf(id))) {
                    if (((IInteractService) ServiceManager.getService(IInteractService.class)).tryGetTargetUserType(id) == UserType.ANCHOR) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LJJIIZI.put(Long.valueOf(id), Boolean.valueOf(z));
                }
                for (AbstractC79253HLz<LinkPlayerInfo> abstractC79253HLz : this.LJIIIIZZ) {
                    abstractC79253HLz.mo15637a_(C79242HLo.LIZ(anchorLinkUser, true));
                }
            }
        }
    }

    @Override // p003X.AbstractC78986HBs
    public final User LIZIZ(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 76);
        if (proxy.isSupported) {
            return (User) proxy.result;
        }
        Iterator<LinkPlayerInfo> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            LinkPlayerInfo next = it.next();
            if (next != null) {
                str5 = next.LIZLLL();
            } else {
                str5 = null;
            }
            if (Intrinsics.areEqual(str5, str)) {
                if (next == null) {
                    return null;
                }
                return next.LIZ();
            }
        }
        Iterator<LinkPlayerInfo> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            LinkPlayerInfo next2 = it2.next();
            if (next2 != null) {
                str4 = next2.LIZLLL();
            } else {
                str4 = null;
            }
            if (Intrinsics.areEqual(str4, str)) {
                if (next2 == null) {
                    return null;
                }
                return next2.LIZ();
            }
        }
        Iterator<LinkPlayerInfo> it3 = this.LJFF.iterator();
        while (it3.hasNext()) {
            LinkPlayerInfo next3 = it3.next();
            if (next3 != null) {
                str3 = next3.LIZLLL();
            } else {
                str3 = null;
            }
            if (Intrinsics.areEqual(str3, str)) {
                if (next3 == null) {
                    return null;
                }
                return next3.LIZ();
            }
        }
        Iterator<LinkPlayerInfo> it4 = this.LJIJ.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            LinkPlayerInfo next4 = it4.next();
            if (next4 != null) {
                str2 = next4.LIZLLL();
            } else {
                str2 = null;
            }
            if (Intrinsics.areEqual(str2, str)) {
                if (next4 != null) {
                    return next4.LIZ();
                }
            }
        }
        return null;
    }

    public final long LIZJ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 77);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        LinkPlayerInfo LIZ2 = LIZ(0L, str);
        if (LIZ2 == null || LIZ2.LIZ() == null) {
            return 0L;
        }
        User LIZ3 = LIZ2.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
        return LIZ3.getId();
    }

    @Override // p003X.AbstractC78986HBs
    public final int LIZLLL(long j) {
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 29);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        Iterator<T> it = this.LIZJ.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
                Intrinsics.checkNotNullExpressionValue(linkPlayerInfo, "");
                User LIZ2 = linkPlayerInfo.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                if (LIZ2.getId() == j) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) obj;
        if (linkPlayerInfo2 != null) {
            return linkPlayerInfo2.LJIIJJI;
        }
        return -1;
    }

    private final void LIZLLL(List<? extends LinkPlayerInfo> list) {
        boolean z;
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 38).isSupported) {
            return;
        }
        CopyOnWriteArrayList<LinkPlayerInfo> copyOnWriteArrayList = this.LJIJI;
        if (copyOnWriteArrayList.size() == list.size()) {
            Iterator<LinkPlayerInfo> it = copyOnWriteArrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            Iterator<? extends LinkPlayerInfo> it2 = list.iterator();
            while (it.hasNext() && it2.hasNext()) {
                LinkPlayerInfo next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                LinkPlayerInfo linkPlayerInfo = next;
                LinkPlayerInfo next2 = it2.next();
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{linkPlayerInfo, next2}, this, LIZ, false, 47);
                if (proxy.isSupported) {
                    if (!((Boolean) proxy.result).booleanValue()) {
                    }
                } else if (linkPlayerInfo.LIZ() != null || next2.LIZ() != null) {
                    if (linkPlayerInfo.LIZ() != null && next2.LIZ() != null) {
                        User LIZ2 = linkPlayerInfo.LIZ();
                        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                        long id = LIZ2.getId();
                        User LIZ3 = next2.LIZ();
                        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                        if (id == LIZ3.getId()) {
                        }
                    }
                }
            }
            return;
        }
        this.LJIJI.clear();
        this.LJIJI.addAll(list);
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 48);
        if (proxy2.isSupported) {
            z = ((Boolean) proxy2.result).booleanValue();
        } else {
            long LIZIZ = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ();
            Iterator<LinkPlayerInfo> it3 = this.LJIJI.iterator();
            while (true) {
                if (it3.hasNext()) {
                    LinkPlayerInfo next3 = it3.next();
                    Intrinsics.checkNotNullExpressionValue(next3, "");
                    User LIZ4 = next3.LIZ();
                    if (LIZ4 != null && LIZ4.getId() == LIZIZ) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        }
        MutableLiveData<Boolean> mutableLiveData = C79046HEa.LIZ().LJII;
        Intrinsics.checkNotNullExpressionValue(mutableLiveData, "");
        if (true ^ Intrinsics.areEqual(mutableLiveData.getValue(), Boolean.valueOf(z))) {
            MutableLiveData<Boolean> mutableLiveData2 = C79046HEa.LIZ().LJII;
            Intrinsics.checkNotNullExpressionValue(mutableLiveData2, "");
            mutableLiveData2.setValue(Boolean.valueOf(z));
        }
        if (this.LJIJI.size() > this.LJJIIZ) {
            this.LJJIIZ = this.LJIJI.size();
        }
    }

    @Override // p003X.AbstractC78986HBs
    public final String LIZIZ(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 60);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        LinkPlayerInfo LIZ2 = LIZ(j, "");
        if (LIZ2 == null || LIZ2.LIZ() == null) {
            return "";
        }
        String LIZLLL = LIZ2.LIZLLL();
        Intrinsics.checkNotNullExpressionValue(LIZLLL, "");
        return LIZLLL;
    }

    @Override // p003X.AbstractC78986HBs
    /* renamed from: LJ */
    public final boolean mo15706LJ(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Long l = this.LJJ.get(Long.valueOf(j));
        if (l == null) {
            return false;
        }
        if (SystemClock.elapsedRealtime() - l.longValue() <= 10000) {
            return true;
        }
        this.LJJ.remove(Long.valueOf(j));
        return false;
    }

    public final void LIZIZ(int i) {
        Object obj;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 18).isSupported) {
            return;
        }
        if (i < 0) {
            i = 0;
        }
        Iterator<T> it = this.f26413LJ.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((LinkmicPositionItem) obj).LIZIZ == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        LinkmicPositionItem linkmicPositionItem = (LinkmicPositionItem) obj;
        if (linkmicPositionItem == null) {
            LinkmicPositionItem linkmicPositionItem2 = new LinkmicPositionItem();
            linkmicPositionItem2.f26349LJ = 1;
            linkmicPositionItem2.LIZIZ = i;
            this.f26413LJ.add(linkmicPositionItem2);
        } else {
            linkmicPositionItem.f26349LJ = 1;
        }
        for (AbstractC79253HLz<LinkPlayerInfo> abstractC79253HLz : this.LJIIIIZZ) {
            abstractC79253HLz.LIZIZ(this.f26413LJ);
        }
    }

    public final void LIZJ(List<LinkPlayerInfo> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 53).isSupported) {
            return;
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LINK_INTERACT_AUDIENCE_OPT_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (settingKey.getValue().booleanValue()) {
            Boolean bool = this.LJIIIZ;
            Intrinsics.checkNotNullExpressionValue(bool, "");
            if (!bool.booleanValue()) {
                C79007HCn LJII = C79007HCn.LJII();
                Intrinsics.checkNotNullExpressionValue(LJII, "");
                if (LJII.LJIL == LinkApplyType.PREPARE_APPLY.value) {
                    return;
                }
                long LIZIZ = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ();
                for (LinkPlayerInfo linkPlayerInfo : list) {
                    if (linkPlayerInfo != null && linkPlayerInfo.LIZ() != null) {
                        User LIZ2 = linkPlayerInfo.LIZ();
                        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                        if (LIZIZ == LIZ2.getId()) {
                            ALogger.m15800e("ttlive_link", "removeSelfOnAttach " + linkPlayerInfo.LJI);
                            long currentTimeMillis = System.currentTimeMillis();
                            HDP.LIZ("optimize_first_enter_in_list");
                            this.LJIL.add(((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).leave(this.LJIILL.getId(), "optimize_first_enter_in_list").subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C79180HJe(currentTimeMillis), new C79183HJh(this, currentTimeMillis)));
                            list.remove(linkPlayerInfo);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d0, code lost:
        LIZ(r15);
        com.bytedance.android.live.liveinteract.api.fulllink.TalkRoomBusinessFullLinkMonitor.LIZIZ.LIZ(r15, r4, 0, com.bytedance.android.live.liveinteract.api.fulllink.TalkRoomBusinessFullLinkMonitor.WrdsStatusType.Exception);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01de, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f3, code lost:
        r4 = r15.LJJIIJZLJL.changePlayModeData.version;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fb, code lost:
        if (r4 == 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fd, code lost:
        r2 = r21.LJJIJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ff, code lost:
        if (r2 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0205, code lost:
        if (r2.isDisposed() != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0207, code lost:
        r2.dispose();
        r3 = r21.LJJIJIIJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x020c, code lost:
        if (r3 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x020e, code lost:
        LIZ(r3);
        com.bytedance.android.live.liveinteract.api.fulllink.TalkRoomBusinessFullLinkMonitor.LIZIZ.LIZ(r3, r4, 0, com.bytedance.android.live.liveinteract.api.fulllink.TalkRoomBusinessFullLinkMonitor.WrdsStatusType.BackLog);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x021a, code lost:
        r21.LJJIJIIJI = r15;
        r0 = p003X.HMV.LIZLLL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0220, code lost:
        if (r0 != null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0222, code lost:
        LIZ(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0225, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x026d, code lost:
        r18 = java.lang.System.currentTimeMillis();
        r21.LJJIJ = r0.LIZ().LIZ(r4, p003X.HMV.LIZ()).take(1).subscribe(new p003X.C79247HLt(r21, r15, r4, r18), new p003X.HM3(r21, r15, r4, r18));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x029d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01df, code lost:
        r4 = r15.LJIILJJIL.LJIIIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01e4, code lost:
        r4 = r15.LJIILIIL.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01e9, code lost:
        r4 = r15.LJIIIZ.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01ee, code lost:
        r4 = r15.LJIIIIZZ.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0240, code lost:
        if (((java.lang.Boolean) r3.result).booleanValue() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x026a, code lost:
        if (p003X.HMV.LIZIZ.contains(java.lang.Integer.valueOf(r15.LIZIZ)) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x025b, code lost:
        if (r2.getValue().booleanValue() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
        if (r2.booleanValue() != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01aa, code lost:
        if (((java.lang.Boolean) r3.result).booleanValue() != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ba, code lost:
        if (com.bytedance.hotfix.PatchProxy.proxy(new java.lang.Object[]{r15}, r21, com.bytedance.android.live.liveinteract.plantform.core.C4806x.LIZ, false, 8).isSupported != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01bc, code lost:
        r4 = r15.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c0, code lost:
        if (r4 == 6) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c2, code lost:
        if (r4 == 7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c4, code lost:
        if (r4 == 11) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c8, code lost:
        if (r4 == 12) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01cc, code lost:
        if (r4 == 33) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ce, code lost:
        r4 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a2  */
    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMessage(com.p1594ss.ugc.live.sdk.message.data.IMessage r22) {
        /*
            Method dump skipped, instructions count: 1292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.plantform.core.C4806x.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    /* renamed from: LJ */
    private final void m15705LJ(long j, String str) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str}, this, LIZ, false, 50).isSupported || str == null) {
            return;
        }
        Object obj = this.LJJIJIIJIL.get("data_online_changed_list", (String) new ArrayList());
        Intrinsics.checkNotNullExpressionValue(obj, "");
        List<LinkPlayerInfo> list = (List) obj;
        for (LinkPlayerInfo linkPlayerInfo : list) {
            User LIZ2 = linkPlayerInfo.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            if (LIZ2.getId() == j) {
                linkPlayerInfo.LIZJ = str;
            }
        }
        this.LJJIJIIJIL.put("data_online_changed_list", new ArrayList(list));
    }

    private final void LIZ(C9549v c9549v, List<? extends AnchorLinkUser> list) {
        List<Long> list2;
        Object obj;
        if (PatchProxy.proxy(new Object[]{c9549v, list}, this, LIZ, false, 30).isSupported) {
            return;
        }
        C9536f c9536f = c9549v.LJII;
        if (c9536f != null) {
            list2 = c9536f.LIZJ;
        } else {
            list2 = null;
        }
        for (AnchorLinkUser anchorLinkUser : list) {
            User LIZ2 = anchorLinkUser.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            if (LIZ2.getId() == c9549v.LIZLLL) {
                anchorLinkUser.LJIILJJIL = c9549v.LJI;
                anchorLinkUser.LJIIZILJ = true;
            }
            if (list2 != null && !list2.isEmpty()) {
                User LIZ3 = anchorLinkUser.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                if (list2.contains(Long.valueOf(LIZ3.getId()))) {
                    anchorLinkUser.LJIILLIIL = true;
                    anchorLinkUser.LJIILL = c9549v.LJII;
                }
            }
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                long j = c9549v.LIZLLL;
                User LIZ4 = ((AnchorLinkUser) obj).LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                if (j == LIZ4.getId()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        AnchorLinkUser anchorLinkUser2 = (AnchorLinkUser) obj;
        if (anchorLinkUser2 != null) {
            anchorLinkUser2.LJIILIIL = c9549v.f28179LJ;
        }
    }

    @Override // p003X.AbstractC78986HBs
    /* renamed from: LIZJ */
    public final LinkPlayerInfo LIZIZ(long j, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str}, this, LIZ, false, 55);
        if (proxy.isSupported) {
            return (LinkPlayerInfo) proxy.result;
        }
        Iterator<LinkPlayerInfo> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            LinkPlayerInfo next = it.next();
            if (LIZ(j, str, next)) {
                return next;
            }
        }
        return null;
    }

    @Override // p003X.AbstractC78986HBs
    /* renamed from: LIZLLL */
    public final LinkPlayerInfo LIZ(long j, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str}, this, LIZ, false, 80);
        if (proxy.isSupported) {
            return (LinkPlayerInfo) proxy.result;
        }
        Iterator<LinkPlayerInfo> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            LinkPlayerInfo next = it.next();
            if (LIZ(j, str, next)) {
                return next;
            }
        }
        Iterator<LinkPlayerInfo> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            LinkPlayerInfo next2 = it2.next();
            if (LIZ(j, str, next2)) {
                return next2;
            }
        }
        Iterator<LinkPlayerInfo> it3 = this.LJIJ.iterator();
        while (it3.hasNext()) {
            LinkPlayerInfo next3 = it3.next();
            if (LIZ(j, str, next3)) {
                return next3;
            }
        }
        return null;
    }

    public final boolean LIZLLL(C8874fl c8874fl, List<? extends AnchorLinkUser> list) {
        Integer num;
        boolean z;
        boolean z2;
        String str;
        Iterator<Map.Entry<Long, RoomLinkerContent>> it;
        Map<Long, RoomLinkerContent> map;
        Iterator<Map.Entry<Long, RoomLinkerContent>> it2;
        Map.Entry<Long, RoomLinkerContent> next;
        RoomLinkerContent value;
        String str2;
        String str3;
        List<? extends AnchorLinkUser> list2 = list;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c8874fl, list2}, this, LIZ, false, 27);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C9520ae c9520ae = c8874fl.LJIILIIL;
        Intrinsics.checkNotNullExpressionValue(c9520ae, "");
        boolean LIZ2 = c9520ae.LIZ();
        if (LIZ2 && !this.LJJIFFI.LJII) {
            return false;
        }
        LIZIZ(c9520ae.f28167LJ);
        if (list2 == null) {
            list2 = c9520ae.LIZLLL;
        }
        HH8 hh8 = HH8.LIZIZ;
        long messageId = c8874fl.getMessageId();
        String c9520ae2 = c9520ae.toString();
        Integer num2 = null;
        if (list2 != null) {
            num = Integer.valueOf(list2.size());
        } else {
            num = null;
        }
        HH8.LIZ(hh8, messageId, c9520ae2, num, LIZ2, (String) null, 16, (Object) null);
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        String str4 = "timerPushMsg";
        if (!z) {
            long j = c9520ae.LIZIZ;
            if (!LIZ2) {
                str2 = "linkedListChangeMsg";
            } else {
                str2 = str4;
            }
            z2 = LIZIZ(list2, j, str2);
            m15704LJ(list2);
            if (z2) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!LIZ2) {
                    str3 = "linkedListChangeMsg";
                } else {
                    str3 = str4;
                }
                this.LJIIJ = new C4807a(currentTimeMillis, str3, String.valueOf(c8874fl.getMessageId()), null, 8);
            }
        } else {
            z2 = false;
        }
        List<AnchorLinkUser> emptyList = CollectionsKt__CollectionsKt.emptyList();
        Map<Long, RoomLinkerContent> map2 = c9520ae.LJFF;
        if (map2 != null && (it = map2.entrySet().iterator()) != null && it.hasNext() && ((map = c9520ae.LJFF) == null || (it2 = map.entrySet().iterator()) == null || (next = it2.next()) == null || (value = next.getValue()) == null || (emptyList = value.linkedUsers) == null)) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        HH8 hh82 = HH8.LIZIZ;
        long messageId2 = c8874fl.getMessageId();
        String c9520ae3 = c9520ae.toString();
        if (emptyList != null) {
            num2 = Integer.valueOf(emptyList.size());
        }
        hh82.LIZ(messageId2, c9520ae3, num2, LIZ2, "_link_room_fight");
        if (emptyList != null && !emptyList.isEmpty()) {
            Map<Long, RoomLinkerContent> map3 = c9520ae.LJFF;
            long j2 = c9520ae.LIZIZ;
            if (!LIZ2) {
                str = "linkedListChangeMsg";
            } else {
                str = str4;
            }
            boolean LIZ3 = LIZ(map3, j2, str, this.LIZLLL);
            m15704LJ(emptyList);
            if (LIZ3) {
                long currentTimeMillis2 = System.currentTimeMillis();
                if (!LIZ2) {
                    str4 = "linkedListChangeMsg";
                }
                this.LJIIJ = new C4807a(currentTimeMillis2, str4, String.valueOf(c8874fl.getMessageId()), null, 8);
                return true;
            }
        }
        if (!z2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r1.getId() != r8) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean LIZ(long r8, java.lang.String r10, com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo r11) {
        /*
            r7 = this;
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r8)
            r3 = 0
            r2[r3] = r0
            r6 = 1
            r2[r6] = r10
            r0 = 2
            r2[r0] = r11
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.plantform.core.C4806x.LIZ
            r0 = 66
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r7, r1, r3, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L26
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L26:
            r4 = 0
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 > 0) goto L33
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L33
            return r3
        L33:
            if (r11 == 0) goto L5f
            com.bytedance.android.live.base.model.user.User r0 = r11.LIZ()
            if (r0 == 0) goto L5f
            if (r1 <= 0) goto L4e
            com.bytedance.android.live.base.model.user.User r1 = r11.LIZ()
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            long r1 = r1.getId()
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L5e
        L4e:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L5f
            java.lang.String r0 = r11.LIZLLL()
            boolean r0 = android.text.TextUtils.equals(r0, r10)
            if (r0 == 0) goto L5f
        L5e:
            return r6
        L5f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.plantform.core.C4806x.LIZ(long, java.lang.String, com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo):boolean");
    }

    private final List<AnchorLinkUser> LIZLLL(List<AnchorLinkUser> list, long j, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, new Long(j), str}, this, LIZ, false, 32);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        if (!this.LJJII) {
            return list;
        }
        if (j > 0 && j < this.LJIIJJI) {
            ALogger.m15800e(this.LIZIZ, "link room list version rollback, still use new list");
            return list;
        }
        this.LJIIJJI = j;
        String str2 = this.LIZIZ;
        ALogger.m15797i(str2, "processLinkRoomListWithVersion " + str + " list_version=" + j);
        return list;
    }

    public C4806x(Room room, DataCenter dataCenter, int i) {
        C106862S5w.LIZ(room, dataCenter);
        this.LJIILL = room;
        this.LJJIJIIJIL = dataCenter;
        this.LJJIJIL = i;
        this.LJIJJ = (IMessageManager) this.LJJIJIIJIL.get("data_message_manager");
        this.LJIIIZ = (Boolean) this.LJJIJIIJIL.get("data_is_anchor", (String) Boolean.FALSE);
        SettingKey<C6860br> settingKey = LiveSettingKeys.LIST_USER_VERSION_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        this.LJJIFFI = settingKey.getValue();
        this.LJJII = this.LJJIFFI.LIZ;
    }

    private final void LIZ(List<LinkmicPositionItem> list, boolean z, boolean z2) {
        Object obj;
        if (PatchProxy.proxy(new Object[]{list, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 16).isSupported) {
            return;
        }
        for (LinkmicPositionItem linkmicPositionItem : this.f26413LJ) {
            if (z) {
                linkmicPositionItem.LIZJ = LinkmicPositionItem.LinkmicPositionStatus.NORMAL.ordinal();
            } else {
                if (linkmicPositionItem.LIZJ == LinkmicPositionItem.LinkmicPositionStatus.BIDPAID.ordinal()) {
                    linkmicPositionItem.LIZJ = LinkmicPositionItem.LinkmicPositionStatus.NORMAL.ordinal();
                }
                linkmicPositionItem.LIZLLL = "";
                linkmicPositionItem.f26349LJ = 0;
            }
        }
        if (list != null) {
            for (LinkmicPositionItem linkmicPositionItem2 : list) {
                Iterator<T> it = this.f26413LJ.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((LinkmicPositionItem) obj).LIZIZ == linkmicPositionItem2.LIZIZ) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                LinkmicPositionItem linkmicPositionItem3 = (LinkmicPositionItem) obj;
                if (linkmicPositionItem3 == null) {
                    this.f26413LJ.add(linkmicPositionItem2);
                } else if (z) {
                    linkmicPositionItem3.LIZJ = linkmicPositionItem2.LIZJ;
                } else {
                    if (linkmicPositionItem2.LIZJ == LinkmicPositionItem.LinkmicPositionStatus.BIDPAID.ordinal()) {
                        linkmicPositionItem3.LIZJ = linkmicPositionItem2.LIZJ;
                    }
                    linkmicPositionItem3.LIZLLL = linkmicPositionItem2.LIZLLL;
                    linkmicPositionItem3.f26349LJ = linkmicPositionItem2.f26349LJ;
                }
            }
        }
        if (z2) {
            for (AbstractC79253HLz<LinkPlayerInfo> abstractC79253HLz : this.LJIIIIZZ) {
                abstractC79253HLz.LIZIZ(this.f26413LJ);
            }
        }
    }

    private final List<AnchorLinkUser> LIZJ(List<AnchorLinkUser> list, long j, String str) {
        boolean z;
        boolean z2;
        C4806x c4806x;
        String str2;
        Object obj;
        Long l;
        Long l2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, new Long(j), str}, this, LIZ, false, 31);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        if (!this.LJJII) {
            return list;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i > 0) {
            long j2 = this.LJIIJJI;
            if (j < j2) {
                C79244HLq c79244HLq = this.LJJIII;
                List<LinkPlayerInfo> list2 = this.LIZJ;
                C4807a c4807a = this.LJIIJ;
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str, new Long(j2), new Long(j), list, list2, c4807a}, c79244HLq, C79244HLq.LIZ, false, 1);
                if (proxy2.isSupported) {
                    z2 = ((Boolean) proxy2.result).booleanValue();
                    c4806x = this;
                } else {
                    C106862S5w.LIZ(str, list, list2);
                    if (!Intrinsics.areEqual(str, "listV2")) {
                        if (c4807a != null) {
                            str2 = c4807a.LIZJ;
                        } else {
                            str2 = null;
                        }
                        if (Intrinsics.areEqual(str2, "listV2")) {
                            ALogger.m15795w("ttlive_link_list_version", "listV2 invalid rollback, [" + str + "] last=" + c4807a + " current=" + j2 + ", new=" + j);
                            z2 = false;
                            c4806x = this;
                        }
                    }
                    String LIZ2 = c79244HLq.LIZ(str, list, list2, c4807a);
                    if (LIZ2.length() == 0) {
                        ALogger.m15800e("ttlive_link_list_version", "invalid rollback, [" + str + "] last=" + c4807a + " cnt=" + c79244HLq.LIZJ);
                        z2 = false;
                        c4806x = this;
                    } else {
                        c79244HLq.LIZJ++;
                        ALogger.m15800e("ttlive_link_list_version", "[" + str + "] version rollback! type=" + LIZ2 + "; cnt=" + c79244HLq.LIZJ + ", last=" + c4807a + " current=" + j2 + ", new=" + j);
                        Map<String, Object> linkedHashMap = new LinkedHashMap<>();
                        linkedHashMap.put("new_list_version", Long.valueOf(j));
                        linkedHashMap.put("version_diff", Long.valueOf(j2 - j));
                        linkedHashMap.put("error_msg", LIZ2);
                        c79244HLq.LIZ(linkedHashMap, str, j2, c4807a);
                        if (c79244HLq.LIZJ % c79244HLq.LIZIZ == 0) {
                            HH8.LIZ("fatal_list_version_rollback", (Map) linkedHashMap, false, 4, (Object) null);
                        } else {
                            C79046HEa LIZ3 = C79046HEa.LIZ();
                            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                            if (LIZ3.LIZJ() && System.currentTimeMillis() - c79244HLq.LJII > 60000) {
                                c79244HLq.LJII = System.currentTimeMillis();
                                if (c79244HLq.LIZLLL) {
                                    HH8.LIZ("list_version_rollback", (Map) linkedHashMap, false, 4, (Object) null);
                                } else {
                                    ALogger.m15795w("ttlive_link_list_version", linkedHashMap.toString());
                                }
                            }
                        }
                        z2 = true;
                        c4806x = this;
                    }
                }
                if (c4806x.LJJIFFI.LIZIZ) {
                    ALogger.m15800e(c4806x.LIZIZ, "interceptOldVersion");
                    return new ArrayList();
                }
                if (z2) {
                    ArrayList<Object> arrayList = new ArrayList();
                    for (AnchorLinkUser anchorLinkUser : list) {
                        Iterator<T> it = c4806x.LIZJ.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
                                User user = anchorLinkUser.LIZIZ;
                                if (user != null) {
                                    l = Long.valueOf(user.getId());
                                } else {
                                    l = null;
                                }
                                Intrinsics.checkNotNullExpressionValue(linkPlayerInfo, "");
                                User LIZ4 = linkPlayerInfo.LIZ();
                                if (LIZ4 != null) {
                                    l2 = Long.valueOf(LIZ4.getId());
                                } else {
                                    l2 = null;
                                }
                                if (Intrinsics.areEqual(l, l2)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) obj;
                        if (linkPlayerInfo2 != null) {
                            anchorLinkUser.f26348LJ = linkPlayerInfo2.LJI;
                            anchorLinkUser.LJFF = linkPlayerInfo2.m15703LJ();
                            anchorLinkUser.LJI = linkPlayerInfo2.LJIIJJI;
                            anchorLinkUser.LJII = linkPlayerInfo2.LJIIL;
                            anchorLinkUser.LJIIJJI = linkPlayerInfo2.LJJIIJ;
                            anchorLinkUser.LJIIL = linkPlayerInfo2.LJJJ ? 1 : 0;
                        } else {
                            arrayList.add(anchorLinkUser);
                        }
                    }
                    for (Object obj2 : arrayList) {
                        list.remove(obj2);
                    }
                    ALogger.m15800e(c4806x.LIZIZ, "correct link version data, removedUsers=" + arrayList.size() + ", corrected list=" + C79242HLo.LIZIZ(list));
                }
                return list;
            }
        }
        if (i == 0) {
            C79244HLq c79244HLq2 = this.LJJIII;
            long j3 = this.LJIIJJI;
            C4807a c4807a2 = this.LJIIJ;
            if (!PatchProxy.proxy(new Object[]{str, new Long(j3), list, c4807a2}, c79244HLq2, C79244HLq.LIZ, false, 3).isSupported) {
                C106862S5w.LIZ(str, list);
                c79244HLq2.LJFF++;
                ALogger.m15800e("ttlive_link_list_version", "[" + str + "] listVersion zero, cnt=" + c79244HLq2.LJFF + ", current=" + j3 + ", list=" + C79242HLo.LIZIZ(list));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                c79244HLq2.LIZ(linkedHashMap2, str, j3, c4807a2);
                if (c79244HLq2.LJFF % c79244HLq2.f6759LJ == 0) {
                    C79046HEa LIZ5 = C79046HEa.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                    if (LIZ5.LIZJ() && c79244HLq2.LJI) {
                        HH8.LIZ("fatal_zero_list_version", (Map) linkedHashMap2, false, 4, (Object) null);
                        if (c79244HLq2.LJFF <= c79244HLq2.f6759LJ) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c79244HLq2.LJI = z;
                    }
                }
                C79046HEa LIZ6 = C79046HEa.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ6, "");
                if (LIZ6.LIZJ() && c79244HLq2.LJI && System.currentTimeMillis() - c79244HLq2.LJIIIIZZ >= 60000) {
                    c79244HLq2.LJIIIIZZ = System.currentTimeMillis();
                    HH8.LIZ("list_version_zero", (Map) linkedHashMap2, false, 4, (Object) null);
                }
            }
        } else if (j == this.LJIIJJI) {
            C79244HLq c79244HLq3 = this.LJJIII;
            C4807a c4807a3 = this.LJIIJ;
            if (!PatchProxy.proxy(new Object[]{str, new Long(j), c4807a3}, c79244HLq3, C79244HLq.LIZ, false, 4).isSupported) {
                C106862S5w.LIZ(str);
                ALogger.m15800e("ttlive_link_list_version", "[" + str + "] same version, from=" + str + " version=" + j + " refresh=" + c4807a3);
                C79046HEa LIZ7 = C79046HEa.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ7, "");
                if (LIZ7.LIZJ() && System.currentTimeMillis() - c79244HLq3.LJIIIZ >= 60000) {
                    c79244HLq3.LJIIIZ = System.currentTimeMillis();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    c79244HLq3.LIZ(linkedHashMap3, str, j, c4807a3);
                    HH8.LIZ("list_version_same", (Map) linkedHashMap3, false, 4, (Object) null);
                }
            }
        }
        this.LJIIJJI = j;
        this.LJJIII.LIZ(j);
        ALogger.m15797i(this.LIZIZ, "processListWithVersion " + str + " list_version=" + j);
        return list;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.plantform.core.x$a */
    /* loaded from: classes3.dex */
    public static final class C4807a {
        public static ChangeQuickRedirect LIZ;
        public final long LIZIZ;
        public final String LIZJ;
        public final String LIZLLL;

        /* renamed from: LJ */
        public final String f26414LJ;

        static {
            Covode.recordClassIndex(29343);
        }

        private Object[] LIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
            return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.LIZIZ), this.LIZJ, this.LIZLLL, this.f26414LJ};
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof C4807a) {
                return C106862S5w.LIZ(((C4807a) obj).LIZ(), LIZ());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LinkUserInfoCenterV2$RefreshInfo:%s,%s,%s,%s", LIZ());
        }

        public C4807a(long j, String str, String str2, String str3) {
            C106862S5w.LIZ(str);
            this.LIZIZ = j;
            this.LIZJ = str;
            this.LIZLLL = str2;
            this.f26414LJ = str3;
        }

        public /* synthetic */ C4807a(long j, String str, String str2, String str3, int i) {
            this(j, str, str2, null);
        }
    }

    @Override // p003X.AbstractC78986HBs
    public final /* synthetic */ Boolean LIZ(int i, List list, boolean z, HashMap hashMap, HashMap hashMap2) {
        return Boolean.valueOf(LIZIZ(3, (List<LinkPlayerInfo>) list, true, (HashMap<String, Integer>) null, (HashMap<String, Integer>) null));
    }

    public static /* synthetic */ boolean LIZIZ(C4806x c4806x, C8874fl c8874fl, List list, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4806x, c8874fl, null, 2, null}, null, LIZ, true, 23);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return c4806x.LIZIZ(c8874fl, (List<? extends AnchorLinkUser>) null);
    }

    public static /* synthetic */ boolean LIZJ(C4806x c4806x, C8874fl c8874fl, List list, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4806x, c8874fl, null, 2, null}, null, LIZ, true, 25);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return c4806x.LIZJ(c8874fl, (List<? extends AnchorLinkUser>) null);
    }

    public static /* synthetic */ boolean LIZLLL(C4806x c4806x, C8874fl c8874fl, List list, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4806x, c8874fl, null, 2, null}, null, LIZ, true, 28);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return c4806x.LIZLLL(c8874fl, (List<? extends AnchorLinkUser>) null);
    }

    public static /* synthetic */ boolean LIZ(C4806x c4806x, C8874fl c8874fl, List list, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4806x, c8874fl, null, 2, null}, null, LIZ, true, 21);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return c4806x.LIZ(c8874fl, (List<? extends AnchorLinkUser>) null);
    }

    public static /* synthetic */ void LIZ(C4806x c4806x, List list, boolean z, boolean z2, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        if (PatchProxy.proxy(new Object[]{c4806x, list, Byte.valueOf(b), (byte) 0, Integer.valueOf(i), null}, null, LIZ, true, 17).isSupported) {
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        c4806x.LIZ(list, z, z2);
    }

    @Override // p003X.AbstractC78986HBs
    public final /* synthetic */ Boolean LIZ(long j, List list, boolean z, long j2, boolean z2, HashMap hashMap, HashMap hashMap2, String str) {
        return Boolean.valueOf(LIZIZ(j, list, true, j2, false, null, null, str));
    }
}
