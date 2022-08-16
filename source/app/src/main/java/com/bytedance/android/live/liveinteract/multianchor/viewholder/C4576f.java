package com.bytedance.android.live.liveinteract.multianchor.viewholder;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.PkTagsContainerView;
import com.bytedance.android.live.liveinteract.multianchor.p376ui.AnchorLinkInfoView;
import com.bytedance.android.live.liveinteract.multianchor.viewholder.C4576f;
import com.bytedance.android.live.liveinteract.p382pk.p384ui.AbstractC4756a;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.interact.model.C6043aa;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.live.ILiveRoomService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import p002O.C0002O;
import p003X.AbstractC79992Hg2;
import p003X.C4574547f;
import p003X.C79169HIt;
import p003X.C88440Kt0;
import p003X.C88613Kvn;
import p003X.DialogInterface$OnClickListenerC80005HgF;
import p003X.DialogInterface$OnClickListenerC80006HgG;
import p003X.DialogInterface$OnClickListenerC80007HgH;
import p003X.HZR;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.viewholder.f */
/* loaded from: classes3.dex */
public final class C4576f extends RecyclerView.ViewHolder implements AbstractC4756a {
    public static ChangeQuickRedirect LIZ;
    public final VHeadView LIZIZ;
    public final VHeadView LIZJ;
    public final TextView LIZLLL;

    /* renamed from: LJ */
    public final PkTagsContainerView f26371LJ;
    public final ViewGroup LJFF;
    public final TextView LJI;
    public final ViewGroup LJII;
    public final TextView LJIIIIZZ;
    public final AnchorLinkInfoView LJIIIZ;
    public final Button LJIIJ;
    public final AbstractC79992Hg2 LJIIJJI;
    public int LJIILIIL;
    public Room LJIILL;
    public Context LJIIZILJ;
    public LinkCrossRoomDataHolder LJIIL = LinkCrossRoomDataHolder.LJII();
    public AbstractC4782v LJIILJJIL = AbstractC4782v.LJIIL.LIZ();
    public HashMap<String, String> LJIILLIIL = new HashMap<>();

    static {
        Covode.recordClassIndex(28437);
    }

    @Override // com.bytedance.android.live.liveinteract.p382pk.p384ui.AbstractC4756a
    public final String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Room room = this.LJIILL;
        if (room != null) {
            return room.getIdStr();
        }
        return "";
    }

    @Override // com.bytedance.android.live.liveinteract.p382pk.p384ui.AbstractC4756a
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3).isSupported) {
            return;
        }
        this.LJIILLIIL.put("enter_from", str);
        this.LJIILLIIL.put("source", "link_banner");
        C4574547f.LIZ().LIZ("livesdk_connectioninvite_anchoricon_show", this.LJIILLIIL, Room.class);
    }

    public boolean LIZIZ(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4782v abstractC4782v = this.LJIILJJIL;
        if (abstractC4782v != null) {
            Iterator<User> it = abstractC4782v.mo15709LJ().LJIIIZ().iterator();
            while (it.hasNext()) {
                if (it.next().getId() == user.getId()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean LIZ(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4782v abstractC4782v = this.LJIILJJIL;
        if (abstractC4782v != null) {
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
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (str.length() > i) {
            new StringBuilder();
            return C0002O.m25086C(str.substring(0, i - 1), "...");
        }
        return str;
    }

    public C4576f(View view, AbstractC79992Hg2 abstractC79992Hg2, DataCenter dataCenter) {
        super(view);
        this.LIZIZ = (VHeadView) view.findViewById(2131165351);
        this.LIZJ = (VHeadView) view.findViewById(2131179019);
        this.LIZLLL = (TextView) view.findViewById(2131194721);
        this.f26371LJ = (PkTagsContainerView) view.findViewById(2131191526);
        this.LJFF = (ViewGroup) view.findViewById(2131182159);
        view.findViewById(2131179189);
        this.LJI = (TextView) view.findViewById(2131193945);
        this.LJII = (ViewGroup) view.findViewById(2131167102);
        view.findViewById(2131178557);
        this.LJIIIIZZ = (TextView) view.findViewById(2131193520);
        this.LJIIIZ = (AnchorLinkInfoView) view.findViewById(2131196979);
        this.LJIIJ = (Button) view.findViewById(2131168460);
        this.LJIIJJI = abstractC79992Hg2;
        this.LJIIZILJ = view.getContext();
    }

    public void LIZ(final Room room, final RivalExtraInfo rivalExtraInfo, final int i) {
        if (PatchProxy.proxy(new Object[]{room, rivalExtraInfo, Integer.valueOf(i)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        if (this.LJIIL.LJJLIIJ != null && this.LJIIL.LJJLIIJ.get(Integer.valueOf(this.LJIILIIL)) != null) {
            LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJIIL;
            linkCrossRoomDataHolder.LIZLLL(linkCrossRoomDataHolder.LJJLIIJ.get(Integer.valueOf(this.LJIILIIL)));
        }
        if (room.getOwner() != null && this.LJIILJJIL != null) {
            if (C79169HIt.LIZIZ(((IInteractService) ServiceManager.getService(IInteractService.class)).getLinkMode(), 2) && ((IInteractService) ServiceManager.getService(IInteractService.class)).getInteractAudienceService().LIZIZ()) {
                C88440Kt0.LIZ(2131584293);
            } else if (room.getLinkMicInfo() == null && rivalExtraInfo != null && rivalExtraInfo.LJFF != null && rivalExtraInfo.LJFF.LIZ) {
                if (room.linkerDetail != null && room.linkerDetail.LIZIZ != null && room.linkerDetail.LIZIZ.contains(3L)) {
                    ALogger.m15800e("ttlive_pk", "ignore apply btn click for playmodes container MULTI_PK");
                } else if (this.LJIILJJIL.mo15709LJ().LJIIJ().size() <= 1 || LIZ(room.getOwner()) || rivalExtraInfo.LJFF.LIZIZ) {
                    if (room.linkMap.containsKey("7") && rivalExtraInfo.f26854LJ != null && rivalExtraInfo.f26854LJ.LIZ.size() < 4) {
                        if (LIZIZ(room.getOwner())) {
                            this.LJIIJJI.LIZ(room, 1);
                        } else if (room.linkMap.get("7").longValue() != this.LJIIL.LIZLLL) {
                            if (!this.LJIILJJIL.mo15709LJ().LJIIIIZZ().isEmpty()) {
                                HZR hzr = new HZR(this.LJIIZILJ);
                                hzr.LIZ(LK5.LIZ(2131581966));
                                hzr.LIZIZ(LK5.LIZ(2131581964));
                                hzr.LIZ(LK5.LIZ(2131581969), DialogInterface$OnClickListenerC80005HgF.LIZIZ);
                                hzr.LIZIZ(LK5.LIZ(2131581970), new DialogInterface.OnClickListener(this, room, rivalExtraInfo, i) { // from class: X.Hg0
                                    public static ChangeQuickRedirect LIZ;
                                    public final C4576f LIZIZ;
                                    public final Room LIZJ;
                                    public final RivalExtraInfo LIZLLL;

                                    /* renamed from: LJ */
                                    public final int f6914LJ;

                                    static {
                                        Covode.recordClassIndex(28440);
                                    }

                                    {
                                        this.LIZIZ = this;
                                        this.LIZJ = room;
                                        this.LIZLLL = rivalExtraInfo;
                                        this.f6914LJ = i;
                                    }

                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i2) {
                                        if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
                                            return;
                                        }
                                        this.LIZIZ.LIZ(this.LIZJ, this.LIZLLL, this.f6914LJ, dialogInterface, i2);
                                    }
                                });
                                hzr.LIZ();
                            } else if (!this.LJIILJJIL.mo15709LJ().LIZLLL().isEmpty() && this.LJIILJJIL.mo15709LJ().LJIIIZ().isEmpty()) {
                                HZR hzr2 = new HZR(this.LJIIZILJ);
                                hzr2.LIZ(LK5.LIZ(2131581966));
                                hzr2.LIZIZ(LK5.LIZ(2131581965));
                                hzr2.LIZ(LK5.LIZ(2131581969), DialogInterface$OnClickListenerC80006HgG.LIZIZ);
                                hzr2.LIZIZ(LK5.LIZ(2131581970), new DialogInterface.OnClickListener(this, room, rivalExtraInfo, i) { // from class: X.Hfk
                                    public static ChangeQuickRedirect LIZ;
                                    public final C4576f LIZIZ;
                                    public final Room LIZJ;
                                    public final RivalExtraInfo LIZLLL;

                                    /* renamed from: LJ */
                                    public final int f6908LJ;

                                    static {
                                        Covode.recordClassIndex(28442);
                                    }

                                    {
                                        this.LIZIZ = this;
                                        this.LIZJ = room;
                                        this.LIZLLL = rivalExtraInfo;
                                        this.f6908LJ = i;
                                    }

                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i2) {
                                        if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
                                            return;
                                        }
                                        final C4576f c4576f = this.LIZIZ;
                                        final Room room2 = this.LIZJ;
                                        final RivalExtraInfo rivalExtraInfo2 = this.LIZLLL;
                                        final int i3 = this.f6908LJ;
                                        if (PatchProxy.proxy(new Object[]{room2, rivalExtraInfo2, Integer.valueOf(i3), dialogInterface, Integer.valueOf(i2)}, c4576f, C4576f.LIZ, false, 14).isSupported) {
                                            return;
                                        }
                                        c4576f.LJIILJJIL.LIZ(7, new Runnable(c4576f, room2, rivalExtraInfo2, i3) { // from class: X.Hfp
                                            public static ChangeQuickRedirect LIZ;
                                            public final C4576f LIZIZ;
                                            public final Room LIZJ;
                                            public final RivalExtraInfo LIZLLL;

                                            /* renamed from: LJ */
                                            public final int f6911LJ;

                                            static {
                                                Covode.recordClassIndex(28445);
                                            }

                                            {
                                                this.LIZIZ = c4576f;
                                                this.LIZJ = room2;
                                                this.LIZLLL = rivalExtraInfo2;
                                                this.f6911LJ = i3;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                                    return;
                                                }
                                                C4576f c4576f2 = this.LIZIZ;
                                                Room room3 = this.LIZJ;
                                                RivalExtraInfo rivalExtraInfo3 = this.LIZLLL;
                                                int i4 = this.f6911LJ;
                                                if (PatchProxy.proxy(new Object[]{room3, rivalExtraInfo3, Integer.valueOf(i4)}, c4576f2, C4576f.LIZ, false, 15).isSupported) {
                                                    return;
                                                }
                                                c4576f2.LJIIJJI.LIZIZ(room3, c4576f2.LJIILIIL, rivalExtraInfo3, i4);
                                            }
                                        }, false, "leave_for_apply", true);
                                        dialogInterface.dismiss();
                                    }
                                });
                                hzr2.LIZ();
                            } else if (this.LJIILJJIL.mo15709LJ().LJIIIZ().isEmpty()) {
                                this.LJIIJJI.LIZIZ(room, this.LJIILIIL, rivalExtraInfo, i);
                            } else {
                                C88613Kvn.LIZ(LK5.LJIIJ(), LK5.LIZ(2131581960));
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("anchor_connect_status", String.valueOf(rivalExtraInfo.f26854LJ.LIZ.size()));
                            JSONArray jSONArray = new JSONArray();
                            if (rivalExtraInfo.f26854LJ != null && rivalExtraInfo.f26854LJ.LIZ != null) {
                                for (C6043aa c6043aa : rivalExtraInfo.f26854LJ.LIZ) {
                                    if (c6043aa.LIZ != this.LJIIL.LJJJLIIL) {
                                        jSONArray.put(c6043aa.LIZ);
                                    }
                                }
                            }
                            hashMap.put("connecting_list", jSONArray.toString());
                            hashMap.put("right_user_id", String.valueOf(this.LJIIL.LJJJLIIL));
                            C4574547f.LIZ().LIZ("livesdk_apply_icon_click", hashMap, Room.class, this.LJIIL.LJIIIIZZ());
                        }
                    } else if (LIZ(room.getOwner())) {
                        this.LJIIJJI.LIZ(room, 0);
                    } else if (!this.LJIILJJIL.mo15709LJ().LJIIIZ().isEmpty()) {
                        HZR hzr3 = new HZR(this.LJIIZILJ);
                        hzr3.LIZ(LK5.LIZ(2131581973));
                        hzr3.LIZIZ(LK5.LIZ(2131581972));
                        hzr3.LIZ(LK5.LIZ(2131581969), DialogInterface$OnClickListenerC80007HgH.LIZIZ);
                        hzr3.LIZIZ(LK5.LIZ(2131581970), new DialogInterface.OnClickListener(this, room, rivalExtraInfo, i) { // from class: X.Hfi
                            public static ChangeQuickRedirect LIZ;
                            public final C4576f LIZIZ;
                            public final Room LIZJ;
                            public final RivalExtraInfo LIZLLL;

                            /* renamed from: LJ */
                            public final int f6906LJ;

                            static {
                                Covode.recordClassIndex(28444);
                            }

                            {
                                this.LIZIZ = this;
                                this.LIZJ = room;
                                this.LIZLLL = rivalExtraInfo;
                                this.f6906LJ = i;
                            }

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
                                    return;
                                }
                                C4576f c4576f = this.LIZIZ;
                                Room room2 = this.LIZJ;
                                RivalExtraInfo rivalExtraInfo2 = this.LIZLLL;
                                int i3 = this.f6906LJ;
                                if (PatchProxy.proxy(new Object[]{room2, rivalExtraInfo2, Integer.valueOf(i3), dialogInterface, Integer.valueOf(i2)}, c4576f, C4576f.LIZ, false, 12).isSupported) {
                                    return;
                                }
                                Room currentRoom = ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).getCurrentRoom();
                                if (!c4576f.LJIILJJIL.mo15709LJ().LJIIIZ().isEmpty()) {
                                    User user = c4576f.LJIILJJIL.mo15709LJ().LJIIIZ().get(0);
                                    if (currentRoom != null) {
                                        c4576f.LJIILJJIL.LIZJ().LIZ(LinkCrossRoomDataHolder.LJII().LIZLLL, user.getLiveRoomId(), user.getId(), user.getSecUid(), 1, "cancel_for_invite");
                                    }
                                }
                                c4576f.LJIIJJI.LIZ(room2, c4576f.LJIILIIL, rivalExtraInfo2, i3);
                                dialogInterface.dismiss();
                            }
                        });
                        hzr3.LIZ();
                    } else if (this.LJIILJJIL.mo15709LJ().LIZLLL().size() == 4) {
                        C88613Kvn.LIZ(LK5.LJIIJ(), LK5.LIZ(2131581977));
                    } else if (this.LJIILJJIL.mo15709LJ().LJIIJ().size() < 4) {
                        this.LJIIJJI.LIZ(room, this.LJIILIIL, rivalExtraInfo, i);
                    } else {
                        C88613Kvn.LIZ(LK5.LJIIJ(), LK5.LIZ(2131581998));
                    }
                }
            }
        }
    }

    public final /* synthetic */ void LIZ(Room room, RivalExtraInfo rivalExtraInfo, int i, DialogInterface dialogInterface, int i2) {
        if (PatchProxy.proxy(new Object[]{room, rivalExtraInfo, Integer.valueOf(i), dialogInterface, Integer.valueOf(i2)}, this, LIZ, false, 17).isSupported) {
            return;
        }
        Room currentRoom = ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).getCurrentRoom();
        for (User user : this.LJIILJJIL.mo15709LJ().LJIIIIZZ()) {
            if (currentRoom != null) {
                this.LJIILJJIL.LIZJ().LIZ(LinkCrossRoomDataHolder.LJII().LIZLLL, user.getLiveRoomId(), user.getId(), user.getSecUid(), 0, "cancel_for_apply");
            }
        }
        this.LJIIJJI.LIZIZ(room, this.LJIILIIL, rivalExtraInfo, i);
        dialogInterface.dismiss();
    }
}
