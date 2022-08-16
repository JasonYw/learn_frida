package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.PkTagsContainerView;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder.C4351v;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.p368f.C4520a;
import com.bytedance.android.live.liveinteract.p382pk.p384ui.AbstractC4756a;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4784x;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.interact.model.C6057l;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.live.ILiveRoomService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import java.util.HashMap;
import java.util.Iterator;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC79997Hg7;
import p003X.C4574547f;
import p003X.C79169HIt;
import p003X.C79179HJd;
import p003X.C79584HYs;
import p003X.C79910Hei;
import p003X.C88440Kt0;
import p003X.C88613Kvn;
import p003X.DialogInterface$OnClickListenerC79999Hg9;
import p003X.DialogInterface$OnClickListenerC80003HgD;
import p003X.DialogInterface$OnClickListenerC80004HgE;
import p003X.HZR;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder.v */
/* loaded from: classes3.dex */
public final class C4351v extends RecyclerView.ViewHolder implements Observer<KVData>, AbstractC4756a {
    public static ChangeQuickRedirect LIZ;
    public final VHeadView LIZIZ;
    public final VHeadView LIZJ;
    public final TextView LIZLLL;

    /* renamed from: LJ */
    public final TextView f26284LJ;
    public final TextView LJFF;
    public final Button LJI;
    public final TextView LJII;
    public final View LJIIIIZZ;
    public final View LJIIIZ;
    public final View LJIIJ;
    public final AbstractC79997Hg7 LJIIJJI;
    public int LJIIL;
    public PkTagsContainerView LJIILIIL;
    public C6057l LJIILJJIL;
    public Room LJIILL;
    public AbstractC4782v LJIILLIIL = AbstractC4782v.LJIIL.LIZ();
    public HashMap<String, String> LJIIZILJ = new HashMap<>();
    public DataCenter LJIJ;
    public Context LJIJI;

    static {
        Covode.recordClassIndex(26139);
    }

    @Override // com.bytedance.android.live.liveinteract.p382pk.p384ui.AbstractC4756a
    public final String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Room room = this.LJIILL;
        if (room != null) {
            return room.getIdStr();
        }
        return "";
    }

    public boolean LIZ(Room room) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{room}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (room.linkMap != null && room.linkMap.containsKey("8")) {
            return true;
        }
        return false;
    }

    public boolean LIZIZ(Room room) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{room}, this, LIZ, false, 14);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (room.linkMap != null && room.linkMap.containsKey("5")) {
            return true;
        }
        return false;
    }

    public boolean LIZJ(Room room) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{room}, this, LIZ, false, 15);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (room.linkMap != null && room.linkMap.containsKey("7")) {
            return true;
        }
        return false;
    }

    public boolean LIZLLL(Room room) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{room}, this, LIZ, false, 16);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (room.linkMap != null && room.linkMap.containsKey("1")) {
            return true;
        }
        return false;
    }

    public boolean LIZIZ(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4782v abstractC4782v = this.LJIILLIIL;
        if (abstractC4782v != null && user != null) {
            Iterator<User> it = abstractC4782v.mo15709LJ().LJIIIZ().iterator();
            while (it.hasNext()) {
                if (it.next().getId() == user.getId()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 12).isSupported && kVData2 != null && kVData2.getData() != null && "data_pk_match_state".equals(kVData2.getKey())) {
            if (kVData2.getData().equals(1)) {
                this.LJI.setBackgroundResource(2130854809);
                this.LJI.setText(LK5.LIZ(2131584332));
                this.LJI.setTextColor(CastProtectorUtils.parseColor("#b0b0b0"));
                return;
            }
            this.LJI.setBackgroundResource(2130854855);
            this.LJI.setText(2131585777);
            this.LJI.setTextColor(CastProtectorUtils.parseColor("#ffffff"));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.p382pk.p384ui.AbstractC4756a
    public final void LIZ(String str) {
        C6057l c6057l;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 8).isSupported && (c6057l = this.LJIILJJIL) != null && c6057l.LIZIZ != null) {
            Room room = this.LJIILJJIL.LIZIZ;
            HashMap hashMap = new HashMap();
            hashMap.put("right_user_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("right_room_id", room.getIdStr());
            hashMap.put("connection_type", "manual_pk");
            hashMap.put("list_type", C79910Hei.LIZIZ.LIZ(this.LJIIL));
            if (room.getLinkMicInfo() == null && !LIZLLL(room) && !LIZ(room) && !LIZJ(room)) {
                hashMap.put("right_user_status", "2");
            } else {
                hashMap.put("right_user_status", "1");
            }
            hashMap.put("request_id", LinkCrossRoomDataHolder.LJII().LJJLIIIJLLLLLLLZ);
            hashMap.put("enter_from", str);
            hashMap.putAll(this.LJIIZILJ);
            C4574547f.LIZ().LIZ("livesdk_connectioninvite_anchoricon_show", hashMap, Room.class);
        }
    }

    public boolean LIZ(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4782v abstractC4782v = this.LJIILLIIL;
        if (abstractC4782v != null && user != null) {
            Iterator<User> it = abstractC4782v.mo15709LJ().LJIIIIZZ().iterator();
            while (it.hasNext()) {
                if (it.next().getId() == user.getId()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final /* synthetic */ void LIZ(C6057l c6057l, DialogInterface dialogInterface, int i) {
        if (PatchProxy.proxy(new Object[]{c6057l, dialogInterface, Integer.valueOf(i)}, this, LIZ, false, 24).isSupported) {
            return;
        }
        Room currentRoom = ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).getCurrentRoom();
        for (User user : this.LJIILLIIL.mo15709LJ().LJIIIIZZ()) {
            if (currentRoom != null) {
                this.LJIILLIIL.LIZJ().LIZ(LinkCrossRoomDataHolder.LJII().LIZLLL, user.getLiveRoomId(), user.getId(), user.getSecUid(), 0, "cancel_for_apply");
            }
        }
        this.LJIIJJI.LIZIZ(this.LJIIL, c6057l);
        dialogInterface.dismiss();
    }

    public C4351v(View view, AbstractC79997Hg7 abstractC79997Hg7, DataCenter dataCenter) {
        super(view);
        this.LIZIZ = (VHeadView) view.findViewById(2131167465);
        this.LIZJ = (VHeadView) view.findViewById(2131175975);
        this.LIZLLL = (TextView) view.findViewById(2131194721);
        this.f26284LJ = (TextView) view.findViewById(2131194150);
        this.LJFF = (TextView) view.findViewById(2131192781);
        this.LJI = (Button) view.findViewById(2131168459);
        this.LJII = (TextView) view.findViewById(2131195583);
        this.LJIIIIZZ = view.findViewById(2131192985);
        this.LJIIIZ = view.findViewById(2131178557);
        this.LJIIJ = view.findViewById(2131178981);
        this.LJIILIIL = (PkTagsContainerView) view.findViewById(2131191526);
        this.LJIIJJI = abstractC79997Hg7;
        this.LJIJ = dataCenter;
        this.LJIJI = view.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LIZ(Room room, final C6057l c6057l, RivalExtraInfo rivalExtraInfo, boolean z) {
        boolean z2;
        C4520a LIZJ;
        C4520a mo15709LJ;
        Room currentRoom;
        String str;
        if (PatchProxy.proxy(new Object[]{room, c6057l, rivalExtraInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 9).isSupported) {
            return;
        }
        if (z) {
            if (!PatchProxy.proxy(new Object[]{room, c6057l, rivalExtraInfo}, this, LIZ, false, 10).isSupported && room != null && this.LJIILLIIL != null) {
                if (C79169HIt.LIZIZ(((IInteractService) ServiceManager.getService(IInteractService.class)).getLinkMode(), 2) && ((IInteractService) ServiceManager.getService(IInteractService.class)).getInteractAudienceService().LIZIZ()) {
                    C88440Kt0.LIZ(2131584070);
                    return;
                } else if (room.getLinkMicInfo() == null) {
                    if (room.linkerDetail != null && room.linkerDetail.LIZIZ != null && room.linkerDetail.LIZIZ.contains(3L)) {
                        ALogger.m15800e("ttlive_pk", "ignore apply btn click for playmodes container MULTI_PK");
                        return;
                    } else if (room.linkMap.containsKey("7")) {
                        if (LIZIZ(room.getOwner())) {
                            this.LJIIJJI.LIZ(c6057l, 1);
                            return;
                        } else if (room.linkMap.get("7").longValue() != LinkCrossRoomDataHolder.LJII().LIZLLL) {
                            if (!this.LJIILLIIL.mo15709LJ().LJIIIIZZ().isEmpty()) {
                                HZR hzr = new HZR(this.LJIJI);
                                hzr.LIZ(LK5.LIZ(2131581966));
                                hzr.LIZIZ(LK5.LIZ(2131581964));
                                hzr.LIZ(LK5.LIZ(2131581969), DialogInterface$OnClickListenerC80003HgD.LIZIZ);
                                hzr.LIZIZ(LK5.LIZ(2131581970), new DialogInterface.OnClickListener(this, c6057l) { // from class: X.Hg6
                                    public static ChangeQuickRedirect LIZ;
                                    public final C4351v LIZIZ;
                                    public final C6057l LIZJ;

                                    static {
                                        Covode.recordClassIndex(26142);
                                    }

                                    {
                                        this.LIZIZ = this;
                                        this.LIZJ = c6057l;
                                    }

                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                                            return;
                                        }
                                        this.LIZIZ.LIZ(this.LIZJ, dialogInterface, i);
                                    }
                                });
                                hzr.LIZ();
                            } else if (!this.LJIILLIIL.mo15709LJ().LIZLLL().isEmpty() && this.LJIILLIIL.mo15709LJ().LJIIIZ().isEmpty()) {
                                HZR hzr2 = new HZR(this.LJIJI);
                                hzr2.LIZ(LK5.LIZ(2131581966));
                                hzr2.LIZIZ(LK5.LIZ(2131581965));
                                hzr2.LIZ(LK5.LIZ(2131581969), DialogInterface$OnClickListenerC80004HgE.LIZIZ);
                                hzr2.LIZIZ(LK5.LIZ(2131581970), new DialogInterface.OnClickListener(this, c6057l) { // from class: X.Hfm
                                    public static ChangeQuickRedirect LIZ;
                                    public final C4351v LIZIZ;
                                    public final C6057l LIZJ;

                                    static {
                                        Covode.recordClassIndex(26093);
                                    }

                                    {
                                        this.LIZIZ = this;
                                        this.LIZJ = c6057l;
                                    }

                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                                            return;
                                        }
                                        final C4351v c4351v = this.LIZIZ;
                                        final C6057l c6057l2 = this.LIZJ;
                                        if (PatchProxy.proxy(new Object[]{c6057l2, dialogInterface, Integer.valueOf(i)}, c4351v, C4351v.LIZ, false, 21).isSupported) {
                                            return;
                                        }
                                        c4351v.LJIILLIIL.LIZ(7, new Runnable(c4351v, c6057l2) { // from class: X.Hfy
                                            public static ChangeQuickRedirect LIZ;
                                            public final C4351v LIZIZ;
                                            public final C6057l LIZJ;

                                            static {
                                                Covode.recordClassIndex(26096);
                                            }

                                            {
                                                this.LIZIZ = c4351v;
                                                this.LIZJ = c6057l2;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                                    return;
                                                }
                                                C4351v c4351v2 = this.LIZIZ;
                                                C6057l c6057l3 = this.LIZJ;
                                                if (PatchProxy.proxy(new Object[]{c6057l3}, c4351v2, C4351v.LIZ, false, 22).isSupported) {
                                                    return;
                                                }
                                                c4351v2.LJIIJJI.LIZIZ(c4351v2.LJIIL, c6057l3);
                                            }
                                        }, false, "leave_for_apply", true);
                                        dialogInterface.dismiss();
                                    }
                                });
                                hzr2.LIZ();
                            } else if (this.LJIILLIIL.mo15709LJ().LJIIIZ().isEmpty()) {
                                this.LJIIJJI.LIZIZ(this.LJIIL, c6057l);
                            } else {
                                C88613Kvn.LIZ(LK5.LJIIJ(), LK5.LIZ(2131581960));
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("right_user_id", String.valueOf(LinkCrossRoomDataHolder.LJII().LJJJLIIL));
                            C4574547f.LIZ().LIZ("livesdk_apply_icon_click", hashMap, Room.class, LinkCrossRoomDataHolder.LJII().LJIIIIZZ());
                            return;
                        } else {
                            return;
                        }
                    } else if (LIZ(room.getOwner())) {
                        this.LJIIJJI.LIZ(c6057l, 0);
                        return;
                    } else if (!this.LJIILLIIL.mo15709LJ().LJIIIZ().isEmpty()) {
                        HZR hzr3 = new HZR(this.LJIJI);
                        hzr3.LIZ(LK5.LIZ(2131581973));
                        hzr3.LIZIZ(LK5.LIZ(2131581972));
                        hzr3.LIZ(LK5.LIZ(2131581969), DialogInterface$OnClickListenerC79999Hg9.LIZIZ);
                        hzr3.LIZIZ(LK5.LIZ(2131581970), new DialogInterface.OnClickListener(this, c6057l) { // from class: X.Hfg
                            public static ChangeQuickRedirect LIZ;
                            public final C4351v LIZIZ;
                            public final C6057l LIZJ;

                            static {
                                Covode.recordClassIndex(26095);
                            }

                            {
                                this.LIZIZ = this;
                                this.LIZJ = c6057l;
                            }

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                                    return;
                                }
                                C4351v c4351v = this.LIZIZ;
                                C6057l c6057l2 = this.LIZJ;
                                if (PatchProxy.proxy(new Object[]{c6057l2, dialogInterface, Integer.valueOf(i)}, c4351v, C4351v.LIZ, false, 19).isSupported) {
                                    return;
                                }
                                Room currentRoom2 = ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).getCurrentRoom();
                                if (!c4351v.LJIILLIIL.mo15709LJ().LJIIIZ().isEmpty()) {
                                    User user = c4351v.LJIILLIIL.mo15709LJ().LJIIIZ().get(0);
                                    if (currentRoom2 != null) {
                                        c4351v.LJIILLIIL.LIZJ().LIZ(LinkCrossRoomDataHolder.LJII().LIZLLL, user.getLiveRoomId(), user.getId(), user.getSecUid(), 1, "cancel_for_invite");
                                    }
                                }
                                c4351v.LJIIJJI.LIZ(c4351v.LJIIL, c6057l2);
                                dialogInterface.dismiss();
                            }
                        });
                        hzr3.LIZ();
                        return;
                    } else if (this.LJIILLIIL.mo15709LJ().LIZLLL().size() == 4) {
                        C88613Kvn.LIZ(LK5.LJIIJ(), LK5.LIZ(2131581977));
                        return;
                    } else if (this.LJIILLIIL.mo15709LJ().LJIIJ().size() < 4) {
                        this.LJIIJJI.LIZ(this.LJIIL, c6057l);
                        return;
                    } else {
                        C88613Kvn.LIZ(LK5.LJIIJ(), LK5.LIZ(2131581998));
                        return;
                    }
                } else {
                    return;
                }
            }
            return;
        }
        if (!PatchProxy.proxy(new Object[]{room}, this, LIZ, false, 11).isSupported && (currentRoom = ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).getCurrentRoom()) != null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("anchor_id", String.valueOf(currentRoom.getOwnerUserId()));
            hashMap2.put("room_id", String.valueOf(currentRoom.getRoomId()));
            hashMap2.put("to_anchor_id", String.valueOf(room.getOwnerUserId()));
            C79910Hei c79910Hei = C79910Hei.LIZIZ;
            int i = this.LJIIL;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, c79910Hei, C79910Hei.LIZ, false, 3);
            if (proxy.isSupported) {
                str = proxy.result;
            } else {
                str = c79910Hei.LIZ(i, null);
            }
            hashMap2.put("rank_type", str);
            C4574547f.LIZ().LIZ("livesdk_pksearch_anchor_click", hashMap2, Room.class);
        }
        if (((IInteractService) ServiceManager.getService(IInteractService.class)).getInteractAudienceService().LIZIZ() && !C79179HJd.LIZIZ.LIZJ()) {
            C88440Kt0.LIZ(2131584070);
        } else if (room.getLinkMicInfo() == null && !LIZLLL(room) && !LIZ(room) && !LIZJ(room) && !LIZIZ(room)) {
            if (rivalExtraInfo != null && rivalExtraInfo.LJI != null && rivalExtraInfo.LJI.LIZ) {
                if (AbstractC4782v.LJIIL.LIZ() != null && (mo15709LJ = AbstractC4782v.LJIIL.LIZ().mo15709LJ()) != null) {
                    z2 = false;
                    for (AnchorLinkUser anchorLinkUser : mo15709LJ.LJIIJ()) {
                        if (anchorLinkUser.f26348LJ == 1 && anchorLinkUser.LIZIZ != null && anchorLinkUser.LIZIZ.getId() == room.getId()) {
                            z2 = true;
                        }
                    }
                } else {
                    z2 = false;
                }
                if (AbstractC4784x.LJII.LIZ() != null && (LIZJ = AbstractC4784x.LJII.LIZ().LIZJ()) != null) {
                    for (AnchorLinkUser anchorLinkUser2 : LIZJ.LJIIJ()) {
                        if (anchorLinkUser2.f26348LJ == 1 && anchorLinkUser2.LIZIZ != null && anchorLinkUser2.LIZIZ.getId() == room.getId()) {
                            z2 = true;
                        }
                    }
                }
                int LJJIFFI = AbstractC78050Gpo.LIZ().LJJIFFI();
                if (((LJJIFFI == 0 || LJJIFFI == 2) && LinkCrossRoomDataHolder.LJII().LJFF == room.getOwnerUserId()) || z2) {
                    this.LJIIJJI.LIZ(c6057l, 0);
                    C79584HYs.LIZ();
                    this.LJI.setBackgroundResource(2130854855);
                    this.LJI.setText(2131585777);
                    this.LJI.setTextColor(CastProtectorUtils.parseColor("#ffffff"));
                    return;
                }
                this.LJIIJJI.LIZ(this.LJIIL, c6057l);
                this.LJIJ.observe("data_pk_match_state", this);
                return;
            }
            C88440Kt0.LIZ(2131584407, 0);
        } else {
            C88440Kt0.LIZ(2131584403, 0);
        }
    }
}
