package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.PkPreviewWindow;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.PkTagsContainerView;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.h$a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder.C4346o;
import com.bytedance.android.live.liveinteract.p382pk.p384ui.AbstractC4756a;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.BattleRivalTag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p003X.AbstractC80102Hho;
import p003X.C4574547f;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder.o */
/* loaded from: classes3.dex */
public final class C4346o extends RecyclerView.ViewHolder implements AbstractC4756a {
    public static ChangeQuickRedirect LIZ;
    public final View LIZIZ;
    public final VHeadView LIZJ;
    public final VHeadView LIZLLL;

    /* renamed from: LJ */
    public final VHeadView f26282LJ;
    public final TextView LJFF;
    public final TextView LJI;
    public final TextView LJII;
    public final ImageView LJIIIIZZ;
    public final TextView LJIIIZ;
    public final HSImageView LJIIJ;
    public final View LJIIJJI;
    public final h$a LJIIL;
    public final ImageView LJIILIIL;
    public final View LJIILJJIL;
    public final PkTagsContainerView LJIILL;
    public final View LJIILLIIL;
    public final TextView LJIIZILJ;
    public final PkTagsContainerView LJIJ;
    public final View LJIJI;
    public final HSImageView LJIJJ;
    public final HSImageView LJIJJLI;
    public View LJIL;
    public int LJJ;
    public DataCenter LJJI;
    public Room LJJIII;
    public RivalExtraInfo LJJIIJ;
    public boolean LJJIIJZLJL;
    public String LJJIIZ;
    public boolean LJJIIZI;
    public final PkPreviewWindow LJJIJIIJI;
    public List<BattleRivalTag> LJJIJ = new ArrayList();
    public HashMap<String, String> LJJIFFI = new HashMap<>();
    public HashMap<String, String> LJJII = new HashMap<>();

    /* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder.o$a */
    /* loaded from: classes3.dex */
    public interface AbstractC4347a {
        static {
            Covode.recordClassIndex(26128);
        }

        /* renamed from: c_ */
        void mo15755c_(int i);
    }

    static {
        Covode.recordClassIndex(26127);
    }

    @Override // com.bytedance.android.live.liveinteract.p382pk.p384ui.AbstractC4756a
    public final String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Room room = this.LJJIII;
        if (room != null) {
            return room.getIdStr();
        }
        return "";
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        this.LJJIJIIJI.setVisibility(8);
        this.LJJIJIIJI.LIZ();
        this.LIZIZ.setVisibility(0);
    }

    private boolean LIZIZ(Room room) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{room}, this, LIZ, false, 20);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (room.linkMap != null && room.linkMap.containsKey("1")) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.p382pk.p384ui.AbstractC4756a
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 11).isSupported) {
            return;
        }
        this.LJJII.put("enter_from", str);
        this.LJJII.put("source", "pk_banner");
        C4574547f.LIZ().LIZ("livesdk_connectioninvite_anchoricon_show", this.LJJII, Room.class);
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 19).isSupported) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        if (!LIZIZ(this.LJJIII) && !LIZ(this.LJJIII)) {
            layoutParams.topMargin = 0;
        } else {
            layoutParams.topMargin = LK5.LIZ(11.0f);
        }
        this.LJJIJIIJI.setVisibility(0);
        this.LJJIJIIJI.LIZ(this.LJJIII, layoutParams, new AbstractC80102Hho(this) { // from class: X.HfS
            public static ChangeQuickRedirect LIZ;
            public final C4346o LIZIZ;

            static {
                Covode.recordClassIndex(26131);
            }

            {
                this.LIZIZ = this;
            }

            @Override // p003X.AbstractC80102Hho
            public final void LIZ() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                C4346o c4346o = this.LIZIZ;
                if (PatchProxy.proxy(new Object[0], c4346o, C4346o.LIZ, false, 23).isSupported) {
                    return;
                }
                c4346o.LIZIZ.setVisibility(8);
                HashMap hashMap = new HashMap();
                hashMap.put("play_from", c4346o.LJJIIJZLJL ? "click" : "auto");
                hashMap.put("play_type", c4346o.LJJ == 1 ? "mutual" : "recommend");
                hashMap.put("request_id", c4346o.LJJIIZ);
                C4574547f.LIZ().LIZ("livesdk_pk_user_video_play", hashMap, Room.class, C8668v.class);
            }
        });
        this.LJJIIJZLJL = z;
    }

    public boolean LIZ(Room room) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{room}, this, LIZ, false, 16);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (room.linkMap != null && room.linkMap.containsKey("7")) {
            return true;
        }
        return false;
    }

    public C4346o(View view, h$a h_a, DataCenter dataCenter, boolean z) {
        super(view);
        this.LIZLLL = (VHeadView) view.findViewById(2131167465);
        this.LJFF = (TextView) view.findViewById(2131194721);
        this.LJI = (TextView) view.findViewById(2131194150);
        this.LJIILIIL = (ImageView) view.findViewById(2131176982);
        this.LJIIIZ = (TextView) view.findViewById(2131194438);
        this.LJIIJ = (HSImageView) view.findViewById(2131179127);
        this.LJIIJJI = view.findViewById(2131178113);
        this.LJIILJJIL = view.findViewById(2131166677);
        this.LJII = (TextView) view.findViewById(2131192781);
        this.LJIIIIZZ = (ImageView) view.findViewById(2131192780);
        this.f26282LJ = (VHeadView) view.findViewById(2131175975);
        this.LJIL = view.findViewById(2131192985);
        this.LJIILL = (PkTagsContainerView) view.findViewById(2131191526);
        this.LJIJ = (PkTagsContainerView) view.findViewById(2131188246);
        this.LJIILLIIL = view.findViewById(2131180385);
        this.LJIIZILJ = (TextView) view.findViewById(2131195130);
        this.LJJIJIIJI = (PkPreviewWindow) view.findViewById(2131186117);
        this.LIZIZ = view.findViewById(2131176641);
        this.LIZJ = (VHeadView) view.findViewById(2131185262);
        this.LJIJI = view.findViewById(2131176182);
        this.LJIJJ = (HSImageView) view.findViewById(2131179033);
        this.LJIJJLI = (HSImageView) view.findViewById(2131179149);
        this.LJIIL = h_a;
        this.LJJI = dataCenter;
        this.LJJIIZI = z;
    }
}
