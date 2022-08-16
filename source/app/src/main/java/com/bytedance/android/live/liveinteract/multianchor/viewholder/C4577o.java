package com.bytedance.android.live.liveinteract.multianchor.viewholder;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multianchor.viewholder.C4577o;
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
import p003X.AbstractC79992Hg2;
import p003X.C4574547f;
import p003X.C79169HIt;
import p003X.C88440Kt0;
import p003X.C88613Kvn;
import p003X.DialogInterface$OnClickListenerC80008HgI;
import p003X.DialogInterface$OnClickListenerC80009HgJ;
import p003X.DialogInterface$OnClickListenerC80010HgK;
import p003X.HZR;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.viewholder.o */
/* loaded from: classes3.dex */
public final class C4577o extends RecyclerView.ViewHolder implements AbstractC4756a {
    public static ChangeQuickRedirect LIZ;
    public final VHeadView LIZIZ;
    public final VHeadView LIZJ;
    public final TextView LIZLLL;

    /* renamed from: LJ */
    public final TextView f26372LJ;
    public final Button LJFF;
    public final AbstractC79992Hg2 LJI;
    public int LJIIIIZZ;
    public Room LJIIJ;
    public DataCenter LJIIL;
    public Context LJIILIIL;
    public LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
    public AbstractC4782v LJIIIZ = AbstractC4782v.LJIIL.LIZ();
    public HashMap<String, String> LJIIJJI = new HashMap<>();

    static {
        Covode.recordClassIndex(28446);
    }

    @Override // com.bytedance.android.live.liveinteract.p382pk.p384ui.AbstractC4756a
    public final String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Room room = this.LJIIJ;
        if (room != null) {
            return room.getIdStr();
        }
        return "";
    }

    @Override // com.bytedance.android.live.liveinteract.p382pk.p384ui.AbstractC4756a
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJIIJJI.put("enter_from", str);
        C4574547f.LIZ().LIZ("livesdk_connectioninvite_anchoricon_show", this.LJIIJJI, Room.class);
    }

    public boolean LIZ(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4782v abstractC4782v = this.LJIIIZ;
        if (abstractC4782v != null) {
            Iterator<User> it = abstractC4782v.LJFF().LJIIIIZZ().iterator();
            while (it.hasNext()) {
                if (it.next().getId() == user.getId()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean LIZIZ(User user) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{user}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4782v abstractC4782v = this.LJIIIZ;
        if (abstractC4782v != null) {
            Iterator<User> it = abstractC4782v.LJFF().LJIIIZ().iterator();
            while (it.hasNext()) {
                if (it.next().getId() == user.getId()) {
                    return true;
                }
            }
        }
        return false;
    }

    public C4577o(View view, AbstractC79992Hg2 abstractC79992Hg2, DataCenter dataCenter) {
        super(view);
        this.LIZIZ = (VHeadView) view.findViewById(2131165351);
        this.LIZJ = (VHeadView) view.findViewById(2131179019);
        this.LIZLLL = (TextView) view.findViewById(2131194721);
        this.f26372LJ = (TextView) view.findViewById(2131195419);
        this.LJFF = (Button) view.findViewById(2131168460);
        this.LJI = abstractC79992Hg2;
        this.LJIIL = dataCenter;
        this.LJIILIIL = view.getContext();
    }

    public void LIZ(final Room room, final RivalExtraInfo rivalExtraInfo, final int i) {
        if (PatchProxy.proxy(new Object[]{room, rivalExtraInfo, Integer.valueOf(i)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        if (this.LJII.LJJLIIJ != null && this.LJII.LJJLIIJ.get(Integer.valueOf(this.LJIIIIZZ)) != null) {
            LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJII;
            linkCrossRoomDataHolder.LIZLLL(linkCrossRoomDataHolder.LJJLIIJ.get(Integer.valueOf(this.LJIIIIZZ)));
        }
        if (room.getOwner() != null && this.LJIIIZ != null) {
            if (C79169HIt.LIZIZ(((IInteractService) ServiceManager.getService(IInteractService.class)).getLinkMode(), 2) && ((IInteractService) ServiceManager.getService(IInteractService.class)).getInteractAudienceService().LIZIZ()) {
                C88440Kt0.LIZ(2131584293);
            } else if (room.getLinkMicInfo() == null && rivalExtraInfo != null && rivalExtraInfo.LJFF != null && rivalExtraInfo.LJFF.LIZ) {
                if (room.linkMap.containsKey("14") && rivalExtraInfo.f26854LJ != null && rivalExtraInfo.f26854LJ.LIZ.size() < 2) {
                    if (LIZIZ(room.getOwner())) {
                        this.LJI.LIZ(room, 1);
                    } else if (room.linkMap.get("14").longValue() != this.LJII.LIZLLL) {
                        if (!this.LJIIIZ.LJFF().LJIIIIZZ().isEmpty()) {
                            HZR hzr = new HZR(this.LJIILIIL);
                            hzr.LIZ(LK5.LIZ(2131581966));
                            hzr.LIZIZ(LK5.LIZ(2131581964));
                            hzr.LIZ(LK5.LIZ(2131581969), DialogInterface$OnClickListenerC80008HgI.LIZIZ);
                            hzr.LIZIZ(LK5.LIZ(2131581970), new DialogInterface.OnClickListener(this, room, rivalExtraInfo, i) { // from class: X.Hg1
                                public static ChangeQuickRedirect LIZ;
                                public final C4577o LIZIZ;
                                public final Room LIZJ;
                                public final RivalExtraInfo LIZLLL;

                                /* renamed from: LJ */
                                public final int f6915LJ;

                                static {
                                    Covode.recordClassIndex(28449);
                                }

                                {
                                    this.LIZIZ = this;
                                    this.LIZJ = room;
                                    this.LIZLLL = rivalExtraInfo;
                                    this.f6915LJ = i;
                                }

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                    if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
                                        return;
                                    }
                                    this.LIZIZ.LIZ(this.LIZJ, this.LIZLLL, this.f6915LJ, dialogInterface, i2);
                                }
                            });
                            hzr.LIZ();
                        } else if (!this.LJIIIZ.LJFF().LIZLLL().isEmpty() && this.LJIIIZ.LJFF().LJIIIZ().isEmpty()) {
                            HZR hzr2 = new HZR(this.LJIILIIL);
                            hzr2.LIZ(LK5.LIZ(2131581966));
                            hzr2.LIZIZ(LK5.LIZ(2131581965));
                            hzr2.LIZ(LK5.LIZ(2131581969), DialogInterface$OnClickListenerC80009HgJ.LIZIZ);
                            hzr2.LIZIZ(LK5.LIZ(2131581970), new DialogInterface.OnClickListener(this, room, rivalExtraInfo, i) { // from class: X.Hfl
                                public static ChangeQuickRedirect LIZ;
                                public final C4577o LIZIZ;
                                public final Room LIZJ;
                                public final RivalExtraInfo LIZLLL;

                                /* renamed from: LJ */
                                public final int f6909LJ;

                                static {
                                    Covode.recordClassIndex(28451);
                                }

                                {
                                    this.LIZIZ = this;
                                    this.LIZJ = room;
                                    this.LIZLLL = rivalExtraInfo;
                                    this.f6909LJ = i;
                                }

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                    if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
                                        return;
                                    }
                                    final C4577o c4577o = this.LIZIZ;
                                    final Room room2 = this.LIZJ;
                                    final RivalExtraInfo rivalExtraInfo2 = this.LIZLLL;
                                    final int i3 = this.f6909LJ;
                                    if (PatchProxy.proxy(new Object[]{room2, rivalExtraInfo2, Integer.valueOf(i3), dialogInterface, Integer.valueOf(i2)}, c4577o, C4577o.LIZ, false, 11).isSupported) {
                                        return;
                                    }
                                    c4577o.LJIIIZ.LIZ(14, new Runnable(c4577o, room2, rivalExtraInfo2, i3) { // from class: X.Hfq
                                        public static ChangeQuickRedirect LIZ;
                                        public final C4577o LIZIZ;
                                        public final Room LIZJ;
                                        public final RivalExtraInfo LIZLLL;

                                        /* renamed from: LJ */
                                        public final int f6912LJ;

                                        static {
                                            Covode.recordClassIndex(28454);
                                        }

                                        {
                                            this.LIZIZ = c4577o;
                                            this.LIZJ = room2;
                                            this.LIZLLL = rivalExtraInfo2;
                                            this.f6912LJ = i3;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                                return;
                                            }
                                            C4577o c4577o2 = this.LIZIZ;
                                            Room room3 = this.LIZJ;
                                            RivalExtraInfo rivalExtraInfo3 = this.LIZLLL;
                                            int i4 = this.f6912LJ;
                                            if (PatchProxy.proxy(new Object[]{room3, rivalExtraInfo3, Integer.valueOf(i4)}, c4577o2, C4577o.LIZ, false, 12).isSupported) {
                                                return;
                                            }
                                            c4577o2.LJI.LIZIZ(room3, c4577o2.LJIIIIZZ, rivalExtraInfo3, i4);
                                        }
                                    }, false, "leave_for_apply", false);
                                    dialogInterface.dismiss();
                                }
                            });
                            hzr2.LIZ();
                        } else if (this.LJIIIZ.LJFF().LJIIIZ().isEmpty()) {
                            this.LJI.LIZIZ(room, this.LJIIIIZZ, rivalExtraInfo, i);
                        } else {
                            C88613Kvn.LIZ(LK5.LJIIJ(), LK5.LIZ(2131581960));
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("anchor_connect_status", String.valueOf(rivalExtraInfo.f26854LJ.LIZ.size()));
                        JSONArray jSONArray = new JSONArray();
                        if (rivalExtraInfo.f26854LJ != null && rivalExtraInfo.f26854LJ.LIZ != null) {
                            for (C6043aa c6043aa : rivalExtraInfo.f26854LJ.LIZ) {
                                if (c6043aa.LIZ != this.LJII.LJJJLIIL) {
                                    jSONArray.put(c6043aa.LIZ);
                                }
                            }
                        }
                        hashMap.put("connecting_list", jSONArray.toString());
                        hashMap.put("right_user_id", String.valueOf(this.LJII.LJJJLIIL));
                        C4574547f.LIZ().LIZ("livesdk_apply_icon_click", hashMap, Room.class, this.LJII.LJIIIIZZ());
                    }
                } else if (LIZ(room.getOwner())) {
                    this.LJI.LIZ(room, 0);
                } else if (!this.LJIIIZ.LJFF().LJIIIZ().isEmpty()) {
                    HZR hzr3 = new HZR(this.LJIILIIL);
                    hzr3.LIZ(LK5.LIZ(2131581973));
                    hzr3.LIZIZ(LK5.LIZ(2131581972));
                    hzr3.LIZ(LK5.LIZ(2131581969), DialogInterface$OnClickListenerC80010HgK.LIZIZ);
                    hzr3.LIZIZ(LK5.LIZ(2131581970), new DialogInterface.OnClickListener(this, room, rivalExtraInfo, i) { // from class: X.Hfj
                        public static ChangeQuickRedirect LIZ;
                        public final C4577o LIZIZ;
                        public final Room LIZJ;
                        public final RivalExtraInfo LIZLLL;

                        /* renamed from: LJ */
                        public final int f6907LJ;

                        static {
                            Covode.recordClassIndex(28453);
                        }

                        {
                            this.LIZIZ = this;
                            this.LIZJ = room;
                            this.LIZLLL = rivalExtraInfo;
                            this.f6907LJ = i;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            C4577o c4577o = this.LIZIZ;
                            Room room2 = this.LIZJ;
                            RivalExtraInfo rivalExtraInfo2 = this.LIZLLL;
                            int i3 = this.f6907LJ;
                            if (PatchProxy.proxy(new Object[]{room2, rivalExtraInfo2, Integer.valueOf(i3), dialogInterface, Integer.valueOf(i2)}, c4577o, C4577o.LIZ, false, 9).isSupported) {
                                return;
                            }
                            Room currentRoom = ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).getCurrentRoom();
                            if (!c4577o.LJIIIZ.LJFF().LJIIIZ().isEmpty()) {
                                User user = c4577o.LJIIIZ.LJFF().LJIIIZ().get(0);
                                if (currentRoom != null) {
                                    c4577o.LJIIIZ.LIZJ().LIZ(LinkCrossRoomDataHolder.LJII().LIZLLL, user.getLiveRoomId(), user.getId(), user.getSecUid(), 1, "cancel_for_invite");
                                }
                            }
                            c4577o.LJI.LIZ(room2, c4577o.LJIIIIZZ, rivalExtraInfo2, i3);
                            dialogInterface.dismiss();
                        }
                    });
                    hzr3.LIZ();
                } else if (this.LJIIIZ.LJFF().LIZLLL().size() == 2) {
                    C88613Kvn.LIZ(LK5.LJIIJ(), LK5.LIZ(2131581977));
                } else if (this.LJIIIZ.LJFF().LJIIJ().size() < 2) {
                    this.LJIIL.get("data_room", (String) new Room());
                    this.LJI.LIZ(room, this.LJIIIIZZ, rivalExtraInfo, i);
                } else {
                    C88613Kvn.LIZ(LK5.LJIIJ(), LK5.LIZ(2131581999));
                }
            }
        }
    }

    public final /* synthetic */ void LIZ(Room room, RivalExtraInfo rivalExtraInfo, int i, DialogInterface dialogInterface, int i2) {
        if (PatchProxy.proxy(new Object[]{room, rivalExtraInfo, Integer.valueOf(i), dialogInterface, Integer.valueOf(i2)}, this, LIZ, false, 14).isSupported) {
            return;
        }
        Room currentRoom = ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).getCurrentRoom();
        for (User user : this.LJIIIZ.LJFF().LJIIIIZZ()) {
            if (currentRoom != null) {
                this.LJIIIZ.LIZJ().LIZ(LinkCrossRoomDataHolder.LJII().LIZLLL, user.getLiveRoomId(), user.getId(), user.getSecUid(), 0, "cancel_for_apply");
            }
        }
        this.LJI.LIZIZ(room, this.LJIIIIZZ, rivalExtraInfo, i);
        dialogInterface.dismiss();
    }
}
