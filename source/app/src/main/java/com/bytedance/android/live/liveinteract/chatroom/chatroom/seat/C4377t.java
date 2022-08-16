package com.bytedance.android.live.liveinteract.chatroom.chatroom.seat;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.chatroom.model.LinkApplyType;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p353ui.LinkSucAnimationView;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p353ui.SeatAnimationView;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.ktvapi.IKtvService;
import com.bytedance.android.livesdk.message.model.InteractiveSongUserInfo;
import com.bytedance.android.livesdk.message.model.OrderInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9531aq;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9536f;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC78986HBs;
import p003X.AbstractC81014HwW;
import p003X.AbstractC81060HxG;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C79252HLy;
import p003X.C80820HtO;
import p003X.C80847Htp;
import p003X.C80852Htu;
import p003X.C80900Hug;
import p003X.C80963Hvh;
import p003X.C81032Hwo;
import p003X.C81048Hx4;
import p003X.C81061HxH;
import p003X.C81066HxM;
import p003X.C81105Hxz;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.t */
/* loaded from: classes3.dex */
public final class C4377t implements AbstractC81014HwW {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZJ;
    public AbstractC4370h LIZLLL;

    /* renamed from: LJ */
    public int f26291LJ;
    public int LJII;
    public boolean LJIIIIZZ;
    public Map<Long, SeatAnimationView> LIZIZ = new LinkedHashMap();
    public List<C9536f> LJFF = new ArrayList();
    public List<Long> LJI = new ArrayList();

    static {
        Covode.recordClassIndex(26399);
    }

    @Override // p003X.AbstractC81014HwW
    public final boolean LIZ() {
        return this.LJIIIIZZ;
    }

    public final void LIZ(OrderInfo orderInfo) {
        if (PatchProxy.proxy(new Object[]{orderInfo}, this, LIZ, false, 8).isSupported) {
            return;
        }
        AbstractC4370h abstractC4370h = this.LIZLLL;
        if (abstractC4370h != null && abstractC4370h.LIZIZ()) {
            return;
        }
        if (orderInfo == null) {
            for (Map.Entry<Long, SeatAnimationView> entry : this.LIZIZ.entrySet()) {
                entry.getValue().LIZ(new C81061HxH(false));
            }
            return;
        }
        for (Map.Entry<Long, SeatAnimationView> entry2 : this.LIZIZ.entrySet()) {
            InteractiveSongUserInfo interactiveSongUserInfo = orderInfo.LIZIZ;
            if (interactiveSongUserInfo != null && interactiveSongUserInfo.LIZIZ == entry2.getKey().longValue()) {
                entry2.getValue().LIZ(new C81061HxH(true));
            } else {
                entry2.getValue().LIZ(new C81061HxH(false));
            }
        }
    }

    @Override // p003X.AbstractC81014HwW
    public final void LIZ(C81105Hxz c81105Hxz) {
        if (PatchProxy.proxy(new Object[]{c81105Hxz}, this, LIZ, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(c81105Hxz);
        if (!(c81105Hxz instanceof C80900Hug)) {
            return;
        }
        C80900Hug c80900Hug = (C80900Hug) c81105Hxz;
        if (!LIZ(Long.valueOf(c80900Hug.LIZIZ))) {
            return;
        }
        LIZ(c80900Hug.LIZIZ);
        ALogger.m15801d("SeatAnimManager", "#GuestBattleDebug# [onTaskStart] GuestBattle Anim coming, stop Emoji");
    }

    public final boolean LIZ(Long l) {
        SeatAnimationView seatAnimationView;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{l}, this, LIZ, false, 21);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (l != null && (seatAnimationView = this.LIZIZ.get(l)) != null) {
            return seatAnimationView.LIZIZ();
        }
        return false;
    }

    public final boolean LIZ(Long l, Long l2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{l, l2}, this, LIZ, false, 23);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        SeatAnimTaskState LIZIZ = LIZIZ(l);
        SeatAnimTaskState LIZIZ2 = LIZIZ(l2);
        return LIZIZ == SeatAnimTaskState.LINK_SUC_ANIM || LIZIZ == SeatAnimTaskState.CITY_ANIM || LIZIZ2 == SeatAnimTaskState.LINK_SUC_ANIM || LIZIZ2 == SeatAnimTaskState.CITY_ANIM || LIZIZ == SeatAnimTaskState.GUEST_BATTLE_ANIM || LIZIZ2 == SeatAnimTaskState.GUEST_BATTLE_ANIM;
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LIZIZ.clear();
    }

    @Override // p003X.AbstractC81014HwW
    public final void LIZIZ() {
        int size;
        C80963Hvh c80963Hvh;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        this.LJII++;
        int i = this.f26291LJ;
        if (i != 8 && i != 13) {
            size = this.LJI.size();
        } else {
            size = this.LJI.size() - 1;
        }
        if (this.LJII == size) {
            this.LJII = 0;
            this.LJIIIIZZ = false;
            this.LJI.clear();
            if (this.LJFF.size() > 0 && !PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
                C9536f remove = this.LJFF.remove(0);
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{remove}, C80820HtO.LIZIZ, C80820HtO.LIZ, false, 3);
                if (proxy.isSupported) {
                    c80963Hvh = (C80963Hvh) proxy.result;
                } else {
                    C106862S5w.LIZ(remove);
                    c80963Hvh = new C80963Hvh(0L, null, new C81066HxM(false, remove), false, 8);
                }
                List<Long> list = remove.LIZJ;
                Intrinsics.checkNotNullExpressionValue(list, "");
                for (Object obj : list) {
                    SeatAnimationView seatAnimationView = this.LIZIZ.get(obj);
                    if (seatAnimationView != null) {
                        seatAnimationView.LIZ(c80963Hvh);
                    }
                }
                this.LJIIIIZZ = true;
                List<Long> list2 = this.LJI;
                List<Long> list3 = remove.LIZJ;
                Intrinsics.checkNotNullExpressionValue(list3, "");
                list2.addAll(list3);
            }
        }
    }

    public C4377t(int i) {
        this.f26291LJ = i;
    }

    private final float LIZ(String str) {
        Integer num;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        if (str != null) {
            num = Integer.valueOf(str.length());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() <= 2) {
                return 13.0f;
            }
            if (num.intValue() == 3) {
                return 11.0f;
            }
        }
        return 10.0f;
    }

    private final float LIZIZ(String str) {
        Integer num;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 12);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        if (str != null) {
            num = Integer.valueOf(str.length());
        } else {
            num = null;
        }
        if (num == null || num.intValue() > 2) {
            return 13.0f;
        }
        return 15.0f;
    }

    private SeatAnimTaskState LIZIZ(Long l) {
        SeatAnimTaskState taskState;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{l}, this, LIZ, false, 20);
        if (proxy.isSupported) {
            return (SeatAnimTaskState) proxy.result;
        }
        if (l == null) {
            return SeatAnimTaskState.IDLE;
        }
        SeatAnimationView seatAnimationView = this.LIZIZ.get(l);
        if (seatAnimationView == null || (taskState = seatAnimationView.getTaskState()) == null) {
            return SeatAnimTaskState.IDLE;
        }
        return taskState;
    }

    private final void LIZJ(C80963Hvh c80963Hvh) {
        String str;
        float LIZ2;
        C9536f c9536f;
        if (PatchProxy.proxy(new Object[]{c80963Hvh}, this, LIZ, false, 10).isSupported) {
            return;
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_INTERACT_CITY_INFO_ANIMATION_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue() && this.f26291LJ == 5) {
            C81066HxM c81066HxM = c80963Hvh.LIZJ;
            if (c81066HxM != null && (c9536f = c81066HxM.LIZIZ) != null) {
                str = c9536f.LIZIZ;
            } else {
                str = null;
            }
            if (this.LIZJ) {
                LIZ2 = LIZIZ(str);
            } else {
                LIZ2 = LIZ(str);
            }
            for (Number number : this.LIZIZ.keySet()) {
                SeatAnimationView seatAnimationView = this.LIZIZ.get(Long.valueOf(number.longValue()));
                if (seatAnimationView != null) {
                    seatAnimationView.LIZ(LIZ2);
                }
            }
        }
    }

    public final void LIZ(long j) {
        SeatAnimationView seatAnimationView;
        if (!PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 22).isSupported && (seatAnimationView = this.LIZIZ.get(Long.valueOf(j))) != null) {
            seatAnimationView.LIZJ();
        }
    }

    @Override // p003X.AbstractC81014HwW
    public final void LIZIZ(C80963Hvh c80963Hvh) {
        C9536f c9536f;
        C80963Hvh c80963Hvh2;
        C9536f c9536f2;
        C9536f c9536f3;
        List<Long> list;
        if (PatchProxy.proxy(new Object[]{c80963Hvh}, this, LIZ, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(c80963Hvh);
        AbstractC4370h abstractC4370h = this.LIZLLL;
        if (abstractC4370h != null && abstractC4370h.LIZIZ()) {
            return;
        }
        if (LIZ(Long.valueOf(c80963Hvh.LIZ))) {
            LIZ(c80963Hvh.LIZ);
        }
        if (!PatchProxy.proxy(new Object[]{c80963Hvh}, this, LIZ, false, 18).isSupported) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c80963Hvh}, C80820HtO.LIZIZ, C80820HtO.LIZ, false, 2);
            if (proxy.isSupported) {
                c80963Hvh2 = (C80963Hvh) proxy.result;
            } else {
                C106862S5w.LIZ(c80963Hvh);
                long j = c80963Hvh.LIZ;
                C81066HxM c81066HxM = c80963Hvh.LIZJ;
                if (c81066HxM != null) {
                    c9536f2 = c81066HxM.LIZIZ;
                } else {
                    c9536f2 = null;
                }
                c80963Hvh2 = new C80963Hvh(j, null, new C81066HxM(false, c9536f2), false, 8);
            }
            C81066HxM c81066HxM2 = c80963Hvh2.LIZJ;
            if (c81066HxM2 != null && (c9536f3 = c81066HxM2.LIZIZ) != null && (list = c9536f3.LIZJ) != null) {
                for (Long l : list) {
                    long j2 = c80963Hvh2.LIZ;
                    if (l == null || l.longValue() != j2) {
                        if (LIZ(l)) {
                            Intrinsics.checkNotNullExpressionValue(l, "");
                            LIZ(l.longValue());
                        }
                        SeatAnimationView seatAnimationView = this.LIZIZ.get(l);
                        if (seatAnimationView != null) {
                            seatAnimationView.LIZ(c80963Hvh2);
                        }
                    }
                }
            }
        }
        this.LJIIIIZZ = true;
        C81066HxM c81066HxM3 = c80963Hvh.LIZJ;
        if (c81066HxM3 != null && (c9536f = c81066HxM3.LIZIZ) != null) {
            List<Long> list2 = this.LJI;
            List<Long> list3 = c9536f.LIZJ;
            Intrinsics.checkNotNullExpressionValue(list3, "");
            list2.addAll(list3);
        }
    }

    @Override // p003X.AbstractC81014HwW
    public final void LIZ(C80963Hvh c80963Hvh) {
        C9536f c9536f;
        if (PatchProxy.proxy(new Object[]{c80963Hvh}, this, LIZ, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(c80963Hvh);
        C81066HxM c81066HxM = c80963Hvh.LIZJ;
        if (c81066HxM != null && (c9536f = c81066HxM.LIZIZ) != null) {
            this.LJFF.add(c9536f);
        }
    }

    public final void LIZIZ(C81105Hxz c81105Hxz) {
        SeatAnimationView seatAnimationView;
        if (PatchProxy.proxy(new Object[]{c81105Hxz}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(c81105Hxz);
        if (c81105Hxz instanceof C80900Hug) {
            C80900Hug c80900Hug = (C80900Hug) c81105Hxz;
            if (!PatchProxy.proxy(new Object[]{c80900Hug}, this, LIZ, false, 6).isSupported && (seatAnimationView = this.LIZIZ.get(Long.valueOf(c80900Hug.LIZIZ))) != null) {
                seatAnimationView.LIZ(c80900Hug);
            }
        }
    }

    public final void LIZ(C81048Hx4 c81048Hx4) {
        SeatAnimationView seatAnimationView;
        SeatAnimTaskState taskState;
        SeatAnimationView seatAnimationView2;
        if (PatchProxy.proxy(new Object[]{c81048Hx4}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(c81048Hx4);
        AbstractC4370h abstractC4370h = this.LIZLLL;
        if ((abstractC4370h == null || !abstractC4370h.LIZIZ()) && (seatAnimationView = this.LIZIZ.get(Long.valueOf(c81048Hx4.LIZ.LIZ.getId()))) != null && (taskState = seatAnimationView.getTaskState()) != null && taskState != SeatAnimTaskState.LINK_SUC_ANIM && taskState != SeatAnimTaskState.CITY_ANIM && taskState != SeatAnimTaskState.GUEST_BATTLE_ANIM && (seatAnimationView2 = this.LIZIZ.get(Long.valueOf(c81048Hx4.LIZ.LIZ.getId()))) != null && !PatchProxy.proxy(new Object[]{c81048Hx4}, seatAnimationView2, SeatAnimationView.LIZ, false, 18).isSupported) {
            C106862S5w.LIZ(c81048Hx4);
            C80847Htp c80847Htp = seatAnimationView2.LIZIZ;
            if (c80847Htp != null) {
                c80847Htp.LIZ(c81048Hx4);
            }
        }
    }

    public final void LIZ(long j, SeatAnimationView seatAnimationView) {
        OrderInfo ktvCurrentSingerOrderInfo;
        AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs;
        Long l;
        Long l2;
        List<LinkPlayerInfo> list;
        long j2;
        List<LinkPlayerInfo> list2;
        C2WC<Room> LIZ2;
        Room LIZ3;
        if (PatchProxy.proxy(new Object[]{new Long(j), seatAnimationView}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(seatAnimationView);
        this.LIZIZ.put(Long.valueOf(j), seatAnimationView);
        if (!PatchProxy.proxy(new Object[0], seatAnimationView, SeatAnimationView.LIZ, false, 27).isSupported) {
            LinkSucAnimationView linkSucAnimationView = seatAnimationView.f26296LJ;
            if (linkSucAnimationView != null) {
                linkSucAnimationView.LJIIIZ = false;
            }
            C80852Htu c80852Htu = seatAnimationView.LIZLLL;
            if (c80852Htu != null) {
                c80852Htu.LIZJ = false;
            }
        }
        seatAnimationView.setSeatAnimTaskListener(this);
        IKtvService iKtvService = (IKtvService) ServiceManager.getService(IKtvService.class);
        if (iKtvService != null && (ktvCurrentSingerOrderInfo = iKtvService.ktvCurrentSingerOrderInfo()) != null) {
            int i = this.f26291LJ;
            if (i == 8 || i == 12) {
                IInteractService iInteractService = (IInteractService) ServiceManager.getService(IInteractService.class);
                List<LinkPlayerInfo> list3 = null;
                if (iInteractService != null) {
                    abstractC78986HBs = iInteractService.getLinkUserInfoCenter();
                } else {
                    abstractC78986HBs = null;
                }
                InteractiveSongUserInfo interactiveSongUserInfo = ktvCurrentSingerOrderInfo.LIZIZ;
                if (interactiveSongUserInfo != null) {
                    l = Long.valueOf(interactiveSongUserInfo.LIZIZ);
                } else {
                    l = null;
                }
                C5923dp LIZ4 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                if (LIZ4 != null && (LIZ2 = LIZ4.LIZ()) != null && (LIZ3 = LIZ2.LIZ()) != null) {
                    l2 = Long.valueOf(LIZ3.ownerUserId);
                } else {
                    l2 = null;
                }
                boolean areEqual = Intrinsics.areEqual(l, l2);
                if (abstractC78986HBs != null) {
                    list = abstractC78986HBs.LIZJ();
                } else {
                    list = null;
                }
                if (C79252HLy.LIZ(list)) {
                    InteractiveSongUserInfo interactiveSongUserInfo2 = ktvCurrentSingerOrderInfo.LIZIZ;
                    if (interactiveSongUserInfo2 != null) {
                        j2 = interactiveSongUserInfo2.LIZIZ;
                    } else {
                        j2 = 0;
                    }
                    if (abstractC78986HBs != null) {
                        list2 = abstractC78986HBs.LIZJ();
                    } else {
                        list2 = null;
                    }
                    if (!C79252HLy.LIZ(j2, list2)) {
                        if (abstractC78986HBs != null) {
                            list3 = abstractC78986HBs.LIZJ();
                        }
                        if (C79252HLy.LIZ(j, list3) || seatAnimationView.getId() == 2131166456) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (this.f26291LJ == 8 && areEqual) {
                    return;
                }
            }
            LIZ(ktvCurrentSingerOrderInfo);
        }
    }

    public final void LIZ(long j, C80963Hvh c80963Hvh) {
        AbstractC81060HxG linkSucAnimCallback;
        SeatAnimationView seatAnimationView;
        AbstractC81060HxG linkSucAnimCallback2;
        C9531aq c9531aq;
        AbstractC81060HxG linkSucAnimCallback3;
        C81066HxM c81066HxM;
        C9536f c9536f;
        AbstractC81060HxG linkSucAnimCallback4;
        if (PatchProxy.proxy(new Object[]{new Long(j), c80963Hvh}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(c80963Hvh);
        AbstractC4370h abstractC4370h = this.LIZLLL;
        if (abstractC4370h != null && abstractC4370h.LIZIZ()) {
            return;
        }
        if (this.LJIIIIZZ && (c81066HxM = c80963Hvh.LIZJ) != null && c81066HxM.LIZIZ != null) {
            c80963Hvh.LIZIZ = null;
            SeatAnimationView seatAnimationView2 = this.LIZIZ.get(Long.valueOf(j));
            if (seatAnimationView2 != null && (linkSucAnimCallback4 = seatAnimationView2.getLinkSucAnimCallback()) != null) {
                linkSucAnimCallback4.LJIIIIZZ();
            }
            C81066HxM c81066HxM2 = c80963Hvh.LIZJ;
            if (c81066HxM2 != null && (c9536f = c81066HxM2.LIZIZ) != null) {
                this.LJFF.add(c9536f);
                return;
            }
            return;
        }
        if (!PatchProxy.proxy(new Object[]{c80963Hvh}, this, LIZ, false, 9).isSupported) {
            SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_INTERACT_SEAT_ANIMATION_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                C81032Hwo c81032Hwo = c80963Hvh.LIZIZ;
                if (c81032Hwo != null && (c9531aq = c81032Hwo.LIZLLL) != null && !c9531aq.LIZ) {
                    c80963Hvh.LIZIZ = null;
                    SeatAnimationView seatAnimationView3 = this.LIZIZ.get(Long.valueOf(c80963Hvh.LIZ));
                    if (seatAnimationView3 != null && (linkSucAnimCallback3 = seatAnimationView3.getLinkSucAnimCallback()) != null) {
                        linkSucAnimCallback3.LJIIIIZZ();
                    }
                }
            } else {
                C81032Hwo c81032Hwo2 = c80963Hvh.LIZIZ;
                if (c81032Hwo2 == null || c81032Hwo2.LIZ != LinkApplyType.MATCH.value) {
                    c80963Hvh.LIZIZ = null;
                    SeatAnimationView seatAnimationView4 = this.LIZIZ.get(Long.valueOf(c80963Hvh.LIZ));
                    if (seatAnimationView4 != null && (linkSucAnimCallback = seatAnimationView4.getLinkSucAnimCallback()) != null) {
                        linkSucAnimCallback.LJIIIIZZ();
                    }
                }
            }
            C81032Hwo c81032Hwo3 = c80963Hvh.LIZIZ;
            if (c81032Hwo3 != null && c81032Hwo3.LIZLLL == null && (seatAnimationView = this.LIZIZ.get(Long.valueOf(c80963Hvh.LIZ))) != null && (linkSucAnimCallback2 = seatAnimationView.getLinkSucAnimCallback()) != null) {
                linkSucAnimCallback2.LJIIIIZZ();
            }
            LIZJ(c80963Hvh);
        }
        SeatAnimationView seatAnimationView5 = this.LIZIZ.get(Long.valueOf(j));
        if (seatAnimationView5 != null) {
            seatAnimationView5.LIZ(c80963Hvh);
        }
    }
}
