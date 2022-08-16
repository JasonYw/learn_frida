package com.bytedance.android.live.broadcast.gamedetailv2.comment;

import android.app.Dialog;
import android.view.View;
import com.bytedance.android.live.broadcast.comment.data.C2985a;
import com.bytedance.android.live.broadcast.comment.data.C2989f;
import com.bytedance.android.live.broadcast.comment.data.C2990g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.L46;
import p003X.L4A;

/* loaded from: classes5.dex */
public final class GamePromoteCommentDetailAdapterV2$onCreateViewHolder$7$1 extends Lambda implements Function2<Dialog, View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ L4A this$0;

    static {
        Covode.recordClassIndex(16607);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePromoteCommentDetailAdapterV2$onCreateViewHolder$7$1(L4A l4a) {
        super(2);
        this.this$0 = l4a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Dialog dialog, View view) {
        C2990g c2990g;
        Long l;
        Dialog dialog2 = dialog;
        if (!PatchProxy.proxy(new Object[]{dialog2, view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(dialog2, view);
            L46.LIZIZ.LIZ(true);
            C116971W2r.LIZ(dialog2);
            ArrayList<C2985a> arrayList = this.this$0.LIZIZ.LJIIL;
            if (arrayList != null && (c2990g = this.this$0.LIZIZ.LIZLLL) != null) {
                C2989f c2989f = arrayList.get(this.this$0.LIZJ.getAdapterPosition()).f25808LJ;
                if (c2989f != null) {
                    l = Long.valueOf(c2989f.LIZ);
                } else {
                    l = null;
                }
                c2990g.LIZ(l, new C3117xb2f2ea68(arrayList, this));
            }
        }
        return Unit.INSTANCE;
    }
}
