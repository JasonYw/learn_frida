package com.bytedance.android.live.emoji.widget.board;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.emoji.model.ExpressionSection;
import com.bytedance.android.live.profit.privilege.AbstractC5365a;
import com.bytedance.android.live.profit.privilege.model.C5368c;
import com.bytedance.android.live.profit.privilege.model.C5372g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C458444Ba;
import p003X.C91091Luf;
import p003X.C91118Lv6;
import p003X.M0O;

/* loaded from: classes5.dex */
public final class c$a extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public ExpressionSection LIZIZ;
    public final /* synthetic */ C91118Lv6 LIZJ;

    static {
        Covode.recordClassIndex(24908);
    }

    public final void LIZ(boolean z) {
        C5368c c5368c;
        String str;
        C2WC<? extends C5372g> LJIIIIZZ;
        C5372g LIZ2;
        C2WC<? extends C5372g> LJIIIIZZ2;
        C5372g LIZ3;
        boolean z2 = true;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        AbstractC5365a m24858LJ = C458444Ba.m24858LJ();
        if (m24858LJ != null && (LJIIIIZZ2 = m24858LJ.LJIIIIZZ()) != null && (LIZ3 = LJIIIIZZ2.LIZ()) != null) {
            c5368c = LIZ3.LJII;
        } else {
            c5368c = null;
        }
        AbstractC5365a m24858LJ2 = C458444Ba.m24858LJ();
        if (m24858LJ2 == null || (LJIIIIZZ = m24858LJ2.LJIIIIZZ()) == null || (LIZ2 = LJIIIIZZ.LIZ()) == null || !LIZ2.LJIIIIZZ) {
            z2 = false;
        }
        if ((this.LIZIZ instanceof C91091Luf) && c5368c != null && z2) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            HSImageView hSImageView = (HSImageView) view.findViewById(2131178922);
            if (z) {
                str = c5368c.f26575LJ;
            } else {
                str = c5368c.LJFF;
            }
            M0O.LIZ(hSImageView, str);
        }
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        view2.setSelected(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c$a(C91118Lv6 c91118Lv6, View view) {
        super(view);
        C106862S5w.LIZ(view);
        this.LIZJ = c91118Lv6;
    }
}
