package com.bytedance.android.live.liveinteract.chatroom.chatroom.seat;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p353ui.FollowHintAnimationView;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.message.model.LinkMicGuideMessage;
import com.bytedance.android.livesdkapi.depend.model.live.LinkerDetail;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C4574547f;
import p003X.C78571GyD;
import p003X.C78656Gza;
import p003X.C78828H5q;
import p003X.C80755HsL;
import p003X.C80756HsM;
import p003X.RunnableC80885HuR;
import p003X.RunnableC81001HwJ;
import p003X.RunnableC81004HwM;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.e */
/* loaded from: classes3.dex */
public final class C4369e implements AbstractC4370h {
    public static ChangeQuickRedirect LIZ;
    public Map<Long, FollowHintAnimationView> LIZIZ;
    public Map<Long, Boolean> LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public int f26288LJ;
    public boolean LJFF;
    public Long LJI;
    public Map<Long, Boolean> LJII;
    public Map<Long, Long> LJIIIIZZ;
    public List<LinkMicGuideMessage.C8709i.C8710a> LJIIIZ;
    public final Integer LJIIJ;
    public boolean LJIIJJI;
    public List<Integer> LJIIL;
    public Integer LJIILIIL;
    public Integer LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public List<? extends LinkPlayerInfo> LJIIZILJ;
    public Long LJIJ;
    public Long LJIJI;

    static {
        Covode.recordClassIndex(26301);
    }

    public C4369e() {
        this(null, null, 0, 7);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.AbstractC4370h
    public final void LIZJ() {
        this.LJFF = true;
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.AbstractC4370h
    public final void LIZLLL() {
        this.LJFF = false;
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.AbstractC4370h
    public final boolean LIZIZ() {
        return this.LJFF;
    }

    public final boolean LIZ(Long l, Long l2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{l, l2}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (l == null) {
            return false;
        }
        long longValue = l.longValue();
        if (l2 != null) {
            this.LJIIIIZZ.put(l2, Long.valueOf(longValue));
        }
        return longValue == 1 || longValue == 2;
    }

    public final void LIZ(Room room) {
        List list;
        if (PatchProxy.proxy(new Object[]{room}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(room);
        this.LJIJ = Long.valueOf(room.getId());
        this.LJIJI = Long.valueOf(room.ownerUserId);
        LinkerDetail linkerDetail = room.linkerDetail;
        if (linkerDetail == null || (list = linkerDetail.LIZIZ) == null) {
            return;
        }
        this.LJIIL = list;
    }

    public final void LIZ(List<? extends LinkPlayerInfo> list) {
        User LIZ2;
        FollowInfo followInfo;
        int i = 0;
        if (!PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 13).isSupported && this.LIZLLL && this.LJIIZILJ == null) {
            this.LJIIZILJ = list;
            if (list == null) {
                return;
            }
            for (LinkPlayerInfo linkPlayerInfo : list) {
                if (LIZ(this, (linkPlayerInfo == null || (LIZ2 = linkPlayerInfo.LIZ()) == null || (followInfo = LIZ2.getFollowInfo()) == null) ? null : Long.valueOf(followInfo.getFollowStatus()), null, 2, null)) {
                    User LIZ3 = linkPlayerInfo.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                    long id = LIZ3.getId();
                    Long l = this.LJIJI;
                    if (l == null || id != l.longValue()) {
                        i++;
                    }
                }
            }
            if (i == 0) {
                return;
            }
            LIZ(Integer.valueOf(i));
        }
    }

    public final boolean LIZ(Long l) {
        C80755HsL c80755HsL;
        C80756HsM c80756HsM;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{l}, this, LIZ, false, 14);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        FollowHintAnimationView followHintAnimationView = this.LIZIZ.get(l);
        return followHintAnimationView != null && (((c80755HsL = followHintAnimationView.LIZIZ) != null && c80755HsL.LJFF) || ((c80756HsM = followHintAnimationView.LIZJ) != null && c80756HsM.LJI));
    }

    public final void LIZ(Long l, boolean z) {
        if (!PatchProxy.proxy(new Object[]{l, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 17).isSupported && l != null) {
            this.LJII.put(Long.valueOf(l.longValue()), Boolean.valueOf(z));
        }
    }

    public final void LIZ(LinkMicGuideMessage.C8709i c8709i) {
        if (PatchProxy.proxy(new Object[]{c8709i}, this, LIZ, false, 19).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8709i);
        long j = c8709i.LIZ;
        Long l = this.LJIJ;
        if (l == null || j != l.longValue() || this.f26288LJ != 0) {
            return;
        }
        List<LinkMicGuideMessage.C8709i.C8710a> list = c8709i.LIZJ;
        if (list != null && !PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 12).isSupported) {
            C106862S5w.LIZ(list);
            int i = 0;
            for (LinkMicGuideMessage.C8709i.C8710a c8710a : list) {
                if (LIZ(this, Long.valueOf(c8710a.LIZIZ), null, 2, null)) {
                    long j2 = c8710a.LIZ;
                    Long l2 = this.LJIJI;
                    if (l2 == null || j2 != l2.longValue()) {
                        i++;
                    }
                }
            }
            if (i != 0) {
                LIZ(Integer.valueOf(i));
            }
        }
        if (!this.LIZIZ.isEmpty()) {
            List<LinkMicGuideMessage.C8709i.C8710a> list2 = c8709i.LIZJ;
            if (PatchProxy.proxy(new Object[]{this, list2, null, 2, null}, null, LIZ, true, 21).isSupported) {
                return;
            }
            LIZ(list2, (Long) null);
            return;
        }
        this.LJIIIZ = c8709i.LIZJ;
    }

    /* renamed from: LJ */
    public final void m15749LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        this.LIZIZ.clear();
        this.LIZJ.clear();
        this.LJII.clear();
        this.LJII.clear();
        List<LinkMicGuideMessage.C8709i.C8710a> list = this.LJIIIZ;
        if (list != null) {
            list.clear();
        }
        this.LJIIIIZZ.clear();
        this.LJIIJJI = false;
    }

    public final int LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        Integer num = this.LJIIJ;
        Intrinsics.checkNotNullExpressionValue(num, "");
        return num.intValue();
    }

    public final long LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        Long l = this.LJI;
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    public final Boolean LIZIZ(Long l) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{l}, this, LIZ, false, 18);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        if (l != null) {
            return this.LJII.get(Long.valueOf(l.longValue()));
        }
        return null;
    }

    private final void LIZ(Integer num) {
        byte b;
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[]{num}, this, LIZ, false, 11).isSupported || this.LJIIJJI) {
            return;
        }
        this.LJIIJJI = true;
        if (this.f26288LJ != 0) {
            b = 1;
        } else {
            b = 0;
        }
        Long l = this.LJIJI;
        Long l2 = this.LJIJ;
        Integer num2 = this.LJIILIIL;
        Integer num3 = this.LJIILJJIL;
        List<Integer> list = this.LJIIL;
        String str3 = this.LJIILL;
        String str4 = this.LJIILLIIL;
        if (!PatchProxy.proxy(new Object[]{l, l2, num, Byte.valueOf(b), num2, num3, list, str3, str4}, null, C78828H5q.LIZ, true, 187).isSupported && l != null && l2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("anchor_id", String.valueOf(l.longValue()));
            linkedHashMap.put("room_id", String.valueOf(l2.longValue()));
            if (b != 0) {
                str = "live_cell";
            } else {
                str = "room";
            }
            linkedHashMap.put("source", str);
            linkedHashMap.put("play_mode", C78656Gza.LIZ());
            if (num != null) {
                str2 = String.valueOf(num.intValue());
            } else {
                str2 = null;
            }
            linkedHashMap.put("follow_guest_num", str2);
            if (b != 0) {
                C78828H5q.LIZIZ(linkedHashMap, num2, num3);
                if (list != null) {
                    if (C78571GyD.LIZ(list)) {
                        linkedHashMap.put("seat_fit_status", "on");
                    } else {
                        linkedHashMap.put("seat_fit_status", "off");
                    }
                }
                linkedHashMap.put("live_type", "video_live");
                linkedHashMap.put("enter_from_merge", str3);
                linkedHashMap.put("enter_method", str4);
                linkedHashMap.put("action_type", "click");
                C4574547f.LIZ().LIZ("livesdk_audience_dynamic_follow_room_show", linkedHashMap, Room.class);
                return;
            }
            C78828H5q.LIZ(linkedHashMap, 0, 2, (Object) null);
            C78828H5q.LIZ(linkedHashMap, (Integer) null, (Integer) null, 6, (Object) null);
            C78828H5q.LJFF.LIZJ(linkedHashMap);
            C4574547f.LIZ().LIZ("livesdk_audience_dynamic_follow_room_show", linkedHashMap, Room.class, C8668v.class);
        }
    }

    public final void LIZIZ(long j) {
        byte b;
        byte b2;
        String str;
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 10).isSupported) {
            return;
        }
        Long l = this.LJIIIIZZ.get(Long.valueOf(j));
        if (l != null && l.longValue() == 2) {
            b = 1;
        } else {
            b = 0;
        }
        if (this.f26288LJ != 0) {
            b2 = 1;
        } else {
            b2 = 0;
        }
        Long l2 = this.LJIJI;
        Long l3 = this.LJIJ;
        Integer num = this.LJIILIIL;
        Integer num2 = this.LJIILJJIL;
        List<Integer> list = this.LJIIL;
        String str2 = this.LJIILL;
        String str3 = this.LJIILLIIL;
        if (!PatchProxy.proxy(new Object[]{l2, l3, new Long(j), Byte.valueOf(b), Byte.valueOf(b2), num, num2, list, str2, str3}, null, C78828H5q.LIZ, true, 185).isSupported && l2 != null && l3 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("anchor_id", String.valueOf(l2.longValue()));
            linkedHashMap.put("room_id", String.valueOf(l3.longValue()));
            linkedHashMap.put("follow_user_id", String.valueOf(j));
            linkedHashMap.put("is_mutual", String.valueOf((int) b));
            if (b2 != 0) {
                str = "live_cell";
            } else {
                str = "room";
            }
            linkedHashMap.put("source", str);
            linkedHashMap.put("play_mode", C78656Gza.LIZ());
            if (b2 != 0) {
                C78828H5q.LIZIZ(linkedHashMap, num, num2);
                if (list != null) {
                    if (C78571GyD.LIZ(list)) {
                        linkedHashMap.put("seat_fit_status", "on");
                    } else {
                        linkedHashMap.put("seat_fit_status", "off");
                    }
                }
                linkedHashMap.put("live_type", "video_live");
                linkedHashMap.put("enter_from_merge", str2);
                linkedHashMap.put("enter_method", str3);
                linkedHashMap.put("action_type", "click");
                C4574547f.LIZ().LIZ("livesdk_audience_dynamic_follow_show", linkedHashMap, Room.class);
                return;
            }
            C78828H5q.LIZ(linkedHashMap, 0, 2, (Object) null);
            C78828H5q.LIZ(linkedHashMap, (Integer) null, (Integer) null, 6, (Object) null);
            C78828H5q.LJFF.LIZJ(linkedHashMap);
            C4574547f.LIZ().LIZ("livesdk_audience_dynamic_follow_show", linkedHashMap, Room.class, C8668v.class);
        }
    }

    public final void LIZ(long j) {
        FollowHintAnimationView followHintAnimationView;
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 9).isSupported || this.f26288LJ == 0 || !this.LIZLLL) {
            return;
        }
        Long l = this.LJIJI;
        if ((l == null || j != l.longValue()) && (true ^ Intrinsics.areEqual(this.LIZJ.get(Long.valueOf(j)), Boolean.TRUE)) && (followHintAnimationView = this.LIZIZ.get(Long.valueOf(j))) != null) {
            followHintAnimationView.postDelayed(new RunnableC80885HuR(this, j), 100L);
        }
    }

    public final void LIZ(Integer num, Integer num2) {
        this.LJIILIIL = num;
        this.LJIILJJIL = num2;
    }

    public final void LIZ(String str, String str2) {
        this.LJIILL = str;
        this.LJIILLIIL = str2;
    }

    public final void LIZIZ(long j, FollowHintAnimationView followHintAnimationView) {
        if (PatchProxy.proxy(new Object[]{new Long(j), followHintAnimationView}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(followHintAnimationView);
        if (this.f26288LJ == 0 && this.LIZIZ.containsKey(Long.valueOf(j))) {
            return;
        }
        Long l = this.LJIJI;
        if (l == null || j != l.longValue()) {
            this.LIZIZ.put(Long.valueOf(j), followHintAnimationView);
            if (!PatchProxy.proxy(new Object[0], followHintAnimationView, FollowHintAnimationView.LIZ, false, 6).isSupported) {
                C80755HsL c80755HsL = followHintAnimationView.LIZIZ;
                if (c80755HsL != null) {
                    c80755HsL.LIZJ = false;
                }
                C80756HsM c80756HsM = followHintAnimationView.LIZJ;
                if (c80756HsM != null) {
                    c80756HsM.LJFF = false;
                }
            }
            followHintAnimationView.setFollowHintAnimListener(this);
        }
        LIZ(this.LJIIIZ, Long.valueOf(j));
    }

    private final void LIZ(List<? extends LinkMicGuideMessage.C8709i.C8710a> list, Long l) {
        FollowHintAnimationView followHintAnimationView;
        FollowHintAnimationView followHintAnimationView2;
        if (!PatchProxy.proxy(new Object[]{list, l}, this, LIZ, false, 20).isSupported && this.f26288LJ == 0) {
            if (l == null) {
                if (list != null) {
                    for (LinkMicGuideMessage.C8709i.C8710a c8710a : list) {
                        if (LIZ(Long.valueOf(c8710a.LIZIZ), Long.valueOf(c8710a.LIZ)) && (followHintAnimationView2 = this.LIZIZ.get(Long.valueOf(c8710a.LIZ))) != null) {
                            followHintAnimationView2.postDelayed(new RunnableC81004HwM(followHintAnimationView2, c8710a, this), 100L);
                        }
                    }
                }
            } else if (list != null) {
                for (LinkMicGuideMessage.C8709i.C8710a c8710a2 : list) {
                    if (c8710a2.LIZ == l.longValue() && LIZ(Long.valueOf(c8710a2.LIZIZ), l) && (followHintAnimationView = this.LIZIZ.get(l)) != null) {
                        followHintAnimationView.postDelayed(new RunnableC81001HwJ(followHintAnimationView, this, l), 100L);
                    }
                }
            }
        }
    }

    public final void LIZ(long j, FollowHintAnimationView followHintAnimationView) {
        if (PatchProxy.proxy(new Object[]{new Long(j), followHintAnimationView}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(followHintAnimationView);
        if (this.f26288LJ == 0 && this.LIZIZ.containsKey(Long.valueOf(j))) {
            return;
        }
        this.LJI = Long.valueOf(j);
        this.LIZIZ.put(Long.valueOf(j), followHintAnimationView);
        LIZ(this.LJIIIZ, Long.valueOf(j));
    }

    public C4369e(Long l, Long l2, int i) {
        this.LJIJ = l;
        this.LJIJI = l2;
        this.f26288LJ = i;
        this.LIZIZ = new LinkedHashMap();
        this.LIZJ = new LinkedHashMap();
        this.LJII = new LinkedHashMap();
        this.LJIIIIZZ = new LinkedHashMap();
        SettingKey<Integer> settingKey = LiveSettingKeys.LIVE_ENTER_FOLLOW_ANIMATE_TYPE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        this.LJIIJ = settingKey.getValue();
    }

    public /* synthetic */ C4369e(Long l, Long l2, int i, int i2) {
        this((i2 & 1) != 0 ? null : l, (i2 & 2) != 0 ? null : l2, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ boolean LIZ(C4369e c4369e, Long l, Long l2, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4369e, l, null, 2, null}, null, LIZ, true, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return c4369e.LIZ(l, (Long) null);
    }
}
