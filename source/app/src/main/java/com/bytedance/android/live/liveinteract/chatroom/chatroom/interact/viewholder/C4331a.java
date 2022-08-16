package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.PkTagsContainerView;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder.C4331a;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.p376ui.AnchorLinkInfoView;
import com.bytedance.android.live.liveinteract.p382pk.p384ui.AbstractC4756a;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.interact.model.C6043aa;
import com.bytedance.android.livesdk.chatroom.model.interact.C6148ae;
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
import java.util.List;
import org.json.JSONArray;
import p002O.C0002O;
import p003X.AbstractC79943HfF;
import p003X.C4574547f;
import p003X.C79169HIt;
import p003X.C79910Hei;
import p003X.C88440Kt0;
import p003X.C88613Kvn;
import p003X.DialogInterface$OnClickListenerC80000HgA;
import p003X.DialogInterface$OnClickListenerC80001HgB;
import p003X.DialogInterface$OnClickListenerC80002HgC;
import p003X.HZR;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder.a */
/* loaded from: classes3.dex */
public final class C4331a extends RecyclerView.ViewHolder implements Observer<KVData>, AbstractC4756a {
    public static ChangeQuickRedirect LIZ;
    public final VHeadView LIZIZ;
    public final VHeadView LIZJ;
    public final VHeadView LIZLLL;

    /* renamed from: LJ */
    public final ImageView f26277LJ;
    public final TextView LJFF;
    public final TextView LJI;
    public final TextView LJII;
    public final View LJIIIIZZ;
    public final HSImageView LJIIIZ;
    public final TextView LJIIJ;
    public final TextView LJIIJJI;
    public final AbstractC79943HfF LJIIL;
    public int LJIILIIL;
    public PkTagsContainerView LJIILJJIL;
    public final AnchorLinkInfoView LJIILL;
    public C6148ae LJIIZILJ;
    public DataCenter LJIJI;
    public boolean LJIJJ;
    public Context LJIJJLI;
    public AbstractC4782v LJIILLIIL = AbstractC4782v.LJIIL.LIZ();
    public int LJIJ = 0;

    static {
        Covode.recordClassIndex(26092);
    }

    @Override // com.bytedance.android.live.liveinteract.p382pk.p384ui.AbstractC4756a
    public final String LIZ() {
        C6148ae c6148ae = this.LJIIZILJ;
        if (c6148ae != null) {
            return c6148ae.LIZIZ;
        }
        return "";
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
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 9).isSupported && kVData2 != null && kVData2.getData() != null) {
            if ("data_pk_match_state".equals(kVData2.getKey())) {
                if (kVData2.getData().equals(1)) {
                    this.LJIIIZ.setImageResource(2130854809);
                    this.LJIIJ.setText(LK5.LIZ(2131584332));
                    this.LJIIJ.setTextColor(CastProtectorUtils.parseColor("#b0b0b0"));
                    return;
                }
                this.LJIIIZ.setImageResource(2130854855);
                this.LJIIJ.setText(2131584273);
                this.LJIIJ.setTextColor(CastProtectorUtils.parseColor("#ffffff"));
            } else if ("cmd_pk_rival_list_panel_unload".equals(kVData2.getKey()) && !PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported && this.LJIJJ) {
                this.LJIJI.removeObserver("data_pk_match_state", this);
                this.LJIJI.removeObserver("cmd_pk_rival_list_panel_unload", this);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.p382pk.p384ui.AbstractC4756a
    public final void LIZ(String str) {
        C6148ae c6148ae;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 12).isSupported && (c6148ae = this.LJIIZILJ) != null && c6148ae.LJIIJJI != null && this.LJIIZILJ.LIZJ != 0) {
            Room room = this.LJIIZILJ.LJIIJJI;
            HashMap hashMap = new HashMap();
            hashMap.put("right_user_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("right_room_id", room.getIdStr());
            hashMap.put("list_type", C79910Hei.LIZIZ.LIZ(this.LJIILIIL));
            hashMap.put("right_user_status", String.valueOf(this.LJIJ));
            hashMap.put("request_id", LinkCrossRoomDataHolder.LJII().LJJLIIIJLLLLLLLZ);
            hashMap.put("enter_from", str);
            hashMap.put("source", "link_banner");
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

    public String LIZ(String str, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (str.length() > i) {
            new StringBuilder();
            return C0002O.m25086C(str.substring(0, i - 1), "...");
        }
        return str;
    }

    public AnchorLinkUser LIZ(List<AnchorLinkUser> list, long j) {
        AnchorLinkUser next;
        User LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, new Long(j)}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (AnchorLinkUser) proxy.result;
        }
        if (list == null) {
            return null;
        }
        Iterator<AnchorLinkUser> it = list.iterator();
        while (it.hasNext() && (LIZ2 = (next = it.next()).LIZ()) != null) {
            if (LIZ2.getId() == j) {
                return next;
            }
        }
        return null;
    }

    public void LIZ(int i, final C6148ae c6148ae) {
        Room room;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), c6148ae}, this, LIZ, false, 5).isSupported && (room = c6148ae.LJIIJJI) != null && this.LJIILLIIL != null) {
            if (C79169HIt.LIZIZ(((IInteractService) ServiceManager.getService(IInteractService.class)).getLinkMode(), 2) && ((IInteractService) ServiceManager.getService(IInteractService.class)).getInteractAudienceService().LIZIZ()) {
                C88440Kt0.LIZ(2131584070);
            } else if (room.getLinkMicInfo() == null) {
                if (room.linkerDetail != null && room.linkerDetail.LIZIZ != null && room.linkerDetail.LIZIZ.contains(3L)) {
                    ALogger.m15800e("ttlive_pk", "ignore apply btn click for playmodes container MULTI_PK");
                    return;
                }
                if (room.linkMap.containsKey("7")) {
                    if (c6148ae.LJIILL == null || c6148ae.LJIILL.f26854LJ == null || c6148ae.LJIILL.f26854LJ.LIZ == null || c6148ae.LJIILL.f26854LJ.LIZ.size() != 4) {
                        if (LIZIZ(room.getOwner())) {
                            this.LJIIL.LIZ(c6148ae, 1);
                            return;
                        } else if (room.linkMap.get("7").longValue() != LinkCrossRoomDataHolder.LJII().LIZLLL) {
                            if (!this.LJIILLIIL.mo15709LJ().LJIIIIZZ().isEmpty()) {
                                HZR hzr = new HZR(this.LJIJJLI);
                                hzr.LIZ(LK5.LIZ(2131581966));
                                hzr.LIZIZ(LK5.LIZ(2131581964));
                                hzr.LIZ(LK5.LIZ(2131581969), DialogInterface$OnClickListenerC80000HgA.LIZIZ);
                                hzr.LIZIZ(LK5.LIZ(2131581970), new DialogInterface.OnClickListener(this, c6148ae) { // from class: X.Hg5
                                    public static ChangeQuickRedirect LIZ;
                                    public final C4331a LIZIZ;
                                    public final C6148ae LIZJ;

                                    static {
                                        Covode.recordClassIndex(26113);
                                    }

                                    {
                                        this.LIZIZ = this;
                                        this.LIZJ = c6148ae;
                                    }

                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i2) {
                                        if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
                                            return;
                                        }
                                        this.LIZIZ.LIZ(this.LIZJ, dialogInterface, i2);
                                    }
                                });
                                hzr.LIZ();
                            } else if (!this.LJIILLIIL.mo15709LJ().LIZLLL().isEmpty() && this.LJIILLIIL.mo15709LJ().LJIIIZ().isEmpty()) {
                                HZR hzr2 = new HZR(this.LJIJJLI);
                                hzr2.LIZ(LK5.LIZ(2131581966));
                                hzr2.LIZIZ(LK5.LIZ(2131581965));
                                hzr2.LIZ(LK5.LIZ(2131581969), DialogInterface$OnClickListenerC80001HgB.LIZIZ);
                                hzr2.LIZIZ(LK5.LIZ(2131581970), new DialogInterface.OnClickListener(this, c6148ae) { // from class: X.Hfn
                                    public static ChangeQuickRedirect LIZ;
                                    public final C4331a LIZIZ;
                                    public final C6148ae LIZJ;

                                    static {
                                        Covode.recordClassIndex(26115);
                                    }

                                    {
                                        this.LIZIZ = this;
                                        this.LIZJ = c6148ae;
                                    }

                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i2) {
                                        if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
                                            return;
                                        }
                                        final C4331a c4331a = this.LIZIZ;
                                        final C6148ae c6148ae2 = this.LIZJ;
                                        if (PatchProxy.proxy(new Object[]{c6148ae2, dialogInterface, Integer.valueOf(i2)}, c4331a, C4331a.LIZ, false, 15).isSupported) {
                                            return;
                                        }
                                        c4331a.LJIILLIIL.LIZ(7, new Runnable(c4331a, c6148ae2) { // from class: X.Hfz
                                            public static ChangeQuickRedirect LIZ;
                                            public final C4331a LIZIZ;
                                            public final C6148ae LIZJ;

                                            static {
                                                Covode.recordClassIndex(26118);
                                            }

                                            {
                                                this.LIZIZ = c4331a;
                                                this.LIZJ = c6148ae2;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                                    return;
                                                }
                                                C4331a c4331a2 = this.LIZIZ;
                                                C6148ae c6148ae3 = this.LIZJ;
                                                if (PatchProxy.proxy(new Object[]{c6148ae3}, c4331a2, C4331a.LIZ, false, 16).isSupported) {
                                                    return;
                                                }
                                                c4331a2.LJIIL.LIZIZ(c4331a2.LJIILIIL, c6148ae3);
                                            }
                                        }, false, "leave_for_apply", true);
                                        dialogInterface.dismiss();
                                    }
                                });
                                hzr2.LIZ();
                            } else if (this.LJIILLIIL.mo15709LJ().LJIIIZ().isEmpty()) {
                                this.LJIIL.LIZIZ(this.LJIILIIL, c6148ae);
                            } else {
                                C88613Kvn.LIZ(LK5.LJIIJ(), LK5.LIZ(2131581960));
                            }
                            HashMap hashMap = new HashMap();
                            JSONArray jSONArray = new JSONArray();
                            if (c6148ae.LJIILL != null && c6148ae.LJIILL.f26854LJ != null && c6148ae.LJIILL.f26854LJ.LIZ != null) {
                                hashMap.put("anchor_connect_status", String.valueOf(c6148ae.LJIILL.f26854LJ.LIZ.size()));
                                for (C6043aa c6043aa : c6148ae.LJIILL.f26854LJ.LIZ) {
                                    if (c6043aa.LIZ != LinkCrossRoomDataHolder.LJII().LJJJLIIL) {
                                        jSONArray.put(c6043aa.LIZ);
                                    }
                                }
                            }
                            hashMap.put("connecting_list", jSONArray.toString());
                            hashMap.put("right_user_id", String.valueOf(LinkCrossRoomDataHolder.LJII().LJJJLIIL));
                            C4574547f.LIZ().LIZ("livesdk_apply_icon_click", hashMap, Room.class, LinkCrossRoomDataHolder.LJII().LJIIIIZZ());
                            return;
                        } else {
                            return;
                        }
                    }
                } else if (LIZ(room.getOwner())) {
                    this.LJIIL.LIZ(c6148ae, 0);
                    return;
                } else if (!this.LJIILLIIL.mo15709LJ().LJIIIZ().isEmpty()) {
                    HZR hzr3 = new HZR(this.LJIJJLI);
                    hzr3.LIZ(LK5.LIZ(2131581973));
                    hzr3.LIZIZ(LK5.LIZ(2131581972));
                    hzr3.LIZ(LK5.LIZ(2131581969), DialogInterface$OnClickListenerC80002HgC.LIZIZ);
                    hzr3.LIZIZ(LK5.LIZ(2131581970), new DialogInterface.OnClickListener(this, c6148ae) { // from class: X.Hfh
                        public static ChangeQuickRedirect LIZ;
                        public final C4331a LIZIZ;
                        public final C6148ae LIZJ;

                        static {
                            Covode.recordClassIndex(26117);
                        }

                        {
                            this.LIZIZ = this;
                            this.LIZJ = c6148ae;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            C4331a c4331a = this.LIZIZ;
                            C6148ae c6148ae2 = this.LIZJ;
                            if (PatchProxy.proxy(new Object[]{c6148ae2, dialogInterface, Integer.valueOf(i2)}, c4331a, C4331a.LIZ, false, 13).isSupported) {
                                return;
                            }
                            Room currentRoom = ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).getCurrentRoom();
                            if (!c4331a.LJIILLIIL.mo15709LJ().LJIIIZ().isEmpty()) {
                                User user = c4331a.LJIILLIIL.mo15709LJ().LJIIIZ().get(0);
                                if (currentRoom != null) {
                                    c4331a.LJIILLIIL.LIZJ().LIZ(LinkCrossRoomDataHolder.LJII().LIZLLL, user.getLiveRoomId(), user.getId(), user.getSecUid(), 1, "cancel_for_invite");
                                }
                            }
                            c4331a.LJIIL.LIZ(c4331a.LJIILIIL, c6148ae2);
                            dialogInterface.dismiss();
                        }
                    });
                    hzr3.LIZ();
                    return;
                } else if (this.LJIILLIIL.mo15709LJ().LIZLLL().size() == 4) {
                    C88613Kvn.LIZ(LK5.LJIIJ(), LK5.LIZ(2131581977));
                    return;
                } else if (this.LJIILLIIL.mo15709LJ().LJIIJ().size() < 4) {
                    this.LJIIL.LIZ(this.LJIILIIL, c6148ae);
                    return;
                }
                C88613Kvn.LIZ(LK5.LJIIJ(), LK5.LIZ(2131581998));
            }
        }
    }

    public C4331a(View view, AbstractC79943HfF abstractC79943HfF, DataCenter dataCenter) {
        super(view);
        this.LIZIZ = (VHeadView) view.findViewById(2131167465);
        this.LIZJ = (VHeadView) view.findViewById(2131196531);
        this.LIZLLL = (VHeadView) view.findViewById(2131179019);
        this.f26277LJ = (ImageView) view.findViewById(2131181465);
        this.LJFF = (TextView) view.findViewById(2131194721);
        this.LJI = (TextView) view.findViewById(2131195346);
        this.LJII = (TextView) view.findViewById(2131194115);
        this.LJIIIIZZ = view.findViewById(2131178113);
        this.LJIIIZ = (HSImageView) view.findViewById(2131179127);
        this.LJIIJ = (TextView) view.findViewById(2131194438);
        this.LJIIJJI = (TextView) view.findViewById(2131195583);
        this.LJIILJJIL = (PkTagsContainerView) view.findViewById(2131191526);
        this.LJIILL = (AnchorLinkInfoView) view.findViewById(2131196979);
        this.LJIIL = abstractC79943HfF;
        this.LJIJI = dataCenter;
        this.LJIJJLI = view.getContext();
    }

    public final /* synthetic */ void LIZ(C6148ae c6148ae, DialogInterface dialogInterface, int i) {
        if (PatchProxy.proxy(new Object[]{c6148ae, dialogInterface, Integer.valueOf(i)}, this, LIZ, false, 18).isSupported) {
            return;
        }
        Room currentRoom = ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).getCurrentRoom();
        for (User user : this.LJIILLIIL.mo15709LJ().LJIIIIZZ()) {
            if (currentRoom != null) {
                this.LJIILLIIL.LIZJ().LIZ(LinkCrossRoomDataHolder.LJII().LIZLLL, user.getLiveRoomId(), user.getId(), user.getSecUid(), 0, "cancel_for_apply");
            }
        }
        this.LJIIL.LIZIZ(this.LJIILIIL, c6148ae);
        dialogInterface.dismiss();
    }
}
