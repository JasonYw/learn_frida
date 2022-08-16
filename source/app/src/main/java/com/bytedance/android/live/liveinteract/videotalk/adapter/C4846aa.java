package com.bytedance.android.live.liveinteract.videotalk.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.list.AbstractC4361s;
import com.bytedance.android.live.liveinteract.p356e.AbstractC4410g;
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
import p003X.View$OnClickListenerC78294Gtk;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.adapter.aa */
/* loaded from: classes3.dex */
public final class C4846aa extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final HSImageView LIZJ;
    public final TextView LIZLLL;

    /* renamed from: LJ */
    public final TextView f26436LJ;
    public final TextView LJFF;
    public final TextView LJI;
    public final ImageView LJII;
    public final HSImageView LJIIIIZZ;
    public LinearLayout LJIIIZ;
    public final TextView LJIIJ;
    public final TextView LJIIJJI;
    public final TextView LJIIL;
    public final ImageView LJIILIIL;
    public View LJIILJJIL;
    public final LinearLayout LJIILL;
    public final TextView LJIILLIIL;
    public final TextView LJIIZILJ;
    public final HSImageView LJIJ;
    public final TextView LJIJJ;
    public final TextView LJIJJLI;
    public boolean LJIL;
    public Room LJJ;
    public LinkPlayerInfo LJJI;
    public final int LJJIFFI;
    public final AbstractC4361s LJJII;
    public final int LIZIZ = 100;
    public String LJIJI = "null";

    static {
        Covode.recordClassIndex(29668);
    }

    public final boolean LIZ() {
        AbstractC4410g videoPaidLinkService;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!C78538Gxg.LIZ(this.LJJ) || (videoPaidLinkService = ((IInteractService) ServiceManager.getService(IInteractService.class)).videoPaidLinkService()) == null || !videoPaidLinkService.LIZJ()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4846aa(View view, int i, AbstractC4361s abstractC4361s) {
        super(view);
        boolean z;
        Room room;
        C2WC<Room> LIZ2;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        C106862S5w.LIZ(view);
        this.LJJIFFI = i;
        this.LJJII = abstractC4361s;
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        this.LIZJ = (HSImageView) view2.findViewById(2131179063);
        View view3 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "");
        this.LIZLLL = (TextView) view3.findViewById(2131172009);
        View view4 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view4, "");
        this.f26436LJ = (TextView) view4.findViewById(2131165258);
        View view5 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view5, "");
        this.LJFF = (TextView) view5.findViewById(2131194395);
        View view6 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view6, "");
        this.LJI = (TextView) view6.findViewById(2131168487);
        View view7 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view7, "");
        this.LJII = (ImageView) view7.findViewById(2131179019);
        View view8 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view8, "");
        this.LJIIIIZZ = (HSImageView) view8.findViewById(2131179076);
        View view9 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view9, "");
        this.LJIIIZ = (LinearLayout) view9.findViewById(2131174568);
        View view10 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view10, "");
        this.LJIIJ = (TextView) view10.findViewById(2131194099);
        View view11 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view11, "");
        this.LJIIJJI = (TextView) view11.findViewById(2131194185);
        View view12 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view12, "");
        this.LJIIL = (TextView) view12.findViewById(2131193945);
        View view13 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view13, "");
        this.LJIILIIL = (ImageView) view13.findViewById(2131179189);
        View view14 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view14, "");
        this.LJIILJJIL = view14.findViewById(2131175961);
        View view15 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view15, "");
        this.LJIILL = (LinearLayout) view15.findViewById(2131184667);
        View view16 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view16, "");
        this.LJIILLIIL = (TextView) view16.findViewById(2131194754);
        View view17 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view17, "");
        this.LJIIZILJ = (TextView) view17.findViewById(2131167006);
        View view18 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view18, "");
        HSImageView hSImageView = (HSImageView) view18.findViewById(2131194532);
        Intrinsics.checkNotNullExpressionValue(hSImageView, "");
        this.LJIJ = hSImageView;
        View view19 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view19, "");
        this.LJIJJ = (TextView) view19.findViewById(2131195492);
        View view20 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view20, "");
        this.LJIJJLI = (TextView) view20.findViewById(2131194352);
        C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ3 != null && (LJIILJJIL = LIZ3.LJIILJJIL()) != null && (LIZIZ = LJIILJJIL.LIZIZ()) != null) {
            z = LIZIZ.booleanValue();
        } else {
            z = false;
        }
        this.LJIL = z;
        C5923dp LIZ4 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ4 != null && (LIZ2 = LIZ4.LIZ()) != null) {
            room = LIZ2.LIZ();
        } else {
            room = null;
        }
        this.LJJ = room;
        this.LJIJJLI.setOnClickListener(new View$OnClickListenerC78294Gtk(this));
    }
}
