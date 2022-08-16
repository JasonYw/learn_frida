package com.bytedance.android.live.broadcast.comment.adapter;

import android.app.Dialog;
import android.view.View;
import com.bytedance.android.live.broadcast.C3243u;
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
import p003X.L45;
import p003X.L49;

/* loaded from: classes5.dex */
public final class GamePromoteCommentDetailAdapter$onCreateViewHolder$6$1 extends Lambda implements Function2<Dialog, View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ L49 this$0;

    static {
        Covode.recordClassIndex(15263);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePromoteCommentDetailAdapter$onCreateViewHolder$6$1(L49 l49) {
        super(2);
        this.this$0 = l49;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Dialog dialog, View view) {
        String str;
        int i;
        boolean z;
        C2990g c2990g;
        Long l;
        String str2;
        Dialog dialog2 = dialog;
        if (!PatchProxy.proxy(new Object[]{dialog2, view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(dialog2, view);
            L45 l45 = L45.LIZJ;
            C3243u c3243u = this.this$0.LIZIZ.LIZJ;
            String str3 = "";
            if (c3243u == null || (str = c3243u.LIZJ) == null) {
                str = str3;
            }
            C3243u c3243u2 = this.this$0.LIZIZ.LIZJ;
            if (c3243u2 != null && (str2 = c3243u2.LIZLLL) != null) {
                str3 = str2;
            }
            C2990g c2990g2 = this.this$0.LIZIZ.LIZIZ;
            if (c2990g2 != null) {
                i = c2990g2.LIZJ;
            } else {
                i = 0;
            }
            C2990g c2990g3 = this.this$0.LIZIZ.LIZIZ;
            if (c2990g3 != null) {
                z = c2990g3.LIZLLL;
            } else {
                z = false;
            }
            l45.LIZ(str, str3, true, i, z);
            C116971W2r.LIZ(dialog2);
            ArrayList<C2985a> arrayList = this.this$0.LIZIZ.LJIIIZ;
            if (arrayList != null && (c2990g = this.this$0.LIZIZ.LIZIZ) != null) {
                C2989f c2989f = arrayList.get(this.this$0.LIZJ.getAdapterPosition()).f25808LJ;
                if (c2989f != null) {
                    l = Long.valueOf(c2989f.LIZ);
                } else {
                    l = null;
                }
                c2990g.LIZ(l, new C2984x887507ed(arrayList, this));
            }
        }
        return Unit.INSTANCE;
    }
}
