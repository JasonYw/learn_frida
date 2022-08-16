package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.PkTagsContainerView;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.p382pk.p384ui.AbstractC4756a;
import com.bytedance.android.livesdk.chatroom.model.interact.C6148ae;
import com.bytedance.android.livesdk.widget.VHeadView;
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
import p003X.AbstractC79943HfF;
import p003X.C4574547f;
import p003X.C79910Hei;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder.af */
/* loaded from: classes3.dex */
public final class C4333af extends RecyclerView.ViewHolder implements Observer<KVData>, AbstractC4756a {
    public static ChangeQuickRedirect LIZ;
    public final VHeadView LIZIZ;
    public final VHeadView LIZJ;
    public final ImageView LIZLLL;

    /* renamed from: LJ */
    public final HSImageView f26278LJ;
    public final TextView LJFF;
    public final TextView LJI;
    public final TextView LJII;
    public final View LJIIIIZZ;
    public final HSImageView LJIIIZ;
    public final TextView LJIIJ;
    public final TextView LJIIJJI;
    public final AbstractC79943HfF LJIIL;
    public int LJIILIIL;
    public DataCenter LJIILJJIL;
    public boolean LJIILL;
    public PkTagsContainerView LJIILLIIL;
    public C6148ae LJIIZILJ;
    public boolean LJIJ;

    static {
        Covode.recordClassIndex(26098);
    }

    @Override // com.bytedance.android.live.liveinteract.p382pk.p384ui.AbstractC4756a
    public final String LIZ() {
        C6148ae c6148ae = this.LJIIZILJ;
        if (c6148ae != null) {
            return c6148ae.LIZIZ;
        }
        return "";
    }

    @Override // com.bytedance.android.live.liveinteract.p382pk.p384ui.AbstractC4756a
    public final void LIZ(String str) {
        C6148ae c6148ae;
        String str2;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 7).isSupported && (c6148ae = this.LJIIZILJ) != null && c6148ae.LJIIJJI != null && this.LJIIZILJ.LIZJ != 0) {
            Room room = this.LJIIZILJ.LJIIJJI;
            HashMap hashMap = new HashMap();
            hashMap.put("right_user_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("right_room_id", room.getIdStr());
            hashMap.put("connection_type", "manual_pk");
            hashMap.put("list_type", C79910Hei.LIZIZ.LIZ(this.LJIILIIL));
            if (this.LJIJ) {
                str2 = "2";
            } else {
                str2 = "1";
            }
            hashMap.put("right_user_status", str2);
            hashMap.put("request_id", LinkCrossRoomDataHolder.LJII().LJJLIIIJLLLLLLLZ);
            hashMap.put("enter_from", str);
            hashMap.put("source", "pk_banner");
            C4574547f.LIZ().LIZ("livesdk_connectioninvite_anchoricon_show", hashMap, Room.class);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 4).isSupported && kVData2 != null && kVData2.getData() != null) {
            if ("data_pk_match_state".equals(kVData2.getKey())) {
                if (kVData2.getData().equals(1)) {
                    this.LJIIIZ.setImageResource(2130854809);
                    this.LJIIJ.setText(LK5.LIZ(2131584332));
                    this.LJIIJ.setTextColor(CastProtectorUtils.parseColor("#b0b0b0"));
                    return;
                }
                this.LJIIIZ.setImageResource(2130854855);
                this.LJIIJ.setText(2131584409);
                this.LJIIJ.setTextColor(CastProtectorUtils.parseColor("#ffffff"));
            } else if ("cmd_pk_rival_list_panel_unload".equals(kVData2.getKey()) && !PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported && this.LJIILL) {
                this.LJIILJJIL.removeObserver("data_pk_match_state", this);
                this.LJIILJJIL.removeObserver("cmd_pk_rival_list_panel_unload", this);
            }
        }
    }

    public AnchorLinkUser LIZ(List<AnchorLinkUser> list, long j) {
        AnchorLinkUser next;
        User LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, new Long(j)}, this, LIZ, false, 2);
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

    public C4333af(View view, AbstractC79943HfF abstractC79943HfF, DataCenter dataCenter) {
        super(view);
        this.LIZIZ = (VHeadView) view.findViewById(2131167465);
        this.LIZJ = (VHeadView) view.findViewById(2131196531);
        this.LIZLLL = (ImageView) view.findViewById(2131181465);
        this.f26278LJ = (HSImageView) view.findViewById(2131181463);
        this.LJFF = (TextView) view.findViewById(2131194721);
        this.LJI = (TextView) view.findViewById(2131195346);
        this.LJII = (TextView) view.findViewById(2131194115);
        this.LJIIIIZZ = view.findViewById(2131178113);
        this.LJIIIZ = (HSImageView) view.findViewById(2131179127);
        this.LJIIJ = (TextView) view.findViewById(2131194438);
        this.LJIIJJI = (TextView) view.findViewById(2131195583);
        this.LJIILLIIL = (PkTagsContainerView) view.findViewById(2131191526);
        this.LJIIL = abstractC79943HfF;
        this.LJIILJJIL = dataCenter;
    }
}
