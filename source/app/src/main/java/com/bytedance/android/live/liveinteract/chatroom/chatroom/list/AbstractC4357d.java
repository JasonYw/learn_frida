package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import android.app.Activity;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAnchorApi;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.room.api.ILiveShareService;
import com.bytedance.android.live.room.api.share.model.LiveShareType;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.depend.share.C5819h;
import com.bytedance.android.livehostapi.business.depend.share.ShareScene;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC81278I1w;
import p003X.C106862S5w;
import p003X.C3VF;
import p003X.C409882Kg;
import p003X.C422932oR;
import p003X.C423292p1;
import p003X.C77035GYr;
import p003X.C77037GYt;
import p003X.C77566Gi0;
import p003X.C77567Gi1;
import p003X.C77568Gi2;
import p003X.C77569Gi3;
import p003X.C77570Gi4;
import p003X.C77578GiC;
import p003X.C77579GiD;
import p003X.C77589GiN;
import p003X.C78109Gql;
import p003X.C78110Gqm;
import p003X.C78111Gqn;
import p003X.C78146GrM;
import p003X.C78147GrN;
import p003X.C78150GrQ;
import p003X.C78151GrR;
import p003X.C78152GrS;
import p003X.C78154GrU;
import p003X.C88306Kqq;
import p003X.KDS;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.list.d */
/* loaded from: classes3.dex */
public abstract class AbstractC4357d extends a$a {
    public static ChangeQuickRedirect LJFF;
    public long LJI;
    public boolean LJIIIIZZ;
    public final Room LJIIJ;
    public boolean LJII = true;
    public final String LJIIIZ = "BaseTalkApplyListPresenter";
    public String LJIIJJI = "";

    static {
        Covode.recordClassIndex(26194);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.list.a$a
    public final void LJFF() {
        if (!PatchProxy.proxy(new Object[0], this, LJFF, false, 6).isSupported && this.LJIIJ != null) {
            ((AbstractC81278I1w) ((LinkAnchorApi) C88306Kqq.LIZ().LIZ(LinkAnchorApi.class)).getAnchorFriends(10L).m151as(LIZLLL())).LIZ(new C77589GiN(this), new C77568Gi2(this));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.list.a$a
    public final void LJI() {
        Room room;
        if (!PatchProxy.proxy(new Object[0], this, LJFF, false, 3).isSupported && (room = this.LJIIJ) != null) {
            ((KDS) ((LinkAnchorApi) C88306Kqq.LIZ().LIZ(LinkAnchorApi.class)).sendLinkCall(room.getId()).m149as(LIZLLL())).LIZ(new C77569Gi3(this), new C77570Gi4(this));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.list.a$a
    public final void LIZIZ() {
        Room room;
        if (!PatchProxy.proxy(new Object[0], this, LJFF, false, 1).isSupported && (room = this.LJIIJ) != null) {
            SettingKey<Boolean> settingKey = LiveSettingKeys.LINK_LIST_INTERFACE_OPTIMIZE_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                ((KDS) ((LinkAnchorApi) C88306Kqq.LIZ().LIZ(LinkAnchorApi.class)).getLinkWaitingList(room.getId(), 50L, "").m149as(LIZLLL())).LIZ(new C78150GrQ(this), new C77578GiC(this));
            } else {
                ((KDS) ((LinkAnchorApi) C88306Kqq.LIZ().LIZ(LinkAnchorApi.class)).getAllList(Long.valueOf(room.getId()).longValue(), room.ownerUserId, 1, 0, false, "linkCheckApply").m149as(LIZLLL())).LIZ(new C78109Gql(this), new C77579GiD(this));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.list.a$a
    /* renamed from: LJ */
    public final void mo15753LJ() {
        Room room;
        if (!PatchProxy.proxy(new Object[0], this, LJFF, false, 2).isSupported && (room = this.LJIIJ) != null) {
            SettingKey<Boolean> settingKey = LiveSettingKeys.LINK_LIST_INTERFACE_OPTIMIZE_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                ((KDS) ((LinkAnchorApi) C88306Kqq.LIZ().LIZ(LinkAnchorApi.class)).getInviteList(room.getId(), 1).m149as(LIZLLL())).LIZ(new C78110Gqm(this), new C77566Gi0(this));
            } else {
                ((KDS) ((LinkAnchorApi) C88306Kqq.LIZ().LIZ(LinkAnchorApi.class)).getAllList(Long.valueOf(room.getId()).longValue(), room.ownerUserId, 1, 1, false, "linkCheckInvite").m149as(LIZLLL())).LIZ(new C78111Gqn(this), new C77567Gi1(this));
            }
        }
    }

    public final long LIZ(List<? extends LinkPlayerInfo> list) {
        Integer num;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, LJFF, false, 5);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        int intValue = num.intValue();
        if (intValue > 0) {
            return list.get(intValue - 1).LJIILLIIL;
        }
        return 0L;
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.list.a$a
    public final void LIZ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LJFF, false, 9).isSupported) {
            return;
        }
        ((KDS) ((LinkAnchorApi) C88306Kqq.LIZ().LIZ(LinkAnchorApi.class)).closePaidLinkGuide(j).m149as(LIZLLL())).LIZ(new C77037GYt(this), new C77035GYr(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4357d(Room room, a$b a_b) {
        super(a_b);
        C106862S5w.LIZ(a_b);
        this.LJIIJ = room;
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.list.a$a
    public final void LIZ(int i, Activity activity) {
        C3VF user;
        IUser LIZ;
        if (PatchProxy.proxy(new Object[]{0, activity}, this, LJFF, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(activity);
        C5819h.C5820a LIZ2 = C5819h.LIZ(this.LJIIJ);
        IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
        if (iUserService != null && (user = iUserService.user()) != null && (LIZ = user.LIZ()) != null) {
            LIZ2.LIZ(LIZ.getId());
            LIZ2.LIZIZ(true);
            LIZ2.LJJIJIL = ShareScene.LIVE;
            Room room = this.LJIIJ;
            if (room != null) {
                C422932oR.LIZ(C409882Kg.LIZ(C5923dp.LJIIJ, null, room.getId(), 1, null), LIZ2);
            }
            C423292p1 c423292p1 = new C423292p1(null, null, null, null, null, null, null, null, null, null, null, 2047);
            C5819h LIZ3 = LIZ2.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
            C423292p1 LIZ4 = c423292p1.LIZ(LIZ3);
            LIZ4.LIZ(activity);
            ((ILiveShareService) ServiceManager.getService(ILiveShareService.class)).share(LIZ4.LIZ(), this.LJIIIZ, LiveShareType.SHARE_DIALOG, new C78154GrU(this, 0));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.list.a$a
    public final void LIZ(boolean z, String str, long j, String str2) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str, new Long(j), str2}, this, LJFF, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        if (z) {
            this.LJII = true;
        } else {
            ((a$b) this.LIZJ).LIZIZ(this.LJII);
        }
        if (this.LJII && !this.LJIIIIZZ) {
            this.LJIIIIZZ = true;
            Room room = this.LJIIJ;
            if (room != null) {
                SettingKey<Boolean> settingKey = LiveSettingKeys.LINK_LIST_INTERFACE_OPTIMIZE_ENABLE;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue()) {
                    ((KDS) ((LinkAnchorApi) C88306Kqq.LIZ().LIZ(LinkAnchorApi.class)).getLinkWaitingList(room.getId(), j, this.LJIIJJI).m149as(LIZLLL())).LIZ(new C78147GrN(this, j, z, str, str2), new C78151GrR(room, this, j, z, str, str2));
                } else {
                    ((KDS) ((LinkAnchorApi) C88306Kqq.LIZ().LIZ(LinkAnchorApi.class)).getPageList(room.getId(), room.ownerUserId, 1, 0, j, true, "", this.LJI, str2, str).m149as(LIZLLL())).LIZ(new C78146GrM(this, j, z, str, str2), new C78152GrS(room, this, j, z, str, str2));
                }
            }
        }
    }
}
