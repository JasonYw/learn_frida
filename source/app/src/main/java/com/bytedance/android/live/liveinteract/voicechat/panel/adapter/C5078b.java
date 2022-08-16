package com.bytedance.android.live.liveinteract.voicechat.panel.adapter;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.list.AbstractC4361s;
import com.bytedance.android.live.liveinteract.p356e.AbstractC4408a;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413402Xu;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C78538Gxg;
import p003X.View$OnClickListenerC78295Gtl;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.panel.adapter.b */
/* loaded from: classes3.dex */
public final class C5078b extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final int LIZIZ = 100;
    public final HSImageView LIZJ;
    public final TextView LIZLLL;

    /* renamed from: LJ */
    public final TextView f26499LJ;
    public final TextView LJFF;
    public final TextView LJI;
    public final ImageView LJII;
    public final HSImageView LJIIIIZZ;
    public FrameLayout LJIIIZ;
    public final TextView LJIIJ;
    public final TextView LJIIJJI;
    public final TextView LJIIL;
    public final ImageView LJIILIIL;
    public View LJIILJJIL;
    public final LinearLayout LJIILL;
    public final TextView LJIILLIIL;
    public final View LJIIZILJ;
    public final TextView LJIJ;
    public final LinearLayout LJIJI;
    public final TextView LJIJJ;
    public final TextView LJIJJLI;
    public final TextView LJIL;
    public final HSImageView LJJ;
    public final TextView LJJI;
    public LinkPlayerInfo LJJIFFI;
    public boolean LJJII;
    public Room LJJIII;
    public String LJJIIJ;
    public String LJJIIJZLJL;
    public final int LJJIIZ;
    public final AbstractC4361s LJJIIZI;

    static {
        Covode.recordClassIndex(31647);
    }

    public final boolean LIZ() {
        AbstractC4408a audioPaidLinkService;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!C78538Gxg.LIZ(this.LJJIII) || (audioPaidLinkService = ((IInteractService) ServiceManager.getService(IInteractService.class)).audioPaidLinkService()) == null || !audioPaidLinkService.LIZJ()) {
            return false;
        }
        return true;
    }

    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        if (((IInteractService) service).getCurrentScene() != 5) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5078b(View view, int i, AbstractC4361s abstractC4361s) {
        super(view);
        boolean z;
        Room room;
        C2WC<Room> LIZ2;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        C106862S5w.LIZ(view);
        this.LJJIIZ = i;
        this.LJJIIZI = abstractC4361s;
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        this.LIZJ = (HSImageView) view2.findViewById(2131179063);
        View view3 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "");
        this.LIZLLL = (TextView) view3.findViewById(2131172009);
        View view4 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view4, "");
        this.f26499LJ = (TextView) view4.findViewById(2131194790);
        View view5 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view5, "");
        this.LJFF = (TextView) view5.findViewById(2131194395);
        View view6 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view6, "");
        this.LJI = (TextView) view6.findViewById(2131185045);
        View view7 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view7, "");
        this.LJII = (ImageView) view7.findViewById(2131179019);
        View view8 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view8, "");
        this.LJIIIIZZ = (HSImageView) view8.findViewById(2131179076);
        View view9 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view9, "");
        view9.findViewById(2131178956);
        View view10 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view10, "");
        this.LJIIIZ = (FrameLayout) view10.findViewById(2131174568);
        View view11 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view11, "");
        this.LJIIJ = (TextView) view11.findViewById(2131194099);
        View view12 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view12, "");
        this.LJIIJJI = (TextView) view12.findViewById(2131194185);
        View view13 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view13, "");
        this.LJIIL = (TextView) view13.findViewById(2131193945);
        View view14 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view14, "");
        this.LJIILIIL = (ImageView) view14.findViewById(2131179189);
        View view15 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view15, "");
        this.LJIILJJIL = view15.findViewById(2131175961);
        View view16 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view16, "");
        this.LJIILL = (LinearLayout) view16.findViewById(2131184667);
        View view17 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view17, "");
        this.LJIILLIIL = (TextView) view17.findViewById(2131195389);
        View view18 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view18, "");
        this.LJIIZILJ = view18.findViewById(2131179722);
        View view19 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view19, "");
        this.LJIJ = (TextView) view19.findViewById(2131195391);
        View view20 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view20, "");
        this.LJIJI = (LinearLayout) view20.findViewById(2131180075);
        View view21 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view21, "");
        this.LJIJJ = (TextView) view21.findViewById(2131194754);
        View view22 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view22, "");
        this.LJIJJLI = (TextView) view22.findViewById(2131167006);
        View view23 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view23, "");
        this.LJIL = (TextView) view23.findViewById(2131195492);
        View view24 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view24, "");
        this.LJJ = (HSImageView) view24.findViewById(2131194532);
        View view25 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view25, "");
        this.LJJI = (TextView) view25.findViewById(2131194352);
        C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ3 != null && (LJIILJJIL = LIZ3.LJIILJJIL()) != null && (LIZIZ = LJIILJJIL.LIZIZ()) != null) {
            z = LIZIZ.booleanValue();
        } else {
            z = false;
        }
        this.LJJII = z;
        C5923dp LIZ4 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ4 != null && (LIZ2 = LIZ4.LIZ()) != null) {
            room = LIZ2.LIZ();
        } else {
            room = null;
        }
        this.LJJIII = room;
        this.LJJIIJ = "null";
        this.LJJIIJZLJL = "";
        this.LJJI.setOnClickListener(new View$OnClickListenerC78295Gtl(this));
    }
}
