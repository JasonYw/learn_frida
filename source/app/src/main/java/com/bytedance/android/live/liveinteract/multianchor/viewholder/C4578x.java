package com.bytedance.android.live.liveinteract.multianchor.viewholder;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.PkPreviewWindow;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.PkTagsContainerView;
import com.bytedance.android.live.liveinteract.p382pk.p384ui.AbstractC4756a;
import com.bytedance.android.livesdk.chatroom.interact.model.C6057l;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;
import java.util.HashMap;
import p003X.AbstractC79902Hea;
import p003X.C4574547f;
import p003X.C79414HSe;
import p003X.HQJ;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.viewholder.x */
/* loaded from: classes3.dex */
public final class C4578x extends RecyclerView.ViewHolder implements AbstractC4756a {
    public static ChangeQuickRedirect LIZ;
    public final VHeadView LIZIZ;
    public final VHeadView LIZJ;
    public final VHeadView LIZLLL;

    /* renamed from: LJ */
    public final TextView f26373LJ;
    public final TextView LJFF;
    public final TextView LJI;
    public final ImageView LJII;
    public final TextView LJIIIIZZ;
    public final HSImageView LJIIIZ;
    public final View LJIIJ;
    public final AbstractC79902Hea LJIIJJI;
    public final ImageView LJIIL;
    public final View LJIILIIL;
    public final PkTagsContainerView LJIILJJIL;
    public final View LJIILL;
    public final PkTagsContainerView LJIILLIIL;
    public final View LJIIZILJ;
    public final HSImageView LJIJ;
    public final HSImageView LJIJI;
    public View LJIJJ;
    public final ViewGroup LJIJJLI;
    public final HSImageView LJIL;
    public final TextView LJJ;
    public int LJJI;
    public DataCenter LJJIFFI;
    public Room LJJIIJ;
    public RivalExtraInfo LJJIIJZLJL;
    public C6057l LJJIIZ;
    public boolean LJJIJ;
    public final PkPreviewWindow LJJIJIIJIL;
    public final View LJJIJIL;
    public boolean LJJIIZI = true;
    public final SparseArray<String> LJJIJIIJI = new SparseArray<>();
    public HashMap<String, String> LJJII = new HashMap<>();
    public HashMap<String, String> LJJIII = new HashMap<>();

    static {
        Covode.recordClassIndex(28455);
    }

    @Override // com.bytedance.android.live.liveinteract.p382pk.p384ui.AbstractC4756a
    public final String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Room room = this.LJJIIJ;
        if (room != null) {
            return room.getIdStr();
        }
        return "";
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        this.LJJIJIIJIL.setVisibility(8);
        this.LJJIJIIJIL.LIZ();
        this.LJJIJIL.setVisibility(0);
    }

    @Override // com.bytedance.android.live.liveinteract.p382pk.p384ui.AbstractC4756a
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 12).isSupported) {
            return;
        }
        this.LJJIII.put("enter_from", str);
        this.LJJIII.put("random_npk_status", C79414HSe.LIZ(this.LJJIIZI));
        this.LJJIII.put("invite_status", HQJ.LIZ(this.LJJIIZ));
        this.LJJIII.put("source", "pk_banner");
        C4574547f.LIZ().LIZ("livesdk_connectioninvite_anchoricon_show", this.LJJIII, Room.class, LinkCrossRoomDataHolder.LJII().LJIIIZ());
    }

    public C4578x(View view, AbstractC79902Hea abstractC79902Hea, DataCenter dataCenter, boolean z) {
        super(view);
        this.LIZJ = (VHeadView) view.findViewById(2131167465);
        this.f26373LJ = (TextView) view.findViewById(2131194721);
        this.LJFF = (TextView) view.findViewById(2131194150);
        this.LJIIL = (ImageView) view.findViewById(2131176982);
        this.LJIIIIZZ = (TextView) view.findViewById(2131194438);
        this.LJIIIZ = (HSImageView) view.findViewById(2131179127);
        this.LJIIJ = view.findViewById(2131178113);
        this.LJIILIIL = view.findViewById(2131166677);
        this.LJI = (TextView) view.findViewById(2131192781);
        this.LJII = (ImageView) view.findViewById(2131192780);
        this.LIZLLL = (VHeadView) view.findViewById(2131175975);
        this.LJIJJ = view.findViewById(2131192985);
        this.LJIILJJIL = (PkTagsContainerView) view.findViewById(2131191526);
        this.LJIILLIIL = (PkTagsContainerView) view.findViewById(2131188246);
        this.LJIILL = view.findViewById(2131180385);
        this.LJJIJIIJIL = (PkPreviewWindow) view.findViewById(2131186117);
        this.LJJIJIL = view.findViewById(2131176641);
        this.LIZIZ = (VHeadView) view.findViewById(2131185262);
        this.LJIJJLI = (ViewGroup) view.findViewById(2131188065);
        this.LJIL = (HSImageView) view.findViewById(2131188066);
        this.LJJ = (TextView) view.findViewById(2131188067);
        this.LJIIZILJ = view.findViewById(2131176182);
        this.LJIJ = (HSImageView) view.findViewById(2131179033);
        this.LJIJI = (HSImageView) view.findViewById(2131179149);
        this.LJIIJJI = abstractC79902Hea;
        this.LJJIFFI = dataCenter;
        this.LJJIJ = z;
        this.LJJIJIIJI.put(BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS, "mutual");
        this.LJJIJIIJI.put(102, "recommend");
    }
}
